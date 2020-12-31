package com.retailBanking.accountsService.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.retailBanking.accountsService.model.Transaction;
import com.retailBanking.accountsService.model.TransactionList;
import com.retailBanking.accountsService.repository.TransactionClient;


@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	public RestTemplate rest;
	
	@Autowired
	public TransactionClient client;
	
	 @Override
	 public List<Transaction> getTransaction(long accno){
		 
		/*TransactionList repo = rest.getForObject("http://TRANSACTION-SERVICE/account/"+accno, TransactionList.class, accno);
		 		 System.out.println(repo);
		 		 System.out.println(rest.getForObject("http://TRANSACTION-SERVICE/account/{accno}", TransactionList.class, accno));
		 		 System.out.println(accno);
		 		return repo.getTransactions(); */
		 
		 TransactionList repo = client.getTransactionByAccount(accno);
		 System.out.println(accno);
		 System.out.println(client.getTransactionByAccount(accno));
		 return repo.getTransactions();
		 
		
		/*final MappingJackson2HttpMessageConverter mappingJackson2HttpMessageConverter = new MappingJackson2HttpMessageConverter();
		mappingJackson2HttpMessageConverter.setSupportedMediaTypes(Arrays.asList(MediaType.APPLICATION_JSON, MediaType.APPLICATION_OCTET_STREAM));
		rest.getMessageConverters().add(mappingJackson2HttpMessageConverter);
		 
		 final HttpHeaders requestHeaders = new HttpHeaders();
		    requestHeaders.setAccept(Collections.singletonList(new MediaType("application", "json")));
		    requestHeaders.setContentType(new MediaType("application", "json"));
		    final HttpEntity<?> requestEntity = new HttpEntity<Object>(requestHeaders);
		 
		    final ResponseEntity<String> responseEntity = rest.exchange("http://TRANSACTION-SERVICE/account/"+accno, HttpMethod.GET,requestEntity, String.class);
            TransactionList tr = null;
			try {
				tr = new ObjectMapper().readValue(responseEntity.getBody(), TransactionList.class);
			} catch (JsonMappingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (JsonProcessingException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			};
            
           return tr.getTransactions(); */
    
	 }
	
	/*
	public List<Transaction> fetchAllTransaction(){
		List<Transaction> tr = repo.findAll();
		System.out.println("Getting details from db: "+tr);
		return tr;
	}
	
	//method to fetch recent 5 transaction by account number 
	public List<Transaction> fetchTransactionByAccount(Account no) {
		List<Transaction> tr = repo.findAll().stream()
				.filter(tra -> tra.getAccountNo() == no)
				.sorted(Comparator.comparing(Transaction::getDate).reversed())
				.limit(5)
				.collect(Collectors.toList());
		return tr;
	}
	
	*/
	

}

package com.billing.billing.service;

import java.util.List;

import com.billing.billing.model.Client;
import com.billing.billing.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {
	
	@Autowired
	ClientRepository clientRepository;
	
	//@Autowired
	//ErrorManagerService errorManagerService;

	/**
	 * Metod by list client
	 * @return client list
	 */
	public List<Client> getAll() {
		List<Client> data = clientRepository.findAll();
		return data;
	}

	/**
	 * Metod by add client
	 * @param item new client
	 * @return new client
	 */
	public Client setClient(Client item) {
		item = clientRepository.save(item);
		return item;
	}

	/**
	 * metod by update one client
	 * @param item client
	 * @return modify client
	 */
	public Client updateClient(Client item) {
		item = clientRepository.save(item);
		return item;
	}

}
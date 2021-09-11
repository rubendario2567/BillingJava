package com.billing.billing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import javax.validation.Valid;

import com.billing.billing.model.Client;
import com.billing.billing.service.ClientService;

@RestController
@RequestMapping("/client")  
public class ClientController {
    
    @Autowired
    ClientService clientSevice;

    @GetMapping("all")
    public List<Client> getAll(){
        return clientSevice.getAll();
    }

    @PostMapping("/add")
    public Client setClient(@Valid @RequestBody Client item){
        return clientSevice.setClient(item);
    }

    @PutMapping("/{clientId}")
	public Client updateClient(@PathVariable("clientId") Long clientId, @Valid @RequestBody Client item) {
		if (clientId == item.getClientId()) {
			return clientSevice.updateClient(item);
		} else {
			return null;
		}
	}
}
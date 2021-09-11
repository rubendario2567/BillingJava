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

import com.billing.billing.model.Invoice;
import com.billing.billing.service.InvoiceService;

@RestController
@RequestMapping("/invoice")
public class InvoiceController {
    
    @Autowired
    InvoiceService invoiceSevice;

    @GetMapping("all")
    public List<Invoice> getAll(){
        return invoiceSevice.getAll();
    }

    @PostMapping("/add")
    public Invoice setInvoice(@Valid @RequestBody Invoice item){
        return invoiceSevice.setInvoice(item);
    }

    @PutMapping("/{invoiceId}")
	public Invoice updateInvoice(@PathVariable("invoiceId") Long invoiceId, @Valid @RequestBody Invoice item) {
		if (invoiceId == item.getInvoiceId()) {
			return invoiceSevice.updateInvoice(item);
		} else {
			return null;
		}
	}
}
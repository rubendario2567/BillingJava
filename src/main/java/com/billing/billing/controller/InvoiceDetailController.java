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

import com.billing.billing.model.InvoiceDetail;
import com.billing.billing.service.InvoiceDetailService;

@RestController
@RequestMapping("/invoiceDetail")
public class InvoiceDetailController {
    
    @Autowired
    InvoiceDetailService invoiceDetailSevice;

    @GetMapping("all")
    public List<InvoiceDetail> getAll(){
        return invoiceDetailSevice.getAll();
    }

    @PostMapping("/add")
    public InvoiceDetail setInvoiceDetail(@Valid @RequestBody InvoiceDetail item){
        return invoiceDetailSevice.setInvoiceDetail(item);
    }

    @PutMapping("/{invoiceDetailId}")
	public InvoiceDetail updateInvoiceDetail(@PathVariable("invoiceDetailId") Long invoiceDetailId, @Valid @RequestBody InvoiceDetail item) {
		if (invoiceDetailId == item.getinvoiceDetailId()) {
			return invoiceDetailSevice.updateInvoiceDetail(item);
		} else {
			return null;
		}
	}
}
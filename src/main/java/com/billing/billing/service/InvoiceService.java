package com.billing.billing.service;

import java.util.List;

import com.billing.billing.model.Invoice;
import com.billing.billing.repository.InvoiceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {
	
	@Autowired
	InvoiceRepository invoiceRepository;
	
	//@Autowired
	//ErrorManagerService errorManagerService;

	/**
	 * Metod by list invoice
	 * @return invoice list
	 */
	public List<Invoice> getAll() {
		List<Invoice> data = invoiceRepository.findAll();
		return data;
	}

	/**
	 * Metod by add invoice
	 * @param item new invoice
	 * @return new invoice
	 */
	public Invoice setInvoice(Invoice item) {
		item = invoiceRepository.save(item);
		return item;
	}

	/**
	 * metod by update one invoice
	 * @param item invoice
	 * @return modify invoice
	 */
	public Invoice updateInvoice(Invoice item) {
		item = invoiceRepository.save(item);
		return item;
	}

}
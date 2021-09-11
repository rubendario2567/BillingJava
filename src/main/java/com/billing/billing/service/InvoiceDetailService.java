package com.billing.billing.service;

import java.util.List;

import com.billing.billing.model.InvoiceDetail;
import com.billing.billing.repository.InvoiceDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InvoiceDetailService {
	
	@Autowired
	InvoiceDetailRepository invoiceDetailRepository;
	
	//@Autowired
	//ErrorManagerService errorManagerService;

	/**
	 * Metod by list invoice detail
	 * @return invoice detail list
	 */
	public List<InvoiceDetail> getAll() {
		List<InvoiceDetail> data = invoiceDetailRepository.findAll();
		return data;
	}

	/**
	 * Metod by add invoice detail
	 * @param item new invoice detail
	 * @return new invoice detail
	 */
	public InvoiceDetail setInvoiceDetail(InvoiceDetail item) {
		item = invoiceDetailRepository.save(item);
		return item;
	}

	/**
	 * metod by update one invoice detail
	 * @param item invoice detail
	 * @return modify invoice detail
	 */
	public InvoiceDetail updateInvoiceDetail(InvoiceDetail item) {
		item = invoiceDetailRepository.save(item);
		return item;
	}

}
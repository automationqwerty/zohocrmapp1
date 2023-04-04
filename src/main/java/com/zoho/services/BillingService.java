/**
 * 
 */
package com.zoho.services;

import java.util.List;

import com.zoho.entities.Billing;
import com.zoho.entities.Contacts;

public interface BillingService {
   public void generateInvoice(Billing billing);
   public List<Billing> getAllBills();
   
}

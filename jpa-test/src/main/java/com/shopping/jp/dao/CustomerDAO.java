package com.shopping.jp.dao;

import java.util.List;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;
import com.shopping.jpa.entity.Customer;

public class CustomerDAO {
	
	public static void main(String[] args) {
		CustomerDAO customerDAO= new CustomerDAO();
		customerDAO.saveCustomer();
	}
	
	public void saveCustomer() {
		
		
		Customer customer =new Customer();
		customer.setCustomerId(12345);
		customer.setCustomerName("XYZZ");
		EntityManagerFactory entityManagerFactory= Persistence.createEntityManagerFactory("test");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction tr=em.getTransaction();
		tr.begin();
		
		/*
		 * Query query=em.createQuery("Select c from Customer c"); List<Object> results=
		 * query.getResultList();
		 */
		
		/*
		 * int size = results.size(); for(int i=0; i<size; i++) { results.get(i); }
		 */
		
		
		em.persist(customer);
		/* em.remove(customer); */
		/* em.find(Customer.class, 123); */
		tr.commit();
		System.out.println("Inserted");
		
		
		
	}
	
	

}

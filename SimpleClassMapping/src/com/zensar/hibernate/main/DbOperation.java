package com.zensar.hibernate.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product2;

public class DbOperation {
public static void main(String[] args) {
	Configuration c= new Configuration().configure();
	SessionFactory f =c.buildSessionFactory();
	Session s= f.openSession();
	Transaction t=s.beginTransaction();
	//Product2 p=s.load(Product2.class, 1102);
	//System.out.println(p);
	
	//Product2 p=s.get(Product2.class, 1101);
			//System.out.println(p);
			//if(p!=null) {
				//System.out.println(p);
	//}else {
		
		//System.out.println("product is not found");
		
	//}
	
	Product2 p= new Product2(1140,"TV","samsung",1600.00);
	
	s.save(p);
		
		/*
		 * Product2 p=s.get(Product2.class, 1101); //System.out.println(p);
		 * 
		 * 
		 * if(p!=null) { s.saveOrUpdate(p); p.setPrice(1234.00); } else {
		 * 
		 * System.out.println("product is not found");
		 * 
		 * }
		 */
		 
			//delete record
	
		/*
		 * Product2 p=s.get(Product2.class, 1101);
		 * 
		 * if(p!=null) { s.delete(p);
		 * 
		 * }else {
		 * 
		 * System.out.println("product is not found"); }
		 */
			
			
	t.commit();
	s.close();
}
}

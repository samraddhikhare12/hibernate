package com.zensar.hibernate.main;

import javax.persistence.Query;
import javax.persistence.QueryHint;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Product2;

import java.util.List;

// hibernate query language(object oriented lang)
public class HQLMain {

	public static void main(String[] args) {

		Configuration c= new Configuration().configure();
		SessionFactory f =c.buildSessionFactory();
		Session s=f.openSession();
		Transaction t=s.beginTransaction();
		//Query q=s.createQuery("from Product2");
		//Query q=s.createQuery("from Product2 p where p.price>1200 && p.price<3000");
				//Query q=s.createQuery("from Product2 p where p.price>3000 && p.price<4567");
				//Query q=s.createQuery("from Product2 p where p.brand LIKE ");
				//Query q=s.createQuery("from Product2 p where p.name='LED'");
		//List<Product2>products=q.getResultList();
		//for(Product2 p:products) {
			
		//	System.out.println(p);
		//}
		
		
		/*
		 * Query q =s.createQuery("select p.name,p.brand,p.price from Product2 p");
		 * 
		 * List<Object[]> objects=q.getResultList();
		 * 
		 * List<Product2>products=q.getResultList(); for(Object[] o: objects) {
		 * for(Object ob: o) { System.out.println(ob); } }
		 */
         
		Query q=s.createQuery("select max(p.price) from Product2 p");
		Double maxprice=(Double) q.getSingleResult();
		System.out.println(maxprice);
		
		Query q1=s.createQuery("select min(p.price) from Product2 p");
		Double minprice=(Double) q1.getSingleResult();
		System.out.println(minprice);
		
		Query q2=s.createQuery("select sum(p.price) from Product2 p");
		Double sumprice=(Double) q2.getSingleResult();
		System.out.println(sumprice);
		
		Query q3=s.createQuery("select avg(p.price) from Product2 p");
		Double avgprice=(Double) q3.getSingleResult();
		System.out.println(avgprice);


		Query q4=s.createQuery("select count(p.price) from Product2 p");
		long countprice=(long) q4.getSingleResult();
		System.out.println(countprice);
 
		Criteria cr= s.createCriteria(Product2.class);
		List<Product2> products=cr.list();
		for(Product2 product:products) {
			
			System.out.println(products);
		}
		
		
		
		t.commit();
		s.close();
	}

}
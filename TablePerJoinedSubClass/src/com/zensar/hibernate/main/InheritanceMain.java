package com.zensar.hibernate.main;

import java.time.LocalDate;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.entities.Employee;
import com.zensar.entities.WageEmp;

public class InheritanceMain {

	public static void main(String[] args) {
      Configuration c=new Configuration().configure();
      
      SessionFactory f=c.buildSessionFactory();
      Session s=f.openSession();
      Transaction t=s.beginTransaction();
      Employee e=new Employee();
      e.setName("samraddhi");
      e.setJoinDate(LocalDate.of(2019, 8, 27));
      e.setSalary(2500.00);
      s.save(e);
      
      WageEmp we=new WageEmp();
      we.setName("sonam");
      we.setJoinDate(LocalDate.of(2019, 8, 11));
      we.setSalary(2500.00);
      we.setHours(8);
      we.setRate(200f);
      
      s.save(we);
      t.commit();
      s.close();
      
	}

}

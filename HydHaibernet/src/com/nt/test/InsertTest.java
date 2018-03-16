package com.nt.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.nt.domain.Employee;

public class InsertTest {

	public static void main(String[] args) {
		//Active hibernate 
		Configuration cfg = new Configuration();
		//read and store hibernate configuration file
		cfg=cfg.configure("com/nt/cfgs/hibernate.cfg.xml");
		//create sessionFactory 
		SessionFactory factory=cfg.buildSessionFactory();
		//create session object 
		Session ses=factory.openSession();
		

		Employee em = new Employee();
		em.setEid(128);
		em.setFname("mantu");
		em.setLname("dash");
		em.setEmail("man@gmail.com");

		Transaction tx = null;
		try {
			tx = ses.beginTransaction();
			ses.save(em);
			tx.commit();
			System.out.println("object saveed /record insert");

		} catch (Exception e) {
			tx.rollback();
			// System.out.println("not save");

		}
		ses.close();
		factory.close();

	}

}

package com.sumit.playjava;

import java.util.List;

import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import org.hibernate.cfg.Configuration;

//import com.sumit.playjava.HibernateUtil;
import com.sumit.playjava.Users;

public class MyHibernateMain {

	public static void main(String[] args) {

		Users student = new Users("emre","1234");
        Users student1 = new Users("güvercin","1234");
        
        Configuration cfg=new Configuration();
        cfg.configure("hibernate.cfg.xml");
        Session session = cfg.buildSessionFactory().openSession();
        Transaction transaction = null;
        
            // start a transaction
            transaction = session.beginTransaction();
            // save the student objects
            session.save(student);
            session.save(student1);
            // commit transaction
            transaction.commit();
        

		session.close();
		
	}

}

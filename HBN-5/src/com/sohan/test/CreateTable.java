package com.sohan.test;

import com.sohan.pojo.Employee;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.Session;

public class CreateTable {

    public static void main(String[] args) {
        System.out.println("Main Method Start");
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Employee employee = new Employee("Sohan", "Kamal");
        session.save(employee);

        transaction.commit();
        session.close();
        sessionFactory.close();
        System.out.println("Main Method End");
    }

    public void main() {

        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        transaction.commit();
        session.clear();
        sessionFactory.close();
    }
}

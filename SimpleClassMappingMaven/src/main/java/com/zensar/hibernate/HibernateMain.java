package com.zensar.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zensar.hibernate.entities.Product;

public class HibernateMain 
{
    public static void main( String[] args )
    {
       Configuration c=new Configuration().configure();
       SessionFactory f= c.buildSessionFactory();
       Session s=f.openSession();
       Transaction t=s.beginTransaction();
       Product p=new Product();
       p.setProductId(101);
       p.setName("Car");
       p.setBrand("Hyundai");
       p.setPrice(3500000);
       s.save(p);
       System.out.println("product is saved");
       
       t.commit();
       s.close();
    }
}

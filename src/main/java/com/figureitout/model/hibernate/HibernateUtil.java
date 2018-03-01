/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.figureitout.model.hibernate;

import java.io.File;
import java.net.URL;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hibernate Utility class with a convenient method to get Session Factory
 * object.
 *
 * @author gaeta
 */
public class HibernateUtil {

    private static SessionFactory instance;

    public static SessionFactory buildSession() {
        if (instance == null) {
            instance = buildSessionFactory();
        }
        return instance;
    }

    private static SessionFactory buildSessionFactory() {
        try {
            ClassLoader cl=HibernateUtil.class.getClassLoader();
            URL config=cl.getResource("hibernate/hibernate.cfg.xml");
              System.out.println("fdp");
             System.out.println("test" +config);
            SessionFactory sessionFactory = new Configuration()
                    .configure(config).buildSessionFactory();
            return sessionFactory;

        } catch (Throwable ex) {

            System.err.println("Initial SessionFactory creation failed." + ex);
            throw new ExceptionInInitializerError(ex);
        }
    }
}

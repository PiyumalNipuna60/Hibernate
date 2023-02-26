package lk.ijse.hibernate.util;

import lk.ijse.hibernate.enitity.*;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FactoryConfigeration {
    private static FactoryConfigeration factoryConfigeration;
    private SessionFactory sessionFactory;

    private FactoryConfigeration(){
        Configuration configuration = new Configuration().configure()
                .addAnnotatedClass(Customer.class)
                .addAnnotatedClass(Student.class)
                .addAnnotatedClass(Laptop.class)
                .addAnnotatedClass(Owner.class)
                .addAnnotatedClass(Pet.class)
                .addAnnotatedClass(Lecturer.class)
                .addAnnotatedClass(Subject.class);

        sessionFactory = configuration.buildSessionFactory();
    }

    public static FactoryConfigeration getInstance(){
        return (factoryConfigeration==null)? factoryConfigeration=new FactoryConfigeration()
                :factoryConfigeration;
    }

    public Session getSession(){
        return sessionFactory.openSession();
    }
}

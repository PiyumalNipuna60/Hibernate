package lk.ijse.hibernate.util;

import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.enitity.Laptop;
import lk.ijse.hibernate.enitity.Student;
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
                .addAnnotatedClass(Laptop.class);
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

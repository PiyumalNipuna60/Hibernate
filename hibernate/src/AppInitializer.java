import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.util.FactoryConfigeration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("kamal");
        customer.setAddress("matara");
        customer.setSalary(25000.00);

        Customer customer2 = new Customer();
        customer2.setId("C002");
        customer2.setName("sadun");
        customer2.setAddress("Galle");
        customer2.setSalary(25000.00);


        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        /*save*/
//        session.save(customer);
//        session.save(customer2);

        /*Update*/
        session.update(customer);




        transaction.commit();

        session.close();

    }
}

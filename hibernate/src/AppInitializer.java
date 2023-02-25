import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.util.FactoryConfigeration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Customer customer = new Customer();
        customer.setId("C001");
        customer.setName("kamal");
        customer.setAddress("Galle");
        customer.setSalary(25000.00);

        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
        session.save(customer);
        transaction.commit();

        session.close();

    }
}

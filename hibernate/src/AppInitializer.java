import lk.ijse.hibernate.enitity.Customer;
import lk.ijse.hibernate.enitity.Laptop;
import lk.ijse.hibernate.enitity.Student;
import lk.ijse.hibernate.util.FactoryConfigeration;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class AppInitializer {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setsId("S001");
        s1.setName("Nipuna");

        Laptop l1 = new Laptop();
        l1.setlId("L001");
        l1.setBrand("Dell");
        l1.setStudent(s1);


        Session session = FactoryConfigeration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(s1);
        session.save(l1);


        transaction.commit();

        session.close();

    }
}

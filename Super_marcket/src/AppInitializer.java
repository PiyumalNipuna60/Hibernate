import embeded.Name;
import entity.Customer;
import entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfigeration;

public class AppInitializer {
    public static void main(String[] args) {
        Item item = new Item();
        item.setCode("I002");
        item.setDescription("Biscut");
        item.setPrice(2500);
        item.setQty(25);

        //------------------

//        Customer c1 = new Customer();
//        c1.setId("C002");
//        c1.setName("kamal");
//        c1.setAddress("Galle");
//        c1.setSalary(25000);

        //------------------

        Name name = new Name();
        name.setfName("Imaduwa");
        name.setsName("Nipuna");
        name.setlName("Piyumal");

        Customer c2 = new Customer();
        c2.setId("C002");
        c2.setName(name);
        c2.setAddress("Galle");
        c2.setSalary(25000);


        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();

        session.save(c2);

         //session.save(c1);

        //session.save(item);

//        session.update(item);

//        Item i1 = session.get(Item.class, "I001");
//        System.out.println(i1);

//        Item i001 = session.get(Item.class, "I001");
//        session.delete(i001);

        transaction.commit();
        session.close();

    }
}

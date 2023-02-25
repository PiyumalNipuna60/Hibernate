import entity.Item;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.FactoryConfigeration;

public class AppInitializer {
    public static void main(String[] args) {
        Item item = new Item();
        item.setCode("I001");
        item.setDescription("Biscut");
        item.setPrice(2500);
        item.setQty(25);

        Session session = FactoryConfigeration.getInstance().getSession();

        Transaction transaction = session.beginTransaction();
//        session.save(item);

//        session.update(item);

        Item i1 = session.get(Item.class, "I001");
        System.out.println(i1);

        transaction.commit();
        session.close();

    }
}

import lk.ijse.hibernate.enitity.Owner;
import lk.ijse.hibernate.enitity.Pet;
import lk.ijse.hibernate.util.FactoryConfigeration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        Owner o1 = new Owner();
        o1.setoId("O001");
        o1.setName("Nimal");


        Pet p1 = new Pet();
        p1.setpId("P001");
        p1.setName("Dog");
        p1.setOwner(o1);

        //-------------------

        Owner o2 = new Owner();
        o2.setoId("O002");
        o2.setName("Nimal");

        Pet p2 = new Pet();
        p2.setpId("P002");
        p2.setName("Dog");
        p2.setOwner(o2);

        //-------------------

        Pet p3 = new Pet();
        p3.setpId("P003");
        p3.setName("Dog");
        p3.setOwner(o1);


        //-----methodology 1-----
        ArrayList<Pet> petList = new ArrayList<>();
        petList.add(p1);
        petList.add(p2);
        o1.setPetList(petList);

        ArrayList<Pet> petList2 = new ArrayList<>();
        petList2.add(p1);
        petList2.add(p2);
        petList2.add(p3);
        o2.setPetList(petList2);


        Session session = FactoryConfigeration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(o1);
        session.save(o2);

        session.save(p1);
        session.save(p2);
        session.save(p3);


        transaction.commit();

        session.close();

    }
}

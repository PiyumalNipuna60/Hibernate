import lk.ijse.hibernate.enitity.Lecturer;
import lk.ijse.hibernate.enitity.Subject;
import lk.ijse.hibernate.util.FactoryConfigeration;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;

public class AppInitializer {
    public static void main(String[] args) {

        Subject s1 = new Subject();
        s1.setSubCode("SB001");
        s1.setName("PRF");

        Subject s2 = new Subject();
        s2.setSubCode("SB002");
        s2.setName("ORM");

        Subject s3 = new Subject();
        s3.setSubCode("SB003");
        s3.setName("DBM");

        Lecturer l1 = new Lecturer();
        l1.setlId("L001");
        l1.setName("Danuja");

        Lecturer l2 = new Lecturer();
        l2.setlId("L002");
        l2.setName("Niroth");

        //-------------
        //2 methodology
        l1.getSubjectList().add(s1);
        l1.getSubjectList().add(s2);
        l2.getSubjectList().add(s3);

        s1.getLecturerList().add(l1);
        s2.getLecturerList().add(l1);
        s3.getLecturerList().add(l2);



        Session session = FactoryConfigeration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

        session.save(l1);
        session.save(l2);
        session.save(s1);
        session.save(s2);
        session.save(s3);

        transaction.commit();

        session.close();

    }
}

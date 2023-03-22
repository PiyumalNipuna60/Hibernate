package lk.ijse.hibernate.enitity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Pet {
    @Id
    private String pId;
    private String name;

    @ManyToOne
    private Owner owner;

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Pet() {
    }

    public Pet(String pId, String name) {
        this.pId = pId;
        this.name = name;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pet{" +
                "pId=" + pId +
                ", name='" + name + '\'' +
                '}';
    }
}

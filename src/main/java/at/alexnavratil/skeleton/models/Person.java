package at.alexnavratil.skeleton.models;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Entity
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "system-uuid")
    @GenericGenerator(name = "system-uuid", strategy = "uuid")
    private String id;

    @Column
    private String firstname;

    @Column
    private String surename;

    public Person() {
    }

    public Person(String firstname, String surename) {
        this.firstname = firstname;
        this.surename = surename;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurename() {
        return surename;
    }

    public void setSurename(String surename) {
        this.surename = surename;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person greeting = (Person) o;

        if (firstname != null ? !firstname.equals(greeting.firstname) : greeting.firstname != null) return false;
        return surename != null ? surename.equals(greeting.surename) : greeting.surename == null;
    }

    @Override
    public int hashCode() {
        int result = firstname != null ? firstname.hashCode() : 0;
        result = 31 * result + (surename != null ? surename.hashCode() : 0);
        return result;
    }
}

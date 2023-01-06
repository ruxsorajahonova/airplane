package Airplane;

import java.util.Objects;

//ismi familiya yoshi specialist profession
public class Staff {
    private String name;
    private String lastname;
    private byte age;
    private String specialist;
    private String profession;

    public Staff(){}

    public Staff(String name, String lastname, byte age, String specialist, String profession) {
        this.name = name;
        this.lastname = lastname;
        this.age = age;
        this.specialist = specialist;
        this.profession = profession;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getSpecialist() {
        return specialist;
    }

    public void setSpecialist(String specialist) {
        this.specialist = specialist;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Staff staff = (Staff) o;
        return age == staff.age && Objects.equals(name, staff.name) && Objects.equals(lastname, staff.lastname) && Objects.equals(specialist, staff.specialist) && Objects.equals(profession, staff.profession);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastname, age, specialist, profession);
    }
}

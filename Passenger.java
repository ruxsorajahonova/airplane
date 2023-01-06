package Airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//ismi familiya yoshi qayrga ketishi raqami
public class Passenger {
    private String name;
    private String lastName;
    private byte age;
    private String password;
    private String whereGo;
    List<Ticket> tickets = new ArrayList<>();

    public Passenger() {}

    public Passenger(String name, String lastName, byte age, String password, String whereGo) {
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.password = password;
        this.whereGo = whereGo;
        this.tickets = tickets;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWhereGo() {
        return whereGo;
    }

    public void setWhereGo(String whereGo) {
        this.whereGo = whereGo;
    }

    public List<Ticket> getTickets() {
        return tickets;
    }

    public void setTickets(List<Ticket> tickets) {
        this.tickets = tickets;
    }

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passenger passenger = (Passenger) o;
        return age == passenger.age && Objects.equals(name, passenger.name) && Objects.equals(lastName, passenger.lastName) && Objects.equals(password, passenger.password) && Objects.equals(whereGo, passenger.whereGo) && Objects.equals(tickets, passenger.tickets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, age, password, whereGo, tickets);
    }
}
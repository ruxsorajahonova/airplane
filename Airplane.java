package Airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Airplane {
    private String name;
    private int seat;
    private String  whereGo;
    private String time;
    List<Staff>staff=new ArrayList<>();
    List<Passenger>passengers=new ArrayList<>();
    List<Ticket>tickets=new ArrayList<>();

    public Airplane(){}

    public Airplane(String name, int seat, String whereGo, String time) {
        this.name=name;
        this.seat = seat;
        this.whereGo = whereGo;
        this.time = time;
        this.staff = staff;
        this.passengers = passengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public String getWhereGo() {
        return whereGo;
    }

    public void setWhereGo(String whereGo) {
        this.whereGo = whereGo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public List<Passenger> getPassengers() {
        return passengers;
    }

    public void setPassengers(List<Passenger> passengers) {
        this.passengers = passengers;
    }
    public void addStaffInAirplane(Staff staff1){
        getStaff().add(staff1);
        System.out.println("saved");
    }
    public void addPassengerInAirplane(Passenger passenger){
        getPassengers().add(passenger);
        System.out.println("saved");
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Airplane airplane = (Airplane) o;
        return seat == airplane.seat && Objects.equals(name, airplane.name) && Objects.equals(whereGo, airplane.whereGo) && Objects.equals(time, airplane.time) && Objects.equals(staff, airplane.staff) && Objects.equals(passengers, airplane.passengers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, seat, whereGo, time, staff, passengers);
    }
}

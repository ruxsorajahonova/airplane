package Airplane;

import java.util.Objects;

//narxi password ketish sanasi
public class Ticket {
    private String type;
    private double price;
    private String password;
    private String dateGo;
    private String time;

    public Ticket(){}

    public Ticket(String type,double price, String password, String dateGo, String time) {
        this.type=type;
        this.price = price;
        this.password = password;
        this.dateGo = dateGo;
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getDateGo() {
        return dateGo;
    }

    public void setDateGo(String dateGo) {
        this.dateGo = dateGo;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ticket ticket = (Ticket) o;
        return Double.compare(ticket.price, price) == 0 && Objects.equals(type, ticket.type) && Objects.equals(password, ticket.password) && Objects.equals(dateGo, ticket.dateGo) && Objects.equals(time, ticket.time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, password, dateGo, time);
    }
}

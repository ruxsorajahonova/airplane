package Airplane;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        List<Staff>staff=new ArrayList<>();
        List<Passenger>passengers=new ArrayList<>();
        List<Airplane>airplanes=new ArrayList<>();
        List<Ticket>tickets=new ArrayList<>();
        Scanner scanner=new Scanner(System.in);

        int step=-1;
        while (step!=0){
        System.out.println("0=>exit, 1=>addAirplane, 2=>editAirplane, 3=>getAirplane, 4=>addStaffInAirplane, 5=>editStaffInAirplane,"+
                    " 6=>deleteStaffInAirplane,7=>getStaffInAirplane,8=>getStaffList,  9=>addPassengerInAirplane,"+
                    "10=>editPassengerInAirplane,11=>deletePassengerInAirplane,12=>getPassengerInAirplane, 13=>getPassengerList,"+
                    "14=>addTicketInPassenger, 15=>getTicketInPassenger");
        step= scanner.nextInt();
        switch (step) {
            case 0:
                break;
            case 1:
                System.out.println("Airplanni nomi");
                String name = scanner.next();
                System.out.println("o'rindiqlar soni");
                int seat = scanner.nextInt();
                System.out.println("Qaysi davlatga");
                String whereGo = scanner.next();
                System.out.println("vaqtini kiriting");
                String time = scanner.next();
                airplanes.add(new Airplane(name, seat, whereGo, time));
                System.out.println("successfully saved airplane");
                break;
            case 2:
                getAirplaneList(airplanes);
                System.out.println("airplanni tanlang");
                int chooseAirp = scanner.nextInt();
                int tr = 0;
                for (Airplane airplane : airplanes) {
                    tr++;
                    if (chooseAirp == tr) {
                        System.out.println("yangi airplane nomini kiriting");
                        String newAirplaneName = scanner.next();
                        airplane.setName(newAirplaneName);
                        System.out.println("edited");
                        break;
                    }
                }
                break;
            case 3:
                getAirplaneList(airplanes);
                break;
            case 4:
                getAirplaneList(airplanes);
                System.out.println("tanlang");
                int tanlaAir = scanner.nextInt();
                int tr1 = 0;
                for (Airplane airplane : airplanes) {
                    tr1++;
                    if (tanlaAir == tr1) {
                        System.out.println("ismingizni kiriting");
                        String nameStaff = scanner.next();
                        System.out.println("familiyangizni kiriting");
                        String lastName = scanner.next();
                        System.out.println("yoshinizni kiriting");
                        byte age = scanner.nextByte();
                        System.out.println("mutaxasisliginizni kiriting");
                        String specialist = scanner.next();
                        System.out.println("kasbingizni kiritng");
                        String profession = scanner.next();
                        staff.add(new Staff(nameStaff, lastName, age, specialist, profession));
                        airplane.getStaff().add(new Staff(nameStaff, lastName, age, specialist, profession));
                        System.out.println("saved staff in airplane");
                    }
                }
                break;
            case 5:
                getAirplaneList(airplanes);
                System.out.println("tanlang");
                int chooseAirplane = scanner.nextInt();
                int tr2 = 0;
                for (Airplane airplane : airplanes) {
                    tr2++;
                    if (chooseAirplane == tr2) {
                        getStaffList(airplane.getStaff());
                        System.out.println("tanlang");
                        int chooseStaff = scanner.nextInt();
                        int aylan = 0;
                        for (Staff staff1 : airplane.getStaff()) {
                            aylan++;
                            if (chooseStaff == aylan) {
                                for (Staff staff2 : staff) {
                                    System.out.println("yangi ismni kiriting");
                                    String newName = scanner.next();
                                    staff1.setName(newName);
                                    staff2.setName(newName);
                                    System.out.println("edited");
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 6:
                getAirplaneList(airplanes);
                System.out.println("tanlang");
                int choose = scanner.nextInt();
                int tr3 = 0;
                for (Airplane airplane : airplanes) {
                    tr3++;
                    if (choose == tr3) {
                        getStaffList(airplane.getStaff());
                        System.out.println("tanlang");
                        int choose1 = scanner.nextInt();
                        int tr4 = 0;
                        for (Staff staff1 : airplane.getStaff()) {
                            tr4++;
                            if (choose1 == tr4) {
                                staff.remove(staff1);
                                airplane.getStaff().remove(staff1);
                                System.out.println("deleted");
                                break;
                            }
                        }
                    }
                }
                break;
            case 7:
                getAirplaneList(airplanes);
                System.out.println("tanlang");
                int choose2 = scanner.nextInt();
                int tr4 = 0;
                for (Airplane airplane : airplanes) {
                    tr4++;
                    if (choose2 == tr4) {
                        for (Staff staff1 : airplane.getStaff()) {
                            System.out.println(staff1.getName());
                            break;
                        }
                    }
                }
                break;
            case 8:
                getStaffList(staff);
                break;
            case 9:
                getAirplaneList(airplanes);
                System.out.println("tanlang");
                int choose3 = scanner.nextInt();
                int tr5 = 0;
                for (Airplane airplane : airplanes) {
                    tr5++;
                    if (choose3 == tr5) {
                        System.out.println("ismingizni kiriting");
                        String namePassenger = scanner.next();
                        System.out.println("familiyangizni kiriting");
                        String lastName = scanner.next();
                        System.out.println("yoshingizni kiriting");
                        byte age = scanner.nextByte();
                        System.out.println("passwordni kiriting");
                        String password = scanner.next();
                        System.out.println("qaysi davlatga");
                        String whereGO = scanner.next();
                        passengers.add(new Passenger(namePassenger, lastName, age, password, whereGO));
                        airplane.getPassengers().add(new Passenger(namePassenger, lastName, age, password, whereGO));
                        System.out.println("saved passenger in Airplane");
                    }
                }
                break;
            case 10:
                getAirplaneList(airplanes);
                System.out.println("tanlang");
                int tanla = scanner.nextInt();
                int tanlaa = 0;
                for (Airplane airplane : airplanes) {
                    tanlaa++;
                    if (tanla == tanlaa) {
                        getPassengerList(airplane.getPassengers());
                        System.out.println("yo'lovchini tanlang");
                        int tanla1 = scanner.nextInt();
                        int tanla2 = 0;
                        for (Passenger passenger : airplane.getPassengers()) {
                            tanla2++;
                            if (tanla1 == tanla2) {
                                for (Passenger passenger1 : passengers) {
                                    System.out.println("yangi yo'lovchi ismini kiriting");
                                    String newPassengerName = scanner.next();
                                    passenger.setName(newPassengerName);
                                    passenger1.setName(newPassengerName);
                                    System.out.println("edited");
                                    break;
                                }
                            }
                        }
                    }
                }
                break;
            case 11:
                getAirplaneList(airplanes);
                int choosePAssenger = scanner.nextInt();
                int tanla1 = 0;
                for (Airplane airplane : airplanes) {
                    tanla1++;
                    if (choosePAssenger == tanla1) {
                        getPassengerList(airplane.getPassengers());
                        System.out.println("yo'lovchini tanlang");
                        int choosepassenger = scanner.nextInt();
                        int tr6 = 0;
                        for (Passenger passenger : airplane.getPassengers()) {
                            tr6++;
                            if (choosepassenger == tr6) {
                                passengers.remove(passenger);
                                airplane.getPassengers().remove(passenger);
                                System.out.println("deleted");
                                break;
                            }
                        }
                    }
                }
                break;
            case 12:
                getAirplaneList(airplanes);
                int chooseAir = scanner.nextInt();
                int tr6 = 0;
                for (Airplane airplane : airplanes) {
                    tr6++;
                    if (chooseAir == tr6) {
                        for (Passenger passenger : airplane.getPassengers()) {
                            System.out.println(passenger.getName());
                            break;
                        }
                    }
                }
                break;
            case 13:
                getPassengerList(passengers);
                break;
            case 14:
                getPassengerList(passengers);
                System.out.println("tanlang");
                int choose1 = scanner.nextInt();
                int tanla2 = 0;
                for (Passenger passenger : passengers) {
                    tanla2++;
                    if (choose1 == tanla2) {
                        System.out.println("chipta turini kiritign");
                        String type = scanner.next();
                        System.out.println("chipta narxini kiritng");
                        double price = scanner.nextDouble();
                        System.out.println("Password ni kiriting");
                        String password = scanner.next();
                        System.out.println("ketish sanangizni kiriting");
                        String dateGo = scanner.next();
                        System.out.println("vaqtini kiriting");
                        String timeGo = scanner.next();
                        tickets.add(new Ticket(type, price, password, dateGo, timeGo));
                        passenger.getTickets().add(new Ticket(type, price, password, dateGo, timeGo));
                        System.out.println("saved ticked in passenger");
                        break;
                    }
                }
                break;
            case 15:
                getPassengerList(passengers);
                System.out.println("tanlang");
                int chose = scanner.nextInt();
                int tanla3 = 0;
                for (Passenger passenger : passengers) {
                    tanla3++;
                    if (chose == tanla3) {
                        for (Ticket ticket : passenger.tickets) {
                            System.out.println(ticket.getType());
                            break;
                        }

                    }
                }
                break;
                }
            }
        }


    public static void getAirplaneList(List<Airplane>airplanes){
        int tr=0;
        for (Airplane airplane : airplanes) {
            tr++;
            System.out.println(tr+"."+airplane.getName());
        }
    }
    public  static void getStaffList(List<Staff>staff){
        int tr=0;
        for (Staff staff1 : staff) {
            tr++;
            System.out.println(tr+"."+ staff1.getName());
        }
    }
    public  static void getPassengerList(List<Passenger>passengers){
        int tr=0;
        for (Passenger passenger : passengers) {
            tr++;
            System.out.println(tr+"."+passenger.getName());
        }
    }
    public static void getTicketList(List<Ticket>tickets){
        int tr=0;
        for (Ticket ticket : tickets) {
            tr++;
            System.out.println(tr+"."+ticket.getType());

        }
    }
}

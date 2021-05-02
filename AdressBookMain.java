import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdressBookMain {
    private static String name;
    private static String surname;
    private static String address;
    private static String city;
    private static String state;
    private static int zipCode;
    private static int phoneNumber;
    private static String email;

    AdressBookMain() {
        super();
    }

    public AdressBookMain(String name, String surname, String address, String city, String state, int zipCode, int phoneNumber, String email) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getSurname() {
        return this.surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public String getAddress() {
        return this.address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getState() {
        return this.state;
    }
    public void setState(String state) {
        this.state = state;
    }
    public int getZipCode() {
        return this.zipCode;
    }
    public void setZipCode(int zipCode) {
        this.zipCode = zipCode;
    }
    public int getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String toString() {
        return ("Your Entered Details Are\nFirst Name: " + name + "\nLast Name: " + surname + "\naddress: " + address + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zipCode + "\nPhone Number :" + phoneNumber + "\nEmail: " + email + "\n");
    }

    public void addPerson() {
        ArrayList <AdressBookMain> list = new ArrayList <AdressBookMain> ();
        AdressBookMain person = new AdressBookMain();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name: ");
        person.setName(sc.nextLine());
        System.out.println("Enter surname: ");
        person.setSurname(sc.nextLine());
        System.out.println("Enter address: ");
        person.setAddress(sc.nextLine());
        System.out.println("Enter city: ");
        person.setCity(sc.nextLine());
        System.out.println("Enter state: ");
        person.setState(sc.nextLine());
        System.out.println("Enter zipcode: ");
        person.setZipCode(sc.nextInt());
        System.out.println("Enter phone number: ");
        person.setPhoneNumber(sc.nextInt());
        System.out.println("Enter email: ");
        person.setEmail(sc.nextLine());

        list.add(person);
        System.out.println(list);
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Address book Program");
        Scanner sc = new Scanner(System.in);
        int choice;
        String name;
        while (true) {
            System.out.println("Enter 1 to add\n Enter 2 to exit\n");
            name = sc.next();
            choice = Integer.parseInt(name);
            switch (choice) {
                case 1:
                    System.out.println("Give the information for the Person");
                    AdressBookMain p1 = new AdressBookMain();
                    p1.addPerson();
                    break;
                case 2:
                    System.exit(0);
                    break;
            }
        }
    }
}


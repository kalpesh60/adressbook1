import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class AddressData {
    private String name;
    private String surname;
    private String address;
    private String city;
    private String state;
    private String zipCode;
    private String phoneNumber;
    private String email;

    AddressData(String name, String surname, String address, String city, String state, String zipCode, String phoneNumber) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getname() {
        return this.name;
    }
    public void setname(String name) {
        this.name = name;
    }
    public String getsurname() {
        return this.surname;
    }
    public void setsurname(String surname) {
        this.surname = surname;
    }
    public String getaddress() {
        return this.address;
    }
    public void setaddress(String address) {
        this.address = address;
    }
    public String getcity() {
        return this.city;
    }
    public void setcity(String city) {
        this.city = city;
    }
    public String getstate() {
        return this.state;
    }
    public void setstate(String state) {
        this.state = state;
    }
    public String getzipCode() {
        return this.zipCode;
    }
    public void setzipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    public String getphoneNumber() {
        return this.phoneNumber;
    }
    public void setphoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getemail() {
        return this.email;
    }
    public void setemail(String email) {
        this.email = email;
    }

    public String toString() {
        return ("Your Entered Details Are\nFirst Name: " + name + "\nLast Name: " + surname + "\naddress: " + address + "\nCity: " + city + "\nState: " + state + "\nZip Code: " + zipCode + "\nPhone Number :" + phoneNumber + "\nEmail: " + email + "\n");
    }

    static class MultipleAddressBook {
        ArrayList <AddressData> contacts = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int edit;
        String fullName;
        String name;

        public MultipleAddressBook(String name) {
            this.name = name;
        }

        public boolean checkNameAvailability() {
            System.out.println("Enter Name: ");
            name = sc.nextLine();
            for (edit = 0; edit < contacts.size(); edit++) {
                if ( name.equals(contacts.get(edit).getname())) {
                    System.out.println("Contact exists");
                    return true;
                }
            }
            return false;
        }

        public void addContact() {
            if (!checkNameAvailability()) {
                System.out.println("Enter surname: ");
                String surname = sc.nextLine();
                System.out.println("Enter address: ");
                String address = sc.nextLine();
                System.out.println("Enter city: ");
                String city = sc.nextLine();
                System.out.println("Enter state: ");
                String state = sc.nextLine();
                System.out.println("Enter zipcode: ");
                String zipCode = sc.nextLine();
                System.out.println("Enter phone number: ");
                String phoneNumber = sc.nextLine();
                System.out.println("Enter email: ");
                String email = sc.nextLine();
                contacts.add(new AddressData(name, address, city, state, zipCode, phoneNumber, email));
            }
        }

        public void EditContact() {
            if (checkNameAvailability()) {
                System.out.println("enter new name: ");
                contacts.get(edit).setname(sc.nextLine());
                System.out.println("enter surname: ");
                contacts.get(edit).setsurname(sc.nextLine());
                System.out.println("enter new address: ");
                contacts.get(edit).setaddress(sc.nextLine());
                System.out.println("enter new city: ");
                contacts.get(edit).setcity(sc.nextLine());
                System.out.println("enter new state: ");
                contacts.get(edit).setstate(sc.nextLine());
                System.out.println("enter new zipCode: ");
                contacts.get(edit).setzipCode(sc.nextLine());
                System.out.println("enter new Phonenumber: ");
                contacts.get(edit).setphoneNumber(sc.nextLine());
                System.out.println("enter new email: ");
                contacts.get(edit).setemail(sc.nextLine());
                System.out.println("successfully edited the Contact");
            } else {
                System.out.println("name not found");
            }
        }

        public void deleteContact() {
            System.out.println("Enter the name of contact You want to Delete: ");
            for (edit = 0; edit < contacts.size(); edit++) {
                if (checkNameAvailability()) {
                    contacts.remove(edit);
                    System.out.println("Successfully Deleted The Contact");
                }
            }
        }

        public void printContacts() {
            System.out.println("Contacts in address book are: ");
            if (contacts.isEmpty()) {
                System.out.println("No Contact Found");
            }
            for (AddressData showContacts : contacts) {
                System.out.println("\n" + showContacts + "\n");
            }
        }
    }

    public static class AdressBookMain {
        public static ArrayList <MultipleAddressBook> AddressBookName = new ArrayList<> ();
        static Scanner sc = new Scanner (System.in);
        public int edit;
        int count = 0;


        public static void main(String[] args) {
            AdressBookMain menu = new AdressBookMain();
            menu.menu();
        }

        public void multipleAddressBook() {
            String name;
            System.out.print("Enter the name of Address Book: ");
            name = sc.nextLine();
            AddressBookName.add(new MultipleAddressBook(name));
            System.out.println("New Address Book Created with name: " + name);
        }

        public void printMultipleAddressBooks() {
            System.out.println("These Are the Address Books present: ");
            if (AddressBookName.isEmpty()) {
                System.out.println("No AddressBooks Stored yet");
            }
            for (int i = 0; i < AddressBookName.size(); i++) {
                System.out.println(i + " - " + AddressBookName.get(count));
            }
        }

        public void SelectAddressBook() {
            System.out.println("You are Currently in " + AddressBookName.get(count) + " AddressBook");
            if (AddressBookName.size() > 0) {
                for (int i = 0; i < AddressBookName.size(); i++)
                    System.out.println(i + " - "+ AddressBookName.get(i));
                    System.out.print("Pick Address Book Number = ");
                    count = Integer.parseInt(sc.next());
            }
        }

        public void menu() {
            System.out.println("Welcome to Address book Program");
            multipleAddressBook();
            while (true) {
                System.out.println(" Enter 1 to Add Contact\n Enter 2 to Edit Contact\n Enter 3 to Delete\n Enter 4 to Add Addressbook\n Enter 5 to see Addressbooks\n Enter 6 to Exit");
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        SelectAddressBook();
                        AddressBookName.get(count).addContact();
                        break;
                    case 2:
                        AddressBookName.get(count).EditContact();
                        break;
                    case 3:
                        AddressBookName.get(count).deleteContact();
                    case 4:
                        multipleAddressBook();
                    case 5:
                        System.out.println(AddressBookName.get(count) + "book");
                        SelectAddressBook();
                        AddressBookName.get(count).printContacts();
                    case 6:
                        System.exit(0);
                        break;
                }
            }
        }
    }
}

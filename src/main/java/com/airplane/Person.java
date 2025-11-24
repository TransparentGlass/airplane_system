package ;
public abstract class Person {
    protected String name;
    protected String passportNumber;
    protected String address;
    
    public Person(String name, String passportNumber, String address) {
        this.name = name;
        this.passportNumber = passportNumber;
        this.address = address;
    }
    
    public abstract void getDetails();
    public abstract void updateDetails();
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getPassportNumber() {
        return passportNumber;
    }
    
    public void setPassportNumber(String passportNumber) {
        this.passportNumber = passportNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
}

class Passenger extends Person {
    public Passenger(String name, String passportNumber, String address) {
        super(name, passportNumber, address);
    }
    
    @Override
    public void getDetails() {
        System.out.println("Passenger: " + name + ", Passport: " + passportNumber + ", Address: " + address);
    }
    
    @Override
    public void updateDetails() {
    }
    
    public String getName() {
        return name;
    }
    
    public String getPassportNumber() {
        return passportNumber;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void updateAddress() {
    }
}

class Admin extends Person {
    public Admin(String name, String passportNumber, String address) {
        super(name, passportNumber, address);
    }
    
    @Override
    public void getDetails() {
        System.out.println("Admin: " + name + ", Passport: " + passportNumber + ", Address: " + address);
    }
    
    @Override
    public void updateDetails() {
    }
    
    public void addFlight() {
    }
    
    public void removeFlight() {
    }
    
    public void updateFlightSchedule() {
    }
}

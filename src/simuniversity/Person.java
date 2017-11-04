package simuniversity;

public class Person {
    // Instance variables
    String first, last, phone, email;
    
    public Person() {
        
    }
    
    public Person(String firstName, String lastName, String phoneNumber, String emailAddress) {
        this.first = first;
        this.last = last;
        this.phone = phone;
        this.email = email;
    }
    
    public void setFirstName(String firstName){
        this.first = firstName;
    }
    
    public void setLastName(String lastName){
        this.last = lastName;
    }
    
    public void setPhoneNumber(String phoneNumber){
        this.phone = phoneNumber;
    }
    
    public void setEmailAddress(String emailAddress){
       this. email = emailAddress;
    }
    
    public String getFirstName() {
        return this.first;
    }
    
    public String getLastName() {
        return this.last;
    }
    
    public String getPhoneNumber() {
        return this.phone;
    }
    
    public String getEmailAddress() {
        return this.email;
    }
    
    @Override
    public String toString() {
        return "First Name: " + getFirstName() + "\nLast Name: " + getLastName()
        + "\nPhone Number: " + getPhoneNumber() + "\nEmail Address: " + getEmailAddress() + "\n";
    }
}

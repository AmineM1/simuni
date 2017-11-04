package simuniversity;

public class Employee extends Person {
    String office, dateEmployed, officePhone;
    
    Employee() {
        
    }
    
    Employee(String office, String dateEmployer, String officePhone) {
        this.office = office;
        this.dateEmployed = dateEmployed;
        this.officePhone = officePhone;
    }
    
    public void setOffice(String office) {
        this.office = office;
    }
    
    public void setDateEmployed(String dateEmployed) {
        this.dateEmployed = dateEmployed;
    }
    
    public void setOfficePhone(String officePhone) {
        this.officePhone = officePhone;
    }
    
    public String getOffice() {
        return office;
    }
    
    public String getDateEmployed() {
        return dateEmployed;
    }
    
    public String getOfficePhone() {
        return officePhone;
    }
    
    @Override
    public String toString() {
        return "Office: " + getOffice() + "\nDate of Employment: " + getDateEmployed() + "\nOffice Phone Number: " + getOfficePhone() + "\n";
    }
}

package simuniversity;

import java.util.*;


public class Tester {
    public static void main(String[] args) {
        ArrayList<Person> array = new ArrayList<>();

        // Adding person objects
        Person person1 = new Person();
        person1.setFirstName("Jeff");
        person1.setLastName("Manner");
        person1.setPhoneNumber("123-456-7890");
        person1.setEmailAddress("jeffman@psu.edu");
        array.add(person1);
        
        Person person2 = new Person();
        person2.setFirstName("Jake");
        person2.setLastName("Salmon");
        person2.setPhoneNumber("128-456-7230");
        person2.setEmailAddress("jakesal@gmail.edu");
        array.add(person2);
        
        Person person3 = new Person();
        person3.setFirstName("Dan");
        person3.setLastName("Jones");
        person3.setPhoneNumber("321-345-7685");
        person3.setEmailAddress("danjones@gmail.com");
        array.add(person3);
        
        // Adding student objects
        Student stud1 = new Student();
        stud1.setClassStatus("Freshman");
        array.add(stud1);
        
        Student stud2 = new Student();
        stud2.setClassStatus("Junior");
        array.add(stud2);
        
        Student stud3 = new Student();
        stud3.setClassStatus("Senior");
        array.add(stud3);
        
        // Adding Employee objects
        Employee emp1 = new Employee();
        emp1.setOffice("136");
        emp1.setDateEmployed("12/01/2016");
        emp1.setOfficePhone("610-900-2346");
        array.add(emp1);
        
        Employee emp2 = new Employee();
        emp2.setOffice("57");
        emp2.setDateEmployed("06/21/2011");
        emp2.setOfficePhone("610-900-2302");
        array.add(emp2);
        
        Employee emp3 = new Employee();
        emp3.setOffice("217");
        emp3.setDateEmployed("10/14/2008");
        emp3.setOfficePhone("610-900-2205");
        array.add(emp3);
        
        // Adding Faculty objects
        Faculty fac1 = new Faculty();
        fac1.setRank("Assistant Professor");
        array.add(fac1);
        
        Faculty fac2 = new Faculty();
        fac2.setRank("Professor");
        array.add(fac2);
        
        Faculty fac3 = new Faculty();
        fac3.setRank("Associate Professor");
        array.add(fac3);
        
        Staff staff1 = new Staff();
        staff1.setTitle("Accounting Supervisor");
        array.add(staff1);
        
        Staff staff2 = new Staff();
        staff2.setTitle("Receptionist");
        array.add(staff2);
        
        Staff staff3 = new Staff();
        staff3.setTitle("Secretary");
        array.add(staff3);
        
        // Printing output of each object
        System.out.println(person1.toString());
        System.out.println(person2.toString());
        System.out.println(person3.toString());
        
        System.out.println(stud1.toString());
        System.out.println(stud2.toString());
        System.out.println(stud3.toString());
        
        System.out.println(emp1.toString());
        System.out.println(emp2.toString());
        System.out.println(emp3.toString());
        
        System.out.println(fac1.toString());
        System.out.println(fac2.toString());
        System.out.println(fac3.toString());
        
        System.out.println(staff1.toString());
        System.out.println(staff2.toString());
        System.out.println(staff3.toString());
    }
}
/*
First Name: Jeff
Last Name: Manner
Phone Number: 123-456-7890
Email Address: jeffman@psu.edu

First Name: Jake
Last Name: Salmon
Phone Number: 128-456-7230
Email Address: jakesal@gmail.edu

First Name: Dan
Last Name: Jones
Phone Number: 321-345-7685
Email Address: danjones@gmail.com

Class Status: Freshman

Class Status: Junior

Class Status: Senior

Office: 136
Date of Employment: 12/01/2016
Office Phone Number: 610-900-2346

Office: 57
Date of Employment: 06/21/2011
Office Phone Number: 610-900-2302

Office: 217
Date of Employment: 10/14/2008
Office Phone Number: 610-900-2205

Rank: Assistant Professor

Rank: Professor

Rank: Associate Professor

Title: Accounting Supervisor

Title: Receptionist

Title: Secretary

*/
package simuniversity;


import java.util.Scanner;

public class Student extends Person implements Changeable{
    private String classStatus;
    
    public Student() {
        
    }
    
    public Student(String classStatus) {
        this.classStatus = classStatus;
    }
    
    public void setClassStatus(String classStatus) {
        this.classStatus = classStatus;
    }
    
    public String getClassStatus() {
        return classStatus;
    }
    
    // Changeable interface method
    @Override
    public void change(String firstName, String lastName) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a first name...");
        firstName = input.nextLine();
        System.out.println("Enter a last name...");
        lastName = input.nextLine();
    }
    
    @Override
    public String toString() {
        return "Class Status: " + getClassStatus() + "\n";
    }
    
}

package simuniversity;

import java.util.Scanner;

public class Faculty extends Employee implements Changeable{
    String rank;
    
    Faculty(){
        
    }
    
    Faculty(String rank) {
        this.rank = rank;
    }
    
    public void setRank(String rank) {
        this.rank = rank;
    }
    
    public String getRank() {
        return rank;
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
        return "Rank: " + getRank() + "\n";
    }
}

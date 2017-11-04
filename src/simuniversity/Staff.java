package simuniversity;

public class Staff extends Employee{
    String title;
    
    Staff() {
        
    }
    
    Staff(String title) {
        this.title = title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public String getTitle() {
        return title;
    }
    
    @Override
    public String toString() {
        return "Title: " + getTitle() + "\n";
    }
}


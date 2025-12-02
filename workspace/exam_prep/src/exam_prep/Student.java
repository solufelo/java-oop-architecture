package exam_prep;

public class Student extends UniversityMember implements LabAccess {
    private double gpa;

    public Student(String id, String name, double gpa){
        super(id, name);
        this.gpa = gpa;
    }
    
    public double getGpa() { return gpa; }

    @Override 
    public String getRole() {
        return "Student";
    }
    
    public boolean canLogin(){
        return this.gpa > 1.0;
    }
    
    public int getPrintQuota(){
        return 50;
    }
    
    // Method for covariant return type demonstration
    public Student getSelf() {
        return this;
    }
}


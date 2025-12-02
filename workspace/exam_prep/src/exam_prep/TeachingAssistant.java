package exam_prep;

public class TeachingAssistant extends Student {
    
    public TeachingAssistant(String id, String name, double gpa){
        super(id, name, gpa);
    }

    @Override
    public int getPrintQuota(){
        return 200;
    }

    @Override
    public String getRole() {
        return "TA";
    }
    
    // Covariant Return Type Example
    @Override
    public TeachingAssistant getSelf() {
        return this;
    }
}


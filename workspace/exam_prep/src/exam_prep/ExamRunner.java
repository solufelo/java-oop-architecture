package exam_prep;

public class ExamRunner {

    public static void main(String[] args) {
        System.out.println("=== ExamRunner Started ===");
        
        Student student = new Student("123456789", "John", 2.2);
        TeachingAssistant ta = new TeachingAssistant("123987456", "Bill", 6.2);
        Professor professor = new Professor("987654321", "Goggins", "Mathematics");

        // 1. Create the array
        UniversityMember[] members = { student, professor, ta }; 

        // 2. Loop over the ARRAY (members)
        System.out.println("--- Phase 1.5: Polymorphism Check ---");
        for (UniversityMember m : members) {
            System.out.println("Role: " + m.getRole()); 
            if (m instanceof LabAccess) {
                System.out.println("Quota: " + ((LabAccess) m).getPrintQuota()); 
            }
        } 
        
        // --- Phase 3: Lab Session & Exceptions ---
        System.out.println("\n--- Phase 3: Lab Session ---");
        LabSession lab = new LabSession(2); // Capacity of 2

        try {
            System.out.println("Attempting to login users...");
            lab.enterLab(student);
            lab.enterLab(professor);
            // This one should throw exception!
            lab.enterLab(ta); 
        } catch (LabCapacityException e) {
            System.err.println("ERROR CAUGHT: " + e.getMessage());
        }

        lab.viewUserList();
    }
}

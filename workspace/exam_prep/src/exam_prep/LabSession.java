package exam_prep;

import java.util.ArrayList;

public class LabSession {
    private ArrayList<LabAccess> activeUsers;
    private int capacity;

    public LabSession(int capacity) {
        this.capacity = capacity;
        this.activeUsers = new ArrayList<>();
    }

    public void enterLab(LabAccess user) throws LabCapacityException {
        // TODO: Implement logic
        // 1. Check capacity
        // 2. Check login
        // 3. Add to list
        
        if (activeUsers.size() >= capacity) {
            throw new LabCapacityException("Lab is full!");
        }
        
        if (user.canLogin()) {
            activeUsers.add(user);
            System.out.println("User logged in: " + ((UniversityMember)user).getName());
        } else {
            System.out.println("Access Denied");
        }
    }

    public void viewUserList() {
        for (LabAccess user : activeUsers) {
             if (user instanceof UniversityMember) {
                System.out.println(((UniversityMember) user).getRole() + " - Quota: " + user.getPrintQuota());
            }
        }
    }
}


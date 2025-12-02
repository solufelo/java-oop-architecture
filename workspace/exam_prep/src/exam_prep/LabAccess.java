package exam_prep;

public interface LabAccess {
    int MAX_DAILY_QUOTA = 1000;
    boolean canLogin();
    int getPrintQuota();
}


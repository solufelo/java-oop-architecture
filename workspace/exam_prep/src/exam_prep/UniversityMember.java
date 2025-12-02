package exam_prep;

public abstract class UniversityMember implements Comparable<UniversityMember>, Cloneable {
    private String id;
    private String name;

    public UniversityMember(String id, String name){
        if (id == null || id.length() != 9){
            throw new IllegalArgumentException("Invalid Input, Try Again"); 
        }
        this.id = id;
        this.name = name;
    }
    
    public abstract String getRole();

    public String getId() { return id; }
    public String getName() { return name; }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null) return false;
        if (obj instanceof UniversityMember){
            UniversityMember other = (UniversityMember) obj;
            return this.id.equals(other.id);
        }
        return false;
    }

    @Override
    public int compareTo(UniversityMember other){
        return this.id.compareTo(other.id);
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}


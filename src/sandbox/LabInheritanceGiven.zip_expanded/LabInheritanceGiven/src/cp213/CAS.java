package cp213;

/**
 * Inherited class in simple example of inheritance / polymorphism.
 *
 * @author
 * @version 2022-02-25
 */
public class CAS extends Professor {

    private String term = null;

    public CAS(final String lastName, final String firstName,
               final String department, final String term) {
        super(lastName, firstName, department);
        this.term = term;
    }

    @Override
    public String toString() {
        return super.toString()
             + "\nTerm: " + term;
    }
    public String getTerm() {
        return this.term;
    }
}

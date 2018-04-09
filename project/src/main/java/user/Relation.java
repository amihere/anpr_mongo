package user;

public class Relation {
    private String firstName, lastName;
    private Relationship relationship;

    public Relation(String firstName, String lastName, Relationship relationship) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.relationship = relationship;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Relationship getRelationship() {
        return relationship;
    }

    public void setRelationship(Relationship relationship) {
        this.relationship = relationship;
    }
}

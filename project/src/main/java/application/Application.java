package application;

import user.Applicant;
import user.User;

import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

public class Application {
    private UUID id;
    private Applicant applicant;
    private Set<ISection> sections;

    public Application(UUID id, Applicant applicant) {
        this.id = id;
        this.applicant = applicant;
        sections = new HashSet<>();
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Applicant getApplicant() {
        return applicant;
    }

    public void setApplicant(Applicant applicant) {
        this.applicant = applicant;
    }

    public Set<ISection> getSections() {
        return sections;
    }

    public void setSections(Set<ISection> sections) {
        this.sections = sections;
    }
}

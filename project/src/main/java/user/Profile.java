package user;

import org.bson.Document;

import java.awt.*;
import java.time.LocalDate;
import java.util.UUID;

public class Profile {
    private UUID profileId;
    private String firstName, lastName, otherName;
    private LocalDate dob;
    private Image avatar;

    public Profile(UUID profileId, String firstName, String lastName, String otherName,
                   LocalDate dob, Image avatar) {
        this.profileId = profileId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.otherName = otherName;
        this.dob = dob;
        this.avatar = avatar;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public void setProfileId(UUID profileId) {
        this.profileId = profileId;
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

    public String getOtherName() {
        return otherName;
    }

    public void setOtherName(String otherName) {
        this.otherName = otherName;
    }

    public LocalDate getDob() {
        return dob;
    }

    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    public Image getAvatar() {
        return avatar;
    }

    public void setAvatar(Image avatar) {
        this.avatar = avatar;
    }

    public Document toDocument() {
        return null;
    }

    public static User fromDocument(Document doc) {
        return null;
    }
}

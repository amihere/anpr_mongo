package user;

import com.google.gson.Gson;
import org.bson.Document;

import java.util.UUID;

public class Applicant extends User {
    public Applicant(UUID id, String username, Profile profile) {
        super(id, Role.APPLICANT, username, profile);
    }

    public Document toDocument() {
        return new Document()
                .append("id", id)
                .append("username", username)
                .append("profile", profile.toDocument());
    }

    public static User fromDocument(Document doc) {
        Gson gson = new Gson();

        return gson.fromJson(doc.toJson(), Applicant.class);
    }
}

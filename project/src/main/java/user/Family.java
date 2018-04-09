package user;

import java.util.Set;
import java.util.UUID;

public class Family {
    private UUID id, profileId;
    private Set<Relation> familyMembers;

    public Family(UUID id, UUID profileId, Set<Relation> familyMembers) {
        this.id = id;
        this.profileId = profileId;
        this.familyMembers = familyMembers;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getProfileId() {
        return profileId;
    }

    public void setProfileId(UUID profileId) {
        this.profileId = profileId;
    }

    public Set<Relation> getFamilyMembers() {
        return familyMembers;
    }

    public void setFamilyMembers(Set<Relation> familyMembers) {
        this.familyMembers = familyMembers;
    }

    public void addRelation(Relation relation){
        familyMembers.add(relation);
    }

    public void removeRelation(Relation relation){
        familyMembers.remove(relation);
    }
}

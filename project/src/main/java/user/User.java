package user;

import java.util.UUID;

public abstract class User {
    protected UUID id;
    protected Role role;
    protected String username;
    protected Profile profile;

    public User(UUID id, Role role, String username, Profile profile) {
        this.id = id;
        this.role = role;
        this.username = username;
        this.profile = profile;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public Profile getProfile() {
        return profile;
    }

    public void setProfile(Profile profile) {
        this.profile = profile;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", role=" + role +
                ", username='" + username + '\'' +
                ", profile=" + profile +
                '}';
    }
}

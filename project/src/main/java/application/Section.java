package application;

import java.util.UUID;

public abstract class Section implements ISection{
    UUID id, applicationId;
    Category category;

    protected Section(UUID id, UUID applicationId, Category category) {
        this.id = id;
        this.applicationId = applicationId;
        this.category = category;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(UUID applicationId) {
        this.applicationId = applicationId;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}

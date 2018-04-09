package application;

import java.util.UUID;

public class Supplement extends Section{
    private String type;
    private Object content;

    protected Supplement(UUID id, UUID applicationId) {
        super(id, applicationId, Category.SUPPLEMENT);
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }

    @Override
    public boolean complete() {
        return false;
    }
}

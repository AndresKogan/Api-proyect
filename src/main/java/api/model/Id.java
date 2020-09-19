package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Id {
    @JsonProperty("message")
    private int message;
    @JsonProperty("status")
    private String status;
    @JsonProperty("level")
    private String level;

    public int getMessage() {
        return message;
    }

    public void setMessage(int message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}

package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Analysis {
    @JsonProperty("message")
    private String Message;
    @JsonProperty("status")
    private int status;
    @JsonProperty("level")
    private String level;


    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }
}



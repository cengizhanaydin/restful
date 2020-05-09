package com.cengizhan.restful.pathvariable.dto;

public class HelloMessage {

    private String message;

    public HelloMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "HelloMessage{" +
                "message='" + message + '\'' +
                '}';
    }
}

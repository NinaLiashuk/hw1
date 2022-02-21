package by.it.academy.Mk_JD2.hw1.dto;

import java.time.LocalDateTime;

public class Message {

    private String login;
    private String text;
    private String sender;
    private LocalDateTime time;

    public Message(String login, String text, String sender, LocalDateTime time) {
        this.login = login;
        this.text = text;
        this.sender = sender;
        this.time = LocalDateTime.now();
    }

    public Message(){
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public LocalDateTime getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "Message{" +
                "text='" + text + "\n" +
                ", sender='" + sender + "\n" +
                ", time=" + time + '}' + "\n";
    }
}

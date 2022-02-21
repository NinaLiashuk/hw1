package by.it.academy.Mk_JD2.hw1.dto;

import by.it.academy.Mk_JD2.hw1.api.IMessageService;

import java.util.*;

public class MessageService implements IMessageService<String, Message> {

    private Map<String, Message> recipient;
    private final static MessageService instance = new MessageService();

    public MessageService() {
        this.recipient = new HashMap<>();}

    @Override
    public Map<String, Message> getFromStorage() {
        return Collections.unmodifiableMap(recipient);
    }

    @Override
    public void addToStorage(String item, Message message) {
        recipient.put(item, message);
    }

    public static MessageService getInstance(){
        return instance;
    }
}

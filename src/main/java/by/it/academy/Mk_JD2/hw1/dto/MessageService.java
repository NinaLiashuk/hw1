package by.it.academy.Mk_JD2.hw1.dto;

import by.it.academy.Mk_JD2.hw1.api.IMessageService;

import java.util.*;

public class MessageService implements IMessageService<String, Message> {

    private List<Message> list;
    private Map<String, List<Message>> recipient;
    private final static MessageService instance = new MessageService();

    public MessageService() {
        this.list = new ArrayList<>();
        this.recipient = new HashMap<>();}

    @Override
    public Map<String, List<Message>> getFromStorage() {
        return Collections.unmodifiableMap(recipient);
    }

    @Override
    public void addToStorage(Message message) {
        if (recipient.containsKey(message.getLogin())){
            recipient.get(message.getLogin()).add(message);
        }
        else {
            list = new ArrayList<>();
            list.add(message);
            recipient.put(message.getLogin(),list);
        }
    }

    public static MessageService getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

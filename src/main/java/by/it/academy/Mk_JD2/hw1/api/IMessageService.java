package by.it.academy.Mk_JD2.hw1.api;

import by.it.academy.Mk_JD2.hw1.dto.Message;

import java.util.List;
import java.util.Map;

public interface IMessageService <String, T> {

    Map<String, List<Message>> getFromStorage();

    void addToStorage(T tItem);
}


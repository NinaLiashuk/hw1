package by.it.academy.Mk_JD2.hw1.api;

import java.util.Map;

public interface IMessageService <String, T> {

    Map<String, T> getFromStorage();

    void addToStorage(String item, T tItem);
}


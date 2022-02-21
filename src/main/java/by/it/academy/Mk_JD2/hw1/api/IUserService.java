package by.it.academy.Mk_JD2.hw1.api;

import java.util.Map;

public interface IUserService <String, T> {
    Map<String, T> getFromStorage();

    void addToStorage(T item);
}

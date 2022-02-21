package by.it.academy.Mk_JD2.hw1.dto;

import by.it.academy.Mk_JD2.hw1.api.IUserService;

import java.util.*;

public class UserService implements IUserService<String, User> {

    private Map<String, User> userList;
    private final static UserService instance = new UserService();

    public UserService() {
        this.userList = new HashMap<>();
    }

    @Override
    public Map<String, User> getFromStorage() {
        return Collections.unmodifiableMap(userList);
    }

    @Override
    public void addToStorage(User item) {

        userList.put(item.getLogin(), item);
    }

    public static UserService getInstance(){
        return instance;
    }

    @Override
    public String toString() {
        return "UserService{" +
                "userList=" + userList +
                '}';
    }
}

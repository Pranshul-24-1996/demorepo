package org.example.oops_5.demo.good_implementation;


import org.example.oops_5.demo.User;
import org.example.oops_5.demo.library.MySqlDriver;

public class MySqlDbOps implements DbOperations{

    MySqlDriver db = new MySqlDriver();
    public User insert(User user) {
        db.insert(user);
        return user;
    }

    public User update(int id, User user) {
        db.update(id, user);
        return user;
    }
}
package org.example.oops_5.demo.good_implementation;


import org.example.oops_5.demo.User;

public interface DbOperations {

    User insert(User user);

    User update(int id, User user);
}

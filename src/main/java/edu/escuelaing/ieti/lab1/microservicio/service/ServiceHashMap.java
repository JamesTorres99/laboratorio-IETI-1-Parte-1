package edu.escuelaing.ieti.lab1.microservicio.service;

import edu.escuelaing.ieti.lab1.microservicio.data.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class ServiceHashMap implements UserService{
    private final HashMap<String,User> usersHash= new HashMap<>();


    @Override
    public User create(User user) {
        return usersHash.put(user.getId(), user);
    }

    @Override
    public User findById(String id) {
        return usersHash.get(id);
    }

    @Override
    public List<User> all() {
        return new ArrayList<User>(usersHash.values());
    }

    @Override
    public Boolean deleteById(String id) {
        usersHash.remove(id);
        Boolean delete = !usersHash.containsKey(id);
        return delete;
    }

    @Override
    public User update(User user, String userId) {
        return usersHash.put(userId, user);
    }
}
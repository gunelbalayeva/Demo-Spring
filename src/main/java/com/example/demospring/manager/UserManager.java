package com.example.demospring.manager;
import com.example.demospring.entty.User;
import com.example.demospring.service.UserService;
import org.springframework.stereotype.Component;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
@Component
public class UserManager implements UserService {

    private static List<User> lists = new ArrayList<>();

    static {
        lists.add(new User(1, "Azer Bayramov", LocalDate.now().minusYears(20)));
        lists.add(new User(2, "Gultac Rustemova", LocalDate.now().minusYears(21)));
        lists.add(new User(3, "Nazli Balayeva", LocalDate.now().minusYears(28)));
    }

    @Override
    public List<User> getAll() {
        return lists;
    }

    @Override
    public User getById(int id) {
        return lists.get(id - 1);
    }

    @Override
    public void saveUser(User user) {
        lists.add(user);
    }

    @Override
    public void deleteUser(int id) {
        lists.remove(id - 1);
    }
}

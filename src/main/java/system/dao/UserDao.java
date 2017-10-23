package system.dao;

import org.springframework.stereotype.Repository;
import system.model.User;


import java.util.Arrays;
import java.util.List;

/**
 * Created by User on 05.06.2017.
 */

@Repository
public class UserDao {

    private List<User> users = Arrays.asList( new User("admin@mail.ru", "admin"),
            new User("user1@mail.ru","user1"));

//    public List getAllUsers(){
//        return users;
//    }

    public List<User> getAllUsers(){
        return users;
    }

}

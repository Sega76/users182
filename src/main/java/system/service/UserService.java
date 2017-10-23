package system.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import system.dao.UserDao;


import java.util.List;

/**
 * Created by User on 05.06.2017.
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public String getAllUsers(){
        return userDao.getAllUsers().toString();
    }

}

package nhky.jx.service.impl;

import nhky.jx.domain.User;
import nhky.jx.mapper.UserDao;
import nhky.jx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @USER: Liuhl
 * @DATE: 2023/3/17 14:20
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    @Override
    public List<User> findAllUser() {
        System.out.println("222222222");
        return userDao.findAllUser();
    }
}

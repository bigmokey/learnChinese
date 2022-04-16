package com.learn.service.impl;

import com.learn.entity.User;
import com.learn.dao.UserDao;
import com.learn.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.util.DigestUtils;


import javax.annotation.Resource;

import static org.bouncycastle.asn1.x500.style.RFC4519Style.userPassword;

/**
 * (User)表服务实现类
 *
 * @author Du
 * @since 2022-03-31 17:31:27
 */
@Service("userService")
@Slf4j
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    //加密
    final String salt = "dyl";

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public User queryById(Long id) {
        return this.userDao.queryById(id);
    }

    /**
     * 新增数据
     *注册
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User insert(User user) {
        if(StringUtils.isAnyBlank(user.getUseraccount(),user.getUserpassword())){
            return null;
        }
       /* if (user.getUseraccount().length()<4){
            return null;
        }
        if (user.getUserpassword().length()<8){
            return null;
        }*/
        String encryptPass = DigestUtils.md5DigestAsHex((salt + user.getUserpassword()).getBytes());
        user.setUserpassword(encryptPass);
        user.setUsername("蓝布");
        this.userDao.insert(user);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    @Override
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.userDao.deleteById(id) > 0;
    }

    @Override
    public User userLogin(User user) {
        String encryptPass = DigestUtils.md5DigestAsHex((salt + user.getUserpassword()).getBytes());
        user.setUserpassword(encryptPass);
        return this.userDao.userLogin(user);
    }

    @Override
    public int addAvatar(String s, long id) {
        return  this.userDao.updateAvatar(s,id);
    }
}

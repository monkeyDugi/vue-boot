package com.folder.app.dao;

import com.folder.app.dto.UserDTO;
import com.folder.app.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<UserDTO> findAll() {
        return userMapper.findAll();
    }

    @Override
    public int editById(UserDTO userDTO) {
        return 0;
    }

    @Override
    public int delete(int no) {
        return 0;
    }

    @Override
    public int save(UserDTO userDTO) {
        return 0;
    }
}

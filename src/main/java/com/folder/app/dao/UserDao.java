package com.folder.app.dao;

import com.folder.app.dto.UserDTO;

import java.util.List;

public interface UserDao {

    List<UserDTO> findAll();

    int editById(UserDTO userDTO);

    int delete(int no);

    int save(UserDTO userDTO);
}

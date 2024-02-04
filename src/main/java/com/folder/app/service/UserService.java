package com.folder.app.service;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;

public interface UserService {

    ResultDTO findAll();
    ResultDTO editById(UserDTO userDTO);
    ResultDTO delete(int no);
    ResultDTO save(UserDTO userDTO);
}

package com.folder.app.service;

import com.folder.app.dao.UserDao;
import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private ResultDTO resultDTO;

    @Autowired
    UserDao userDao;

    @Override
    public ResultDTO findAll() {
        resultDTO = new ResultDTO();
        List<UserDTO> resultList = userDao.findAll();
        if (resultList != null) {
            resultDTO.setState(true);
            resultDTO.setResult(resultList);
        } else {
            resultDTO.setState(false);
        }
        return resultDTO;
    }

    @Override
    public ResultDTO editById(UserDTO userDTO) {
        return resultDTO;
    }

    @Override
    public ResultDTO delete(int no) {
        return resultDTO;
    }

    @Override
    public ResultDTO save(UserDTO userDTO) {
        return resultDTO;
    }
}

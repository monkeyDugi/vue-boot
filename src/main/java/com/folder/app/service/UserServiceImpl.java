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
        resultDTO = new ResultDTO();
        int state = userDao.editById(userDTO);

        if (state == 1) {
            resultDTO.setState(true);
            resultDTO.setMessage("사용자 수정이 성공하였습니다.");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자 수정이 실패하였습니다.");
        }
        return resultDTO;
    }

    @Override
    public ResultDTO delete(int no) {
        resultDTO = new ResultDTO();
        int state = userDao.delete(no);
        if (state == 1) {
            resultDTO.setState(true);
            resultDTO.setMessage("사용자 삭제 성공");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자 삭제 실패");
        }
        return resultDTO;
    }

    @Override
    public ResultDTO save(UserDTO userDTO) {
        resultDTO = new ResultDTO();
        int state = userDao.save(userDTO);
        if (state == 1) {
            resultDTO.setState(true);
            resultDTO.setMessage("사용자 생성 성공");
        } else {
            resultDTO.setState(false);
            resultDTO.setMessage("사용자 생성 실패");
        }

        return resultDTO;
    }
}

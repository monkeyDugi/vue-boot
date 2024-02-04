package com.folder.app.mapper;

import com.folder.app.dto.UserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface UserMapper {

    @Select("select * from user3")
    List<UserDTO> findAll();
}

package com.folder.app.controller;

import com.folder.app.dto.ResultDTO;
import com.folder.app.dto.UserDTO;
import com.folder.app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:8800")
@RestController
public class DataController {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    public String home() {
        return "Data 준비 중...";
    }

    @GetMapping("/api")
    public String api() {
        return "Api Data 준비 중...";
    }

    @PostMapping("/findAll")
    public ResultDTO findAll() {
        return userService.findAll();
    }

    @PostMapping("/editById")
    public ResultDTO editById(@RequestBody UserDTO userDTO) {
        System.out.println("userDTO = " + userDTO);
        return userService.editById(userDTO);
    }

    @DeleteMapping("/delete")
    public ResultDTO delete(@RequestParam("no") int no) {
        return userService.delete(no);
    }

    @PutMapping("/save")
    public ResultDTO save(@RequestBody UserDTO userDTO) {
        return userService.save(userDTO);
    }
}

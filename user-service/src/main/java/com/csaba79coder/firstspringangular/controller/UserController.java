package com.csaba79coder.firstspringangular.controller;

import com.csaba79coder.firstspringangular.dto.NewUserDto;
import com.csaba79coder.firstspringangular.dto.UserDto;
import com.csaba79coder.firstspringangular.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@CrossOrigin("http://localhost:4200/")
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    @PostMapping
    public ResponseEntity<UserDto> addNewUser(NewUserDto dto) {
        return ResponseEntity.status(201).body(userService.addNewUser(dto));
    }

    @GetMapping
    public ResponseEntity<List<UserDto>> renderAllRepresentatives() {
        return ResponseEntity.status(200).body(userService.findAllUsers());
    }
}

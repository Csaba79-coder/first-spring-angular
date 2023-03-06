package com.csaba79coder.firstspringangular.service;

import com.csaba79coder.firstspringangular.dto.NewUserDto;
import com.csaba79coder.firstspringangular.dto.UserDto;
import com.csaba79coder.firstspringangular.persistence.UserRepository;
import com.csaba79coder.firstspringangular.util.Mapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public UserDto addNewUser(NewUserDto dto) {
        return Mapper.mapEntityToDto(userRepository.save(Mapper.mapNewUserToEntity(dto)));
    }

    public List<UserDto> findAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(Mapper::mapEntityToDto)
                .collect(Collectors.toList());
    }
}

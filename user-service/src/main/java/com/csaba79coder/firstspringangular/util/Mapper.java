package com.csaba79coder.firstspringangular.util;

import com.csaba79coder.firstspringangular.dto.NewUserDto;
import com.csaba79coder.firstspringangular.dto.UserDto;
import com.csaba79coder.firstspringangular.entity.User;

public class Mapper {

    public static User mapNewUserToEntity(NewUserDto dto) {
       User user = new User();
       user.setEmail(dto.getEmail());
       user.setFirstName(dto.getFirstName());
       user.setMidName(dto.getMidName());
       user.setLastName(dto.getLastName());
       user.setPhoneNumber(dto.getPhoneNumber());
       user.setJobTitle(dto.getJobTitle());
       return user;
    }

    public static UserDto mapEntityToDto(User user) {
        UserDto dto = new UserDto();
        dto.setId(user.getId());
        dto.setEmail(user.getEmail());
        dto.setFirstName(user.getFirstName());
        dto.setMidName(user.getMidName());
        dto.setLastName(user.getLastName());
        dto.setJobTitle(user.getJobTitle());
        dto.setPhoneNumber(user.getPhoneNumber());
        return dto;
    }

    private Mapper() {

    }
}

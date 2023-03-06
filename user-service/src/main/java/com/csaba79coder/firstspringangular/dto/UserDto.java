package com.csaba79coder.firstspringangular.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserDto {
    private UUID id;
    private String email;
    private String firstName;
    private String midName;
    private String lastName;
    private String jobTitle;
    private String phoneNumber;
}

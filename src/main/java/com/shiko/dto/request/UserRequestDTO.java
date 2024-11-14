package com.shiko.dto.request;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class UserRequestDTO {
    private String username;
    private String firstName;
    private String lastName;
    private String email;

}

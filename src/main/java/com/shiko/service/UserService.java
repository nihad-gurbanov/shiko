package com.shiko.service;

import com.shiko.dto.request.UserRequestDTO;

public interface UserService {
    void createUser(UserRequestDTO userRequestDTO);
    void updateUser(Long id, String username, String firstName, String lastName, String email);
    void deleteUser(Long id);
    void getUser(Long id);
    void getAllUsers();
}

package com.shiko.service;

import com.shiko.dto.request.UserRequestDTO;
import com.shiko.entity.ShikoUser;
import com.shiko.repository.UserRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@NoArgsConstructor
public class UserServiceImp implements UserService {

    private UserRepository userRepository;
    private ModelMapper modelMapper;

    @Override
    public void createUser(UserRequestDTO userRequestDTO){
        if (userRepository.findUserByUsername(userRequestDTO.getUsername())) {
            throw new RuntimeException("User already exists");
        }
        ShikoUser shikoUser = modelMapper.map(userRequestDTO, ShikoUser.class);
        userRepository.save(shikoUser);
    }

    @Override
    public void updateUser(Long id, String username, String firstName, String lastName, String email) {

    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public void getUser(Long id) {

    }

    @Override
    public void getAllUsers() {

    }
}

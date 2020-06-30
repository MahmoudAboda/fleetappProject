package com.kindsonthegenius.fleetapp.services;


import com.kindsonthegenius.fleetapp.models.User;
import com.kindsonthegenius.fleetapp.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired private UserRepository userRepository;

    public void save(User user) {
        userRepository.save(user);
    }


}

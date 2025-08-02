package com.samtech.samproject.userservice;

import com.samtech.samproject.usermodel.UserData;
import com.samtech.samproject.userrepo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
 private UserRepo userRepo;

 public UserData saveUser(UserData user){
     return userRepo.save(user);
 }

 public UserData getUserById(String userId){
     return userRepo.findById(userId).orElse(null);
 }
}

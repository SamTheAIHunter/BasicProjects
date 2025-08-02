package com.samtech.samproject.usercontroller;

import com.samtech.samproject.usermodel.UserData;
import com.samtech.samproject.userservice.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("api/user")
public class UserLogin {
    @Autowired
    public  UserService userService;
    @PostMapping("/login")
    public ResponseEntity<UserData> rigesterUser (@RequestBody UserData userdata){

     UserData savedUser = userService.saveUser(userdata);

     return ResponseEntity.ok(savedUser);

    }

    @GetMapping("/{userId}")
     public ResponseEntity<UserData> getUserById(@PathVariable String userId){
        UserData user = userService.getUserById(userId);

        if (user != null){
            return ResponseEntity.ok(user);
        }else {
            return ResponseEntity.notFound().build();
        }

     }


}

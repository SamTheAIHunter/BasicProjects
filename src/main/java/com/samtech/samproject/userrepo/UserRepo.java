package com.samtech.samproject.userrepo;

import com.samtech.samproject.usermodel.UserData;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<UserData, String> {

}

package com.samtech.samproject.usermodel;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="users")
@AllArgsConstructor
@NoArgsConstructor
public class UserData {

    @Id
    @Column(name = "user_id" , nullable = false, unique = true)
    String userId;



    @Column(name = "first_name")
    String userfirstName;



    @Column(name = "last_name")
    String userlastName;


    @Column(name = "contact")
    Long   userContact;

}

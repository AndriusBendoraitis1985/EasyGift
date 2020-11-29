package com.andrius.easyGift.repositories;

import com.andrius.easyGift.models.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends CrudRepository<User, Long> {
    List<User> findAll();

    User findUserByUserName(String userName);
}

package com.andrius.easyGift.repositories;

import com.andrius.easyGift.models.UserGift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserGiftRepository extends CrudRepository<UserGift, Long> {
    List<UserGift> findAll();
}

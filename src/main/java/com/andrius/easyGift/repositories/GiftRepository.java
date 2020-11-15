package com.andrius.easyGift.repositories;

import com.andrius.easyGift.models.Gift;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GiftRepository extends CrudRepository<Gift, Long> {
    List<Gift> findAll();
}

package com.andrius.easyGift.repositories;

import com.andrius.easyGift.models.Occasion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OccasionRepository extends CrudRepository<Occasion, Long> {
    List<Occasion> findAll();
    List<Occasion> findAllByUserName(String name);
}

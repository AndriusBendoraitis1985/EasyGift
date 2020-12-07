package com.andrius.easyGift.repositories;

import com.andrius.easyGift.models.HistoryEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HistoryRepository extends CrudRepository<HistoryEntry, Long> {
    List<HistoryEntry> findAll();
    List<HistoryEntry> findAllByUser_UserName(String userName);
}

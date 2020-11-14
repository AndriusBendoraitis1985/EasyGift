package com.andrius.easyGift.repositories;

import com.andrius.easyGift.models.HistoryEntry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends CrudRepository<HistoryEntry, Long> {
}

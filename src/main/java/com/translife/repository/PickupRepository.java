package com.translife.repository;

import com.translife.entity.Pickup;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface PickupRepository extends JpaRepository<Pickup, Long> {

    String findByObjectCode(String objectCode);
    String findByVolume(String volume);
    String findByCollectionSource(String collectionSource);
    String findByCollectionDestination(String collectionDestination);
    String findByCollectionSourceResponsible(String collectionSourceResponsible);
    String findByReceiptDestinationResponsible(String receiptDestinationResponsible);
    LocalDateTime findByCollectionDate(String collectionDate);
    LocalDateTime findByReceiptDate(String receiptDate);
    String findByStatus(String status);
    String findByDetails(String details);
}

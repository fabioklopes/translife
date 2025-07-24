package com.translife.repository;

import com.translife.entity.Coleta;
import com.translife.entity.VolumeType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;

@Repository
public interface ColetaRepository extends JpaRepository<Coleta, Long> {
    String findByObjectCode(String objectCode);

    String findByVolumeType(VolumeType volumeType);

    String findByCollectionSource(String collectionSource);

    String findByVolume(String volume);

    String findByCollectionDestination(String collectionDestination);

    String findByCollectionSourceResponsible(String collectionSourceResponsible);

    String findByReceiptDestinationResponsible(String receiptDestinationResponsible);

    LocalDateTime findByCollectionDate(String collectionDate);

    LocalDateTime findByReceiptDate(String receiptDate);

    String findByStatus(String status);

    String findByDetails(String details);
}

package com.translife.service;

import com.translife.entity.Pickup;
import com.translife.repository.PickupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PickupService {

    @Autowired
    private PickupRepository repository;

    public Pickup create(Pickup pickup) {
        return repository.save(pickup);
    }

    public Optional<Pickup> findById(Long id) {
        return repository.findById(id);
    }

    public List<Pickup> findAll() {
        return repository.findAll();
    }

    public String findByObjectCode(String objectCode) {
        return repository.findByObjectCode(objectCode);
    }

    public String findByVolume(String volume) {
        return repository.findByVolume(volume);
    }

    public String findByCollectionSource(String collectionSource) {
        return repository.findByCollectionSource(collectionSource);
    }

    public String findByCollectionDestination(String collectionDestination) {
        return repository.findByCollectionDestination(collectionDestination);
    }

    public String findByCollectionSourceResponsible(String collectionSourceResponsible) {
        return repository.findByCollectionSourceResponsible(collectionSourceResponsible);
    }

    public String findByReceiptDestinationResponsible(String receiptDestinationResponsible) {
        return repository.findByReceiptDestinationResponsible(receiptDestinationResponsible);
    }

    public LocalDateTime findByCollectionDate(String collectionDate) {
        return repository.findByCollectionDate(collectionDate);
    }

    public LocalDateTime findByReceiptDate(String receiptDate) {
        return repository.findByReceiptDate(receiptDate);
    }

    public String findByStatus(String status) {
        return repository.findByStatus(status);
    }

    public String findByDetails(String details) {
        return repository.findByDetails(details);
    }

    public void delete(Pickup entity) {
        repository.delete(entity);
    }

}

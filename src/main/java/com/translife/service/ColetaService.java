package com.translife.service;

import com.translife.entity.Coleta;
import com.translife.entity.VolumeType;
import com.translife.repository.ColetaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class ColetaService {

    @Autowired
    private ColetaRepository repository;

    public List<Coleta> findAll() {
        return repository.findAll();
    }

    public Optional<Coleta> findById(Long id) {
        return repository.findById(id);
    }

    public Coleta save(Coleta coleta) {
        return repository.save(coleta);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }

    public String findByObjectCode(String objectCode) {
        return repository.findByObjectCode(objectCode);
    }

    public String findByVolumeType(String volumeType) {
        return repository.findByVolumeType(VolumeType.valueOf(volumeType));
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

    public LocalDateTime findByReceiptDate(String receiptDate) {
        return repository.findByReceiptDate(receiptDate);
    }

    public String findByStatus(String status) {
        return repository.findByStatus(status);
    }

    public String findByDetails(String details) {
        return repository.findByDetails(details);
    }

    public String findByVolume(String volume) {
        return repository.findByVolume(volume);
    }

    public LocalDateTime findByCollectionDate(String collectionDate) {
        return repository.findByCollectionDate(collectionDate);
    }
}

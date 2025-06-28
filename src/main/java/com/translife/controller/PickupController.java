package com.translife.controller;

import com.translife.entity.Pickup;
import com.translife.service.PickupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/pickups")
public class PickupController {

    @Autowired
    private PickupService service;

    @GetMapping
    public List<Pickup> listAllPickups() {
        return service.findAll();
    }

//
//    @PostMapping
//    public Pickup create(Pickup pickup) {
//        return service.create(pickup);
//    }
//
//    @GetMapping("/destination/{destionation}")
//    public String findByCollectionDestination(@PathVariable String destination) {
//        return service.findByCollectionDestination(destination);
//    }
//
//    @GetMapping("/{id}")
//    public Optional<Pickup> findById(@PathVariable Long id) {
//        return service.findById(id);
//    }
//
//    public List<Pickup> findAll() {
//        return service.findAll();
//    }
//
//    public String findByObjectCode(String objectCode) {
//        return service.findByObjectCode(objectCode);
//    }
//
//    public String findByVolume(String volume) {
//        return service.findByVolume(volume);
//    }
//
//    public String findByStatus(String status) {
//        return service.findByStatus(status);
//    }
//
//    public String findByCollectionSource(String collectionSource) {
//        return service.findByCollectionSource(collectionSource);
//    }
//
//    public String findByCollectionSourceResponsible(String collectionSourceResponsible) {
//        return service.findByCollectionSourceResponsible(collectionSourceResponsible);
//    }
//
//    public String findByReceiptDestinationResponsible(String receiptDestinationResponsible) {
//        return service.findByReceiptDestinationResponsible(receiptDestinationResponsible);
//    }
//
//    public LocalDateTime findByCollectionDate(String collectionDate) {
//        return service.findByCollectionDate(collectionDate);
//    }
//
//    public String findByDetails(String details) {
//        return service.findByDetails(details);
//    }
//
//    public void delete(Pickup entity) {
//        service.delete(entity);
//    }
//
//    public LocalDateTime findByReceiptDate(String receiptDate) {
//        return service.findByReceiptDate(receiptDate);
//    }
}

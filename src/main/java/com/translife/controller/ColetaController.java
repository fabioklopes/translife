package com.translife.controller;

import com.translife.entity.Coleta;
import com.translife.service.ColetaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/coletas")
public class ColetaController {

    @Autowired
    private ColetaService service;


    @GetMapping
    public List<Coleta> listAllColetas() {
        return service.findAll();
    }


    @PostMapping
    public Coleta create(Coleta coleta) {
        return service.save(coleta);
    }


    @GetMapping("/destination/{destination}")
    public String findByCollectionDestination(@PathVariable String destination) {
        return service.findByCollectionDestination(destination);
    }


    @GetMapping("/{id}")
    public Optional<Coleta> findById(@PathVariable Long id) {
        return service.findById(id);
    }


    @PostMapping("/{objectCode}")
    public String findByObjectCode(String objectCode) {
        return service.findByObjectCode(objectCode);
    }


    @PostMapping("/volumeType/{volumeType}")
    public String findByVolumeType(@PathVariable String volumeType) {
        return service.findByVolumeType(volumeType);
    }


    @PostMapping("/status/{status}")
    public String findByStatus(@PathVariable String status) {
        return service.findByStatus(status);
    }


    @PostMapping("/collectionSource/{collectionSource}")
    public String findByCollectionSource(String collectionSource) {
        return service.findByCollectionSource(collectionSource);
    }


    @PostMapping("/collectionSourceResponsible/{collectionSourceResponsible}")
    public String findByCollectionSourceResponsible(@PathVariable String collectionSourceResponsible) {
        return service.findByCollectionSourceResponsible(collectionSourceResponsible);
    }


    @PostMapping("/receiptDestinationResponsible/{receiptDestinationResponsible}")
    public String findByReceiptDestinationResponsible(@PathVariable String receiptDestinationResponsible) {
        return service.findByReceiptDestinationResponsible(receiptDestinationResponsible);
    }


    @PostMapping("/collectionDate/{collectionDate}")
    public LocalDateTime findByCollectionDate(@PathVariable String collectionDate) {
        return service.findByCollectionDate(collectionDate);
    }


    @PostMapping("/receiptDate/{receiptDate}")
    public LocalDateTime findByReceiptDate(LocalDateTime receiptDate) {
        return service.findByReceiptDate(String.valueOf(receiptDate));
    }


    @PostMapping("/{id}")
    public void delete(Long id) {
        service.deleteById(id);
    }

}

package com.translife.controller;

import com.translife.entity.Veiculo;
import com.translife.service.VeiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/veiculos")
public class VeiculoController {

    @Autowired
    private VeiculoService service;

    @GetMapping
    // Se não possuir URL, vai responder pelo RequestMapping do Controlador
    public List<Veiculo> getAllVeiculos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Veiculo> getVeiculoById(@PathVariable Long id) {
        Optional<Veiculo> veiculo = service.buscaPorId(id);
        return veiculo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }

    @GetMapping("/placa/{plates}")
    public ResponseEntity<Veiculo> getVeiculoByPlates(@PathVariable String plates) {
        return service.buscaPorPlate(plates)
                .map(veiculo -> new ResponseEntity<>(veiculo, HttpStatus.OK)) // Se encontrar, retorna 200 OK
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND)); // Se não encontrar, retorna 404 Not Found
    }

    @PostMapping
    public ResponseEntity<Veiculo> createVeiculo(@RequestBody Veiculo veiculo) {
        Veiculo novoVeiculo = service.salvar(veiculo);
        return new ResponseEntity<>(novoVeiculo, HttpStatus.CREATED);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Veiculo> updateVeiculo(@PathVariable Long id, @RequestBody Veiculo veiculo) {
        Veiculo veiculoAtualizado = service.atualizar(id, veiculo);
        if (veiculoAtualizado != null) {
            return ResponseEntity.ok(veiculoAtualizado);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Veiculo> deleteVeiculo(@PathVariable Long id) {
        if (service.deletar(id)) {
            return ResponseEntity.noContent().build(); // 204 No Content Document
        } else {
            return ResponseEntity.notFound().build(); // 404 Not Found Item
        }
    }

}

package com.translife.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.translife.entity.Veiculo;
import com.translife.repository.VeiculoRepository;

@Service
public class VeiculoService {

    @Autowired
    private VeiculoRepository repository;


    public List<Veiculo> listarTodos() {
        return repository.findAll();
    }

    public Optional<Veiculo> buscaPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<Veiculo> buscaPorPlate(String plate) {
        return repository.findByPlates(plate);
    }

    public Veiculo salvar(Veiculo veiculo) {
        return repository.save(veiculo);
    }

    public Veiculo atualizar(Long id, Veiculo detalhes) {
        Optional<Veiculo> veiculoExistente = repository.findById(id);

        if (veiculoExistente.isPresent()) {
            Veiculo veiculoAtual = veiculoExistente.get();
            veiculoAtual.setBrand(detalhes.getBrand());
            veiculoAtual.setModel(detalhes.getModel());
            veiculoAtual.setColor(detalhes.getColor());
            veiculoAtual.setPlates(detalhes.getPlates());
            veiculoAtual.setYear(detalhes.getYear());
            veiculoAtual.setFuelType(detalhes.getFuelType());
            veiculoAtual.setStatus(detalhes.getStatus());
            return repository.save(veiculoAtual);
        } else {
            return null;
        }
    }

    public boolean deletar(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }


}
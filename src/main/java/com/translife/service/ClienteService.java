package com.translife.service;

import com.translife.entity.Cliente;
import com.translife.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository repository;

    public Optional<Cliente> buscaPorId(Long id) {
        return repository.findById(id);
    }

    public List<Cliente> buscaTodos() {
        return repository.findAll();
    }

    public Optional<Cliente> buscaPorPhone(String phone) {
        return repository.findByPhone(phone);
    }

    public Cliente salvar(Cliente cliente) {
        return repository.save(cliente);
    }

    public Cliente atualiza(Long id, Cliente detalhes) {
        Optional<Cliente> dadosAtuais = repository.findById(id);
        if (dadosAtuais.isPresent()) {
            Cliente novosDados =  dadosAtuais.get();
            novosDados.setFirst_name(detalhes.getFirst_name());
            novosDados.setLast_name(detalhes.getLast_name());
            novosDados.setAddress(detalhes.getAddress());
            novosDados.setNeighborhood(detalhes.getNeighborhood());
            novosDados.setCity(detalhes.getCity());
            novosDados.setState(detalhes.getState());
            novosDados.setZip(detalhes.getZip());
            novosDados.setEmail(detalhes.getEmail());
            novosDados.setPhone(detalhes.getPhone());
            novosDados.setActive(detalhes.getActive());
            return repository.save(novosDados);
        } else {
            return null;
        }
    }

    public boolean deleta(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return true;
        }
        return false;
    }


}

package tn.esprit.autoloccce.Services;

import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.ClientRepository;
import tn.esprit.autoloccce.entities.Client;

import java.util.List;

@Service
public class ClinetService implements IClientService {
    ClientRepository repository;
    @Override
    public Client addClient(Client client) {
        return repository.save(client);
    }

    @Override
    public List<Client> GetAllClient() {
        return repository.findAll();
    }

    @Override
    public Client UpdateClient(Client client, Long id) {
        if(repository.existsById(id)) {
           return repository.save(client);
        }
        return null;
    }

    @Override
    public void deleteClient(Long id) {
        repository.deleteById(id);
    }
}

package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Client;

import java.util.List;

public interface IClientService {
    Client addClient(Client client);
    List<Client> GetAllClient();
    Client UpdateClient(Client client ,Long id) ;
    void deleteClient(Long id) ;
}

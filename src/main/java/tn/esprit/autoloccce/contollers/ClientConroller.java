package tn.esprit.autoloccce.contollers;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IClientService;
import tn.esprit.autoloccce.entities.Client;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/client")
public class ClientConroller {
    private  IClientService clientService ;
    @PostMapping("/addClient")
    public Client addClient(@RequestBody Client client){
        return clientService.addClient(client);
    }

    @GetMapping("/getAllClient")
    public List<Client> getAllClient(){
        return clientService.GetAllClient();
    }

    @GetMapping("/getClientById/{id}")
    public Client getClientById(@PathVariable Long id){
        return clientService.GetClientByID(id);
    }

    @PutMapping("/updateClient/{id}")
    public Client updateClient(@RequestBody Client client,@PathVariable Long id){
        return clientService.UpdateClient(client,id);
    }
    @DeleteMapping("/deleteClient/{id}")
    public void deleteClient(@PathVariable Long id) {
        clientService.deleteClient(id);
    }
}

package tn.esprit.autoloccce.contollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IPaiementService;
import tn.esprit.autoloccce.entities.Paiement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/paiement")
public class PaiementController {

    private IPaiementService paiementService ;

    @PostMapping("/addPaiement")
    public Paiement addPaiement(@RequestBody Paiement paiement){
        return paiementService.addPaiement(paiement);
    }

    @GetMapping("/getAllPaiement")
    public List<Paiement> getAllPaiement(){
        return paiementService.GetAllPaiement();
    }

    @GetMapping("/getPaiementById/{id}")
    public Paiement getPaiementById(@PathVariable Long id){
        return paiementService.getPaiementById(id);
    }

    @PutMapping("/updatePaiement/{id}")
    public Paiement updatePaiement(@PathVariable Long id ,@RequestBody Paiement paiement){
        return paiementService.UpdatePaiement(paiement ,id);
    }
    @DeleteMapping("/deletePaiement/{id}")
    public void deletePaiement(@PathVariable Long id){
        paiementService.deletePaiement(id);
    }
}

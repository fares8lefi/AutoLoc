package tn.esprit.autoloccce.contollers;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IAgenceServices;
import tn.esprit.autoloccce.Services.IClientService;
import tn.esprit.autoloccce.entities.Agence;
import tn.esprit.autoloccce.entities.Client;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/agence")
public class AgenceController {
    private final IAgenceServices agenceServices ;

    @PostMapping("/addAgence")
    public Agence addAgence(@RequestBody Agence agence) {
        return agenceServices.addAgance(agence);
    }

    @GetMapping("/getAllAgence")
    public List<Agence> getAllAgence() {
        return agenceServices.GetAllAgance();
    }

    @GetMapping("/getAgenceByID/{id}")
    public Agence getAllAgence(@PathVariable Long id) {
        return agenceServices.getAgenceByID(id);
    }


    @PutMapping("/updateAgence/{id}")
    public Agence UpdateAgence(@RequestBody Agence agence ,@PathVariable Long id){
       return  agenceServices.UpdateAgence(agence,id);
   }

   @DeleteMapping("/deleteAgence/{id}")
    public void deleteAgence(@PathVariable Long id){
       agenceServices.deleteAgence(id);
   }

}

package tn.esprit.autoloccce.contollers;


import lombok.AllArgsConstructor;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IContratService;
import tn.esprit.autoloccce.entities.Contrat;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/contrat")
public class ContratController {

    private IContratService contratService ;

    @PostMapping("/addContrat")
    public Contrat addContrat(@RequestBody Contrat contrat){
        return contratService.addContrat(contrat);
    }

    @GetMapping("/getAllContart")
    public List<Contrat> getAllContart(){
        return contratService.GetAllContrat();
    }

    @GetMapping("/getContratById/{id}")
    public Contrat getAllContart(@PathVariable Long id){
        return contratService.getContratById(id);
    }

    @PutMapping("/updateContrat/{id}")
    public Contrat updateContrat(@PathVariable Long id ,@RequestBody Contrat contrat){
        return contratService.UpdateContrat(contrat ,id);
    }
    @DeleteMapping("/deleteContrat/{id}")
    public void deleteContrat(@PathVariable Long id){
        contratService.deleteContrat(id);
    }
}

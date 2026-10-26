package tn.esprit.autoloccce.contollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IEquipmentService;
import tn.esprit.autoloccce.entities.Equipement;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/equipement")
public class EquipementController {

    private IEquipmentService equipementService ;

    @PostMapping("/addEquipement")
    public Equipement addEquipement(@RequestBody Equipement equipement){
        return equipementService.addEquipement(equipement);
    }

    @GetMapping("/getAllEquipement")
    public List<Equipement> getAllEquipement(){
        return equipementService.GetAllEquipement();
    }

    @GetMapping("/getEquipementById/{id}")
    public Equipement getEquipementById(@PathVariable Long id){
        return equipementService.getEquipementById(id);
    }

    @PutMapping("/updateEquipement/{id}")
    public Equipement updateEquipement(@PathVariable Long id ,@RequestBody Equipement equipement){
        return equipementService.UpdateEquipement(equipement ,id);
    }
    @DeleteMapping("/deleteEquipement/{id}")
    public void deleteEquipement(@PathVariable Long id){
        equipementService.deleteEquipement(id);
    }
}

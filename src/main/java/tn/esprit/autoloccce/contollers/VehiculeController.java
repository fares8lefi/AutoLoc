package tn.esprit.autoloccce.contollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IVehiculeService;
import tn.esprit.autoloccce.entities.Vehicule;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/vehicule")
public class VehiculeController {

    private IVehiculeService vehiculeService ;

    @PostMapping("/addVehicule")
    public Vehicule addVehicule(@RequestBody Vehicule vehicule){
        return vehiculeService.addVehicule(vehicule);
    }

    @GetMapping("/getAllVehicule")
    public List<Vehicule> getAllVehicule(){
        return vehiculeService.GetAllVehicule();
    }

    @GetMapping("/getVehiculeById/{id}")
    public Vehicule getVehiculeById(@PathVariable Long id){
        return vehiculeService.getVehiculeById(id);
    }

    @PutMapping("/updateVehicule/{id}")
    public Vehicule updateVehicule(@PathVariable Long id ,@RequestBody Vehicule vehicule){
        return vehiculeService.UpdateVehicule(vehicule ,id);
    }
    @DeleteMapping("/deleteVehicule/{id}")
    public void deleteVehicule(@PathVariable Long id){
        vehiculeService.deleteVehicule(id);
    }
}

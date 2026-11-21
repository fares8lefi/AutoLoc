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


    @PutMapping("/MENTE/{idv}/{ida}")
    public void affecterVehiculeAAgence(@PathVariable Long idv , @PathVariable Long ida){
        vehiculeService.affecterVehiculeAAgence(idv,ida);
    }

    @PutMapping("/desaffecterVehiculeDAgence/{idv}")
    public void desaffecterVehiculeDAgence(@PathVariable Long idv){
        vehiculeService.desaffecterVehiculeDAgence(idv);
    }

    @PutMapping("/affecterEquipementAVehicule/{ide}/{idv}")
    public void affecterEquipementAVehicule(@PathVariable Long ide , @PathVariable Long idv){
        vehiculeService.affecterEquipementAVehicule(ide,idv);
    }

    @PutMapping("/desaffecterEquipementDeVehicule/{ide}/{idv}")
    public void desaffecterEquipementDeVehicule(@PathVariable Long ide , @PathVariable Long idv){
        vehiculeService.desaffecterEquipementDeVehicule(ide,idv);
    }
}

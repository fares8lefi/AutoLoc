package tn.esprit.autoloccce.contollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IMaintenanceService;
import tn.esprit.autoloccce.entities.Maintenance;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/maintenance")
public class MaintenanceController {

    private IMaintenanceService maintenanceService ;

    @PostMapping("/addMaintenance")
    public Maintenance addMaintenance(@RequestBody Maintenance maintenance){
        return maintenanceService.addMaintenance(maintenance);
    }

    @GetMapping("/getAllMaintenance")
    public List<Maintenance> getAllMaintenance(){
        return maintenanceService.GetAllMaintenance();
    }

    @GetMapping("/getMaintenanceById/{id}")
    public Maintenance getMaintenanceById(@PathVariable Long id){
        return maintenanceService.getMaintenanceById(id);
    }

    @PutMapping("/updateMaintenance/{id}")
    public Maintenance updateMaintenance(@PathVariable Long id ,@RequestBody Maintenance maintenance){
        return maintenanceService.UpdateMaintenance(maintenance ,id);
    }
    @DeleteMapping("/deleteMaintenance/{id}")
    public void deleteMaintenance(@PathVariable Long id){
        maintenanceService.deleteMaintenance(id);
    }
}

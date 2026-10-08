package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.MaintenanceRepository;
import tn.esprit.autoloccce.entities.Maintenance;

import java.util.List;
@Service
@AllArgsConstructor
public class MaintenanceService implements IMaintenanceService{
    MaintenanceRepository repository;
    @Override
    public Maintenance addMaintenance(Maintenance maintenance) {
        return repository.save(maintenance);
    }

    @Override
    public List<Maintenance> GetAllMaintenance() {
        return repository.findAll();
    }

    @Override
    public Maintenance UpdateMaintenance(Maintenance maintenance, Long id) {
        if(repository.existsById(id)){
            maintenance.setIdMaintenance(id);
           return  repository.save(maintenance);
            }
        return null;
    }

    @Override
    public void deleteMaintenance(Long id) {
        repository.deleteById(id);
    }
}

package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Maintenance;

import java.util.List;

public interface IMaintenanceService {
    Maintenance addMaintenance(Maintenance maintenance);
    List<Maintenance> GetAllMaintenance();
    Maintenance UpdateMaintenance(Maintenance maintenance, Long id) ;
    void deleteMaintenance(Long id);
}

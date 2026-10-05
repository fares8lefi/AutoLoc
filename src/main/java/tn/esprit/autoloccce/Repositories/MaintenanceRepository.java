package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloccce.entities.Maintenance;

public interface MaintenanceRepository extends JpaRepository<Maintenance, Long> {
}

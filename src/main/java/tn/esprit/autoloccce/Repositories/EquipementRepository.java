package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.cdi.JpaRepositoryExtension;
import tn.esprit.autoloccce.entities.Equipement;

public interface EquipementRepository extends JpaRepository<Equipement,Long> {
}

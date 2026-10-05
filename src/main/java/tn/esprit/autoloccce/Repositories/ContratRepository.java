package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloccce.entities.Contrat;

public interface ContratRepository extends JpaRepository<Contrat,Long> {
}

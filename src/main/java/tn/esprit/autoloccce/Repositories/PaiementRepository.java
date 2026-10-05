package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloccce.entities.Paiement;

public interface PaiementRepository extends JpaRepository<Paiement,Long> {
}

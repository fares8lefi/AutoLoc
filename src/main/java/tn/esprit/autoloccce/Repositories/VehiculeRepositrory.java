package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloccce.entities.Vehicule;

public interface VehiculeRepositrory extends JpaRepository<Vehicule,Long> {
}

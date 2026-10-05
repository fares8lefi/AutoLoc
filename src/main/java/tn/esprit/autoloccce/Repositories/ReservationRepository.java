package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloccce.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation ,Long> {
}

package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.ReservationRepository;
import tn.esprit.autoloccce.entities.Reservation;

import java.util.List;

@Service
@AllArgsConstructor
public class ReservationService implements IReservationService{
    ReservationRepository repository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return repository.save(reservation);
    }

    @Override
    public List<Reservation> GetAllReservation() {
        return repository.findAll();
    }

    @Override
    public Reservation UpdateReservation(Reservation reservation, Long id) {
        if(repository.existsById(id)){
            reservation.setIdReservation(id);
            return repository.save(reservation);
        }
        return null;
    }

    @Override
    public void deleteReservation(Long id) {
        repository.deleteById(id);
    }
}

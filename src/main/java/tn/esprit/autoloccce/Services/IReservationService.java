package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation(Reservation reservation);
    List<Reservation> GetAllReservation();
    Reservation UpdateReservation(Reservation reservation, Long id) ;
    void deleteReservation(Long id);
}

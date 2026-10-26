package tn.esprit.autoloccce.contollers;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.autoloccce.Services.IReservationService;
import tn.esprit.autoloccce.entities.Reservation;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {

    private IReservationService reservationService ;

    @PostMapping("/addReservation")
    public Reservation addReservation(@RequestBody Reservation reservation){
        return reservationService.addReservation(reservation);
    }

    @GetMapping("/getAllReservation")
    public List<Reservation> getAllReservation(){
        return reservationService.GetAllReservation();
    }

    @GetMapping("/getReservationById/{id}")
    public Reservation getReservationById(@PathVariable Long id){
        return reservationService.getReservationById(id);
    }

    @PutMapping("/updateReservation/{id}")
    public Reservation updateReservation(@PathVariable Long id ,@RequestBody Reservation reservation){
        return reservationService.UpdateReservation(reservation ,id);
    }
    @DeleteMapping("/deleteReservation/{id}")
    public void deleteReservation(@PathVariable Long id){
        reservationService.deleteReservation(id);
    }
}

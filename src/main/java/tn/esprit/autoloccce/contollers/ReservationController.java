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

    @PutMapping("/affecterContratAReservation/{idc}/{idr}")
    public void affecterContratAReservation(@PathVariable Long idc , @PathVariable Long idr){
        reservationService.affecterContratAReservation(idc,idr);
    }

    @PutMapping("/desaffecterContratDeReservation/{idr}")
    public void desaffecterContratDeReservation(@PathVariable Long idr){
        reservationService.desaffecterContratDeReservation(idr);
    }

    @PutMapping("/affecterClientAReservation/{idc}/{idr}")
    public void affecterClientAReservation(@PathVariable Long idc , @PathVariable Long idr){
        reservationService.affecterClientAReservation(idc,idr);
    }
}

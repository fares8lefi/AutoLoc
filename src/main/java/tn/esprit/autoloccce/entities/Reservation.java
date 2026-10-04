package tn.esprit.autoloccce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloccce.entities.enumerations.StatutREservation;

import java.time.LocalDate;
@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long  IdReservation ;
    private LocalDate dateDebut;
    private LocalDate dateFin;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private StatutREservation statut ;
    @ManyToOne
    private Vehicule vehicule;
    @ManyToOne
    private Client client;
    @OneToOne(mappedBy = "reservation")        // inverse side: field name in Contrat
    private Contrat contrat;
}

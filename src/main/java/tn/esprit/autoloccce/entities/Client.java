package tn.esprit.autoloccce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY )
    private long idClient ;
    private String nom;
    private String prenom ;
    private String  email;
    private String  telephone;
    private String  numPermis ;
    private LocalDate dateInscription;
    @OneToMany(mappedBy = "client")
    private List<Reservation> reservations = new ArrayList<>();
}

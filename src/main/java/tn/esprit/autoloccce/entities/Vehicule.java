package tn.esprit.autoloccce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloccce.entities.enumerations.CategorieVehicule;
import tn.esprit.autoloccce.entities.enumerations.RoleEmploye;
import tn.esprit.autoloccce.entities.enumerations.statutVehicule;

import java.math.BigDecimal;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vehicule {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idVehicule ;
    private String immatriculation ;
    private String marque ;
    private String modele ;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CategorieVehicule categorie ;
    private BigDecimal tarifJournalier;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private statutVehicule status ;
}

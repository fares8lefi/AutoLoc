package tn.esprit.autoloccce.entities;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloccce.entities.enumerations.ModePaiement;

import java.math.BigDecimal;
import java.time.LocalDate;
@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor

public class Paiement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idPaiement;
    private BigDecimal montant ;
    private LocalDate datePaiement ;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private ModePaiement ModePaiement ;
}

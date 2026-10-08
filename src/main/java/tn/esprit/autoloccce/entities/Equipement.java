package tn.esprit.autoloccce.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Getter @Setter
@AllArgsConstructor
@NoArgsConstructor
public class Equipement {
    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private long idEquipement ;
    private String libelle;
    @ManyToMany(mappedBy = "equipements")
    private List<Vehicule> vehicules = new ArrayList<>();

}

package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Equipement;

import java.util.List;

public interface IEquipmentService {
    Equipement addEquipement(Equipement equipement);
    List<Equipement> GetAllEquipement();
    Equipement UpdateEquipement(Equipement equipement, Long id) ;
    void deleteEquipement(Long id);
}

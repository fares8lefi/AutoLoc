package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Vehicule;

import java.util.List;

public interface IVehiculeService {
        Vehicule addVehicule(Vehicule vehicule);
        List<Vehicule> GetAllVehicule();
        Vehicule UpdateVehicule(Vehicule vehicule, Long id) ;
        void deleteVehicule(Long id);
    }



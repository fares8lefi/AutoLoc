package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import tn.esprit.autoloccce.Repositories.AgenceRepository;
import tn.esprit.autoloccce.Repositories.EquipementRepository;
import tn.esprit.autoloccce.Repositories.VehiculeRepositrory;
import tn.esprit.autoloccce.entities.Agence;
import tn.esprit.autoloccce.entities.Equipement;
import tn.esprit.autoloccce.entities.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServise implements IVehiculeService{
    VehiculeRepositrory repositrory ;
    AgenceRepository agenceRepository;
    EquipementRepository equipementRepository;
    @Override
    public Vehicule addVehicule(Vehicule vehicule) {
        return repositrory.save(vehicule);
    }

    @Override
    public List<Vehicule> GetAllVehicule() {
        return repositrory.findAll();
    }

    @Override
    public Vehicule UpdateVehicule(Vehicule vehicule, Long id) {
        if(repositrory.existsById(id)){
            vehicule.setIdVehicule(id);
            return repositrory.save(vehicule);
        }
        return null;
    }

    @Override
    public void deleteVehicule(Long id) {
        repositrory.deleteById(id);
    }

    @Override
    public Vehicule getVehiculeById(Long id) {
        return repositrory.findById(id).orElse(null);

    }

    @Override
    public void affecterVehiculeAAgence(Long idVehicule, Long idAgence){
        Vehicule vehicule = repositrory.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));
        Agence agence = agenceRepository.findById(idAgence)
                .orElseThrow(() -> new RuntimeException("Agence introuvable"));

        vehicule.setAgence(agence);
        agence.getVehicules().add(vehicule);
        repositrory.save(vehicule);
    }

    @Override
    public void desaffecterVehiculeDAgence(Long idVehicule){
        Vehicule vehicule = repositrory.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));
        vehicule.setAgence(null);
        repositrory.save(vehicule);
    }

    @Override
    public void affecterEquipementAVehicule(Long idEquipement, Long idVehicule){
        Equipement equipement = equipementRepository.findById(idEquipement)
                .orElseThrow(() -> new RuntimeException("Equipement introuvable"));
        Vehicule vehicule = repositrory.findById(idVehicule)
                .orElseThrow(() -> new RuntimeException("Vehicule introuvable"));

        if(!vehicule.getEquipements().contains(equipement)){
            vehicule.getEquipements().add(equipement);
            equipement.getVehicules().add(vehicule);
        }
        repositrory.save(vehicule);
    }
}

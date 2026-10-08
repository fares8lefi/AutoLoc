package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.VehiculeRepositrory;
import tn.esprit.autoloccce.entities.Vehicule;

import java.util.List;

@Service
@AllArgsConstructor
public class VehiculeServise implements IVehiculeService{
    VehiculeRepositrory repositrory ;
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
}

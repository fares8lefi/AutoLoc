package tn.esprit.autoloccce.Services;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.EquipementRepository;
import tn.esprit.autoloccce.entities.Equipement;

import java.util.List;

@Service
@AllArgsConstructor
public class EquipmentService implements IEquipmentService{

    EquipementRepository repository ;
    @Override
    public Equipement addEquipement(Equipement equipement) {
        return repository.save(equipement);
    }

    @Override
    public List<Equipement> GetAllEquipement() {
        return repository.findAll();
    }

    @Override
    public Equipement UpdateEquipement(Equipement equipement, Long id) {
        if(repository.existsById(id)){
            equipement.setIdEquipement(id);
            return repository.save(equipement);
        }
        return null;
    }

    @Override
    public void deleteEquipement(Long id) {
        repository.deleteById(id);
    }
}

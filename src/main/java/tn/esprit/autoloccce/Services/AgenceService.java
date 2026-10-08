package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.AgenceRepository;
import tn.esprit.autoloccce.entities.Agence;

import java.util.List;

@Service
@AllArgsConstructor
public class AgenceService implements IAgenceServices{
     AgenceRepository repository;
    @Override
    public Agence addAgance(Agence agence) {
        return repository.save(agence);
    }

    @Override
    public List<Agence> GetAllAgance() {
        return  repository.findAll();
    }

    @Override
    public Agence UpdateAgence(Agence agence, Long id) {
        if(repository.existsById(id)) return repository.save(agence);
         return null ;
    }

    @Override
    public void deleteAgence(Long id) {
        repository.deleteById(id);
    }
}

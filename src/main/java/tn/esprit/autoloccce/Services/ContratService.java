package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.ContratRepository;
import tn.esprit.autoloccce.entities.Contrat;

import java.util.List;
@AllArgsConstructor
@Service
public class ContratService implements IContratService {
    ContratRepository repository ;
    @Override
    public Contrat addContrat(Contrat contrat) {
        return repository.save(contrat);
    }

    @Override
    public List<Contrat> GetAllContrat() {
        return repository.findAll();
    }

    @Override
    public Contrat UpdateContrat(Contrat contrat, Long id) {
        if(repository.existsById(id)){
            return repository.save(contrat);
        }
        return null;
    }

    @Override
    public void deleteContrat(Long id) {
        repository.deleteById(id);
    }
}

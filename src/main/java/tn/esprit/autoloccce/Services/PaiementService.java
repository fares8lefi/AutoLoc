package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.ContratRepository;
import tn.esprit.autoloccce.Repositories.PaiementRepository;
import tn.esprit.autoloccce.entities.Contrat;
import tn.esprit.autoloccce.entities.Paiement;

import java.util.List;

@Service
@AllArgsConstructor
public class PaiementService implements IPaiementService{
    PaiementRepository repository ;
    ContratRepository contratRepository;
    @Override
    public Paiement addPaiement(Paiement paiement) {
        return repository.save(paiement);
    }

    @Override
    public List<Paiement> GetAllPaiement() {
        return repository.findAll();
    }

    @Override
    public Paiement UpdatePaiement(Paiement paiement, Long id) {
        if(repository.existsById(id)){
            paiement.setIdPaiement(id);
            return repository.save(paiement);
        }
        return null;
    }

    @Override
    public void deletePaiement(Long id) {
    repository.deleteById(id);
    }

    @Override
    public Paiement getPaiementById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public void affecterPaiementAContrat(Long idPaiement, Long idContrat){
        Paiement paiement = repository.findById(idPaiement)
                .orElseThrow(() -> new RuntimeException("Paiement introuvable"));
        Contrat contrat = contratRepository.findById(idContrat)
                .orElseThrow(() -> new RuntimeException("Contrat introuvable"));

        paiement.setContrat(contrat);
        contrat.getPaiements().add(paiement);
        repository.save(paiement);
    }
}

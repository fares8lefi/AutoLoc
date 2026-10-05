package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Contrat;

import java.util.List;

public interface IContratService {
    Contrat addContrat(Contrat contrat);
    List<Contrat> GetAllContrat();
    Contrat UpdateContrat(Contrat contrat ,Long id) ;
    void deleteContrat(Long id) ;
}

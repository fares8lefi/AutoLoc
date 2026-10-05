package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Agence;

import java.util.List;

public interface IAgenceServices {
    Agence addAgance(Agence agence);
    List<Agence> GetAllAgance();
    Agence UpdateAgence(Agence agence ,Long id) ;
    void deleteAgence(Long id) ;

}

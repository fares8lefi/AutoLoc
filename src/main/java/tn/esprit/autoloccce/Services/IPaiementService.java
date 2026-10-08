package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Paiement;

import java.util.List;

public interface IPaiementService {
    Paiement addPaiement(Paiement paiement);
    List<Paiement> GetAllPaiement();
    Paiement UpdatePaiement(Paiement paiement, Long id) ;
    void deletePaiement(Long id);
}

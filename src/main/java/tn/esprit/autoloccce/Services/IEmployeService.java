package tn.esprit.autoloccce.Services;

import tn.esprit.autoloccce.entities.Contrat;
import tn.esprit.autoloccce.entities.Employe;

import java.util.List;

public interface IEmployeService {
    Employe addEmploye(Employe employe);
    List<Employe> GetAllEmploye();
    Employe UpdateEmploye(Employe employe ,Long id) ;
    void deleteEmploye(Long id);
}

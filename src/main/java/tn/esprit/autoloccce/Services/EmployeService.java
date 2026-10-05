package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.entities.Employe;

import java.util.List;
@AllArgsConstructor
@Service
public class EmployeService implements IEmployeService {
    @Override
    public Employe addEmploye(Employe employe) {
        return null;
    }

    @Override
    public List<Employe> GetAllEmploye() {
        return List.of();
    }

    @Override
    public Employe UpdateEmploye(Employe employe, Long id) {
        return null;
    }

    @Override
    public void deleteEmploye(Long id) {

    }
}

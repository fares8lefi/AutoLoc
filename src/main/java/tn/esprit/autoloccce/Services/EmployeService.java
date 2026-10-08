package tn.esprit.autoloccce.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloccce.Repositories.EmployeeRepository;
import tn.esprit.autoloccce.entities.Employe;

import java.util.List;
@AllArgsConstructor
@Service
public class EmployeService implements IEmployeService {
    EmployeeRepository repository;
    @Override
    public Employe addEmploye(Employe employe) {
        return repository.save(employe);
    }

    @Override
    public List<Employe> GetAllEmploye() {
        return repository.findAll();
    }

    @Override
    public Employe UpdateEmploye(Employe employe, Long id) {
        if(repository.existsById(id)){
            return repository.save(employe);
        }
        return null;
    }

    @Override
    public void deleteEmploye(Long id) {
        repository.deleteById(id);
    }
}

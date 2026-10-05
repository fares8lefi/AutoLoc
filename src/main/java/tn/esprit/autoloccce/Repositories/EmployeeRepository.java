package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloccce.entities.Employe;

public interface EmployeeRepository extends JpaRepository<Employe,Long> {
}

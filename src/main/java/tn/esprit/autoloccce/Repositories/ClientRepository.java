package tn.esprit.autoloccce.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.autoloccce.entities.Client;

public interface ClientRepository extends JpaRepository<Client,Long> {
}

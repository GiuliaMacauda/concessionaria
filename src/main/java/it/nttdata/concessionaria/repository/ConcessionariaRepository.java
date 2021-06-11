package it.nttdata.concessionaria.repository;

import it.nttdata.concessionaria.models.Concessionario;
import org.springframework.data.repository.CrudRepository;

public interface ConcessionariaRepository extends CrudRepository<Concessionario, Long> {
}

package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemetPaciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemetPacienteRepository extends JpaRepository<CemetPaciente, Integer>, JpaSpecificationExecutor<CemetPaciente> {
}
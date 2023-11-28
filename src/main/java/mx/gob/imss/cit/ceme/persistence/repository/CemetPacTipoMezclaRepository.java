package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemetPacTipoMezcla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemetPacTipoMezclaRepository extends JpaRepository<CemetPacTipoMezcla, Integer>, JpaSpecificationExecutor<CemetPacTipoMezcla> {
}
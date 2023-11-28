package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemetPacTipoMezclaMedic;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemetPacTipoMezclaMedicRepository extends JpaRepository<CemetPacTipoMezclaMedic, Integer>, JpaSpecificationExecutor<CemetPacTipoMezclaMedic> {
}
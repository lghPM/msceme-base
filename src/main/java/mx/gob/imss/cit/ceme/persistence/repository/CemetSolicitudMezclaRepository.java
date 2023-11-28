package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemetSolicitudMezcla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemetSolicitudMezclaRepository extends JpaRepository<CemetSolicitudMezcla, Integer>, JpaSpecificationExecutor<CemetSolicitudMezcla> {
}
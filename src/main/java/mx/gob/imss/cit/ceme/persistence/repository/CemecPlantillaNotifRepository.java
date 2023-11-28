package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemecPlantillaNotif;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemecPlantillaNotifRepository extends JpaRepository<CemecPlantillaNotif, Integer>, JpaSpecificationExecutor<CemecPlantillaNotif> {
}
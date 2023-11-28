package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemetNotifSolicitudMezcla;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemetNotifSolicitudMezclaRepository extends JpaRepository<CemetNotifSolicitudMezcla, Integer>, JpaSpecificationExecutor<CemetNotifSolicitudMezcla> {
}
package mx.gob.imss.cit.ceme.persistence.repository;

import mx.gob.imss.cit.ceme.persistence.CemecEstatusSolicitud;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface CemecEstatusSolicitudRepository extends JpaRepository<CemecEstatusSolicitud, Integer>, JpaSpecificationExecutor<CemecEstatusSolicitud> {
}
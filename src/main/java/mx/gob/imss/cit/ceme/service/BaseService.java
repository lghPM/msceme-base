/**
 * 
 */
package mx.gob.imss.cit.ceme.service;

import java.util.List;

import org.springframework.http.ResponseEntity;

import mx.gob.imss.cit.ceme.model.entitydto.CemecDelegacionDto;
import mx.gob.imss.cit.ceme.model.projection.CatalogoView;
import mx.gob.imss.cit.ceme.persistence.CemecDelegacion;

/**
 * 
 */
public interface BaseService {

	// evitar uso de generico  <?> por issue sonar
	ResponseEntity<List<CatalogoView>> getBasePrueba(Integer id);

	ResponseEntity<List<CemecDelegacionDto>> getBasePruebaDto();

	ResponseEntity<List<CemecDelegacion>> getBasePruebaEntidad();
	
	ResponseEntity<List<CemecDelegacionDto>> getBasePruebaMapStruct();
}

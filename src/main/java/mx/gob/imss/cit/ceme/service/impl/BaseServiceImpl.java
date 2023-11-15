/**
 * 
 */
package mx.gob.imss.cit.ceme.service.impl;

import java.util.Collections;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import mx.gob.imss.cit.ceme.model.entitydto.CemecDelegacionDto;
import mx.gob.imss.cit.ceme.model.mapper.DelegacionMapper;
import mx.gob.imss.cit.ceme.model.projection.CatalogoView;
import mx.gob.imss.cit.ceme.model.record.CemecDelegacionRecord;
import mx.gob.imss.cit.ceme.persistence.CemecDelegacion;
import mx.gob.imss.cit.ceme.persistence.repository.CemecDelegacionRepository;
import mx.gob.imss.cit.ceme.service.BaseService;
import mx.gob.imss.cit.ceme.util.ObjectMapperUtils;

/**
 * 
 */
@Log4j2
@Service
@RequiredArgsConstructor
public class BaseServiceImpl implements BaseService {

	// usar DI por constructor
	private final CemecDelegacionRepository delegacionRepository;
	private final DelegacionMapper delegacionMapper;

	@Override
	public ResponseEntity<List<CatalogoView>> getBasePrueba(Integer id) {
		log.info("inicio getBasePrueba {}", id);
		List<CatalogoView> catalogosPrueba = Collections.emptyList();
		try {
			catalogosPrueba = delegacionRepository.findDelegacionView();
			//prueba Record
			List<CemecDelegacionRecord> delegacionRecord=delegacionRepository.findByStpAltaNull();
			delegacionRecord.forEach(del -> System.err.println(del.desDelegacion()));
		} catch (Exception e) {
			log.error("Exception getBasePrueba", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(catalogosPrueba, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<CemecDelegacionDto>> getBasePruebaDto() {
		log.info("inicio getBasePruebaDto");
		List<CemecDelegacionDto> delegacionDtos = Collections.emptyList();
		List<CemecDelegacion> delegacion = Collections.emptyList();
		try {
			delegacion = delegacionRepository.findAll();
			delegacionDtos = ObjectMapperUtils.mapAll(delegacion, CemecDelegacionDto.class);
		} catch (Exception e) {
			log.error("Exception getBasePruebaDto", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(delegacionDtos, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<CemecDelegacion>> getBasePruebaEntidad() {
		log.info("inicio getBasePruebaEntidad");
		List<CemecDelegacion> delegacion = Collections.emptyList();
		try {
			delegacion = delegacionRepository.findAll();
		} catch (Exception e) {
			log.error("Exception getBasePruebaEntidad", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(delegacion, HttpStatus.OK);
	}

	@Override
	public ResponseEntity<List<CemecDelegacionDto>> getBasePruebaMapStruct() {
		log.info("inicio getBasePruebaMapStruct");
		List<CemecDelegacionDto> delegacionDtos = Collections.emptyList();
		List<CemecDelegacion> delegacion = Collections.emptyList();
		try {
			delegacion = delegacionRepository.findAll();
			delegacionDtos =delegacionMapper.toLstDto(delegacion);
		} catch (Exception e) {
			log.error("Exception getBasePruebaMapStruct", e);
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return new ResponseEntity<>(delegacionDtos, HttpStatus.OK);
	}

}

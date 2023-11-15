package mx.gob.imss.cit.ceme.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import org.springframework.stereotype.Component;

import mx.gob.imss.cit.ceme.model.entitydto.CemecDelegacionDto;
import mx.gob.imss.cit.ceme.persistence.CemecDelegacion;

@Component
@Mapper(componentModel = "spring")
public interface DelegacionMapper {

	DelegacionMapper INSTANCE = Mappers.getMapper(DelegacionMapper.class);

	CemecDelegacion toEntity(CemecDelegacionDto dto);

	CemecDelegacionDto toDto(CemecDelegacion entity);

	List<CemecDelegacionDto> toLstDto(List<CemecDelegacion> entity);

//	@Mapping(target = "id", source = "id")
//	@Mapping(target = "desDelegacion", source = "desDelegacion")
//	List<CemecDelegacionDto> toLstDtoRec(List<DelegacionRecord> entity);

	List<CemecDelegacion> toLstEntity(List<CemecDelegacionDto> dto);

}

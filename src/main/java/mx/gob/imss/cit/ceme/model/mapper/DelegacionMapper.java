package mx.gob.imss.cit.ceme.model.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import mx.gob.imss.cit.ceme.model.entitydto.DelegacionDto;
import mx.gob.imss.cit.ceme.model.record.DelegacionRecord;
import mx.gob.imss.cit.ceme.persistence.Delegacion;

@Mapper(componentModel = "spring", uses = { DelegacionRecord.class,
		DelegacionDto.class }, unmappedTargetPolicy = ReportingPolicy.IGNORE)
public interface DelegacionMapper {

	DelegacionMapper INSTANCE = Mappers.getMapper(DelegacionMapper.class);

	Delegacion toEntity(DelegacionDto dto);

	DelegacionDto toDto(Delegacion entity);

	List<DelegacionDto> toLstDto(List<Delegacion> entity);

	@Mapping(target = "id", source = "id")
	@Mapping(target = "desDelegacion", source = "desDelegacion")
	List<DelegacionDto> toLstDtoRec(List<DelegacionRecord> entity);

	List<Delegacion> toLstEntity(List<DelegacionDto> dto);

}

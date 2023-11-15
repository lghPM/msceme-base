package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecCategoriaPuesto;

/**
 * DTO for {@link CemecCategoriaPuesto}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecCategoriaPuestoDto implements Serializable {
    private static final long serialVersionUID = 2708843100582709655L;
    private Integer id;
    private String desCategoriaPuesto;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}
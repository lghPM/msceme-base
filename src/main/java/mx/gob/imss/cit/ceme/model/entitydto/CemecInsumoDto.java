package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecInsumo;

/**
 * DTO for {@link CemecInsumo}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecInsumoDto implements Serializable {
    private static final long serialVersionUID = -6125939546841125204L;
    private Integer id;
    private String desInsumo;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}
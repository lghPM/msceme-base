package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecMotivoCancelacion;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecMotivoCancelacion}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecMotivoCancelacionDto implements Serializable {
    private static final long serialVersionUID = 8001122295776477422L;
    private Integer id;
    private String desMotivoCancelacion;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}
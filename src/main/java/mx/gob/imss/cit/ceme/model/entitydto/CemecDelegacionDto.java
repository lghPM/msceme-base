package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecDelegacion;

/**
 * DTO for {@link CemecDelegacion}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecDelegacionDto implements Serializable {
    private static final long serialVersionUID = -7885814750237984392L;
    private Integer id;
    private String desDelegacion;
    private String refAbreviacion;
    private Integer cvePresupuestoDelegacion;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}
package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecCausaAtribuible;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecCausaAtribuible}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecCausaAtribuibleDto implements Serializable {
    private static final long serialVersionUID = -2079381418082943510L;
    private Integer id;
    private String desCausaAtribuible;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}
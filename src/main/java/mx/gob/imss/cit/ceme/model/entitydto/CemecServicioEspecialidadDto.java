package mx.gob.imss.cit.ceme.model.entitydto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecServicioEspecialidad;

import java.io.Serializable;
import java.util.Date;

/**
 * DTO for {@link CemecServicioEspecialidad}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecServicioEspecialidadDto implements Serializable {
    private static final long serialVersionUID = -3979492973346156826L;
    private Integer id;
    private String desServicioEspecialidad;
    private String cveServicioEspecialidad;
    private Byte cveRamaMedicinaTroncal;
    private Boolean indMarcaPediatria;
    private Boolean indVigencia;
    private String refTipoMovimiento;
    private String refModificacion;
    private Boolean indQumioterapia;
    private Boolean indNpt;
    private Boolean indAntibiotico;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
	
}
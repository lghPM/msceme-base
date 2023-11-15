package mx.gob.imss.cit.ceme.model.entitydto;

import java.io.Serializable;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import mx.gob.imss.cit.ceme.persistence.CemecMedicamento;

/**
 * DTO for {@link CemecMedicamento}
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CemecMedicamentoDto implements Serializable {
    private static final long serialVersionUID = -614873706249029722L;
    private Integer id;
    private CemecTipoMezclaDto idTipoMezcla;
    private String desCortaMedicamento;
    private String desLargaMedicamento;
    private String cveMedicamento;
    private String cvePartidaPresupuestal;
    private String cveDescGpo;
    private String cveDescGen;
    private String cveDescEsp;
    private String cveDescDif;
    private String cveDescVar;
    private String refPresentacion;
    private Byte numPiezasPresentacion;
    private String refUnidadMinMedida;
    private Short numUnidadMinMedidaPieza;
    private Boolean indActivo;
    private String cveUsuarioAlta;
    private String cveUsuarioBaja;
    private String cveUsuarioModifica;
	private Date stpAlta;
	private Date stpModifica;
	private Date stpBaja;
}
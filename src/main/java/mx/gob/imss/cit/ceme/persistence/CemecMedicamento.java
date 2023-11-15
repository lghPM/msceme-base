package mx.gob.imss.cit.ceme.persistence;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "CEMEC_MEDICAMENTO")
public class CemecMedicamento implements Serializable {
    private static final long serialVersionUID = 754088391754540172L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MEDICAMENTO", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "ID_TIPO_MEZCLA", nullable = false)
    private CemecTipoMezcla idTipoMezcla;

    @Column(name = "DES_CORTA_MEDICAMENTO", length = 100)
    private String desCortaMedicamento;

    @Column(name = "DES_LARGA_MEDICAMENTO", nullable = false, length = 2000)
    private String desLargaMedicamento;

    @Column(name = "CVE_MEDICAMENTO", length = 15)
    private String cveMedicamento;

    @Column(name = "CVE_PARTIDA_PRESUPUESTAL", length = 15)
    private String cvePartidaPresupuestal;

    @Column(name = "CVE_DESC_GPO", length = 3)
    private String cveDescGpo;

    @Column(name = "CVE_DESC_GEN", length = 3)
    private String cveDescGen;

    @Column(name = "CVE_DESC_ESP", length = 4)
    private String cveDescEsp;

    @Column(name = "CVE_DESC_DIF", length = 2)
    private String cveDescDif;

    @Column(name = "CVE_DESC_VAR", length = 2)
    private String cveDescVar;

    @Column(name = "REF_PRESENTACION", length = 10)
    private String refPresentacion;

    @Column(name = "NUM_PIEZAS_PRESENTACION")
    private Byte numPiezasPresentacion;

    @Column(name = "REF_UNIDAD_MIN_MEDIDA", length = 10)
    private String refUnidadMinMedida;

    @Column(name = "NUM_UNIDAD_MIN_MEDIDA_PIEZA")
    private Short numUnidadMinMedidaPieza;

    @Column(name = "IND_ACTIVO")
    private Boolean indActivo;

    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;
    
	@Column(name = "STP_ALTA", nullable = false)
	private Date stpAlta;

	@Column(name = "STP_MODIFICA")
	private Date stpModifica;

	@Column(name = "STP_BAJA")
	private Date stpBaja;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public CemecTipoMezcla getIdTipoMezcla() {
        return idTipoMezcla;
    }

    public void setIdTipoMezcla(CemecTipoMezcla idTipoMezcla) {
        this.idTipoMezcla = idTipoMezcla;
    }

    public String getDesCortaMedicamento() {
        return desCortaMedicamento;
    }

    public void setDesCortaMedicamento(String desCortaMedicamento) {
        this.desCortaMedicamento = desCortaMedicamento;
    }

    public String getDesLargaMedicamento() {
        return desLargaMedicamento;
    }

    public void setDesLargaMedicamento(String desLargaMedicamento) {
        this.desLargaMedicamento = desLargaMedicamento;
    }

    public String getCveMedicamento() {
        return cveMedicamento;
    }

    public void setCveMedicamento(String cveMedicamento) {
        this.cveMedicamento = cveMedicamento;
    }

    public String getCvePartidaPresupuestal() {
        return cvePartidaPresupuestal;
    }

    public void setCvePartidaPresupuestal(String cvePartidaPresupuestal) {
        this.cvePartidaPresupuestal = cvePartidaPresupuestal;
    }

    public String getCveDescGpo() {
        return cveDescGpo;
    }

    public void setCveDescGpo(String cveDescGpo) {
        this.cveDescGpo = cveDescGpo;
    }

    public String getCveDescGen() {
        return cveDescGen;
    }

    public void setCveDescGen(String cveDescGen) {
        this.cveDescGen = cveDescGen;
    }

    public String getCveDescEsp() {
        return cveDescEsp;
    }

    public void setCveDescEsp(String cveDescEsp) {
        this.cveDescEsp = cveDescEsp;
    }

    public String getCveDescDif() {
        return cveDescDif;
    }

    public void setCveDescDif(String cveDescDif) {
        this.cveDescDif = cveDescDif;
    }

    public String getCveDescVar() {
        return cveDescVar;
    }

    public void setCveDescVar(String cveDescVar) {
        this.cveDescVar = cveDescVar;
    }

    public String getRefPresentacion() {
        return refPresentacion;
    }

    public void setRefPresentacion(String refPresentacion) {
        this.refPresentacion = refPresentacion;
    }

    public Byte getNumPiezasPresentacion() {
        return numPiezasPresentacion;
    }

    public void setNumPiezasPresentacion(Byte numPiezasPresentacion) {
        this.numPiezasPresentacion = numPiezasPresentacion;
    }

    public String getRefUnidadMinMedida() {
        return refUnidadMinMedida;
    }

    public void setRefUnidadMinMedida(String refUnidadMinMedida) {
        this.refUnidadMinMedida = refUnidadMinMedida;
    }

    public Short getNumUnidadMinMedidaPieza() {
        return numUnidadMinMedidaPieza;
    }

    public void setNumUnidadMinMedidaPieza(Short numUnidadMinMedidaPieza) {
        this.numUnidadMinMedidaPieza = numUnidadMinMedidaPieza;
    }

    public Boolean getIndActivo() {
        return indActivo;
    }

    public void setIndActivo(Boolean indActivo) {
        this.indActivo = indActivo;
    }

    public String getCveUsuarioAlta() {
        return cveUsuarioAlta;
    }

    public void setCveUsuarioAlta(String cveUsuarioAlta) {
        this.cveUsuarioAlta = cveUsuarioAlta;
    }

    public String getCveUsuarioBaja() {
        return cveUsuarioBaja;
    }

    public void setCveUsuarioBaja(String cveUsuarioBaja) {
        this.cveUsuarioBaja = cveUsuarioBaja;
    }

    public String getCveUsuarioModifica() {
        return cveUsuarioModifica;
    }

    public void setCveUsuarioModifica(String cveUsuarioModifica) {
        this.cveUsuarioModifica = cveUsuarioModifica;
    }

	public Date getStpAlta() {
		return stpAlta;
	}

	public void setStpAlta(Date stpAlta) {
		this.stpAlta = stpAlta;
	}

	public Date getStpModifica() {
		return stpModifica;
	}

	public void setStpModifica(Date stpModifica) {
		this.stpModifica = stpModifica;
	}

	public Date getStpBaja() {
		return stpBaja;
	}

	public void setStpBaja(Date stpBaja) {
		this.stpBaja = stpBaja;
	}


}
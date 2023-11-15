package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "CEMEC_UNIDAD_MEDICA")
public class CemecUnidadMedica implements Serializable {
    private static final long serialVersionUID = -1273574275265331892L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_UNIDAD_MEDICA", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_CENTRAL_MEZCLA")
    private CemecCentralMezcla idCentralMezcla;

    @Column(name = "NOM_UNIDAD_MEDICA", nullable = false, length = 100)
    private String nomUnidadMedica;

    @Column(name = "CVE_PRESUPUEST0_UNIDAD_MEDICA", length = 15)
    private String cvePresupuest0UnidadMedica;

    @Column(name = "DOM_UNIDAD_MEDICA", length = 150)
    private String domUnidadMedica;

    @Column(name = "REF_EMAIL_INSTITUCION", length = 100)
    private String refEmailInstitucion;

    @Column(name = "NUM_DISTANCIA_KM", precision = 7, scale = 2)
    private BigDecimal numDistanciaKm;

    @Column(name = "REF_TIEMPO_ESTIMADO", length = 25)
    private String refTiempoEstimado;

    @Column(name = "IND_MEZCLA_ONCOLOGICA")
    private Boolean indMezclaOncologica;

    @Column(name = "IND_MEZCLA_NPT")
    private Boolean indMezclaNpt;

    @Column(name = "IND_MEZCLA_ATB")
    private Boolean indMezclaAtb;

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

    public CemecCentralMezcla getIdCentralMezcla() {
        return idCentralMezcla;
    }

    public void setIdCentralMezcla(CemecCentralMezcla idCentralMezcla) {
        this.idCentralMezcla = idCentralMezcla;
    }

    public String getNomUnidadMedica() {
        return nomUnidadMedica;
    }

    public void setNomUnidadMedica(String nomUnidadMedica) {
        this.nomUnidadMedica = nomUnidadMedica;
    }

    public String getCvePresupuest0UnidadMedica() {
        return cvePresupuest0UnidadMedica;
    }

    public void setCvePresupuest0UnidadMedica(String cvePresupuest0UnidadMedica) {
        this.cvePresupuest0UnidadMedica = cvePresupuest0UnidadMedica;
    }

    public String getDomUnidadMedica() {
        return domUnidadMedica;
    }

    public void setDomUnidadMedica(String domUnidadMedica) {
        this.domUnidadMedica = domUnidadMedica;
    }

    public String getRefEmailInstitucion() {
        return refEmailInstitucion;
    }

    public void setRefEmailInstitucion(String refEmailInstitucion) {
        this.refEmailInstitucion = refEmailInstitucion;
    }

    public BigDecimal getNumDistanciaKm() {
        return numDistanciaKm;
    }

    public void setNumDistanciaKm(BigDecimal numDistanciaKm) {
        this.numDistanciaKm = numDistanciaKm;
    }

    public String getRefTiempoEstimado() {
        return refTiempoEstimado;
    }

    public void setRefTiempoEstimado(String refTiempoEstimado) {
        this.refTiempoEstimado = refTiempoEstimado;
    }

    public Boolean getIndMezclaOncologica() {
        return indMezclaOncologica;
    }

    public void setIndMezclaOncologica(Boolean indMezclaOncologica) {
        this.indMezclaOncologica = indMezclaOncologica;
    }

    public Boolean getIndMezclaNpt() {
        return indMezclaNpt;
    }

    public void setIndMezclaNpt(Boolean indMezclaNpt) {
        this.indMezclaNpt = indMezclaNpt;
    }

    public Boolean getIndMezclaAtb() {
        return indMezclaAtb;
    }

    public void setIndMezclaAtb(Boolean indMezclaAtb) {
        this.indMezclaAtb = indMezclaAtb;
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
package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CEMEC_CENTRAL_MEZCLA")
public class CemecCentralMezcla implements Serializable {
    private static final long serialVersionUID = 4337906932663438879L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CENTRAL_MEZCLA", nullable = false)
    private Integer id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ID_DELEGACION")
    private CemecDelegacion idDelegacion;

    @Column(name = "DES_CENTRAL_MEZCLA", nullable = false, length = 100)
    private String desCentralMezcla;

    @Column(name = "CVE_PRESUPUESTO_CEME")
    private Integer cvePresupuestoCeme;

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

    public CemecDelegacion getIdDelegacion() {
        return idDelegacion;
    }

    public void setIdDelegacion(CemecDelegacion idDelegacion) {
        this.idDelegacion = idDelegacion;
    }

    public String getDesCentralMezcla() {
        return desCentralMezcla;
    }

    public void setDesCentralMezcla(String desCentralMezcla) {
        this.desCentralMezcla = desCentralMezcla;
    }

    public Integer getCvePresupuestoCeme() {
        return cvePresupuestoCeme;
    }

    public void setCvePresupuestoCeme(Integer cvePresupuestoCeme) {
        this.cvePresupuestoCeme = cvePresupuestoCeme;
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
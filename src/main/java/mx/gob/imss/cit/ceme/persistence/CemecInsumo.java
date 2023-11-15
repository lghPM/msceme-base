package mx.gob.imss.cit.ceme.persistence;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "CEMEC_INSUMO")
public class CemecInsumo implements Serializable {
    private static final long serialVersionUID = 5011010351713471907L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_INSUMO", nullable = false)
    private Integer id;

    @Column(name = "DES_INSUMO", nullable = false, length = 500)
    private String desInsumo;

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

    public String getDesInsumo() {
        return desInsumo;
    }

    public void setDesInsumo(String desInsumo) {
        this.desInsumo = desInsumo;
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
package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CEMEC_CAUSA_ATRIBUIBLE")
public class CemecCausaAtribuible implements Serializable {
    private static final long serialVersionUID = 4987362518412198367L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_CAUSA_ATRIBUIBLE", nullable = false)
    private Integer id;

    @Column(name = "DES_CAUSA_ATRIBUIBLE", nullable = false, length = 100)
    private String desCausaAtribuible;

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

    public String getDesCausaAtribuible() {
        return desCausaAtribuible;
    }

    public void setDesCausaAtribuible(String desCausaAtribuible) {
        this.desCausaAtribuible = desCausaAtribuible;
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

    public Object getStpAlta() {
        return stpAlta;
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

	public void setStpAlta(Date stpAlta) {
		this.stpAlta = stpAlta;
	}

}
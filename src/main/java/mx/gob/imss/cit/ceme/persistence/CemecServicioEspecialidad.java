package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CEMEC_SERVICIO_ESPECIALIDAD")
public class CemecServicioEspecialidad implements Serializable {
    private static final long serialVersionUID = 9041471603233415439L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICIO_ESPECIALIDAD", nullable = false)
    private Integer id;

    @Column(name = "DES_SERVICIO_ESPECIALIDAD", length = 100)
    private String desServicioEspecialidad;

    @Column(name = "CVE_SERVICIO_ESPECIALIDAD", length = 5)
    private String cveServicioEspecialidad;

    @Column(name = "CVE_RAMA_MEDICINA_TRONCAL")
    private Byte cveRamaMedicinaTroncal;

    @Column(name = "IND_MARCA_PEDIATRIA")
    private Boolean indMarcaPediatria;

    @Column(name = "IND_VIGENCIA")
    private Boolean indVigencia;

    @Column(name = "REF_TIPO_MOVIMIENTO", length = 50)
    private String refTipoMovimiento;

    @Column(name = "REF_MODIFICACION", length = 20)
    private String refModificacion;

    @Column(name = "IND_QUMIOTERAPIA")
    private Boolean indQumioterapia;

    @Column(name = "IND_NPT")
    private Boolean indNpt;

    @Column(name = "IND_ANTIBIOTICO")
    private Boolean indAntibiotico;

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

    public String getDesServicioEspecialidad() {
        return desServicioEspecialidad;
    }

    public void setDesServicioEspecialidad(String desServicioEspecialidad) {
        this.desServicioEspecialidad = desServicioEspecialidad;
    }

    public String getCveServicioEspecialidad() {
        return cveServicioEspecialidad;
    }

    public void setCveServicioEspecialidad(String cveServicioEspecialidad) {
        this.cveServicioEspecialidad = cveServicioEspecialidad;
    }

    public Byte getCveRamaMedicinaTroncal() {
        return cveRamaMedicinaTroncal;
    }

    public void setCveRamaMedicinaTroncal(Byte cveRamaMedicinaTroncal) {
        this.cveRamaMedicinaTroncal = cveRamaMedicinaTroncal;
    }

    public Boolean getIndMarcaPediatria() {
        return indMarcaPediatria;
    }

    public void setIndMarcaPediatria(Boolean indMarcaPediatria) {
        this.indMarcaPediatria = indMarcaPediatria;
    }

    public Boolean getIndVigencia() {
        return indVigencia;
    }

    public void setIndVigencia(Boolean indVigencia) {
        this.indVigencia = indVigencia;
    }

    public String getRefTipoMovimiento() {
        return refTipoMovimiento;
    }

    public void setRefTipoMovimiento(String refTipoMovimiento) {
        this.refTipoMovimiento = refTipoMovimiento;
    }

    public String getRefModificacion() {
        return refModificacion;
    }

    public void setRefModificacion(String refModificacion) {
        this.refModificacion = refModificacion;
    }

    public Boolean getIndQumioterapia() {
        return indQumioterapia;
    }

    public void setIndQumioterapia(Boolean indQumioterapia) {
        this.indQumioterapia = indQumioterapia;
    }

    public Boolean getIndNpt() {
        return indNpt;
    }

    public void setIndNpt(Boolean indNpt) {
        this.indNpt = indNpt;
    }

    public Boolean getIndAntibiotico() {
        return indAntibiotico;
    }

    public void setIndAntibiotico(Boolean indAntibiotico) {
        this.indAntibiotico = indAntibiotico;
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
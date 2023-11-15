package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "CEMEC_REACCION_ADVERSA")
public class CemecReaccionAdversa implements Serializable {
    private static final long serialVersionUID = -5979667726042352139L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_REACCION_ADVERSA", nullable = false)
    private Integer id;

    @Column(name = "DES_REACCION_ADVERSA", nullable = false, length = 50)
    private String desReaccionAdversa;

    @Column(name = "IND_ACTIVO")
    private Boolean indActivo;

    @Column(name = "CVE_USUARIO_ALTA", nullable = false, length = 60)
    private String cveUsuarioAlta;

    @Column(name = "CVE_USUARIO_BAJA", length = 60)
    private String cveUsuarioBaja;

    @Column(name = "CVE_USUARIO_MODIFICA", length = 60)
    private String cveUsuarioModifica;

    @Column(name = "STP_ALTA", columnDefinition = "timestamp(6) not null")
    private Date stpAlta;

    @Column(name = "STP_BAJA", columnDefinition = "timestamp(6)")
    private Date stpBaja;

    @Column(name = "STP_MODIFICA", columnDefinition = "timestamp(6)")
    private Date stpModifica;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDesReaccionAdversa() {
        return desReaccionAdversa;
    }

    public void setDesReaccionAdversa(String desReaccionAdversa) {
        this.desReaccionAdversa = desReaccionAdversa;
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

    public Date getStpAlta() {
        return stpAlta;
    }

    public void setStpAlta(Date stpAlta) {
        this.stpAlta = stpAlta;
    }

}
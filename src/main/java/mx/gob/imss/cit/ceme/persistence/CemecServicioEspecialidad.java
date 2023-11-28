package mx.gob.imss.cit.ceme.persistence;

import jakarta.persistence.*;
import lombok.*;

import java.io.Serializable;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "CEMEC_SERVICIO_ESPECIALIDAD")
public class CemecServicioEspecialidad implements Serializable {
    private static final long serialVersionUID = 5531993510438256062L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_SERVICIO_ESPECIALIDAD", nullable = false)
    private Integer id;

    @Column(name = "CVE_SERVICIO_ESPECIALIDAD", length = 5)
    private String cveServicioEspecialidad;

    @Column(name = "DES_SERVICIO_ESPECIALIDAD", length = 100)
    private String desServicioEspecialidad;

    @Column(name = "CVE_RAMA_MEDICINA_TRONCAL")
    private Integer cveRamaMedicinaTroncal;

    @Column(name = "CVE_UBICACION")
    private Integer cveUbicacion;

    @Column(name = "IND_INTERV_QUIRURGICA")
    private Boolean indIntervQuirurgica;

    @Column(name = "IND_SEXO_PERMITIDO")
    private Boolean indSexoPermitido;

    @Column(name = "NUM_EDAD_MIN_ANIO")
    private Short numEdadMinAnio;

    @Column(name = "NUM_EDAD_MIN_SEMANA")
    private Short numEdadMinSemana;

    @Column(name = "NUM_EDAD_MAX_ANIO")
    private Short numEdadMaxAnio;

    @Column(name = "NUM_EDAD_MAX_SEMANA")
    private Short numEdadMaxSemana;

    @Column(name = "IND_MARCA_PEDIATRIA")
    private Boolean indMarcaPediatria;

    @Column(name = "CVE_AREA_RESPONSABLE", length = 2)
    private String cveAreaResponsable;

    @Column(name = "CVE_SIMO_SIAIS_DMEM", length = 2)
    private String cveSimoSiaisDmem;

    @Column(name = "CVE_SUB_ESPECIALIDAD", length = 2)
    private String cveSubEspecialidad;

    @Column(name = "IND_MOV_INTRAHOSPITALARIO")
    private Boolean indMovIntrahospitalario;

    @Column(name = "IND_INTERCONSULTAS")
    private Boolean indInterconsultas;

    @Column(name = "CVE_CATEGORIA")
    private Boolean cveCategoria;

    @Column(name = "IND_VIGENCIA")
    private Boolean indVigencia;

    @Column(name = "IND_PRIMER_NIVEL")
    private Boolean indPrimerNivel;

    @Column(name = "IND_SEGUNDO_NIVEL")
    private Boolean indSegundoNivel;

    @Column(name = "IND_TERCER_NIVEL")
    private Boolean indTercerNivel;

    @Column(name = "REF_TIPO_MOVIMIENTO", length = 50)
    private String refTipoMovimiento;

    @Column(name = "REF_MODIFICACION", length = 20)
    private String refModificacion;

    @Column(name = "IND_ACTIVO",columnDefinition="tinyint(1) default 1")
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
}
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
@Table(name = "CEMET_PERSONA")
public class CemetPersona implements Serializable {
    private static final long serialVersionUID = -3853526848173718608L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PERSONA", nullable = false)
    private Integer id;

    @Column(name = "NOM_NOMBRE", nullable = false, length = 50)
    private String nomNombre;

    @Column(name = "NOM_PATERNO", nullable = false, length = 50)
    private String nomPaterno;

    @Column(name = "NOM_MATERNO", length = 50)
    private String nomMaterno;

    @Column(name = "REF_EMAIL", length = 150)
    private String refEmail;

    @Column(name = "REF_MATRICULA", length = 10)
    private String refMatricula;

    @Column(name = "REF_LLAVE", length = 256)
    private String refLlave;

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
}
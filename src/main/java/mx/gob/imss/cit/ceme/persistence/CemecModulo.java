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
@Table(name = "CEMEC_MODULO")
public class CemecModulo implements Serializable {
    private static final long serialVersionUID = 4476449939336759133L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MODULO", nullable = false)
    private Integer id;

    @Column(name = "DES_MODULO", nullable = false, length = 100)
    private String desModulo;

    @Column(name = "ID_MODULO_PADRE")
    private Integer idModuloPadre;

    @Column(name = "REF_MODULO", length = 100)
    private String refModulo;

    @Column(name = "REF_ACCION", length = 100)
    private String refAccion;

    @Column(name = "REF_ICONO", length = 50)
    private String refIcono;

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
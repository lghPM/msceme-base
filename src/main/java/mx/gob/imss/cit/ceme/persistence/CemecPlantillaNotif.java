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
@Table(name = "CEMEC_PLANTILLA_NOTIF")
public class CemecPlantillaNotif implements Serializable {
    private static final long serialVersionUID = -5337198542116048434L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_PLANTILLA_NOTIF", nullable = false)
    private Integer id;

    @Column(name = "CVE_PLANTILLA_NOTIF", nullable = false, length = 100)
    private String cvePlantillaNotif;

    @Column(name = "REF_ASUNTO_ALERTA")
    private String refAsuntoAlerta;

    @Column(name = "REF_CONTENIDO_ALERTA", length = 5000)
    private String refContenidoAlerta;

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
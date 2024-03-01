package tecazuay.eduv.ec.models.utils;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public enum Horario {
        LUNES_A_VIERNES("Lunes - Viernes", "08:00 am", "17:00 pm"),
        LUNES_A_SABADO("Lunes - Sábado", "07:00 am", "18:00 pm"),
        LUNES_A_DOMINGO("Lunes - Domingo", "10:00 am", "14:00 pm");

        private final String dias;
        private final String horaInicio;
        private final String horaFin;
}

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;

@Setter
@Getter
public class Inscripcion {
    public Alumno alumno;
    public ArrayList<Materia>materias;
    public boolean aprobada() {
        for (Materia materia : this.materias) {
            if (this.alumno.correlativasAprobadas(materia)
            ) {
            }
            else{
                return false;
            }
        }
        return true;
    }
}


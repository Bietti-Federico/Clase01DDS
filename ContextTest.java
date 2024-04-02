import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;


public class ContextTest{
    Materia algoritmos=new Materia();
    Materia paradigmasProgramacion=new Materia();
    Materia arquitectura= new Materia();
    Materia analisis1= new Materia();
    Materia analisis2= new Materia();
    ArrayList<Materia> aprobadas1= new ArrayList<>();
    ArrayList<Materia> aprobadas2=new ArrayList<>();
    ArrayList<Materia> correlativasPdp=new ArrayList<>();
    ArrayList<Materia> correlativasAnalisis2=new ArrayList<>();
    ArrayList<Materia> materiasInscripcion=new ArrayList<>();
    ArrayList<Materia> correlativasAnalisis1= new ArrayList<Materia>();
    Alumno alumno2 = new Alumno();
    Alumno alumno1 = new Alumno();
    Inscripcion inscripcion=new Inscripcion();
    @Test
    public void inscripcionValida(){
        algoritmos.setNombre("Algoritmos y Estructuras de Datos");
        arquitectura.setNombre("Arquitectura de computadoras");
        paradigmasProgramacion.setNombre("Paradigmas de Programacion");
        correlativasPdp.add(algoritmos);
        correlativasPdp.add(arquitectura);
        paradigmasProgramacion.setMateriasCorrelativas(correlativasPdp);
        analisis1.setNombre("Analisis Matematico I");
        analisis2.setNombre("Analisis Matematico II");
        correlativasAnalisis2.add(analisis1);
        analisis2.setMateriasCorrelativas(correlativasAnalisis2);
        alumno1.setNombre("Federico");
        alumno1.setLegajo(1756631);
        aprobadas1.add(algoritmos);
        aprobadas1.add(arquitectura);
        aprobadas1.add(analisis1);
        alumno1.setMateriasAprobadas(aprobadas1);
        inscripcion.setAlumno(alumno1);
        materiasInscripcion.add(paradigmasProgramacion);
        materiasInscripcion.add(analisis2);
        inscripcion.setMaterias(materiasInscripcion);

        Assertions.assertEquals(true,  inscripcion.aprobada());
    };

    @Test
    public void inscripcionFallaPorAnalisis1(){
        algoritmos.setNombre("Algoritmos y Estructuras de Datos");
        arquitectura.setNombre("Arquitectura de computadoras");
        paradigmasProgramacion.setNombre("Paradigmas de Programacion");
        correlativasPdp.add(algoritmos);
        correlativasPdp.add(arquitectura);
        paradigmasProgramacion.setMateriasCorrelativas(correlativasPdp);
        analisis1.setNombre("Analisis Matematico I");
        analisis2.setNombre("Analisis Matematico II");
        correlativasAnalisis2.add(analisis1);
        analisis2.setMateriasCorrelativas(correlativasAnalisis2);
        alumno1.setNombre("Federico");
        alumno1.setLegajo(1756631);
        aprobadas1.add(algoritmos);
        aprobadas1.add(arquitectura);
        alumno1.setMateriasAprobadas(aprobadas1);
        inscripcion.setAlumno(alumno1);
        materiasInscripcion.add(paradigmasProgramacion);
        materiasInscripcion.add(analisis2);
        inscripcion.setMaterias(materiasInscripcion);

        Assertions.assertEquals(false,  inscripcion.aprobada());
    };
    @Test
    public void inscripcionSinCorrelativas(){
        algoritmos.setNombre("Algoritmos y Estructuras de Datos");
        arquitectura.setNombre("Arquitectura de computadoras");
        paradigmasProgramacion.setNombre("Paradigmas de Programacion");
        correlativasPdp.add(algoritmos);
        correlativasPdp.add(arquitectura);
        paradigmasProgramacion.setMateriasCorrelativas(correlativasPdp);
        analisis1.setNombre("Analisis Matematico I");
        analisis2.setNombre("Analisis Matematico II");
        correlativasAnalisis2.add(analisis1);
        analisis1.setMateriasCorrelativas(correlativasAnalisis1);
        analisis2.setMateriasCorrelativas(correlativasAnalisis2);
        alumno1.setNombre("Federico");
        alumno1.setLegajo(1756631);
        aprobadas1.add(algoritmos);
        aprobadas1.add(arquitectura);
        alumno1.setMateriasAprobadas(aprobadas1);
        inscripcion.setAlumno(alumno1);
        materiasInscripcion.add(analisis1);
        inscripcion.setMaterias(materiasInscripcion);

        Assertions.assertEquals(true,  inscripcion.aprobada());
    };



}

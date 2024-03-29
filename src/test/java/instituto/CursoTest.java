package instituto;

import static org.junit.jupiter.api.Assertions.*;
import   org.junit.jupiter.api.*;

import java.util.TreeSet;

class CursoTest {

    Curso c;
    Persona p;
    Persona p1;
   TreeSet<Persona> listaAlumnos;
    @BeforeEach
    void setUp() {
        c = new Curso("DAM1");
        p = new Persona(12345678,"Godard",'H',1,6,1980);
        p1 = new Persona(12345677);



    }

    @Test
    void getNombre() {
        assertEquals("DAM1",c.getNombre());
    }

    @Test
    void aniadirAlumno() {
     //añadir alumnos al curso
        c.aniadirAlumno(p);

        listaAlumnos = new TreeSet<>();

        assertEquals(1,listaAlumnos.size());

    }

    @Test
    void testToString() {
        c.aniadirAlumno(p);

        String muestra = c.toString();

        assertTrue(muestra.contains("DAM1"));
        assertTrue(muestra.contains("Godard"));

    }
}
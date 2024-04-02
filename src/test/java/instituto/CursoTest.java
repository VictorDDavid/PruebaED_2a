package instituto;

import static org.junit.jupiter.api.Assertions.*;
import   org.junit.jupiter.api.*;

import java.util.TreeSet;

class CursoTest {

    Curso c;
    Persona p;
    Persona p1, p2;

    @BeforeEach
    void setUp() {
        c = new Curso("DAM1");
        p = new Persona(12345678,"Godard",'H',1,6,1980);
        p1 = new Persona(12345677);
        p2 = new Persona(18345678,"Varda",'M',1,8,1967);



    }

    @Test
    void getNombre() {
        assertEquals("DAM1",c.getNombre());
    }

    @Test
    void aniadirAlumno() {
     //añadir alumnos al curso
        c.aniadirAlumno(p2);
        String alumno = c.toString();

        assertTrue(alumno.contains("Varda"));




    }

    @Test
    void testToString() {
        c.aniadirAlumno(p);

        String muestra = c.toString();

        assertTrue(muestra.contains("DAM1"));
        assertTrue(muestra.contains("Godard"));

    }
}
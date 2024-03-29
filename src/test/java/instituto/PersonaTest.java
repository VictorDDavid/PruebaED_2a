package instituto;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void testConstructorVacio() {

        Persona persona = new Persona();


        assertNotNull(persona);
        assertEquals(1990, persona.getNacimiento().getYear());
        assertEquals(1, persona.getNacimiento().getMonthValue());
        assertEquals(1, persona.getNacimiento().getDayOfMonth());
        assertEquals("", persona.getNombre());
        assertEquals(' ', persona.getGenero());
        assertNotNull(persona.getNif());
    }

    @Test
    public void testConstructorParametros() {
        Persona persona2 = new Persona(12345678,"Pepe",'H',12,5,1995);

        assertEquals("Pepe", persona2.getNombre());
        assertEquals('H', persona2.getGenero());
        assertEquals(LocalDate.of(1995,5,12),
                persona2.getNacimiento());

    }

    @Test
    public void testEquals() {

        Persona persona1 = new Persona(12345677, "Pepa", 'M', 10, 5, 1980);
        Persona persona2 = new Persona(12345677, "Pepa", 'M', 10, 5, 1980);
        Persona persona3 = new Persona(87654398, "Chantal", 'F', 15, 8, 1990);

        //Assers true y false
        assertTrue(persona1.equals(persona2));
        assertFalse(persona1.equals(persona3));
    }

    @Test
    public void testCompareTo() {

        Persona persona1 = new Persona(14345678, "Jordi", 'M', 10, 5, 1980);
        Persona persona2 = new Persona(80654321, "Sol", 'F', 15, 8, 1990);
        Persona persona3 = new Persona(80654321, "Sol", 'F', 15, 8, 1990);


        assertTrue(persona1.compareTo(persona2) < 0);
        assertTrue(persona2.compareTo(persona1) > 0);
        assertEquals(0, persona2.compareTo(persona3));

    }



}
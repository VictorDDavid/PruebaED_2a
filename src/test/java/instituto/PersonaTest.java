package instituto;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.*;

class PersonaTest {

    @Test
    public void testConstructorVacio() {

        Persona persona = new Persona();

        // Assert
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


}
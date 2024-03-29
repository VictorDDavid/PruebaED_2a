package instituto;

import org.junit.jupiter.api.Test;

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

}
package View;

import Controller.PersonaController;
import Model.Persona;

public class Principal {
    public static void main(String[] args) {
        Persona persona = retriveInternFromDatabase();
        PersonaView vista = new PersonaView();
        PersonaController controller = new PersonaController(persona, vista);
        controller.actualizarVista();
        controller.setPersonaNombre("Andres");
        controller.actualizarVista();
    }

    public static Persona retriveInternFromDatabase(){
        Persona persona = new Persona();
        persona.setNombre("Carlos");
        persona.setApellido("Restrepo");
        return persona;
    }
}

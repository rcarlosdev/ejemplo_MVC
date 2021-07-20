package Controller;

import Model.Persona;
import View.PersonaView;

public class PersonaController {
    private Persona persona;
    private PersonaView vista;

    public PersonaController(Persona persona, PersonaView vista){
        this.persona = persona;
        this.vista = vista;
    }

    public String getPersonaNombre() {
        return persona.getNombre();
    }

    public void setPersonaNombre(String nombre){
        persona.setNombre(nombre);
    }

    public String getPersonaApellido() {
        return persona.getApellido();
    }

    public void setPersonaApellido(String apellido) {
        persona.setApellido(apellido);
    }

    public void actualizarVista(){
        vista.mostrarDatosPersona(persona.getNombre(), persona.getApellido());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Persistencia;

import Logica.Usuario;

/**
 *
 * @author massi
 */
public class ControladoraPersistencia {
    PersonaJpaController persoJpa = new PersonaJpaController();
    OdontologoJpaController odonJpa = new OdontologoJpaController();
    PacienteJpaController pacienJpa = new PacienteJpaController();
    ResponsableJpaController responJpa = new ResponsableJpaController();
    SecretarioJpaController secreJpa = new SecretarioJpaController();
    TurnoJpaController turnoJpa = new TurnoJpaController();
    UsuarioJpaController usuJpa = new UsuarioJpaController();
    HorarioJpaController horaJpa = new HorarioJpaController();

    public void crearUsuario(Usuario usu) {
        usuJpa.create(usu);
    }
    
    
}

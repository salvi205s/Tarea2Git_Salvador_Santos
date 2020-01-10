/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tarea2git_salvadorsantos;

/**
 *
 * @author Salva
 */
public class Jugador {

    String nombre;	// Nombre del jugador de fútbol
    int votos;          // Votos recibidos en la aplicación	
    int id;             // Número único identificativo

    public Jugador(String nombre, int votos, int id) {
        this.nombre = nombre;
        this.votos = votos;
        this.id = id;
    }

    
}

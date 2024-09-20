/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.model;

/**
 *
 * @author r1skin
 */
public class Candidato {
    
    public String nome, partido, vice, numero, fotoprefeito, fotovice;
    public int votos;

    public Candidato(String nome, String partido, String vice, String numero,  String fotoprefeito, String fotovice) {
        this.nome = nome;
        this.partido = partido;
        this.vice = vice;
        this.numero = numero;
        this.votos = 0;
        this.fotoprefeito = fotoprefeito;
        this.fotovice = fotovice;
    }
    
    
    
    
    
    
}

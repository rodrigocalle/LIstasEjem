/*
* Rdrigo Calle
* Proffesor Derek Peterson 
*
*/

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.ejm04.listas;

/**
 *
 * @author rodri
 */
public class Archivo {
    private String nom,tipo;
    private int tam;
    
    Archivo(String a, String b, int c){
        nom=a;
        tipo=b;
        tam=c;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getTam() {
        return tam;
    }

    public void setTam(int tam) {
        this.tam = tam;
    }
    
    public void mostrar(){
        System.out.println("<"+nom+" "+tipo+" "+" "+tam);
    }
}

/*
* ESTUDENT COMENTS
*
*
*/

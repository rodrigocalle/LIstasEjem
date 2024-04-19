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
public class NodoOA {
    private Archivo a;
    private NodoOA sig, ant;
    
    
    NodoOA()
    {
        sig = null;
        ant=null;
    }

    public Archivo getA() {
        return a;
    }

    public void setA(Archivo a) {
        this.a = a;
    }

    public NodoOA getSig() {
        return sig;
    }

    public void setSig(NodoOA sig) {
        this.sig = sig;
    }

    public NodoOA getAnt() {
        return ant;
    }

    public void setAnt(NodoOA ant) {
        this.ant = ant;
    }

}

/*
* ESTUDENT COMENTS
*
*
*/

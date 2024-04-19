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
public class LSimpleA {
    private NodoA p;
    
    public LSimpleA(){
        p=null;
    }

    public NodoA getP() {
        return p;
    }

    public void setP(NodoA p) {
        this.p = p;
    }
    
    public void adiprincipio(String a, String b,int c)
    {
        NodoA nue=new NodoA();
        
        nue.setNom(a);
        nue.setTipo(b);
        nue.setTam(c);
       
        
        nue.setSig(getP());
        setP(nue);
    }
    public void adifinal(String a, String b,int c)
    {
        NodoA nue=new NodoA();
        
        nue.setNom(a);
        nue.setTipo(b);
        nue.setTam(c);
        if(getP()==null)
        {
            setP(nue);
        }
        else
        {
             NodoA r=getP();
             while(r.getSig()!=null)
             {
                 r=r.getSig();
             }
             r.setSig(nue);
        }
    }
    
    public void mostrar()
    {
        NodoA q = getP();
        while(q!=null)
        {
            System.out.println("< "+q.getNom()+" "+q.getTipo()+" "+q.getTam()+" "+" >");
            q=q.getSig();
        }
        
    } 
}

/*
* ESTUDENT COMENTS
*
*
*/

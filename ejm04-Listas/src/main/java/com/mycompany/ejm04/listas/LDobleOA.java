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
public class LDobleOA {
    private NodoOA p;
    
    public LDobleOA(){
        p=null;
    }

    public NodoOA getP() {
        return p;
    }

    public void setP(NodoOA p) {
        this.p = p;
    }
    
    public int nronodos()
       {  
           int c=0;
           NodoOA r=getP();
           while (r!=null)
           {   c=c+1;
               r = r.getSig();
            }
         return c;
       }
       public void Mostrar()
       {  NodoOA r=getP();
          while (r!=null)
          {   r.getA().mostrar();
               r=r.getSig();
          }
       }
      public void Adiprincipio(Archivo x)
     {    NodoOA nue=new NodoOA();
          nue.setA(x);
          if ( getP()==null)
                  setP(nue);
          else{
              nue.setSig(getP());
              getP().setAnt(nue);
              setP(nue);
                      }
     }

         public void Adifinal(Archivo x)
     {    NodoOA nue=new NodoOA();
          nue.setA(x);
          if (getP()==null)
                  setP(nue);
          else{
               NodoOA r=getP();
               while (r.getSig()!=null)
                       r=r.getSig();
               r.setSig(nue);
               nue.setAnt(r);
          }
     }


 
}

/*
* ESTUDENT COMENTS
*
*
*/

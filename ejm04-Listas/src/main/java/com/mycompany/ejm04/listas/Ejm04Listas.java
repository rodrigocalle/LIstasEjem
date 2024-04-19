/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejm04.listas;

/**
 *
 * @author rodri
 */
public class Ejm04Listas {

    public static void main(String[] args) {
        //sean listas de 
        // LISTAS SIMPLE DE ARCHIVOS(NOMBRE TIPO TAMANIO)
        // LISTA DOBLE DE OBJETOS ARCHIVO(
        LSimpleA A = new LSimpleA();
        A.adifinal("carta","doc", 20);
        A.adifinal("plantilla","xls", 15);
        A.adifinal("ejercicio","java", 17);
        A.adifinal("datos","txt", 8);
        A.adifinal("pila","java", 32);
        A.adifinal("arbol","java", 18);
        //eliminar los archivos tipo x
    
        System.out.println("--------*LISTAS SIMPLES*---------");
        A.mostrar();
        eliminarX(A,"java");
        System.out.println("------eliminar los archivos tipo x---------");
        A.mostrar();
      
        System.out.println("-----------*LISTAS DOBLES*-------------");
        LDobleOA B= new LDobleOA();
        B.Adifinal(new Archivo("poema","txt",50));
        B.Adifinal(new Archivo("noticia","doc",8));
        B.Adifinal(new Archivo("carta","doc",5));
        B.Adifinal(new Archivo("diagrama","jpg",1000));
        B.Mostrar();
        //eliminar los archivos tipo x---
        System.out.println("-----------*ADICIONA EL ARCHIVO TIPO AA UNO DESPUES DE CADA ARCHIVO*-------------");
        //adiciona el archivo "aaa","TIPOa",1 despues de cada archivo tamaño mayor a X
        adMayorX(B,10);
        B.Mostrar();
    }
    public static void eliminarX(LSimpleA a, String x)
    {
        NodoA r= a.getP();
        while(r!=null)
        {
            if (r.getTipo().equals(x))
            {
                if(r==a.getP())
                {
                    //elimina el primero
                    a.setP(r.getSig());
                    r.setSig(null);
                    r=a.getP();
                }
                else
                {
                    //elimina el que no es el primero
                    NodoA w=a.getP();
                    while(w.getSig()!=r)
                    {
                        w =w.getSig();
                    }
                    w.setSig(r.getSig());
                    r.setSig(null);
                    r=w.getSig();
                }
            }
            else
                r=r.getSig();
        }
        
    }
    public static void  adMayorX(LDobleOA b, int x)
    {
        NodoOA r = b.getP();
        while(r!=null)
        {
            if(r.getA().getTam()>x)
            {
                NodoOA nue = new NodoOA();
                nue.setA(new Archivo("aaa","tipoA",1));
                NodoOA w= r.getSig();
                r.setSig(nue);
                nue.setAnt(r);
                nue.setSig(w);
                //esto es para si el ultimo es el que tiene el valor amyor a x
                if(w!=null)
                {
                     w.setAnt(nue);
                }
               
                r=w;
            }
            else 
                r= r.getSig();
        }
            
    }
    
    
    
    
    
}

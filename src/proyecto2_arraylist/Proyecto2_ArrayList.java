/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2_arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import javafx.scene.paint.Color;

/**
 *
 * @author Jairo Sierra
 */
public class Proyecto2_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declaracion
        ArrayList lista = new ArrayList();//soporta cualquier tipo, no tipado
        ArrayList<Integer> lista2 = new ArrayList<Integer>();//soporta solo enteros
        
        //Agregar
        lista.add(5);
        lista.add("Hola");
        lista.add(new Date());
        lista.add(Color.BLUE);
        lista.add(5555L);//long 
        lista.add(1, 23F);//se indica la posicion y el elemneto = float
        //lista.addAll(lista2);//agrega una lista completa
        
        //Listar
        for (int i = 0; i < lista.size(); i++) {
            //System.out.println(lista.get(i));//imprime los elementos de la lista
            //System.out.println(lista.indexOf(lista.get(i))+"- "+lista.get(i));//imprime la posicion y el objeto
        }
        //solo un tipo
        //forma 1 instanceof
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i) instanceof Date){
            //System.out.println(lista.indexOf(lista.get(i))+"- "+lista.get(i));//imprime la posicion y el objeto
            }
        }
        //forma 2 getclas
        for (int i = 0; i < lista.size(); i++) {
            if(lista.get(i).getClass().getSimpleName().equals("Integer")){
            //System.out.println(lista.indexOf(lista.get(i))+"- "+lista.get(i));//imprime la posicion y el objeto
            }
        }
        //fore
        for (Object t : lista) {
            //System.out.println(lista.indexOf(t)+"- "+t);
        }
        //iterator
        Iterator i = lista.iterator();
        while (i.hasNext()){
            Object next = i.next();
            //System.out.println(lista.indexOf(next)+"- "+next);
        }
        //extra
        System.out.println(((Date)lista.get(3)));//CASTEO
        
        //modificar
        //total
        lista.set(2, Color.BLACK);
        
        //parcial
        ((Date)lista.get(3)).getHours();
        System.out.println(lista.get(3));
        
        //eliminar
        lista.remove(4);
        
        //metodos extras
        Collections.max(lista);
        Collections.min(lista);
        Collections.sort(lista);
        Collections.shuffle(lista);
        Collections.reverse(lista);
        lista.contains(i);//devuelve si esta o no el elemento
        
    }// fin del main
}//fin de la clase

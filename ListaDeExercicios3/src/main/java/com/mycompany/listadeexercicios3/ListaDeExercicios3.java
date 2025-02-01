/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios3;

/**
 *
 * @author T-GAMER
 */
public class ListaDeExercicios3 {

    public static void main(String[] args) {
        ListaEncadeadaCircular lista1 = new ListaEncadeadaCircular();
        lista1.InserirEsquerda(1);
        lista1.InserirEsquerda(3);
        lista1.InserirEsquerda(5);
        
        ListaEncadeadaCircular lista2 = new ListaEncadeadaCircular();
        lista2.InserirEsquerda(2);
        lista2.InserirEsquerda(4);
        lista2.InserirEsquerda(6);
        
        System.out.print("Lista 1: ");
        lista1.Imprimir();
        System.out.print("Lista 2: ");
        lista2.Imprimir();
        
        ListaEncadeadaCircular mergedList = ListaEncadeadaCircular.mergeSortedLists(lista1, lista2);
        System.out.print("Listas Intercaladas: ");
        mergedList.Imprimir();
        
        ListaEncadeadaCircular copiedList = lista1.copy();
        System.out.print("Copia Lista 1: ");
        copiedList.Imprimir();
        
        ListaEncadeadaCircular copiedList2 = lista2.copy();
        System.out.print("Copia Lista 2: ");
        copiedList2.Imprimir();
        
        System.out.println("Elementos na Lista 1: "+lista1.ContarElementos());
        System.out.println("Elementos na Lista 2: "+lista2.ContarElementos());
        System.out.println("Elementos na Lista Intercalada: "+mergedList.ContarElementos());
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios4;

/**
 *
 * @author T-GAMER
 */
public class ListaDeExercicios4 {

    public static void main(String[] args) {
        ListaDuplamenteCircular lista1 = new ListaDuplamenteCircular();
        lista1.InserirEsquerda(1);
        lista1.InserirEsquerda(3);
        lista1.InserirEsquerda(5);

        ListaDuplamenteCircular lista2 = new ListaDuplamenteCircular();
        lista2.InserirEsquerda(2);
        lista2.InserirEsquerda(4);
        lista2.InserirEsquerda(6);

        System.out.print("Lista 1: ");
        lista1.Imprimir();
        System.out.print("Lista 2: ");
        lista2.Imprimir();

        ListaDuplamenteCircular listaIntercalada = ListaDuplamenteCircular.intercalarListasOrdenadas(lista1, lista2);
        System.out.print("Listas Intercaladas: ");
        listaIntercalada.Imprimir();

        ListaDuplamenteCircular copiaLista1 = lista1.copiar();
        System.out.print("Copia da Lista 1: ");
        copiaLista1.Imprimir();
        
        ListaDuplamenteCircular copiaLista2 = lista2.copiar();
        System.out.print("Copia da Lista 2: ");
        copiaLista2.Imprimir();

        System.out.println("Elementos na Lista 1: " + lista1.ContarElementos());
        System.out.println("Elementos na Lista 2: " + lista2.ContarElementos());
        System.out.println("Elementos na Lista Intercalada: " + listaIntercalada.ContarElementos());
    }
}

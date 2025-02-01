/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios;

/**
 *
 * @author T-GAMER
 */
public class ListaDeExercicios {

    public static void main(String[] args) {
        ListaDuplamenteEncadeada lista1 = new ListaDuplamenteEncadeada();
        lista1.Inserir(1);
        lista1.Inserir(3);
        lista1.Inserir(5);
        
        ListaDuplamenteEncadeada lista2 = new ListaDuplamenteEncadeada();
        lista2.Inserir(2);
        lista2.Inserir(4);
        lista2.Inserir(6);
        
        // Concatenando listas
        lista1.concatenate(lista2);
        System.out.print("Lista Concatenada: ");
        lista1.printList();
        
        // Separando lista
        ListaDuplamenteEncadeada part1 = new ListaDuplamenteEncadeada();
        ListaDuplamenteEncadeada part2 = new ListaDuplamenteEncadeada();
        lista1.split(3, part1, part2);
        System.out.print("Lista 1: ");
        part1.printList();
        System.out.print("Lista 2: ");
        part2.printList();
        
        // Intercalando listas ordenadas
        ListaDuplamenteEncadeada mergedList = ListaDuplamenteEncadeada.mergeSortedLists(part1, part2);
        System.out.print("Listas Intercaladas: ");
        mergedList.printList();
    }
}

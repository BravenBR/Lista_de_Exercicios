/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios;

/**
 *
 * @author T-GAMER
 */
public class ListaDuplamenteEncadeada {
    No head; // Cabeça da lista
    No foot; // pé da lista
    
    // Construtor
    public ListaDuplamenteEncadeada() {
        this.head = null;
        this.foot = null;
    }
    
    public void Inserir(int valor) {
        No newNode = new No(valor);
        if (head == null) {
            head = foot = newNode;
        } else {
            foot.next = newNode;
            newNode.prev = foot;
            foot = newNode;
        }
    }
    
    public void printList() {
        No temp = head;
        while (temp != null) {
            System.out.print(temp.valor + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public void concatenate(ListaDuplamenteEncadeada lista2) {
        if (this.head == null) {
            this.head = lista2.head;
            this.foot = lista2.foot;
        } else if (lista2.head != null) {
            this.foot.next = lista2.head;
            lista2.head.prev = this.foot;
            this.foot = lista2.foot;
        }
    }
    
    public void split(int position, ListaDuplamenteEncadeada lista1, ListaDuplamenteEncadeada lista2) {
        No temp = head;
        int index = 0;
        while (temp != null && index < position) {
            lista1.Inserir(temp.valor);
            temp = temp.next;
            index++;
        }
        while (temp != null) {
            lista2.Inserir(temp.valor);
            temp = temp.next;
        }
    }
    
    public static ListaDuplamenteEncadeada mergeSortedLists(ListaDuplamenteEncadeada lista1, ListaDuplamenteEncadeada lista2) {
        ListaDuplamenteEncadeada mergedList = new ListaDuplamenteEncadeada();
        No p1 = lista1.head;
        No p2 = lista2.head;
        
        while (p1 != null && p2 != null) {
            if (p1.valor <= p2.valor) {
                mergedList.Inserir(p1.valor);
                p1 = p1.next;
            } else {
                mergedList.Inserir(p2.valor);
                p2 = p2.next;
            }
        }
        while (p1 != null) {
            mergedList.Inserir(p1.valor);
            p1 = p1.next;
        }
        while (p2 != null) {
            mergedList.Inserir(p2.valor);
            p2 = p2.next;
        }
        return mergedList;
    }
}

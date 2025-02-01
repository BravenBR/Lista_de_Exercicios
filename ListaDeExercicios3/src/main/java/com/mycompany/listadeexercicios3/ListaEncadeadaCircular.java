/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios3;

/**
 *
 * @author T-GAMER
 */
public class ListaEncadeadaCircular {
    No head;
    
    public ListaEncadeadaCircular() {
        head = null;
    }
    
    public void InserirEsquerda(int valor) {
        No newNode = new No(valor);
        if (head == null) {
            head = newNode;
            head.next = head;
        } else {
            No temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            newNode.next = head;
            temp.next = newNode;
            head = newNode;
        }
    }
    
    public int ContarElementos() {
        if (head == null) return 0;
        int count = 0;
        No temp = head;
        do {
            count++;
            temp = temp.next;
        } while (temp != head);
        return count;
    }
    
    public void Contatenar(ListaEncadeadaCircular lista2) {
        if (head == null) {
            head = lista2.head;
        } else if (lista2.head != null) {
            No temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            No temp2 = lista2.head;
            while (temp2.next != lista2.head) {
                temp2 = temp2.next;
            }
            temp.next = lista2.head;
            temp2.next = head;
        }
    }
    
    public static ListaEncadeadaCircular mergeSortedLists(ListaEncadeadaCircular lista1, ListaEncadeadaCircular lista2) {
        ListaEncadeadaCircular mergedList = new ListaEncadeadaCircular();
        No p1 = lista1.head;
        No p2 = lista2.head;
        
        do {
            mergedList.InserirEsquerda(p1.valor);
            p1 = p1.next;
        } while (p1 != lista1.head);
        
        do {
            mergedList.InserirEsquerda(p2.valor);
            p2 = p2.next;
        } while (p2 != lista2.head);
        
        return mergedList;
    }
    
    public ListaEncadeadaCircular copy() {
        ListaEncadeadaCircular newList = new ListaEncadeadaCircular();
        if (head == null) return newList;
        No temp = head;
        do {
            newList.InserirEsquerda(temp.valor);
            temp = temp.next;
        } while (temp != head);
        return newList;
    }
    
    public void Imprimir() {
        if (head == null) return;
        No temp = head;
        do {
            System.out.print(temp.valor + " ");
            temp = temp.next;
        } while (temp != head);
        System.out.println();
    }
}

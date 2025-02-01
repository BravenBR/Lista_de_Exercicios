/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios4;

/**
 *
 * @author T-GAMER
 */
public class ListaDuplamenteCircular {
    No head;

    public ListaDuplamenteCircular() {
        head = null;
    }

    public void InserirEsquerda(int valor) {
        No newNode = new No(valor);
        if (head == null) {
            head = newNode;
            head.next = head;
            head.prev = head;
        } else {
            No tail = head.prev;
            newNode.next = head;
            newNode.prev = tail;
            tail.next = newNode;
            head.prev = newNode;
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

    public void Concatenar(ListaDuplamenteCircular lista2) {
        if (head == null) {
            head = lista2.head;
        } else if (lista2.head != null) {
            No tail1 = head.prev;
            No tail2 = lista2.head.prev;
            
            tail1.next = lista2.head;
            lista2.head.prev = tail1;
            
            tail2.next = head;
            head.prev = tail2;
        }
    }

    public static ListaDuplamenteCircular intercalarListasOrdenadas(ListaDuplamenteCircular lista1, ListaDuplamenteCircular lista2) {
        ListaDuplamenteCircular mergedList = new ListaDuplamenteCircular();
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

    public ListaDuplamenteCircular copiar() {
        ListaDuplamenteCircular novaLista = new ListaDuplamenteCircular();
        if (head == null) return novaLista;
        No temp = head;
        do {
            novaLista.InserirEsquerda(temp.valor);
            temp = temp.next;
        } while (temp != head);
        return novaLista;
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

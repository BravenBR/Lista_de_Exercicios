/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios5;

/**
 *
 * @author T-GAMER
 */
public class ListaCircular {
    No head;
    int count = 0;
    
    public ListaCircular() {
        head = new No(-1); // Nó cabeça
        head.next = head; // Aponta para si mesmo
    }
    
    public void Inserir(int valor) {
        No novo = new No(valor);
        if (head.next == head) {
            head.next = novo;
            novo.next = head;
            count++;
        } else {
            No temp = head;
            while (temp.next != head) {
                temp = temp.next;
            }
            temp.next = novo;
            novo.next = head;
            count++;
        }
    }
    
    public void Imprimir() {
        No temp = head.next;
        System.out.print("Lista: ");
        while (temp != head) {
            System.out.print(" " + temp.valor);
            temp = temp.next;
        }
        System.out.print("\nNumero de elementos na lista: "+count);
    }
}

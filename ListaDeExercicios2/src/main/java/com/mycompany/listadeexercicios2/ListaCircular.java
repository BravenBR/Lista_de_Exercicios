/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadeexercicios2;

/**
 *
 * @author T-GAMER
 */
public class ListaCircular {
    No head;
    No foot;
    
    public ListaCircular() {
        head = new No(-1); // Nó cabeça
        head.next = head;
        head.prev = head;
    }
    
    public void Inserir(int valor) {
        No newNode = new No(valor);
        No last = head.prev;
        last.next = newNode;
        newNode.prev = last;
        newNode.next = head;
        head.prev = newNode;
    }
    
    public void Imprimir() {
        No temp = head.next;
        while (temp != head) {
            System.out.print(temp.valor + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    public No Buscar(int valor) {
        No temp = head.next;
        while (temp != head) {
            if (temp.valor == valor) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }
    
    public void Deletar(int valor) {
        No temp = Buscar(valor);
        if (temp != null) {
            temp.prev.next = temp.next;
            temp.next.prev = temp.prev;
        }
    }
}

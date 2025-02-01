package com.mycompany.listadeexercicios2;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T-GAMER
 */
public class No {
    No next; // Referência ao próximo nó
    No prev; // Referência ao nó anterior
    int valor; // Valor armazenado no nó
    
    public No(int valor){
        this.next = null;
        this.prev = null;
        this.valor = valor;
    }
}

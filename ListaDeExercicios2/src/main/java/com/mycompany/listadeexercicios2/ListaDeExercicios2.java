/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadeexercicios2;

/**
 *
 * @author T-GAMER
 */
public class ListaDeExercicios2 {

    public static void main(String[] args) {
        ListaCircular lista = new ListaCircular();
        lista.Inserir(10);
        lista.Inserir(20);
        lista.Inserir(30);
        
        System.out.print("Lista: ");
        lista.Imprimir();
        
        No found = lista.Buscar(15);
        System.out.println(found != null ? "Buscados: " + found.valor : "Nao foi encontrado nada");
        
        lista.Deletar(15);
        System.out.print("Lista apos a remocao: ");
        lista.Imprimir();
    }

}

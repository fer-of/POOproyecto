/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pooproyect;
/**
 * Esta clase representa un elemento que contiene un índice y un valor.
 * Utilizado para ordenar la lista de índices y valores para el cálculo del número de inscripción.
 */
public class Elemento {
    int index;
    double valor;

    public Elemento(int indice, double valor) {
        this.index = indice;
        this.valor = valor;
    }

    public int getIndice() {
        return index;
    }

    public double getValor() {
        return valor;
    }
}

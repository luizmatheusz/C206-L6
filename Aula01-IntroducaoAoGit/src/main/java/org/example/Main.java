package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Sistema de Almoxarifado

        // Mensagem de boas-vindas e instrucao
        System.out.println("Bem vindo ao Almoxarifado!");
        System.out.println("Resistor | Capacitor | Protoboard");
        System.out.println("Faca sua requisicao:");

        // Leitura da entrada, pedido de requisicao
        Scanner in = new Scanner(System.in);
        String componente = in.nextLine();

        // Verifica o pedido de requisicao
        switch(componente){
            case "Resistor":
                System.out.println("Voce requisitou um Resistor!");
                break;

            case "Capacitor":
                System.out.println("Voce requisitou um Capacitor!");
                break;

            case "Protoboard":
                System.out.println("Voce requisitou um Protoboard!");
                break;

            default:
                System.out.println("Pedido de requisicao invalido!");
                break;
        }
    }
}
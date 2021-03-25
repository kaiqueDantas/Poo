/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.Kaique.zoologico.app;

import br.com.Kaique.zoologico.classes.Animais;

/**
 *
 * @author Kaique
 */
public class Programa {

    public static void main(String[] args) {

        Animais cachorro = new Animais("Xuxa", "Cachorro", 5);

        System.out.println("Nome: " + cachorro.getNome());
        System.out.println("Raça: " + cachorro.getEspecie());
        System.out.println("Idade: " + cachorro.getIdade());

        if (cachorro.ehAdulto()) {

            System.out.println("É adulto!!!");

        } else {

            System.out.println("Não é adulto");

        }

        cachorro.emitirBarulho();

    }

}

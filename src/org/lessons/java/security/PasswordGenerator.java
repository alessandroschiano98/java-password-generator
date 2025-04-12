package org.lessons.java.security;

import java.util.Scanner;

public class PasswordGenerator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // - NOME
        System.out.println("Inserisci un nome");
        String nome = input.nextLine();
        System.out.println("Il nome che  hai appena inserito e': " + nome);

        // - COGNOME
        System.out.println("Inserisci un cognome");
        String cognome = input.nextLine();
        System.out.println("Il cognome che  hai appena inserito e': " + cognome);

        // - COLORE
        System.out.println("Inserisci il tuo colore preferito");
        String colorePreferito = input.nextLine();
        System.out.println("Il tuo colore preferito è: " + colorePreferito);


        String passwordGenerator = input.nextLine();
        System.out.printIn("La password che hai generato è:" + nome + cognome + colorePreferito);
       


        
        input.close();
    }
}

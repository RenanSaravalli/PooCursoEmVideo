package Aula13;

import java.util.Objects;

public class Cachorro extends Lobo{

    // Sobreposição do métod
    @Override
    public void emitirSom() {
        System.out.println("Au au au au");
    }

    // Praticando agora com a sobrecarga
    public void reagir(){
        System.out.println("AUAUAUUAUAUUAUAUU");
    }

    public void reagir(String frase){
        if (frase.equals("Olá") || frase.equals("Toma Comida") || frase.equals("Carinho")) {
            System.out.println("Abanar e Latir");
        } else {
            System.out.println("Rosnar");
        }
    }

    public void reagir(int hora, int minuto){
        if (hora < 12 ) {
            System.out.println(hora+":"+minuto +" Abanar o rabo");
        } else if (hora >= 18) {
            System.out.println(hora+":"+minuto +" Ignorar");
        } else {
            System.out.println(hora+":"+minuto +" Abanar e latir");
        }
    }

    public void reagir(boolean dono){
        if (dono) {
            System.out.println("Abanar");
        } else {
            System.out.println("Rosnar e latir");
        }
    }

    public void reagir(int idade, float peso){
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar e latir auauauaua");
            } else  {
                System.out.println("Deitar dormir e comer ");
            }
        } else {
            if (peso < 10) {
                System.out.println("Dar pirueta mortal, latir auauau");
            } else {
                System.out.println("Comer, correr e dormir");
            }
        }
    }

    // Perceba que os métodos acima possuem diferentes assinaturas
    // além de estarem na mesma classe
}

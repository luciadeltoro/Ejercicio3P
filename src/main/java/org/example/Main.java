package org.example;

public class Main {
    public static void main(String[] args) {
        ElementoAndaluzFactory factory = new AndaluciaFactory();

        ElementoAndaluz flamenco = factory.createElementoAndaluz("flamenco");
        ElementoAndaluz gazpacho = factory.createElementoAndaluz("gazpacho");
        ElementoAndaluz feria = factory.createElementoAndaluz("feriadeabril");

        System.out.println(flamenco.describir());
        System.out.println(gazpacho.describir());
        System.out.println(feria.describir());
    }
}

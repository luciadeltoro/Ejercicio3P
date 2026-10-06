package org.example;

public class AndaluciaFactory extends ElementoAndaluzFactory {
    @Override
    public ElementoAndaluz createElementoAndaluz(String tipo) {
        if (tipo == null) {
            throw new IllegalArgumentException("El tipo no puede ser null.");
        }

        return switch (tipo.toLowerCase()) {
            case "flamenco" -> new Flamenco();
            case "gazpacho" -> new Gazpacho();
            case "feriadeabril" -> new FeriaDeAbril();
            default -> throw new IllegalArgumentException("Tipo de elemento andaluz desconocido: " + tipo);
        };
    }
}

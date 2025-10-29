package com.missionfix.missionfix_backend.utils;

/**
 * Classe utilitaire pour le formatage des chaines de caractères
 * definis en final pour pouvoir acceder à tout moment sans instensier
 */

public final class StringUtils {

    private StringUtils() {} //constructeur vide

    /**
     * Vérifie si une chaîne est vide ou nulle
     */
    public static boolean isBlank(String value) {
        return value == null || value.trim().isEmpty();
    }

    /**
     * Met la première lettre en majuscule
     */
    public static String capitalize(String value) {
        if (isBlank(value)) return value;
        return value.substring(0, 1).toUpperCase() + value.substring(1).toLowerCase();
    }

    /**
     * Supprime les espaces en début et fin, et normalise les espaces multiples
     */
    public static String normalizeSpaces(String value) {
        if (isBlank(value)) return "";
        return value.trim().replaceAll("\\s+", " ");
    }

    /**
     * Compare deux chaînes sans tenir compte de la casse
     */
    public static boolean equalsIgnoreCase(String a, String b) {
        return a != null && b != null && a.equalsIgnoreCase(b);
    }
}

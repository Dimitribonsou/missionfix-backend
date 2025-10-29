package com.missionfix.missionfix_backend.utils;

import java.util.regex.Pattern;

/**
 * Classe permettant de valider les donnees provenant des formulaires
 */
public final class ValidationUtils {

    private ValidationUtils() {}

    private static final Pattern EMAIL_PATTERN = Pattern.compile("^[\\w-\\.]+@[\\w-\\.]+\\.[a-z]{2,}$");
    private static final Pattern PHONE_PATTERN = Pattern.compile("^(\\+\\d{1,3})?\\d{6,15}$");

    /**
     * Vérifie si un email est valide
     */
    public static boolean isValidEmail(String email) {
        return email != null && EMAIL_PATTERN.matcher(email).matches();
    }

    /**
     * Vérifie si un numéro de téléphone est valide
     */
    public static boolean isValidPhone(String phone) {
        return phone != null && PHONE_PATTERN.matcher(phone).matches();
    }

    /**
     * Vérifie si la longueur d'une chaîne est comprise entre min et max
     */
    public static boolean isLengthBetween(String value, int min, int max) {
        if (value == null) return false;
        return value.length() >= min && value.length() <= max;
    }

    /**
     * Vérifie qu'un champ requis n’est pas vide
     */
    public static boolean required(String value) {
        return value != null && !value.trim().isEmpty();
    }
}

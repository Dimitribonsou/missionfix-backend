package com.missionfix.missionfix_backend.utils;


import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * Classe utilitaire pour le  formatages  des dates (dans les DTO, services ou tests).
 */
public final class DateUtils {

    private DateUtils() {} // empêche l’instanciation

    // Format standard utilisé dans tout le projet
    private static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd");
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * Convertit une chaîne en LocalDate
     */
    public static LocalDate parseDate(String dateString) {
        if (dateString == null || dateString.isBlank()) return null;
        return LocalDate.parse(dateString, DATE_FORMATTER);
    }

    /**
     * Convertit une chaîne en LocalDateTime
     */
    public static LocalDateTime parseDateTime(String dateTimeString) {
        if (dateTimeString == null || dateTimeString.isBlank()) return null;
        return LocalDateTime.parse(dateTimeString, DATE_TIME_FORMATTER);
    }

    /**
     * Formate une date pour l'affichage
     */
    public static String formatDate(LocalDate date) {
        return (date == null) ? "" : date.format(DATE_FORMATTER);
    }

    /**
     * Retourne la date actuelle sous format standard
     */
    public static String nowFormatted() {
        return LocalDateTime.now().format(DATE_TIME_FORMATTER);
    }
}

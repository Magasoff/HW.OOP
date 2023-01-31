package Transport;

public class Utile {
    public static String validateString(String value, String susbtitution) {
        return (value == null || value.isBlank() || value.isEmpty() ? susbtitution : value);
    }

    public static String validateString(String value) {
        return String.valueOf(!(value == null || value.isBlank() || value.isEmpty()));
    }

    public static Boolean validateBoolean(Boolean value) {
        return (value != null && value);
    }
    public static Integer validateInteger(Integer value, Integer substitution) {
        return (value == null || value <= 0) ? substitution : value;
    }
}


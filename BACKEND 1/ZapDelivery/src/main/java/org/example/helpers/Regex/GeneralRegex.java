package org.example.helpers.Regex;

public enum GeneralRegex {
    VALIDATION_MARCA("^[A-Za-z ]{1,50}$"),
    VALIDATION_COLOR("^[A-Za-z ]{1,20}$"),
    VALIDATION_DESCRIPCION(".{1,100}$"),
    VALIDATION_TIPO("^[A-Za-z]{1,}$"),
    VALIDATION_AUTONOMIA("^[0-9]{1,2}$"),
    ;
    private String regex;

    GeneralRegex() {
    }

    GeneralRegex(String regex) {
        this.regex = regex;
    }

    public String getRegex() {
        return regex;
    }

    public void setRegex(String regex) {
        this.regex = regex;
    }
}

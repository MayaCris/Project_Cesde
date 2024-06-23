package org.example.helpers.generals;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {
    public boolean validarRegexString(String regex, String cadena) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);
        return matcher.matches();
    }

}

package org.example.helpers.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexValidator {
    public boolean validarRegexString(String regex, String cadena) {
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(cadena);
        System.out.println(matcher.matches());
        return matcher.matches();

    }

}

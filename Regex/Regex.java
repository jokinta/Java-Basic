package preparation_for_first_test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static javax.print.attribute.standard.MediaSizeName.A;

public class Regex {
    public static void main(String[] args) throws AdresException {

        String longString = " Jovan Ivanov CA 17540 PA (412)555-1212 johnsmith  jokinta011@gmail.com";
        String strangeString = " 1Z aaa **** *** {{{ {{ { ";
        String IPadress = "192.168.1.13";
        String email = "jokinta011@gmail.com";
        // Zip Code 5 digits long \s\d{5}\s
        regexChecker("\\s\\d{5}\\s",longString);
        //2 characters that start with a C or A - A[KLRZ]|C[AOT]
        regexChecker("A[KLRZ]|C[AOT]",longString);
        //mail-adress - [A-Za-z0-9._%]+@[A-Za-z0-9._-]+\\.[A-za-z]{2,4}
        regexChecker("[A-Za-z0-9._%]+@[A-Za-z0-9._-]+\\.[A-za-z]{2,4}", longString);
        //IP adress - ^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$
        regexChecker("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$", IPadress);
        //URL - (https?:\/\/(?:www\.|(?!www))[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\.[^\s]{2,}|www\.[a-zA-Z0-9][a-zA-Z0-9-]+[a-zA-Z0-9]\.[^\s]{2,}|https?:\/\/(?:www\.|(?!www))[a-zA-Z0-9]\.[^\s]{2,}|www\.[a-zA-Z0-9]\.[^\s]{2,})


    }

    public static void regexChecker(String theRegex, String str2Check) {
        Pattern checkRegex = Pattern.compile(theRegex);
        Matcher regexMatcher = checkRegex.matcher(str2Check);
        while (regexMatcher.find()) {
            if (regexMatcher.group().length() != 0) {
                System.out.println(regexMatcher.group().trim());
            }


        }
    }
}

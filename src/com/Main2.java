package com;

import jregex.util.io.PathPattern;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main2 {
    public static void main(String[] args) {
        Pattern p3 = Pattern.compile("(?x)\\d");
        Matcher m3 = p3.matcher("4");
        while (m3.find()) {
            System.out.println(m3.start() + " " + m3.group() + " ");
        }
        System.out.println(" ");

    }
}

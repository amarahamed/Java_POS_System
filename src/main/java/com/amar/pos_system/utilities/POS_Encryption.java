package com.amar.pos_system.utilities;

import java.util.TreeMap;

public class POS_Encryption {
    private TreeMap<String, String> posEncrypt;

    public POS_Encryption() {
        posEncrypt = new TreeMap<>();
        setValue();
    }

    public String encryptString(String unEncryptedString) {
        StringBuilder newString = new StringBuilder();
        char[] allLetters = unEncryptedString.toCharArray();

        for(char letter : allLetters) {
            newString.append(this.posEncrypt.get(Character.toString(letter)));
        }

        if(newString.isEmpty()) {
            return "error";
        }

        return newString.toString();
    }

    /*public String unEncrypt(String encryptedString) {
        StringBuilder newString = new StringBuilder();

        for (int i = 0; i < encryptedString.length(); i++) {
            newString.append(posEncrypt.getV);
        }

        return newString;
    }
*/
    private void setValue() {
        // A - Z
        posEncrypt.put("A", "E9");
        posEncrypt.put("B", "CF");
        posEncrypt.put("C", "RD");
        posEncrypt.put("D", "S&");
        posEncrypt.put("E", "V#");
        posEncrypt.put("F", "S&");
        posEncrypt.put("G", "*H");
        posEncrypt.put("H", "_?");
        posEncrypt.put("I", "&U");
        posEncrypt.put("J", "B?");
        posEncrypt.put("K", "HJ");
        posEncrypt.put("L", ".I");
        posEncrypt.put("M", "TN");
        posEncrypt.put("N", "69");
        posEncrypt.put("O", "1H");
        posEncrypt.put("P", "RZ");
        posEncrypt.put("Q", "NB");
        posEncrypt.put("R", "}F");
        posEncrypt.put("S", "/X");
        posEncrypt.put("T", "??");
        posEncrypt.put("U", "#@");
        posEncrypt.put("V", "^^");
        posEncrypt.put("W", "V*");
        posEncrypt.put("X", "[/");
        posEncrypt.put("Y", "|m");
        posEncrypt.put("Z", "TL");
        // a-z
        posEncrypt.put("a", "BH");
        posEncrypt.put("b", "8E");
        posEncrypt.put("c", "GJ");
        posEncrypt.put("d", "J;");
        posEncrypt.put("e", ",,");
        posEncrypt.put("f", "[P");
        posEncrypt.put("g", "OK");
        posEncrypt.put("h", "AY");
        posEncrypt.put("i", "RR");
        posEncrypt.put("j", "4F");
        posEncrypt.put("k", "$#");
        posEncrypt.put("l", "&%");
        posEncrypt.put("m", "(`");
        posEncrypt.put("n", "~C");
        posEncrypt.put("o", "SD");
        posEncrypt.put("p", "CV");
        posEncrypt.put("q", "BE");
        posEncrypt.put("r", "%~");
        posEncrypt.put("s", "XX");
        posEncrypt.put("t", "ZU");
        posEncrypt.put("u", "PK");
        posEncrypt.put("v", "DK");
        posEncrypt.put("w", "!!");
        posEncrypt.put("x", "98");
        posEncrypt.put("y", "46");
        posEncrypt.put("z", "73");
        // numbers 0 - 9
        posEncrypt.put("1", "5*");
        posEncrypt.put("2", ".:");
        posEncrypt.put("3", "/{");
        posEncrypt.put("4", "%W");
        posEncrypt.put("5", "*+");
        posEncrypt.put("6", "BC");
        posEncrypt.put("7", "YZ");
        posEncrypt.put("8", "LU");
        posEncrypt.put("9", "$3");
        posEncrypt.put("0", "6$");
        // special characters
        posEncrypt.put("!", "VG");
        posEncrypt.put("@", "7U");
        posEncrypt.put("#", "IK");
        posEncrypt.put("$", "QX");
        posEncrypt.put("%", "UX");
        posEncrypt.put("^", "UI");
        posEncrypt.put("&", "LO");
        posEncrypt.put("*", "-/");
        posEncrypt.put("(", ",]");
        posEncrypt.put(")", "|L");
        posEncrypt.put("-", "M&");
        posEncrypt.put("_", "V1");
        posEncrypt.put("+", "MG");
        posEncrypt.put("=", "X+");
        posEncrypt.put("[", "=Q");
        posEncrypt.put("]", "8~");
        posEncrypt.put("{", "2U");
        posEncrypt.put("}", "V-");
        posEncrypt.put(";", "PC");
        posEncrypt.put("'", "RB");
        posEncrypt.put(",", "YO");
        posEncrypt.put(".", "/4");
        posEncrypt.put("/", "6G");
        posEncrypt.put("<", "%%");
        posEncrypt.put(">", "HQ");
        posEncrypt.put("?", "6=");
        posEncrypt.put("|", "RC");
        posEncrypt.put("`", "CX");
        posEncrypt.put("~", "3~");

    }
}

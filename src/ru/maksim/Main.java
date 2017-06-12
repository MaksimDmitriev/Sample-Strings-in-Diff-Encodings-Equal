package ru.maksim;

import java.nio.charset.StandardCharsets;

public class Main {

    public static void main(String[] args) {
        String utf8Str = new String(new byte[]{49, 50, 51}, StandardCharsets.UTF_8);
        String utf16Str = new String(new byte[]{-2, -1, 0, 49, 0, 50, 0, 51}, StandardCharsets.UTF_16);
        System.out.println(utf16Str.equals(utf8Str));
    }
}

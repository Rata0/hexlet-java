package io.hexlet;
import org.apache.commons.lang3.StringUtils;

public class One {
    public static void main(String[] args) {
        String word = "Hexlet";
        String reversedWord = StringUtils.reverse(word);
        System.out.println(reversedWord);
    }
}
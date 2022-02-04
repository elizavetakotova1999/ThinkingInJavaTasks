package com.examples.util;
import java.io.*;
import java.util.*;
// Статические функции для чтения и записи текстовых файлов в виде одной строки и обработки файла как ArrayList.

public class TextFile extends ArrayList<String> {
    // Читает файл как одну строку:
    public static String read(String fileName) {
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader in= new BufferedReader(new FileReader(
                    new File(fileName).getAbsoluteFile()));
            try {
                String s;
                while((s = in.readLine()) != null) {
                    sb.append(s);
                    sb.append("\n");
                }
            } finally {
                in.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
    // Запись одного файла одним вызовом метода:
    public static void write(String fileName, String text) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                out.print(text);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Чтение файла, разделенного любым регулярным выражением:
    public TextFile(String fileName, String splitter) {
        super(Arrays.asList(read(fileName).split(splitter)));
        // Регулярное выражение split() часто оставляет пустую строку на первой позиции:
        if(get(0).equals("")) remove(0);
    }
    // Обычно читается по строкам:
    public TextFile(String fileName) {
        this(fileName, "\n");
    }
    public void write(String fileName) {
        try {
            PrintWriter out = new PrintWriter(
                    new File(fileName).getAbsoluteFile());
            try {
                for(String item : this)
                    out.println(item);
            } finally {
                out.close();
            }
        } catch(IOException e) {
            throw new RuntimeException(e);
        }
    }
    // Простой тест:
    public static void main(String[] args) {
        String file = read("TextFile.java");
        write("test.txt", file);
        TextFile text = new TextFile("test.txt");
        text.write("test2.txt");
        // Разбить на уникальный отсортированный список слов:
        TreeSet<String> words = new TreeSet<String>(
                new TextFile("TextFile.java", "\\W+"));
        // Отображаем слова с заглавной буквы:
        System.out.println(words.headSet("a"));
    }
}

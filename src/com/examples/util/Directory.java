package com.examples.util;
// Создать последовательность объектов File,
// которые соответствуют регулярному выражению либо в локальном каталоге,
// либо путем обхода дерева каталогов.

import java.util.regex.*;
import java.io.*;
import java.util.*;

public final class Directory {
    public static File[]
    local(File dir, final String regex) {
        return dir.listFiles(new FilenameFilter() {
            private final Pattern pattern = Pattern.compile(regex);

            public boolean accept(File dir, String name) {
                return pattern.matcher(
                        new File(name).getName()).matches();
            }
        });
    }

    public static File[]
    local(String path, final String regex) { // Перегружено
        return local(new File(path), regex);
    }

    public static TreeInfo
    walk(String start, String regex) { // Начать рекурсию
        return recurseDirs(new File(start), regex);
    }

    public static TreeInfo
    walk(File start, String regex) { // Перегружено
        return recurseDirs(start, regex);
    }

    public static TreeInfo walk(File start) { // Все
        return recurseDirs(start, ".*");
    }

    public static TreeInfo walk(String start) {
        return recurseDirs(new File(start), ".*");
    }

    static TreeInfo recurseDirs(File startDir, String regex) {
        TreeInfo result = new TreeInfo();
        for (File item : startDir.listFiles()) {
            if (item.isDirectory()) {
                result.dirs.add(item);
                result.addAll(recurseDirs(item, regex));
            } else // Regular file
                if (item.getName().matches(regex))
                    result.files.add(item);
        }
        return result;
    }

    // Простой проверочный тест:
    public static void main(String[] args) {
        if (args.length == 0)
            System.out.println(walk("."));
        else
            for (String arg : args)
                System.out.println(walk(arg));
    }

    // Два списка(two-tuple) для возврата пары объектов:
    public static class TreeInfo implements Iterable<File> {
        public List<File> files = new ArrayList<File>();
        public List<File> dirs = new ArrayList<File>();

        // Итерируемый элемент по умолчанию — это список файлов:
        public Iterator<File> iterator() {
            return files.iterator();
        }

        void addAll(TreeInfo other) {
            files.addAll(other.files);
            dirs.addAll(other.dirs);
        }

        public String toString() {
            return "dirs: " + PPrint.pformat(dirs) +
                    "\n\nfiles: " + PPrint.pformat(files);
        }
    }
}
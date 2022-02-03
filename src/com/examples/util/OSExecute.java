package com.examples.util;
import java.io.*;
// Запускаем команду операционной системы и отправляем вывод на консоль.
public class OSExecute {
    public static void command(String command) {
        boolean err = false;
        try {
            Process process =
                    new ProcessBuilder(command.split(" ")).start();
            BufferedReader results = new BufferedReader(
                    new InputStreamReader(process.getInputStream()));
            String s;
            while((s = results.readLine())!= null)
                System.out.println(s);
            BufferedReader errors = new BufferedReader(
                    new InputStreamReader(process.getErrorStream()));
            //Сообщаем об ошибках и возвращаем ненулевое значение вызывающему процессу, если есть проблемы:
            while((s = errors.readLine())!= null) {
                System.err.println(s);
                err = true;
            }
        } catch(Exception e) {
            //  Компенсация за Windows 2000, которая выдает исключение для командной строки по умолчанию:
            if(!command.startsWith("CMD /C"))
                command("CMD /C " + command);
            else
                throw new RuntimeException(e);
        }
        if(err)
            throw new OSExecuteException("Errors executing " +
                    command);
    }
}

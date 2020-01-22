package com.marat;

import java.io.FileWriter;
import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        while (true) {
            Scanner s = new Scanner(System.in);
            System.out.println("Введите число");
            BigInteger b = s.nextBigInteger();
            System.out.println("Введите степень поднятия");
            int i = s.nextInt();
            long t = System.currentTimeMillis();
            BigInteger res = b.pow(i);
            long t2 = System.currentTimeMillis();
//            String st = res.toString();
//
            FileWriter fw = new FileWriter("D:\\"+b+ "_na_"+i+".txt");
            fw.write(String.valueOf(res));
            fw.close();
            System.out.println("Выполнено за: "+ (double)(t2-t)/1000+ " секунд, или за "+ (double)(t2-t)/1000/60+ " минут");
            //System.out.println("Результат: " + res);
//            System.out.println("Кол-во символов: " + st.length());
            System.out.println("Готово!");
        }
    }
}
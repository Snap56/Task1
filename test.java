import java.io.BufferedWriter;
import java.io.FileWriter;

import java.util.Arrays;
import java.util.Random;

public class test {
    public static void main(String[] args) throws Exception {

        int i = new Random().nextInt(2000);
        System.out.printf("Рандомное число i %s", i);
        System.out.println();
        int n = Integer.highestOneBit(i);
        System.out.println(n);
        System.out.println();
        System.out.println(Short.MAX_VALUE);

        String s = "";

        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j % n == 0) {
                s = s + j + ",";
            }
        }
        System.out.println(s);

        String[] m1 = s.split(",");

        System.out.printf(Arrays.toString(m1));
        // 4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и
        // сохранить в массив m2
        String d = "";

        for (int j = Short.MIN_VALUE; j < n; j++) {
            if (j % n != 0) {
                d = d + j + ",";
            }
        }
        // System.out.println(d);
        String[] m2 = d.split(",");
        BufferedWriter outputWriter = null;
        outputWriter = new BufferedWriter(new FileWriter("file.txt"));
        for (int index = 0; index < m2.length; index++) {
            outputWriter.write(m2[index]);
            outputWriter.newLine();
        }
        outputWriter.flush();
        outputWriter.close();
        // System.out.println(Arrays.toString(m2));
    }
}

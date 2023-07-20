package englishBuffer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class EngBuffer {
    public static void main(String[] args) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Tel-ran.de/Desktop/english.txt"));
            int num;
            StringBuilder str = new StringBuilder();
            while ((num = bufferedReader.read()) != -1) {
                str.append((char) num);
            }

            // asdfgh - asdfg -> "asdfew" "-" "gfdf" -> 3 | ok
            // asdfew, aaaa - gfdf -> "asdfew aaa", "gfdf" | [0] -> "asdfew aaa"
            //
            // str.split(\n) -> 2
            // -> str.split(" ").len >= 3
            // -> "-" [0]  || a,b - c


            /*
              long englishWordCount = bufferedReader.lines()
            .map(line -> line.split("-")[0].trim())
            .filter(word -> word.matches("[a-zA-Z]+"))
            .count();
            */


//            try {
//                BufferedReader bufferedReader = new BufferedReader(new FileReader("C:/Users/Tel-ran.de/Desktop/english.txt"));
//
//                long englishWordCount = bufferedReader.lines()
//                        .filter(line -> line.matches("[a-zA-Z]+ - .*"))
//                        .count();
//
//                System.out.println("Количество английских слов: " + englishWordCount);
//
//                bufferedReader.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }


//            System.out.println(str);
//
//            List<String> list = Stream.of(str.toString().split("\n"))
//                    .filter(s -> s.split(" ").length >= 3)
//                    .map(s -> s.split("-")[0])
//                    .toList();
//
//            System.out.println(list);

            List<String> list = Stream.of(str.toString().split("\\s+"))
//                    .filter(el -> el.chars().count() > 2)
                    .filter(el -> (int) el.charAt(0) <= 122 && (int) el.charAt(0) >= 65)
                    .toList();
            System.out.println(list);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

import lombok.Getter;

import java.util.ArrayList;
import java.util.List;

@Getter
public class Word {
    private String target;
    private String[] sniper;
    private List<String> miss;

    public Word(String target) {
        this.target = target.toUpperCase();

        List<String> stringList = new ArrayList<>();
        for (int i = 0; i < target.length(); i++) {
            stringList.add("_");
        }

        this.sniper = stringList.toArray(new String[0]);
        this.miss = new ArrayList<>();
    }

    @Override
    public String toString() {
        return String.format("%s | %s", String.join("", sniper), String.join("", miss));
    }

    /*
    methode:
            checkerWord(String word)
                - == size, если фолс, то ошибка
                - iter index && == index
                    - true -> open char -> add "sniper"
                    - false -> check char in target
                        - false -> kick char
                        - true -> add list "miss"
     */
    public boolean checkerWord(String word) {
        if (word.length() != this.target.length()) {
            System.out.println("Длинна слова отличается от загаданного");
            return false;
        }
        if (this.target.equalsIgnoreCase(word)) {
            return true;
        }

        for (int i = 0; i < target.length(); i++) {
            if (target.charAt(i) == word.charAt(i)) {
                this.sniper[i] = Character.toString(word.charAt(i));
            } else if (List.of(target.split("")).contains(Character.toString(word.charAt(i)))) {
                this.miss.add(Character.toString(word.charAt(i)));
            }

        }
        return false;
    }
}
// фикс ______ |
//      ______ |
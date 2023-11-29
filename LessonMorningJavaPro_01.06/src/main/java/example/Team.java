package example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

// у класса есть поля
public class Team <T extends Participant> {
    // наследуемся только от наших участников
    private String name;
    // T == Adult

    // у класса есть список участников
    private List<T> list = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addParticipant(T participant){
        list.add(participant);
    }

    // Team t1 = new Team()
    // Team t2 = new Team()
    // t1.playWith(t2)
    public void playWith(Team<T> team){
        String winner;
        Random random = new Random();
        int ri = random.nextInt(2);
        if (ri == 0 ){
            winner = this.name;
        }else{
            winner = team.name;
        }
        System.out.println(winner);
    }
}

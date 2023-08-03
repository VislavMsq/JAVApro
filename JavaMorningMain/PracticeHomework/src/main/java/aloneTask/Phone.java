package aloneTask;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Phone {
    private int number;
    private String model;
    private int weight;

    public Phone(int number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String nameCall) {
        System.out.println("Звонит -> " + nameCall);
    }
    public void receiveCall(String name, int number){

    }
    public int getNumber(){
       return this.number;
    }
}

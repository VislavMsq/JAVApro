package example;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
public abstract class Participant {
    public String name;
    private int age;
}

class Adult extends Participant{
    public Adult(String name,int age){
        super(name,age);
    }
}
        //? все что угодно, что наследуется от Participant
class TeenAger extends Participant{
    public TeenAger(String name,int age){
        super(name,age);
    }
}

class Pupil extends Participant{
    public Pupil(String name,int age){
        super(name,age);
    }
}

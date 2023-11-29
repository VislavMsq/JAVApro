package example;

public class Test1 {
    public static void main(String[] args) {
        Pupil p1 = new Pupil("Vadim", 10);
        Pupil p2 = new Pupil("Vlad", 9);

        TeenAger t1 = new TeenAger("Lera", 14);
        TeenAger t2 = new TeenAger("Dima", 15);

        Adult a1 = new Adult("Dmitriy", 29);
        Adult a2 = new Adult("Paul", 30);

        Team<Pupil> pupilTeam1 = new Team<>("PT1");
        pupilTeam1.addParticipant(p1);
        pupilTeam1.addParticipant(p2);

        Team<TeenAger> teenAgerTeam1 = new Team<>("TT1");
        teenAgerTeam1.addParticipant(t1);
        teenAgerTeam1.addParticipant(t2);

        Team<Adult> adultTeam1 = new Team<>("AT1");
        adultTeam1.addParticipant(a1);
        adultTeam1.addParticipant(a2);


    }
}

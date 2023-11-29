package task;

import java.util.*;

public class MainSecond {
    public static void main(String[] args) {
        POJOsecond p1 = new POJOsecond("Bill", "Smit", "B144",18,10.2d );
        POJOsecond p2 = new POJOsecond("Jason", "Goodwin", "B145",36,12.2d );
        POJOsecond p3 = new POJOsecond("Thomas", "Harvey", "B146",22,8.2d );
        POJOsecond p4 = new POJOsecond("Barry", "Williams", "B154",33,12.2d );
        POJOsecond p5 = new POJOsecond("Helen", "Smith", "B144",65,6.2d );
        POJOsecond p6 = new POJOsecond("Charles", " Daniels", "B144",11,12.2d );
        POJOsecond p7 = new POJOsecond("Kay", "Johnson", "B144",22,9.2d );
        POJOsecond p8 = new POJOsecond("Kay", " Johnson", "B144",34,10.2d );
        POJOsecond p9 = new POJOsecond("Phillip", "Simon", "B144",54,7.2d );
        POJOsecond p10 = new POJOsecond("Dennis", "Smith", "B144",20,10.2d );

        Set<POJOsecond> set = new TreeSet<>();
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        set.add(p6);
        set.add(p7);
        set.add(p8);
        set.add(p9);
        set.add(p10);



        Iterator<POJOsecond> iterator = set.iterator();
        List<POJOsecond> list = new ArrayList<>();
        while(iterator.hasNext()){
            POJOsecond pojOsecond = iterator.next();
            if(pojOsecond.getAge() > 30){
                list.add(pojOsecond);
            }
        }
        System.out.println(list);
    }
}

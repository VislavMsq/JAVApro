package classStructure1;

import classStructure1.enums.*;

import java.util.*;

/*
- Info
    - ++Map<Position, List<String>> -- должность, имя
    - ++checker() - на вход сотруника, на выходе String в зависимости от позишн
    - avgSalary() - на вход демартамент, на выход средняя зп по департаменту
    - maxSalary() - на вход демартамент, на выход max зп по департаменту + у кого такая зп(имя)
    - minSalary() - на вход демартамент, на выход min зп по департаменту + у кого такая зп(имя)
    - getPromotion() - на вход сотрудника. в методе - переход на одну позицию выше и зп на 1,25 больше.
 */
public class Info {
    private Map<Position, List<String>> positionListMap;

    public Info(){
        this.positionListMap.put(Position.WATCHMAN, Arrays.asList("склад", "гараж"));
        this.positionListMap.put(Position.SECURITY, Arrays.asList("склад", "офис", "компьютер"));

        this.positionListMap.put(Position.INTERN, Arrays.asList("компьютер"));
        this.positionListMap.put(Position.SALESMAN, Arrays.asList("касса", "склад"));
        this.positionListMap.put(Position.MANAGER, Arrays.asList("база данных","касса","склад"));

        this.positionListMap.put(Position.MECHANIC, Arrays.asList("гараж", "компьютер"));
        this.positionListMap.put(Position.DRIVER, Arrays.asList("гараж","авто","склад"));
        this.positionListMap.put(Position.LOGISTICER, Arrays.asList("база данных"));
    }

    public void checker(Employee employee){
        // this - обращаемся к Map, get - достаем значение по ключу, employee - сотрудник, getPosition - его должность
        System.out.println("Есть доктуп к -> \n" + this.positionListMap.get(employee.getPosition()));
    }
    public void avgSalary(Department department){
    }
}

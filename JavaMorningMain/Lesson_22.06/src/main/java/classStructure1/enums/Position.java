package classStructure1.enums;

import java.util.Map;

public enum Position {
    WATCHMAN,
    SECURITY,

    INTERN,
    SALESMAN,
    MANAGER,

    MECHANIC,
    DRIVER,
    LOGISTICER;


    public Map<Integer, Position> posMap;

    // posMap.put(1, Position.MECHANIC)
    // posMap.put(2, Position.DRIVER)
    // posMap.put(3, Position.LOGISTICER)

    // posMap.put(6, WATCHMAN)
    // posMap.put(5, SECURITY)

    // posMap.put(9, Position.INTERN)
    // posMap.put(10, Position.SALESMAN)
    // posMap.put(11, Position.MANAGER)

}

import lombok.Getter;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Getter
@Phone
public class AnnEx {
    private String name;

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Phone {
    String operationSystem() default "IOS";

    int year() default 2022;
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface Info {
    String model() default "";

}
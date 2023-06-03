package example4;

import example2.Person;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString
@Getter
@Setter
@AllArgsConstructor
public class Products implements Comparable<Products>{
    private String name;
    private double price;


    @Override
    public int compareTo(Products elem) {
        if(this.price < elem.price){
            return -1;
        }else if(this.price > elem.price){
            return +1;
        }else {
            return 0;
        }
    }
}

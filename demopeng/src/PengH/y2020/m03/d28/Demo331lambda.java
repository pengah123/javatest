package PengH.y2020.m03.d28;

import java.util.Arrays;
import java.util.Comparator;

public class Demo331lambda {
    public static void main(String[] args) {
        person[] arr={
                new person("pej",27),
                new person("jeijf",24)
        };
        Arrays.sort(arr, (person person, person t1)->{
                int result;
                if(person.getAge()-t1.getAge()!=0)
                result= person.getAge()-t1.getAge();
                else result=person.getName().charAt(0)-t1.getName().charAt(0);
                return result;
        });
        for (person person : arr) {
            System.out.println(person);
        }
    }
}

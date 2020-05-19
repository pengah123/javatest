package month03.d30;

public class Demo447 {
    public static void method(String name, PersonBuilder pb){
        Person person=pb.build(name);
        System.out.println(person.getName());
    }

    public static void main(String[] args) {
        method("Lisa",(String name)->{
            return new Person(name);
        });
        method("Lisa",Person::new);
    }
}

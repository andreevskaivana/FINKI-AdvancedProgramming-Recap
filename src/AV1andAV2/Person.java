package AV1andAV2;
public class Person {

    private String name;
    private String surname;
    private int age;

    public Person(String name,String surname,int age){
        this.name=name;
        this.surname=surname;
        this.age=age;
    }
    public Person(){

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        Person p=new Person();
        Person p1=new Person("a","b",21);

        System.out.println(p);
        System.out.println(p1);

    }

}

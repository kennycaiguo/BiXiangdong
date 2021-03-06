import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

class Demo18_08 {
    public static void main(String[] args){
        ArrayList<Person> arr1 = new ArrayList<Person>();
        arr1.add(new Person("张1",11));
        arr1.add(new Person("张2",12));
        arr1.add(new Person("张3",13));
        show(arr1);

        HashSet<Student> arr2 = new HashSet<Student>();
        arr2.add(new Student("张4",14));
        arr2.add(new Student("张5",15));
        arr2.add(new Student("张6",16));
        show(arr2);

        HashSet<Worker> arr3 = new HashSet<Worker>();
        arr3.add(new Worker("张4",14));
        arr3.add(new Worker("张5",15));
        arr3.add(new Worker("张6",16));
        show(arr3);
    }

    public static void show(Collection<? super  Student> arr){
        Iterator<? super Student> it = arr.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class Person{
    String name;
    int age;
    Person(){}
    Person(String name, int age){
        this.name = name;
        this.age = age;
    }
    public String toString(){
        return name+"..."+age;
    }
}
class Student extends Person{
    Student(){}
    Student(String name, int age){
        super(name, age);
    }
}
class Worker extends Person{
    Worker(){}
    Worker(String name, int age){
        super(name, age);
    }
}
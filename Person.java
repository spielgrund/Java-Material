public class Person {
    int alter;
    String name;

    public Person(int alter, String name){
        this.alter = alter;
        this.name = name;
    }

    public Person(){}

    public Person(int i){
        alter = i;
    }

    public void sageName(){
        System.out.println(name);
    }

    public void sageWort(String s){
        System.out.println(s);
    }

}

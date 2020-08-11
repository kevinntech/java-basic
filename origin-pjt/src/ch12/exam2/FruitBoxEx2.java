package ch12.exam2;

import java.util.ArrayList;

class Fruit implements Eatable{
    public String toString(){
        return "Fruit";
    }
}

class Apple extends Fruit{
    public String toString(){
        return "Apple";
    }
}

class Grape extends Fruit{
    public String toString(){
        return "Grape";
    }
}

class Toy{
    public String toString(){
        return "Toy";
    }
}

interface Eatable{}

public class FruitBoxEx2 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<>();
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        fruitBox.add(new Fruit());
        fruitBox.add(new Apple());
        fruitBox.add(new Grape());

        appleBox.add(new Apple());
       // appleBox.add(new Grape()); // 에러 Grape는 Apple의 자손이 아님

        grapeBox.add(new Grape());

        System.out.println("fruitBox-" + fruitBox);
        System.out.println("appleBox-" + appleBox);
        System.out.println("grapeBox-" + grapeBox);
        //FruitBox<Toy> toyBox = new FruitBox<>(); // 에러
    }
}

class FruitBox<T extends Fruit> extends Box<T>{}

class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item){
        list.add(item);
    }

    T get(int i){
        return list.get(i);
    }

    int size(){
        return list.size();
    }

    public String toString(){
        return list.toString();
    }
}
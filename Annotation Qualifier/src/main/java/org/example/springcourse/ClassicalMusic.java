package org.example.springcourse;

import org.springframework.stereotype.Component;

@Component
public class ClassicalMusic implements Music{

    //приватный конструктор делает невозможным создание объекта через конструктор класса!
    //для создания объекта нужно использовать фабричный метод
    private ClassicalMusic(){}

    //фабричный метод
    public static ClassicalMusic getClassicalMusic(){return new ClassicalMusic();}

    @Override
    public String getSong(){
        return "Something CLASSIC song";
    }

    public void myInitMethod(){
        System.out.println("This is classicalMusic INIT-method.");
    }

    public void myDestroyMethod(){
        System.out.println("This is classicalMusic DESTROY-method.");
    }
}

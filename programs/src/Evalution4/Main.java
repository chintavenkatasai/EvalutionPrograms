package Evalution4;

abstract class Animal {
 String name;
 
 public Animal(String name) {
     this.name = name;
 } 
 abstract void sound();

 void eat() {
     System.out.println(name + " is eating.");
 }
}

interface Pet {
 void play(); 
 void feed();
}

class Dog extends Animal implements Pet {
 public Dog(String name) {
     super(name);
 }

 @Override
 void sound() {
     System.out.println(name + " says: Woof Woof!");
 }

 @Override
 public void play() {
     System.out.println(name + " loves to play fetch!");
 }

 @Override
 public void feed() {
     System.out.println("Feeding " + name + " with dog food.");
 }

 void sleep() {
     System.out.println(name + " is sleeping.");
 }

 void sleep(int hours) {
     System.out.println(name + " sleeps for " + hours + " hours.");
 }
}
class Cat extends Animal implements Pet {
 public Cat(String name) {
     super(name);
 }
 
 @Override
 void sound() {
     System.out.println(name + " says: Meow Meow!");
 }

 @Override
 public void play() {
     System.out.println(name + " loves to play with yarn!");
 }

 @Override
 public void feed() {
     System.out.println("Feeding " + name + " with cat food.");
 }
}

public class Main {
 public static void main(String[] args) {
     Dog dog = new Dog("Buddy");
     dog.sound();
     dog.eat();
     dog.sleep();
     dog.sleep(8);

     Cat cat = new Cat("Whiskers");
     cat.sound();
     cat.eat();

     dog.play();
     dog.feed();

     cat.play();
     cat.feed();
 }
}

package main;

import action.Action;
import entity.Playroom;
import entity.toy.*;
public class Main{
    public static void main(String[] args) {
        Car car =  new Car("Toyota", 18, "Automobile");
        Ball ball =  new Ball("Ball", 9, "VolleyBall");
        Doll doll = new Doll("Barbie", 22, "Female"); // Error if not male or female argument
        SmallToy smallDoll = new SmallToy("Barbie", 13, "Female");
        Playroom room = new Playroom(100, car, ball, doll, smallDoll);
        room.showToys();
        System.out.print("\n\nSorted:");
        Action action = new Action();
        action.sortByPrice(room);
        room.showToys();
        int from = 0;
        int to = 13;
        System.out.print("\n\nFrom " + from + " to " + to + " byn");
        action.showPriceDiap(room, from, to);
    }
}
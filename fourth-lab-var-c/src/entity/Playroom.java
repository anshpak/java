package entity;

import entity.toy.AbstractToy;

import java.util.ArrayList;

public class Playroom {
    private AgeGroup[] ageGroup;
    private int sum;
    private ArrayList<AbstractToy> toys;

    public Playroom(int sum, AbstractToy... toys) {
        this.toys = new ArrayList<AbstractToy>();
        this.sum = sum;
        for(AbstractToy toy: toys) {
            if(this.sum - toy.getPrice() >= 0) {
                this.toys.add(toy);
                this.sum -= toy.getPrice();
            } else {
                System.out.print("\nThe budget is over");
                break;
            }
        }
    }

    public void showToys() {
        for(AbstractToy toy: toys) {
            System.out.print("\n" + toy.getName() + ", " + toy.getPrice() + " byn");
        }
    }

    public ArrayList<AbstractToy> getToys() {
        return toys;
    }

    public enum AgeGroup {
        INFANTS, TODDLERS, PRE_SCHOOL, SCHOOL, ADOLESCENTS
    }
}

package action;

import entity.Playroom;
import entity.toy.AbstractToy;

import java.util.ArrayList;

public class Action {
    public void sortByPrice(Playroom room) {
        int n = room.getToys().size();
        AbstractToy temp = new AbstractToy("",0);
        for(int i = 0; i < n; i++){
            for(int j = 1; j < (n - i); j++){
                if(room.getToys().get(j - 1).getPrice() > room.getToys().get(j).getPrice()){
                    temp.setToy(room.getToys().get(j - 1));
                    room.getToys().get(j - 1).setToy(room.getToys().get(j));
                    room.getToys().get(j).setToy(temp);
                }

            }
        }

    }

    public void showPriceDiap(Playroom room, int from, int to) {
        for (AbstractToy toy: room.getToys()
             ) {
            if (toy.getPrice() <= to && toy.getPrice() >= from) {
                System.out.print("\n" + toy.getName() + ", " + toy.getPrice() + " byn");
            }
        }
    }
}

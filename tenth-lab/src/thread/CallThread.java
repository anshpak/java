package thread;

import entity.Client;
import entity.Operator;

import java.util.ArrayList;

public class CallThread extends Thread{
    Operator operator;
    ArrayList<Client> clients;
    public CallThread(Operator operator, ArrayList<Client> clients) {
        this.operator = operator;
        this.clients = clients;
        System.out.println(operator.getName() + " started work.");
    }

    public void run() {
        try {
            for (int i = 0; i < clients.size(); i++) {
                Client client = clients.remove(0);
                System.out.println(operator.getName() + ": start call with " + client.getName() + ".");
                System.out.println("There are " + clients.size() + " clients in the queue.");
                try {
                    while(client.isCallEnded()) {
                        Thread.sleep((long) (Math.random() * 10000));
                    }
                    if(!client.isBusinessFinished()) {
                        clients.add(client);
                        System.out.println(client.getName() + " will call back later.");
                    }
                    System.out.println(operator.getName() + ": end call with " + client.getName() + ".");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        } finally {
            System.out.println(operator.getName() + " ended work.");
        }
    }
}

package main;

import entity.Client;
import entity.Operator;
import thread.CallThread;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Operator operator1 = new Operator("Alina");
        Operator operator2 = new Operator("Oleg");
        Operator operator3 = new Operator("Kirill");

        ArrayList<Client> clients = new ArrayList<>();
        ArrayList<String> names = new ArrayList<>();
        names.add("Nikolay");
        names.add("Sergey");
        names.add("Alla");
        names.add("Nikita");
        names.add("Yanush");
        names.add("Aleksey");
        names.add("Svetlana");
        names.add("Violetta");
        names.add("Artem");
        names.add("Elena");
        int n = 10;
        for (int i = 0; i < n; i++) {
            clients.add(new Client(names.get(i), i, i));
        }

        CallThread line1 = new CallThread(operator1, clients);
        CallThread line2 = new CallThread(operator2, clients);
        CallThread line3 = new CallThread(operator3, clients);
        line1.start();
        line2.start();
        line3.start();
    }
}
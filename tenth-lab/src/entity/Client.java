package entity;

import java.util.Random;

public class Client {
    private int phoneNumber;
    private int id;
    private String name;

    public Client(String name, int phoneNumber, int id) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.id = id;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public boolean isOnLine() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean isCallEnded() {
        Random random = new Random();
        return random.nextBoolean();
    }

    public boolean isBusinessFinished() {
        Random random = new Random();
        return random.nextBoolean();
    }
}

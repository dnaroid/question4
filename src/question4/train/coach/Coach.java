package question4.train.coach;

import java.util.Random;

public class Coach {

    private int id;
    private int level;
    private int passangers;
    private int baggage;

    public Coach(int id) {
        this.id = id;
        Random rand = new Random();
        level = rand.nextInt(3) + 1;
        passangers = rand.nextInt(10);
        baggage = rand.nextInt(passangers + 1);
    }

    public int getLevel() {
        return level;
    }

    public int getPassangers() {
        return passangers;
    }

    public int getBaggage() {
        return baggage;
    }

    @Override
    public String toString() {
        return 
            "Вагон №" + (id + 1) + 
            "\t" + level +
            "-й класс\tпассажиров:" + passangers +
            "\tбагаж:" + baggage;
    }
}

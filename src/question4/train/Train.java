package question4.train;

import question4.train.coach.Coach;

public class Train {

    private int length;
    private Coach[] coaches;

    public Train(int length) {
        coaches = new Coach[length];
        for (int i = 0; i < length; i++) {
            coaches[i] = new Coach(i);
        }
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public Coach getCoach(int index) {
        return coaches[index];
    }

    public int getPassangers() {
        int p = 0;
        for (int i = 0; i < length; i++) 
            p += coaches[i].getPassangers();
        return p;
    }

    public int getBaggage() {
        int b = 0;
        for (int i = 0; i < length; i++) 
            b += coaches[i].getBaggage();
        return b;
    }
    
    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < length; i++)
            str.append(coaches[i].toString()).append("\n");
        return str.toString();
    }
    
    public void sortByLevel() {
        for(int i = 0; i < length - 1; i++) {
            for(int j = i + 1; j < length; j++) {
                if(coaches[i].getLevel() > coaches[j].getLevel()) {
                    Coach tmp = coaches[i];
                    coaches[i] = coaches[j];
                    coaches[j] = tmp;
                }
            }
        }
    }

}

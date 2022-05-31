package chapterFour;

public class Bike {
    private int gear;
    private int speed = 15;

    public boolean isOn() {
        return true;
    }

    public boolean isOff() {
        return true;
    }

    public int acceleration(int gear) {
        if(gear == 1){
           speed += 1;
        }
        if(gear == 2){
            speed += 2;
        }
        if(gear == 3){
            speed += 3;
        }
        if(gear == 4){
            speed += 4;
        }
        return speed;
    }

    public int deceleration(int gear) {
        if(gear == 1){
            speed -= 1;
        }
        if(gear == 2){
            speed -= 2;
        }
        if(gear == 3){
            speed -= 3;
        }
        if(gear == 4){
            speed -= 4;
        }
        return speed;
    }
}


import java.util.Random;

public class Car implements Runnable{
    private String name;
    public static int DISTANCE = 100;
    public static int STEP = 2;
    public Car(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int runDistance = 0;

        long startTime = System.currentTimeMillis();

        while (runDistance < Car.DISTANCE){
            try {
                int speed = (new Random()).nextInt(20);

                runDistance += speed;

                String log = "|";

                int percentTravel = (runDistance * 100)/DISTANCE;
                for (int i = 0; i < DISTANCE; i+= STEP) {
                    if (percentTravel >= i + STEP){
                        log += "=";
                    } else if (percentTravel >= i && percentTravel < i + STEP){
                        log += "o";
                    }   else {
                        log += "-";
                    }
                }
                log += "|";
                System.out.println("Car " + this.name + ": "+ log + " "+ Math.min(DISTANCE,runDistance) + "KM");

                Thread.sleep(1000);
            } catch (InterruptedException e){
                System.out.println(e.getMessage());
                break;
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Car" + this.name + " Finish in " + (endTime - startTime) / 1000 + "s");
    }



    public static void main(String[] args) {
        Car carA = new Car("A");
        Car carB = new Car("B");
        Car carC = new Car("C");
        Thread thread1 = new Thread(carA);
        Thread thread2 = new Thread(carB);
        Thread thread3 = new Thread(carC);
        System.out.println("DISTANCE: 100KM");
        thread1.start();
        thread2.start();
        thread3.start();
    }
}
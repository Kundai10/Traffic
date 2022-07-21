package TrafficLight;
import java.util.Queue;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.TimeUnit;


public class Light {
    String redLight;
    String greenLight;
    String yellowLight;

    // Light class constructor.

    public Light() {
        redLight = "RED LIGHT";
        greenLight = "GREEN LIGHT";
        yellowLight = "YELLOW LIGHT";
    }

    // if light is red, the method simply does a countdown while the cars wait in Queue
    public  void isRed() throws InterruptedException {
        System.out.println("STOP!\nRED LIGHT!\nWAIT FOR 20 SECONDS.");

        // enables to schedule tasks for later execution
        Timer timer = new Timer();
        // implements tasks that can be schedules to run a number of times using the timer class.
        TimerTask task = new TimerTask() {
            int counter = 20;

            @Override
            public void run() {
                // after every second, the method decrements the counter variable by 1
                if (counter > 0) {
                    System.out.println(counter + " SECONDS");
                    counter--;

                } else {
                    // when the counter is equal the zero, the below message is printed
                    // and the timer is cancelled
                    System.out.println("SWITCHING TO YELLOW LIGHT AFTER TWO SECONDS: ");
                    System.out.println("CHANGE GEARS!!\n");
                    System.out.println(" ");
                    timer.cancel();

                }

            }
        };
        // it does the task inside the run function after 1 seconds/1000 milliseconds
        timer.scheduleAtFixedRate(task, 0, 1000);
        TimeUnit.SECONDS.sleep(20);



    }
    // the isGreen method removes 30 cars from the Queue.
    public void isGreen(Queue<Integer> randomCar) throws InterruptedException {
        System.out.println("GREEN LIGHT!\n GO! GO! GO!");
        for(int i = 0;i<30; i++){
            randomCar.remove();
            // the sleep in built function controls the rate at which the cars pass through
            // in this case they pass through after every seconds.
            TimeUnit.SECONDS.sleep(1);
            System.out.println(randomCar);
        }
        System.out.println(" ");
        System.out.println("THERE ARE NOW " + randomCar.size() + " CARS LEFT");
        System.out.println(" ");

    }
    // the isYellow method  runs for 10 seconds but each car is supposed to leave the Queue after
    // every 2 seconds and hence only 5 cars are allowed to pass through
    public void isYellow(Queue<Integer> randomCar) throws InterruptedException {
        System.out.println("YELLOW LIGHT!");
        System.out.println("MOVE FAST, ONLY 5 CARS CAN PASS THROUGH.");
        for(int i = 0;i<5; i++){
            randomCar.remove();
            // the sleep in built function controls the rate at which the cars leave the Queue
            // in this case they leave after every 2 seconds.
            TimeUnit.SECONDS.sleep(2);
            System.out.println(randomCar);
        }
        System.out.println(" ");
        System.out.println("THERE ARE NOW " + randomCar.size() + " CARS LEFT");
        System.out.println("DIDN'T MANAGE TO GET THROUGH?\nDON'T WORRY YOU WILL PASS WHEN THE LIGHT TURNS GREEN");
        System.out.println("THE LIGHT WILL TURN GREEN IN 2 SECONDS.\n");
        System.out.println(" ");


    }
}

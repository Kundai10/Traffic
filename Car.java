package TrafficLight;


import java.util.Queue;
import java.util.Random;



import static java.lang.Thread.sleep;

public class Car {
    // default constructor so that I can be able to call methods from this class in the Main method
    public Car(){}
    // this method returns 25 random cars after every 4 seconds, to the Queue of cars until they reach 100.

    public void addCar(Queue<Integer> randomCar) throws InterruptedException {


        Random random = new Random();
        System.out.println("THE PROGRAM IS RUNNING");
        System.out.println("PLEASE WAIT WHILE THE CARS RANDOMLY LINE UP IN A QUEUE.\n");


        for (int i = 0; i < 25; i++) {

            randomCar.add((random.nextInt(200)));
            sleep(300);

        }
        System.out.println("THE FIRST 25 CARS HAVE BEEN ADDED\n THERE ARE 25 CARS IN THE QUEUE");
        System.out.println(randomCar);
        System.out.println(" ");

        for (int i = 0; i < 25; i++) {

            randomCar.add((random.nextInt(200)));
            sleep(300);

        }
        System.out.println("ANOTHER 25 CARS HAVE BEEN ADDED\nTHERE ARE NOW 50 CARS IN THE QUEUE");
        System.out.println(randomCar);
        System.out.println(" ");

        for (int i = 0; i < 25; i++) {

            randomCar.add((random.nextInt(200)));
            sleep(300);

        }
        System.out.println("ANOTHER 25 CARS HAVE BEEN ADDED\nTHERE ARE NOW 75 CARS IN THE QUEUE.");
        System.out.println(randomCar);
        System.out.println(" ");

        for (int i = 0; i < 25; i++) {

            randomCar.add((random.nextInt(200)));
            sleep(300);

        }
        System.out.println("ANOTHER 25 CARS HAVE BEEN ADDED\nTHERE ARE NOW 100 CARS IN THE QUEUE.");
        System.out.println(randomCar);
        System.out.println(" ");



    }



}
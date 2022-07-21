package TrafficLight;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.TimeUnit;




public class Main {


    public static void main(String[] args) throws InterruptedException {
        // this is a Queue, where the cars are being added
        // used a Queue because it removes items, on a first in first out basis.
        Queue<Integer> randomCar = new LinkedList<>();
        // cars object created
        Car cars = new Car();
        cars.addCar(randomCar);
        // colour object created.
        Light colour = new Light();
        // while the randomCar Queue is not empty, the program continues to run.
        try{
        while (!randomCar.isEmpty()){
            // a 2 second delay is needed before the light changes colour
            colour.isRed();
            TimeUnit.SECONDS.sleep(2);
            colour.isYellow(randomCar);
            TimeUnit.SECONDS.sleep(2);
            colour.isGreen(randomCar);
            TimeUnit.SECONDS.sleep(2);

        }}
        // when the queue is empty it returns the below message instead of returning an Error message
        catch(Exception e){
            System.out.println("THE QUEUE IS EMPTY. ALL CARS HAVE PASSED THROUGH!");
        }
    }







}






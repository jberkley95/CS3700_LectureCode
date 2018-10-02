package Lecture5;

/**
 * @author John Berkley
 * CPP Class: <Insert Class Here>
 * Date Created: Oct 01, 2018
 */
//Main thread

public class ProducerConsumerExample {

    public static void main(String[] args) {

        Drop drop = new Drop();

        (new Thread(new Producer(drop))).start();

        (new Thread(new Consumer(drop))).start();

    }

}

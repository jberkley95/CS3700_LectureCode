package Lecture6;

/**
 * @author John Berkley
 * CPP Class: <Insert Class Here>
 * Date Created: Oct 01, 2018
 */
import java.util.concurrent.atomic.AtomicInteger;



class AtomicCounter {

    private AtomicInteger c = new AtomicInteger(0);



    public void increment() {

        c.incrementAndGet();

    }



    public void decrement() {

        c.decrementAndGet();

    }



    public int value() {

        return c.get();

    }



}

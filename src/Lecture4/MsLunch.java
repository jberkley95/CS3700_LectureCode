package Lecture4;

/**
 * @author John Berkley
 * CPP Class: <Insert Class Here>
 * Date Created: Oct 01, 2018
 */
public class MsLunch {

    private long c1 = 0;

    private long c2 = 0;

    private Object lock1 = new Object();

    private Object lock2 = new Object();



    public void inc1() {

        synchronized(lock1) {

            c1++;

        }

    }



    public void inc2() {

        synchronized(lock2) {

            c2++;

        }

    }

}

package com.java.exercise.test;

/**
 * Write 3 thread ways of incrementing an integer.
 * Thread-Safe Example in Java
 * There are multiple ways to make this code thread safe in Java:
 *
 *  1) Use synchronized keyword in Java and lock the getCount() method so that only one thread can execute it at a time which removes possibility of coinciding or interleaving.
 *
 *  2) use Atomic Integer, which makes this ++ operation atomic and since atomic operations are thread-safe and saves cost of external synchronization.
 *
 * 
 * @author User 1
 *
 */
public class Counter {

	private int count;
    AtomicInteger atomicCount = new AtomicInteger( 0 );

  
    /*
     * This method thread-safe now because of locking and synchornization
     */
    public synchronized int getCount(){
        return count++;
    }
  
    /*
     * This method is thread-safe because count is incremented atomically
     */
    public int getCountAtomically(){
        return atomicCount.incrementAndGet();
    }
}

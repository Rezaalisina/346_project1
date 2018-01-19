import org.junit.Test;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Hw1Test {

    @org.junit.Test
    public void testNext() {
        Hw1<Integer> actual = new Hw1<Integer>().next();
        Hw1<Integer> expected = null;
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void lastemptylist() {
        //setup
        Hw1<Integer> a = new Hw1<Integer>();
        Hw1<Integer> x;
        //execute
        x = a.last();
        //assert
        assertNull(x.get());
    }

    @org.junit.Test
    public void after() {
        //setup
        Hw1<Integer> b = new Hw1<Integer>();
        Hw1<Integer> y = new Hw1<>();
        b.set(1);
        y.set(3);
        b.setNext(y);
        Integer actual = b.after(1).get();
        Integer expected = 3;
        assertEquals(expected, actual);

    }

    @org.junit.Test
    public void detach() {
        //setup
        Hw1<Integer> c = new Hw1<Integer>();
        Hw1<Integer> d = new Hw1<>();
        c.set(1);
        d.set(2);
        c.setNext(d);
        //execute
        Hw1<Integer> z = c.detach();
        Integer actual = z.get();
        Integer expected = 2;
        //assert
        assertEquals(expected, actual);
    }

    @org.junit.Test
    public void get() {
        Hw1<Integer> d = new Hw1<>();
        d.set(1);
        Integer actualal = d.get();
        Integer expected = 1;
        assertEquals(expected, actualal);
    }

    @Test
    public void set() {
        Hw1<Integer> a = new Hw1<>();
        a.set(5);
        Integer actual = a.get();
        Integer expected = 5;
        assertEquals(expected, actual);
    }

    @Test
    public void setNext() {
        Hw1<Integer> a = new Hw1<>();
        Hw1<Integer> b = new Hw1<>();
        a.set(1);
        b.set(3);
        a.setNext(b);
        Integer actual = a.next().get();
        Integer expected = 3;
        assertEquals(expected, actual);


    }

    @Test
    public void append() {
        Hw1<Integer> a = new Hw1<>();
        Hw1<Integer> b = new Hw1<>();
        a.set(1);
        b.set(3);
        a.append(b);
        Integer actual = a.next().get();
        Integer expected = 3;
        assertEquals(expected, actual);
    }

    @Test
    public void insert() {
        Hw1<Integer> a = new Hw1<>();
        Hw1<Integer> b = new Hw1<>();
        a.set(1);
        b.set(2);
        a.insert(b);
        Integer actual = b.next().get();
        Integer expected = 1;
        assertEquals(expected, actual);

    }
}
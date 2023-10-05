import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class AviaSoulsTest {
    AviaSouls actual = new AviaSouls();


    Ticket t1 = new Ticket("Russia", "USA", 100000, 12, 20);
    Ticket t2 = new Ticket("Russia", "USA", 100, 10, 21);
    Ticket t3 = new Ticket("Russia", "Italy", 1000, 2, 11);
    Ticket t4 = new Ticket("Russia", "Egypt", 10000, 16, 22);
    Ticket t5 = new Ticket("Russia", "USA", 200, 12, 19);
    Ticket t6 = new Ticket("Russia", "USA", 10, 11, 11);

    @BeforeEach
    public void fill() {
        actual.add(t1);
        actual.add(t2);
        actual.add(t3);
        actual.add(t4);
        actual.add(t5);
        actual.add(t6);

//        expected.add(t2);
//        expected.add(t3);
//        expected.add(t4);
//        expected.add(t1);
    }

    @Test
    public void checkCompare() {
        int act = t1.compareTo(t2);
        int exp = 1;
        Assertions.assertEquals(act, exp);
    }

    @Test
    public void checkSort() {
        AviaSouls expected = new AviaSouls();
//        actual.search("Russia", "USA");
        expected.add(t6);
        expected.add(t2);
        expected.add(t5);
        expected.add(t1);
        Assertions.assertArrayEquals(expected.findAll(), actual.search("Russia", "USA"));
    }

    @Test
    public void checkOfTimeSort() {
        TicketTimeComparator comp = new TicketTimeComparator();
        AviaSouls expected = new AviaSouls();
        expected.add(t6);
        expected.add(t5);
        expected.add(t1);
        expected.add(t2);
        Assertions.assertArrayEquals(expected.findAll(), actual.searchAndSortBy("Russia", "USA", comp));

    }
}

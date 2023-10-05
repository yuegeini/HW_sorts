import java.util.Comparator;

public class TicketTimeComparator implements Comparator<Ticket> {

    @Override
    public int compare(Ticket t1, Ticket t2) {
        int t1Time = t1.getTimeTo() - t1.getTimeFrom();
        int t2Time = t2.getTimeTo() - t2.getTimeFrom();
        if (t1Time > t2Time) {
            return 1;
        } else if (t1Time < t2Time) {
            return -1;
        }
        return 0;
    }
}
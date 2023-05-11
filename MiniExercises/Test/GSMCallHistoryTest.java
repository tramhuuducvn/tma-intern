package MiniExercises.Test;

import MiniExercises.models.Call;
import MiniExercises.models.GSM;
import java.sql.Date;
import java.sql.Time;

public class GSMCallHistoryTest {
    public static void test() {
        GSM gsm = new GSM("IPhone 8", "Apple", 5000000, "thduc", null, null);
        gsm.addCall(new Call(new Date(2023, 4, 11), new Time(10, 11, 0), "113", 380));
        gsm.addCall(new Call(new Date(2023, 4, 11), new Time(12, 11, 0), "115", 150));
        gsm.addCall(new Call(new Date(2023, 4, 11), new Time(13, 11, 0), "911", 120));
        gsm.addCall(new Call(new Date(2023, 4, 11), new Time(15, 11, 0), "114", 210));
        gsm.addCall(new Call(new Date(2023, 4, 11), new Time(15, 30, 0), "113", 280));

        System.out.println("\nTotal call history: " + gsm.getCallHistory());
        System.out.println("\nTotal price call history: " + gsm.calculateTotalPrice(0.37));
        // Delete longest call
        Call longestCall = gsm.getCallHistory().stream().max((a, b) -> a.getDuration() - b.getDuration()).get();
        gsm.deleteCall(longestCall);
        System.out.println("\nTotal price call history: " + gsm.calculateTotalPrice(0.37));
        gsm.clearCallHistory();
        System.out.println("\nTotal call history: " + gsm.getCallHistory());

    }
}

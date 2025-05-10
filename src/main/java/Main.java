import pitstop.Pitstop;

public class Main {
    public static void main(String[] args) {

        Pitstop testPitstop = new Pitstop(
             9515,
             1235,
            java.time.OffsetDateTime.of(2024, 5, 19, 23, 0, 0, 0, java.time.ZoneOffset.UTC),
             23,
            30.0, 8
        );

        testPitstop.toString();
    }
}

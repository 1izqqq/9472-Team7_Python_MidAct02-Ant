package kata.conditions;

public class GoodVsEvil {
    public static String battle(String goodAmounts, String evilAmounts) {
        int[] goodWorth = {1, 2, 3, 3, 4, 10};
        int[] evilWorth = {1, 2, 2, 2, 3, 5, 10};

        String[] goodCounts = goodAmounts.split(" ");
        String[] evilCounts = evilAmounts.split(" ");

        int goodTotal = 0;
        for (int i = 0; i < goodCounts.length; i++) {
            goodTotal += Integer.parseInt(goodCounts[i]) * goodWorth[i];
        }

        int evilTotal = 0;
        for (int i = 0; i < evilCounts.length; i++) {
            evilTotal += Integer.parseInt(evilCounts[i]) * evilWorth[i];
        }

        if (goodTotal > evilTotal) {
            return "Battle Result: Good triumphs over Evil";
        } else if (evilTotal > goodTotal) {
            return "Battle Result: Evil eradicates all trace of Good";
        } else {
            return "Battle Result: No victor on this battle field";
        }
    }
}

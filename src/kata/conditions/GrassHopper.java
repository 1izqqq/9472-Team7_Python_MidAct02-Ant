package kata.conditions;

public class GrassHopper {
    public static char getGrade(int s1, int s2, int s3) {

        int average = (s1 + s2 + s3) / 3;

        return (average >= 90) ? 'A' :
                (average >= 80) ? 'B' :
                        (average >= 70) ? 'C' :
                                (average >= 60) ? 'D' : 'F';
    }
}

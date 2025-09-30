//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        boolean[][] schedule = new boolean[8][60];
        AppointmentBook a = new AppointmentBook(schedule);
        //test cases 1

        for (int i = 10; i < 15; i++) schedule[1][i] = true;
        for (int i = 30; i < 45; i++) schedule[1][i] = true;
        for (int i = 50; i < 60; i++) schedule[1][i] = true;

        AppointmentBook b = new AppointmentBook(schedule);

        //test cases 2
        for (int i = 25; i < 30; i++) schedule[1][i] = true;
        for (int i = 0; i < 15; i++) schedule[2][i] = true;
        for (int i = 41; i < 60; i++) schedule[2][i] = true;
        for (int i = 5; i < 30; i++) schedule[3][i] = true;
        for (int i = 44; i < 60; i++) schedule[3][i] = true;

        //check if table is initialized right
        for (int i = 2; i < 5; i++) {
            System.out.println("Period: " + i);
            b.printPeriod(i);
        }



    }
}

public class Race extends Thread {

    static boolean raceOver = false;

    Race(String name) {
        super(name);
    }

    public void run() {

        for (int i = 1; i <= 100; i++) {

            if (raceOver) {
                break;
            }

            System.out.println(getName() + " covered " + i + " meters");

            if (getName().equals("Hare") && i == 50) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                }
            }

            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
            }

            if (i == 100 && !raceOver) {
                raceOver = true;
                System.out.println();
                System.out.println(getName() + " wins the race!");
            }
        }
    }
}
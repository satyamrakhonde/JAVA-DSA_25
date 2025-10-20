package Concurrency;

class OddEvenPrinter {
    private boolean isOdd = true; // Odd thread runs first

    // Prints odd numbers
    public synchronized void printOdd(int number) {
        while (!isOdd) { // If it's not odd's turn, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Odd Thread : " + number);
        isOdd = false; // Switch to even's turn
        notify(); // Wake up the even thread
    }

    // Prints even numbers
    public synchronized void printEven(int number) {
        while (isOdd) { // If it's not even's turn, wait
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Even Thread: " + number);
        isOdd = true; // Switch to odd's turn
        notify(); // Wake up the odd thread
    }
}

class OddEvenMain {
    public static void main(String[] args) {
        OddEvenPrinter printer = new OddEvenPrinter();

        // Odd thread
        Thread oddThread = new Thread(() -> {
            for (int i = 1; i <= 9; i += 2) {
                printer.printOdd(i);
            }
        });

        // Even thread
        Thread evenThread = new Thread(() -> {
            for (int i = 2; i <= 10; i += 2) {
                printer.printEven(i);
            }
        });

        oddThread.start();
        evenThread.start();
    }
}

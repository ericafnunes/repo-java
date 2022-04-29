package com.letscode.Print;

public class PrintService {
    private static final int NUM_TASKS = 10;

    public static void main(String[] args) {
        for (int i = 1; i <= NUM_TASKS; i++) {
            PrintTask task = new PrintTask(i);
            task.print();
        }
    }
}

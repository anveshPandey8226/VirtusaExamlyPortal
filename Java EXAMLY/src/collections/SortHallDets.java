package collections;

import java.util.*;

public class SortHallDets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of halls: ");
        int numHalls = scanner.nextInt();

        List<Hall> halls = new ArrayList<>();
        for (int i = 0; i < numHalls; i++) {
            System.out.print("Enter the name of hall " + (i+1) + ": ");
            String name = scanner.next();

            System.out.print("Enter the capacity of hall " + (i+1) + ": ");
            int capacity = scanner.nextInt();

            halls.add(new Hall(name, capacity));
        }

        Collections.sort(halls);

        System.out.println("Hall details sorted by capacity:");
        for (Hall hall : halls) {
            System.out.println(hall.getName() + " (Capacity: " + hall.getCapacity() + ")");
        }
    }

    static class Hall implements Comparable<Hall> {
        private final String name;
        private final int capacity;

        public Hall(String name, int capacity) {
            this.name = name;
            this.capacity = capacity;
        }

        public String getName() {
            return name;
        }

        public int getCapacity() {
            return capacity;
        }

        @Override
        public int compareTo(Hall other) {
            return Integer.compare(this.capacity, other.capacity);
        }
    }
}

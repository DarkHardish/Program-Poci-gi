import java.time.LocalTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    static class Train {
        String destination;
        int trainNumber;
        LocalTime departureTime;

        public Train(String destination, int trainNumber, int departureTime) {
            this.destination = destination;
            this.trainNumber = trainNumber;
            this.departureTime = departureTime;
        }
    }
    public static void main(String[] args) {

        public static void main(String[] args) {
            // Create an array of five trains
            Train[] trains = new Train[5];
            trains[0] = new Train("New York", 123, LocalTime.of(8, 0));
            trains[1] = new Train("Chicago", 456, LocalTime.of(9, 30));
            trains[2] = new Train("San Francisco", 789, LocalTime.of(11, 0));
            trains[3] = new Train("Boston", 321, LocalTime.of(10, 0));
            trains[4] = new Train("Los Angeles", 159, LocalTime.of(12, 0));

            // Sort the array by train number
            Arrays.sort(trains, new Comparator<Train>() {
                @Override
                public int compare(Train t1, Train t2) {
                    return t1.trainNumber - t2.trainNumber;
                }
            });

            // Display the sorted array
            for (Train t : trains) {
                System.out.println("Train number: " + t.trainNumber + ", Destination: " + t.destination + ", Departure time: " + t.departureTime);
            }

            // Read a train number from the user
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter a train number: ");
            int trainNumber = scanner.nextInt();

            // Search for the train with the given number and display its information
            for (Train t : trains) {
                if (t.trainNumber == trainNumber) {
                    System.out.println("Train number: " + t.trainNumber + ", Destination: " + t.destination + ", Departure time: " + t.departureTime);
                    break;
                }
            }

            // Sort the array by destination, and then by departure time for trains with the same destination
            Arrays.sort(trains, new Comparator<Train>() {
                @Override
                public int compare(Train t1, Train t2) {
                    if (t1.destination.equals(t2.destination)) {
                        return t1.departureTime - t2.departureTime;
                    } else {
                        return t1.destination.compareTo(t2.destination);
                    }
                }
            });

            // Display the sorted array
            for (Train t : trains) {
                System.out.println("Train number: " + t.trainNumber + ", Destination: " + t.destination + ", Departure time: " + t.departureTime);
            }
        }


    }
}
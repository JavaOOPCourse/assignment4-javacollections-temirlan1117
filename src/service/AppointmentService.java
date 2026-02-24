package service;

import java.util.LinkedList;
import java.util.Iterator;

public class AppointmentService {

    private LinkedList<String> appointments = new LinkedList<>();

    public void initializeAppointments() {
        // TODO: Add 3 normal appointments
        appointments.add(" JAVA - 10:00");
        appointments.add("JAVA  - 11:30");
        appointments.add("WEB  - 14:00");
        // TODO: Add 1 urgent appointment at the beginning
        appointments.addFirst("URGENT: exam - 09:00");
    }

    public void cancelLast() {
        // TODO: Remove last appointment
        if (appointments.size() == 0) {
            System.out.println("no appointments to cancel.");
            return;
        }

        String removed = appointments.removeLast();
        System.out.println("cancelled last appointment: " + removed);
    }

    public void showFirstAndLastAppointment() {
        // TODO: Print first and last appointment
        if (appointments.size() == 0) {
            System.out.println("no appointments.");
            return;
        }

        System.out.println("first appointment: " + appointments.getFirst());
        System.out.println("last appointment: " + appointments.getLast());
    }

    public void printAppointments() {
        // TODO: Traverse using Iterator
        System.out.println("=== appointments ===");

        if (appointments.size() == 0) {
            System.out.println("no appointments.");
            return;
        }

        Iterator<String> it = appointments.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

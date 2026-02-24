import service.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        StudentService studentService = new StudentService();
        AppointmentService appointmentService = new AppointmentService();
        IssueService issueService = new IssueService();
        ActionHistoryService actionService = new ActionHistoryService();

        Scanner scanner = new Scanner(System.in);
        int choice;
        studentService.initializeStudents();
        studentService.removeLowGPA();
        studentService.insertAtIndex();

        appointmentService.initializeAppointments();
        appointmentService.cancelLast();

        issueService.initializeIssues();
        issueService.resolveIssues();

        actionService.initializeActions();
        actionService.undoLastAction();
        actionService.addRequestedTranscript();

        do {
            System.out.println("===== 🎓 Smart University Service System =====");
            System.out.println("1. Show Students");
            System.out.println("2. Show Appointments");
            System.out.println("3. Show Emergency Issues");
            System.out.println("4. Show Action History");
            System.out.println("5. Add New Issue");
            System.out.println("6. Undo Action");
            System.out.println("7. Exit");
            System.out.print("Choose option: ");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // TODO
                    studentService.findHighestGPA();
                    studentService.printStudents();
                    break;
                case 2:
                    // TODO
                    appointmentService.showFirstAndLastAppointment();
                    appointmentService.printAppointments();
                    break;
                case 3:
                    // TODO
                    issueService.showMostUrgent();
                    issueService.printRemainingIssues();
                    break;
                case 4:
                    // TODO
                    actionService.showFirstAndLastActon();
                    actionService.printHistory();
                    break;
                case 5:
                    // TODO
                    scanner.nextLine(); // consume Enter
                    System.out.print("enter issue description: ");
                    String description = scanner.nextLine();

                    System.out.print("enter urgency level (1 = most urgent): ");
                    int urgencyLevel = scanner.nextInt();

                    issueService.addNewIssue(description, urgencyLevel);
                    break;
                case 6:
                    // TODO
                    actionService.undoLastAction();
                    break;
                case 7:
                    System.out.println("exiting");
                    break;
                default:
                    System.out.println("invalid option");
            }

        } while (choice != 7);

        scanner.close();
    }
}

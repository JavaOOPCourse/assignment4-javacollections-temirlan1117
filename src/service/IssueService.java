package service;

import model.Issue;
import java.util.PriorityQueue;
import java.util.Iterator;

public class IssueService {

    private PriorityQueue<Issue> issues = new PriorityQueue<>();

    public void initializeIssues() {
        // TODO: Add at least 5 issues
        issues.add(new Issue("exam registration error", 1));
        issues.add(new Issue("portal password reset issue", 3));
        issues.add(new Issue("incorrect GPA in system", 2));
        issues.add(new Issue("scholarship payment delay", 4));
        issues.add(new Issue("graduation clearance blocked", 2));
    }

    public void showMostUrgent() {
        // TODO: Show most urgent issue
        if (issues.size() == 0) {
            System.out.println("no urgent issues.");
            return;
        }

        System.out.println("most urgent issue:");
        System.out.println(issues.peek());
    }

    public void resolveIssues() {
        // TODO: Remove 2 issues
        int count = 0;

        while (count < 2 && issues.size() > 0) {
            Issue removed = issues.poll();
            System.out.println("resolved issue: " + removed);
            count++;
        }

        if (count == 0) {
            System.out.println("no issues to resolve.");
        }
    }

    public void printRemainingIssues() {
        // TODO: Print using iterator
        System.out.println("=== remaining issues ===");

        if (issues.size() == 0) {
            System.out.println("no issues.");
            return;
        }

        Iterator<Issue> it = issues.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void addNewIssue(String description, int urgencyLevel) {
        // TODO: Add new issue
        issues.add(new Issue(description, urgencyLevel));
        System.out.println("new issue added.");
    }
}

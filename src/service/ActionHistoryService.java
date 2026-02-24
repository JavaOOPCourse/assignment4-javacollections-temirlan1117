package service;

import java.util.ArrayDeque;
import java.util.Iterator;

public class ActionHistoryService {

    private ArrayDeque<String> actions = new ArrayDeque<>();

    public void initializeActions() {
        // TODO: Add 4 actions
        actions.add("submitted Assignment");
        actions.add("dropped Course");
        actions.add("registered Course");
        actions.add("updated Profile");
    }

    public void undoLastAction() {
        // TODO: Remove last action
        if (actions.size() == 0) {
            System.out.println("No actions to undo.");
            return;
        }

        String removed = actions.removeLast();
        System.out.println("Undone action: " + removed);
    }

    public void addRequestedTranscript() {
        // TODO: Add "Requested Transcript"
        actions.add("requested Transcript");
        System.out.println("added action: requested transcript");
    }

    public void showFirstAndLastActon() {
        // TODO: Print first and last action
        if (actions.size() == 0) {
            System.out.println("no actions.");
            return;
        }

        System.out.println("first action: " + actions.getFirst());
        System.out.println("last action: " + actions.getLast());
    }

    public void printHistory() {
        // TODO: Iterate through history
        System.out.println("=== action history ===");

        if (actions.size() == 0) {
            System.out.println("no actions.");
            return;
        }

        Iterator<String> it = actions.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

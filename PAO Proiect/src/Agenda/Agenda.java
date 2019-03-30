package Agenda;

public class Agenda {
    private static final Agenda agenda = new Agenda();
    private Agenda() {

    }
    Event Adauga() {
        Event nou;
        System.out.println("Tipul de date de adaugat:");
        String s = System.console().readLine();
        switch (s) {
            case "Job":
                nou = new Job();
                break;
            case "Task":
                nou = new Task();
                break;
            case "Holyday":
                nou = new Holyday();
                break;
            case "Meeting":
                nou = new Meeting();
                break;
            default:
                nou = new Event();
        }
        System.out.println("Dati locatia de activitate:");
        nou.setPlace(System.console().readLine());
        System.out.println("Dati titlul activitatii:");
        nou.setTitle(System.console().readLine());
        return nou;
    }

}



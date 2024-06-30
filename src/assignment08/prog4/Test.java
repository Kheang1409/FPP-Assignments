package assignment08.prog4;

public class Test {
    public static void main (String[] args){
        TicketingSystem ticketingSystem = new TicketingSystem();
        ticketingSystem.addTicket("Anxiety");
        ticketingSystem.addTicket("Depressed");
        ticketingSystem.addTicket("PTSD");
        ticketingSystem.addTicket("DID");
        System.out.println(ticketingSystem);
        System.out.println(STR."View Next Ticket: \{ticketingSystem.viewNextTicket()}");
        System.out.println(STR."Process Ticket: \{ticketingSystem.processTicket()}");
        System.out.println(STR."After Of Process Ticket: \{ticketingSystem}");
        System.out.println(STR."Process Ticket: \{ticketingSystem.processTicket()}");
        System.out.println(STR."Process Ticket: \{ticketingSystem.processTicket()}");
        System.out.println(STR."Process Ticket: \{ticketingSystem.processTicket()}");
        System.out.println(ticketingSystem);
    }
}

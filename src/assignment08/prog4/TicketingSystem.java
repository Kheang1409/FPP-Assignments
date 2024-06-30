package assignment08.prog4;

public class TicketingSystem {
    static int autoIncreamentId = 1;
    Ticket header;
    TicketingSystem(){
        header = new Ticket();
    }
    class Ticket{
        int ticketId;
        String description;
        Ticket next;
        public Ticket(){

        }
        public Ticket(String description) {
            this.ticketId = autoIncreamentId++;
            this.description = description;
        }
        @Override
        public String toString(){
            return STR."ID:\{ticketId} Description: \{description}";
        }
    }

    public void addTicket(String description){
        Ticket ticket = new Ticket(description);
        if(isEmpty()){
            header.next = ticket;
        }
        else{
            Ticket current = header.next;
            while(current.next != null){
                current = current.next;
            }
            current.next = ticket;
        }
    }

    public Ticket processTicket(){
        Ticket popTicket;
        if(isEmpty())
            return null;
        else{
            popTicket = header.next;
            header.next = header.next.next != null ? header.next.next : null;
        }
        return popTicket;
    }
    public Ticket viewNextTicket(){
        if(isEmpty())
            return null;
        return header.next;
    }

    public boolean isEmpty(){
        return header.next == null;
    }

    @Override
    public String toString(){
        if(isEmpty()) return "Empty Queue!";
        StringBuilder sb = new StringBuilder();
        Ticket currentTicket = header.next;
        while(currentTicket != null){
            sb.append(STR."[\{currentTicket}]");
            if(currentTicket.next!= null)
                sb.append("->");
            currentTicket = currentTicket.next;
        }
        return sb.toString();
    }
}

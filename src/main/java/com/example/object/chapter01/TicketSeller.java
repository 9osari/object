package main.java.com.example.object.chapter01;

//판매원
public class TicketSeller {
    private TicketOffice ticketOffice;  //자신이 일하는 매표소를 알고있어야함.

    public TicketSeller(TicketOffice ticketOffice) {
        this.ticketOffice = ticketOffice;
    }

    public TicketOffice getTicketOffice() {
        return ticketOffice;
    }
}

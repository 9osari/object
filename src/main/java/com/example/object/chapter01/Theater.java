package main.java.com.example.object.chapter01;

//소극장
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    //관람객 맞이
    public void enter(Audience audience) {
        ticketSeller.sellTo(audience);
    }
}

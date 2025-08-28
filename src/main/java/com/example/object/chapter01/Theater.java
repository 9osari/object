package main.java.com.example.object.chapter01;

//소극장
public class Theater {
    private TicketSeller ticketSeller;

    public Theater(TicketSeller ticketSeller) {
        this.ticketSeller = ticketSeller;
    }

    //관람객 맞이
    public void enter(Audience audience) {
        if(audience.getBag().hasInvitation()) {     //관람객 가방의 초대장 확인
            //초대장이 있다면
            Ticket ticket = ticketSeller.getTicketOffice().getTicket(); //판매원에게 받은 티켓
            audience.getBag().setTicket(ticket);    //관람객 가방안에 넣어줌
        } else {    //초대장이 없다면
            Ticket ticket = ticketSeller.getTicketOffice().getTicket(); //티켓을 판매
            audience.getBag().minusAmount(ticket.getFee()); //가방에서 티켓값을 뺀다.
            ticketSeller.getTicketOffice().plusAmount(ticket.getFee()); //매표소의 금액 증가
            audience.getBag().setTicket(ticket);    //관람객 가방안에 넣어줌
        }
    }
}

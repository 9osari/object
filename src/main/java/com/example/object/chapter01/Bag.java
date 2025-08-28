package main.java.com.example.object.chapter01;

//가방
public class Bag {
    private Long amount;    //현금
    private Invitation invitation;  //초대장
    private Ticket ticket;  //티켓

    public Long hold(Ticket ticket) {
        if(hasInvitation()) {
            setTicket(ticket);
            return 0L;
        } else {
            setTicket(ticket);
            minusAmount(ticket.getFee());
            return ticket.getFee();
        }
    }

    public Bag(Invitation invitation, Long amount) {
        this.invitation = invitation;
        this.amount = amount;
    }

    //초대장의 보유여부
    private boolean hasInvitation() {
        return invitation != null;
    }


    //초대장을 티켓으로 교환
    private void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }


    //현금 감소
    private void minusAmount(Long amount) {
        this.amount -= amount;
    }
}

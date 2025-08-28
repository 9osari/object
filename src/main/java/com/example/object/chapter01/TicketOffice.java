package main.java.com.example.object.chapter01;

import java.util.ArrayList;
import java.util.List;

//티켓 판매점
public class TicketOffice {
    private Long amount;
    private List<Ticket> tickets = new ArrayList<>();

    public TicketOffice(Long amount, Ticket... tickets) {   //티켓 여러장을 가변 인자로 받음
        this.amount = amount;
        this.tickets.addAll(List.of(tickets));  //티켓[] 배열을 불변 리스트로 감쌈
    }

    public Ticket getTicket() {
        return tickets.remove(0);
    }

    public void minusAmount(Long amount) {
        this.amount -= amount;
    }

    public void plusAmount(Long amount) {
        this.amount += amount;
    }
}

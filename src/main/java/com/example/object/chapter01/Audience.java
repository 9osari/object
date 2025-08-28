package main.java.com.example.object.chapter01;

public class Audience { //관람객
    private Bag bag;    //관람객은 가방 소지 가능

    public Audience(Bag bag) {
        this.bag = bag;
    }

    public Long buy(Ticket ticket) {
        return bag.hold(ticket);
    }
}

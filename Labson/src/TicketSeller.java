import java.util.List;

public class TicketSeller {

    List<Ticket> tickets;
    private double incomes;

    public TicketSeller(List<Ticket> _tickets){
        tickets = _tickets;
    }

    public void Sell(Ticket ticket){
        incomes += ticket.computePrice();
        tickets.remove(ticket);
    }

    public double getIncomes(){
        return incomes;
    }
    
}

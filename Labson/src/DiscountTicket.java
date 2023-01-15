public class DiscountTicket extends StandartTicket{

    double discount;

    public DiscountTicket(int _seatNumber, int _number, double _discount){
        super(_seatNumber, _number);
        discount = _discount;
    }

    public void print(){
        System.out.println("SeatNumber: " + seatNumber + "  Number: " + number + "  Discount: " + discount);
    }

    public double computePrice(){
        return super.computePrice() - price*discount;
    }
    
}

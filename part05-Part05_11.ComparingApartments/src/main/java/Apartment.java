
public class Apartment {

    private int rooms;
    private int squares;
    private int princePerSquare;

    public Apartment(int rooms, int squares, int pricePerSquare) {
        this.rooms = rooms;
        this.squares = squares;
        this.princePerSquare = pricePerSquare;
    }
    public boolean largerThan(Apartment compared){
        if (this.squares > compared.squares){
            return true;
        }
        return false;

    }

    public int priceDifference(Apartment compared){
        //return (compared.princePerSquare * compared.squares) - (princePerSquare * squares);
        if ((compared.princePerSquare * compared.squares) > (princePerSquare * squares)){
            return (compared.princePerSquare * compared.squares) - (princePerSquare * squares);
        }
        return (princePerSquare * squares) - (compared.princePerSquare * compared.squares);

    }
    public boolean moreExpensiveThan(Apartment compared){
        if ((princePerSquare * squares) > (compared.princePerSquare * compared.squares)){
            return true;
        }
        return false;
    }

}

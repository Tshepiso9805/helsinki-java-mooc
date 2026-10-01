
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {

        if (cents > 99) {
            euros = euros + cents / 100;
            cents = cents % 100;
        }

        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        int newEuros = this.euros + addition.euros;
        int newCents = this.cents + addition.cents;

        if (newCents >= 100) {
            newEuros++;
            newCents -= 100;
        }

        return new Money(newEuros, newCents);
    }
    public Money minus(Money decreaser){
        int newM = this.euros - decreaser.euros;
        int newMc = this.cents - decreaser.cents;

        if (newMc < 0) {
            newM--;
            newMc += 100;
        }

        if (newM < 0) {
            newM = 0;
            newMc = 0;
        }

        return new Money(newM, newMc);
    }
    public boolean lessThan(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        }

        if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        }

        return false;
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}

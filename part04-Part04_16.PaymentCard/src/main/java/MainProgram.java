
public class MainProgram {

    public static void main(String[] args) {
        // Scanner scanner = new Scanner(System.in);
//last part
        PaymentCard Paul = new PaymentCard(20);
        PaymentCard Matt = new PaymentCard(30);

        Paul.eatHeartily();
        Matt.eatAffordably();

        System.out.println("Paul: "+ Paul );
        System.out.println("Matt: "+ Matt);

        Paul.addMoney(20);
        Matt.eatHeartily();

        System.out.println("Paul: "+ Paul );
        System.out.println("Matt: "+ Matt);

        Paul.eatAffordably();
        Paul.eatAffordably();

        Matt.addMoney(50);
        System.out.println("Paul: "+ Paul );
        System.out.println("Matt: "+ Matt);

        //PaymentCard card = new PaymentCard(10);
        //System.out.println(card);
//part 5
        //System.out.println("Paul: " + card);
        //card.addMoney(-15);
        //System.out.println("Paul: " + card);
//part4
        //card.addMoney(15);
        //System.out.println(card);

        //card.addMoney(10);
        //System.out.println(card);

        //card.addMoney(200);
        //System.out.println(card);
//part3
        //card.eatHeartily();
        //System.out.println(card);

        //card.eatHeartily();
        //System.out.println(card);
//Part2
        //card.eatAffordably();
        //System.out.println(card);

        //card.eatHeartily();
        //card.eatAffordably();
        //System.out.println(card);
        
        // Here you can write code to test that PaymentCard works as intended
        // be sure to erase the extra code for the last part of the exercise!

    }
}

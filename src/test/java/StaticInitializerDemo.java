import java.util.ArrayList;
import java.util.List;

/**
 *
 * Created with IntelliJ IDEA.
 * test case from http://javarevisited.blogspot.com/2014/06/exception-in-thread-main-java-lang-exceptionininitializerError-fix.html#ixzz34Do8PUMQ
 *
 *
 * Java Program to understand and solve ExceptionInitializerError, which comes
 * When static initializer blocks throws unchecked exception during class loading
 * and initialization.
 *
 * User: aseara
 * Date: 2014/6/13
 * Time: 9:43
 */
public class StaticInitializerDemo {

    private static final List<CreditCard> cards = new ArrayList<>();
    private static CreditCard preferredCard = cards.get(0);
    public static boolean isVisa = "VISA".equalsIgnoreCase(preferredCard.getNetwork());


    public static void main(String[] args) {
        makePayment(preferredCard);
    }

    public static void makePayment(CreditCard cc) {
        if (isVisa) {
            System.out.println("is Visa");
        } else {
            System.out.println("not a Visa");
        }
    }
}


class CreditCard {

    private long card_number; // 16 digit card number
    private int cvv;          // 3 digit number
    private int expiryMonth;
    private int expiryYear;
    private String bank;
    private String network;

    public CreditCard(long card_number, int cvv, int expiryMonth, int expiryYear, String bank, String network) {
        this.card_number = card_number;
        this.cvv = cvv;
        this.expiryMonth = expiryMonth;
        this.expiryYear = expiryYear;
        this.bank = bank;
        this.network = network;
    }

    public long getCard_number() {
        return card_number;
    }

    public int getCvv() {
        return cvv;
    }

    public int getExpiryMonth() {
        return expiryMonth;
    }

    public int getExpiryYear() {
        return expiryYear;
    }

    public String getBank() {
        return bank;
    }

    public String getNetwork() {
        return network;
    }
}
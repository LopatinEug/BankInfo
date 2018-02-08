package entity;




import javax.persistence.*;

/**
 * Created by Евгений on 28.10.2017.
 */
@Entity
@Table(name ="deposits")
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "NAME")
    private String name;

    @Column (name = "PAYMENT_PERCENT")
    private String payment;

    @Column (name = "TERM")
    private int term;

    @Column (name = "CLOSE")
    private Boolean earlyClose;

    @Column (name = "REFILL")
    private Boolean refill;


    public boolean isEarlyClose() {
        return earlyClose;
    }

    public void setEarlyClose(boolean earlyClose) {
        this.earlyClose = earlyClose;
    }

    public boolean isRefill() {
        return refill;
    }

    public void setRefill(boolean refill) {
        this.refill = refill;
    }

    @Column (name = "PERCENT")
    private double percent;

    @Column (name = "MINIMUM_AMOUNT")
    private double minAmount;

    @Column (name = "CURRENCY")
    private String currency;

    @ManyToOne
    @JoinColumn(name="bank_id", nullable=false)
    private Bank bank;

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }

    public Deposit(String name, int id, String currency, double percent,int term) {
        this.name = name;
        this.id = id;
        this.currency = currency;
        this.percent = percent;
        this.term=term;
    }

    public Boolean getEarlyClose() {
        return earlyClose;
    }

    public Boolean getRefill() {
        return refill;
    }

    public Deposit(String name, int id, String currency, double percent, int term, String payment, Boolean earlyClose, Boolean refill) {
        this.name = name;
        this.id = id;
        this.currency = currency;
        this.percent = percent;
        this.term=term;
        this.payment=payment;
        this.earlyClose=earlyClose;
        this.refill =refill;
    }

    public Deposit() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public int getTerm() {
        return term;
    }

    public void setTerm(int minTerm) {
        this.term = minTerm;
    }


    public double getPercent() {
        return percent;
    }

    public void setPercent(double percent) {
        this.percent = percent;
    }

    public double getMinAmount() {
        return minAmount;
    }

    public void setMinAmount(double minAmount) {
        this.minAmount = minAmount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}

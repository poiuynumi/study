import java.util.ArrayList;
import java.util.List;

public class Account {
  
  private List<Transaction> transaction;
  private String accountno;
  private String name;
  private int balance;
   
 public Account() {
    transaction = new ArrayList<>();
    this.accountno = accountno;
    this.name = name;
    this.balance = 0;      
    }
 
 public void addtransaction() {
   transaction.add(new Transaction());
 }
  }
 

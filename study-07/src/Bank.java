import java.util.ArrayList;
import java.util.List;

public class Bank {
  
  private List<Account> account;
  private int accIdx;

  public Bank() {
    this.account = new ArrayList<>();
    this.accIdx = account.size();
  }
  
  public void addaccount() {
    account.add(new Account());
  }
}

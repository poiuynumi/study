public class Buyer {

  int money;
  int point;
  final int number = 10;
  int index=0;

  public Buyer() {

  }

  void Buy(Product product) {

    Product[] cart = new Product[number];
    while(true) {
      cart[index] = product; 
      index ++;
      if (index>number-1)
        System.out.println("카트가 꽉 찼습니다!");
    }

  }
}


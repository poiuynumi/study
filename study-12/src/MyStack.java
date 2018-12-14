
public class MyStack {
  
  
  private Object[] stackArr;
  private int point;
  
  public MyStack(int size) {
    this.stackArr = new Object[size];
    this.point = 0;
  }
  
  public boolean empty() { // 스택이 비었는지 확인
    return( point == 0) ? true : false;
  }
  
  public boolean full() { //스택이 풀인지 확인
    return( point == stackArr.length) ? true : false;
  }
  
  public void push(Object i) {
    //원래 trycatch로 사용자정의 newthrow 던져햐함
    if(!full()); {
    stackArr[point] = i;
    point ++;
    }
  }
  
  public Object pop() {
   
    if(!empty()) {
    Object i = stackArr[--point];  
    stackArr[point] = null;
    return i;
    }else return empty();
     
 }
}
public class AirPlane {

  private int plno;
  private String plname;
  private static int Idx =0;

  public AirPlane(int plno, String plname) {
    this.plno = plno;
    this.plname = plname;
    Idx ++;  
  }
public void planeinf() {
  
  System.out.printf("비행기 이름 : %s", plname);
  System.out.printf("비행기 번호 : %d", plno);
  
}
  
}

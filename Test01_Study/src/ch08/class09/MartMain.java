package ch08.class09;
//메인메서드 클래스
public class MartMain {
 public static void main(String[] args) {
     // Mart 클래스 인스턴스 생성
     Mart mart = new Mart("배", 2500);

     // Customer 클래스 인스턴스 생성
     MartCustomer customer = new MartCustomer("이정원", 6000, mart);

     // 고객 정보 출력
     customer.display();
 }
}

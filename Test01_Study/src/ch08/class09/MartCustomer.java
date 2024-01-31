package ch08.class09;
//Customer 클래스 정의
public class MartCustomer {
 // 멤버변수 선언
 private String custName;
 private int money; // 고객이 낸 돈
 private Mart buyFruit; // 고객이 산 과일, Customer클래스 안에서 Mart클래스 사용하려면 초기화 필요

 // 생성자 정의
 public MartCustomer(String custName, int money, Mart buyFruit) {
     this.custName = custName;
     this.money = money;
     this.buyFruit = buyFruit;
 }

 // 고객정보출력 메소드
 public void display() {
     System.out.println("고객 이름: " + custName);
     System.out.println("보유한 돈: " + money + "원");
     System.out.println("산 과일 정보: " + buyFruit.getFruitName() + ", 가격: " + buyFruit.getFruitPrice() + "원");
 }
}
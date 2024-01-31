package ch08.class09;
//Mart 클래스 정의
public class Mart {
 // 멤버변수 선언
 private String fruitName;
 private int fruitPrice;

 // 생성자 정의
 public Mart(String fruitName, int fruitPrice) {
     // 생성자를 통해 입력받은 값으로 멤버 변수 초기화
     this.fruitName = fruitName;
     this.fruitPrice = fruitPrice;
 }

 // 과일이름을 반환하는 메서드
 public String getFruitName() {
     return fruitName;
 }

 // 과일가격을 반환하는 메서드
 public int getFruitPrice() {
     return fruitPrice;
 }
}
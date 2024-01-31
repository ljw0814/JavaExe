package ch09.resolve07;

public class Math {
    public static void main(String[] args) {
        // Add 클래스 사용 예제
        Add add = new Add();
        add.setValue(5, 3);
        System.out.println("Add Result: " + add.calculate());

        // Sub 클래스 사용 예제
        Sub sub = new Sub();
        sub.setValue(7, 2);
        System.out.println("Sub Result: " + sub.calculate());

        // Mul 클래스 사용 예제
        Mul mul = new Mul();
        mul.setValue(4, 6);
        System.out.println("Mul Result: " + mul.calculate());

        // Div 클래스 사용 예제
        Div div = new Div();
        div.setValue(8, 2);
        System.out.println("Div Result: " + div.calculate());
    }
}
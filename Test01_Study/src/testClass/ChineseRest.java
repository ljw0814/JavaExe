package testClass;

import java.util.Scanner;

public class ChineseRest {
	
    private String[] menuItems;
    private int[] menuPrices;

    public ChineseRest(String[] menuItems, int[] menuPrices) {
        this.menuItems = menuItems;
        this.menuPrices = menuPrices;
    }
    public int orderMenu(String orderFood, int orderQuantity) {
        // 주문 처리 로직을 여기에 구현
        // 해당 음식의 가격과 수량을 곱하여 총 결제 금액을 반환
        // 주문할 음식이 메뉴에 없으면 -1을 반환
    	int foodIndex = -1;

        // 주문할 음식이 메뉴에 있는지 확인
        for (int i = 0; i < menuItems.length; i++) {
            if (menuItems[i].equals(orderFood)) {
                foodIndex = i;
                break;
            }
        }

        if (foodIndex != -1) {
            // 주문한 음식이 메뉴에 있으면 가격과 수량을 곱하여 총 결제 금액을 반환
            return menuPrices[foodIndex] * orderQuantity;
        } else {
            // 주문한 음식이 메뉴에 없으면 -1을 반환
            return -1;
        }
    }
    	
   

    public String[] getMenuItems() {
        return menuItems;
    }

    public int[] getMenuPrices() {
        return menuPrices;
    }
	

    public static void main(String[] args) {
        // 중화요리집 메뉴 가격 초기화
        String[] menuItems = {"짜장면", "짬뽕", "탕수육", "볶음밥"};
        int[] menuPrices = {7500, 8000, 12000, 7000};

        // 중화요리집 객체 생성
        ChineseRest chineseRest = new ChineseRest(menuItems, menuPrices);

        // 주문 및 결제 프로세스 시작
        orderProcess(chineseRest);
    }

    private static void orderProcess(ChineseRest chineseRest) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("==== 중화요리집 메뉴 ====");
        displayMenu(chineseRest);

        System.out.print("주문하실 음식을 선택해주세요: ");
        String orderFood = scanner.nextLine();

        System.out.print("수량을 입력해주세요: ");
        int orderQuantity = scanner.nextInt();

        // 주문 처리
        int totalPayment = chineseRest.orderMenu(orderFood, orderQuantity);

        if (totalPayment != -1) {
            // 주문 및 결제 결과 출력
            System.out.println(orderFood + " " + orderQuantity + "개 주문되었습니다.");
            System.out.println("총 결제금액: " + totalPayment + "원");
        } else {
            System.out.println("주문할 음식이 메뉴에 없습니다.");
        }

        scanner.close();
    }

    private static void displayMenu(ChineseRest chineseRest) {
        String[] menuItems = chineseRest.getMenuItems();
        int[] menuPrices = chineseRest.getMenuPrices();

        for (int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ". " + menuItems[i] + " - " + menuPrices[i] + "원");
        }
    }
}

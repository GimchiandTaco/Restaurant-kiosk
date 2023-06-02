package Restaurant;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
public class Main {

    public static void main(String[] args) {


        List burgers = new ArrayList();

        burgers.add(new Item("DOUBLE-DOUBLE" ,"지금까지 이런 프리미엄 버거는 없다!)", 4.5));
        burgers.add(new Item("CHEESE BURGER" ,"치즈버거의 끝판왕!)", 3.5));
        burgers.add(new Item("VEGGIE BURGER" ,"채식버거인 줄 몰랐다!)", 3.5));

        List fries = new ArrayList();

        fries.add(new Item("ANIMAL STYLE FRIES ","치즈와 구운양파 토핑이 올라간 동물의 왕국같은 맛!",4.5));
        fries.add(new Item("CHEESE FRIES","치즈와 감튀는 진리!",3.5));
        fries.add(new Item("BASIC FRIES","기본이 최고!",3.5));


        List beverages = new ArrayList();

        beverages .add(new Item("COCA-COLA","콜라 한 잔에 버거 10개가능! ",2.0));
        beverages .add(new Item("DR.PEPPER","콜라가 질렸다면 닥터페퍼! ",2.0));
        beverages .add(new Item("LEMONADE","상큼함을 원한다면 레모네이드! ",2.0));

        List orderList = new ArrayList(); //주문을 받기 위한 오더리스트 객체를 생성 (빈내용) 추가한 내용이 저장 됨

        mainMenu(burgers, fries, beverages, orderList); // 메인메뉴 출력 //mainMenu 메서드 호출
    }

    public static void mainMenu(List burgers, List fries, List beverages, List orderList)
            //static 메서드는 따로 객체를 만들 필요가 없다 //메서드선언
    {
        Scanner reader = new Scanner(System.in);
        System.out.println("*****Welcome to In-N-OUT!*****");
        System.out.println("THE BEST FAST FOOD IN THE WORLD!");
        System.out.println();
        System.out.println("아래 메뉴 카테고리중 원하시는 번호를 입력해 주세요.");
        System.out.println("----------------------------------------------");

        Menubar category = new Menubar(); //category 객체 생성
        System.out.println(category.getAllCategory()); //객체 생성하고 객체를 통해 호출해야함
        System.out.println("4 Order ㅣ 장바구니 조회");
        System.out.println("5 Cancelㅣ 주문내역 취소");

        int order = reader.nextInt(); // 입력한 메뉴판 번호를 변수 order에 저장
        Item item = new Item(); //method 호출후 리스트를 넣기 위해 item 객체 생성
        while(true){
            if(order==1) {
                item.output(burgers); //카테고리 메뉴 선택시 output method 호출을 통해 burgers list 갖고옴

                Scanner scanner1 = new Scanner(System.in); // 중첩 if문 이기 때문에 메뉴선택을 위한 scanner 추가
                String input1 = scanner1.nextLine(); // 1번을 선택한 내용을 input1에 저장
                int num1 = Integer.parseInt(input1); // 숫자를 받기 위해 String 형변환

                Item burgerList = (Item) burgers.get(num1 - 1); //배열을 0부터시작하기 떄문에 고객 입력 숫자에 -1을 해줌
                //고객인 선택한 특정 상품을 burgers list 로부터 get 갖고와서 출력
                System.out.println(burgerList.name + "ㅣ" + burgerList.description + "ㅣ" + burgerList.price);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인  2. 취소");

                Scanner scanner2 = new Scanner(System.in); //확인,취소를 누를 수 있는 스캐너 제공
                String input2 = scanner2.nextLine(); // 확인, 취소를 string 으로 받고 숫자로 형변환
                int num2 = Integer.parseInt(input2); //숫자로 받아서 if 문으로 연결 가능

                if (num2 == 1) {
                    orderList.add(burgerList);
                    System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                } else {

                }
                //2번을 누르면 다시 돌아감
                mainMenu(burgers, fries, beverages, orderList); //method 호출

            } else if(order==2){
                item.output(fries); //카테고리 메뉴 선택시 output method 호출을 통해 burgers list 갖고옴

                Scanner scanner1 = new Scanner(System.in); // 중첩 if문 이기 때문에 메뉴선택을 위한 scanner 추가
                String input1 = scanner1.nextLine(); // 1번을 선택한 내용을 input1에 저장
                int num1 = Integer.parseInt(input1); // 숫자를 받기 위해 String 형변환

                Item firesList = (Item) fries.get(num1-1); //배열을 0부터시작하기 떄문에 고객 입력 숫자에 -1을 해줌
                //고객인 선택한 특정 상품을 burgers list 로부터 get 갖고와서 출력
                System.out.println(firesList.name + "ㅣ"+firesList.description+"ㅣ"+firesList.price);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인  2. 취소");

                Scanner scanner2 = new Scanner(System.in); //확인,취소를 누를 수 있는 스캐너 제공
                String input2 = scanner2.nextLine(); // 확인, 취소를 string 으로 받고 숫자로 형변환
                int num2 = Integer.parseInt(input2); //숫자로 받아서 if 문으로 연결 가능

                if(num2==1){
                    orderList.add(firesList);
                    System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                } else {} //2번을 누르면 다시 돌아감
                mainMenu(burgers, fries, beverages, orderList);

            }
            else if(order==3) {
                item.output(beverages); //카테고리 메뉴 선택시 output method 호출을 통해 burgers list 갖고옴

                Scanner scanner1 = new Scanner(System.in); // 중첩 if문 이기 때문에 메뉴선택을 위한 scanner 추가
                String input1 = scanner1.nextLine(); // 1번을 선택한 내용을 input1에 저장
                int num1 = Integer.parseInt(input1); // 숫자를 받기 위해 String 형변환

                Item beveragesList = (Item) beverages.get(num1 - 1); //배열을 0부터시작하기 떄문에 고객 입력 숫자에 -1을 해줌
                //고객인 선택한 특정 상품을 burgers list 로부터 get 갖고와서 출력
                System.out.println(beveragesList.name + "ㅣ" + beveragesList.description + "ㅣ" + beveragesList.price);
                System.out.println("위 메뉴를 장바구니에 추가하시겠습니까?");
                System.out.println("1. 확인  2. 취소");

                Scanner scanner2 = new Scanner(System.in); //확인,취소를 누를 수 있는 스캐너 제공
                String input2 = scanner2.nextLine(); // 확인, 취소를 string 으로 받고 숫자로 형변환
                int num2 = Integer.parseInt(input2); //숫자로 받아서 if 문으로 연결 가능

                if (num2 == 1) {
                    orderList.add(beveragesList);
                    System.out.println("선택하신 메뉴가 장바구니에 추가되었습니다.");
                } else {

                }
                mainMenu(burgers, fries, beverages, orderList);
            } else if(order==4) {
                System.out.println("주문내역을 확인합니다");
                System.out.println("[Order]");
                item.outputOrder(orderList);
                System.out.println("1. 주문  2. 메뉴판");

                Scanner scanner1 = new Scanner(System.in); // 주문,메뉴판 선택 입력
                String input = scanner1.nextLine();
                int order3 = Integer.parseInt(input);
                if (order3 == 1) {
                    System.out.println("주문이 완료되었습니다!");
                    System.out.println("대기번호는[1]번 입니다");
                    System.out.println("(3초 후 메뉴판으로 돌아갑니다.");
                    orderList.clear(); // clear() 메서드를 호출하여 ArrayList 객체의 모든 요소를 체거
                    Order.stop3Second(); //3초후에 돌아가는 인터페이스
                } else {
                    System.out.println("메인 메뉴판으로 돌아갑니다");
                    //while 문 안에서 참이 나오지 않으면 다시 처음 메뉴판으로 돌아가기 떄문에 clear 필요 없음
                }
                mainMenu(burgers, fries, beverages, orderList);
            } else if(order == 5){
                System.out.println("진행하던 주문을 취소하시겠습니까?");
                System.out.println("1. 주문초기화  2. 메인화면으로 돌아가기");
                Scanner scanner3 = new Scanner(System.in);
                String input = scanner3.nextLine();
                int cancel = Integer.parseInt(input);

                if(cancel == 1) {
                    orderList.clear();
                } else {
                    System.out.println("메인 메뉴판으로 돌아갑니다.");
                }
            } else {
                System.out.println("잘못된 입력입니다.");
            }
            mainMenu(burgers, fries, beverages, orderList);
        }
    }
}









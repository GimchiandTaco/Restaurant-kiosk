package Restaurant;

import java.util.List;

public class Item extends Menu {
    double price;

    public Item() {
    }

    public Item(String name, String description, double price) {
        super(name, description);
        this.price = price;

    }

    public void output(List<Item> list) {
        int i = 0;
        for (Item item : list) {
            System.out.println(i + 1 + "." + item.name + "ㅣ" + item.description + "ㅣ" + item.price);
            i++;
        } //향상된 for문 순번 없이 목록만 갖고올 경우 편리함 (연습으로 변형해봄)
    }

    //기본 for 문
//        for (int i = 0; i<list.size();i++){
//           Item detailList =  (Item) list.get(i);
//            System.out.println(i+1+"."+detailList.name+"ㅣ"+detailList.description+"ㅣ"+detailList.price);

    public void outputOrder(List<Item> list) { // Order 선택 시 오더
        double totalPrice = 0.0; //선택을 안하면 0원이 나와야하니깐 초기화 한번 가격값 초기화

        for (Item orderlist : list) {
            System.out.println(orderlist.name + "ㅣ" + orderlist.description + "ㅣ" + orderlist.price);
            totalPrice += orderlist.price;
        }
        System.out.println("[TOTAL]");
        System.out.println("$ " + totalPrice);
    }
}

//            for (int i = 0; i < list.size(); i++) {
//                Item menuList2 = (Item) list.get(i);
//                System.out.println(menuList2.name + " | " + menuList2.description + " | " + menuList2.price);
               // totalPrice += menuList2.price; //가격 합산











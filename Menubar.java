package Restaurant;

import java.util.ArrayList;

public class Menubar {
    private ArrayList<Menu> menuList = new ArrayList<Menu>(); //변수명은 소문자로

    public Menubar(){Category();}

    public String getAllCategory() {
        String aMenu = ""; //문자열을 갖고오기 위해 변수를 초기화
        for (int i = 0; i < menuList.size(); i++) {
            Menu a = menuList.get(i);  //Menu = 책 menuList = 책장
            //add id,name,price
            aMenu += i + 1 + " " + a.name+"ㅣ"+a.description + "\n"; //문자열이 덮어지 않고 더해지도록 aMenu에 이어붙이기
        }
        return aMenu;
        //메서드안에서 출력하는게 아니라 밖에서 출력하기 위해서
    }
    public void Category() {

        menuList.add(new Menu("BURGERS", "지금까지 이런 프리미엄 버거는 없다!"));
        menuList.add(new Menu("FRENCH FRIES", "신선한 오일과 감자를 갓 튀겨낸 천상의 맛! "));
        menuList.add(new Menu("BEVERAGES", "당신의 갈증을 해소시킬 음료와 특별한 쉐이크! "));

    }
}


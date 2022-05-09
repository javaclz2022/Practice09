package com.javaex.ex02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FriendApp {

    public static void main(String[] args) {

        List<Friend> fList = new ArrayList<Friend>();
        Scanner sc = new Scanner(System.in);

        System.out.println("친구를 3명 등록해 주세요");

        
        for (int i = 0; i < 3; i++) {
            String line = sc.nextLine();
            String[] data = line.split(" ");

            // Friend 객체 생성하여 데이터 넣기
            Friend friend = new Friend();
            friend.setName(data[0]);
            friend.setHp(data[1]);
            friend.setSchool(data[2]);

            // 배열에 추가하기
            fList.add(friend);
        }

        // 친구정보 출력
        for (int i = 0; i < fList.size(); i++) {
        	fList.get(i).showInfo();
        }

        sc.close();
    }

}

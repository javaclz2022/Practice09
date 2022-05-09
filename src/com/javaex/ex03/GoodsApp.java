package com.javaex.ex03;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GoodsApp {

    public static void main(String[] args) {

        List<Goods> goodsList = new ArrayList<Goods>();
        Scanner sc = new Scanner(System.in);
        int totalCount = 0;
        System.out.println("상품을 입력해주세요(종료 q)");
        
        while(true){
            // 상품정보 입력받기
            String line = sc.nextLine();
            
            if("q".equals(line)) {
            	System.out.println("[입력완료]");
            	System.out.println("======================");
            	break;
            }

            // 입력받은 친구정보를 콤마(,)으로 분리
            String[] data = line.split(",");
            String name = data[0];
            int price =  Integer.parseInt(data[1]);
            int count =  Integer.parseInt(data[2]);
            
            // Goods 객체 생성하여 데이터 넣기
            Goods goods = new Goods(name, price, count);
           
            // 리스트에 추가하기
            goodsList.add(goods);
        }
        
        
        // 결과출력
        for (int i = 0; i < goodsList.size(); i++) {
            goodsList.get(i).showInfo();
        }
        
        // 모든 상품의 갯수
        for (int i = 0; i < goodsList.size(); i++) {
            totalCount = totalCount + goodsList.get(i).getCount();
        }
        System.out.println("모든 상품의 갯수는 "+ totalCount + "개입니다.");
        
        sc.close();
    }

}

package rpgGame;

import rpgGame.Map;

public class PotionStore extends Map{
   //물품 가격
      int powerPotion = 100;
      int defensePotion = 100;
      int hpPotion = 10;
      int mpPotion = 10;
      int hpPotionBig = 50;
      int hpPotionSuperBig = 100;
      int mpPotionBig = 50;
      
      public int show(int money, int number) {
         name = "물약상점";
         System.out.println("구매할 물건을 고르는 중입니다");
         if(number ==1) {
            if(powerPotion <= money)
               return money - powerPotion;
         }
         if(number ==2) {
            if(defensePotion <= money)
               return money - defensePotion;
         }
         if(number ==3) {
            if(hpPotion <= money)
               return money - hpPotion;
         }
         if(number ==4) {
            if(mpPotion <= money)
               return money - mpPotion;
         }
         if(number ==5) {
            if(hpPotionBig <= money)
               return money - hpPotionBig;
         }
         if(number ==6) {
            if(mpPotion <= money)
               return money - mpPotionBig;
         }
         if(number ==7) {
             if(hpPotionSuperBig <= money)
                return money - hpPotionSuperBig;
          }
         //돈이 부족할떄
         return -1;
      }
}
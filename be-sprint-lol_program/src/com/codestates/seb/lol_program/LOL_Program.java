package com.codestates.seb.lol_program;

public class LOL_Program {
  public static void main(String[] args) {
    //TODO:
    
    // 아군 유닛 생성
    System.out.println("나의 유닛을 먼저 생성합니다.");
    LoL_char myUnit = new LoL_char();
    String[] createdUnit = myUnit.user_create();
    myUnit.user_print(createdUnit);


    // 적군 유닛 생성
    System.out.println("적군 유닛을 생성합니다.");
    LoL_char enemy = new LoL_char();
    String[] enemyUnit = enemy.user_create();
    enemy.user_print(enemyUnit);

    // 정수형 배열로 변환
    int[] myUnit_int = myUnit.user_info_int(createdUnit);
    int[] enemyUnit_int = enemy.user_info_int(enemyUnit);

    // 공격!!
    myUnit.attack(myUnit_int, enemyUnit_int);

  }
}
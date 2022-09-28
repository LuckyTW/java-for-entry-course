import java.util.Random;
import java.util.Scanner;

public class GameClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Random R = new Random();

        // 적 속성
        String[] enemies = {"불곰🐻", "좀비🧟‍", "강도🥷🏻", "호랑이🐯"};
        int maxEnemyHealth = 70;
        int enemyAttackDamage = 30;

        // 플레이어 속성
        int health = 100;
        int attackDamage = 25;
        int numHealthPotion = 4;
        int healthPotionHealAmount = 30;
        int healthPotionDropChance = 50; // percentage

        boolean running = true;
        System.out.println("");
        System.out.println("용사를 위한 던전에 오신 것을 환영합니다.");
        System.out.println("지금부터 모험을 시작합니다.\n");


        GAME:
            while(running) {
                System.out.println("*".repeat(40));

                int enemyHealth = R.nextInt(maxEnemyHealth);
                String enemy = enemies[R.nextInt(enemies.length)];
                System.out.print("<< 🚨 " + enemy + "이(가) 나타났습니다🚨️ >> \n");

                while (enemyHealth > 0) {
                    System.out.println("\t당신🧑‍🦱의 체력: " + health);
                    System.out.println("\t" + enemy + "의 체력: " + enemyHealth);
                    System.out.println("*".repeat(40));

                    System.out.println("\n ▶️ 당신의 액션은?");
                    System.out.println("\t1. 공격⚔️");
                    System.out.println("\t2. 포션 먹기💊");
                    System.out.println("\t3. 도망🏃‍");

                    String input = sc.nextLine();

                    if(input.equals("1")) {
                        int damageDealt = R.nextInt(attackDamage);
                        int damageTaken = R.nextInt(enemyAttackDamage);

                        enemyHealth -= damageDealt;
                        health -= damageTaken;

                        System.out.println("\t> 🗡 적에게 " + damageDealt + "만큼의 데미지를 주었습니다.");
                        System.out.println("\t> 🩸 당신은 적에게 " + damageTaken + "만큼의 데미지를 입었습니다.\n");
                        System.out.println("****************************************");


                        if(health < 1) {
                            System.out.println("당신은 적에게 패배하였습니다.");
                            break;
                        }

                    } else if(input.equals("2")) {

                        if (numHealthPotion > 0) {
                            health += healthPotionHealAmount;
                            numHealthPotion--;
                            System.out.println("체력이 " + healthPotionHealAmount + "만큼 회복되었습니다. 현재 당신의 체력은 " + health + "입니다. 남은 포션의 수는 " + numHealthPotion + "개 입니다.\n");
                            System.out.println("****************************************");

                        } else {
                            System.out.println("남은 포션이 없습니다. 새로운 적을 물리쳐서 포션을 얻어보세요.");
                        }

                    } else if(input.equals("3")) {
                        System.out.println(enemy + "로부터 도망갑니다!\n");
                        continue GAME;
                    } else {
                        System.out.println("잘못된 명령입니다.");
                    }
                }
                if(health < 1) {
                    System.out.println("게임오버");
                    break;
                }
                System.out.println(enemy + "를 물리쳤습니다.");
                System.out.println("현재 남은 체력: " + health + "\n");

                if(R.nextInt(100) < healthPotionDropChance) {
                    numHealthPotion++;
                    System.out.println("적이 포션을 남겼습니다!");
                    System.out.println("현재 당신에게 남은 포션의 개수는 " + numHealthPotion + "개 입니다.");
                }

                System.out.println("****************************************");
                System.out.println("다음으로 무엇을 하시겠습니까?");
                System.out.println("1. 계속 모험하기");
                System.out.println("2. 모험 그만하기");

                String input = sc.nextLine();

                while (!input.equals("1") && !input.equals("2")) {
                    System.out.println("알맞지 않은 명령어입니다.");
                    input = sc.nextLine();
                }

                if(input.equals("1")) {
                    System.out.println("모험을 계속 합니다.\n");
                } else if(input.equals("2")) {
                    System.out.println("게임을 종료합니다.");
                    break;
                }
            }
        System.out.println("게임을 즐겨주셔서 감사합니다.");
    }
}

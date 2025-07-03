package game;
import java.util.Scanner;
import tools.*;

public class launch {

    public static Scanner scanner = new Scanner(System.in);

    //比賽流程變數
    public static byte inning = 7;              //遊戲從第七局開始
    public static boolean isTopOfInning = true; //上下半局
    public static int totalGreen = 0;           //綠隊總分
    public static int totalWhite = 0;           //白隊總分

    //球員變數
    public static String registration[] = new String[100]; //總登錄球員表，索引為背號
    public static String rosterGreen[] = new String[9];    //綠隊打線
    public static String rosterWhite[] = new String[9];    //白隊打線

    //主程式
    public static void main(String[] args) {
        //設定編碼為UTF-8
        try{
            new ProcessBuilder("chcp 65001").inheritIO().start().waitFor();
        }catch(Exception e){
            System.out.println("編碼設定錯誤：" + e.getMessage());
        }
        tools.clearScreen.all();

        //標題畫面
        System.out.println("========================================");
        System.out.println("        caseBall棒球模擬器");
        System.out.println("========================================");
        System.out.println("        輸入任意字元開始遊戲");
        scanner.nextLine();
        scanner.nextLine(); //scanner緩衝
        initializeRegistration();

        //玩家指定白隊守位
        white.setPositions();

        //玩家指定白隊打序
        white.setOrder();

        //電腦自動指定白隊登錄投手
        white.setSP();
        white.setBullpen();

        //電腦自動指定綠隊成員
        green.setPositions();
        green.setOrder();
        green.setSP();
        green.setBullpen();

        //顯示遊戲規則


        //遊戲進行
        while(inning < 10){
            if(isTopOfInning=true){
                //上半局綠隊（電腦）打擊白隊（玩家）守備
                offense.green();
            }else{
                //下半局白隊（玩家）打擊綠隊（電腦）守備
                offense.white();
            }
            inning++;
        }

        //最後比分
        if(totalGreen > totalWhite){
            System.out.println("========================================");
            System.out.println("        綠隊獲勝");
            System.out.println("========================================");
        }else if(totalWhite > totalGreen){
            System.out.println("========================================");
            System.out.println("        白隊獲勝");
            System.out.println("========================================");
        }else{
            System.out.println("========================================");
            System.out.println("        平手");
            System.out.println("========================================");
        }
        System.out.println("        輸入任意字元結束遊戲");
        scanner.nextLine();
        scanner.nextLine(); //scanner緩衝
    }

    //球員總表
    public static void initializeRegistration(){
        registration[1] = "曾子祐";
        registration[5] = "王博玄";
        registration[7] = "郭永維";
        registration[9] = "王柏融";
        registration[24] = "紀慶然";
        registration[25] = "黃秉揚";
        registration[29] = "張肇元";
        registration[30] = "艾速特";
        registration[33] = "陳致嘉";
        registration[39] = "吳念庭";
        registration[40] = "後勁";
        registration[43] = "胡冠俞";
        registration[44] = "曾昱磬";
        registration[46] = "黃群";
        registration[48] = "林詩翔";
        registration[50] = "高聖恩";
        registration[55] = "伍祐城";
        registration[59] = "郭阜林";
        registration[71] = "杜家明";
        registration[73] = "葉保弟";
        registration[79] = "陳飛霖";
        registration[88] = "藍寅倫";
        registration[93] = "張誠恩";
        registration[94] = "魔鷹";
    }
}

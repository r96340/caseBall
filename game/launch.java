package game;
import java.util.Scanner;
import tools.*;
import models.*;

public class launch {

    public static Scanner scanner = new Scanner(System.in);

    //比賽流程變數
    public static byte inning = 7;              //遊戲從第七局開始
    public static boolean isTopOfInning = true; //上下半局
    public static int totalGreen = 0;           //綠隊總分
    public static int totalWhite = 0;           //白隊總分

    //球員變數
    public static Player registration[]  = new Player[100];  //總登錄球員表，索引為背號
    public static Hitter orderGreen[]    = new Hitter[9];    //綠隊打線，索引+1為打序
    public static Player fieldingGreen[] = new Player[10];   //綠隊守位，索引為守備位置，0為指定打擊
    public static Hitter orderWhite[]    = new Hitter[9];    //白隊打線
    public static Player fieldingWhite[] = new Player[10];   //白隊守位

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
        tools.clearScreen.all();

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
        System.out.println("========================================");
        System.out.println("        規則");
        System.out.println("========================================");
        System.out.println("此程式接下來會模擬三個半局（7、8、9）的棒球比賽：");
        System.out.println("上半局玩家將控制投手投球及野手接球；");
        System.out.println("下半局玩家將控制打者打擊。自動跑壘。");
        System.out.println("安打暫時只有一壘安打與全壘打兩種。");
        System.out.println("程式會給出各種選項，玩家必須在十秒鐘以內反應，");
        System.out.println("否則系統會自動決定結果。");
        System.out.println("（計時功能尚未追加。）");
        System.out.println("========================================");
        System.out.println("        輸入任意字元開始遊戲");

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
        registration[1] = new Fielder("曾子祐", 50, 90, 75, 60, 50, 60, 60, false, new short[]{50,50}, new short[]{50,90,0,0}, '0');
        registration[5] = "王博玄";
        registration[7] = "郭永維";
        registration[9] = "王柏融";
        registration[24] = "紀慶然";
        registration[25] = "黃秉揚";
        registration[29] = "張肇元";
        registration[30] = "艾速特";
        registration[31] = "吳明鴻";
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

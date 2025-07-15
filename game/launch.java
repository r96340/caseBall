package game;
import java.util.Scanner;
import tools.*;
import models.*;

public class launch {

    public static Scanner scanner = new Scanner(System.in);

    //比賽流程變數
    public static byte inning = 9;              //遊戲從第九局開始
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

        //電腦自動指定綠隊成員
        green.setPositions();
        //green.setOrder();
        //green.setSP();
        //green.setBullpen();

        //電腦自動指定白隊登錄投手
        //white.setSP();
        //white.setBullpen();

        //玩家指定白隊守位
        white.setPositions();

        //玩家指定白隊打序
        //white.setOrder();

        //顯示遊戲規則
        System.out.println("========================================");
        System.out.println("        規則");
        System.out.println("========================================");
        System.out.println("此程式接下來會模擬最後一個半局（9）的棒球比賽：");
        System.out.println("上半局玩家將控制投手投球及野手接球；");
        System.out.println("下半局玩家將控制打者打撃。自動進壘。");
        System.out.println("安打暫時只有一壘安打與全壘打兩種。");
        System.out.println("程式會給出各種選項，玩家必須在十秒鐘以內反應，");
        System.out.println("否則系統會自動決定結果。");
        System.out.println("（計時功能尚未實作。）");
        System.out.println("========================================");
        System.out.println("        輸入任意字元開始遊戲");

        //遊戲進行
        while(inning < 10){
            if(isTopOfInning=true){
                //上半局綠隊（電腦）打擊白隊（玩家）守備
                //offense.green();
            }else{
                //下半局白隊（玩家）打擊綠隊（電腦）守備
                //offense.white();
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

        registration[1] = new Fielder("曾子祐", 60, 60, 70, 60, 60,
                                      80, 70, false, new int[]{50, 50}, new int[]{0, 100, 0, 0});

        registration[5] = new Fielder("王博玄", 100, 90, 100, 75, 70,
                                      50, 90, true, new int[]{20,80}, new int[]{100,0,80,20});

        registration[7] = new Fielder("郭永維", 90, 30, 50, 50, 100,
                                      60, 55, false, new int[]{60, 40}, new int[]{30, 70, 0, 0});

        registration[9] = new Fielder("王柏融", 85, 40, 45, 95, 50,
                                      100, 25, true, new int[]{30,70}, new int[]{0,0,50,50});

        registration[24] = new Fielder("紀慶然", 75, 75, 65, 45, 100,
                                       80, 50, true, new int[]{100,0}, new int[]{0,0,20,80});

        registration[25] = new Fielder("黄秉揚", 30, 70, 60, 30, 50,
                                       100, 65, false, new int[]{40, 60}, new int[]{40, 60, 0, 0});

        registration[29] = new Catcher("張肇元", 50, 50, 100, 100, 100,
                                       50, 0, false, new int[]{100,50});

        registration[33] = new Catcher("陳致嘉", 100, 100, 0, 0, 50,
                                       0, 50, false, new int[]{0,0});

        registration[39] = new Fielder("吳念庭", 50, 100, 90, 40, 90,
                                       90, 60, true, new int[]{30,70}, new int[]{50, 50, 0, 0});

        registration[43] = new Fielder("胡冠俞", 10, 40, 30, 20, 10,
                                       0, 50, false, new int[]{70,30}, new int[]{20, 80, 0, 0});

        registration[44] = new Fielder("曾昱磬", 45, 80, 80, 100, 0,
                                       20, 35, true, new int[]{0,100}, new int[]{35,65,0,100});

        registration[46] = new Pitcher("黄群", 50, 50, 50, new int[]{75, 75});

        registration[48] = new Pitcher("林詩翔", 0, 0, 150, new int[]{50, 100});

        registration[50] = new Fielder("高聖恩", 65, 50, 75, 60, 30,
                                       0, 70, false, new int[]{80,20}, new int[]{0,0,30,70});

        registration[59] = new Fielder("郭阜林", 80, 10, 20, 90, 80,
                                       10, 30, false, new int[]{100,0}, new int[]{90, 10, 0, 0});

        registration[71] = new Fielder("杜家明", 20, 0, 10, 80, 40,
                                       40, 40, false, new int[]{80,20}, new int[]{80, 20, 0, 0});

        registration[73] = new Fielder("葉保弟", 0, 25, 55, 35, 20,
                                       70, 45, true, new int[]{50,50}, new int[]{0,0,100,0});

        registration[78] = new Catcher("陳世嘉", 0, 0, 50, 50, 0,
                                       100, 100, true, new int[]{100,50});

        registration[79] = new Fielder("陳飛霖", 0, 20, 40, 15, 30,
                                       30, 100, true, new int[]{90,10}, new int[]{45, 55, 0, 0});

        registration[88] = new Fielder("藍寅倫", 25, 100, 90, 80, 80,
                                       30, 80, true, new int[]{70,30}, new int[]{0,0,70,30});

        registration[94] = new Hitter("魔鷹", 0, 100, 100, 100, 50,
                                      45, 55, true, new int[]{75,85});
    }
}

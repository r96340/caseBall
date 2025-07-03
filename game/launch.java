package game;

public class launch {

    //比賽流程變數
    public static byte inning = 7;              //遊戲從第七局開始
    public static boolean isTopOfInning = true; //上下半局
    public static short[] greenScore = {0,0,0}; //雄鷹綠隊各局分數
    public static short[] whiteScore = {0,0,0}; //雄鷹白隊各局分數
    public static int totalGreen = 0;           //雄鷹綠隊總分
    public static int totalWhite = 0;           //雄鷹白隊總分

    //球員變數
    public static String registration[] = new String[100]; //總登錄球員表，索引為背號
    public static String rosterGreen[] = new String[9];    //雄鷹綠隊打線
    public static String rosterWhite[] = new String[9];    //雄鷹白隊打線

    //暫定常數
    

    public static void main(String[] args) {
        System.out.println("========================================");

    }
}

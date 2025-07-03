package game;

public class white {

    //使用私人建構子防止實體化
    private white(){
        throw new AssertionError("程式建構錯誤：嘗試實體化功能類別");
    }

    //指定守位
    public static void setPositions() {
        System.out.println("========================================");
        System.out.println("        請指定白隊捕手");
        System.out.println("========================================");
        
    }

}

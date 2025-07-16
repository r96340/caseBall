package game;

public class white {

    //使用私人建構子防止實體化
    private white(){
        throw new AssertionError("程式建構錯誤：嘗試實體化功能類別");
    }

    //指定守位
    public static void setPositions() {

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊投手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Pitcher){
                launch.registration[i].showRegistry(i);
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇投手為 46號 黃群
        int mockScanner = 46;
        launch.fieldingGreen[1] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[1].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
    }

}

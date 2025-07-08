package game;

public class green {
    

    //使用私人建構子防止實體化
    private green(){
        throw new AssertionError("程式建構錯誤：嘗試實體化功能類別");
    }

    //指定守位
    public static void setPositions() {
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊投手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Pitcher){
                launch.registration[i].showRegistry(i);
            }
        }

        System.out.println("按輸入鍵繼續...");
        
        //初版強制選擇投手為 46號 黃群
        launch.fieldingGreen[1] = launch.registration[46];

    }
}

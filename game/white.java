package game;

import tools.*;

public class white {
    
    //使用私人建構子防止實體化
    private white(){
        throw new AssertionError("程式建構錯誤：嘗試實體化功能類別");
    }

    //指定守位
    public static void setPositions() {

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊投手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Pitcher){
                if(launch.registration[i] != launch.fieldingGreen[1]){
                    launch.registration[i].showRegistry(i);
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        int realScanner = -1;
        //初版強制選擇投手為 48號 林詩翔
        realScanner = tryMismatch.tryInt(realScanner);
        if(realScanner != 48){
            launch.scanner.nextLine();
            System.out.println("無效的選擇，請重新輸入...");
            launch.scanner.nextLine();
            while(realScanner != 48){
                System.out.println("無效的選擇，請重新輸入...");
                realScanner = tryMismatch.tryInt(realScanner);
                launch.scanner.nextLine();
            }
        }
        launch.fieldingWhite[1] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[1].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊捕手");
        System.out.println("========================================");
        int[] available = new int[100];
        int availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Catcher){
                if(launch.registration[i] != launch.fieldingGreen[2]){
                    launch.registration[i].showRegistry(i);
                    available[availableCount] = i;
                    availableCount++;
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
        int availableMismatch = 0;
        for(int i=0;i<availableCount;i++){
            if(realScanner != available[i]){
                availableMismatch++;
            }
        }
        if(availableMismatch == availableCount){
            launch.scanner.nextLine();
            System.out.println("無效的選擇，請重新輸入...");
            launch.scanner.nextLine();
            availableMismatch = 0;
            for(int i=0;i<availableCount;i++){
                if(realScanner != available[i]){
                    availableMismatch++;
                }
            }
            while(availableMismatch == availableCount){
                System.out.println("無效的選擇，請重新輸入...");
                realScanner = tryMismatch.tryInt(realScanner);
                availableMismatch = 0;
                for(int i=0;i<availableCount;i++){
                    if(realScanner != available[i]){
                        availableMismatch++;
                    }
                }
                launch.scanner.nextLine();
            }
        }
        launch.fieldingWhite[2] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[2].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
    }
}

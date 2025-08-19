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
                    if(launch.registration[i] != launch.fieldingGreen[0]){
                        launch.registration[i].showRegistry(i);
                        available[availableCount] = i;
                        availableCount++;
                    }
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
        launch.fieldingWhite[2] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[2].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊一壘手");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(0) > 0){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[3] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[3].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊二壘手");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(1) > 0){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(launch.registration[i] == launch.fieldingWhite[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[4] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[4].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊三壘手");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(0) > 0){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(launch.registration[i] == launch.fieldingWhite[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[5] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[5].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊游擊手");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(1) > 0){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(launch.registration[i] == launch.fieldingWhite[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[6] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[6].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊左外野手");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(2) > 0){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(launch.registration[i] == launch.fieldingWhite[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[7] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[7].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊中外野手");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(3) > 0){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(launch.registration[i] == launch.fieldingWhite[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[8] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[8].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊右外野手");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(2) > 0){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(launch.registration[i] == launch.fieldingWhite[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
                }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[9] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[9].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();


        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        玩家指定白隊指定打擊");
        System.out.println("========================================");
        available = new int[100];
        availableCount = 0;
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Hitter){
                    for(int j=0;j<10;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(launch.registration[i] == launch.fieldingWhite[j]){
                            break;
                        }else if(j==9){
                            launch.registration[i].showRegistry(i);
                            available[availableCount] = i;
                            availableCount++;
                        }
                    }
            }
        }
        System.out.println("輸入選手背號選擇選手...");
        realScanner = -1;
        realScanner = tryMismatch.tryInt(realScanner);
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
        launch.fieldingWhite[0] = launch.registration[realScanner];
        System.out.println("");
        System.out.println("玩家指定 " + realScanner + "號 " + launch.fieldingWhite[0].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        launch.scanner.nextLine();
    }
    
    public static void setOrder(){
        displayHitters();
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();


        displayHitters();
        launch.orderGreen[0] = (models.Hitter)launch.fieldingGreen[4]; //陳飛霖
        launch.orderGreen[1] = (models.Hitter)launch.fieldingGreen[7]; //高聖恩
        launch.orderGreen[2] = (models.Hitter)launch.fieldingGreen[3]; //黃秉揚
        launch.orderGreen[3] = (models.Hitter)launch.fieldingGreen[8]; //曾昱磬
        launch.orderGreen[4] = (models.Hitter)launch.fieldingGreen[5]; //杜家明
        launch.orderGreen[5] = (models.Hitter)launch.fieldingGreen[0]; //藍寅倫
        launch.orderGreen[6] = (models.Hitter)launch.fieldingGreen[9]; //葉保弟
        launch.orderGreen[7] = (models.Hitter)launch.fieldingGreen[6]; //胡冠俞
        launch.orderGreen[8] = (models.Hitter)launch.fieldingGreen[2]; //陳致嘉

        displayOrder();
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();


    }

    private static void displayHitters(){
        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        綠隊打者一覽");
        System.out.println("========================================");
        for(int i=0;i<10;i++){
            if(i==1){
                continue;
            }
            launch.fieldingWhite[i].showRegistry();
        }
    }

    private static void displayOrder(){
        System.out.println("========================================");
        System.out.println("        綠隊打擊順序");
        System.out.println("========================================");
        for(int i=0;i<9;i++){
            if(launch.orderWhite[i] != null){
                System.out.printf("第%d棒\t", i+1);
                launch.orderWhite[i].showPosition();
                for(int j=0;j<10;j++){
                    if(launch.fieldingWhite[j] == launch.orderWhite[i]){
                        System.out.println(tools.convertPosition.toString(j));
                        break;
                    }
                }
            }else{
                continue;
            }
        }
    }

}
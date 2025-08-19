package game;

public class green {
    
    //使用私人建構子防止實體化
    private green(){
        throw new AssertionError("程式建構錯誤：嘗試實體化功能類別");
    }

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
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊捕手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Catcher){
                launch.registration[i].showRegistry(i);
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇投手為 33號 陳致嘉
        mockScanner = 33;
        launch.fieldingGreen[2] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[2].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊一壘手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(0) > 0){
                    launch.registration[i].showRegistry(i);
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇一壘手為 25號 黄秉揚
        mockScanner = 25;
        launch.fieldingGreen[3] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[3].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊二壘手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(1) > 0){
                    if(launch.registration[i] != launch.fieldingGreen[3]){
                        launch.registration[i].showRegistry(i);
                    }
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇一壘手為 79號 陳飛霖
        mockScanner = 79;
        launch.fieldingGreen[4] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[4].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊三壘手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(0) > 0){
                    for(int j=3;j<5;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(j==4){
                            launch.registration[i].showRegistry(i);
                        }
                    }
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇三壘手為 71號 杜家明
        mockScanner = 71;
        launch.fieldingGreen[5] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[5].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊游擊手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(1) > 0){
                    for(int j=3;j<6;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(j==5){
                            launch.registration[i].showRegistry(i);
                        }
                    }
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇三壘手為 43號 胡冠俞
        mockScanner = 43;
        launch.fieldingGreen[6] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[6].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊左外野手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(2) > 0){
                    for(int j=3;j<7;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(j==6){
                            launch.registration[i].showRegistry(i);
                        }
                    }
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇左外野手為 50號 高聖恩
        mockScanner = 50;
        launch.fieldingGreen[7] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[7].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊中外野手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(3) > 0){
                    for(int j=3;j<8;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(j==7){
                            launch.registration[i].showRegistry(i);
                        }
                    }
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇中外野手為 44號 曾昱磬
        mockScanner = 44;
        launch.fieldingGreen[8] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[8].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊右外野手");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Fielder){
                if(((models.Fielder)(launch.registration[i])).getPositionAffinity(2) > 0){
                    for(int j=3;j<9;j++){
                        if(launch.registration[i] == launch.fieldingGreen[j]){
                            break;
                        }else if(j==8){
                            launch.registration[i].showRegistry(i);
                        }
                    }
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇中外野手為 73號 葉保弟
        mockScanner = 73;
        launch.fieldingGreen[9] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[9].name);
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        

        tools.clearScreen.all();
        System.out.println("========================================");
        System.out.println("        電腦指定綠隊指定打擊");
        System.out.println("========================================");
        for(int i=0;i<100;i++){
            if(launch.registration[i] instanceof models.Hitter){
                for(int j=2;j<10;j++){
                    if(launch.registration[i] == launch.fieldingGreen[j]){
                        break;
                    }else if(j==9){
                        launch.registration[i].showRegistry(i);
                    }
                }
            }
        }
        System.out.println("按輸入鍵繼續...");
        launch.scanner.nextLine();
        //初版強制選擇指定打擊為 88號 藍寅倫
        mockScanner = 88;
        launch.fieldingGreen[0] = launch.registration[mockScanner];
        System.out.println("電腦指定 " + mockScanner + "號 " + launch.fieldingGreen[0].name);
        System.out.println("按輸入鍵繼續...");
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
            launch.fieldingGreen[i].showPosition();
            System.out.println(tools.convertPosition.toString(i));
        }
    }

    private static void displayOrder(){
        System.out.println("========================================");
        System.out.println("        綠隊打擊順序");
        System.out.println("========================================");
        for(int i=0;i<9;i++){
            if(launch.orderGreen[i] != null){
                System.out.printf("第%d棒\t", i+1);
                launch.orderGreen[i].showPosition();
                for(int j=0;j<10;j++){
                    if(launch.fieldingGreen[j] == launch.orderGreen[i]){
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

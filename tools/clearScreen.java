package tools;

//指令列清除工具
//重要功能，修改時請非常謹慎
public class clearScreen {
    //使用私人建構子防止實體化
    private clearScreen(){
        throw new AssertionError("程式建構錯誤：嘗試實體化工具類別");
    }

    //清除所有過去輸出
    public static void all() {
        try{
            if(System.getProperty("os.name").toLowerCase().contains("win")){
                //Windows
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            }else{
                //UNIX
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        }catch(Exception e){
            System.out.println("螢幕清除錯誤：" + e.getMessage());
        }
    }
}

package tools;

import java.util.InputMismatchException;

//用於處理switch之前的無效輸入
//switch中的無效輸入使用functions.warnInputInvalid處理

public class tryMismatch {
    //使用私人建構子防止實體化
    private tryMismatch(){
        throw new AssertionError("程式建構錯誤：嘗試實體化功能類別");
    }

    public static byte tryByte(byte b){
        try{
            return game.launch.scanner.nextByte();
        }catch(java.util.InputMismatchException e){
            return -1;
        }
    }

    public static int tryInt(int x){
        try{
            return game.launch.scanner.nextInt();
        }catch(java.util.InputMismatchException e){
            return -1;
        }
    }

}

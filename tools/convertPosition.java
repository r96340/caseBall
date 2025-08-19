package tools;

public class convertPosition {

    public static String toString(int positionIndex) {
        switch (positionIndex) {
            case 0: return "DH"; // 指定打擊
            case 1: return "P"; // 投手
            case 2: return "C"; // 捕手
            case 3: return "1B"; // 一壘手
            case 4: return "2B"; // 二壘手
            case 5: return "3B"; // 三壘手
            case 6: return "SS"; // 游擊手
            case 7: return "LF"; // 左外野手
            case 8: return "CF"; // 中外野手
            case 9: return "RF"; // 右外野手
            default: return "error"; // 錯誤的打擊順序
        }
    }
}
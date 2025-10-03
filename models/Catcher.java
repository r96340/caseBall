package models;

//捕手
public class Catcher extends Hitter implements Fieldable {

    //沒有特有屬性，與指定打擊不同的是需要使用守備員介面，與野手不同的是不需要守位適性

    //建構子
    public Catcher(String name, int number, int luck, int collaboration, int clutch, 
                  int power, int batControl, int plateDiscipline, int speed, boolean isLefty, int[] pitchTypeSights){
        
        super(name, number, luck, collaboration, clutch, power, batControl, plateDiscipline, speed, isLefty, pitchTypeSights);
    }

    public void grabDirect(){};
    public void grabDropped(){};
    public void slidingCatch(){};
    public void divingCatch(){};

    
    @Override
    public void showPosition(){
        System.out.printf("%d\t%s\t\n我是捕手", this.number, name);
    }

}

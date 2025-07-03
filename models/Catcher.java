package models;

//捕手
public class Catcher extends Hitter implements Fieldable {

    //沒有特有屬性，與指定打擊不同的是需要使用守備員介面，與野手不同的是不需要守位適性

    //建構子
    public Catcher(String name, short luck, short collaboration, short clutch, 
                  short power, short batControl, short plateDiscipline, short speed, boolean isLefty, short[] pitchTypeSights){
        
        super(name, luck, collaboration, clutch, power, batControl, plateDiscipline, speed, isLefty, pitchTypeSights);
    }

}

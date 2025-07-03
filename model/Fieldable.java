package model;

//守備選項介面
public interface Fieldable {

    void grabDirect();      //直接接殺
    void grabDropped();     //拿起滾地球之後傳球
    void slidingCatch();    //滑接
    void divingCatch();     //撲接

}

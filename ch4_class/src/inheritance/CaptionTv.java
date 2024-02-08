package inheritance;

public class CaptionTv extends Tv {

  boolean caption;

  //생성자 수동으로 만들지 않을때는 CaptionTv(){//super();} 가 자동 생성
  public CaptionTv(boolean caption) {
    this.caption = caption;
  }

  public CaptionTv(boolean power, int channel, boolean caption) {
    super(power, channel);
    this.caption = caption;
  }

  void displayCaption(String text) {
    // if(caption != true ) == if(!caption)
    // if(caption == true )
    if (caption) {
      System.out.println(text);
    }
  }
}

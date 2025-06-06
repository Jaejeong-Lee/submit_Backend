package basic.ch08.sec04;

public class Television implements RemoteControl {
    @Override
    public void turnOn() {
        System.out.println("TV를 켭니다.");
    }

    @Override
    public void turnOff() {
        System.out.println("TV를 끕니다.");
    }

    private int volume;

    @Override
    public void setVolume(int volume){
        this.volume = volume;
        System.out.println("현재 TV 볼륨 : " + this.volume);
        if(this.volume> MAX_VOLUME){
            this.volume = MAX_VOLUME;
        } else {
            this.volume = MIN_VOLUME;
        }

    }
}

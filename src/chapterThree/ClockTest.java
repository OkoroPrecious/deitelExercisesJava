package chapterThree;

public class ClockTest {
    public static void main(String[] args){

        Clock pp = new Clock(12,40,30);

//        pp.setHour(12);
//        pp.setMinute(40);
//        pp.setSecond(30);


        System.out.printf("Time is %d:%d:%d ", pp.getHour(),pp.getMinute(),pp.getSecond() );


    }
}




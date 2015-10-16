package sample;

import javafx.scene.control.TabPane;

/**
 * Created by DaH4uk on 16.10.2015.
 */
public class Timer extends Thread {
    public Integer Hours;
    public Integer Minuts;
    public Integer Secs;
    public TabPane remTabPane;


    public Timer(String Hours, String Minuts) {
        this.Hours = Integer.parseInt(Hours);
        this.Minuts = Integer.parseInt(Minuts);

        System.out.println(this.Hours);
        System.out.println(this.Minuts);

        if (this.Hours >= 0) {
            Secs = this.Hours * (3600);
            System.out.println(Secs);
        }

        if (this.Minuts >= 0) {
            Secs = this.Minuts * (60) + Secs;
            System.out.println(Secs);
        }

    }

    public void run() {
        while (Secs != 0) {
            System.out.println(Secs);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            Secs--;
        }
    }
}

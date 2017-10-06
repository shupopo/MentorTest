package test01;


public class CellPhone implements Phone,Mailer,App{
    //  メールを送信する
    public void sendMail(){
        System.out.println("メールを送る");
    }
    //  メールを受信する
    public void receiveMail(){
        System.out.println("メールを受信する");
    }
    //  webを閲覧する
    public void browseWeb(){
        System.out.println("ウェブを閲覧する");
    }
    //  ゲームをする
    public void playGame(){
        System.out.println("ゲームをする");
    }
    //  電話をかける
    public void callPhone(){
        System.out.println("電話を掛ける");
    }
    //  電話を受ける
    public void receivePhone(){
        System.out.println("電話を受ける");
    }

}
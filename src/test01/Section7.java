package test01;

public class Section7 {

    public static void main(String[] args) {
        CellPhone cp = new CellPhone();
        funcPhone(cp);
        funcMailer(cp);
        funcApp(cp);
    }
    //  電話としての処理
    public static void funcPhone(Phone phone){
        phone.callPhone();      //  電話を掛ける
        phone.receivePhone();   //  電話を受ける
    }
    //  メーラーとしての処理
    public static void funcMailer(Mailer mailer){
        mailer.sendMail();    //  メールを送信する
        mailer.receiveMail();  //  メールを受信する
    }
    // アプリケーションとしての処理
    public static void funcApp(App app){
        app.playGame();    //  ゲームをする
        app.browseWeb();   //  ウェブを閲覧する
    }

}

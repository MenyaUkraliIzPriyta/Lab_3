import My_Com.Baby;
import My_Com.Status;
import My_Com.Tamer;

//        А Малыш храбро двинулся на кухню.
//        Теперь, когда ему помогал лучший
//        в мире укротитель домомучительниц,ему нечего было бояться.

//        На этот раз фрекен Бок еще меньше обрадовалась его появлению.
//        Она как раз варила себе кофе, и Малыш прекрасно понимал,
//        что она собиралась провести в тишине несколько приятных минут,
//        заедая кофе свежими плюшками.
//        Должно быть, есть мучное вредно только детям.
public class Main {
    public static void main(String[] args) {

        Baby mal1 = new Baby("Малыш", Status.Move);
        mal1.dosomething();

        Tamer karl = new Tamer("укротитель", Status.Unhelp);
        karl.dosomething();

        if (karl.get() == Status.Help){
            Baby mal2 = new Baby("Малыш", Status.NotAfraid);
            mal2.dosomething();
        }

        if (karl.get() == Status.Unhelp) {
            Baby mal2 = new Baby("Малыш", Status.Afraid);
            mal2.dosomething();
        }
    }
}
import My_Com.Baby;
import My_Com.Status;
import My_Com.Tamer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
//        А Малыш храбро двинулся на кухню.
//        Теперь, когда ему помогал лучший
//        в мире укротитель домомучительниц,ему нечего было бояться.
//        На этот раз фрекен Бок еще меньше обрадовалась его появлению.
//        Она как раз варила себе кофе, и Малыш прекрасно понимал,
//        что она собиралась провести в тишине несколько приятных минут,
//        заедая кофе свежими плюшками.
//        Должно быть, есть мучное вредно только детям.

        Baby mal1 = new Baby("Малыш", Status.Move);
        mal1.dosomething();

        Tamer karl = new Tamer("укротитель",Status.Help);
        karl.dosomething();

        Baby mal2 = new Baby("Малыш", Status.NotAfraid);
        mal2.dosomething();
    }
}
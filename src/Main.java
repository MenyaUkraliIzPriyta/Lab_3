import My_Com.*;

/*      А Малыш храбро двинулся на кухню.
        Теперь, когда ему помогал лучший
        в мире укротитель домомучительниц,ему нечего было бояться.

        На этот раз фрекен Бок еще меньше обрадовалась его появлению.
        Она как раз варила себе кофе, и Малыш прекрасно понимал,
        что она собиралась провести в тишине несколько приятных минут,
        заедая кофе свежими плюшками.
        Должно быть, есть мучное вредно только детям.

 */
public class Main {
    public static void main(String[] args) {

        Fields field1 = new Fields("кухня");
        Fields field2 = new Fields("душевая");;

        if (field1.checkPlace() & field2.checkPlace()) {
            Baby mal1 = new Baby("Малыш", Status.Move);
            Housewife fr = new Housewife("Фрекен Бок");
            Author au = new Author("Автор");
            mal1.dosomething(field1.getPlace());

            Tamer karl = new Tamer("укротитель", Status.Help);
            karl.dosomething();
            if (karl.get() == Status.Help) {
                Baby mal2 = new Baby("Малыш", Status.NotAfraid);
                mal2.dosomething(field2.getPlace());
                fr.dosomething();
                mal2.understood(fr.get());

                if (fr.get() == Status.Burn) {
                    au.say2();
                }
                if (fr.get() == Status.Rejoice) {
                    au.say1();
                }
            }

            if (karl.get() == Status.Unhelp) {
                Baby mal2 = new Baby("Малыш", Status.Afraid);
                mal2.dosomething(field2.getPlace());
            }
        }

        else {
            System.out.println("Похоже место персонажа не определилось.");
        }
    }
}
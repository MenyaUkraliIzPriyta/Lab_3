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

            Baby mal1 = new Baby("Малыш", Status.MOVE);
            Housewife fr = new Housewife("Фрекен Бок");
            Author au = new Author("Автор");
            System.out.println(mal1.dosomething(field1.getPlace()));

            Tamer karl = new Tamer("укротитель", Status.HELP);
            System.out.print(karl.dosomething());

            if (karl.get() == Status.HELP) {

                Baby mal2 = new Baby("Малыш", Status.NOTAFRAID);
                System.out.println(mal2.dosomething(field2.getPlace()));
                System.out.println(fr.dosomething());
                System.out.println(mal2.understood(fr.get()));

                if (fr.get() == Status.BURN) {
                    System.out.println(au.say2());
                }
                if (fr.get() == Status.REJOICE) {
                    System.out.println(au.say1());
                }
            }

            if (karl.get() == Status.UNHELP) {

                Baby mal2 = new Baby("Малыш", Status.AFRAID);
                System.out.println(mal2.dosomething(field2.getPlace()));
            }
        }

        else {

            System.out.println("Похоже место персонажа не определилось.");
        }
    }
}
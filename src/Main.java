import Exceptions.IncorrectdoSomethingException;
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
            Housewife fraak = new Housewife("Фрекен Бок").new Frak("Тетка");
            Author au = new Author("Автор");
            Author.Baby_mind mind = au.new Baby_mind();
            Baby.Baby_hear hr = new My_Com.Baby.Baby_hear();

            try {
                mal1.dosomething(field1.getPlace());
            }

            catch (IncorrectdoSomethingException e) {
                System.out.println(e.getMessage());
            }
            Tamer karl = new Tamer("укротитель", Status.HELP);
            Tamer.Movies m = karl.get_move();

            try {
                karl.dosomething();
            } catch (IncorrectdoSomethingException e) {
                System.out.println(e.getMessage());
            }

            if (karl.get() == Status.HELP) {

                Baby mal2 = new Baby("Малыш", Status.NOTAFRAID);

                try {
                    mal2.dosomething(field2.getPlace());
                } catch (IncorrectdoSomethingException e) {
                    System.out.println(e.getMessage());
                }
                fr.dosomething();

                try {
                    mal2.understood(fr.get());
                } catch (IncorrectdoSomethingException e) {
                    System.out.println(e.getMessage());
                }

                if (fr.get() == Status.BURN) {
                    au.say2();
                }
                if (fr.get() == Status.REJOICE) {
                    au.say1();
                }
            }

            if (karl.get() == Status.UNHELP) {

                Baby mal2 = new Baby("Малыш", Status.AFRAID);
                try {
                    mal2.dosomething(field2.getPlace());
                } catch (IncorrectdoSomethingException e) {
                    System.out.println(e.getMessage());
                }
            }
            mind.say();
            hr.hear();
            m.move1();
            m.move2();
            fraak.dosomething();
        }

        else {

            System.out.println("Похоже место персонажа не определилось.");
        }

    }
}
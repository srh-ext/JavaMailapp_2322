public class Main {
    public static void main(String[] args) throws Exception {
        test1();
    }

    private static void test1() throws Exception {
        Mail mail = new Mail();
        mail.setRecipient("yuriy@solovyov.de");
        mail.setSubject("Hallo Yuriy");
        mail.setMessage("Hallo, wie geht es dir?");

        //try {
            Sender sender = new Sender();
            sender.send(mail);
        //} catch (Exception ex) {
        //    System.out.println(ex.getMessage());
        //}
    }
}
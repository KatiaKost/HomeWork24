public class EmailParser {

    public void email(String emails) {
        String[] emailList = emails.split(";");

        for (String email : emailList) {
            String domain = email.substring(email.indexOf("@") + 1, email.lastIndexOf("."));
            System.out.println(domain);
        }
    }

    public static void main(String[] args) {
        EmailParser parser = new EmailParser();
        String emails = "ya@yahoo.com ; on@mail.ru ; ona@gmail.com ;";
        parser.email(emails);
    }
}
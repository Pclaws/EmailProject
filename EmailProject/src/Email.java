public class Email {
    public static void main(String[] args) {

        EmailApp em1 = new EmailApp("phinees","Letshu");
        em1.setAlternateEmail("pl@gmail.ca");
        System.out.println(em1.getAlternateEmail());
        System.out.println(em1);


    }
}

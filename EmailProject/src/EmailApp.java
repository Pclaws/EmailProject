import java.util.Scanner;

public class EmailApp {
    private String firstName , lastName, password , department , email , alternateEmail, companySuffix = "plts.ca";

    private int mailboxCapacity = 500,defaultPasswordLength = 7;

    // constructor to receive the first name and last name

    public EmailApp(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;

        // call methode asking for the department
//        System.out.println("EMAIL CREATED: " + this.firstName + " " + this.lastName);
        this.department = setDepartment();
//        System.out.println("Department is " + this.department);

        // call a method to return a random password
        this.password = randomPassword(defaultPasswordLength);
//        System.out.println("Your password is : " + this.password);

        // generate an email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix ;
//        System.out.println("your email is " + email);
    }


    // Ask for department

    public String setDepartment() {
        System.out.println("New worker : " + firstName + ", Department codes:\n1 for sales\n2 for Development\n3 for Accounting\n4 for none\nEnter department code: ");
        Scanner dep = new Scanner(System.in);
        int depChoice = dep.nextInt();

        if( depChoice == 1){return "sales";}
        else if (depChoice == 2) {return "dev";}
        else if (depChoice == 3) {return "acc";}
        else {return "";}
    }

    // Generate a random password
    private String randomPassword(int lenght){
        String passwordSet = "AKDBFHRTN$@#LO0964WRQL7632CKGDHR@$#$@";

        char [] password = new char[lenght];
        for(int i = 0 ;i < lenght ; i++){
            int random = (int)(Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(random);
        }
        return  new String(password);
    }

    // Set the alternate Email

    public void setAlternateEmail(String alternateEmail) {
        this.alternateEmail = alternateEmail;
    }

    // set a mailbox capacity
    public void setMailboxCapacity(int Capacity) {
        this.mailboxCapacity = Capacity;
    }


    // change the password

    public void setPassword(String password) {this.password = password;}

    public String getAlternateEmail() {return alternateEmail;}

    public int getMailboxCapacity() {return mailboxCapacity;}

    public String getPassword() {return password;}

    @Override
    public String toString() {
        return "EmailApp{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", mailboxCapacity=" + mailboxCapacity + '\'' +
                ", password=" + password +
                '}';
    }
}

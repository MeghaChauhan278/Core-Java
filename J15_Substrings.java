public class J15_Substrings {
    public static void main(String[] args) {
        
        String email = "Bro123@gmail.com";
        String username = email.substring(0,6);
        String domain = email.substring(7); //or(7,16)

        System.out.println(username);
        System.out.println(domain);

        //String emaill = "Bro123@gmail.com";
        String usernamee = email.substring(0,email.indexOf("@"));
        String domainn = email.substring(email.indexOf("@")+1);

        System.out.println(usernamee);
        System.out.println(domainn);
    }
}

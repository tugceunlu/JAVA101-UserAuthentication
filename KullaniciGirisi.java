import java.util.Scanner;
public class User {
    public static void main(String[] args) {
        String username, password, change, user;
        Scanner input = new Scanner(System.in);
        System.out.print("Username: ");
        username = input.nextLine();
        System.out.print("Password: ");
        user = input.nextLine();

        if ((username.equals("patika")) && (user.equals("java123"))){
            System.out.print("Giriş Yaptınız!");
        }
        else{
            System.out.print("Hatalı Giriş.");
            System.out.print("Şifreyi yenilemek ister misiniz? E/H");
            change = input.nextLine();

            if (change.equals("E")){
                System.out.print("New Password: ");
                password = input.nextLine();
                if  (password.equals("java123")) {
                    System.out.print("Eski şifrenizi giremezsiniz!");
                }
                if (password.equals(user)) {
                    System.out.print("Hatalı şifreyi giremezsiniz!");
                }
                else {
                    System.out.print("Şifreniz değiştirildi.");
                }




            }

            else{
                System.out.print("Çıkış yapılıyor.");
            }


        }


    }
}

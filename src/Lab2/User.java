package Lab2;

public class User {
    public static void user(String email) throws InvalidEmailException{
        if (email.contains("@")) {
            System.out.println("valid email Address");
        } else {
            throw new InvalidEmailException("invalid email");
        }


    }

    public static void main(String[] args) {
        String email = "shah@gmail.com";
        try {
            user(email);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("1000 lines");

    }

}

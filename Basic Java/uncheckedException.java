public class uncheckedException {
    static void access(String username, String password){
        if(username!="abc"){
            throw new IllegalArgumentException("Please check your username");
        } else {
            if(password!="123"){
                throw new IllegalArgumentException("Please check your password");
            } else {
                System.out.println("Logged in as "+username);
            }
        }
    }
    public static void main(String[] args) {
        access("abc", "123");
    }
}

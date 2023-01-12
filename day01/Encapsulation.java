class Member {

    public String username;
    private String password;

    public Member(String username, String password){
        this.username = username;
        this.password = password;
    }
    public void getUsername(){
        //TODO: logic here
    }
    public void getPassword(){
        System.out.println(this.password.getBytes().toString());
    }
}

public class Encapsulation {
    public static void main(String[] args) {
      //TODO: code here
      Member member = new Member("Lorem", "passw0rod");
      member.getPassword();
    }
}

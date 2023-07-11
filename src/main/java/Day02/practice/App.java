package Day02.practice;

public class App {
   public static void main(String[] args) {
	   User user = new User();
	   user.setName("noun");
	   user.setEmail("noun@gmail.com");
	   user.setId(100);
	   
	   System.out.println(user.getName());
	   System.out.println(user.getEmail());
	   System.out.println(user.getId());
}
  
}

//package messagerie;

public class cesar_encryp {
     String msg = "salut ca va ?";
     public String encrypt(int key,String msg )	 {
    	String msg_encrypt ="";
		System.out.println(" msg avant ecryption "+msg);
		char[] letters = msg.toCharArray();
		for (char c : letters) {
			c += key;
			msg_encrypt += c;
		}
		System.out.println(" msg apres ecryption "+msg_encrypt);
    	return msg_encrypt;
     }
}

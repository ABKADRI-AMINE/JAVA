//package messagerie;

public class cesar_decryp {
    String msg = "salut ca va ?";
    public String decryp(int key,String msg )	 {
   	String msg_encrypt ="";
		System.out.println(" msg avant decryption "+msg);
		char[] letters = msg.toCharArray();
		for (char c : letters) {
			c -= key;
			msg_encrypt += c;
		}
		System.out.println(" msg après decryption "+msg_encrypt);
   	    return msg_encrypt;
    }
}

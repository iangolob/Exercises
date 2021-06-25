package z1;

public class IPv6Utils {
	public static void checkIPv6AddressValidity(String address) throws InvalidIPv6AddressException{
		String[] hex=address.split(":");
		if(hex.length!=8) throw new InvalidIPv6AddressException("IPv6 address does not contain 8 hexadecimal numbers!");
		for(String string:hex) {
			for(int i=0;i<string.length();i++) {
				char c=string.charAt(i);
				if(!(c>='0'&&c<='9' || c>='A' && c<='F' || c>='a'&&c<='f')) 
					throw new InvalidIPv6AddressException("One or more strings in the IPv6 address are not hexadecimal numbers!");
			}
		}
		
		for(String string:hex) {
			if(string.length()>4)
				throw new InvalidIPv6AddressException("One or more numbers in the IPv6 address are not in the correct range!");

		}
	}
	public static void main(String[] args) throws InvalidIPv6AddressException {
		checkIPv6AddressValidity("2001:0db8:0001:0000:FFFF:0ab9:C0A8:0102");
		checkIPv6AddressValidity("2001:db8:3333:4444:5555:6666:7777:8888");
	}
}

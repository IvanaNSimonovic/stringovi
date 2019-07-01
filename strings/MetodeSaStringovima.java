package strings;

public class MetodeSaStringovima {
	
	public static String ukloniKaraktere(String s, char c, char z) {
		String str="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)!=c && s.charAt(i)!=z) str+=s.charAt(i);
		}
		return str;
	}
	
	public static String obrniRec(String s) {
		String str="";
		String[] reci= s.split(" ");
		for(int i=0; i<reci.length; i++) {
			for(int j=reci[i].length()-1; j>=0; j--) {
				str+=reci[i].charAt(j);
			}
			str+=" ";
		}
		return str;
	}
	
	public static String duplikatiKaraktera(String s) {
		String str="";
		
		for(int i=0; i<s.length(); i++) {
			int brojac=1;
			for(int j=0; j<s.length(); j++) {
			if(i!=j && s.charAt(i)==s.charAt(j)) brojac++;
			}
			if(brojac>1) {
				String pom=""+ s.charAt(i);
				if(!(str.contains(pom))) str+=s.charAt(i)+":"+brojac+" ";
			}
		}
		return str;
	}
	
	public static Rotacija proveraRotacije(String s1, String s2) {
		Rotacija r= new Rotacija();
		int poz=0;
		int z=0;
		if (s1.length()!=s2.length()) return r;
		for(int i=0; i<s1.length(); i++) {
			for(int j=0; j<s2.length(); j++) {
				if (s1.charAt(i)==s2.charAt(j)) {
					poz=j;
					for(z=0; z<s2.length(); z++) {
						if(poz+z!=s2.length())break;
						if(s1.charAt(z)!=s2.charAt(poz+z))break;
					}
					if (z==s2.length()) {
						r.setBool(true);
						r.setBr(poz);
					}
				}
			}
		}
		return r;
	}
	
	public static boolean palindrom(String s) {
		int brojac=1;
		
		for(int i=0; i<s.length()/2; i++) {
			for(int j=s.length()-1; j>=s.length()/2; j--) {
				if(s.charAt(i)==s.charAt(j)) {
					brojac++;
				}
			}
		}
		if(s.length()%2==1)brojac++;
		if(brojac==s.length())return true;
		else return false;
	}
	
	public static String cezarovaSifra(String s, int a) {
		String str="";
		for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)+a>122) {
				int pom=(s.charAt(i)+a)-122-1;
				str+=(char)'a'+pom;
			}
			str+=(char)s.charAt(i)+a;
		}
		return str;
	}

}

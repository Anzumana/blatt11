import java.util.regex.Pattern;
import java.util.regex.Matcher;

class RegEx{
// Uebung_[Number]_[Tutoriumsnummer]_[Vorname]_[Nachname].[pdf,zip]

	public static void main(String[] args){
		Pattern pattern = Pattern.compile("(Uebung_[0-9][0-9])_(Tutorium_[0-9][0-9])_([a-zA-Z]+)_([a-zA-Z]+)(\\.)(pdf|zip)+");
		String s = "Uebung_01_Tutorium_16_Anzumana_Taal.pdf";
		Matcher matcher = pattern.matcher(s);
		boolean result = matcher.matches();
		if(result){
			System.out.println("String passt");
			System.out.println(matcher.group(1));
			System.out.println(matcher.group(2));
			System.out.println(matcher.group(3));
			System.out.println(matcher.group(4));
		} else {
			System.out.println("String passt nicht");
		}
		In.open("Speiseplan.html");
		String s1 ="";
		while(!s1.equals("</html>")){
			s1 = In.readLine();
			// if pattern matches <tr>...</tr>	
			System.out.println(s1);
		}
		Pattern pattern1 = Pattern.compile(".");
		Matcher matcher1 = pattern1.matcher(s1);
		boolean result1 = matcher1.matches();
		if(result1){
			System.out.println("String passt");
			System.out.println(matcher1.group(1));
		} else {
			System.out.println("String passt nicht");
		}
		In.close();

	}
}


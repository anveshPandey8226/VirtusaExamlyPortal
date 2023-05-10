package strings;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		java.util.Date d;
		SimpleDateFormat sdt = new SimpleDateFormat("dd-MM=yy");
		sdt.setLenient(false);
		d =sdt.parse("45-03-2018");
		System.out.println(sdt.format(d));
		
	}

}

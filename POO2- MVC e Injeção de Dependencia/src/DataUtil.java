import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DataUtil {
	public static Date StrTodate(String pDate) {

        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");

        Date dia = null;
        try {

            dia = df.parse(pDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return dia;
    }
	
	public static String DataForStringPadrao(Date pDate) {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        String s = "";
        try {
            s = df.format(pDate);
        } catch (Exception ex) {
        	ex.printStackTrace();
        }
        return s;
    }
	 public static String DataForStringMySQL(Date pDate) {
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        String s = "";
	        try {
	            s = df.format(pDate);
	        } catch (Exception ex) {
	        	ex.printStackTrace();
	        }
	        return s;
	    }
	 
	 public static Date DataMySQL(String pDate) {
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");

	        Date dia = null;
	        try {

	            dia = df.parse(pDate);
	        } catch (ParseException e) {
	            e.printStackTrace();
	        }

	        return dia;
	    }
	 
}

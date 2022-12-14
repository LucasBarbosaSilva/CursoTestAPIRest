package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class DataUtils {
	public static String getDataFuturaFormatada(Integer dias) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, dias);
		return getDataFormatada(cal.getTime());
	}
	
	public static String getDataFormatada(Date data) {
		DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
		return format.format(data);
	}
}

package converter;

import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author:兰
 * @Date:2022/10/21/11:18
 */
public class StringToDateConverter implements Converter<String, Date> {
    private String datePattern;

    public void setDatePattern(String datePattern) {
        this.datePattern = datePattern;
    }

    @Override
    public Date convert(String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(datePattern);
        try {
            return dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
            return null;
        //   throw new RuntimeException(e);
        }

    }
}

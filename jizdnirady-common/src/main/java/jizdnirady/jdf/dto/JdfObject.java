package jizdnirady.jdf.dto;

import org.apache.commons.lang3.BooleanUtils;
import org.apache.commons.lang3.math.NumberUtils;
import org.apache.commons.lang3.time.DateUtils;

import java.text.ParseException;
import java.util.Date;

public abstract class JdfObject {

    protected static final String DATE_FORMAT = "ddMMyyyy";
    protected static final long LONG_DEFAULT_VALUE = 0L;

    protected Long parseLong(String str) {
        return NumberUtils.toLong(str, LONG_DEFAULT_VALUE);
    }

    protected Date parseDate(String str) {
        try {
            return DateUtils.parseDate(str, DATE_FORMAT);
        } catch (ParseException e) {
            return null;
        }
    }

    protected Boolean parseBoolean(String str) {
        if (NumberUtils.isDigits(str)) {
            return BooleanUtils.toBoolean(NumberUtils.toInt(str));
        } else  {
            return BooleanUtils.toBoolean(str);
        }
    }
}

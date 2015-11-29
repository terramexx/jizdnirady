package jizdnirady.jdf.mapper;

import jizdnirady.jdf.JdfParserImpl;
import org.apache.commons.lang3.StringUtils;

import java.text.DateFormat;
import java.util.Date;

public abstract class BaseMapperTest {

    protected String[] splitLine(String line) {
        return JdfParserImpl.splitCsv(line);
    }

    protected boolean compareDate(String dateString, DateFormat dateFormat, Date date) throws Exception {
        if (StringUtils.isBlank(dateString) && date == null) {
            return true;
        } else if (StringUtils.isBlank(dateString) && date != null) {
            return false;
        } else if (StringUtils.isNotBlank(dateString) && date == null) {
            return false;
        } else {
            Date parsedDate = dateFormat.parse(dateString);
            return parsedDate.equals(date);
        }
    }

}

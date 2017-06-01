import com.azarov.projects.intervew.job.acvelon.StringGenerator;
import org.junit.Test;

/**
 * Copyright DonRiver Inc. All Rights Reserved.
 *
 * @Author: Dmitry Azarov
 * @Created: 2017-06-01
 */

//
public class TestStringGenerator {

    @Test
    public void start(){
        String str = "ABC";
        StringGenerator ts = new StringGenerator();
        ts.stringenrator(str);
    }
}

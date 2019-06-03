package cn.yunovo.nxos.test;

import org.hamcrest.BaseMatcher;
import org.hamcrest.Description;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Administrator on 2018/11/23.
 */

public class IsMobilePhoneMatcher extends BaseMatcher {
    @Override
    public boolean matches(Object item) {
        Pattern pattern = Pattern.compile("(1|861)(3|5|7|8)\\d{9}$*");
        Matcher matcher = pattern.matcher((String) item);

        return matcher.find();
    }

    @Override
    public void describeTo(Description description) {
        description.appendText("预计此字符串是手机号码！");
    }

    @Override
    public void describeMismatch(Object item, Description description) {
        description.appendText(item.toString() + " 不是手机号码！");
    }
}

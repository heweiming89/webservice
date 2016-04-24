package cn.com.webxml;

import org.junit.Test;

public class MobileCodeWSTest {

	@Test
	public void test() {
		MobileCodeWS ws = new MobileCodeWS();
		MobileCodeWSSoap wsSoap = ws.getMobileCodeWSSoap();
		String mobileCode = "15800979640";
		String userID = "";
		String info = wsSoap.getMobileCodeInfo(mobileCode, userID);
		System.out.println(info.split("：")[1]);
	}
}

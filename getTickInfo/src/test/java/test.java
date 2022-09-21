import com.matao.GetTickInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Timer;
import java.util.TimerTask;

public class test {

    public static void main(String[] args) throws InterruptedException {

        while ( true ) {
            ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
            GetTickInfo getTickInfo = (GetTickInfo) context.getBean("getTickInfo");
            String[] tickInfoArray = getTickInfo.getTickInfoByTencent();

            System.out.println(tickInfoArray[1]+"---" + tickInfoArray[3] + "---" + tickInfoArray[6]);
            if (Integer.parseInt(tickInfoArray[7]) > Integer.parseInt(tickInfoArray[8])) {
                System.out.println("买大于卖--->买");
            } else {
                System.out.println("卖大于买--->卖");
            }
            Thread.sleep(1000);
        }
    }
}

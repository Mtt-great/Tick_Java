import com.matao.GetTickInfo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

    public static void main(String[] args) {

        ApplicationContext context= new ClassPathXmlApplicationContext("applicationContext.xml");
        GetTickInfo getTickInfo= (GetTickInfo) context.getBean("getTickInfo");
        String[] tickInfoArray=getTickInfo.getTickInfoByTencent();

        for ( String info : tickInfoArray){
            System.out.println( info );
        }
    }
}

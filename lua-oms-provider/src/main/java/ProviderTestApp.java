import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author AMGuo
 * @Description
 * @date 2018/03/15 16:32
 */
public class ProviderTestApp {


    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"classpath:provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}

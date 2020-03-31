import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * description:
 * date: 2020/3/29 15:03
 * email: meili@111.com.cn
 * author: MeiLi
 */
@ComponentScan(basePackages = "com.rf")
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(Application.class);
        //设置启动时是否显示banner图
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }
}
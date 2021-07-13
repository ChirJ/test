import com.yingkong.core.service.SysAdminService;
import com.yingkong.web.Application;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author lin
 * @description
 * @time 2021/7/13 下午 1:32
 */
// 1 在同一个包下 不需要指定启动类
// 2 如果不在同一个包下 需要指定某个启动的类
@SpringBootTest(classes = {Application.class})
public class TestSprintApi {
    @Autowired
    SysAdminService sysAdminService;

    @Test
    public void testService(){
        System.out.println(sysAdminService.getAdminById(17));
    }
}

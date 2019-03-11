import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2018/12/19.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes={RootConfig.class})
@WebAppConfiguration
public class EmaiTest {
   @Autowired
    private JavaMailSender mailSender;
    @Test
    public void sendSimpleEmail(){
        SimpleMailMessage message = new SimpleMailMessage();//消息构造器
        message.setFrom("674908679@qq.com");//发件人
        message.setTo("674908679@qq.com");//收件人
        message.setSubject("Spring Email Test");//主题
        message.setText("lalala");//正文
        mailSender.send(message);
        System.out.println("邮件发送完毕");
    }
}

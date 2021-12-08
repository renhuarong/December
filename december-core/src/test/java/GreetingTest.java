import com.example.DecemberApplicationContext;
import com.example.decemberdomain.request.GreetingRequest;
import com.example.decemberdomain.response.GreetingResponse;
import com.example.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.Assert;
import org.testng.annotations.Test;

@SpringBootTest(classes = DecemberApplicationContext.class)
public class GreetingTest extends AbstractTestNGSpringContextTests {
    @Autowired
    private GreetingService greetingService;

    @Test
    public void GreetingGetContentTest() {
        GreetingRequest greetingRequest= new GreetingRequest();
        greetingRequest.setId(1);
        GreetingResponse response ;
        response = greetingService.getContent(greetingRequest);
        Assert.assertEquals(response.getContent(),"orange");

        greetingRequest.setId(2);
        response = greetingService.getContent(greetingRequest);
        Assert.assertEquals(response.getContent(),"apple");
    }
}

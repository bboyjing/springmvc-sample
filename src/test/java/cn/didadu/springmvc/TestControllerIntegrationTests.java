package cn.didadu.springmvc;

import cn.didadu.springmvc.config.MyMvcConfig;
import cn.didadu.springmvc.service.DemoService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpSession;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.junit.Before;

/**
 * Created by jinggg on 16/4/22.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestControllerIntegrationTests {

    private MockMvc mockMvc;

    @Autowired
    private DemoService demoService;

    @Autowired
    private WebApplicationContext wac;

    @Autowired
    private MockHttpSession session;

    @Autowired
    private MockHttpServletRequest request;

    @Before
    public void setUp(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
    }

    @Test
    public void testNormal() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/normal"))
            .andExpect(MockMvcResultMatchers.status().isOk())
            .andExpect(MockMvcResultMatchers.view().name("page"))
            .andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/classes/views/page.jsp"))
            .andExpect(MockMvcResultMatchers.model().attribute("msg", demoService.saySomething()));
    }

    @Test
    public void testRestController() throws Exception{
        mockMvc.perform(MockMvcRequestBuilders.get("/testRest"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=UTF-8"))
                .andExpect(MockMvcResultMatchers.content().string(demoService.saySomething()));
    }
}

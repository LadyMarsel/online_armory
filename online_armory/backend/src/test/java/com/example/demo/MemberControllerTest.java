package com.example.demo;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;

import com.project.controllers.MemberController;
import com.project.services.MemberService;

@WebMvcTest(controllers = MemberController.class)
public class MemberControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private MemberService memberService;

    /*@Test
    public void testGetMembers() throws Exception{
        mockMvc.perform(get("/members"))
            .andExpect(status().isOk());
    }*/
    
}

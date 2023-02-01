package com.jyotheesh.controller;

/**import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.mock.web.MockHttpServletResponse;
import org.springframework.test.web.servlet.MockMvc;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.jyotheesh.model.Mobile;
import com.jyotheesh.service.MobileServiceInterface;

@WebMvcTest
public class MobileControllerTest {

	@MockBean
	private MobileServiceInterface mobileServiceInterfaceMock;

	@Autowired
	private MockMvc mockMvc;
	@Autowired
	private ObjectMapper objectMapper;

	@Test
	public void testCreateMobileData() throws Exception {
		System.out.println("===========");

		String endpoinUrl = "/mobile/api/create-mobile";
		Mobile mobile = new Mobile();
		mobile.setMobileId(3696);
		mobile.setMobileName("Vivo");
		mobile.setMobileColour("Black");
		mobile.setMobilePrice(36000);
		mobile.setMobileRam("8GB");
		mobile.setMobileStroage("128GB");
		mockMvc.perform(post(endpoinUrl).contentType(MediaType.APPLICATION_JSON)
				.content(objectMapper.writeValueAsString(mobile))).andExpect(status().isOk()).andDo(print())
				.andReturn();
	}

	@Test
	public void testGetMobileDetails() throws Exception{
		Mobile mobile = new Mobile();
		mobile.setMobileId(3694);
		mobile.setMobileName("MI");
		mobile.setMobileColour("White");
		mobile.setMobilePrice(26000);
		mobile.setMobileRam("6GB");
		mobile.setMobileStroage("64GB");
		
		when(mobileServiceInterfaceMock.getMobileDetails(name).thenReturn(mobile);
		String getEndPointUrl = "/mobile/api/get-mobile-details";
		MockHttpServletResponse getResponse = mockMvc.perform(get(getEndPointUrl).param("name", name)
				.andExpect(status().isOk()).andDo(print()).andReturn().getResponse();
		String result = getResponse.getContentAsString();
		Mobile mobileResponse =objectMapper.readValue(result, Mobile.class);
		assertEquals("Vivo", mobileResponse.getMobileName());
		
	}

}**/

package com.fm.Fleet.Management.Software;

import com.fm.Fleet.Management.Software.repositories.TaxiRepository;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@SpringBootTest
@AutoConfigureMockMvc
class FleetManagementSoftwareApplicationTests {
	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private TaxiRepository taxiRepository;

	@Test
	@DisplayName("testing first endpoint")
	void contextLoads() throws Exception {
		mockMvc.perform(get("/taxis?page=1&size=10")).andExpect(status().isOk())
				.andExpect(jsonPath("$.content").isArray())
				.andExpect(jsonPath("$.content.length()").value(10))
				.andExpect(jsonPath("$.content[0].id").exists())
				.andExpect(jsonPath("$.content[0].plate").exists());

	}

}

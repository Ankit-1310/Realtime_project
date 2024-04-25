package com.anku.request;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data
public class SearchRequest {


		private String planeName;
		private String planeStatus;
		private String gender;
		@DateTimeFormat(pattern = "dd-mm-yyyy")
		private String startDate;
		@DateTimeFormat(pattern = "dd-mm-yyyy")
		private String endDate;
}

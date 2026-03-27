package com.patil.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Data
public class User 
{
	private int id;
	private String name;
}

/* when we will use @Data Annotation including some Annotion in data by default
   1) @AllArgsConstructor
   2) @Getter
   3) @Setter
   4) @ToString*/
 
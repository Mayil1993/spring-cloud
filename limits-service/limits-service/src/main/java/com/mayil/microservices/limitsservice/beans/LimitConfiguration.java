package com.mayil.microservices.limitsservice.beans;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
public class LimitConfiguration {

	@Getter@Setter private int maximum;
	@Getter@Setter private int minimum;
}

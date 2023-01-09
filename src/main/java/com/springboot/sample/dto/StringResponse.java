package com.springboot.sample.dto;

import java.io.Serializable;

public class StringResponse {
    private String echo;

    public StringResponse() {
		super();
	}

	public StringResponse(String s) {
        this.echo = s;
    }

    public String getEcho() {
        return echo;
    }

    public void setEcho(String echo) {
        this.echo = echo;
    }
}

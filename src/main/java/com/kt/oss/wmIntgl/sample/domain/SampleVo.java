package com.kt.oss.wmIntgl.sample.domain;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


@SuppressWarnings("serial")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "sampleVo")
public class SampleVo implements Serializable {
	
	private String title;
	private String subTitle;
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getSubTitle() {
		return subTitle;
	}
	public void setSubTitle(String subTitle) {
		this.subTitle = subTitle;
	}

}

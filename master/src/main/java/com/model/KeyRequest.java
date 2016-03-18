/**
 * 
 */
package com.model;

import javax.xml.bind.annotation.XmlRootElement;

 
@XmlRootElement
public class KeyRequest {

    //Master key request fields
    private String id;
    private String progarmStart;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getProgarmStart() {
		return progarmStart;
	}
	public void setProgarmStart(String progarmStart) {
		this.progarmStart = progarmStart;
	}

    

}

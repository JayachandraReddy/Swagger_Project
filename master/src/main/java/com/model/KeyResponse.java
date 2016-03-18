/**
 * 
 */
package com.model;

import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement
public class KeyResponse {

    private String returnCode;

	public String getReturnCode() {
		return returnCode;
	}

	public void setReturnCode(String returnCode) {
		this.returnCode = returnCode;
	}
   

}

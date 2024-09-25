package com.test1;

public class ServerlessPubSubData {
	private String pubSubCode;
	private String pubSubName;
	private String cloudProvider;
	private String autoscalinggroup;
	private String payAsPerUse;
	private String elasticity;
	private String scalability;
	private Integer resourceLimits;
	private String monitoringAndDebugging;
	private String contentSecurity;
	private String vendorLockIn;

	public ServerlessPubSubData() {

	}

	public ServerlessPubSubData(String pubSubCode, String pubSubName, String cloudProvider, String autoscalinggroup,
			String payAsPerUse, String elasticity, String scalability, Integer resourceLimits,
			String monitoringAndDebugging, String contentSecurity, String vendorLockIn) {
		super();
		this.pubSubCode = pubSubCode;
		this.pubSubName = pubSubName;
		this.cloudProvider = cloudProvider;
		this.autoscalinggroup = autoscalinggroup;
		this.payAsPerUse = payAsPerUse;
		this.elasticity = elasticity;
		this.scalability = scalability;
		this.resourceLimits = resourceLimits;
		this.monitoringAndDebugging = monitoringAndDebugging;
		this.contentSecurity = contentSecurity;
		this.vendorLockIn = vendorLockIn;
	}

	public String getPubSubCode() {
		return pubSubCode;
	}

	public void setPubSubCode(String pubSubCode) {
		this.pubSubCode = pubSubCode;
	}

	public String getPubSubName() {
		return pubSubName;
	}

	public void setPubSubName(String pubSubName) {
		this.pubSubName = pubSubName;
	}

	public String getCloudProvider() {
		return cloudProvider;
	}

	public void setCloudProvider(String cloudProvider) {
		this.cloudProvider = cloudProvider;
	}

	public String getAutoscalinggroup() {
		return autoscalinggroup;
	}

	public void setAutoscalinggroup(String autoscalinggroup) {
		this.autoscalinggroup = autoscalinggroup;
	}

	public String getPayAsPerUse() {
		return payAsPerUse;
	}

	public void setPayAsPerUse(String payAsPerUse) {
		this.payAsPerUse = payAsPerUse;
	}

	public String getElasticity() {
		return elasticity;
	}

	public void setElasticity(String elasticity) {
		this.elasticity = elasticity;
	}

	public String getScalability() {
		return scalability;
	}

	public void setScalability(String scalability) {
		this.scalability = scalability;
	}

	public Integer getResourceLimits() {
		return resourceLimits;
	}

	public void setResourceLimits(Integer resourceLimits) {
		this.resourceLimits = resourceLimits;
	}

	public String getMonitoringAndDebugging() {
		return monitoringAndDebugging;
	}

	public void setMonitoringAndDebugging(String monitoringAndDebugging) {
		this.monitoringAndDebugging = monitoringAndDebugging;
	}

	public String getContentSecurity() {
		return contentSecurity;
	}

	public void setContentSecurity(String contentSecurity) {
		this.contentSecurity = contentSecurity;
	}

	public String getVendorLockIn() {
		return vendorLockIn;
	}

	public void setVendorLockIn(String vendorLockIn) {
		this.vendorLockIn = vendorLockIn;
	}

}

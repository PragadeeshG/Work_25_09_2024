package com.test1;

public class ServerlessAdditionalTopUps {
	private Integer configurationId;
	private String configurationOwner;
	private Integer pubSubCode;
	private String cloudScheduler;
	private String consoleTools;
	private String noOfTopics;
	private boolean apiGatewayEnabled;
	private String lambasAsFunction;
	private String lambdasGroup;
	private String memory;
	private String cpus;
	private String gpus;
	private String cronJobOption;
	private String globalInfraSupport;

	public ServerlessAdditionalTopUps() {

	}

	public ServerlessAdditionalTopUps(Integer configurationId, String configurationOwner, Integer pubSubCode,
			String cloudScheduler, String consoleTools, String noOfTopics, boolean apiGatewayEnabled,
			String lambasAsFunction, String lambdasGroup, String memory, String cpus, String gpus, String cronJobOption,
			String globalInfraSupport) {
		super();
		this.configurationId = configurationId;
		this.configurationOwner = configurationOwner;
		this.pubSubCode = pubSubCode;
		this.cloudScheduler = cloudScheduler;
		this.consoleTools = consoleTools;
		this.noOfTopics = noOfTopics;
		this.apiGatewayEnabled = apiGatewayEnabled;
		this.lambasAsFunction = lambasAsFunction;
		this.lambdasGroup = lambdasGroup;
		this.memory = memory;
		this.cpus = cpus;
		this.gpus = gpus;
		this.cronJobOption = cronJobOption;
		this.globalInfraSupport = globalInfraSupport;
	}

	public Integer getConfigurationId() {
		return configurationId;
	}

	public void setConfigurationId(Integer configurationId) {
		this.configurationId = configurationId;
	}

	public String getConfigurationOwner() {
		return configurationOwner;
	}

	public void setConfigurationOwner(String configurationOwner) {
		this.configurationOwner = configurationOwner;
	}

	public Integer getPubSubCode() {
		return pubSubCode;
	}

	public void setPubSubCode(Integer pubSubCode) {
		this.pubSubCode = pubSubCode;
	}

	public String getCloudScheduler() {
		return cloudScheduler;
	}

	public void setCloudScheduler(String cloudScheduler) {
		this.cloudScheduler = cloudScheduler;
	}

	public String getConsoleTools() {
		return consoleTools;
	}

	public void setConsoleTools(String consoleTools) {
		this.consoleTools = consoleTools;
	}

	public String getNoOfTopics() {
		return noOfTopics;
	}

	public void setNoOfTopics(String noOfTopics) {
		this.noOfTopics = noOfTopics;
	}

	public boolean isApiGatewayEnabled() {
		return apiGatewayEnabled;
	}

	public void setApiGatewayEnabled(boolean apiGatewayEnabled) {
		this.apiGatewayEnabled = apiGatewayEnabled;
	}

	public String getLambasAsFunction() {
		return lambasAsFunction;
	}

	public void setLambasAsFunction(String lambasAsFunction) {
		this.lambasAsFunction = lambasAsFunction;
	}

	public String getLambdasGroup() {
		return lambdasGroup;
	}

	public void setLambdasGroup(String lambdasGroup) {
		this.lambdasGroup = lambdasGroup;
	}

	public String getMemory() {
		return memory;
	}

	public void setMemory(String memory) {
		this.memory = memory;
	}

	public String getCpus() {
		return cpus;
	}

	public void setCpus(String cpus) {
		this.cpus = cpus;
	}

	public String getGpus() {
		return gpus;
	}

	public void setGpus(String gpus) {
		this.gpus = gpus;
	}

	public String getCronJobOption() {
		return cronJobOption;
	}

	public void setCronJobOption(String cronJobOption) {
		this.cronJobOption = cronJobOption;
	}

	public String getGlobalInfraSupport() {
		return globalInfraSupport;
	}

	public void setGlobalInfraSupport(String globalInfraSupport) {
		this.globalInfraSupport = globalInfraSupport;
	}

}

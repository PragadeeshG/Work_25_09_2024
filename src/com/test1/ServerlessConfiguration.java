package com.test1;

public class ServerlessConfiguration {
	private Integer configurationId;
	private String configurationOwner;
	private boolean provisioned;
	private Integer provisioningTime;
	private String ongoingAdministration;
	private String elasticScaling;
	private Integer capacityPlanning;
	private Integer persistentConnections;
	private String maintenanceState;
	private Integer resourceUtilTime;
	private String resourceLimits;
	private String status;
	private String obsoleteConfigRemoval;

	public ServerlessConfiguration() {

	}

	public ServerlessConfiguration(Integer configurationId, String configurationOwner, boolean provisioned,
			Integer provisioningTime, String ongoingAdministration, String elasticScaling, Integer capacityPlanning,
			Integer persistentConnections, String maintenanceState, Integer resourceUtilTime, String resourceLimits,
			String status, String obsoleteConfigRemoval) {
		super();
		this.configurationId = configurationId;
		this.configurationOwner = configurationOwner;
		this.provisioned = provisioned;
		this.provisioningTime = provisioningTime;
		this.ongoingAdministration = ongoingAdministration;
		this.elasticScaling = elasticScaling;
		this.capacityPlanning = capacityPlanning;
		this.persistentConnections = persistentConnections;
		this.maintenanceState = maintenanceState;
		this.resourceUtilTime = resourceUtilTime;
		this.resourceLimits = resourceLimits;
		this.status = status;
		this.obsoleteConfigRemoval = obsoleteConfigRemoval;
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

	public boolean isProvisioned() {
		return provisioned;
	}

	public void setProvisioned(boolean provisioned) {
		this.provisioned = provisioned;
	}

	public Integer getProvisioningTime() {
		return provisioningTime;
	}

	public void setProvisioningTime(Integer provisioningTime) {
		this.provisioningTime = provisioningTime;
	}

	public String getOngoingAdministration() {
		return ongoingAdministration;
	}

	public void setOngoingAdministration(String ongoingAdministration) {
		this.ongoingAdministration = ongoingAdministration;
	}

	public String getElasticScaling() {
		return elasticScaling;
	}

	public void setElasticScaling(String elasticScaling) {
		this.elasticScaling = elasticScaling;
	}

	public Integer getCapacityPlanning() {
		return capacityPlanning;
	}

	public void setCapacityPlanning(Integer capacityPlanning) {
		this.capacityPlanning = capacityPlanning;
	}

	public Integer getPersistentConnections() {
		return persistentConnections;
	}

	public void setPersistentConnections(Integer persistentConnections) {
		this.persistentConnections = persistentConnections;
	}

	public String getMaintenanceState() {
		return maintenanceState;
	}

	public void setMaintenanceState(String maintenanceState) {
		this.maintenanceState = maintenanceState;
	}

	public Integer getResourceUtilTime() {
		return resourceUtilTime;
	}

	public void setResourceUtilTime(Integer resourceUtilTime) {
		this.resourceUtilTime = resourceUtilTime;
	}

	public String getResourceLimits() {
		return resourceLimits;
	}

	public void setResourceLimits(String resourceLimits) {
		this.resourceLimits = resourceLimits;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getObsoleteConfigRemoval() {
		return obsoleteConfigRemoval;
	}

	public void setObsoleteConfigRemoval(String obsoleteConfigRemoval) {
		this.obsoleteConfigRemoval = obsoleteConfigRemoval;
	}

}

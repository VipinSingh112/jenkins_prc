/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link NcbjNumOfEmpAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjNumOfEmpAdd
 * @generated
 */
public class NcbjNumOfEmpAddWrapper
	extends BaseModelWrapper<NcbjNumOfEmpAdd>
	implements ModelWrapper<NcbjNumOfEmpAdd>, NcbjNumOfEmpAdd {

	public NcbjNumOfEmpAddWrapper(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		super(ncbjNumOfEmpAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjNumOfEmpAddId", getNcbjNumOfEmpAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("headOffice", getHeadOffice());
		attributes.put("administrationOffice", getAdministrationOffice());
		attributes.put("productionProcessing", getProductionProcessing());
		attributes.put("maintenanceService", getMaintenanceService());
		attributes.put("logistics", getLogistics());
		attributes.put("total", getTotal());
		attributes.put("seasonal", getSeasonal());
		attributes.put("temporary", getTemporary());
		attributes.put("subcontracted", getSubcontracted());
		attributes.put("counter", getCounter());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjNumOfEmpAddId = (Long)attributes.get("ncbjNumOfEmpAddId");

		if (ncbjNumOfEmpAddId != null) {
			setNcbjNumOfEmpAddId(ncbjNumOfEmpAddId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String headOffice = (String)attributes.get("headOffice");

		if (headOffice != null) {
			setHeadOffice(headOffice);
		}

		String administrationOffice = (String)attributes.get(
			"administrationOffice");

		if (administrationOffice != null) {
			setAdministrationOffice(administrationOffice);
		}

		String productionProcessing = (String)attributes.get(
			"productionProcessing");

		if (productionProcessing != null) {
			setProductionProcessing(productionProcessing);
		}

		String maintenanceService = (String)attributes.get(
			"maintenanceService");

		if (maintenanceService != null) {
			setMaintenanceService(maintenanceService);
		}

		String logistics = (String)attributes.get("logistics");

		if (logistics != null) {
			setLogistics(logistics);
		}

		String total = (String)attributes.get("total");

		if (total != null) {
			setTotal(total);
		}

		String seasonal = (String)attributes.get("seasonal");

		if (seasonal != null) {
			setSeasonal(seasonal);
		}

		String temporary = (String)attributes.get("temporary");

		if (temporary != null) {
			setTemporary(temporary);
		}

		String subcontracted = (String)attributes.get("subcontracted");

		if (subcontracted != null) {
			setSubcontracted(subcontracted);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjNumOfEmpAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the administration office of this ncbj num of emp add.
	 *
	 * @return the administration office of this ncbj num of emp add
	 */
	@Override
	public String getAdministrationOffice() {
		return model.getAdministrationOffice();
	}

	/**
	 * Returns the company ID of this ncbj num of emp add.
	 *
	 * @return the company ID of this ncbj num of emp add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this ncbj num of emp add.
	 *
	 * @return the counter of this ncbj num of emp add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncbj num of emp add.
	 *
	 * @return the create date of this ncbj num of emp add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj num of emp add.
	 *
	 * @return the group ID of this ncbj num of emp add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the head office of this ncbj num of emp add.
	 *
	 * @return the head office of this ncbj num of emp add
	 */
	@Override
	public String getHeadOffice() {
		return model.getHeadOffice();
	}

	/**
	 * Returns the logistics of this ncbj num of emp add.
	 *
	 * @return the logistics of this ncbj num of emp add
	 */
	@Override
	public String getLogistics() {
		return model.getLogistics();
	}

	/**
	 * Returns the maintenance service of this ncbj num of emp add.
	 *
	 * @return the maintenance service of this ncbj num of emp add
	 */
	@Override
	public String getMaintenanceService() {
		return model.getMaintenanceService();
	}

	/**
	 * Returns the modified date of this ncbj num of emp add.
	 *
	 * @return the modified date of this ncbj num of emp add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj num of emp add.
	 *
	 * @return the ncbj application ID of this ncbj num of emp add
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj num of emp add ID of this ncbj num of emp add.
	 *
	 * @return the ncbj num of emp add ID of this ncbj num of emp add
	 */
	@Override
	public long getNcbjNumOfEmpAddId() {
		return model.getNcbjNumOfEmpAddId();
	}

	/**
	 * Returns the primary key of this ncbj num of emp add.
	 *
	 * @return the primary key of this ncbj num of emp add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the production processing of this ncbj num of emp add.
	 *
	 * @return the production processing of this ncbj num of emp add
	 */
	@Override
	public String getProductionProcessing() {
		return model.getProductionProcessing();
	}

	/**
	 * Returns the seasonal of this ncbj num of emp add.
	 *
	 * @return the seasonal of this ncbj num of emp add
	 */
	@Override
	public String getSeasonal() {
		return model.getSeasonal();
	}

	/**
	 * Returns the subcontracted of this ncbj num of emp add.
	 *
	 * @return the subcontracted of this ncbj num of emp add
	 */
	@Override
	public String getSubcontracted() {
		return model.getSubcontracted();
	}

	/**
	 * Returns the temporary of this ncbj num of emp add.
	 *
	 * @return the temporary of this ncbj num of emp add
	 */
	@Override
	public String getTemporary() {
		return model.getTemporary();
	}

	/**
	 * Returns the total of this ncbj num of emp add.
	 *
	 * @return the total of this ncbj num of emp add
	 */
	@Override
	public String getTotal() {
		return model.getTotal();
	}

	/**
	 * Returns the user ID of this ncbj num of emp add.
	 *
	 * @return the user ID of this ncbj num of emp add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj num of emp add.
	 *
	 * @return the user name of this ncbj num of emp add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj num of emp add.
	 *
	 * @return the user uuid of this ncbj num of emp add
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the administration office of this ncbj num of emp add.
	 *
	 * @param administrationOffice the administration office of this ncbj num of emp add
	 */
	@Override
	public void setAdministrationOffice(String administrationOffice) {
		model.setAdministrationOffice(administrationOffice);
	}

	/**
	 * Sets the company ID of this ncbj num of emp add.
	 *
	 * @param companyId the company ID of this ncbj num of emp add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this ncbj num of emp add.
	 *
	 * @param counter the counter of this ncbj num of emp add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncbj num of emp add.
	 *
	 * @param createDate the create date of this ncbj num of emp add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj num of emp add.
	 *
	 * @param groupId the group ID of this ncbj num of emp add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the head office of this ncbj num of emp add.
	 *
	 * @param headOffice the head office of this ncbj num of emp add
	 */
	@Override
	public void setHeadOffice(String headOffice) {
		model.setHeadOffice(headOffice);
	}

	/**
	 * Sets the logistics of this ncbj num of emp add.
	 *
	 * @param logistics the logistics of this ncbj num of emp add
	 */
	@Override
	public void setLogistics(String logistics) {
		model.setLogistics(logistics);
	}

	/**
	 * Sets the maintenance service of this ncbj num of emp add.
	 *
	 * @param maintenanceService the maintenance service of this ncbj num of emp add
	 */
	@Override
	public void setMaintenanceService(String maintenanceService) {
		model.setMaintenanceService(maintenanceService);
	}

	/**
	 * Sets the modified date of this ncbj num of emp add.
	 *
	 * @param modifiedDate the modified date of this ncbj num of emp add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj num of emp add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj num of emp add
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj num of emp add ID of this ncbj num of emp add.
	 *
	 * @param ncbjNumOfEmpAddId the ncbj num of emp add ID of this ncbj num of emp add
	 */
	@Override
	public void setNcbjNumOfEmpAddId(long ncbjNumOfEmpAddId) {
		model.setNcbjNumOfEmpAddId(ncbjNumOfEmpAddId);
	}

	/**
	 * Sets the primary key of this ncbj num of emp add.
	 *
	 * @param primaryKey the primary key of this ncbj num of emp add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the production processing of this ncbj num of emp add.
	 *
	 * @param productionProcessing the production processing of this ncbj num of emp add
	 */
	@Override
	public void setProductionProcessing(String productionProcessing) {
		model.setProductionProcessing(productionProcessing);
	}

	/**
	 * Sets the seasonal of this ncbj num of emp add.
	 *
	 * @param seasonal the seasonal of this ncbj num of emp add
	 */
	@Override
	public void setSeasonal(String seasonal) {
		model.setSeasonal(seasonal);
	}

	/**
	 * Sets the subcontracted of this ncbj num of emp add.
	 *
	 * @param subcontracted the subcontracted of this ncbj num of emp add
	 */
	@Override
	public void setSubcontracted(String subcontracted) {
		model.setSubcontracted(subcontracted);
	}

	/**
	 * Sets the temporary of this ncbj num of emp add.
	 *
	 * @param temporary the temporary of this ncbj num of emp add
	 */
	@Override
	public void setTemporary(String temporary) {
		model.setTemporary(temporary);
	}

	/**
	 * Sets the total of this ncbj num of emp add.
	 *
	 * @param total the total of this ncbj num of emp add
	 */
	@Override
	public void setTotal(String total) {
		model.setTotal(total);
	}

	/**
	 * Sets the user ID of this ncbj num of emp add.
	 *
	 * @param userId the user ID of this ncbj num of emp add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj num of emp add.
	 *
	 * @param userName the user name of this ncbj num of emp add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj num of emp add.
	 *
	 * @param userUuid the user uuid of this ncbj num of emp add
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected NcbjNumOfEmpAddWrapper wrap(NcbjNumOfEmpAdd ncbjNumOfEmpAdd) {
		return new NcbjNumOfEmpAddWrapper(ncbjNumOfEmpAdd);
	}

}
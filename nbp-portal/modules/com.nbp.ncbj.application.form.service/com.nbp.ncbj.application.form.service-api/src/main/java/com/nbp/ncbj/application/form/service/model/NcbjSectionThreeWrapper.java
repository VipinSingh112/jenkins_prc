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
 * This class is a wrapper for {@link NcbjSectionThree}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionThree
 * @generated
 */
public class NcbjSectionThreeWrapper
	extends BaseModelWrapper<NcbjSectionThree>
	implements ModelWrapper<NcbjSectionThree>, NcbjSectionThree {

	public NcbjSectionThreeWrapper(NcbjSectionThree ncbjSectionThree) {
		super(ncbjSectionThree);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjSectionThreeId", getNcbjSectionThreeId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"processActivityDescription", getProcessActivityDescription());
		attributes.put("incomingMaterialsDes", getIncomingMaterialsDes());
		attributes.put("processDescription", getProcessDescription());
		attributes.put("processActivitiesList", getProcessActivitiesList());
		attributes.put("specialActivities", getSpecialActivities());
		attributes.put("explainationBox", getExplainationBox());
		attributes.put("categoryOne", getCategoryOne());
		attributes.put("categoryTwo", getCategoryTwo());
		attributes.put("categoryThree", getCategoryThree());
		attributes.put("categoryFour", getCategoryFour());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjSectionThreeId = (Long)attributes.get("ncbjSectionThreeId");

		if (ncbjSectionThreeId != null) {
			setNcbjSectionThreeId(ncbjSectionThreeId);
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

		String processActivityDescription = (String)attributes.get(
			"processActivityDescription");

		if (processActivityDescription != null) {
			setProcessActivityDescription(processActivityDescription);
		}

		String incomingMaterialsDes = (String)attributes.get(
			"incomingMaterialsDes");

		if (incomingMaterialsDes != null) {
			setIncomingMaterialsDes(incomingMaterialsDes);
		}

		String processDescription = (String)attributes.get(
			"processDescription");

		if (processDescription != null) {
			setProcessDescription(processDescription);
		}

		String processActivitiesList = (String)attributes.get(
			"processActivitiesList");

		if (processActivitiesList != null) {
			setProcessActivitiesList(processActivitiesList);
		}

		String specialActivities = (String)attributes.get("specialActivities");

		if (specialActivities != null) {
			setSpecialActivities(specialActivities);
		}

		String explainationBox = (String)attributes.get("explainationBox");

		if (explainationBox != null) {
			setExplainationBox(explainationBox);
		}

		String categoryOne = (String)attributes.get("categoryOne");

		if (categoryOne != null) {
			setCategoryOne(categoryOne);
		}

		String categoryTwo = (String)attributes.get("categoryTwo");

		if (categoryTwo != null) {
			setCategoryTwo(categoryTwo);
		}

		String categoryThree = (String)attributes.get("categoryThree");

		if (categoryThree != null) {
			setCategoryThree(categoryThree);
		}

		String categoryFour = (String)attributes.get("categoryFour");

		if (categoryFour != null) {
			setCategoryFour(categoryFour);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjSectionThree cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category four of this ncbj section three.
	 *
	 * @return the category four of this ncbj section three
	 */
	@Override
	public String getCategoryFour() {
		return model.getCategoryFour();
	}

	/**
	 * Returns the category one of this ncbj section three.
	 *
	 * @return the category one of this ncbj section three
	 */
	@Override
	public String getCategoryOne() {
		return model.getCategoryOne();
	}

	/**
	 * Returns the category three of this ncbj section three.
	 *
	 * @return the category three of this ncbj section three
	 */
	@Override
	public String getCategoryThree() {
		return model.getCategoryThree();
	}

	/**
	 * Returns the category two of this ncbj section three.
	 *
	 * @return the category two of this ncbj section three
	 */
	@Override
	public String getCategoryTwo() {
		return model.getCategoryTwo();
	}

	/**
	 * Returns the company ID of this ncbj section three.
	 *
	 * @return the company ID of this ncbj section three
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj section three.
	 *
	 * @return the create date of this ncbj section three
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the explaination box of this ncbj section three.
	 *
	 * @return the explaination box of this ncbj section three
	 */
	@Override
	public String getExplainationBox() {
		return model.getExplainationBox();
	}

	/**
	 * Returns the group ID of this ncbj section three.
	 *
	 * @return the group ID of this ncbj section three
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the incoming materials des of this ncbj section three.
	 *
	 * @return the incoming materials des of this ncbj section three
	 */
	@Override
	public String getIncomingMaterialsDes() {
		return model.getIncomingMaterialsDes();
	}

	/**
	 * Returns the modified date of this ncbj section three.
	 *
	 * @return the modified date of this ncbj section three
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj section three.
	 *
	 * @return the ncbj application ID of this ncbj section three
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj section three ID of this ncbj section three.
	 *
	 * @return the ncbj section three ID of this ncbj section three
	 */
	@Override
	public long getNcbjSectionThreeId() {
		return model.getNcbjSectionThreeId();
	}

	/**
	 * Returns the primary key of this ncbj section three.
	 *
	 * @return the primary key of this ncbj section three
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the process activities list of this ncbj section three.
	 *
	 * @return the process activities list of this ncbj section three
	 */
	@Override
	public String getProcessActivitiesList() {
		return model.getProcessActivitiesList();
	}

	/**
	 * Returns the process activity description of this ncbj section three.
	 *
	 * @return the process activity description of this ncbj section three
	 */
	@Override
	public String getProcessActivityDescription() {
		return model.getProcessActivityDescription();
	}

	/**
	 * Returns the process description of this ncbj section three.
	 *
	 * @return the process description of this ncbj section three
	 */
	@Override
	public String getProcessDescription() {
		return model.getProcessDescription();
	}

	/**
	 * Returns the special activities of this ncbj section three.
	 *
	 * @return the special activities of this ncbj section three
	 */
	@Override
	public String getSpecialActivities() {
		return model.getSpecialActivities();
	}

	/**
	 * Returns the user ID of this ncbj section three.
	 *
	 * @return the user ID of this ncbj section three
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj section three.
	 *
	 * @return the user name of this ncbj section three
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj section three.
	 *
	 * @return the user uuid of this ncbj section three
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
	 * Sets the category four of this ncbj section three.
	 *
	 * @param categoryFour the category four of this ncbj section three
	 */
	@Override
	public void setCategoryFour(String categoryFour) {
		model.setCategoryFour(categoryFour);
	}

	/**
	 * Sets the category one of this ncbj section three.
	 *
	 * @param categoryOne the category one of this ncbj section three
	 */
	@Override
	public void setCategoryOne(String categoryOne) {
		model.setCategoryOne(categoryOne);
	}

	/**
	 * Sets the category three of this ncbj section three.
	 *
	 * @param categoryThree the category three of this ncbj section three
	 */
	@Override
	public void setCategoryThree(String categoryThree) {
		model.setCategoryThree(categoryThree);
	}

	/**
	 * Sets the category two of this ncbj section three.
	 *
	 * @param categoryTwo the category two of this ncbj section three
	 */
	@Override
	public void setCategoryTwo(String categoryTwo) {
		model.setCategoryTwo(categoryTwo);
	}

	/**
	 * Sets the company ID of this ncbj section three.
	 *
	 * @param companyId the company ID of this ncbj section three
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj section three.
	 *
	 * @param createDate the create date of this ncbj section three
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the explaination box of this ncbj section three.
	 *
	 * @param explainationBox the explaination box of this ncbj section three
	 */
	@Override
	public void setExplainationBox(String explainationBox) {
		model.setExplainationBox(explainationBox);
	}

	/**
	 * Sets the group ID of this ncbj section three.
	 *
	 * @param groupId the group ID of this ncbj section three
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the incoming materials des of this ncbj section three.
	 *
	 * @param incomingMaterialsDes the incoming materials des of this ncbj section three
	 */
	@Override
	public void setIncomingMaterialsDes(String incomingMaterialsDes) {
		model.setIncomingMaterialsDes(incomingMaterialsDes);
	}

	/**
	 * Sets the modified date of this ncbj section three.
	 *
	 * @param modifiedDate the modified date of this ncbj section three
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj section three.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj section three
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj section three ID of this ncbj section three.
	 *
	 * @param ncbjSectionThreeId the ncbj section three ID of this ncbj section three
	 */
	@Override
	public void setNcbjSectionThreeId(long ncbjSectionThreeId) {
		model.setNcbjSectionThreeId(ncbjSectionThreeId);
	}

	/**
	 * Sets the primary key of this ncbj section three.
	 *
	 * @param primaryKey the primary key of this ncbj section three
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the process activities list of this ncbj section three.
	 *
	 * @param processActivitiesList the process activities list of this ncbj section three
	 */
	@Override
	public void setProcessActivitiesList(String processActivitiesList) {
		model.setProcessActivitiesList(processActivitiesList);
	}

	/**
	 * Sets the process activity description of this ncbj section three.
	 *
	 * @param processActivityDescription the process activity description of this ncbj section three
	 */
	@Override
	public void setProcessActivityDescription(
		String processActivityDescription) {

		model.setProcessActivityDescription(processActivityDescription);
	}

	/**
	 * Sets the process description of this ncbj section three.
	 *
	 * @param processDescription the process description of this ncbj section three
	 */
	@Override
	public void setProcessDescription(String processDescription) {
		model.setProcessDescription(processDescription);
	}

	/**
	 * Sets the special activities of this ncbj section three.
	 *
	 * @param specialActivities the special activities of this ncbj section three
	 */
	@Override
	public void setSpecialActivities(String specialActivities) {
		model.setSpecialActivities(specialActivities);
	}

	/**
	 * Sets the user ID of this ncbj section three.
	 *
	 * @param userId the user ID of this ncbj section three
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj section three.
	 *
	 * @param userName the user name of this ncbj section three
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj section three.
	 *
	 * @param userUuid the user uuid of this ncbj section three
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
	protected NcbjSectionThreeWrapper wrap(NcbjSectionThree ncbjSectionThree) {
		return new NcbjSectionThreeWrapper(ncbjSectionThree);
	}

}
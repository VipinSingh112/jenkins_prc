/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionWaterSport}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionWaterSport
 * @generated
 */
public class AttractionWaterSportWrapper
	extends BaseModelWrapper<AttractionWaterSport>
	implements AttractionWaterSport, ModelWrapper<AttractionWaterSport> {

	public AttractionWaterSportWrapper(
		AttractionWaterSport attractionWaterSport) {

		super(attractionWaterSport);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("attractionWaterSportId", getAttractionWaterSportId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("waterSportBusinessName", getWaterSportBusinessName());
		attributes.put("waterSportMailingaAdd", getWaterSportMailingaAdd());
		attributes.put(
			"waterSportOpLocationAddr", getWaterSportOpLocationAddr());
		attributes.put("waterSportOpPhone", getWaterSportOpPhone());
		attributes.put("waterSportOpEmail", getWaterSportOpEmail());
		attributes.put("waterSportOpOwnerName", getWaterSportOpOwnerName());
		attributes.put(
			"waterSportOpAddressOwner", getWaterSportOpAddressOwner());
		attributes.put("waterSportOpManagerName", getWaterSportOpManagerName());
		attributes.put(
			"waterSportOpApplicantName", getWaterSportOpApplicantName());
		attributes.put("waterSportOpNationality", getWaterSportOpNationality());
		attributes.put("waterSportOpEmployeesNo", getWaterSportOpEmployeesNo());
		attributes.put(
			"waterSportOpActivityList", getWaterSportOpActivityList());
		attributes.put("occupyLocation", getOccupyLocation());
		attributes.put("proposalSubmitted", getProposalSubmitted());
		attributes.put(
			"foreignNationalsInvolved", getForeignNationalsInvolved());
		attributes.put("workPermitApplied", getWorkPermitApplied());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionWaterSportId = (Long)attributes.get(
			"attractionWaterSportId");

		if (attractionWaterSportId != null) {
			setAttractionWaterSportId(attractionWaterSportId);
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

		String waterSportBusinessName = (String)attributes.get(
			"waterSportBusinessName");

		if (waterSportBusinessName != null) {
			setWaterSportBusinessName(waterSportBusinessName);
		}

		String waterSportMailingaAdd = (String)attributes.get(
			"waterSportMailingaAdd");

		if (waterSportMailingaAdd != null) {
			setWaterSportMailingaAdd(waterSportMailingaAdd);
		}

		String waterSportOpLocationAddr = (String)attributes.get(
			"waterSportOpLocationAddr");

		if (waterSportOpLocationAddr != null) {
			setWaterSportOpLocationAddr(waterSportOpLocationAddr);
		}

		String waterSportOpPhone = (String)attributes.get("waterSportOpPhone");

		if (waterSportOpPhone != null) {
			setWaterSportOpPhone(waterSportOpPhone);
		}

		String waterSportOpEmail = (String)attributes.get("waterSportOpEmail");

		if (waterSportOpEmail != null) {
			setWaterSportOpEmail(waterSportOpEmail);
		}

		String waterSportOpOwnerName = (String)attributes.get(
			"waterSportOpOwnerName");

		if (waterSportOpOwnerName != null) {
			setWaterSportOpOwnerName(waterSportOpOwnerName);
		}

		String waterSportOpAddressOwner = (String)attributes.get(
			"waterSportOpAddressOwner");

		if (waterSportOpAddressOwner != null) {
			setWaterSportOpAddressOwner(waterSportOpAddressOwner);
		}

		String waterSportOpManagerName = (String)attributes.get(
			"waterSportOpManagerName");

		if (waterSportOpManagerName != null) {
			setWaterSportOpManagerName(waterSportOpManagerName);
		}

		String waterSportOpApplicantName = (String)attributes.get(
			"waterSportOpApplicantName");

		if (waterSportOpApplicantName != null) {
			setWaterSportOpApplicantName(waterSportOpApplicantName);
		}

		String waterSportOpNationality = (String)attributes.get(
			"waterSportOpNationality");

		if (waterSportOpNationality != null) {
			setWaterSportOpNationality(waterSportOpNationality);
		}

		String waterSportOpEmployeesNo = (String)attributes.get(
			"waterSportOpEmployeesNo");

		if (waterSportOpEmployeesNo != null) {
			setWaterSportOpEmployeesNo(waterSportOpEmployeesNo);
		}

		String waterSportOpActivityList = (String)attributes.get(
			"waterSportOpActivityList");

		if (waterSportOpActivityList != null) {
			setWaterSportOpActivityList(waterSportOpActivityList);
		}

		String occupyLocation = (String)attributes.get("occupyLocation");

		if (occupyLocation != null) {
			setOccupyLocation(occupyLocation);
		}

		String proposalSubmitted = (String)attributes.get("proposalSubmitted");

		if (proposalSubmitted != null) {
			setProposalSubmitted(proposalSubmitted);
		}

		String foreignNationalsInvolved = (String)attributes.get(
			"foreignNationalsInvolved");

		if (foreignNationalsInvolved != null) {
			setForeignNationalsInvolved(foreignNationalsInvolved);
		}

		String workPermitApplied = (String)attributes.get("workPermitApplied");

		if (workPermitApplied != null) {
			setWorkPermitApplied(workPermitApplied);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionWaterSport cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction water sport ID of this attraction water sport.
	 *
	 * @return the attraction water sport ID of this attraction water sport
	 */
	@Override
	public long getAttractionWaterSportId() {
		return model.getAttractionWaterSportId();
	}

	/**
	 * Returns the company ID of this attraction water sport.
	 *
	 * @return the company ID of this attraction water sport
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction water sport.
	 *
	 * @return the create date of this attraction water sport
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the foreign nationals involved of this attraction water sport.
	 *
	 * @return the foreign nationals involved of this attraction water sport
	 */
	@Override
	public String getForeignNationalsInvolved() {
		return model.getForeignNationalsInvolved();
	}

	/**
	 * Returns the group ID of this attraction water sport.
	 *
	 * @return the group ID of this attraction water sport
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction water sport.
	 *
	 * @return the jtb application ID of this attraction water sport
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction water sport.
	 *
	 * @return the modified date of this attraction water sport
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occupy location of this attraction water sport.
	 *
	 * @return the occupy location of this attraction water sport
	 */
	@Override
	public String getOccupyLocation() {
		return model.getOccupyLocation();
	}

	/**
	 * Returns the primary key of this attraction water sport.
	 *
	 * @return the primary key of this attraction water sport
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the proposal submitted of this attraction water sport.
	 *
	 * @return the proposal submitted of this attraction water sport
	 */
	@Override
	public String getProposalSubmitted() {
		return model.getProposalSubmitted();
	}

	/**
	 * Returns the user ID of this attraction water sport.
	 *
	 * @return the user ID of this attraction water sport
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction water sport.
	 *
	 * @return the user name of this attraction water sport
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction water sport.
	 *
	 * @return the user uuid of this attraction water sport
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the water sport business name of this attraction water sport.
	 *
	 * @return the water sport business name of this attraction water sport
	 */
	@Override
	public String getWaterSportBusinessName() {
		return model.getWaterSportBusinessName();
	}

	/**
	 * Returns the water sport mailinga add of this attraction water sport.
	 *
	 * @return the water sport mailinga add of this attraction water sport
	 */
	@Override
	public String getWaterSportMailingaAdd() {
		return model.getWaterSportMailingaAdd();
	}

	/**
	 * Returns the water sport op activity list of this attraction water sport.
	 *
	 * @return the water sport op activity list of this attraction water sport
	 */
	@Override
	public String getWaterSportOpActivityList() {
		return model.getWaterSportOpActivityList();
	}

	/**
	 * Returns the water sport op address owner of this attraction water sport.
	 *
	 * @return the water sport op address owner of this attraction water sport
	 */
	@Override
	public String getWaterSportOpAddressOwner() {
		return model.getWaterSportOpAddressOwner();
	}

	/**
	 * Returns the water sport op applicant name of this attraction water sport.
	 *
	 * @return the water sport op applicant name of this attraction water sport
	 */
	@Override
	public String getWaterSportOpApplicantName() {
		return model.getWaterSportOpApplicantName();
	}

	/**
	 * Returns the water sport op email of this attraction water sport.
	 *
	 * @return the water sport op email of this attraction water sport
	 */
	@Override
	public String getWaterSportOpEmail() {
		return model.getWaterSportOpEmail();
	}

	/**
	 * Returns the water sport op employees no of this attraction water sport.
	 *
	 * @return the water sport op employees no of this attraction water sport
	 */
	@Override
	public String getWaterSportOpEmployeesNo() {
		return model.getWaterSportOpEmployeesNo();
	}

	/**
	 * Returns the water sport op location addr of this attraction water sport.
	 *
	 * @return the water sport op location addr of this attraction water sport
	 */
	@Override
	public String getWaterSportOpLocationAddr() {
		return model.getWaterSportOpLocationAddr();
	}

	/**
	 * Returns the water sport op manager name of this attraction water sport.
	 *
	 * @return the water sport op manager name of this attraction water sport
	 */
	@Override
	public String getWaterSportOpManagerName() {
		return model.getWaterSportOpManagerName();
	}

	/**
	 * Returns the water sport op nationality of this attraction water sport.
	 *
	 * @return the water sport op nationality of this attraction water sport
	 */
	@Override
	public String getWaterSportOpNationality() {
		return model.getWaterSportOpNationality();
	}

	/**
	 * Returns the water sport op owner name of this attraction water sport.
	 *
	 * @return the water sport op owner name of this attraction water sport
	 */
	@Override
	public String getWaterSportOpOwnerName() {
		return model.getWaterSportOpOwnerName();
	}

	/**
	 * Returns the water sport op phone of this attraction water sport.
	 *
	 * @return the water sport op phone of this attraction water sport
	 */
	@Override
	public String getWaterSportOpPhone() {
		return model.getWaterSportOpPhone();
	}

	/**
	 * Returns the work permit applied of this attraction water sport.
	 *
	 * @return the work permit applied of this attraction water sport
	 */
	@Override
	public String getWorkPermitApplied() {
		return model.getWorkPermitApplied();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the attraction water sport ID of this attraction water sport.
	 *
	 * @param attractionWaterSportId the attraction water sport ID of this attraction water sport
	 */
	@Override
	public void setAttractionWaterSportId(long attractionWaterSportId) {
		model.setAttractionWaterSportId(attractionWaterSportId);
	}

	/**
	 * Sets the company ID of this attraction water sport.
	 *
	 * @param companyId the company ID of this attraction water sport
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction water sport.
	 *
	 * @param createDate the create date of this attraction water sport
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the foreign nationals involved of this attraction water sport.
	 *
	 * @param foreignNationalsInvolved the foreign nationals involved of this attraction water sport
	 */
	@Override
	public void setForeignNationalsInvolved(String foreignNationalsInvolved) {
		model.setForeignNationalsInvolved(foreignNationalsInvolved);
	}

	/**
	 * Sets the group ID of this attraction water sport.
	 *
	 * @param groupId the group ID of this attraction water sport
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction water sport.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction water sport
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction water sport.
	 *
	 * @param modifiedDate the modified date of this attraction water sport
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occupy location of this attraction water sport.
	 *
	 * @param occupyLocation the occupy location of this attraction water sport
	 */
	@Override
	public void setOccupyLocation(String occupyLocation) {
		model.setOccupyLocation(occupyLocation);
	}

	/**
	 * Sets the primary key of this attraction water sport.
	 *
	 * @param primaryKey the primary key of this attraction water sport
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the proposal submitted of this attraction water sport.
	 *
	 * @param proposalSubmitted the proposal submitted of this attraction water sport
	 */
	@Override
	public void setProposalSubmitted(String proposalSubmitted) {
		model.setProposalSubmitted(proposalSubmitted);
	}

	/**
	 * Sets the user ID of this attraction water sport.
	 *
	 * @param userId the user ID of this attraction water sport
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction water sport.
	 *
	 * @param userName the user name of this attraction water sport
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction water sport.
	 *
	 * @param userUuid the user uuid of this attraction water sport
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the water sport business name of this attraction water sport.
	 *
	 * @param waterSportBusinessName the water sport business name of this attraction water sport
	 */
	@Override
	public void setWaterSportBusinessName(String waterSportBusinessName) {
		model.setWaterSportBusinessName(waterSportBusinessName);
	}

	/**
	 * Sets the water sport mailinga add of this attraction water sport.
	 *
	 * @param waterSportMailingaAdd the water sport mailinga add of this attraction water sport
	 */
	@Override
	public void setWaterSportMailingaAdd(String waterSportMailingaAdd) {
		model.setWaterSportMailingaAdd(waterSportMailingaAdd);
	}

	/**
	 * Sets the water sport op activity list of this attraction water sport.
	 *
	 * @param waterSportOpActivityList the water sport op activity list of this attraction water sport
	 */
	@Override
	public void setWaterSportOpActivityList(String waterSportOpActivityList) {
		model.setWaterSportOpActivityList(waterSportOpActivityList);
	}

	/**
	 * Sets the water sport op address owner of this attraction water sport.
	 *
	 * @param waterSportOpAddressOwner the water sport op address owner of this attraction water sport
	 */
	@Override
	public void setWaterSportOpAddressOwner(String waterSportOpAddressOwner) {
		model.setWaterSportOpAddressOwner(waterSportOpAddressOwner);
	}

	/**
	 * Sets the water sport op applicant name of this attraction water sport.
	 *
	 * @param waterSportOpApplicantName the water sport op applicant name of this attraction water sport
	 */
	@Override
	public void setWaterSportOpApplicantName(String waterSportOpApplicantName) {
		model.setWaterSportOpApplicantName(waterSportOpApplicantName);
	}

	/**
	 * Sets the water sport op email of this attraction water sport.
	 *
	 * @param waterSportOpEmail the water sport op email of this attraction water sport
	 */
	@Override
	public void setWaterSportOpEmail(String waterSportOpEmail) {
		model.setWaterSportOpEmail(waterSportOpEmail);
	}

	/**
	 * Sets the water sport op employees no of this attraction water sport.
	 *
	 * @param waterSportOpEmployeesNo the water sport op employees no of this attraction water sport
	 */
	@Override
	public void setWaterSportOpEmployeesNo(String waterSportOpEmployeesNo) {
		model.setWaterSportOpEmployeesNo(waterSportOpEmployeesNo);
	}

	/**
	 * Sets the water sport op location addr of this attraction water sport.
	 *
	 * @param waterSportOpLocationAddr the water sport op location addr of this attraction water sport
	 */
	@Override
	public void setWaterSportOpLocationAddr(String waterSportOpLocationAddr) {
		model.setWaterSportOpLocationAddr(waterSportOpLocationAddr);
	}

	/**
	 * Sets the water sport op manager name of this attraction water sport.
	 *
	 * @param waterSportOpManagerName the water sport op manager name of this attraction water sport
	 */
	@Override
	public void setWaterSportOpManagerName(String waterSportOpManagerName) {
		model.setWaterSportOpManagerName(waterSportOpManagerName);
	}

	/**
	 * Sets the water sport op nationality of this attraction water sport.
	 *
	 * @param waterSportOpNationality the water sport op nationality of this attraction water sport
	 */
	@Override
	public void setWaterSportOpNationality(String waterSportOpNationality) {
		model.setWaterSportOpNationality(waterSportOpNationality);
	}

	/**
	 * Sets the water sport op owner name of this attraction water sport.
	 *
	 * @param waterSportOpOwnerName the water sport op owner name of this attraction water sport
	 */
	@Override
	public void setWaterSportOpOwnerName(String waterSportOpOwnerName) {
		model.setWaterSportOpOwnerName(waterSportOpOwnerName);
	}

	/**
	 * Sets the water sport op phone of this attraction water sport.
	 *
	 * @param waterSportOpPhone the water sport op phone of this attraction water sport
	 */
	@Override
	public void setWaterSportOpPhone(String waterSportOpPhone) {
		model.setWaterSportOpPhone(waterSportOpPhone);
	}

	/**
	 * Sets the work permit applied of this attraction water sport.
	 *
	 * @param workPermitApplied the work permit applied of this attraction water sport
	 */
	@Override
	public void setWorkPermitApplied(String workPermitApplied) {
		model.setWorkPermitApplied(workPermitApplied);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected AttractionWaterSportWrapper wrap(
		AttractionWaterSport attractionWaterSport) {

		return new AttractionWaterSportWrapper(attractionWaterSport);
	}

}
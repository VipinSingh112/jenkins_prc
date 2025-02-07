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
 * This class is a wrapper for {@link NcbjCompanyDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjCompanyDetail
 * @generated
 */
public class NcbjCompanyDetailWrapper
	extends BaseModelWrapper<NcbjCompanyDetail>
	implements ModelWrapper<NcbjCompanyDetail>, NcbjCompanyDetail {

	public NcbjCompanyDetailWrapper(NcbjCompanyDetail ncbjCompanyDetail) {
		super(ncbjCompanyDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjCompanyDetailId", getNcbjCompanyDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyNameOrHeadOffice", getCompanyNameOrHeadOffice());
		attributes.put("companyAddress", getCompanyAddress());
		attributes.put("stageOne", getStageOne());
		attributes.put("stageTwo", getStageTwo());
		attributes.put("surveillanceAudit", getSurveillanceAudit());
		attributes.put("recertificationAudit", getRecertificationAudit());
		attributes.put("preAassessmentAudit", getPreAassessmentAudit());
		attributes.put("anyOtherService ", getAnyOtherService());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjCompanyDetailId = (Long)attributes.get("ncbjCompanyDetailId");

		if (ncbjCompanyDetailId != null) {
			setNcbjCompanyDetailId(ncbjCompanyDetailId);
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

		String companyNameOrHeadOffice = (String)attributes.get(
			"companyNameOrHeadOffice");

		if (companyNameOrHeadOffice != null) {
			setCompanyNameOrHeadOffice(companyNameOrHeadOffice);
		}

		String companyAddress = (String)attributes.get("companyAddress");

		if (companyAddress != null) {
			setCompanyAddress(companyAddress);
		}

		Date stageOne = (Date)attributes.get("stageOne");

		if (stageOne != null) {
			setStageOne(stageOne);
		}

		Date stageTwo = (Date)attributes.get("stageTwo");

		if (stageTwo != null) {
			setStageTwo(stageTwo);
		}

		Date surveillanceAudit = (Date)attributes.get("surveillanceAudit");

		if (surveillanceAudit != null) {
			setSurveillanceAudit(surveillanceAudit);
		}

		Date recertificationAudit = (Date)attributes.get(
			"recertificationAudit");

		if (recertificationAudit != null) {
			setRecertificationAudit(recertificationAudit);
		}

		Date preAassessmentAudit = (Date)attributes.get("preAassessmentAudit");

		if (preAassessmentAudit != null) {
			setPreAassessmentAudit(preAassessmentAudit);
		}

		Date anyOtherService = (Date)attributes.get("anyOtherService ");

		if (anyOtherService != null) {
			setAnyOtherService(anyOtherService);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjCompanyDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the any other service of this ncbj company detail.
	 *
	 * @return the any other service of this ncbj company detail
	 */
	@Override
	public Date getAnyOtherService() {
		return model.getAnyOtherService();
	}

	/**
	 * Returns the company address of this ncbj company detail.
	 *
	 * @return the company address of this ncbj company detail
	 */
	@Override
	public String getCompanyAddress() {
		return model.getCompanyAddress();
	}

	/**
	 * Returns the company ID of this ncbj company detail.
	 *
	 * @return the company ID of this ncbj company detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name or head office of this ncbj company detail.
	 *
	 * @return the company name or head office of this ncbj company detail
	 */
	@Override
	public String getCompanyNameOrHeadOffice() {
		return model.getCompanyNameOrHeadOffice();
	}

	/**
	 * Returns the create date of this ncbj company detail.
	 *
	 * @return the create date of this ncbj company detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj company detail.
	 *
	 * @return the group ID of this ncbj company detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj company detail.
	 *
	 * @return the modified date of this ncbj company detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj company detail.
	 *
	 * @return the ncbj application ID of this ncbj company detail
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj company detail ID of this ncbj company detail.
	 *
	 * @return the ncbj company detail ID of this ncbj company detail
	 */
	@Override
	public long getNcbjCompanyDetailId() {
		return model.getNcbjCompanyDetailId();
	}

	/**
	 * Returns the pre aassessment audit of this ncbj company detail.
	 *
	 * @return the pre aassessment audit of this ncbj company detail
	 */
	@Override
	public Date getPreAassessmentAudit() {
		return model.getPreAassessmentAudit();
	}

	/**
	 * Returns the primary key of this ncbj company detail.
	 *
	 * @return the primary key of this ncbj company detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the recertification audit of this ncbj company detail.
	 *
	 * @return the recertification audit of this ncbj company detail
	 */
	@Override
	public Date getRecertificationAudit() {
		return model.getRecertificationAudit();
	}

	/**
	 * Returns the stage one of this ncbj company detail.
	 *
	 * @return the stage one of this ncbj company detail
	 */
	@Override
	public Date getStageOne() {
		return model.getStageOne();
	}

	/**
	 * Returns the stage two of this ncbj company detail.
	 *
	 * @return the stage two of this ncbj company detail
	 */
	@Override
	public Date getStageTwo() {
		return model.getStageTwo();
	}

	/**
	 * Returns the surveillance audit of this ncbj company detail.
	 *
	 * @return the surveillance audit of this ncbj company detail
	 */
	@Override
	public Date getSurveillanceAudit() {
		return model.getSurveillanceAudit();
	}

	/**
	 * Returns the user ID of this ncbj company detail.
	 *
	 * @return the user ID of this ncbj company detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj company detail.
	 *
	 * @return the user name of this ncbj company detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj company detail.
	 *
	 * @return the user uuid of this ncbj company detail
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
	 * Sets the any other service of this ncbj company detail.
	 *
	 * @param anyOtherService  the any other service of this ncbj company detail
	 */
	@Override
	public void setAnyOtherService(Date anyOtherService) {
		model.setAnyOtherService(anyOtherService);
	}

	/**
	 * Sets the company address of this ncbj company detail.
	 *
	 * @param companyAddress the company address of this ncbj company detail
	 */
	@Override
	public void setCompanyAddress(String companyAddress) {
		model.setCompanyAddress(companyAddress);
	}

	/**
	 * Sets the company ID of this ncbj company detail.
	 *
	 * @param companyId the company ID of this ncbj company detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name or head office of this ncbj company detail.
	 *
	 * @param companyNameOrHeadOffice the company name or head office of this ncbj company detail
	 */
	@Override
	public void setCompanyNameOrHeadOffice(String companyNameOrHeadOffice) {
		model.setCompanyNameOrHeadOffice(companyNameOrHeadOffice);
	}

	/**
	 * Sets the create date of this ncbj company detail.
	 *
	 * @param createDate the create date of this ncbj company detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj company detail.
	 *
	 * @param groupId the group ID of this ncbj company detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj company detail.
	 *
	 * @param modifiedDate the modified date of this ncbj company detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj company detail.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj company detail
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj company detail ID of this ncbj company detail.
	 *
	 * @param ncbjCompanyDetailId the ncbj company detail ID of this ncbj company detail
	 */
	@Override
	public void setNcbjCompanyDetailId(long ncbjCompanyDetailId) {
		model.setNcbjCompanyDetailId(ncbjCompanyDetailId);
	}

	/**
	 * Sets the pre aassessment audit of this ncbj company detail.
	 *
	 * @param preAassessmentAudit the pre aassessment audit of this ncbj company detail
	 */
	@Override
	public void setPreAassessmentAudit(Date preAassessmentAudit) {
		model.setPreAassessmentAudit(preAassessmentAudit);
	}

	/**
	 * Sets the primary key of this ncbj company detail.
	 *
	 * @param primaryKey the primary key of this ncbj company detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the recertification audit of this ncbj company detail.
	 *
	 * @param recertificationAudit the recertification audit of this ncbj company detail
	 */
	@Override
	public void setRecertificationAudit(Date recertificationAudit) {
		model.setRecertificationAudit(recertificationAudit);
	}

	/**
	 * Sets the stage one of this ncbj company detail.
	 *
	 * @param stageOne the stage one of this ncbj company detail
	 */
	@Override
	public void setStageOne(Date stageOne) {
		model.setStageOne(stageOne);
	}

	/**
	 * Sets the stage two of this ncbj company detail.
	 *
	 * @param stageTwo the stage two of this ncbj company detail
	 */
	@Override
	public void setStageTwo(Date stageTwo) {
		model.setStageTwo(stageTwo);
	}

	/**
	 * Sets the surveillance audit of this ncbj company detail.
	 *
	 * @param surveillanceAudit the surveillance audit of this ncbj company detail
	 */
	@Override
	public void setSurveillanceAudit(Date surveillanceAudit) {
		model.setSurveillanceAudit(surveillanceAudit);
	}

	/**
	 * Sets the user ID of this ncbj company detail.
	 *
	 * @param userId the user ID of this ncbj company detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj company detail.
	 *
	 * @param userName the user name of this ncbj company detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj company detail.
	 *
	 * @param userUuid the user uuid of this ncbj company detail
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
	protected NcbjCompanyDetailWrapper wrap(
		NcbjCompanyDetail ncbjCompanyDetail) {

		return new NcbjCompanyDetailWrapper(ncbjCompanyDetail);
	}

}
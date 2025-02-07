/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismBonaAttractionEmployeeInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAttractionEmployeeInfo
 * @generated
 */
public class TourismBonaAttractionEmployeeInfoWrapper
	extends BaseModelWrapper<TourismBonaAttractionEmployeeInfo>
	implements ModelWrapper<TourismBonaAttractionEmployeeInfo>,
			   TourismBonaAttractionEmployeeInfo {

	public TourismBonaAttractionEmployeeInfoWrapper(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo) {

		super(tourismBonaAttractionEmployeeInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("tourismBonaAttrEmpId", getTourismBonaAttrEmpId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("actualPermanent", getActualPermanent());
		attributes.put("actualTemporary", getActualTemporary());
		attributes.put("actualForeign", getActualForeign());
		attributes.put("actualLocal", getActualLocal());
		attributes.put("actualPayroll", getActualPayroll());
		attributes.put("projectedPermanent", getProjectedPermanent());
		attributes.put("projectedTemporary", getProjectedTemporary());
		attributes.put("projectedForeign", getProjectedForeign());
		attributes.put("projectedLocal", getProjectedLocal());
		attributes.put("projectedPayroll", getProjectedPayroll());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismBonaAttrEmpId = (Long)attributes.get(
			"tourismBonaAttrEmpId");

		if (tourismBonaAttrEmpId != null) {
			setTourismBonaAttrEmpId(tourismBonaAttrEmpId);
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

		String actualPermanent = (String)attributes.get("actualPermanent");

		if (actualPermanent != null) {
			setActualPermanent(actualPermanent);
		}

		String actualTemporary = (String)attributes.get("actualTemporary");

		if (actualTemporary != null) {
			setActualTemporary(actualTemporary);
		}

		String actualForeign = (String)attributes.get("actualForeign");

		if (actualForeign != null) {
			setActualForeign(actualForeign);
		}

		String actualLocal = (String)attributes.get("actualLocal");

		if (actualLocal != null) {
			setActualLocal(actualLocal);
		}

		String actualPayroll = (String)attributes.get("actualPayroll");

		if (actualPayroll != null) {
			setActualPayroll(actualPayroll);
		}

		String projectedPermanent = (String)attributes.get(
			"projectedPermanent");

		if (projectedPermanent != null) {
			setProjectedPermanent(projectedPermanent);
		}

		String projectedTemporary = (String)attributes.get(
			"projectedTemporary");

		if (projectedTemporary != null) {
			setProjectedTemporary(projectedTemporary);
		}

		String projectedForeign = (String)attributes.get("projectedForeign");

		if (projectedForeign != null) {
			setProjectedForeign(projectedForeign);
		}

		String projectedLocal = (String)attributes.get("projectedLocal");

		if (projectedLocal != null) {
			setProjectedLocal(projectedLocal);
		}

		String projectedPayroll = (String)attributes.get("projectedPayroll");

		if (projectedPayroll != null) {
			setProjectedPayroll(projectedPayroll);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismBonaAttractionEmployeeInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the actual foreign of this tourism bona attraction employee info.
	 *
	 * @return the actual foreign of this tourism bona attraction employee info
	 */
	@Override
	public String getActualForeign() {
		return model.getActualForeign();
	}

	/**
	 * Returns the actual local of this tourism bona attraction employee info.
	 *
	 * @return the actual local of this tourism bona attraction employee info
	 */
	@Override
	public String getActualLocal() {
		return model.getActualLocal();
	}

	/**
	 * Returns the actual payroll of this tourism bona attraction employee info.
	 *
	 * @return the actual payroll of this tourism bona attraction employee info
	 */
	@Override
	public String getActualPayroll() {
		return model.getActualPayroll();
	}

	/**
	 * Returns the actual permanent of this tourism bona attraction employee info.
	 *
	 * @return the actual permanent of this tourism bona attraction employee info
	 */
	@Override
	public String getActualPermanent() {
		return model.getActualPermanent();
	}

	/**
	 * Returns the actual temporary of this tourism bona attraction employee info.
	 *
	 * @return the actual temporary of this tourism bona attraction employee info
	 */
	@Override
	public String getActualTemporary() {
		return model.getActualTemporary();
	}

	/**
	 * Returns the company ID of this tourism bona attraction employee info.
	 *
	 * @return the company ID of this tourism bona attraction employee info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism bona attraction employee info.
	 *
	 * @return the create date of this tourism bona attraction employee info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this tourism bona attraction employee info.
	 *
	 * @return the group ID of this tourism bona attraction employee info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this tourism bona attraction employee info.
	 *
	 * @return the modified date of this tourism bona attraction employee info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism bona attraction employee info.
	 *
	 * @return the primary key of this tourism bona attraction employee info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the projected foreign of this tourism bona attraction employee info.
	 *
	 * @return the projected foreign of this tourism bona attraction employee info
	 */
	@Override
	public String getProjectedForeign() {
		return model.getProjectedForeign();
	}

	/**
	 * Returns the projected local of this tourism bona attraction employee info.
	 *
	 * @return the projected local of this tourism bona attraction employee info
	 */
	@Override
	public String getProjectedLocal() {
		return model.getProjectedLocal();
	}

	/**
	 * Returns the projected payroll of this tourism bona attraction employee info.
	 *
	 * @return the projected payroll of this tourism bona attraction employee info
	 */
	@Override
	public String getProjectedPayroll() {
		return model.getProjectedPayroll();
	}

	/**
	 * Returns the projected permanent of this tourism bona attraction employee info.
	 *
	 * @return the projected permanent of this tourism bona attraction employee info
	 */
	@Override
	public String getProjectedPermanent() {
		return model.getProjectedPermanent();
	}

	/**
	 * Returns the projected temporary of this tourism bona attraction employee info.
	 *
	 * @return the projected temporary of this tourism bona attraction employee info
	 */
	@Override
	public String getProjectedTemporary() {
		return model.getProjectedTemporary();
	}

	/**
	 * Returns the tourism application ID of this tourism bona attraction employee info.
	 *
	 * @return the tourism application ID of this tourism bona attraction employee info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism bona attr emp ID of this tourism bona attraction employee info.
	 *
	 * @return the tourism bona attr emp ID of this tourism bona attraction employee info
	 */
	@Override
	public long getTourismBonaAttrEmpId() {
		return model.getTourismBonaAttrEmpId();
	}

	/**
	 * Returns the user ID of this tourism bona attraction employee info.
	 *
	 * @return the user ID of this tourism bona attraction employee info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism bona attraction employee info.
	 *
	 * @return the user name of this tourism bona attraction employee info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism bona attraction employee info.
	 *
	 * @return the user uuid of this tourism bona attraction employee info
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
	 * Sets the actual foreign of this tourism bona attraction employee info.
	 *
	 * @param actualForeign the actual foreign of this tourism bona attraction employee info
	 */
	@Override
	public void setActualForeign(String actualForeign) {
		model.setActualForeign(actualForeign);
	}

	/**
	 * Sets the actual local of this tourism bona attraction employee info.
	 *
	 * @param actualLocal the actual local of this tourism bona attraction employee info
	 */
	@Override
	public void setActualLocal(String actualLocal) {
		model.setActualLocal(actualLocal);
	}

	/**
	 * Sets the actual payroll of this tourism bona attraction employee info.
	 *
	 * @param actualPayroll the actual payroll of this tourism bona attraction employee info
	 */
	@Override
	public void setActualPayroll(String actualPayroll) {
		model.setActualPayroll(actualPayroll);
	}

	/**
	 * Sets the actual permanent of this tourism bona attraction employee info.
	 *
	 * @param actualPermanent the actual permanent of this tourism bona attraction employee info
	 */
	@Override
	public void setActualPermanent(String actualPermanent) {
		model.setActualPermanent(actualPermanent);
	}

	/**
	 * Sets the actual temporary of this tourism bona attraction employee info.
	 *
	 * @param actualTemporary the actual temporary of this tourism bona attraction employee info
	 */
	@Override
	public void setActualTemporary(String actualTemporary) {
		model.setActualTemporary(actualTemporary);
	}

	/**
	 * Sets the company ID of this tourism bona attraction employee info.
	 *
	 * @param companyId the company ID of this tourism bona attraction employee info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism bona attraction employee info.
	 *
	 * @param createDate the create date of this tourism bona attraction employee info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this tourism bona attraction employee info.
	 *
	 * @param groupId the group ID of this tourism bona attraction employee info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this tourism bona attraction employee info.
	 *
	 * @param modifiedDate the modified date of this tourism bona attraction employee info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism bona attraction employee info.
	 *
	 * @param primaryKey the primary key of this tourism bona attraction employee info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the projected foreign of this tourism bona attraction employee info.
	 *
	 * @param projectedForeign the projected foreign of this tourism bona attraction employee info
	 */
	@Override
	public void setProjectedForeign(String projectedForeign) {
		model.setProjectedForeign(projectedForeign);
	}

	/**
	 * Sets the projected local of this tourism bona attraction employee info.
	 *
	 * @param projectedLocal the projected local of this tourism bona attraction employee info
	 */
	@Override
	public void setProjectedLocal(String projectedLocal) {
		model.setProjectedLocal(projectedLocal);
	}

	/**
	 * Sets the projected payroll of this tourism bona attraction employee info.
	 *
	 * @param projectedPayroll the projected payroll of this tourism bona attraction employee info
	 */
	@Override
	public void setProjectedPayroll(String projectedPayroll) {
		model.setProjectedPayroll(projectedPayroll);
	}

	/**
	 * Sets the projected permanent of this tourism bona attraction employee info.
	 *
	 * @param projectedPermanent the projected permanent of this tourism bona attraction employee info
	 */
	@Override
	public void setProjectedPermanent(String projectedPermanent) {
		model.setProjectedPermanent(projectedPermanent);
	}

	/**
	 * Sets the projected temporary of this tourism bona attraction employee info.
	 *
	 * @param projectedTemporary the projected temporary of this tourism bona attraction employee info
	 */
	@Override
	public void setProjectedTemporary(String projectedTemporary) {
		model.setProjectedTemporary(projectedTemporary);
	}

	/**
	 * Sets the tourism application ID of this tourism bona attraction employee info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona attraction employee info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism bona attr emp ID of this tourism bona attraction employee info.
	 *
	 * @param tourismBonaAttrEmpId the tourism bona attr emp ID of this tourism bona attraction employee info
	 */
	@Override
	public void setTourismBonaAttrEmpId(long tourismBonaAttrEmpId) {
		model.setTourismBonaAttrEmpId(tourismBonaAttrEmpId);
	}

	/**
	 * Sets the user ID of this tourism bona attraction employee info.
	 *
	 * @param userId the user ID of this tourism bona attraction employee info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism bona attraction employee info.
	 *
	 * @param userName the user name of this tourism bona attraction employee info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism bona attraction employee info.
	 *
	 * @param userUuid the user uuid of this tourism bona attraction employee info
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
	protected TourismBonaAttractionEmployeeInfoWrapper wrap(
		TourismBonaAttractionEmployeeInfo tourismBonaAttractionEmployeeInfo) {

		return new TourismBonaAttractionEmployeeInfoWrapper(
			tourismBonaAttractionEmployeeInfo);
	}

}
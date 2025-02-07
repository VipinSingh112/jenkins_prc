/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismNewAccoAssesmentInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesmentInfo
 * @generated
 */
public class TourismNewAccoAssesmentInfoWrapper
	extends BaseModelWrapper<TourismNewAccoAssesmentInfo>
	implements ModelWrapper<TourismNewAccoAssesmentInfo>,
			   TourismNewAccoAssesmentInfo {

	public TourismNewAccoAssesmentInfoWrapper(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		super(tourismNewAccoAssesmentInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"TourismNewAccoAssesmentInfoId",
			getTourismNewAccoAssesmentInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("countryOrigin", getCountryOrigin());
		attributes.put("jointVenture", getJointVenture());
		attributes.put("localPer", getLocalPer());
		attributes.put("foreignPer", getForeignPer());
		attributes.put("capitalInvest", getCapitalInvest());
		attributes.put("sourceAttach", getSourceAttach());
		attributes.put("shareCapital", getShareCapital());
		attributes.put("loanCapital", getLoanCapital());
		attributes.put("other", getOther());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long TourismNewAccoAssesmentInfoId = (Long)attributes.get(
			"TourismNewAccoAssesmentInfoId");

		if (TourismNewAccoAssesmentInfoId != null) {
			setTourismNewAccoAssesmentInfoId(TourismNewAccoAssesmentInfoId);
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

		String countryOrigin = (String)attributes.get("countryOrigin");

		if (countryOrigin != null) {
			setCountryOrigin(countryOrigin);
		}

		String jointVenture = (String)attributes.get("jointVenture");

		if (jointVenture != null) {
			setJointVenture(jointVenture);
		}

		String localPer = (String)attributes.get("localPer");

		if (localPer != null) {
			setLocalPer(localPer);
		}

		String foreignPer = (String)attributes.get("foreignPer");

		if (foreignPer != null) {
			setForeignPer(foreignPer);
		}

		String capitalInvest = (String)attributes.get("capitalInvest");

		if (capitalInvest != null) {
			setCapitalInvest(capitalInvest);
		}

		String sourceAttach = (String)attributes.get("sourceAttach");

		if (sourceAttach != null) {
			setSourceAttach(sourceAttach);
		}

		String shareCapital = (String)attributes.get("shareCapital");

		if (shareCapital != null) {
			setShareCapital(shareCapital);
		}

		String loanCapital = (String)attributes.get("loanCapital");

		if (loanCapital != null) {
			setLoanCapital(loanCapital);
		}

		String other = (String)attributes.get("other");

		if (other != null) {
			setOther(other);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewAccoAssesmentInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the capital invest of this tourism new acco assesment info.
	 *
	 * @return the capital invest of this tourism new acco assesment info
	 */
	@Override
	public String getCapitalInvest() {
		return model.getCapitalInvest();
	}

	/**
	 * Returns the company ID of this tourism new acco assesment info.
	 *
	 * @return the company ID of this tourism new acco assesment info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country origin of this tourism new acco assesment info.
	 *
	 * @return the country origin of this tourism new acco assesment info
	 */
	@Override
	public String getCountryOrigin() {
		return model.getCountryOrigin();
	}

	/**
	 * Returns the create date of this tourism new acco assesment info.
	 *
	 * @return the create date of this tourism new acco assesment info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the foreign per of this tourism new acco assesment info.
	 *
	 * @return the foreign per of this tourism new acco assesment info
	 */
	@Override
	public String getForeignPer() {
		return model.getForeignPer();
	}

	/**
	 * Returns the group ID of this tourism new acco assesment info.
	 *
	 * @return the group ID of this tourism new acco assesment info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the joint venture of this tourism new acco assesment info.
	 *
	 * @return the joint venture of this tourism new acco assesment info
	 */
	@Override
	public String getJointVenture() {
		return model.getJointVenture();
	}

	/**
	 * Returns the loan capital of this tourism new acco assesment info.
	 *
	 * @return the loan capital of this tourism new acco assesment info
	 */
	@Override
	public String getLoanCapital() {
		return model.getLoanCapital();
	}

	/**
	 * Returns the local per of this tourism new acco assesment info.
	 *
	 * @return the local per of this tourism new acco assesment info
	 */
	@Override
	public String getLocalPer() {
		return model.getLocalPer();
	}

	/**
	 * Returns the modified date of this tourism new acco assesment info.
	 *
	 * @return the modified date of this tourism new acco assesment info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other of this tourism new acco assesment info.
	 *
	 * @return the other of this tourism new acco assesment info
	 */
	@Override
	public String getOther() {
		return model.getOther();
	}

	/**
	 * Returns the primary key of this tourism new acco assesment info.
	 *
	 * @return the primary key of this tourism new acco assesment info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the share capital of this tourism new acco assesment info.
	 *
	 * @return the share capital of this tourism new acco assesment info
	 */
	@Override
	public String getShareCapital() {
		return model.getShareCapital();
	}

	/**
	 * Returns the source attach of this tourism new acco assesment info.
	 *
	 * @return the source attach of this tourism new acco assesment info
	 */
	@Override
	public String getSourceAttach() {
		return model.getSourceAttach();
	}

	/**
	 * Returns the tourism application ID of this tourism new acco assesment info.
	 *
	 * @return the tourism application ID of this tourism new acco assesment info
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new acco assesment info ID of this tourism new acco assesment info.
	 *
	 * @return the tourism new acco assesment info ID of this tourism new acco assesment info
	 */
	@Override
	public long getTourismNewAccoAssesmentInfoId() {
		return model.getTourismNewAccoAssesmentInfoId();
	}

	/**
	 * Returns the user ID of this tourism new acco assesment info.
	 *
	 * @return the user ID of this tourism new acco assesment info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new acco assesment info.
	 *
	 * @return the user name of this tourism new acco assesment info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new acco assesment info.
	 *
	 * @return the user uuid of this tourism new acco assesment info
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
	 * Sets the capital invest of this tourism new acco assesment info.
	 *
	 * @param capitalInvest the capital invest of this tourism new acco assesment info
	 */
	@Override
	public void setCapitalInvest(String capitalInvest) {
		model.setCapitalInvest(capitalInvest);
	}

	/**
	 * Sets the company ID of this tourism new acco assesment info.
	 *
	 * @param companyId the company ID of this tourism new acco assesment info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country origin of this tourism new acco assesment info.
	 *
	 * @param countryOrigin the country origin of this tourism new acco assesment info
	 */
	@Override
	public void setCountryOrigin(String countryOrigin) {
		model.setCountryOrigin(countryOrigin);
	}

	/**
	 * Sets the create date of this tourism new acco assesment info.
	 *
	 * @param createDate the create date of this tourism new acco assesment info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the foreign per of this tourism new acco assesment info.
	 *
	 * @param foreignPer the foreign per of this tourism new acco assesment info
	 */
	@Override
	public void setForeignPer(String foreignPer) {
		model.setForeignPer(foreignPer);
	}

	/**
	 * Sets the group ID of this tourism new acco assesment info.
	 *
	 * @param groupId the group ID of this tourism new acco assesment info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the joint venture of this tourism new acco assesment info.
	 *
	 * @param jointVenture the joint venture of this tourism new acco assesment info
	 */
	@Override
	public void setJointVenture(String jointVenture) {
		model.setJointVenture(jointVenture);
	}

	/**
	 * Sets the loan capital of this tourism new acco assesment info.
	 *
	 * @param loanCapital the loan capital of this tourism new acco assesment info
	 */
	@Override
	public void setLoanCapital(String loanCapital) {
		model.setLoanCapital(loanCapital);
	}

	/**
	 * Sets the local per of this tourism new acco assesment info.
	 *
	 * @param localPer the local per of this tourism new acco assesment info
	 */
	@Override
	public void setLocalPer(String localPer) {
		model.setLocalPer(localPer);
	}

	/**
	 * Sets the modified date of this tourism new acco assesment info.
	 *
	 * @param modifiedDate the modified date of this tourism new acco assesment info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other of this tourism new acco assesment info.
	 *
	 * @param other the other of this tourism new acco assesment info
	 */
	@Override
	public void setOther(String other) {
		model.setOther(other);
	}

	/**
	 * Sets the primary key of this tourism new acco assesment info.
	 *
	 * @param primaryKey the primary key of this tourism new acco assesment info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the share capital of this tourism new acco assesment info.
	 *
	 * @param shareCapital the share capital of this tourism new acco assesment info
	 */
	@Override
	public void setShareCapital(String shareCapital) {
		model.setShareCapital(shareCapital);
	}

	/**
	 * Sets the source attach of this tourism new acco assesment info.
	 *
	 * @param sourceAttach the source attach of this tourism new acco assesment info
	 */
	@Override
	public void setSourceAttach(String sourceAttach) {
		model.setSourceAttach(sourceAttach);
	}

	/**
	 * Sets the tourism application ID of this tourism new acco assesment info.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new acco assesment info
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new acco assesment info ID of this tourism new acco assesment info.
	 *
	 * @param TourismNewAccoAssesmentInfoId the tourism new acco assesment info ID of this tourism new acco assesment info
	 */
	@Override
	public void setTourismNewAccoAssesmentInfoId(
		long TourismNewAccoAssesmentInfoId) {

		model.setTourismNewAccoAssesmentInfoId(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Sets the user ID of this tourism new acco assesment info.
	 *
	 * @param userId the user ID of this tourism new acco assesment info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new acco assesment info.
	 *
	 * @param userName the user name of this tourism new acco assesment info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new acco assesment info.
	 *
	 * @param userUuid the user uuid of this tourism new acco assesment info
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	protected TourismNewAccoAssesmentInfoWrapper wrap(
		TourismNewAccoAssesmentInfo tourismNewAccoAssesmentInfo) {

		return new TourismNewAccoAssesmentInfoWrapper(
			tourismNewAccoAssesmentInfo);
	}

}
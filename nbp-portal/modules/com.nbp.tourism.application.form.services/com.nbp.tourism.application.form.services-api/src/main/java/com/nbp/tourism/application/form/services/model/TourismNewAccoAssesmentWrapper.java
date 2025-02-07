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
 * This class is a wrapper for {@link TourismNewAccoAssesment}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAccoAssesment
 * @generated
 */
public class TourismNewAccoAssesmentWrapper
	extends BaseModelWrapper<TourismNewAccoAssesment>
	implements ModelWrapper<TourismNewAccoAssesment>, TourismNewAccoAssesment {

	public TourismNewAccoAssesmentWrapper(
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		super(tourismNewAccoAssesment);
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
	public TourismNewAccoAssesment cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the capital invest of this tourism new acco assesment.
	 *
	 * @return the capital invest of this tourism new acco assesment
	 */
	@Override
	public String getCapitalInvest() {
		return model.getCapitalInvest();
	}

	/**
	 * Returns the company ID of this tourism new acco assesment.
	 *
	 * @return the company ID of this tourism new acco assesment
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country origin of this tourism new acco assesment.
	 *
	 * @return the country origin of this tourism new acco assesment
	 */
	@Override
	public String getCountryOrigin() {
		return model.getCountryOrigin();
	}

	/**
	 * Returns the create date of this tourism new acco assesment.
	 *
	 * @return the create date of this tourism new acco assesment
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the foreign per of this tourism new acco assesment.
	 *
	 * @return the foreign per of this tourism new acco assesment
	 */
	@Override
	public String getForeignPer() {
		return model.getForeignPer();
	}

	/**
	 * Returns the group ID of this tourism new acco assesment.
	 *
	 * @return the group ID of this tourism new acco assesment
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the joint venture of this tourism new acco assesment.
	 *
	 * @return the joint venture of this tourism new acco assesment
	 */
	@Override
	public String getJointVenture() {
		return model.getJointVenture();
	}

	/**
	 * Returns the loan capital of this tourism new acco assesment.
	 *
	 * @return the loan capital of this tourism new acco assesment
	 */
	@Override
	public String getLoanCapital() {
		return model.getLoanCapital();
	}

	/**
	 * Returns the local per of this tourism new acco assesment.
	 *
	 * @return the local per of this tourism new acco assesment
	 */
	@Override
	public String getLocalPer() {
		return model.getLocalPer();
	}

	/**
	 * Returns the modified date of this tourism new acco assesment.
	 *
	 * @return the modified date of this tourism new acco assesment
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other of this tourism new acco assesment.
	 *
	 * @return the other of this tourism new acco assesment
	 */
	@Override
	public String getOther() {
		return model.getOther();
	}

	/**
	 * Returns the primary key of this tourism new acco assesment.
	 *
	 * @return the primary key of this tourism new acco assesment
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the share capital of this tourism new acco assesment.
	 *
	 * @return the share capital of this tourism new acco assesment
	 */
	@Override
	public String getShareCapital() {
		return model.getShareCapital();
	}

	/**
	 * Returns the source attach of this tourism new acco assesment.
	 *
	 * @return the source attach of this tourism new acco assesment
	 */
	@Override
	public String getSourceAttach() {
		return model.getSourceAttach();
	}

	/**
	 * Returns the tourism application ID of this tourism new acco assesment.
	 *
	 * @return the tourism application ID of this tourism new acco assesment
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new acco assesment info ID of this tourism new acco assesment.
	 *
	 * @return the tourism new acco assesment info ID of this tourism new acco assesment
	 */
	@Override
	public long getTourismNewAccoAssesmentInfoId() {
		return model.getTourismNewAccoAssesmentInfoId();
	}

	/**
	 * Returns the user ID of this tourism new acco assesment.
	 *
	 * @return the user ID of this tourism new acco assesment
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new acco assesment.
	 *
	 * @return the user name of this tourism new acco assesment
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new acco assesment.
	 *
	 * @return the user uuid of this tourism new acco assesment
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
	 * Sets the capital invest of this tourism new acco assesment.
	 *
	 * @param capitalInvest the capital invest of this tourism new acco assesment
	 */
	@Override
	public void setCapitalInvest(String capitalInvest) {
		model.setCapitalInvest(capitalInvest);
	}

	/**
	 * Sets the company ID of this tourism new acco assesment.
	 *
	 * @param companyId the company ID of this tourism new acco assesment
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country origin of this tourism new acco assesment.
	 *
	 * @param countryOrigin the country origin of this tourism new acco assesment
	 */
	@Override
	public void setCountryOrigin(String countryOrigin) {
		model.setCountryOrigin(countryOrigin);
	}

	/**
	 * Sets the create date of this tourism new acco assesment.
	 *
	 * @param createDate the create date of this tourism new acco assesment
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the foreign per of this tourism new acco assesment.
	 *
	 * @param foreignPer the foreign per of this tourism new acco assesment
	 */
	@Override
	public void setForeignPer(String foreignPer) {
		model.setForeignPer(foreignPer);
	}

	/**
	 * Sets the group ID of this tourism new acco assesment.
	 *
	 * @param groupId the group ID of this tourism new acco assesment
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the joint venture of this tourism new acco assesment.
	 *
	 * @param jointVenture the joint venture of this tourism new acco assesment
	 */
	@Override
	public void setJointVenture(String jointVenture) {
		model.setJointVenture(jointVenture);
	}

	/**
	 * Sets the loan capital of this tourism new acco assesment.
	 *
	 * @param loanCapital the loan capital of this tourism new acco assesment
	 */
	@Override
	public void setLoanCapital(String loanCapital) {
		model.setLoanCapital(loanCapital);
	}

	/**
	 * Sets the local per of this tourism new acco assesment.
	 *
	 * @param localPer the local per of this tourism new acco assesment
	 */
	@Override
	public void setLocalPer(String localPer) {
		model.setLocalPer(localPer);
	}

	/**
	 * Sets the modified date of this tourism new acco assesment.
	 *
	 * @param modifiedDate the modified date of this tourism new acco assesment
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other of this tourism new acco assesment.
	 *
	 * @param other the other of this tourism new acco assesment
	 */
	@Override
	public void setOther(String other) {
		model.setOther(other);
	}

	/**
	 * Sets the primary key of this tourism new acco assesment.
	 *
	 * @param primaryKey the primary key of this tourism new acco assesment
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the share capital of this tourism new acco assesment.
	 *
	 * @param shareCapital the share capital of this tourism new acco assesment
	 */
	@Override
	public void setShareCapital(String shareCapital) {
		model.setShareCapital(shareCapital);
	}

	/**
	 * Sets the source attach of this tourism new acco assesment.
	 *
	 * @param sourceAttach the source attach of this tourism new acco assesment
	 */
	@Override
	public void setSourceAttach(String sourceAttach) {
		model.setSourceAttach(sourceAttach);
	}

	/**
	 * Sets the tourism application ID of this tourism new acco assesment.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new acco assesment
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new acco assesment info ID of this tourism new acco assesment.
	 *
	 * @param TourismNewAccoAssesmentInfoId the tourism new acco assesment info ID of this tourism new acco assesment
	 */
	@Override
	public void setTourismNewAccoAssesmentInfoId(
		long TourismNewAccoAssesmentInfoId) {

		model.setTourismNewAccoAssesmentInfoId(TourismNewAccoAssesmentInfoId);
	}

	/**
	 * Sets the user ID of this tourism new acco assesment.
	 *
	 * @param userId the user ID of this tourism new acco assesment
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new acco assesment.
	 *
	 * @param userName the user name of this tourism new acco assesment
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new acco assesment.
	 *
	 * @param userUuid the user uuid of this tourism new acco assesment
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
	protected TourismNewAccoAssesmentWrapper wrap(
		TourismNewAccoAssesment tourismNewAccoAssesment) {

		return new TourismNewAccoAssesmentWrapper(tourismNewAccoAssesment);
	}

}
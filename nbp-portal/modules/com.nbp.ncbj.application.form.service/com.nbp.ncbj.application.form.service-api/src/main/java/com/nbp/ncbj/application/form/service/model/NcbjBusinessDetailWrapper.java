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
 * This class is a wrapper for {@link NcbjBusinessDetail}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetail
 * @generated
 */
public class NcbjBusinessDetailWrapper
	extends BaseModelWrapper<NcbjBusinessDetail>
	implements ModelWrapper<NcbjBusinessDetail>, NcbjBusinessDetail {

	public NcbjBusinessDetailWrapper(NcbjBusinessDetail ncbjBusinessDetail) {
		super(ncbjBusinessDetail);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjBusinessDetailId", getNcbjBusinessDetailId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("counter", getCounter());
		attributes.put("quotationAddressOne", getQuotationAddressOne());
		attributes.put("quotationProductTypes", getQuotationProductTypes());
		attributes.put(
			"quotationApplicantShifts", getQuotationApplicantShifts());
		attributes.put("quotationEmpNum", getQuotationEmpNum());
		attributes.put("quotationHeadOffices", getQuotationHeadOffices());
		attributes.put("quotationFullTimeEmploy", getQuotationFullTimeEmploy());
		attributes.put("quotationPartTimeEmploy", getQuotationPartTimeEmploy());
		attributes.put("quotationContractors", getQuotationContractors());
		attributes.put(
			"quotationContractedWorker", getQuotationContractedWorker());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjBusinessDetailId = (Long)attributes.get(
			"ncbjBusinessDetailId");

		if (ncbjBusinessDetailId != null) {
			setNcbjBusinessDetailId(ncbjBusinessDetailId);
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

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		String quotationAddressOne = (String)attributes.get(
			"quotationAddressOne");

		if (quotationAddressOne != null) {
			setQuotationAddressOne(quotationAddressOne);
		}

		String quotationProductTypes = (String)attributes.get(
			"quotationProductTypes");

		if (quotationProductTypes != null) {
			setQuotationProductTypes(quotationProductTypes);
		}

		String quotationApplicantShifts = (String)attributes.get(
			"quotationApplicantShifts");

		if (quotationApplicantShifts != null) {
			setQuotationApplicantShifts(quotationApplicantShifts);
		}

		String quotationEmpNum = (String)attributes.get("quotationEmpNum");

		if (quotationEmpNum != null) {
			setQuotationEmpNum(quotationEmpNum);
		}

		String quotationHeadOffices = (String)attributes.get(
			"quotationHeadOffices");

		if (quotationHeadOffices != null) {
			setQuotationHeadOffices(quotationHeadOffices);
		}

		String quotationFullTimeEmploy = (String)attributes.get(
			"quotationFullTimeEmploy");

		if (quotationFullTimeEmploy != null) {
			setQuotationFullTimeEmploy(quotationFullTimeEmploy);
		}

		String quotationPartTimeEmploy = (String)attributes.get(
			"quotationPartTimeEmploy");

		if (quotationPartTimeEmploy != null) {
			setQuotationPartTimeEmploy(quotationPartTimeEmploy);
		}

		String quotationContractors = (String)attributes.get(
			"quotationContractors");

		if (quotationContractors != null) {
			setQuotationContractors(quotationContractors);
		}

		String quotationContractedWorker = (String)attributes.get(
			"quotationContractedWorker");

		if (quotationContractedWorker != null) {
			setQuotationContractedWorker(quotationContractedWorker);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjBusinessDetail cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this ncbj business detail.
	 *
	 * @return the company ID of this ncbj business detail
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this ncbj business detail.
	 *
	 * @return the counter of this ncbj business detail
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this ncbj business detail.
	 *
	 * @return the create date of this ncbj business detail
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this ncbj business detail.
	 *
	 * @return the group ID of this ncbj business detail
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj business detail.
	 *
	 * @return the modified date of this ncbj business detail
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj application ID of this ncbj business detail.
	 *
	 * @return the ncbj application ID of this ncbj business detail
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the ncbj business detail ID of this ncbj business detail.
	 *
	 * @return the ncbj business detail ID of this ncbj business detail
	 */
	@Override
	public long getNcbjBusinessDetailId() {
		return model.getNcbjBusinessDetailId();
	}

	/**
	 * Returns the primary key of this ncbj business detail.
	 *
	 * @return the primary key of this ncbj business detail
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the quotation address one of this ncbj business detail.
	 *
	 * @return the quotation address one of this ncbj business detail
	 */
	@Override
	public String getQuotationAddressOne() {
		return model.getQuotationAddressOne();
	}

	/**
	 * Returns the quotation applicant shifts of this ncbj business detail.
	 *
	 * @return the quotation applicant shifts of this ncbj business detail
	 */
	@Override
	public String getQuotationApplicantShifts() {
		return model.getQuotationApplicantShifts();
	}

	/**
	 * Returns the quotation contracted worker of this ncbj business detail.
	 *
	 * @return the quotation contracted worker of this ncbj business detail
	 */
	@Override
	public String getQuotationContractedWorker() {
		return model.getQuotationContractedWorker();
	}

	/**
	 * Returns the quotation contractors of this ncbj business detail.
	 *
	 * @return the quotation contractors of this ncbj business detail
	 */
	@Override
	public String getQuotationContractors() {
		return model.getQuotationContractors();
	}

	/**
	 * Returns the quotation emp num of this ncbj business detail.
	 *
	 * @return the quotation emp num of this ncbj business detail
	 */
	@Override
	public String getQuotationEmpNum() {
		return model.getQuotationEmpNum();
	}

	/**
	 * Returns the quotation full time employ of this ncbj business detail.
	 *
	 * @return the quotation full time employ of this ncbj business detail
	 */
	@Override
	public String getQuotationFullTimeEmploy() {
		return model.getQuotationFullTimeEmploy();
	}

	/**
	 * Returns the quotation head offices of this ncbj business detail.
	 *
	 * @return the quotation head offices of this ncbj business detail
	 */
	@Override
	public String getQuotationHeadOffices() {
		return model.getQuotationHeadOffices();
	}

	/**
	 * Returns the quotation part time employ of this ncbj business detail.
	 *
	 * @return the quotation part time employ of this ncbj business detail
	 */
	@Override
	public String getQuotationPartTimeEmploy() {
		return model.getQuotationPartTimeEmploy();
	}

	/**
	 * Returns the quotation product types of this ncbj business detail.
	 *
	 * @return the quotation product types of this ncbj business detail
	 */
	@Override
	public String getQuotationProductTypes() {
		return model.getQuotationProductTypes();
	}

	/**
	 * Returns the user ID of this ncbj business detail.
	 *
	 * @return the user ID of this ncbj business detail
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj business detail.
	 *
	 * @return the user name of this ncbj business detail
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj business detail.
	 *
	 * @return the user uuid of this ncbj business detail
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
	 * Sets the company ID of this ncbj business detail.
	 *
	 * @param companyId the company ID of this ncbj business detail
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this ncbj business detail.
	 *
	 * @param counter the counter of this ncbj business detail
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this ncbj business detail.
	 *
	 * @param createDate the create date of this ncbj business detail
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this ncbj business detail.
	 *
	 * @param groupId the group ID of this ncbj business detail
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj business detail.
	 *
	 * @param modifiedDate the modified date of this ncbj business detail
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj application ID of this ncbj business detail.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj business detail
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the ncbj business detail ID of this ncbj business detail.
	 *
	 * @param ncbjBusinessDetailId the ncbj business detail ID of this ncbj business detail
	 */
	@Override
	public void setNcbjBusinessDetailId(long ncbjBusinessDetailId) {
		model.setNcbjBusinessDetailId(ncbjBusinessDetailId);
	}

	/**
	 * Sets the primary key of this ncbj business detail.
	 *
	 * @param primaryKey the primary key of this ncbj business detail
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the quotation address one of this ncbj business detail.
	 *
	 * @param quotationAddressOne the quotation address one of this ncbj business detail
	 */
	@Override
	public void setQuotationAddressOne(String quotationAddressOne) {
		model.setQuotationAddressOne(quotationAddressOne);
	}

	/**
	 * Sets the quotation applicant shifts of this ncbj business detail.
	 *
	 * @param quotationApplicantShifts the quotation applicant shifts of this ncbj business detail
	 */
	@Override
	public void setQuotationApplicantShifts(String quotationApplicantShifts) {
		model.setQuotationApplicantShifts(quotationApplicantShifts);
	}

	/**
	 * Sets the quotation contracted worker of this ncbj business detail.
	 *
	 * @param quotationContractedWorker the quotation contracted worker of this ncbj business detail
	 */
	@Override
	public void setQuotationContractedWorker(String quotationContractedWorker) {
		model.setQuotationContractedWorker(quotationContractedWorker);
	}

	/**
	 * Sets the quotation contractors of this ncbj business detail.
	 *
	 * @param quotationContractors the quotation contractors of this ncbj business detail
	 */
	@Override
	public void setQuotationContractors(String quotationContractors) {
		model.setQuotationContractors(quotationContractors);
	}

	/**
	 * Sets the quotation emp num of this ncbj business detail.
	 *
	 * @param quotationEmpNum the quotation emp num of this ncbj business detail
	 */
	@Override
	public void setQuotationEmpNum(String quotationEmpNum) {
		model.setQuotationEmpNum(quotationEmpNum);
	}

	/**
	 * Sets the quotation full time employ of this ncbj business detail.
	 *
	 * @param quotationFullTimeEmploy the quotation full time employ of this ncbj business detail
	 */
	@Override
	public void setQuotationFullTimeEmploy(String quotationFullTimeEmploy) {
		model.setQuotationFullTimeEmploy(quotationFullTimeEmploy);
	}

	/**
	 * Sets the quotation head offices of this ncbj business detail.
	 *
	 * @param quotationHeadOffices the quotation head offices of this ncbj business detail
	 */
	@Override
	public void setQuotationHeadOffices(String quotationHeadOffices) {
		model.setQuotationHeadOffices(quotationHeadOffices);
	}

	/**
	 * Sets the quotation part time employ of this ncbj business detail.
	 *
	 * @param quotationPartTimeEmploy the quotation part time employ of this ncbj business detail
	 */
	@Override
	public void setQuotationPartTimeEmploy(String quotationPartTimeEmploy) {
		model.setQuotationPartTimeEmploy(quotationPartTimeEmploy);
	}

	/**
	 * Sets the quotation product types of this ncbj business detail.
	 *
	 * @param quotationProductTypes the quotation product types of this ncbj business detail
	 */
	@Override
	public void setQuotationProductTypes(String quotationProductTypes) {
		model.setQuotationProductTypes(quotationProductTypes);
	}

	/**
	 * Sets the user ID of this ncbj business detail.
	 *
	 * @param userId the user ID of this ncbj business detail
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj business detail.
	 *
	 * @param userName the user name of this ncbj business detail
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj business detail.
	 *
	 * @param userUuid the user uuid of this ncbj business detail
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
	protected NcbjBusinessDetailWrapper wrap(
		NcbjBusinessDetail ncbjBusinessDetail) {

		return new NcbjBusinessDetailWrapper(ncbjBusinessDetail);
	}

}
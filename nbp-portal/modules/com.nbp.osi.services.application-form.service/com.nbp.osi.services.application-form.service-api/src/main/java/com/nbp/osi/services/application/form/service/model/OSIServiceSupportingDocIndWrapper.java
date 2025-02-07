/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OSIServiceSupportingDocInd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocInd
 * @generated
 */
public class OSIServiceSupportingDocIndWrapper
	extends BaseModelWrapper<OSIServiceSupportingDocInd>
	implements ModelWrapper<OSIServiceSupportingDocInd>,
			   OSIServiceSupportingDocInd {

	public OSIServiceSupportingDocIndWrapper(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		super(osiServiceSupportingDocInd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"oSIServiceSupportingDocIndId", getOSIServiceSupportingDocIndId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("supportingDocCheckboxes", getSupportingDocCheckboxes());
		attributes.put("nonProvisionReasonReq1", getNonProvisionReasonReq1());
		attributes.put("expectedDateReq1", getExpectedDateReq1());
		attributes.put("nonProvisionReasonReq2", getNonProvisionReasonReq2());
		attributes.put("expectedDateReq2", getExpectedDateReq2());
		attributes.put("nonProvisionReasonReq3", getNonProvisionReasonReq3());
		attributes.put("expectedDateReq3", getExpectedDateReq3());
		attributes.put("nonProvisionReasonReq4", getNonProvisionReasonReq4());
		attributes.put("expectedDateReq4", getExpectedDateReq4());
		attributes.put("nonProvisionReasonReq5", getNonProvisionReasonReq5());
		attributes.put("expectedDateReq5", getExpectedDateReq5());
		attributes.put("nonProvisionReasonReq6", getNonProvisionReasonReq6());
		attributes.put("expectedDateReq6", getExpectedDateReq6());
		attributes.put("nonProvisionReasonReq7", getNonProvisionReasonReq7());
		attributes.put("expectedDateReq7", getExpectedDateReq7());
		attributes.put("nonProvisionReasonReq8", getNonProvisionReasonReq8());
		attributes.put("expectedDateReq8", getExpectedDateReq8());
		attributes.put("nonProvisionReasonReq9", getNonProvisionReasonReq9());
		attributes.put("expectedDateReq9", getExpectedDateReq9());
		attributes.put("nonProvisionReasonReq10", getNonProvisionReasonReq10());
		attributes.put("expectedDateReq10", getExpectedDateReq10());
		attributes.put("nonProvisionReasonReq11", getNonProvisionReasonReq11());
		attributes.put("expectedDateReq11", getExpectedDateReq11());
		attributes.put("nonProvisionReasonReq12", getNonProvisionReasonReq12());
		attributes.put("expectedDateReq12", getExpectedDateReq12());
		attributes.put("category", getCategory());
		attributes.put(
			"osiServicesApplicationId", getOsiServicesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long oSIServiceSupportingDocIndId = (Long)attributes.get(
			"oSIServiceSupportingDocIndId");

		if (oSIServiceSupportingDocIndId != null) {
			setOSIServiceSupportingDocIndId(oSIServiceSupportingDocIndId);
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

		String supportingDocCheckboxes = (String)attributes.get(
			"supportingDocCheckboxes");

		if (supportingDocCheckboxes != null) {
			setSupportingDocCheckboxes(supportingDocCheckboxes);
		}

		String nonProvisionReasonReq1 = (String)attributes.get(
			"nonProvisionReasonReq1");

		if (nonProvisionReasonReq1 != null) {
			setNonProvisionReasonReq1(nonProvisionReasonReq1);
		}

		Date expectedDateReq1 = (Date)attributes.get("expectedDateReq1");

		if (expectedDateReq1 != null) {
			setExpectedDateReq1(expectedDateReq1);
		}

		String nonProvisionReasonReq2 = (String)attributes.get(
			"nonProvisionReasonReq2");

		if (nonProvisionReasonReq2 != null) {
			setNonProvisionReasonReq2(nonProvisionReasonReq2);
		}

		Date expectedDateReq2 = (Date)attributes.get("expectedDateReq2");

		if (expectedDateReq2 != null) {
			setExpectedDateReq2(expectedDateReq2);
		}

		String nonProvisionReasonReq3 = (String)attributes.get(
			"nonProvisionReasonReq3");

		if (nonProvisionReasonReq3 != null) {
			setNonProvisionReasonReq3(nonProvisionReasonReq3);
		}

		Date expectedDateReq3 = (Date)attributes.get("expectedDateReq3");

		if (expectedDateReq3 != null) {
			setExpectedDateReq3(expectedDateReq3);
		}

		String nonProvisionReasonReq4 = (String)attributes.get(
			"nonProvisionReasonReq4");

		if (nonProvisionReasonReq4 != null) {
			setNonProvisionReasonReq4(nonProvisionReasonReq4);
		}

		Date expectedDateReq4 = (Date)attributes.get("expectedDateReq4");

		if (expectedDateReq4 != null) {
			setExpectedDateReq4(expectedDateReq4);
		}

		String nonProvisionReasonReq5 = (String)attributes.get(
			"nonProvisionReasonReq5");

		if (nonProvisionReasonReq5 != null) {
			setNonProvisionReasonReq5(nonProvisionReasonReq5);
		}

		Date expectedDateReq5 = (Date)attributes.get("expectedDateReq5");

		if (expectedDateReq5 != null) {
			setExpectedDateReq5(expectedDateReq5);
		}

		String nonProvisionReasonReq6 = (String)attributes.get(
			"nonProvisionReasonReq6");

		if (nonProvisionReasonReq6 != null) {
			setNonProvisionReasonReq6(nonProvisionReasonReq6);
		}

		Date expectedDateReq6 = (Date)attributes.get("expectedDateReq6");

		if (expectedDateReq6 != null) {
			setExpectedDateReq6(expectedDateReq6);
		}

		String nonProvisionReasonReq7 = (String)attributes.get(
			"nonProvisionReasonReq7");

		if (nonProvisionReasonReq7 != null) {
			setNonProvisionReasonReq7(nonProvisionReasonReq7);
		}

		Date expectedDateReq7 = (Date)attributes.get("expectedDateReq7");

		if (expectedDateReq7 != null) {
			setExpectedDateReq7(expectedDateReq7);
		}

		String nonProvisionReasonReq8 = (String)attributes.get(
			"nonProvisionReasonReq8");

		if (nonProvisionReasonReq8 != null) {
			setNonProvisionReasonReq8(nonProvisionReasonReq8);
		}

		Date expectedDateReq8 = (Date)attributes.get("expectedDateReq8");

		if (expectedDateReq8 != null) {
			setExpectedDateReq8(expectedDateReq8);
		}

		String nonProvisionReasonReq9 = (String)attributes.get(
			"nonProvisionReasonReq9");

		if (nonProvisionReasonReq9 != null) {
			setNonProvisionReasonReq9(nonProvisionReasonReq9);
		}

		Date expectedDateReq9 = (Date)attributes.get("expectedDateReq9");

		if (expectedDateReq9 != null) {
			setExpectedDateReq9(expectedDateReq9);
		}

		String nonProvisionReasonReq10 = (String)attributes.get(
			"nonProvisionReasonReq10");

		if (nonProvisionReasonReq10 != null) {
			setNonProvisionReasonReq10(nonProvisionReasonReq10);
		}

		Date expectedDateReq10 = (Date)attributes.get("expectedDateReq10");

		if (expectedDateReq10 != null) {
			setExpectedDateReq10(expectedDateReq10);
		}

		String nonProvisionReasonReq11 = (String)attributes.get(
			"nonProvisionReasonReq11");

		if (nonProvisionReasonReq11 != null) {
			setNonProvisionReasonReq11(nonProvisionReasonReq11);
		}

		Date expectedDateReq11 = (Date)attributes.get("expectedDateReq11");

		if (expectedDateReq11 != null) {
			setExpectedDateReq11(expectedDateReq11);
		}

		String nonProvisionReasonReq12 = (String)attributes.get(
			"nonProvisionReasonReq12");

		if (nonProvisionReasonReq12 != null) {
			setNonProvisionReasonReq12(nonProvisionReasonReq12);
		}

		Date expectedDateReq12 = (Date)attributes.get("expectedDateReq12");

		if (expectedDateReq12 != null) {
			setExpectedDateReq12(expectedDateReq12);
		}

		String category = (String)attributes.get("category");

		if (category != null) {
			setCategory(category);
		}

		Long osiServicesApplicationId = (Long)attributes.get(
			"osiServicesApplicationId");

		if (osiServicesApplicationId != null) {
			setOsiServicesApplicationId(osiServicesApplicationId);
		}
	}

	@Override
	public OSIServiceSupportingDocInd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the category of this osi service supporting doc ind.
	 *
	 * @return the category of this osi service supporting doc ind
	 */
	@Override
	public String getCategory() {
		return model.getCategory();
	}

	/**
	 * Returns the company ID of this osi service supporting doc ind.
	 *
	 * @return the company ID of this osi service supporting doc ind
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this osi service supporting doc ind.
	 *
	 * @return the create date of this osi service supporting doc ind
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the expected date req1 of this osi service supporting doc ind.
	 *
	 * @return the expected date req1 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq1() {
		return model.getExpectedDateReq1();
	}

	/**
	 * Returns the expected date req10 of this osi service supporting doc ind.
	 *
	 * @return the expected date req10 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq10() {
		return model.getExpectedDateReq10();
	}

	/**
	 * Returns the expected date req11 of this osi service supporting doc ind.
	 *
	 * @return the expected date req11 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq11() {
		return model.getExpectedDateReq11();
	}

	/**
	 * Returns the expected date req12 of this osi service supporting doc ind.
	 *
	 * @return the expected date req12 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq12() {
		return model.getExpectedDateReq12();
	}

	/**
	 * Returns the expected date req2 of this osi service supporting doc ind.
	 *
	 * @return the expected date req2 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq2() {
		return model.getExpectedDateReq2();
	}

	/**
	 * Returns the expected date req3 of this osi service supporting doc ind.
	 *
	 * @return the expected date req3 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq3() {
		return model.getExpectedDateReq3();
	}

	/**
	 * Returns the expected date req4 of this osi service supporting doc ind.
	 *
	 * @return the expected date req4 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq4() {
		return model.getExpectedDateReq4();
	}

	/**
	 * Returns the expected date req5 of this osi service supporting doc ind.
	 *
	 * @return the expected date req5 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq5() {
		return model.getExpectedDateReq5();
	}

	/**
	 * Returns the expected date req6 of this osi service supporting doc ind.
	 *
	 * @return the expected date req6 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq6() {
		return model.getExpectedDateReq6();
	}

	/**
	 * Returns the expected date req7 of this osi service supporting doc ind.
	 *
	 * @return the expected date req7 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq7() {
		return model.getExpectedDateReq7();
	}

	/**
	 * Returns the expected date req8 of this osi service supporting doc ind.
	 *
	 * @return the expected date req8 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq8() {
		return model.getExpectedDateReq8();
	}

	/**
	 * Returns the expected date req9 of this osi service supporting doc ind.
	 *
	 * @return the expected date req9 of this osi service supporting doc ind
	 */
	@Override
	public Date getExpectedDateReq9() {
		return model.getExpectedDateReq9();
	}

	/**
	 * Returns the group ID of this osi service supporting doc ind.
	 *
	 * @return the group ID of this osi service supporting doc ind
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this osi service supporting doc ind.
	 *
	 * @return the modified date of this osi service supporting doc ind
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the non provision reason req1 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req1 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq1() {
		return model.getNonProvisionReasonReq1();
	}

	/**
	 * Returns the non provision reason req10 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req10 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq10() {
		return model.getNonProvisionReasonReq10();
	}

	/**
	 * Returns the non provision reason req11 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req11 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq11() {
		return model.getNonProvisionReasonReq11();
	}

	/**
	 * Returns the non provision reason req12 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req12 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq12() {
		return model.getNonProvisionReasonReq12();
	}

	/**
	 * Returns the non provision reason req2 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req2 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq2() {
		return model.getNonProvisionReasonReq2();
	}

	/**
	 * Returns the non provision reason req3 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req3 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq3() {
		return model.getNonProvisionReasonReq3();
	}

	/**
	 * Returns the non provision reason req4 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req4 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq4() {
		return model.getNonProvisionReasonReq4();
	}

	/**
	 * Returns the non provision reason req5 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req5 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq5() {
		return model.getNonProvisionReasonReq5();
	}

	/**
	 * Returns the non provision reason req6 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req6 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq6() {
		return model.getNonProvisionReasonReq6();
	}

	/**
	 * Returns the non provision reason req7 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req7 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq7() {
		return model.getNonProvisionReasonReq7();
	}

	/**
	 * Returns the non provision reason req8 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req8 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq8() {
		return model.getNonProvisionReasonReq8();
	}

	/**
	 * Returns the non provision reason req9 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req9 of this osi service supporting doc ind
	 */
	@Override
	public String getNonProvisionReasonReq9() {
		return model.getNonProvisionReasonReq9();
	}

	/**
	 * Returns the osi services application ID of this osi service supporting doc ind.
	 *
	 * @return the osi services application ID of this osi service supporting doc ind
	 */
	@Override
	public long getOsiServicesApplicationId() {
		return model.getOsiServicesApplicationId();
	}

	/**
	 * Returns the o si service supporting doc ind ID of this osi service supporting doc ind.
	 *
	 * @return the o si service supporting doc ind ID of this osi service supporting doc ind
	 */
	@Override
	public long getOSIServiceSupportingDocIndId() {
		return model.getOSIServiceSupportingDocIndId();
	}

	/**
	 * Returns the primary key of this osi service supporting doc ind.
	 *
	 * @return the primary key of this osi service supporting doc ind
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the supporting doc checkboxes of this osi service supporting doc ind.
	 *
	 * @return the supporting doc checkboxes of this osi service supporting doc ind
	 */
	@Override
	public String getSupportingDocCheckboxes() {
		return model.getSupportingDocCheckboxes();
	}

	/**
	 * Returns the user ID of this osi service supporting doc ind.
	 *
	 * @return the user ID of this osi service supporting doc ind
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this osi service supporting doc ind.
	 *
	 * @return the user name of this osi service supporting doc ind
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this osi service supporting doc ind.
	 *
	 * @return the user uuid of this osi service supporting doc ind
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
	 * Sets the category of this osi service supporting doc ind.
	 *
	 * @param category the category of this osi service supporting doc ind
	 */
	@Override
	public void setCategory(String category) {
		model.setCategory(category);
	}

	/**
	 * Sets the company ID of this osi service supporting doc ind.
	 *
	 * @param companyId the company ID of this osi service supporting doc ind
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this osi service supporting doc ind.
	 *
	 * @param createDate the create date of this osi service supporting doc ind
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the expected date req1 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq1 the expected date req1 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq1(Date expectedDateReq1) {
		model.setExpectedDateReq1(expectedDateReq1);
	}

	/**
	 * Sets the expected date req10 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq10 the expected date req10 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq10(Date expectedDateReq10) {
		model.setExpectedDateReq10(expectedDateReq10);
	}

	/**
	 * Sets the expected date req11 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq11 the expected date req11 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq11(Date expectedDateReq11) {
		model.setExpectedDateReq11(expectedDateReq11);
	}

	/**
	 * Sets the expected date req12 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq12 the expected date req12 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq12(Date expectedDateReq12) {
		model.setExpectedDateReq12(expectedDateReq12);
	}

	/**
	 * Sets the expected date req2 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq2 the expected date req2 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq2(Date expectedDateReq2) {
		model.setExpectedDateReq2(expectedDateReq2);
	}

	/**
	 * Sets the expected date req3 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq3 the expected date req3 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq3(Date expectedDateReq3) {
		model.setExpectedDateReq3(expectedDateReq3);
	}

	/**
	 * Sets the expected date req4 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq4 the expected date req4 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq4(Date expectedDateReq4) {
		model.setExpectedDateReq4(expectedDateReq4);
	}

	/**
	 * Sets the expected date req5 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq5 the expected date req5 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq5(Date expectedDateReq5) {
		model.setExpectedDateReq5(expectedDateReq5);
	}

	/**
	 * Sets the expected date req6 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq6 the expected date req6 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq6(Date expectedDateReq6) {
		model.setExpectedDateReq6(expectedDateReq6);
	}

	/**
	 * Sets the expected date req7 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq7 the expected date req7 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq7(Date expectedDateReq7) {
		model.setExpectedDateReq7(expectedDateReq7);
	}

	/**
	 * Sets the expected date req8 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq8 the expected date req8 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq8(Date expectedDateReq8) {
		model.setExpectedDateReq8(expectedDateReq8);
	}

	/**
	 * Sets the expected date req9 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq9 the expected date req9 of this osi service supporting doc ind
	 */
	@Override
	public void setExpectedDateReq9(Date expectedDateReq9) {
		model.setExpectedDateReq9(expectedDateReq9);
	}

	/**
	 * Sets the group ID of this osi service supporting doc ind.
	 *
	 * @param groupId the group ID of this osi service supporting doc ind
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this osi service supporting doc ind.
	 *
	 * @param modifiedDate the modified date of this osi service supporting doc ind
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the non provision reason req1 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq1 the non provision reason req1 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq1(String nonProvisionReasonReq1) {
		model.setNonProvisionReasonReq1(nonProvisionReasonReq1);
	}

	/**
	 * Sets the non provision reason req10 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq10 the non provision reason req10 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq10(String nonProvisionReasonReq10) {
		model.setNonProvisionReasonReq10(nonProvisionReasonReq10);
	}

	/**
	 * Sets the non provision reason req11 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq11 the non provision reason req11 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq11(String nonProvisionReasonReq11) {
		model.setNonProvisionReasonReq11(nonProvisionReasonReq11);
	}

	/**
	 * Sets the non provision reason req12 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq12 the non provision reason req12 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq12(String nonProvisionReasonReq12) {
		model.setNonProvisionReasonReq12(nonProvisionReasonReq12);
	}

	/**
	 * Sets the non provision reason req2 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq2 the non provision reason req2 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq2(String nonProvisionReasonReq2) {
		model.setNonProvisionReasonReq2(nonProvisionReasonReq2);
	}

	/**
	 * Sets the non provision reason req3 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq3 the non provision reason req3 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq3(String nonProvisionReasonReq3) {
		model.setNonProvisionReasonReq3(nonProvisionReasonReq3);
	}

	/**
	 * Sets the non provision reason req4 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq4 the non provision reason req4 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq4(String nonProvisionReasonReq4) {
		model.setNonProvisionReasonReq4(nonProvisionReasonReq4);
	}

	/**
	 * Sets the non provision reason req5 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq5 the non provision reason req5 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq5(String nonProvisionReasonReq5) {
		model.setNonProvisionReasonReq5(nonProvisionReasonReq5);
	}

	/**
	 * Sets the non provision reason req6 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq6 the non provision reason req6 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq6(String nonProvisionReasonReq6) {
		model.setNonProvisionReasonReq6(nonProvisionReasonReq6);
	}

	/**
	 * Sets the non provision reason req7 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq7 the non provision reason req7 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq7(String nonProvisionReasonReq7) {
		model.setNonProvisionReasonReq7(nonProvisionReasonReq7);
	}

	/**
	 * Sets the non provision reason req8 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq8 the non provision reason req8 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq8(String nonProvisionReasonReq8) {
		model.setNonProvisionReasonReq8(nonProvisionReasonReq8);
	}

	/**
	 * Sets the non provision reason req9 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq9 the non provision reason req9 of this osi service supporting doc ind
	 */
	@Override
	public void setNonProvisionReasonReq9(String nonProvisionReasonReq9) {
		model.setNonProvisionReasonReq9(nonProvisionReasonReq9);
	}

	/**
	 * Sets the osi services application ID of this osi service supporting doc ind.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi service supporting doc ind
	 */
	@Override
	public void setOsiServicesApplicationId(long osiServicesApplicationId) {
		model.setOsiServicesApplicationId(osiServicesApplicationId);
	}

	/**
	 * Sets the o si service supporting doc ind ID of this osi service supporting doc ind.
	 *
	 * @param oSIServiceSupportingDocIndId the o si service supporting doc ind ID of this osi service supporting doc ind
	 */
	@Override
	public void setOSIServiceSupportingDocIndId(
		long oSIServiceSupportingDocIndId) {

		model.setOSIServiceSupportingDocIndId(oSIServiceSupportingDocIndId);
	}

	/**
	 * Sets the primary key of this osi service supporting doc ind.
	 *
	 * @param primaryKey the primary key of this osi service supporting doc ind
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the supporting doc checkboxes of this osi service supporting doc ind.
	 *
	 * @param supportingDocCheckboxes the supporting doc checkboxes of this osi service supporting doc ind
	 */
	@Override
	public void setSupportingDocCheckboxes(String supportingDocCheckboxes) {
		model.setSupportingDocCheckboxes(supportingDocCheckboxes);
	}

	/**
	 * Sets the user ID of this osi service supporting doc ind.
	 *
	 * @param userId the user ID of this osi service supporting doc ind
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this osi service supporting doc ind.
	 *
	 * @param userName the user name of this osi service supporting doc ind
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this osi service supporting doc ind.
	 *
	 * @param userUuid the user uuid of this osi service supporting doc ind
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
	protected OSIServiceSupportingDocIndWrapper wrap(
		OSIServiceSupportingDocInd osiServiceSupportingDocInd) {

		return new OSIServiceSupportingDocIndWrapper(
			osiServiceSupportingDocInd);
	}

}
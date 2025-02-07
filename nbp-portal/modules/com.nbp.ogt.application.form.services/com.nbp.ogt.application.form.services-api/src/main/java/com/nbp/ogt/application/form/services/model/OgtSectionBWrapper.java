/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ogt.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link OgtSectionB}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OgtSectionB
 * @generated
 */
public class OgtSectionBWrapper
	extends BaseModelWrapper<OgtSectionB>
	implements ModelWrapper<OgtSectionB>, OgtSectionB {

	public OgtSectionBWrapper(OgtSectionB ogtSectionB) {
		super(ogtSectionB);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ogtSectionBId", getOgtSectionBId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("theDebtor", getTheDebtor());
		attributes.put("name", getName());
		attributes.put(
			"dateOfInsolvencyOfDebtor", getDateOfInsolvencyOfDebtor());
		attributes.put("totalValueOfClaim", getTotalValueOfClaim());
		attributes.put("statementOfAccount", getStatementOfAccount());
		attributes.put("unsecuredClaim", getUnsecuredClaim());
		attributes.put("unsecuredClaimOf", getUnsecuredClaimOf());
		attributes.put("regardingTheAmount", getRegardingTheAmount());
		attributes.put("categoryOne", getCategoryOne());
		attributes.put("categoryTwo", getCategoryTwo());
		attributes.put("categoryThree", getCategoryThree());
		attributes.put("categoryFour", getCategoryFour());
		attributes.put("otherPleaseSpecify", getOtherPleaseSpecify());
		attributes.put("securedClaim", getSecuredClaim());
		attributes.put("securedClaimOf", getSecuredClaimOf());
		attributes.put("description", getDescription());
		attributes.put("relationWithDebtor", getRelationWithDebtor());
		attributes.put(
			"bankruptcyEventDescription", getBankruptcyEventDescription());
		attributes.put(
			"bankruptcyOfAnIndividual", getBankruptcyOfAnIndividual());
		attributes.put("ogtApplicationId", getOgtApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ogtSectionBId = (Long)attributes.get("ogtSectionBId");

		if (ogtSectionBId != null) {
			setOgtSectionBId(ogtSectionBId);
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

		String theDebtor = (String)attributes.get("theDebtor");

		if (theDebtor != null) {
			setTheDebtor(theDebtor);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		Date dateOfInsolvencyOfDebtor = (Date)attributes.get(
			"dateOfInsolvencyOfDebtor");

		if (dateOfInsolvencyOfDebtor != null) {
			setDateOfInsolvencyOfDebtor(dateOfInsolvencyOfDebtor);
		}

		String totalValueOfClaim = (String)attributes.get("totalValueOfClaim");

		if (totalValueOfClaim != null) {
			setTotalValueOfClaim(totalValueOfClaim);
		}

		String statementOfAccount = (String)attributes.get(
			"statementOfAccount");

		if (statementOfAccount != null) {
			setStatementOfAccount(statementOfAccount);
		}

		String unsecuredClaim = (String)attributes.get("unsecuredClaim");

		if (unsecuredClaim != null) {
			setUnsecuredClaim(unsecuredClaim);
		}

		String unsecuredClaimOf = (String)attributes.get("unsecuredClaimOf");

		if (unsecuredClaimOf != null) {
			setUnsecuredClaimOf(unsecuredClaimOf);
		}

		String regardingTheAmount = (String)attributes.get(
			"regardingTheAmount");

		if (regardingTheAmount != null) {
			setRegardingTheAmount(regardingTheAmount);
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

		String otherPleaseSpecify = (String)attributes.get(
			"otherPleaseSpecify");

		if (otherPleaseSpecify != null) {
			setOtherPleaseSpecify(otherPleaseSpecify);
		}

		String securedClaim = (String)attributes.get("securedClaim");

		if (securedClaim != null) {
			setSecuredClaim(securedClaim);
		}

		String securedClaimOf = (String)attributes.get("securedClaimOf");

		if (securedClaimOf != null) {
			setSecuredClaimOf(securedClaimOf);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String relationWithDebtor = (String)attributes.get(
			"relationWithDebtor");

		if (relationWithDebtor != null) {
			setRelationWithDebtor(relationWithDebtor);
		}

		String bankruptcyEventDescription = (String)attributes.get(
			"bankruptcyEventDescription");

		if (bankruptcyEventDescription != null) {
			setBankruptcyEventDescription(bankruptcyEventDescription);
		}

		String bankruptcyOfAnIndividual = (String)attributes.get(
			"bankruptcyOfAnIndividual");

		if (bankruptcyOfAnIndividual != null) {
			setBankruptcyOfAnIndividual(bankruptcyOfAnIndividual);
		}

		Long ogtApplicationId = (Long)attributes.get("ogtApplicationId");

		if (ogtApplicationId != null) {
			setOgtApplicationId(ogtApplicationId);
		}
	}

	@Override
	public OgtSectionB cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the bankruptcy event description of this ogt section b.
	 *
	 * @return the bankruptcy event description of this ogt section b
	 */
	@Override
	public String getBankruptcyEventDescription() {
		return model.getBankruptcyEventDescription();
	}

	/**
	 * Returns the bankruptcy of an individual of this ogt section b.
	 *
	 * @return the bankruptcy of an individual of this ogt section b
	 */
	@Override
	public String getBankruptcyOfAnIndividual() {
		return model.getBankruptcyOfAnIndividual();
	}

	/**
	 * Returns the category four of this ogt section b.
	 *
	 * @return the category four of this ogt section b
	 */
	@Override
	public String getCategoryFour() {
		return model.getCategoryFour();
	}

	/**
	 * Returns the category one of this ogt section b.
	 *
	 * @return the category one of this ogt section b
	 */
	@Override
	public String getCategoryOne() {
		return model.getCategoryOne();
	}

	/**
	 * Returns the category three of this ogt section b.
	 *
	 * @return the category three of this ogt section b
	 */
	@Override
	public String getCategoryThree() {
		return model.getCategoryThree();
	}

	/**
	 * Returns the category two of this ogt section b.
	 *
	 * @return the category two of this ogt section b
	 */
	@Override
	public String getCategoryTwo() {
		return model.getCategoryTwo();
	}

	/**
	 * Returns the company ID of this ogt section b.
	 *
	 * @return the company ID of this ogt section b
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ogt section b.
	 *
	 * @return the create date of this ogt section b
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of insolvency of debtor of this ogt section b.
	 *
	 * @return the date of insolvency of debtor of this ogt section b
	 */
	@Override
	public Date getDateOfInsolvencyOfDebtor() {
		return model.getDateOfInsolvencyOfDebtor();
	}

	/**
	 * Returns the description of this ogt section b.
	 *
	 * @return the description of this ogt section b
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the group ID of this ogt section b.
	 *
	 * @return the group ID of this ogt section b
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ogt section b.
	 *
	 * @return the modified date of this ogt section b
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this ogt section b.
	 *
	 * @return the name of this ogt section b
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the ogt application ID of this ogt section b.
	 *
	 * @return the ogt application ID of this ogt section b
	 */
	@Override
	public long getOgtApplicationId() {
		return model.getOgtApplicationId();
	}

	/**
	 * Returns the ogt section b ID of this ogt section b.
	 *
	 * @return the ogt section b ID of this ogt section b
	 */
	@Override
	public long getOgtSectionBId() {
		return model.getOgtSectionBId();
	}

	/**
	 * Returns the other please specify of this ogt section b.
	 *
	 * @return the other please specify of this ogt section b
	 */
	@Override
	public String getOtherPleaseSpecify() {
		return model.getOtherPleaseSpecify();
	}

	/**
	 * Returns the primary key of this ogt section b.
	 *
	 * @return the primary key of this ogt section b
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the regarding the amount of this ogt section b.
	 *
	 * @return the regarding the amount of this ogt section b
	 */
	@Override
	public String getRegardingTheAmount() {
		return model.getRegardingTheAmount();
	}

	/**
	 * Returns the relation with debtor of this ogt section b.
	 *
	 * @return the relation with debtor of this ogt section b
	 */
	@Override
	public String getRelationWithDebtor() {
		return model.getRelationWithDebtor();
	}

	/**
	 * Returns the secured claim of this ogt section b.
	 *
	 * @return the secured claim of this ogt section b
	 */
	@Override
	public String getSecuredClaim() {
		return model.getSecuredClaim();
	}

	/**
	 * Returns the secured claim of of this ogt section b.
	 *
	 * @return the secured claim of of this ogt section b
	 */
	@Override
	public String getSecuredClaimOf() {
		return model.getSecuredClaimOf();
	}

	/**
	 * Returns the statement of account of this ogt section b.
	 *
	 * @return the statement of account of this ogt section b
	 */
	@Override
	public String getStatementOfAccount() {
		return model.getStatementOfAccount();
	}

	/**
	 * Returns the the debtor of this ogt section b.
	 *
	 * @return the the debtor of this ogt section b
	 */
	@Override
	public String getTheDebtor() {
		return model.getTheDebtor();
	}

	/**
	 * Returns the total value of claim of this ogt section b.
	 *
	 * @return the total value of claim of this ogt section b
	 */
	@Override
	public String getTotalValueOfClaim() {
		return model.getTotalValueOfClaim();
	}

	/**
	 * Returns the unsecured claim of this ogt section b.
	 *
	 * @return the unsecured claim of this ogt section b
	 */
	@Override
	public String getUnsecuredClaim() {
		return model.getUnsecuredClaim();
	}

	/**
	 * Returns the unsecured claim of of this ogt section b.
	 *
	 * @return the unsecured claim of of this ogt section b
	 */
	@Override
	public String getUnsecuredClaimOf() {
		return model.getUnsecuredClaimOf();
	}

	/**
	 * Returns the user ID of this ogt section b.
	 *
	 * @return the user ID of this ogt section b
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ogt section b.
	 *
	 * @return the user name of this ogt section b
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ogt section b.
	 *
	 * @return the user uuid of this ogt section b
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
	 * Sets the bankruptcy event description of this ogt section b.
	 *
	 * @param bankruptcyEventDescription the bankruptcy event description of this ogt section b
	 */
	@Override
	public void setBankruptcyEventDescription(
		String bankruptcyEventDescription) {

		model.setBankruptcyEventDescription(bankruptcyEventDescription);
	}

	/**
	 * Sets the bankruptcy of an individual of this ogt section b.
	 *
	 * @param bankruptcyOfAnIndividual the bankruptcy of an individual of this ogt section b
	 */
	@Override
	public void setBankruptcyOfAnIndividual(String bankruptcyOfAnIndividual) {
		model.setBankruptcyOfAnIndividual(bankruptcyOfAnIndividual);
	}

	/**
	 * Sets the category four of this ogt section b.
	 *
	 * @param categoryFour the category four of this ogt section b
	 */
	@Override
	public void setCategoryFour(String categoryFour) {
		model.setCategoryFour(categoryFour);
	}

	/**
	 * Sets the category one of this ogt section b.
	 *
	 * @param categoryOne the category one of this ogt section b
	 */
	@Override
	public void setCategoryOne(String categoryOne) {
		model.setCategoryOne(categoryOne);
	}

	/**
	 * Sets the category three of this ogt section b.
	 *
	 * @param categoryThree the category three of this ogt section b
	 */
	@Override
	public void setCategoryThree(String categoryThree) {
		model.setCategoryThree(categoryThree);
	}

	/**
	 * Sets the category two of this ogt section b.
	 *
	 * @param categoryTwo the category two of this ogt section b
	 */
	@Override
	public void setCategoryTwo(String categoryTwo) {
		model.setCategoryTwo(categoryTwo);
	}

	/**
	 * Sets the company ID of this ogt section b.
	 *
	 * @param companyId the company ID of this ogt section b
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ogt section b.
	 *
	 * @param createDate the create date of this ogt section b
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of insolvency of debtor of this ogt section b.
	 *
	 * @param dateOfInsolvencyOfDebtor the date of insolvency of debtor of this ogt section b
	 */
	@Override
	public void setDateOfInsolvencyOfDebtor(Date dateOfInsolvencyOfDebtor) {
		model.setDateOfInsolvencyOfDebtor(dateOfInsolvencyOfDebtor);
	}

	/**
	 * Sets the description of this ogt section b.
	 *
	 * @param description the description of this ogt section b
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the group ID of this ogt section b.
	 *
	 * @param groupId the group ID of this ogt section b
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ogt section b.
	 *
	 * @param modifiedDate the modified date of this ogt section b
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this ogt section b.
	 *
	 * @param name the name of this ogt section b
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the ogt application ID of this ogt section b.
	 *
	 * @param ogtApplicationId the ogt application ID of this ogt section b
	 */
	@Override
	public void setOgtApplicationId(long ogtApplicationId) {
		model.setOgtApplicationId(ogtApplicationId);
	}

	/**
	 * Sets the ogt section b ID of this ogt section b.
	 *
	 * @param ogtSectionBId the ogt section b ID of this ogt section b
	 */
	@Override
	public void setOgtSectionBId(long ogtSectionBId) {
		model.setOgtSectionBId(ogtSectionBId);
	}

	/**
	 * Sets the other please specify of this ogt section b.
	 *
	 * @param otherPleaseSpecify the other please specify of this ogt section b
	 */
	@Override
	public void setOtherPleaseSpecify(String otherPleaseSpecify) {
		model.setOtherPleaseSpecify(otherPleaseSpecify);
	}

	/**
	 * Sets the primary key of this ogt section b.
	 *
	 * @param primaryKey the primary key of this ogt section b
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the regarding the amount of this ogt section b.
	 *
	 * @param regardingTheAmount the regarding the amount of this ogt section b
	 */
	@Override
	public void setRegardingTheAmount(String regardingTheAmount) {
		model.setRegardingTheAmount(regardingTheAmount);
	}

	/**
	 * Sets the relation with debtor of this ogt section b.
	 *
	 * @param relationWithDebtor the relation with debtor of this ogt section b
	 */
	@Override
	public void setRelationWithDebtor(String relationWithDebtor) {
		model.setRelationWithDebtor(relationWithDebtor);
	}

	/**
	 * Sets the secured claim of this ogt section b.
	 *
	 * @param securedClaim the secured claim of this ogt section b
	 */
	@Override
	public void setSecuredClaim(String securedClaim) {
		model.setSecuredClaim(securedClaim);
	}

	/**
	 * Sets the secured claim of of this ogt section b.
	 *
	 * @param securedClaimOf the secured claim of of this ogt section b
	 */
	@Override
	public void setSecuredClaimOf(String securedClaimOf) {
		model.setSecuredClaimOf(securedClaimOf);
	}

	/**
	 * Sets the statement of account of this ogt section b.
	 *
	 * @param statementOfAccount the statement of account of this ogt section b
	 */
	@Override
	public void setStatementOfAccount(String statementOfAccount) {
		model.setStatementOfAccount(statementOfAccount);
	}

	/**
	 * Sets the the debtor of this ogt section b.
	 *
	 * @param theDebtor the the debtor of this ogt section b
	 */
	@Override
	public void setTheDebtor(String theDebtor) {
		model.setTheDebtor(theDebtor);
	}

	/**
	 * Sets the total value of claim of this ogt section b.
	 *
	 * @param totalValueOfClaim the total value of claim of this ogt section b
	 */
	@Override
	public void setTotalValueOfClaim(String totalValueOfClaim) {
		model.setTotalValueOfClaim(totalValueOfClaim);
	}

	/**
	 * Sets the unsecured claim of this ogt section b.
	 *
	 * @param unsecuredClaim the unsecured claim of this ogt section b
	 */
	@Override
	public void setUnsecuredClaim(String unsecuredClaim) {
		model.setUnsecuredClaim(unsecuredClaim);
	}

	/**
	 * Sets the unsecured claim of of this ogt section b.
	 *
	 * @param unsecuredClaimOf the unsecured claim of of this ogt section b
	 */
	@Override
	public void setUnsecuredClaimOf(String unsecuredClaimOf) {
		model.setUnsecuredClaimOf(unsecuredClaimOf);
	}

	/**
	 * Sets the user ID of this ogt section b.
	 *
	 * @param userId the user ID of this ogt section b
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ogt section b.
	 *
	 * @param userName the user name of this ogt section b
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ogt section b.
	 *
	 * @param userUuid the user uuid of this ogt section b
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
	protected OgtSectionBWrapper wrap(OgtSectionB ogtSectionB) {
		return new OgtSectionBWrapper(ogtSectionB);
	}

}
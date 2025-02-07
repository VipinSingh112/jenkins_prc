/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link MiicSuspensionOfCetAdd}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiicSuspensionOfCetAdd
 * @generated
 */
public class MiicSuspensionOfCetAddWrapper
	extends BaseModelWrapper<MiicSuspensionOfCetAdd>
	implements MiicSuspensionOfCetAdd, ModelWrapper<MiicSuspensionOfCetAdd> {

	public MiicSuspensionOfCetAddWrapper(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		super(miicSuspensionOfCetAdd);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"miicSuspensionOfCetAddId", getMiicSuspensionOfCetAddId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("name", getName());
		attributes.put("tariffHeadingNum ", getTariffHeadingNum());
		attributes.put("address", getAddress());
		attributes.put("description", getDescription());
		attributes.put("amountQuantity", getAmountQuantity());
		attributes.put("amountEstimateInUs", getAmountEstimateInUs());
		attributes.put("technologySpecification", getTechnologySpecification());
		attributes.put("cetRate", getCetRate());
		attributes.put("rateProposed", getRateProposed());
		attributes.put("periodOfRateChangeFrom", getPeriodOfRateChangeFrom());
		attributes.put("periodOfRateChangeTo", getPeriodOfRateChangeTo());
		attributes.put("indicationOfUrgency", getIndicationOfUrgency());
		attributes.put(
			"requestForSuspensionOfRate", getRequestForSuspensionOfRate());
		attributes.put("evidenceOfInability", getEvidenceOfInability());
		attributes.put("evidenceOfConsultation", getEvidenceOfConsultation());
		attributes.put("counter", getCounter());
		attributes.put("miicApplicationId", getMiicApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long miicSuspensionOfCetAddId = (Long)attributes.get(
			"miicSuspensionOfCetAddId");

		if (miicSuspensionOfCetAddId != null) {
			setMiicSuspensionOfCetAddId(miicSuspensionOfCetAddId);
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

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String tariffHeadingNum = (String)attributes.get("tariffHeadingNum ");

		if (tariffHeadingNum != null) {
			setTariffHeadingNum(tariffHeadingNum);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		String amountQuantity = (String)attributes.get("amountQuantity");

		if (amountQuantity != null) {
			setAmountQuantity(amountQuantity);
		}

		String amountEstimateInUs = (String)attributes.get(
			"amountEstimateInUs");

		if (amountEstimateInUs != null) {
			setAmountEstimateInUs(amountEstimateInUs);
		}

		String technologySpecification = (String)attributes.get(
			"technologySpecification");

		if (technologySpecification != null) {
			setTechnologySpecification(technologySpecification);
		}

		String cetRate = (String)attributes.get("cetRate");

		if (cetRate != null) {
			setCetRate(cetRate);
		}

		String rateProposed = (String)attributes.get("rateProposed");

		if (rateProposed != null) {
			setRateProposed(rateProposed);
		}

		Date periodOfRateChangeFrom = (Date)attributes.get(
			"periodOfRateChangeFrom");

		if (periodOfRateChangeFrom != null) {
			setPeriodOfRateChangeFrom(periodOfRateChangeFrom);
		}

		Date periodOfRateChangeTo = (Date)attributes.get(
			"periodOfRateChangeTo");

		if (periodOfRateChangeTo != null) {
			setPeriodOfRateChangeTo(periodOfRateChangeTo);
		}

		String indicationOfUrgency = (String)attributes.get(
			"indicationOfUrgency");

		if (indicationOfUrgency != null) {
			setIndicationOfUrgency(indicationOfUrgency);
		}

		String requestForSuspensionOfRate = (String)attributes.get(
			"requestForSuspensionOfRate");

		if (requestForSuspensionOfRate != null) {
			setRequestForSuspensionOfRate(requestForSuspensionOfRate);
		}

		String evidenceOfInability = (String)attributes.get(
			"evidenceOfInability");

		if (evidenceOfInability != null) {
			setEvidenceOfInability(evidenceOfInability);
		}

		String evidenceOfConsultation = (String)attributes.get(
			"evidenceOfConsultation");

		if (evidenceOfConsultation != null) {
			setEvidenceOfConsultation(evidenceOfConsultation);
		}

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		Long miicApplicationId = (Long)attributes.get("miicApplicationId");

		if (miicApplicationId != null) {
			setMiicApplicationId(miicApplicationId);
		}
	}

	@Override
	public MiicSuspensionOfCetAdd cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this miic suspension of cet add.
	 *
	 * @return the address of this miic suspension of cet add
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the amount estimate in us of this miic suspension of cet add.
	 *
	 * @return the amount estimate in us of this miic suspension of cet add
	 */
	@Override
	public String getAmountEstimateInUs() {
		return model.getAmountEstimateInUs();
	}

	/**
	 * Returns the amount quantity of this miic suspension of cet add.
	 *
	 * @return the amount quantity of this miic suspension of cet add
	 */
	@Override
	public String getAmountQuantity() {
		return model.getAmountQuantity();
	}

	/**
	 * Returns the cet rate of this miic suspension of cet add.
	 *
	 * @return the cet rate of this miic suspension of cet add
	 */
	@Override
	public String getCetRate() {
		return model.getCetRate();
	}

	/**
	 * Returns the company ID of this miic suspension of cet add.
	 *
	 * @return the company ID of this miic suspension of cet add
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this miic suspension of cet add.
	 *
	 * @return the counter of this miic suspension of cet add
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this miic suspension of cet add.
	 *
	 * @return the create date of this miic suspension of cet add
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the description of this miic suspension of cet add.
	 *
	 * @return the description of this miic suspension of cet add
	 */
	@Override
	public String getDescription() {
		return model.getDescription();
	}

	/**
	 * Returns the evidence of consultation of this miic suspension of cet add.
	 *
	 * @return the evidence of consultation of this miic suspension of cet add
	 */
	@Override
	public String getEvidenceOfConsultation() {
		return model.getEvidenceOfConsultation();
	}

	/**
	 * Returns the evidence of inability of this miic suspension of cet add.
	 *
	 * @return the evidence of inability of this miic suspension of cet add
	 */
	@Override
	public String getEvidenceOfInability() {
		return model.getEvidenceOfInability();
	}

	/**
	 * Returns the group ID of this miic suspension of cet add.
	 *
	 * @return the group ID of this miic suspension of cet add
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the indication of urgency of this miic suspension of cet add.
	 *
	 * @return the indication of urgency of this miic suspension of cet add
	 */
	@Override
	public String getIndicationOfUrgency() {
		return model.getIndicationOfUrgency();
	}

	/**
	 * Returns the miic application ID of this miic suspension of cet add.
	 *
	 * @return the miic application ID of this miic suspension of cet add
	 */
	@Override
	public long getMiicApplicationId() {
		return model.getMiicApplicationId();
	}

	/**
	 * Returns the miic suspension of cet add ID of this miic suspension of cet add.
	 *
	 * @return the miic suspension of cet add ID of this miic suspension of cet add
	 */
	@Override
	public long getMiicSuspensionOfCetAddId() {
		return model.getMiicSuspensionOfCetAddId();
	}

	/**
	 * Returns the modified date of this miic suspension of cet add.
	 *
	 * @return the modified date of this miic suspension of cet add
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of this miic suspension of cet add.
	 *
	 * @return the name of this miic suspension of cet add
	 */
	@Override
	public String getName() {
		return model.getName();
	}

	/**
	 * Returns the period of rate change from of this miic suspension of cet add.
	 *
	 * @return the period of rate change from of this miic suspension of cet add
	 */
	@Override
	public Date getPeriodOfRateChangeFrom() {
		return model.getPeriodOfRateChangeFrom();
	}

	/**
	 * Returns the period of rate change to of this miic suspension of cet add.
	 *
	 * @return the period of rate change to of this miic suspension of cet add
	 */
	@Override
	public Date getPeriodOfRateChangeTo() {
		return model.getPeriodOfRateChangeTo();
	}

	/**
	 * Returns the primary key of this miic suspension of cet add.
	 *
	 * @return the primary key of this miic suspension of cet add
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the rate proposed of this miic suspension of cet add.
	 *
	 * @return the rate proposed of this miic suspension of cet add
	 */
	@Override
	public String getRateProposed() {
		return model.getRateProposed();
	}

	/**
	 * Returns the request for suspension of rate of this miic suspension of cet add.
	 *
	 * @return the request for suspension of rate of this miic suspension of cet add
	 */
	@Override
	public String getRequestForSuspensionOfRate() {
		return model.getRequestForSuspensionOfRate();
	}

	/**
	 * Returns the tariff heading num of this miic suspension of cet add.
	 *
	 * @return the tariff heading num of this miic suspension of cet add
	 */
	@Override
	public String getTariffHeadingNum() {
		return model.getTariffHeadingNum();
	}

	/**
	 * Returns the technology specification of this miic suspension of cet add.
	 *
	 * @return the technology specification of this miic suspension of cet add
	 */
	@Override
	public String getTechnologySpecification() {
		return model.getTechnologySpecification();
	}

	/**
	 * Returns the user ID of this miic suspension of cet add.
	 *
	 * @return the user ID of this miic suspension of cet add
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this miic suspension of cet add.
	 *
	 * @return the user name of this miic suspension of cet add
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this miic suspension of cet add.
	 *
	 * @return the user uuid of this miic suspension of cet add
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
	 * Sets the address of this miic suspension of cet add.
	 *
	 * @param address the address of this miic suspension of cet add
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the amount estimate in us of this miic suspension of cet add.
	 *
	 * @param amountEstimateInUs the amount estimate in us of this miic suspension of cet add
	 */
	@Override
	public void setAmountEstimateInUs(String amountEstimateInUs) {
		model.setAmountEstimateInUs(amountEstimateInUs);
	}

	/**
	 * Sets the amount quantity of this miic suspension of cet add.
	 *
	 * @param amountQuantity the amount quantity of this miic suspension of cet add
	 */
	@Override
	public void setAmountQuantity(String amountQuantity) {
		model.setAmountQuantity(amountQuantity);
	}

	/**
	 * Sets the cet rate of this miic suspension of cet add.
	 *
	 * @param cetRate the cet rate of this miic suspension of cet add
	 */
	@Override
	public void setCetRate(String cetRate) {
		model.setCetRate(cetRate);
	}

	/**
	 * Sets the company ID of this miic suspension of cet add.
	 *
	 * @param companyId the company ID of this miic suspension of cet add
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this miic suspension of cet add.
	 *
	 * @param counter the counter of this miic suspension of cet add
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this miic suspension of cet add.
	 *
	 * @param createDate the create date of this miic suspension of cet add
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the description of this miic suspension of cet add.
	 *
	 * @param description the description of this miic suspension of cet add
	 */
	@Override
	public void setDescription(String description) {
		model.setDescription(description);
	}

	/**
	 * Sets the evidence of consultation of this miic suspension of cet add.
	 *
	 * @param evidenceOfConsultation the evidence of consultation of this miic suspension of cet add
	 */
	@Override
	public void setEvidenceOfConsultation(String evidenceOfConsultation) {
		model.setEvidenceOfConsultation(evidenceOfConsultation);
	}

	/**
	 * Sets the evidence of inability of this miic suspension of cet add.
	 *
	 * @param evidenceOfInability the evidence of inability of this miic suspension of cet add
	 */
	@Override
	public void setEvidenceOfInability(String evidenceOfInability) {
		model.setEvidenceOfInability(evidenceOfInability);
	}

	/**
	 * Sets the group ID of this miic suspension of cet add.
	 *
	 * @param groupId the group ID of this miic suspension of cet add
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the indication of urgency of this miic suspension of cet add.
	 *
	 * @param indicationOfUrgency the indication of urgency of this miic suspension of cet add
	 */
	@Override
	public void setIndicationOfUrgency(String indicationOfUrgency) {
		model.setIndicationOfUrgency(indicationOfUrgency);
	}

	/**
	 * Sets the miic application ID of this miic suspension of cet add.
	 *
	 * @param miicApplicationId the miic application ID of this miic suspension of cet add
	 */
	@Override
	public void setMiicApplicationId(long miicApplicationId) {
		model.setMiicApplicationId(miicApplicationId);
	}

	/**
	 * Sets the miic suspension of cet add ID of this miic suspension of cet add.
	 *
	 * @param miicSuspensionOfCetAddId the miic suspension of cet add ID of this miic suspension of cet add
	 */
	@Override
	public void setMiicSuspensionOfCetAddId(long miicSuspensionOfCetAddId) {
		model.setMiicSuspensionOfCetAddId(miicSuspensionOfCetAddId);
	}

	/**
	 * Sets the modified date of this miic suspension of cet add.
	 *
	 * @param modifiedDate the modified date of this miic suspension of cet add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of this miic suspension of cet add.
	 *
	 * @param name the name of this miic suspension of cet add
	 */
	@Override
	public void setName(String name) {
		model.setName(name);
	}

	/**
	 * Sets the period of rate change from of this miic suspension of cet add.
	 *
	 * @param periodOfRateChangeFrom the period of rate change from of this miic suspension of cet add
	 */
	@Override
	public void setPeriodOfRateChangeFrom(Date periodOfRateChangeFrom) {
		model.setPeriodOfRateChangeFrom(periodOfRateChangeFrom);
	}

	/**
	 * Sets the period of rate change to of this miic suspension of cet add.
	 *
	 * @param periodOfRateChangeTo the period of rate change to of this miic suspension of cet add
	 */
	@Override
	public void setPeriodOfRateChangeTo(Date periodOfRateChangeTo) {
		model.setPeriodOfRateChangeTo(periodOfRateChangeTo);
	}

	/**
	 * Sets the primary key of this miic suspension of cet add.
	 *
	 * @param primaryKey the primary key of this miic suspension of cet add
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the rate proposed of this miic suspension of cet add.
	 *
	 * @param rateProposed the rate proposed of this miic suspension of cet add
	 */
	@Override
	public void setRateProposed(String rateProposed) {
		model.setRateProposed(rateProposed);
	}

	/**
	 * Sets the request for suspension of rate of this miic suspension of cet add.
	 *
	 * @param requestForSuspensionOfRate the request for suspension of rate of this miic suspension of cet add
	 */
	@Override
	public void setRequestForSuspensionOfRate(
		String requestForSuspensionOfRate) {

		model.setRequestForSuspensionOfRate(requestForSuspensionOfRate);
	}

	/**
	 * Sets the tariff heading num of this miic suspension of cet add.
	 *
	 * @param tariffHeadingNum  the tariff heading num of this miic suspension of cet add
	 */
	@Override
	public void setTariffHeadingNum(String tariffHeadingNum) {
		model.setTariffHeadingNum(tariffHeadingNum);
	}

	/**
	 * Sets the technology specification of this miic suspension of cet add.
	 *
	 * @param technologySpecification the technology specification of this miic suspension of cet add
	 */
	@Override
	public void setTechnologySpecification(String technologySpecification) {
		model.setTechnologySpecification(technologySpecification);
	}

	/**
	 * Sets the user ID of this miic suspension of cet add.
	 *
	 * @param userId the user ID of this miic suspension of cet add
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this miic suspension of cet add.
	 *
	 * @param userName the user name of this miic suspension of cet add
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this miic suspension of cet add.
	 *
	 * @param userUuid the user uuid of this miic suspension of cet add
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
	protected MiicSuspensionOfCetAddWrapper wrap(
		MiicSuspensionOfCetAdd miicSuspensionOfCetAdd) {

		return new MiicSuspensionOfCetAddWrapper(miicSuspensionOfCetAdd);
	}

}
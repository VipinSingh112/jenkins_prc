/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JADSCInformationRequest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCInformationRequest
 * @generated
 */
public class JADSCInformationRequestWrapper
	extends BaseModelWrapper<JADSCInformationRequest>
	implements JADSCInformationRequest, ModelWrapper<JADSCInformationRequest> {

	public JADSCInformationRequestWrapper(
		JADSCInformationRequest jadscInformationRequest) {

		super(jadscInformationRequest);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jadscInfoRequestId", getJadscInfoRequestId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityId", getEntityId());
		attributes.put("companyName", getCompanyName());
		attributes.put("address", getAddress());
		attributes.put("mainTelephone", getMainTelephone());
		attributes.put("officeTelephone", getOfficeTelephone());
		attributes.put("cellTelephone", getCellTelephone());
		attributes.put("otherContact", getOtherContact());
		attributes.put("whatsappTelephone", getWhatsappTelephone());
		attributes.put("emailContact", getEmailContact());
		attributes.put("contactPerName", getContactPerName());
		attributes.put("contactPerPosition", getContactPerPosition());
		attributes.put("contactPerPhone", getContactPerPhone());
		attributes.put("contactPerEmail", getContactPerEmail());
		attributes.put("altContactPerName", getAltContactPerName());
		attributes.put("altContactPerPosition", getAltContactPerPosition());
		attributes.put("altContactPerPhone", getAltContactPerPhone());
		attributes.put("altContactPerEmail", getAltContactPerEmail());
		attributes.put("comOperationYear", getComOperationYear());
		attributes.put("products", getProducts());
		attributes.put("marketSharePer", getMarketSharePer());
		attributes.put("tradeRemedyMeasure", getTradeRemedyMeasure());
		attributes.put("fiveYearsInvestment", getFiveYearsInvestment());
		attributes.put("planCapacity", getPlanCapacity());
		attributes.put("growthProjection", getGrowthProjection());
		attributes.put("jadscApplicationId", getJadscApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jadscInfoRequestId = (Long)attributes.get("jadscInfoRequestId");

		if (jadscInfoRequestId != null) {
			setJadscInfoRequestId(jadscInfoRequestId);
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

		String entityId = (String)attributes.get("entityId");

		if (entityId != null) {
			setEntityId(entityId);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String mainTelephone = (String)attributes.get("mainTelephone");

		if (mainTelephone != null) {
			setMainTelephone(mainTelephone);
		}

		String officeTelephone = (String)attributes.get("officeTelephone");

		if (officeTelephone != null) {
			setOfficeTelephone(officeTelephone);
		}

		String cellTelephone = (String)attributes.get("cellTelephone");

		if (cellTelephone != null) {
			setCellTelephone(cellTelephone);
		}

		String otherContact = (String)attributes.get("otherContact");

		if (otherContact != null) {
			setOtherContact(otherContact);
		}

		String whatsappTelephone = (String)attributes.get("whatsappTelephone");

		if (whatsappTelephone != null) {
			setWhatsappTelephone(whatsappTelephone);
		}

		String emailContact = (String)attributes.get("emailContact");

		if (emailContact != null) {
			setEmailContact(emailContact);
		}

		String contactPerName = (String)attributes.get("contactPerName");

		if (contactPerName != null) {
			setContactPerName(contactPerName);
		}

		String contactPerPosition = (String)attributes.get(
			"contactPerPosition");

		if (contactPerPosition != null) {
			setContactPerPosition(contactPerPosition);
		}

		String contactPerPhone = (String)attributes.get("contactPerPhone");

		if (contactPerPhone != null) {
			setContactPerPhone(contactPerPhone);
		}

		String contactPerEmail = (String)attributes.get("contactPerEmail");

		if (contactPerEmail != null) {
			setContactPerEmail(contactPerEmail);
		}

		String altContactPerName = (String)attributes.get("altContactPerName");

		if (altContactPerName != null) {
			setAltContactPerName(altContactPerName);
		}

		String altContactPerPosition = (String)attributes.get(
			"altContactPerPosition");

		if (altContactPerPosition != null) {
			setAltContactPerPosition(altContactPerPosition);
		}

		String altContactPerPhone = (String)attributes.get(
			"altContactPerPhone");

		if (altContactPerPhone != null) {
			setAltContactPerPhone(altContactPerPhone);
		}

		String altContactPerEmail = (String)attributes.get(
			"altContactPerEmail");

		if (altContactPerEmail != null) {
			setAltContactPerEmail(altContactPerEmail);
		}

		String comOperationYear = (String)attributes.get("comOperationYear");

		if (comOperationYear != null) {
			setComOperationYear(comOperationYear);
		}

		String products = (String)attributes.get("products");

		if (products != null) {
			setProducts(products);
		}

		String marketSharePer = (String)attributes.get("marketSharePer");

		if (marketSharePer != null) {
			setMarketSharePer(marketSharePer);
		}

		String tradeRemedyMeasure = (String)attributes.get(
			"tradeRemedyMeasure");

		if (tradeRemedyMeasure != null) {
			setTradeRemedyMeasure(tradeRemedyMeasure);
		}

		String fiveYearsInvestment = (String)attributes.get(
			"fiveYearsInvestment");

		if (fiveYearsInvestment != null) {
			setFiveYearsInvestment(fiveYearsInvestment);
		}

		String planCapacity = (String)attributes.get("planCapacity");

		if (planCapacity != null) {
			setPlanCapacity(planCapacity);
		}

		String growthProjection = (String)attributes.get("growthProjection");

		if (growthProjection != null) {
			setGrowthProjection(growthProjection);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCInformationRequest cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this jadsc information request.
	 *
	 * @return the address of this jadsc information request
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the alt contact per email of this jadsc information request.
	 *
	 * @return the alt contact per email of this jadsc information request
	 */
	@Override
	public String getAltContactPerEmail() {
		return model.getAltContactPerEmail();
	}

	/**
	 * Returns the alt contact per name of this jadsc information request.
	 *
	 * @return the alt contact per name of this jadsc information request
	 */
	@Override
	public String getAltContactPerName() {
		return model.getAltContactPerName();
	}

	/**
	 * Returns the alt contact per phone of this jadsc information request.
	 *
	 * @return the alt contact per phone of this jadsc information request
	 */
	@Override
	public String getAltContactPerPhone() {
		return model.getAltContactPerPhone();
	}

	/**
	 * Returns the alt contact per position of this jadsc information request.
	 *
	 * @return the alt contact per position of this jadsc information request
	 */
	@Override
	public String getAltContactPerPosition() {
		return model.getAltContactPerPosition();
	}

	/**
	 * Returns the cell telephone of this jadsc information request.
	 *
	 * @return the cell telephone of this jadsc information request
	 */
	@Override
	public String getCellTelephone() {
		return model.getCellTelephone();
	}

	/**
	 * Returns the com operation year of this jadsc information request.
	 *
	 * @return the com operation year of this jadsc information request
	 */
	@Override
	public String getComOperationYear() {
		return model.getComOperationYear();
	}

	/**
	 * Returns the company ID of this jadsc information request.
	 *
	 * @return the company ID of this jadsc information request
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this jadsc information request.
	 *
	 * @return the company name of this jadsc information request
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the contact per email of this jadsc information request.
	 *
	 * @return the contact per email of this jadsc information request
	 */
	@Override
	public String getContactPerEmail() {
		return model.getContactPerEmail();
	}

	/**
	 * Returns the contact per name of this jadsc information request.
	 *
	 * @return the contact per name of this jadsc information request
	 */
	@Override
	public String getContactPerName() {
		return model.getContactPerName();
	}

	/**
	 * Returns the contact per phone of this jadsc information request.
	 *
	 * @return the contact per phone of this jadsc information request
	 */
	@Override
	public String getContactPerPhone() {
		return model.getContactPerPhone();
	}

	/**
	 * Returns the contact per position of this jadsc information request.
	 *
	 * @return the contact per position of this jadsc information request
	 */
	@Override
	public String getContactPerPosition() {
		return model.getContactPerPosition();
	}

	/**
	 * Returns the create date of this jadsc information request.
	 *
	 * @return the create date of this jadsc information request
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the email contact of this jadsc information request.
	 *
	 * @return the email contact of this jadsc information request
	 */
	@Override
	public String getEmailContact() {
		return model.getEmailContact();
	}

	/**
	 * Returns the entity ID of this jadsc information request.
	 *
	 * @return the entity ID of this jadsc information request
	 */
	@Override
	public String getEntityId() {
		return model.getEntityId();
	}

	/**
	 * Returns the five years investment of this jadsc information request.
	 *
	 * @return the five years investment of this jadsc information request
	 */
	@Override
	public String getFiveYearsInvestment() {
		return model.getFiveYearsInvestment();
	}

	/**
	 * Returns the group ID of this jadsc information request.
	 *
	 * @return the group ID of this jadsc information request
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the growth projection of this jadsc information request.
	 *
	 * @return the growth projection of this jadsc information request
	 */
	@Override
	public String getGrowthProjection() {
		return model.getGrowthProjection();
	}

	/**
	 * Returns the jadsc application ID of this jadsc information request.
	 *
	 * @return the jadsc application ID of this jadsc information request
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the jadsc info request ID of this jadsc information request.
	 *
	 * @return the jadsc info request ID of this jadsc information request
	 */
	@Override
	public long getJadscInfoRequestId() {
		return model.getJadscInfoRequestId();
	}

	/**
	 * Returns the main telephone of this jadsc information request.
	 *
	 * @return the main telephone of this jadsc information request
	 */
	@Override
	public String getMainTelephone() {
		return model.getMainTelephone();
	}

	/**
	 * Returns the market share per of this jadsc information request.
	 *
	 * @return the market share per of this jadsc information request
	 */
	@Override
	public String getMarketSharePer() {
		return model.getMarketSharePer();
	}

	/**
	 * Returns the modified date of this jadsc information request.
	 *
	 * @return the modified date of this jadsc information request
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the office telephone of this jadsc information request.
	 *
	 * @return the office telephone of this jadsc information request
	 */
	@Override
	public String getOfficeTelephone() {
		return model.getOfficeTelephone();
	}

	/**
	 * Returns the other contact of this jadsc information request.
	 *
	 * @return the other contact of this jadsc information request
	 */
	@Override
	public String getOtherContact() {
		return model.getOtherContact();
	}

	/**
	 * Returns the plan capacity of this jadsc information request.
	 *
	 * @return the plan capacity of this jadsc information request
	 */
	@Override
	public String getPlanCapacity() {
		return model.getPlanCapacity();
	}

	/**
	 * Returns the primary key of this jadsc information request.
	 *
	 * @return the primary key of this jadsc information request
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the products of this jadsc information request.
	 *
	 * @return the products of this jadsc information request
	 */
	@Override
	public String getProducts() {
		return model.getProducts();
	}

	/**
	 * Returns the trade remedy measure of this jadsc information request.
	 *
	 * @return the trade remedy measure of this jadsc information request
	 */
	@Override
	public String getTradeRemedyMeasure() {
		return model.getTradeRemedyMeasure();
	}

	/**
	 * Returns the user ID of this jadsc information request.
	 *
	 * @return the user ID of this jadsc information request
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc information request.
	 *
	 * @return the user name of this jadsc information request
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc information request.
	 *
	 * @return the user uuid of this jadsc information request
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc information request.
	 *
	 * @return the uuid of this jadsc information request
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the whatsapp telephone of this jadsc information request.
	 *
	 * @return the whatsapp telephone of this jadsc information request
	 */
	@Override
	public String getWhatsappTelephone() {
		return model.getWhatsappTelephone();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the address of this jadsc information request.
	 *
	 * @param address the address of this jadsc information request
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the alt contact per email of this jadsc information request.
	 *
	 * @param altContactPerEmail the alt contact per email of this jadsc information request
	 */
	@Override
	public void setAltContactPerEmail(String altContactPerEmail) {
		model.setAltContactPerEmail(altContactPerEmail);
	}

	/**
	 * Sets the alt contact per name of this jadsc information request.
	 *
	 * @param altContactPerName the alt contact per name of this jadsc information request
	 */
	@Override
	public void setAltContactPerName(String altContactPerName) {
		model.setAltContactPerName(altContactPerName);
	}

	/**
	 * Sets the alt contact per phone of this jadsc information request.
	 *
	 * @param altContactPerPhone the alt contact per phone of this jadsc information request
	 */
	@Override
	public void setAltContactPerPhone(String altContactPerPhone) {
		model.setAltContactPerPhone(altContactPerPhone);
	}

	/**
	 * Sets the alt contact per position of this jadsc information request.
	 *
	 * @param altContactPerPosition the alt contact per position of this jadsc information request
	 */
	@Override
	public void setAltContactPerPosition(String altContactPerPosition) {
		model.setAltContactPerPosition(altContactPerPosition);
	}

	/**
	 * Sets the cell telephone of this jadsc information request.
	 *
	 * @param cellTelephone the cell telephone of this jadsc information request
	 */
	@Override
	public void setCellTelephone(String cellTelephone) {
		model.setCellTelephone(cellTelephone);
	}

	/**
	 * Sets the com operation year of this jadsc information request.
	 *
	 * @param comOperationYear the com operation year of this jadsc information request
	 */
	@Override
	public void setComOperationYear(String comOperationYear) {
		model.setComOperationYear(comOperationYear);
	}

	/**
	 * Sets the company ID of this jadsc information request.
	 *
	 * @param companyId the company ID of this jadsc information request
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this jadsc information request.
	 *
	 * @param companyName the company name of this jadsc information request
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the contact per email of this jadsc information request.
	 *
	 * @param contactPerEmail the contact per email of this jadsc information request
	 */
	@Override
	public void setContactPerEmail(String contactPerEmail) {
		model.setContactPerEmail(contactPerEmail);
	}

	/**
	 * Sets the contact per name of this jadsc information request.
	 *
	 * @param contactPerName the contact per name of this jadsc information request
	 */
	@Override
	public void setContactPerName(String contactPerName) {
		model.setContactPerName(contactPerName);
	}

	/**
	 * Sets the contact per phone of this jadsc information request.
	 *
	 * @param contactPerPhone the contact per phone of this jadsc information request
	 */
	@Override
	public void setContactPerPhone(String contactPerPhone) {
		model.setContactPerPhone(contactPerPhone);
	}

	/**
	 * Sets the contact per position of this jadsc information request.
	 *
	 * @param contactPerPosition the contact per position of this jadsc information request
	 */
	@Override
	public void setContactPerPosition(String contactPerPosition) {
		model.setContactPerPosition(contactPerPosition);
	}

	/**
	 * Sets the create date of this jadsc information request.
	 *
	 * @param createDate the create date of this jadsc information request
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the email contact of this jadsc information request.
	 *
	 * @param emailContact the email contact of this jadsc information request
	 */
	@Override
	public void setEmailContact(String emailContact) {
		model.setEmailContact(emailContact);
	}

	/**
	 * Sets the entity ID of this jadsc information request.
	 *
	 * @param entityId the entity ID of this jadsc information request
	 */
	@Override
	public void setEntityId(String entityId) {
		model.setEntityId(entityId);
	}

	/**
	 * Sets the five years investment of this jadsc information request.
	 *
	 * @param fiveYearsInvestment the five years investment of this jadsc information request
	 */
	@Override
	public void setFiveYearsInvestment(String fiveYearsInvestment) {
		model.setFiveYearsInvestment(fiveYearsInvestment);
	}

	/**
	 * Sets the group ID of this jadsc information request.
	 *
	 * @param groupId the group ID of this jadsc information request
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the growth projection of this jadsc information request.
	 *
	 * @param growthProjection the growth projection of this jadsc information request
	 */
	@Override
	public void setGrowthProjection(String growthProjection) {
		model.setGrowthProjection(growthProjection);
	}

	/**
	 * Sets the jadsc application ID of this jadsc information request.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc information request
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the jadsc info request ID of this jadsc information request.
	 *
	 * @param jadscInfoRequestId the jadsc info request ID of this jadsc information request
	 */
	@Override
	public void setJadscInfoRequestId(long jadscInfoRequestId) {
		model.setJadscInfoRequestId(jadscInfoRequestId);
	}

	/**
	 * Sets the main telephone of this jadsc information request.
	 *
	 * @param mainTelephone the main telephone of this jadsc information request
	 */
	@Override
	public void setMainTelephone(String mainTelephone) {
		model.setMainTelephone(mainTelephone);
	}

	/**
	 * Sets the market share per of this jadsc information request.
	 *
	 * @param marketSharePer the market share per of this jadsc information request
	 */
	@Override
	public void setMarketSharePer(String marketSharePer) {
		model.setMarketSharePer(marketSharePer);
	}

	/**
	 * Sets the modified date of this jadsc information request.
	 *
	 * @param modifiedDate the modified date of this jadsc information request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the office telephone of this jadsc information request.
	 *
	 * @param officeTelephone the office telephone of this jadsc information request
	 */
	@Override
	public void setOfficeTelephone(String officeTelephone) {
		model.setOfficeTelephone(officeTelephone);
	}

	/**
	 * Sets the other contact of this jadsc information request.
	 *
	 * @param otherContact the other contact of this jadsc information request
	 */
	@Override
	public void setOtherContact(String otherContact) {
		model.setOtherContact(otherContact);
	}

	/**
	 * Sets the plan capacity of this jadsc information request.
	 *
	 * @param planCapacity the plan capacity of this jadsc information request
	 */
	@Override
	public void setPlanCapacity(String planCapacity) {
		model.setPlanCapacity(planCapacity);
	}

	/**
	 * Sets the primary key of this jadsc information request.
	 *
	 * @param primaryKey the primary key of this jadsc information request
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the products of this jadsc information request.
	 *
	 * @param products the products of this jadsc information request
	 */
	@Override
	public void setProducts(String products) {
		model.setProducts(products);
	}

	/**
	 * Sets the trade remedy measure of this jadsc information request.
	 *
	 * @param tradeRemedyMeasure the trade remedy measure of this jadsc information request
	 */
	@Override
	public void setTradeRemedyMeasure(String tradeRemedyMeasure) {
		model.setTradeRemedyMeasure(tradeRemedyMeasure);
	}

	/**
	 * Sets the user ID of this jadsc information request.
	 *
	 * @param userId the user ID of this jadsc information request
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc information request.
	 *
	 * @param userName the user name of this jadsc information request
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc information request.
	 *
	 * @param userUuid the user uuid of this jadsc information request
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc information request.
	 *
	 * @param uuid the uuid of this jadsc information request
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the whatsapp telephone of this jadsc information request.
	 *
	 * @param whatsappTelephone the whatsapp telephone of this jadsc information request
	 */
	@Override
	public void setWhatsappTelephone(String whatsappTelephone) {
		model.setWhatsappTelephone(whatsappTelephone);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected JADSCInformationRequestWrapper wrap(
		JADSCInformationRequest jadscInformationRequest) {

		return new JADSCInformationRequestWrapper(jadscInformationRequest);
	}

}
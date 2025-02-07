/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.entity.information.services.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link EntityInformation}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see EntityInformation
 * @generated
 */
public class EntityInformationWrapper
	extends BaseModelWrapper<EntityInformation>
	implements EntityInformation, ModelWrapper<EntityInformation> {

	public EntityInformationWrapper(EntityInformation entityInformation) {
		super(entityInformation);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("entityInfoId", getEntityInfoId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("entityName", getEntityName());
		attributes.put("entityAddressOne", getEntityAddressOne());
		attributes.put("entityAddressTwo", getEntityAddressTwo());
		attributes.put("telephone", getTelephone());
		attributes.put("mailingAdd", getMailingAdd());
		attributes.put("permanentAdd", getPermanentAdd());
		attributes.put("fax", getFax());
		attributes.put("website", getWebsite());
		attributes.put("postalCode", getPostalCode());
		attributes.put("parish", getParish());
		attributes.put("officeEmail", getOfficeEmail());
		attributes.put("country", getCountry());
		attributes.put("incorporationDate", getIncorporationDate());
		attributes.put("incorporationPlace", getIncorporationPlace());
		attributes.put("isUserPrimaryUser", getIsUserPrimaryUser());
		attributes.put("entityNumber", getEntityNumber());
		attributes.put("userType", getUserType());
		attributes.put("trn", getTrn());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long entityInfoId = (Long)attributes.get("entityInfoId");

		if (entityInfoId != null) {
			setEntityInfoId(entityInfoId);
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

		String entityName = (String)attributes.get("entityName");

		if (entityName != null) {
			setEntityName(entityName);
		}

		String entityAddressOne = (String)attributes.get("entityAddressOne");

		if (entityAddressOne != null) {
			setEntityAddressOne(entityAddressOne);
		}

		String entityAddressTwo = (String)attributes.get("entityAddressTwo");

		if (entityAddressTwo != null) {
			setEntityAddressTwo(entityAddressTwo);
		}

		String telephone = (String)attributes.get("telephone");

		if (telephone != null) {
			setTelephone(telephone);
		}

		String mailingAdd = (String)attributes.get("mailingAdd");

		if (mailingAdd != null) {
			setMailingAdd(mailingAdd);
		}

		String permanentAdd = (String)attributes.get("permanentAdd");

		if (permanentAdd != null) {
			setPermanentAdd(permanentAdd);
		}

		String fax = (String)attributes.get("fax");

		if (fax != null) {
			setFax(fax);
		}

		String website = (String)attributes.get("website");

		if (website != null) {
			setWebsite(website);
		}

		String postalCode = (String)attributes.get("postalCode");

		if (postalCode != null) {
			setPostalCode(postalCode);
		}

		String parish = (String)attributes.get("parish");

		if (parish != null) {
			setParish(parish);
		}

		String officeEmail = (String)attributes.get("officeEmail");

		if (officeEmail != null) {
			setOfficeEmail(officeEmail);
		}

		String country = (String)attributes.get("country");

		if (country != null) {
			setCountry(country);
		}

		Date incorporationDate = (Date)attributes.get("incorporationDate");

		if (incorporationDate != null) {
			setIncorporationDate(incorporationDate);
		}

		String incorporationPlace = (String)attributes.get(
			"incorporationPlace");

		if (incorporationPlace != null) {
			setIncorporationPlace(incorporationPlace);
		}

		String isUserPrimaryUser = (String)attributes.get("isUserPrimaryUser");

		if (isUserPrimaryUser != null) {
			setIsUserPrimaryUser(isUserPrimaryUser);
		}

		String entityNumber = (String)attributes.get("entityNumber");

		if (entityNumber != null) {
			setEntityNumber(entityNumber);
		}

		String userType = (String)attributes.get("userType");

		if (userType != null) {
			setUserType(userType);
		}

		String trn = (String)attributes.get("trn");

		if (trn != null) {
			setTrn(trn);
		}
	}

	@Override
	public EntityInformation cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this entity information.
	 *
	 * @return the company ID of this entity information
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the country of this entity information.
	 *
	 * @return the country of this entity information
	 */
	@Override
	public String getCountry() {
		return model.getCountry();
	}

	/**
	 * Returns the create date of this entity information.
	 *
	 * @return the create date of this entity information
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the entity address one of this entity information.
	 *
	 * @return the entity address one of this entity information
	 */
	@Override
	public String getEntityAddressOne() {
		return model.getEntityAddressOne();
	}

	/**
	 * Returns the entity address two of this entity information.
	 *
	 * @return the entity address two of this entity information
	 */
	@Override
	public String getEntityAddressTwo() {
		return model.getEntityAddressTwo();
	}

	/**
	 * Returns the entity info ID of this entity information.
	 *
	 * @return the entity info ID of this entity information
	 */
	@Override
	public long getEntityInfoId() {
		return model.getEntityInfoId();
	}

	/**
	 * Returns the entity name of this entity information.
	 *
	 * @return the entity name of this entity information
	 */
	@Override
	public String getEntityName() {
		return model.getEntityName();
	}

	/**
	 * Returns the entity number of this entity information.
	 *
	 * @return the entity number of this entity information
	 */
	@Override
	public String getEntityNumber() {
		return model.getEntityNumber();
	}

	/**
	 * Returns the fax of this entity information.
	 *
	 * @return the fax of this entity information
	 */
	@Override
	public String getFax() {
		return model.getFax();
	}

	/**
	 * Returns the group ID of this entity information.
	 *
	 * @return the group ID of this entity information
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the incorporation date of this entity information.
	 *
	 * @return the incorporation date of this entity information
	 */
	@Override
	public Date getIncorporationDate() {
		return model.getIncorporationDate();
	}

	/**
	 * Returns the incorporation place of this entity information.
	 *
	 * @return the incorporation place of this entity information
	 */
	@Override
	public String getIncorporationPlace() {
		return model.getIncorporationPlace();
	}

	/**
	 * Returns the is user primary user of this entity information.
	 *
	 * @return the is user primary user of this entity information
	 */
	@Override
	public String getIsUserPrimaryUser() {
		return model.getIsUserPrimaryUser();
	}

	/**
	 * Returns the mailing add of this entity information.
	 *
	 * @return the mailing add of this entity information
	 */
	@Override
	public String getMailingAdd() {
		return model.getMailingAdd();
	}

	/**
	 * Returns the modified date of this entity information.
	 *
	 * @return the modified date of this entity information
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the office email of this entity information.
	 *
	 * @return the office email of this entity information
	 */
	@Override
	public String getOfficeEmail() {
		return model.getOfficeEmail();
	}

	/**
	 * Returns the parish of this entity information.
	 *
	 * @return the parish of this entity information
	 */
	@Override
	public String getParish() {
		return model.getParish();
	}

	/**
	 * Returns the permanent add of this entity information.
	 *
	 * @return the permanent add of this entity information
	 */
	@Override
	public String getPermanentAdd() {
		return model.getPermanentAdd();
	}

	/**
	 * Returns the postal code of this entity information.
	 *
	 * @return the postal code of this entity information
	 */
	@Override
	public String getPostalCode() {
		return model.getPostalCode();
	}

	/**
	 * Returns the primary key of this entity information.
	 *
	 * @return the primary key of this entity information
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the telephone of this entity information.
	 *
	 * @return the telephone of this entity information
	 */
	@Override
	public String getTelephone() {
		return model.getTelephone();
	}

	/**
	 * Returns the trn of this entity information.
	 *
	 * @return the trn of this entity information
	 */
	@Override
	public String getTrn() {
		return model.getTrn();
	}

	/**
	 * Returns the user ID of this entity information.
	 *
	 * @return the user ID of this entity information
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this entity information.
	 *
	 * @return the user name of this entity information
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user type of this entity information.
	 *
	 * @return the user type of this entity information
	 */
	@Override
	public String getUserType() {
		return model.getUserType();
	}

	/**
	 * Returns the user uuid of this entity information.
	 *
	 * @return the user uuid of this entity information
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this entity information.
	 *
	 * @return the uuid of this entity information
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the website of this entity information.
	 *
	 * @return the website of this entity information
	 */
	@Override
	public String getWebsite() {
		return model.getWebsite();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this entity information.
	 *
	 * @param companyId the company ID of this entity information
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the country of this entity information.
	 *
	 * @param country the country of this entity information
	 */
	@Override
	public void setCountry(String country) {
		model.setCountry(country);
	}

	/**
	 * Sets the create date of this entity information.
	 *
	 * @param createDate the create date of this entity information
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the entity address one of this entity information.
	 *
	 * @param entityAddressOne the entity address one of this entity information
	 */
	@Override
	public void setEntityAddressOne(String entityAddressOne) {
		model.setEntityAddressOne(entityAddressOne);
	}

	/**
	 * Sets the entity address two of this entity information.
	 *
	 * @param entityAddressTwo the entity address two of this entity information
	 */
	@Override
	public void setEntityAddressTwo(String entityAddressTwo) {
		model.setEntityAddressTwo(entityAddressTwo);
	}

	/**
	 * Sets the entity info ID of this entity information.
	 *
	 * @param entityInfoId the entity info ID of this entity information
	 */
	@Override
	public void setEntityInfoId(long entityInfoId) {
		model.setEntityInfoId(entityInfoId);
	}

	/**
	 * Sets the entity name of this entity information.
	 *
	 * @param entityName the entity name of this entity information
	 */
	@Override
	public void setEntityName(String entityName) {
		model.setEntityName(entityName);
	}

	/**
	 * Sets the entity number of this entity information.
	 *
	 * @param entityNumber the entity number of this entity information
	 */
	@Override
	public void setEntityNumber(String entityNumber) {
		model.setEntityNumber(entityNumber);
	}

	/**
	 * Sets the fax of this entity information.
	 *
	 * @param fax the fax of this entity information
	 */
	@Override
	public void setFax(String fax) {
		model.setFax(fax);
	}

	/**
	 * Sets the group ID of this entity information.
	 *
	 * @param groupId the group ID of this entity information
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the incorporation date of this entity information.
	 *
	 * @param incorporationDate the incorporation date of this entity information
	 */
	@Override
	public void setIncorporationDate(Date incorporationDate) {
		model.setIncorporationDate(incorporationDate);
	}

	/**
	 * Sets the incorporation place of this entity information.
	 *
	 * @param incorporationPlace the incorporation place of this entity information
	 */
	@Override
	public void setIncorporationPlace(String incorporationPlace) {
		model.setIncorporationPlace(incorporationPlace);
	}

	/**
	 * Sets the is user primary user of this entity information.
	 *
	 * @param isUserPrimaryUser the is user primary user of this entity information
	 */
	@Override
	public void setIsUserPrimaryUser(String isUserPrimaryUser) {
		model.setIsUserPrimaryUser(isUserPrimaryUser);
	}

	/**
	 * Sets the mailing add of this entity information.
	 *
	 * @param mailingAdd the mailing add of this entity information
	 */
	@Override
	public void setMailingAdd(String mailingAdd) {
		model.setMailingAdd(mailingAdd);
	}

	/**
	 * Sets the modified date of this entity information.
	 *
	 * @param modifiedDate the modified date of this entity information
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the office email of this entity information.
	 *
	 * @param officeEmail the office email of this entity information
	 */
	@Override
	public void setOfficeEmail(String officeEmail) {
		model.setOfficeEmail(officeEmail);
	}

	/**
	 * Sets the parish of this entity information.
	 *
	 * @param parish the parish of this entity information
	 */
	@Override
	public void setParish(String parish) {
		model.setParish(parish);
	}

	/**
	 * Sets the permanent add of this entity information.
	 *
	 * @param permanentAdd the permanent add of this entity information
	 */
	@Override
	public void setPermanentAdd(String permanentAdd) {
		model.setPermanentAdd(permanentAdd);
	}

	/**
	 * Sets the postal code of this entity information.
	 *
	 * @param postalCode the postal code of this entity information
	 */
	@Override
	public void setPostalCode(String postalCode) {
		model.setPostalCode(postalCode);
	}

	/**
	 * Sets the primary key of this entity information.
	 *
	 * @param primaryKey the primary key of this entity information
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the telephone of this entity information.
	 *
	 * @param telephone the telephone of this entity information
	 */
	@Override
	public void setTelephone(String telephone) {
		model.setTelephone(telephone);
	}

	/**
	 * Sets the trn of this entity information.
	 *
	 * @param trn the trn of this entity information
	 */
	@Override
	public void setTrn(String trn) {
		model.setTrn(trn);
	}

	/**
	 * Sets the user ID of this entity information.
	 *
	 * @param userId the user ID of this entity information
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this entity information.
	 *
	 * @param userName the user name of this entity information
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user type of this entity information.
	 *
	 * @param userType the user type of this entity information
	 */
	@Override
	public void setUserType(String userType) {
		model.setUserType(userType);
	}

	/**
	 * Sets the user uuid of this entity information.
	 *
	 * @param userUuid the user uuid of this entity information
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this entity information.
	 *
	 * @param uuid the uuid of this entity information
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the website of this entity information.
	 *
	 * @param website the website of this entity information
	 */
	@Override
	public void setWebsite(String website) {
		model.setWebsite(website);
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
	protected EntityInformationWrapper wrap(
		EntityInformation entityInformation) {

		return new EntityInformationWrapper(entityInformation);
	}

}
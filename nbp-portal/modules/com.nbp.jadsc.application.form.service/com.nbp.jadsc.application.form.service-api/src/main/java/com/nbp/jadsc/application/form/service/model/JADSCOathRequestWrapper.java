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
 * This class is a wrapper for {@link JADSCOathRequest}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCOathRequest
 * @generated
 */
public class JADSCOathRequestWrapper
	extends BaseModelWrapper<JADSCOathRequest>
	implements JADSCOathRequest, ModelWrapper<JADSCOathRequest> {

	public JADSCOathRequestWrapper(JADSCOathRequest jadscOathRequest) {
		super(jadscOathRequest);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("jadscOathRequestId", getJadscOathRequestId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("investigationType", getInvestigationType());
		attributes.put("partyName", getPartyName());
		attributes.put("requestReason", getRequestReason());
		attributes.put("comOfficial", getComOfficial());
		attributes.put("signatureDate", getSignatureDate());
		attributes.put("jadscApplicationId", getJadscApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long jadscOathRequestId = (Long)attributes.get("jadscOathRequestId");

		if (jadscOathRequestId != null) {
			setJadscOathRequestId(jadscOathRequestId);
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

		String investigationType = (String)attributes.get("investigationType");

		if (investigationType != null) {
			setInvestigationType(investigationType);
		}

		String partyName = (String)attributes.get("partyName");

		if (partyName != null) {
			setPartyName(partyName);
		}

		String requestReason = (String)attributes.get("requestReason");

		if (requestReason != null) {
			setRequestReason(requestReason);
		}

		String comOfficial = (String)attributes.get("comOfficial");

		if (comOfficial != null) {
			setComOfficial(comOfficial);
		}

		Date signatureDate = (Date)attributes.get("signatureDate");

		if (signatureDate != null) {
			setSignatureDate(signatureDate);
		}

		Long jadscApplicationId = (Long)attributes.get("jadscApplicationId");

		if (jadscApplicationId != null) {
			setJadscApplicationId(jadscApplicationId);
		}
	}

	@Override
	public JADSCOathRequest cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the com official of this jadsc oath request.
	 *
	 * @return the com official of this jadsc oath request
	 */
	@Override
	public String getComOfficial() {
		return model.getComOfficial();
	}

	/**
	 * Returns the company ID of this jadsc oath request.
	 *
	 * @return the company ID of this jadsc oath request
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this jadsc oath request.
	 *
	 * @return the create date of this jadsc oath request
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jadsc oath request.
	 *
	 * @return the group ID of this jadsc oath request
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the investigation type of this jadsc oath request.
	 *
	 * @return the investigation type of this jadsc oath request
	 */
	@Override
	public String getInvestigationType() {
		return model.getInvestigationType();
	}

	/**
	 * Returns the jadsc application ID of this jadsc oath request.
	 *
	 * @return the jadsc application ID of this jadsc oath request
	 */
	@Override
	public long getJadscApplicationId() {
		return model.getJadscApplicationId();
	}

	/**
	 * Returns the jadsc oath request ID of this jadsc oath request.
	 *
	 * @return the jadsc oath request ID of this jadsc oath request
	 */
	@Override
	public long getJadscOathRequestId() {
		return model.getJadscOathRequestId();
	}

	/**
	 * Returns the modified date of this jadsc oath request.
	 *
	 * @return the modified date of this jadsc oath request
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the party name of this jadsc oath request.
	 *
	 * @return the party name of this jadsc oath request
	 */
	@Override
	public String getPartyName() {
		return model.getPartyName();
	}

	/**
	 * Returns the primary key of this jadsc oath request.
	 *
	 * @return the primary key of this jadsc oath request
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the request reason of this jadsc oath request.
	 *
	 * @return the request reason of this jadsc oath request
	 */
	@Override
	public String getRequestReason() {
		return model.getRequestReason();
	}

	/**
	 * Returns the signature date of this jadsc oath request.
	 *
	 * @return the signature date of this jadsc oath request
	 */
	@Override
	public Date getSignatureDate() {
		return model.getSignatureDate();
	}

	/**
	 * Returns the user ID of this jadsc oath request.
	 *
	 * @return the user ID of this jadsc oath request
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jadsc oath request.
	 *
	 * @return the user name of this jadsc oath request
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jadsc oath request.
	 *
	 * @return the user uuid of this jadsc oath request
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this jadsc oath request.
	 *
	 * @return the uuid of this jadsc oath request
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the com official of this jadsc oath request.
	 *
	 * @param comOfficial the com official of this jadsc oath request
	 */
	@Override
	public void setComOfficial(String comOfficial) {
		model.setComOfficial(comOfficial);
	}

	/**
	 * Sets the company ID of this jadsc oath request.
	 *
	 * @param companyId the company ID of this jadsc oath request
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this jadsc oath request.
	 *
	 * @param createDate the create date of this jadsc oath request
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jadsc oath request.
	 *
	 * @param groupId the group ID of this jadsc oath request
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the investigation type of this jadsc oath request.
	 *
	 * @param investigationType the investigation type of this jadsc oath request
	 */
	@Override
	public void setInvestigationType(String investigationType) {
		model.setInvestigationType(investigationType);
	}

	/**
	 * Sets the jadsc application ID of this jadsc oath request.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc oath request
	 */
	@Override
	public void setJadscApplicationId(long jadscApplicationId) {
		model.setJadscApplicationId(jadscApplicationId);
	}

	/**
	 * Sets the jadsc oath request ID of this jadsc oath request.
	 *
	 * @param jadscOathRequestId the jadsc oath request ID of this jadsc oath request
	 */
	@Override
	public void setJadscOathRequestId(long jadscOathRequestId) {
		model.setJadscOathRequestId(jadscOathRequestId);
	}

	/**
	 * Sets the modified date of this jadsc oath request.
	 *
	 * @param modifiedDate the modified date of this jadsc oath request
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the party name of this jadsc oath request.
	 *
	 * @param partyName the party name of this jadsc oath request
	 */
	@Override
	public void setPartyName(String partyName) {
		model.setPartyName(partyName);
	}

	/**
	 * Sets the primary key of this jadsc oath request.
	 *
	 * @param primaryKey the primary key of this jadsc oath request
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the request reason of this jadsc oath request.
	 *
	 * @param requestReason the request reason of this jadsc oath request
	 */
	@Override
	public void setRequestReason(String requestReason) {
		model.setRequestReason(requestReason);
	}

	/**
	 * Sets the signature date of this jadsc oath request.
	 *
	 * @param signatureDate the signature date of this jadsc oath request
	 */
	@Override
	public void setSignatureDate(Date signatureDate) {
		model.setSignatureDate(signatureDate);
	}

	/**
	 * Sets the user ID of this jadsc oath request.
	 *
	 * @param userId the user ID of this jadsc oath request
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jadsc oath request.
	 *
	 * @param userName the user name of this jadsc oath request
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jadsc oath request.
	 *
	 * @param userUuid the user uuid of this jadsc oath request
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this jadsc oath request.
	 *
	 * @param uuid the uuid of this jadsc oath request
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
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
	protected JADSCOathRequestWrapper wrap(JADSCOathRequest jadscOathRequest) {
		return new JADSCOathRequestWrapper(jadscOathRequest);
	}

}
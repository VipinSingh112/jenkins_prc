/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link SezOccupantGeneralBussinessInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessInfo
 * @generated
 */
public class SezOccupantGeneralBussinessInfoWrapper
	extends BaseModelWrapper<SezOccupantGeneralBussinessInfo>
	implements ModelWrapper<SezOccupantGeneralBussinessInfo>,
			   SezOccupantGeneralBussinessInfo {

	public SezOccupantGeneralBussinessInfoWrapper(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		super(sezOccupantGeneralBussinessInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccGenBussId", getSezOccGenBussId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occAppDate", getOccAppDate());
		attributes.put("occSezDevName", getOccSezDevName());
		attributes.put("occSezDevControlNum", getOccSezDevControlNum());
		attributes.put("occExistingCom", getOccExistingCom());
		attributes.put("occFormArticle", getOccFormArticle());
		attributes.put("occFormArticleOther", getOccFormArticleOther());
		attributes.put("occTRN", getOccTRN());
		attributes.put("occGCT", getOccGCT());
		attributes.put("occTCC", getOccTCC());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccGenBussId = (Long)attributes.get("sezOccGenBussId");

		if (sezOccGenBussId != null) {
			setSezOccGenBussId(sezOccGenBussId);
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

		Date occAppDate = (Date)attributes.get("occAppDate");

		if (occAppDate != null) {
			setOccAppDate(occAppDate);
		}

		String occSezDevName = (String)attributes.get("occSezDevName");

		if (occSezDevName != null) {
			setOccSezDevName(occSezDevName);
		}

		String occSezDevControlNum = (String)attributes.get(
			"occSezDevControlNum");

		if (occSezDevControlNum != null) {
			setOccSezDevControlNum(occSezDevControlNum);
		}

		String occExistingCom = (String)attributes.get("occExistingCom");

		if (occExistingCom != null) {
			setOccExistingCom(occExistingCom);
		}

		String occFormArticle = (String)attributes.get("occFormArticle");

		if (occFormArticle != null) {
			setOccFormArticle(occFormArticle);
		}

		String occFormArticleOther = (String)attributes.get(
			"occFormArticleOther");

		if (occFormArticleOther != null) {
			setOccFormArticleOther(occFormArticleOther);
		}

		String occTRN = (String)attributes.get("occTRN");

		if (occTRN != null) {
			setOccTRN(occTRN);
		}

		String occGCT = (String)attributes.get("occGCT");

		if (occGCT != null) {
			setOccGCT(occGCT);
		}

		String occTCC = (String)attributes.get("occTCC");

		if (occTCC != null) {
			setOccTCC(occTCC);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupantGeneralBussinessInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupant general bussiness info.
	 *
	 * @return the company ID of this sez occupant general bussiness info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupant general bussiness info.
	 *
	 * @return the create date of this sez occupant general bussiness info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupant general bussiness info.
	 *
	 * @return the group ID of this sez occupant general bussiness info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupant general bussiness info.
	 *
	 * @return the modified date of this sez occupant general bussiness info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ app date of this sez occupant general bussiness info.
	 *
	 * @return the occ app date of this sez occupant general bussiness info
	 */
	@Override
	public Date getOccAppDate() {
		return model.getOccAppDate();
	}

	/**
	 * Returns the occ existing com of this sez occupant general bussiness info.
	 *
	 * @return the occ existing com of this sez occupant general bussiness info
	 */
	@Override
	public String getOccExistingCom() {
		return model.getOccExistingCom();
	}

	/**
	 * Returns the occ form article of this sez occupant general bussiness info.
	 *
	 * @return the occ form article of this sez occupant general bussiness info
	 */
	@Override
	public String getOccFormArticle() {
		return model.getOccFormArticle();
	}

	/**
	 * Returns the occ form article other of this sez occupant general bussiness info.
	 *
	 * @return the occ form article other of this sez occupant general bussiness info
	 */
	@Override
	public String getOccFormArticleOther() {
		return model.getOccFormArticleOther();
	}

	/**
	 * Returns the occ gct of this sez occupant general bussiness info.
	 *
	 * @return the occ gct of this sez occupant general bussiness info
	 */
	@Override
	public String getOccGCT() {
		return model.getOccGCT();
	}

	/**
	 * Returns the occ sez dev control num of this sez occupant general bussiness info.
	 *
	 * @return the occ sez dev control num of this sez occupant general bussiness info
	 */
	@Override
	public String getOccSezDevControlNum() {
		return model.getOccSezDevControlNum();
	}

	/**
	 * Returns the occ sez dev name of this sez occupant general bussiness info.
	 *
	 * @return the occ sez dev name of this sez occupant general bussiness info
	 */
	@Override
	public String getOccSezDevName() {
		return model.getOccSezDevName();
	}

	/**
	 * Returns the occ tcc of this sez occupant general bussiness info.
	 *
	 * @return the occ tcc of this sez occupant general bussiness info
	 */
	@Override
	public String getOccTCC() {
		return model.getOccTCC();
	}

	/**
	 * Returns the occ trn of this sez occupant general bussiness info.
	 *
	 * @return the occ trn of this sez occupant general bussiness info
	 */
	@Override
	public String getOccTRN() {
		return model.getOccTRN();
	}

	/**
	 * Returns the primary key of this sez occupant general bussiness info.
	 *
	 * @return the primary key of this sez occupant general bussiness info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ gen buss ID of this sez occupant general bussiness info.
	 *
	 * @return the sez occ gen buss ID of this sez occupant general bussiness info
	 */
	@Override
	public long getSezOccGenBussId() {
		return model.getSezOccGenBussId();
	}

	/**
	 * Returns the sez status application ID of this sez occupant general bussiness info.
	 *
	 * @return the sez status application ID of this sez occupant general bussiness info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupant general bussiness info.
	 *
	 * @return the user ID of this sez occupant general bussiness info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupant general bussiness info.
	 *
	 * @return the user name of this sez occupant general bussiness info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupant general bussiness info.
	 *
	 * @return the user uuid of this sez occupant general bussiness info
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
	 * Sets the company ID of this sez occupant general bussiness info.
	 *
	 * @param companyId the company ID of this sez occupant general bussiness info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupant general bussiness info.
	 *
	 * @param createDate the create date of this sez occupant general bussiness info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupant general bussiness info.
	 *
	 * @param groupId the group ID of this sez occupant general bussiness info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupant general bussiness info.
	 *
	 * @param modifiedDate the modified date of this sez occupant general bussiness info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ app date of this sez occupant general bussiness info.
	 *
	 * @param occAppDate the occ app date of this sez occupant general bussiness info
	 */
	@Override
	public void setOccAppDate(Date occAppDate) {
		model.setOccAppDate(occAppDate);
	}

	/**
	 * Sets the occ existing com of this sez occupant general bussiness info.
	 *
	 * @param occExistingCom the occ existing com of this sez occupant general bussiness info
	 */
	@Override
	public void setOccExistingCom(String occExistingCom) {
		model.setOccExistingCom(occExistingCom);
	}

	/**
	 * Sets the occ form article of this sez occupant general bussiness info.
	 *
	 * @param occFormArticle the occ form article of this sez occupant general bussiness info
	 */
	@Override
	public void setOccFormArticle(String occFormArticle) {
		model.setOccFormArticle(occFormArticle);
	}

	/**
	 * Sets the occ form article other of this sez occupant general bussiness info.
	 *
	 * @param occFormArticleOther the occ form article other of this sez occupant general bussiness info
	 */
	@Override
	public void setOccFormArticleOther(String occFormArticleOther) {
		model.setOccFormArticleOther(occFormArticleOther);
	}

	/**
	 * Sets the occ gct of this sez occupant general bussiness info.
	 *
	 * @param occGCT the occ gct of this sez occupant general bussiness info
	 */
	@Override
	public void setOccGCT(String occGCT) {
		model.setOccGCT(occGCT);
	}

	/**
	 * Sets the occ sez dev control num of this sez occupant general bussiness info.
	 *
	 * @param occSezDevControlNum the occ sez dev control num of this sez occupant general bussiness info
	 */
	@Override
	public void setOccSezDevControlNum(String occSezDevControlNum) {
		model.setOccSezDevControlNum(occSezDevControlNum);
	}

	/**
	 * Sets the occ sez dev name of this sez occupant general bussiness info.
	 *
	 * @param occSezDevName the occ sez dev name of this sez occupant general bussiness info
	 */
	@Override
	public void setOccSezDevName(String occSezDevName) {
		model.setOccSezDevName(occSezDevName);
	}

	/**
	 * Sets the occ tcc of this sez occupant general bussiness info.
	 *
	 * @param occTCC the occ tcc of this sez occupant general bussiness info
	 */
	@Override
	public void setOccTCC(String occTCC) {
		model.setOccTCC(occTCC);
	}

	/**
	 * Sets the occ trn of this sez occupant general bussiness info.
	 *
	 * @param occTRN the occ trn of this sez occupant general bussiness info
	 */
	@Override
	public void setOccTRN(String occTRN) {
		model.setOccTRN(occTRN);
	}

	/**
	 * Sets the primary key of this sez occupant general bussiness info.
	 *
	 * @param primaryKey the primary key of this sez occupant general bussiness info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ gen buss ID of this sez occupant general bussiness info.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID of this sez occupant general bussiness info
	 */
	@Override
	public void setSezOccGenBussId(long sezOccGenBussId) {
		model.setSezOccGenBussId(sezOccGenBussId);
	}

	/**
	 * Sets the sez status application ID of this sez occupant general bussiness info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant general bussiness info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupant general bussiness info.
	 *
	 * @param userId the user ID of this sez occupant general bussiness info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupant general bussiness info.
	 *
	 * @param userName the user name of this sez occupant general bussiness info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupant general bussiness info.
	 *
	 * @param userUuid the user uuid of this sez occupant general bussiness info
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
	protected SezOccupantGeneralBussinessInfoWrapper wrap(
		SezOccupantGeneralBussinessInfo sezOccupantGeneralBussinessInfo) {

		return new SezOccupantGeneralBussinessInfoWrapper(
			sezOccupantGeneralBussinessInfo);
	}

}
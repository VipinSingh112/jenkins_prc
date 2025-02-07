/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CreativeCompanyEconomicEffect}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeCompanyEconomicEffect
 * @generated
 */
public class CreativeCompanyEconomicEffectWrapper
	extends BaseModelWrapper<CreativeCompanyEconomicEffect>
	implements CreativeCompanyEconomicEffect,
			   ModelWrapper<CreativeCompanyEconomicEffect> {

	public CreativeCompanyEconomicEffectWrapper(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		super(creativeCompanyEconomicEffect);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"creativeComEconomicEffectId", getCreativeComEconomicEffectId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"assessmentcountryOfOrigin", getAssessmentcountryOfOrigin());
		attributes.put("ssessmentjointVenture", getSsessmentjointVenture());
		attributes.put("assessmentLocal", getAssessmentLocal());
		attributes.put("assessmentForeign", getAssessmentForeign());
		attributes.put("shareJmd", getShareJmd());
		attributes.put("shareExchangeRate", getShareExchangeRate());
		attributes.put("shareUsd", getShareUsd());
		attributes.put("localJmd", getLocalJmd());
		attributes.put("localExchangeRate", getLocalExchangeRate());
		attributes.put("localUsd", getLocalUsd());
		attributes.put("otherJmd", getOtherJmd());
		attributes.put("otherExchangeRate", getOtherExchangeRate());
		attributes.put("OtherUsd", getOtherUsd());
		attributes.put("permanentLocalMale", getPermanentLocalMale());
		attributes.put("permanentLocalFemale", getPermanentLocalFemale());
		attributes.put("permanentForeignMale", getPermanentForeignMale());
		attributes.put("permanentForeignFemale", getPermanentForeignFemale());
		attributes.put("temporaryLocalMale", getTemporaryLocalMale());
		attributes.put("temporaryLocalFemale", getTemporaryLocalFemale());
		attributes.put("temporaryForeignMale", getTemporaryForeignMale());
		attributes.put("temporaryForgeignFemale", getTemporaryForgeignFemale());
		attributes.put("totalLocalMale", getTotalLocalMale());
		attributes.put("totalLocalFemale", getTotalLocalFemale());
		attributes.put("totalForeignMale", getTotalForeignMale());
		attributes.put("totalForeignFemale", getTotalForeignFemale());
		attributes.put("CreativeApplicationId", getCreativeApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long creativeComEconomicEffectId = (Long)attributes.get(
			"creativeComEconomicEffectId");

		if (creativeComEconomicEffectId != null) {
			setCreativeComEconomicEffectId(creativeComEconomicEffectId);
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

		String assessmentcountryOfOrigin = (String)attributes.get(
			"assessmentcountryOfOrigin");

		if (assessmentcountryOfOrigin != null) {
			setAssessmentcountryOfOrigin(assessmentcountryOfOrigin);
		}

		String ssessmentjointVenture = (String)attributes.get(
			"ssessmentjointVenture");

		if (ssessmentjointVenture != null) {
			setSsessmentjointVenture(ssessmentjointVenture);
		}

		String assessmentLocal = (String)attributes.get("assessmentLocal");

		if (assessmentLocal != null) {
			setAssessmentLocal(assessmentLocal);
		}

		String assessmentForeign = (String)attributes.get("assessmentForeign");

		if (assessmentForeign != null) {
			setAssessmentForeign(assessmentForeign);
		}

		String shareJmd = (String)attributes.get("shareJmd");

		if (shareJmd != null) {
			setShareJmd(shareJmd);
		}

		String shareExchangeRate = (String)attributes.get("shareExchangeRate");

		if (shareExchangeRate != null) {
			setShareExchangeRate(shareExchangeRate);
		}

		String shareUsd = (String)attributes.get("shareUsd");

		if (shareUsd != null) {
			setShareUsd(shareUsd);
		}

		String localJmd = (String)attributes.get("localJmd");

		if (localJmd != null) {
			setLocalJmd(localJmd);
		}

		String localExchangeRate = (String)attributes.get("localExchangeRate");

		if (localExchangeRate != null) {
			setLocalExchangeRate(localExchangeRate);
		}

		String localUsd = (String)attributes.get("localUsd");

		if (localUsd != null) {
			setLocalUsd(localUsd);
		}

		String otherJmd = (String)attributes.get("otherJmd");

		if (otherJmd != null) {
			setOtherJmd(otherJmd);
		}

		String otherExchangeRate = (String)attributes.get("otherExchangeRate");

		if (otherExchangeRate != null) {
			setOtherExchangeRate(otherExchangeRate);
		}

		String OtherUsd = (String)attributes.get("OtherUsd");

		if (OtherUsd != null) {
			setOtherUsd(OtherUsd);
		}

		String permanentLocalMale = (String)attributes.get(
			"permanentLocalMale");

		if (permanentLocalMale != null) {
			setPermanentLocalMale(permanentLocalMale);
		}

		String permanentLocalFemale = (String)attributes.get(
			"permanentLocalFemale");

		if (permanentLocalFemale != null) {
			setPermanentLocalFemale(permanentLocalFemale);
		}

		String permanentForeignMale = (String)attributes.get(
			"permanentForeignMale");

		if (permanentForeignMale != null) {
			setPermanentForeignMale(permanentForeignMale);
		}

		String permanentForeignFemale = (String)attributes.get(
			"permanentForeignFemale");

		if (permanentForeignFemale != null) {
			setPermanentForeignFemale(permanentForeignFemale);
		}

		String temporaryLocalMale = (String)attributes.get(
			"temporaryLocalMale");

		if (temporaryLocalMale != null) {
			setTemporaryLocalMale(temporaryLocalMale);
		}

		String temporaryLocalFemale = (String)attributes.get(
			"temporaryLocalFemale");

		if (temporaryLocalFemale != null) {
			setTemporaryLocalFemale(temporaryLocalFemale);
		}

		String temporaryForeignMale = (String)attributes.get(
			"temporaryForeignMale");

		if (temporaryForeignMale != null) {
			setTemporaryForeignMale(temporaryForeignMale);
		}

		String temporaryForgeignFemale = (String)attributes.get(
			"temporaryForgeignFemale");

		if (temporaryForgeignFemale != null) {
			setTemporaryForgeignFemale(temporaryForgeignFemale);
		}

		String totalLocalMale = (String)attributes.get("totalLocalMale");

		if (totalLocalMale != null) {
			setTotalLocalMale(totalLocalMale);
		}

		String totalLocalFemale = (String)attributes.get("totalLocalFemale");

		if (totalLocalFemale != null) {
			setTotalLocalFemale(totalLocalFemale);
		}

		String totalForeignMale = (String)attributes.get("totalForeignMale");

		if (totalForeignMale != null) {
			setTotalForeignMale(totalForeignMale);
		}

		String totalForeignFemale = (String)attributes.get(
			"totalForeignFemale");

		if (totalForeignFemale != null) {
			setTotalForeignFemale(totalForeignFemale);
		}

		Long CreativeApplicationId = (Long)attributes.get(
			"CreativeApplicationId");

		if (CreativeApplicationId != null) {
			setCreativeApplicationId(CreativeApplicationId);
		}
	}

	@Override
	public CreativeCompanyEconomicEffect cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the assessmentcountry of origin of this creative company economic effect.
	 *
	 * @return the assessmentcountry of origin of this creative company economic effect
	 */
	@Override
	public String getAssessmentcountryOfOrigin() {
		return model.getAssessmentcountryOfOrigin();
	}

	/**
	 * Returns the assessment foreign of this creative company economic effect.
	 *
	 * @return the assessment foreign of this creative company economic effect
	 */
	@Override
	public String getAssessmentForeign() {
		return model.getAssessmentForeign();
	}

	/**
	 * Returns the assessment local of this creative company economic effect.
	 *
	 * @return the assessment local of this creative company economic effect
	 */
	@Override
	public String getAssessmentLocal() {
		return model.getAssessmentLocal();
	}

	/**
	 * Returns the company ID of this creative company economic effect.
	 *
	 * @return the company ID of this creative company economic effect
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this creative company economic effect.
	 *
	 * @return the create date of this creative company economic effect
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the creative application ID of this creative company economic effect.
	 *
	 * @return the creative application ID of this creative company economic effect
	 */
	@Override
	public long getCreativeApplicationId() {
		return model.getCreativeApplicationId();
	}

	/**
	 * Returns the creative com economic effect ID of this creative company economic effect.
	 *
	 * @return the creative com economic effect ID of this creative company economic effect
	 */
	@Override
	public long getCreativeComEconomicEffectId() {
		return model.getCreativeComEconomicEffectId();
	}

	/**
	 * Returns the group ID of this creative company economic effect.
	 *
	 * @return the group ID of this creative company economic effect
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the local exchange rate of this creative company economic effect.
	 *
	 * @return the local exchange rate of this creative company economic effect
	 */
	@Override
	public String getLocalExchangeRate() {
		return model.getLocalExchangeRate();
	}

	/**
	 * Returns the local jmd of this creative company economic effect.
	 *
	 * @return the local jmd of this creative company economic effect
	 */
	@Override
	public String getLocalJmd() {
		return model.getLocalJmd();
	}

	/**
	 * Returns the local usd of this creative company economic effect.
	 *
	 * @return the local usd of this creative company economic effect
	 */
	@Override
	public String getLocalUsd() {
		return model.getLocalUsd();
	}

	/**
	 * Returns the modified date of this creative company economic effect.
	 *
	 * @return the modified date of this creative company economic effect
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the other exchange rate of this creative company economic effect.
	 *
	 * @return the other exchange rate of this creative company economic effect
	 */
	@Override
	public String getOtherExchangeRate() {
		return model.getOtherExchangeRate();
	}

	/**
	 * Returns the other jmd of this creative company economic effect.
	 *
	 * @return the other jmd of this creative company economic effect
	 */
	@Override
	public String getOtherJmd() {
		return model.getOtherJmd();
	}

	/**
	 * Returns the other usd of this creative company economic effect.
	 *
	 * @return the other usd of this creative company economic effect
	 */
	@Override
	public String getOtherUsd() {
		return model.getOtherUsd();
	}

	/**
	 * Returns the permanent foreign female of this creative company economic effect.
	 *
	 * @return the permanent foreign female of this creative company economic effect
	 */
	@Override
	public String getPermanentForeignFemale() {
		return model.getPermanentForeignFemale();
	}

	/**
	 * Returns the permanent foreign male of this creative company economic effect.
	 *
	 * @return the permanent foreign male of this creative company economic effect
	 */
	@Override
	public String getPermanentForeignMale() {
		return model.getPermanentForeignMale();
	}

	/**
	 * Returns the permanent local female of this creative company economic effect.
	 *
	 * @return the permanent local female of this creative company economic effect
	 */
	@Override
	public String getPermanentLocalFemale() {
		return model.getPermanentLocalFemale();
	}

	/**
	 * Returns the permanent local male of this creative company economic effect.
	 *
	 * @return the permanent local male of this creative company economic effect
	 */
	@Override
	public String getPermanentLocalMale() {
		return model.getPermanentLocalMale();
	}

	/**
	 * Returns the primary key of this creative company economic effect.
	 *
	 * @return the primary key of this creative company economic effect
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the share exchange rate of this creative company economic effect.
	 *
	 * @return the share exchange rate of this creative company economic effect
	 */
	@Override
	public String getShareExchangeRate() {
		return model.getShareExchangeRate();
	}

	/**
	 * Returns the share jmd of this creative company economic effect.
	 *
	 * @return the share jmd of this creative company economic effect
	 */
	@Override
	public String getShareJmd() {
		return model.getShareJmd();
	}

	/**
	 * Returns the share usd of this creative company economic effect.
	 *
	 * @return the share usd of this creative company economic effect
	 */
	@Override
	public String getShareUsd() {
		return model.getShareUsd();
	}

	/**
	 * Returns the ssessmentjoint venture of this creative company economic effect.
	 *
	 * @return the ssessmentjoint venture of this creative company economic effect
	 */
	@Override
	public String getSsessmentjointVenture() {
		return model.getSsessmentjointVenture();
	}

	/**
	 * Returns the temporary foreign male of this creative company economic effect.
	 *
	 * @return the temporary foreign male of this creative company economic effect
	 */
	@Override
	public String getTemporaryForeignMale() {
		return model.getTemporaryForeignMale();
	}

	/**
	 * Returns the temporary forgeign female of this creative company economic effect.
	 *
	 * @return the temporary forgeign female of this creative company economic effect
	 */
	@Override
	public String getTemporaryForgeignFemale() {
		return model.getTemporaryForgeignFemale();
	}

	/**
	 * Returns the temporary local female of this creative company economic effect.
	 *
	 * @return the temporary local female of this creative company economic effect
	 */
	@Override
	public String getTemporaryLocalFemale() {
		return model.getTemporaryLocalFemale();
	}

	/**
	 * Returns the temporary local male of this creative company economic effect.
	 *
	 * @return the temporary local male of this creative company economic effect
	 */
	@Override
	public String getTemporaryLocalMale() {
		return model.getTemporaryLocalMale();
	}

	/**
	 * Returns the total foreign female of this creative company economic effect.
	 *
	 * @return the total foreign female of this creative company economic effect
	 */
	@Override
	public String getTotalForeignFemale() {
		return model.getTotalForeignFemale();
	}

	/**
	 * Returns the total foreign male of this creative company economic effect.
	 *
	 * @return the total foreign male of this creative company economic effect
	 */
	@Override
	public String getTotalForeignMale() {
		return model.getTotalForeignMale();
	}

	/**
	 * Returns the total local female of this creative company economic effect.
	 *
	 * @return the total local female of this creative company economic effect
	 */
	@Override
	public String getTotalLocalFemale() {
		return model.getTotalLocalFemale();
	}

	/**
	 * Returns the total local male of this creative company economic effect.
	 *
	 * @return the total local male of this creative company economic effect
	 */
	@Override
	public String getTotalLocalMale() {
		return model.getTotalLocalMale();
	}

	/**
	 * Returns the user ID of this creative company economic effect.
	 *
	 * @return the user ID of this creative company economic effect
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this creative company economic effect.
	 *
	 * @return the user name of this creative company economic effect
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this creative company economic effect.
	 *
	 * @return the user uuid of this creative company economic effect
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
	 * Sets the assessmentcountry of origin of this creative company economic effect.
	 *
	 * @param assessmentcountryOfOrigin the assessmentcountry of origin of this creative company economic effect
	 */
	@Override
	public void setAssessmentcountryOfOrigin(String assessmentcountryOfOrigin) {
		model.setAssessmentcountryOfOrigin(assessmentcountryOfOrigin);
	}

	/**
	 * Sets the assessment foreign of this creative company economic effect.
	 *
	 * @param assessmentForeign the assessment foreign of this creative company economic effect
	 */
	@Override
	public void setAssessmentForeign(String assessmentForeign) {
		model.setAssessmentForeign(assessmentForeign);
	}

	/**
	 * Sets the assessment local of this creative company economic effect.
	 *
	 * @param assessmentLocal the assessment local of this creative company economic effect
	 */
	@Override
	public void setAssessmentLocal(String assessmentLocal) {
		model.setAssessmentLocal(assessmentLocal);
	}

	/**
	 * Sets the company ID of this creative company economic effect.
	 *
	 * @param companyId the company ID of this creative company economic effect
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this creative company economic effect.
	 *
	 * @param createDate the create date of this creative company economic effect
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the creative application ID of this creative company economic effect.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative company economic effect
	 */
	@Override
	public void setCreativeApplicationId(long CreativeApplicationId) {
		model.setCreativeApplicationId(CreativeApplicationId);
	}

	/**
	 * Sets the creative com economic effect ID of this creative company economic effect.
	 *
	 * @param creativeComEconomicEffectId the creative com economic effect ID of this creative company economic effect
	 */
	@Override
	public void setCreativeComEconomicEffectId(
		long creativeComEconomicEffectId) {

		model.setCreativeComEconomicEffectId(creativeComEconomicEffectId);
	}

	/**
	 * Sets the group ID of this creative company economic effect.
	 *
	 * @param groupId the group ID of this creative company economic effect
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the local exchange rate of this creative company economic effect.
	 *
	 * @param localExchangeRate the local exchange rate of this creative company economic effect
	 */
	@Override
	public void setLocalExchangeRate(String localExchangeRate) {
		model.setLocalExchangeRate(localExchangeRate);
	}

	/**
	 * Sets the local jmd of this creative company economic effect.
	 *
	 * @param localJmd the local jmd of this creative company economic effect
	 */
	@Override
	public void setLocalJmd(String localJmd) {
		model.setLocalJmd(localJmd);
	}

	/**
	 * Sets the local usd of this creative company economic effect.
	 *
	 * @param localUsd the local usd of this creative company economic effect
	 */
	@Override
	public void setLocalUsd(String localUsd) {
		model.setLocalUsd(localUsd);
	}

	/**
	 * Sets the modified date of this creative company economic effect.
	 *
	 * @param modifiedDate the modified date of this creative company economic effect
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the other exchange rate of this creative company economic effect.
	 *
	 * @param otherExchangeRate the other exchange rate of this creative company economic effect
	 */
	@Override
	public void setOtherExchangeRate(String otherExchangeRate) {
		model.setOtherExchangeRate(otherExchangeRate);
	}

	/**
	 * Sets the other jmd of this creative company economic effect.
	 *
	 * @param otherJmd the other jmd of this creative company economic effect
	 */
	@Override
	public void setOtherJmd(String otherJmd) {
		model.setOtherJmd(otherJmd);
	}

	/**
	 * Sets the other usd of this creative company economic effect.
	 *
	 * @param OtherUsd the other usd of this creative company economic effect
	 */
	@Override
	public void setOtherUsd(String OtherUsd) {
		model.setOtherUsd(OtherUsd);
	}

	/**
	 * Sets the permanent foreign female of this creative company economic effect.
	 *
	 * @param permanentForeignFemale the permanent foreign female of this creative company economic effect
	 */
	@Override
	public void setPermanentForeignFemale(String permanentForeignFemale) {
		model.setPermanentForeignFemale(permanentForeignFemale);
	}

	/**
	 * Sets the permanent foreign male of this creative company economic effect.
	 *
	 * @param permanentForeignMale the permanent foreign male of this creative company economic effect
	 */
	@Override
	public void setPermanentForeignMale(String permanentForeignMale) {
		model.setPermanentForeignMale(permanentForeignMale);
	}

	/**
	 * Sets the permanent local female of this creative company economic effect.
	 *
	 * @param permanentLocalFemale the permanent local female of this creative company economic effect
	 */
	@Override
	public void setPermanentLocalFemale(String permanentLocalFemale) {
		model.setPermanentLocalFemale(permanentLocalFemale);
	}

	/**
	 * Sets the permanent local male of this creative company economic effect.
	 *
	 * @param permanentLocalMale the permanent local male of this creative company economic effect
	 */
	@Override
	public void setPermanentLocalMale(String permanentLocalMale) {
		model.setPermanentLocalMale(permanentLocalMale);
	}

	/**
	 * Sets the primary key of this creative company economic effect.
	 *
	 * @param primaryKey the primary key of this creative company economic effect
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the share exchange rate of this creative company economic effect.
	 *
	 * @param shareExchangeRate the share exchange rate of this creative company economic effect
	 */
	@Override
	public void setShareExchangeRate(String shareExchangeRate) {
		model.setShareExchangeRate(shareExchangeRate);
	}

	/**
	 * Sets the share jmd of this creative company economic effect.
	 *
	 * @param shareJmd the share jmd of this creative company economic effect
	 */
	@Override
	public void setShareJmd(String shareJmd) {
		model.setShareJmd(shareJmd);
	}

	/**
	 * Sets the share usd of this creative company economic effect.
	 *
	 * @param shareUsd the share usd of this creative company economic effect
	 */
	@Override
	public void setShareUsd(String shareUsd) {
		model.setShareUsd(shareUsd);
	}

	/**
	 * Sets the ssessmentjoint venture of this creative company economic effect.
	 *
	 * @param ssessmentjointVenture the ssessmentjoint venture of this creative company economic effect
	 */
	@Override
	public void setSsessmentjointVenture(String ssessmentjointVenture) {
		model.setSsessmentjointVenture(ssessmentjointVenture);
	}

	/**
	 * Sets the temporary foreign male of this creative company economic effect.
	 *
	 * @param temporaryForeignMale the temporary foreign male of this creative company economic effect
	 */
	@Override
	public void setTemporaryForeignMale(String temporaryForeignMale) {
		model.setTemporaryForeignMale(temporaryForeignMale);
	}

	/**
	 * Sets the temporary forgeign female of this creative company economic effect.
	 *
	 * @param temporaryForgeignFemale the temporary forgeign female of this creative company economic effect
	 */
	@Override
	public void setTemporaryForgeignFemale(String temporaryForgeignFemale) {
		model.setTemporaryForgeignFemale(temporaryForgeignFemale);
	}

	/**
	 * Sets the temporary local female of this creative company economic effect.
	 *
	 * @param temporaryLocalFemale the temporary local female of this creative company economic effect
	 */
	@Override
	public void setTemporaryLocalFemale(String temporaryLocalFemale) {
		model.setTemporaryLocalFemale(temporaryLocalFemale);
	}

	/**
	 * Sets the temporary local male of this creative company economic effect.
	 *
	 * @param temporaryLocalMale the temporary local male of this creative company economic effect
	 */
	@Override
	public void setTemporaryLocalMale(String temporaryLocalMale) {
		model.setTemporaryLocalMale(temporaryLocalMale);
	}

	/**
	 * Sets the total foreign female of this creative company economic effect.
	 *
	 * @param totalForeignFemale the total foreign female of this creative company economic effect
	 */
	@Override
	public void setTotalForeignFemale(String totalForeignFemale) {
		model.setTotalForeignFemale(totalForeignFemale);
	}

	/**
	 * Sets the total foreign male of this creative company economic effect.
	 *
	 * @param totalForeignMale the total foreign male of this creative company economic effect
	 */
	@Override
	public void setTotalForeignMale(String totalForeignMale) {
		model.setTotalForeignMale(totalForeignMale);
	}

	/**
	 * Sets the total local female of this creative company economic effect.
	 *
	 * @param totalLocalFemale the total local female of this creative company economic effect
	 */
	@Override
	public void setTotalLocalFemale(String totalLocalFemale) {
		model.setTotalLocalFemale(totalLocalFemale);
	}

	/**
	 * Sets the total local male of this creative company economic effect.
	 *
	 * @param totalLocalMale the total local male of this creative company economic effect
	 */
	@Override
	public void setTotalLocalMale(String totalLocalMale) {
		model.setTotalLocalMale(totalLocalMale);
	}

	/**
	 * Sets the user ID of this creative company economic effect.
	 *
	 * @param userId the user ID of this creative company economic effect
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this creative company economic effect.
	 *
	 * @param userName the user name of this creative company economic effect
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this creative company economic effect.
	 *
	 * @param userUuid the user uuid of this creative company economic effect
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
	protected CreativeCompanyEconomicEffectWrapper wrap(
		CreativeCompanyEconomicEffect creativeCompanyEconomicEffect) {

		return new CreativeCompanyEconomicEffectWrapper(
			creativeCompanyEconomicEffect);
	}

}
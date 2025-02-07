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
 * This class is a wrapper for {@link NcbjAddLocMultiSite}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjAddLocMultiSite
 * @generated
 */
public class NcbjAddLocMultiSiteWrapper
	extends BaseModelWrapper<NcbjAddLocMultiSite>
	implements ModelWrapper<NcbjAddLocMultiSite>, NcbjAddLocMultiSite {

	public NcbjAddLocMultiSiteWrapper(NcbjAddLocMultiSite ncbjAddLocMultiSite) {
		super(ncbjAddLocMultiSite);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("ncbjAddLocMultiSiteId", getNcbjAddLocMultiSiteId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("signatureName", getSignatureName());
		attributes.put("centralOfficeLink", getCentralOfficeLink());
		attributes.put("commonManagementSystem", getCommonManagementSystem());
		attributes.put(
			"substantiallySameProcess", getSubstantiallySameProcess());
		attributes.put("siteSimilarMethod", getSiteSimilarMethod());
		attributes.put("siteUnderAudit", getSiteUnderAudit());
		attributes.put("siteCorrectiveRight", getSiteCorrectiveRight());
		attributes.put("changesAuthority", getChangesAuthority());
		attributes.put("position", getPosition());
		attributes.put("date", getDate());
		attributes.put("ncbjApplicationId", getNcbjApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long ncbjAddLocMultiSiteId = (Long)attributes.get(
			"ncbjAddLocMultiSiteId");

		if (ncbjAddLocMultiSiteId != null) {
			setNcbjAddLocMultiSiteId(ncbjAddLocMultiSiteId);
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

		String signatureName = (String)attributes.get("signatureName");

		if (signatureName != null) {
			setSignatureName(signatureName);
		}

		String centralOfficeLink = (String)attributes.get("centralOfficeLink");

		if (centralOfficeLink != null) {
			setCentralOfficeLink(centralOfficeLink);
		}

		String commonManagementSystem = (String)attributes.get(
			"commonManagementSystem");

		if (commonManagementSystem != null) {
			setCommonManagementSystem(commonManagementSystem);
		}

		String substantiallySameProcess = (String)attributes.get(
			"substantiallySameProcess");

		if (substantiallySameProcess != null) {
			setSubstantiallySameProcess(substantiallySameProcess);
		}

		String siteSimilarMethod = (String)attributes.get("siteSimilarMethod");

		if (siteSimilarMethod != null) {
			setSiteSimilarMethod(siteSimilarMethod);
		}

		String siteUnderAudit = (String)attributes.get("siteUnderAudit");

		if (siteUnderAudit != null) {
			setSiteUnderAudit(siteUnderAudit);
		}

		String siteCorrectiveRight = (String)attributes.get(
			"siteCorrectiveRight");

		if (siteCorrectiveRight != null) {
			setSiteCorrectiveRight(siteCorrectiveRight);
		}

		String changesAuthority = (String)attributes.get("changesAuthority");

		if (changesAuthority != null) {
			setChangesAuthority(changesAuthority);
		}

		String position = (String)attributes.get("position");

		if (position != null) {
			setPosition(position);
		}

		Date date = (Date)attributes.get("date");

		if (date != null) {
			setDate(date);
		}

		Long ncbjApplicationId = (Long)attributes.get("ncbjApplicationId");

		if (ncbjApplicationId != null) {
			setNcbjApplicationId(ncbjApplicationId);
		}
	}

	@Override
	public NcbjAddLocMultiSite cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the central office link of this ncbj add loc multi site.
	 *
	 * @return the central office link of this ncbj add loc multi site
	 */
	@Override
	public String getCentralOfficeLink() {
		return model.getCentralOfficeLink();
	}

	/**
	 * Returns the changes authority of this ncbj add loc multi site.
	 *
	 * @return the changes authority of this ncbj add loc multi site
	 */
	@Override
	public String getChangesAuthority() {
		return model.getChangesAuthority();
	}

	/**
	 * Returns the common management system of this ncbj add loc multi site.
	 *
	 * @return the common management system of this ncbj add loc multi site
	 */
	@Override
	public String getCommonManagementSystem() {
		return model.getCommonManagementSystem();
	}

	/**
	 * Returns the company ID of this ncbj add loc multi site.
	 *
	 * @return the company ID of this ncbj add loc multi site
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this ncbj add loc multi site.
	 *
	 * @return the create date of this ncbj add loc multi site
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date of this ncbj add loc multi site.
	 *
	 * @return the date of this ncbj add loc multi site
	 */
	@Override
	public Date getDate() {
		return model.getDate();
	}

	/**
	 * Returns the group ID of this ncbj add loc multi site.
	 *
	 * @return the group ID of this ncbj add loc multi site
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this ncbj add loc multi site.
	 *
	 * @return the modified date of this ncbj add loc multi site
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the ncbj add loc multi site ID of this ncbj add loc multi site.
	 *
	 * @return the ncbj add loc multi site ID of this ncbj add loc multi site
	 */
	@Override
	public long getNcbjAddLocMultiSiteId() {
		return model.getNcbjAddLocMultiSiteId();
	}

	/**
	 * Returns the ncbj application ID of this ncbj add loc multi site.
	 *
	 * @return the ncbj application ID of this ncbj add loc multi site
	 */
	@Override
	public long getNcbjApplicationId() {
		return model.getNcbjApplicationId();
	}

	/**
	 * Returns the position of this ncbj add loc multi site.
	 *
	 * @return the position of this ncbj add loc multi site
	 */
	@Override
	public String getPosition() {
		return model.getPosition();
	}

	/**
	 * Returns the primary key of this ncbj add loc multi site.
	 *
	 * @return the primary key of this ncbj add loc multi site
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the signature name of this ncbj add loc multi site.
	 *
	 * @return the signature name of this ncbj add loc multi site
	 */
	@Override
	public String getSignatureName() {
		return model.getSignatureName();
	}

	/**
	 * Returns the site corrective right of this ncbj add loc multi site.
	 *
	 * @return the site corrective right of this ncbj add loc multi site
	 */
	@Override
	public String getSiteCorrectiveRight() {
		return model.getSiteCorrectiveRight();
	}

	/**
	 * Returns the site similar method of this ncbj add loc multi site.
	 *
	 * @return the site similar method of this ncbj add loc multi site
	 */
	@Override
	public String getSiteSimilarMethod() {
		return model.getSiteSimilarMethod();
	}

	/**
	 * Returns the site under audit of this ncbj add loc multi site.
	 *
	 * @return the site under audit of this ncbj add loc multi site
	 */
	@Override
	public String getSiteUnderAudit() {
		return model.getSiteUnderAudit();
	}

	/**
	 * Returns the substantially same process of this ncbj add loc multi site.
	 *
	 * @return the substantially same process of this ncbj add loc multi site
	 */
	@Override
	public String getSubstantiallySameProcess() {
		return model.getSubstantiallySameProcess();
	}

	/**
	 * Returns the user ID of this ncbj add loc multi site.
	 *
	 * @return the user ID of this ncbj add loc multi site
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this ncbj add loc multi site.
	 *
	 * @return the user name of this ncbj add loc multi site
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this ncbj add loc multi site.
	 *
	 * @return the user uuid of this ncbj add loc multi site
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
	 * Sets the central office link of this ncbj add loc multi site.
	 *
	 * @param centralOfficeLink the central office link of this ncbj add loc multi site
	 */
	@Override
	public void setCentralOfficeLink(String centralOfficeLink) {
		model.setCentralOfficeLink(centralOfficeLink);
	}

	/**
	 * Sets the changes authority of this ncbj add loc multi site.
	 *
	 * @param changesAuthority the changes authority of this ncbj add loc multi site
	 */
	@Override
	public void setChangesAuthority(String changesAuthority) {
		model.setChangesAuthority(changesAuthority);
	}

	/**
	 * Sets the common management system of this ncbj add loc multi site.
	 *
	 * @param commonManagementSystem the common management system of this ncbj add loc multi site
	 */
	@Override
	public void setCommonManagementSystem(String commonManagementSystem) {
		model.setCommonManagementSystem(commonManagementSystem);
	}

	/**
	 * Sets the company ID of this ncbj add loc multi site.
	 *
	 * @param companyId the company ID of this ncbj add loc multi site
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this ncbj add loc multi site.
	 *
	 * @param createDate the create date of this ncbj add loc multi site
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date of this ncbj add loc multi site.
	 *
	 * @param date the date of this ncbj add loc multi site
	 */
	@Override
	public void setDate(Date date) {
		model.setDate(date);
	}

	/**
	 * Sets the group ID of this ncbj add loc multi site.
	 *
	 * @param groupId the group ID of this ncbj add loc multi site
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this ncbj add loc multi site.
	 *
	 * @param modifiedDate the modified date of this ncbj add loc multi site
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the ncbj add loc multi site ID of this ncbj add loc multi site.
	 *
	 * @param ncbjAddLocMultiSiteId the ncbj add loc multi site ID of this ncbj add loc multi site
	 */
	@Override
	public void setNcbjAddLocMultiSiteId(long ncbjAddLocMultiSiteId) {
		model.setNcbjAddLocMultiSiteId(ncbjAddLocMultiSiteId);
	}

	/**
	 * Sets the ncbj application ID of this ncbj add loc multi site.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj add loc multi site
	 */
	@Override
	public void setNcbjApplicationId(long ncbjApplicationId) {
		model.setNcbjApplicationId(ncbjApplicationId);
	}

	/**
	 * Sets the position of this ncbj add loc multi site.
	 *
	 * @param position the position of this ncbj add loc multi site
	 */
	@Override
	public void setPosition(String position) {
		model.setPosition(position);
	}

	/**
	 * Sets the primary key of this ncbj add loc multi site.
	 *
	 * @param primaryKey the primary key of this ncbj add loc multi site
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the signature name of this ncbj add loc multi site.
	 *
	 * @param signatureName the signature name of this ncbj add loc multi site
	 */
	@Override
	public void setSignatureName(String signatureName) {
		model.setSignatureName(signatureName);
	}

	/**
	 * Sets the site corrective right of this ncbj add loc multi site.
	 *
	 * @param siteCorrectiveRight the site corrective right of this ncbj add loc multi site
	 */
	@Override
	public void setSiteCorrectiveRight(String siteCorrectiveRight) {
		model.setSiteCorrectiveRight(siteCorrectiveRight);
	}

	/**
	 * Sets the site similar method of this ncbj add loc multi site.
	 *
	 * @param siteSimilarMethod the site similar method of this ncbj add loc multi site
	 */
	@Override
	public void setSiteSimilarMethod(String siteSimilarMethod) {
		model.setSiteSimilarMethod(siteSimilarMethod);
	}

	/**
	 * Sets the site under audit of this ncbj add loc multi site.
	 *
	 * @param siteUnderAudit the site under audit of this ncbj add loc multi site
	 */
	@Override
	public void setSiteUnderAudit(String siteUnderAudit) {
		model.setSiteUnderAudit(siteUnderAudit);
	}

	/**
	 * Sets the substantially same process of this ncbj add loc multi site.
	 *
	 * @param substantiallySameProcess the substantially same process of this ncbj add loc multi site
	 */
	@Override
	public void setSubstantiallySameProcess(String substantiallySameProcess) {
		model.setSubstantiallySameProcess(substantiallySameProcess);
	}

	/**
	 * Sets the user ID of this ncbj add loc multi site.
	 *
	 * @param userId the user ID of this ncbj add loc multi site
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this ncbj add loc multi site.
	 *
	 * @param userName the user name of this ncbj add loc multi site
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this ncbj add loc multi site.
	 *
	 * @param userUuid the user uuid of this ncbj add loc multi site
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
	protected NcbjAddLocMultiSiteWrapper wrap(
		NcbjAddLocMultiSite ncbjAddLocMultiSite) {

		return new NcbjAddLocMultiSiteWrapper(ncbjAddLocMultiSite);
	}

}
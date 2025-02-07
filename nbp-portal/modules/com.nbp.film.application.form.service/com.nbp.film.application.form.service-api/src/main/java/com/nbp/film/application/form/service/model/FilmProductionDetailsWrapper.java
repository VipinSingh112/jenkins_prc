/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilmProductionDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmProductionDetails
 * @generated
 */
public class FilmProductionDetailsWrapper
	extends BaseModelWrapper<FilmProductionDetails>
	implements FilmProductionDetails, ModelWrapper<FilmProductionDetails> {

	public FilmProductionDetailsWrapper(
		FilmProductionDetails filmProductionDetails) {

		super(filmProductionDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("filmProductionDetailsId", getFilmProductionDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("productionTitle", getProductionTitle());
		attributes.put("totalProductionBudget", getTotalProductionBudget());
		attributes.put("expenditureInJamaica", getExpenditureInJamaica());
		attributes.put("foreignPersonnel", getForeignPersonnel());
		attributes.put("jamaicanPersonnel", getJamaicanPersonnel());
		attributes.put("productionType", getProductionType());
		attributes.put("companyName", getCompanyName());
		attributes.put("fixerName", getFixerName());
		attributes.put("fixerMobile", getFixerMobile());
		attributes.put("fixerEmail", getFixerEmail());
		attributes.put("preProductionDates", getPreProductionDates());
		attributes.put("productionDates", getProductionDates());
		attributes.put("productionStartDate", getProductionStartDate());
		attributes.put("productionEndDate", getProductionEndDate());
		attributes.put(
			"proposedProductionLocations", getProposedProductionLocations());
		attributes.put(
			"productionInternationalCrew", getProductionInternationalCrew());
		attributes.put("productionjamaicanCrew", getProductionjamaicanCrew());
		attributes.put(
			"productionExternalPermit", getProductionExternalPermit());
		attributes.put("filmApplicationId", getFilmApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long filmProductionDetailsId = (Long)attributes.get(
			"filmProductionDetailsId");

		if (filmProductionDetailsId != null) {
			setFilmProductionDetailsId(filmProductionDetailsId);
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

		String productionTitle = (String)attributes.get("productionTitle");

		if (productionTitle != null) {
			setProductionTitle(productionTitle);
		}

		String totalProductionBudget = (String)attributes.get(
			"totalProductionBudget");

		if (totalProductionBudget != null) {
			setTotalProductionBudget(totalProductionBudget);
		}

		String expenditureInJamaica = (String)attributes.get(
			"expenditureInJamaica");

		if (expenditureInJamaica != null) {
			setExpenditureInJamaica(expenditureInJamaica);
		}

		String foreignPersonnel = (String)attributes.get("foreignPersonnel");

		if (foreignPersonnel != null) {
			setForeignPersonnel(foreignPersonnel);
		}

		String jamaicanPersonnel = (String)attributes.get("jamaicanPersonnel");

		if (jamaicanPersonnel != null) {
			setJamaicanPersonnel(jamaicanPersonnel);
		}

		String productionType = (String)attributes.get("productionType");

		if (productionType != null) {
			setProductionType(productionType);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String fixerName = (String)attributes.get("fixerName");

		if (fixerName != null) {
			setFixerName(fixerName);
		}

		String fixerMobile = (String)attributes.get("fixerMobile");

		if (fixerMobile != null) {
			setFixerMobile(fixerMobile);
		}

		String fixerEmail = (String)attributes.get("fixerEmail");

		if (fixerEmail != null) {
			setFixerEmail(fixerEmail);
		}

		Date preProductionDates = (Date)attributes.get("preProductionDates");

		if (preProductionDates != null) {
			setPreProductionDates(preProductionDates);
		}

		Date productionDates = (Date)attributes.get("productionDates");

		if (productionDates != null) {
			setProductionDates(productionDates);
		}

		Date productionStartDate = (Date)attributes.get("productionStartDate");

		if (productionStartDate != null) {
			setProductionStartDate(productionStartDate);
		}

		Date productionEndDate = (Date)attributes.get("productionEndDate");

		if (productionEndDate != null) {
			setProductionEndDate(productionEndDate);
		}

		String proposedProductionLocations = (String)attributes.get(
			"proposedProductionLocations");

		if (proposedProductionLocations != null) {
			setProposedProductionLocations(proposedProductionLocations);
		}

		String productionInternationalCrew = (String)attributes.get(
			"productionInternationalCrew");

		if (productionInternationalCrew != null) {
			setProductionInternationalCrew(productionInternationalCrew);
		}

		String productionjamaicanCrew = (String)attributes.get(
			"productionjamaicanCrew");

		if (productionjamaicanCrew != null) {
			setProductionjamaicanCrew(productionjamaicanCrew);
		}

		String productionExternalPermit = (String)attributes.get(
			"productionExternalPermit");

		if (productionExternalPermit != null) {
			setProductionExternalPermit(productionExternalPermit);
		}

		Long filmApplicationId = (Long)attributes.get("filmApplicationId");

		if (filmApplicationId != null) {
			setFilmApplicationId(filmApplicationId);
		}
	}

	@Override
	public FilmProductionDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this film production details.
	 *
	 * @return the company ID of this film production details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company name of this film production details.
	 *
	 * @return the company name of this film production details
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the create date of this film production details.
	 *
	 * @return the create date of this film production details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the expenditure in jamaica of this film production details.
	 *
	 * @return the expenditure in jamaica of this film production details
	 */
	@Override
	public String getExpenditureInJamaica() {
		return model.getExpenditureInJamaica();
	}

	/**
	 * Returns the film application ID of this film production details.
	 *
	 * @return the film application ID of this film production details
	 */
	@Override
	public long getFilmApplicationId() {
		return model.getFilmApplicationId();
	}

	/**
	 * Returns the film production details ID of this film production details.
	 *
	 * @return the film production details ID of this film production details
	 */
	@Override
	public long getFilmProductionDetailsId() {
		return model.getFilmProductionDetailsId();
	}

	/**
	 * Returns the fixer email of this film production details.
	 *
	 * @return the fixer email of this film production details
	 */
	@Override
	public String getFixerEmail() {
		return model.getFixerEmail();
	}

	/**
	 * Returns the fixer mobile of this film production details.
	 *
	 * @return the fixer mobile of this film production details
	 */
	@Override
	public String getFixerMobile() {
		return model.getFixerMobile();
	}

	/**
	 * Returns the fixer name of this film production details.
	 *
	 * @return the fixer name of this film production details
	 */
	@Override
	public String getFixerName() {
		return model.getFixerName();
	}

	/**
	 * Returns the foreign personnel of this film production details.
	 *
	 * @return the foreign personnel of this film production details
	 */
	@Override
	public String getForeignPersonnel() {
		return model.getForeignPersonnel();
	}

	/**
	 * Returns the group ID of this film production details.
	 *
	 * @return the group ID of this film production details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jamaican personnel of this film production details.
	 *
	 * @return the jamaican personnel of this film production details
	 */
	@Override
	public String getJamaicanPersonnel() {
		return model.getJamaicanPersonnel();
	}

	/**
	 * Returns the modified date of this film production details.
	 *
	 * @return the modified date of this film production details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the pre production dates of this film production details.
	 *
	 * @return the pre production dates of this film production details
	 */
	@Override
	public Date getPreProductionDates() {
		return model.getPreProductionDates();
	}

	/**
	 * Returns the primary key of this film production details.
	 *
	 * @return the primary key of this film production details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the production dates of this film production details.
	 *
	 * @return the production dates of this film production details
	 */
	@Override
	public Date getProductionDates() {
		return model.getProductionDates();
	}

	/**
	 * Returns the production end date of this film production details.
	 *
	 * @return the production end date of this film production details
	 */
	@Override
	public Date getProductionEndDate() {
		return model.getProductionEndDate();
	}

	/**
	 * Returns the production external permit of this film production details.
	 *
	 * @return the production external permit of this film production details
	 */
	@Override
	public String getProductionExternalPermit() {
		return model.getProductionExternalPermit();
	}

	/**
	 * Returns the production international crew of this film production details.
	 *
	 * @return the production international crew of this film production details
	 */
	@Override
	public String getProductionInternationalCrew() {
		return model.getProductionInternationalCrew();
	}

	/**
	 * Returns the productionjamaican crew of this film production details.
	 *
	 * @return the productionjamaican crew of this film production details
	 */
	@Override
	public String getProductionjamaicanCrew() {
		return model.getProductionjamaicanCrew();
	}

	/**
	 * Returns the production start date of this film production details.
	 *
	 * @return the production start date of this film production details
	 */
	@Override
	public Date getProductionStartDate() {
		return model.getProductionStartDate();
	}

	/**
	 * Returns the production title of this film production details.
	 *
	 * @return the production title of this film production details
	 */
	@Override
	public String getProductionTitle() {
		return model.getProductionTitle();
	}

	/**
	 * Returns the production type of this film production details.
	 *
	 * @return the production type of this film production details
	 */
	@Override
	public String getProductionType() {
		return model.getProductionType();
	}

	/**
	 * Returns the proposed production locations of this film production details.
	 *
	 * @return the proposed production locations of this film production details
	 */
	@Override
	public String getProposedProductionLocations() {
		return model.getProposedProductionLocations();
	}

	/**
	 * Returns the total production budget of this film production details.
	 *
	 * @return the total production budget of this film production details
	 */
	@Override
	public String getTotalProductionBudget() {
		return model.getTotalProductionBudget();
	}

	/**
	 * Returns the user ID of this film production details.
	 *
	 * @return the user ID of this film production details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film production details.
	 *
	 * @return the user name of this film production details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film production details.
	 *
	 * @return the user uuid of this film production details
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
	 * Sets the company ID of this film production details.
	 *
	 * @param companyId the company ID of this film production details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company name of this film production details.
	 *
	 * @param companyName the company name of this film production details
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the create date of this film production details.
	 *
	 * @param createDate the create date of this film production details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the expenditure in jamaica of this film production details.
	 *
	 * @param expenditureInJamaica the expenditure in jamaica of this film production details
	 */
	@Override
	public void setExpenditureInJamaica(String expenditureInJamaica) {
		model.setExpenditureInJamaica(expenditureInJamaica);
	}

	/**
	 * Sets the film application ID of this film production details.
	 *
	 * @param filmApplicationId the film application ID of this film production details
	 */
	@Override
	public void setFilmApplicationId(long filmApplicationId) {
		model.setFilmApplicationId(filmApplicationId);
	}

	/**
	 * Sets the film production details ID of this film production details.
	 *
	 * @param filmProductionDetailsId the film production details ID of this film production details
	 */
	@Override
	public void setFilmProductionDetailsId(long filmProductionDetailsId) {
		model.setFilmProductionDetailsId(filmProductionDetailsId);
	}

	/**
	 * Sets the fixer email of this film production details.
	 *
	 * @param fixerEmail the fixer email of this film production details
	 */
	@Override
	public void setFixerEmail(String fixerEmail) {
		model.setFixerEmail(fixerEmail);
	}

	/**
	 * Sets the fixer mobile of this film production details.
	 *
	 * @param fixerMobile the fixer mobile of this film production details
	 */
	@Override
	public void setFixerMobile(String fixerMobile) {
		model.setFixerMobile(fixerMobile);
	}

	/**
	 * Sets the fixer name of this film production details.
	 *
	 * @param fixerName the fixer name of this film production details
	 */
	@Override
	public void setFixerName(String fixerName) {
		model.setFixerName(fixerName);
	}

	/**
	 * Sets the foreign personnel of this film production details.
	 *
	 * @param foreignPersonnel the foreign personnel of this film production details
	 */
	@Override
	public void setForeignPersonnel(String foreignPersonnel) {
		model.setForeignPersonnel(foreignPersonnel);
	}

	/**
	 * Sets the group ID of this film production details.
	 *
	 * @param groupId the group ID of this film production details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jamaican personnel of this film production details.
	 *
	 * @param jamaicanPersonnel the jamaican personnel of this film production details
	 */
	@Override
	public void setJamaicanPersonnel(String jamaicanPersonnel) {
		model.setJamaicanPersonnel(jamaicanPersonnel);
	}

	/**
	 * Sets the modified date of this film production details.
	 *
	 * @param modifiedDate the modified date of this film production details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the pre production dates of this film production details.
	 *
	 * @param preProductionDates the pre production dates of this film production details
	 */
	@Override
	public void setPreProductionDates(Date preProductionDates) {
		model.setPreProductionDates(preProductionDates);
	}

	/**
	 * Sets the primary key of this film production details.
	 *
	 * @param primaryKey the primary key of this film production details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the production dates of this film production details.
	 *
	 * @param productionDates the production dates of this film production details
	 */
	@Override
	public void setProductionDates(Date productionDates) {
		model.setProductionDates(productionDates);
	}

	/**
	 * Sets the production end date of this film production details.
	 *
	 * @param productionEndDate the production end date of this film production details
	 */
	@Override
	public void setProductionEndDate(Date productionEndDate) {
		model.setProductionEndDate(productionEndDate);
	}

	/**
	 * Sets the production external permit of this film production details.
	 *
	 * @param productionExternalPermit the production external permit of this film production details
	 */
	@Override
	public void setProductionExternalPermit(String productionExternalPermit) {
		model.setProductionExternalPermit(productionExternalPermit);
	}

	/**
	 * Sets the production international crew of this film production details.
	 *
	 * @param productionInternationalCrew the production international crew of this film production details
	 */
	@Override
	public void setProductionInternationalCrew(
		String productionInternationalCrew) {

		model.setProductionInternationalCrew(productionInternationalCrew);
	}

	/**
	 * Sets the productionjamaican crew of this film production details.
	 *
	 * @param productionjamaicanCrew the productionjamaican crew of this film production details
	 */
	@Override
	public void setProductionjamaicanCrew(String productionjamaicanCrew) {
		model.setProductionjamaicanCrew(productionjamaicanCrew);
	}

	/**
	 * Sets the production start date of this film production details.
	 *
	 * @param productionStartDate the production start date of this film production details
	 */
	@Override
	public void setProductionStartDate(Date productionStartDate) {
		model.setProductionStartDate(productionStartDate);
	}

	/**
	 * Sets the production title of this film production details.
	 *
	 * @param productionTitle the production title of this film production details
	 */
	@Override
	public void setProductionTitle(String productionTitle) {
		model.setProductionTitle(productionTitle);
	}

	/**
	 * Sets the production type of this film production details.
	 *
	 * @param productionType the production type of this film production details
	 */
	@Override
	public void setProductionType(String productionType) {
		model.setProductionType(productionType);
	}

	/**
	 * Sets the proposed production locations of this film production details.
	 *
	 * @param proposedProductionLocations the proposed production locations of this film production details
	 */
	@Override
	public void setProposedProductionLocations(
		String proposedProductionLocations) {

		model.setProposedProductionLocations(proposedProductionLocations);
	}

	/**
	 * Sets the total production budget of this film production details.
	 *
	 * @param totalProductionBudget the total production budget of this film production details
	 */
	@Override
	public void setTotalProductionBudget(String totalProductionBudget) {
		model.setTotalProductionBudget(totalProductionBudget);
	}

	/**
	 * Sets the user ID of this film production details.
	 *
	 * @param userId the user ID of this film production details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film production details.
	 *
	 * @param userName the user name of this film production details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film production details.
	 *
	 * @param userUuid the user uuid of this film production details
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
	protected FilmProductionDetailsWrapper wrap(
		FilmProductionDetails filmProductionDetails) {

		return new FilmProductionDetailsWrapper(filmProductionDetails);
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FilmProductionDetails service. Represents a row in the &quot;nbp_film_production_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.film.application.form.service.model.impl.FilmProductionDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.film.application.form.service.model.impl.FilmProductionDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmProductionDetails
 * @generated
 */
@ProviderType
public interface FilmProductionDetailsModel
	extends BaseModel<FilmProductionDetails>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a film production details model instance should use the {@link FilmProductionDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this film production details.
	 *
	 * @return the primary key of this film production details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this film production details.
	 *
	 * @param primaryKey the primary key of this film production details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the film production details ID of this film production details.
	 *
	 * @return the film production details ID of this film production details
	 */
	public long getFilmProductionDetailsId();

	/**
	 * Sets the film production details ID of this film production details.
	 *
	 * @param filmProductionDetailsId the film production details ID of this film production details
	 */
	public void setFilmProductionDetailsId(long filmProductionDetailsId);

	/**
	 * Returns the group ID of this film production details.
	 *
	 * @return the group ID of this film production details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this film production details.
	 *
	 * @param groupId the group ID of this film production details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this film production details.
	 *
	 * @return the company ID of this film production details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this film production details.
	 *
	 * @param companyId the company ID of this film production details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this film production details.
	 *
	 * @return the user ID of this film production details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this film production details.
	 *
	 * @param userId the user ID of this film production details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this film production details.
	 *
	 * @return the user uuid of this film production details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this film production details.
	 *
	 * @param userUuid the user uuid of this film production details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this film production details.
	 *
	 * @return the user name of this film production details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this film production details.
	 *
	 * @param userName the user name of this film production details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this film production details.
	 *
	 * @return the create date of this film production details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this film production details.
	 *
	 * @param createDate the create date of this film production details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this film production details.
	 *
	 * @return the modified date of this film production details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this film production details.
	 *
	 * @param modifiedDate the modified date of this film production details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the production title of this film production details.
	 *
	 * @return the production title of this film production details
	 */
	@AutoEscape
	public String getProductionTitle();

	/**
	 * Sets the production title of this film production details.
	 *
	 * @param productionTitle the production title of this film production details
	 */
	public void setProductionTitle(String productionTitle);

	/**
	 * Returns the total production budget of this film production details.
	 *
	 * @return the total production budget of this film production details
	 */
	@AutoEscape
	public String getTotalProductionBudget();

	/**
	 * Sets the total production budget of this film production details.
	 *
	 * @param totalProductionBudget the total production budget of this film production details
	 */
	public void setTotalProductionBudget(String totalProductionBudget);

	/**
	 * Returns the expenditure in jamaica of this film production details.
	 *
	 * @return the expenditure in jamaica of this film production details
	 */
	@AutoEscape
	public String getExpenditureInJamaica();

	/**
	 * Sets the expenditure in jamaica of this film production details.
	 *
	 * @param expenditureInJamaica the expenditure in jamaica of this film production details
	 */
	public void setExpenditureInJamaica(String expenditureInJamaica);

	/**
	 * Returns the foreign personnel of this film production details.
	 *
	 * @return the foreign personnel of this film production details
	 */
	@AutoEscape
	public String getForeignPersonnel();

	/**
	 * Sets the foreign personnel of this film production details.
	 *
	 * @param foreignPersonnel the foreign personnel of this film production details
	 */
	public void setForeignPersonnel(String foreignPersonnel);

	/**
	 * Returns the jamaican personnel of this film production details.
	 *
	 * @return the jamaican personnel of this film production details
	 */
	@AutoEscape
	public String getJamaicanPersonnel();

	/**
	 * Sets the jamaican personnel of this film production details.
	 *
	 * @param jamaicanPersonnel the jamaican personnel of this film production details
	 */
	public void setJamaicanPersonnel(String jamaicanPersonnel);

	/**
	 * Returns the production type of this film production details.
	 *
	 * @return the production type of this film production details
	 */
	@AutoEscape
	public String getProductionType();

	/**
	 * Sets the production type of this film production details.
	 *
	 * @param productionType the production type of this film production details
	 */
	public void setProductionType(String productionType);

	/**
	 * Returns the company name of this film production details.
	 *
	 * @return the company name of this film production details
	 */
	@AutoEscape
	public String getCompanyName();

	/**
	 * Sets the company name of this film production details.
	 *
	 * @param companyName the company name of this film production details
	 */
	public void setCompanyName(String companyName);

	/**
	 * Returns the fixer name of this film production details.
	 *
	 * @return the fixer name of this film production details
	 */
	@AutoEscape
	public String getFixerName();

	/**
	 * Sets the fixer name of this film production details.
	 *
	 * @param fixerName the fixer name of this film production details
	 */
	public void setFixerName(String fixerName);

	/**
	 * Returns the fixer mobile of this film production details.
	 *
	 * @return the fixer mobile of this film production details
	 */
	@AutoEscape
	public String getFixerMobile();

	/**
	 * Sets the fixer mobile of this film production details.
	 *
	 * @param fixerMobile the fixer mobile of this film production details
	 */
	public void setFixerMobile(String fixerMobile);

	/**
	 * Returns the fixer email of this film production details.
	 *
	 * @return the fixer email of this film production details
	 */
	@AutoEscape
	public String getFixerEmail();

	/**
	 * Sets the fixer email of this film production details.
	 *
	 * @param fixerEmail the fixer email of this film production details
	 */
	public void setFixerEmail(String fixerEmail);

	/**
	 * Returns the pre production dates of this film production details.
	 *
	 * @return the pre production dates of this film production details
	 */
	public Date getPreProductionDates();

	/**
	 * Sets the pre production dates of this film production details.
	 *
	 * @param preProductionDates the pre production dates of this film production details
	 */
	public void setPreProductionDates(Date preProductionDates);

	/**
	 * Returns the production dates of this film production details.
	 *
	 * @return the production dates of this film production details
	 */
	public Date getProductionDates();

	/**
	 * Sets the production dates of this film production details.
	 *
	 * @param productionDates the production dates of this film production details
	 */
	public void setProductionDates(Date productionDates);

	/**
	 * Returns the production start date of this film production details.
	 *
	 * @return the production start date of this film production details
	 */
	public Date getProductionStartDate();

	/**
	 * Sets the production start date of this film production details.
	 *
	 * @param productionStartDate the production start date of this film production details
	 */
	public void setProductionStartDate(Date productionStartDate);

	/**
	 * Returns the production end date of this film production details.
	 *
	 * @return the production end date of this film production details
	 */
	public Date getProductionEndDate();

	/**
	 * Sets the production end date of this film production details.
	 *
	 * @param productionEndDate the production end date of this film production details
	 */
	public void setProductionEndDate(Date productionEndDate);

	/**
	 * Returns the proposed production locations of this film production details.
	 *
	 * @return the proposed production locations of this film production details
	 */
	@AutoEscape
	public String getProposedProductionLocations();

	/**
	 * Sets the proposed production locations of this film production details.
	 *
	 * @param proposedProductionLocations the proposed production locations of this film production details
	 */
	public void setProposedProductionLocations(
		String proposedProductionLocations);

	/**
	 * Returns the production international crew of this film production details.
	 *
	 * @return the production international crew of this film production details
	 */
	@AutoEscape
	public String getProductionInternationalCrew();

	/**
	 * Sets the production international crew of this film production details.
	 *
	 * @param productionInternationalCrew the production international crew of this film production details
	 */
	public void setProductionInternationalCrew(
		String productionInternationalCrew);

	/**
	 * Returns the productionjamaican crew of this film production details.
	 *
	 * @return the productionjamaican crew of this film production details
	 */
	@AutoEscape
	public String getProductionjamaicanCrew();

	/**
	 * Sets the productionjamaican crew of this film production details.
	 *
	 * @param productionjamaicanCrew the productionjamaican crew of this film production details
	 */
	public void setProductionjamaicanCrew(String productionjamaicanCrew);

	/**
	 * Returns the production external permit of this film production details.
	 *
	 * @return the production external permit of this film production details
	 */
	@AutoEscape
	public String getProductionExternalPermit();

	/**
	 * Sets the production external permit of this film production details.
	 *
	 * @param productionExternalPermit the production external permit of this film production details
	 */
	public void setProductionExternalPermit(String productionExternalPermit);

	/**
	 * Returns the film application ID of this film production details.
	 *
	 * @return the film application ID of this film production details
	 */
	public long getFilmApplicationId();

	/**
	 * Sets the film application ID of this film production details.
	 *
	 * @param filmApplicationId the film application ID of this film production details
	 */
	public void setFilmApplicationId(long filmApplicationId);

	@Override
	public FilmProductionDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
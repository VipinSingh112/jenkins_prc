/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FilmApplicationRegister service. Represents a row in the &quot;nbp_film_register&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.film.stages.services.model.impl.FilmApplicationRegisterModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.film.stages.services.model.impl.FilmApplicationRegisterImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegister
 * @generated
 */
@ProviderType
public interface FilmApplicationRegisterModel
	extends BaseModel<FilmApplicationRegister>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a film application register model instance should use the {@link FilmApplicationRegister} interface instead.
	 */

	/**
	 * Returns the primary key of this film application register.
	 *
	 * @return the primary key of this film application register
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this film application register.
	 *
	 * @param primaryKey the primary key of this film application register
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the film application register ID of this film application register.
	 *
	 * @return the film application register ID of this film application register
	 */
	public long getFilmApplicationRegisterId();

	/**
	 * Sets the film application register ID of this film application register.
	 *
	 * @param filmApplicationRegisterId the film application register ID of this film application register
	 */
	public void setFilmApplicationRegisterId(long filmApplicationRegisterId);

	/**
	 * Returns the group ID of this film application register.
	 *
	 * @return the group ID of this film application register
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this film application register.
	 *
	 * @param groupId the group ID of this film application register
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this film application register.
	 *
	 * @return the company ID of this film application register
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this film application register.
	 *
	 * @param companyId the company ID of this film application register
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this film application register.
	 *
	 * @return the user ID of this film application register
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this film application register.
	 *
	 * @param userId the user ID of this film application register
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this film application register.
	 *
	 * @return the user uuid of this film application register
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this film application register.
	 *
	 * @param userUuid the user uuid of this film application register
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this film application register.
	 *
	 * @return the user name of this film application register
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this film application register.
	 *
	 * @param userName the user name of this film application register
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this film application register.
	 *
	 * @return the create date of this film application register
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this film application register.
	 *
	 * @param createDate the create date of this film application register
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this film application register.
	 *
	 * @return the modified date of this film application register
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this film application register.
	 *
	 * @param modifiedDate the modified date of this film application register
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this film application register.
	 *
	 * @return the case ID of this film application register
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this film application register.
	 *
	 * @param caseId the case ID of this film application register
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the name of applicant of this film application register.
	 *
	 * @return the name of applicant of this film application register
	 */
	@AutoEscape
	public String getNameOfApplicant();

	/**
	 * Sets the name of applicant of this film application register.
	 *
	 * @param nameOfApplicant the name of applicant of this film application register
	 */
	public void setNameOfApplicant(String nameOfApplicant);

	/**
	 * Returns the registration date of this film application register.
	 *
	 * @return the registration date of this film application register
	 */
	public Date getRegistrationDate();

	/**
	 * Sets the registration date of this film application register.
	 *
	 * @param registrationDate the registration date of this film application register
	 */
	public void setRegistrationDate(Date registrationDate);

	/**
	 * Returns the film registration num of this film application register.
	 *
	 * @return the film registration num of this film application register
	 */
	@AutoEscape
	public String getFilmRegistrationNum();

	/**
	 * Sets the film registration num of this film application register.
	 *
	 * @param filmRegistrationNum the film registration num of this film application register
	 */
	public void setFilmRegistrationNum(String filmRegistrationNum);

	/**
	 * Returns the title of production of this film application register.
	 *
	 * @return the title of production of this film application register
	 */
	@AutoEscape
	public String getTitleOfProduction();

	/**
	 * Sets the title of production of this film application register.
	 *
	 * @param titleOfProduction the title of production of this film application register
	 */
	public void setTitleOfProduction(String titleOfProduction);

	/**
	 * Returns the date of issued of this film application register.
	 *
	 * @return the date of issued of this film application register
	 */
	public Date getDateOfIssued();

	/**
	 * Sets the date of issued of this film application register.
	 *
	 * @param dateOfIssued the date of issued of this film application register
	 */
	public void setDateOfIssued(Date dateOfIssued);

	/**
	 * Returns the production company of this film application register.
	 *
	 * @return the production company of this film application register
	 */
	@AutoEscape
	public String getProductionCompany();

	/**
	 * Sets the production company of this film application register.
	 *
	 * @param productionCompany the production company of this film application register
	 */
	public void setProductionCompany(String productionCompany);

	/**
	 * Returns the technical form of prod of this film application register.
	 *
	 * @return the technical form of prod of this film application register
	 */
	@AutoEscape
	public String getTechnicalFormOfProd();

	/**
	 * Sets the technical form of prod of this film application register.
	 *
	 * @param technicalFormOfProd the technical form of prod of this film application register
	 */
	public void setTechnicalFormOfProd(String technicalFormOfProd);

	/**
	 * Returns the origin of prod com of this film application register.
	 *
	 * @return the origin of prod com of this film application register
	 */
	@AutoEscape
	public String getOriginOfProdCom();

	/**
	 * Sets the origin of prod com of this film application register.
	 *
	 * @param OriginOfProdCom the origin of prod com of this film application register
	 */
	public void setOriginOfProdCom(String OriginOfProdCom);

	/**
	 * Returns the permits required of this film application register.
	 *
	 * @return the permits required of this film application register
	 */
	@AutoEscape
	public String getPermitsRequired();

	/**
	 * Sets the permits required of this film application register.
	 *
	 * @param permitsRequired the permits required of this film application register
	 */
	public void setPermitsRequired(String permitsRequired);

	/**
	 * Returns the shoot location in jamaica of this film application register.
	 *
	 * @return the shoot location in jamaica of this film application register
	 */
	@AutoEscape
	public String getShootLocationInJamaica();

	/**
	 * Sets the shoot location in jamaica of this film application register.
	 *
	 * @param shootLocationInJamaica the shoot location in jamaica of this film application register
	 */
	public void setShootLocationInJamaica(String shootLocationInJamaica);

	/**
	 * Returns the pre production date of this film application register.
	 *
	 * @return the pre production date of this film application register
	 */
	public Date getPreProductionDate();

	/**
	 * Sets the pre production date of this film application register.
	 *
	 * @param preProductionDate the pre production date of this film application register
	 */
	public void setPreProductionDate(Date preProductionDate);

	/**
	 * Returns the production start date of this film application register.
	 *
	 * @return the production start date of this film application register
	 */
	public Date getProductionStartDate();

	/**
	 * Sets the production start date of this film application register.
	 *
	 * @param productionStartDate the production start date of this film application register
	 */
	public void setProductionStartDate(Date productionStartDate);

	/**
	 * Returns the proposed date of arrival of this film application register.
	 *
	 * @return the proposed date of arrival of this film application register
	 */
	@AutoEscape
	public String getProposedDateOfArrival();

	/**
	 * Sets the proposed date of arrival of this film application register.
	 *
	 * @param proposedDateOfArrival the proposed date of arrival of this film application register
	 */
	public void setProposedDateOfArrival(String proposedDateOfArrival);

	/**
	 * Returns the port of entry of this film application register.
	 *
	 * @return the port of entry of this film application register
	 */
	@AutoEscape
	public String getPortOfEntry();

	/**
	 * Sets the port of entry of this film application register.
	 *
	 * @param portOfEntry the port of entry of this film application register
	 */
	public void setPortOfEntry(String portOfEntry);

	/**
	 * Returns the proposed date of departure of this film application register.
	 *
	 * @return the proposed date of departure of this film application register
	 */
	public Date getProposedDateOfDeparture();

	/**
	 * Sets the proposed date of departure of this film application register.
	 *
	 * @param proposedDateOfDeparture the proposed date of departure of this film application register
	 */
	public void setProposedDateOfDeparture(Date proposedDateOfDeparture);

	/**
	 * Returns the full production budget of this film application register.
	 *
	 * @return the full production budget of this film application register
	 */
	@AutoEscape
	public String getFullProductionBudget();

	/**
	 * Sets the full production budget of this film application register.
	 *
	 * @param fullProductionBudget the full production budget of this film application register
	 */
	public void setFullProductionBudget(String fullProductionBudget);

	/**
	 * Returns the expected budget spend in ja of this film application register.
	 *
	 * @return the expected budget spend in ja of this film application register
	 */
	@AutoEscape
	public String getExpectedBudgetSpendInJA();

	/**
	 * Sets the expected budget spend in ja of this film application register.
	 *
	 * @param expectedBudgetSpendInJA the expected budget spend in ja of this film application register
	 */
	public void setExpectedBudgetSpendInJA(String expectedBudgetSpendInJA);

	/**
	 * Returns the number of foreign crew hired of this film application register.
	 *
	 * @return the number of foreign crew hired of this film application register
	 */
	@AutoEscape
	public String getNumberOFForeignCrewHired();

	/**
	 * Sets the number of foreign crew hired of this film application register.
	 *
	 * @param numberOFForeignCrewHired the number of foreign crew hired of this film application register
	 */
	public void setNumberOFForeignCrewHired(String numberOFForeignCrewHired);

	/**
	 * Returns the number jamaica crew hired of this film application register.
	 *
	 * @return the number jamaica crew hired of this film application register
	 */
	@AutoEscape
	public String getNumberJamaicaCrewHired();

	/**
	 * Sets the number jamaica crew hired of this film application register.
	 *
	 * @param numberJamaicaCrewHired the number jamaica crew hired of this film application register
	 */
	public void setNumberJamaicaCrewHired(String numberJamaicaCrewHired);

	/**
	 * Returns the value of bond waiver of this film application register.
	 *
	 * @return the value of bond waiver of this film application register
	 */
	@AutoEscape
	public String getValueOfBondWaiver();

	/**
	 * Sets the value of bond waiver of this film application register.
	 *
	 * @param valueOfBondWaiver the value of bond waiver of this film application register
	 */
	public void setValueOfBondWaiver(String valueOfBondWaiver);

	/**
	 * Returns the customs broker of this film application register.
	 *
	 * @return the customs broker of this film application register
	 */
	@AutoEscape
	public String getCustomsBroker();

	/**
	 * Sets the customs broker of this film application register.
	 *
	 * @param customsBroker the customs broker of this film application register
	 */
	public void setCustomsBroker(String customsBroker);

	/**
	 * Returns the local production manager or fixer of this film application register.
	 *
	 * @return the local production manager or fixer of this film application register
	 */
	@AutoEscape
	public String getLocalProductionManagerOrFixer();

	/**
	 * Sets the local production manager or fixer of this film application register.
	 *
	 * @param localProductionManagerOrFixer the local production manager or fixer of this film application register
	 */
	public void setLocalProductionManagerOrFixer(
		String localProductionManagerOrFixer);

	@Override
	public FilmApplicationRegister cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
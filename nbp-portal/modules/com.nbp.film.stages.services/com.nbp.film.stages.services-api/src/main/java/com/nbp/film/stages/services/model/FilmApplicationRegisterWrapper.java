/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link FilmApplicationRegister}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FilmApplicationRegister
 * @generated
 */
public class FilmApplicationRegisterWrapper
	extends BaseModelWrapper<FilmApplicationRegister>
	implements FilmApplicationRegister, ModelWrapper<FilmApplicationRegister> {

	public FilmApplicationRegisterWrapper(
		FilmApplicationRegister filmApplicationRegister) {

		super(filmApplicationRegister);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"filmApplicationRegisterId", getFilmApplicationRegisterId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("caseId", getCaseId());
		attributes.put("nameOfApplicant", getNameOfApplicant());
		attributes.put("registrationDate", getRegistrationDate());
		attributes.put("filmRegistrationNum", getFilmRegistrationNum());
		attributes.put("titleOfProduction", getTitleOfProduction());
		attributes.put("dateOfIssued", getDateOfIssued());
		attributes.put("productionCompany", getProductionCompany());
		attributes.put("technicalFormOfProd", getTechnicalFormOfProd());
		attributes.put("OriginOfProdCom", getOriginOfProdCom());
		attributes.put("permitsRequired", getPermitsRequired());
		attributes.put("shootLocationInJamaica", getShootLocationInJamaica());
		attributes.put("preProductionDate", getPreProductionDate());
		attributes.put("productionStartDate", getProductionStartDate());
		attributes.put("proposedDateOfArrival", getProposedDateOfArrival());
		attributes.put("portOfEntry", getPortOfEntry());
		attributes.put("proposedDateOfDeparture", getProposedDateOfDeparture());
		attributes.put("fullProductionBudget", getFullProductionBudget());
		attributes.put("expectedBudgetSpendInJA", getExpectedBudgetSpendInJA());
		attributes.put(
			"numberOFForeignCrewHired", getNumberOFForeignCrewHired());
		attributes.put("numberJamaicaCrewHired", getNumberJamaicaCrewHired());
		attributes.put("valueOfBondWaiver", getValueOfBondWaiver());
		attributes.put("customsBroker", getCustomsBroker());
		attributes.put(
			"localProductionManagerOrFixer",
			getLocalProductionManagerOrFixer());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long filmApplicationRegisterId = (Long)attributes.get(
			"filmApplicationRegisterId");

		if (filmApplicationRegisterId != null) {
			setFilmApplicationRegisterId(filmApplicationRegisterId);
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

		String caseId = (String)attributes.get("caseId");

		if (caseId != null) {
			setCaseId(caseId);
		}

		String nameOfApplicant = (String)attributes.get("nameOfApplicant");

		if (nameOfApplicant != null) {
			setNameOfApplicant(nameOfApplicant);
		}

		Date registrationDate = (Date)attributes.get("registrationDate");

		if (registrationDate != null) {
			setRegistrationDate(registrationDate);
		}

		String filmRegistrationNum = (String)attributes.get(
			"filmRegistrationNum");

		if (filmRegistrationNum != null) {
			setFilmRegistrationNum(filmRegistrationNum);
		}

		String titleOfProduction = (String)attributes.get("titleOfProduction");

		if (titleOfProduction != null) {
			setTitleOfProduction(titleOfProduction);
		}

		Date dateOfIssued = (Date)attributes.get("dateOfIssued");

		if (dateOfIssued != null) {
			setDateOfIssued(dateOfIssued);
		}

		String productionCompany = (String)attributes.get("productionCompany");

		if (productionCompany != null) {
			setProductionCompany(productionCompany);
		}

		String technicalFormOfProd = (String)attributes.get(
			"technicalFormOfProd");

		if (technicalFormOfProd != null) {
			setTechnicalFormOfProd(technicalFormOfProd);
		}

		String OriginOfProdCom = (String)attributes.get("OriginOfProdCom");

		if (OriginOfProdCom != null) {
			setOriginOfProdCom(OriginOfProdCom);
		}

		String permitsRequired = (String)attributes.get("permitsRequired");

		if (permitsRequired != null) {
			setPermitsRequired(permitsRequired);
		}

		String shootLocationInJamaica = (String)attributes.get(
			"shootLocationInJamaica");

		if (shootLocationInJamaica != null) {
			setShootLocationInJamaica(shootLocationInJamaica);
		}

		Date preProductionDate = (Date)attributes.get("preProductionDate");

		if (preProductionDate != null) {
			setPreProductionDate(preProductionDate);
		}

		Date productionStartDate = (Date)attributes.get("productionStartDate");

		if (productionStartDate != null) {
			setProductionStartDate(productionStartDate);
		}

		String proposedDateOfArrival = (String)attributes.get(
			"proposedDateOfArrival");

		if (proposedDateOfArrival != null) {
			setProposedDateOfArrival(proposedDateOfArrival);
		}

		String portOfEntry = (String)attributes.get("portOfEntry");

		if (portOfEntry != null) {
			setPortOfEntry(portOfEntry);
		}

		Date proposedDateOfDeparture = (Date)attributes.get(
			"proposedDateOfDeparture");

		if (proposedDateOfDeparture != null) {
			setProposedDateOfDeparture(proposedDateOfDeparture);
		}

		String fullProductionBudget = (String)attributes.get(
			"fullProductionBudget");

		if (fullProductionBudget != null) {
			setFullProductionBudget(fullProductionBudget);
		}

		String expectedBudgetSpendInJA = (String)attributes.get(
			"expectedBudgetSpendInJA");

		if (expectedBudgetSpendInJA != null) {
			setExpectedBudgetSpendInJA(expectedBudgetSpendInJA);
		}

		String numberOFForeignCrewHired = (String)attributes.get(
			"numberOFForeignCrewHired");

		if (numberOFForeignCrewHired != null) {
			setNumberOFForeignCrewHired(numberOFForeignCrewHired);
		}

		String numberJamaicaCrewHired = (String)attributes.get(
			"numberJamaicaCrewHired");

		if (numberJamaicaCrewHired != null) {
			setNumberJamaicaCrewHired(numberJamaicaCrewHired);
		}

		String valueOfBondWaiver = (String)attributes.get("valueOfBondWaiver");

		if (valueOfBondWaiver != null) {
			setValueOfBondWaiver(valueOfBondWaiver);
		}

		String customsBroker = (String)attributes.get("customsBroker");

		if (customsBroker != null) {
			setCustomsBroker(customsBroker);
		}

		String localProductionManagerOrFixer = (String)attributes.get(
			"localProductionManagerOrFixer");

		if (localProductionManagerOrFixer != null) {
			setLocalProductionManagerOrFixer(localProductionManagerOrFixer);
		}
	}

	@Override
	public FilmApplicationRegister cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the case ID of this film application register.
	 *
	 * @return the case ID of this film application register
	 */
	@Override
	public String getCaseId() {
		return model.getCaseId();
	}

	/**
	 * Returns the company ID of this film application register.
	 *
	 * @return the company ID of this film application register
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this film application register.
	 *
	 * @return the create date of this film application register
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the customs broker of this film application register.
	 *
	 * @return the customs broker of this film application register
	 */
	@Override
	public String getCustomsBroker() {
		return model.getCustomsBroker();
	}

	/**
	 * Returns the date of issued of this film application register.
	 *
	 * @return the date of issued of this film application register
	 */
	@Override
	public Date getDateOfIssued() {
		return model.getDateOfIssued();
	}

	/**
	 * Returns the expected budget spend in ja of this film application register.
	 *
	 * @return the expected budget spend in ja of this film application register
	 */
	@Override
	public String getExpectedBudgetSpendInJA() {
		return model.getExpectedBudgetSpendInJA();
	}

	/**
	 * Returns the film application register ID of this film application register.
	 *
	 * @return the film application register ID of this film application register
	 */
	@Override
	public long getFilmApplicationRegisterId() {
		return model.getFilmApplicationRegisterId();
	}

	/**
	 * Returns the film registration num of this film application register.
	 *
	 * @return the film registration num of this film application register
	 */
	@Override
	public String getFilmRegistrationNum() {
		return model.getFilmRegistrationNum();
	}

	/**
	 * Returns the full production budget of this film application register.
	 *
	 * @return the full production budget of this film application register
	 */
	@Override
	public String getFullProductionBudget() {
		return model.getFullProductionBudget();
	}

	/**
	 * Returns the group ID of this film application register.
	 *
	 * @return the group ID of this film application register
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the local production manager or fixer of this film application register.
	 *
	 * @return the local production manager or fixer of this film application register
	 */
	@Override
	public String getLocalProductionManagerOrFixer() {
		return model.getLocalProductionManagerOrFixer();
	}

	/**
	 * Returns the modified date of this film application register.
	 *
	 * @return the modified date of this film application register
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of applicant of this film application register.
	 *
	 * @return the name of applicant of this film application register
	 */
	@Override
	public String getNameOfApplicant() {
		return model.getNameOfApplicant();
	}

	/**
	 * Returns the number jamaica crew hired of this film application register.
	 *
	 * @return the number jamaica crew hired of this film application register
	 */
	@Override
	public String getNumberJamaicaCrewHired() {
		return model.getNumberJamaicaCrewHired();
	}

	/**
	 * Returns the number of foreign crew hired of this film application register.
	 *
	 * @return the number of foreign crew hired of this film application register
	 */
	@Override
	public String getNumberOFForeignCrewHired() {
		return model.getNumberOFForeignCrewHired();
	}

	/**
	 * Returns the origin of prod com of this film application register.
	 *
	 * @return the origin of prod com of this film application register
	 */
	@Override
	public String getOriginOfProdCom() {
		return model.getOriginOfProdCom();
	}

	/**
	 * Returns the permits required of this film application register.
	 *
	 * @return the permits required of this film application register
	 */
	@Override
	public String getPermitsRequired() {
		return model.getPermitsRequired();
	}

	/**
	 * Returns the port of entry of this film application register.
	 *
	 * @return the port of entry of this film application register
	 */
	@Override
	public String getPortOfEntry() {
		return model.getPortOfEntry();
	}

	/**
	 * Returns the pre production date of this film application register.
	 *
	 * @return the pre production date of this film application register
	 */
	@Override
	public Date getPreProductionDate() {
		return model.getPreProductionDate();
	}

	/**
	 * Returns the primary key of this film application register.
	 *
	 * @return the primary key of this film application register
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the production company of this film application register.
	 *
	 * @return the production company of this film application register
	 */
	@Override
	public String getProductionCompany() {
		return model.getProductionCompany();
	}

	/**
	 * Returns the production start date of this film application register.
	 *
	 * @return the production start date of this film application register
	 */
	@Override
	public Date getProductionStartDate() {
		return model.getProductionStartDate();
	}

	/**
	 * Returns the proposed date of arrival of this film application register.
	 *
	 * @return the proposed date of arrival of this film application register
	 */
	@Override
	public String getProposedDateOfArrival() {
		return model.getProposedDateOfArrival();
	}

	/**
	 * Returns the proposed date of departure of this film application register.
	 *
	 * @return the proposed date of departure of this film application register
	 */
	@Override
	public Date getProposedDateOfDeparture() {
		return model.getProposedDateOfDeparture();
	}

	/**
	 * Returns the registration date of this film application register.
	 *
	 * @return the registration date of this film application register
	 */
	@Override
	public Date getRegistrationDate() {
		return model.getRegistrationDate();
	}

	/**
	 * Returns the shoot location in jamaica of this film application register.
	 *
	 * @return the shoot location in jamaica of this film application register
	 */
	@Override
	public String getShootLocationInJamaica() {
		return model.getShootLocationInJamaica();
	}

	/**
	 * Returns the technical form of prod of this film application register.
	 *
	 * @return the technical form of prod of this film application register
	 */
	@Override
	public String getTechnicalFormOfProd() {
		return model.getTechnicalFormOfProd();
	}

	/**
	 * Returns the title of production of this film application register.
	 *
	 * @return the title of production of this film application register
	 */
	@Override
	public String getTitleOfProduction() {
		return model.getTitleOfProduction();
	}

	/**
	 * Returns the user ID of this film application register.
	 *
	 * @return the user ID of this film application register
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this film application register.
	 *
	 * @return the user name of this film application register
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this film application register.
	 *
	 * @return the user uuid of this film application register
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the value of bond waiver of this film application register.
	 *
	 * @return the value of bond waiver of this film application register
	 */
	@Override
	public String getValueOfBondWaiver() {
		return model.getValueOfBondWaiver();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the case ID of this film application register.
	 *
	 * @param caseId the case ID of this film application register
	 */
	@Override
	public void setCaseId(String caseId) {
		model.setCaseId(caseId);
	}

	/**
	 * Sets the company ID of this film application register.
	 *
	 * @param companyId the company ID of this film application register
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this film application register.
	 *
	 * @param createDate the create date of this film application register
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the customs broker of this film application register.
	 *
	 * @param customsBroker the customs broker of this film application register
	 */
	@Override
	public void setCustomsBroker(String customsBroker) {
		model.setCustomsBroker(customsBroker);
	}

	/**
	 * Sets the date of issued of this film application register.
	 *
	 * @param dateOfIssued the date of issued of this film application register
	 */
	@Override
	public void setDateOfIssued(Date dateOfIssued) {
		model.setDateOfIssued(dateOfIssued);
	}

	/**
	 * Sets the expected budget spend in ja of this film application register.
	 *
	 * @param expectedBudgetSpendInJA the expected budget spend in ja of this film application register
	 */
	@Override
	public void setExpectedBudgetSpendInJA(String expectedBudgetSpendInJA) {
		model.setExpectedBudgetSpendInJA(expectedBudgetSpendInJA);
	}

	/**
	 * Sets the film application register ID of this film application register.
	 *
	 * @param filmApplicationRegisterId the film application register ID of this film application register
	 */
	@Override
	public void setFilmApplicationRegisterId(long filmApplicationRegisterId) {
		model.setFilmApplicationRegisterId(filmApplicationRegisterId);
	}

	/**
	 * Sets the film registration num of this film application register.
	 *
	 * @param filmRegistrationNum the film registration num of this film application register
	 */
	@Override
	public void setFilmRegistrationNum(String filmRegistrationNum) {
		model.setFilmRegistrationNum(filmRegistrationNum);
	}

	/**
	 * Sets the full production budget of this film application register.
	 *
	 * @param fullProductionBudget the full production budget of this film application register
	 */
	@Override
	public void setFullProductionBudget(String fullProductionBudget) {
		model.setFullProductionBudget(fullProductionBudget);
	}

	/**
	 * Sets the group ID of this film application register.
	 *
	 * @param groupId the group ID of this film application register
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the local production manager or fixer of this film application register.
	 *
	 * @param localProductionManagerOrFixer the local production manager or fixer of this film application register
	 */
	@Override
	public void setLocalProductionManagerOrFixer(
		String localProductionManagerOrFixer) {

		model.setLocalProductionManagerOrFixer(localProductionManagerOrFixer);
	}

	/**
	 * Sets the modified date of this film application register.
	 *
	 * @param modifiedDate the modified date of this film application register
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of applicant of this film application register.
	 *
	 * @param nameOfApplicant the name of applicant of this film application register
	 */
	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		model.setNameOfApplicant(nameOfApplicant);
	}

	/**
	 * Sets the number jamaica crew hired of this film application register.
	 *
	 * @param numberJamaicaCrewHired the number jamaica crew hired of this film application register
	 */
	@Override
	public void setNumberJamaicaCrewHired(String numberJamaicaCrewHired) {
		model.setNumberJamaicaCrewHired(numberJamaicaCrewHired);
	}

	/**
	 * Sets the number of foreign crew hired of this film application register.
	 *
	 * @param numberOFForeignCrewHired the number of foreign crew hired of this film application register
	 */
	@Override
	public void setNumberOFForeignCrewHired(String numberOFForeignCrewHired) {
		model.setNumberOFForeignCrewHired(numberOFForeignCrewHired);
	}

	/**
	 * Sets the origin of prod com of this film application register.
	 *
	 * @param OriginOfProdCom the origin of prod com of this film application register
	 */
	@Override
	public void setOriginOfProdCom(String OriginOfProdCom) {
		model.setOriginOfProdCom(OriginOfProdCom);
	}

	/**
	 * Sets the permits required of this film application register.
	 *
	 * @param permitsRequired the permits required of this film application register
	 */
	@Override
	public void setPermitsRequired(String permitsRequired) {
		model.setPermitsRequired(permitsRequired);
	}

	/**
	 * Sets the port of entry of this film application register.
	 *
	 * @param portOfEntry the port of entry of this film application register
	 */
	@Override
	public void setPortOfEntry(String portOfEntry) {
		model.setPortOfEntry(portOfEntry);
	}

	/**
	 * Sets the pre production date of this film application register.
	 *
	 * @param preProductionDate the pre production date of this film application register
	 */
	@Override
	public void setPreProductionDate(Date preProductionDate) {
		model.setPreProductionDate(preProductionDate);
	}

	/**
	 * Sets the primary key of this film application register.
	 *
	 * @param primaryKey the primary key of this film application register
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the production company of this film application register.
	 *
	 * @param productionCompany the production company of this film application register
	 */
	@Override
	public void setProductionCompany(String productionCompany) {
		model.setProductionCompany(productionCompany);
	}

	/**
	 * Sets the production start date of this film application register.
	 *
	 * @param productionStartDate the production start date of this film application register
	 */
	@Override
	public void setProductionStartDate(Date productionStartDate) {
		model.setProductionStartDate(productionStartDate);
	}

	/**
	 * Sets the proposed date of arrival of this film application register.
	 *
	 * @param proposedDateOfArrival the proposed date of arrival of this film application register
	 */
	@Override
	public void setProposedDateOfArrival(String proposedDateOfArrival) {
		model.setProposedDateOfArrival(proposedDateOfArrival);
	}

	/**
	 * Sets the proposed date of departure of this film application register.
	 *
	 * @param proposedDateOfDeparture the proposed date of departure of this film application register
	 */
	@Override
	public void setProposedDateOfDeparture(Date proposedDateOfDeparture) {
		model.setProposedDateOfDeparture(proposedDateOfDeparture);
	}

	/**
	 * Sets the registration date of this film application register.
	 *
	 * @param registrationDate the registration date of this film application register
	 */
	@Override
	public void setRegistrationDate(Date registrationDate) {
		model.setRegistrationDate(registrationDate);
	}

	/**
	 * Sets the shoot location in jamaica of this film application register.
	 *
	 * @param shootLocationInJamaica the shoot location in jamaica of this film application register
	 */
	@Override
	public void setShootLocationInJamaica(String shootLocationInJamaica) {
		model.setShootLocationInJamaica(shootLocationInJamaica);
	}

	/**
	 * Sets the technical form of prod of this film application register.
	 *
	 * @param technicalFormOfProd the technical form of prod of this film application register
	 */
	@Override
	public void setTechnicalFormOfProd(String technicalFormOfProd) {
		model.setTechnicalFormOfProd(technicalFormOfProd);
	}

	/**
	 * Sets the title of production of this film application register.
	 *
	 * @param titleOfProduction the title of production of this film application register
	 */
	@Override
	public void setTitleOfProduction(String titleOfProduction) {
		model.setTitleOfProduction(titleOfProduction);
	}

	/**
	 * Sets the user ID of this film application register.
	 *
	 * @param userId the user ID of this film application register
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this film application register.
	 *
	 * @param userName the user name of this film application register
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this film application register.
	 *
	 * @param userUuid the user uuid of this film application register
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the value of bond waiver of this film application register.
	 *
	 * @param valueOfBondWaiver the value of bond waiver of this film application register
	 */
	@Override
	public void setValueOfBondWaiver(String valueOfBondWaiver) {
		model.setValueOfBondWaiver(valueOfBondWaiver);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected FilmApplicationRegisterWrapper wrap(
		FilmApplicationRegister filmApplicationRegister) {

		return new FilmApplicationRegisterWrapper(filmApplicationRegister);
	}

}
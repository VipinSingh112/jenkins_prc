/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.explosives.competency.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link PyrotechnicCompetencyForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see PyrotechnicCompetencyForm
 * @generated
 */
public class PyrotechnicCompetencyFormWrapper
	extends BaseModelWrapper<PyrotechnicCompetencyForm>
	implements ModelWrapper<PyrotechnicCompetencyForm>,
			   PyrotechnicCompetencyForm {

	public PyrotechnicCompetencyFormWrapper(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		super(pyrotechnicCompetencyForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"pyrotechnicCompetencyFormId", getPyrotechnicCompetencyFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstNamePyro", getFirstNamePyro());
		attributes.put("surNamePyro", getSurNamePyro());
		attributes.put("middleNamePyro", getMiddleNamePyro());
		attributes.put("genderPyro", getGenderPyro());
		attributes.put("officeNumberPyro", getOfficeNumberPyro());
		attributes.put("cellNumPyro", getCellNumPyro());
		attributes.put("trnNumPyro", getTrnNumPyro());
		attributes.put("dateOfBirthPyro", getDateOfBirthPyro());
		attributes.put("addressPyro", getAddressPyro());
		attributes.put("educationalBackPyro", getEducationalBackPyro());
		attributes.put("blastingCoursePyro", getBlastingCoursePyro());
		attributes.put("statePyro", getStatePyro());
		attributes.put("nameOfCoursePyro", getNameOfCoursePyro());
		attributes.put("courseOrganiserPyro", getCourseOrganiserPyro());
		attributes.put("dateAppliPyro", getDateAppliPyro());
		attributes.put("explosivesApplicationId", getExplosivesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long pyrotechnicCompetencyFormId = (Long)attributes.get(
			"pyrotechnicCompetencyFormId");

		if (pyrotechnicCompetencyFormId != null) {
			setPyrotechnicCompetencyFormId(pyrotechnicCompetencyFormId);
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

		String firstNamePyro = (String)attributes.get("firstNamePyro");

		if (firstNamePyro != null) {
			setFirstNamePyro(firstNamePyro);
		}

		String surNamePyro = (String)attributes.get("surNamePyro");

		if (surNamePyro != null) {
			setSurNamePyro(surNamePyro);
		}

		String middleNamePyro = (String)attributes.get("middleNamePyro");

		if (middleNamePyro != null) {
			setMiddleNamePyro(middleNamePyro);
		}

		String genderPyro = (String)attributes.get("genderPyro");

		if (genderPyro != null) {
			setGenderPyro(genderPyro);
		}

		String officeNumberPyro = (String)attributes.get("officeNumberPyro");

		if (officeNumberPyro != null) {
			setOfficeNumberPyro(officeNumberPyro);
		}

		String cellNumPyro = (String)attributes.get("cellNumPyro");

		if (cellNumPyro != null) {
			setCellNumPyro(cellNumPyro);
		}

		String trnNumPyro = (String)attributes.get("trnNumPyro");

		if (trnNumPyro != null) {
			setTrnNumPyro(trnNumPyro);
		}

		Date dateOfBirthPyro = (Date)attributes.get("dateOfBirthPyro");

		if (dateOfBirthPyro != null) {
			setDateOfBirthPyro(dateOfBirthPyro);
		}

		String addressPyro = (String)attributes.get("addressPyro");

		if (addressPyro != null) {
			setAddressPyro(addressPyro);
		}

		String educationalBackPyro = (String)attributes.get(
			"educationalBackPyro");

		if (educationalBackPyro != null) {
			setEducationalBackPyro(educationalBackPyro);
		}

		String blastingCoursePyro = (String)attributes.get(
			"blastingCoursePyro");

		if (blastingCoursePyro != null) {
			setBlastingCoursePyro(blastingCoursePyro);
		}

		String statePyro = (String)attributes.get("statePyro");

		if (statePyro != null) {
			setStatePyro(statePyro);
		}

		String nameOfCoursePyro = (String)attributes.get("nameOfCoursePyro");

		if (nameOfCoursePyro != null) {
			setNameOfCoursePyro(nameOfCoursePyro);
		}

		String courseOrganiserPyro = (String)attributes.get(
			"courseOrganiserPyro");

		if (courseOrganiserPyro != null) {
			setCourseOrganiserPyro(courseOrganiserPyro);
		}

		String dateAppliPyro = (String)attributes.get("dateAppliPyro");

		if (dateAppliPyro != null) {
			setDateAppliPyro(dateAppliPyro);
		}

		Long explosivesApplicationId = (Long)attributes.get(
			"explosivesApplicationId");

		if (explosivesApplicationId != null) {
			setExplosivesApplicationId(explosivesApplicationId);
		}
	}

	@Override
	public PyrotechnicCompetencyForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address pyro of this pyrotechnic competency form.
	 *
	 * @return the address pyro of this pyrotechnic competency form
	 */
	@Override
	public String getAddressPyro() {
		return model.getAddressPyro();
	}

	/**
	 * Returns the blasting course pyro of this pyrotechnic competency form.
	 *
	 * @return the blasting course pyro of this pyrotechnic competency form
	 */
	@Override
	public String getBlastingCoursePyro() {
		return model.getBlastingCoursePyro();
	}

	/**
	 * Returns the cell num pyro of this pyrotechnic competency form.
	 *
	 * @return the cell num pyro of this pyrotechnic competency form
	 */
	@Override
	public String getCellNumPyro() {
		return model.getCellNumPyro();
	}

	/**
	 * Returns the company ID of this pyrotechnic competency form.
	 *
	 * @return the company ID of this pyrotechnic competency form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the course organiser pyro of this pyrotechnic competency form.
	 *
	 * @return the course organiser pyro of this pyrotechnic competency form
	 */
	@Override
	public String getCourseOrganiserPyro() {
		return model.getCourseOrganiserPyro();
	}

	/**
	 * Returns the create date of this pyrotechnic competency form.
	 *
	 * @return the create date of this pyrotechnic competency form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date appli pyro of this pyrotechnic competency form.
	 *
	 * @return the date appli pyro of this pyrotechnic competency form
	 */
	@Override
	public String getDateAppliPyro() {
		return model.getDateAppliPyro();
	}

	/**
	 * Returns the date of birth pyro of this pyrotechnic competency form.
	 *
	 * @return the date of birth pyro of this pyrotechnic competency form
	 */
	@Override
	public Date getDateOfBirthPyro() {
		return model.getDateOfBirthPyro();
	}

	/**
	 * Returns the educational back pyro of this pyrotechnic competency form.
	 *
	 * @return the educational back pyro of this pyrotechnic competency form
	 */
	@Override
	public String getEducationalBackPyro() {
		return model.getEducationalBackPyro();
	}

	/**
	 * Returns the explosives application ID of this pyrotechnic competency form.
	 *
	 * @return the explosives application ID of this pyrotechnic competency form
	 */
	@Override
	public long getExplosivesApplicationId() {
		return model.getExplosivesApplicationId();
	}

	/**
	 * Returns the first name pyro of this pyrotechnic competency form.
	 *
	 * @return the first name pyro of this pyrotechnic competency form
	 */
	@Override
	public String getFirstNamePyro() {
		return model.getFirstNamePyro();
	}

	/**
	 * Returns the gender pyro of this pyrotechnic competency form.
	 *
	 * @return the gender pyro of this pyrotechnic competency form
	 */
	@Override
	public String getGenderPyro() {
		return model.getGenderPyro();
	}

	/**
	 * Returns the group ID of this pyrotechnic competency form.
	 *
	 * @return the group ID of this pyrotechnic competency form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the middle name pyro of this pyrotechnic competency form.
	 *
	 * @return the middle name pyro of this pyrotechnic competency form
	 */
	@Override
	public String getMiddleNamePyro() {
		return model.getMiddleNamePyro();
	}

	/**
	 * Returns the modified date of this pyrotechnic competency form.
	 *
	 * @return the modified date of this pyrotechnic competency form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of course pyro of this pyrotechnic competency form.
	 *
	 * @return the name of course pyro of this pyrotechnic competency form
	 */
	@Override
	public String getNameOfCoursePyro() {
		return model.getNameOfCoursePyro();
	}

	/**
	 * Returns the office number pyro of this pyrotechnic competency form.
	 *
	 * @return the office number pyro of this pyrotechnic competency form
	 */
	@Override
	public String getOfficeNumberPyro() {
		return model.getOfficeNumberPyro();
	}

	/**
	 * Returns the primary key of this pyrotechnic competency form.
	 *
	 * @return the primary key of this pyrotechnic competency form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the pyrotechnic competency form ID of this pyrotechnic competency form.
	 *
	 * @return the pyrotechnic competency form ID of this pyrotechnic competency form
	 */
	@Override
	public long getPyrotechnicCompetencyFormId() {
		return model.getPyrotechnicCompetencyFormId();
	}

	/**
	 * Returns the state pyro of this pyrotechnic competency form.
	 *
	 * @return the state pyro of this pyrotechnic competency form
	 */
	@Override
	public String getStatePyro() {
		return model.getStatePyro();
	}

	/**
	 * Returns the sur name pyro of this pyrotechnic competency form.
	 *
	 * @return the sur name pyro of this pyrotechnic competency form
	 */
	@Override
	public String getSurNamePyro() {
		return model.getSurNamePyro();
	}

	/**
	 * Returns the trn num pyro of this pyrotechnic competency form.
	 *
	 * @return the trn num pyro of this pyrotechnic competency form
	 */
	@Override
	public String getTrnNumPyro() {
		return model.getTrnNumPyro();
	}

	/**
	 * Returns the user ID of this pyrotechnic competency form.
	 *
	 * @return the user ID of this pyrotechnic competency form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this pyrotechnic competency form.
	 *
	 * @return the user name of this pyrotechnic competency form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this pyrotechnic competency form.
	 *
	 * @return the user uuid of this pyrotechnic competency form
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
	 * Sets the address pyro of this pyrotechnic competency form.
	 *
	 * @param addressPyro the address pyro of this pyrotechnic competency form
	 */
	@Override
	public void setAddressPyro(String addressPyro) {
		model.setAddressPyro(addressPyro);
	}

	/**
	 * Sets the blasting course pyro of this pyrotechnic competency form.
	 *
	 * @param blastingCoursePyro the blasting course pyro of this pyrotechnic competency form
	 */
	@Override
	public void setBlastingCoursePyro(String blastingCoursePyro) {
		model.setBlastingCoursePyro(blastingCoursePyro);
	}

	/**
	 * Sets the cell num pyro of this pyrotechnic competency form.
	 *
	 * @param cellNumPyro the cell num pyro of this pyrotechnic competency form
	 */
	@Override
	public void setCellNumPyro(String cellNumPyro) {
		model.setCellNumPyro(cellNumPyro);
	}

	/**
	 * Sets the company ID of this pyrotechnic competency form.
	 *
	 * @param companyId the company ID of this pyrotechnic competency form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the course organiser pyro of this pyrotechnic competency form.
	 *
	 * @param courseOrganiserPyro the course organiser pyro of this pyrotechnic competency form
	 */
	@Override
	public void setCourseOrganiserPyro(String courseOrganiserPyro) {
		model.setCourseOrganiserPyro(courseOrganiserPyro);
	}

	/**
	 * Sets the create date of this pyrotechnic competency form.
	 *
	 * @param createDate the create date of this pyrotechnic competency form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date appli pyro of this pyrotechnic competency form.
	 *
	 * @param dateAppliPyro the date appli pyro of this pyrotechnic competency form
	 */
	@Override
	public void setDateAppliPyro(String dateAppliPyro) {
		model.setDateAppliPyro(dateAppliPyro);
	}

	/**
	 * Sets the date of birth pyro of this pyrotechnic competency form.
	 *
	 * @param dateOfBirthPyro the date of birth pyro of this pyrotechnic competency form
	 */
	@Override
	public void setDateOfBirthPyro(Date dateOfBirthPyro) {
		model.setDateOfBirthPyro(dateOfBirthPyro);
	}

	/**
	 * Sets the educational back pyro of this pyrotechnic competency form.
	 *
	 * @param educationalBackPyro the educational back pyro of this pyrotechnic competency form
	 */
	@Override
	public void setEducationalBackPyro(String educationalBackPyro) {
		model.setEducationalBackPyro(educationalBackPyro);
	}

	/**
	 * Sets the explosives application ID of this pyrotechnic competency form.
	 *
	 * @param explosivesApplicationId the explosives application ID of this pyrotechnic competency form
	 */
	@Override
	public void setExplosivesApplicationId(long explosivesApplicationId) {
		model.setExplosivesApplicationId(explosivesApplicationId);
	}

	/**
	 * Sets the first name pyro of this pyrotechnic competency form.
	 *
	 * @param firstNamePyro the first name pyro of this pyrotechnic competency form
	 */
	@Override
	public void setFirstNamePyro(String firstNamePyro) {
		model.setFirstNamePyro(firstNamePyro);
	}

	/**
	 * Sets the gender pyro of this pyrotechnic competency form.
	 *
	 * @param genderPyro the gender pyro of this pyrotechnic competency form
	 */
	@Override
	public void setGenderPyro(String genderPyro) {
		model.setGenderPyro(genderPyro);
	}

	/**
	 * Sets the group ID of this pyrotechnic competency form.
	 *
	 * @param groupId the group ID of this pyrotechnic competency form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the middle name pyro of this pyrotechnic competency form.
	 *
	 * @param middleNamePyro the middle name pyro of this pyrotechnic competency form
	 */
	@Override
	public void setMiddleNamePyro(String middleNamePyro) {
		model.setMiddleNamePyro(middleNamePyro);
	}

	/**
	 * Sets the modified date of this pyrotechnic competency form.
	 *
	 * @param modifiedDate the modified date of this pyrotechnic competency form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of course pyro of this pyrotechnic competency form.
	 *
	 * @param nameOfCoursePyro the name of course pyro of this pyrotechnic competency form
	 */
	@Override
	public void setNameOfCoursePyro(String nameOfCoursePyro) {
		model.setNameOfCoursePyro(nameOfCoursePyro);
	}

	/**
	 * Sets the office number pyro of this pyrotechnic competency form.
	 *
	 * @param officeNumberPyro the office number pyro of this pyrotechnic competency form
	 */
	@Override
	public void setOfficeNumberPyro(String officeNumberPyro) {
		model.setOfficeNumberPyro(officeNumberPyro);
	}

	/**
	 * Sets the primary key of this pyrotechnic competency form.
	 *
	 * @param primaryKey the primary key of this pyrotechnic competency form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the pyrotechnic competency form ID of this pyrotechnic competency form.
	 *
	 * @param pyrotechnicCompetencyFormId the pyrotechnic competency form ID of this pyrotechnic competency form
	 */
	@Override
	public void setPyrotechnicCompetencyFormId(
		long pyrotechnicCompetencyFormId) {

		model.setPyrotechnicCompetencyFormId(pyrotechnicCompetencyFormId);
	}

	/**
	 * Sets the state pyro of this pyrotechnic competency form.
	 *
	 * @param statePyro the state pyro of this pyrotechnic competency form
	 */
	@Override
	public void setStatePyro(String statePyro) {
		model.setStatePyro(statePyro);
	}

	/**
	 * Sets the sur name pyro of this pyrotechnic competency form.
	 *
	 * @param surNamePyro the sur name pyro of this pyrotechnic competency form
	 */
	@Override
	public void setSurNamePyro(String surNamePyro) {
		model.setSurNamePyro(surNamePyro);
	}

	/**
	 * Sets the trn num pyro of this pyrotechnic competency form.
	 *
	 * @param trnNumPyro the trn num pyro of this pyrotechnic competency form
	 */
	@Override
	public void setTrnNumPyro(String trnNumPyro) {
		model.setTrnNumPyro(trnNumPyro);
	}

	/**
	 * Sets the user ID of this pyrotechnic competency form.
	 *
	 * @param userId the user ID of this pyrotechnic competency form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this pyrotechnic competency form.
	 *
	 * @param userName the user name of this pyrotechnic competency form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this pyrotechnic competency form.
	 *
	 * @param userUuid the user uuid of this pyrotechnic competency form
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
	protected PyrotechnicCompetencyFormWrapper wrap(
		PyrotechnicCompetencyForm pyrotechnicCompetencyForm) {

		return new PyrotechnicCompetencyFormWrapper(pyrotechnicCompetencyForm);
	}

}
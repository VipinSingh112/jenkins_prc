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
 * This class is a wrapper for {@link BlasterCompetencyForm}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see BlasterCompetencyForm
 * @generated
 */
public class BlasterCompetencyFormWrapper
	extends BaseModelWrapper<BlasterCompetencyForm>
	implements BlasterCompetencyForm, ModelWrapper<BlasterCompetencyForm> {

	public BlasterCompetencyFormWrapper(
		BlasterCompetencyForm blasterCompetencyForm) {

		super(blasterCompetencyForm);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("blasterCompetencyFormId", getBlasterCompetencyFormId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("firstName", getFirstName());
		attributes.put("surName", getSurName());
		attributes.put("middleName", getMiddleName());
		attributes.put("gender", getGender());
		attributes.put("officeNumber", getOfficeNumber());
		attributes.put("cellNum", getCellNum());
		attributes.put("trnNum", getTrnNum());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("address", getAddress());
		attributes.put("educationalBack", getEducationalBack());
		attributes.put("blastingCourse", getBlastingCourse());
		attributes.put("state", getState());
		attributes.put("nameOfCourse", getNameOfCourse());
		attributes.put("courseOrganiser", getCourseOrganiser());
		attributes.put("dateAppli", getDateAppli());
		attributes.put("explosivesApplicationId", getExplosivesApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long blasterCompetencyFormId = (Long)attributes.get(
			"blasterCompetencyFormId");

		if (blasterCompetencyFormId != null) {
			setBlasterCompetencyFormId(blasterCompetencyFormId);
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

		String firstName = (String)attributes.get("firstName");

		if (firstName != null) {
			setFirstName(firstName);
		}

		String surName = (String)attributes.get("surName");

		if (surName != null) {
			setSurName(surName);
		}

		String middleName = (String)attributes.get("middleName");

		if (middleName != null) {
			setMiddleName(middleName);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String officeNumber = (String)attributes.get("officeNumber");

		if (officeNumber != null) {
			setOfficeNumber(officeNumber);
		}

		String cellNum = (String)attributes.get("cellNum");

		if (cellNum != null) {
			setCellNum(cellNum);
		}

		String trnNum = (String)attributes.get("trnNum");

		if (trnNum != null) {
			setTrnNum(trnNum);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String address = (String)attributes.get("address");

		if (address != null) {
			setAddress(address);
		}

		String educationalBack = (String)attributes.get("educationalBack");

		if (educationalBack != null) {
			setEducationalBack(educationalBack);
		}

		String blastingCourse = (String)attributes.get("blastingCourse");

		if (blastingCourse != null) {
			setBlastingCourse(blastingCourse);
		}

		String state = (String)attributes.get("state");

		if (state != null) {
			setState(state);
		}

		String nameOfCourse = (String)attributes.get("nameOfCourse");

		if (nameOfCourse != null) {
			setNameOfCourse(nameOfCourse);
		}

		String courseOrganiser = (String)attributes.get("courseOrganiser");

		if (courseOrganiser != null) {
			setCourseOrganiser(courseOrganiser);
		}

		Date dateAppli = (Date)attributes.get("dateAppli");

		if (dateAppli != null) {
			setDateAppli(dateAppli);
		}

		Long explosivesApplicationId = (Long)attributes.get(
			"explosivesApplicationId");

		if (explosivesApplicationId != null) {
			setExplosivesApplicationId(explosivesApplicationId);
		}
	}

	@Override
	public BlasterCompetencyForm cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the address of this blaster competency form.
	 *
	 * @return the address of this blaster competency form
	 */
	@Override
	public String getAddress() {
		return model.getAddress();
	}

	/**
	 * Returns the blaster competency form ID of this blaster competency form.
	 *
	 * @return the blaster competency form ID of this blaster competency form
	 */
	@Override
	public long getBlasterCompetencyFormId() {
		return model.getBlasterCompetencyFormId();
	}

	/**
	 * Returns the blasting course of this blaster competency form.
	 *
	 * @return the blasting course of this blaster competency form
	 */
	@Override
	public String getBlastingCourse() {
		return model.getBlastingCourse();
	}

	/**
	 * Returns the cell num of this blaster competency form.
	 *
	 * @return the cell num of this blaster competency form
	 */
	@Override
	public String getCellNum() {
		return model.getCellNum();
	}

	/**
	 * Returns the company ID of this blaster competency form.
	 *
	 * @return the company ID of this blaster competency form
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the course organiser of this blaster competency form.
	 *
	 * @return the course organiser of this blaster competency form
	 */
	@Override
	public String getCourseOrganiser() {
		return model.getCourseOrganiser();
	}

	/**
	 * Returns the create date of this blaster competency form.
	 *
	 * @return the create date of this blaster competency form
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date appli of this blaster competency form.
	 *
	 * @return the date appli of this blaster competency form
	 */
	@Override
	public Date getDateAppli() {
		return model.getDateAppli();
	}

	/**
	 * Returns the date of birth of this blaster competency form.
	 *
	 * @return the date of birth of this blaster competency form
	 */
	@Override
	public Date getDateOfBirth() {
		return model.getDateOfBirth();
	}

	/**
	 * Returns the educational back of this blaster competency form.
	 *
	 * @return the educational back of this blaster competency form
	 */
	@Override
	public String getEducationalBack() {
		return model.getEducationalBack();
	}

	/**
	 * Returns the explosives application ID of this blaster competency form.
	 *
	 * @return the explosives application ID of this blaster competency form
	 */
	@Override
	public long getExplosivesApplicationId() {
		return model.getExplosivesApplicationId();
	}

	/**
	 * Returns the first name of this blaster competency form.
	 *
	 * @return the first name of this blaster competency form
	 */
	@Override
	public String getFirstName() {
		return model.getFirstName();
	}

	/**
	 * Returns the gender of this blaster competency form.
	 *
	 * @return the gender of this blaster competency form
	 */
	@Override
	public String getGender() {
		return model.getGender();
	}

	/**
	 * Returns the group ID of this blaster competency form.
	 *
	 * @return the group ID of this blaster competency form
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the middle name of this blaster competency form.
	 *
	 * @return the middle name of this blaster competency form
	 */
	@Override
	public String getMiddleName() {
		return model.getMiddleName();
	}

	/**
	 * Returns the modified date of this blaster competency form.
	 *
	 * @return the modified date of this blaster competency form
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name of course of this blaster competency form.
	 *
	 * @return the name of course of this blaster competency form
	 */
	@Override
	public String getNameOfCourse() {
		return model.getNameOfCourse();
	}

	/**
	 * Returns the office number of this blaster competency form.
	 *
	 * @return the office number of this blaster competency form
	 */
	@Override
	public String getOfficeNumber() {
		return model.getOfficeNumber();
	}

	/**
	 * Returns the primary key of this blaster competency form.
	 *
	 * @return the primary key of this blaster competency form
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the state of this blaster competency form.
	 *
	 * @return the state of this blaster competency form
	 */
	@Override
	public String getState() {
		return model.getState();
	}

	/**
	 * Returns the sur name of this blaster competency form.
	 *
	 * @return the sur name of this blaster competency form
	 */
	@Override
	public String getSurName() {
		return model.getSurName();
	}

	/**
	 * Returns the trn num of this blaster competency form.
	 *
	 * @return the trn num of this blaster competency form
	 */
	@Override
	public String getTrnNum() {
		return model.getTrnNum();
	}

	/**
	 * Returns the user ID of this blaster competency form.
	 *
	 * @return the user ID of this blaster competency form
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this blaster competency form.
	 *
	 * @return the user name of this blaster competency form
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this blaster competency form.
	 *
	 * @return the user uuid of this blaster competency form
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
	 * Sets the address of this blaster competency form.
	 *
	 * @param address the address of this blaster competency form
	 */
	@Override
	public void setAddress(String address) {
		model.setAddress(address);
	}

	/**
	 * Sets the blaster competency form ID of this blaster competency form.
	 *
	 * @param blasterCompetencyFormId the blaster competency form ID of this blaster competency form
	 */
	@Override
	public void setBlasterCompetencyFormId(long blasterCompetencyFormId) {
		model.setBlasterCompetencyFormId(blasterCompetencyFormId);
	}

	/**
	 * Sets the blasting course of this blaster competency form.
	 *
	 * @param blastingCourse the blasting course of this blaster competency form
	 */
	@Override
	public void setBlastingCourse(String blastingCourse) {
		model.setBlastingCourse(blastingCourse);
	}

	/**
	 * Sets the cell num of this blaster competency form.
	 *
	 * @param cellNum the cell num of this blaster competency form
	 */
	@Override
	public void setCellNum(String cellNum) {
		model.setCellNum(cellNum);
	}

	/**
	 * Sets the company ID of this blaster competency form.
	 *
	 * @param companyId the company ID of this blaster competency form
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the course organiser of this blaster competency form.
	 *
	 * @param courseOrganiser the course organiser of this blaster competency form
	 */
	@Override
	public void setCourseOrganiser(String courseOrganiser) {
		model.setCourseOrganiser(courseOrganiser);
	}

	/**
	 * Sets the create date of this blaster competency form.
	 *
	 * @param createDate the create date of this blaster competency form
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date appli of this blaster competency form.
	 *
	 * @param dateAppli the date appli of this blaster competency form
	 */
	@Override
	public void setDateAppli(Date dateAppli) {
		model.setDateAppli(dateAppli);
	}

	/**
	 * Sets the date of birth of this blaster competency form.
	 *
	 * @param dateOfBirth the date of birth of this blaster competency form
	 */
	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		model.setDateOfBirth(dateOfBirth);
	}

	/**
	 * Sets the educational back of this blaster competency form.
	 *
	 * @param educationalBack the educational back of this blaster competency form
	 */
	@Override
	public void setEducationalBack(String educationalBack) {
		model.setEducationalBack(educationalBack);
	}

	/**
	 * Sets the explosives application ID of this blaster competency form.
	 *
	 * @param explosivesApplicationId the explosives application ID of this blaster competency form
	 */
	@Override
	public void setExplosivesApplicationId(long explosivesApplicationId) {
		model.setExplosivesApplicationId(explosivesApplicationId);
	}

	/**
	 * Sets the first name of this blaster competency form.
	 *
	 * @param firstName the first name of this blaster competency form
	 */
	@Override
	public void setFirstName(String firstName) {
		model.setFirstName(firstName);
	}

	/**
	 * Sets the gender of this blaster competency form.
	 *
	 * @param gender the gender of this blaster competency form
	 */
	@Override
	public void setGender(String gender) {
		model.setGender(gender);
	}

	/**
	 * Sets the group ID of this blaster competency form.
	 *
	 * @param groupId the group ID of this blaster competency form
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the middle name of this blaster competency form.
	 *
	 * @param middleName the middle name of this blaster competency form
	 */
	@Override
	public void setMiddleName(String middleName) {
		model.setMiddleName(middleName);
	}

	/**
	 * Sets the modified date of this blaster competency form.
	 *
	 * @param modifiedDate the modified date of this blaster competency form
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name of course of this blaster competency form.
	 *
	 * @param nameOfCourse the name of course of this blaster competency form
	 */
	@Override
	public void setNameOfCourse(String nameOfCourse) {
		model.setNameOfCourse(nameOfCourse);
	}

	/**
	 * Sets the office number of this blaster competency form.
	 *
	 * @param officeNumber the office number of this blaster competency form
	 */
	@Override
	public void setOfficeNumber(String officeNumber) {
		model.setOfficeNumber(officeNumber);
	}

	/**
	 * Sets the primary key of this blaster competency form.
	 *
	 * @param primaryKey the primary key of this blaster competency form
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the state of this blaster competency form.
	 *
	 * @param state the state of this blaster competency form
	 */
	@Override
	public void setState(String state) {
		model.setState(state);
	}

	/**
	 * Sets the sur name of this blaster competency form.
	 *
	 * @param surName the sur name of this blaster competency form
	 */
	@Override
	public void setSurName(String surName) {
		model.setSurName(surName);
	}

	/**
	 * Sets the trn num of this blaster competency form.
	 *
	 * @param trnNum the trn num of this blaster competency form
	 */
	@Override
	public void setTrnNum(String trnNum) {
		model.setTrnNum(trnNum);
	}

	/**
	 * Sets the user ID of this blaster competency form.
	 *
	 * @param userId the user ID of this blaster competency form
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this blaster competency form.
	 *
	 * @param userName the user name of this blaster competency form
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this blaster competency form.
	 *
	 * @param userUuid the user uuid of this blaster competency form
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
	protected BlasterCompetencyFormWrapper wrap(
		BlasterCompetencyForm blasterCompetencyForm) {

		return new BlasterCompetencyFormWrapper(blasterCompetencyForm);
	}

}
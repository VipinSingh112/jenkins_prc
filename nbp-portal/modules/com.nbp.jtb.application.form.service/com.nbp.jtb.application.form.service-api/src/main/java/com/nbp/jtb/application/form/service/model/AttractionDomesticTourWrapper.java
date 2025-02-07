/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link AttractionDomesticTour}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionDomesticTour
 * @generated
 */
public class AttractionDomesticTourWrapper
	extends BaseModelWrapper<AttractionDomesticTour>
	implements AttractionDomesticTour, ModelWrapper<AttractionDomesticTour> {

	public AttractionDomesticTourWrapper(
		AttractionDomesticTour attractionDomesticTour) {

		super(attractionDomesticTour);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"attractionDomesticTourId", getAttractionDomesticTourId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put(
			"domesticTourApplicantName", getDomesticTourApplicantName());
		attributes.put("domesticTourAddress", getDomesticTourAddress());
		attributes.put("domesticTourCompanyName", getDomesticTourCompanyName());
		attributes.put(
			"domesticTourExactLocation", getDomesticTourExactLocation());
		attributes.put("domesticTourTelephone", getDomesticTourTelephone());
		attributes.put("domesticTourEmail", getDomesticTourEmail());
		attributes.put("domesticTourDate", getDomesticTourDate());
		attributes.put("domesticTourManagerName", getDomesticTourManagerName());
		attributes.put("domesticTourVehiclesNum", getDomesticTourVehiclesNum());
		attributes.put("domesticTourEmployeesNo", getDomesticTourEmployeesNo());
		attributes.put(
			"domesticTourOfficeLocation", getDomesticTourOfficeLocation());
		attributes.put("domesticTourSignDate", getDomesticTourSignDate());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long attractionDomesticTourId = (Long)attributes.get(
			"attractionDomesticTourId");

		if (attractionDomesticTourId != null) {
			setAttractionDomesticTourId(attractionDomesticTourId);
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

		String domesticTourApplicantName = (String)attributes.get(
			"domesticTourApplicantName");

		if (domesticTourApplicantName != null) {
			setDomesticTourApplicantName(domesticTourApplicantName);
		}

		String domesticTourAddress = (String)attributes.get(
			"domesticTourAddress");

		if (domesticTourAddress != null) {
			setDomesticTourAddress(domesticTourAddress);
		}

		String domesticTourCompanyName = (String)attributes.get(
			"domesticTourCompanyName");

		if (domesticTourCompanyName != null) {
			setDomesticTourCompanyName(domesticTourCompanyName);
		}

		String domesticTourExactLocation = (String)attributes.get(
			"domesticTourExactLocation");

		if (domesticTourExactLocation != null) {
			setDomesticTourExactLocation(domesticTourExactLocation);
		}

		String domesticTourTelephone = (String)attributes.get(
			"domesticTourTelephone");

		if (domesticTourTelephone != null) {
			setDomesticTourTelephone(domesticTourTelephone);
		}

		String domesticTourEmail = (String)attributes.get("domesticTourEmail");

		if (domesticTourEmail != null) {
			setDomesticTourEmail(domesticTourEmail);
		}

		Date domesticTourDate = (Date)attributes.get("domesticTourDate");

		if (domesticTourDate != null) {
			setDomesticTourDate(domesticTourDate);
		}

		String domesticTourManagerName = (String)attributes.get(
			"domesticTourManagerName");

		if (domesticTourManagerName != null) {
			setDomesticTourManagerName(domesticTourManagerName);
		}

		String domesticTourVehiclesNum = (String)attributes.get(
			"domesticTourVehiclesNum");

		if (domesticTourVehiclesNum != null) {
			setDomesticTourVehiclesNum(domesticTourVehiclesNum);
		}

		String domesticTourEmployeesNo = (String)attributes.get(
			"domesticTourEmployeesNo");

		if (domesticTourEmployeesNo != null) {
			setDomesticTourEmployeesNo(domesticTourEmployeesNo);
		}

		String domesticTourOfficeLocation = (String)attributes.get(
			"domesticTourOfficeLocation");

		if (domesticTourOfficeLocation != null) {
			setDomesticTourOfficeLocation(domesticTourOfficeLocation);
		}

		Date domesticTourSignDate = (Date)attributes.get(
			"domesticTourSignDate");

		if (domesticTourSignDate != null) {
			setDomesticTourSignDate(domesticTourSignDate);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public AttractionDomesticTour cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the attraction domestic tour ID of this attraction domestic tour.
	 *
	 * @return the attraction domestic tour ID of this attraction domestic tour
	 */
	@Override
	public long getAttractionDomesticTourId() {
		return model.getAttractionDomesticTourId();
	}

	/**
	 * Returns the company ID of this attraction domestic tour.
	 *
	 * @return the company ID of this attraction domestic tour
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this attraction domestic tour.
	 *
	 * @return the create date of this attraction domestic tour
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the domestic tour address of this attraction domestic tour.
	 *
	 * @return the domestic tour address of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourAddress() {
		return model.getDomesticTourAddress();
	}

	/**
	 * Returns the domestic tour applicant name of this attraction domestic tour.
	 *
	 * @return the domestic tour applicant name of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourApplicantName() {
		return model.getDomesticTourApplicantName();
	}

	/**
	 * Returns the domestic tour company name of this attraction domestic tour.
	 *
	 * @return the domestic tour company name of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourCompanyName() {
		return model.getDomesticTourCompanyName();
	}

	/**
	 * Returns the domestic tour date of this attraction domestic tour.
	 *
	 * @return the domestic tour date of this attraction domestic tour
	 */
	@Override
	public Date getDomesticTourDate() {
		return model.getDomesticTourDate();
	}

	/**
	 * Returns the domestic tour email of this attraction domestic tour.
	 *
	 * @return the domestic tour email of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourEmail() {
		return model.getDomesticTourEmail();
	}

	/**
	 * Returns the domestic tour employees no of this attraction domestic tour.
	 *
	 * @return the domestic tour employees no of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourEmployeesNo() {
		return model.getDomesticTourEmployeesNo();
	}

	/**
	 * Returns the domestic tour exact location of this attraction domestic tour.
	 *
	 * @return the domestic tour exact location of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourExactLocation() {
		return model.getDomesticTourExactLocation();
	}

	/**
	 * Returns the domestic tour manager name of this attraction domestic tour.
	 *
	 * @return the domestic tour manager name of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourManagerName() {
		return model.getDomesticTourManagerName();
	}

	/**
	 * Returns the domestic tour office location of this attraction domestic tour.
	 *
	 * @return the domestic tour office location of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourOfficeLocation() {
		return model.getDomesticTourOfficeLocation();
	}

	/**
	 * Returns the domestic tour sign date of this attraction domestic tour.
	 *
	 * @return the domestic tour sign date of this attraction domestic tour
	 */
	@Override
	public Date getDomesticTourSignDate() {
		return model.getDomesticTourSignDate();
	}

	/**
	 * Returns the domestic tour telephone of this attraction domestic tour.
	 *
	 * @return the domestic tour telephone of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourTelephone() {
		return model.getDomesticTourTelephone();
	}

	/**
	 * Returns the domestic tour vehicles num of this attraction domestic tour.
	 *
	 * @return the domestic tour vehicles num of this attraction domestic tour
	 */
	@Override
	public String getDomesticTourVehiclesNum() {
		return model.getDomesticTourVehiclesNum();
	}

	/**
	 * Returns the group ID of this attraction domestic tour.
	 *
	 * @return the group ID of this attraction domestic tour
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb application ID of this attraction domestic tour.
	 *
	 * @return the jtb application ID of this attraction domestic tour
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this attraction domestic tour.
	 *
	 * @return the modified date of this attraction domestic tour
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this attraction domestic tour.
	 *
	 * @return the primary key of this attraction domestic tour
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this attraction domestic tour.
	 *
	 * @return the user ID of this attraction domestic tour
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this attraction domestic tour.
	 *
	 * @return the user name of this attraction domestic tour
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this attraction domestic tour.
	 *
	 * @return the user uuid of this attraction domestic tour
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
	 * Sets the attraction domestic tour ID of this attraction domestic tour.
	 *
	 * @param attractionDomesticTourId the attraction domestic tour ID of this attraction domestic tour
	 */
	@Override
	public void setAttractionDomesticTourId(long attractionDomesticTourId) {
		model.setAttractionDomesticTourId(attractionDomesticTourId);
	}

	/**
	 * Sets the company ID of this attraction domestic tour.
	 *
	 * @param companyId the company ID of this attraction domestic tour
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this attraction domestic tour.
	 *
	 * @param createDate the create date of this attraction domestic tour
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the domestic tour address of this attraction domestic tour.
	 *
	 * @param domesticTourAddress the domestic tour address of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourAddress(String domesticTourAddress) {
		model.setDomesticTourAddress(domesticTourAddress);
	}

	/**
	 * Sets the domestic tour applicant name of this attraction domestic tour.
	 *
	 * @param domesticTourApplicantName the domestic tour applicant name of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourApplicantName(String domesticTourApplicantName) {
		model.setDomesticTourApplicantName(domesticTourApplicantName);
	}

	/**
	 * Sets the domestic tour company name of this attraction domestic tour.
	 *
	 * @param domesticTourCompanyName the domestic tour company name of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourCompanyName(String domesticTourCompanyName) {
		model.setDomesticTourCompanyName(domesticTourCompanyName);
	}

	/**
	 * Sets the domestic tour date of this attraction domestic tour.
	 *
	 * @param domesticTourDate the domestic tour date of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourDate(Date domesticTourDate) {
		model.setDomesticTourDate(domesticTourDate);
	}

	/**
	 * Sets the domestic tour email of this attraction domestic tour.
	 *
	 * @param domesticTourEmail the domestic tour email of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourEmail(String domesticTourEmail) {
		model.setDomesticTourEmail(domesticTourEmail);
	}

	/**
	 * Sets the domestic tour employees no of this attraction domestic tour.
	 *
	 * @param domesticTourEmployeesNo the domestic tour employees no of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourEmployeesNo(String domesticTourEmployeesNo) {
		model.setDomesticTourEmployeesNo(domesticTourEmployeesNo);
	}

	/**
	 * Sets the domestic tour exact location of this attraction domestic tour.
	 *
	 * @param domesticTourExactLocation the domestic tour exact location of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourExactLocation(String domesticTourExactLocation) {
		model.setDomesticTourExactLocation(domesticTourExactLocation);
	}

	/**
	 * Sets the domestic tour manager name of this attraction domestic tour.
	 *
	 * @param domesticTourManagerName the domestic tour manager name of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourManagerName(String domesticTourManagerName) {
		model.setDomesticTourManagerName(domesticTourManagerName);
	}

	/**
	 * Sets the domestic tour office location of this attraction domestic tour.
	 *
	 * @param domesticTourOfficeLocation the domestic tour office location of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourOfficeLocation(
		String domesticTourOfficeLocation) {

		model.setDomesticTourOfficeLocation(domesticTourOfficeLocation);
	}

	/**
	 * Sets the domestic tour sign date of this attraction domestic tour.
	 *
	 * @param domesticTourSignDate the domestic tour sign date of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourSignDate(Date domesticTourSignDate) {
		model.setDomesticTourSignDate(domesticTourSignDate);
	}

	/**
	 * Sets the domestic tour telephone of this attraction domestic tour.
	 *
	 * @param domesticTourTelephone the domestic tour telephone of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourTelephone(String domesticTourTelephone) {
		model.setDomesticTourTelephone(domesticTourTelephone);
	}

	/**
	 * Sets the domestic tour vehicles num of this attraction domestic tour.
	 *
	 * @param domesticTourVehiclesNum the domestic tour vehicles num of this attraction domestic tour
	 */
	@Override
	public void setDomesticTourVehiclesNum(String domesticTourVehiclesNum) {
		model.setDomesticTourVehiclesNum(domesticTourVehiclesNum);
	}

	/**
	 * Sets the group ID of this attraction domestic tour.
	 *
	 * @param groupId the group ID of this attraction domestic tour
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb application ID of this attraction domestic tour.
	 *
	 * @param jtbApplicationId the jtb application ID of this attraction domestic tour
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this attraction domestic tour.
	 *
	 * @param modifiedDate the modified date of this attraction domestic tour
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this attraction domestic tour.
	 *
	 * @param primaryKey the primary key of this attraction domestic tour
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this attraction domestic tour.
	 *
	 * @param userId the user ID of this attraction domestic tour
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this attraction domestic tour.
	 *
	 * @param userName the user name of this attraction domestic tour
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this attraction domestic tour.
	 *
	 * @param userUuid the user uuid of this attraction domestic tour
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
	protected AttractionDomesticTourWrapper wrap(
		AttractionDomesticTour attractionDomesticTour) {

		return new AttractionDomesticTourWrapper(attractionDomesticTour);
	}

}
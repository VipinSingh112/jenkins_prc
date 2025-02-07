/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link TourismNewAnnualEarnings}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAnnualEarnings
 * @generated
 */
public class TourismNewAnnualEarningsWrapper
	extends BaseModelWrapper<TourismNewAnnualEarnings>
	implements ModelWrapper<TourismNewAnnualEarnings>,
			   TourismNewAnnualEarnings {

	public TourismNewAnnualEarningsWrapper(
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		super(tourismNewAnnualEarnings);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"tourismNewAnnualEarningsId", getTourismNewAnnualEarningsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("yearOne", getYearOne());
		attributes.put("yearTwo", getYearTwo());
		attributes.put("yearThree", getYearThree());
		attributes.put("targetLocalPer", getTargetLocalPer());
		attributes.put("targetForeignPer", getTargetForeignPer());
		attributes.put("targetCountries", getTargetCountries());
		attributes.put("estimatedPer", getEstimatedPer());
		attributes.put("volume", getVolume());
		attributes.put("expenditure", getExpenditure());
		attributes.put("manufactureEstimatedPer", getManufactureEstimatedPer());
		attributes.put("manufactureVolume", getManufactureVolume());
		attributes.put("manufactureExpenditure", getManufactureExpenditure());
		attributes.put("seafoodPer", getSeafoodPer());
		attributes.put("seafoodVolume", getSeafoodVolume());
		attributes.put("seafoodExpenditure", getSeafoodExpenditure());
		attributes.put("enterServices", getEnterServices());
		attributes.put("enterLocal", getEnterLocal());
		attributes.put("enterForeign", getEnterForeign());
		attributes.put("tourismApplicationId", getTourismApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long tourismNewAnnualEarningsId = (Long)attributes.get(
			"tourismNewAnnualEarningsId");

		if (tourismNewAnnualEarningsId != null) {
			setTourismNewAnnualEarningsId(tourismNewAnnualEarningsId);
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

		String yearOne = (String)attributes.get("yearOne");

		if (yearOne != null) {
			setYearOne(yearOne);
		}

		String yearTwo = (String)attributes.get("yearTwo");

		if (yearTwo != null) {
			setYearTwo(yearTwo);
		}

		String yearThree = (String)attributes.get("yearThree");

		if (yearThree != null) {
			setYearThree(yearThree);
		}

		String targetLocalPer = (String)attributes.get("targetLocalPer");

		if (targetLocalPer != null) {
			setTargetLocalPer(targetLocalPer);
		}

		String targetForeignPer = (String)attributes.get("targetForeignPer");

		if (targetForeignPer != null) {
			setTargetForeignPer(targetForeignPer);
		}

		String targetCountries = (String)attributes.get("targetCountries");

		if (targetCountries != null) {
			setTargetCountries(targetCountries);
		}

		String estimatedPer = (String)attributes.get("estimatedPer");

		if (estimatedPer != null) {
			setEstimatedPer(estimatedPer);
		}

		String volume = (String)attributes.get("volume");

		if (volume != null) {
			setVolume(volume);
		}

		String expenditure = (String)attributes.get("expenditure");

		if (expenditure != null) {
			setExpenditure(expenditure);
		}

		String manufactureEstimatedPer = (String)attributes.get(
			"manufactureEstimatedPer");

		if (manufactureEstimatedPer != null) {
			setManufactureEstimatedPer(manufactureEstimatedPer);
		}

		String manufactureVolume = (String)attributes.get("manufactureVolume");

		if (manufactureVolume != null) {
			setManufactureVolume(manufactureVolume);
		}

		String manufactureExpenditure = (String)attributes.get(
			"manufactureExpenditure");

		if (manufactureExpenditure != null) {
			setManufactureExpenditure(manufactureExpenditure);
		}

		String seafoodPer = (String)attributes.get("seafoodPer");

		if (seafoodPer != null) {
			setSeafoodPer(seafoodPer);
		}

		String seafoodVolume = (String)attributes.get("seafoodVolume");

		if (seafoodVolume != null) {
			setSeafoodVolume(seafoodVolume);
		}

		String seafoodExpenditure = (String)attributes.get(
			"seafoodExpenditure");

		if (seafoodExpenditure != null) {
			setSeafoodExpenditure(seafoodExpenditure);
		}

		String enterServices = (String)attributes.get("enterServices");

		if (enterServices != null) {
			setEnterServices(enterServices);
		}

		String enterLocal = (String)attributes.get("enterLocal");

		if (enterLocal != null) {
			setEnterLocal(enterLocal);
		}

		String enterForeign = (String)attributes.get("enterForeign");

		if (enterForeign != null) {
			setEnterForeign(enterForeign);
		}

		Long tourismApplicationId = (Long)attributes.get(
			"tourismApplicationId");

		if (tourismApplicationId != null) {
			setTourismApplicationId(tourismApplicationId);
		}
	}

	@Override
	public TourismNewAnnualEarnings cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this tourism new annual earnings.
	 *
	 * @return the company ID of this tourism new annual earnings
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this tourism new annual earnings.
	 *
	 * @return the create date of this tourism new annual earnings
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the enter foreign of this tourism new annual earnings.
	 *
	 * @return the enter foreign of this tourism new annual earnings
	 */
	@Override
	public String getEnterForeign() {
		return model.getEnterForeign();
	}

	/**
	 * Returns the enter local of this tourism new annual earnings.
	 *
	 * @return the enter local of this tourism new annual earnings
	 */
	@Override
	public String getEnterLocal() {
		return model.getEnterLocal();
	}

	/**
	 * Returns the enter services of this tourism new annual earnings.
	 *
	 * @return the enter services of this tourism new annual earnings
	 */
	@Override
	public String getEnterServices() {
		return model.getEnterServices();
	}

	/**
	 * Returns the estimated per of this tourism new annual earnings.
	 *
	 * @return the estimated per of this tourism new annual earnings
	 */
	@Override
	public String getEstimatedPer() {
		return model.getEstimatedPer();
	}

	/**
	 * Returns the expenditure of this tourism new annual earnings.
	 *
	 * @return the expenditure of this tourism new annual earnings
	 */
	@Override
	public String getExpenditure() {
		return model.getExpenditure();
	}

	/**
	 * Returns the group ID of this tourism new annual earnings.
	 *
	 * @return the group ID of this tourism new annual earnings
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the manufacture estimated per of this tourism new annual earnings.
	 *
	 * @return the manufacture estimated per of this tourism new annual earnings
	 */
	@Override
	public String getManufactureEstimatedPer() {
		return model.getManufactureEstimatedPer();
	}

	/**
	 * Returns the manufacture expenditure of this tourism new annual earnings.
	 *
	 * @return the manufacture expenditure of this tourism new annual earnings
	 */
	@Override
	public String getManufactureExpenditure() {
		return model.getManufactureExpenditure();
	}

	/**
	 * Returns the manufacture volume of this tourism new annual earnings.
	 *
	 * @return the manufacture volume of this tourism new annual earnings
	 */
	@Override
	public String getManufactureVolume() {
		return model.getManufactureVolume();
	}

	/**
	 * Returns the modified date of this tourism new annual earnings.
	 *
	 * @return the modified date of this tourism new annual earnings
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this tourism new annual earnings.
	 *
	 * @return the primary key of this tourism new annual earnings
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the seafood expenditure of this tourism new annual earnings.
	 *
	 * @return the seafood expenditure of this tourism new annual earnings
	 */
	@Override
	public String getSeafoodExpenditure() {
		return model.getSeafoodExpenditure();
	}

	/**
	 * Returns the seafood per of this tourism new annual earnings.
	 *
	 * @return the seafood per of this tourism new annual earnings
	 */
	@Override
	public String getSeafoodPer() {
		return model.getSeafoodPer();
	}

	/**
	 * Returns the seafood volume of this tourism new annual earnings.
	 *
	 * @return the seafood volume of this tourism new annual earnings
	 */
	@Override
	public String getSeafoodVolume() {
		return model.getSeafoodVolume();
	}

	/**
	 * Returns the target countries of this tourism new annual earnings.
	 *
	 * @return the target countries of this tourism new annual earnings
	 */
	@Override
	public String getTargetCountries() {
		return model.getTargetCountries();
	}

	/**
	 * Returns the target foreign per of this tourism new annual earnings.
	 *
	 * @return the target foreign per of this tourism new annual earnings
	 */
	@Override
	public String getTargetForeignPer() {
		return model.getTargetForeignPer();
	}

	/**
	 * Returns the target local per of this tourism new annual earnings.
	 *
	 * @return the target local per of this tourism new annual earnings
	 */
	@Override
	public String getTargetLocalPer() {
		return model.getTargetLocalPer();
	}

	/**
	 * Returns the tourism application ID of this tourism new annual earnings.
	 *
	 * @return the tourism application ID of this tourism new annual earnings
	 */
	@Override
	public long getTourismApplicationId() {
		return model.getTourismApplicationId();
	}

	/**
	 * Returns the tourism new annual earnings ID of this tourism new annual earnings.
	 *
	 * @return the tourism new annual earnings ID of this tourism new annual earnings
	 */
	@Override
	public long getTourismNewAnnualEarningsId() {
		return model.getTourismNewAnnualEarningsId();
	}

	/**
	 * Returns the user ID of this tourism new annual earnings.
	 *
	 * @return the user ID of this tourism new annual earnings
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this tourism new annual earnings.
	 *
	 * @return the user name of this tourism new annual earnings
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this tourism new annual earnings.
	 *
	 * @return the user uuid of this tourism new annual earnings
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the volume of this tourism new annual earnings.
	 *
	 * @return the volume of this tourism new annual earnings
	 */
	@Override
	public String getVolume() {
		return model.getVolume();
	}

	/**
	 * Returns the year one of this tourism new annual earnings.
	 *
	 * @return the year one of this tourism new annual earnings
	 */
	@Override
	public String getYearOne() {
		return model.getYearOne();
	}

	/**
	 * Returns the year three of this tourism new annual earnings.
	 *
	 * @return the year three of this tourism new annual earnings
	 */
	@Override
	public String getYearThree() {
		return model.getYearThree();
	}

	/**
	 * Returns the year two of this tourism new annual earnings.
	 *
	 * @return the year two of this tourism new annual earnings
	 */
	@Override
	public String getYearTwo() {
		return model.getYearTwo();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this tourism new annual earnings.
	 *
	 * @param companyId the company ID of this tourism new annual earnings
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this tourism new annual earnings.
	 *
	 * @param createDate the create date of this tourism new annual earnings
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the enter foreign of this tourism new annual earnings.
	 *
	 * @param enterForeign the enter foreign of this tourism new annual earnings
	 */
	@Override
	public void setEnterForeign(String enterForeign) {
		model.setEnterForeign(enterForeign);
	}

	/**
	 * Sets the enter local of this tourism new annual earnings.
	 *
	 * @param enterLocal the enter local of this tourism new annual earnings
	 */
	@Override
	public void setEnterLocal(String enterLocal) {
		model.setEnterLocal(enterLocal);
	}

	/**
	 * Sets the enter services of this tourism new annual earnings.
	 *
	 * @param enterServices the enter services of this tourism new annual earnings
	 */
	@Override
	public void setEnterServices(String enterServices) {
		model.setEnterServices(enterServices);
	}

	/**
	 * Sets the estimated per of this tourism new annual earnings.
	 *
	 * @param estimatedPer the estimated per of this tourism new annual earnings
	 */
	@Override
	public void setEstimatedPer(String estimatedPer) {
		model.setEstimatedPer(estimatedPer);
	}

	/**
	 * Sets the expenditure of this tourism new annual earnings.
	 *
	 * @param expenditure the expenditure of this tourism new annual earnings
	 */
	@Override
	public void setExpenditure(String expenditure) {
		model.setExpenditure(expenditure);
	}

	/**
	 * Sets the group ID of this tourism new annual earnings.
	 *
	 * @param groupId the group ID of this tourism new annual earnings
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the manufacture estimated per of this tourism new annual earnings.
	 *
	 * @param manufactureEstimatedPer the manufacture estimated per of this tourism new annual earnings
	 */
	@Override
	public void setManufactureEstimatedPer(String manufactureEstimatedPer) {
		model.setManufactureEstimatedPer(manufactureEstimatedPer);
	}

	/**
	 * Sets the manufacture expenditure of this tourism new annual earnings.
	 *
	 * @param manufactureExpenditure the manufacture expenditure of this tourism new annual earnings
	 */
	@Override
	public void setManufactureExpenditure(String manufactureExpenditure) {
		model.setManufactureExpenditure(manufactureExpenditure);
	}

	/**
	 * Sets the manufacture volume of this tourism new annual earnings.
	 *
	 * @param manufactureVolume the manufacture volume of this tourism new annual earnings
	 */
	@Override
	public void setManufactureVolume(String manufactureVolume) {
		model.setManufactureVolume(manufactureVolume);
	}

	/**
	 * Sets the modified date of this tourism new annual earnings.
	 *
	 * @param modifiedDate the modified date of this tourism new annual earnings
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this tourism new annual earnings.
	 *
	 * @param primaryKey the primary key of this tourism new annual earnings
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the seafood expenditure of this tourism new annual earnings.
	 *
	 * @param seafoodExpenditure the seafood expenditure of this tourism new annual earnings
	 */
	@Override
	public void setSeafoodExpenditure(String seafoodExpenditure) {
		model.setSeafoodExpenditure(seafoodExpenditure);
	}

	/**
	 * Sets the seafood per of this tourism new annual earnings.
	 *
	 * @param seafoodPer the seafood per of this tourism new annual earnings
	 */
	@Override
	public void setSeafoodPer(String seafoodPer) {
		model.setSeafoodPer(seafoodPer);
	}

	/**
	 * Sets the seafood volume of this tourism new annual earnings.
	 *
	 * @param seafoodVolume the seafood volume of this tourism new annual earnings
	 */
	@Override
	public void setSeafoodVolume(String seafoodVolume) {
		model.setSeafoodVolume(seafoodVolume);
	}

	/**
	 * Sets the target countries of this tourism new annual earnings.
	 *
	 * @param targetCountries the target countries of this tourism new annual earnings
	 */
	@Override
	public void setTargetCountries(String targetCountries) {
		model.setTargetCountries(targetCountries);
	}

	/**
	 * Sets the target foreign per of this tourism new annual earnings.
	 *
	 * @param targetForeignPer the target foreign per of this tourism new annual earnings
	 */
	@Override
	public void setTargetForeignPer(String targetForeignPer) {
		model.setTargetForeignPer(targetForeignPer);
	}

	/**
	 * Sets the target local per of this tourism new annual earnings.
	 *
	 * @param targetLocalPer the target local per of this tourism new annual earnings
	 */
	@Override
	public void setTargetLocalPer(String targetLocalPer) {
		model.setTargetLocalPer(targetLocalPer);
	}

	/**
	 * Sets the tourism application ID of this tourism new annual earnings.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new annual earnings
	 */
	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		model.setTourismApplicationId(tourismApplicationId);
	}

	/**
	 * Sets the tourism new annual earnings ID of this tourism new annual earnings.
	 *
	 * @param tourismNewAnnualEarningsId the tourism new annual earnings ID of this tourism new annual earnings
	 */
	@Override
	public void setTourismNewAnnualEarningsId(long tourismNewAnnualEarningsId) {
		model.setTourismNewAnnualEarningsId(tourismNewAnnualEarningsId);
	}

	/**
	 * Sets the user ID of this tourism new annual earnings.
	 *
	 * @param userId the user ID of this tourism new annual earnings
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this tourism new annual earnings.
	 *
	 * @param userName the user name of this tourism new annual earnings
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this tourism new annual earnings.
	 *
	 * @param userUuid the user uuid of this tourism new annual earnings
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the volume of this tourism new annual earnings.
	 *
	 * @param volume the volume of this tourism new annual earnings
	 */
	@Override
	public void setVolume(String volume) {
		model.setVolume(volume);
	}

	/**
	 * Sets the year one of this tourism new annual earnings.
	 *
	 * @param yearOne the year one of this tourism new annual earnings
	 */
	@Override
	public void setYearOne(String yearOne) {
		model.setYearOne(yearOne);
	}

	/**
	 * Sets the year three of this tourism new annual earnings.
	 *
	 * @param yearThree the year three of this tourism new annual earnings
	 */
	@Override
	public void setYearThree(String yearThree) {
		model.setYearThree(yearThree);
	}

	/**
	 * Sets the year two of this tourism new annual earnings.
	 *
	 * @param yearTwo the year two of this tourism new annual earnings
	 */
	@Override
	public void setYearTwo(String yearTwo) {
		model.setYearTwo(yearTwo);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected TourismNewAnnualEarningsWrapper wrap(
		TourismNewAnnualEarnings tourismNewAnnualEarnings) {

		return new TourismNewAnnualEarningsWrapper(tourismNewAnnualEarnings);
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.insolvency.application.form.services.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link CompanyDetails}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CompanyDetails
 * @generated
 */
public class CompanyDetailsWrapper
	extends BaseModelWrapper<CompanyDetails>
	implements CompanyDetails, ModelWrapper<CompanyDetails> {

	public CompanyDetailsWrapper(CompanyDetails companyDetails) {
		super(companyDetails);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("companyDetailsId", getCompanyDetailsId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("companyDate", getCompanyDate());
		attributes.put("companyName", getCompanyName());
		attributes.put("companyAddress", getCompanyAddress());
		attributes.put("companyEmail", getCompanyEmail());
		attributes.put("companyTelNum", getCompanyTelNum());
		attributes.put("companyTrn", getCompanyTrn());
		attributes.put("companyDateInco", getCompanyDateInco());
		attributes.put("companyTypeOfCo", getCompanyTypeOfCo());
		attributes.put("companyCore", getCompanyCore());
		attributes.put("companyEmployees", getCompanyEmployees());
		attributes.put("companyLastReturn", getCompanyLastReturn());
		attributes.put("companyTurnover", getCompanyTurnover());
		attributes.put("companyShares", getCompanyShares());
		attributes.put("osiInsolvencyId", getOsiInsolvencyId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long companyDetailsId = (Long)attributes.get("companyDetailsId");

		if (companyDetailsId != null) {
			setCompanyDetailsId(companyDetailsId);
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

		Date companyDate = (Date)attributes.get("companyDate");

		if (companyDate != null) {
			setCompanyDate(companyDate);
		}

		String companyName = (String)attributes.get("companyName");

		if (companyName != null) {
			setCompanyName(companyName);
		}

		String companyAddress = (String)attributes.get("companyAddress");

		if (companyAddress != null) {
			setCompanyAddress(companyAddress);
		}

		String companyEmail = (String)attributes.get("companyEmail");

		if (companyEmail != null) {
			setCompanyEmail(companyEmail);
		}

		String companyTelNum = (String)attributes.get("companyTelNum");

		if (companyTelNum != null) {
			setCompanyTelNum(companyTelNum);
		}

		String companyTrn = (String)attributes.get("companyTrn");

		if (companyTrn != null) {
			setCompanyTrn(companyTrn);
		}

		Date companyDateInco = (Date)attributes.get("companyDateInco");

		if (companyDateInco != null) {
			setCompanyDateInco(companyDateInco);
		}

		String companyTypeOfCo = (String)attributes.get("companyTypeOfCo");

		if (companyTypeOfCo != null) {
			setCompanyTypeOfCo(companyTypeOfCo);
		}

		String companyCore = (String)attributes.get("companyCore");

		if (companyCore != null) {
			setCompanyCore(companyCore);
		}

		String companyEmployees = (String)attributes.get("companyEmployees");

		if (companyEmployees != null) {
			setCompanyEmployees(companyEmployees);
		}

		Date companyLastReturn = (Date)attributes.get("companyLastReturn");

		if (companyLastReturn != null) {
			setCompanyLastReturn(companyLastReturn);
		}

		String companyTurnover = (String)attributes.get("companyTurnover");

		if (companyTurnover != null) {
			setCompanyTurnover(companyTurnover);
		}

		String companyShares = (String)attributes.get("companyShares");

		if (companyShares != null) {
			setCompanyShares(companyShares);
		}

		Long osiInsolvencyId = (Long)attributes.get("osiInsolvencyId");

		if (osiInsolvencyId != null) {
			setOsiInsolvencyId(osiInsolvencyId);
		}
	}

	@Override
	public CompanyDetails cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company address of this company details.
	 *
	 * @return the company address of this company details
	 */
	@Override
	public String getCompanyAddress() {
		return model.getCompanyAddress();
	}

	/**
	 * Returns the company core of this company details.
	 *
	 * @return the company core of this company details
	 */
	@Override
	public String getCompanyCore() {
		return model.getCompanyCore();
	}

	/**
	 * Returns the company date of this company details.
	 *
	 * @return the company date of this company details
	 */
	@Override
	public Date getCompanyDate() {
		return model.getCompanyDate();
	}

	/**
	 * Returns the company date inco of this company details.
	 *
	 * @return the company date inco of this company details
	 */
	@Override
	public Date getCompanyDateInco() {
		return model.getCompanyDateInco();
	}

	/**
	 * Returns the company details ID of this company details.
	 *
	 * @return the company details ID of this company details
	 */
	@Override
	public long getCompanyDetailsId() {
		return model.getCompanyDetailsId();
	}

	/**
	 * Returns the company email of this company details.
	 *
	 * @return the company email of this company details
	 */
	@Override
	public String getCompanyEmail() {
		return model.getCompanyEmail();
	}

	/**
	 * Returns the company employees of this company details.
	 *
	 * @return the company employees of this company details
	 */
	@Override
	public String getCompanyEmployees() {
		return model.getCompanyEmployees();
	}

	/**
	 * Returns the company ID of this company details.
	 *
	 * @return the company ID of this company details
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the company last return of this company details.
	 *
	 * @return the company last return of this company details
	 */
	@Override
	public Date getCompanyLastReturn() {
		return model.getCompanyLastReturn();
	}

	/**
	 * Returns the company name of this company details.
	 *
	 * @return the company name of this company details
	 */
	@Override
	public String getCompanyName() {
		return model.getCompanyName();
	}

	/**
	 * Returns the company shares of this company details.
	 *
	 * @return the company shares of this company details
	 */
	@Override
	public String getCompanyShares() {
		return model.getCompanyShares();
	}

	/**
	 * Returns the company tel num of this company details.
	 *
	 * @return the company tel num of this company details
	 */
	@Override
	public String getCompanyTelNum() {
		return model.getCompanyTelNum();
	}

	/**
	 * Returns the company trn of this company details.
	 *
	 * @return the company trn of this company details
	 */
	@Override
	public String getCompanyTrn() {
		return model.getCompanyTrn();
	}

	/**
	 * Returns the company turnover of this company details.
	 *
	 * @return the company turnover of this company details
	 */
	@Override
	public String getCompanyTurnover() {
		return model.getCompanyTurnover();
	}

	/**
	 * Returns the company type of co of this company details.
	 *
	 * @return the company type of co of this company details
	 */
	@Override
	public String getCompanyTypeOfCo() {
		return model.getCompanyTypeOfCo();
	}

	/**
	 * Returns the create date of this company details.
	 *
	 * @return the create date of this company details
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this company details.
	 *
	 * @return the group ID of this company details
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this company details.
	 *
	 * @return the modified date of this company details
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the osi insolvency ID of this company details.
	 *
	 * @return the osi insolvency ID of this company details
	 */
	@Override
	public long getOsiInsolvencyId() {
		return model.getOsiInsolvencyId();
	}

	/**
	 * Returns the primary key of this company details.
	 *
	 * @return the primary key of this company details
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this company details.
	 *
	 * @return the user ID of this company details
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this company details.
	 *
	 * @return the user name of this company details
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this company details.
	 *
	 * @return the user uuid of this company details
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
	 * Sets the company address of this company details.
	 *
	 * @param companyAddress the company address of this company details
	 */
	@Override
	public void setCompanyAddress(String companyAddress) {
		model.setCompanyAddress(companyAddress);
	}

	/**
	 * Sets the company core of this company details.
	 *
	 * @param companyCore the company core of this company details
	 */
	@Override
	public void setCompanyCore(String companyCore) {
		model.setCompanyCore(companyCore);
	}

	/**
	 * Sets the company date of this company details.
	 *
	 * @param companyDate the company date of this company details
	 */
	@Override
	public void setCompanyDate(Date companyDate) {
		model.setCompanyDate(companyDate);
	}

	/**
	 * Sets the company date inco of this company details.
	 *
	 * @param companyDateInco the company date inco of this company details
	 */
	@Override
	public void setCompanyDateInco(Date companyDateInco) {
		model.setCompanyDateInco(companyDateInco);
	}

	/**
	 * Sets the company details ID of this company details.
	 *
	 * @param companyDetailsId the company details ID of this company details
	 */
	@Override
	public void setCompanyDetailsId(long companyDetailsId) {
		model.setCompanyDetailsId(companyDetailsId);
	}

	/**
	 * Sets the company email of this company details.
	 *
	 * @param companyEmail the company email of this company details
	 */
	@Override
	public void setCompanyEmail(String companyEmail) {
		model.setCompanyEmail(companyEmail);
	}

	/**
	 * Sets the company employees of this company details.
	 *
	 * @param companyEmployees the company employees of this company details
	 */
	@Override
	public void setCompanyEmployees(String companyEmployees) {
		model.setCompanyEmployees(companyEmployees);
	}

	/**
	 * Sets the company ID of this company details.
	 *
	 * @param companyId the company ID of this company details
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the company last return of this company details.
	 *
	 * @param companyLastReturn the company last return of this company details
	 */
	@Override
	public void setCompanyLastReturn(Date companyLastReturn) {
		model.setCompanyLastReturn(companyLastReturn);
	}

	/**
	 * Sets the company name of this company details.
	 *
	 * @param companyName the company name of this company details
	 */
	@Override
	public void setCompanyName(String companyName) {
		model.setCompanyName(companyName);
	}

	/**
	 * Sets the company shares of this company details.
	 *
	 * @param companyShares the company shares of this company details
	 */
	@Override
	public void setCompanyShares(String companyShares) {
		model.setCompanyShares(companyShares);
	}

	/**
	 * Sets the company tel num of this company details.
	 *
	 * @param companyTelNum the company tel num of this company details
	 */
	@Override
	public void setCompanyTelNum(String companyTelNum) {
		model.setCompanyTelNum(companyTelNum);
	}

	/**
	 * Sets the company trn of this company details.
	 *
	 * @param companyTrn the company trn of this company details
	 */
	@Override
	public void setCompanyTrn(String companyTrn) {
		model.setCompanyTrn(companyTrn);
	}

	/**
	 * Sets the company turnover of this company details.
	 *
	 * @param companyTurnover the company turnover of this company details
	 */
	@Override
	public void setCompanyTurnover(String companyTurnover) {
		model.setCompanyTurnover(companyTurnover);
	}

	/**
	 * Sets the company type of co of this company details.
	 *
	 * @param companyTypeOfCo the company type of co of this company details
	 */
	@Override
	public void setCompanyTypeOfCo(String companyTypeOfCo) {
		model.setCompanyTypeOfCo(companyTypeOfCo);
	}

	/**
	 * Sets the create date of this company details.
	 *
	 * @param createDate the create date of this company details
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this company details.
	 *
	 * @param groupId the group ID of this company details
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this company details.
	 *
	 * @param modifiedDate the modified date of this company details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the osi insolvency ID of this company details.
	 *
	 * @param osiInsolvencyId the osi insolvency ID of this company details
	 */
	@Override
	public void setOsiInsolvencyId(long osiInsolvencyId) {
		model.setOsiInsolvencyId(osiInsolvencyId);
	}

	/**
	 * Sets the primary key of this company details.
	 *
	 * @param primaryKey the primary key of this company details
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this company details.
	 *
	 * @param userId the user ID of this company details
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this company details.
	 *
	 * @param userName the user name of this company details
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this company details.
	 *
	 * @param userUuid the user uuid of this company details
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
	protected CompanyDetailsWrapper wrap(CompanyDetails companyDetails) {
		return new CompanyDetailsWrapper(companyDetails);
	}

}
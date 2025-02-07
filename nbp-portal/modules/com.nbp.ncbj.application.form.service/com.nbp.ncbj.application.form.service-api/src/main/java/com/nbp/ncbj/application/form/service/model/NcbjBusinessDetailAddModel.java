/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the NcbjBusinessDetailAdd service. Represents a row in the &quot;nbp_ncbj_business_detail_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.ncbj.application.form.service.model.impl.NcbjBusinessDetailAddImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjBusinessDetailAdd
 * @generated
 */
@ProviderType
public interface NcbjBusinessDetailAddModel
	extends BaseModel<NcbjBusinessDetailAdd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ncbj business detail add model instance should use the {@link NcbjBusinessDetailAdd} interface instead.
	 */

	/**
	 * Returns the primary key of this ncbj business detail add.
	 *
	 * @return the primary key of this ncbj business detail add
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ncbj business detail add.
	 *
	 * @param primaryKey the primary key of this ncbj business detail add
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ncbj business detail add ID of this ncbj business detail add.
	 *
	 * @return the ncbj business detail add ID of this ncbj business detail add
	 */
	public long getNcbjBusinessDetailAddId();

	/**
	 * Sets the ncbj business detail add ID of this ncbj business detail add.
	 *
	 * @param ncbjBusinessDetailAddId the ncbj business detail add ID of this ncbj business detail add
	 */
	public void setNcbjBusinessDetailAddId(long ncbjBusinessDetailAddId);

	/**
	 * Returns the group ID of this ncbj business detail add.
	 *
	 * @return the group ID of this ncbj business detail add
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ncbj business detail add.
	 *
	 * @param groupId the group ID of this ncbj business detail add
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ncbj business detail add.
	 *
	 * @return the company ID of this ncbj business detail add
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ncbj business detail add.
	 *
	 * @param companyId the company ID of this ncbj business detail add
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ncbj business detail add.
	 *
	 * @return the user ID of this ncbj business detail add
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ncbj business detail add.
	 *
	 * @param userId the user ID of this ncbj business detail add
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ncbj business detail add.
	 *
	 * @return the user uuid of this ncbj business detail add
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ncbj business detail add.
	 *
	 * @param userUuid the user uuid of this ncbj business detail add
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ncbj business detail add.
	 *
	 * @return the user name of this ncbj business detail add
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ncbj business detail add.
	 *
	 * @param userName the user name of this ncbj business detail add
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ncbj business detail add.
	 *
	 * @return the create date of this ncbj business detail add
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ncbj business detail add.
	 *
	 * @param createDate the create date of this ncbj business detail add
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ncbj business detail add.
	 *
	 * @return the modified date of this ncbj business detail add
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ncbj business detail add.
	 *
	 * @param modifiedDate the modified date of this ncbj business detail add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the number and time of shift of this ncbj business detail add.
	 *
	 * @return the number and time of shift of this ncbj business detail add
	 */
	@AutoEscape
	public String getNumberAndTimeOfShift();

	/**
	 * Sets the number and time of shift of this ncbj business detail add.
	 *
	 * @param numberAndTimeOfShift the number and time of shift of this ncbj business detail add
	 */
	public void setNumberAndTimeOfShift(String numberAndTimeOfShift);

	/**
	 * Returns the type of product of this ncbj business detail add.
	 *
	 * @return the type of product of this ncbj business detail add
	 */
	@AutoEscape
	public String getTypeOfProduct();

	/**
	 * Sets the type of product of this ncbj business detail add.
	 *
	 * @param typeOfProduct the type of product of this ncbj business detail add
	 */
	public void setTypeOfProduct(String typeOfProduct);

	/**
	 * Returns the business address of this ncbj business detail add.
	 *
	 * @return the business address of this ncbj business detail add
	 */
	@AutoEscape
	public String getBusinessAddress();

	/**
	 * Sets the business address of this ncbj business detail add.
	 *
	 * @param businessAddress the business address of this ncbj business detail add
	 */
	public void setBusinessAddress(String businessAddress);

	/**
	 * Returns the head offices of this ncbj business detail add.
	 *
	 * @return the head offices of this ncbj business detail add
	 */
	@AutoEscape
	public String getHeadOffices();

	/**
	 * Sets the head offices of this ncbj business detail add.
	 *
	 * @param headOffices the head offices of this ncbj business detail add
	 */
	public void setHeadOffices(String headOffices);

	/**
	 * Returns the no of full time employees of this ncbj business detail add.
	 *
	 * @return the no of full time employees of this ncbj business detail add
	 */
	@AutoEscape
	public String getNoOfFullTimeEmployees();

	/**
	 * Sets the no of full time employees of this ncbj business detail add.
	 *
	 * @param noOfFullTimeEmployees the no of full time employees of this ncbj business detail add
	 */
	public void setNoOfFullTimeEmployees(String noOfFullTimeEmployees);

	/**
	 * Returns the no of part time employees of this ncbj business detail add.
	 *
	 * @return the no of part time employees of this ncbj business detail add
	 */
	@AutoEscape
	public String getNoOfPartTimeEmployees();

	/**
	 * Sets the no of part time employees of this ncbj business detail add.
	 *
	 * @param noOfPartTimeEmployees the no of part time employees of this ncbj business detail add
	 */
	public void setNoOfPartTimeEmployees(String noOfPartTimeEmployees);

	/**
	 * Returns the no of contractors of this ncbj business detail add.
	 *
	 * @return the no of contractors of this ncbj business detail add
	 */
	@AutoEscape
	public String getNoOfContractors();

	/**
	 * Sets the no of contractors of this ncbj business detail add.
	 *
	 * @param noOfContractors the no of contractors of this ncbj business detail add
	 */
	public void setNoOfContractors(String noOfContractors);

	/**
	 * Returns the no of contracted workers of this ncbj business detail add.
	 *
	 * @return the no of contracted workers of this ncbj business detail add
	 */
	@AutoEscape
	public String getNoOfContractedWorkers();

	/**
	 * Sets the no of contracted workers of this ncbj business detail add.
	 *
	 * @param noOfContractedWorkers the no of contracted workers of this ncbj business detail add
	 */
	public void setNoOfContractedWorkers(String noOfContractedWorkers);

	/**
	 * Returns the counter of this ncbj business detail add.
	 *
	 * @return the counter of this ncbj business detail add
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this ncbj business detail add.
	 *
	 * @param counter the counter of this ncbj business detail add
	 */
	public void setCounter(String counter);

	/**
	 * Returns the ncbj application ID of this ncbj business detail add.
	 *
	 * @return the ncbj application ID of this ncbj business detail add
	 */
	public long getNcbjApplicationId();

	/**
	 * Sets the ncbj application ID of this ncbj business detail add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj business detail add
	 */
	public void setNcbjApplicationId(long ncbjApplicationId);

	@Override
	public NcbjBusinessDetailAdd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
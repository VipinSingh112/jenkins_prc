/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ManuCompanyInfoAddress service. Represents a row in the &quot;nbp_manu_com_Info_Address&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.manufacturing.application.form.service.model.impl.ManuCompanyInfoAddressImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuCompanyInfoAddress
 * @generated
 */
@ProviderType
public interface ManuCompanyInfoAddressModel
	extends BaseModel<ManuCompanyInfoAddress>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a manu company info address model instance should use the {@link ManuCompanyInfoAddress} interface instead.
	 */

	/**
	 * Returns the primary key of this manu company info address.
	 *
	 * @return the primary key of this manu company info address
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this manu company info address.
	 *
	 * @param primaryKey the primary key of this manu company info address
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the manu company info address ID of this manu company info address.
	 *
	 * @return the manu company info address ID of this manu company info address
	 */
	public long getManuCompanyInfoAddressId();

	/**
	 * Sets the manu company info address ID of this manu company info address.
	 *
	 * @param manuCompanyInfoAddressId the manu company info address ID of this manu company info address
	 */
	public void setManuCompanyInfoAddressId(long manuCompanyInfoAddressId);

	/**
	 * Returns the group ID of this manu company info address.
	 *
	 * @return the group ID of this manu company info address
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this manu company info address.
	 *
	 * @param groupId the group ID of this manu company info address
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this manu company info address.
	 *
	 * @return the company ID of this manu company info address
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this manu company info address.
	 *
	 * @param companyId the company ID of this manu company info address
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this manu company info address.
	 *
	 * @return the user ID of this manu company info address
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this manu company info address.
	 *
	 * @param userId the user ID of this manu company info address
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this manu company info address.
	 *
	 * @return the user uuid of this manu company info address
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this manu company info address.
	 *
	 * @param userUuid the user uuid of this manu company info address
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this manu company info address.
	 *
	 * @return the user name of this manu company info address
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this manu company info address.
	 *
	 * @param userName the user name of this manu company info address
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this manu company info address.
	 *
	 * @return the create date of this manu company info address
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this manu company info address.
	 *
	 * @param createDate the create date of this manu company info address
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this manu company info address.
	 *
	 * @return the modified date of this manu company info address
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this manu company info address.
	 *
	 * @param modifiedDate the modified date of this manu company info address
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the factory address of this manu company info address.
	 *
	 * @return the factory address of this manu company info address
	 */
	@AutoEscape
	public String getFactoryAddress();

	/**
	 * Sets the factory address of this manu company info address.
	 *
	 * @param factoryAddress the factory address of this manu company info address
	 */
	public void setFactoryAddress(String factoryAddress);

	/**
	 * Returns the telephone number of this manu company info address.
	 *
	 * @return the telephone number of this manu company info address
	 */
	@AutoEscape
	public String getTelephoneNumber();

	/**
	 * Sets the telephone number of this manu company info address.
	 *
	 * @param telephoneNumber the telephone number of this manu company info address
	 */
	public void setTelephoneNumber(String telephoneNumber);

	/**
	 * Returns the email address of this manu company info address.
	 *
	 * @return the email address of this manu company info address
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this manu company info address.
	 *
	 * @param emailAddress the email address of this manu company info address
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the company website of this manu company info address.
	 *
	 * @return the company website of this manu company info address
	 */
	@AutoEscape
	public String getCompanyWebsite();

	/**
	 * Sets the company website of this manu company info address.
	 *
	 * @param companyWebsite the company website of this manu company info address
	 */
	public void setCompanyWebsite(String companyWebsite);

	/**
	 * Returns the parish of this manu company info address.
	 *
	 * @return the parish of this manu company info address
	 */
	@AutoEscape
	public String getParish();

	/**
	 * Sets the parish of this manu company info address.
	 *
	 * @param parish the parish of this manu company info address
	 */
	public void setParish(String parish);

	/**
	 * Returns the counter of this manu company info address.
	 *
	 * @return the counter of this manu company info address
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this manu company info address.
	 *
	 * @param counter the counter of this manu company info address
	 */
	public void setCounter(String counter);

	/**
	 * Returns the manufacturing application ID of this manu company info address.
	 *
	 * @return the manufacturing application ID of this manu company info address
	 */
	public long getManufacturingApplicationId();

	/**
	 * Sets the manufacturing application ID of this manu company info address.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu company info address
	 */
	public void setManufacturingApplicationId(long manufacturingApplicationId);

	/**
	 * Returns the manu company info ID of this manu company info address.
	 *
	 * @return the manu company info ID of this manu company info address
	 */
	public long getManuCompanyInfoId();

	/**
	 * Sets the manu company info ID of this manu company info address.
	 *
	 * @param manuCompanyInfoId the manu company info ID of this manu company info address
	 */
	public void setManuCompanyInfoId(long manuCompanyInfoId);

	@Override
	public ManuCompanyInfoAddress cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the RenewLicAbstractAndWater service. Represents a row in the &quot;nbp_wra_renew_abstract&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.wra.application.form.service.model.impl.RenewLicAbstractAndWaterImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see RenewLicAbstractAndWater
 * @generated
 */
@ProviderType
public interface RenewLicAbstractAndWaterModel
	extends BaseModel<RenewLicAbstractAndWater>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a renew lic abstract and water model instance should use the {@link RenewLicAbstractAndWater} interface instead.
	 */

	/**
	 * Returns the primary key of this renew lic abstract and water.
	 *
	 * @return the primary key of this renew lic abstract and water
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this renew lic abstract and water.
	 *
	 * @param primaryKey the primary key of this renew lic abstract and water
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the renew lic abstract and water ID of this renew lic abstract and water.
	 *
	 * @return the renew lic abstract and water ID of this renew lic abstract and water
	 */
	public long getRenewLicAbstractAndWaterId();

	/**
	 * Sets the renew lic abstract and water ID of this renew lic abstract and water.
	 *
	 * @param renewLicAbstractAndWaterId the renew lic abstract and water ID of this renew lic abstract and water
	 */
	public void setRenewLicAbstractAndWaterId(long renewLicAbstractAndWaterId);

	/**
	 * Returns the group ID of this renew lic abstract and water.
	 *
	 * @return the group ID of this renew lic abstract and water
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this renew lic abstract and water.
	 *
	 * @param groupId the group ID of this renew lic abstract and water
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this renew lic abstract and water.
	 *
	 * @return the company ID of this renew lic abstract and water
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this renew lic abstract and water.
	 *
	 * @param companyId the company ID of this renew lic abstract and water
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this renew lic abstract and water.
	 *
	 * @return the user ID of this renew lic abstract and water
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this renew lic abstract and water.
	 *
	 * @param userId the user ID of this renew lic abstract and water
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this renew lic abstract and water.
	 *
	 * @return the user uuid of this renew lic abstract and water
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this renew lic abstract and water.
	 *
	 * @param userUuid the user uuid of this renew lic abstract and water
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this renew lic abstract and water.
	 *
	 * @return the user name of this renew lic abstract and water
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this renew lic abstract and water.
	 *
	 * @param userName the user name of this renew lic abstract and water
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this renew lic abstract and water.
	 *
	 * @return the create date of this renew lic abstract and water
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this renew lic abstract and water.
	 *
	 * @param createDate the create date of this renew lic abstract and water
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this renew lic abstract and water.
	 *
	 * @return the modified date of this renew lic abstract and water
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this renew lic abstract and water.
	 *
	 * @param modifiedDate the modified date of this renew lic abstract and water
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the renew name of this renew lic abstract and water.
	 *
	 * @return the renew name of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewName();

	/**
	 * Sets the renew name of this renew lic abstract and water.
	 *
	 * @param renewName the renew name of this renew lic abstract and water
	 */
	public void setRenewName(String renewName);

	/**
	 * Returns the renew contact of this renew lic abstract and water.
	 *
	 * @return the renew contact of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewContact();

	/**
	 * Sets the renew contact of this renew lic abstract and water.
	 *
	 * @param renewContact the renew contact of this renew lic abstract and water
	 */
	public void setRenewContact(String renewContact);

	/**
	 * Returns the renew job title of this renew lic abstract and water.
	 *
	 * @return the renew job title of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewJobTitle();

	/**
	 * Sets the renew job title of this renew lic abstract and water.
	 *
	 * @param renewJobTitle the renew job title of this renew lic abstract and water
	 */
	public void setRenewJobTitle(String renewJobTitle);

	/**
	 * Returns the renew telephone num of this renew lic abstract and water.
	 *
	 * @return the renew telephone num of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewTelephoneNum();

	/**
	 * Sets the renew telephone num of this renew lic abstract and water.
	 *
	 * @param renewTelephoneNum the renew telephone num of this renew lic abstract and water
	 */
	public void setRenewTelephoneNum(String renewTelephoneNum);

	/**
	 * Returns the renew fax num of this renew lic abstract and water.
	 *
	 * @return the renew fax num of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewFaxNum();

	/**
	 * Sets the renew fax num of this renew lic abstract and water.
	 *
	 * @param renewFaxNum the renew fax num of this renew lic abstract and water
	 */
	public void setRenewFaxNum(String renewFaxNum);

	/**
	 * Returns the renew parish location of this renew lic abstract and water.
	 *
	 * @return the renew parish location of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewParishLocation();

	/**
	 * Sets the renew parish location of this renew lic abstract and water.
	 *
	 * @param renewParishLocation the renew parish location of this renew lic abstract and water
	 */
	public void setRenewParishLocation(String renewParishLocation);

	/**
	 * Returns the renew address of this renew lic abstract and water.
	 *
	 * @return the renew address of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewAddress();

	/**
	 * Sets the renew address of this renew lic abstract and water.
	 *
	 * @param renewAddress the renew address of this renew lic abstract and water
	 */
	public void setRenewAddress(String renewAddress);

	/**
	 * Returns the renew source name of this renew lic abstract and water.
	 *
	 * @return the renew source name of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewSourceName();

	/**
	 * Sets the renew source name of this renew lic abstract and water.
	 *
	 * @param renewSourceName the renew source name of this renew lic abstract and water
	 */
	public void setRenewSourceName(String renewSourceName);

	/**
	 * Returns the renew details parish add of this renew lic abstract and water.
	 *
	 * @return the renew details parish add of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewDetailsParishAdd();

	/**
	 * Sets the renew details parish add of this renew lic abstract and water.
	 *
	 * @param renewDetailsParishAdd the renew details parish add of this renew lic abstract and water
	 */
	public void setRenewDetailsParishAdd(String renewDetailsParishAdd);

	/**
	 * Returns the renew details location of this renew lic abstract and water.
	 *
	 * @return the renew details location of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewDetailsLocation();

	/**
	 * Sets the renew details location of this renew lic abstract and water.
	 *
	 * @param renewDetailsLocation the renew details location of this renew lic abstract and water
	 */
	public void setRenewDetailsLocation(String renewDetailsLocation);

	/**
	 * Returns the renew abstraction rate of this renew lic abstract and water.
	 *
	 * @return the renew abstraction rate of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewAbstractionRate();

	/**
	 * Sets the renew abstraction rate of this renew lic abstract and water.
	 *
	 * @param renewAbstractionRate the renew abstraction rate of this renew lic abstract and water
	 */
	public void setRenewAbstractionRate(String renewAbstractionRate);

	/**
	 * Returns the renew details use of this renew lic abstract and water.
	 *
	 * @return the renew details use of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewDetailsUse();

	/**
	 * Sets the renew details use of this renew lic abstract and water.
	 *
	 * @param renewDetailsUse the renew details use of this renew lic abstract and water
	 */
	public void setRenewDetailsUse(String renewDetailsUse);

	/**
	 * Returns the renew abstraction method of this renew lic abstract and water.
	 *
	 * @return the renew abstraction method of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewAbstractionMethod();

	/**
	 * Sets the renew abstraction method of this renew lic abstract and water.
	 *
	 * @param renewAbstractionMethod the renew abstraction method of this renew lic abstract and water
	 */
	public void setRenewAbstractionMethod(String renewAbstractionMethod);

	/**
	 * Returns the attached device of this renew lic abstract and water.
	 *
	 * @return the attached device of this renew lic abstract and water
	 */
	@AutoEscape
	public String getAttachedDevice();

	/**
	 * Sets the attached device of this renew lic abstract and water.
	 *
	 * @param attachedDevice the attached device of this renew lic abstract and water
	 */
	public void setAttachedDevice(String attachedDevice);

	/**
	 * Returns the renew state device of this renew lic abstract and water.
	 *
	 * @return the renew state device of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewStateDevice();

	/**
	 * Sets the renew state device of this renew lic abstract and water.
	 *
	 * @param renewStateDevice the renew state device of this renew lic abstract and water
	 */
	public void setRenewStateDevice(String renewStateDevice);

	/**
	 * Returns the abstraction data of this renew lic abstract and water.
	 *
	 * @return the abstraction data of this renew lic abstract and water
	 */
	@AutoEscape
	public String getAbstractionData();

	/**
	 * Sets the abstraction data of this renew lic abstract and water.
	 *
	 * @param abstractionData the abstraction data of this renew lic abstract and water
	 */
	public void setAbstractionData(String abstractionData);

	/**
	 * Returns the renew sign name of this renew lic abstract and water.
	 *
	 * @return the renew sign name of this renew lic abstract and water
	 */
	@AutoEscape
	public String getRenewSignName();

	/**
	 * Sets the renew sign name of this renew lic abstract and water.
	 *
	 * @param renewSignName the renew sign name of this renew lic abstract and water
	 */
	public void setRenewSignName(String renewSignName);

	/**
	 * Returns the renew date of this renew lic abstract and water.
	 *
	 * @return the renew date of this renew lic abstract and water
	 */
	public Date getRenewDate();

	/**
	 * Sets the renew date of this renew lic abstract and water.
	 *
	 * @param renewDate the renew date of this renew lic abstract and water
	 */
	public void setRenewDate(Date renewDate);

	/**
	 * Returns the wra application ID of this renew lic abstract and water.
	 *
	 * @return the wra application ID of this renew lic abstract and water
	 */
	public long getWraApplicationId();

	/**
	 * Sets the wra application ID of this renew lic abstract and water.
	 *
	 * @param wraApplicationId the wra application ID of this renew lic abstract and water
	 */
	public void setWraApplicationId(long wraApplicationId);

	@Override
	public RenewLicAbstractAndWater cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
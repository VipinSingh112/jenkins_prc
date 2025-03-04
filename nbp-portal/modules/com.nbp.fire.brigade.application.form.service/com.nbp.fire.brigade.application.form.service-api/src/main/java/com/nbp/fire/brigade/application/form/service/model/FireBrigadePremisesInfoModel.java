/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the FireBrigadePremisesInfo service. Represents a row in the &quot;nbp_fire_permises_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadePremisesInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadePremisesInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadePremisesInfo
 * @generated
 */
@ProviderType
public interface FireBrigadePremisesInfoModel
	extends BaseModel<FireBrigadePremisesInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fire brigade premises info model instance should use the {@link FireBrigadePremisesInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this fire brigade premises info.
	 *
	 * @return the primary key of this fire brigade premises info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fire brigade premises info.
	 *
	 * @param primaryKey the primary key of this fire brigade premises info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fire brigade premises info ID of this fire brigade premises info.
	 *
	 * @return the fire brigade premises info ID of this fire brigade premises info
	 */
	public long getFireBrigadePremisesInfoId();

	/**
	 * Sets the fire brigade premises info ID of this fire brigade premises info.
	 *
	 * @param fireBrigadePremisesInfoId the fire brigade premises info ID of this fire brigade premises info
	 */
	public void setFireBrigadePremisesInfoId(long fireBrigadePremisesInfoId);

	/**
	 * Returns the group ID of this fire brigade premises info.
	 *
	 * @return the group ID of this fire brigade premises info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this fire brigade premises info.
	 *
	 * @param groupId the group ID of this fire brigade premises info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this fire brigade premises info.
	 *
	 * @return the company ID of this fire brigade premises info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this fire brigade premises info.
	 *
	 * @param companyId the company ID of this fire brigade premises info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this fire brigade premises info.
	 *
	 * @return the user ID of this fire brigade premises info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this fire brigade premises info.
	 *
	 * @param userId the user ID of this fire brigade premises info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this fire brigade premises info.
	 *
	 * @return the user uuid of this fire brigade premises info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this fire brigade premises info.
	 *
	 * @param userUuid the user uuid of this fire brigade premises info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this fire brigade premises info.
	 *
	 * @return the user name of this fire brigade premises info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this fire brigade premises info.
	 *
	 * @param userName the user name of this fire brigade premises info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this fire brigade premises info.
	 *
	 * @return the create date of this fire brigade premises info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this fire brigade premises info.
	 *
	 * @param createDate the create date of this fire brigade premises info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this fire brigade premises info.
	 *
	 * @return the modified date of this fire brigade premises info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this fire brigade premises info.
	 *
	 * @param modifiedDate the modified date of this fire brigade premises info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the premises of this fire brigade premises info.
	 *
	 * @return the premises of this fire brigade premises info
	 */
	@AutoEscape
	public String getPremises();

	/**
	 * Sets the premises of this fire brigade premises info.
	 *
	 * @param premises the premises of this fire brigade premises info
	 */
	public void setPremises(String premises);

	/**
	 * Returns the premises certified of this fire brigade premises info.
	 *
	 * @return the premises certified of this fire brigade premises info
	 */
	@AutoEscape
	public String getPremisesCertified();

	/**
	 * Sets the premises certified of this fire brigade premises info.
	 *
	 * @param premisesCertified the premises certified of this fire brigade premises info
	 */
	public void setPremisesCertified(String premisesCertified);

	/**
	 * Returns the expiration date of this fire brigade premises info.
	 *
	 * @return the expiration date of this fire brigade premises info
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this fire brigade premises info.
	 *
	 * @param expirationDate the expiration date of this fire brigade premises info
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Returns the certificate number of this fire brigade premises info.
	 *
	 * @return the certificate number of this fire brigade premises info
	 */
	@AutoEscape
	public String getCertificateNumber();

	/**
	 * Sets the certificate number of this fire brigade premises info.
	 *
	 * @param certificateNumber the certificate number of this fire brigade premises info
	 */
	public void setCertificateNumber(String certificateNumber);

	/**
	 * Returns the name of this fire brigade premises info.
	 *
	 * @return the name of this fire brigade premises info
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this fire brigade premises info.
	 *
	 * @param name the name of this fire brigade premises info
	 */
	public void setName(String name);

	/**
	 * Returns the address of this fire brigade premises info.
	 *
	 * @return the address of this fire brigade premises info
	 */
	@AutoEscape
	public String getAddress();

	/**
	 * Sets the address of this fire brigade premises info.
	 *
	 * @param Address the address of this fire brigade premises info
	 */
	public void setAddress(String Address);

	/**
	 * Returns the fire brigade application ID of this fire brigade premises info.
	 *
	 * @return the fire brigade application ID of this fire brigade premises info
	 */
	public long getFireBrigadeApplicationId();

	/**
	 * Sets the fire brigade application ID of this fire brigade premises info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade premises info
	 */
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId);

	@Override
	public FireBrigadePremisesInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
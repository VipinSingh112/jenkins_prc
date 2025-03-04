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
 * The base model interface for the FireBrigadeCerPurposeInfo service. Represents a row in the &quot;nbp_fire_certi_purpose_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeCerPurposeInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeCerPurposeInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see FireBrigadeCerPurposeInfo
 * @generated
 */
@ProviderType
public interface FireBrigadeCerPurposeInfoModel
	extends BaseModel<FireBrigadeCerPurposeInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a fire brigade cer purpose info model instance should use the {@link FireBrigadeCerPurposeInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this fire brigade cer purpose info.
	 *
	 * @return the primary key of this fire brigade cer purpose info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this fire brigade cer purpose info.
	 *
	 * @param primaryKey the primary key of this fire brigade cer purpose info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the fire brigade cer purpose info ID of this fire brigade cer purpose info.
	 *
	 * @return the fire brigade cer purpose info ID of this fire brigade cer purpose info
	 */
	public long getFireBrigadeCerPurposeInfoId();

	/**
	 * Sets the fire brigade cer purpose info ID of this fire brigade cer purpose info.
	 *
	 * @param fireBrigadeCerPurposeInfoId the fire brigade cer purpose info ID of this fire brigade cer purpose info
	 */
	public void setFireBrigadeCerPurposeInfoId(
		long fireBrigadeCerPurposeInfoId);

	/**
	 * Returns the group ID of this fire brigade cer purpose info.
	 *
	 * @return the group ID of this fire brigade cer purpose info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this fire brigade cer purpose info.
	 *
	 * @param groupId the group ID of this fire brigade cer purpose info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this fire brigade cer purpose info.
	 *
	 * @return the company ID of this fire brigade cer purpose info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this fire brigade cer purpose info.
	 *
	 * @param companyId the company ID of this fire brigade cer purpose info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this fire brigade cer purpose info.
	 *
	 * @return the user ID of this fire brigade cer purpose info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this fire brigade cer purpose info.
	 *
	 * @param userId the user ID of this fire brigade cer purpose info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this fire brigade cer purpose info.
	 *
	 * @return the user uuid of this fire brigade cer purpose info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this fire brigade cer purpose info.
	 *
	 * @param userUuid the user uuid of this fire brigade cer purpose info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this fire brigade cer purpose info.
	 *
	 * @return the user name of this fire brigade cer purpose info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this fire brigade cer purpose info.
	 *
	 * @param userName the user name of this fire brigade cer purpose info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this fire brigade cer purpose info.
	 *
	 * @return the create date of this fire brigade cer purpose info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this fire brigade cer purpose info.
	 *
	 * @param createDate the create date of this fire brigade cer purpose info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this fire brigade cer purpose info.
	 *
	 * @return the modified date of this fire brigade cer purpose info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this fire brigade cer purpose info.
	 *
	 * @param modifiedDate the modified date of this fire brigade cer purpose info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the certificate purpose pre of this fire brigade cer purpose info.
	 *
	 * @return the certificate purpose pre of this fire brigade cer purpose info
	 */
	@AutoEscape
	public String getCertificatePurposePre();

	/**
	 * Sets the certificate purpose pre of this fire brigade cer purpose info.
	 *
	 * @param certificatePurposePre the certificate purpose pre of this fire brigade cer purpose info
	 */
	public void setCertificatePurposePre(String certificatePurposePre);

	/**
	 * Returns the other certificate purpose of this fire brigade cer purpose info.
	 *
	 * @return the other certificate purpose of this fire brigade cer purpose info
	 */
	@AutoEscape
	public String getOtherCertificatePurpose();

	/**
	 * Sets the other certificate purpose of this fire brigade cer purpose info.
	 *
	 * @param otherCertificatePurpose the other certificate purpose of this fire brigade cer purpose info
	 */
	public void setOtherCertificatePurpose(String otherCertificatePurpose);

	/**
	 * Returns the fire brigade application ID of this fire brigade cer purpose info.
	 *
	 * @return the fire brigade application ID of this fire brigade cer purpose info
	 */
	public long getFireBrigadeApplicationId();

	/**
	 * Sets the fire brigade application ID of this fire brigade cer purpose info.
	 *
	 * @param fireBrigadeApplicationId the fire brigade application ID of this fire brigade cer purpose info
	 */
	public void setFireBrigadeApplicationId(long fireBrigadeApplicationId);

	@Override
	public FireBrigadeCerPurposeInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
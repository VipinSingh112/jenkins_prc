/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the NcraVerifyWeighingDate service. Represents a row in the &quot;nbp_ncra_veri_weigh_date&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcraVerifyWeighingDate
 * @generated
 */
@ProviderType
public interface NcraVerifyWeighingDateModel
	extends BaseModel<NcraVerifyWeighingDate>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ncra verify weighing date model instance should use the {@link NcraVerifyWeighingDate} interface instead.
	 */

	/**
	 * Returns the primary key of this ncra verify weighing date.
	 *
	 * @return the primary key of this ncra verify weighing date
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ncra verify weighing date.
	 *
	 * @param primaryKey the primary key of this ncra verify weighing date
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ncra verify weighing date ID of this ncra verify weighing date.
	 *
	 * @return the ncra verify weighing date ID of this ncra verify weighing date
	 */
	public long getNcraVerifyWeighingDateId();

	/**
	 * Sets the ncra verify weighing date ID of this ncra verify weighing date.
	 *
	 * @param ncraVerifyWeighingDateId the ncra verify weighing date ID of this ncra verify weighing date
	 */
	public void setNcraVerifyWeighingDateId(long ncraVerifyWeighingDateId);

	/**
	 * Returns the group ID of this ncra verify weighing date.
	 *
	 * @return the group ID of this ncra verify weighing date
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ncra verify weighing date.
	 *
	 * @param groupId the group ID of this ncra verify weighing date
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ncra verify weighing date.
	 *
	 * @return the company ID of this ncra verify weighing date
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ncra verify weighing date.
	 *
	 * @param companyId the company ID of this ncra verify weighing date
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ncra verify weighing date.
	 *
	 * @return the user ID of this ncra verify weighing date
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ncra verify weighing date.
	 *
	 * @param userId the user ID of this ncra verify weighing date
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ncra verify weighing date.
	 *
	 * @return the user uuid of this ncra verify weighing date
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ncra verify weighing date.
	 *
	 * @param userUuid the user uuid of this ncra verify weighing date
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ncra verify weighing date.
	 *
	 * @return the user name of this ncra verify weighing date
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ncra verify weighing date.
	 *
	 * @param userName the user name of this ncra verify weighing date
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ncra verify weighing date.
	 *
	 * @return the create date of this ncra verify weighing date
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ncra verify weighing date.
	 *
	 * @param createDate the create date of this ncra verify weighing date
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ncra verify weighing date.
	 *
	 * @return the modified date of this ncra verify weighing date
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ncra verify weighing date.
	 *
	 * @param modifiedDate the modified date of this ncra verify weighing date
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the weighing date of this ncra verify weighing date.
	 *
	 * @return the weighing date of this ncra verify weighing date
	 */
	public Date getWeighingDate();

	/**
	 * Sets the weighing date of this ncra verify weighing date.
	 *
	 * @param weighingDate the weighing date of this ncra verify weighing date
	 */
	public void setWeighingDate(Date weighingDate);

	/**
	 * Returns the ncra application ID of this ncra verify weighing date.
	 *
	 * @return the ncra application ID of this ncra verify weighing date
	 */
	public long getNcraApplicationId();

	/**
	 * Sets the ncra application ID of this ncra verify weighing date.
	 *
	 * @param ncraApplicationId the ncra application ID of this ncra verify weighing date
	 */
	public void setNcraApplicationId(long ncraApplicationId);

	@Override
	public NcraVerifyWeighingDate cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
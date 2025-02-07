/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.manufacturing.application.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the ManuDeskVerification service. Represents a row in the &quot;nbp_manu_desk_verification&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.manufacturing.application.stages.services.model.impl.ManuDeskVerificationImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see ManuDeskVerification
 * @generated
 */
@ProviderType
public interface ManuDeskVerificationModel
	extends BaseModel<ManuDeskVerification>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a manu desk verification model instance should use the {@link ManuDeskVerification} interface instead.
	 */

	/**
	 * Returns the primary key of this manu desk verification.
	 *
	 * @return the primary key of this manu desk verification
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this manu desk verification.
	 *
	 * @param primaryKey the primary key of this manu desk verification
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the manu desk verification ID of this manu desk verification.
	 *
	 * @return the manu desk verification ID of this manu desk verification
	 */
	public long getManuDeskVerificationId();

	/**
	 * Sets the manu desk verification ID of this manu desk verification.
	 *
	 * @param manuDeskVerificationId the manu desk verification ID of this manu desk verification
	 */
	public void setManuDeskVerificationId(long manuDeskVerificationId);

	/**
	 * Returns the group ID of this manu desk verification.
	 *
	 * @return the group ID of this manu desk verification
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this manu desk verification.
	 *
	 * @param groupId the group ID of this manu desk verification
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this manu desk verification.
	 *
	 * @return the company ID of this manu desk verification
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this manu desk verification.
	 *
	 * @param companyId the company ID of this manu desk verification
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this manu desk verification.
	 *
	 * @return the user ID of this manu desk verification
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this manu desk verification.
	 *
	 * @param userId the user ID of this manu desk verification
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this manu desk verification.
	 *
	 * @return the user uuid of this manu desk verification
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this manu desk verification.
	 *
	 * @param userUuid the user uuid of this manu desk verification
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this manu desk verification.
	 *
	 * @return the user name of this manu desk verification
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this manu desk verification.
	 *
	 * @param userName the user name of this manu desk verification
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this manu desk verification.
	 *
	 * @return the create date of this manu desk verification
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this manu desk verification.
	 *
	 * @param createDate the create date of this manu desk verification
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this manu desk verification.
	 *
	 * @return the modified date of this manu desk verification
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this manu desk verification.
	 *
	 * @param modifiedDate the modified date of this manu desk verification
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the document name of this manu desk verification.
	 *
	 * @return the document name of this manu desk verification
	 */
	@AutoEscape
	public String getDocumentName();

	/**
	 * Sets the document name of this manu desk verification.
	 *
	 * @param documentName the document name of this manu desk verification
	 */
	public void setDocumentName(String documentName);

	/**
	 * Returns the status of this manu desk verification.
	 *
	 * @return the status of this manu desk verification
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this manu desk verification.
	 *
	 * @param status the status of this manu desk verification
	 */
	public void setStatus(String status);

	/**
	 * Returns the manufacturing application ID of this manu desk verification.
	 *
	 * @return the manufacturing application ID of this manu desk verification
	 */
	public long getManufacturingApplicationId();

	/**
	 * Sets the manufacturing application ID of this manu desk verification.
	 *
	 * @param manufacturingApplicationId the manufacturing application ID of this manu desk verification
	 */
	public void setManufacturingApplicationId(long manufacturingApplicationId);

	@Override
	public ManuDeskVerification cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
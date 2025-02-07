/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.mining.stage.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the MiningApplicationDeskVeri service. Represents a row in the &quot;nbp_mining_desk_verifi&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.mining.stage.service.model.impl.MiningApplicationDeskVeriImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see MiningApplicationDeskVeri
 * @generated
 */
@ProviderType
public interface MiningApplicationDeskVeriModel
	extends BaseModel<MiningApplicationDeskVeri>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a mining application desk veri model instance should use the {@link MiningApplicationDeskVeri} interface instead.
	 */

	/**
	 * Returns the primary key of this mining application desk veri.
	 *
	 * @return the primary key of this mining application desk veri
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this mining application desk veri.
	 *
	 * @param primaryKey the primary key of this mining application desk veri
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the mining desk veri ID of this mining application desk veri.
	 *
	 * @return the mining desk veri ID of this mining application desk veri
	 */
	public long getMiningDeskVeriId();

	/**
	 * Sets the mining desk veri ID of this mining application desk veri.
	 *
	 * @param miningDeskVeriId the mining desk veri ID of this mining application desk veri
	 */
	public void setMiningDeskVeriId(long miningDeskVeriId);

	/**
	 * Returns the group ID of this mining application desk veri.
	 *
	 * @return the group ID of this mining application desk veri
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this mining application desk veri.
	 *
	 * @param groupId the group ID of this mining application desk veri
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this mining application desk veri.
	 *
	 * @return the company ID of this mining application desk veri
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this mining application desk veri.
	 *
	 * @param companyId the company ID of this mining application desk veri
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this mining application desk veri.
	 *
	 * @return the user ID of this mining application desk veri
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this mining application desk veri.
	 *
	 * @param userId the user ID of this mining application desk veri
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this mining application desk veri.
	 *
	 * @return the user uuid of this mining application desk veri
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this mining application desk veri.
	 *
	 * @param userUuid the user uuid of this mining application desk veri
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this mining application desk veri.
	 *
	 * @return the user name of this mining application desk veri
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this mining application desk veri.
	 *
	 * @param userName the user name of this mining application desk veri
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this mining application desk veri.
	 *
	 * @return the create date of this mining application desk veri
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this mining application desk veri.
	 *
	 * @param createDate the create date of this mining application desk veri
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this mining application desk veri.
	 *
	 * @return the modified date of this mining application desk veri
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this mining application desk veri.
	 *
	 * @param modifiedDate the modified date of this mining application desk veri
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the mining application ID of this mining application desk veri.
	 *
	 * @return the mining application ID of this mining application desk veri
	 */
	public long getMiningApplicationId();

	/**
	 * Sets the mining application ID of this mining application desk veri.
	 *
	 * @param miningApplicationId the mining application ID of this mining application desk veri
	 */
	public void setMiningApplicationId(long miningApplicationId);

	/**
	 * Returns the document status of this mining application desk veri.
	 *
	 * @return the document status of this mining application desk veri
	 */
	@AutoEscape
	public String getDocumentStatus();

	/**
	 * Sets the document status of this mining application desk veri.
	 *
	 * @param documentStatus the document status of this mining application desk veri
	 */
	public void setDocumentStatus(String documentStatus);

	/**
	 * Returns the document name of this mining application desk veri.
	 *
	 * @return the document name of this mining application desk veri
	 */
	@AutoEscape
	public String getDocumentName();

	/**
	 * Sets the document name of this mining application desk veri.
	 *
	 * @param documentName the document name of this mining application desk veri
	 */
	public void setDocumentName(String documentName);

	@Override
	public MiningApplicationDeskVeri cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
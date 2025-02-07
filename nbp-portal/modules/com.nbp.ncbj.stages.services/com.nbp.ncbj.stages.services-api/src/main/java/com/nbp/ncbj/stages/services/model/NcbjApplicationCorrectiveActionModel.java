/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the NcbjApplicationCorrectiveAction service. Represents a row in the &quot;nbp_ncbj_corrective_act&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.ncbj.stages.services.model.impl.NcbjApplicationCorrectiveActionImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjApplicationCorrectiveAction
 * @generated
 */
@ProviderType
public interface NcbjApplicationCorrectiveActionModel
	extends BaseModel<NcbjApplicationCorrectiveAction>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ncbj application corrective action model instance should use the {@link NcbjApplicationCorrectiveAction} interface instead.
	 */

	/**
	 * Returns the primary key of this ncbj application corrective action.
	 *
	 * @return the primary key of this ncbj application corrective action
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ncbj application corrective action.
	 *
	 * @param primaryKey the primary key of this ncbj application corrective action
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ncbj app corr action ID of this ncbj application corrective action.
	 *
	 * @return the ncbj app corr action ID of this ncbj application corrective action
	 */
	public long getNcbjAppCorrActionId();

	/**
	 * Sets the ncbj app corr action ID of this ncbj application corrective action.
	 *
	 * @param ncbjAppCorrActionId the ncbj app corr action ID of this ncbj application corrective action
	 */
	public void setNcbjAppCorrActionId(long ncbjAppCorrActionId);

	/**
	 * Returns the group ID of this ncbj application corrective action.
	 *
	 * @return the group ID of this ncbj application corrective action
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ncbj application corrective action.
	 *
	 * @param groupId the group ID of this ncbj application corrective action
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ncbj application corrective action.
	 *
	 * @return the company ID of this ncbj application corrective action
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ncbj application corrective action.
	 *
	 * @param companyId the company ID of this ncbj application corrective action
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ncbj application corrective action.
	 *
	 * @return the user ID of this ncbj application corrective action
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ncbj application corrective action.
	 *
	 * @param userId the user ID of this ncbj application corrective action
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ncbj application corrective action.
	 *
	 * @return the user uuid of this ncbj application corrective action
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ncbj application corrective action.
	 *
	 * @param userUuid the user uuid of this ncbj application corrective action
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ncbj application corrective action.
	 *
	 * @return the user name of this ncbj application corrective action
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ncbj application corrective action.
	 *
	 * @param userName the user name of this ncbj application corrective action
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ncbj application corrective action.
	 *
	 * @return the create date of this ncbj application corrective action
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ncbj application corrective action.
	 *
	 * @param createDate the create date of this ncbj application corrective action
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ncbj application corrective action.
	 *
	 * @return the modified date of this ncbj application corrective action
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ncbj application corrective action.
	 *
	 * @param modifiedDate the modified date of this ncbj application corrective action
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this ncbj application corrective action.
	 *
	 * @return the case ID of this ncbj application corrective action
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this ncbj application corrective action.
	 *
	 * @param caseId the case ID of this ncbj application corrective action
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the pre approval letter ID of this ncbj application corrective action.
	 *
	 * @return the pre approval letter ID of this ncbj application corrective action
	 */
	public long getPreApprovalLetterId();

	/**
	 * Sets the pre approval letter ID of this ncbj application corrective action.
	 *
	 * @param preApprovalLetterId the pre approval letter ID of this ncbj application corrective action
	 */
	public void setPreApprovalLetterId(long preApprovalLetterId);

	@Override
	public NcbjApplicationCorrectiveAction cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
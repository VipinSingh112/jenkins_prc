/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SezDeveloperDetails service. Represents a row in the &quot;nbp_sez_dev_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezDeveloperDetails
 * @generated
 */
@ProviderType
public interface SezDeveloperDetailsModel
	extends BaseModel<SezDeveloperDetails>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez developer details model instance should use the {@link SezDeveloperDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this sez developer details.
	 *
	 * @return the primary key of this sez developer details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez developer details.
	 *
	 * @param primaryKey the primary key of this sez developer details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez developer details ID of this sez developer details.
	 *
	 * @return the sez developer details ID of this sez developer details
	 */
	public long getSezDeveloperDetailsId();

	/**
	 * Sets the sez developer details ID of this sez developer details.
	 *
	 * @param sezDeveloperDetailsId the sez developer details ID of this sez developer details
	 */
	public void setSezDeveloperDetailsId(long sezDeveloperDetailsId);

	/**
	 * Returns the group ID of this sez developer details.
	 *
	 * @return the group ID of this sez developer details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez developer details.
	 *
	 * @param groupId the group ID of this sez developer details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez developer details.
	 *
	 * @return the company ID of this sez developer details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez developer details.
	 *
	 * @param companyId the company ID of this sez developer details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez developer details.
	 *
	 * @return the user ID of this sez developer details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez developer details.
	 *
	 * @param userId the user ID of this sez developer details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez developer details.
	 *
	 * @return the user uuid of this sez developer details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez developer details.
	 *
	 * @param userUuid the user uuid of this sez developer details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez developer details.
	 *
	 * @return the user name of this sez developer details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez developer details.
	 *
	 * @param userName the user name of this sez developer details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez developer details.
	 *
	 * @return the create date of this sez developer details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez developer details.
	 *
	 * @param createDate the create date of this sez developer details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez developer details.
	 *
	 * @return the modified date of this sez developer details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez developer details.
	 *
	 * @param modifiedDate the modified date of this sez developer details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the developer name of this sez developer details.
	 *
	 * @return the developer name of this sez developer details
	 */
	@AutoEscape
	public String getDeveloperName();

	/**
	 * Sets the developer name of this sez developer details.
	 *
	 * @param developerName the developer name of this sez developer details
	 */
	public void setDeveloperName(String developerName);

	/**
	 * Returns the developer number of this sez developer details.
	 *
	 * @return the developer number of this sez developer details
	 */
	@AutoEscape
	public String getDeveloperNumber();

	/**
	 * Sets the developer number of this sez developer details.
	 *
	 * @param developerNumber the developer number of this sez developer details
	 */
	public void setDeveloperNumber(String developerNumber);

	/**
	 * Returns the developer control of this sez developer details.
	 *
	 * @return the developer control of this sez developer details
	 */
	@AutoEscape
	public String getDeveloperControl();

	/**
	 * Sets the developer control of this sez developer details.
	 *
	 * @param developerControl the developer control of this sez developer details
	 */
	public void setDeveloperControl(String developerControl);

	/**
	 * Returns the letter of approval date of this sez developer details.
	 *
	 * @return the letter of approval date of this sez developer details
	 */
	public Date getLetterOfApprovalDate();

	/**
	 * Sets the letter of approval date of this sez developer details.
	 *
	 * @param letterOfApprovalDate the letter of approval date of this sez developer details
	 */
	public void setLetterOfApprovalDate(Date letterOfApprovalDate);

	/**
	 * Returns the sez developer date of this sez developer details.
	 *
	 * @return the sez developer date of this sez developer details
	 */
	public Date getSezDeveloperDate();

	/**
	 * Sets the sez developer date of this sez developer details.
	 *
	 * @param sezDeveloperDate the sez developer date of this sez developer details
	 */
	public void setSezDeveloperDate(Date sezDeveloperDate);

	/**
	 * Returns the letter of approval entrty ID of this sez developer details.
	 *
	 * @return the letter of approval entrty ID of this sez developer details
	 */
	public long getLetterOfApprovalEntrtyId();

	/**
	 * Sets the letter of approval entrty ID of this sez developer details.
	 *
	 * @param letterOfApprovalEntrtyId the letter of approval entrty ID of this sez developer details
	 */
	public void setLetterOfApprovalEntrtyId(long letterOfApprovalEntrtyId);

	/**
	 * Returns the sez developer agreement entry ID of this sez developer details.
	 *
	 * @return the sez developer agreement entry ID of this sez developer details
	 */
	public long getSezDeveloperAgreementEntryId();

	/**
	 * Sets the sez developer agreement entry ID of this sez developer details.
	 *
	 * @param sezDeveloperAgreementEntryId the sez developer agreement entry ID of this sez developer details
	 */
	public void setSezDeveloperAgreementEntryId(
		long sezDeveloperAgreementEntryId);

	/**
	 * Returns the sez status application ID of this sez developer details.
	 *
	 * @return the sez status application ID of this sez developer details
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez developer details.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez developer details
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezDeveloperDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
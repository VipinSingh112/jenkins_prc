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
 * The base model interface for the SezOccupantUserUndertakingInfo service. Represents a row in the &quot;nbp_sez_occ_user_under_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantUserUndertakingInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantUserUndertakingInfo
 * @generated
 */
@ProviderType
public interface SezOccupantUserUndertakingInfoModel
	extends BaseModel<SezOccupantUserUndertakingInfo>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez occupant user undertaking info model instance should use the {@link SezOccupantUserUndertakingInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this sez occupant user undertaking info.
	 *
	 * @return the primary key of this sez occupant user undertaking info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez occupant user undertaking info.
	 *
	 * @param primaryKey the primary key of this sez occupant user undertaking info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez occ userunder ID of this sez occupant user undertaking info.
	 *
	 * @return the sez occ userunder ID of this sez occupant user undertaking info
	 */
	public long getSezOccUserunderId();

	/**
	 * Sets the sez occ userunder ID of this sez occupant user undertaking info.
	 *
	 * @param sezOccUserunderId the sez occ userunder ID of this sez occupant user undertaking info
	 */
	public void setSezOccUserunderId(long sezOccUserunderId);

	/**
	 * Returns the group ID of this sez occupant user undertaking info.
	 *
	 * @return the group ID of this sez occupant user undertaking info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez occupant user undertaking info.
	 *
	 * @param groupId the group ID of this sez occupant user undertaking info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez occupant user undertaking info.
	 *
	 * @return the company ID of this sez occupant user undertaking info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez occupant user undertaking info.
	 *
	 * @param companyId the company ID of this sez occupant user undertaking info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez occupant user undertaking info.
	 *
	 * @return the user ID of this sez occupant user undertaking info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez occupant user undertaking info.
	 *
	 * @param userId the user ID of this sez occupant user undertaking info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez occupant user undertaking info.
	 *
	 * @return the user uuid of this sez occupant user undertaking info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez occupant user undertaking info.
	 *
	 * @param userUuid the user uuid of this sez occupant user undertaking info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez occupant user undertaking info.
	 *
	 * @return the user name of this sez occupant user undertaking info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez occupant user undertaking info.
	 *
	 * @param userName the user name of this sez occupant user undertaking info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez occupant user undertaking info.
	 *
	 * @return the create date of this sez occupant user undertaking info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez occupant user undertaking info.
	 *
	 * @param createDate the create date of this sez occupant user undertaking info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez occupant user undertaking info.
	 *
	 * @return the modified date of this sez occupant user undertaking info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez occupant user undertaking info.
	 *
	 * @param modifiedDate the modified date of this sez occupant user undertaking info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the occ applicant title of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant title of this sez occupant user undertaking info
	 */
	@AutoEscape
	public String getOccApplicantTitle();

	/**
	 * Sets the occ applicant title of this sez occupant user undertaking info.
	 *
	 * @param occApplicantTitle the occ applicant title of this sez occupant user undertaking info
	 */
	public void setOccApplicantTitle(String occApplicantTitle);

	/**
	 * Returns the occ applicant name of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant name of this sez occupant user undertaking info
	 */
	@AutoEscape
	public String getOccApplicantName();

	/**
	 * Sets the occ applicant name of this sez occupant user undertaking info.
	 *
	 * @param occApplicantName the occ applicant name of this sez occupant user undertaking info
	 */
	public void setOccApplicantName(String occApplicantName);

	/**
	 * Returns the occ applicant tele num of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant tele num of this sez occupant user undertaking info
	 */
	@AutoEscape
	public String getOccApplicantTeleNum();

	/**
	 * Sets the occ applicant tele num of this sez occupant user undertaking info.
	 *
	 * @param occApplicantTeleNum the occ applicant tele num of this sez occupant user undertaking info
	 */
	public void setOccApplicantTeleNum(String occApplicantTeleNum);

	/**
	 * Returns the occ applicant email of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant email of this sez occupant user undertaking info
	 */
	@AutoEscape
	public String getOccApplicantEmail();

	/**
	 * Sets the occ applicant email of this sez occupant user undertaking info.
	 *
	 * @param occApplicantEmail the occ applicant email of this sez occupant user undertaking info
	 */
	public void setOccApplicantEmail(String occApplicantEmail);

	/**
	 * Returns the occ applicant sign date of this sez occupant user undertaking info.
	 *
	 * @return the occ applicant sign date of this sez occupant user undertaking info
	 */
	public Date getOccApplicantSignDate();

	/**
	 * Sets the occ applicant sign date of this sez occupant user undertaking info.
	 *
	 * @param occApplicantSignDate the occ applicant sign date of this sez occupant user undertaking info
	 */
	public void setOccApplicantSignDate(Date occApplicantSignDate);

	/**
	 * Returns the occ public notary name of this sez occupant user undertaking info.
	 *
	 * @return the occ public notary name of this sez occupant user undertaking info
	 */
	@AutoEscape
	public String getOccPublicNotaryName();

	/**
	 * Sets the occ public notary name of this sez occupant user undertaking info.
	 *
	 * @param occPublicNotaryName the occ public notary name of this sez occupant user undertaking info
	 */
	public void setOccPublicNotaryName(String occPublicNotaryName);

	/**
	 * Returns the occ public notary sign date of this sez occupant user undertaking info.
	 *
	 * @return the occ public notary sign date of this sez occupant user undertaking info
	 */
	public Date getOccPublicNotarySignDate();

	/**
	 * Sets the occ public notary sign date of this sez occupant user undertaking info.
	 *
	 * @param occPublicNotarySignDate the occ public notary sign date of this sez occupant user undertaking info
	 */
	public void setOccPublicNotarySignDate(Date occPublicNotarySignDate);

	/**
	 * Returns the sez status application ID of this sez occupant user undertaking info.
	 *
	 * @return the sez status application ID of this sez occupant user undertaking info
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez occupant user undertaking info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant user undertaking info
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezOccupantUserUndertakingInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
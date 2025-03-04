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
 * The base model interface for the SezOccupantPrincipleOfficer service. Represents a row in the &quot;nbp_sez_occ_prin_offic_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleOfficerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantPrincipleOfficerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantPrincipleOfficer
 * @generated
 */
@ProviderType
public interface SezOccupantPrincipleOfficerModel
	extends BaseModel<SezOccupantPrincipleOfficer>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez occupant principle officer model instance should use the {@link SezOccupantPrincipleOfficer} interface instead.
	 */

	/**
	 * Returns the primary key of this sez occupant principle officer.
	 *
	 * @return the primary key of this sez occupant principle officer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez occupant principle officer.
	 *
	 * @param primaryKey the primary key of this sez occupant principle officer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez occ princ off ID of this sez occupant principle officer.
	 *
	 * @return the sez occ princ off ID of this sez occupant principle officer
	 */
	public long getSezOccPrincOffId();

	/**
	 * Sets the sez occ princ off ID of this sez occupant principle officer.
	 *
	 * @param sezOccPrincOffId the sez occ princ off ID of this sez occupant principle officer
	 */
	public void setSezOccPrincOffId(long sezOccPrincOffId);

	/**
	 * Returns the group ID of this sez occupant principle officer.
	 *
	 * @return the group ID of this sez occupant principle officer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez occupant principle officer.
	 *
	 * @param groupId the group ID of this sez occupant principle officer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez occupant principle officer.
	 *
	 * @return the company ID of this sez occupant principle officer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez occupant principle officer.
	 *
	 * @param companyId the company ID of this sez occupant principle officer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez occupant principle officer.
	 *
	 * @return the user ID of this sez occupant principle officer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez occupant principle officer.
	 *
	 * @param userId the user ID of this sez occupant principle officer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez occupant principle officer.
	 *
	 * @return the user uuid of this sez occupant principle officer
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez occupant principle officer.
	 *
	 * @param userUuid the user uuid of this sez occupant principle officer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez occupant principle officer.
	 *
	 * @return the user name of this sez occupant principle officer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez occupant principle officer.
	 *
	 * @param userName the user name of this sez occupant principle officer
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez occupant principle officer.
	 *
	 * @return the create date of this sez occupant principle officer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez occupant principle officer.
	 *
	 * @param createDate the create date of this sez occupant principle officer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez occupant principle officer.
	 *
	 * @return the modified date of this sez occupant principle officer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez occupant principle officer.
	 *
	 * @param modifiedDate the modified date of this sez occupant principle officer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the name of this sez occupant principle officer.
	 *
	 * @return the name of this sez occupant principle officer
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this sez occupant principle officer.
	 *
	 * @param name the name of this sez occupant principle officer
	 */
	public void setName(String name);

	/**
	 * Returns the position of this sez occupant principle officer.
	 *
	 * @return the position of this sez occupant principle officer
	 */
	@AutoEscape
	public String getPosition();

	/**
	 * Sets the position of this sez occupant principle officer.
	 *
	 * @param position the position of this sez occupant principle officer
	 */
	public void setPosition(String position);

	/**
	 * Returns the principl officer counter of this sez occupant principle officer.
	 *
	 * @return the principl officer counter of this sez occupant principle officer
	 */
	@AutoEscape
	public String getPrinciplOfficerCounter();

	/**
	 * Sets the principl officer counter of this sez occupant principle officer.
	 *
	 * @param principlOfficerCounter the principl officer counter of this sez occupant principle officer
	 */
	public void setPrinciplOfficerCounter(String principlOfficerCounter);

	/**
	 * Returns the sez status application ID of this sez occupant principle officer.
	 *
	 * @return the sez status application ID of this sez occupant principle officer
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez occupant principle officer.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant principle officer
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezOccupantPrincipleOfficer cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
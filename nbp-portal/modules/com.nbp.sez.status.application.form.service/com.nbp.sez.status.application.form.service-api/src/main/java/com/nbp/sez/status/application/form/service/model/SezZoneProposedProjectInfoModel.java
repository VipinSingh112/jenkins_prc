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
 * The base model interface for the SezZoneProposedProjectInfo service. Represents a row in the &quot;nbp_sez_zone_pro_proj_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneProposedProjectInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezZoneProposedProjectInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezZoneProposedProjectInfo
 * @generated
 */
@ProviderType
public interface SezZoneProposedProjectInfoModel
	extends BaseModel<SezZoneProposedProjectInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez zone proposed project info model instance should use the {@link SezZoneProposedProjectInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this sez zone proposed project info.
	 *
	 * @return the primary key of this sez zone proposed project info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez zone proposed project info.
	 *
	 * @param primaryKey the primary key of this sez zone proposed project info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez zone proposed project info ID of this sez zone proposed project info.
	 *
	 * @return the sez zone proposed project info ID of this sez zone proposed project info
	 */
	public long getSezZoneProposedProjectInfoId();

	/**
	 * Sets the sez zone proposed project info ID of this sez zone proposed project info.
	 *
	 * @param sezZoneProposedProjectInfoId the sez zone proposed project info ID of this sez zone proposed project info
	 */
	public void setSezZoneProposedProjectInfoId(
		long sezZoneProposedProjectInfoId);

	/**
	 * Returns the group ID of this sez zone proposed project info.
	 *
	 * @return the group ID of this sez zone proposed project info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez zone proposed project info.
	 *
	 * @param groupId the group ID of this sez zone proposed project info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez zone proposed project info.
	 *
	 * @return the company ID of this sez zone proposed project info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez zone proposed project info.
	 *
	 * @param companyId the company ID of this sez zone proposed project info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez zone proposed project info.
	 *
	 * @return the user ID of this sez zone proposed project info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez zone proposed project info.
	 *
	 * @param userId the user ID of this sez zone proposed project info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez zone proposed project info.
	 *
	 * @return the user uuid of this sez zone proposed project info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez zone proposed project info.
	 *
	 * @param userUuid the user uuid of this sez zone proposed project info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez zone proposed project info.
	 *
	 * @return the user name of this sez zone proposed project info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez zone proposed project info.
	 *
	 * @param userName the user name of this sez zone proposed project info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez zone proposed project info.
	 *
	 * @return the create date of this sez zone proposed project info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez zone proposed project info.
	 *
	 * @param createDate the create date of this sez zone proposed project info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez zone proposed project info.
	 *
	 * @return the modified date of this sez zone proposed project info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez zone proposed project info.
	 *
	 * @param modifiedDate the modified date of this sez zone proposed project info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the entity denied approval of this sez zone proposed project info.
	 *
	 * @return the entity denied approval of this sez zone proposed project info
	 */
	@AutoEscape
	public String getEntityDeniedApproval();

	/**
	 * Sets the entity denied approval of this sez zone proposed project info.
	 *
	 * @param entityDeniedApproval the entity denied approval of this sez zone proposed project info
	 */
	public void setEntityDeniedApproval(String entityDeniedApproval);

	/**
	 * Returns the denied approval date of this sez zone proposed project info.
	 *
	 * @return the denied approval date of this sez zone proposed project info
	 */
	public Date getDeniedApprovalDate();

	/**
	 * Sets the denied approval date of this sez zone proposed project info.
	 *
	 * @param deniedApprovalDate the denied approval date of this sez zone proposed project info
	 */
	public void setDeniedApprovalDate(Date deniedApprovalDate);

	/**
	 * Returns the denied approval project type of this sez zone proposed project info.
	 *
	 * @return the denied approval project type of this sez zone proposed project info
	 */
	@AutoEscape
	public String getDeniedApprovalProjectType();

	/**
	 * Sets the denied approval project type of this sez zone proposed project info.
	 *
	 * @param deniedApprovalProjectType the denied approval project type of this sez zone proposed project info
	 */
	public void setDeniedApprovalProjectType(String deniedApprovalProjectType);

	/**
	 * Returns the free zone location of this sez zone proposed project info.
	 *
	 * @return the free zone location of this sez zone proposed project info
	 */
	@AutoEscape
	public String getFreeZoneLocation();

	/**
	 * Sets the free zone location of this sez zone proposed project info.
	 *
	 * @param freeZoneLocation the free zone location of this sez zone proposed project info
	 */
	public void setFreeZoneLocation(String freeZoneLocation);

	/**
	 * Returns the leased building num of this sez zone proposed project info.
	 *
	 * @return the leased building num of this sez zone proposed project info
	 */
	@AutoEscape
	public String getLeasedBuildingNum();

	/**
	 * Sets the leased building num of this sez zone proposed project info.
	 *
	 * @param leasedBuildingNum the leased building num of this sez zone proposed project info
	 */
	public void setLeasedBuildingNum(String leasedBuildingNum);

	/**
	 * Returns the leased town of this sez zone proposed project info.
	 *
	 * @return the leased town of this sez zone proposed project info
	 */
	@AutoEscape
	public String getLeasedTown();

	/**
	 * Sets the leased town of this sez zone proposed project info.
	 *
	 * @param leasedTown the leased town of this sez zone proposed project info
	 */
	public void setLeasedTown(String leasedTown);

	/**
	 * Returns the leased parish of this sez zone proposed project info.
	 *
	 * @return the leased parish of this sez zone proposed project info
	 */
	@AutoEscape
	public String getLeasedParish();

	/**
	 * Sets the leased parish of this sez zone proposed project info.
	 *
	 * @param leasedParish the leased parish of this sez zone proposed project info
	 */
	public void setLeasedParish(String leasedParish);

	/**
	 * Returns the lease years of this sez zone proposed project info.
	 *
	 * @return the lease years of this sez zone proposed project info
	 */
	@AutoEscape
	public String getLeaseYears();

	/**
	 * Sets the lease years of this sez zone proposed project info.
	 *
	 * @param leaseYears the lease years of this sez zone proposed project info
	 */
	public void setLeaseYears(String leaseYears);

	/**
	 * Returns the volume of this sez zone proposed project info.
	 *
	 * @return the volume of this sez zone proposed project info
	 */
	@AutoEscape
	public String getVolume();

	/**
	 * Sets the volume of this sez zone proposed project info.
	 *
	 * @param volume the volume of this sez zone proposed project info
	 */
	public void setVolume(String volume);

	/**
	 * Returns the folio of this sez zone proposed project info.
	 *
	 * @return the folio of this sez zone proposed project info
	 */
	@AutoEscape
	public String getFolio();

	/**
	 * Sets the folio of this sez zone proposed project info.
	 *
	 * @param folio the folio of this sez zone proposed project info
	 */
	public void setFolio(String folio);

	/**
	 * Returns the floor num of this sez zone proposed project info.
	 *
	 * @return the floor num of this sez zone proposed project info
	 */
	@AutoEscape
	public String getFloorNum();

	/**
	 * Sets the floor num of this sez zone proposed project info.
	 *
	 * @param floorNum the floor num of this sez zone proposed project info
	 */
	public void setFloorNum(String floorNum);

	/**
	 * Returns the sez status application ID of this sez zone proposed project info.
	 *
	 * @return the sez status application ID of this sez zone proposed project info
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez zone proposed project info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez zone proposed project info
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezZoneProposedProjectInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AccMediLabActivitiesDesc service. Represents a row in the &quot;nbp_janaac_acc_med_activity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabActivitiesDescModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AccMediLabActivitiesDescImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccMediLabActivitiesDesc
 * @generated
 */
@ProviderType
public interface AccMediLabActivitiesDescModel
	extends BaseModel<AccMediLabActivitiesDesc>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a acc medi lab activities desc model instance should use the {@link AccMediLabActivitiesDesc} interface instead.
	 */

	/**
	 * Returns the primary key of this acc medi lab activities desc.
	 *
	 * @return the primary key of this acc medi lab activities desc
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this acc medi lab activities desc.
	 *
	 * @param primaryKey the primary key of this acc medi lab activities desc
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this acc medi lab activities desc.
	 *
	 * @return the uuid of this acc medi lab activities desc
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this acc medi lab activities desc.
	 *
	 * @param uuid the uuid of this acc medi lab activities desc
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the acc medi lab activities desc ID of this acc medi lab activities desc.
	 *
	 * @return the acc medi lab activities desc ID of this acc medi lab activities desc
	 */
	public long getAccMediLabActivitiesDescId();

	/**
	 * Sets the acc medi lab activities desc ID of this acc medi lab activities desc.
	 *
	 * @param accMediLabActivitiesDescId the acc medi lab activities desc ID of this acc medi lab activities desc
	 */
	public void setAccMediLabActivitiesDescId(long accMediLabActivitiesDescId);

	/**
	 * Returns the group ID of this acc medi lab activities desc.
	 *
	 * @return the group ID of this acc medi lab activities desc
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this acc medi lab activities desc.
	 *
	 * @param groupId the group ID of this acc medi lab activities desc
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this acc medi lab activities desc.
	 *
	 * @return the company ID of this acc medi lab activities desc
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this acc medi lab activities desc.
	 *
	 * @param companyId the company ID of this acc medi lab activities desc
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this acc medi lab activities desc.
	 *
	 * @return the user ID of this acc medi lab activities desc
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this acc medi lab activities desc.
	 *
	 * @param userId the user ID of this acc medi lab activities desc
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this acc medi lab activities desc.
	 *
	 * @return the user uuid of this acc medi lab activities desc
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this acc medi lab activities desc.
	 *
	 * @param userUuid the user uuid of this acc medi lab activities desc
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this acc medi lab activities desc.
	 *
	 * @return the user name of this acc medi lab activities desc
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this acc medi lab activities desc.
	 *
	 * @param userName the user name of this acc medi lab activities desc
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this acc medi lab activities desc.
	 *
	 * @return the create date of this acc medi lab activities desc
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this acc medi lab activities desc.
	 *
	 * @param createDate the create date of this acc medi lab activities desc
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this acc medi lab activities desc.
	 *
	 * @return the modified date of this acc medi lab activities desc
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this acc medi lab activities desc.
	 *
	 * @param modifiedDate the modified date of this acc medi lab activities desc
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the activities description of this acc medi lab activities desc.
	 *
	 * @return the activities description of this acc medi lab activities desc
	 */
	@AutoEscape
	public String getActivitiesDescription();

	/**
	 * Sets the activities description of this acc medi lab activities desc.
	 *
	 * @param activitiesDescription the activities description of this acc medi lab activities desc
	 */
	public void setActivitiesDescription(String activitiesDescription);

	/**
	 * Returns the shift work of this acc medi lab activities desc.
	 *
	 * @return the shift work of this acc medi lab activities desc
	 */
	@AutoEscape
	public String getShiftWork();

	/**
	 * Sets the shift work of this acc medi lab activities desc.
	 *
	 * @param shiftWork the shift work of this acc medi lab activities desc
	 */
	public void setShiftWork(String shiftWork);

	/**
	 * Returns the specimen no of this acc medi lab activities desc.
	 *
	 * @return the specimen no of this acc medi lab activities desc
	 */
	@AutoEscape
	public String getSpecimenNo();

	/**
	 * Sets the specimen no of this acc medi lab activities desc.
	 *
	 * @param specimenNo the specimen no of this acc medi lab activities desc
	 */
	public void setSpecimenNo(String specimenNo);

	/**
	 * Returns the specimen location of this acc medi lab activities desc.
	 *
	 * @return the specimen location of this acc medi lab activities desc
	 */
	@AutoEscape
	public String getSpecimenLocation();

	/**
	 * Sets the specimen location of this acc medi lab activities desc.
	 *
	 * @param specimenLocation the specimen location of this acc medi lab activities desc
	 */
	public void setSpecimenLocation(String specimenLocation);

	/**
	 * Returns the requested poct of this acc medi lab activities desc.
	 *
	 * @return the requested poct of this acc medi lab activities desc
	 */
	@AutoEscape
	public String getRequestedPOCT();

	/**
	 * Sets the requested poct of this acc medi lab activities desc.
	 *
	 * @param requestedPOCT the requested poct of this acc medi lab activities desc
	 */
	public void setRequestedPOCT(String requestedPOCT);

	/**
	 * Returns the requested poct location of this acc medi lab activities desc.
	 *
	 * @return the requested poct location of this acc medi lab activities desc
	 */
	@AutoEscape
	public String getRequestedPOCTLocation();

	/**
	 * Sets the requested poct location of this acc medi lab activities desc.
	 *
	 * @param requestedPOCTLocation the requested poct location of this acc medi lab activities desc
	 */
	public void setRequestedPOCTLocation(String requestedPOCTLocation);

	/**
	 * Returns the janaac application ID of this acc medi lab activities desc.
	 *
	 * @return the janaac application ID of this acc medi lab activities desc
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this acc medi lab activities desc.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc medi lab activities desc
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	@Override
	public AccMediLabActivitiesDesc cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
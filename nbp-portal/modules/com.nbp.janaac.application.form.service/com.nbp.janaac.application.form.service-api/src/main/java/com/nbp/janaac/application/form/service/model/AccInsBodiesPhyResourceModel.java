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
 * The base model interface for the AccInsBodiesPhyResource service. Represents a row in the &quot;nbp_janaac_acc_ins_body_phys&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AccInsBodiesPhyResourceImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccInsBodiesPhyResource
 * @generated
 */
@ProviderType
public interface AccInsBodiesPhyResourceModel
	extends BaseModel<AccInsBodiesPhyResource>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a acc ins bodies phy resource model instance should use the {@link AccInsBodiesPhyResource} interface instead.
	 */

	/**
	 * Returns the primary key of this acc ins bodies phy resource.
	 *
	 * @return the primary key of this acc ins bodies phy resource
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this acc ins bodies phy resource.
	 *
	 * @param primaryKey the primary key of this acc ins bodies phy resource
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this acc ins bodies phy resource.
	 *
	 * @return the uuid of this acc ins bodies phy resource
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this acc ins bodies phy resource.
	 *
	 * @param uuid the uuid of this acc ins bodies phy resource
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the acc ins bodies phy resource ID of this acc ins bodies phy resource.
	 *
	 * @return the acc ins bodies phy resource ID of this acc ins bodies phy resource
	 */
	public long getAccInsBodiesPhyResourceId();

	/**
	 * Sets the acc ins bodies phy resource ID of this acc ins bodies phy resource.
	 *
	 * @param accInsBodiesPhyResourceId the acc ins bodies phy resource ID of this acc ins bodies phy resource
	 */
	public void setAccInsBodiesPhyResourceId(long accInsBodiesPhyResourceId);

	/**
	 * Returns the group ID of this acc ins bodies phy resource.
	 *
	 * @return the group ID of this acc ins bodies phy resource
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this acc ins bodies phy resource.
	 *
	 * @param groupId the group ID of this acc ins bodies phy resource
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this acc ins bodies phy resource.
	 *
	 * @return the company ID of this acc ins bodies phy resource
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this acc ins bodies phy resource.
	 *
	 * @param companyId the company ID of this acc ins bodies phy resource
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this acc ins bodies phy resource.
	 *
	 * @return the user ID of this acc ins bodies phy resource
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this acc ins bodies phy resource.
	 *
	 * @param userId the user ID of this acc ins bodies phy resource
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this acc ins bodies phy resource.
	 *
	 * @return the user uuid of this acc ins bodies phy resource
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this acc ins bodies phy resource.
	 *
	 * @param userUuid the user uuid of this acc ins bodies phy resource
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this acc ins bodies phy resource.
	 *
	 * @return the user name of this acc ins bodies phy resource
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this acc ins bodies phy resource.
	 *
	 * @param userName the user name of this acc ins bodies phy resource
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this acc ins bodies phy resource.
	 *
	 * @return the create date of this acc ins bodies phy resource
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this acc ins bodies phy resource.
	 *
	 * @param createDate the create date of this acc ins bodies phy resource
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this acc ins bodies phy resource.
	 *
	 * @return the modified date of this acc ins bodies phy resource
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this acc ins bodies phy resource.
	 *
	 * @param modifiedDate the modified date of this acc ins bodies phy resource
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the ins bodiesfacilities of this acc ins bodies phy resource.
	 *
	 * @return the ins bodiesfacilities of this acc ins bodies phy resource
	 */
	@AutoEscape
	public String getInsBodiesfacilities();

	/**
	 * Sets the ins bodiesfacilities of this acc ins bodies phy resource.
	 *
	 * @param insBodiesfacilities the ins bodiesfacilities of this acc ins bodies phy resource
	 */
	public void setInsBodiesfacilities(String insBodiesfacilities);

	/**
	 * Returns the ins safety features of this acc ins bodies phy resource.
	 *
	 * @return the ins safety features of this acc ins bodies phy resource
	 */
	@AutoEscape
	public String getInsSafetyFeatures();

	/**
	 * Sets the ins safety features of this acc ins bodies phy resource.
	 *
	 * @param insSafetyFeatures the ins safety features of this acc ins bodies phy resource
	 */
	public void setInsSafetyFeatures(String insSafetyFeatures);

	/**
	 * Returns the ins security arrangements of this acc ins bodies phy resource.
	 *
	 * @return the ins security arrangements of this acc ins bodies phy resource
	 */
	@AutoEscape
	public String getInsSecurityArrangements();

	/**
	 * Sets the ins security arrangements of this acc ins bodies phy resource.
	 *
	 * @param insSecurityArrangements the ins security arrangements of this acc ins bodies phy resource
	 */
	public void setInsSecurityArrangements(String insSecurityArrangements);

	/**
	 * Returns the janaac application ID of this acc ins bodies phy resource.
	 *
	 * @return the janaac application ID of this acc ins bodies phy resource
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this acc ins bodies phy resource.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc ins bodies phy resource
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	@Override
	public AccInsBodiesPhyResource cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
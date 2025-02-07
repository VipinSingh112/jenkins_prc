/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the NcbjSectionDetailAdd service. Represents a row in the &quot;nbp_ncbj_section_detail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.ncbj.application.form.service.model.impl.NcbjSectionDetailAddImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjSectionDetailAdd
 * @generated
 */
@ProviderType
public interface NcbjSectionDetailAddModel
	extends BaseModel<NcbjSectionDetailAdd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ncbj section detail add model instance should use the {@link NcbjSectionDetailAdd} interface instead.
	 */

	/**
	 * Returns the primary key of this ncbj section detail add.
	 *
	 * @return the primary key of this ncbj section detail add
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ncbj section detail add.
	 *
	 * @param primaryKey the primary key of this ncbj section detail add
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ncbj section detail add ID of this ncbj section detail add.
	 *
	 * @return the ncbj section detail add ID of this ncbj section detail add
	 */
	public long getNcbjSectionDetailAddId();

	/**
	 * Sets the ncbj section detail add ID of this ncbj section detail add.
	 *
	 * @param ncbjSectionDetailAddId the ncbj section detail add ID of this ncbj section detail add
	 */
	public void setNcbjSectionDetailAddId(long ncbjSectionDetailAddId);

	/**
	 * Returns the group ID of this ncbj section detail add.
	 *
	 * @return the group ID of this ncbj section detail add
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ncbj section detail add.
	 *
	 * @param groupId the group ID of this ncbj section detail add
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ncbj section detail add.
	 *
	 * @return the company ID of this ncbj section detail add
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ncbj section detail add.
	 *
	 * @param companyId the company ID of this ncbj section detail add
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ncbj section detail add.
	 *
	 * @return the user ID of this ncbj section detail add
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ncbj section detail add.
	 *
	 * @param userId the user ID of this ncbj section detail add
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ncbj section detail add.
	 *
	 * @return the user uuid of this ncbj section detail add
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ncbj section detail add.
	 *
	 * @param userUuid the user uuid of this ncbj section detail add
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ncbj section detail add.
	 *
	 * @return the user name of this ncbj section detail add
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ncbj section detail add.
	 *
	 * @param userName the user name of this ncbj section detail add
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ncbj section detail add.
	 *
	 * @return the create date of this ncbj section detail add
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ncbj section detail add.
	 *
	 * @param createDate the create date of this ncbj section detail add
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ncbj section detail add.
	 *
	 * @return the modified date of this ncbj section detail add
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ncbj section detail add.
	 *
	 * @param modifiedDate the modified date of this ncbj section detail add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the add details of this ncbj section detail add.
	 *
	 * @return the add details of this ncbj section detail add
	 */
	@AutoEscape
	public String getAddDetails();

	/**
	 * Sets the add details of this ncbj section detail add.
	 *
	 * @param addDetails the add details of this ncbj section detail add
	 */
	public void setAddDetails(String addDetails);

	/**
	 * Returns the add num haccp of this ncbj section detail add.
	 *
	 * @return the add num haccp of this ncbj section detail add
	 */
	@AutoEscape
	public String getAddNumHaccp();

	/**
	 * Sets the add num haccp of this ncbj section detail add.
	 *
	 * @param addNumHaccp the add num haccp of this ncbj section detail add
	 */
	public void setAddNumHaccp(String addNumHaccp);

	/**
	 * Returns the add type haccp of this ncbj section detail add.
	 *
	 * @return the add type haccp of this ncbj section detail add
	 */
	@AutoEscape
	public String getAddTypeHaccp();

	/**
	 * Sets the add type haccp of this ncbj section detail add.
	 *
	 * @param addTypeHaccp the add type haccp of this ncbj section detail add
	 */
	public void setAddTypeHaccp(String addTypeHaccp);

	/**
	 * Returns the add hazard of this ncbj section detail add.
	 *
	 * @return the add hazard of this ncbj section detail add
	 */
	@AutoEscape
	public String getAddHazard();

	/**
	 * Sets the add hazard of this ncbj section detail add.
	 *
	 * @param addHazard the add hazard of this ncbj section detail add
	 */
	public void setAddHazard(String addHazard);

	/**
	 * Returns the add consent lic of this ncbj section detail add.
	 *
	 * @return the add consent lic of this ncbj section detail add
	 */
	@AutoEscape
	public String getAddConsentLic();

	/**
	 * Sets the add consent lic of this ncbj section detail add.
	 *
	 * @param addConsentLic the add consent lic of this ncbj section detail add
	 */
	public void setAddConsentLic(String addConsentLic);

	/**
	 * Returns the counter of this ncbj section detail add.
	 *
	 * @return the counter of this ncbj section detail add
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this ncbj section detail add.
	 *
	 * @param counter the counter of this ncbj section detail add
	 */
	public void setCounter(String counter);

	/**
	 * Returns the ncbj application ID of this ncbj section detail add.
	 *
	 * @return the ncbj application ID of this ncbj section detail add
	 */
	public long getNcbjApplicationId();

	/**
	 * Sets the ncbj application ID of this ncbj section detail add.
	 *
	 * @param ncbjApplicationId the ncbj application ID of this ncbj section detail add
	 */
	public void setNcbjApplicationId(long ncbjApplicationId);

	@Override
	public NcbjSectionDetailAdd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
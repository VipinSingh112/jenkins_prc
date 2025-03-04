/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the CreativeDirectorListinAddBox service. Represents a row in the &quot;nbp_creative_director_box&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.creative.application.form.service.model.impl.CreativeDirectorListinAddBoxImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see CreativeDirectorListinAddBox
 * @generated
 */
@ProviderType
public interface CreativeDirectorListinAddBoxModel
	extends BaseModel<CreativeDirectorListinAddBox>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a creative director listin add box model instance should use the {@link CreativeDirectorListinAddBox} interface instead.
	 */

	/**
	 * Returns the primary key of this creative director listin add box.
	 *
	 * @return the primary key of this creative director listin add box
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this creative director listin add box.
	 *
	 * @param primaryKey the primary key of this creative director listin add box
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the creative director box ID of this creative director listin add box.
	 *
	 * @return the creative director box ID of this creative director listin add box
	 */
	public long getCreativeDirectorBoxId();

	/**
	 * Sets the creative director box ID of this creative director listin add box.
	 *
	 * @param creativeDirectorBoxId the creative director box ID of this creative director listin add box
	 */
	public void setCreativeDirectorBoxId(long creativeDirectorBoxId);

	/**
	 * Returns the group ID of this creative director listin add box.
	 *
	 * @return the group ID of this creative director listin add box
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this creative director listin add box.
	 *
	 * @param groupId the group ID of this creative director listin add box
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this creative director listin add box.
	 *
	 * @return the company ID of this creative director listin add box
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this creative director listin add box.
	 *
	 * @param companyId the company ID of this creative director listin add box
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this creative director listin add box.
	 *
	 * @return the user ID of this creative director listin add box
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this creative director listin add box.
	 *
	 * @param userId the user ID of this creative director listin add box
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this creative director listin add box.
	 *
	 * @return the user uuid of this creative director listin add box
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this creative director listin add box.
	 *
	 * @param userUuid the user uuid of this creative director listin add box
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this creative director listin add box.
	 *
	 * @return the user name of this creative director listin add box
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this creative director listin add box.
	 *
	 * @param userName the user name of this creative director listin add box
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this creative director listin add box.
	 *
	 * @return the create date of this creative director listin add box
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this creative director listin add box.
	 *
	 * @param createDate the create date of this creative director listin add box
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this creative director listin add box.
	 *
	 * @return the modified date of this creative director listin add box
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this creative director listin add box.
	 *
	 * @param modifiedDate the modified date of this creative director listin add box
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the full name of this creative director listin add box.
	 *
	 * @return the full name of this creative director listin add box
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this creative director listin add box.
	 *
	 * @param fullName the full name of this creative director listin add box
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the title of this creative director listin add box.
	 *
	 * @return the title of this creative director listin add box
	 */
	@AutoEscape
	public String getTitle();

	/**
	 * Sets the title of this creative director listin add box.
	 *
	 * @param title the title of this creative director listin add box
	 */
	public void setTitle(String title);

	/**
	 * Returns the trn of this creative director listin add box.
	 *
	 * @return the trn of this creative director listin add box
	 */
	@AutoEscape
	public String getTrn();

	/**
	 * Sets the trn of this creative director listin add box.
	 *
	 * @param trn the trn of this creative director listin add box
	 */
	public void setTrn(String trn);

	/**
	 * Returns the director countre of this creative director listin add box.
	 *
	 * @return the director countre of this creative director listin add box
	 */
	@AutoEscape
	public String getDirectorCountre();

	/**
	 * Sets the director countre of this creative director listin add box.
	 *
	 * @param directorCountre the director countre of this creative director listin add box
	 */
	public void setDirectorCountre(String directorCountre);

	/**
	 * Returns the creative application ID of this creative director listin add box.
	 *
	 * @return the creative application ID of this creative director listin add box
	 */
	public long getCreativeApplicationId();

	/**
	 * Sets the creative application ID of this creative director listin add box.
	 *
	 * @param CreativeApplicationId the creative application ID of this creative director listin add box
	 */
	public void setCreativeApplicationId(long CreativeApplicationId);

	@Override
	public CreativeDirectorListinAddBox cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
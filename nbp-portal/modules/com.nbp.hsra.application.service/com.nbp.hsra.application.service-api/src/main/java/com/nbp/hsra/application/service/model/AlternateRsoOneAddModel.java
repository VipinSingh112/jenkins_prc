/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AlternateRsoOneAdd service. Represents a row in the &quot;nbp_hsra_alter_rso_one_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.hsra.application.service.model.impl.AlternateRsoOneAddModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.hsra.application.service.model.impl.AlternateRsoOneAddImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoOneAdd
 * @generated
 */
@ProviderType
public interface AlternateRsoOneAddModel
	extends BaseModel<AlternateRsoOneAdd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a alternate rso one add model instance should use the {@link AlternateRsoOneAdd} interface instead.
	 */

	/**
	 * Returns the primary key of this alternate rso one add.
	 *
	 * @return the primary key of this alternate rso one add
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this alternate rso one add.
	 *
	 * @param primaryKey the primary key of this alternate rso one add
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the alternate rso one add ID of this alternate rso one add.
	 *
	 * @return the alternate rso one add ID of this alternate rso one add
	 */
	public long getAlternateRsoOneAddId();

	/**
	 * Sets the alternate rso one add ID of this alternate rso one add.
	 *
	 * @param alternateRsoOneAddId the alternate rso one add ID of this alternate rso one add
	 */
	public void setAlternateRsoOneAddId(long alternateRsoOneAddId);

	/**
	 * Returns the group ID of this alternate rso one add.
	 *
	 * @return the group ID of this alternate rso one add
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this alternate rso one add.
	 *
	 * @param groupId the group ID of this alternate rso one add
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this alternate rso one add.
	 *
	 * @return the company ID of this alternate rso one add
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this alternate rso one add.
	 *
	 * @param companyId the company ID of this alternate rso one add
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this alternate rso one add.
	 *
	 * @return the user ID of this alternate rso one add
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this alternate rso one add.
	 *
	 * @param userId the user ID of this alternate rso one add
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this alternate rso one add.
	 *
	 * @return the user uuid of this alternate rso one add
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this alternate rso one add.
	 *
	 * @param userUuid the user uuid of this alternate rso one add
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this alternate rso one add.
	 *
	 * @return the user name of this alternate rso one add
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this alternate rso one add.
	 *
	 * @param userName the user name of this alternate rso one add
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this alternate rso one add.
	 *
	 * @return the create date of this alternate rso one add
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this alternate rso one add.
	 *
	 * @param createDate the create date of this alternate rso one add
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this alternate rso one add.
	 *
	 * @return the modified date of this alternate rso one add
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this alternate rso one add.
	 *
	 * @param modifiedDate the modified date of this alternate rso one add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the alternate rso one name of this alternate rso one add.
	 *
	 * @return the alternate rso one name of this alternate rso one add
	 */
	@AutoEscape
	public String getAlternateRsoOneName();

	/**
	 * Sets the alternate rso one name of this alternate rso one add.
	 *
	 * @param alternateRsoOneName the alternate rso one name of this alternate rso one add
	 */
	public void setAlternateRsoOneName(String alternateRsoOneName);

	/**
	 * Returns the alternate rso one title of this alternate rso one add.
	 *
	 * @return the alternate rso one title of this alternate rso one add
	 */
	@AutoEscape
	public String getAlternateRsoOneTitle();

	/**
	 * Sets the alternate rso one title of this alternate rso one add.
	 *
	 * @param alternateRsoOneTitle the alternate rso one title of this alternate rso one add
	 */
	public void setAlternateRsoOneTitle(String alternateRsoOneTitle);

	/**
	 * Returns the alternate rso one telephone of this alternate rso one add.
	 *
	 * @return the alternate rso one telephone of this alternate rso one add
	 */
	@AutoEscape
	public String getAlternateRsoOneTelephone();

	/**
	 * Sets the alternate rso one telephone of this alternate rso one add.
	 *
	 * @param alternateRsoOneTelephone the alternate rso one telephone of this alternate rso one add
	 */
	public void setAlternateRsoOneTelephone(String alternateRsoOneTelephone);

	/**
	 * Returns the alternate rso one ext of this alternate rso one add.
	 *
	 * @return the alternate rso one ext of this alternate rso one add
	 */
	@AutoEscape
	public String getAlternateRsoOneExt();

	/**
	 * Sets the alternate rso one ext of this alternate rso one add.
	 *
	 * @param alternateRsoOneExt the alternate rso one ext of this alternate rso one add
	 */
	public void setAlternateRsoOneExt(String alternateRsoOneExt);

	/**
	 * Returns the alternate rso one fax of this alternate rso one add.
	 *
	 * @return the alternate rso one fax of this alternate rso one add
	 */
	@AutoEscape
	public String getAlternateRsoOneFax();

	/**
	 * Sets the alternate rso one fax of this alternate rso one add.
	 *
	 * @param alternateRsoOneFax the alternate rso one fax of this alternate rso one add
	 */
	public void setAlternateRsoOneFax(String alternateRsoOneFax);

	/**
	 * Returns the alternate rso one email add of this alternate rso one add.
	 *
	 * @return the alternate rso one email add of this alternate rso one add
	 */
	@AutoEscape
	public String getAlternateRsoOneEmailAdd();

	/**
	 * Sets the alternate rso one email add of this alternate rso one add.
	 *
	 * @param alternateRsoOneEmailAdd the alternate rso one email add of this alternate rso one add
	 */
	public void setAlternateRsoOneEmailAdd(String alternateRsoOneEmailAdd);

	/**
	 * Returns the counter of this alternate rso one add.
	 *
	 * @return the counter of this alternate rso one add
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this alternate rso one add.
	 *
	 * @param counter the counter of this alternate rso one add
	 */
	public void setCounter(String counter);

	/**
	 * Returns the hsra application ID of this alternate rso one add.
	 *
	 * @return the hsra application ID of this alternate rso one add
	 */
	public long getHsraApplicationId();

	/**
	 * Sets the hsra application ID of this alternate rso one add.
	 *
	 * @param hsraApplicationId the hsra application ID of this alternate rso one add
	 */
	public void setHsraApplicationId(long hsraApplicationId);

	@Override
	public AlternateRsoOneAdd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
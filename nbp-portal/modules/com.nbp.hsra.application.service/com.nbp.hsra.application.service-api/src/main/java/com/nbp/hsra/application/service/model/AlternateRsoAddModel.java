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
 * The base model interface for the AlternateRsoAdd service. Represents a row in the &quot;nbp_hsra_alternate_rso_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.hsra.application.service.model.impl.AlternateRsoAddModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.hsra.application.service.model.impl.AlternateRsoAddImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AlternateRsoAdd
 * @generated
 */
@ProviderType
public interface AlternateRsoAddModel
	extends BaseModel<AlternateRsoAdd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a alternate rso add model instance should use the {@link AlternateRsoAdd} interface instead.
	 */

	/**
	 * Returns the primary key of this alternate rso add.
	 *
	 * @return the primary key of this alternate rso add
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this alternate rso add.
	 *
	 * @param primaryKey the primary key of this alternate rso add
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the alternate rso add ID of this alternate rso add.
	 *
	 * @return the alternate rso add ID of this alternate rso add
	 */
	public long getAlternateRsoAddId();

	/**
	 * Sets the alternate rso add ID of this alternate rso add.
	 *
	 * @param alternateRsoAddId the alternate rso add ID of this alternate rso add
	 */
	public void setAlternateRsoAddId(long alternateRsoAddId);

	/**
	 * Returns the group ID of this alternate rso add.
	 *
	 * @return the group ID of this alternate rso add
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this alternate rso add.
	 *
	 * @param groupId the group ID of this alternate rso add
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this alternate rso add.
	 *
	 * @return the company ID of this alternate rso add
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this alternate rso add.
	 *
	 * @param companyId the company ID of this alternate rso add
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this alternate rso add.
	 *
	 * @return the user ID of this alternate rso add
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this alternate rso add.
	 *
	 * @param userId the user ID of this alternate rso add
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this alternate rso add.
	 *
	 * @return the user uuid of this alternate rso add
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this alternate rso add.
	 *
	 * @param userUuid the user uuid of this alternate rso add
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this alternate rso add.
	 *
	 * @return the user name of this alternate rso add
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this alternate rso add.
	 *
	 * @param userName the user name of this alternate rso add
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this alternate rso add.
	 *
	 * @return the create date of this alternate rso add
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this alternate rso add.
	 *
	 * @param createDate the create date of this alternate rso add
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this alternate rso add.
	 *
	 * @return the modified date of this alternate rso add
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this alternate rso add.
	 *
	 * @param modifiedDate the modified date of this alternate rso add
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the alternate rso name of this alternate rso add.
	 *
	 * @return the alternate rso name of this alternate rso add
	 */
	@AutoEscape
	public String getAlternateRsoName();

	/**
	 * Sets the alternate rso name of this alternate rso add.
	 *
	 * @param alternateRsoName the alternate rso name of this alternate rso add
	 */
	public void setAlternateRsoName(String alternateRsoName);

	/**
	 * Returns the alternate rso title of this alternate rso add.
	 *
	 * @return the alternate rso title of this alternate rso add
	 */
	@AutoEscape
	public String getAlternateRsoTitle();

	/**
	 * Sets the alternate rso title of this alternate rso add.
	 *
	 * @param alternateRsoTitle the alternate rso title of this alternate rso add
	 */
	public void setAlternateRsoTitle(String alternateRsoTitle);

	/**
	 * Returns the alternate rso telephone of this alternate rso add.
	 *
	 * @return the alternate rso telephone of this alternate rso add
	 */
	@AutoEscape
	public String getAlternateRsoTelephone();

	/**
	 * Sets the alternate rso telephone of this alternate rso add.
	 *
	 * @param alternateRsoTelephone the alternate rso telephone of this alternate rso add
	 */
	public void setAlternateRsoTelephone(String alternateRsoTelephone);

	/**
	 * Returns the alternate rso ext of this alternate rso add.
	 *
	 * @return the alternate rso ext of this alternate rso add
	 */
	@AutoEscape
	public String getAlternateRsoExt();

	/**
	 * Sets the alternate rso ext of this alternate rso add.
	 *
	 * @param alternateRsoExt the alternate rso ext of this alternate rso add
	 */
	public void setAlternateRsoExt(String alternateRsoExt);

	/**
	 * Returns the alternate rso fax of this alternate rso add.
	 *
	 * @return the alternate rso fax of this alternate rso add
	 */
	@AutoEscape
	public String getAlternateRsoFax();

	/**
	 * Sets the alternate rso fax of this alternate rso add.
	 *
	 * @param alternateRsoFax the alternate rso fax of this alternate rso add
	 */
	public void setAlternateRsoFax(String alternateRsoFax);

	/**
	 * Returns the alternate rso email add of this alternate rso add.
	 *
	 * @return the alternate rso email add of this alternate rso add
	 */
	@AutoEscape
	public String getAlternateRsoEmailAdd();

	/**
	 * Sets the alternate rso email add of this alternate rso add.
	 *
	 * @param alternateRsoEmailAdd the alternate rso email add of this alternate rso add
	 */
	public void setAlternateRsoEmailAdd(String alternateRsoEmailAdd);

	/**
	 * Returns the counter of this alternate rso add.
	 *
	 * @return the counter of this alternate rso add
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this alternate rso add.
	 *
	 * @param counter the counter of this alternate rso add
	 */
	public void setCounter(String counter);

	/**
	 * Returns the hsra application ID of this alternate rso add.
	 *
	 * @return the hsra application ID of this alternate rso add
	 */
	public long getHsraApplicationId();

	/**
	 * Sets the hsra application ID of this alternate rso add.
	 *
	 * @param hsraApplicationId the hsra application ID of this alternate rso add
	 */
	public void setHsraApplicationId(long hsraApplicationId);

	@Override
	public AlternateRsoAdd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
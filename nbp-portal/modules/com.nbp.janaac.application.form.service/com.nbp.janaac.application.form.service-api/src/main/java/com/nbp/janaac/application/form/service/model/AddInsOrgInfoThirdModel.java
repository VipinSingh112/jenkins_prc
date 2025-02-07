/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AddInsOrgInfoThird service. Represents a row in the &quot;nbp_janaac_add_ins_org_third&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddInsOrgInfoThirdImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddInsOrgInfoThird
 * @generated
 */
@ProviderType
public interface AddInsOrgInfoThirdModel
	extends BaseModel<AddInsOrgInfoThird>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add ins org info third model instance should use the {@link AddInsOrgInfoThird} interface instead.
	 */

	/**
	 * Returns the primary key of this add ins org info third.
	 *
	 * @return the primary key of this add ins org info third
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add ins org info third.
	 *
	 * @param primaryKey the primary key of this add ins org info third
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add ins org info third ID of this add ins org info third.
	 *
	 * @return the add ins org info third ID of this add ins org info third
	 */
	public long getAddInsOrgInfoThirdId();

	/**
	 * Sets the add ins org info third ID of this add ins org info third.
	 *
	 * @param AddInsOrgInfoThirdId the add ins org info third ID of this add ins org info third
	 */
	public void setAddInsOrgInfoThirdId(long AddInsOrgInfoThirdId);

	/**
	 * Returns the group ID of this add ins org info third.
	 *
	 * @return the group ID of this add ins org info third
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add ins org info third.
	 *
	 * @param groupId the group ID of this add ins org info third
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add ins org info third.
	 *
	 * @return the company ID of this add ins org info third
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add ins org info third.
	 *
	 * @param companyId the company ID of this add ins org info third
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add ins org info third.
	 *
	 * @return the user ID of this add ins org info third
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add ins org info third.
	 *
	 * @param userId the user ID of this add ins org info third
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add ins org info third.
	 *
	 * @return the user uuid of this add ins org info third
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add ins org info third.
	 *
	 * @param userUuid the user uuid of this add ins org info third
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add ins org info third.
	 *
	 * @return the user name of this add ins org info third
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add ins org info third.
	 *
	 * @param userName the user name of this add ins org info third
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add ins org info third.
	 *
	 * @return the create date of this add ins org info third
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add ins org info third.
	 *
	 * @param createDate the create date of this add ins org info third
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add ins org info third.
	 *
	 * @return the modified date of this add ins org info third
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add ins org info third.
	 *
	 * @param modifiedDate the modified date of this add ins org info third
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the inspection activity of this add ins org info third.
	 *
	 * @return the inspection activity of this add ins org info third
	 */
	@AutoEscape
	public String getInspectionActivity();

	/**
	 * Sets the inspection activity of this add ins org info third.
	 *
	 * @param inspectionActivity the inspection activity of this add ins org info third
	 */
	public void setInspectionActivity(String inspectionActivity);

	/**
	 * Returns the field of inspection of this add ins org info third.
	 *
	 * @return the field of inspection of this add ins org info third
	 */
	@AutoEscape
	public String getFieldOfInspection();

	/**
	 * Sets the field of inspection of this add ins org info third.
	 *
	 * @param fieldOfInspection the field of inspection of this add ins org info third
	 */
	public void setFieldOfInspection(String fieldOfInspection);

	/**
	 * Returns the type of inspection of this add ins org info third.
	 *
	 * @return the type of inspection of this add ins org info third
	 */
	@AutoEscape
	public String getTypeOfInspection();

	/**
	 * Sets the type of inspection of this add ins org info third.
	 *
	 * @param typeOfInspection the type of inspection of this add ins org info third
	 */
	public void setTypeOfInspection(String typeOfInspection);

	/**
	 * Returns the method of this add ins org info third.
	 *
	 * @return the method of this add ins org info third
	 */
	@AutoEscape
	public String getMethod();

	/**
	 * Sets the method of this add ins org info third.
	 *
	 * @param method the method of this add ins org info third
	 */
	public void setMethod(String method);

	/**
	 * Returns the eqipment of this add ins org info third.
	 *
	 * @return the eqipment of this add ins org info third
	 */
	@AutoEscape
	public String getEqipment();

	/**
	 * Sets the eqipment of this add ins org info third.
	 *
	 * @param eqipment the eqipment of this add ins org info third
	 */
	public void setEqipment(String eqipment);

	/**
	 * Returns the limits of capabilities of this add ins org info third.
	 *
	 * @return the limits of capabilities of this add ins org info third
	 */
	@AutoEscape
	public String getLimitsOfCapabilities();

	/**
	 * Sets the limits of capabilities of this add ins org info third.
	 *
	 * @param limitsOfCapabilities the limits of capabilities of this add ins org info third
	 */
	public void setLimitsOfCapabilities(String limitsOfCapabilities);

	/**
	 * Returns the janaac application ID of this add ins org info third.
	 *
	 * @return the janaac application ID of this add ins org info third
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add ins org info third.
	 *
	 * @param janaacApplicationId the janaac application ID of this add ins org info third
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add ins org info third.
	 *
	 * @return the counter of this add ins org info third
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add ins org info third.
	 *
	 * @param counter the counter of this add ins org info third
	 */
	public void setCounter(String counter);

	@Override
	public AddInsOrgInfoThird cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
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
 * The base model interface for the AddLabMedicalOrganSec service. Represents a row in the &quot;nbp_janaac_add_lab_med_or_sec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganSecModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AddLabMedicalOrganSecImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AddLabMedicalOrganSec
 * @generated
 */
@ProviderType
public interface AddLabMedicalOrganSecModel
	extends BaseModel<AddLabMedicalOrganSec>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a add lab medical organ sec model instance should use the {@link AddLabMedicalOrganSec} interface instead.
	 */

	/**
	 * Returns the primary key of this add lab medical organ sec.
	 *
	 * @return the primary key of this add lab medical organ sec
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this add lab medical organ sec.
	 *
	 * @param primaryKey the primary key of this add lab medical organ sec
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the add lab medical organ sec ID of this add lab medical organ sec.
	 *
	 * @return the add lab medical organ sec ID of this add lab medical organ sec
	 */
	public long getAddLabMedicalOrganSecId();

	/**
	 * Sets the add lab medical organ sec ID of this add lab medical organ sec.
	 *
	 * @param addLabMedicalOrganSecId the add lab medical organ sec ID of this add lab medical organ sec
	 */
	public void setAddLabMedicalOrganSecId(long addLabMedicalOrganSecId);

	/**
	 * Returns the group ID of this add lab medical organ sec.
	 *
	 * @return the group ID of this add lab medical organ sec
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this add lab medical organ sec.
	 *
	 * @param groupId the group ID of this add lab medical organ sec
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this add lab medical organ sec.
	 *
	 * @return the company ID of this add lab medical organ sec
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this add lab medical organ sec.
	 *
	 * @param companyId the company ID of this add lab medical organ sec
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this add lab medical organ sec.
	 *
	 * @return the user ID of this add lab medical organ sec
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this add lab medical organ sec.
	 *
	 * @param userId the user ID of this add lab medical organ sec
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this add lab medical organ sec.
	 *
	 * @return the user uuid of this add lab medical organ sec
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this add lab medical organ sec.
	 *
	 * @param userUuid the user uuid of this add lab medical organ sec
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this add lab medical organ sec.
	 *
	 * @return the user name of this add lab medical organ sec
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this add lab medical organ sec.
	 *
	 * @param userName the user name of this add lab medical organ sec
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this add lab medical organ sec.
	 *
	 * @return the create date of this add lab medical organ sec
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this add lab medical organ sec.
	 *
	 * @param createDate the create date of this add lab medical organ sec
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this add lab medical organ sec.
	 *
	 * @return the modified date of this add lab medical organ sec
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this add lab medical organ sec.
	 *
	 * @param modifiedDate the modified date of this add lab medical organ sec
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the product of this add lab medical organ sec.
	 *
	 * @return the product of this add lab medical organ sec
	 */
	@AutoEscape
	public String getProduct();

	/**
	 * Sets the product of this add lab medical organ sec.
	 *
	 * @param product the product of this add lab medical organ sec
	 */
	public void setProduct(String product);

	/**
	 * Returns the examination of this add lab medical organ sec.
	 *
	 * @return the examination of this add lab medical organ sec
	 */
	@AutoEscape
	public String getExamination();

	/**
	 * Sets the examination of this add lab medical organ sec.
	 *
	 * @param examination the examination of this add lab medical organ sec
	 */
	public void setExamination(String examination);

	/**
	 * Returns the methods of this add lab medical organ sec.
	 *
	 * @return the methods of this add lab medical organ sec
	 */
	@AutoEscape
	public String getMethods();

	/**
	 * Sets the methods of this add lab medical organ sec.
	 *
	 * @param methods the methods of this add lab medical organ sec
	 */
	public void setMethods(String methods);

	/**
	 * Returns the equipment of this add lab medical organ sec.
	 *
	 * @return the equipment of this add lab medical organ sec
	 */
	@AutoEscape
	public String getEquipment();

	/**
	 * Sets the equipment of this add lab medical organ sec.
	 *
	 * @param equipment the equipment of this add lab medical organ sec
	 */
	public void setEquipment(String equipment);

	/**
	 * Returns the reference range of this add lab medical organ sec.
	 *
	 * @return the reference range of this add lab medical organ sec
	 */
	@AutoEscape
	public String getReferenceRange();

	/**
	 * Sets the reference range of this add lab medical organ sec.
	 *
	 * @param referenceRange the reference range of this add lab medical organ sec
	 */
	public void setReferenceRange(String referenceRange);

	/**
	 * Returns the measurement uncertainty of this add lab medical organ sec.
	 *
	 * @return the measurement uncertainty of this add lab medical organ sec
	 */
	@AutoEscape
	public String getMeasurementUncertainty();

	/**
	 * Sets the measurement uncertainty of this add lab medical organ sec.
	 *
	 * @param measurementUncertainty the measurement uncertainty of this add lab medical organ sec
	 */
	public void setMeasurementUncertainty(String measurementUncertainty);

	/**
	 * Returns the janaac application ID of this add lab medical organ sec.
	 *
	 * @return the janaac application ID of this add lab medical organ sec
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this add lab medical organ sec.
	 *
	 * @param janaacApplicationId the janaac application ID of this add lab medical organ sec
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	/**
	 * Returns the counter of this add lab medical organ sec.
	 *
	 * @return the counter of this add lab medical organ sec
	 */
	@AutoEscape
	public String getCounter();

	/**
	 * Sets the counter of this add lab medical organ sec.
	 *
	 * @param counter the counter of this add lab medical organ sec
	 */
	public void setCounter(String counter);

	@Override
	public AddLabMedicalOrganSec cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
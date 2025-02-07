/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the OsiServicesTrusteeDeclerationAndSignatureinfo service. Represents a row in the &quot;nbp_osi_services_trus_in_decl&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeDeclerationAndSignatureinfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.services.application.form.service.model.impl.OsiServicesTrusteeDeclerationAndSignatureinfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OsiServicesTrusteeDeclerationAndSignatureinfo
 * @generated
 */
@ProviderType
public interface OsiServicesTrusteeDeclerationAndSignatureinfoModel
	extends BaseModel<OsiServicesTrusteeDeclerationAndSignatureinfo>,
			GroupedModel, ShardedModel, StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a osi services trustee decleration and signatureinfo model instance should use the {@link OsiServicesTrusteeDeclerationAndSignatureinfo} interface instead.
	 */

	/**
	 * Returns the primary key of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the primary key of this osi services trustee decleration and signatureinfo
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this osi services trustee decleration and signatureinfo.
	 *
	 * @param primaryKey the primary key of this osi services trustee decleration and signatureinfo
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the uuid of this osi services trustee decleration and signatureinfo
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @param uuid the uuid of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the osi decleration ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the osi decleration ID of this osi services trustee decleration and signatureinfo
	 */
	public long getOsiDeclerationId();

	/**
	 * Sets the osi decleration ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param osiDeclerationId the osi decleration ID of this osi services trustee decleration and signatureinfo
	 */
	public void setOsiDeclerationId(long osiDeclerationId);

	/**
	 * Returns the group ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the group ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param groupId the group ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the company ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param companyId the company ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the user ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param userId the user ID of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the user uuid of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this osi services trustee decleration and signatureinfo.
	 *
	 * @param userUuid the user uuid of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the user name of this osi services trustee decleration and signatureinfo
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this osi services trustee decleration and signatureinfo.
	 *
	 * @param userName the user name of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the create date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this osi services trustee decleration and signatureinfo.
	 *
	 * @param createDate the create date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the modified date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this osi services trustee decleration and signatureinfo.
	 *
	 * @param modifiedDate the modified date of this osi services trustee decleration and signatureinfo
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the indi undersigned applicant name of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the indi undersigned applicant name of this osi services trustee decleration and signatureinfo
	 */
	@AutoEscape
	public String getIndiUndersignedApplicantName();

	/**
	 * Sets the indi undersigned applicant name of this osi services trustee decleration and signatureinfo.
	 *
	 * @param indiUndersignedApplicantName the indi undersigned applicant name of this osi services trustee decleration and signatureinfo
	 */
	public void setIndiUndersignedApplicantName(
		String indiUndersignedApplicantName);

	/**
	 * Returns the indi undersigned dated of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the indi undersigned dated of this osi services trustee decleration and signatureinfo
	 */
	public Date getIndiUndersignedDated();

	/**
	 * Sets the indi undersigned dated of this osi services trustee decleration and signatureinfo.
	 *
	 * @param indiUndersignedDated the indi undersigned dated of this osi services trustee decleration and signatureinfo
	 */
	public void setIndiUndersignedDated(Date indiUndersignedDated);

	/**
	 * Returns the osi services application ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @return the osi services application ID of this osi services trustee decleration and signatureinfo
	 */
	public long getOsiServicesApplicationId();

	/**
	 * Sets the osi services application ID of this osi services trustee decleration and signatureinfo.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi services trustee decleration and signatureinfo
	 */
	public void setOsiServicesApplicationId(long osiServicesApplicationId);

	@Override
	public OsiServicesTrusteeDeclerationAndSignatureinfo
		cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
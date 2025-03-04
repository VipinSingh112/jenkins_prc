/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the OfficialUse service. Represents a row in the &quot;nbp_osi_official_use&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.application.form.services.model.impl.OfficialUseModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.application.form.services.model.impl.OfficialUseImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OfficialUse
 * @generated
 */
@ProviderType
public interface OfficialUseModel
	extends BaseModel<OfficialUse>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a official use model instance should use the {@link OfficialUse} interface instead.
	 */

	/**
	 * Returns the primary key of this official use.
	 *
	 * @return the primary key of this official use
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this official use.
	 *
	 * @param primaryKey the primary key of this official use
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the official use ID of this official use.
	 *
	 * @return the official use ID of this official use
	 */
	public long getOfficialUseId();

	/**
	 * Sets the official use ID of this official use.
	 *
	 * @param officialUseId the official use ID of this official use
	 */
	public void setOfficialUseId(long officialUseId);

	/**
	 * Returns the group ID of this official use.
	 *
	 * @return the group ID of this official use
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this official use.
	 *
	 * @param groupId the group ID of this official use
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this official use.
	 *
	 * @return the company ID of this official use
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this official use.
	 *
	 * @param companyId the company ID of this official use
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this official use.
	 *
	 * @return the user ID of this official use
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this official use.
	 *
	 * @param userId the user ID of this official use
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this official use.
	 *
	 * @return the user uuid of this official use
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this official use.
	 *
	 * @param userUuid the user uuid of this official use
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this official use.
	 *
	 * @return the user name of this official use
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this official use.
	 *
	 * @param userName the user name of this official use
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this official use.
	 *
	 * @return the create date of this official use
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this official use.
	 *
	 * @param createDate the create date of this official use
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this official use.
	 *
	 * @return the modified date of this official use
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this official use.
	 *
	 * @param modifiedDate the modified date of this official use
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the received by of this official use.
	 *
	 * @return the received by of this official use
	 */
	@AutoEscape
	public String getReceivedBy();

	/**
	 * Sets the received by of this official use.
	 *
	 * @param receivedBy the received by of this official use
	 */
	public void setReceivedBy(String receivedBy);

	/**
	 * Returns the received by date of this official use.
	 *
	 * @return the received by date of this official use
	 */
	public Date getReceivedByDate();

	/**
	 * Sets the received by date of this official use.
	 *
	 * @param receivedByDate the received by date of this official use
	 */
	public void setReceivedByDate(Date receivedByDate);

	/**
	 * Returns the verified by of this official use.
	 *
	 * @return the verified by of this official use
	 */
	@AutoEscape
	public String getVerifiedBy();

	/**
	 * Sets the verified by of this official use.
	 *
	 * @param verifiedBy the verified by of this official use
	 */
	public void setVerifiedBy(String verifiedBy);

	/**
	 * Returns the verified by date of this official use.
	 *
	 * @return the verified by date of this official use
	 */
	public Date getVerifiedByDate();

	/**
	 * Sets the verified by date of this official use.
	 *
	 * @param verifiedByDate the verified by date of this official use
	 */
	public void setVerifiedByDate(Date verifiedByDate);

	/**
	 * Returns the application accepted of this official use.
	 *
	 * @return the application accepted of this official use
	 */
	@AutoEscape
	public String getApplicationAccepted();

	/**
	 * Sets the application accepted of this official use.
	 *
	 * @param applicationAccepted the application accepted of this official use
	 */
	public void setApplicationAccepted(String applicationAccepted);

	/**
	 * Returns the date certificate issued of this official use.
	 *
	 * @return the date certificate issued of this official use
	 */
	public Date getDateCertificateIssued();

	/**
	 * Sets the date certificate issued of this official use.
	 *
	 * @param dateCertificateIssued the date certificate issued of this official use
	 */
	public void setDateCertificateIssued(Date dateCertificateIssued);

	/**
	 * Returns the certificate number of this official use.
	 *
	 * @return the certificate number of this official use
	 */
	@AutoEscape
	public String getCertificateNumber();

	/**
	 * Sets the certificate number of this official use.
	 *
	 * @param certificateNumber the certificate number of this official use
	 */
	public void setCertificateNumber(String certificateNumber);

	/**
	 * Returns the remarks notes of this official use.
	 *
	 * @return the remarks notes of this official use
	 */
	@AutoEscape
	public String getRemarksNotes();

	/**
	 * Sets the remarks notes of this official use.
	 *
	 * @param remarksNotes the remarks notes of this official use
	 */
	public void setRemarksNotes(String remarksNotes);

	/**
	 * Returns the osi application ID of this official use.
	 *
	 * @return the osi application ID of this official use
	 */
	public long getOsiApplicationId();

	/**
	 * Sets the osi application ID of this official use.
	 *
	 * @param osiApplicationId the osi application ID of this official use
	 */
	public void setOsiApplicationId(long osiApplicationId);

	@Override
	public OfficialUse cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
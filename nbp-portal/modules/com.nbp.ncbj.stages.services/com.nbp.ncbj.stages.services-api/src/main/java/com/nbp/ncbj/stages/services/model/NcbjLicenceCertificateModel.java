/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the NcbjLicenceCertificate service. Represents a row in the &quot;nbp_ncbj_licence_certificate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.ncbj.stages.services.model.impl.NcbjLicenceCertificateImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see NcbjLicenceCertificate
 * @generated
 */
@ProviderType
public interface NcbjLicenceCertificateModel
	extends BaseModel<NcbjLicenceCertificate>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a ncbj licence certificate model instance should use the {@link NcbjLicenceCertificate} interface instead.
	 */

	/**
	 * Returns the primary key of this ncbj licence certificate.
	 *
	 * @return the primary key of this ncbj licence certificate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this ncbj licence certificate.
	 *
	 * @param primaryKey the primary key of this ncbj licence certificate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the ncbj licence certificate ID of this ncbj licence certificate.
	 *
	 * @return the ncbj licence certificate ID of this ncbj licence certificate
	 */
	public long getNcbjLicenceCertificateId();

	/**
	 * Sets the ncbj licence certificate ID of this ncbj licence certificate.
	 *
	 * @param ncbjLicenceCertificateId the ncbj licence certificate ID of this ncbj licence certificate
	 */
	public void setNcbjLicenceCertificateId(long ncbjLicenceCertificateId);

	/**
	 * Returns the group ID of this ncbj licence certificate.
	 *
	 * @return the group ID of this ncbj licence certificate
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this ncbj licence certificate.
	 *
	 * @param groupId the group ID of this ncbj licence certificate
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this ncbj licence certificate.
	 *
	 * @return the company ID of this ncbj licence certificate
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this ncbj licence certificate.
	 *
	 * @param companyId the company ID of this ncbj licence certificate
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this ncbj licence certificate.
	 *
	 * @return the user ID of this ncbj licence certificate
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this ncbj licence certificate.
	 *
	 * @param userId the user ID of this ncbj licence certificate
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this ncbj licence certificate.
	 *
	 * @return the user uuid of this ncbj licence certificate
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this ncbj licence certificate.
	 *
	 * @param userUuid the user uuid of this ncbj licence certificate
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this ncbj licence certificate.
	 *
	 * @return the user name of this ncbj licence certificate
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this ncbj licence certificate.
	 *
	 * @param userName the user name of this ncbj licence certificate
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this ncbj licence certificate.
	 *
	 * @return the create date of this ncbj licence certificate
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this ncbj licence certificate.
	 *
	 * @param createDate the create date of this ncbj licence certificate
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this ncbj licence certificate.
	 *
	 * @return the modified date of this ncbj licence certificate
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this ncbj licence certificate.
	 *
	 * @param modifiedDate the modified date of this ncbj licence certificate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the case ID of this ncbj licence certificate.
	 *
	 * @return the case ID of this ncbj licence certificate
	 */
	@AutoEscape
	public String getCaseId();

	/**
	 * Sets the case ID of this ncbj licence certificate.
	 *
	 * @param caseId the case ID of this ncbj licence certificate
	 */
	public void setCaseId(String caseId);

	/**
	 * Returns the licence certificate of this ncbj licence certificate.
	 *
	 * @return the licence certificate of this ncbj licence certificate
	 */
	@AutoEscape
	public String getLicenceCertificate();

	/**
	 * Sets the licence certificate of this ncbj licence certificate.
	 *
	 * @param licenceCertificate the licence certificate of this ncbj licence certificate
	 */
	public void setLicenceCertificate(String licenceCertificate);

	/**
	 * Returns the name of applicant of this ncbj licence certificate.
	 *
	 * @return the name of applicant of this ncbj licence certificate
	 */
	@AutoEscape
	public String getNameOfApplicant();

	/**
	 * Sets the name of applicant of this ncbj licence certificate.
	 *
	 * @param NameOfApplicant the name of applicant of this ncbj licence certificate
	 */
	public void setNameOfApplicant(String NameOfApplicant);

	/**
	 * Returns the name of certification of this ncbj licence certificate.
	 *
	 * @return the name of certification of this ncbj licence certificate
	 */
	@AutoEscape
	public String getNameOfCertification();

	/**
	 * Sets the name of certification of this ncbj licence certificate.
	 *
	 * @param nameOfCertification the name of certification of this ncbj licence certificate
	 */
	public void setNameOfCertification(String nameOfCertification);

	/**
	 * Returns the scope of certification of this ncbj licence certificate.
	 *
	 * @return the scope of certification of this ncbj licence certificate
	 */
	@AutoEscape
	public String getScopeOfCertification();

	/**
	 * Sets the scope of certification of this ncbj licence certificate.
	 *
	 * @param scopeOfCertification the scope of certification of this ncbj licence certificate
	 */
	public void setScopeOfCertification(String scopeOfCertification);

	/**
	 * Returns the issue date of this ncbj licence certificate.
	 *
	 * @return the issue date of this ncbj licence certificate
	 */
	public Date getIssueDate();

	/**
	 * Sets the issue date of this ncbj licence certificate.
	 *
	 * @param issueDate the issue date of this ncbj licence certificate
	 */
	public void setIssueDate(Date issueDate);

	/**
	 * Returns the expiration date of this ncbj licence certificate.
	 *
	 * @return the expiration date of this ncbj licence certificate
	 */
	public Date getExpirationDate();

	/**
	 * Sets the expiration date of this ncbj licence certificate.
	 *
	 * @param expirationDate the expiration date of this ncbj licence certificate
	 */
	public void setExpirationDate(Date expirationDate);

	/**
	 * Returns the status of this ncbj licence certificate.
	 *
	 * @return the status of this ncbj licence certificate
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this ncbj licence certificate.
	 *
	 * @param status the status of this ncbj licence certificate
	 */
	public void setStatus(String status);

	/**
	 * Returns the doc file entry of this ncbj licence certificate.
	 *
	 * @return the doc file entry of this ncbj licence certificate
	 */
	public long getDocFileEntry();

	/**
	 * Sets the doc file entry of this ncbj licence certificate.
	 *
	 * @param docFileEntry the doc file entry of this ncbj licence certificate
	 */
	public void setDocFileEntry(long docFileEntry);

	@Override
	public NcbjLicenceCertificate cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
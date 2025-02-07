/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the JADSCCertificateOfVeracity service. Represents a row in the &quot;nbp_jadsc_certif_verasity&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.jadsc.application.form.service.model.impl.JADSCCertificateOfVeracityImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JADSCCertificateOfVeracity
 * @generated
 */
@ProviderType
public interface JADSCCertificateOfVeracityModel
	extends BaseModel<JADSCCertificateOfVeracity>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a jadsc certificate of veracity model instance should use the {@link JADSCCertificateOfVeracity} interface instead.
	 */

	/**
	 * Returns the primary key of this jadsc certificate of veracity.
	 *
	 * @return the primary key of this jadsc certificate of veracity
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this jadsc certificate of veracity.
	 *
	 * @param primaryKey the primary key of this jadsc certificate of veracity
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this jadsc certificate of veracity.
	 *
	 * @return the uuid of this jadsc certificate of veracity
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this jadsc certificate of veracity.
	 *
	 * @param uuid the uuid of this jadsc certificate of veracity
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the jadsc cov ID of this jadsc certificate of veracity.
	 *
	 * @return the jadsc cov ID of this jadsc certificate of veracity
	 */
	public long getJadscCOVId();

	/**
	 * Sets the jadsc cov ID of this jadsc certificate of veracity.
	 *
	 * @param jadscCOVId the jadsc cov ID of this jadsc certificate of veracity
	 */
	public void setJadscCOVId(long jadscCOVId);

	/**
	 * Returns the group ID of this jadsc certificate of veracity.
	 *
	 * @return the group ID of this jadsc certificate of veracity
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this jadsc certificate of veracity.
	 *
	 * @param groupId the group ID of this jadsc certificate of veracity
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this jadsc certificate of veracity.
	 *
	 * @return the company ID of this jadsc certificate of veracity
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this jadsc certificate of veracity.
	 *
	 * @param companyId the company ID of this jadsc certificate of veracity
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this jadsc certificate of veracity.
	 *
	 * @return the user ID of this jadsc certificate of veracity
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this jadsc certificate of veracity.
	 *
	 * @param userId the user ID of this jadsc certificate of veracity
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this jadsc certificate of veracity.
	 *
	 * @return the user uuid of this jadsc certificate of veracity
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this jadsc certificate of veracity.
	 *
	 * @param userUuid the user uuid of this jadsc certificate of veracity
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this jadsc certificate of veracity.
	 *
	 * @return the user name of this jadsc certificate of veracity
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this jadsc certificate of veracity.
	 *
	 * @param userName the user name of this jadsc certificate of veracity
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this jadsc certificate of veracity.
	 *
	 * @return the create date of this jadsc certificate of veracity
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this jadsc certificate of veracity.
	 *
	 * @param createDate the create date of this jadsc certificate of veracity
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this jadsc certificate of veracity.
	 *
	 * @return the modified date of this jadsc certificate of veracity
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this jadsc certificate of veracity.
	 *
	 * @param modifiedDate the modified date of this jadsc certificate of veracity
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the veracity com name of this jadsc certificate of veracity.
	 *
	 * @return the veracity com name of this jadsc certificate of veracity
	 */
	@AutoEscape
	public String getVeracityComName();

	/**
	 * Sets the veracity com name of this jadsc certificate of veracity.
	 *
	 * @param veracityComName the veracity com name of this jadsc certificate of veracity
	 */
	public void setVeracityComName(String veracityComName);

	/**
	 * Returns the veracity com position of this jadsc certificate of veracity.
	 *
	 * @return the veracity com position of this jadsc certificate of veracity
	 */
	@AutoEscape
	public String getVeracityComPosition();

	/**
	 * Sets the veracity com position of this jadsc certificate of veracity.
	 *
	 * @param veracityComPosition the veracity com position of this jadsc certificate of veracity
	 */
	public void setVeracityComPosition(String veracityComPosition);

	/**
	 * Returns the veracity com company of this jadsc certificate of veracity.
	 *
	 * @return the veracity com company of this jadsc certificate of veracity
	 */
	@AutoEscape
	public String getVeracityComCompany();

	/**
	 * Sets the veracity com company of this jadsc certificate of veracity.
	 *
	 * @param veracityComCompany the veracity com company of this jadsc certificate of veracity
	 */
	public void setVeracityComCompany(String veracityComCompany);

	/**
	 * Returns the veracity signed date of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed date of this jadsc certificate of veracity
	 */
	public Date getVeracitySignedDate();

	/**
	 * Sets the veracity signed date of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedDate the veracity signed date of this jadsc certificate of veracity
	 */
	public void setVeracitySignedDate(Date veracitySignedDate);

	/**
	 * Returns the veracity signed telephone of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed telephone of this jadsc certificate of veracity
	 */
	@AutoEscape
	public String getVeracitySignedTelephone();

	/**
	 * Sets the veracity signed telephone of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedTelephone the veracity signed telephone of this jadsc certificate of veracity
	 */
	public void setVeracitySignedTelephone(String veracitySignedTelephone);

	/**
	 * Returns the veracity signed fax of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed fax of this jadsc certificate of veracity
	 */
	@AutoEscape
	public String getVeracitySignedFax();

	/**
	 * Sets the veracity signed fax of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedFax the veracity signed fax of this jadsc certificate of veracity
	 */
	public void setVeracitySignedFax(String veracitySignedFax);

	/**
	 * Returns the veracity signed address of this jadsc certificate of veracity.
	 *
	 * @return the veracity signed address of this jadsc certificate of veracity
	 */
	@AutoEscape
	public String getVeracitySignedAddress();

	/**
	 * Sets the veracity signed address of this jadsc certificate of veracity.
	 *
	 * @param veracitySignedAddress the veracity signed address of this jadsc certificate of veracity
	 */
	public void setVeracitySignedAddress(String veracitySignedAddress);

	/**
	 * Returns the jadsc application ID of this jadsc certificate of veracity.
	 *
	 * @return the jadsc application ID of this jadsc certificate of veracity
	 */
	public long getJadscApplicationId();

	/**
	 * Sets the jadsc application ID of this jadsc certificate of veracity.
	 *
	 * @param jadscApplicationId the jadsc application ID of this jadsc certificate of veracity
	 */
	public void setJadscApplicationId(long jadscApplicationId);

	@Override
	public JADSCCertificateOfVeracity cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
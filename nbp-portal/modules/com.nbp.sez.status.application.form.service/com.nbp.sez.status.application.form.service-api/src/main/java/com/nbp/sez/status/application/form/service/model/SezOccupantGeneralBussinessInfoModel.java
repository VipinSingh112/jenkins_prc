/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the SezOccupantGeneralBussinessInfo service. Represents a row in the &quot;nbp_sez_occ_gen_bussiness&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.SezOccupantGeneralBussinessInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupantGeneralBussinessInfo
 * @generated
 */
@ProviderType
public interface SezOccupantGeneralBussinessInfoModel
	extends BaseModel<SezOccupantGeneralBussinessInfo>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez occupant general bussiness info model instance should use the {@link SezOccupantGeneralBussinessInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this sez occupant general bussiness info.
	 *
	 * @return the primary key of this sez occupant general bussiness info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez occupant general bussiness info.
	 *
	 * @param primaryKey the primary key of this sez occupant general bussiness info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez occ gen buss ID of this sez occupant general bussiness info.
	 *
	 * @return the sez occ gen buss ID of this sez occupant general bussiness info
	 */
	public long getSezOccGenBussId();

	/**
	 * Sets the sez occ gen buss ID of this sez occupant general bussiness info.
	 *
	 * @param sezOccGenBussId the sez occ gen buss ID of this sez occupant general bussiness info
	 */
	public void setSezOccGenBussId(long sezOccGenBussId);

	/**
	 * Returns the group ID of this sez occupant general bussiness info.
	 *
	 * @return the group ID of this sez occupant general bussiness info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez occupant general bussiness info.
	 *
	 * @param groupId the group ID of this sez occupant general bussiness info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez occupant general bussiness info.
	 *
	 * @return the company ID of this sez occupant general bussiness info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez occupant general bussiness info.
	 *
	 * @param companyId the company ID of this sez occupant general bussiness info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez occupant general bussiness info.
	 *
	 * @return the user ID of this sez occupant general bussiness info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez occupant general bussiness info.
	 *
	 * @param userId the user ID of this sez occupant general bussiness info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez occupant general bussiness info.
	 *
	 * @return the user uuid of this sez occupant general bussiness info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez occupant general bussiness info.
	 *
	 * @param userUuid the user uuid of this sez occupant general bussiness info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez occupant general bussiness info.
	 *
	 * @return the user name of this sez occupant general bussiness info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez occupant general bussiness info.
	 *
	 * @param userName the user name of this sez occupant general bussiness info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez occupant general bussiness info.
	 *
	 * @return the create date of this sez occupant general bussiness info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez occupant general bussiness info.
	 *
	 * @param createDate the create date of this sez occupant general bussiness info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez occupant general bussiness info.
	 *
	 * @return the modified date of this sez occupant general bussiness info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez occupant general bussiness info.
	 *
	 * @param modifiedDate the modified date of this sez occupant general bussiness info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the occ app date of this sez occupant general bussiness info.
	 *
	 * @return the occ app date of this sez occupant general bussiness info
	 */
	public Date getOccAppDate();

	/**
	 * Sets the occ app date of this sez occupant general bussiness info.
	 *
	 * @param occAppDate the occ app date of this sez occupant general bussiness info
	 */
	public void setOccAppDate(Date occAppDate);

	/**
	 * Returns the occ sez dev name of this sez occupant general bussiness info.
	 *
	 * @return the occ sez dev name of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccSezDevName();

	/**
	 * Sets the occ sez dev name of this sez occupant general bussiness info.
	 *
	 * @param occSezDevName the occ sez dev name of this sez occupant general bussiness info
	 */
	public void setOccSezDevName(String occSezDevName);

	/**
	 * Returns the occ sez dev control num of this sez occupant general bussiness info.
	 *
	 * @return the occ sez dev control num of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccSezDevControlNum();

	/**
	 * Sets the occ sez dev control num of this sez occupant general bussiness info.
	 *
	 * @param occSezDevControlNum the occ sez dev control num of this sez occupant general bussiness info
	 */
	public void setOccSezDevControlNum(String occSezDevControlNum);

	/**
	 * Returns the occ existing com of this sez occupant general bussiness info.
	 *
	 * @return the occ existing com of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccExistingCom();

	/**
	 * Sets the occ existing com of this sez occupant general bussiness info.
	 *
	 * @param occExistingCom the occ existing com of this sez occupant general bussiness info
	 */
	public void setOccExistingCom(String occExistingCom);

	/**
	 * Returns the occ form article of this sez occupant general bussiness info.
	 *
	 * @return the occ form article of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccFormArticle();

	/**
	 * Sets the occ form article of this sez occupant general bussiness info.
	 *
	 * @param occFormArticle the occ form article of this sez occupant general bussiness info
	 */
	public void setOccFormArticle(String occFormArticle);

	/**
	 * Returns the occ form article other of this sez occupant general bussiness info.
	 *
	 * @return the occ form article other of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccFormArticleOther();

	/**
	 * Sets the occ form article other of this sez occupant general bussiness info.
	 *
	 * @param occFormArticleOther the occ form article other of this sez occupant general bussiness info
	 */
	public void setOccFormArticleOther(String occFormArticleOther);

	/**
	 * Returns the occ trn of this sez occupant general bussiness info.
	 *
	 * @return the occ trn of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccTRN();

	/**
	 * Sets the occ trn of this sez occupant general bussiness info.
	 *
	 * @param occTRN the occ trn of this sez occupant general bussiness info
	 */
	public void setOccTRN(String occTRN);

	/**
	 * Returns the occ gct of this sez occupant general bussiness info.
	 *
	 * @return the occ gct of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccGCT();

	/**
	 * Sets the occ gct of this sez occupant general bussiness info.
	 *
	 * @param occGCT the occ gct of this sez occupant general bussiness info
	 */
	public void setOccGCT(String occGCT);

	/**
	 * Returns the occ tcc of this sez occupant general bussiness info.
	 *
	 * @return the occ tcc of this sez occupant general bussiness info
	 */
	@AutoEscape
	public String getOccTCC();

	/**
	 * Sets the occ tcc of this sez occupant general bussiness info.
	 *
	 * @param occTCC the occ tcc of this sez occupant general bussiness info
	 */
	public void setOccTCC(String occTCC);

	/**
	 * Returns the sez status application ID of this sez occupant general bussiness info.
	 *
	 * @return the sez status application ID of this sez occupant general bussiness info
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez occupant general bussiness info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupant general bussiness info
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public SezOccupantGeneralBussinessInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
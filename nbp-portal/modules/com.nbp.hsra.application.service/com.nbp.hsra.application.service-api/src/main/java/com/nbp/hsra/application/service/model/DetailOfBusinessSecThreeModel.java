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
 * The base model interface for the DetailOfBusinessSecThree service. Represents a row in the &quot;nbp_hsra_det_business&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see DetailOfBusinessSecThree
 * @generated
 */
@ProviderType
public interface DetailOfBusinessSecThreeModel
	extends BaseModel<DetailOfBusinessSecThree>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a detail of business sec three model instance should use the {@link DetailOfBusinessSecThree} interface instead.
	 */

	/**
	 * Returns the primary key of this detail of business sec three.
	 *
	 * @return the primary key of this detail of business sec three
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this detail of business sec three.
	 *
	 * @param primaryKey the primary key of this detail of business sec three
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the detail of business sec three ID of this detail of business sec three.
	 *
	 * @return the detail of business sec three ID of this detail of business sec three
	 */
	public long getDetailOfBusinessSecThreeId();

	/**
	 * Sets the detail of business sec three ID of this detail of business sec three.
	 *
	 * @param detailOfBusinessSecThreeId the detail of business sec three ID of this detail of business sec three
	 */
	public void setDetailOfBusinessSecThreeId(long detailOfBusinessSecThreeId);

	/**
	 * Returns the group ID of this detail of business sec three.
	 *
	 * @return the group ID of this detail of business sec three
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this detail of business sec three.
	 *
	 * @param groupId the group ID of this detail of business sec three
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this detail of business sec three.
	 *
	 * @return the company ID of this detail of business sec three
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this detail of business sec three.
	 *
	 * @param companyId the company ID of this detail of business sec three
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this detail of business sec three.
	 *
	 * @return the user ID of this detail of business sec three
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this detail of business sec three.
	 *
	 * @param userId the user ID of this detail of business sec three
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this detail of business sec three.
	 *
	 * @return the user uuid of this detail of business sec three
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this detail of business sec three.
	 *
	 * @param userUuid the user uuid of this detail of business sec three
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this detail of business sec three.
	 *
	 * @return the user name of this detail of business sec three
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this detail of business sec three.
	 *
	 * @param userName the user name of this detail of business sec three
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this detail of business sec three.
	 *
	 * @return the create date of this detail of business sec three
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this detail of business sec three.
	 *
	 * @param createDate the create date of this detail of business sec three
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this detail of business sec three.
	 *
	 * @return the modified date of this detail of business sec three
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this detail of business sec three.
	 *
	 * @param modifiedDate the modified date of this detail of business sec three
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the business type of this detail of business sec three.
	 *
	 * @return the business type of this detail of business sec three
	 */
	@AutoEscape
	public String getBusinessType();

	/**
	 * Sets the business type of this detail of business sec three.
	 *
	 * @param businessType the business type of this detail of business sec three
	 */
	public void setBusinessType(String businessType);

	/**
	 * Returns the nuclear business number of this detail of business sec three.
	 *
	 * @return the nuclear business number of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearBusinessNumber();

	/**
	 * Sets the nuclear business number of this detail of business sec three.
	 *
	 * @param nuclearBusinessNumber the nuclear business number of this detail of business sec three
	 */
	public void setNuclearBusinessNumber(String nuclearBusinessNumber);

	/**
	 * Returns the nuclear corporation num of this detail of business sec three.
	 *
	 * @return the nuclear corporation num of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearCorporationNum();

	/**
	 * Sets the nuclear corporation num of this detail of business sec three.
	 *
	 * @param nuclearCorporationNum the nuclear corporation num of this detail of business sec three
	 */
	public void setNuclearCorporationNum(String nuclearCorporationNum);

	/**
	 * Returns the nuclear public act of this detail of business sec three.
	 *
	 * @return the nuclear public act of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearPublicAct();

	/**
	 * Sets the nuclear public act of this detail of business sec three.
	 *
	 * @param nuclearPublicAct the nuclear public act of this detail of business sec three
	 */
	public void setNuclearPublicAct(String nuclearPublicAct);

	/**
	 * Returns the nuclear name of this detail of business sec three.
	 *
	 * @return the nuclear name of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearName();

	/**
	 * Sets the nuclear name of this detail of business sec three.
	 *
	 * @param nuclearName the nuclear name of this detail of business sec three
	 */
	public void setNuclearName(String nuclearName);

	/**
	 * Returns the nuclear address third of this detail of business sec three.
	 *
	 * @return the nuclear address third of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearAddressThird();

	/**
	 * Sets the nuclear address third of this detail of business sec three.
	 *
	 * @param nuclearAddressThird the nuclear address third of this detail of business sec three
	 */
	public void setNuclearAddressThird(String nuclearAddressThird);

	/**
	 * Returns the nuclear third parish of this detail of business sec three.
	 *
	 * @return the nuclear third parish of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearThirdParish();

	/**
	 * Sets the nuclear third parish of this detail of business sec three.
	 *
	 * @param nuclearThirdParish the nuclear third parish of this detail of business sec three
	 */
	public void setNuclearThirdParish(String nuclearThirdParish);

	/**
	 * Returns the nuclear telephone num of this detail of business sec three.
	 *
	 * @return the nuclear telephone num of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearTelephoneNum();

	/**
	 * Sets the nuclear telephone num of this detail of business sec three.
	 *
	 * @param nuclearTelephoneNum the nuclear telephone num of this detail of business sec three
	 */
	public void setNuclearTelephoneNum(String nuclearTelephoneNum);

	/**
	 * Returns the nuclearfax number of this detail of business sec three.
	 *
	 * @return the nuclearfax number of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearfaxNumber();

	/**
	 * Sets the nuclearfax number of this detail of business sec three.
	 *
	 * @param nuclearfaxNumber the nuclearfax number of this detail of business sec three
	 */
	public void setNuclearfaxNumber(String nuclearfaxNumber);

	/**
	 * Returns the nuclear email add of this detail of business sec three.
	 *
	 * @return the nuclear email add of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearEmailAdd();

	/**
	 * Sets the nuclear email add of this detail of business sec three.
	 *
	 * @param nuclearEmailAdd the nuclear email add of this detail of business sec three
	 */
	public void setNuclearEmailAdd(String nuclearEmailAdd);

	/**
	 * Returns the nuclear financial of this detail of business sec three.
	 *
	 * @return the nuclear financial of this detail of business sec three
	 */
	@AutoEscape
	public String getNuclearFinancial();

	/**
	 * Sets the nuclear financial of this detail of business sec three.
	 *
	 * @param nuclearFinancial the nuclear financial of this detail of business sec three
	 */
	public void setNuclearFinancial(String nuclearFinancial);

	/**
	 * Returns the hsra application ID of this detail of business sec three.
	 *
	 * @return the hsra application ID of this detail of business sec three
	 */
	public long getHsraApplicationId();

	/**
	 * Sets the hsra application ID of this detail of business sec three.
	 *
	 * @param hsraApplicationId the hsra application ID of this detail of business sec three
	 */
	public void setHsraApplicationId(long hsraApplicationId);

	@Override
	public DetailOfBusinessSecThree cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
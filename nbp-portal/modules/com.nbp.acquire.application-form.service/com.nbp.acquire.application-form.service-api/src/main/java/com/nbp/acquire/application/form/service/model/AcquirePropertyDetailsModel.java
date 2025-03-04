/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AcquirePropertyDetails service. Represents a row in the &quot;nbp_acquire_prop_details&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AcquirePropertyDetails
 * @generated
 */
@ProviderType
public interface AcquirePropertyDetailsModel
	extends BaseModel<AcquirePropertyDetails>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a acquire property details model instance should use the {@link AcquirePropertyDetails} interface instead.
	 */

	/**
	 * Returns the primary key of this acquire property details.
	 *
	 * @return the primary key of this acquire property details
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this acquire property details.
	 *
	 * @param primaryKey the primary key of this acquire property details
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the acquire property details ID of this acquire property details.
	 *
	 * @return the acquire property details ID of this acquire property details
	 */
	public long getAcquirePropertyDetailsId();

	/**
	 * Sets the acquire property details ID of this acquire property details.
	 *
	 * @param acquirePropertyDetailsId the acquire property details ID of this acquire property details
	 */
	public void setAcquirePropertyDetailsId(long acquirePropertyDetailsId);

	/**
	 * Returns the group ID of this acquire property details.
	 *
	 * @return the group ID of this acquire property details
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this acquire property details.
	 *
	 * @param groupId the group ID of this acquire property details
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this acquire property details.
	 *
	 * @return the company ID of this acquire property details
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this acquire property details.
	 *
	 * @param companyId the company ID of this acquire property details
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this acquire property details.
	 *
	 * @return the user ID of this acquire property details
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this acquire property details.
	 *
	 * @param userId the user ID of this acquire property details
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this acquire property details.
	 *
	 * @return the user uuid of this acquire property details
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this acquire property details.
	 *
	 * @param userUuid the user uuid of this acquire property details
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this acquire property details.
	 *
	 * @return the user name of this acquire property details
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this acquire property details.
	 *
	 * @param userName the user name of this acquire property details
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this acquire property details.
	 *
	 * @return the create date of this acquire property details
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this acquire property details.
	 *
	 * @param createDate the create date of this acquire property details
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this acquire property details.
	 *
	 * @return the modified date of this acquire property details
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this acquire property details.
	 *
	 * @param modifiedDate the modified date of this acquire property details
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the property tenure type of this acquire property details.
	 *
	 * @return the property tenure type of this acquire property details
	 */
	@AutoEscape
	public String getPropertyTenureType();

	/**
	 * Sets the property tenure type of this acquire property details.
	 *
	 * @param propertyTenureType the property tenure type of this acquire property details
	 */
	public void setPropertyTenureType(String propertyTenureType);

	/**
	 * Returns the property identified of this acquire property details.
	 *
	 * @return the property identified of this acquire property details
	 */
	@AutoEscape
	public String getPropertyIdentified();

	/**
	 * Sets the property identified of this acquire property details.
	 *
	 * @param propertyIdentified the property identified of this acquire property details
	 */
	public void setPropertyIdentified(String propertyIdentified);

	/**
	 * Returns the property addr of this acquire property details.
	 *
	 * @return the property addr of this acquire property details
	 */
	@AutoEscape
	public String getPropertyAddr();

	/**
	 * Sets the property addr of this acquire property details.
	 *
	 * @param propertyAddr the property addr of this acquire property details
	 */
	public void setPropertyAddr(String propertyAddr);

	/**
	 * Returns the property desired loc of this acquire property details.
	 *
	 * @return the property desired loc of this acquire property details
	 */
	@AutoEscape
	public String getPropertyDesiredLoc();

	/**
	 * Sets the property desired loc of this acquire property details.
	 *
	 * @param propertyDesiredLoc the property desired loc of this acquire property details
	 */
	public void setPropertyDesiredLoc(String propertyDesiredLoc);

	/**
	 * Returns the property volume of this acquire property details.
	 *
	 * @return the property volume of this acquire property details
	 */
	@AutoEscape
	public String getPropertyVolume();

	/**
	 * Sets the property volume of this acquire property details.
	 *
	 * @param propertyVolume the property volume of this acquire property details
	 */
	public void setPropertyVolume(String propertyVolume);

	/**
	 * Returns the property folio of this acquire property details.
	 *
	 * @return the property folio of this acquire property details
	 */
	@AutoEscape
	public String getPropertyFolio();

	/**
	 * Sets the property folio of this acquire property details.
	 *
	 * @param propertyFolio the property folio of this acquire property details
	 */
	public void setPropertyFolio(String propertyFolio);

	/**
	 * Returns the property valuation num of this acquire property details.
	 *
	 * @return the property valuation num of this acquire property details
	 */
	@AutoEscape
	public String getPropertyValuationNum();

	/**
	 * Sets the property valuation num of this acquire property details.
	 *
	 * @param propertyValuationNum the property valuation num of this acquire property details
	 */
	public void setPropertyValuationNum(String propertyValuationNum);

	/**
	 * Returns the property sketch attached of this acquire property details.
	 *
	 * @return the property sketch attached of this acquire property details
	 */
	@AutoEscape
	public String getPropertySketchAttached();

	/**
	 * Sets the property sketch attached of this acquire property details.
	 *
	 * @param propertySketchAttached the property sketch attached of this acquire property details
	 */
	public void setPropertySketchAttached(String propertySketchAttached);

	/**
	 * Returns the property current use of this acquire property details.
	 *
	 * @return the property current use of this acquire property details
	 */
	@AutoEscape
	public String getPropertyCurrentUse();

	/**
	 * Sets the property current use of this acquire property details.
	 *
	 * @param propertyCurrentUse the property current use of this acquire property details
	 */
	public void setPropertyCurrentUse(String propertyCurrentUse);

	/**
	 * Returns the property current use other of this acquire property details.
	 *
	 * @return the property current use other of this acquire property details
	 */
	@AutoEscape
	public String getPropertyCurrentUseOther();

	/**
	 * Sets the property current use other of this acquire property details.
	 *
	 * @param propertyCurrentUseOther the property current use other of this acquire property details
	 */
	public void setPropertyCurrentUseOther(String propertyCurrentUseOther);

	/**
	 * Returns the property existing building of this acquire property details.
	 *
	 * @return the property existing building of this acquire property details
	 */
	@AutoEscape
	public String getPropertyExistingBuilding();

	/**
	 * Sets the property existing building of this acquire property details.
	 *
	 * @param propertyExistingBuilding the property existing building of this acquire property details
	 */
	public void setPropertyExistingBuilding(String propertyExistingBuilding);

	/**
	 * Returns the property existing building other of this acquire property details.
	 *
	 * @return the property existing building other of this acquire property details
	 */
	@AutoEscape
	public String getPropertyExistingBuildingOther();

	/**
	 * Sets the property existing building other of this acquire property details.
	 *
	 * @param propertyExistingBuildingOther the property existing building other of this acquire property details
	 */
	public void setPropertyExistingBuildingOther(
		String propertyExistingBuildingOther);

	/**
	 * Returns the property existing infrastructure of this acquire property details.
	 *
	 * @return the property existing infrastructure of this acquire property details
	 */
	@AutoEscape
	public String getPropertyExistingInfrastructure();

	/**
	 * Sets the property existing infrastructure of this acquire property details.
	 *
	 * @param propertyExistingInfrastructure the property existing infrastructure of this acquire property details
	 */
	public void setPropertyExistingInfrastructure(
		String propertyExistingInfrastructure);

	/**
	 * Returns the property proposed use of this acquire property details.
	 *
	 * @return the property proposed use of this acquire property details
	 */
	@AutoEscape
	public String getPropertyProposedUse();

	/**
	 * Sets the property proposed use of this acquire property details.
	 *
	 * @param propertyProposedUse the property proposed use of this acquire property details
	 */
	public void setPropertyProposedUse(String propertyProposedUse);

	/**
	 * Returns the property proposed use other of this acquire property details.
	 *
	 * @return the property proposed use other of this acquire property details
	 */
	@AutoEscape
	public String getPropertyProposedUseOther();

	/**
	 * Sets the property proposed use other of this acquire property details.
	 *
	 * @param propertyProposedUseOther the property proposed use other of this acquire property details
	 */
	public void setPropertyProposedUseOther(String propertyProposedUseOther);

	/**
	 * Returns the property proposed infrastructure of this acquire property details.
	 *
	 * @return the property proposed infrastructure of this acquire property details
	 */
	@AutoEscape
	public String getPropertyProposedInfrastructure();

	/**
	 * Sets the property proposed infrastructure of this acquire property details.
	 *
	 * @param propertyProposedInfrastructure the property proposed infrastructure of this acquire property details
	 */
	public void setPropertyProposedInfrastructure(
		String propertyProposedInfrastructure);

	/**
	 * Returns the property land area hectare of this acquire property details.
	 *
	 * @return the property land area hectare of this acquire property details
	 */
	@AutoEscape
	public String getPropertyLandAreaHectare();

	/**
	 * Sets the property land area hectare of this acquire property details.
	 *
	 * @param propertyLandAreaHectare the property land area hectare of this acquire property details
	 */
	public void setPropertyLandAreaHectare(String propertyLandAreaHectare);

	/**
	 * Returns the property land area acres of this acquire property details.
	 *
	 * @return the property land area acres of this acquire property details
	 */
	@AutoEscape
	public String getPropertyLandAreaAcres();

	/**
	 * Sets the property land area acres of this acquire property details.
	 *
	 * @param propertyLandAreaAcres the property land area acres of this acquire property details
	 */
	public void setPropertyLandAreaAcres(String propertyLandAreaAcres);

	/**
	 * Returns the property land area roods of this acquire property details.
	 *
	 * @return the property land area roods of this acquire property details
	 */
	@AutoEscape
	public String getPropertyLandAreaRoods();

	/**
	 * Sets the property land area roods of this acquire property details.
	 *
	 * @param propertyLandAreaRoods the property land area roods of this acquire property details
	 */
	public void setPropertyLandAreaRoods(String propertyLandAreaRoods);

	/**
	 * Returns the property land area perches of this acquire property details.
	 *
	 * @return the property land area perches of this acquire property details
	 */
	@AutoEscape
	public String getPropertyLandAreaPerches();

	/**
	 * Sets the property land area perches of this acquire property details.
	 *
	 * @param propertyLandAreaPerches the property land area perches of this acquire property details
	 */
	public void setPropertyLandAreaPerches(String propertyLandAreaPerches);

	/**
	 * Returns the property adjoining north of this acquire property details.
	 *
	 * @return the property adjoining north of this acquire property details
	 */
	@AutoEscape
	public String getPropertyAdjoiningNorth();

	/**
	 * Sets the property adjoining north of this acquire property details.
	 *
	 * @param propertyAdjoiningNorth the property adjoining north of this acquire property details
	 */
	public void setPropertyAdjoiningNorth(String propertyAdjoiningNorth);

	/**
	 * Returns the property adjoining south of this acquire property details.
	 *
	 * @return the property adjoining south of this acquire property details
	 */
	@AutoEscape
	public String getPropertyAdjoiningSouth();

	/**
	 * Sets the property adjoining south of this acquire property details.
	 *
	 * @param propertyAdjoiningSouth the property adjoining south of this acquire property details
	 */
	public void setPropertyAdjoiningSouth(String propertyAdjoiningSouth);

	/**
	 * Returns the property adjoining east of this acquire property details.
	 *
	 * @return the property adjoining east of this acquire property details
	 */
	@AutoEscape
	public String getPropertyAdjoiningEast();

	/**
	 * Sets the property adjoining east of this acquire property details.
	 *
	 * @param propertyAdjoiningEast the property adjoining east of this acquire property details
	 */
	public void setPropertyAdjoiningEast(String propertyAdjoiningEast);

	/**
	 * Returns the property adjoining west of this acquire property details.
	 *
	 * @return the property adjoining west of this acquire property details
	 */
	@AutoEscape
	public String getPropertyAdjoiningWest();

	/**
	 * Sets the property adjoining west of this acquire property details.
	 *
	 * @param propertyAdjoiningWest the property adjoining west of this acquire property details
	 */
	public void setPropertyAdjoiningWest(String propertyAdjoiningWest);

	/**
	 * Returns the property date of this acquire property details.
	 *
	 * @return the property date of this acquire property details
	 */
	public Date getPropertyDate();

	/**
	 * Sets the property date of this acquire property details.
	 *
	 * @param propertyDate the property date of this acquire property details
	 */
	public void setPropertyDate(Date propertyDate);

	/**
	 * Returns the property additional info of this acquire property details.
	 *
	 * @return the property additional info of this acquire property details
	 */
	@AutoEscape
	public String getPropertyAdditionalInfo();

	/**
	 * Sets the property additional info of this acquire property details.
	 *
	 * @param propertyAdditionalInfo the property additional info of this acquire property details
	 */
	public void setPropertyAdditionalInfo(String propertyAdditionalInfo);

	/**
	 * Returns the acquire application ID of this acquire property details.
	 *
	 * @return the acquire application ID of this acquire property details
	 */
	public long getAcquireApplicationId();

	/**
	 * Sets the acquire application ID of this acquire property details.
	 *
	 * @param acquireApplicationId the acquire application ID of this acquire property details
	 */
	public void setAcquireApplicationId(long acquireApplicationId);

	@Override
	public AcquirePropertyDetails cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
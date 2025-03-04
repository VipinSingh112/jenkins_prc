/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the AccThirdPartyScope service. Represents a row in the &quot;nbp_janaac_acc_third_scope&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyScopeModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.janaac.application.form.service.model.impl.AccThirdPartyScopeImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AccThirdPartyScope
 * @generated
 */
@ProviderType
public interface AccThirdPartyScopeModel
	extends BaseModel<AccThirdPartyScope>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a acc third party scope model instance should use the {@link AccThirdPartyScope} interface instead.
	 */

	/**
	 * Returns the primary key of this acc third party scope.
	 *
	 * @return the primary key of this acc third party scope
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this acc third party scope.
	 *
	 * @param primaryKey the primary key of this acc third party scope
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this acc third party scope.
	 *
	 * @return the uuid of this acc third party scope
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this acc third party scope.
	 *
	 * @param uuid the uuid of this acc third party scope
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the acc third party scope ID of this acc third party scope.
	 *
	 * @return the acc third party scope ID of this acc third party scope
	 */
	public long getAccThirdPartyScopeId();

	/**
	 * Sets the acc third party scope ID of this acc third party scope.
	 *
	 * @param accThirdPartyScopeId the acc third party scope ID of this acc third party scope
	 */
	public void setAccThirdPartyScopeId(long accThirdPartyScopeId);

	/**
	 * Returns the group ID of this acc third party scope.
	 *
	 * @return the group ID of this acc third party scope
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this acc third party scope.
	 *
	 * @param groupId the group ID of this acc third party scope
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this acc third party scope.
	 *
	 * @return the company ID of this acc third party scope
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this acc third party scope.
	 *
	 * @param companyId the company ID of this acc third party scope
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this acc third party scope.
	 *
	 * @return the user ID of this acc third party scope
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this acc third party scope.
	 *
	 * @param userId the user ID of this acc third party scope
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this acc third party scope.
	 *
	 * @return the user uuid of this acc third party scope
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this acc third party scope.
	 *
	 * @param userUuid the user uuid of this acc third party scope
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this acc third party scope.
	 *
	 * @return the user name of this acc third party scope
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this acc third party scope.
	 *
	 * @param userName the user name of this acc third party scope
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this acc third party scope.
	 *
	 * @return the create date of this acc third party scope
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this acc third party scope.
	 *
	 * @param createDate the create date of this acc third party scope
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this acc third party scope.
	 *
	 * @return the modified date of this acc third party scope
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this acc third party scope.
	 *
	 * @param modifiedDate the modified date of this acc third party scope
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the accreditation category of this acc third party scope.
	 *
	 * @return the accreditation category of this acc third party scope
	 */
	@AutoEscape
	public String getAccreditationCategory();

	/**
	 * Sets the accreditation category of this acc third party scope.
	 *
	 * @param accreditationCategory the accreditation category of this acc third party scope
	 */
	public void setAccreditationCategory(String accreditationCategory);

	/**
	 * Returns the food product1 of this acc third party scope.
	 *
	 * @return the food product1 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct1();

	/**
	 * Sets the food product1 of this acc third party scope.
	 *
	 * @param foodProduct1 the food product1 of this acc third party scope
	 */
	public void setFoodProduct1(String foodProduct1);

	/**
	 * Returns the food regulation1 of this acc third party scope.
	 *
	 * @return the food regulation1 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation1();

	/**
	 * Sets the food regulation1 of this acc third party scope.
	 *
	 * @param foodRegulation1 the food regulation1 of this acc third party scope
	 */
	public void setFoodRegulation1(String foodRegulation1);

	/**
	 * Returns the food product2 of this acc third party scope.
	 *
	 * @return the food product2 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct2();

	/**
	 * Sets the food product2 of this acc third party scope.
	 *
	 * @param foodProduct2 the food product2 of this acc third party scope
	 */
	public void setFoodProduct2(String foodProduct2);

	/**
	 * Returns the food regulation2 of this acc third party scope.
	 *
	 * @return the food regulation2 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation2();

	/**
	 * Sets the food regulation2 of this acc third party scope.
	 *
	 * @param foodRegulation2 the food regulation2 of this acc third party scope
	 */
	public void setFoodRegulation2(String foodRegulation2);

	/**
	 * Returns the food product3 of this acc third party scope.
	 *
	 * @return the food product3 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct3();

	/**
	 * Sets the food product3 of this acc third party scope.
	 *
	 * @param foodProduct3 the food product3 of this acc third party scope
	 */
	public void setFoodProduct3(String foodProduct3);

	/**
	 * Returns the food regulation3 of this acc third party scope.
	 *
	 * @return the food regulation3 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation3();

	/**
	 * Sets the food regulation3 of this acc third party scope.
	 *
	 * @param foodRegulation3 the food regulation3 of this acc third party scope
	 */
	public void setFoodRegulation3(String foodRegulation3);

	/**
	 * Returns the food product4 of this acc third party scope.
	 *
	 * @return the food product4 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct4();

	/**
	 * Sets the food product4 of this acc third party scope.
	 *
	 * @param foodProduct4 the food product4 of this acc third party scope
	 */
	public void setFoodProduct4(String foodProduct4);

	/**
	 * Returns the food regulation4 of this acc third party scope.
	 *
	 * @return the food regulation4 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation4();

	/**
	 * Sets the food regulation4 of this acc third party scope.
	 *
	 * @param foodRegulation4 the food regulation4 of this acc third party scope
	 */
	public void setFoodRegulation4(String foodRegulation4);

	/**
	 * Returns the food product5 of this acc third party scope.
	 *
	 * @return the food product5 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct5();

	/**
	 * Sets the food product5 of this acc third party scope.
	 *
	 * @param foodProduct5 the food product5 of this acc third party scope
	 */
	public void setFoodProduct5(String foodProduct5);

	/**
	 * Returns the food regulation5 of this acc third party scope.
	 *
	 * @return the food regulation5 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation5();

	/**
	 * Sets the food regulation5 of this acc third party scope.
	 *
	 * @param foodRegulation5 the food regulation5 of this acc third party scope
	 */
	public void setFoodRegulation5(String foodRegulation5);

	/**
	 * Returns the food product6 of this acc third party scope.
	 *
	 * @return the food product6 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct6();

	/**
	 * Sets the food product6 of this acc third party scope.
	 *
	 * @param foodProduct6 the food product6 of this acc third party scope
	 */
	public void setFoodProduct6(String foodProduct6);

	/**
	 * Returns the food regulation6 of this acc third party scope.
	 *
	 * @return the food regulation6 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation6();

	/**
	 * Sets the food regulation6 of this acc third party scope.
	 *
	 * @param foodRegulation6 the food regulation6 of this acc third party scope
	 */
	public void setFoodRegulation6(String foodRegulation6);

	/**
	 * Returns the food product7 of this acc third party scope.
	 *
	 * @return the food product7 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct7();

	/**
	 * Sets the food product7 of this acc third party scope.
	 *
	 * @param foodProduct7 the food product7 of this acc third party scope
	 */
	public void setFoodProduct7(String foodProduct7);

	/**
	 * Returns the food regulation7 of this acc third party scope.
	 *
	 * @return the food regulation7 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation7();

	/**
	 * Sets the food regulation7 of this acc third party scope.
	 *
	 * @param foodRegulation7 the food regulation7 of this acc third party scope
	 */
	public void setFoodRegulation7(String foodRegulation7);

	/**
	 * Returns the food product8 of this acc third party scope.
	 *
	 * @return the food product8 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct8();

	/**
	 * Sets the food product8 of this acc third party scope.
	 *
	 * @param foodProduct8 the food product8 of this acc third party scope
	 */
	public void setFoodProduct8(String foodProduct8);

	/**
	 * Returns the food regulation8 of this acc third party scope.
	 *
	 * @return the food regulation8 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation8();

	/**
	 * Sets the food regulation8 of this acc third party scope.
	 *
	 * @param foodRegulation8 the food regulation8 of this acc third party scope
	 */
	public void setFoodRegulation8(String foodRegulation8);

	/**
	 * Returns the food product9 of this acc third party scope.
	 *
	 * @return the food product9 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct9();

	/**
	 * Sets the food product9 of this acc third party scope.
	 *
	 * @param foodProduct9 the food product9 of this acc third party scope
	 */
	public void setFoodProduct9(String foodProduct9);

	/**
	 * Returns the food regulation9 of this acc third party scope.
	 *
	 * @return the food regulation9 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation9();

	/**
	 * Sets the food regulation9 of this acc third party scope.
	 *
	 * @param foodRegulation9 the food regulation9 of this acc third party scope
	 */
	public void setFoodRegulation9(String foodRegulation9);

	/**
	 * Returns the food product10 of this acc third party scope.
	 *
	 * @return the food product10 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct10();

	/**
	 * Sets the food product10 of this acc third party scope.
	 *
	 * @param foodProduct10 the food product10 of this acc third party scope
	 */
	public void setFoodProduct10(String foodProduct10);

	/**
	 * Returns the food regulation10 of this acc third party scope.
	 *
	 * @return the food regulation10 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation10();

	/**
	 * Sets the food regulation10 of this acc third party scope.
	 *
	 * @param foodRegulation10 the food regulation10 of this acc third party scope
	 */
	public void setFoodRegulation10(String foodRegulation10);

	/**
	 * Returns the acc category other of this acc third party scope.
	 *
	 * @return the acc category other of this acc third party scope
	 */
	@AutoEscape
	public String getAccCategoryOther();

	/**
	 * Sets the acc category other of this acc third party scope.
	 *
	 * @param accCategoryOther the acc category other of this acc third party scope
	 */
	public void setAccCategoryOther(String accCategoryOther);

	/**
	 * Returns the food product11 of this acc third party scope.
	 *
	 * @return the food product11 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct11();

	/**
	 * Sets the food product11 of this acc third party scope.
	 *
	 * @param foodProduct11 the food product11 of this acc third party scope
	 */
	public void setFoodProduct11(String foodProduct11);

	/**
	 * Returns the food regulation11 of this acc third party scope.
	 *
	 * @return the food regulation11 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation11();

	/**
	 * Sets the food regulation11 of this acc third party scope.
	 *
	 * @param foodRegulation11 the food regulation11 of this acc third party scope
	 */
	public void setFoodRegulation11(String foodRegulation11);

	/**
	 * Returns the acc category other12 of this acc third party scope.
	 *
	 * @return the acc category other12 of this acc third party scope
	 */
	@AutoEscape
	public String getAccCategoryOther12();

	/**
	 * Sets the acc category other12 of this acc third party scope.
	 *
	 * @param accCategoryOther12 the acc category other12 of this acc third party scope
	 */
	public void setAccCategoryOther12(String accCategoryOther12);

	/**
	 * Returns the food product12 of this acc third party scope.
	 *
	 * @return the food product12 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodProduct12();

	/**
	 * Sets the food product12 of this acc third party scope.
	 *
	 * @param foodProduct12 the food product12 of this acc third party scope
	 */
	public void setFoodProduct12(String foodProduct12);

	/**
	 * Returns the food regulation12 of this acc third party scope.
	 *
	 * @return the food regulation12 of this acc third party scope
	 */
	@AutoEscape
	public String getFoodRegulation12();

	/**
	 * Sets the food regulation12 of this acc third party scope.
	 *
	 * @param foodRegulation12 the food regulation12 of this acc third party scope
	 */
	public void setFoodRegulation12(String foodRegulation12);

	/**
	 * Returns the cer intrested parties of this acc third party scope.
	 *
	 * @return the cer intrested parties of this acc third party scope
	 */
	@AutoEscape
	public String getCerIntrestedParties();

	/**
	 * Sets the cer intrested parties of this acc third party scope.
	 *
	 * @param cerIntrestedParties the cer intrested parties of this acc third party scope
	 */
	public void setCerIntrestedParties(String cerIntrestedParties);

	/**
	 * Returns the other services of this acc third party scope.
	 *
	 * @return the other services of this acc third party scope
	 */
	@AutoEscape
	public String getOtherServices();

	/**
	 * Sets the other services of this acc third party scope.
	 *
	 * @param otherServices the other services of this acc third party scope
	 */
	public void setOtherServices(String otherServices);

	/**
	 * Returns the other services describe of this acc third party scope.
	 *
	 * @return the other services describe of this acc third party scope
	 */
	@AutoEscape
	public String getOtherServicesDescribe();

	/**
	 * Sets the other services describe of this acc third party scope.
	 *
	 * @param otherServicesDescribe the other services describe of this acc third party scope
	 */
	public void setOtherServicesDescribe(String otherServicesDescribe);

	/**
	 * Returns the established relation of this acc third party scope.
	 *
	 * @return the established relation of this acc third party scope
	 */
	@AutoEscape
	public String getEstablishedRelation();

	/**
	 * Sets the established relation of this acc third party scope.
	 *
	 * @param establishedRelation the established relation of this acc third party scope
	 */
	public void setEstablishedRelation(String establishedRelation);

	/**
	 * Returns the established rel desc of this acc third party scope.
	 *
	 * @return the established rel desc of this acc third party scope
	 */
	@AutoEscape
	public String getEstablishedRelDesc();

	/**
	 * Sets the established rel desc of this acc third party scope.
	 *
	 * @param establishedRelDesc the established rel desc of this acc third party scope
	 */
	public void setEstablishedRelDesc(String establishedRelDesc);

	/**
	 * Returns the client service of this acc third party scope.
	 *
	 * @return the client service of this acc third party scope
	 */
	@AutoEscape
	public String getClientService();

	/**
	 * Sets the client service of this acc third party scope.
	 *
	 * @param clientService the client service of this acc third party scope
	 */
	public void setClientService(String clientService);

	/**
	 * Returns the certification cer body of this acc third party scope.
	 *
	 * @return the certification cer body of this acc third party scope
	 */
	@AutoEscape
	public String getCertificationCerBody();

	/**
	 * Sets the certification cer body of this acc third party scope.
	 *
	 * @param certificationCerBody the certification cer body of this acc third party scope
	 */
	public void setCertificationCerBody(String certificationCerBody);

	/**
	 * Returns the org accredited of this acc third party scope.
	 *
	 * @return the org accredited of this acc third party scope
	 */
	@AutoEscape
	public String getOrgAccredited();

	/**
	 * Sets the org accredited of this acc third party scope.
	 *
	 * @param orgAccredited the org accredited of this acc third party scope
	 */
	public void setOrgAccredited(String orgAccredited);

	/**
	 * Returns the responsible body of this acc third party scope.
	 *
	 * @return the responsible body of this acc third party scope
	 */
	@AutoEscape
	public String getResponsibleBody();

	/**
	 * Sets the responsible body of this acc third party scope.
	 *
	 * @param responsibleBody the responsible body of this acc third party scope
	 */
	public void setResponsibleBody(String responsibleBody);

	/**
	 * Returns the acc exp date of this acc third party scope.
	 *
	 * @return the acc exp date of this acc third party scope
	 */
	public Date getAccExpDate();

	/**
	 * Sets the acc exp date of this acc third party scope.
	 *
	 * @param accExpDate the acc exp date of this acc third party scope
	 */
	public void setAccExpDate(Date accExpDate);

	/**
	 * Returns the cert body scope of this acc third party scope.
	 *
	 * @return the cert body scope of this acc third party scope
	 */
	@AutoEscape
	public String getCertBodyScope();

	/**
	 * Sets the cert body scope of this acc third party scope.
	 *
	 * @param certBodyScope the cert body scope of this acc third party scope
	 */
	public void setCertBodyScope(String certBodyScope);

	/**
	 * Returns the janaac application ID of this acc third party scope.
	 *
	 * @return the janaac application ID of this acc third party scope
	 */
	public long getJanaacApplicationId();

	/**
	 * Sets the janaac application ID of this acc third party scope.
	 *
	 * @param janaacApplicationId the janaac application ID of this acc third party scope
	 */
	public void setJanaacApplicationId(long janaacApplicationId);

	@Override
	public AccThirdPartyScope cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
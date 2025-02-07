/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.wra.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the LicenceToAbstractInfo service. Represents a row in the &quot;nbp_wra_abstract_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.wra.application.form.service.model.impl.LicenceToAbstractInfoImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToAbstractInfo
 * @generated
 */
@ProviderType
public interface LicenceToAbstractInfoModel
	extends BaseModel<LicenceToAbstractInfo>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a licence to abstract info model instance should use the {@link LicenceToAbstractInfo} interface instead.
	 */

	/**
	 * Returns the primary key of this licence to abstract info.
	 *
	 * @return the primary key of this licence to abstract info
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this licence to abstract info.
	 *
	 * @param primaryKey the primary key of this licence to abstract info
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the abstract licence ID of this licence to abstract info.
	 *
	 * @return the abstract licence ID of this licence to abstract info
	 */
	public long getAbstractLicenceId();

	/**
	 * Sets the abstract licence ID of this licence to abstract info.
	 *
	 * @param abstractLicenceId the abstract licence ID of this licence to abstract info
	 */
	public void setAbstractLicenceId(long abstractLicenceId);

	/**
	 * Returns the group ID of this licence to abstract info.
	 *
	 * @return the group ID of this licence to abstract info
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this licence to abstract info.
	 *
	 * @param groupId the group ID of this licence to abstract info
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this licence to abstract info.
	 *
	 * @return the company ID of this licence to abstract info
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this licence to abstract info.
	 *
	 * @param companyId the company ID of this licence to abstract info
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this licence to abstract info.
	 *
	 * @return the user ID of this licence to abstract info
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this licence to abstract info.
	 *
	 * @param userId the user ID of this licence to abstract info
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this licence to abstract info.
	 *
	 * @return the user uuid of this licence to abstract info
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this licence to abstract info.
	 *
	 * @param userUuid the user uuid of this licence to abstract info
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this licence to abstract info.
	 *
	 * @return the user name of this licence to abstract info
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this licence to abstract info.
	 *
	 * @param userName the user name of this licence to abstract info
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this licence to abstract info.
	 *
	 * @return the create date of this licence to abstract info
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this licence to abstract info.
	 *
	 * @param createDate the create date of this licence to abstract info
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this licence to abstract info.
	 *
	 * @return the modified date of this licence to abstract info
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this licence to abstract info.
	 *
	 * @param modifiedDate the modified date of this licence to abstract info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the application num of this licence to abstract info.
	 *
	 * @return the application num of this licence to abstract info
	 */
	@AutoEscape
	public String getApplicationNum();

	/**
	 * Sets the application num of this licence to abstract info.
	 *
	 * @param applicationNum the application num of this licence to abstract info
	 */
	public void setApplicationNum(String applicationNum);

	/**
	 * Returns the name of applicant of this licence to abstract info.
	 *
	 * @return the name of applicant of this licence to abstract info
	 */
	@AutoEscape
	public String getNameOfApplicant();

	/**
	 * Sets the name of applicant of this licence to abstract info.
	 *
	 * @param nameOfApplicant the name of applicant of this licence to abstract info
	 */
	public void setNameOfApplicant(String nameOfApplicant);

	/**
	 * Returns the parish applicant of this licence to abstract info.
	 *
	 * @return the parish applicant of this licence to abstract info
	 */
	@AutoEscape
	public String getParishApplicant();

	/**
	 * Sets the parish applicant of this licence to abstract info.
	 *
	 * @param parishApplicant the parish applicant of this licence to abstract info
	 */
	public void setParishApplicant(String parishApplicant);

	/**
	 * Returns the mailing add of applicant of this licence to abstract info.
	 *
	 * @return the mailing add of applicant of this licence to abstract info
	 */
	@AutoEscape
	public String getMailingAddOfApplicant();

	/**
	 * Sets the mailing add of applicant of this licence to abstract info.
	 *
	 * @param mailingAddOfApplicant the mailing add of applicant of this licence to abstract info
	 */
	public void setMailingAddOfApplicant(String mailingAddOfApplicant);

	/**
	 * Returns the email of applicant of this licence to abstract info.
	 *
	 * @return the email of applicant of this licence to abstract info
	 */
	@AutoEscape
	public String getEmailOfApplicant();

	/**
	 * Sets the email of applicant of this licence to abstract info.
	 *
	 * @param emailOfApplicant the email of applicant of this licence to abstract info
	 */
	public void setEmailOfApplicant(String emailOfApplicant);

	/**
	 * Returns the office phone of this licence to abstract info.
	 *
	 * @return the office phone of this licence to abstract info
	 */
	@AutoEscape
	public String getOfficePhone();

	/**
	 * Sets the office phone of this licence to abstract info.
	 *
	 * @param officePhone the office phone of this licence to abstract info
	 */
	public void setOfficePhone(String officePhone);

	/**
	 * Returns the mobile phone of this licence to abstract info.
	 *
	 * @return the mobile phone of this licence to abstract info
	 */
	@AutoEscape
	public String getMobilePhone();

	/**
	 * Sets the mobile phone of this licence to abstract info.
	 *
	 * @param mobilePhone the mobile phone of this licence to abstract info
	 */
	public void setMobilePhone(String mobilePhone);

	/**
	 * Returns the home phone of this licence to abstract info.
	 *
	 * @return the home phone of this licence to abstract info
	 */
	@AutoEscape
	public String getHomePhone();

	/**
	 * Sets the home phone of this licence to abstract info.
	 *
	 * @param homePhone the home phone of this licence to abstract info
	 */
	public void setHomePhone(String homePhone);

	/**
	 * Returns the location of proposed parish of this licence to abstract info.
	 *
	 * @return the location of proposed parish of this licence to abstract info
	 */
	@AutoEscape
	public String getLocationOfProposedParish();

	/**
	 * Sets the location of proposed parish of this licence to abstract info.
	 *
	 * @param locationOfProposedParish the location of proposed parish of this licence to abstract info
	 */
	public void setLocationOfProposedParish(String locationOfProposedParish);

	/**
	 * Returns the location of pro parish work of this licence to abstract info.
	 *
	 * @return the location of pro parish work of this licence to abstract info
	 */
	@AutoEscape
	public String getLocationOfProParishWork();

	/**
	 * Sets the location of pro parish work of this licence to abstract info.
	 *
	 * @param locationOfProParishWork the location of pro parish work of this licence to abstract info
	 */
	public void setLocationOfProParishWork(String locationOfProParishWork);

	/**
	 * Returns the name of contractor of this licence to abstract info.
	 *
	 * @return the name of contractor of this licence to abstract info
	 */
	@AutoEscape
	public String getNameOfContractor();

	/**
	 * Sets the name of contractor of this licence to abstract info.
	 *
	 * @param nameOfContractor the name of contractor of this licence to abstract info
	 */
	public void setNameOfContractor(String nameOfContractor);

	/**
	 * Returns the parish contractor of this licence to abstract info.
	 *
	 * @return the parish contractor of this licence to abstract info
	 */
	@AutoEscape
	public String getParishContractor();

	/**
	 * Sets the parish contractor of this licence to abstract info.
	 *
	 * @param parishContractor the parish contractor of this licence to abstract info
	 */
	public void setParishContractor(String parishContractor);

	/**
	 * Returns the address of contractor of this licence to abstract info.
	 *
	 * @return the address of contractor of this licence to abstract info
	 */
	@AutoEscape
	public String getAddressOfContractor();

	/**
	 * Sets the address of contractor of this licence to abstract info.
	 *
	 * @param addressOfContractor the address of contractor of this licence to abstract info
	 */
	public void setAddressOfContractor(String addressOfContractor);

	/**
	 * Returns the source of water of this licence to abstract info.
	 *
	 * @return the source of water of this licence to abstract info
	 */
	@AutoEscape
	public String getSourceOfWater();

	/**
	 * Sets the source of water of this licence to abstract info.
	 *
	 * @param sourceOfWater the source of water of this licence to abstract info
	 */
	public void setSourceOfWater(String sourceOfWater);

	/**
	 * Returns the purpose water use of this licence to abstract info.
	 *
	 * @return the purpose water use of this licence to abstract info
	 */
	@AutoEscape
	public String getPurposeWaterUse();

	/**
	 * Sets the purpose water use of this licence to abstract info.
	 *
	 * @param purposeWaterUse the purpose water use of this licence to abstract info
	 */
	public void setPurposeWaterUse(String purposeWaterUse);

	/**
	 * Returns the area and crop type of this licence to abstract info.
	 *
	 * @return the area and crop type of this licence to abstract info
	 */
	@AutoEscape
	public String getAreaAndCropType();

	/**
	 * Sets the area and crop type of this licence to abstract info.
	 *
	 * @param areaAndCropType the area and crop type of this licence to abstract info
	 */
	public void setAreaAndCropType(String areaAndCropType);

	/**
	 * Returns the system of irrigation of this licence to abstract info.
	 *
	 * @return the system of irrigation of this licence to abstract info
	 */
	@AutoEscape
	public String getSystemOfIrrigation();

	/**
	 * Sets the system of irrigation of this licence to abstract info.
	 *
	 * @param systemOfIrrigation the system of irrigation of this licence to abstract info
	 */
	public void setSystemOfIrrigation(String systemOfIrrigation);

	/**
	 * Returns the means of disposal of this licence to abstract info.
	 *
	 * @return the means of disposal of this licence to abstract info
	 */
	@AutoEscape
	public String getMeansOfDisposal();

	/**
	 * Sets the means of disposal of this licence to abstract info.
	 *
	 * @param meansOfDisposal the means of disposal of this licence to abstract info
	 */
	public void setMeansOfDisposal(String meansOfDisposal);

	/**
	 * Returns the estimate depth of borewell of this licence to abstract info.
	 *
	 * @return the estimate depth of borewell of this licence to abstract info
	 */
	@AutoEscape
	public String getEstimateDepthOfBorewell();

	/**
	 * Sets the estimate depth of borewell of this licence to abstract info.
	 *
	 * @param estimateDepthOfBorewell the estimate depth of borewell of this licence to abstract info
	 */
	public void setEstimateDepthOfBorewell(String estimateDepthOfBorewell);

	/**
	 * Returns the diameter of borewell of this licence to abstract info.
	 *
	 * @return the diameter of borewell of this licence to abstract info
	 */
	@AutoEscape
	public String getDiameterOfBorewell();

	/**
	 * Sets the diameter of borewell of this licence to abstract info.
	 *
	 * @param diameterOfBorewell the diameter of borewell of this licence to abstract info
	 */
	public void setDiameterOfBorewell(String diameterOfBorewell);

	/**
	 * Returns the artesian supply of this licence to abstract info.
	 *
	 * @return the artesian supply of this licence to abstract info
	 */
	@AutoEscape
	public String getArtesianSupply();

	/**
	 * Sets the artesian supply of this licence to abstract info.
	 *
	 * @param artesianSupply the artesian supply of this licence to abstract info
	 */
	public void setArtesianSupply(String artesianSupply);

	/**
	 * Returns the geological strait of this licence to abstract info.
	 *
	 * @return the geological strait of this licence to abstract info
	 */
	@AutoEscape
	public String getGeologicalStrait();

	/**
	 * Sets the geological strait of this licence to abstract info.
	 *
	 * @param geologicalStrait the geological strait of this licence to abstract info
	 */
	public void setGeologicalStrait(String geologicalStrait);

	/**
	 * Returns the method of abstracting water of this licence to abstract info.
	 *
	 * @return the method of abstracting water of this licence to abstract info
	 */
	@AutoEscape
	public String getMethodOfAbstractingWater();

	/**
	 * Sets the method of abstracting water of this licence to abstract info.
	 *
	 * @param methodOfAbstractingWater the method of abstracting water of this licence to abstract info
	 */
	public void setMethodOfAbstractingWater(String methodOfAbstractingWater);

	/**
	 * Returns the max daily quant of this licence to abstract info.
	 *
	 * @return the max daily quant of this licence to abstract info
	 */
	@AutoEscape
	public String getMaxDailyQuant();

	/**
	 * Sets the max daily quant of this licence to abstract info.
	 *
	 * @param maxDailyQuant the max daily quant of this licence to abstract info
	 */
	public void setMaxDailyQuant(String maxDailyQuant);

	/**
	 * Returns the type of appratus proposed of this licence to abstract info.
	 *
	 * @return the type of appratus proposed of this licence to abstract info
	 */
	@AutoEscape
	public String getTypeOfAppratusProposed();

	/**
	 * Sets the type of appratus proposed of this licence to abstract info.
	 *
	 * @param typeOfAppratusProposed the type of appratus proposed of this licence to abstract info
	 */
	public void setTypeOfAppratusProposed(String typeOfAppratusProposed);

	/**
	 * Returns the other information of this licence to abstract info.
	 *
	 * @return the other information of this licence to abstract info
	 */
	@AutoEscape
	public String getOtherInformation();

	/**
	 * Sets the other information of this licence to abstract info.
	 *
	 * @param otherInformation the other information of this licence to abstract info
	 */
	public void setOtherInformation(String otherInformation);

	/**
	 * Returns the request to supply water of this licence to abstract info.
	 *
	 * @return the request to supply water of this licence to abstract info
	 */
	@AutoEscape
	public String getRequestToSupplyWater();

	/**
	 * Sets the request to supply water of this licence to abstract info.
	 *
	 * @param requestToSupplyWater the request to supply water of this licence to abstract info
	 */
	public void setRequestToSupplyWater(String requestToSupplyWater);

	/**
	 * Returns the authority information of this licence to abstract info.
	 *
	 * @return the authority information of this licence to abstract info
	 */
	@AutoEscape
	public String getAuthorityInformation();

	/**
	 * Sets the authority information of this licence to abstract info.
	 *
	 * @param authorityInformation the authority information of this licence to abstract info
	 */
	public void setAuthorityInformation(String authorityInformation);

	/**
	 * Returns the date of sign of this licence to abstract info.
	 *
	 * @return the date of sign of this licence to abstract info
	 */
	public Date getDateOfSign();

	/**
	 * Sets the date of sign of this licence to abstract info.
	 *
	 * @param dateOfSign the date of sign of this licence to abstract info
	 */
	public void setDateOfSign(Date dateOfSign);

	/**
	 * Returns the wra application ID of this licence to abstract info.
	 *
	 * @return the wra application ID of this licence to abstract info
	 */
	public long getWraApplicationId();

	/**
	 * Sets the wra application ID of this licence to abstract info.
	 *
	 * @param wraApplicationId the wra application ID of this licence to abstract info
	 */
	public void setWraApplicationId(long wraApplicationId);

	@Override
	public LicenceToAbstractInfo cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
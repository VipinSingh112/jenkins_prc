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
 * The base model interface for the LicenceToWellDriller service. Represents a row in the &quot;nbp_wra_lic_well_drill_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.wra.application.form.service.model.impl.LicenceToWellDrillerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see LicenceToWellDriller
 * @generated
 */
@ProviderType
public interface LicenceToWellDrillerModel
	extends BaseModel<LicenceToWellDriller>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a licence to well driller model instance should use the {@link LicenceToWellDriller} interface instead.
	 */

	/**
	 * Returns the primary key of this licence to well driller.
	 *
	 * @return the primary key of this licence to well driller
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this licence to well driller.
	 *
	 * @param primaryKey the primary key of this licence to well driller
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the licence to well driller ID of this licence to well driller.
	 *
	 * @return the licence to well driller ID of this licence to well driller
	 */
	public long getLicenceToWellDrillerId();

	/**
	 * Sets the licence to well driller ID of this licence to well driller.
	 *
	 * @param licenceToWellDrillerId the licence to well driller ID of this licence to well driller
	 */
	public void setLicenceToWellDrillerId(long licenceToWellDrillerId);

	/**
	 * Returns the group ID of this licence to well driller.
	 *
	 * @return the group ID of this licence to well driller
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this licence to well driller.
	 *
	 * @param groupId the group ID of this licence to well driller
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this licence to well driller.
	 *
	 * @return the company ID of this licence to well driller
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this licence to well driller.
	 *
	 * @param companyId the company ID of this licence to well driller
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this licence to well driller.
	 *
	 * @return the user ID of this licence to well driller
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this licence to well driller.
	 *
	 * @param userId the user ID of this licence to well driller
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this licence to well driller.
	 *
	 * @return the user uuid of this licence to well driller
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this licence to well driller.
	 *
	 * @param userUuid the user uuid of this licence to well driller
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this licence to well driller.
	 *
	 * @return the user name of this licence to well driller
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this licence to well driller.
	 *
	 * @param userName the user name of this licence to well driller
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this licence to well driller.
	 *
	 * @return the create date of this licence to well driller
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this licence to well driller.
	 *
	 * @param createDate the create date of this licence to well driller
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this licence to well driller.
	 *
	 * @return the modified date of this licence to well driller
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this licence to well driller.
	 *
	 * @param modifiedDate the modified date of this licence to well driller
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the well drilling application no of this licence to well driller.
	 *
	 * @return the well drilling application no of this licence to well driller
	 */
	@AutoEscape
	public String getWellDrillingApplicationNo();

	/**
	 * Sets the well drilling application no of this licence to well driller.
	 *
	 * @param wellDrillingApplicationNo the well drilling application no of this licence to well driller
	 */
	public void setWellDrillingApplicationNo(String wellDrillingApplicationNo);

	/**
	 * Returns the permit drilling applicant name of this licence to well driller.
	 *
	 * @return the permit drilling applicant name of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingApplicantName();

	/**
	 * Sets the permit drilling applicant name of this licence to well driller.
	 *
	 * @param permitDrillingApplicantName the permit drilling applicant name of this licence to well driller
	 */
	public void setPermitDrillingApplicantName(
		String permitDrillingApplicantName);

	/**
	 * Returns the permit drilling address parish of this licence to well driller.
	 *
	 * @return the permit drilling address parish of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingAddressParish();

	/**
	 * Sets the permit drilling address parish of this licence to well driller.
	 *
	 * @param permitDrillingAddressParish the permit drilling address parish of this licence to well driller
	 */
	public void setPermitDrillingAddressParish(
		String permitDrillingAddressParish);

	/**
	 * Returns the permit drilling applicant address of this licence to well driller.
	 *
	 * @return the permit drilling applicant address of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingApplicantAddress();

	/**
	 * Sets the permit drilling applicant address of this licence to well driller.
	 *
	 * @param permitDrillingApplicantAddress the permit drilling applicant address of this licence to well driller
	 */
	public void setPermitDrillingApplicantAddress(
		String permitDrillingApplicantAddress);

	/**
	 * Returns the permit drilling dob date of this licence to well driller.
	 *
	 * @return the permit drilling dob date of this licence to well driller
	 */
	public Date getPermitDrillingDOBDate();

	/**
	 * Sets the permit drilling dob date of this licence to well driller.
	 *
	 * @param permitDrillingDOBDate the permit drilling dob date of this licence to well driller
	 */
	public void setPermitDrillingDOBDate(Date permitDrillingDOBDate);

	/**
	 * Returns the permit drilling educational of this licence to well driller.
	 *
	 * @return the permit drilling educational of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingEducational();

	/**
	 * Sets the permit drilling educational of this licence to well driller.
	 *
	 * @param permitDrillingEducational the permit drilling educational of this licence to well driller
	 */
	public void setPermitDrillingEducational(String permitDrillingEducational);

	/**
	 * Returns the permit drilling specific training of this licence to well driller.
	 *
	 * @return the permit drilling specific training of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingSpecificTraining();

	/**
	 * Sets the permit drilling specific training of this licence to well driller.
	 *
	 * @param permitDrillingSpecificTraining the permit drilling specific training of this licence to well driller
	 */
	public void setPermitDrillingSpecificTraining(
		String permitDrillingSpecificTraining);

	/**
	 * Returns the permit drilling specific exp of this licence to well driller.
	 *
	 * @return the permit drilling specific exp of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingSpecificExp();

	/**
	 * Sets the permit drilling specific exp of this licence to well driller.
	 *
	 * @param permitDrillingSpecificExp the permit drilling specific exp of this licence to well driller
	 */
	public void setPermitDrillingSpecificExp(String permitDrillingSpecificExp);

	/**
	 * Returns the permit drilling self employed of this licence to well driller.
	 *
	 * @return the permit drilling self employed of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingSelfEmployed();

	/**
	 * Sets the permit drilling self employed of this licence to well driller.
	 *
	 * @param permitDrillingSelfEmployed the permit drilling self employed of this licence to well driller
	 */
	public void setPermitDrillingSelfEmployed(
		String permitDrillingSelfEmployed);

	/**
	 * Returns the permit drilling name of this licence to well driller.
	 *
	 * @return the permit drilling name of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingName();

	/**
	 * Sets the permit drilling name of this licence to well driller.
	 *
	 * @param permitDrillingName the permit drilling name of this licence to well driller
	 */
	public void setPermitDrillingName(String permitDrillingName);

	/**
	 * Returns the permit drilling present employer of this licence to well driller.
	 *
	 * @return the permit drilling present employer of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingPresentEmployer();

	/**
	 * Sets the permit drilling present employer of this licence to well driller.
	 *
	 * @param permitDrillingPresentEmployer the permit drilling present employer of this licence to well driller
	 */
	public void setPermitDrillingPresentEmployer(
		String permitDrillingPresentEmployer);

	/**
	 * Returns the permit drilling employer address of this licence to well driller.
	 *
	 * @return the permit drilling employer address of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingEmployerAddress();

	/**
	 * Sets the permit drilling employer address of this licence to well driller.
	 *
	 * @param permitDrillingEmployerAddress the permit drilling employer address of this licence to well driller
	 */
	public void setPermitDrillingEmployerAddress(
		String permitDrillingEmployerAddress);

	/**
	 * Returns the permit drilling first ref name of this licence to well driller.
	 *
	 * @return the permit drilling first ref name of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingFirstRefName();

	/**
	 * Sets the permit drilling first ref name of this licence to well driller.
	 *
	 * @param permitDrillingFirstRefName the permit drilling first ref name of this licence to well driller
	 */
	public void setPermitDrillingFirstRefName(
		String permitDrillingFirstRefName);

	/**
	 * Returns the permit drilling first ref add of this licence to well driller.
	 *
	 * @return the permit drilling first ref add of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingFirstRefAdd();

	/**
	 * Sets the permit drilling first ref add of this licence to well driller.
	 *
	 * @param permitDrillingFirstRefAdd the permit drilling first ref add of this licence to well driller
	 */
	public void setPermitDrillingFirstRefAdd(String permitDrillingFirstRefAdd);

	/**
	 * Returns the permit drilling second ref name of this licence to well driller.
	 *
	 * @return the permit drilling second ref name of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingSecondRefName();

	/**
	 * Sets the permit drilling second ref name of this licence to well driller.
	 *
	 * @param permitDrillingSecondRefName the permit drilling second ref name of this licence to well driller
	 */
	public void setPermitDrillingSecondRefName(
		String permitDrillingSecondRefName);

	/**
	 * Returns the permit drilling second ref add of this licence to well driller.
	 *
	 * @return the permit drilling second ref add of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingSecondRefAdd();

	/**
	 * Sets the permit drilling second ref add of this licence to well driller.
	 *
	 * @param permitDrillingSecondRefAdd the permit drilling second ref add of this licence to well driller
	 */
	public void setPermitDrillingSecondRefAdd(
		String permitDrillingSecondRefAdd);

	/**
	 * Returns the permit drilling signature of this licence to well driller.
	 *
	 * @return the permit drilling signature of this licence to well driller
	 */
	@AutoEscape
	public String getPermitDrillingSignature();

	/**
	 * Sets the permit drilling signature of this licence to well driller.
	 *
	 * @param permitDrillingSignature the permit drilling signature of this licence to well driller
	 */
	public void setPermitDrillingSignature(String permitDrillingSignature);

	/**
	 * Returns the permit drilling signature date of this licence to well driller.
	 *
	 * @return the permit drilling signature date of this licence to well driller
	 */
	public Date getPermitDrillingSignatureDate();

	/**
	 * Sets the permit drilling signature date of this licence to well driller.
	 *
	 * @param permitDrillingSignatureDate the permit drilling signature date of this licence to well driller
	 */
	public void setPermitDrillingSignatureDate(
		Date permitDrillingSignatureDate);

	/**
	 * Returns the wra application ID of this licence to well driller.
	 *
	 * @return the wra application ID of this licence to well driller
	 */
	public long getWraApplicationId();

	/**
	 * Sets the wra application ID of this licence to well driller.
	 *
	 * @param wraApplicationId the wra application ID of this licence to well driller
	 */
	public void setWraApplicationId(long wraApplicationId);

	@Override
	public LicenceToWellDriller cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
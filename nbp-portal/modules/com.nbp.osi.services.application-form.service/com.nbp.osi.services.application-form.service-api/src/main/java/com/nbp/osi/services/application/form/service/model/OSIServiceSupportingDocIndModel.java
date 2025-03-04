/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the OSIServiceSupportingDocInd service. Represents a row in the &quot;nbp_osi_services_sup_doc_ind&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.osi.services.application.form.service.model.impl.OSIServiceSupportingDocIndImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see OSIServiceSupportingDocInd
 * @generated
 */
@ProviderType
public interface OSIServiceSupportingDocIndModel
	extends BaseModel<OSIServiceSupportingDocInd>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a osi service supporting doc ind model instance should use the {@link OSIServiceSupportingDocInd} interface instead.
	 */

	/**
	 * Returns the primary key of this osi service supporting doc ind.
	 *
	 * @return the primary key of this osi service supporting doc ind
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this osi service supporting doc ind.
	 *
	 * @param primaryKey the primary key of this osi service supporting doc ind
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the o si service supporting doc ind ID of this osi service supporting doc ind.
	 *
	 * @return the o si service supporting doc ind ID of this osi service supporting doc ind
	 */
	public long getOSIServiceSupportingDocIndId();

	/**
	 * Sets the o si service supporting doc ind ID of this osi service supporting doc ind.
	 *
	 * @param oSIServiceSupportingDocIndId the o si service supporting doc ind ID of this osi service supporting doc ind
	 */
	public void setOSIServiceSupportingDocIndId(
		long oSIServiceSupportingDocIndId);

	/**
	 * Returns the group ID of this osi service supporting doc ind.
	 *
	 * @return the group ID of this osi service supporting doc ind
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this osi service supporting doc ind.
	 *
	 * @param groupId the group ID of this osi service supporting doc ind
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this osi service supporting doc ind.
	 *
	 * @return the company ID of this osi service supporting doc ind
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this osi service supporting doc ind.
	 *
	 * @param companyId the company ID of this osi service supporting doc ind
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this osi service supporting doc ind.
	 *
	 * @return the user ID of this osi service supporting doc ind
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this osi service supporting doc ind.
	 *
	 * @param userId the user ID of this osi service supporting doc ind
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this osi service supporting doc ind.
	 *
	 * @return the user uuid of this osi service supporting doc ind
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this osi service supporting doc ind.
	 *
	 * @param userUuid the user uuid of this osi service supporting doc ind
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this osi service supporting doc ind.
	 *
	 * @return the user name of this osi service supporting doc ind
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this osi service supporting doc ind.
	 *
	 * @param userName the user name of this osi service supporting doc ind
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this osi service supporting doc ind.
	 *
	 * @return the create date of this osi service supporting doc ind
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this osi service supporting doc ind.
	 *
	 * @param createDate the create date of this osi service supporting doc ind
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this osi service supporting doc ind.
	 *
	 * @return the modified date of this osi service supporting doc ind
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this osi service supporting doc ind.
	 *
	 * @param modifiedDate the modified date of this osi service supporting doc ind
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the supporting doc checkboxes of this osi service supporting doc ind.
	 *
	 * @return the supporting doc checkboxes of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getSupportingDocCheckboxes();

	/**
	 * Sets the supporting doc checkboxes of this osi service supporting doc ind.
	 *
	 * @param supportingDocCheckboxes the supporting doc checkboxes of this osi service supporting doc ind
	 */
	public void setSupportingDocCheckboxes(String supportingDocCheckboxes);

	/**
	 * Returns the non provision reason req1 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req1 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq1();

	/**
	 * Sets the non provision reason req1 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq1 the non provision reason req1 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq1(String nonProvisionReasonReq1);

	/**
	 * Returns the expected date req1 of this osi service supporting doc ind.
	 *
	 * @return the expected date req1 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq1();

	/**
	 * Sets the expected date req1 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq1 the expected date req1 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq1(Date expectedDateReq1);

	/**
	 * Returns the non provision reason req2 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req2 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq2();

	/**
	 * Sets the non provision reason req2 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq2 the non provision reason req2 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq2(String nonProvisionReasonReq2);

	/**
	 * Returns the expected date req2 of this osi service supporting doc ind.
	 *
	 * @return the expected date req2 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq2();

	/**
	 * Sets the expected date req2 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq2 the expected date req2 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq2(Date expectedDateReq2);

	/**
	 * Returns the non provision reason req3 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req3 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq3();

	/**
	 * Sets the non provision reason req3 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq3 the non provision reason req3 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq3(String nonProvisionReasonReq3);

	/**
	 * Returns the expected date req3 of this osi service supporting doc ind.
	 *
	 * @return the expected date req3 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq3();

	/**
	 * Sets the expected date req3 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq3 the expected date req3 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq3(Date expectedDateReq3);

	/**
	 * Returns the non provision reason req4 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req4 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq4();

	/**
	 * Sets the non provision reason req4 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq4 the non provision reason req4 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq4(String nonProvisionReasonReq4);

	/**
	 * Returns the expected date req4 of this osi service supporting doc ind.
	 *
	 * @return the expected date req4 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq4();

	/**
	 * Sets the expected date req4 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq4 the expected date req4 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq4(Date expectedDateReq4);

	/**
	 * Returns the non provision reason req5 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req5 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq5();

	/**
	 * Sets the non provision reason req5 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq5 the non provision reason req5 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq5(String nonProvisionReasonReq5);

	/**
	 * Returns the expected date req5 of this osi service supporting doc ind.
	 *
	 * @return the expected date req5 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq5();

	/**
	 * Sets the expected date req5 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq5 the expected date req5 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq5(Date expectedDateReq5);

	/**
	 * Returns the non provision reason req6 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req6 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq6();

	/**
	 * Sets the non provision reason req6 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq6 the non provision reason req6 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq6(String nonProvisionReasonReq6);

	/**
	 * Returns the expected date req6 of this osi service supporting doc ind.
	 *
	 * @return the expected date req6 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq6();

	/**
	 * Sets the expected date req6 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq6 the expected date req6 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq6(Date expectedDateReq6);

	/**
	 * Returns the non provision reason req7 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req7 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq7();

	/**
	 * Sets the non provision reason req7 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq7 the non provision reason req7 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq7(String nonProvisionReasonReq7);

	/**
	 * Returns the expected date req7 of this osi service supporting doc ind.
	 *
	 * @return the expected date req7 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq7();

	/**
	 * Sets the expected date req7 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq7 the expected date req7 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq7(Date expectedDateReq7);

	/**
	 * Returns the non provision reason req8 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req8 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq8();

	/**
	 * Sets the non provision reason req8 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq8 the non provision reason req8 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq8(String nonProvisionReasonReq8);

	/**
	 * Returns the expected date req8 of this osi service supporting doc ind.
	 *
	 * @return the expected date req8 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq8();

	/**
	 * Sets the expected date req8 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq8 the expected date req8 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq8(Date expectedDateReq8);

	/**
	 * Returns the non provision reason req9 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req9 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq9();

	/**
	 * Sets the non provision reason req9 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq9 the non provision reason req9 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq9(String nonProvisionReasonReq9);

	/**
	 * Returns the expected date req9 of this osi service supporting doc ind.
	 *
	 * @return the expected date req9 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq9();

	/**
	 * Sets the expected date req9 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq9 the expected date req9 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq9(Date expectedDateReq9);

	/**
	 * Returns the non provision reason req10 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req10 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq10();

	/**
	 * Sets the non provision reason req10 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq10 the non provision reason req10 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq10(String nonProvisionReasonReq10);

	/**
	 * Returns the expected date req10 of this osi service supporting doc ind.
	 *
	 * @return the expected date req10 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq10();

	/**
	 * Sets the expected date req10 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq10 the expected date req10 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq10(Date expectedDateReq10);

	/**
	 * Returns the non provision reason req11 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req11 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq11();

	/**
	 * Sets the non provision reason req11 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq11 the non provision reason req11 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq11(String nonProvisionReasonReq11);

	/**
	 * Returns the expected date req11 of this osi service supporting doc ind.
	 *
	 * @return the expected date req11 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq11();

	/**
	 * Sets the expected date req11 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq11 the expected date req11 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq11(Date expectedDateReq11);

	/**
	 * Returns the non provision reason req12 of this osi service supporting doc ind.
	 *
	 * @return the non provision reason req12 of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getNonProvisionReasonReq12();

	/**
	 * Sets the non provision reason req12 of this osi service supporting doc ind.
	 *
	 * @param nonProvisionReasonReq12 the non provision reason req12 of this osi service supporting doc ind
	 */
	public void setNonProvisionReasonReq12(String nonProvisionReasonReq12);

	/**
	 * Returns the expected date req12 of this osi service supporting doc ind.
	 *
	 * @return the expected date req12 of this osi service supporting doc ind
	 */
	public Date getExpectedDateReq12();

	/**
	 * Sets the expected date req12 of this osi service supporting doc ind.
	 *
	 * @param expectedDateReq12 the expected date req12 of this osi service supporting doc ind
	 */
	public void setExpectedDateReq12(Date expectedDateReq12);

	/**
	 * Returns the category of this osi service supporting doc ind.
	 *
	 * @return the category of this osi service supporting doc ind
	 */
	@AutoEscape
	public String getCategory();

	/**
	 * Sets the category of this osi service supporting doc ind.
	 *
	 * @param category the category of this osi service supporting doc ind
	 */
	public void setCategory(String category);

	/**
	 * Returns the osi services application ID of this osi service supporting doc ind.
	 *
	 * @return the osi services application ID of this osi service supporting doc ind
	 */
	public long getOsiServicesApplicationId();

	/**
	 * Sets the osi services application ID of this osi service supporting doc ind.
	 *
	 * @param osiServicesApplicationId the osi services application ID of this osi service supporting doc ind
	 */
	public void setOsiServicesApplicationId(long osiServicesApplicationId);

	@Override
	public OSIServiceSupportingDocInd cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
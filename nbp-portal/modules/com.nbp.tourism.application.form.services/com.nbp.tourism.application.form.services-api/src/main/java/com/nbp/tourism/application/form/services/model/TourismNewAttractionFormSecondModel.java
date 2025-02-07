/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the TourismNewAttractionFormSecond service. Represents a row in the &quot;nbp_tourism_new_attraction_fs&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.tourism.application.form.services.model.impl.TourismNewAttractionFormSecondImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismNewAttractionFormSecond
 * @generated
 */
@ProviderType
public interface TourismNewAttractionFormSecondModel
	extends BaseModel<TourismNewAttractionFormSecond>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tourism new attraction form second model instance should use the {@link TourismNewAttractionFormSecond} interface instead.
	 */

	/**
	 * Returns the primary key of this tourism new attraction form second.
	 *
	 * @return the primary key of this tourism new attraction form second
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tourism new attraction form second.
	 *
	 * @param primaryKey the primary key of this tourism new attraction form second
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tourism new attraction form sec ID of this tourism new attraction form second.
	 *
	 * @return the tourism new attraction form sec ID of this tourism new attraction form second
	 */
	public long getTourismNewAttractionFormSecId();

	/**
	 * Sets the tourism new attraction form sec ID of this tourism new attraction form second.
	 *
	 * @param tourismNewAttractionFormSecId the tourism new attraction form sec ID of this tourism new attraction form second
	 */
	public void setTourismNewAttractionFormSecId(
		long tourismNewAttractionFormSecId);

	/**
	 * Returns the group ID of this tourism new attraction form second.
	 *
	 * @return the group ID of this tourism new attraction form second
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tourism new attraction form second.
	 *
	 * @param groupId the group ID of this tourism new attraction form second
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tourism new attraction form second.
	 *
	 * @return the company ID of this tourism new attraction form second
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tourism new attraction form second.
	 *
	 * @param companyId the company ID of this tourism new attraction form second
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tourism new attraction form second.
	 *
	 * @return the user ID of this tourism new attraction form second
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tourism new attraction form second.
	 *
	 * @param userId the user ID of this tourism new attraction form second
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tourism new attraction form second.
	 *
	 * @return the user uuid of this tourism new attraction form second
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tourism new attraction form second.
	 *
	 * @param userUuid the user uuid of this tourism new attraction form second
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tourism new attraction form second.
	 *
	 * @return the user name of this tourism new attraction form second
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tourism new attraction form second.
	 *
	 * @param userName the user name of this tourism new attraction form second
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tourism new attraction form second.
	 *
	 * @return the create date of this tourism new attraction form second
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tourism new attraction form second.
	 *
	 * @param createDate the create date of this tourism new attraction form second
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tourism new attraction form second.
	 *
	 * @return the modified date of this tourism new attraction form second
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tourism new attraction form second.
	 *
	 * @param modifiedDate the modified date of this tourism new attraction form second
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the target market local of this tourism new attraction form second.
	 *
	 * @return the target market local of this tourism new attraction form second
	 */
	@AutoEscape
	public String getTargetMarketLocal();

	/**
	 * Sets the target market local of this tourism new attraction form second.
	 *
	 * @param targetMarketLocal the target market local of this tourism new attraction form second
	 */
	public void setTargetMarketLocal(String targetMarketLocal);

	/**
	 * Returns the target market foreign of this tourism new attraction form second.
	 *
	 * @return the target market foreign of this tourism new attraction form second
	 */
	@AutoEscape
	public String getTargetMarketForeign();

	/**
	 * Sets the target market foreign of this tourism new attraction form second.
	 *
	 * @param targetMarketForeign the target market foreign of this tourism new attraction form second
	 */
	public void setTargetMarketForeign(String targetMarketForeign);

	/**
	 * Returns the target market countries of this tourism new attraction form second.
	 *
	 * @return the target market countries of this tourism new attraction form second
	 */
	@AutoEscape
	public String getTargetMarketCountries();

	/**
	 * Sets the target market countries of this tourism new attraction form second.
	 *
	 * @param targetMarketCountries the target market countries of this tourism new attraction form second
	 */
	public void setTargetMarketCountries(String targetMarketCountries);

	/**
	 * Returns the owner country of origin of this tourism new attraction form second.
	 *
	 * @return the owner country of origin of this tourism new attraction form second
	 */
	@AutoEscape
	public String getOwnerCountryOfOrigin();

	/**
	 * Sets the owner country of origin of this tourism new attraction form second.
	 *
	 * @param ownerCountryOfOrigin the owner country of origin of this tourism new attraction form second
	 */
	public void setOwnerCountryOfOrigin(String ownerCountryOfOrigin);

	/**
	 * Returns the owner joint venture of this tourism new attraction form second.
	 *
	 * @return the owner joint venture of this tourism new attraction form second
	 */
	@AutoEscape
	public String getOwnerJointVenture();

	/**
	 * Sets the owner joint venture of this tourism new attraction form second.
	 *
	 * @param ownerJointVenture the owner joint venture of this tourism new attraction form second
	 */
	public void setOwnerJointVenture(String ownerJointVenture);

	/**
	 * Returns the owner local of this tourism new attraction form second.
	 *
	 * @return the owner local of this tourism new attraction form second
	 */
	@AutoEscape
	public String getOwnerLocal();

	/**
	 * Sets the owner local of this tourism new attraction form second.
	 *
	 * @param ownerLocal the owner local of this tourism new attraction form second
	 */
	public void setOwnerLocal(String ownerLocal);

	/**
	 * Returns the owner foreign of this tourism new attraction form second.
	 *
	 * @return the owner foreign of this tourism new attraction form second
	 */
	@AutoEscape
	public String getOwnerForeign();

	/**
	 * Sets the owner foreign of this tourism new attraction form second.
	 *
	 * @param ownerForeign the owner foreign of this tourism new attraction form second
	 */
	public void setOwnerForeign(String ownerForeign);

	/**
	 * Returns the capitalization us component of this tourism new attraction form second.
	 *
	 * @return the capitalization us component of this tourism new attraction form second
	 */
	@AutoEscape
	public String getCapitalizationUSComponent();

	/**
	 * Sets the capitalization us component of this tourism new attraction form second.
	 *
	 * @param capitalizationUSComponent the capitalization us component of this tourism new attraction form second
	 */
	public void setCapitalizationUSComponent(String capitalizationUSComponent);

	/**
	 * Returns the capitalization j equivalent of this tourism new attraction form second.
	 *
	 * @return the capitalization j equivalent of this tourism new attraction form second
	 */
	@AutoEscape
	public String getCapitalizationJEquivalent();

	/**
	 * Sets the capitalization j equivalent of this tourism new attraction form second.
	 *
	 * @param capitalizationJEquivalent the capitalization j equivalent of this tourism new attraction form second
	 */
	public void setCapitalizationJEquivalent(String capitalizationJEquivalent);

	/**
	 * Returns the capitalization rate of exchange of this tourism new attraction form second.
	 *
	 * @return the capitalization rate of exchange of this tourism new attraction form second
	 */
	@AutoEscape
	public String getCapitalizationRateOfExchange();

	/**
	 * Sets the capitalization rate of exchange of this tourism new attraction form second.
	 *
	 * @param capitalizationRateOfExchange the capitalization rate of exchange of this tourism new attraction form second
	 */
	public void setCapitalizationRateOfExchange(
		String capitalizationRateOfExchange);

	/**
	 * Returns the capitalization j component of this tourism new attraction form second.
	 *
	 * @return the capitalization j component of this tourism new attraction form second
	 */
	@AutoEscape
	public String getCapitalizationJComponent();

	/**
	 * Sets the capitalization j component of this tourism new attraction form second.
	 *
	 * @param capitalizationJComponent the capitalization j component of this tourism new attraction form second
	 */
	public void setCapitalizationJComponent(String capitalizationJComponent);

	/**
	 * Returns the capitalization capital invest of this tourism new attraction form second.
	 *
	 * @return the capitalization capital invest of this tourism new attraction form second
	 */
	@AutoEscape
	public String getCapitalizationCapitalInvest();

	/**
	 * Sets the capitalization capital invest of this tourism new attraction form second.
	 *
	 * @param capitalizationCapitalInvest the capitalization capital invest of this tourism new attraction form second
	 */
	public void setCapitalizationCapitalInvest(
		String capitalizationCapitalInvest);

	/**
	 * Returns the sources loan of this tourism new attraction form second.
	 *
	 * @return the sources loan of this tourism new attraction form second
	 */
	@AutoEscape
	public String getSourcesLoan();

	/**
	 * Sets the sources loan of this tourism new attraction form second.
	 *
	 * @param sourcesLoan  the sources loan of this tourism new attraction form second
	 */
	public void setSourcesLoan(String sourcesLoan);

	/**
	 * Returns the sources equity of this tourism new attraction form second.
	 *
	 * @return the sources equity of this tourism new attraction form second
	 */
	@AutoEscape
	public String getSourcesEquity();

	/**
	 * Sets the sources equity of this tourism new attraction form second.
	 *
	 * @param sourcesEquity the sources equity of this tourism new attraction form second
	 */
	public void setSourcesEquity(String sourcesEquity);

	/**
	 * Returns the sources state source of loan financ of this tourism new attraction form second.
	 *
	 * @return the sources state source of loan financ of this tourism new attraction form second
	 */
	@AutoEscape
	public String getSourcesStateSourceOfLoanFinanc();

	/**
	 * Sets the sources state source of loan financ of this tourism new attraction form second.
	 *
	 * @param sourcesStateSourceOfLoanFinanc the sources state source of loan financ of this tourism new attraction form second
	 */
	public void setSourcesStateSourceOfLoanFinanc(
		String sourcesStateSourceOfLoanFinanc);

	/**
	 * Returns the annual projected one of this tourism new attraction form second.
	 *
	 * @return the annual projected one of this tourism new attraction form second
	 */
	@AutoEscape
	public String getAnnualProjectedOne();

	/**
	 * Sets the annual projected one of this tourism new attraction form second.
	 *
	 * @param annualProjectedOne  the annual projected one of this tourism new attraction form second
	 */
	public void setAnnualProjectedOne(String annualProjectedOne);

	/**
	 * Returns the annual projected two of this tourism new attraction form second.
	 *
	 * @return the annual projected two of this tourism new attraction form second
	 */
	@AutoEscape
	public String getAnnualProjectedTwo();

	/**
	 * Sets the annual projected two of this tourism new attraction form second.
	 *
	 * @param annualProjectedTwo the annual projected two of this tourism new attraction form second
	 */
	public void setAnnualProjectedTwo(String annualProjectedTwo);

	/**
	 * Returns the annual projected three of this tourism new attraction form second.
	 *
	 * @return the annual projected three of this tourism new attraction form second
	 */
	@AutoEscape
	public String getAnnualProjectedThree();

	/**
	 * Sets the annual projected three of this tourism new attraction form second.
	 *
	 * @param annualProjectedThree  the annual projected three of this tourism new attraction form second
	 */
	public void setAnnualProjectedThree(String annualProjectedThree);

	/**
	 * Returns the annual projected number of this tourism new attraction form second.
	 *
	 * @return the annual projected number of this tourism new attraction form second
	 */
	@AutoEscape
	public String getAnnualProjectedNumber();

	/**
	 * Sets the annual projected number of this tourism new attraction form second.
	 *
	 * @param annualProjectedNumber the annual projected number of this tourism new attraction form second
	 */
	public void setAnnualProjectedNumber(String annualProjectedNumber);

	/**
	 * Returns the tourism application ID of this tourism new attraction form second.
	 *
	 * @return the tourism application ID of this tourism new attraction form second
	 */
	public long getTourismApplicationId();

	/**
	 * Sets the tourism application ID of this tourism new attraction form second.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism new attraction form second
	 */
	public void setTourismApplicationId(long tourismApplicationId);

	@Override
	public TourismNewAttractionFormSecond cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
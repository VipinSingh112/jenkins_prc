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
 * The base model interface for the TourismBonaWaterSportsFormSecond service. Represents a row in the &quot;nbp_tourism_bona_water_ssf&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormSecondModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaWaterSportsFormSecondImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaWaterSportsFormSecond
 * @generated
 */
@ProviderType
public interface TourismBonaWaterSportsFormSecondModel
	extends BaseModel<TourismBonaWaterSportsFormSecond>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tourism bona water sports form second model instance should use the {@link TourismBonaWaterSportsFormSecond} interface instead.
	 */

	/**
	 * Returns the primary key of this tourism bona water sports form second.
	 *
	 * @return the primary key of this tourism bona water sports form second
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tourism bona water sports form second.
	 *
	 * @param primaryKey the primary key of this tourism bona water sports form second
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tourism bona water sports f sec ID of this tourism bona water sports form second.
	 *
	 * @return the tourism bona water sports f sec ID of this tourism bona water sports form second
	 */
	public long getTourismBonaWaterSportsFSecId();

	/**
	 * Sets the tourism bona water sports f sec ID of this tourism bona water sports form second.
	 *
	 * @param tourismBonaWaterSportsFSecId the tourism bona water sports f sec ID of this tourism bona water sports form second
	 */
	public void setTourismBonaWaterSportsFSecId(
		long tourismBonaWaterSportsFSecId);

	/**
	 * Returns the group ID of this tourism bona water sports form second.
	 *
	 * @return the group ID of this tourism bona water sports form second
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tourism bona water sports form second.
	 *
	 * @param groupId the group ID of this tourism bona water sports form second
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tourism bona water sports form second.
	 *
	 * @return the company ID of this tourism bona water sports form second
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tourism bona water sports form second.
	 *
	 * @param companyId the company ID of this tourism bona water sports form second
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tourism bona water sports form second.
	 *
	 * @return the user ID of this tourism bona water sports form second
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tourism bona water sports form second.
	 *
	 * @param userId the user ID of this tourism bona water sports form second
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tourism bona water sports form second.
	 *
	 * @return the user uuid of this tourism bona water sports form second
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tourism bona water sports form second.
	 *
	 * @param userUuid the user uuid of this tourism bona water sports form second
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tourism bona water sports form second.
	 *
	 * @return the user name of this tourism bona water sports form second
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tourism bona water sports form second.
	 *
	 * @param userName the user name of this tourism bona water sports form second
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tourism bona water sports form second.
	 *
	 * @return the create date of this tourism bona water sports form second
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tourism bona water sports form second.
	 *
	 * @param createDate the create date of this tourism bona water sports form second
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tourism bona water sports form second.
	 *
	 * @return the modified date of this tourism bona water sports form second
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tourism bona water sports form second.
	 *
	 * @param modifiedDate the modified date of this tourism bona water sports form second
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the bona target market local of this tourism bona water sports form second.
	 *
	 * @return the bona target market local of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaTargetMarketLocal();

	/**
	 * Sets the bona target market local of this tourism bona water sports form second.
	 *
	 * @param bonaTargetMarketLocal the bona target market local of this tourism bona water sports form second
	 */
	public void setBonaTargetMarketLocal(String bonaTargetMarketLocal);

	/**
	 * Returns the bona target market foreign of this tourism bona water sports form second.
	 *
	 * @return the bona target market foreign of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaTargetMarketForeign();

	/**
	 * Sets the bona target market foreign of this tourism bona water sports form second.
	 *
	 * @param bonaTargetMarketForeign the bona target market foreign of this tourism bona water sports form second
	 */
	public void setBonaTargetMarketForeign(String bonaTargetMarketForeign);

	/**
	 * Returns the bona target market countries of this tourism bona water sports form second.
	 *
	 * @return the bona target market countries of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaTargetMarketCountries();

	/**
	 * Sets the bona target market countries of this tourism bona water sports form second.
	 *
	 * @param bonaTargetMarketCountries the bona target market countries of this tourism bona water sports form second
	 */
	public void setBonaTargetMarketCountries(String bonaTargetMarketCountries);

	/**
	 * Returns the bona owner country of origin of this tourism bona water sports form second.
	 *
	 * @return the bona owner country of origin of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaOwnerCountryOfOrigin();

	/**
	 * Sets the bona owner country of origin of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerCountryOfOrigin the bona owner country of origin of this tourism bona water sports form second
	 */
	public void setBonaOwnerCountryOfOrigin(String bonaOwnerCountryOfOrigin);

	/**
	 * Returns the bona owner joint venture of this tourism bona water sports form second.
	 *
	 * @return the bona owner joint venture of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaOwnerJointVenture();

	/**
	 * Sets the bona owner joint venture of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerJointVenture the bona owner joint venture of this tourism bona water sports form second
	 */
	public void setBonaOwnerJointVenture(String bonaOwnerJointVenture);

	/**
	 * Returns the bona owner local of this tourism bona water sports form second.
	 *
	 * @return the bona owner local of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaOwnerLocal();

	/**
	 * Sets the bona owner local of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerLocal the bona owner local of this tourism bona water sports form second
	 */
	public void setBonaOwnerLocal(String bonaOwnerLocal);

	/**
	 * Returns the bona owner foreign of this tourism bona water sports form second.
	 *
	 * @return the bona owner foreign of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaOwnerForeign();

	/**
	 * Sets the bona owner foreign of this tourism bona water sports form second.
	 *
	 * @param bonaOwnerForeign the bona owner foreign of this tourism bona water sports form second
	 */
	public void setBonaOwnerForeign(String bonaOwnerForeign);

	/**
	 * Returns the bona capitalization us component of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization us component of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaCapitalizationUSComponent();

	/**
	 * Sets the bona capitalization us component of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationUSComponent the bona capitalization us component of this tourism bona water sports form second
	 */
	public void setBonaCapitalizationUSComponent(
		String bonaCapitalizationUSComponent);

	/**
	 * Returns the bona capitalization j equivalent of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization j equivalent of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaCapitalizationJEquivalent();

	/**
	 * Sets the bona capitalization j equivalent of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationJEquivalent the bona capitalization j equivalent of this tourism bona water sports form second
	 */
	public void setBonaCapitalizationJEquivalent(
		String bonaCapitalizationJEquivalent);

	/**
	 * Returns the bona capitalization rate exchange of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization rate exchange of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaCapitalizationRateExchange();

	/**
	 * Sets the bona capitalization rate exchange of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationRateExchange the bona capitalization rate exchange of this tourism bona water sports form second
	 */
	public void setBonaCapitalizationRateExchange(
		String bonaCapitalizationRateExchange);

	/**
	 * Returns the bona capitalization j component of this tourism bona water sports form second.
	 *
	 * @return the bona capitalization j component of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaCapitalizationJComponent();

	/**
	 * Sets the bona capitalization j component of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalizationJComponent the bona capitalization j component of this tourism bona water sports form second
	 */
	public void setBonaCapitalizationJComponent(
		String bonaCapitalizationJComponent);

	/**
	 * Returns the bona capital capital invest of this tourism bona water sports form second.
	 *
	 * @return the bona capital capital invest of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaCapitalCapitalInvest();

	/**
	 * Sets the bona capital capital invest of this tourism bona water sports form second.
	 *
	 * @param bonaCapitalCapitalInvest the bona capital capital invest of this tourism bona water sports form second
	 */
	public void setBonaCapitalCapitalInvest(String bonaCapitalCapitalInvest);

	/**
	 * Returns the bona sources loan of this tourism bona water sports form second.
	 *
	 * @return the bona sources loan of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaSourcesLoan();

	/**
	 * Sets the bona sources loan of this tourism bona water sports form second.
	 *
	 * @param bonaSourcesLoan  the bona sources loan of this tourism bona water sports form second
	 */
	public void setBonaSourcesLoan(String bonaSourcesLoan);

	/**
	 * Returns the bona sources equity of this tourism bona water sports form second.
	 *
	 * @return the bona sources equity of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaSourcesEquity();

	/**
	 * Sets the bona sources equity of this tourism bona water sports form second.
	 *
	 * @param bonaSourcesEquity the bona sources equity of this tourism bona water sports form second
	 */
	public void setBonaSourcesEquity(String bonaSourcesEquity);

	/**
	 * Returns the bona sources state of financ of this tourism bona water sports form second.
	 *
	 * @return the bona sources state of financ of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaSourcesStateOfFinanc();

	/**
	 * Sets the bona sources state of financ of this tourism bona water sports form second.
	 *
	 * @param bonaSourcesStateOfFinanc the bona sources state of financ of this tourism bona water sports form second
	 */
	public void setBonaSourcesStateOfFinanc(String bonaSourcesStateOfFinanc);

	/**
	 * Returns the bona annual projected one of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected one of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaAnnualProjectedOne();

	/**
	 * Sets the bona annual projected one of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedOne  the bona annual projected one of this tourism bona water sports form second
	 */
	public void setBonaAnnualProjectedOne(String bonaAnnualProjectedOne);

	/**
	 * Returns the bona annual projected two of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected two of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaAnnualProjectedTwo();

	/**
	 * Sets the bona annual projected two of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedTwo the bona annual projected two of this tourism bona water sports form second
	 */
	public void setBonaAnnualProjectedTwo(String bonaAnnualProjectedTwo);

	/**
	 * Returns the bona annual projected three of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected three of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaAnnualProjectedThree();

	/**
	 * Sets the bona annual projected three of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedThree  the bona annual projected three of this tourism bona water sports form second
	 */
	public void setBonaAnnualProjectedThree(String bonaAnnualProjectedThree);

	/**
	 * Returns the bona annual projected number of this tourism bona water sports form second.
	 *
	 * @return the bona annual projected number of this tourism bona water sports form second
	 */
	@AutoEscape
	public String getBonaAnnualProjectedNumber();

	/**
	 * Sets the bona annual projected number of this tourism bona water sports form second.
	 *
	 * @param bonaAnnualProjectedNumber the bona annual projected number of this tourism bona water sports form second
	 */
	public void setBonaAnnualProjectedNumber(String bonaAnnualProjectedNumber);

	/**
	 * Returns the tourism application ID of this tourism bona water sports form second.
	 *
	 * @return the tourism application ID of this tourism bona water sports form second
	 */
	public long getTourismApplicationId();

	/**
	 * Sets the tourism application ID of this tourism bona water sports form second.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona water sports form second
	 */
	public void setTourismApplicationId(long tourismApplicationId);

	@Override
	public TourismBonaWaterSportsFormSecond cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
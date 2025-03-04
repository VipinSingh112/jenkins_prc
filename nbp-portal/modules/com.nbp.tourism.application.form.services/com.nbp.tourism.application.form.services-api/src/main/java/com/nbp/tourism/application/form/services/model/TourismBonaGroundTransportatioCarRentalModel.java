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
 * The base model interface for the TourismBonaGroundTransportatioCarRental service. Represents a row in the &quot;nbp_tourism_bona_ground_tcr&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.tourism.application.form.services.model.impl.TourismBonaGroundTransportatioCarRentalImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundTransportatioCarRental
 * @generated
 */
@ProviderType
public interface TourismBonaGroundTransportatioCarRentalModel
	extends BaseModel<TourismBonaGroundTransportatioCarRental>, GroupedModel,
			ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a tourism bona ground transportatio car rental model instance should use the {@link TourismBonaGroundTransportatioCarRental} interface instead.
	 */

	/**
	 * Returns the primary key of this tourism bona ground transportatio car rental.
	 *
	 * @return the primary key of this tourism bona ground transportatio car rental
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this tourism bona ground transportatio car rental.
	 *
	 * @param primaryKey the primary key of this tourism bona ground transportatio car rental
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental
	 */
	public long getTourismBonaGroundTransportCRId();

	/**
	 * Sets the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental.
	 *
	 * @param tourismBonaGroundTransportCRId the tourism bona ground transport cr ID of this tourism bona ground transportatio car rental
	 */
	public void setTourismBonaGroundTransportCRId(
		long tourismBonaGroundTransportCRId);

	/**
	 * Returns the group ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the group ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this tourism bona ground transportatio car rental.
	 *
	 * @param groupId the group ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the company ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this tourism bona ground transportatio car rental.
	 *
	 * @param companyId the company ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the user ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this tourism bona ground transportatio car rental.
	 *
	 * @param userId the user ID of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this tourism bona ground transportatio car rental.
	 *
	 * @return the user uuid of this tourism bona ground transportatio car rental
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this tourism bona ground transportatio car rental.
	 *
	 * @param userUuid the user uuid of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this tourism bona ground transportatio car rental.
	 *
	 * @return the user name of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this tourism bona ground transportatio car rental.
	 *
	 * @param userName the user name of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this tourism bona ground transportatio car rental.
	 *
	 * @return the create date of this tourism bona ground transportatio car rental
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this tourism bona ground transportatio car rental.
	 *
	 * @param createDate the create date of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this tourism bona ground transportatio car rental.
	 *
	 * @return the modified date of this tourism bona ground transportatio car rental
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this tourism bona ground transportatio car rental.
	 *
	 * @param modifiedDate the modified date of this tourism bona ground transportatio car rental
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the type of ground transportation of this tourism bona ground transportatio car rental.
	 *
	 * @return the type of ground transportation of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getTypeOfGroundTransportation();

	/**
	 * Sets the type of ground transportation of this tourism bona ground transportatio car rental.
	 *
	 * @param TypeOfGroundTransportation the type of ground transportation of this tourism bona ground transportatio car rental
	 */
	public void setTypeOfGroundTransportation(
		String TypeOfGroundTransportation);

	/**
	 * Returns the bona ground date of application of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground date of application of this tourism bona ground transportatio car rental
	 */
	public Date getBonaGroundDateOfApplication();

	/**
	 * Sets the bona ground date of application of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundDateOfApplication the bona ground date of application of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundDateOfApplication(
		Date bonaGroundDateOfApplication);

	/**
	 * Returns the bona ground name of company of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground name of company of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundNameOfCompany();

	/**
	 * Sets the bona ground name of company of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundNameOfCompany the bona ground name of company of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundNameOfCompany(String bonaGroundNameOfCompany);

	/**
	 * Returns the bona ground trading name of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground trading name of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundTradingName();

	/**
	 * Sets the bona ground trading name of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTradingName the bona ground trading name of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundTradingName(String bonaGroundTradingName);

	/**
	 * Returns the bona ground company regis no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground company regis no of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundCompanyRegisNo();

	/**
	 * Sets the bona ground company regis no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCompanyRegisNo the bona ground company regis no of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundCompanyRegisNo(String bonaGroundCompanyRegisNo);

	/**
	 * Returns the bona ground telephon no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground telephon no of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundTelephonNo();

	/**
	 * Sets the bona ground telephon no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTelephonNo the bona ground telephon no of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundTelephonNo(String bonaGroundTelephonNo);

	/**
	 * Returns the bona ground address of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground address of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundAddress();

	/**
	 * Sets the bona ground address of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundAddress the bona ground address of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundAddress(String bonaGroundAddress);

	/**
	 * Returns the bona ground email address of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground email address of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundEmailAddress();

	/**
	 * Sets the bona ground email address of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundEmailAddress the bona ground email address of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundEmailAddress(String bonaGroundEmailAddress);

	/**
	 * Returns the bona ground contact person of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground contact person of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundContactPerson();

	/**
	 * Sets the bona ground contact person of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundContactPerson the bona ground contact person of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundContactPerson(String bonaGroundContactPerson);

	/**
	 * Returns the bona ground entity type of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground entity type of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundEntityType();

	/**
	 * Sets the bona ground entity type of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundEntityType the bona ground entity type of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundEntityType(String bonaGroundEntityType);

	/**
	 * Returns the bona ground tcc no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground tcc no of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundTccNo();

	/**
	 * Sets the bona ground tcc no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTccNo the bona ground tcc no of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundTccNo(String bonaGroundTccNo);

	/**
	 * Returns the bona ground expiry date of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground expiry date of this tourism bona ground transportatio car rental
	 */
	public Date getBonaGroundExpiryDate();

	/**
	 * Sets the bona ground expiry date of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundExpiryDate the bona ground expiry date of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundExpiryDate(Date bonaGroundExpiryDate);

	/**
	 * Returns the bona ground copy attached of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground copy attached of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundCopyAttached();

	/**
	 * Sets the bona ground copy attached of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCopyAttached the bona ground copy attached of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundCopyAttached(String bonaGroundCopyAttached);

	/**
	 * Returns the bona ground jtb license of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground jtb license of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundJtbLicense();

	/**
	 * Sets the bona ground jtb license of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundJtbLicense the bona ground jtb license of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundJtbLicense(String bonaGroundJtbLicense);

	/**
	 * Returns the bona ground expiry date two of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground expiry date two of this tourism bona ground transportatio car rental
	 */
	public Date getBonaGroundExpiryDateTwo();

	/**
	 * Sets the bona ground expiry date two of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundExpiryDateTwo the bona ground expiry date two of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundExpiryDateTwo(Date bonaGroundExpiryDateTwo);

	/**
	 * Returns the bona ground copy attached two of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground copy attached two of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundCopyAttachedTwo();

	/**
	 * Sets the bona ground copy attached two of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCopyAttachedTwo the bona ground copy attached two of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundCopyAttachedTwo(String bonaGroundCopyAttachedTwo);

	/**
	 * Returns the bona ground trn no of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground trn no of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundTrnNo();

	/**
	 * Sets the bona ground trn no of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTrnNo  the bona ground trn no of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundTrnNo(String bonaGroundTrnNo);

	/**
	 * Returns the bona ground year in business of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground year in business of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundYearInBusiness();

	/**
	 * Sets the bona ground year in business of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundYearInBusiness the bona ground year in business of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundYearInBusiness(String bonaGroundYearInBusiness);

	/**
	 * Returns the bona ground copy of reg attached of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground copy of reg attached of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundCopyOfRegAttached();

	/**
	 * Sets the bona ground copy of reg attached of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundCopyOfRegAttached  the bona ground copy of reg attached of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundCopyOfRegAttached(
		String bonaGroundCopyOfRegAttached);

	/**
	 * Returns the bona ground existing fleet amount of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground existing fleet amount of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundExistingFleetAmount();

	/**
	 * Sets the bona ground existing fleet amount of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundExistingFleetAmount the bona ground existing fleet amount of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundExistingFleetAmount(
		String bonaGroundExistingFleetAmount);

	/**
	 * Returns the bona ground total vehicles of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground total vehicles of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundTotalVehicles();

	/**
	 * Sets the bona ground total vehicles of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundTotalVehicles the bona ground total vehicles of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundTotalVehicles(String bonaGroundTotalVehicles);

	/**
	 * Returns the bona ground how addition to fleet of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground how addition to fleet of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundHowAdditionToFleet();

	/**
	 * Sets the bona ground how addition to fleet of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundHowAdditionToFleet the bona ground how addition to fleet of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundHowAdditionToFleet(
		String bonaGroundHowAdditionToFleet);

	/**
	 * Returns the bona ground replacement of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground replacement of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundReplacement();

	/**
	 * Sets the bona ground replacement of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundReplacement the bona ground replacement of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundReplacement(String bonaGroundReplacement);

	/**
	 * Returns the bona ground summary dealer of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary dealer of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundSummaryDealer();

	/**
	 * Sets the bona ground summary dealer of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryDealer the bona ground summary dealer of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundSummaryDealer(String bonaGroundSummaryDealer);

	/**
	 * Returns the bona ground summary num of vechicle of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary num of vechicle of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundSummaryNumOfVechicle();

	/**
	 * Sets the bona ground summary num of vechicle of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryNumOfVechicle the bona ground summary num of vechicle of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundSummaryNumOfVechicle(
		String bonaGroundSummaryNumOfVechicle);

	/**
	 * Returns the bona ground summar year of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summar year of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundSummarYear();

	/**
	 * Sets the bona ground summar year of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummarYear the bona ground summar year of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundSummarYear(String bonaGroundSummarYear);

	/**
	 * Returns the bona ground summary type of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary type of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundSummaryType();

	/**
	 * Sets the bona ground summary type of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryType the bona ground summary type of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundSummaryType(String bonaGroundSummaryType);

	/**
	 * Returns the bona ground summary cc rating of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary cc rating of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundSummaryCCRating();

	/**
	 * Sets the bona ground summary cc rating of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryCCRating the bona ground summary cc rating of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundSummaryCCRating(String bonaGroundSummaryCCRating);

	/**
	 * Returns the bona ground summary commentary of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground summary commentary of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundSummaryCommentary();

	/**
	 * Sets the bona ground summary commentary of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundSummaryCommentary the bona ground summary commentary of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundSummaryCommentary(
		String bonaGroundSummaryCommentary);

	/**
	 * Returns the bona ground description of this tourism bona ground transportatio car rental.
	 *
	 * @return the bona ground description of this tourism bona ground transportatio car rental
	 */
	@AutoEscape
	public String getBonaGroundDescription();

	/**
	 * Sets the bona ground description of this tourism bona ground transportatio car rental.
	 *
	 * @param bonaGroundDescription the bona ground description of this tourism bona ground transportatio car rental
	 */
	public void setBonaGroundDescription(String bonaGroundDescription);

	/**
	 * Returns the tourism application ID of this tourism bona ground transportatio car rental.
	 *
	 * @return the tourism application ID of this tourism bona ground transportatio car rental
	 */
	public long getTourismApplicationId();

	/**
	 * Sets the tourism application ID of this tourism bona ground transportatio car rental.
	 *
	 * @param tourismApplicationId the tourism application ID of this tourism bona ground transportatio car rental
	 */
	public void setTourismApplicationId(long tourismApplicationId);

	@Override
	public TourismBonaGroundTransportatioCarRental cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
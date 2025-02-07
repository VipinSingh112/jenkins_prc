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
 * The base model interface for the sezSubmissionChecklist service. Represents a row in the &quot;nbp_sez_dev_sub_checklist&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.nbp.sez.status.application.form.service.model.impl.sezSubmissionChecklistImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklist
 * @generated
 */
@ProviderType
public interface sezSubmissionChecklistModel
	extends BaseModel<sezSubmissionChecklist>, GroupedModel, ShardedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a sez submission checklist model instance should use the {@link sezSubmissionChecklist} interface instead.
	 */

	/**
	 * Returns the primary key of this sez submission checklist.
	 *
	 * @return the primary key of this sez submission checklist
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this sez submission checklist.
	 *
	 * @param primaryKey the primary key of this sez submission checklist
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the sez submission checklist ID of this sez submission checklist.
	 *
	 * @return the sez submission checklist ID of this sez submission checklist
	 */
	public long getSezSubmissionChecklistId();

	/**
	 * Sets the sez submission checklist ID of this sez submission checklist.
	 *
	 * @param sezSubmissionChecklistId the sez submission checklist ID of this sez submission checklist
	 */
	public void setSezSubmissionChecklistId(long sezSubmissionChecklistId);

	/**
	 * Returns the group ID of this sez submission checklist.
	 *
	 * @return the group ID of this sez submission checklist
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this sez submission checklist.
	 *
	 * @param groupId the group ID of this sez submission checklist
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this sez submission checklist.
	 *
	 * @return the company ID of this sez submission checklist
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this sez submission checklist.
	 *
	 * @param companyId the company ID of this sez submission checklist
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this sez submission checklist.
	 *
	 * @return the user ID of this sez submission checklist
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this sez submission checklist.
	 *
	 * @param userId the user ID of this sez submission checklist
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this sez submission checklist.
	 *
	 * @return the user uuid of this sez submission checklist
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this sez submission checklist.
	 *
	 * @param userUuid the user uuid of this sez submission checklist
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this sez submission checklist.
	 *
	 * @return the user name of this sez submission checklist
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this sez submission checklist.
	 *
	 * @param userName the user name of this sez submission checklist
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this sez submission checklist.
	 *
	 * @return the create date of this sez submission checklist
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this sez submission checklist.
	 *
	 * @param createDate the create date of this sez submission checklist
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this sez submission checklist.
	 *
	 * @return the modified date of this sez submission checklist
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this sez submission checklist.
	 *
	 * @param modifiedDate the modified date of this sez submission checklist
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the selected general of this sez submission checklist.
	 *
	 * @return the selected general of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedGeneral();

	/**
	 * Sets the selected general of this sez submission checklist.
	 *
	 * @param selectedGeneral the selected general of this sez submission checklist
	 */
	public void setSelectedGeneral(String selectedGeneral);

	/**
	 * Returns the selected com info req of this sez submission checklist.
	 *
	 * @return the selected com info req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedComInfoReq();

	/**
	 * Sets the selected com info req of this sez submission checklist.
	 *
	 * @param selectedComInfoReq the selected com info req of this sez submission checklist
	 */
	public void setSelectedComInfoReq(String selectedComInfoReq);

	/**
	 * Returns the paid share cap proof of this sez submission checklist.
	 *
	 * @return the paid share cap proof of this sez submission checklist
	 */
	@AutoEscape
	public String getPaidShareCapProof();

	/**
	 * Sets the paid share cap proof of this sez submission checklist.
	 *
	 * @param paidShareCapProof the paid share cap proof of this sez submission checklist
	 */
	public void setPaidShareCapProof(String paidShareCapProof);

	/**
	 * Returns the selected sworn state req of this sez submission checklist.
	 *
	 * @return the selected sworn state req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedSwornStateReq();

	/**
	 * Sets the selected sworn state req of this sez submission checklist.
	 *
	 * @param selectedSwornStateReq the selected sworn state req of this sez submission checklist
	 */
	public void setSelectedSwornStateReq(String selectedSwornStateReq);

	/**
	 * Returns the selected land occu req of this sez submission checklist.
	 *
	 * @return the selected land occu req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedLandOccuReq();

	/**
	 * Sets the selected land occu req of this sez submission checklist.
	 *
	 * @param selectedLandOccuReq the selected land occu req of this sez submission checklist
	 */
	public void setSelectedLandOccuReq(String selectedLandOccuReq);

	/**
	 * Returns the selected safety health req of this sez submission checklist.
	 *
	 * @return the selected safety health req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedSafetyHealthReq();

	/**
	 * Sets the selected safety health req of this sez submission checklist.
	 *
	 * @param selectedSafetyHealthReq the selected safety health req of this sez submission checklist
	 */
	public void setSelectedSafetyHealthReq(String selectedSafetyHealthReq);

	/**
	 * Returns the selected land devlopment req of this sez submission checklist.
	 *
	 * @return the selected land devlopment req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedLandDevlopmentReq();

	/**
	 * Sets the selected land devlopment req of this sez submission checklist.
	 *
	 * @param selectedLandDevlopmentReq the selected land devlopment req of this sez submission checklist
	 */
	public void setSelectedLandDevlopmentReq(String selectedLandDevlopmentReq);

	/**
	 * Returns the selected tech info req of this sez submission checklist.
	 *
	 * @return the selected tech info req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedTechInfoReq();

	/**
	 * Sets the selected tech info req of this sez submission checklist.
	 *
	 * @param selectedTechInfoReq the selected tech info req of this sez submission checklist
	 */
	public void setSelectedTechInfoReq(String selectedTechInfoReq);

	/**
	 * Returns the selected sez preliminary req of this sez submission checklist.
	 *
	 * @return the selected sez preliminary req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedSezPreliminaryReq();

	/**
	 * Sets the selected sez preliminary req of this sez submission checklist.
	 *
	 * @param selectedSezPreliminaryReq the selected sez preliminary req of this sez submission checklist
	 */
	public void setSelectedSezPreliminaryReq(String selectedSezPreliminaryReq);

	/**
	 * Returns the selected sez dev detail req of this sez submission checklist.
	 *
	 * @return the selected sez dev detail req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedSezDevDetailReq();

	/**
	 * Sets the selected sez dev detail req of this sez submission checklist.
	 *
	 * @param selectedSezDevDetailReq the selected sez dev detail req of this sez submission checklist
	 */
	public void setSelectedSezDevDetailReq(String selectedSezDevDetailReq);

	/**
	 * Returns the selected approval req of this sez submission checklist.
	 *
	 * @return the selected approval req of this sez submission checklist
	 */
	@AutoEscape
	public String getSelectedApprovalReq();

	/**
	 * Sets the selected approval req of this sez submission checklist.
	 *
	 * @param selectedApprovalReq the selected approval req of this sez submission checklist
	 */
	public void setSelectedApprovalReq(String selectedApprovalReq);

	/**
	 * Returns the name req of this sez submission checklist.
	 *
	 * @return the name req of this sez submission checklist
	 */
	@AutoEscape
	public String getNameReq();

	/**
	 * Sets the name req of this sez submission checklist.
	 *
	 * @param nameReq the name req of this sez submission checklist
	 */
	public void setNameReq(String nameReq);

	/**
	 * Returns the date req of this sez submission checklist.
	 *
	 * @return the date req of this sez submission checklist
	 */
	public Date getDateReq();

	/**
	 * Sets the date req of this sez submission checklist.
	 *
	 * @param dateReq the date req of this sez submission checklist
	 */
	public void setDateReq(Date dateReq);

	/**
	 * Returns the sez status application ID of this sez submission checklist.
	 *
	 * @return the sez status application ID of this sez submission checklist
	 */
	public long getSezStatusApplicationId();

	/**
	 * Sets the sez status application ID of this sez submission checklist.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez submission checklist
	 */
	public void setSezStatusApplicationId(long sezStatusApplicationId);

	@Override
	public sezSubmissionChecklist cloneWithOriginalValues();

	public default String toXmlString() {
		return null;
	}

}
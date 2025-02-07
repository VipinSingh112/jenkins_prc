/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link sezSubmissionChecklist}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezSubmissionChecklist
 * @generated
 */
public class sezSubmissionChecklistWrapper
	extends BaseModelWrapper<sezSubmissionChecklist>
	implements ModelWrapper<sezSubmissionChecklist>, sezSubmissionChecklist {

	public sezSubmissionChecklistWrapper(
		sezSubmissionChecklist sezSubmissionChecklist) {

		super(sezSubmissionChecklist);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"sezSubmissionChecklistId", getSezSubmissionChecklistId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("selectedGeneral", getSelectedGeneral());
		attributes.put("selectedComInfoReq", getSelectedComInfoReq());
		attributes.put("paidShareCapProof", getPaidShareCapProof());
		attributes.put("selectedSwornStateReq", getSelectedSwornStateReq());
		attributes.put("selectedLandOccuReq", getSelectedLandOccuReq());
		attributes.put("selectedSafetyHealthReq", getSelectedSafetyHealthReq());
		attributes.put(
			"selectedLandDevlopmentReq", getSelectedLandDevlopmentReq());
		attributes.put("selectedTechInfoReq", getSelectedTechInfoReq());
		attributes.put(
			"selectedSezPreliminaryReq", getSelectedSezPreliminaryReq());
		attributes.put("selectedSezDevDetailReq", getSelectedSezDevDetailReq());
		attributes.put("selectedApprovalReq", getSelectedApprovalReq());
		attributes.put("nameReq", getNameReq());
		attributes.put("dateReq", getDateReq());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezSubmissionChecklistId = (Long)attributes.get(
			"sezSubmissionChecklistId");

		if (sezSubmissionChecklistId != null) {
			setSezSubmissionChecklistId(sezSubmissionChecklistId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String selectedGeneral = (String)attributes.get("selectedGeneral");

		if (selectedGeneral != null) {
			setSelectedGeneral(selectedGeneral);
		}

		String selectedComInfoReq = (String)attributes.get(
			"selectedComInfoReq");

		if (selectedComInfoReq != null) {
			setSelectedComInfoReq(selectedComInfoReq);
		}

		String paidShareCapProof = (String)attributes.get("paidShareCapProof");

		if (paidShareCapProof != null) {
			setPaidShareCapProof(paidShareCapProof);
		}

		String selectedSwornStateReq = (String)attributes.get(
			"selectedSwornStateReq");

		if (selectedSwornStateReq != null) {
			setSelectedSwornStateReq(selectedSwornStateReq);
		}

		String selectedLandOccuReq = (String)attributes.get(
			"selectedLandOccuReq");

		if (selectedLandOccuReq != null) {
			setSelectedLandOccuReq(selectedLandOccuReq);
		}

		String selectedSafetyHealthReq = (String)attributes.get(
			"selectedSafetyHealthReq");

		if (selectedSafetyHealthReq != null) {
			setSelectedSafetyHealthReq(selectedSafetyHealthReq);
		}

		String selectedLandDevlopmentReq = (String)attributes.get(
			"selectedLandDevlopmentReq");

		if (selectedLandDevlopmentReq != null) {
			setSelectedLandDevlopmentReq(selectedLandDevlopmentReq);
		}

		String selectedTechInfoReq = (String)attributes.get(
			"selectedTechInfoReq");

		if (selectedTechInfoReq != null) {
			setSelectedTechInfoReq(selectedTechInfoReq);
		}

		String selectedSezPreliminaryReq = (String)attributes.get(
			"selectedSezPreliminaryReq");

		if (selectedSezPreliminaryReq != null) {
			setSelectedSezPreliminaryReq(selectedSezPreliminaryReq);
		}

		String selectedSezDevDetailReq = (String)attributes.get(
			"selectedSezDevDetailReq");

		if (selectedSezDevDetailReq != null) {
			setSelectedSezDevDetailReq(selectedSezDevDetailReq);
		}

		String selectedApprovalReq = (String)attributes.get(
			"selectedApprovalReq");

		if (selectedApprovalReq != null) {
			setSelectedApprovalReq(selectedApprovalReq);
		}

		String nameReq = (String)attributes.get("nameReq");

		if (nameReq != null) {
			setNameReq(nameReq);
		}

		Date dateReq = (Date)attributes.get("dateReq");

		if (dateReq != null) {
			setDateReq(dateReq);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public sezSubmissionChecklist cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez submission checklist.
	 *
	 * @return the company ID of this sez submission checklist
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez submission checklist.
	 *
	 * @return the create date of this sez submission checklist
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the date req of this sez submission checklist.
	 *
	 * @return the date req of this sez submission checklist
	 */
	@Override
	public Date getDateReq() {
		return model.getDateReq();
	}

	/**
	 * Returns the group ID of this sez submission checklist.
	 *
	 * @return the group ID of this sez submission checklist
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez submission checklist.
	 *
	 * @return the modified date of this sez submission checklist
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the name req of this sez submission checklist.
	 *
	 * @return the name req of this sez submission checklist
	 */
	@Override
	public String getNameReq() {
		return model.getNameReq();
	}

	/**
	 * Returns the paid share cap proof of this sez submission checklist.
	 *
	 * @return the paid share cap proof of this sez submission checklist
	 */
	@Override
	public String getPaidShareCapProof() {
		return model.getPaidShareCapProof();
	}

	/**
	 * Returns the primary key of this sez submission checklist.
	 *
	 * @return the primary key of this sez submission checklist
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the selected approval req of this sez submission checklist.
	 *
	 * @return the selected approval req of this sez submission checklist
	 */
	@Override
	public String getSelectedApprovalReq() {
		return model.getSelectedApprovalReq();
	}

	/**
	 * Returns the selected com info req of this sez submission checklist.
	 *
	 * @return the selected com info req of this sez submission checklist
	 */
	@Override
	public String getSelectedComInfoReq() {
		return model.getSelectedComInfoReq();
	}

	/**
	 * Returns the selected general of this sez submission checklist.
	 *
	 * @return the selected general of this sez submission checklist
	 */
	@Override
	public String getSelectedGeneral() {
		return model.getSelectedGeneral();
	}

	/**
	 * Returns the selected land devlopment req of this sez submission checklist.
	 *
	 * @return the selected land devlopment req of this sez submission checklist
	 */
	@Override
	public String getSelectedLandDevlopmentReq() {
		return model.getSelectedLandDevlopmentReq();
	}

	/**
	 * Returns the selected land occu req of this sez submission checklist.
	 *
	 * @return the selected land occu req of this sez submission checklist
	 */
	@Override
	public String getSelectedLandOccuReq() {
		return model.getSelectedLandOccuReq();
	}

	/**
	 * Returns the selected safety health req of this sez submission checklist.
	 *
	 * @return the selected safety health req of this sez submission checklist
	 */
	@Override
	public String getSelectedSafetyHealthReq() {
		return model.getSelectedSafetyHealthReq();
	}

	/**
	 * Returns the selected sez dev detail req of this sez submission checklist.
	 *
	 * @return the selected sez dev detail req of this sez submission checklist
	 */
	@Override
	public String getSelectedSezDevDetailReq() {
		return model.getSelectedSezDevDetailReq();
	}

	/**
	 * Returns the selected sez preliminary req of this sez submission checklist.
	 *
	 * @return the selected sez preliminary req of this sez submission checklist
	 */
	@Override
	public String getSelectedSezPreliminaryReq() {
		return model.getSelectedSezPreliminaryReq();
	}

	/**
	 * Returns the selected sworn state req of this sez submission checklist.
	 *
	 * @return the selected sworn state req of this sez submission checklist
	 */
	@Override
	public String getSelectedSwornStateReq() {
		return model.getSelectedSwornStateReq();
	}

	/**
	 * Returns the selected tech info req of this sez submission checklist.
	 *
	 * @return the selected tech info req of this sez submission checklist
	 */
	@Override
	public String getSelectedTechInfoReq() {
		return model.getSelectedTechInfoReq();
	}

	/**
	 * Returns the sez status application ID of this sez submission checklist.
	 *
	 * @return the sez status application ID of this sez submission checklist
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the sez submission checklist ID of this sez submission checklist.
	 *
	 * @return the sez submission checklist ID of this sez submission checklist
	 */
	@Override
	public long getSezSubmissionChecklistId() {
		return model.getSezSubmissionChecklistId();
	}

	/**
	 * Returns the user ID of this sez submission checklist.
	 *
	 * @return the user ID of this sez submission checklist
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez submission checklist.
	 *
	 * @return the user name of this sez submission checklist
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez submission checklist.
	 *
	 * @return the user uuid of this sez submission checklist
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this sez submission checklist.
	 *
	 * @param companyId the company ID of this sez submission checklist
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez submission checklist.
	 *
	 * @param createDate the create date of this sez submission checklist
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the date req of this sez submission checklist.
	 *
	 * @param dateReq the date req of this sez submission checklist
	 */
	@Override
	public void setDateReq(Date dateReq) {
		model.setDateReq(dateReq);
	}

	/**
	 * Sets the group ID of this sez submission checklist.
	 *
	 * @param groupId the group ID of this sez submission checklist
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez submission checklist.
	 *
	 * @param modifiedDate the modified date of this sez submission checklist
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the name req of this sez submission checklist.
	 *
	 * @param nameReq the name req of this sez submission checklist
	 */
	@Override
	public void setNameReq(String nameReq) {
		model.setNameReq(nameReq);
	}

	/**
	 * Sets the paid share cap proof of this sez submission checklist.
	 *
	 * @param paidShareCapProof the paid share cap proof of this sez submission checklist
	 */
	@Override
	public void setPaidShareCapProof(String paidShareCapProof) {
		model.setPaidShareCapProof(paidShareCapProof);
	}

	/**
	 * Sets the primary key of this sez submission checklist.
	 *
	 * @param primaryKey the primary key of this sez submission checklist
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the selected approval req of this sez submission checklist.
	 *
	 * @param selectedApprovalReq the selected approval req of this sez submission checklist
	 */
	@Override
	public void setSelectedApprovalReq(String selectedApprovalReq) {
		model.setSelectedApprovalReq(selectedApprovalReq);
	}

	/**
	 * Sets the selected com info req of this sez submission checklist.
	 *
	 * @param selectedComInfoReq the selected com info req of this sez submission checklist
	 */
	@Override
	public void setSelectedComInfoReq(String selectedComInfoReq) {
		model.setSelectedComInfoReq(selectedComInfoReq);
	}

	/**
	 * Sets the selected general of this sez submission checklist.
	 *
	 * @param selectedGeneral the selected general of this sez submission checklist
	 */
	@Override
	public void setSelectedGeneral(String selectedGeneral) {
		model.setSelectedGeneral(selectedGeneral);
	}

	/**
	 * Sets the selected land devlopment req of this sez submission checklist.
	 *
	 * @param selectedLandDevlopmentReq the selected land devlopment req of this sez submission checklist
	 */
	@Override
	public void setSelectedLandDevlopmentReq(String selectedLandDevlopmentReq) {
		model.setSelectedLandDevlopmentReq(selectedLandDevlopmentReq);
	}

	/**
	 * Sets the selected land occu req of this sez submission checklist.
	 *
	 * @param selectedLandOccuReq the selected land occu req of this sez submission checklist
	 */
	@Override
	public void setSelectedLandOccuReq(String selectedLandOccuReq) {
		model.setSelectedLandOccuReq(selectedLandOccuReq);
	}

	/**
	 * Sets the selected safety health req of this sez submission checklist.
	 *
	 * @param selectedSafetyHealthReq the selected safety health req of this sez submission checklist
	 */
	@Override
	public void setSelectedSafetyHealthReq(String selectedSafetyHealthReq) {
		model.setSelectedSafetyHealthReq(selectedSafetyHealthReq);
	}

	/**
	 * Sets the selected sez dev detail req of this sez submission checklist.
	 *
	 * @param selectedSezDevDetailReq the selected sez dev detail req of this sez submission checklist
	 */
	@Override
	public void setSelectedSezDevDetailReq(String selectedSezDevDetailReq) {
		model.setSelectedSezDevDetailReq(selectedSezDevDetailReq);
	}

	/**
	 * Sets the selected sez preliminary req of this sez submission checklist.
	 *
	 * @param selectedSezPreliminaryReq the selected sez preliminary req of this sez submission checklist
	 */
	@Override
	public void setSelectedSezPreliminaryReq(String selectedSezPreliminaryReq) {
		model.setSelectedSezPreliminaryReq(selectedSezPreliminaryReq);
	}

	/**
	 * Sets the selected sworn state req of this sez submission checklist.
	 *
	 * @param selectedSwornStateReq the selected sworn state req of this sez submission checklist
	 */
	@Override
	public void setSelectedSwornStateReq(String selectedSwornStateReq) {
		model.setSelectedSwornStateReq(selectedSwornStateReq);
	}

	/**
	 * Sets the selected tech info req of this sez submission checklist.
	 *
	 * @param selectedTechInfoReq the selected tech info req of this sez submission checklist
	 */
	@Override
	public void setSelectedTechInfoReq(String selectedTechInfoReq) {
		model.setSelectedTechInfoReq(selectedTechInfoReq);
	}

	/**
	 * Sets the sez status application ID of this sez submission checklist.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez submission checklist
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the sez submission checklist ID of this sez submission checklist.
	 *
	 * @param sezSubmissionChecklistId the sez submission checklist ID of this sez submission checklist
	 */
	@Override
	public void setSezSubmissionChecklistId(long sezSubmissionChecklistId) {
		model.setSezSubmissionChecklistId(sezSubmissionChecklistId);
	}

	/**
	 * Sets the user ID of this sez submission checklist.
	 *
	 * @param userId the user ID of this sez submission checklist
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez submission checklist.
	 *
	 * @param userName the user name of this sez submission checklist
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez submission checklist.
	 *
	 * @param userUuid the user uuid of this sez submission checklist
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected sezSubmissionChecklistWrapper wrap(
		sezSubmissionChecklist sezSubmissionChecklist) {

		return new sezSubmissionChecklistWrapper(sezSubmissionChecklist);
	}

}
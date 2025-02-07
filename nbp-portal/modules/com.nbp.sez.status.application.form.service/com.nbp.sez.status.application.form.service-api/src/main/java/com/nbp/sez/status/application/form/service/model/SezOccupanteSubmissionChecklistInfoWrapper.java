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
 * This class is a wrapper for {@link SezOccupanteSubmissionChecklistInfo}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see SezOccupanteSubmissionChecklistInfo
 * @generated
 */
public class SezOccupanteSubmissionChecklistInfoWrapper
	extends BaseModelWrapper<SezOccupanteSubmissionChecklistInfo>
	implements ModelWrapper<SezOccupanteSubmissionChecklistInfo>,
			   SezOccupanteSubmissionChecklistInfo {

	public SezOccupanteSubmissionChecklistInfoWrapper(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		super(sezOccupanteSubmissionChecklistInfo);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("sezOccCheckSubmitId", getSezOccCheckSubmitId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("occNameReq", getOccNameReq());
		attributes.put("occDateReq", getOccDateReq());
		attributes.put("occGeneral", getOccGeneral());
		attributes.put("occComInfoRequest", getOccComInfoRequest());
		attributes.put("occSwanStateRequest", getOccSwanStateRequest());
		attributes.put("occSelectedRequest", getOccSelectedRequest());
		attributes.put(
			"occSelectedFacilityRequest", getOccSelectedFacilityRequest());
		attributes.put("occSelectedApprovals", getOccSelectedApprovals());
		attributes.put(
			"occSelectedSecurityRequest", getOccSelectedSecurityRequest());
		attributes.put(
			"occSelectedSDetailedBussiness",
			getOccSelectedSDetailedBussiness());
		attributes.put("occPaidShareCapProof", getOccPaidShareCapProof());
		attributes.put("sezStatusApplicationId", getSezStatusApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long sezOccCheckSubmitId = (Long)attributes.get("sezOccCheckSubmitId");

		if (sezOccCheckSubmitId != null) {
			setSezOccCheckSubmitId(sezOccCheckSubmitId);
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

		String occNameReq = (String)attributes.get("occNameReq");

		if (occNameReq != null) {
			setOccNameReq(occNameReq);
		}

		String occDateReq = (String)attributes.get("occDateReq");

		if (occDateReq != null) {
			setOccDateReq(occDateReq);
		}

		String occGeneral = (String)attributes.get("occGeneral");

		if (occGeneral != null) {
			setOccGeneral(occGeneral);
		}

		String occComInfoRequest = (String)attributes.get("occComInfoRequest");

		if (occComInfoRequest != null) {
			setOccComInfoRequest(occComInfoRequest);
		}

		String occSwanStateRequest = (String)attributes.get(
			"occSwanStateRequest");

		if (occSwanStateRequest != null) {
			setOccSwanStateRequest(occSwanStateRequest);
		}

		String occSelectedRequest = (String)attributes.get(
			"occSelectedRequest");

		if (occSelectedRequest != null) {
			setOccSelectedRequest(occSelectedRequest);
		}

		String occSelectedFacilityRequest = (String)attributes.get(
			"occSelectedFacilityRequest");

		if (occSelectedFacilityRequest != null) {
			setOccSelectedFacilityRequest(occSelectedFacilityRequest);
		}

		String occSelectedApprovals = (String)attributes.get(
			"occSelectedApprovals");

		if (occSelectedApprovals != null) {
			setOccSelectedApprovals(occSelectedApprovals);
		}

		String occSelectedSecurityRequest = (String)attributes.get(
			"occSelectedSecurityRequest");

		if (occSelectedSecurityRequest != null) {
			setOccSelectedSecurityRequest(occSelectedSecurityRequest);
		}

		String occSelectedSDetailedBussiness = (String)attributes.get(
			"occSelectedSDetailedBussiness");

		if (occSelectedSDetailedBussiness != null) {
			setOccSelectedSDetailedBussiness(occSelectedSDetailedBussiness);
		}

		String occPaidShareCapProof = (String)attributes.get(
			"occPaidShareCapProof");

		if (occPaidShareCapProof != null) {
			setOccPaidShareCapProof(occPaidShareCapProof);
		}

		Long sezStatusApplicationId = (Long)attributes.get(
			"sezStatusApplicationId");

		if (sezStatusApplicationId != null) {
			setSezStatusApplicationId(sezStatusApplicationId);
		}
	}

	@Override
	public SezOccupanteSubmissionChecklistInfo cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this sez occupante submission checklist info.
	 *
	 * @return the company ID of this sez occupante submission checklist info
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this sez occupante submission checklist info.
	 *
	 * @return the create date of this sez occupante submission checklist info
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this sez occupante submission checklist info.
	 *
	 * @return the group ID of this sez occupante submission checklist info
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the modified date of this sez occupante submission checklist info.
	 *
	 * @return the modified date of this sez occupante submission checklist info
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the occ com info request of this sez occupante submission checklist info.
	 *
	 * @return the occ com info request of this sez occupante submission checklist info
	 */
	@Override
	public String getOccComInfoRequest() {
		return model.getOccComInfoRequest();
	}

	/**
	 * Returns the occ date req of this sez occupante submission checklist info.
	 *
	 * @return the occ date req of this sez occupante submission checklist info
	 */
	@Override
	public String getOccDateReq() {
		return model.getOccDateReq();
	}

	/**
	 * Returns the occ general of this sez occupante submission checklist info.
	 *
	 * @return the occ general of this sez occupante submission checklist info
	 */
	@Override
	public String getOccGeneral() {
		return model.getOccGeneral();
	}

	/**
	 * Returns the occ name req of this sez occupante submission checklist info.
	 *
	 * @return the occ name req of this sez occupante submission checklist info
	 */
	@Override
	public String getOccNameReq() {
		return model.getOccNameReq();
	}

	/**
	 * Returns the occ paid share cap proof of this sez occupante submission checklist info.
	 *
	 * @return the occ paid share cap proof of this sez occupante submission checklist info
	 */
	@Override
	public String getOccPaidShareCapProof() {
		return model.getOccPaidShareCapProof();
	}

	/**
	 * Returns the occ selected approvals of this sez occupante submission checklist info.
	 *
	 * @return the occ selected approvals of this sez occupante submission checklist info
	 */
	@Override
	public String getOccSelectedApprovals() {
		return model.getOccSelectedApprovals();
	}

	/**
	 * Returns the occ selected facility request of this sez occupante submission checklist info.
	 *
	 * @return the occ selected facility request of this sez occupante submission checklist info
	 */
	@Override
	public String getOccSelectedFacilityRequest() {
		return model.getOccSelectedFacilityRequest();
	}

	/**
	 * Returns the occ selected request of this sez occupante submission checklist info.
	 *
	 * @return the occ selected request of this sez occupante submission checklist info
	 */
	@Override
	public String getOccSelectedRequest() {
		return model.getOccSelectedRequest();
	}

	/**
	 * Returns the occ selected s detailed bussiness of this sez occupante submission checklist info.
	 *
	 * @return the occ selected s detailed bussiness of this sez occupante submission checklist info
	 */
	@Override
	public String getOccSelectedSDetailedBussiness() {
		return model.getOccSelectedSDetailedBussiness();
	}

	/**
	 * Returns the occ selected security request of this sez occupante submission checklist info.
	 *
	 * @return the occ selected security request of this sez occupante submission checklist info
	 */
	@Override
	public String getOccSelectedSecurityRequest() {
		return model.getOccSelectedSecurityRequest();
	}

	/**
	 * Returns the occ swan state request of this sez occupante submission checklist info.
	 *
	 * @return the occ swan state request of this sez occupante submission checklist info
	 */
	@Override
	public String getOccSwanStateRequest() {
		return model.getOccSwanStateRequest();
	}

	/**
	 * Returns the primary key of this sez occupante submission checklist info.
	 *
	 * @return the primary key of this sez occupante submission checklist info
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the sez occ check submit ID of this sez occupante submission checklist info.
	 *
	 * @return the sez occ check submit ID of this sez occupante submission checklist info
	 */
	@Override
	public long getSezOccCheckSubmitId() {
		return model.getSezOccCheckSubmitId();
	}

	/**
	 * Returns the sez status application ID of this sez occupante submission checklist info.
	 *
	 * @return the sez status application ID of this sez occupante submission checklist info
	 */
	@Override
	public long getSezStatusApplicationId() {
		return model.getSezStatusApplicationId();
	}

	/**
	 * Returns the user ID of this sez occupante submission checklist info.
	 *
	 * @return the user ID of this sez occupante submission checklist info
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this sez occupante submission checklist info.
	 *
	 * @return the user name of this sez occupante submission checklist info
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this sez occupante submission checklist info.
	 *
	 * @return the user uuid of this sez occupante submission checklist info
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
	 * Sets the company ID of this sez occupante submission checklist info.
	 *
	 * @param companyId the company ID of this sez occupante submission checklist info
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this sez occupante submission checklist info.
	 *
	 * @param createDate the create date of this sez occupante submission checklist info
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this sez occupante submission checklist info.
	 *
	 * @param groupId the group ID of this sez occupante submission checklist info
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the modified date of this sez occupante submission checklist info.
	 *
	 * @param modifiedDate the modified date of this sez occupante submission checklist info
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the occ com info request of this sez occupante submission checklist info.
	 *
	 * @param occComInfoRequest the occ com info request of this sez occupante submission checklist info
	 */
	@Override
	public void setOccComInfoRequest(String occComInfoRequest) {
		model.setOccComInfoRequest(occComInfoRequest);
	}

	/**
	 * Sets the occ date req of this sez occupante submission checklist info.
	 *
	 * @param occDateReq the occ date req of this sez occupante submission checklist info
	 */
	@Override
	public void setOccDateReq(String occDateReq) {
		model.setOccDateReq(occDateReq);
	}

	/**
	 * Sets the occ general of this sez occupante submission checklist info.
	 *
	 * @param occGeneral the occ general of this sez occupante submission checklist info
	 */
	@Override
	public void setOccGeneral(String occGeneral) {
		model.setOccGeneral(occGeneral);
	}

	/**
	 * Sets the occ name req of this sez occupante submission checklist info.
	 *
	 * @param occNameReq the occ name req of this sez occupante submission checklist info
	 */
	@Override
	public void setOccNameReq(String occNameReq) {
		model.setOccNameReq(occNameReq);
	}

	/**
	 * Sets the occ paid share cap proof of this sez occupante submission checklist info.
	 *
	 * @param occPaidShareCapProof the occ paid share cap proof of this sez occupante submission checklist info
	 */
	@Override
	public void setOccPaidShareCapProof(String occPaidShareCapProof) {
		model.setOccPaidShareCapProof(occPaidShareCapProof);
	}

	/**
	 * Sets the occ selected approvals of this sez occupante submission checklist info.
	 *
	 * @param occSelectedApprovals the occ selected approvals of this sez occupante submission checklist info
	 */
	@Override
	public void setOccSelectedApprovals(String occSelectedApprovals) {
		model.setOccSelectedApprovals(occSelectedApprovals);
	}

	/**
	 * Sets the occ selected facility request of this sez occupante submission checklist info.
	 *
	 * @param occSelectedFacilityRequest the occ selected facility request of this sez occupante submission checklist info
	 */
	@Override
	public void setOccSelectedFacilityRequest(
		String occSelectedFacilityRequest) {

		model.setOccSelectedFacilityRequest(occSelectedFacilityRequest);
	}

	/**
	 * Sets the occ selected request of this sez occupante submission checklist info.
	 *
	 * @param occSelectedRequest the occ selected request of this sez occupante submission checklist info
	 */
	@Override
	public void setOccSelectedRequest(String occSelectedRequest) {
		model.setOccSelectedRequest(occSelectedRequest);
	}

	/**
	 * Sets the occ selected s detailed bussiness of this sez occupante submission checklist info.
	 *
	 * @param occSelectedSDetailedBussiness the occ selected s detailed bussiness of this sez occupante submission checklist info
	 */
	@Override
	public void setOccSelectedSDetailedBussiness(
		String occSelectedSDetailedBussiness) {

		model.setOccSelectedSDetailedBussiness(occSelectedSDetailedBussiness);
	}

	/**
	 * Sets the occ selected security request of this sez occupante submission checklist info.
	 *
	 * @param occSelectedSecurityRequest the occ selected security request of this sez occupante submission checklist info
	 */
	@Override
	public void setOccSelectedSecurityRequest(
		String occSelectedSecurityRequest) {

		model.setOccSelectedSecurityRequest(occSelectedSecurityRequest);
	}

	/**
	 * Sets the occ swan state request of this sez occupante submission checklist info.
	 *
	 * @param occSwanStateRequest the occ swan state request of this sez occupante submission checklist info
	 */
	@Override
	public void setOccSwanStateRequest(String occSwanStateRequest) {
		model.setOccSwanStateRequest(occSwanStateRequest);
	}

	/**
	 * Sets the primary key of this sez occupante submission checklist info.
	 *
	 * @param primaryKey the primary key of this sez occupante submission checklist info
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the sez occ check submit ID of this sez occupante submission checklist info.
	 *
	 * @param sezOccCheckSubmitId the sez occ check submit ID of this sez occupante submission checklist info
	 */
	@Override
	public void setSezOccCheckSubmitId(long sezOccCheckSubmitId) {
		model.setSezOccCheckSubmitId(sezOccCheckSubmitId);
	}

	/**
	 * Sets the sez status application ID of this sez occupante submission checklist info.
	 *
	 * @param sezStatusApplicationId the sez status application ID of this sez occupante submission checklist info
	 */
	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		model.setSezStatusApplicationId(sezStatusApplicationId);
	}

	/**
	 * Sets the user ID of this sez occupante submission checklist info.
	 *
	 * @param userId the user ID of this sez occupante submission checklist info
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this sez occupante submission checklist info.
	 *
	 * @param userName the user name of this sez occupante submission checklist info
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this sez occupante submission checklist info.
	 *
	 * @param userUuid the user uuid of this sez occupante submission checklist info
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
	protected SezOccupanteSubmissionChecklistInfoWrapper wrap(
		SezOccupanteSubmissionChecklistInfo
			sezOccupanteSubmissionChecklistInfo) {

		return new SezOccupanteSubmissionChecklistInfoWrapper(
			sezOccupanteSubmissionChecklistInfo);
	}

}
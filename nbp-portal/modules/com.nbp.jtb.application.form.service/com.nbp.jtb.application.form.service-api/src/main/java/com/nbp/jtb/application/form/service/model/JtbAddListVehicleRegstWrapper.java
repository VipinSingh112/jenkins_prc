/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model;

import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link JtbAddListVehicleRegst}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see JtbAddListVehicleRegst
 * @generated
 */
public class JtbAddListVehicleRegstWrapper
	extends BaseModelWrapper<JtbAddListVehicleRegst>
	implements JtbAddListVehicleRegst, ModelWrapper<JtbAddListVehicleRegst> {

	public JtbAddListVehicleRegstWrapper(
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		super(jtbAddListVehicleRegst);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put(
			"jtbAddListVehicleRegstId", getJtbAddListVehicleRegstId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("counter", getCounter());
		attributes.put("vehicleRegstYear", getVehicleRegstYear());
		attributes.put("vehicleRegstModel", getVehicleRegstModel());
		attributes.put("vehicleRegstPlate", getVehicleRegstPlate());
		attributes.put("vehicleRegstExpDate", getVehicleRegstExpDate());
		attributes.put("vehicleRegstFitnessDate", getVehicleRegstFitnessDate());
		attributes.put("vehicleRegstChassis", getVehicleRegstChassis());
		attributes.put("vehicleRegstBased", getVehicleRegstBased());
		attributes.put(
			"vehicleRegstInsuranceCom", getVehicleRegstInsuranceCom());
		attributes.put("vehicleRegstPolicyNum", getVehicleRegstPolicyNum());
		attributes.put("vehicleRegstExpiryDate", getVehicleRegstExpiryDate());
		attributes.put("vehicleRegstPlateNum", getVehicleRegstPlateNum());
		attributes.put("jtbApplicationId", getJtbApplicationId());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long jtbAddListVehicleRegstId = (Long)attributes.get(
			"jtbAddListVehicleRegstId");

		if (jtbAddListVehicleRegstId != null) {
			setJtbAddListVehicleRegstId(jtbAddListVehicleRegstId);
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

		String counter = (String)attributes.get("counter");

		if (counter != null) {
			setCounter(counter);
		}

		String vehicleRegstYear = (String)attributes.get("vehicleRegstYear");

		if (vehicleRegstYear != null) {
			setVehicleRegstYear(vehicleRegstYear);
		}

		String vehicleRegstModel = (String)attributes.get("vehicleRegstModel");

		if (vehicleRegstModel != null) {
			setVehicleRegstModel(vehicleRegstModel);
		}

		String vehicleRegstPlate = (String)attributes.get("vehicleRegstPlate");

		if (vehicleRegstPlate != null) {
			setVehicleRegstPlate(vehicleRegstPlate);
		}

		Date vehicleRegstExpDate = (Date)attributes.get("vehicleRegstExpDate");

		if (vehicleRegstExpDate != null) {
			setVehicleRegstExpDate(vehicleRegstExpDate);
		}

		Date vehicleRegstFitnessDate = (Date)attributes.get(
			"vehicleRegstFitnessDate");

		if (vehicleRegstFitnessDate != null) {
			setVehicleRegstFitnessDate(vehicleRegstFitnessDate);
		}

		String vehicleRegstChassis = (String)attributes.get(
			"vehicleRegstChassis");

		if (vehicleRegstChassis != null) {
			setVehicleRegstChassis(vehicleRegstChassis);
		}

		String vehicleRegstBased = (String)attributes.get("vehicleRegstBased");

		if (vehicleRegstBased != null) {
			setVehicleRegstBased(vehicleRegstBased);
		}

		String vehicleRegstInsuranceCom = (String)attributes.get(
			"vehicleRegstInsuranceCom");

		if (vehicleRegstInsuranceCom != null) {
			setVehicleRegstInsuranceCom(vehicleRegstInsuranceCom);
		}

		String vehicleRegstPolicyNum = (String)attributes.get(
			"vehicleRegstPolicyNum");

		if (vehicleRegstPolicyNum != null) {
			setVehicleRegstPolicyNum(vehicleRegstPolicyNum);
		}

		Date vehicleRegstExpiryDate = (Date)attributes.get(
			"vehicleRegstExpiryDate");

		if (vehicleRegstExpiryDate != null) {
			setVehicleRegstExpiryDate(vehicleRegstExpiryDate);
		}

		String vehicleRegstPlateNum = (String)attributes.get(
			"vehicleRegstPlateNum");

		if (vehicleRegstPlateNum != null) {
			setVehicleRegstPlateNum(vehicleRegstPlateNum);
		}

		Long jtbApplicationId = (Long)attributes.get("jtbApplicationId");

		if (jtbApplicationId != null) {
			setJtbApplicationId(jtbApplicationId);
		}
	}

	@Override
	public JtbAddListVehicleRegst cloneWithOriginalValues() {
		return wrap(model.cloneWithOriginalValues());
	}

	/**
	 * Returns the company ID of this jtb add list vehicle regst.
	 *
	 * @return the company ID of this jtb add list vehicle regst
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the counter of this jtb add list vehicle regst.
	 *
	 * @return the counter of this jtb add list vehicle regst
	 */
	@Override
	public String getCounter() {
		return model.getCounter();
	}

	/**
	 * Returns the create date of this jtb add list vehicle regst.
	 *
	 * @return the create date of this jtb add list vehicle regst
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the group ID of this jtb add list vehicle regst.
	 *
	 * @return the group ID of this jtb add list vehicle regst
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the jtb add list vehicle regst ID of this jtb add list vehicle regst.
	 *
	 * @return the jtb add list vehicle regst ID of this jtb add list vehicle regst
	 */
	@Override
	public long getJtbAddListVehicleRegstId() {
		return model.getJtbAddListVehicleRegstId();
	}

	/**
	 * Returns the jtb application ID of this jtb add list vehicle regst.
	 *
	 * @return the jtb application ID of this jtb add list vehicle regst
	 */
	@Override
	public long getJtbApplicationId() {
		return model.getJtbApplicationId();
	}

	/**
	 * Returns the modified date of this jtb add list vehicle regst.
	 *
	 * @return the modified date of this jtb add list vehicle regst
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this jtb add list vehicle regst.
	 *
	 * @return the primary key of this jtb add list vehicle regst
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this jtb add list vehicle regst.
	 *
	 * @return the user ID of this jtb add list vehicle regst
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this jtb add list vehicle regst.
	 *
	 * @return the user name of this jtb add list vehicle regst
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this jtb add list vehicle regst.
	 *
	 * @return the user uuid of this jtb add list vehicle regst
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the vehicle regst based of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst based of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstBased() {
		return model.getVehicleRegstBased();
	}

	/**
	 * Returns the vehicle regst chassis of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst chassis of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstChassis() {
		return model.getVehicleRegstChassis();
	}

	/**
	 * Returns the vehicle regst exp date of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst exp date of this jtb add list vehicle regst
	 */
	@Override
	public Date getVehicleRegstExpDate() {
		return model.getVehicleRegstExpDate();
	}

	/**
	 * Returns the vehicle regst expiry date of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst expiry date of this jtb add list vehicle regst
	 */
	@Override
	public Date getVehicleRegstExpiryDate() {
		return model.getVehicleRegstExpiryDate();
	}

	/**
	 * Returns the vehicle regst fitness date of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst fitness date of this jtb add list vehicle regst
	 */
	@Override
	public Date getVehicleRegstFitnessDate() {
		return model.getVehicleRegstFitnessDate();
	}

	/**
	 * Returns the vehicle regst insurance com of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst insurance com of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstInsuranceCom() {
		return model.getVehicleRegstInsuranceCom();
	}

	/**
	 * Returns the vehicle regst model of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst model of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstModel() {
		return model.getVehicleRegstModel();
	}

	/**
	 * Returns the vehicle regst plate of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst plate of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstPlate() {
		return model.getVehicleRegstPlate();
	}

	/**
	 * Returns the vehicle regst plate num of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst plate num of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstPlateNum() {
		return model.getVehicleRegstPlateNum();
	}

	/**
	 * Returns the vehicle regst policy num of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst policy num of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstPolicyNum() {
		return model.getVehicleRegstPolicyNum();
	}

	/**
	 * Returns the vehicle regst year of this jtb add list vehicle regst.
	 *
	 * @return the vehicle regst year of this jtb add list vehicle regst
	 */
	@Override
	public String getVehicleRegstYear() {
		return model.getVehicleRegstYear();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this jtb add list vehicle regst.
	 *
	 * @param companyId the company ID of this jtb add list vehicle regst
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the counter of this jtb add list vehicle regst.
	 *
	 * @param counter the counter of this jtb add list vehicle regst
	 */
	@Override
	public void setCounter(String counter) {
		model.setCounter(counter);
	}

	/**
	 * Sets the create date of this jtb add list vehicle regst.
	 *
	 * @param createDate the create date of this jtb add list vehicle regst
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the group ID of this jtb add list vehicle regst.
	 *
	 * @param groupId the group ID of this jtb add list vehicle regst
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the jtb add list vehicle regst ID of this jtb add list vehicle regst.
	 *
	 * @param jtbAddListVehicleRegstId the jtb add list vehicle regst ID of this jtb add list vehicle regst
	 */
	@Override
	public void setJtbAddListVehicleRegstId(long jtbAddListVehicleRegstId) {
		model.setJtbAddListVehicleRegstId(jtbAddListVehicleRegstId);
	}

	/**
	 * Sets the jtb application ID of this jtb add list vehicle regst.
	 *
	 * @param jtbApplicationId the jtb application ID of this jtb add list vehicle regst
	 */
	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		model.setJtbApplicationId(jtbApplicationId);
	}

	/**
	 * Sets the modified date of this jtb add list vehicle regst.
	 *
	 * @param modifiedDate the modified date of this jtb add list vehicle regst
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this jtb add list vehicle regst.
	 *
	 * @param primaryKey the primary key of this jtb add list vehicle regst
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this jtb add list vehicle regst.
	 *
	 * @param userId the user ID of this jtb add list vehicle regst
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this jtb add list vehicle regst.
	 *
	 * @param userName the user name of this jtb add list vehicle regst
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this jtb add list vehicle regst.
	 *
	 * @param userUuid the user uuid of this jtb add list vehicle regst
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the vehicle regst based of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstBased the vehicle regst based of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstBased(String vehicleRegstBased) {
		model.setVehicleRegstBased(vehicleRegstBased);
	}

	/**
	 * Sets the vehicle regst chassis of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstChassis the vehicle regst chassis of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstChassis(String vehicleRegstChassis) {
		model.setVehicleRegstChassis(vehicleRegstChassis);
	}

	/**
	 * Sets the vehicle regst exp date of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstExpDate the vehicle regst exp date of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstExpDate(Date vehicleRegstExpDate) {
		model.setVehicleRegstExpDate(vehicleRegstExpDate);
	}

	/**
	 * Sets the vehicle regst expiry date of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstExpiryDate the vehicle regst expiry date of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstExpiryDate(Date vehicleRegstExpiryDate) {
		model.setVehicleRegstExpiryDate(vehicleRegstExpiryDate);
	}

	/**
	 * Sets the vehicle regst fitness date of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstFitnessDate the vehicle regst fitness date of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstFitnessDate(Date vehicleRegstFitnessDate) {
		model.setVehicleRegstFitnessDate(vehicleRegstFitnessDate);
	}

	/**
	 * Sets the vehicle regst insurance com of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstInsuranceCom the vehicle regst insurance com of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstInsuranceCom(String vehicleRegstInsuranceCom) {
		model.setVehicleRegstInsuranceCom(vehicleRegstInsuranceCom);
	}

	/**
	 * Sets the vehicle regst model of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstModel the vehicle regst model of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstModel(String vehicleRegstModel) {
		model.setVehicleRegstModel(vehicleRegstModel);
	}

	/**
	 * Sets the vehicle regst plate of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstPlate the vehicle regst plate of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstPlate(String vehicleRegstPlate) {
		model.setVehicleRegstPlate(vehicleRegstPlate);
	}

	/**
	 * Sets the vehicle regst plate num of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstPlateNum the vehicle regst plate num of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstPlateNum(String vehicleRegstPlateNum) {
		model.setVehicleRegstPlateNum(vehicleRegstPlateNum);
	}

	/**
	 * Sets the vehicle regst policy num of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstPolicyNum the vehicle regst policy num of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstPolicyNum(String vehicleRegstPolicyNum) {
		model.setVehicleRegstPolicyNum(vehicleRegstPolicyNum);
	}

	/**
	 * Sets the vehicle regst year of this jtb add list vehicle regst.
	 *
	 * @param vehicleRegstYear the vehicle regst year of this jtb add list vehicle regst
	 */
	@Override
	public void setVehicleRegstYear(String vehicleRegstYear) {
		model.setVehicleRegstYear(vehicleRegstYear);
	}

	@Override
	public String toXmlString() {
		return model.toXmlString();
	}

	@Override
	protected JtbAddListVehicleRegstWrapper wrap(
		JtbAddListVehicleRegst jtbAddListVehicleRegst) {

		return new JtbAddListVehicleRegstWrapper(jtbAddListVehicleRegst);
	}

}
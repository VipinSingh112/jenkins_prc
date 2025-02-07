/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.model.impl;

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.quary.application.form.service.model.QuarryGeneralInformation;
import com.nbp.quary.application.form.service.model.QuarryGeneralInformationModel;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.sql.Blob;
import java.sql.Types;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the QuarryGeneralInformation service. Represents a row in the &quot;nbp_quarry_general_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>QuarryGeneralInformationModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link QuarryGeneralInformationImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see QuarryGeneralInformationImpl
 * @generated
 */
@JSON(strict = true)
public class QuarryGeneralInformationModelImpl
	extends BaseModelImpl<QuarryGeneralInformation>
	implements QuarryGeneralInformationModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a quarry general information model instance should use the <code>QuarryGeneralInformation</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_quarry_general_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"generalInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"proposedNumberOfEmploy", Types.VARCHAR},
		{"nonRefundableFee", Types.VARCHAR},
		{"convictedUnderQuarryLaw", Types.VARCHAR},
		{"giveDetails", Types.VARCHAR}, {"licenseRefused", Types.VARCHAR},
		{"dateOfSignature", Types.TIMESTAMP},
		{"quarryApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("generalInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("proposedNumberOfEmploy", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nonRefundableFee", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("convictedUnderQuarryLaw", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("giveDetails", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("licenseRefused", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("dateOfSignature", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("quarryApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_quarry_general_info (generalInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,proposedNumberOfEmploy VARCHAR(75) null,nonRefundableFee VARCHAR(75) null,convictedUnderQuarryLaw VARCHAR(75) null,giveDetails VARCHAR(75) null,licenseRefused VARCHAR(75) null,dateOfSignature DATE null,quarryApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_quarry_general_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY quarryGeneralInformation.generalInfoId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_quarry_general_info.generalInfoId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long QUARRYAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long GENERALINFOID_COLUMN_BITMASK = 2L;

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
	}

	public QuarryGeneralInformationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _generalInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setGeneralInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _generalInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return QuarryGeneralInformation.class;
	}

	@Override
	public String getModelClassName() {
		return QuarryGeneralInformation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<QuarryGeneralInformation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<QuarryGeneralInformation, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuarryGeneralInformation, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((QuarryGeneralInformation)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<QuarryGeneralInformation, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<QuarryGeneralInformation, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(QuarryGeneralInformation)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<QuarryGeneralInformation, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<QuarryGeneralInformation, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<QuarryGeneralInformation, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<QuarryGeneralInformation, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<QuarryGeneralInformation, Object>>();

			attributeGetterFunctions.put(
				"generalInfoId", QuarryGeneralInformation::getGeneralInfoId);
			attributeGetterFunctions.put(
				"groupId", QuarryGeneralInformation::getGroupId);
			attributeGetterFunctions.put(
				"companyId", QuarryGeneralInformation::getCompanyId);
			attributeGetterFunctions.put(
				"userId", QuarryGeneralInformation::getUserId);
			attributeGetterFunctions.put(
				"userName", QuarryGeneralInformation::getUserName);
			attributeGetterFunctions.put(
				"createDate", QuarryGeneralInformation::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", QuarryGeneralInformation::getModifiedDate);
			attributeGetterFunctions.put(
				"proposedNumberOfEmploy",
				QuarryGeneralInformation::getProposedNumberOfEmploy);
			attributeGetterFunctions.put(
				"nonRefundableFee",
				QuarryGeneralInformation::getNonRefundableFee);
			attributeGetterFunctions.put(
				"convictedUnderQuarryLaw",
				QuarryGeneralInformation::getConvictedUnderQuarryLaw);
			attributeGetterFunctions.put(
				"giveDetails", QuarryGeneralInformation::getGiveDetails);
			attributeGetterFunctions.put(
				"licenseRefused", QuarryGeneralInformation::getLicenseRefused);
			attributeGetterFunctions.put(
				"dateOfSignature",
				QuarryGeneralInformation::getDateOfSignature);
			attributeGetterFunctions.put(
				"quarryApplicationId",
				QuarryGeneralInformation::getQuarryApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<QuarryGeneralInformation, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<QuarryGeneralInformation, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<QuarryGeneralInformation, ?>>();

			attributeSetterBiConsumers.put(
				"generalInfoId",
				(BiConsumer<QuarryGeneralInformation, Long>)
					QuarryGeneralInformation::setGeneralInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<QuarryGeneralInformation, Long>)
					QuarryGeneralInformation::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<QuarryGeneralInformation, Long>)
					QuarryGeneralInformation::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<QuarryGeneralInformation, Long>)
					QuarryGeneralInformation::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<QuarryGeneralInformation, String>)
					QuarryGeneralInformation::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<QuarryGeneralInformation, Date>)
					QuarryGeneralInformation::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<QuarryGeneralInformation, Date>)
					QuarryGeneralInformation::setModifiedDate);
			attributeSetterBiConsumers.put(
				"proposedNumberOfEmploy",
				(BiConsumer<QuarryGeneralInformation, String>)
					QuarryGeneralInformation::setProposedNumberOfEmploy);
			attributeSetterBiConsumers.put(
				"nonRefundableFee",
				(BiConsumer<QuarryGeneralInformation, String>)
					QuarryGeneralInformation::setNonRefundableFee);
			attributeSetterBiConsumers.put(
				"convictedUnderQuarryLaw",
				(BiConsumer<QuarryGeneralInformation, String>)
					QuarryGeneralInformation::setConvictedUnderQuarryLaw);
			attributeSetterBiConsumers.put(
				"giveDetails",
				(BiConsumer<QuarryGeneralInformation, String>)
					QuarryGeneralInformation::setGiveDetails);
			attributeSetterBiConsumers.put(
				"licenseRefused",
				(BiConsumer<QuarryGeneralInformation, String>)
					QuarryGeneralInformation::setLicenseRefused);
			attributeSetterBiConsumers.put(
				"dateOfSignature",
				(BiConsumer<QuarryGeneralInformation, Date>)
					QuarryGeneralInformation::setDateOfSignature);
			attributeSetterBiConsumers.put(
				"quarryApplicationId",
				(BiConsumer<QuarryGeneralInformation, Long>)
					QuarryGeneralInformation::setQuarryApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getGeneralInfoId() {
		return _generalInfoId;
	}

	@Override
	public void setGeneralInfoId(long generalInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_generalInfoId = generalInfoId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public String getProposedNumberOfEmploy() {
		if (_proposedNumberOfEmploy == null) {
			return "";
		}
		else {
			return _proposedNumberOfEmploy;
		}
	}

	@Override
	public void setProposedNumberOfEmploy(String proposedNumberOfEmploy) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_proposedNumberOfEmploy = proposedNumberOfEmploy;
	}

	@JSON
	@Override
	public String getNonRefundableFee() {
		if (_nonRefundableFee == null) {
			return "";
		}
		else {
			return _nonRefundableFee;
		}
	}

	@Override
	public void setNonRefundableFee(String nonRefundableFee) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nonRefundableFee = nonRefundableFee;
	}

	@JSON
	@Override
	public String getConvictedUnderQuarryLaw() {
		if (_convictedUnderQuarryLaw == null) {
			return "";
		}
		else {
			return _convictedUnderQuarryLaw;
		}
	}

	@Override
	public void setConvictedUnderQuarryLaw(String convictedUnderQuarryLaw) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_convictedUnderQuarryLaw = convictedUnderQuarryLaw;
	}

	@JSON
	@Override
	public String getGiveDetails() {
		if (_giveDetails == null) {
			return "";
		}
		else {
			return _giveDetails;
		}
	}

	@Override
	public void setGiveDetails(String giveDetails) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_giveDetails = giveDetails;
	}

	@JSON
	@Override
	public String getLicenseRefused() {
		if (_licenseRefused == null) {
			return "";
		}
		else {
			return _licenseRefused;
		}
	}

	@Override
	public void setLicenseRefused(String licenseRefused) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_licenseRefused = licenseRefused;
	}

	@JSON
	@Override
	public Date getDateOfSignature() {
		return _dateOfSignature;
	}

	@Override
	public void setDateOfSignature(Date dateOfSignature) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_dateOfSignature = dateOfSignature;
	}

	@JSON
	@Override
	public long getQuarryApplicationId() {
		return _quarryApplicationId;
	}

	@Override
	public void setQuarryApplicationId(long quarryApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_quarryApplicationId = quarryApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalQuarryApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("quarryApplicationId"));
	}

	public long getColumnBitmask() {
		if (_columnBitmask > 0) {
			return _columnBitmask;
		}

		if ((_columnOriginalValues == null) ||
			(_columnOriginalValues == Collections.EMPTY_MAP)) {

			return 0;
		}

		for (Map.Entry<String, Object> entry :
				_columnOriginalValues.entrySet()) {

			if (!Objects.equals(
					entry.getValue(), getColumnValue(entry.getKey()))) {

				_columnBitmask |= _columnBitmasks.get(entry.getKey());
			}
		}

		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), QuarryGeneralInformation.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public QuarryGeneralInformation toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, QuarryGeneralInformation>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		QuarryGeneralInformationImpl quarryGeneralInformationImpl =
			new QuarryGeneralInformationImpl();

		quarryGeneralInformationImpl.setGeneralInfoId(getGeneralInfoId());
		quarryGeneralInformationImpl.setGroupId(getGroupId());
		quarryGeneralInformationImpl.setCompanyId(getCompanyId());
		quarryGeneralInformationImpl.setUserId(getUserId());
		quarryGeneralInformationImpl.setUserName(getUserName());
		quarryGeneralInformationImpl.setCreateDate(getCreateDate());
		quarryGeneralInformationImpl.setModifiedDate(getModifiedDate());
		quarryGeneralInformationImpl.setProposedNumberOfEmploy(
			getProposedNumberOfEmploy());
		quarryGeneralInformationImpl.setNonRefundableFee(getNonRefundableFee());
		quarryGeneralInformationImpl.setConvictedUnderQuarryLaw(
			getConvictedUnderQuarryLaw());
		quarryGeneralInformationImpl.setGiveDetails(getGiveDetails());
		quarryGeneralInformationImpl.setLicenseRefused(getLicenseRefused());
		quarryGeneralInformationImpl.setDateOfSignature(getDateOfSignature());
		quarryGeneralInformationImpl.setQuarryApplicationId(
			getQuarryApplicationId());

		quarryGeneralInformationImpl.resetOriginalValues();

		return quarryGeneralInformationImpl;
	}

	@Override
	public QuarryGeneralInformation cloneWithOriginalValues() {
		QuarryGeneralInformationImpl quarryGeneralInformationImpl =
			new QuarryGeneralInformationImpl();

		quarryGeneralInformationImpl.setGeneralInfoId(
			this.<Long>getColumnOriginalValue("generalInfoId"));
		quarryGeneralInformationImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		quarryGeneralInformationImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		quarryGeneralInformationImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		quarryGeneralInformationImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		quarryGeneralInformationImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		quarryGeneralInformationImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		quarryGeneralInformationImpl.setProposedNumberOfEmploy(
			this.<String>getColumnOriginalValue("proposedNumberOfEmploy"));
		quarryGeneralInformationImpl.setNonRefundableFee(
			this.<String>getColumnOriginalValue("nonRefundableFee"));
		quarryGeneralInformationImpl.setConvictedUnderQuarryLaw(
			this.<String>getColumnOriginalValue("convictedUnderQuarryLaw"));
		quarryGeneralInformationImpl.setGiveDetails(
			this.<String>getColumnOriginalValue("giveDetails"));
		quarryGeneralInformationImpl.setLicenseRefused(
			this.<String>getColumnOriginalValue("licenseRefused"));
		quarryGeneralInformationImpl.setDateOfSignature(
			this.<Date>getColumnOriginalValue("dateOfSignature"));
		quarryGeneralInformationImpl.setQuarryApplicationId(
			this.<Long>getColumnOriginalValue("quarryApplicationId"));

		return quarryGeneralInformationImpl;
	}

	@Override
	public int compareTo(QuarryGeneralInformation quarryGeneralInformation) {
		long primaryKey = quarryGeneralInformation.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof QuarryGeneralInformation)) {
			return false;
		}

		QuarryGeneralInformation quarryGeneralInformation =
			(QuarryGeneralInformation)object;

		long primaryKey = quarryGeneralInformation.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isEntityCacheEnabled() {
		return true;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), with no direct replacement
	 */
	@Deprecated
	@Override
	public boolean isFinderCacheEnabled() {
		return true;
	}

	@Override
	public void resetOriginalValues() {
		_columnOriginalValues = Collections.emptyMap();

		_setModifiedDate = false;

		_columnBitmask = 0;
	}

	@Override
	public CacheModel<QuarryGeneralInformation> toCacheModel() {
		QuarryGeneralInformationCacheModel quarryGeneralInformationCacheModel =
			new QuarryGeneralInformationCacheModel();

		quarryGeneralInformationCacheModel.generalInfoId = getGeneralInfoId();

		quarryGeneralInformationCacheModel.groupId = getGroupId();

		quarryGeneralInformationCacheModel.companyId = getCompanyId();

		quarryGeneralInformationCacheModel.userId = getUserId();

		quarryGeneralInformationCacheModel.userName = getUserName();

		String userName = quarryGeneralInformationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			quarryGeneralInformationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			quarryGeneralInformationCacheModel.createDate =
				createDate.getTime();
		}
		else {
			quarryGeneralInformationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			quarryGeneralInformationCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			quarryGeneralInformationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		quarryGeneralInformationCacheModel.proposedNumberOfEmploy =
			getProposedNumberOfEmploy();

		String proposedNumberOfEmploy =
			quarryGeneralInformationCacheModel.proposedNumberOfEmploy;

		if ((proposedNumberOfEmploy != null) &&
			(proposedNumberOfEmploy.length() == 0)) {

			quarryGeneralInformationCacheModel.proposedNumberOfEmploy = null;
		}

		quarryGeneralInformationCacheModel.nonRefundableFee =
			getNonRefundableFee();

		String nonRefundableFee =
			quarryGeneralInformationCacheModel.nonRefundableFee;

		if ((nonRefundableFee != null) && (nonRefundableFee.length() == 0)) {
			quarryGeneralInformationCacheModel.nonRefundableFee = null;
		}

		quarryGeneralInformationCacheModel.convictedUnderQuarryLaw =
			getConvictedUnderQuarryLaw();

		String convictedUnderQuarryLaw =
			quarryGeneralInformationCacheModel.convictedUnderQuarryLaw;

		if ((convictedUnderQuarryLaw != null) &&
			(convictedUnderQuarryLaw.length() == 0)) {

			quarryGeneralInformationCacheModel.convictedUnderQuarryLaw = null;
		}

		quarryGeneralInformationCacheModel.giveDetails = getGiveDetails();

		String giveDetails = quarryGeneralInformationCacheModel.giveDetails;

		if ((giveDetails != null) && (giveDetails.length() == 0)) {
			quarryGeneralInformationCacheModel.giveDetails = null;
		}

		quarryGeneralInformationCacheModel.licenseRefused = getLicenseRefused();

		String licenseRefused =
			quarryGeneralInformationCacheModel.licenseRefused;

		if ((licenseRefused != null) && (licenseRefused.length() == 0)) {
			quarryGeneralInformationCacheModel.licenseRefused = null;
		}

		Date dateOfSignature = getDateOfSignature();

		if (dateOfSignature != null) {
			quarryGeneralInformationCacheModel.dateOfSignature =
				dateOfSignature.getTime();
		}
		else {
			quarryGeneralInformationCacheModel.dateOfSignature = Long.MIN_VALUE;
		}

		quarryGeneralInformationCacheModel.quarryApplicationId =
			getQuarryApplicationId();

		return quarryGeneralInformationCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<QuarryGeneralInformation, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<QuarryGeneralInformation, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<QuarryGeneralInformation, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(QuarryGeneralInformation)this);

			if (value == null) {
				sb.append("null");
			}
			else if (value instanceof Blob || value instanceof Date ||
					 value instanceof Map || value instanceof String) {

				sb.append(
					"\"" + StringUtil.replace(value.toString(), "\"", "'") +
						"\"");
			}
			else {
				sb.append(value);
			}

			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function
			<InvocationHandler, QuarryGeneralInformation>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						QuarryGeneralInformation.class, ModelWrapper.class);

	}

	private long _generalInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _proposedNumberOfEmploy;
	private String _nonRefundableFee;
	private String _convictedUnderQuarryLaw;
	private String _giveDetails;
	private String _licenseRefused;
	private Date _dateOfSignature;
	private long _quarryApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<QuarryGeneralInformation, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((QuarryGeneralInformation)this);
	}

	public <T> T getColumnOriginalValue(String columnName) {
		if (_columnOriginalValues == null) {
			return null;
		}

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		return (T)_columnOriginalValues.get(columnName);
	}

	private void _setColumnOriginalValues() {
		_columnOriginalValues = new HashMap<String, Object>();

		_columnOriginalValues.put("generalInfoId", _generalInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"proposedNumberOfEmploy", _proposedNumberOfEmploy);
		_columnOriginalValues.put("nonRefundableFee", _nonRefundableFee);
		_columnOriginalValues.put(
			"convictedUnderQuarryLaw", _convictedUnderQuarryLaw);
		_columnOriginalValues.put("giveDetails", _giveDetails);
		_columnOriginalValues.put("licenseRefused", _licenseRefused);
		_columnOriginalValues.put("dateOfSignature", _dateOfSignature);
		_columnOriginalValues.put("quarryApplicationId", _quarryApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("generalInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("proposedNumberOfEmploy", 128L);

		columnBitmasks.put("nonRefundableFee", 256L);

		columnBitmasks.put("convictedUnderQuarryLaw", 512L);

		columnBitmasks.put("giveDetails", 1024L);

		columnBitmasks.put("licenseRefused", 2048L);

		columnBitmasks.put("dateOfSignature", 4096L);

		columnBitmasks.put("quarryApplicationId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private QuarryGeneralInformation _escapedModel;

}
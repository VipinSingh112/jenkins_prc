/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.model.impl;

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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertaking;
import com.nbp.sez.status.application.form.service.model.sezDeveloperUndertakingModel;

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
 * The base model implementation for the sezDeveloperUndertaking service. Represents a row in the &quot;nbp_sez_dev_undertaking&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>sezDeveloperUndertakingModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link sezDeveloperUndertakingImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see sezDeveloperUndertakingImpl
 * @generated
 */
@JSON(strict = true)
public class sezDeveloperUndertakingModelImpl
	extends BaseModelImpl<sezDeveloperUndertaking>
	implements sezDeveloperUndertakingModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a sez developer undertaking model instance should use the <code>sezDeveloperUndertaking</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_sez_dev_undertaking";

	public static final Object[][] TABLE_COLUMNS = {
		{"sezDeveloperUndertakingId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"titleOfApplicant", Types.VARCHAR},
		{"nameOfApplicant", Types.VARCHAR}, {"telephoneNum", Types.VARCHAR},
		{"emailAddress", Types.VARCHAR},
		{"applicantSignatureDate", Types.TIMESTAMP},
		{"nameOfNotaryPublic", Types.VARCHAR},
		{"publicNotarySignatureDate", Types.TIMESTAMP},
		{"sezStatusApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("sezDeveloperUndertakingId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("titleOfApplicant", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("nameOfApplicant", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("telephoneNum", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("emailAddress", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("applicantSignatureDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("nameOfNotaryPublic", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("publicNotarySignatureDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("sezStatusApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_sez_dev_undertaking (sezDeveloperUndertakingId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,titleOfApplicant VARCHAR(75) null,nameOfApplicant VARCHAR(75) null,telephoneNum VARCHAR(75) null,emailAddress VARCHAR(75) null,applicantSignatureDate DATE null,nameOfNotaryPublic VARCHAR(75) null,publicNotarySignatureDate DATE null,sezStatusApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_sez_dev_undertaking";

	public static final String ORDER_BY_JPQL =
		" ORDER BY sezDeveloperUndertaking.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_sez_dev_undertaking.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long SEZSTATUSAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long CREATEDATE_COLUMN_BITMASK = 2L;

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

	public sezDeveloperUndertakingModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _sezDeveloperUndertakingId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setSezDeveloperUndertakingId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _sezDeveloperUndertakingId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return sezDeveloperUndertaking.class;
	}

	@Override
	public String getModelClassName() {
		return sezDeveloperUndertaking.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<sezDeveloperUndertaking, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<sezDeveloperUndertaking, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<sezDeveloperUndertaking, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((sezDeveloperUndertaking)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<sezDeveloperUndertaking, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<sezDeveloperUndertaking, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(sezDeveloperUndertaking)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<sezDeveloperUndertaking, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<sezDeveloperUndertaking, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<sezDeveloperUndertaking, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<sezDeveloperUndertaking, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<sezDeveloperUndertaking, Object>>();

			attributeGetterFunctions.put(
				"sezDeveloperUndertakingId",
				sezDeveloperUndertaking::getSezDeveloperUndertakingId);
			attributeGetterFunctions.put(
				"groupId", sezDeveloperUndertaking::getGroupId);
			attributeGetterFunctions.put(
				"companyId", sezDeveloperUndertaking::getCompanyId);
			attributeGetterFunctions.put(
				"userId", sezDeveloperUndertaking::getUserId);
			attributeGetterFunctions.put(
				"userName", sezDeveloperUndertaking::getUserName);
			attributeGetterFunctions.put(
				"createDate", sezDeveloperUndertaking::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", sezDeveloperUndertaking::getModifiedDate);
			attributeGetterFunctions.put(
				"titleOfApplicant",
				sezDeveloperUndertaking::getTitleOfApplicant);
			attributeGetterFunctions.put(
				"nameOfApplicant", sezDeveloperUndertaking::getNameOfApplicant);
			attributeGetterFunctions.put(
				"telephoneNum", sezDeveloperUndertaking::getTelephoneNum);
			attributeGetterFunctions.put(
				"emailAddress", sezDeveloperUndertaking::getEmailAddress);
			attributeGetterFunctions.put(
				"applicantSignatureDate",
				sezDeveloperUndertaking::getApplicantSignatureDate);
			attributeGetterFunctions.put(
				"nameOfNotaryPublic",
				sezDeveloperUndertaking::getNameOfNotaryPublic);
			attributeGetterFunctions.put(
				"publicNotarySignatureDate",
				sezDeveloperUndertaking::getPublicNotarySignatureDate);
			attributeGetterFunctions.put(
				"sezStatusApplicationId",
				sezDeveloperUndertaking::getSezStatusApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<sezDeveloperUndertaking, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<sezDeveloperUndertaking, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<sezDeveloperUndertaking, ?>>();

			attributeSetterBiConsumers.put(
				"sezDeveloperUndertakingId",
				(BiConsumer<sezDeveloperUndertaking, Long>)
					sezDeveloperUndertaking::setSezDeveloperUndertakingId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<sezDeveloperUndertaking, Long>)
					sezDeveloperUndertaking::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<sezDeveloperUndertaking, Long>)
					sezDeveloperUndertaking::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<sezDeveloperUndertaking, Long>)
					sezDeveloperUndertaking::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<sezDeveloperUndertaking, String>)
					sezDeveloperUndertaking::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<sezDeveloperUndertaking, Date>)
					sezDeveloperUndertaking::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<sezDeveloperUndertaking, Date>)
					sezDeveloperUndertaking::setModifiedDate);
			attributeSetterBiConsumers.put(
				"titleOfApplicant",
				(BiConsumer<sezDeveloperUndertaking, String>)
					sezDeveloperUndertaking::setTitleOfApplicant);
			attributeSetterBiConsumers.put(
				"nameOfApplicant",
				(BiConsumer<sezDeveloperUndertaking, String>)
					sezDeveloperUndertaking::setNameOfApplicant);
			attributeSetterBiConsumers.put(
				"telephoneNum",
				(BiConsumer<sezDeveloperUndertaking, String>)
					sezDeveloperUndertaking::setTelephoneNum);
			attributeSetterBiConsumers.put(
				"emailAddress",
				(BiConsumer<sezDeveloperUndertaking, String>)
					sezDeveloperUndertaking::setEmailAddress);
			attributeSetterBiConsumers.put(
				"applicantSignatureDate",
				(BiConsumer<sezDeveloperUndertaking, Date>)
					sezDeveloperUndertaking::setApplicantSignatureDate);
			attributeSetterBiConsumers.put(
				"nameOfNotaryPublic",
				(BiConsumer<sezDeveloperUndertaking, String>)
					sezDeveloperUndertaking::setNameOfNotaryPublic);
			attributeSetterBiConsumers.put(
				"publicNotarySignatureDate",
				(BiConsumer<sezDeveloperUndertaking, Date>)
					sezDeveloperUndertaking::setPublicNotarySignatureDate);
			attributeSetterBiConsumers.put(
				"sezStatusApplicationId",
				(BiConsumer<sezDeveloperUndertaking, Long>)
					sezDeveloperUndertaking::setSezStatusApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getSezDeveloperUndertakingId() {
		return _sezDeveloperUndertakingId;
	}

	@Override
	public void setSezDeveloperUndertakingId(long sezDeveloperUndertakingId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezDeveloperUndertakingId = sezDeveloperUndertakingId;
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
	public String getTitleOfApplicant() {
		if (_titleOfApplicant == null) {
			return "";
		}
		else {
			return _titleOfApplicant;
		}
	}

	@Override
	public void setTitleOfApplicant(String titleOfApplicant) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_titleOfApplicant = titleOfApplicant;
	}

	@JSON
	@Override
	public String getNameOfApplicant() {
		if (_nameOfApplicant == null) {
			return "";
		}
		else {
			return _nameOfApplicant;
		}
	}

	@Override
	public void setNameOfApplicant(String nameOfApplicant) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nameOfApplicant = nameOfApplicant;
	}

	@JSON
	@Override
	public String getTelephoneNum() {
		if (_telephoneNum == null) {
			return "";
		}
		else {
			return _telephoneNum;
		}
	}

	@Override
	public void setTelephoneNum(String telephoneNum) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_telephoneNum = telephoneNum;
	}

	@JSON
	@Override
	public String getEmailAddress() {
		if (_emailAddress == null) {
			return "";
		}
		else {
			return _emailAddress;
		}
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_emailAddress = emailAddress;
	}

	@JSON
	@Override
	public Date getApplicantSignatureDate() {
		return _applicantSignatureDate;
	}

	@Override
	public void setApplicantSignatureDate(Date applicantSignatureDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_applicantSignatureDate = applicantSignatureDate;
	}

	@JSON
	@Override
	public String getNameOfNotaryPublic() {
		if (_nameOfNotaryPublic == null) {
			return "";
		}
		else {
			return _nameOfNotaryPublic;
		}
	}

	@Override
	public void setNameOfNotaryPublic(String nameOfNotaryPublic) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_nameOfNotaryPublic = nameOfNotaryPublic;
	}

	@JSON
	@Override
	public Date getPublicNotarySignatureDate() {
		return _publicNotarySignatureDate;
	}

	@Override
	public void setPublicNotarySignatureDate(Date publicNotarySignatureDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_publicNotarySignatureDate = publicNotarySignatureDate;
	}

	@JSON
	@Override
	public long getSezStatusApplicationId() {
		return _sezStatusApplicationId;
	}

	@Override
	public void setSezStatusApplicationId(long sezStatusApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_sezStatusApplicationId = sezStatusApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalSezStatusApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));
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
			getCompanyId(), sezDeveloperUndertaking.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public sezDeveloperUndertaking toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, sezDeveloperUndertaking>
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
		sezDeveloperUndertakingImpl sezDeveloperUndertakingImpl =
			new sezDeveloperUndertakingImpl();

		sezDeveloperUndertakingImpl.setSezDeveloperUndertakingId(
			getSezDeveloperUndertakingId());
		sezDeveloperUndertakingImpl.setGroupId(getGroupId());
		sezDeveloperUndertakingImpl.setCompanyId(getCompanyId());
		sezDeveloperUndertakingImpl.setUserId(getUserId());
		sezDeveloperUndertakingImpl.setUserName(getUserName());
		sezDeveloperUndertakingImpl.setCreateDate(getCreateDate());
		sezDeveloperUndertakingImpl.setModifiedDate(getModifiedDate());
		sezDeveloperUndertakingImpl.setTitleOfApplicant(getTitleOfApplicant());
		sezDeveloperUndertakingImpl.setNameOfApplicant(getNameOfApplicant());
		sezDeveloperUndertakingImpl.setTelephoneNum(getTelephoneNum());
		sezDeveloperUndertakingImpl.setEmailAddress(getEmailAddress());
		sezDeveloperUndertakingImpl.setApplicantSignatureDate(
			getApplicantSignatureDate());
		sezDeveloperUndertakingImpl.setNameOfNotaryPublic(
			getNameOfNotaryPublic());
		sezDeveloperUndertakingImpl.setPublicNotarySignatureDate(
			getPublicNotarySignatureDate());
		sezDeveloperUndertakingImpl.setSezStatusApplicationId(
			getSezStatusApplicationId());

		sezDeveloperUndertakingImpl.resetOriginalValues();

		return sezDeveloperUndertakingImpl;
	}

	@Override
	public sezDeveloperUndertaking cloneWithOriginalValues() {
		sezDeveloperUndertakingImpl sezDeveloperUndertakingImpl =
			new sezDeveloperUndertakingImpl();

		sezDeveloperUndertakingImpl.setSezDeveloperUndertakingId(
			this.<Long>getColumnOriginalValue("sezDeveloperUndertakingId"));
		sezDeveloperUndertakingImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		sezDeveloperUndertakingImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		sezDeveloperUndertakingImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		sezDeveloperUndertakingImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		sezDeveloperUndertakingImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		sezDeveloperUndertakingImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		sezDeveloperUndertakingImpl.setTitleOfApplicant(
			this.<String>getColumnOriginalValue("titleOfApplicant"));
		sezDeveloperUndertakingImpl.setNameOfApplicant(
			this.<String>getColumnOriginalValue("nameOfApplicant"));
		sezDeveloperUndertakingImpl.setTelephoneNum(
			this.<String>getColumnOriginalValue("telephoneNum"));
		sezDeveloperUndertakingImpl.setEmailAddress(
			this.<String>getColumnOriginalValue("emailAddress"));
		sezDeveloperUndertakingImpl.setApplicantSignatureDate(
			this.<Date>getColumnOriginalValue("applicantSignatureDate"));
		sezDeveloperUndertakingImpl.setNameOfNotaryPublic(
			this.<String>getColumnOriginalValue("nameOfNotaryPublic"));
		sezDeveloperUndertakingImpl.setPublicNotarySignatureDate(
			this.<Date>getColumnOriginalValue("publicNotarySignatureDate"));
		sezDeveloperUndertakingImpl.setSezStatusApplicationId(
			this.<Long>getColumnOriginalValue("sezStatusApplicationId"));

		return sezDeveloperUndertakingImpl;
	}

	@Override
	public int compareTo(sezDeveloperUndertaking sezDeveloperUndertaking) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), sezDeveloperUndertaking.getCreateDate());

		value = value * -1;

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (this == object) {
			return true;
		}

		if (!(object instanceof sezDeveloperUndertaking)) {
			return false;
		}

		sezDeveloperUndertaking sezDeveloperUndertaking =
			(sezDeveloperUndertaking)object;

		long primaryKey = sezDeveloperUndertaking.getPrimaryKey();

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
	public CacheModel<sezDeveloperUndertaking> toCacheModel() {
		sezDeveloperUndertakingCacheModel sezDeveloperUndertakingCacheModel =
			new sezDeveloperUndertakingCacheModel();

		sezDeveloperUndertakingCacheModel.sezDeveloperUndertakingId =
			getSezDeveloperUndertakingId();

		sezDeveloperUndertakingCacheModel.groupId = getGroupId();

		sezDeveloperUndertakingCacheModel.companyId = getCompanyId();

		sezDeveloperUndertakingCacheModel.userId = getUserId();

		sezDeveloperUndertakingCacheModel.userName = getUserName();

		String userName = sezDeveloperUndertakingCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			sezDeveloperUndertakingCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			sezDeveloperUndertakingCacheModel.createDate = createDate.getTime();
		}
		else {
			sezDeveloperUndertakingCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			sezDeveloperUndertakingCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			sezDeveloperUndertakingCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		sezDeveloperUndertakingCacheModel.titleOfApplicant =
			getTitleOfApplicant();

		String titleOfApplicant =
			sezDeveloperUndertakingCacheModel.titleOfApplicant;

		if ((titleOfApplicant != null) && (titleOfApplicant.length() == 0)) {
			sezDeveloperUndertakingCacheModel.titleOfApplicant = null;
		}

		sezDeveloperUndertakingCacheModel.nameOfApplicant =
			getNameOfApplicant();

		String nameOfApplicant =
			sezDeveloperUndertakingCacheModel.nameOfApplicant;

		if ((nameOfApplicant != null) && (nameOfApplicant.length() == 0)) {
			sezDeveloperUndertakingCacheModel.nameOfApplicant = null;
		}

		sezDeveloperUndertakingCacheModel.telephoneNum = getTelephoneNum();

		String telephoneNum = sezDeveloperUndertakingCacheModel.telephoneNum;

		if ((telephoneNum != null) && (telephoneNum.length() == 0)) {
			sezDeveloperUndertakingCacheModel.telephoneNum = null;
		}

		sezDeveloperUndertakingCacheModel.emailAddress = getEmailAddress();

		String emailAddress = sezDeveloperUndertakingCacheModel.emailAddress;

		if ((emailAddress != null) && (emailAddress.length() == 0)) {
			sezDeveloperUndertakingCacheModel.emailAddress = null;
		}

		Date applicantSignatureDate = getApplicantSignatureDate();

		if (applicantSignatureDate != null) {
			sezDeveloperUndertakingCacheModel.applicantSignatureDate =
				applicantSignatureDate.getTime();
		}
		else {
			sezDeveloperUndertakingCacheModel.applicantSignatureDate =
				Long.MIN_VALUE;
		}

		sezDeveloperUndertakingCacheModel.nameOfNotaryPublic =
			getNameOfNotaryPublic();

		String nameOfNotaryPublic =
			sezDeveloperUndertakingCacheModel.nameOfNotaryPublic;

		if ((nameOfNotaryPublic != null) &&
			(nameOfNotaryPublic.length() == 0)) {

			sezDeveloperUndertakingCacheModel.nameOfNotaryPublic = null;
		}

		Date publicNotarySignatureDate = getPublicNotarySignatureDate();

		if (publicNotarySignatureDate != null) {
			sezDeveloperUndertakingCacheModel.publicNotarySignatureDate =
				publicNotarySignatureDate.getTime();
		}
		else {
			sezDeveloperUndertakingCacheModel.publicNotarySignatureDate =
				Long.MIN_VALUE;
		}

		sezDeveloperUndertakingCacheModel.sezStatusApplicationId =
			getSezStatusApplicationId();

		return sezDeveloperUndertakingCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<sezDeveloperUndertaking, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<sezDeveloperUndertaking, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<sezDeveloperUndertaking, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(sezDeveloperUndertaking)this);

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
			<InvocationHandler, sezDeveloperUndertaking>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						sezDeveloperUndertaking.class, ModelWrapper.class);

	}

	private long _sezDeveloperUndertakingId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _titleOfApplicant;
	private String _nameOfApplicant;
	private String _telephoneNum;
	private String _emailAddress;
	private Date _applicantSignatureDate;
	private String _nameOfNotaryPublic;
	private Date _publicNotarySignatureDate;
	private long _sezStatusApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<sezDeveloperUndertaking, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((sezDeveloperUndertaking)this);
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

		_columnOriginalValues.put(
			"sezDeveloperUndertakingId", _sezDeveloperUndertakingId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("titleOfApplicant", _titleOfApplicant);
		_columnOriginalValues.put("nameOfApplicant", _nameOfApplicant);
		_columnOriginalValues.put("telephoneNum", _telephoneNum);
		_columnOriginalValues.put("emailAddress", _emailAddress);
		_columnOriginalValues.put(
			"applicantSignatureDate", _applicantSignatureDate);
		_columnOriginalValues.put("nameOfNotaryPublic", _nameOfNotaryPublic);
		_columnOriginalValues.put(
			"publicNotarySignatureDate", _publicNotarySignatureDate);
		_columnOriginalValues.put(
			"sezStatusApplicationId", _sezStatusApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("sezDeveloperUndertakingId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("titleOfApplicant", 128L);

		columnBitmasks.put("nameOfApplicant", 256L);

		columnBitmasks.put("telephoneNum", 512L);

		columnBitmasks.put("emailAddress", 1024L);

		columnBitmasks.put("applicantSignatureDate", 2048L);

		columnBitmasks.put("nameOfNotaryPublic", 4096L);

		columnBitmasks.put("publicNotarySignatureDate", 8192L);

		columnBitmasks.put("sezStatusApplicationId", 16384L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private sezDeveloperUndertaking _escapedModel;

}
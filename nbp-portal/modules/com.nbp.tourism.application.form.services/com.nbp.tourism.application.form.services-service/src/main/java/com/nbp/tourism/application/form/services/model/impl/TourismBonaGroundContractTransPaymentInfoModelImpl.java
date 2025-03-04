/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.form.services.model.impl;

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

import com.nbp.tourism.application.form.services.model.TourismBonaGroundContractTransPaymentInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaGroundContractTransPaymentInfoModel;

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
 * The base model implementation for the TourismBonaGroundContractTransPaymentInfo service. Represents a row in the &quot;nbp_tourism_bona_gro_tranpay&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismBonaGroundContractTransPaymentInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaGroundContractTransPaymentInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaGroundContractTransPaymentInfoImpl
 * @generated
 */
@JSON(strict = true)
public class TourismBonaGroundContractTransPaymentInfoModelImpl
	extends BaseModelImpl<TourismBonaGroundContractTransPaymentInfo>
	implements TourismBonaGroundContractTransPaymentInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona ground contract trans payment info model instance should use the <code>TourismBonaGroundContractTransPaymentInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_bona_gro_tranpay";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismBonaGroTransPayId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"contractType", Types.VARCHAR},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismBonaGroTransPayId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("contractType", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_bona_gro_tranpay (tourismBonaGroTransPayId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,contractType VARCHAR(75) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_bona_gro_tranpay";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismBonaGroundContractTransPaymentInfo.tourismBonaGroTransPayId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_bona_gro_tranpay.tourismBonaGroTransPayId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TOURISMAPPLICATIONID_COLUMN_BITMASK = 1L;

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *		#getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long TOURISMBONAGROTRANSPAYID_COLUMN_BITMASK = 2L;

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

	public TourismBonaGroundContractTransPaymentInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismBonaGroTransPayId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismBonaGroTransPayId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismBonaGroTransPayId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismBonaGroundContractTransPaymentInfo.class;
	}

	@Override
	public String getModelClassName() {
		return TourismBonaGroundContractTransPaymentInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismBonaGroundContractTransPaymentInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry
				<String,
				 Function<TourismBonaGroundContractTransPaymentInfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaGroundContractTransPaymentInfo, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply(
					(TourismBonaGroundContractTransPaymentInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map
			<String,
			 BiConsumer<TourismBonaGroundContractTransPaymentInfo, Object>>
				attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismBonaGroundContractTransPaymentInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismBonaGroundContractTransPaymentInfo)this,
					entry.getValue());
			}
		}
	}

	public Map
		<String, Function<TourismBonaGroundContractTransPaymentInfo, Object>>
			getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map
		<String, BiConsumer<TourismBonaGroundContractTransPaymentInfo, Object>>
			getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String,
			 Function<TourismBonaGroundContractTransPaymentInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map
				<String,
				 Function<TourismBonaGroundContractTransPaymentInfo, Object>>
					attributeGetterFunctions =
						new LinkedHashMap
							<String,
							 Function
								 <TourismBonaGroundContractTransPaymentInfo,
								  Object>>();

			attributeGetterFunctions.put(
				"tourismBonaGroTransPayId",
				TourismBonaGroundContractTransPaymentInfo::
					getTourismBonaGroTransPayId);
			attributeGetterFunctions.put(
				"groupId",
				TourismBonaGroundContractTransPaymentInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId",
				TourismBonaGroundContractTransPaymentInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismBonaGroundContractTransPaymentInfo::getUserId);
			attributeGetterFunctions.put(
				"userName",
				TourismBonaGroundContractTransPaymentInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate",
				TourismBonaGroundContractTransPaymentInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate",
				TourismBonaGroundContractTransPaymentInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"contractType",
				TourismBonaGroundContractTransPaymentInfo::getContractType);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismBonaGroundContractTransPaymentInfo::
					getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String,
			 BiConsumer<TourismBonaGroundContractTransPaymentInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map
				<String,
				 BiConsumer<TourismBonaGroundContractTransPaymentInfo, ?>>
					attributeSetterBiConsumers =
						new LinkedHashMap
							<String,
							 BiConsumer
								 <TourismBonaGroundContractTransPaymentInfo,
								  ?>>();

			attributeSetterBiConsumers.put(
				"tourismBonaGroTransPayId",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, Long>)
					TourismBonaGroundContractTransPaymentInfo::
						setTourismBonaGroTransPayId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, Long>)
					TourismBonaGroundContractTransPaymentInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, Long>)
					TourismBonaGroundContractTransPaymentInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, Long>)
					TourismBonaGroundContractTransPaymentInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, String>)
					TourismBonaGroundContractTransPaymentInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, Date>)
					TourismBonaGroundContractTransPaymentInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, Date>)
					TourismBonaGroundContractTransPaymentInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"contractType",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, String>)
					TourismBonaGroundContractTransPaymentInfo::setContractType);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismBonaGroundContractTransPaymentInfo, Long>)
					TourismBonaGroundContractTransPaymentInfo::
						setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismBonaGroTransPayId() {
		return _tourismBonaGroTransPayId;
	}

	@Override
	public void setTourismBonaGroTransPayId(long tourismBonaGroTransPayId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismBonaGroTransPayId = tourismBonaGroTransPayId;
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
	public String getContractType() {
		if (_contractType == null) {
			return "";
		}
		else {
			return _contractType;
		}
	}

	@Override
	public void setContractType(String contractType) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_contractType = contractType;
	}

	@JSON
	@Override
	public long getTourismApplicationId() {
		return _tourismApplicationId;
	}

	@Override
	public void setTourismApplicationId(long tourismApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismApplicationId = tourismApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalTourismApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));
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
			getCompanyId(),
			TourismBonaGroundContractTransPaymentInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismBonaGroundContractTransPaymentInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function
				<InvocationHandler, TourismBonaGroundContractTransPaymentInfo>
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
		TourismBonaGroundContractTransPaymentInfoImpl
			tourismBonaGroundContractTransPaymentInfoImpl =
				new TourismBonaGroundContractTransPaymentInfoImpl();

		tourismBonaGroundContractTransPaymentInfoImpl.
			setTourismBonaGroTransPayId(getTourismBonaGroTransPayId());
		tourismBonaGroundContractTransPaymentInfoImpl.setGroupId(getGroupId());
		tourismBonaGroundContractTransPaymentInfoImpl.setCompanyId(
			getCompanyId());
		tourismBonaGroundContractTransPaymentInfoImpl.setUserId(getUserId());
		tourismBonaGroundContractTransPaymentInfoImpl.setUserName(
			getUserName());
		tourismBonaGroundContractTransPaymentInfoImpl.setCreateDate(
			getCreateDate());
		tourismBonaGroundContractTransPaymentInfoImpl.setModifiedDate(
			getModifiedDate());
		tourismBonaGroundContractTransPaymentInfoImpl.setContractType(
			getContractType());
		tourismBonaGroundContractTransPaymentInfoImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismBonaGroundContractTransPaymentInfoImpl.resetOriginalValues();

		return tourismBonaGroundContractTransPaymentInfoImpl;
	}

	@Override
	public TourismBonaGroundContractTransPaymentInfo cloneWithOriginalValues() {
		TourismBonaGroundContractTransPaymentInfoImpl
			tourismBonaGroundContractTransPaymentInfoImpl =
				new TourismBonaGroundContractTransPaymentInfoImpl();

		tourismBonaGroundContractTransPaymentInfoImpl.
			setTourismBonaGroTransPayId(
				this.<Long>getColumnOriginalValue("tourismBonaGroTransPayId"));
		tourismBonaGroundContractTransPaymentInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismBonaGroundContractTransPaymentInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismBonaGroundContractTransPaymentInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismBonaGroundContractTransPaymentInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismBonaGroundContractTransPaymentInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismBonaGroundContractTransPaymentInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismBonaGroundContractTransPaymentInfoImpl.setContractType(
			this.<String>getColumnOriginalValue("contractType"));
		tourismBonaGroundContractTransPaymentInfoImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismBonaGroundContractTransPaymentInfoImpl;
	}

	@Override
	public int compareTo(
		TourismBonaGroundContractTransPaymentInfo
			tourismBonaGroundContractTransPaymentInfo) {

		long primaryKey =
			tourismBonaGroundContractTransPaymentInfo.getPrimaryKey();

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

		if (!(object instanceof TourismBonaGroundContractTransPaymentInfo)) {
			return false;
		}

		TourismBonaGroundContractTransPaymentInfo
			tourismBonaGroundContractTransPaymentInfo =
				(TourismBonaGroundContractTransPaymentInfo)object;

		long primaryKey =
			tourismBonaGroundContractTransPaymentInfo.getPrimaryKey();

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
	public CacheModel<TourismBonaGroundContractTransPaymentInfo>
		toCacheModel() {

		TourismBonaGroundContractTransPaymentInfoCacheModel
			tourismBonaGroundContractTransPaymentInfoCacheModel =
				new TourismBonaGroundContractTransPaymentInfoCacheModel();

		tourismBonaGroundContractTransPaymentInfoCacheModel.
			tourismBonaGroTransPayId = getTourismBonaGroTransPayId();

		tourismBonaGroundContractTransPaymentInfoCacheModel.groupId =
			getGroupId();

		tourismBonaGroundContractTransPaymentInfoCacheModel.companyId =
			getCompanyId();

		tourismBonaGroundContractTransPaymentInfoCacheModel.userId =
			getUserId();

		tourismBonaGroundContractTransPaymentInfoCacheModel.userName =
			getUserName();

		String userName =
			tourismBonaGroundContractTransPaymentInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismBonaGroundContractTransPaymentInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismBonaGroundContractTransPaymentInfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismBonaGroundContractTransPaymentInfoCacheModel.createDate =
				Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismBonaGroundContractTransPaymentInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismBonaGroundContractTransPaymentInfoCacheModel.modifiedDate =
				Long.MIN_VALUE;
		}

		tourismBonaGroundContractTransPaymentInfoCacheModel.contractType =
			getContractType();

		String contractType =
			tourismBonaGroundContractTransPaymentInfoCacheModel.contractType;

		if ((contractType != null) && (contractType.length() == 0)) {
			tourismBonaGroundContractTransPaymentInfoCacheModel.contractType =
				null;
		}

		tourismBonaGroundContractTransPaymentInfoCacheModel.
			tourismApplicationId = getTourismApplicationId();

		return tourismBonaGroundContractTransPaymentInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismBonaGroundContractTransPaymentInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry
				<String,
				 Function<TourismBonaGroundContractTransPaymentInfo, Object>>
					entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaGroundContractTransPaymentInfo, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismBonaGroundContractTransPaymentInfo)this);

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
			<InvocationHandler, TourismBonaGroundContractTransPaymentInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismBonaGroundContractTransPaymentInfo.class,
						ModelWrapper.class);

	}

	private long _tourismBonaGroTransPayId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _contractType;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismBonaGroundContractTransPaymentInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply(
			(TourismBonaGroundContractTransPaymentInfo)this);
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
			"tourismBonaGroTransPayId", _tourismBonaGroTransPayId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("contractType", _contractType);
		_columnOriginalValues.put(
			"tourismApplicationId", _tourismApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("tourismBonaGroTransPayId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("contractType", 128L);

		columnBitmasks.put("tourismApplicationId", 256L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismBonaGroundContractTransPaymentInfo _escapedModel;

}
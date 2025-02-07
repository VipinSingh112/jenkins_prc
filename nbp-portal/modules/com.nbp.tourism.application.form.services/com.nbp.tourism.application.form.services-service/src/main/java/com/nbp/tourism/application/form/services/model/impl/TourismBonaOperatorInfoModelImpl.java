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

import com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaOperatorInfoModel;

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
 * The base model implementation for the TourismBonaOperatorInfo service. Represents a row in the &quot;nbp_tourism_bona_operator_info&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismBonaOperatorInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaOperatorInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaOperatorInfoImpl
 * @generated
 */
@JSON(strict = true)
public class TourismBonaOperatorInfoModelImpl
	extends BaseModelImpl<TourismBonaOperatorInfo>
	implements TourismBonaOperatorInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona operator info model instance should use the <code>TourismBonaOperatorInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_bona_operator_info";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismBonaOperatorInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP}, {"operatorName", Types.VARCHAR},
		{"operatorNumber", Types.VARCHAR}, {"issueDate", Types.TIMESTAMP},
		{"expirationDate", Types.TIMESTAMP}, {"categories", Types.VARCHAR},
		{"subCategories", Types.VARCHAR}, {"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismBonaOperatorInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("operatorName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("operatorNumber", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("issueDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("expirationDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("categories", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("subCategories", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_bona_operator_info (tourismBonaOperatorInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,operatorName VARCHAR(75) null,operatorNumber VARCHAR(75) null,issueDate DATE null,expirationDate DATE null,categories VARCHAR(75) null,subCategories VARCHAR(500) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_bona_operator_info";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismBonaOperatorInfo.tourismBonaOperatorInfoId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_bona_operator_info.tourismBonaOperatorInfoId ASC";

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
	public static final long TOURISMBONAOPERATORINFOID_COLUMN_BITMASK = 2L;

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

	public TourismBonaOperatorInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismBonaOperatorInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismBonaOperatorInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismBonaOperatorInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismBonaOperatorInfo.class;
	}

	@Override
	public String getModelClassName() {
		return TourismBonaOperatorInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismBonaOperatorInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismBonaOperatorInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaOperatorInfo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((TourismBonaOperatorInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismBonaOperatorInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismBonaOperatorInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismBonaOperatorInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismBonaOperatorInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismBonaOperatorInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismBonaOperatorInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismBonaOperatorInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<TourismBonaOperatorInfo, Object>>();

			attributeGetterFunctions.put(
				"tourismBonaOperatorInfoId",
				TourismBonaOperatorInfo::getTourismBonaOperatorInfoId);
			attributeGetterFunctions.put(
				"groupId", TourismBonaOperatorInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismBonaOperatorInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismBonaOperatorInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismBonaOperatorInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismBonaOperatorInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", TourismBonaOperatorInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"operatorName", TourismBonaOperatorInfo::getOperatorName);
			attributeGetterFunctions.put(
				"operatorNumber", TourismBonaOperatorInfo::getOperatorNumber);
			attributeGetterFunctions.put(
				"issueDate", TourismBonaOperatorInfo::getIssueDate);
			attributeGetterFunctions.put(
				"expirationDate", TourismBonaOperatorInfo::getExpirationDate);
			attributeGetterFunctions.put(
				"categories", TourismBonaOperatorInfo::getCategories);
			attributeGetterFunctions.put(
				"subCategories", TourismBonaOperatorInfo::getSubCategories);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismBonaOperatorInfo::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismBonaOperatorInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismBonaOperatorInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<TourismBonaOperatorInfo, ?>>();

			attributeSetterBiConsumers.put(
				"tourismBonaOperatorInfoId",
				(BiConsumer<TourismBonaOperatorInfo, Long>)
					TourismBonaOperatorInfo::setTourismBonaOperatorInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismBonaOperatorInfo, Long>)
					TourismBonaOperatorInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismBonaOperatorInfo, Long>)
					TourismBonaOperatorInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismBonaOperatorInfo, Long>)
					TourismBonaOperatorInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismBonaOperatorInfo, String>)
					TourismBonaOperatorInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismBonaOperatorInfo, Date>)
					TourismBonaOperatorInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismBonaOperatorInfo, Date>)
					TourismBonaOperatorInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"operatorName",
				(BiConsumer<TourismBonaOperatorInfo, String>)
					TourismBonaOperatorInfo::setOperatorName);
			attributeSetterBiConsumers.put(
				"operatorNumber",
				(BiConsumer<TourismBonaOperatorInfo, String>)
					TourismBonaOperatorInfo::setOperatorNumber);
			attributeSetterBiConsumers.put(
				"issueDate",
				(BiConsumer<TourismBonaOperatorInfo, Date>)
					TourismBonaOperatorInfo::setIssueDate);
			attributeSetterBiConsumers.put(
				"expirationDate",
				(BiConsumer<TourismBonaOperatorInfo, Date>)
					TourismBonaOperatorInfo::setExpirationDate);
			attributeSetterBiConsumers.put(
				"categories",
				(BiConsumer<TourismBonaOperatorInfo, String>)
					TourismBonaOperatorInfo::setCategories);
			attributeSetterBiConsumers.put(
				"subCategories",
				(BiConsumer<TourismBonaOperatorInfo, String>)
					TourismBonaOperatorInfo::setSubCategories);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismBonaOperatorInfo, Long>)
					TourismBonaOperatorInfo::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismBonaOperatorInfoId() {
		return _tourismBonaOperatorInfoId;
	}

	@Override
	public void setTourismBonaOperatorInfoId(long tourismBonaOperatorInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismBonaOperatorInfoId = tourismBonaOperatorInfoId;
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
	public String getOperatorName() {
		if (_operatorName == null) {
			return "";
		}
		else {
			return _operatorName;
		}
	}

	@Override
	public void setOperatorName(String operatorName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_operatorName = operatorName;
	}

	@JSON
	@Override
	public String getOperatorNumber() {
		if (_operatorNumber == null) {
			return "";
		}
		else {
			return _operatorNumber;
		}
	}

	@Override
	public void setOperatorNumber(String operatorNumber) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_operatorNumber = operatorNumber;
	}

	@JSON
	@Override
	public Date getIssueDate() {
		return _issueDate;
	}

	@Override
	public void setIssueDate(Date issueDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_issueDate = issueDate;
	}

	@JSON
	@Override
	public Date getExpirationDate() {
		return _expirationDate;
	}

	@Override
	public void setExpirationDate(Date expirationDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_expirationDate = expirationDate;
	}

	@JSON
	@Override
	public String getCategories() {
		if (_categories == null) {
			return "";
		}
		else {
			return _categories;
		}
	}

	@Override
	public void setCategories(String categories) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_categories = categories;
	}

	@JSON
	@Override
	public String getSubCategories() {
		if (_subCategories == null) {
			return "";
		}
		else {
			return _subCategories;
		}
	}

	@Override
	public void setSubCategories(String subCategories) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_subCategories = subCategories;
	}

	@JSON
	@Override
	public Long getTourismApplicationId() {
		return _tourismApplicationId;
	}

	@Override
	public void setTourismApplicationId(Long tourismApplicationId) {
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
	public Long getOriginalTourismApplicationId() {
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
			getCompanyId(), TourismBonaOperatorInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismBonaOperatorInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismBonaOperatorInfo>
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
		TourismBonaOperatorInfoImpl tourismBonaOperatorInfoImpl =
			new TourismBonaOperatorInfoImpl();

		tourismBonaOperatorInfoImpl.setTourismBonaOperatorInfoId(
			getTourismBonaOperatorInfoId());
		tourismBonaOperatorInfoImpl.setGroupId(getGroupId());
		tourismBonaOperatorInfoImpl.setCompanyId(getCompanyId());
		tourismBonaOperatorInfoImpl.setUserId(getUserId());
		tourismBonaOperatorInfoImpl.setUserName(getUserName());
		tourismBonaOperatorInfoImpl.setCreateDate(getCreateDate());
		tourismBonaOperatorInfoImpl.setModifiedDate(getModifiedDate());
		tourismBonaOperatorInfoImpl.setOperatorName(getOperatorName());
		tourismBonaOperatorInfoImpl.setOperatorNumber(getOperatorNumber());
		tourismBonaOperatorInfoImpl.setIssueDate(getIssueDate());
		tourismBonaOperatorInfoImpl.setExpirationDate(getExpirationDate());
		tourismBonaOperatorInfoImpl.setCategories(getCategories());
		tourismBonaOperatorInfoImpl.setSubCategories(getSubCategories());
		tourismBonaOperatorInfoImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismBonaOperatorInfoImpl.resetOriginalValues();

		return tourismBonaOperatorInfoImpl;
	}

	@Override
	public TourismBonaOperatorInfo cloneWithOriginalValues() {
		TourismBonaOperatorInfoImpl tourismBonaOperatorInfoImpl =
			new TourismBonaOperatorInfoImpl();

		tourismBonaOperatorInfoImpl.setTourismBonaOperatorInfoId(
			this.<Long>getColumnOriginalValue("tourismBonaOperatorInfoId"));
		tourismBonaOperatorInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismBonaOperatorInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismBonaOperatorInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismBonaOperatorInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismBonaOperatorInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismBonaOperatorInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismBonaOperatorInfoImpl.setOperatorName(
			this.<String>getColumnOriginalValue("operatorName"));
		tourismBonaOperatorInfoImpl.setOperatorNumber(
			this.<String>getColumnOriginalValue("operatorNumber"));
		tourismBonaOperatorInfoImpl.setIssueDate(
			this.<Date>getColumnOriginalValue("issueDate"));
		tourismBonaOperatorInfoImpl.setExpirationDate(
			this.<Date>getColumnOriginalValue("expirationDate"));
		tourismBonaOperatorInfoImpl.setCategories(
			this.<String>getColumnOriginalValue("categories"));
		tourismBonaOperatorInfoImpl.setSubCategories(
			this.<String>getColumnOriginalValue("subCategories"));
		tourismBonaOperatorInfoImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismBonaOperatorInfoImpl;
	}

	@Override
	public int compareTo(TourismBonaOperatorInfo tourismBonaOperatorInfo) {
		long primaryKey = tourismBonaOperatorInfo.getPrimaryKey();

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

		if (!(object instanceof TourismBonaOperatorInfo)) {
			return false;
		}

		TourismBonaOperatorInfo tourismBonaOperatorInfo =
			(TourismBonaOperatorInfo)object;

		long primaryKey = tourismBonaOperatorInfo.getPrimaryKey();

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
	public CacheModel<TourismBonaOperatorInfo> toCacheModel() {
		TourismBonaOperatorInfoCacheModel tourismBonaOperatorInfoCacheModel =
			new TourismBonaOperatorInfoCacheModel();

		tourismBonaOperatorInfoCacheModel.tourismBonaOperatorInfoId =
			getTourismBonaOperatorInfoId();

		tourismBonaOperatorInfoCacheModel.groupId = getGroupId();

		tourismBonaOperatorInfoCacheModel.companyId = getCompanyId();

		tourismBonaOperatorInfoCacheModel.userId = getUserId();

		tourismBonaOperatorInfoCacheModel.userName = getUserName();

		String userName = tourismBonaOperatorInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismBonaOperatorInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismBonaOperatorInfoCacheModel.createDate = createDate.getTime();
		}
		else {
			tourismBonaOperatorInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismBonaOperatorInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismBonaOperatorInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tourismBonaOperatorInfoCacheModel.operatorName = getOperatorName();

		String operatorName = tourismBonaOperatorInfoCacheModel.operatorName;

		if ((operatorName != null) && (operatorName.length() == 0)) {
			tourismBonaOperatorInfoCacheModel.operatorName = null;
		}

		tourismBonaOperatorInfoCacheModel.operatorNumber = getOperatorNumber();

		String operatorNumber =
			tourismBonaOperatorInfoCacheModel.operatorNumber;

		if ((operatorNumber != null) && (operatorNumber.length() == 0)) {
			tourismBonaOperatorInfoCacheModel.operatorNumber = null;
		}

		Date issueDate = getIssueDate();

		if (issueDate != null) {
			tourismBonaOperatorInfoCacheModel.issueDate = issueDate.getTime();
		}
		else {
			tourismBonaOperatorInfoCacheModel.issueDate = Long.MIN_VALUE;
		}

		Date expirationDate = getExpirationDate();

		if (expirationDate != null) {
			tourismBonaOperatorInfoCacheModel.expirationDate =
				expirationDate.getTime();
		}
		else {
			tourismBonaOperatorInfoCacheModel.expirationDate = Long.MIN_VALUE;
		}

		tourismBonaOperatorInfoCacheModel.categories = getCategories();

		String categories = tourismBonaOperatorInfoCacheModel.categories;

		if ((categories != null) && (categories.length() == 0)) {
			tourismBonaOperatorInfoCacheModel.categories = null;
		}

		tourismBonaOperatorInfoCacheModel.subCategories = getSubCategories();

		String subCategories = tourismBonaOperatorInfoCacheModel.subCategories;

		if ((subCategories != null) && (subCategories.length() == 0)) {
			tourismBonaOperatorInfoCacheModel.subCategories = null;
		}

		Long tourismApplicationId = getTourismApplicationId();

		if (tourismApplicationId != null) {
			tourismBonaOperatorInfoCacheModel.tourismApplicationId =
				tourismApplicationId;
		}

		return tourismBonaOperatorInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismBonaOperatorInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismBonaOperatorInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaOperatorInfo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismBonaOperatorInfo)this);

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
			<InvocationHandler, TourismBonaOperatorInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismBonaOperatorInfo.class, ModelWrapper.class);

	}

	private long _tourismBonaOperatorInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _operatorName;
	private String _operatorNumber;
	private Date _issueDate;
	private Date _expirationDate;
	private String _categories;
	private String _subCategories;
	private Long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismBonaOperatorInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismBonaOperatorInfo)this);
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
			"tourismBonaOperatorInfoId", _tourismBonaOperatorInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("operatorName", _operatorName);
		_columnOriginalValues.put("operatorNumber", _operatorNumber);
		_columnOriginalValues.put("issueDate", _issueDate);
		_columnOriginalValues.put("expirationDate", _expirationDate);
		_columnOriginalValues.put("categories", _categories);
		_columnOriginalValues.put("subCategories", _subCategories);
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

		columnBitmasks.put("tourismBonaOperatorInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("operatorName", 128L);

		columnBitmasks.put("operatorNumber", 256L);

		columnBitmasks.put("issueDate", 512L);

		columnBitmasks.put("expirationDate", 1024L);

		columnBitmasks.put("categories", 2048L);

		columnBitmasks.put("subCategories", 4096L);

		columnBitmasks.put("tourismApplicationId", 8192L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismBonaOperatorInfo _escapedModel;

}
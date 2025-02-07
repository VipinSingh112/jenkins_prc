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
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBox;
import com.nbp.tourism.application.form.services.model.TourismAnnualEntertainBoxModel;

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
 * The base model implementation for the TourismAnnualEntertainBox service. Represents a row in the &quot;nbp_tourism_enter_box_add&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismAnnualEntertainBoxModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismAnnualEntertainBoxImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismAnnualEntertainBoxImpl
 * @generated
 */
@JSON(strict = true)
public class TourismAnnualEntertainBoxModelImpl
	extends BaseModelImpl<TourismAnnualEntertainBox>
	implements TourismAnnualEntertainBoxModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism annual entertain box model instance should use the <code>TourismAnnualEntertainBox</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_enter_box_add";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismAnnualEntertainBoxId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"service", Types.VARCHAR}, {"local", Types.VARCHAR},
		{"foreign_", Types.VARCHAR}, {"enterCounter", Types.VARCHAR},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismAnnualEntertainBoxId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("service", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("local", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("foreign_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("enterCounter", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_enter_box_add (tourismAnnualEntertainBoxId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,service VARCHAR(75) null,local VARCHAR(75) null,foreign_ VARCHAR(75) null,enterCounter VARCHAR(75) null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_enter_box_add";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismAnnualEntertainBox.createDate ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_enter_box_add.createDate ASC";

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

	public TourismAnnualEntertainBoxModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismAnnualEntertainBoxId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismAnnualEntertainBoxId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismAnnualEntertainBoxId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismAnnualEntertainBox.class;
	}

	@Override
	public String getModelClassName() {
		return TourismAnnualEntertainBox.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismAnnualEntertainBox, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismAnnualEntertainBox, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismAnnualEntertainBox, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((TourismAnnualEntertainBox)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismAnnualEntertainBox, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismAnnualEntertainBox, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismAnnualEntertainBox)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismAnnualEntertainBox, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismAnnualEntertainBox, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismAnnualEntertainBox, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismAnnualEntertainBox, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<TourismAnnualEntertainBox, Object>>();

			attributeGetterFunctions.put(
				"tourismAnnualEntertainBoxId",
				TourismAnnualEntertainBox::getTourismAnnualEntertainBoxId);
			attributeGetterFunctions.put(
				"groupId", TourismAnnualEntertainBox::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismAnnualEntertainBox::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismAnnualEntertainBox::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismAnnualEntertainBox::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismAnnualEntertainBox::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", TourismAnnualEntertainBox::getModifiedDate);
			attributeGetterFunctions.put(
				"service", TourismAnnualEntertainBox::getService);
			attributeGetterFunctions.put(
				"local", TourismAnnualEntertainBox::getLocal);
			attributeGetterFunctions.put(
				"foreign", TourismAnnualEntertainBox::getForeign);
			attributeGetterFunctions.put(
				"enterCounter", TourismAnnualEntertainBox::getEnterCounter);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismAnnualEntertainBox::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismAnnualEntertainBox, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismAnnualEntertainBox, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<TourismAnnualEntertainBox, ?>>();

			attributeSetterBiConsumers.put(
				"tourismAnnualEntertainBoxId",
				(BiConsumer<TourismAnnualEntertainBox, Long>)
					TourismAnnualEntertainBox::setTourismAnnualEntertainBoxId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismAnnualEntertainBox, Long>)
					TourismAnnualEntertainBox::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismAnnualEntertainBox, Long>)
					TourismAnnualEntertainBox::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismAnnualEntertainBox, Long>)
					TourismAnnualEntertainBox::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismAnnualEntertainBox, String>)
					TourismAnnualEntertainBox::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismAnnualEntertainBox, Date>)
					TourismAnnualEntertainBox::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismAnnualEntertainBox, Date>)
					TourismAnnualEntertainBox::setModifiedDate);
			attributeSetterBiConsumers.put(
				"service",
				(BiConsumer<TourismAnnualEntertainBox, String>)
					TourismAnnualEntertainBox::setService);
			attributeSetterBiConsumers.put(
				"local",
				(BiConsumer<TourismAnnualEntertainBox, String>)
					TourismAnnualEntertainBox::setLocal);
			attributeSetterBiConsumers.put(
				"foreign",
				(BiConsumer<TourismAnnualEntertainBox, String>)
					TourismAnnualEntertainBox::setForeign);
			attributeSetterBiConsumers.put(
				"enterCounter",
				(BiConsumer<TourismAnnualEntertainBox, String>)
					TourismAnnualEntertainBox::setEnterCounter);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismAnnualEntertainBox, Long>)
					TourismAnnualEntertainBox::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismAnnualEntertainBoxId() {
		return _tourismAnnualEntertainBoxId;
	}

	@Override
	public void setTourismAnnualEntertainBoxId(
		long tourismAnnualEntertainBoxId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismAnnualEntertainBoxId = tourismAnnualEntertainBoxId;
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
	public String getService() {
		if (_service == null) {
			return "";
		}
		else {
			return _service;
		}
	}

	@Override
	public void setService(String service) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_service = service;
	}

	@JSON
	@Override
	public String getLocal() {
		if (_local == null) {
			return "";
		}
		else {
			return _local;
		}
	}

	@Override
	public void setLocal(String local) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_local = local;
	}

	@JSON
	@Override
	public String getForeign() {
		if (_foreign == null) {
			return "";
		}
		else {
			return _foreign;
		}
	}

	@Override
	public void setForeign(String foreign) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_foreign = foreign;
	}

	@JSON
	@Override
	public String getEnterCounter() {
		if (_enterCounter == null) {
			return "";
		}
		else {
			return _enterCounter;
		}
	}

	@Override
	public void setEnterCounter(String enterCounter) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_enterCounter = enterCounter;
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
			getCompanyId(), TourismAnnualEntertainBox.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismAnnualEntertainBox toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismAnnualEntertainBox>
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
		TourismAnnualEntertainBoxImpl tourismAnnualEntertainBoxImpl =
			new TourismAnnualEntertainBoxImpl();

		tourismAnnualEntertainBoxImpl.setTourismAnnualEntertainBoxId(
			getTourismAnnualEntertainBoxId());
		tourismAnnualEntertainBoxImpl.setGroupId(getGroupId());
		tourismAnnualEntertainBoxImpl.setCompanyId(getCompanyId());
		tourismAnnualEntertainBoxImpl.setUserId(getUserId());
		tourismAnnualEntertainBoxImpl.setUserName(getUserName());
		tourismAnnualEntertainBoxImpl.setCreateDate(getCreateDate());
		tourismAnnualEntertainBoxImpl.setModifiedDate(getModifiedDate());
		tourismAnnualEntertainBoxImpl.setService(getService());
		tourismAnnualEntertainBoxImpl.setLocal(getLocal());
		tourismAnnualEntertainBoxImpl.setForeign(getForeign());
		tourismAnnualEntertainBoxImpl.setEnterCounter(getEnterCounter());
		tourismAnnualEntertainBoxImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismAnnualEntertainBoxImpl.resetOriginalValues();

		return tourismAnnualEntertainBoxImpl;
	}

	@Override
	public TourismAnnualEntertainBox cloneWithOriginalValues() {
		TourismAnnualEntertainBoxImpl tourismAnnualEntertainBoxImpl =
			new TourismAnnualEntertainBoxImpl();

		tourismAnnualEntertainBoxImpl.setTourismAnnualEntertainBoxId(
			this.<Long>getColumnOriginalValue("tourismAnnualEntertainBoxId"));
		tourismAnnualEntertainBoxImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismAnnualEntertainBoxImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismAnnualEntertainBoxImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismAnnualEntertainBoxImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismAnnualEntertainBoxImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismAnnualEntertainBoxImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismAnnualEntertainBoxImpl.setService(
			this.<String>getColumnOriginalValue("service"));
		tourismAnnualEntertainBoxImpl.setLocal(
			this.<String>getColumnOriginalValue("local"));
		tourismAnnualEntertainBoxImpl.setForeign(
			this.<String>getColumnOriginalValue("foreign_"));
		tourismAnnualEntertainBoxImpl.setEnterCounter(
			this.<String>getColumnOriginalValue("enterCounter"));
		tourismAnnualEntertainBoxImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismAnnualEntertainBoxImpl;
	}

	@Override
	public int compareTo(TourismAnnualEntertainBox tourismAnnualEntertainBox) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), tourismAnnualEntertainBox.getCreateDate());

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

		if (!(object instanceof TourismAnnualEntertainBox)) {
			return false;
		}

		TourismAnnualEntertainBox tourismAnnualEntertainBox =
			(TourismAnnualEntertainBox)object;

		long primaryKey = tourismAnnualEntertainBox.getPrimaryKey();

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
	public CacheModel<TourismAnnualEntertainBox> toCacheModel() {
		TourismAnnualEntertainBoxCacheModel
			tourismAnnualEntertainBoxCacheModel =
				new TourismAnnualEntertainBoxCacheModel();

		tourismAnnualEntertainBoxCacheModel.tourismAnnualEntertainBoxId =
			getTourismAnnualEntertainBoxId();

		tourismAnnualEntertainBoxCacheModel.groupId = getGroupId();

		tourismAnnualEntertainBoxCacheModel.companyId = getCompanyId();

		tourismAnnualEntertainBoxCacheModel.userId = getUserId();

		tourismAnnualEntertainBoxCacheModel.userName = getUserName();

		String userName = tourismAnnualEntertainBoxCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismAnnualEntertainBoxCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismAnnualEntertainBoxCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismAnnualEntertainBoxCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismAnnualEntertainBoxCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismAnnualEntertainBoxCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tourismAnnualEntertainBoxCacheModel.service = getService();

		String service = tourismAnnualEntertainBoxCacheModel.service;

		if ((service != null) && (service.length() == 0)) {
			tourismAnnualEntertainBoxCacheModel.service = null;
		}

		tourismAnnualEntertainBoxCacheModel.local = getLocal();

		String local = tourismAnnualEntertainBoxCacheModel.local;

		if ((local != null) && (local.length() == 0)) {
			tourismAnnualEntertainBoxCacheModel.local = null;
		}

		tourismAnnualEntertainBoxCacheModel.foreign = getForeign();

		String foreign = tourismAnnualEntertainBoxCacheModel.foreign;

		if ((foreign != null) && (foreign.length() == 0)) {
			tourismAnnualEntertainBoxCacheModel.foreign = null;
		}

		tourismAnnualEntertainBoxCacheModel.enterCounter = getEnterCounter();

		String enterCounter = tourismAnnualEntertainBoxCacheModel.enterCounter;

		if ((enterCounter != null) && (enterCounter.length() == 0)) {
			tourismAnnualEntertainBoxCacheModel.enterCounter = null;
		}

		tourismAnnualEntertainBoxCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismAnnualEntertainBoxCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismAnnualEntertainBox, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismAnnualEntertainBox, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismAnnualEntertainBox, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismAnnualEntertainBox)this);

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
			<InvocationHandler, TourismAnnualEntertainBox>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismAnnualEntertainBox.class, ModelWrapper.class);

	}

	private long _tourismAnnualEntertainBoxId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _service;
	private String _local;
	private String _foreign;
	private String _enterCounter;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		columnName = _attributeNames.getOrDefault(columnName, columnName);

		Function<TourismAnnualEntertainBox, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismAnnualEntertainBox)this);
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
			"tourismAnnualEntertainBoxId", _tourismAnnualEntertainBoxId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("service", _service);
		_columnOriginalValues.put("local", _local);
		_columnOriginalValues.put("foreign_", _foreign);
		_columnOriginalValues.put("enterCounter", _enterCounter);
		_columnOriginalValues.put(
			"tourismApplicationId", _tourismApplicationId);
	}

	private static final Map<String, String> _attributeNames;

	static {
		Map<String, String> attributeNames = new HashMap<>();

		attributeNames.put("foreign_", "foreign");

		_attributeNames = Collections.unmodifiableMap(attributeNames);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("tourismAnnualEntertainBoxId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("service", 128L);

		columnBitmasks.put("local", 256L);

		columnBitmasks.put("foreign_", 512L);

		columnBitmasks.put("enterCounter", 1024L);

		columnBitmasks.put("tourismApplicationId", 2048L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismAnnualEntertainBox _escapedModel;

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.model.impl;

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

import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfo;
import com.nbp.jtb.application.form.service.model.AttractionGenDeclareInfoModel;

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
 * The base model implementation for the AttractionGenDeclareInfo service. Represents a row in the &quot;nbp_jtb_attract_gen_dec&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>AttractionGenDeclareInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link AttractionGenDeclareInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see AttractionGenDeclareInfoImpl
 * @generated
 */
@JSON(strict = true)
public class AttractionGenDeclareInfoModelImpl
	extends BaseModelImpl<AttractionGenDeclareInfo>
	implements AttractionGenDeclareInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a attraction gen declare info model instance should use the <code>AttractionGenDeclareInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_jtb_attract_gen_dec";

	public static final Object[][] TABLE_COLUMNS = {
		{"attractionGenDeclareInfoId", Types.BIGINT}, {"groupId", Types.BIGINT},
		{"companyId", Types.BIGINT}, {"userId", Types.BIGINT},
		{"userName", Types.VARCHAR}, {"createDate", Types.TIMESTAMP},
		{"modifiedDate", Types.TIMESTAMP},
		{"newAttractionsGenOwnerName", Types.VARCHAR},
		{"newAttractionsCompanyLaw", Types.VARCHAR},
		{"newAttractionsDate", Types.TIMESTAMP},
		{"newAttractionsName", Types.VARCHAR},
		{"newAttractionsStartDate", Types.TIMESTAMP},
		{"newAttractionsSituatedLand", Types.VARCHAR},
		{"newAttractionsActivities", Types.VARCHAR},
		{"attractionNewDate", Types.TIMESTAMP},
		{"jtbApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("attractionGenDeclareInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("newAttractionsGenOwnerName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("newAttractionsCompanyLaw", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("newAttractionsDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("newAttractionsName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("newAttractionsStartDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("newAttractionsSituatedLand", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("newAttractionsActivities", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("attractionNewDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("jtbApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_jtb_attract_gen_dec (attractionGenDeclareInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,newAttractionsGenOwnerName VARCHAR(75) null,newAttractionsCompanyLaw VARCHAR(75) null,newAttractionsDate DATE null,newAttractionsName VARCHAR(75) null,newAttractionsStartDate DATE null,newAttractionsSituatedLand VARCHAR(75) null,newAttractionsActivities VARCHAR(75) null,attractionNewDate DATE null,jtbApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_jtb_attract_gen_dec";

	public static final String ORDER_BY_JPQL =
		" ORDER BY attractionGenDeclareInfo.createDate DESC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_jtb_attract_gen_dec.createDate DESC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link #getColumnBitmask(String)}
	 */
	@Deprecated
	public static final long JTBAPPLICATIONID_COLUMN_BITMASK = 1L;

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

	public AttractionGenDeclareInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _attractionGenDeclareInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setAttractionGenDeclareInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _attractionGenDeclareInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return AttractionGenDeclareInfo.class;
	}

	@Override
	public String getModelClassName() {
		return AttractionGenDeclareInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<AttractionGenDeclareInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<AttractionGenDeclareInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AttractionGenDeclareInfo, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((AttractionGenDeclareInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<AttractionGenDeclareInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<AttractionGenDeclareInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(AttractionGenDeclareInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<AttractionGenDeclareInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<AttractionGenDeclareInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<AttractionGenDeclareInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<AttractionGenDeclareInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<AttractionGenDeclareInfo, Object>>();

			attributeGetterFunctions.put(
				"attractionGenDeclareInfoId",
				AttractionGenDeclareInfo::getAttractionGenDeclareInfoId);
			attributeGetterFunctions.put(
				"groupId", AttractionGenDeclareInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", AttractionGenDeclareInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", AttractionGenDeclareInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", AttractionGenDeclareInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", AttractionGenDeclareInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", AttractionGenDeclareInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"newAttractionsGenOwnerName",
				AttractionGenDeclareInfo::getNewAttractionsGenOwnerName);
			attributeGetterFunctions.put(
				"newAttractionsCompanyLaw",
				AttractionGenDeclareInfo::getNewAttractionsCompanyLaw);
			attributeGetterFunctions.put(
				"newAttractionsDate",
				AttractionGenDeclareInfo::getNewAttractionsDate);
			attributeGetterFunctions.put(
				"newAttractionsName",
				AttractionGenDeclareInfo::getNewAttractionsName);
			attributeGetterFunctions.put(
				"newAttractionsStartDate",
				AttractionGenDeclareInfo::getNewAttractionsStartDate);
			attributeGetterFunctions.put(
				"newAttractionsSituatedLand",
				AttractionGenDeclareInfo::getNewAttractionsSituatedLand);
			attributeGetterFunctions.put(
				"newAttractionsActivities",
				AttractionGenDeclareInfo::getNewAttractionsActivities);
			attributeGetterFunctions.put(
				"attractionNewDate",
				AttractionGenDeclareInfo::getAttractionNewDate);
			attributeGetterFunctions.put(
				"jtbApplicationId",
				AttractionGenDeclareInfo::getJtbApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<AttractionGenDeclareInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<AttractionGenDeclareInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<AttractionGenDeclareInfo, ?>>();

			attributeSetterBiConsumers.put(
				"attractionGenDeclareInfoId",
				(BiConsumer<AttractionGenDeclareInfo, Long>)
					AttractionGenDeclareInfo::setAttractionGenDeclareInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<AttractionGenDeclareInfo, Long>)
					AttractionGenDeclareInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<AttractionGenDeclareInfo, Long>)
					AttractionGenDeclareInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<AttractionGenDeclareInfo, Long>)
					AttractionGenDeclareInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<AttractionGenDeclareInfo, String>)
					AttractionGenDeclareInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<AttractionGenDeclareInfo, Date>)
					AttractionGenDeclareInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<AttractionGenDeclareInfo, Date>)
					AttractionGenDeclareInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"newAttractionsGenOwnerName",
				(BiConsumer<AttractionGenDeclareInfo, String>)
					AttractionGenDeclareInfo::setNewAttractionsGenOwnerName);
			attributeSetterBiConsumers.put(
				"newAttractionsCompanyLaw",
				(BiConsumer<AttractionGenDeclareInfo, String>)
					AttractionGenDeclareInfo::setNewAttractionsCompanyLaw);
			attributeSetterBiConsumers.put(
				"newAttractionsDate",
				(BiConsumer<AttractionGenDeclareInfo, Date>)
					AttractionGenDeclareInfo::setNewAttractionsDate);
			attributeSetterBiConsumers.put(
				"newAttractionsName",
				(BiConsumer<AttractionGenDeclareInfo, String>)
					AttractionGenDeclareInfo::setNewAttractionsName);
			attributeSetterBiConsumers.put(
				"newAttractionsStartDate",
				(BiConsumer<AttractionGenDeclareInfo, Date>)
					AttractionGenDeclareInfo::setNewAttractionsStartDate);
			attributeSetterBiConsumers.put(
				"newAttractionsSituatedLand",
				(BiConsumer<AttractionGenDeclareInfo, String>)
					AttractionGenDeclareInfo::setNewAttractionsSituatedLand);
			attributeSetterBiConsumers.put(
				"newAttractionsActivities",
				(BiConsumer<AttractionGenDeclareInfo, String>)
					AttractionGenDeclareInfo::setNewAttractionsActivities);
			attributeSetterBiConsumers.put(
				"attractionNewDate",
				(BiConsumer<AttractionGenDeclareInfo, Date>)
					AttractionGenDeclareInfo::setAttractionNewDate);
			attributeSetterBiConsumers.put(
				"jtbApplicationId",
				(BiConsumer<AttractionGenDeclareInfo, Long>)
					AttractionGenDeclareInfo::setJtbApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getAttractionGenDeclareInfoId() {
		return _attractionGenDeclareInfoId;
	}

	@Override
	public void setAttractionGenDeclareInfoId(long attractionGenDeclareInfoId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_attractionGenDeclareInfoId = attractionGenDeclareInfoId;
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
	public String getNewAttractionsGenOwnerName() {
		if (_newAttractionsGenOwnerName == null) {
			return "";
		}
		else {
			return _newAttractionsGenOwnerName;
		}
	}

	@Override
	public void setNewAttractionsGenOwnerName(
		String newAttractionsGenOwnerName) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newAttractionsGenOwnerName = newAttractionsGenOwnerName;
	}

	@JSON
	@Override
	public String getNewAttractionsCompanyLaw() {
		if (_newAttractionsCompanyLaw == null) {
			return "";
		}
		else {
			return _newAttractionsCompanyLaw;
		}
	}

	@Override
	public void setNewAttractionsCompanyLaw(String newAttractionsCompanyLaw) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newAttractionsCompanyLaw = newAttractionsCompanyLaw;
	}

	@JSON
	@Override
	public Date getNewAttractionsDate() {
		return _newAttractionsDate;
	}

	@Override
	public void setNewAttractionsDate(Date newAttractionsDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newAttractionsDate = newAttractionsDate;
	}

	@JSON
	@Override
	public String getNewAttractionsName() {
		if (_newAttractionsName == null) {
			return "";
		}
		else {
			return _newAttractionsName;
		}
	}

	@Override
	public void setNewAttractionsName(String newAttractionsName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newAttractionsName = newAttractionsName;
	}

	@JSON
	@Override
	public Date getNewAttractionsStartDate() {
		return _newAttractionsStartDate;
	}

	@Override
	public void setNewAttractionsStartDate(Date newAttractionsStartDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newAttractionsStartDate = newAttractionsStartDate;
	}

	@JSON
	@Override
	public String getNewAttractionsSituatedLand() {
		if (_newAttractionsSituatedLand == null) {
			return "";
		}
		else {
			return _newAttractionsSituatedLand;
		}
	}

	@Override
	public void setNewAttractionsSituatedLand(
		String newAttractionsSituatedLand) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newAttractionsSituatedLand = newAttractionsSituatedLand;
	}

	@JSON
	@Override
	public String getNewAttractionsActivities() {
		if (_newAttractionsActivities == null) {
			return "";
		}
		else {
			return _newAttractionsActivities;
		}
	}

	@Override
	public void setNewAttractionsActivities(String newAttractionsActivities) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_newAttractionsActivities = newAttractionsActivities;
	}

	@JSON
	@Override
	public Date getAttractionNewDate() {
		return _attractionNewDate;
	}

	@Override
	public void setAttractionNewDate(Date attractionNewDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_attractionNewDate = attractionNewDate;
	}

	@JSON
	@Override
	public long getJtbApplicationId() {
		return _jtbApplicationId;
	}

	@Override
	public void setJtbApplicationId(long jtbApplicationId) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_jtbApplicationId = jtbApplicationId;
	}

	/**
	 * @deprecated As of Athanasius (7.3.x), replaced by {@link
	 *             #getColumnOriginalValue(String)}
	 */
	@Deprecated
	public long getOriginalJtbApplicationId() {
		return GetterUtil.getLong(
			this.<Long>getColumnOriginalValue("jtbApplicationId"));
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
			getCompanyId(), AttractionGenDeclareInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public AttractionGenDeclareInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, AttractionGenDeclareInfo>
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
		AttractionGenDeclareInfoImpl attractionGenDeclareInfoImpl =
			new AttractionGenDeclareInfoImpl();

		attractionGenDeclareInfoImpl.setAttractionGenDeclareInfoId(
			getAttractionGenDeclareInfoId());
		attractionGenDeclareInfoImpl.setGroupId(getGroupId());
		attractionGenDeclareInfoImpl.setCompanyId(getCompanyId());
		attractionGenDeclareInfoImpl.setUserId(getUserId());
		attractionGenDeclareInfoImpl.setUserName(getUserName());
		attractionGenDeclareInfoImpl.setCreateDate(getCreateDate());
		attractionGenDeclareInfoImpl.setModifiedDate(getModifiedDate());
		attractionGenDeclareInfoImpl.setNewAttractionsGenOwnerName(
			getNewAttractionsGenOwnerName());
		attractionGenDeclareInfoImpl.setNewAttractionsCompanyLaw(
			getNewAttractionsCompanyLaw());
		attractionGenDeclareInfoImpl.setNewAttractionsDate(
			getNewAttractionsDate());
		attractionGenDeclareInfoImpl.setNewAttractionsName(
			getNewAttractionsName());
		attractionGenDeclareInfoImpl.setNewAttractionsStartDate(
			getNewAttractionsStartDate());
		attractionGenDeclareInfoImpl.setNewAttractionsSituatedLand(
			getNewAttractionsSituatedLand());
		attractionGenDeclareInfoImpl.setNewAttractionsActivities(
			getNewAttractionsActivities());
		attractionGenDeclareInfoImpl.setAttractionNewDate(
			getAttractionNewDate());
		attractionGenDeclareInfoImpl.setJtbApplicationId(getJtbApplicationId());

		attractionGenDeclareInfoImpl.resetOriginalValues();

		return attractionGenDeclareInfoImpl;
	}

	@Override
	public AttractionGenDeclareInfo cloneWithOriginalValues() {
		AttractionGenDeclareInfoImpl attractionGenDeclareInfoImpl =
			new AttractionGenDeclareInfoImpl();

		attractionGenDeclareInfoImpl.setAttractionGenDeclareInfoId(
			this.<Long>getColumnOriginalValue("attractionGenDeclareInfoId"));
		attractionGenDeclareInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		attractionGenDeclareInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		attractionGenDeclareInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		attractionGenDeclareInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		attractionGenDeclareInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		attractionGenDeclareInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		attractionGenDeclareInfoImpl.setNewAttractionsGenOwnerName(
			this.<String>getColumnOriginalValue("newAttractionsGenOwnerName"));
		attractionGenDeclareInfoImpl.setNewAttractionsCompanyLaw(
			this.<String>getColumnOriginalValue("newAttractionsCompanyLaw"));
		attractionGenDeclareInfoImpl.setNewAttractionsDate(
			this.<Date>getColumnOriginalValue("newAttractionsDate"));
		attractionGenDeclareInfoImpl.setNewAttractionsName(
			this.<String>getColumnOriginalValue("newAttractionsName"));
		attractionGenDeclareInfoImpl.setNewAttractionsStartDate(
			this.<Date>getColumnOriginalValue("newAttractionsStartDate"));
		attractionGenDeclareInfoImpl.setNewAttractionsSituatedLand(
			this.<String>getColumnOriginalValue("newAttractionsSituatedLand"));
		attractionGenDeclareInfoImpl.setNewAttractionsActivities(
			this.<String>getColumnOriginalValue("newAttractionsActivities"));
		attractionGenDeclareInfoImpl.setAttractionNewDate(
			this.<Date>getColumnOriginalValue("attractionNewDate"));
		attractionGenDeclareInfoImpl.setJtbApplicationId(
			this.<Long>getColumnOriginalValue("jtbApplicationId"));

		return attractionGenDeclareInfoImpl;
	}

	@Override
	public int compareTo(AttractionGenDeclareInfo attractionGenDeclareInfo) {
		int value = 0;

		value = DateUtil.compareTo(
			getCreateDate(), attractionGenDeclareInfo.getCreateDate());

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

		if (!(object instanceof AttractionGenDeclareInfo)) {
			return false;
		}

		AttractionGenDeclareInfo attractionGenDeclareInfo =
			(AttractionGenDeclareInfo)object;

		long primaryKey = attractionGenDeclareInfo.getPrimaryKey();

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
	public CacheModel<AttractionGenDeclareInfo> toCacheModel() {
		AttractionGenDeclareInfoCacheModel attractionGenDeclareInfoCacheModel =
			new AttractionGenDeclareInfoCacheModel();

		attractionGenDeclareInfoCacheModel.attractionGenDeclareInfoId =
			getAttractionGenDeclareInfoId();

		attractionGenDeclareInfoCacheModel.groupId = getGroupId();

		attractionGenDeclareInfoCacheModel.companyId = getCompanyId();

		attractionGenDeclareInfoCacheModel.userId = getUserId();

		attractionGenDeclareInfoCacheModel.userName = getUserName();

		String userName = attractionGenDeclareInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			attractionGenDeclareInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			attractionGenDeclareInfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			attractionGenDeclareInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			attractionGenDeclareInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			attractionGenDeclareInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		attractionGenDeclareInfoCacheModel.newAttractionsGenOwnerName =
			getNewAttractionsGenOwnerName();

		String newAttractionsGenOwnerName =
			attractionGenDeclareInfoCacheModel.newAttractionsGenOwnerName;

		if ((newAttractionsGenOwnerName != null) &&
			(newAttractionsGenOwnerName.length() == 0)) {

			attractionGenDeclareInfoCacheModel.newAttractionsGenOwnerName =
				null;
		}

		attractionGenDeclareInfoCacheModel.newAttractionsCompanyLaw =
			getNewAttractionsCompanyLaw();

		String newAttractionsCompanyLaw =
			attractionGenDeclareInfoCacheModel.newAttractionsCompanyLaw;

		if ((newAttractionsCompanyLaw != null) &&
			(newAttractionsCompanyLaw.length() == 0)) {

			attractionGenDeclareInfoCacheModel.newAttractionsCompanyLaw = null;
		}

		Date newAttractionsDate = getNewAttractionsDate();

		if (newAttractionsDate != null) {
			attractionGenDeclareInfoCacheModel.newAttractionsDate =
				newAttractionsDate.getTime();
		}
		else {
			attractionGenDeclareInfoCacheModel.newAttractionsDate =
				Long.MIN_VALUE;
		}

		attractionGenDeclareInfoCacheModel.newAttractionsName =
			getNewAttractionsName();

		String newAttractionsName =
			attractionGenDeclareInfoCacheModel.newAttractionsName;

		if ((newAttractionsName != null) &&
			(newAttractionsName.length() == 0)) {

			attractionGenDeclareInfoCacheModel.newAttractionsName = null;
		}

		Date newAttractionsStartDate = getNewAttractionsStartDate();

		if (newAttractionsStartDate != null) {
			attractionGenDeclareInfoCacheModel.newAttractionsStartDate =
				newAttractionsStartDate.getTime();
		}
		else {
			attractionGenDeclareInfoCacheModel.newAttractionsStartDate =
				Long.MIN_VALUE;
		}

		attractionGenDeclareInfoCacheModel.newAttractionsSituatedLand =
			getNewAttractionsSituatedLand();

		String newAttractionsSituatedLand =
			attractionGenDeclareInfoCacheModel.newAttractionsSituatedLand;

		if ((newAttractionsSituatedLand != null) &&
			(newAttractionsSituatedLand.length() == 0)) {

			attractionGenDeclareInfoCacheModel.newAttractionsSituatedLand =
				null;
		}

		attractionGenDeclareInfoCacheModel.newAttractionsActivities =
			getNewAttractionsActivities();

		String newAttractionsActivities =
			attractionGenDeclareInfoCacheModel.newAttractionsActivities;

		if ((newAttractionsActivities != null) &&
			(newAttractionsActivities.length() == 0)) {

			attractionGenDeclareInfoCacheModel.newAttractionsActivities = null;
		}

		Date attractionNewDate = getAttractionNewDate();

		if (attractionNewDate != null) {
			attractionGenDeclareInfoCacheModel.attractionNewDate =
				attractionNewDate.getTime();
		}
		else {
			attractionGenDeclareInfoCacheModel.attractionNewDate =
				Long.MIN_VALUE;
		}

		attractionGenDeclareInfoCacheModel.jtbApplicationId =
			getJtbApplicationId();

		return attractionGenDeclareInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<AttractionGenDeclareInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<AttractionGenDeclareInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<AttractionGenDeclareInfo, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(AttractionGenDeclareInfo)this);

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
			<InvocationHandler, AttractionGenDeclareInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						AttractionGenDeclareInfo.class, ModelWrapper.class);

	}

	private long _attractionGenDeclareInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _newAttractionsGenOwnerName;
	private String _newAttractionsCompanyLaw;
	private Date _newAttractionsDate;
	private String _newAttractionsName;
	private Date _newAttractionsStartDate;
	private String _newAttractionsSituatedLand;
	private String _newAttractionsActivities;
	private Date _attractionNewDate;
	private long _jtbApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<AttractionGenDeclareInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((AttractionGenDeclareInfo)this);
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
			"attractionGenDeclareInfoId", _attractionGenDeclareInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put(
			"newAttractionsGenOwnerName", _newAttractionsGenOwnerName);
		_columnOriginalValues.put(
			"newAttractionsCompanyLaw", _newAttractionsCompanyLaw);
		_columnOriginalValues.put("newAttractionsDate", _newAttractionsDate);
		_columnOriginalValues.put("newAttractionsName", _newAttractionsName);
		_columnOriginalValues.put(
			"newAttractionsStartDate", _newAttractionsStartDate);
		_columnOriginalValues.put(
			"newAttractionsSituatedLand", _newAttractionsSituatedLand);
		_columnOriginalValues.put(
			"newAttractionsActivities", _newAttractionsActivities);
		_columnOriginalValues.put("attractionNewDate", _attractionNewDate);
		_columnOriginalValues.put("jtbApplicationId", _jtbApplicationId);
	}

	private transient Map<String, Object> _columnOriginalValues;

	public static long getColumnBitmask(String columnName) {
		return _columnBitmasks.get(columnName);
	}

	private static final Map<String, Long> _columnBitmasks;

	static {
		Map<String, Long> columnBitmasks = new HashMap<>();

		columnBitmasks.put("attractionGenDeclareInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("newAttractionsGenOwnerName", 128L);

		columnBitmasks.put("newAttractionsCompanyLaw", 256L);

		columnBitmasks.put("newAttractionsDate", 512L);

		columnBitmasks.put("newAttractionsName", 1024L);

		columnBitmasks.put("newAttractionsStartDate", 2048L);

		columnBitmasks.put("newAttractionsSituatedLand", 4096L);

		columnBitmasks.put("newAttractionsActivities", 8192L);

		columnBitmasks.put("attractionNewDate", 16384L);

		columnBitmasks.put("jtbApplicationId", 32768L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private AttractionGenDeclareInfo _escapedModel;

}
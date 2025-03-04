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

import com.nbp.tourism.application.form.services.model.TourismBonaAccoGenralInfo;
import com.nbp.tourism.application.form.services.model.TourismBonaAccoGenralInfoModel;

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
 * The base model implementation for the TourismBonaAccoGenralInfo service. Represents a row in the &quot;nbp_tourism_bona_acco_gen&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>TourismBonaAccoGenralInfoModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TourismBonaAccoGenralInfoImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see TourismBonaAccoGenralInfoImpl
 * @generated
 */
@JSON(strict = true)
public class TourismBonaAccoGenralInfoModelImpl
	extends BaseModelImpl<TourismBonaAccoGenralInfo>
	implements TourismBonaAccoGenralInfoModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a tourism bona acco genral info model instance should use the <code>TourismBonaAccoGenralInfo</code> interface instead.
	 */
	public static final String TABLE_NAME = "nbp_tourism_bona_acco_gen";

	public static final Object[][] TABLE_COLUMNS = {
		{"tourismBonaAccoGenralInfoId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"establishmentName", Types.VARCHAR},
		{"establishmentNewName", Types.VARCHAR},
		{"generalFacilityRoom", Types.VARCHAR},
		{"existingFacilityRoom", Types.VARCHAR},
		{"offeredFacilityDetail", Types.VARCHAR},
		{"plannedFacilityDetail", Types.VARCHAR},
		{"accomodationToBeOffered", Types.VARCHAR},
		{"constructionDate", Types.TIMESTAMP},
		{"expectedCommenceDate", Types.TIMESTAMP},
		{"tourismApplicationId", Types.BIGINT}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("tourismBonaAccoGenralInfoId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("establishmentName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("establishmentNewName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("generalFacilityRoom", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("existingFacilityRoom", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("offeredFacilityDetail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("plannedFacilityDetail", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("accomodationToBeOffered", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("constructionDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("expectedCommenceDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("tourismApplicationId", Types.BIGINT);
	}

	public static final String TABLE_SQL_CREATE =
		"create table nbp_tourism_bona_acco_gen (tourismBonaAccoGenralInfoId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,establishmentName VARCHAR(75) null,establishmentNewName VARCHAR(75) null,generalFacilityRoom VARCHAR(75) null,existingFacilityRoom VARCHAR(75) null,offeredFacilityDetail VARCHAR(75) null,plannedFacilityDetail VARCHAR(75) null,accomodationToBeOffered VARCHAR(75) null,constructionDate DATE null,expectedCommenceDate DATE null,tourismApplicationId LONG)";

	public static final String TABLE_SQL_DROP =
		"drop table nbp_tourism_bona_acco_gen";

	public static final String ORDER_BY_JPQL =
		" ORDER BY tourismBonaAccoGenralInfo.tourismBonaAccoGenralInfoId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY nbp_tourism_bona_acco_gen.tourismBonaAccoGenralInfoId ASC";

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
	public static final long TOURISMBONAACCOGENRALINFOID_COLUMN_BITMASK = 2L;

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

	public TourismBonaAccoGenralInfoModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _tourismBonaAccoGenralInfoId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setTourismBonaAccoGenralInfoId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _tourismBonaAccoGenralInfoId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return TourismBonaAccoGenralInfo.class;
	}

	@Override
	public String getModelClassName() {
		return TourismBonaAccoGenralInfo.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<TourismBonaAccoGenralInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		for (Map.Entry<String, Function<TourismBonaAccoGenralInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaAccoGenralInfo, Object>
				attributeGetterFunction = entry.getValue();

			attributes.put(
				attributeName,
				attributeGetterFunction.apply((TourismBonaAccoGenralInfo)this));
		}

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<TourismBonaAccoGenralInfo, Object>>
			attributeSetterBiConsumers = getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<TourismBonaAccoGenralInfo, Object>
				attributeSetterBiConsumer = attributeSetterBiConsumers.get(
					attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(TourismBonaAccoGenralInfo)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<TourismBonaAccoGenralInfo, Object>>
		getAttributeGetterFunctions() {

		return AttributeGetterFunctionsHolder._attributeGetterFunctions;
	}

	public Map<String, BiConsumer<TourismBonaAccoGenralInfo, Object>>
		getAttributeSetterBiConsumers() {

		return AttributeSetterBiConsumersHolder._attributeSetterBiConsumers;
	}

	private static class AttributeGetterFunctionsHolder {

		private static final Map
			<String, Function<TourismBonaAccoGenralInfo, Object>>
				_attributeGetterFunctions;

		static {
			Map<String, Function<TourismBonaAccoGenralInfo, Object>>
				attributeGetterFunctions =
					new LinkedHashMap
						<String, Function<TourismBonaAccoGenralInfo, Object>>();

			attributeGetterFunctions.put(
				"tourismBonaAccoGenralInfoId",
				TourismBonaAccoGenralInfo::getTourismBonaAccoGenralInfoId);
			attributeGetterFunctions.put(
				"groupId", TourismBonaAccoGenralInfo::getGroupId);
			attributeGetterFunctions.put(
				"companyId", TourismBonaAccoGenralInfo::getCompanyId);
			attributeGetterFunctions.put(
				"userId", TourismBonaAccoGenralInfo::getUserId);
			attributeGetterFunctions.put(
				"userName", TourismBonaAccoGenralInfo::getUserName);
			attributeGetterFunctions.put(
				"createDate", TourismBonaAccoGenralInfo::getCreateDate);
			attributeGetterFunctions.put(
				"modifiedDate", TourismBonaAccoGenralInfo::getModifiedDate);
			attributeGetterFunctions.put(
				"establishmentName",
				TourismBonaAccoGenralInfo::getEstablishmentName);
			attributeGetterFunctions.put(
				"establishmentNewName",
				TourismBonaAccoGenralInfo::getEstablishmentNewName);
			attributeGetterFunctions.put(
				"generalFacilityRoom",
				TourismBonaAccoGenralInfo::getGeneralFacilityRoom);
			attributeGetterFunctions.put(
				"existingFacilityRoom",
				TourismBonaAccoGenralInfo::getExistingFacilityRoom);
			attributeGetterFunctions.put(
				"offeredFacilityDetail",
				TourismBonaAccoGenralInfo::getOfferedFacilityDetail);
			attributeGetterFunctions.put(
				"plannedFacilityDetail",
				TourismBonaAccoGenralInfo::getPlannedFacilityDetail);
			attributeGetterFunctions.put(
				"accomodationToBeOffered",
				TourismBonaAccoGenralInfo::getAccomodationToBeOffered);
			attributeGetterFunctions.put(
				"constructionDate",
				TourismBonaAccoGenralInfo::getConstructionDate);
			attributeGetterFunctions.put(
				"expectedCommenceDate",
				TourismBonaAccoGenralInfo::getExpectedCommenceDate);
			attributeGetterFunctions.put(
				"tourismApplicationId",
				TourismBonaAccoGenralInfo::getTourismApplicationId);

			_attributeGetterFunctions = Collections.unmodifiableMap(
				attributeGetterFunctions);
		}

	}

	private static class AttributeSetterBiConsumersHolder {

		private static final Map
			<String, BiConsumer<TourismBonaAccoGenralInfo, Object>>
				_attributeSetterBiConsumers;

		static {
			Map<String, BiConsumer<TourismBonaAccoGenralInfo, ?>>
				attributeSetterBiConsumers =
					new LinkedHashMap
						<String, BiConsumer<TourismBonaAccoGenralInfo, ?>>();

			attributeSetterBiConsumers.put(
				"tourismBonaAccoGenralInfoId",
				(BiConsumer<TourismBonaAccoGenralInfo, Long>)
					TourismBonaAccoGenralInfo::setTourismBonaAccoGenralInfoId);
			attributeSetterBiConsumers.put(
				"groupId",
				(BiConsumer<TourismBonaAccoGenralInfo, Long>)
					TourismBonaAccoGenralInfo::setGroupId);
			attributeSetterBiConsumers.put(
				"companyId",
				(BiConsumer<TourismBonaAccoGenralInfo, Long>)
					TourismBonaAccoGenralInfo::setCompanyId);
			attributeSetterBiConsumers.put(
				"userId",
				(BiConsumer<TourismBonaAccoGenralInfo, Long>)
					TourismBonaAccoGenralInfo::setUserId);
			attributeSetterBiConsumers.put(
				"userName",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setUserName);
			attributeSetterBiConsumers.put(
				"createDate",
				(BiConsumer<TourismBonaAccoGenralInfo, Date>)
					TourismBonaAccoGenralInfo::setCreateDate);
			attributeSetterBiConsumers.put(
				"modifiedDate",
				(BiConsumer<TourismBonaAccoGenralInfo, Date>)
					TourismBonaAccoGenralInfo::setModifiedDate);
			attributeSetterBiConsumers.put(
				"establishmentName",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setEstablishmentName);
			attributeSetterBiConsumers.put(
				"establishmentNewName",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setEstablishmentNewName);
			attributeSetterBiConsumers.put(
				"generalFacilityRoom",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setGeneralFacilityRoom);
			attributeSetterBiConsumers.put(
				"existingFacilityRoom",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setExistingFacilityRoom);
			attributeSetterBiConsumers.put(
				"offeredFacilityDetail",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setOfferedFacilityDetail);
			attributeSetterBiConsumers.put(
				"plannedFacilityDetail",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setPlannedFacilityDetail);
			attributeSetterBiConsumers.put(
				"accomodationToBeOffered",
				(BiConsumer<TourismBonaAccoGenralInfo, String>)
					TourismBonaAccoGenralInfo::setAccomodationToBeOffered);
			attributeSetterBiConsumers.put(
				"constructionDate",
				(BiConsumer<TourismBonaAccoGenralInfo, Date>)
					TourismBonaAccoGenralInfo::setConstructionDate);
			attributeSetterBiConsumers.put(
				"expectedCommenceDate",
				(BiConsumer<TourismBonaAccoGenralInfo, Date>)
					TourismBonaAccoGenralInfo::setExpectedCommenceDate);
			attributeSetterBiConsumers.put(
				"tourismApplicationId",
				(BiConsumer<TourismBonaAccoGenralInfo, Long>)
					TourismBonaAccoGenralInfo::setTourismApplicationId);

			_attributeSetterBiConsumers = Collections.unmodifiableMap(
				(Map)attributeSetterBiConsumers);
		}

	}

	@JSON
	@Override
	public long getTourismBonaAccoGenralInfoId() {
		return _tourismBonaAccoGenralInfoId;
	}

	@Override
	public void setTourismBonaAccoGenralInfoId(
		long tourismBonaAccoGenralInfoId) {

		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_tourismBonaAccoGenralInfoId = tourismBonaAccoGenralInfoId;
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
	public String getEstablishmentName() {
		if (_establishmentName == null) {
			return "";
		}
		else {
			return _establishmentName;
		}
	}

	@Override
	public void setEstablishmentName(String establishmentName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_establishmentName = establishmentName;
	}

	@JSON
	@Override
	public String getEstablishmentNewName() {
		if (_establishmentNewName == null) {
			return "";
		}
		else {
			return _establishmentNewName;
		}
	}

	@Override
	public void setEstablishmentNewName(String establishmentNewName) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_establishmentNewName = establishmentNewName;
	}

	@JSON
	@Override
	public String getGeneralFacilityRoom() {
		if (_generalFacilityRoom == null) {
			return "";
		}
		else {
			return _generalFacilityRoom;
		}
	}

	@Override
	public void setGeneralFacilityRoom(String generalFacilityRoom) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_generalFacilityRoom = generalFacilityRoom;
	}

	@JSON
	@Override
	public String getExistingFacilityRoom() {
		if (_existingFacilityRoom == null) {
			return "";
		}
		else {
			return _existingFacilityRoom;
		}
	}

	@Override
	public void setExistingFacilityRoom(String existingFacilityRoom) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_existingFacilityRoom = existingFacilityRoom;
	}

	@JSON
	@Override
	public String getOfferedFacilityDetail() {
		if (_offeredFacilityDetail == null) {
			return "";
		}
		else {
			return _offeredFacilityDetail;
		}
	}

	@Override
	public void setOfferedFacilityDetail(String offeredFacilityDetail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_offeredFacilityDetail = offeredFacilityDetail;
	}

	@JSON
	@Override
	public String getPlannedFacilityDetail() {
		if (_plannedFacilityDetail == null) {
			return "";
		}
		else {
			return _plannedFacilityDetail;
		}
	}

	@Override
	public void setPlannedFacilityDetail(String plannedFacilityDetail) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_plannedFacilityDetail = plannedFacilityDetail;
	}

	@JSON
	@Override
	public String getAccomodationToBeOffered() {
		if (_accomodationToBeOffered == null) {
			return "";
		}
		else {
			return _accomodationToBeOffered;
		}
	}

	@Override
	public void setAccomodationToBeOffered(String accomodationToBeOffered) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_accomodationToBeOffered = accomodationToBeOffered;
	}

	@JSON
	@Override
	public Date getConstructionDate() {
		return _constructionDate;
	}

	@Override
	public void setConstructionDate(Date constructionDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_constructionDate = constructionDate;
	}

	@JSON
	@Override
	public Date getExpectedCommenceDate() {
		return _expectedCommenceDate;
	}

	@Override
	public void setExpectedCommenceDate(Date expectedCommenceDate) {
		if (_columnOriginalValues == Collections.EMPTY_MAP) {
			_setColumnOriginalValues();
		}

		_expectedCommenceDate = expectedCommenceDate;
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
			getCompanyId(), TourismBonaAccoGenralInfo.class.getName(),
			getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public TourismBonaAccoGenralInfo toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, TourismBonaAccoGenralInfo>
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
		TourismBonaAccoGenralInfoImpl tourismBonaAccoGenralInfoImpl =
			new TourismBonaAccoGenralInfoImpl();

		tourismBonaAccoGenralInfoImpl.setTourismBonaAccoGenralInfoId(
			getTourismBonaAccoGenralInfoId());
		tourismBonaAccoGenralInfoImpl.setGroupId(getGroupId());
		tourismBonaAccoGenralInfoImpl.setCompanyId(getCompanyId());
		tourismBonaAccoGenralInfoImpl.setUserId(getUserId());
		tourismBonaAccoGenralInfoImpl.setUserName(getUserName());
		tourismBonaAccoGenralInfoImpl.setCreateDate(getCreateDate());
		tourismBonaAccoGenralInfoImpl.setModifiedDate(getModifiedDate());
		tourismBonaAccoGenralInfoImpl.setEstablishmentName(
			getEstablishmentName());
		tourismBonaAccoGenralInfoImpl.setEstablishmentNewName(
			getEstablishmentNewName());
		tourismBonaAccoGenralInfoImpl.setGeneralFacilityRoom(
			getGeneralFacilityRoom());
		tourismBonaAccoGenralInfoImpl.setExistingFacilityRoom(
			getExistingFacilityRoom());
		tourismBonaAccoGenralInfoImpl.setOfferedFacilityDetail(
			getOfferedFacilityDetail());
		tourismBonaAccoGenralInfoImpl.setPlannedFacilityDetail(
			getPlannedFacilityDetail());
		tourismBonaAccoGenralInfoImpl.setAccomodationToBeOffered(
			getAccomodationToBeOffered());
		tourismBonaAccoGenralInfoImpl.setConstructionDate(
			getConstructionDate());
		tourismBonaAccoGenralInfoImpl.setExpectedCommenceDate(
			getExpectedCommenceDate());
		tourismBonaAccoGenralInfoImpl.setTourismApplicationId(
			getTourismApplicationId());

		tourismBonaAccoGenralInfoImpl.resetOriginalValues();

		return tourismBonaAccoGenralInfoImpl;
	}

	@Override
	public TourismBonaAccoGenralInfo cloneWithOriginalValues() {
		TourismBonaAccoGenralInfoImpl tourismBonaAccoGenralInfoImpl =
			new TourismBonaAccoGenralInfoImpl();

		tourismBonaAccoGenralInfoImpl.setTourismBonaAccoGenralInfoId(
			this.<Long>getColumnOriginalValue("tourismBonaAccoGenralInfoId"));
		tourismBonaAccoGenralInfoImpl.setGroupId(
			this.<Long>getColumnOriginalValue("groupId"));
		tourismBonaAccoGenralInfoImpl.setCompanyId(
			this.<Long>getColumnOriginalValue("companyId"));
		tourismBonaAccoGenralInfoImpl.setUserId(
			this.<Long>getColumnOriginalValue("userId"));
		tourismBonaAccoGenralInfoImpl.setUserName(
			this.<String>getColumnOriginalValue("userName"));
		tourismBonaAccoGenralInfoImpl.setCreateDate(
			this.<Date>getColumnOriginalValue("createDate"));
		tourismBonaAccoGenralInfoImpl.setModifiedDate(
			this.<Date>getColumnOriginalValue("modifiedDate"));
		tourismBonaAccoGenralInfoImpl.setEstablishmentName(
			this.<String>getColumnOriginalValue("establishmentName"));
		tourismBonaAccoGenralInfoImpl.setEstablishmentNewName(
			this.<String>getColumnOriginalValue("establishmentNewName"));
		tourismBonaAccoGenralInfoImpl.setGeneralFacilityRoom(
			this.<String>getColumnOriginalValue("generalFacilityRoom"));
		tourismBonaAccoGenralInfoImpl.setExistingFacilityRoom(
			this.<String>getColumnOriginalValue("existingFacilityRoom"));
		tourismBonaAccoGenralInfoImpl.setOfferedFacilityDetail(
			this.<String>getColumnOriginalValue("offeredFacilityDetail"));
		tourismBonaAccoGenralInfoImpl.setPlannedFacilityDetail(
			this.<String>getColumnOriginalValue("plannedFacilityDetail"));
		tourismBonaAccoGenralInfoImpl.setAccomodationToBeOffered(
			this.<String>getColumnOriginalValue("accomodationToBeOffered"));
		tourismBonaAccoGenralInfoImpl.setConstructionDate(
			this.<Date>getColumnOriginalValue("constructionDate"));
		tourismBonaAccoGenralInfoImpl.setExpectedCommenceDate(
			this.<Date>getColumnOriginalValue("expectedCommenceDate"));
		tourismBonaAccoGenralInfoImpl.setTourismApplicationId(
			this.<Long>getColumnOriginalValue("tourismApplicationId"));

		return tourismBonaAccoGenralInfoImpl;
	}

	@Override
	public int compareTo(TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo) {
		long primaryKey = tourismBonaAccoGenralInfo.getPrimaryKey();

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

		if (!(object instanceof TourismBonaAccoGenralInfo)) {
			return false;
		}

		TourismBonaAccoGenralInfo tourismBonaAccoGenralInfo =
			(TourismBonaAccoGenralInfo)object;

		long primaryKey = tourismBonaAccoGenralInfo.getPrimaryKey();

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
	public CacheModel<TourismBonaAccoGenralInfo> toCacheModel() {
		TourismBonaAccoGenralInfoCacheModel
			tourismBonaAccoGenralInfoCacheModel =
				new TourismBonaAccoGenralInfoCacheModel();

		tourismBonaAccoGenralInfoCacheModel.tourismBonaAccoGenralInfoId =
			getTourismBonaAccoGenralInfoId();

		tourismBonaAccoGenralInfoCacheModel.groupId = getGroupId();

		tourismBonaAccoGenralInfoCacheModel.companyId = getCompanyId();

		tourismBonaAccoGenralInfoCacheModel.userId = getUserId();

		tourismBonaAccoGenralInfoCacheModel.userName = getUserName();

		String userName = tourismBonaAccoGenralInfoCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			tourismBonaAccoGenralInfoCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			tourismBonaAccoGenralInfoCacheModel.createDate =
				createDate.getTime();
		}
		else {
			tourismBonaAccoGenralInfoCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			tourismBonaAccoGenralInfoCacheModel.modifiedDate =
				modifiedDate.getTime();
		}
		else {
			tourismBonaAccoGenralInfoCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		tourismBonaAccoGenralInfoCacheModel.establishmentName =
			getEstablishmentName();

		String establishmentName =
			tourismBonaAccoGenralInfoCacheModel.establishmentName;

		if ((establishmentName != null) && (establishmentName.length() == 0)) {
			tourismBonaAccoGenralInfoCacheModel.establishmentName = null;
		}

		tourismBonaAccoGenralInfoCacheModel.establishmentNewName =
			getEstablishmentNewName();

		String establishmentNewName =
			tourismBonaAccoGenralInfoCacheModel.establishmentNewName;

		if ((establishmentNewName != null) &&
			(establishmentNewName.length() == 0)) {

			tourismBonaAccoGenralInfoCacheModel.establishmentNewName = null;
		}

		tourismBonaAccoGenralInfoCacheModel.generalFacilityRoom =
			getGeneralFacilityRoom();

		String generalFacilityRoom =
			tourismBonaAccoGenralInfoCacheModel.generalFacilityRoom;

		if ((generalFacilityRoom != null) &&
			(generalFacilityRoom.length() == 0)) {

			tourismBonaAccoGenralInfoCacheModel.generalFacilityRoom = null;
		}

		tourismBonaAccoGenralInfoCacheModel.existingFacilityRoom =
			getExistingFacilityRoom();

		String existingFacilityRoom =
			tourismBonaAccoGenralInfoCacheModel.existingFacilityRoom;

		if ((existingFacilityRoom != null) &&
			(existingFacilityRoom.length() == 0)) {

			tourismBonaAccoGenralInfoCacheModel.existingFacilityRoom = null;
		}

		tourismBonaAccoGenralInfoCacheModel.offeredFacilityDetail =
			getOfferedFacilityDetail();

		String offeredFacilityDetail =
			tourismBonaAccoGenralInfoCacheModel.offeredFacilityDetail;

		if ((offeredFacilityDetail != null) &&
			(offeredFacilityDetail.length() == 0)) {

			tourismBonaAccoGenralInfoCacheModel.offeredFacilityDetail = null;
		}

		tourismBonaAccoGenralInfoCacheModel.plannedFacilityDetail =
			getPlannedFacilityDetail();

		String plannedFacilityDetail =
			tourismBonaAccoGenralInfoCacheModel.plannedFacilityDetail;

		if ((plannedFacilityDetail != null) &&
			(plannedFacilityDetail.length() == 0)) {

			tourismBonaAccoGenralInfoCacheModel.plannedFacilityDetail = null;
		}

		tourismBonaAccoGenralInfoCacheModel.accomodationToBeOffered =
			getAccomodationToBeOffered();

		String accomodationToBeOffered =
			tourismBonaAccoGenralInfoCacheModel.accomodationToBeOffered;

		if ((accomodationToBeOffered != null) &&
			(accomodationToBeOffered.length() == 0)) {

			tourismBonaAccoGenralInfoCacheModel.accomodationToBeOffered = null;
		}

		Date constructionDate = getConstructionDate();

		if (constructionDate != null) {
			tourismBonaAccoGenralInfoCacheModel.constructionDate =
				constructionDate.getTime();
		}
		else {
			tourismBonaAccoGenralInfoCacheModel.constructionDate =
				Long.MIN_VALUE;
		}

		Date expectedCommenceDate = getExpectedCommenceDate();

		if (expectedCommenceDate != null) {
			tourismBonaAccoGenralInfoCacheModel.expectedCommenceDate =
				expectedCommenceDate.getTime();
		}
		else {
			tourismBonaAccoGenralInfoCacheModel.expectedCommenceDate =
				Long.MIN_VALUE;
		}

		tourismBonaAccoGenralInfoCacheModel.tourismApplicationId =
			getTourismApplicationId();

		return tourismBonaAccoGenralInfoCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<TourismBonaAccoGenralInfo, Object>>
			attributeGetterFunctions = getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			(5 * attributeGetterFunctions.size()) + 2);

		sb.append("{");

		for (Map.Entry<String, Function<TourismBonaAccoGenralInfo, Object>>
				entry : attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<TourismBonaAccoGenralInfo, Object>
				attributeGetterFunction = entry.getValue();

			sb.append("\"");
			sb.append(attributeName);
			sb.append("\": ");

			Object value = attributeGetterFunction.apply(
				(TourismBonaAccoGenralInfo)this);

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
			<InvocationHandler, TourismBonaAccoGenralInfo>
				_escapedModelProxyProviderFunction =
					ProxyUtil.getProxyProviderFunction(
						TourismBonaAccoGenralInfo.class, ModelWrapper.class);

	}

	private long _tourismBonaAccoGenralInfoId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private String _establishmentName;
	private String _establishmentNewName;
	private String _generalFacilityRoom;
	private String _existingFacilityRoom;
	private String _offeredFacilityDetail;
	private String _plannedFacilityDetail;
	private String _accomodationToBeOffered;
	private Date _constructionDate;
	private Date _expectedCommenceDate;
	private long _tourismApplicationId;

	public <T> T getColumnValue(String columnName) {
		Function<TourismBonaAccoGenralInfo, Object> function =
			AttributeGetterFunctionsHolder._attributeGetterFunctions.get(
				columnName);

		if (function == null) {
			throw new IllegalArgumentException(
				"No attribute getter function found for " + columnName);
		}

		return (T)function.apply((TourismBonaAccoGenralInfo)this);
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
			"tourismBonaAccoGenralInfoId", _tourismBonaAccoGenralInfoId);
		_columnOriginalValues.put("groupId", _groupId);
		_columnOriginalValues.put("companyId", _companyId);
		_columnOriginalValues.put("userId", _userId);
		_columnOriginalValues.put("userName", _userName);
		_columnOriginalValues.put("createDate", _createDate);
		_columnOriginalValues.put("modifiedDate", _modifiedDate);
		_columnOriginalValues.put("establishmentName", _establishmentName);
		_columnOriginalValues.put(
			"establishmentNewName", _establishmentNewName);
		_columnOriginalValues.put("generalFacilityRoom", _generalFacilityRoom);
		_columnOriginalValues.put(
			"existingFacilityRoom", _existingFacilityRoom);
		_columnOriginalValues.put(
			"offeredFacilityDetail", _offeredFacilityDetail);
		_columnOriginalValues.put(
			"plannedFacilityDetail", _plannedFacilityDetail);
		_columnOriginalValues.put(
			"accomodationToBeOffered", _accomodationToBeOffered);
		_columnOriginalValues.put("constructionDate", _constructionDate);
		_columnOriginalValues.put(
			"expectedCommenceDate", _expectedCommenceDate);
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

		columnBitmasks.put("tourismBonaAccoGenralInfoId", 1L);

		columnBitmasks.put("groupId", 2L);

		columnBitmasks.put("companyId", 4L);

		columnBitmasks.put("userId", 8L);

		columnBitmasks.put("userName", 16L);

		columnBitmasks.put("createDate", 32L);

		columnBitmasks.put("modifiedDate", 64L);

		columnBitmasks.put("establishmentName", 128L);

		columnBitmasks.put("establishmentNewName", 256L);

		columnBitmasks.put("generalFacilityRoom", 512L);

		columnBitmasks.put("existingFacilityRoom", 1024L);

		columnBitmasks.put("offeredFacilityDetail", 2048L);

		columnBitmasks.put("plannedFacilityDetail", 4096L);

		columnBitmasks.put("accomodationToBeOffered", 8192L);

		columnBitmasks.put("constructionDate", 16384L);

		columnBitmasks.put("expectedCommenceDate", 32768L);

		columnBitmasks.put("tourismApplicationId", 65536L);

		_columnBitmasks = Collections.unmodifiableMap(columnBitmasks);
	}

	private long _columnBitmask;
	private TourismBonaAccoGenralInfo _escapedModel;

}
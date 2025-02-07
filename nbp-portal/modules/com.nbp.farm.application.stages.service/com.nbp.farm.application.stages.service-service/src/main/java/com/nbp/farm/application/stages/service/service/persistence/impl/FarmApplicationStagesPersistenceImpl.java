/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.nbp.farm.application.stages.service.service.persistence.impl;

import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.configuration.Configuration;
import com.liferay.portal.kernel.dao.orm.EntityCache;
import com.liferay.portal.kernel.dao.orm.FinderCache;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.dao.orm.SessionFactory;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.security.auth.CompanyThreadLocal;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.ServiceContextThreadLocal;
import com.liferay.portal.kernel.service.persistence.BasePersistence;
import com.liferay.portal.kernel.service.persistence.impl.BasePersistenceImpl;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.SetUtil;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.uuid.PortalUUIDUtil;

import com.nbp.farm.application.stages.service.exception.NoSuchFarmApplicationStagesException;
import com.nbp.farm.application.stages.service.model.FarmApplicationStages;
import com.nbp.farm.application.stages.service.model.FarmApplicationStagesTable;
import com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesImpl;
import com.nbp.farm.application.stages.service.model.impl.FarmApplicationStagesModelImpl;
import com.nbp.farm.application.stages.service.service.persistence.FarmApplicationStagesPersistence;
import com.nbp.farm.application.stages.service.service.persistence.FarmApplicationStagesUtil;
import com.nbp.farm.application.stages.service.service.persistence.impl.constants.FARM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the farm application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {FarmApplicationStagesPersistence.class, BasePersistence.class}
)
public class FarmApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<FarmApplicationStages>
	implements FarmApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmApplicationStagesUtil</code> to access the farm application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathWithPaginationFindByUuid;
	private FinderPath _finderPathWithoutPaginationFindByUuid;
	private FinderPath _finderPathCountByUuid;

	/**
	 * Returns all the farm application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid;
				finderArgs = new Object[] {uuid};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid;
			finderArgs = new Object[] {uuid, start, end, orderByComparator};
		}

		List<FarmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FarmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmApplicationStages farmApplicationStages : list) {
					if (!uuid.equals(farmApplicationStages.getUuid())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				list = (List<FarmApplicationStages>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		List<FarmApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FarmApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where uuid = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages[] findByUuid_PrevAndNext(
			long farmApplicationStagesId, String uuid,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		FarmApplicationStages farmApplicationStages = findByPrimaryKey(
			farmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FarmApplicationStages[] array = new FarmApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, farmApplicationStages, uuid, orderByComparator, true);

			array[1] = farmApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, farmApplicationStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmApplicationStages getByUuid_PrevAndNext(
		Session session, FarmApplicationStages farmApplicationStages,
		String uuid, OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_UUID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FarmApplicationStages farmApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmApplicationStages);
		}
	}

	/**
	 * Returns the number of farm application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_UUID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_UUID_2 =
		"farmApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(farmApplicationStages.uuid IS NULL OR farmApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (farmApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("uuid=");
			sb.append(uuid);

			sb.append(", groupId=");
			sb.append(groupId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmApplicationStagesException(sb.toString());
		}

		return farmApplicationStages;
	}

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the farm application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs,this);
		}

		if (result instanceof FarmApplicationStages) {
			FarmApplicationStages farmApplicationStages =
				(FarmApplicationStages)result;

			if (!Objects.equals(uuid, farmApplicationStages.getUuid()) ||
				(groupId != farmApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				List<FarmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					FarmApplicationStages farmApplicationStages = list.get(0);

					result = farmApplicationStages;

					cacheResult(farmApplicationStages);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FarmApplicationStages)result;
		}
	}

	/**
	 * Removes the farm application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the farm application stages that was removed
	 */
	@Override
	public FarmApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(farmApplicationStages);
	}

	/**
	 * Returns the number of farm application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_G_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_G_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_G_GROUPID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(groupId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_G_UUID_2 =
		"farmApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(farmApplicationStages.uuid IS NULL OR farmApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"farmApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByUuid_C;
				finderArgs = new Object[] {uuid, companyId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByUuid_C;
			finderArgs = new Object[] {
				uuid, companyId, start, end, orderByComparator
			};
		}

		List<FarmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FarmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmApplicationStages farmApplicationStages : list) {
					if (!uuid.equals(farmApplicationStages.getUuid()) ||
						(companyId != farmApplicationStages.getCompanyId())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				list = (List<FarmApplicationStages>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		List<FarmApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FarmApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages[] findByUuid_C_PrevAndNext(
			long farmApplicationStagesId, String uuid, long companyId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		FarmApplicationStages farmApplicationStages = findByPrimaryKey(
			farmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FarmApplicationStages[] array = new FarmApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, farmApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = farmApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, farmApplicationStages, uuid, companyId,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmApplicationStages getByUuid_C_PrevAndNext(
		Session session, FarmApplicationStages farmApplicationStages,
		String uuid, long companyId,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

		boolean bindUuid = false;

		if (uuid.isEmpty()) {
			sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
		}
		else {
			bindUuid = true;

			sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
		}

		sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindUuid) {
			queryPos.add(uuid);
		}

		queryPos.add(companyId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (FarmApplicationStages farmApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmApplicationStages);
		}
	}

	/**
	 * Returns the number of farm application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindUuid = false;

			if (uuid.isEmpty()) {
				sb.append(_FINDER_COLUMN_UUID_C_UUID_3);
			}
			else {
				bindUuid = true;

				sb.append(_FINDER_COLUMN_UUID_C_UUID_2);
			}

			sb.append(_FINDER_COLUMN_UUID_C_COMPANYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindUuid) {
					queryPos.add(uuid);
				}

				queryPos.add(companyId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_UUID_C_UUID_2 =
		"farmApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(farmApplicationStages.uuid IS NULL OR farmApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"farmApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetFAS_CAI;
	private FinderPath _finderPathCountBygetFAS_CAI;

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_CAI(long farmApplicationId)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchBygetFAS_CAI(
			farmApplicationId);

		if (farmApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmApplicationId=");
			sb.append(farmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmApplicationStagesException(sb.toString());
		}

		return farmApplicationStages;
	}

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CAI(long farmApplicationId) {
		return fetchBygetFAS_CAI(farmApplicationId, true);
	}

	/**
	 * Returns the farm application stages where farmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmApplicationId the farm application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CAI(
		long farmApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CAI, finderArgs,this);
		}

		if (result instanceof FarmApplicationStages) {
			FarmApplicationStages farmApplicationStages =
				(FarmApplicationStages)result;

			if (farmApplicationId !=
					farmApplicationStages.getFarmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETFAS_CAI_FARMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmApplicationId);

				List<FarmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {farmApplicationId};
							}

							_log.warn(
								"FarmApplicationStagesPersistenceImpl.fetchBygetFAS_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmApplicationStages farmApplicationStages = list.get(0);

					result = farmApplicationStages;

					cacheResult(farmApplicationStages);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FarmApplicationStages)result;
		}
	}

	/**
	 * Removes the farm application stages where farmApplicationId = &#63; from the database.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the farm application stages that was removed
	 */
	@Override
	public FarmApplicationStages removeBygetFAS_CAI(long farmApplicationId)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = findBygetFAS_CAI(
			farmApplicationId);

		return remove(farmApplicationStages);
	}

	/**
	 * Returns the number of farm application stageses where farmApplicationId = &#63;.
	 *
	 * @param farmApplicationId the farm application ID
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countBygetFAS_CAI(long farmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFAS_CAI;

		Object[] finderArgs = new Object[] {farmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETFAS_CAI_FARMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmApplicationId);

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETFAS_CAI_FARMAPPLICATIONID_2 =
		"farmApplicationStages.farmApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetFAS_StageName;
	private FinderPath _finderPathCountBygetFAS_StageName;

	/**
	 * Returns all the farm application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName) {

		return findBygetFAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end) {

		return findBygetFAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return findBygetFAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<FarmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FarmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmApplicationStages farmApplicationStages : list) {
					if (!stageName.equals(
							farmApplicationStages.getStageName())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<FarmApplicationStages>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_StageName_First(
			String stageName,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetFAS_StageName_First(stageName, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_StageName_First(
		String stageName,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		List<FarmApplicationStages> list = findBygetFAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_StageName_Last(
			String stageName,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetFAS_StageName_Last(stageName, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_StageName_Last(
		String stageName,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		int count = countBygetFAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<FarmApplicationStages> list = findBygetFAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where stageName = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages[] findBygetFAS_StageName_PrevAndNext(
			long farmApplicationStagesId, String stageName,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		FarmApplicationStages farmApplicationStages = findByPrimaryKey(
			farmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FarmApplicationStages[] array = new FarmApplicationStagesImpl[3];

			array[0] = getBygetFAS_StageName_PrevAndNext(
				session, farmApplicationStages, stageName, orderByComparator,
				true);

			array[1] = farmApplicationStages;

			array[2] = getBygetFAS_StageName_PrevAndNext(
				session, farmApplicationStages, stageName, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmApplicationStages getBygetFAS_StageName_PrevAndNext(
		Session session, FarmApplicationStages farmApplicationStages,
		String stageName,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetFAS_StageName(String stageName) {
		for (FarmApplicationStages farmApplicationStages :
				findBygetFAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmApplicationStages);
		}
	}

	/**
	 * Returns the number of farm application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countBygetFAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetFAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2 =
		"farmApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3 =
		"(farmApplicationStages.stageName IS NULL OR farmApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetFAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetFAS_CaseIdStageName;

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetFAS_CaseIdStageName(caseId, stageName);

		if (farmApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmApplicationStagesException(sb.toString());
		}

		return farmApplicationStages;
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetFAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CaseIdStageName, finderArgs,this);
		}

		if (result instanceof FarmApplicationStages) {
			FarmApplicationStages farmApplicationStages =
				(FarmApplicationStages)result;

			if (!Objects.equals(caseId, farmApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, farmApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<FarmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CaseIdStageName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageName};
							}

							_log.warn(
								"FarmApplicationStagesPersistenceImpl.fetchBygetFAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmApplicationStages farmApplicationStages = list.get(0);

					result = farmApplicationStages;

					cacheResult(farmApplicationStages);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FarmApplicationStages)result;
		}
	}

	/**
	 * Removes the farm application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the farm application stages that was removed
	 */
	@Override
	public FarmApplicationStages removeBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			findBygetFAS_CaseIdStageName(caseId, stageName);

		return remove(farmApplicationStages);
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countBygetFAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetFAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindStageName) {
					queryPos.add(stageName);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_2 =
		"farmApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_3 =
		"(farmApplicationStages.caseId IS NULL OR farmApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_2 =
			"farmApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(farmApplicationStages.stageName IS NULL OR farmApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetFAS_StageName_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFAS_StageName_Status;
	private FinderPath _finderPathCountBygetFAS_StageName_Status;

	/**
	 * Returns all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus) {

		return findBygetFAS_StageName_Status(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end) {

		return findBygetFAS_StageName_Status(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return findBygetFAS_StageName_Status(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetFAS_StageName_Status(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFAS_StageName_Status;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFAS_StageName_Status;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<FarmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FarmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmApplicationStages farmApplicationStages : list) {
					if (!stageName.equals(
							farmApplicationStages.getStageName()) ||
						!stageStatus.equals(
							farmApplicationStages.getStageStatus())) {

						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					4 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(4);
			}

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				list = (List<FarmApplicationStages>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_StageName_Status_First(
			String stageName, String stageStatus,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetFAS_StageName_Status_First(
				stageName, stageStatus, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_StageName_Status_First(
		String stageName, String stageStatus,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		List<FarmApplicationStages> list = findBygetFAS_StageName_Status(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_StageName_Status_Last(
			String stageName, String stageStatus,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetFAS_StageName_Status_Last(
				stageName, stageStatus, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_StageName_Status_Last(
		String stageName, String stageStatus,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		int count = countBygetFAS_StageName_Status(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<FarmApplicationStages> list = findBygetFAS_StageName_Status(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages[] findBygetFAS_StageName_Status_PrevAndNext(
			long farmApplicationStagesId, String stageName, String stageStatus,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FarmApplicationStages farmApplicationStages = findByPrimaryKey(
			farmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FarmApplicationStages[] array = new FarmApplicationStagesImpl[3];

			array[0] = getBygetFAS_StageName_Status_PrevAndNext(
				session, farmApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = farmApplicationStages;

			array[2] = getBygetFAS_StageName_Status_PrevAndNext(
				session, farmApplicationStages, stageName, stageStatus,
				orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmApplicationStages getBygetFAS_StageName_Status_PrevAndNext(
		Session session, FarmApplicationStages farmApplicationStages,
		String stageName, String stageStatus,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (bindStageStatus) {
			queryPos.add(stageStatus);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetFAS_StageName_Status(
		String stageName, String stageStatus) {

		for (FarmApplicationStages farmApplicationStages :
				findBygetFAS_StageName_Status(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(farmApplicationStages);
		}
	}

	/**
	 * Returns the number of farm application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countBygetFAS_StageName_Status(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetFAS_StageName_Status;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_2 =
			"farmApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGENAME_3 =
			"(farmApplicationStages.stageName IS NULL OR farmApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_2 =
			"farmApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_STAGENAME_STATUS_STAGESTATUS_3 =
			"(farmApplicationStages.stageStatus IS NULL OR farmApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetFAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetFAS_CaseIdStageStatus;

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetFAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (farmApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmApplicationStagesException(sb.toString());
		}

		return farmApplicationStages;
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CaseIdStageStatus, finderArgs,this);
		}

		if (result instanceof FarmApplicationStages) {
			FarmApplicationStages farmApplicationStages =
				(FarmApplicationStages)result;

			if (!Objects.equals(caseId, farmApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, farmApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, farmApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<FarmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageName, stageStatus
								};
							}

							_log.warn(
								"FarmApplicationStagesPersistenceImpl.fetchBygetFAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmApplicationStages farmApplicationStages = list.get(0);

					result = farmApplicationStages;

					cacheResult(farmApplicationStages);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FarmApplicationStages)result;
		}
	}

	/**
	 * Removes the farm application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the farm application stages that was removed
	 */
	@Override
	public FarmApplicationStages removeBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			findBygetFAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(farmApplicationStages);
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetFAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_2 =
			"farmApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(farmApplicationStages.caseId IS NULL OR farmApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"farmApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(farmApplicationStages.stageName IS NULL OR farmApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"farmApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(farmApplicationStages.stageStatus IS NULL OR farmApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetFAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetFAS_CaseIdAndStatus;

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetFAS_CaseIdAndStatus(caseId, stageStatus);

		if (farmApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmApplicationStagesException(sb.toString());
		}

		return farmApplicationStages;
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetFAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the farm application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CaseIdAndStatus, finderArgs,this);
		}

		if (result instanceof FarmApplicationStages) {
			FarmApplicationStages farmApplicationStages =
				(FarmApplicationStages)result;

			if (!Objects.equals(caseId, farmApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, farmApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<FarmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CaseIdAndStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageStatus};
							}

							_log.warn(
								"FarmApplicationStagesPersistenceImpl.fetchBygetFAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmApplicationStages farmApplicationStages = list.get(0);

					result = farmApplicationStages;

					cacheResult(farmApplicationStages);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (FarmApplicationStages)result;
		}
	}

	/**
	 * Removes the farm application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the farm application stages that was removed
	 */
	@Override
	public FarmApplicationStages removeBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			findBygetFAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(farmApplicationStages);
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetFAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_2 =
		"farmApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_3 =
		"(farmApplicationStages.caseId IS NULL OR farmApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"farmApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(farmApplicationStages.stageStatus IS NULL OR farmApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathCountBygetCAS_CaseId;

	/**
	 * Returns all the farm application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetCAS_CaseId(String caseId) {
		return findBygetCAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return findBygetCAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return findBygetCAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FarmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FarmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmApplicationStages farmApplicationStages : list) {
					if (!caseId.equals(farmApplicationStages.getCaseId())) {
						list = null;

						break;
					}
				}
			}
		}

		if (list == null) {
			StringBundler sb = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					3 + (orderByComparator.getOrderByFields().length * 2));
			}
			else {
				sb = new StringBundler(3);
			}

			sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				list = (List<FarmApplicationStages>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages =
			fetchBygetCAS_CaseId_First(caseId, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		List<FarmApplicationStages> list = findBygetCAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchBygetCAS_CaseId_Last(
			caseId, orderByComparator);

		if (farmApplicationStages != null) {
			return farmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFarmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farm application stages, or <code>null</code> if a matching farm application stages could not be found
	 */
	@Override
	public FarmApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		int count = countBygetCAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<FarmApplicationStages> list = findBygetCAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farm application stageses before and after the current farm application stages in the ordered set where caseId = &#63;.
	 *
	 * @param farmApplicationStagesId the primary key of the current farm application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long farmApplicationStagesId, String caseId,
			OrderByComparator<FarmApplicationStages> orderByComparator)
		throws NoSuchFarmApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		FarmApplicationStages farmApplicationStages = findByPrimaryKey(
			farmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FarmApplicationStages[] array = new FarmApplicationStagesImpl[3];

			array[0] = getBygetCAS_CaseId_PrevAndNext(
				session, farmApplicationStages, caseId, orderByComparator,
				true);

			array[1] = farmApplicationStages;

			array[2] = getBygetCAS_CaseId_PrevAndNext(
				session, farmApplicationStages, caseId, orderByComparator,
				false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FarmApplicationStages getBygetCAS_CaseId_PrevAndNext(
		Session session, FarmApplicationStages farmApplicationStages,
		String caseId,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields =
				orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				sb.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						sb.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(WHERE_GREATER_THAN);
					}
					else {
						sb.append(WHERE_LESSER_THAN);
					}
				}
			}

			sb.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				sb.append(_ORDER_BY_ENTITY_ALIAS);
				sb.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						sb.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						sb.append(ORDER_BY_ASC);
					}
					else {
						sb.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			sb.append(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						farmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farm application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCAS_CaseId(String caseId) {
		for (FarmApplicationStages farmApplicationStages :
				findBygetCAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmApplicationStages);
		}
	}

	/**
	 * Returns the number of farm application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching farm application stageses
	 */
	@Override
	public int countBygetCAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				count = (Long)query.uniqueResult();

				finderCache.putResult(finderPath, finderArgs, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_GETCAS_CASEID_CASEID_2 =
		"farmApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETCAS_CASEID_CASEID_3 =
		"(farmApplicationStages.caseId IS NULL OR farmApplicationStages.caseId = '')";

	public FarmApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FarmApplicationStages.class);

		setModelImplClass(FarmApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(FarmApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the farm application stages in the entity cache if it is enabled.
	 *
	 * @param farmApplicationStages the farm application stages
	 */
	@Override
	public void cacheResult(FarmApplicationStages farmApplicationStages) {
		entityCache.putResult(
			FarmApplicationStagesImpl.class,
			farmApplicationStages.getPrimaryKey(), farmApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				farmApplicationStages.getUuid(),
				farmApplicationStages.getGroupId()
			},
			farmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CAI,
			new Object[] {farmApplicationStages.getFarmApplicationId()},
			farmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageName,
			new Object[] {
				farmApplicationStages.getCaseId(),
				farmApplicationStages.getStageName()
			},
			farmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageStatus,
			new Object[] {
				farmApplicationStages.getCaseId(),
				farmApplicationStages.getStageName(),
				farmApplicationStages.getStageStatus()
			},
			farmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdAndStatus,
			new Object[] {
				farmApplicationStages.getCaseId(),
				farmApplicationStages.getStageStatus()
			},
			farmApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farm application stageses in the entity cache if it is enabled.
	 *
	 * @param farmApplicationStageses the farm application stageses
	 */
	@Override
	public void cacheResult(
		List<FarmApplicationStages> farmApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmApplicationStages farmApplicationStages :
				farmApplicationStageses) {

			if (entityCache.getResult(
					FarmApplicationStagesImpl.class,
					farmApplicationStages.getPrimaryKey()) == null) {

				cacheResult(farmApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all farm application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmApplicationStagesImpl.class);

		finderCache.clearCache(FarmApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the farm application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FarmApplicationStages farmApplicationStages) {
		entityCache.removeResult(
			FarmApplicationStagesImpl.class, farmApplicationStages);
	}

	@Override
	public void clearCache(
		List<FarmApplicationStages> farmApplicationStageses) {

		for (FarmApplicationStages farmApplicationStages :
				farmApplicationStageses) {

			entityCache.removeResult(
				FarmApplicationStagesImpl.class, farmApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FarmApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmApplicationStagesModelImpl farmApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			farmApplicationStagesModelImpl.getUuid(),
			farmApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, farmApplicationStagesModelImpl);

		args = new Object[] {
			farmApplicationStagesModelImpl.getFarmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CAI, args, farmApplicationStagesModelImpl);

		args = new Object[] {
			farmApplicationStagesModelImpl.getCaseId(),
			farmApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageName, args,
			farmApplicationStagesModelImpl);

		args = new Object[] {
			farmApplicationStagesModelImpl.getCaseId(),
			farmApplicationStagesModelImpl.getStageName(),
			farmApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageStatus, args,
			farmApplicationStagesModelImpl);

		args = new Object[] {
			farmApplicationStagesModelImpl.getCaseId(),
			farmApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdAndStatus, args,
			farmApplicationStagesModelImpl);
	}

	/**
	 * Creates a new farm application stages with the primary key. Does not add the farm application stages to the database.
	 *
	 * @param farmApplicationStagesId the primary key for the new farm application stages
	 * @return the new farm application stages
	 */
	@Override
	public FarmApplicationStages create(long farmApplicationStagesId) {
		FarmApplicationStages farmApplicationStages =
			new FarmApplicationStagesImpl();

		farmApplicationStages.setNew(true);
		farmApplicationStages.setPrimaryKey(farmApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		farmApplicationStages.setUuid(uuid);

		farmApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return farmApplicationStages;
	}

	/**
	 * Removes the farm application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages that was removed
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages remove(long farmApplicationStagesId)
		throws NoSuchFarmApplicationStagesException {

		return remove((Serializable)farmApplicationStagesId);
	}

	/**
	 * Removes the farm application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farm application stages
	 * @return the farm application stages that was removed
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages remove(Serializable primaryKey)
		throws NoSuchFarmApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			FarmApplicationStages farmApplicationStages =
				(FarmApplicationStages)session.get(
					FarmApplicationStagesImpl.class, primaryKey);

			if (farmApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmApplicationStages);
		}
		catch (NoSuchFarmApplicationStagesException noSuchEntityException) {
			throw noSuchEntityException;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected FarmApplicationStages removeImpl(
		FarmApplicationStages farmApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmApplicationStages)) {
				farmApplicationStages = (FarmApplicationStages)session.get(
					FarmApplicationStagesImpl.class,
					farmApplicationStages.getPrimaryKeyObj());
			}

			if (farmApplicationStages != null) {
				session.delete(farmApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmApplicationStages != null) {
			clearCache(farmApplicationStages);
		}

		return farmApplicationStages;
	}

	@Override
	public FarmApplicationStages updateImpl(
		FarmApplicationStages farmApplicationStages) {

		boolean isNew = farmApplicationStages.isNew();

		if (!(farmApplicationStages instanceof
				FarmApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(farmApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					farmApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmApplicationStages implementation " +
					farmApplicationStages.getClass());
		}

		FarmApplicationStagesModelImpl farmApplicationStagesModelImpl =
			(FarmApplicationStagesModelImpl)farmApplicationStages;

		if (Validator.isNull(farmApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			farmApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmApplicationStages.setCreateDate(date);
			}
			else {
				farmApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmApplicationStages.setModifiedDate(date);
			}
			else {
				farmApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmApplicationStages);
			}
			else {
				farmApplicationStages = (FarmApplicationStages)session.merge(
					farmApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmApplicationStagesImpl.class, farmApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(farmApplicationStagesModelImpl);

		if (isNew) {
			farmApplicationStages.setNew(false);
		}

		farmApplicationStages.resetOriginalValues();

		return farmApplicationStages;
	}

	/**
	 * Returns the farm application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farm application stages
	 * @return the farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFarmApplicationStagesException {

		FarmApplicationStages farmApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (farmApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmApplicationStages;
	}

	/**
	 * Returns the farm application stages with the primary key or throws a <code>NoSuchFarmApplicationStagesException</code> if it could not be found.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages
	 * @throws NoSuchFarmApplicationStagesException if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages findByPrimaryKey(long farmApplicationStagesId)
		throws NoSuchFarmApplicationStagesException {

		return findByPrimaryKey((Serializable)farmApplicationStagesId);
	}

	/**
	 * Returns the farm application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmApplicationStagesId the primary key of the farm application stages
	 * @return the farm application stages, or <code>null</code> if a farm application stages with the primary key could not be found
	 */
	@Override
	public FarmApplicationStages fetchByPrimaryKey(
		long farmApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)farmApplicationStagesId);
	}

	/**
	 * Returns all the farm application stageses.
	 *
	 * @return the farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @return the range of farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farm application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farm application stageses
	 * @param end the upper bound of the range of farm application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farm application stageses
	 */
	@Override
	public List<FarmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FarmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindAll;
				finderArgs = FINDER_ARGS_EMPTY;
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindAll;
			finderArgs = new Object[] {start, end, orderByComparator};
		}

		List<FarmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FarmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMAPPLICATIONSTAGES;

				sql = sql.concat(FarmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmApplicationStages>)QueryUtil.list(
					query, getDialect(), start, end);

				cacheResult(list);

				if (useFinderCache) {
					finderCache.putResult(finderPath, finderArgs, list);
				}
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the farm application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmApplicationStages farmApplicationStages : findAll()) {
			remove(farmApplicationStages);
		}
	}

	/**
	 * Returns the number of farm application stageses.
	 *
	 * @return the number of farm application stageses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY,this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FARMAPPLICATIONSTAGES);

				count = (Long)query.uniqueResult();

				finderCache.putResult(
					_finderPathCountAll, FINDER_ARGS_EMPTY, count);
			}
			catch (Exception exception) {
				throw processException(exception);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	@Override
	public Set<String> getBadColumnNames() {
		return _badColumnNames;
	}

	@Override
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "farmApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farm application stages persistence.
	 */
	@Activate
	public void activate() {
		_valueObjectFinderCacheListThreshold = GetterUtil.getInteger(
			PropsUtil.get(PropsKeys.VALUE_OBJECT_FINDER_CACHE_LIST_THRESHOLD));

		_finderPathWithPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathWithoutPaginationFindAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0],
			new String[0], true);

		_finderPathCountAll = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll",
			new String[0], new String[0], false);

		_finderPathWithPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"uuid_"}, true);

		_finderPathWithoutPaginationFindByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			true);

		_finderPathCountByUuid = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid",
			new String[] {String.class.getName()}, new String[] {"uuid_"},
			false);

		_finderPathFetchByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, true);

		_finderPathCountByUUID_G = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUUID_G",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "groupId"}, false);

		_finderPathWithPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByUuid_C",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathWithoutPaginationFindByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, true);

		_finderPathCountByUuid_C = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByUuid_C",
			new String[] {String.class.getName(), Long.class.getName()},
			new String[] {"uuid_", "companyId"}, false);

		_finderPathFetchBygetFAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"farmApplicationId"}, true);

		_finderPathCountBygetFAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"farmApplicationId"}, false);

		_finderPathWithPaginationFindBygetFAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetFAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetFAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetFAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetFAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetFAS_StageName_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetFAS_StageName_Status",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetFAS_StageName_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFAS_StageName_Status",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetFAS_StageName_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_StageName_Status",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathFetchBygetFAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetFAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetFAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetFAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_setFarmApplicationStagesUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmApplicationStagesUtilPersistence(null);

		entityCache.removeCache(FarmApplicationStagesImpl.class.getName());
	}

	private void _setFarmApplicationStagesUtilPersistence(
		FarmApplicationStagesPersistence farmApplicationStagesPersistence) {

		try {
			Field field = FarmApplicationStagesUtil.class.getDeclaredField(
				"_persistence");

			field.setAccessible(true);

			field.set(null, farmApplicationStagesPersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMAPPLICATIONSTAGES =
		"SELECT farmApplicationStages FROM FarmApplicationStages farmApplicationStages";

	private static final String _SQL_SELECT_FARMAPPLICATIONSTAGES_WHERE =
		"SELECT farmApplicationStages FROM FarmApplicationStages farmApplicationStages WHERE ";

	private static final String _SQL_COUNT_FARMAPPLICATIONSTAGES =
		"SELECT COUNT(farmApplicationStages) FROM FarmApplicationStages farmApplicationStages";

	private static final String _SQL_COUNT_FARMAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(farmApplicationStages) FROM FarmApplicationStages farmApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"farmApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmApplicationStagesModelArgumentsResolver
		_farmApplicationStagesModelArgumentsResolver;

}
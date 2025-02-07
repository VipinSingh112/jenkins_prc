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

package com.nbp.farm.application.form.service.service.persistence.impl;

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

import com.nbp.farm.application.form.service.exception.NoSuchFarmerApplicationCurrentStageException;
import com.nbp.farm.application.form.service.model.FarmerApplicationCurrentStage;
import com.nbp.farm.application.form.service.model.FarmerApplicationCurrentStageTable;
import com.nbp.farm.application.form.service.model.impl.FarmerApplicationCurrentStageImpl;
import com.nbp.farm.application.form.service.model.impl.FarmerApplicationCurrentStageModelImpl;
import com.nbp.farm.application.form.service.service.persistence.FarmerApplicationCurrentStagePersistence;
import com.nbp.farm.application.form.service.service.persistence.FarmerApplicationCurrentStageUtil;
import com.nbp.farm.application.form.service.service.persistence.impl.constants.FARMERAPPLICATIONPersistenceConstants;

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
 * The persistence implementation for the farmer application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(
	service = {
		FarmerApplicationCurrentStagePersistence.class, BasePersistence.class
	}
)
public class FarmerApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<FarmerApplicationCurrentStage>
	implements FarmerApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FarmerApplicationCurrentStageUtil</code> to access the farmer application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FarmerApplicationCurrentStageImpl.class.getName();

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
	 * Returns all the farmer application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @return the range of matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
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

		List<FarmerApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FarmerApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerApplicationCurrentStage
						farmerApplicationCurrentStage : list) {

					if (!uuid.equals(farmerApplicationCurrentStage.getUuid())) {
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

			sb.append(_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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
				sb.append(FarmerApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FarmerApplicationCurrentStage>)QueryUtil.list(
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
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findByUuid_First(
			String uuid,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			fetchByUuid_First(uuid, orderByComparator);

		if (farmerApplicationCurrentStage != null) {
			return farmerApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFarmerApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		List<FarmerApplicationCurrentStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findByUuid_Last(
			String uuid,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			fetchByUuid_Last(uuid, orderByComparator);

		if (farmerApplicationCurrentStage != null) {
			return farmerApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFarmerApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FarmerApplicationCurrentStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer application current stages before and after the current farmer application current stage in the ordered set where uuid = &#63;.
	 *
	 * @param farmerCurrentStageId the primary key of the current farmer application current stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage[] findByUuid_PrevAndNext(
			long farmerCurrentStageId, String uuid,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException {

		uuid = Objects.toString(uuid, "");

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			findByPrimaryKey(farmerCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			FarmerApplicationCurrentStage[] array =
				new FarmerApplicationCurrentStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, farmerApplicationCurrentStage, uuid, orderByComparator,
				true);

			array[1] = farmerApplicationCurrentStage;

			array[2] = getByUuid_PrevAndNext(
				session, farmerApplicationCurrentStage, uuid, orderByComparator,
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

	protected FarmerApplicationCurrentStage getByUuid_PrevAndNext(
		Session session,
		FarmerApplicationCurrentStage farmerApplicationCurrentStage,
		String uuid,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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
			sb.append(FarmerApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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
						farmerApplicationCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerApplicationCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer application current stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FarmerApplicationCurrentStage farmerApplicationCurrentStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(farmerApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of farmer application current stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching farmer application current stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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
		"farmerApplicationCurrentStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(farmerApplicationCurrentStage.uuid IS NULL OR farmerApplicationCurrentStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			fetchByUUID_G(uuid, groupId);

		if (farmerApplicationCurrentStage == null) {
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

			throw new NoSuchFarmerApplicationCurrentStageException(
				sb.toString());
		}

		return farmerApplicationCurrentStage;
	}

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the farmer application current stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchByUUID_G(
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

		if (result instanceof FarmerApplicationCurrentStage) {
			FarmerApplicationCurrentStage farmerApplicationCurrentStage =
				(FarmerApplicationCurrentStage)result;

			if (!Objects.equals(
					uuid, farmerApplicationCurrentStage.getUuid()) ||
				(groupId != farmerApplicationCurrentStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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

				List<FarmerApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					FarmerApplicationCurrentStage
						farmerApplicationCurrentStage = list.get(0);

					result = farmerApplicationCurrentStage;

					cacheResult(farmerApplicationCurrentStage);
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
			return (FarmerApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the farmer application current stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the farmer application current stage that was removed
	 */
	@Override
	public FarmerApplicationCurrentStage removeByUUID_G(
			String uuid, long groupId)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			findByUUID_G(uuid, groupId);

		return remove(farmerApplicationCurrentStage);
	}

	/**
	 * Returns the number of farmer application current stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching farmer application current stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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
		"farmerApplicationCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(farmerApplicationCurrentStage.uuid IS NULL OR farmerApplicationCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"farmerApplicationCurrentStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @return the range of matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
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

		List<FarmerApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FarmerApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs,this);

			if ((list != null) && !list.isEmpty()) {
				for (FarmerApplicationCurrentStage
						farmerApplicationCurrentStage : list) {

					if (!uuid.equals(farmerApplicationCurrentStage.getUuid()) ||
						(companyId !=
							farmerApplicationCurrentStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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
				sb.append(FarmerApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FarmerApplicationCurrentStage>)QueryUtil.list(
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
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (farmerApplicationCurrentStage != null) {
			return farmerApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFarmerApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the first farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		List<FarmerApplicationCurrentStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (farmerApplicationCurrentStage != null) {
			return farmerApplicationCurrentStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFarmerApplicationCurrentStageException(sb.toString());
	}

	/**
	 * Returns the last farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FarmerApplicationCurrentStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the farmer application current stages before and after the current farmer application current stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param farmerCurrentStageId the primary key of the current farmer application current stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage[] findByUuid_C_PrevAndNext(
			long farmerCurrentStageId, String uuid, long companyId,
			OrderByComparator<FarmerApplicationCurrentStage> orderByComparator)
		throws NoSuchFarmerApplicationCurrentStageException {

		uuid = Objects.toString(uuid, "");

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			findByPrimaryKey(farmerCurrentStageId);

		Session session = null;

		try {
			session = openSession();

			FarmerApplicationCurrentStage[] array =
				new FarmerApplicationCurrentStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, farmerApplicationCurrentStage, uuid, companyId,
				orderByComparator, true);

			array[1] = farmerApplicationCurrentStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, farmerApplicationCurrentStage, uuid, companyId,
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

	protected FarmerApplicationCurrentStage getByUuid_C_PrevAndNext(
		Session session,
		FarmerApplicationCurrentStage farmerApplicationCurrentStage,
		String uuid, long companyId,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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
			sb.append(FarmerApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
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
						farmerApplicationCurrentStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FarmerApplicationCurrentStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the farmer application current stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (FarmerApplicationCurrentStage farmerApplicationCurrentStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(farmerApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of farmer application current stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching farmer application current stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

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
		"farmerApplicationCurrentStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(farmerApplicationCurrentStage.uuid IS NULL OR farmerApplicationCurrentStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"farmerApplicationCurrentStage.companyId = ?";

	private FinderPath _finderPathFetchBygetfarmerById;
	private FinderPath _finderPathCountBygetfarmerById;

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findBygetfarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			fetchBygetfarmerById(farmerApplicationId);

		if (farmerApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("farmerApplicationId=");
			sb.append(farmerApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFarmerApplicationCurrentStageException(
				sb.toString());
		}

		return farmerApplicationCurrentStage;
	}

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchBygetfarmerById(
		long farmerApplicationId) {

		return fetchBygetfarmerById(farmerApplicationId, true);
	}

	/**
	 * Returns the farmer application current stage where farmerApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching farmer application current stage, or <code>null</code> if a matching farmer application current stage could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchBygetfarmerById(
		long farmerApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {farmerApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetfarmerById, finderArgs,this);
		}

		if (result instanceof FarmerApplicationCurrentStage) {
			FarmerApplicationCurrentStage farmerApplicationCurrentStage =
				(FarmerApplicationCurrentStage)result;

			if (farmerApplicationId !=
					farmerApplicationCurrentStage.getFarmerApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

				List<FarmerApplicationCurrentStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetfarmerById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {farmerApplicationId};
							}

							_log.warn(
								"FarmerApplicationCurrentStagePersistenceImpl.fetchBygetfarmerById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FarmerApplicationCurrentStage
						farmerApplicationCurrentStage = list.get(0);

					result = farmerApplicationCurrentStage;

					cacheResult(farmerApplicationCurrentStage);
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
			return (FarmerApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the farmer application current stage where farmerApplicationId = &#63; from the database.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the farmer application current stage that was removed
	 */
	@Override
	public FarmerApplicationCurrentStage removeBygetfarmerById(
			long farmerApplicationId)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			findBygetfarmerById(farmerApplicationId);

		return remove(farmerApplicationCurrentStage);
	}

	/**
	 * Returns the number of farmer application current stages where farmerApplicationId = &#63;.
	 *
	 * @param farmerApplicationId the farmer application ID
	 * @return the number of matching farmer application current stages
	 */
	@Override
	public int countBygetfarmerById(long farmerApplicationId) {
		FinderPath finderPath = _finderPathCountBygetfarmerById;

		Object[] finderArgs = new Object[] {farmerApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs,this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FARMERAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(farmerApplicationId);

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
		_FINDER_COLUMN_GETFARMERBYID_FARMERAPPLICATIONID_2 =
			"farmerApplicationCurrentStage.farmerApplicationId = ?";

	public FarmerApplicationCurrentStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FarmerApplicationCurrentStage.class);

		setModelImplClass(FarmerApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(FarmerApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the farmer application current stage in the entity cache if it is enabled.
	 *
	 * @param farmerApplicationCurrentStage the farmer application current stage
	 */
	@Override
	public void cacheResult(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		entityCache.putResult(
			FarmerApplicationCurrentStageImpl.class,
			farmerApplicationCurrentStage.getPrimaryKey(),
			farmerApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				farmerApplicationCurrentStage.getUuid(),
				farmerApplicationCurrentStage.getGroupId()
			},
			farmerApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetfarmerById,
			new Object[] {
				farmerApplicationCurrentStage.getFarmerApplicationId()
			},
			farmerApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the farmer application current stages in the entity cache if it is enabled.
	 *
	 * @param farmerApplicationCurrentStages the farmer application current stages
	 */
	@Override
	public void cacheResult(
		List<FarmerApplicationCurrentStage> farmerApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (farmerApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FarmerApplicationCurrentStage farmerApplicationCurrentStage :
				farmerApplicationCurrentStages) {

			if (entityCache.getResult(
					FarmerApplicationCurrentStageImpl.class,
					farmerApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(farmerApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all farmer application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FarmerApplicationCurrentStageImpl.class);

		finderCache.clearCache(FarmerApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the farmer application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		entityCache.removeResult(
			FarmerApplicationCurrentStageImpl.class,
			farmerApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<FarmerApplicationCurrentStage> farmerApplicationCurrentStages) {

		for (FarmerApplicationCurrentStage farmerApplicationCurrentStage :
				farmerApplicationCurrentStages) {

			entityCache.removeResult(
				FarmerApplicationCurrentStageImpl.class,
				farmerApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FarmerApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FarmerApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FarmerApplicationCurrentStageModelImpl
			farmerApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			farmerApplicationCurrentStageModelImpl.getUuid(),
			farmerApplicationCurrentStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			farmerApplicationCurrentStageModelImpl);

		args = new Object[] {
			farmerApplicationCurrentStageModelImpl.getFarmerApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetfarmerById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetfarmerById, args,
			farmerApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new farmer application current stage with the primary key. Does not add the farmer application current stage to the database.
	 *
	 * @param farmerCurrentStageId the primary key for the new farmer application current stage
	 * @return the new farmer application current stage
	 */
	@Override
	public FarmerApplicationCurrentStage create(long farmerCurrentStageId) {
		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			new FarmerApplicationCurrentStageImpl();

		farmerApplicationCurrentStage.setNew(true);
		farmerApplicationCurrentStage.setPrimaryKey(farmerCurrentStageId);

		String uuid = PortalUUIDUtil.generate();

		farmerApplicationCurrentStage.setUuid(uuid);

		farmerApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return farmerApplicationCurrentStage;
	}

	/**
	 * Removes the farmer application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage that was removed
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage remove(long farmerCurrentStageId)
		throws NoSuchFarmerApplicationCurrentStageException {

		return remove((Serializable)farmerCurrentStageId);
	}

	/**
	 * Removes the farmer application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the farmer application current stage
	 * @return the farmer application current stage that was removed
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchFarmerApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			FarmerApplicationCurrentStage farmerApplicationCurrentStage =
				(FarmerApplicationCurrentStage)session.get(
					FarmerApplicationCurrentStageImpl.class, primaryKey);

			if (farmerApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFarmerApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(farmerApplicationCurrentStage);
		}
		catch (NoSuchFarmerApplicationCurrentStageException
					noSuchEntityException) {

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
	protected FarmerApplicationCurrentStage removeImpl(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(farmerApplicationCurrentStage)) {
				farmerApplicationCurrentStage =
					(FarmerApplicationCurrentStage)session.get(
						FarmerApplicationCurrentStageImpl.class,
						farmerApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (farmerApplicationCurrentStage != null) {
				session.delete(farmerApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (farmerApplicationCurrentStage != null) {
			clearCache(farmerApplicationCurrentStage);
		}

		return farmerApplicationCurrentStage;
	}

	@Override
	public FarmerApplicationCurrentStage updateImpl(
		FarmerApplicationCurrentStage farmerApplicationCurrentStage) {

		boolean isNew = farmerApplicationCurrentStage.isNew();

		if (!(farmerApplicationCurrentStage instanceof
				FarmerApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					farmerApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					farmerApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in farmerApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FarmerApplicationCurrentStage implementation " +
					farmerApplicationCurrentStage.getClass());
		}

		FarmerApplicationCurrentStageModelImpl
			farmerApplicationCurrentStageModelImpl =
				(FarmerApplicationCurrentStageModelImpl)
					farmerApplicationCurrentStage;

		if (Validator.isNull(farmerApplicationCurrentStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			farmerApplicationCurrentStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (farmerApplicationCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				farmerApplicationCurrentStage.setCreateDate(date);
			}
			else {
				farmerApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!farmerApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				farmerApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				farmerApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(farmerApplicationCurrentStage);
			}
			else {
				farmerApplicationCurrentStage =
					(FarmerApplicationCurrentStage)session.merge(
						farmerApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FarmerApplicationCurrentStageImpl.class,
			farmerApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(farmerApplicationCurrentStageModelImpl);

		if (isNew) {
			farmerApplicationCurrentStage.setNew(false);
		}

		farmerApplicationCurrentStage.resetOriginalValues();

		return farmerApplicationCurrentStage;
	}

	/**
	 * Returns the farmer application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the farmer application current stage
	 * @return the farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchFarmerApplicationCurrentStageException {

		FarmerApplicationCurrentStage farmerApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (farmerApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFarmerApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return farmerApplicationCurrentStage;
	}

	/**
	 * Returns the farmer application current stage with the primary key or throws a <code>NoSuchFarmerApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage
	 * @throws NoSuchFarmerApplicationCurrentStageException if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage findByPrimaryKey(
			long farmerCurrentStageId)
		throws NoSuchFarmerApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)farmerCurrentStageId);
	}

	/**
	 * Returns the farmer application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param farmerCurrentStageId the primary key of the farmer application current stage
	 * @return the farmer application current stage, or <code>null</code> if a farmer application current stage with the primary key could not be found
	 */
	@Override
	public FarmerApplicationCurrentStage fetchByPrimaryKey(
		long farmerCurrentStageId) {

		return fetchByPrimaryKey((Serializable)farmerCurrentStageId);
	}

	/**
	 * Returns all the farmer application current stages.
	 *
	 * @return the farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the farmer application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @return the range of farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the farmer application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the farmer application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FarmerApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of farmer application current stages
	 * @param end the upper bound of the range of farmer application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of farmer application current stages
	 */
	@Override
	public List<FarmerApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FarmerApplicationCurrentStage> orderByComparator,
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

		List<FarmerApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FarmerApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs,this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					FarmerApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FarmerApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the farmer application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FarmerApplicationCurrentStage farmerApplicationCurrentStage :
				findAll()) {

			remove(farmerApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of farmer application current stages.
	 *
	 * @return the number of farmer application current stages
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
					_SQL_COUNT_FARMERAPPLICATIONCURRENTSTAGE);

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
		return "farmerCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FarmerApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the farmer application current stage persistence.
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

		_finderPathFetchBygetfarmerById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetfarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, true);

		_finderPathCountBygetfarmerById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetfarmerById",
			new String[] {Long.class.getName()},
			new String[] {"farmerApplicationId"}, false);

		_setFarmerApplicationCurrentStageUtilPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		_setFarmerApplicationCurrentStageUtilPersistence(null);

		entityCache.removeCache(
			FarmerApplicationCurrentStageImpl.class.getName());
	}

	private void _setFarmerApplicationCurrentStageUtilPersistence(
		FarmerApplicationCurrentStagePersistence
			farmerApplicationCurrentStagePersistence) {

		try {
			Field field =
				FarmerApplicationCurrentStageUtil.class.getDeclaredField(
					"_persistence");

			field.setAccessible(true);

			field.set(null, farmerApplicationCurrentStagePersistence);
		}
		catch (ReflectiveOperationException reflectiveOperationException) {
			throw new RuntimeException(reflectiveOperationException);
		}
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FARMERAPPLICATIONPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE =
		"SELECT farmerApplicationCurrentStage FROM FarmerApplicationCurrentStage farmerApplicationCurrentStage";

	private static final String
		_SQL_SELECT_FARMERAPPLICATIONCURRENTSTAGE_WHERE =
			"SELECT farmerApplicationCurrentStage FROM FarmerApplicationCurrentStage farmerApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_FARMERAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(farmerApplicationCurrentStage) FROM FarmerApplicationCurrentStage farmerApplicationCurrentStage";

	private static final String _SQL_COUNT_FARMERAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT COUNT(farmerApplicationCurrentStage) FROM FarmerApplicationCurrentStage farmerApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"farmerApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FarmerApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FarmerApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FarmerApplicationCurrentStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

	@Reference
	private FarmerApplicationCurrentStageModelArgumentsResolver
		_farmerApplicationCurrentStageModelArgumentsResolver;

}
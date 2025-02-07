/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.stage.service.service.persistence.impl;

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

import com.nbp.fire.brigade.stage.service.exception.NoSuchFireBrigadeApplicationStageException;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStage;
import com.nbp.fire.brigade.stage.service.model.FireBrigadeApplicationStageTable;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageImpl;
import com.nbp.fire.brigade.stage.service.model.impl.FireBrigadeApplicationStageModelImpl;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeApplicationStagePersistence;
import com.nbp.fire.brigade.stage.service.service.persistence.FireBrigadeApplicationStageUtil;
import com.nbp.fire.brigade.stage.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

import java.io.Serializable;

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
 * The persistence implementation for the fire brigade application stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeApplicationStagePersistence.class)
public class FireBrigadeApplicationStagePersistenceImpl
	extends BasePersistenceImpl<FireBrigadeApplicationStage>
	implements FireBrigadeApplicationStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeApplicationStageUtil</code> to access the fire brigade application stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeApplicationStageImpl.class.getName();

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
	 * Returns all the fire brigade application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
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

		List<FireBrigadeApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
						list) {

					if (!uuid.equals(fireBrigadeApplicationStage.getUuid())) {
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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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
				sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplicationStage>)QueryUtil.list(
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
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByUuid_First(
			String uuid,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByUuid_First(uuid, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByUuid_First(
		String uuid,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		List<FireBrigadeApplicationStage> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByUuid_Last(
			String uuid,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByUuid_Last(uuid, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByUuid_Last(
		String uuid,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplicationStage> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where uuid = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage[] findByUuid_PrevAndNext(
			long fireBrigadeAppStageId, String uuid,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		uuid = Objects.toString(uuid, "");

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByPrimaryKey(fireBrigadeAppStageId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplicationStage[] array =
				new FireBrigadeApplicationStageImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, fireBrigadeApplicationStage, uuid, orderByComparator,
				true);

			array[1] = fireBrigadeApplicationStage;

			array[2] = getByUuid_PrevAndNext(
				session, fireBrigadeApplicationStage, uuid, orderByComparator,
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

	protected FireBrigadeApplicationStage getByUuid_PrevAndNext(
		Session session,
		FireBrigadeApplicationStage fireBrigadeApplicationStage, String uuid,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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
			sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade application stages where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeApplicationStage);
		}
	}

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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
		"fireBrigadeApplicationStage.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(fireBrigadeApplicationStage.uuid IS NULL OR fireBrigadeApplicationStage.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage = fetchByUUID_G(
			uuid, groupId);

		if (fireBrigadeApplicationStage == null) {
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

			throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
		}

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByUUID_G(
		String uuid, long groupId) {

		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the fire brigade application stage where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		uuid = Objects.toString(uuid, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {uuid, groupId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByUUID_G, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplicationStage) {
			FireBrigadeApplicationStage fireBrigadeApplicationStage =
				(FireBrigadeApplicationStage)result;

			if (!Objects.equals(uuid, fireBrigadeApplicationStage.getUuid()) ||
				(groupId != fireBrigadeApplicationStage.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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

				List<FireBrigadeApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					FireBrigadeApplicationStage fireBrigadeApplicationStage =
						list.get(0);

					result = fireBrigadeApplicationStage;

					cacheResult(fireBrigadeApplicationStage);
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
			return (FireBrigadeApplicationStage)result;
		}
	}

	/**
	 * Removes the fire brigade application stage where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the fire brigade application stage that was removed
	 */
	@Override
	public FireBrigadeApplicationStage removeByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage = findByUUID_G(
			uuid, groupId);

		return remove(fireBrigadeApplicationStage);
	}

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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
		"fireBrigadeApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(fireBrigadeApplicationStage.uuid IS NULL OR fireBrigadeApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"fireBrigadeApplicationStage.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
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

		List<FireBrigadeApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
						list) {

					if (!uuid.equals(fireBrigadeApplicationStage.getUuid()) ||
						(companyId !=
							fireBrigadeApplicationStage.getCompanyId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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
				sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplicationStage>)QueryUtil.list(
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
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		List<FireBrigadeApplicationStage> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplicationStage> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage[] findByUuid_C_PrevAndNext(
			long fireBrigadeAppStageId, String uuid, long companyId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		uuid = Objects.toString(uuid, "");

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByPrimaryKey(fireBrigadeAppStageId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplicationStage[] array =
				new FireBrigadeApplicationStageImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, fireBrigadeApplicationStage, uuid, companyId,
				orderByComparator, true);

			array[1] = fireBrigadeApplicationStage;

			array[2] = getByUuid_C_PrevAndNext(
				session, fireBrigadeApplicationStage, uuid, companyId,
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

	protected FireBrigadeApplicationStage getByUuid_C_PrevAndNext(
		Session session,
		FireBrigadeApplicationStage fireBrigadeApplicationStage, String uuid,
		long companyId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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
			sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade application stages where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(fireBrigadeApplicationStage);
		}
	}

	/**
	 * Returns the number of fire brigade application stages where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

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
		"fireBrigadeApplicationStage.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(fireBrigadeApplicationStage.uuid IS NULL OR fireBrigadeApplicationStage.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"fireBrigadeApplicationStage.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByget_FB_AppStage_By_CI;
	private FinderPath _finderPathWithoutPaginationFindByget_FB_AppStage_By_CI;
	private FinderPath _finderPathCountByget_FB_AppStage_By_CI;

	/**
	 * Returns all the fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId) {

		return findByget_FB_AppStage_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId, int start, int end) {

		return findByget_FB_AppStage_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return findByget_FB_AppStage_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByget_FB_AppStage_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByget_FB_AppStage_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FireBrigadeApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
						list) {

					if (!caseId.equals(
							fireBrigadeApplicationStage.getCaseId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplicationStage>)QueryUtil.list(
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
	 * Returns the first fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_AppStage_By_CI_First(
			String caseId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_AppStage_By_CI_First(caseId, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_By_CI_First(
		String caseId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		List<FireBrigadeApplicationStage> list = findByget_FB_AppStage_By_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_AppStage_By_CI_Last(
			String caseId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_AppStage_By_CI_Last(caseId, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_By_CI_Last(
		String caseId,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		int count = countByget_FB_AppStage_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplicationStage> list = findByget_FB_AppStage_By_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where caseId = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage[]
			findByget_FB_AppStage_By_CI_PrevAndNext(
				long fireBrigadeAppStageId, String caseId,
				OrderByComparator<FireBrigadeApplicationStage>
					orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		caseId = Objects.toString(caseId, "");

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByPrimaryKey(fireBrigadeAppStageId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplicationStage[] array =
				new FireBrigadeApplicationStageImpl[3];

			array[0] = getByget_FB_AppStage_By_CI_PrevAndNext(
				session, fireBrigadeApplicationStage, caseId, orderByComparator,
				true);

			array[1] = fireBrigadeApplicationStage;

			array[2] = getByget_FB_AppStage_By_CI_PrevAndNext(
				session, fireBrigadeApplicationStage, caseId, orderByComparator,
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

	protected FireBrigadeApplicationStage
		getByget_FB_AppStage_By_CI_PrevAndNext(
			Session session,
			FireBrigadeApplicationStage fireBrigadeApplicationStage,
			String caseId,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_2);
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
			sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeByget_FB_AppStage_By_CI(String caseId) {
		for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
				findByget_FB_AppStage_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeApplicationStage);
		}
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByget_FB_AppStage_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByget_FB_AppStage_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_2 =
		"fireBrigadeApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GET_FB_APPSTAGE_BY_CI_CASEID_3 =
		"(fireBrigadeApplicationStage.caseId IS NULL OR fireBrigadeApplicationStage.caseId = '')";

	private FinderPath _finderPathFetchByget_FB_AppStage_CI;
	private FinderPath _finderPathCountByget_FB_AppStage_CI;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_AppStage_CI(String caseId)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_AppStage_CI(caseId);

		if (fireBrigadeApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
		}

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_CI(
		String caseId) {

		return fetchByget_FB_AppStage_CI(caseId, true);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_AppStage_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_FB_AppStage_CI, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplicationStage) {
			FireBrigadeApplicationStage fireBrigadeApplicationStage =
				(FireBrigadeApplicationStage)result;

			if (!Objects.equals(
					caseId, fireBrigadeApplicationStage.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_CI_CASEID_2);
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

				List<FireBrigadeApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_FB_AppStage_CI, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId};
							}

							_log.warn(
								"FireBrigadeApplicationStagePersistenceImpl.fetchByget_FB_AppStage_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplicationStage fireBrigadeApplicationStage =
						list.get(0);

					result = fireBrigadeApplicationStage;

					cacheResult(fireBrigadeApplicationStage);
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
			return (FireBrigadeApplicationStage)result;
		}
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade application stage that was removed
	 */
	@Override
	public FireBrigadeApplicationStage removeByget_FB_AppStage_CI(String caseId)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByget_FB_AppStage_CI(caseId);

		return remove(fireBrigadeApplicationStage);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByget_FB_AppStage_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByget_FB_AppStage_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_APPSTAGE_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GET_FB_APPSTAGE_CI_CASEID_2 =
		"fireBrigadeApplicationStage.caseId = ?";

	private static final String _FINDER_COLUMN_GET_FB_APPSTAGE_CI_CASEID_3 =
		"(fireBrigadeApplicationStage.caseId IS NULL OR fireBrigadeApplicationStage.caseId = '')";

	private FinderPath _finderPathWithPaginationFindByget_FB_By_SN;
	private FinderPath _finderPathWithoutPaginationFindByget_FB_By_SN;
	private FinderPath _finderPathCountByget_FB_By_SN;

	/**
	 * Returns all the fire brigade application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName) {

		return findByget_FB_By_SN(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end) {

		return findByget_FB_By_SN(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return findByget_FB_By_SN(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findByget_FB_By_SN(
		String stageName, int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByget_FB_By_SN;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByget_FB_By_SN;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<FireBrigadeApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
						list) {

					if (!stageName.equals(
							fireBrigadeApplicationStage.getStageName())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplicationStage>)QueryUtil.list(
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
	 * Returns the first fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_By_SN_First(
			String stageName,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_By_SN_First(stageName, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_SN_First(
		String stageName,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		List<FireBrigadeApplicationStage> list = findByget_FB_By_SN(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_By_SN_Last(
			String stageName,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_By_SN_Last(stageName, orderByComparator);

		if (fireBrigadeApplicationStage != null) {
			return fireBrigadeApplicationStage;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_SN_Last(
		String stageName,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		int count = countByget_FB_By_SN(stageName);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplicationStage> list = findByget_FB_By_SN(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade application stages before and after the current fire brigade application stage in the ordered set where stageName = &#63;.
	 *
	 * @param fireBrigadeAppStageId the primary key of the current fire brigade application stage
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage[] findByget_FB_By_SN_PrevAndNext(
			long fireBrigadeAppStageId, String stageName,
			OrderByComparator<FireBrigadeApplicationStage> orderByComparator)
		throws NoSuchFireBrigadeApplicationStageException {

		stageName = Objects.toString(stageName, "");

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByPrimaryKey(fireBrigadeAppStageId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplicationStage[] array =
				new FireBrigadeApplicationStageImpl[3];

			array[0] = getByget_FB_By_SN_PrevAndNext(
				session, fireBrigadeApplicationStage, stageName,
				orderByComparator, true);

			array[1] = fireBrigadeApplicationStage;

			array[2] = getByget_FB_By_SN_PrevAndNext(
				session, fireBrigadeApplicationStage, stageName,
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

	protected FireBrigadeApplicationStage getByget_FB_By_SN_PrevAndNext(
		Session session,
		FireBrigadeApplicationStage fireBrigadeApplicationStage,
		String stageName,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_2);
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
			sb.append(FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplicationStage)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplicationStage> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade application stages where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeByget_FB_By_SN(String stageName) {
		for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
				findByget_FB_By_SN(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeApplicationStage);
		}
	}

	/**
	 * Returns the number of fire brigade application stages where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByget_FB_By_SN(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountByget_FB_By_SN;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_2 =
		"fireBrigadeApplicationStage.stageName = ?";

	private static final String _FINDER_COLUMN_GET_FB_BY_SN_STAGENAME_3 =
		"(fireBrigadeApplicationStage.stageName IS NULL OR fireBrigadeApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchByget_FB_By_Status;
	private FinderPath _finderPathCountByget_FB_By_Status;

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_By_Status(
			String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_By_Status(stageStatus);

		if (fireBrigadeApplicationStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
		}

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_Status(
		String stageStatus) {

		return fetchByget_FB_By_Status(stageStatus, true);
	}

	/**
	 * Returns the fire brigade application stage where stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_Status(
		String stageStatus, boolean useFinderCache) {

		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_FB_By_Status, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplicationStage) {
			FireBrigadeApplicationStage fireBrigadeApplicationStage =
				(FireBrigadeApplicationStage)result;

			if (!Objects.equals(
					stageStatus,
					fireBrigadeApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_STATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<FireBrigadeApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_FB_By_Status, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {stageStatus};
							}

							_log.warn(
								"FireBrigadeApplicationStagePersistenceImpl.fetchByget_FB_By_Status(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplicationStage fireBrigadeApplicationStage =
						list.get(0);

					result = fireBrigadeApplicationStage;

					cacheResult(fireBrigadeApplicationStage);
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
			return (FireBrigadeApplicationStage)result;
		}
	}

	/**
	 * Removes the fire brigade application stage where stageStatus = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	@Override
	public FireBrigadeApplicationStage removeByget_FB_By_Status(
			String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByget_FB_By_Status(stageStatus);

		return remove(fireBrigadeApplicationStage);
	}

	/**
	 * Returns the number of fire brigade application stages where stageStatus = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByget_FB_By_Status(String stageStatus) {
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByget_FB_By_Status;

		Object[] finderArgs = new Object[] {stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_STATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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

	private static final String _FINDER_COLUMN_GET_FB_BY_STATUS_STAGESTATUS_2 =
		"fireBrigadeApplicationStage.stageStatus = ?";

	private static final String _FINDER_COLUMN_GET_FB_BY_STATUS_STAGESTATUS_3 =
		"(fireBrigadeApplicationStage.stageStatus IS NULL OR fireBrigadeApplicationStage.stageStatus = '')";

	private FinderPath _finderPathFetchByget_FB_By_CI_SN_SS;
	private FinderPath _finderPathCountByget_FB_By_CI_SN_SS;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_By_CI_SN_SS(caseId, stageName, stageStatus);

		if (fireBrigadeApplicationStage == null) {
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

			throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
		}

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		return fetchByget_FB_By_CI_SN_SS(caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN_SS(
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
				_finderPathFetchByget_FB_By_CI_SN_SS, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplicationStage) {
			FireBrigadeApplicationStage fireBrigadeApplicationStage =
				(FireBrigadeApplicationStage)result;

			if (!Objects.equals(
					caseId, fireBrigadeApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageName, fireBrigadeApplicationStage.getStageName()) ||
				!Objects.equals(
					stageStatus,
					fireBrigadeApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGESTATUS_2);
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

				List<FireBrigadeApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_FB_By_CI_SN_SS, finderArgs,
							list);
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
								"FireBrigadeApplicationStagePersistenceImpl.fetchByget_FB_By_CI_SN_SS(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplicationStage fireBrigadeApplicationStage =
						list.get(0);

					result = fireBrigadeApplicationStage;

					cacheResult(fireBrigadeApplicationStage);
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
			return (FireBrigadeApplicationStage)result;
		}
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	@Override
	public FireBrigadeApplicationStage removeByget_FB_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByget_FB_By_CI_SN_SS(caseId, stageName, stageStatus);

		return remove(fireBrigadeApplicationStage);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByget_FB_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByget_FB_By_CI_SN_SS;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_SS_CASEID_2 =
		"fireBrigadeApplicationStage.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_SS_CASEID_3 =
		"(fireBrigadeApplicationStage.caseId IS NULL OR fireBrigadeApplicationStage.caseId = '') AND ";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGENAME_2 =
		"fireBrigadeApplicationStage.stageName = ? AND ";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGENAME_3 =
		"(fireBrigadeApplicationStage.stageName IS NULL OR fireBrigadeApplicationStage.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGESTATUS_2 =
			"fireBrigadeApplicationStage.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GET_FB_BY_CI_SN_SS_STAGESTATUS_3 =
			"(fireBrigadeApplicationStage.stageStatus IS NULL OR fireBrigadeApplicationStage.stageStatus = '')";

	private FinderPath _finderPathFetchByget_FB_By_CI_SN;
	private FinderPath _finderPathCountByget_FB_By_CI_SN;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_By_CI_SN(caseId, stageName);

		if (fireBrigadeApplicationStage == null) {
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

			throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
		}

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN(
		String caseId, String stageName) {

		return fetchByget_FB_By_CI_SN(caseId, stageName, true);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SN(
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
				_finderPathFetchByget_FB_By_CI_SN, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplicationStage) {
			FireBrigadeApplicationStage fireBrigadeApplicationStage =
				(FireBrigadeApplicationStage)result;

			if (!Objects.equals(
					caseId, fireBrigadeApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageName, fireBrigadeApplicationStage.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_STAGENAME_2);
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

				List<FireBrigadeApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_FB_By_CI_SN, finderArgs,
							list);
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
								"FireBrigadeApplicationStagePersistenceImpl.fetchByget_FB_By_CI_SN(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplicationStage fireBrigadeApplicationStage =
						list.get(0);

					result = fireBrigadeApplicationStage;

					cacheResult(fireBrigadeApplicationStage);
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
			return (FireBrigadeApplicationStage)result;
		}
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the fire brigade application stage that was removed
	 */
	@Override
	public FireBrigadeApplicationStage removeByget_FB_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByget_FB_By_CI_SN(caseId, stageName);

		return remove(fireBrigadeApplicationStage);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByget_FB_By_CI_SN(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountByget_FB_By_CI_SN;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SN_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_CASEID_2 =
		"fireBrigadeApplicationStage.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_CASEID_3 =
		"(fireBrigadeApplicationStage.caseId IS NULL OR fireBrigadeApplicationStage.caseId = '') AND ";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_STAGENAME_2 =
		"fireBrigadeApplicationStage.stageName = ?";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SN_STAGENAME_3 =
		"(fireBrigadeApplicationStage.stageName IS NULL OR fireBrigadeApplicationStage.stageName = '')";

	private FinderPath _finderPathFetchByget_FB_By_CI_SS;
	private FinderPath _finderPathCountByget_FB_By_CI_SS;

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByget_FB_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByget_FB_By_CI_SS(caseId, stageStatus);

		if (fireBrigadeApplicationStage == null) {
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

			throw new NoSuchFireBrigadeApplicationStageException(sb.toString());
		}

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SS(
		String caseId, String stageStatus) {

		return fetchByget_FB_By_CI_SS(caseId, stageStatus, true);
	}

	/**
	 * Returns the fire brigade application stage where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application stage, or <code>null</code> if a matching fire brigade application stage could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByget_FB_By_CI_SS(
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
				_finderPathFetchByget_FB_By_CI_SS, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplicationStage) {
			FireBrigadeApplicationStage fireBrigadeApplicationStage =
				(FireBrigadeApplicationStage)result;

			if (!Objects.equals(
					caseId, fireBrigadeApplicationStage.getCaseId()) ||
				!Objects.equals(
					stageStatus,
					fireBrigadeApplicationStage.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_STAGESTATUS_2);
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

				List<FireBrigadeApplicationStage> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_FB_By_CI_SS, finderArgs,
							list);
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
								"FireBrigadeApplicationStagePersistenceImpl.fetchByget_FB_By_CI_SS(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplicationStage fireBrigadeApplicationStage =
						list.get(0);

					result = fireBrigadeApplicationStage;

					cacheResult(fireBrigadeApplicationStage);
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
			return (FireBrigadeApplicationStage)result;
		}
	}

	/**
	 * Removes the fire brigade application stage where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the fire brigade application stage that was removed
	 */
	@Override
	public FireBrigadeApplicationStage removeByget_FB_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			findByget_FB_By_CI_SS(caseId, stageStatus);

		return remove(fireBrigadeApplicationStage);
	}

	/**
	 * Returns the number of fire brigade application stages where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching fire brigade application stages
	 */
	@Override
	public int countByget_FB_By_CI_SS(String caseId, String stageStatus) {
		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByget_FB_By_CI_SS;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_FB_BY_CI_SS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SS_CASEID_2 =
		"fireBrigadeApplicationStage.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SS_CASEID_3 =
		"(fireBrigadeApplicationStage.caseId IS NULL OR fireBrigadeApplicationStage.caseId = '') AND ";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SS_STAGESTATUS_2 =
		"fireBrigadeApplicationStage.stageStatus = ?";

	private static final String _FINDER_COLUMN_GET_FB_BY_CI_SS_STAGESTATUS_3 =
		"(fireBrigadeApplicationStage.stageStatus IS NULL OR fireBrigadeApplicationStage.stageStatus = '')";

	public FireBrigadeApplicationStagePersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FireBrigadeApplicationStage.class);

		setModelImplClass(FireBrigadeApplicationStageImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeApplicationStageTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade application stage in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplicationStage the fire brigade application stage
	 */
	@Override
	public void cacheResult(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		entityCache.putResult(
			FireBrigadeApplicationStageImpl.class,
			fireBrigadeApplicationStage.getPrimaryKey(),
			fireBrigadeApplicationStage);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				fireBrigadeApplicationStage.getUuid(),
				fireBrigadeApplicationStage.getGroupId()
			},
			fireBrigadeApplicationStage);

		finderCache.putResult(
			_finderPathFetchByget_FB_AppStage_CI,
			new Object[] {fireBrigadeApplicationStage.getCaseId()},
			fireBrigadeApplicationStage);

		finderCache.putResult(
			_finderPathFetchByget_FB_By_Status,
			new Object[] {fireBrigadeApplicationStage.getStageStatus()},
			fireBrigadeApplicationStage);

		finderCache.putResult(
			_finderPathFetchByget_FB_By_CI_SN_SS,
			new Object[] {
				fireBrigadeApplicationStage.getCaseId(),
				fireBrigadeApplicationStage.getStageName(),
				fireBrigadeApplicationStage.getStageStatus()
			},
			fireBrigadeApplicationStage);

		finderCache.putResult(
			_finderPathFetchByget_FB_By_CI_SN,
			new Object[] {
				fireBrigadeApplicationStage.getCaseId(),
				fireBrigadeApplicationStage.getStageName()
			},
			fireBrigadeApplicationStage);

		finderCache.putResult(
			_finderPathFetchByget_FB_By_CI_SS,
			new Object[] {
				fireBrigadeApplicationStage.getCaseId(),
				fireBrigadeApplicationStage.getStageStatus()
			},
			fireBrigadeApplicationStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade application stages in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplicationStages the fire brigade application stages
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeApplicationStage> fireBrigadeApplicationStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeApplicationStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
				fireBrigadeApplicationStages) {

			if (entityCache.getResult(
					FireBrigadeApplicationStageImpl.class,
					fireBrigadeApplicationStage.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeApplicationStage);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeApplicationStageImpl.class);

		finderCache.clearCache(FireBrigadeApplicationStageImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade application stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		entityCache.removeResult(
			FireBrigadeApplicationStageImpl.class, fireBrigadeApplicationStage);
	}

	@Override
	public void clearCache(
		List<FireBrigadeApplicationStage> fireBrigadeApplicationStages) {

		for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
				fireBrigadeApplicationStages) {

			entityCache.removeResult(
				FireBrigadeApplicationStageImpl.class,
				fireBrigadeApplicationStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeApplicationStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeApplicationStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeApplicationStageModelImpl
			fireBrigadeApplicationStageModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeApplicationStageModelImpl.getUuid(),
			fireBrigadeApplicationStageModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args,
			fireBrigadeApplicationStageModelImpl);

		args = new Object[] {fireBrigadeApplicationStageModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountByget_FB_AppStage_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_FB_AppStage_CI, args,
			fireBrigadeApplicationStageModelImpl);

		args = new Object[] {
			fireBrigadeApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountByget_FB_By_Status, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_FB_By_Status, args,
			fireBrigadeApplicationStageModelImpl);

		args = new Object[] {
			fireBrigadeApplicationStageModelImpl.getCaseId(),
			fireBrigadeApplicationStageModelImpl.getStageName(),
			fireBrigadeApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountByget_FB_By_CI_SN_SS, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_FB_By_CI_SN_SS, args,
			fireBrigadeApplicationStageModelImpl);

		args = new Object[] {
			fireBrigadeApplicationStageModelImpl.getCaseId(),
			fireBrigadeApplicationStageModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountByget_FB_By_CI_SN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_FB_By_CI_SN, args,
			fireBrigadeApplicationStageModelImpl);

		args = new Object[] {
			fireBrigadeApplicationStageModelImpl.getCaseId(),
			fireBrigadeApplicationStageModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountByget_FB_By_CI_SS, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_FB_By_CI_SS, args,
			fireBrigadeApplicationStageModelImpl);
	}

	/**
	 * Creates a new fire brigade application stage with the primary key. Does not add the fire brigade application stage to the database.
	 *
	 * @param fireBrigadeAppStageId the primary key for the new fire brigade application stage
	 * @return the new fire brigade application stage
	 */
	@Override
	public FireBrigadeApplicationStage create(long fireBrigadeAppStageId) {
		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			new FireBrigadeApplicationStageImpl();

		fireBrigadeApplicationStage.setNew(true);
		fireBrigadeApplicationStage.setPrimaryKey(fireBrigadeAppStageId);

		String uuid = PortalUUIDUtil.generate();

		fireBrigadeApplicationStage.setUuid(uuid);

		fireBrigadeApplicationStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return fireBrigadeApplicationStage;
	}

	/**
	 * Removes the fire brigade application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage remove(long fireBrigadeAppStageId)
		throws NoSuchFireBrigadeApplicationStageException {

		return remove((Serializable)fireBrigadeAppStageId);
	}

	/**
	 * Removes the fire brigade application stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade application stage
	 * @return the fire brigade application stage that was removed
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage remove(Serializable primaryKey)
		throws NoSuchFireBrigadeApplicationStageException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplicationStage fireBrigadeApplicationStage =
				(FireBrigadeApplicationStage)session.get(
					FireBrigadeApplicationStageImpl.class, primaryKey);

			if (fireBrigadeApplicationStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeApplicationStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeApplicationStage);
		}
		catch (NoSuchFireBrigadeApplicationStageException
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
	protected FireBrigadeApplicationStage removeImpl(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeApplicationStage)) {
				fireBrigadeApplicationStage =
					(FireBrigadeApplicationStage)session.get(
						FireBrigadeApplicationStageImpl.class,
						fireBrigadeApplicationStage.getPrimaryKeyObj());
			}

			if (fireBrigadeApplicationStage != null) {
				session.delete(fireBrigadeApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeApplicationStage != null) {
			clearCache(fireBrigadeApplicationStage);
		}

		return fireBrigadeApplicationStage;
	}

	@Override
	public FireBrigadeApplicationStage updateImpl(
		FireBrigadeApplicationStage fireBrigadeApplicationStage) {

		boolean isNew = fireBrigadeApplicationStage.isNew();

		if (!(fireBrigadeApplicationStage instanceof
				FireBrigadeApplicationStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					fireBrigadeApplicationStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeApplicationStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeApplicationStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeApplicationStage implementation " +
					fireBrigadeApplicationStage.getClass());
		}

		FireBrigadeApplicationStageModelImpl
			fireBrigadeApplicationStageModelImpl =
				(FireBrigadeApplicationStageModelImpl)
					fireBrigadeApplicationStage;

		if (Validator.isNull(fireBrigadeApplicationStage.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			fireBrigadeApplicationStage.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeApplicationStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeApplicationStage.setCreateDate(date);
			}
			else {
				fireBrigadeApplicationStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeApplicationStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeApplicationStage.setModifiedDate(date);
			}
			else {
				fireBrigadeApplicationStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeApplicationStage);
			}
			else {
				fireBrigadeApplicationStage =
					(FireBrigadeApplicationStage)session.merge(
						fireBrigadeApplicationStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeApplicationStageImpl.class,
			fireBrigadeApplicationStageModelImpl, false, true);

		cacheUniqueFindersCache(fireBrigadeApplicationStageModelImpl);

		if (isNew) {
			fireBrigadeApplicationStage.setNew(false);
		}

		fireBrigadeApplicationStage.resetOriginalValues();

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade application stage
	 * @return the fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeApplicationStageException {

		FireBrigadeApplicationStage fireBrigadeApplicationStage =
			fetchByPrimaryKey(primaryKey);

		if (fireBrigadeApplicationStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeApplicationStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeApplicationStage;
	}

	/**
	 * Returns the fire brigade application stage with the primary key or throws a <code>NoSuchFireBrigadeApplicationStageException</code> if it could not be found.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage
	 * @throws NoSuchFireBrigadeApplicationStageException if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage findByPrimaryKey(
			long fireBrigadeAppStageId)
		throws NoSuchFireBrigadeApplicationStageException {

		return findByPrimaryKey((Serializable)fireBrigadeAppStageId);
	}

	/**
	 * Returns the fire brigade application stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeAppStageId the primary key of the fire brigade application stage
	 * @return the fire brigade application stage, or <code>null</code> if a fire brigade application stage with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplicationStage fetchByPrimaryKey(
		long fireBrigadeAppStageId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeAppStageId);
	}

	/**
	 * Returns all the fire brigade application stages.
	 *
	 * @return the fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @return the range of fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade application stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade application stages
	 * @param end the upper bound of the range of fire brigade application stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade application stages
	 */
	@Override
	public List<FireBrigadeApplicationStage> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplicationStage> orderByComparator,
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

		List<FireBrigadeApplicationStage> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplicationStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE;

				sql = sql.concat(
					FireBrigadeApplicationStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeApplicationStage>)QueryUtil.list(
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
	 * Removes all the fire brigade application stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeApplicationStage fireBrigadeApplicationStage :
				findAll()) {

			remove(fireBrigadeApplicationStage);
		}
	}

	/**
	 * Returns the number of fire brigade application stages.
	 *
	 * @return the number of fire brigade application stages
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(
					_SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE);

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
		return "fireBrigadeAppStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeApplicationStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade application stage persistence.
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

		_finderPathWithPaginationFindByget_FB_AppStage_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByget_FB_AppStage_By_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindByget_FB_AppStage_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByget_FB_AppStage_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountByget_FB_AppStage_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_FB_AppStage_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchByget_FB_AppStage_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_FB_AppStage_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountByget_FB_AppStage_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_FB_AppStage_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindByget_FB_By_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByget_FB_By_SN",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindByget_FB_By_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByget_FB_By_SN",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountByget_FB_By_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByget_FB_By_SN",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		_finderPathFetchByget_FB_By_Status = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_FB_By_Status",
			new String[] {String.class.getName()}, new String[] {"stageStatus"},
			true);

		_finderPathCountByget_FB_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_FB_By_Status", new String[] {String.class.getName()},
			new String[] {"stageStatus"}, false);

		_finderPathFetchByget_FB_By_CI_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_FB_By_CI_SN_SS",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountByget_FB_By_CI_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_FB_By_CI_SN_SS",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchByget_FB_By_CI_SN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_FB_By_CI_SN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountByget_FB_By_CI_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByget_FB_By_CI_SN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchByget_FB_By_CI_SS = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_FB_By_CI_SS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountByget_FB_By_CI_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByget_FB_By_CI_SS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		FireBrigadeApplicationStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeApplicationStageUtil.setPersistence(null);

		entityCache.removeCache(
			FireBrigadeApplicationStageImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE =
		"SELECT fireBrigadeApplicationStage FROM FireBrigadeApplicationStage fireBrigadeApplicationStage";

	private static final String _SQL_SELECT_FIREBRIGADEAPPLICATIONSTAGE_WHERE =
		"SELECT fireBrigadeApplicationStage FROM FireBrigadeApplicationStage fireBrigadeApplicationStage WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE =
		"SELECT COUNT(fireBrigadeApplicationStage) FROM FireBrigadeApplicationStage fireBrigadeApplicationStage";

	private static final String _SQL_COUNT_FIREBRIGADEAPPLICATIONSTAGE_WHERE =
		"SELECT COUNT(fireBrigadeApplicationStage) FROM FireBrigadeApplicationStage fireBrigadeApplicationStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeApplicationStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeApplicationStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeApplicationStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeApplicationStagePersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
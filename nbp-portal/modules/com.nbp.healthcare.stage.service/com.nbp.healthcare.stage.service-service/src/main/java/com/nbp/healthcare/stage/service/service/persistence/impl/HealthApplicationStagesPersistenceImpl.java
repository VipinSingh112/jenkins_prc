/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.healthcare.stage.service.service.persistence.impl;

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

import com.nbp.healthcare.stage.service.exception.NoSuchHealthApplicationStagesException;
import com.nbp.healthcare.stage.service.model.HealthApplicationStages;
import com.nbp.healthcare.stage.service.model.HealthApplicationStagesTable;
import com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesImpl;
import com.nbp.healthcare.stage.service.model.impl.HealthApplicationStagesModelImpl;
import com.nbp.healthcare.stage.service.service.persistence.HealthApplicationStagesPersistence;
import com.nbp.healthcare.stage.service.service.persistence.HealthApplicationStagesUtil;
import com.nbp.healthcare.stage.service.service.persistence.impl.constants.HEALTH_STAGESPersistenceConstants;

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
 * The persistence implementation for the health application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HealthApplicationStagesPersistence.class)
public class HealthApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<HealthApplicationStages>
	implements HealthApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HealthApplicationStagesUtil</code> to access the health application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HealthApplicationStagesImpl.class.getName();

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
	 * Returns all the health application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		List<HealthApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HealthApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthApplicationStages healthApplicationStages : list) {
					if (!uuid.equals(healthApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

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
				sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HealthApplicationStages>)QueryUtil.list(
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
	 * Returns the first health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		List<HealthApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<HealthApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where uuid = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages[] findByUuid_PrevAndNext(
			long healthApplicationStagesId, String uuid,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		HealthApplicationStages healthApplicationStages = findByPrimaryKey(
			healthApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HealthApplicationStages[] array =
				new HealthApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, healthApplicationStages, uuid, orderByComparator,
				true);

			array[1] = healthApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, healthApplicationStages, uuid, orderByComparator,
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

	protected HealthApplicationStages getByUuid_PrevAndNext(
		Session session, HealthApplicationStages healthApplicationStages,
		String uuid,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

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
			sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						healthApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (HealthApplicationStages healthApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(healthApplicationStages);
		}
	}

	/**
	 * Returns the number of health application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

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
		"healthApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(healthApplicationStages.uuid IS NULL OR healthApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (healthApplicationStages == null) {
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

			throw new NoSuchHealthApplicationStagesException(sb.toString());
		}

		return healthApplicationStages;
	}

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the health application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchByUUID_G(
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

		if (result instanceof HealthApplicationStages) {
			HealthApplicationStages healthApplicationStages =
				(HealthApplicationStages)result;

			if (!Objects.equals(uuid, healthApplicationStages.getUuid()) ||
				(groupId != healthApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

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

				List<HealthApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					HealthApplicationStages healthApplicationStages = list.get(
						0);

					result = healthApplicationStages;

					cacheResult(healthApplicationStages);
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
			return (HealthApplicationStages)result;
		}
	}

	/**
	 * Removes the health application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the health application stages that was removed
	 */
	@Override
	public HealthApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(healthApplicationStages);
	}

	/**
	 * Returns the number of health application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

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
		"healthApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(healthApplicationStages.uuid IS NULL OR healthApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"healthApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		List<HealthApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HealthApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthApplicationStages healthApplicationStages : list) {
					if (!uuid.equals(healthApplicationStages.getUuid()) ||
						(companyId != healthApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

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
				sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HealthApplicationStages>)QueryUtil.list(
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
	 * Returns the first health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		List<HealthApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<HealthApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages[] findByUuid_C_PrevAndNext(
			long healthApplicationStagesId, String uuid, long companyId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		HealthApplicationStages healthApplicationStages = findByPrimaryKey(
			healthApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HealthApplicationStages[] array =
				new HealthApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, healthApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = healthApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, healthApplicationStages, uuid, companyId,
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

	protected HealthApplicationStages getByUuid_C_PrevAndNext(
		Session session, HealthApplicationStages healthApplicationStages,
		String uuid, long companyId,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

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
			sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						healthApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (HealthApplicationStages healthApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(healthApplicationStages);
		}
	}

	/**
	 * Returns the number of health application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

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
		"healthApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(healthApplicationStages.uuid IS NULL OR healthApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"healthApplicationStages.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetHAS_BY_CI;
	private FinderPath _finderPathWithoutPaginationFindBygetHAS_BY_CI;
	private FinderPath _finderPathCountBygetHAS_BY_CI;

	/**
	 * Returns all the health application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_CI(String caseId) {
		return findBygetHAS_BY_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end) {

		return findBygetHAS_BY_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return findBygetHAS_BY_CI(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_CI(
		String caseId, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHAS_BY_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHAS_BY_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<HealthApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HealthApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthApplicationStages healthApplicationStages : list) {
					if (!caseId.equals(healthApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HealthApplicationStages>)QueryUtil.list(
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
	 * Returns the first health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_CI_First(
			String caseId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_CI_First(caseId, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_First(
		String caseId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		List<HealthApplicationStages> list = findBygetHAS_BY_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_CI_Last(
			String caseId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_CI_Last(caseId, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_Last(
		String caseId,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		int count = countBygetHAS_BY_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<HealthApplicationStages> list = findBygetHAS_BY_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where caseId = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages[] findBygetHAS_BY_CI_PrevAndNext(
			long healthApplicationStagesId, String caseId,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		HealthApplicationStages healthApplicationStages = findByPrimaryKey(
			healthApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HealthApplicationStages[] array =
				new HealthApplicationStagesImpl[3];

			array[0] = getBygetHAS_BY_CI_PrevAndNext(
				session, healthApplicationStages, caseId, orderByComparator,
				true);

			array[1] = healthApplicationStages;

			array[2] = getBygetHAS_BY_CI_PrevAndNext(
				session, healthApplicationStages, caseId, orderByComparator,
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

	protected HealthApplicationStages getBygetHAS_BY_CI_PrevAndNext(
		Session session, HealthApplicationStages healthApplicationStages,
		String caseId,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHAS_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETHAS_BY_CI_CASEID_2);
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
			sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						healthApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetHAS_BY_CI(String caseId) {
		for (HealthApplicationStages healthApplicationStages :
				findBygetHAS_BY_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(healthApplicationStages);
		}
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countBygetHAS_BY_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHAS_BY_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_CASEID_2 =
		"healthApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_CASEID_3 =
		"(healthApplicationStages.caseId IS NULL OR healthApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetHAS_BY_CI_SN;
	private FinderPath _finderPathCountBygetHAS_BY_CI_SN;

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_CI_SN(
			String caseId, String stageName)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_CI_SN(caseId, stageName);

		if (healthApplicationStages == null) {
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

			throw new NoSuchHealthApplicationStagesException(sb.toString());
		}

		return healthApplicationStages;
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_SN(
		String caseId, String stageName) {

		return fetchBygetHAS_BY_CI_SN(caseId, stageName, true);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_SN(
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
				_finderPathFetchBygetHAS_BY_CI_SN, finderArgs, this);
		}

		if (result instanceof HealthApplicationStages) {
			HealthApplicationStages healthApplicationStages =
				(HealthApplicationStages)result;

			if (!Objects.equals(caseId, healthApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, healthApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_STAGENAME_2);
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

				List<HealthApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHAS_BY_CI_SN, finderArgs,
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
								"HealthApplicationStagesPersistenceImpl.fetchBygetHAS_BY_CI_SN(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthApplicationStages healthApplicationStages = list.get(
						0);

					result = healthApplicationStages;

					cacheResult(healthApplicationStages);
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
			return (HealthApplicationStages)result;
		}
	}

	/**
	 * Removes the health application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the health application stages that was removed
	 */
	@Override
	public HealthApplicationStages removeBygetHAS_BY_CI_SN(
			String caseId, String stageName)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = findBygetHAS_BY_CI_SN(
			caseId, stageName);

		return remove(healthApplicationStages);
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countBygetHAS_BY_CI_SN(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetHAS_BY_CI_SN;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_SN_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_SN_CASEID_2 =
		"healthApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_SN_CASEID_3 =
		"(healthApplicationStages.caseId IS NULL OR healthApplicationStages.caseId = '') AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_SN_STAGENAME_2 =
		"healthApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_SN_STAGENAME_3 =
		"(healthApplicationStages.stageName IS NULL OR healthApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetHAS_BY_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetHAS_BY_StageName;
	private FinderPath _finderPathCountBygetHAS_BY_StageName;

	/**
	 * Returns all the health application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName) {

		return findBygetHAS_BY_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end) {

		return findBygetHAS_BY_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return findBygetHAS_BY_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_StageName(
		String stageName, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHAS_BY_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHAS_BY_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<HealthApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HealthApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthApplicationStages healthApplicationStages : list) {
					if (!stageName.equals(
							healthApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HealthApplicationStages>)QueryUtil.list(
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
	 * Returns the first health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_StageName_First(
			String stageName,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_StageName_First(stageName, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_StageName_First(
		String stageName,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		List<HealthApplicationStages> list = findBygetHAS_BY_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_StageName_Last(
			String stageName,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_StageName_Last(stageName, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_StageName_Last(
		String stageName,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		int count = countBygetHAS_BY_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<HealthApplicationStages> list = findBygetHAS_BY_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where stageName = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages[] findBygetHAS_BY_StageName_PrevAndNext(
			long healthApplicationStagesId, String stageName,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		HealthApplicationStages healthApplicationStages = findByPrimaryKey(
			healthApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HealthApplicationStages[] array =
				new HealthApplicationStagesImpl[3];

			array[0] = getBygetHAS_BY_StageName_PrevAndNext(
				session, healthApplicationStages, stageName, orderByComparator,
				true);

			array[1] = healthApplicationStages;

			array[2] = getBygetHAS_BY_StageName_PrevAndNext(
				session, healthApplicationStages, stageName, orderByComparator,
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

	protected HealthApplicationStages getBygetHAS_BY_StageName_PrevAndNext(
		Session session, HealthApplicationStages healthApplicationStages,
		String stageName,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_2);
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
			sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						healthApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetHAS_BY_StageName(String stageName) {
		for (HealthApplicationStages healthApplicationStages :
				findBygetHAS_BY_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(healthApplicationStages);
		}
	}

	/**
	 * Returns the number of health application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countBygetHAS_BY_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetHAS_BY_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_2 =
		"healthApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETHAS_BY_STAGENAME_STAGENAME_3 =
		"(healthApplicationStages.stageName IS NULL OR healthApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetHAS_BY_CI_ST;
	private FinderPath _finderPathCountBygetHAS_BY_CI_ST;

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_CI_ST(
			String caseId, String stageStatus)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_CI_ST(caseId, stageStatus);

		if (healthApplicationStages == null) {
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

			throw new NoSuchHealthApplicationStagesException(sb.toString());
		}

		return healthApplicationStages;
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST(
		String caseId, String stageStatus) {

		return fetchBygetHAS_BY_CI_ST(caseId, stageStatus, true);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST(
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
				_finderPathFetchBygetHAS_BY_CI_ST, finderArgs, this);
		}

		if (result instanceof HealthApplicationStages) {
			HealthApplicationStages healthApplicationStages =
				(HealthApplicationStages)result;

			if (!Objects.equals(caseId, healthApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, healthApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_STAGESTATUS_2);
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

				List<HealthApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHAS_BY_CI_ST, finderArgs,
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
								"HealthApplicationStagesPersistenceImpl.fetchBygetHAS_BY_CI_ST(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthApplicationStages healthApplicationStages = list.get(
						0);

					result = healthApplicationStages;

					cacheResult(healthApplicationStages);
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
			return (HealthApplicationStages)result;
		}
	}

	/**
	 * Removes the health application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the health application stages that was removed
	 */
	@Override
	public HealthApplicationStages removeBygetHAS_BY_CI_ST(
			String caseId, String stageStatus)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = findBygetHAS_BY_CI_ST(
			caseId, stageStatus);

		return remove(healthApplicationStages);
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countBygetHAS_BY_CI_ST(String caseId, String stageStatus) {
		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetHAS_BY_CI_ST;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_CASEID_2 =
		"healthApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_CASEID_3 =
		"(healthApplicationStages.caseId IS NULL OR healthApplicationStages.caseId = '') AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_STAGESTATUS_2 =
		"healthApplicationStages.stageStatus = ?";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_STAGESTATUS_3 =
		"(healthApplicationStages.stageStatus IS NULL OR healthApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetHAS_BY_SN_SS;
	private FinderPath _finderPathWithoutPaginationFindBygetHAS_BY_SN_SS;
	private FinderPath _finderPathCountBygetHAS_BY_SN_SS;

	/**
	 * Returns all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus) {

		return findBygetHAS_BY_SN_SS(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end) {

		return findBygetHAS_BY_SN_SS(stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return findBygetHAS_BY_SN_SS(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findBygetHAS_BY_SN_SS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHAS_BY_SN_SS;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHAS_BY_SN_SS;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<HealthApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HealthApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HealthApplicationStages healthApplicationStages : list) {
					if (!stageName.equals(
							healthApplicationStages.getStageName()) ||
						!stageStatus.equals(
							healthApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HealthApplicationStages>)QueryUtil.list(
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
	 * Returns the first health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_SN_SS_First(
			String stageName, String stageStatus,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_SN_SS_First(
				stageName, stageStatus, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_SN_SS_First(
		String stageName, String stageStatus,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		List<HealthApplicationStages> list = findBygetHAS_BY_SN_SS(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_SN_SS_Last(
			String stageName, String stageStatus,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_SN_SS_Last(
				stageName, stageStatus, orderByComparator);

		if (healthApplicationStages != null) {
			return healthApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchHealthApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_SN_SS_Last(
		String stageName, String stageStatus,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		int count = countBygetHAS_BY_SN_SS(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<HealthApplicationStages> list = findBygetHAS_BY_SN_SS(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the health application stageses before and after the current health application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param healthApplicationStagesId the primary key of the current health application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages[] findBygetHAS_BY_SN_SS_PrevAndNext(
			long healthApplicationStagesId, String stageName,
			String stageStatus,
			OrderByComparator<HealthApplicationStages> orderByComparator)
		throws NoSuchHealthApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		HealthApplicationStages healthApplicationStages = findByPrimaryKey(
			healthApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HealthApplicationStages[] array =
				new HealthApplicationStagesImpl[3];

			array[0] = getBygetHAS_BY_SN_SS_PrevAndNext(
				session, healthApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = healthApplicationStages;

			array[2] = getBygetHAS_BY_SN_SS_PrevAndNext(
				session, healthApplicationStages, stageName, stageStatus,
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

	protected HealthApplicationStages getBygetHAS_BY_SN_SS_PrevAndNext(
		Session session, HealthApplicationStages healthApplicationStages,
		String stageName, String stageStatus,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_2);
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
			sb.append(HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						healthApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HealthApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the health application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetHAS_BY_SN_SS(String stageName, String stageStatus) {
		for (HealthApplicationStages healthApplicationStages :
				findBygetHAS_BY_SN_SS(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(healthApplicationStages);
		}
	}

	/**
	 * Returns the number of health application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countBygetHAS_BY_SN_SS(String stageName, String stageStatus) {
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetHAS_BY_SN_SS;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_2 =
		"healthApplicationStages.stageName = ? AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_SN_SS_STAGENAME_3 =
		"(healthApplicationStages.stageName IS NULL OR healthApplicationStages.stageName = '') AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_2 =
		"healthApplicationStages.stageStatus = ?";

	private static final String _FINDER_COLUMN_GETHAS_BY_SN_SS_STAGESTATUS_3 =
		"(healthApplicationStages.stageStatus IS NULL OR healthApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetHAS_BY_CI_ST_SN;
	private FinderPath _finderPathCountBygetHAS_BY_CI_ST_SN;

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_CI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			fetchBygetHAS_BY_CI_ST_SN(caseId, stageStatus, stageName);

		if (healthApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthApplicationStagesException(sb.toString());
		}

		return healthApplicationStages;
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetHAS_BY_CI_ST_SN(caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHAS_BY_CI_ST_SN, finderArgs, this);
		}

		if (result instanceof HealthApplicationStages) {
			HealthApplicationStages healthApplicationStages =
				(HealthApplicationStages)result;

			if (!Objects.equals(caseId, healthApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, healthApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, healthApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<HealthApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHAS_BY_CI_ST_SN, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageStatus, stageName
								};
							}

							_log.warn(
								"HealthApplicationStagesPersistenceImpl.fetchBygetHAS_BY_CI_ST_SN(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthApplicationStages healthApplicationStages = list.get(
						0);

					result = healthApplicationStages;

					cacheResult(healthApplicationStages);
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
			return (HealthApplicationStages)result;
		}
	}

	/**
	 * Removes the health application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the health application stages that was removed
	 */
	@Override
	public HealthApplicationStages removeBygetHAS_BY_CI_ST_SN(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages =
			findBygetHAS_BY_CI_ST_SN(caseId, stageStatus, stageName);

		return remove(healthApplicationStages);
	}

	/**
	 * Returns the number of health application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countBygetHAS_BY_CI_ST_SN(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetHAS_BY_CI_ST_SN;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_SN_CASEID_2 =
		"healthApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_SN_CASEID_3 =
		"(healthApplicationStages.caseId IS NULL OR healthApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGESTATUS_2 =
			"healthApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGESTATUS_3 =
			"(healthApplicationStages.stageStatus IS NULL OR healthApplicationStages.stageStatus = '') AND ";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGENAME_2 =
		"healthApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETHAS_BY_CI_ST_SN_STAGENAME_3 =
		"(healthApplicationStages.stageName IS NULL OR healthApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetHAS_BY_FAI;
	private FinderPath _finderPathCountBygetHAS_BY_FAI;

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the matching health application stages
	 * @throws NoSuchHealthApplicationStagesException if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages findBygetHAS_BY_FAI(long healthApplicationId)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = fetchBygetHAS_BY_FAI(
			healthApplicationId);

		if (healthApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("healthApplicationId=");
			sb.append(healthApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHealthApplicationStagesException(sb.toString());
		}

		return healthApplicationStages;
	}

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_FAI(
		long healthApplicationId) {

		return fetchBygetHAS_BY_FAI(healthApplicationId, true);
	}

	/**
	 * Returns the health application stages where healthApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param healthApplicationId the health application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching health application stages, or <code>null</code> if a matching health application stages could not be found
	 */
	@Override
	public HealthApplicationStages fetchBygetHAS_BY_FAI(
		long healthApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {healthApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHAS_BY_FAI, finderArgs, this);
		}

		if (result instanceof HealthApplicationStages) {
			HealthApplicationStages healthApplicationStages =
				(HealthApplicationStages)result;

			if (healthApplicationId !=
					healthApplicationStages.getHealthApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETHAS_BY_FAI_HEALTHAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthApplicationId);

				List<HealthApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHAS_BY_FAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {healthApplicationId};
							}

							_log.warn(
								"HealthApplicationStagesPersistenceImpl.fetchBygetHAS_BY_FAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HealthApplicationStages healthApplicationStages = list.get(
						0);

					result = healthApplicationStages;

					cacheResult(healthApplicationStages);
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
			return (HealthApplicationStages)result;
		}
	}

	/**
	 * Removes the health application stages where healthApplicationId = &#63; from the database.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the health application stages that was removed
	 */
	@Override
	public HealthApplicationStages removeBygetHAS_BY_FAI(
			long healthApplicationId)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = findBygetHAS_BY_FAI(
			healthApplicationId);

		return remove(healthApplicationStages);
	}

	/**
	 * Returns the number of health application stageses where healthApplicationId = &#63;.
	 *
	 * @param healthApplicationId the health application ID
	 * @return the number of matching health application stageses
	 */
	@Override
	public int countBygetHAS_BY_FAI(long healthApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHAS_BY_FAI;

		Object[] finderArgs = new Object[] {healthApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETHAS_BY_FAI_HEALTHAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(healthApplicationId);

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
		_FINDER_COLUMN_GETHAS_BY_FAI_HEALTHAPPLICATIONID_2 =
			"healthApplicationStages.healthApplicationId = ?";

	public HealthApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(HealthApplicationStages.class);

		setModelImplClass(HealthApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(HealthApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the health application stages in the entity cache if it is enabled.
	 *
	 * @param healthApplicationStages the health application stages
	 */
	@Override
	public void cacheResult(HealthApplicationStages healthApplicationStages) {
		entityCache.putResult(
			HealthApplicationStagesImpl.class,
			healthApplicationStages.getPrimaryKey(), healthApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				healthApplicationStages.getUuid(),
				healthApplicationStages.getGroupId()
			},
			healthApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_CI_SN,
			new Object[] {
				healthApplicationStages.getCaseId(),
				healthApplicationStages.getStageName()
			},
			healthApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_CI_ST,
			new Object[] {
				healthApplicationStages.getCaseId(),
				healthApplicationStages.getStageStatus()
			},
			healthApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_CI_ST_SN,
			new Object[] {
				healthApplicationStages.getCaseId(),
				healthApplicationStages.getStageStatus(),
				healthApplicationStages.getStageName()
			},
			healthApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_FAI,
			new Object[] {healthApplicationStages.getHealthApplicationId()},
			healthApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the health application stageses in the entity cache if it is enabled.
	 *
	 * @param healthApplicationStageses the health application stageses
	 */
	@Override
	public void cacheResult(
		List<HealthApplicationStages> healthApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (healthApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HealthApplicationStages healthApplicationStages :
				healthApplicationStageses) {

			if (entityCache.getResult(
					HealthApplicationStagesImpl.class,
					healthApplicationStages.getPrimaryKey()) == null) {

				cacheResult(healthApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all health application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HealthApplicationStagesImpl.class);

		finderCache.clearCache(HealthApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the health application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HealthApplicationStages healthApplicationStages) {
		entityCache.removeResult(
			HealthApplicationStagesImpl.class, healthApplicationStages);
	}

	@Override
	public void clearCache(
		List<HealthApplicationStages> healthApplicationStageses) {

		for (HealthApplicationStages healthApplicationStages :
				healthApplicationStageses) {

			entityCache.removeResult(
				HealthApplicationStagesImpl.class, healthApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HealthApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HealthApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HealthApplicationStagesModelImpl healthApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			healthApplicationStagesModelImpl.getUuid(),
			healthApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, healthApplicationStagesModelImpl);

		args = new Object[] {
			healthApplicationStagesModelImpl.getCaseId(),
			healthApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetHAS_BY_CI_SN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_CI_SN, args,
			healthApplicationStagesModelImpl);

		args = new Object[] {
			healthApplicationStagesModelImpl.getCaseId(),
			healthApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetHAS_BY_CI_ST, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_CI_ST, args,
			healthApplicationStagesModelImpl);

		args = new Object[] {
			healthApplicationStagesModelImpl.getCaseId(),
			healthApplicationStagesModelImpl.getStageStatus(),
			healthApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetHAS_BY_CI_ST_SN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_CI_ST_SN, args,
			healthApplicationStagesModelImpl);

		args = new Object[] {
			healthApplicationStagesModelImpl.getHealthApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHAS_BY_FAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHAS_BY_FAI, args,
			healthApplicationStagesModelImpl);
	}

	/**
	 * Creates a new health application stages with the primary key. Does not add the health application stages to the database.
	 *
	 * @param healthApplicationStagesId the primary key for the new health application stages
	 * @return the new health application stages
	 */
	@Override
	public HealthApplicationStages create(long healthApplicationStagesId) {
		HealthApplicationStages healthApplicationStages =
			new HealthApplicationStagesImpl();

		healthApplicationStages.setNew(true);
		healthApplicationStages.setPrimaryKey(healthApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		healthApplicationStages.setUuid(uuid);

		healthApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return healthApplicationStages;
	}

	/**
	 * Removes the health application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages that was removed
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages remove(long healthApplicationStagesId)
		throws NoSuchHealthApplicationStagesException {

		return remove((Serializable)healthApplicationStagesId);
	}

	/**
	 * Removes the health application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the health application stages
	 * @return the health application stages that was removed
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages remove(Serializable primaryKey)
		throws NoSuchHealthApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			HealthApplicationStages healthApplicationStages =
				(HealthApplicationStages)session.get(
					HealthApplicationStagesImpl.class, primaryKey);

			if (healthApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHealthApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(healthApplicationStages);
		}
		catch (NoSuchHealthApplicationStagesException noSuchEntityException) {
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
	protected HealthApplicationStages removeImpl(
		HealthApplicationStages healthApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(healthApplicationStages)) {
				healthApplicationStages = (HealthApplicationStages)session.get(
					HealthApplicationStagesImpl.class,
					healthApplicationStages.getPrimaryKeyObj());
			}

			if (healthApplicationStages != null) {
				session.delete(healthApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (healthApplicationStages != null) {
			clearCache(healthApplicationStages);
		}

		return healthApplicationStages;
	}

	@Override
	public HealthApplicationStages updateImpl(
		HealthApplicationStages healthApplicationStages) {

		boolean isNew = healthApplicationStages.isNew();

		if (!(healthApplicationStages instanceof
				HealthApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(healthApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					healthApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in healthApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HealthApplicationStages implementation " +
					healthApplicationStages.getClass());
		}

		HealthApplicationStagesModelImpl healthApplicationStagesModelImpl =
			(HealthApplicationStagesModelImpl)healthApplicationStages;

		if (Validator.isNull(healthApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			healthApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (healthApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				healthApplicationStages.setCreateDate(date);
			}
			else {
				healthApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!healthApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				healthApplicationStages.setModifiedDate(date);
			}
			else {
				healthApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(healthApplicationStages);
			}
			else {
				healthApplicationStages =
					(HealthApplicationStages)session.merge(
						healthApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HealthApplicationStagesImpl.class, healthApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(healthApplicationStagesModelImpl);

		if (isNew) {
			healthApplicationStages.setNew(false);
		}

		healthApplicationStages.resetOriginalValues();

		return healthApplicationStages;
	}

	/**
	 * Returns the health application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the health application stages
	 * @return the health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHealthApplicationStagesException {

		HealthApplicationStages healthApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (healthApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHealthApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return healthApplicationStages;
	}

	/**
	 * Returns the health application stages with the primary key or throws a <code>NoSuchHealthApplicationStagesException</code> if it could not be found.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages
	 * @throws NoSuchHealthApplicationStagesException if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages findByPrimaryKey(
			long healthApplicationStagesId)
		throws NoSuchHealthApplicationStagesException {

		return findByPrimaryKey((Serializable)healthApplicationStagesId);
	}

	/**
	 * Returns the health application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param healthApplicationStagesId the primary key of the health application stages
	 * @return the health application stages, or <code>null</code> if a health application stages with the primary key could not be found
	 */
	@Override
	public HealthApplicationStages fetchByPrimaryKey(
		long healthApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)healthApplicationStagesId);
	}

	/**
	 * Returns all the health application stageses.
	 *
	 * @return the health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @return the range of health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the health application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HealthApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of health application stageses
	 * @param end the upper bound of the range of health application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of health application stageses
	 */
	@Override
	public List<HealthApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HealthApplicationStages> orderByComparator,
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

		List<HealthApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HealthApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HEALTHAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HEALTHAPPLICATIONSTAGES;

				sql = sql.concat(
					HealthApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HealthApplicationStages>)QueryUtil.list(
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
	 * Removes all the health application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HealthApplicationStages healthApplicationStages : findAll()) {
			remove(healthApplicationStages);
		}
	}

	/**
	 * Returns the number of health application stageses.
	 *
	 * @return the number of health application stageses
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
					_SQL_COUNT_HEALTHAPPLICATIONSTAGES);

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
		return "healthApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HEALTHAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HealthApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the health application stages persistence.
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

		_finderPathWithPaginationFindBygetHAS_BY_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHAS_BY_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetHAS_BY_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHAS_BY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHAS_BY_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHAS_BY_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetHAS_BY_CI_SN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHAS_BY_CI_SN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetHAS_BY_CI_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHAS_BY_CI_SN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetHAS_BY_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHAS_BY_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetHAS_BY_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHAS_BY_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, true);

		_finderPathCountBygetHAS_BY_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHAS_BY_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetHAS_BY_CI_ST = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHAS_BY_CI_ST",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetHAS_BY_CI_ST = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHAS_BY_CI_ST",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetHAS_BY_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHAS_BY_SN_SS",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetHAS_BY_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHAS_BY_SN_SS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetHAS_BY_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHAS_BY_SN_SS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathFetchBygetHAS_BY_CI_ST_SN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHAS_BY_CI_ST_SN",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetHAS_BY_CI_ST_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHAS_BY_CI_ST_SN",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetHAS_BY_FAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHAS_BY_FAI",
			new String[] {Long.class.getName()},
			new String[] {"healthApplicationId"}, true);

		_finderPathCountBygetHAS_BY_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHAS_BY_FAI",
			new String[] {Long.class.getName()},
			new String[] {"healthApplicationId"}, false);

		HealthApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HealthApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(HealthApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HEALTH_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HEALTHAPPLICATIONSTAGES =
		"SELECT healthApplicationStages FROM HealthApplicationStages healthApplicationStages";

	private static final String _SQL_SELECT_HEALTHAPPLICATIONSTAGES_WHERE =
		"SELECT healthApplicationStages FROM HealthApplicationStages healthApplicationStages WHERE ";

	private static final String _SQL_COUNT_HEALTHAPPLICATIONSTAGES =
		"SELECT COUNT(healthApplicationStages) FROM HealthApplicationStages healthApplicationStages";

	private static final String _SQL_COUNT_HEALTHAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(healthApplicationStages) FROM HealthApplicationStages healthApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"healthApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HealthApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HealthApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HealthApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
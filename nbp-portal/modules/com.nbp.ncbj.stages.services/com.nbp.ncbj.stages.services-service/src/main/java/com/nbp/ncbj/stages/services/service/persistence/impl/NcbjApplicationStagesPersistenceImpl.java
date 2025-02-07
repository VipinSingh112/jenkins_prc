/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.stages.services.service.persistence.impl;

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

import com.nbp.ncbj.stages.services.exception.NoSuchNcbjApplicationStagesException;
import com.nbp.ncbj.stages.services.model.NcbjApplicationStages;
import com.nbp.ncbj.stages.services.model.NcbjApplicationStagesTable;
import com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesImpl;
import com.nbp.ncbj.stages.services.model.impl.NcbjApplicationStagesModelImpl;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationStagesPersistence;
import com.nbp.ncbj.stages.services.service.persistence.NcbjApplicationStagesUtil;
import com.nbp.ncbj.stages.services.service.persistence.impl.constants.NCBJ_STAGESPersistenceConstants;

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
 * The persistence implementation for the ncbj application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjApplicationStagesPersistence.class)
public class NcbjApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<NcbjApplicationStages>
	implements NcbjApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjApplicationStagesUtil</code> to access the ncbj application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjApplicationStagesImpl.class.getName();

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
	 * Returns all the ncbj application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
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

		List<NcbjApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplicationStages ncbjApplicationStages : list) {
					if (!uuid.equals(ncbjApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

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
				sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		List<NcbjApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NcbjApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages[] findByUuid_PrevAndNext(
			long ncbjStagesApplicationId, String uuid,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		NcbjApplicationStages ncbjApplicationStages = findByPrimaryKey(
			ncbjStagesApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplicationStages[] array = new NcbjApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, ncbjApplicationStages, uuid, orderByComparator, true);

			array[1] = ncbjApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, ncbjApplicationStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcbjApplicationStages getByUuid_PrevAndNext(
		Session session, NcbjApplicationStages ncbjApplicationStages,
		String uuid, OrderByComparator<NcbjApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

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
			sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncbjApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (NcbjApplicationStages ncbjApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjApplicationStages);
		}
	}

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

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
		"ncbjApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(ncbjApplicationStages.uuid IS NULL OR ncbjApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (ncbjApplicationStages == null) {
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

			throw new NoSuchNcbjApplicationStagesException(sb.toString());
		}

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the ncbj application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchByUUID_G(
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

		if (result instanceof NcbjApplicationStages) {
			NcbjApplicationStages ncbjApplicationStages =
				(NcbjApplicationStages)result;

			if (!Objects.equals(uuid, ncbjApplicationStages.getUuid()) ||
				(groupId != ncbjApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

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

				List<NcbjApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					NcbjApplicationStages ncbjApplicationStages = list.get(0);

					result = ncbjApplicationStages;

					cacheResult(ncbjApplicationStages);
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
			return (NcbjApplicationStages)result;
		}
	}

	/**
	 * Removes the ncbj application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj application stages that was removed
	 */
	@Override
	public NcbjApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(ncbjApplicationStages);
	}

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

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
		"ncbjApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(ncbjApplicationStages.uuid IS NULL OR ncbjApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"ncbjApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
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

		List<NcbjApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplicationStages ncbjApplicationStages : list) {
					if (!uuid.equals(ncbjApplicationStages.getUuid()) ||
						(companyId != ncbjApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

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
				sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		List<NcbjApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NcbjApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages[] findByUuid_C_PrevAndNext(
			long ncbjStagesApplicationId, String uuid, long companyId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		NcbjApplicationStages ncbjApplicationStages = findByPrimaryKey(
			ncbjStagesApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplicationStages[] array = new NcbjApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, ncbjApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = ncbjApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, ncbjApplicationStages, uuid, companyId,
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

	protected NcbjApplicationStages getByUuid_C_PrevAndNext(
		Session session, NcbjApplicationStages ncbjApplicationStages,
		String uuid, long companyId,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

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
			sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncbjApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (NcbjApplicationStages ncbjApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjApplicationStages);
		}
	}

	/**
	 * Returns the number of ncbj application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

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
		"ncbjApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(ncbjApplicationStages.uuid IS NULL OR ncbjApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"ncbjApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetNcbj_AI;
	private FinderPath _finderPathCountBygetNcbj_AI;

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetNcbj_AI(long ncbjApplicationId)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = fetchBygetNcbj_AI(
			ncbjApplicationId);

		if (ncbjApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjApplicationStagesException(sb.toString());
		}

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_AI(long ncbjApplicationId) {
		return fetchBygetNcbj_AI(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj application stages where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_AI(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbj_AI, finderArgs, this);
		}

		if (result instanceof NcbjApplicationStages) {
			NcbjApplicationStages ncbjApplicationStages =
				(NcbjApplicationStages)result;

			if (ncbjApplicationId !=
					ncbjApplicationStages.getNcbjApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_AI_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbj_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjApplicationStagesPersistenceImpl.fetchBygetNcbj_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplicationStages ncbjApplicationStages = list.get(0);

					result = ncbjApplicationStages;

					cacheResult(ncbjApplicationStages);
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
			return (NcbjApplicationStages)result;
		}
	}

	/**
	 * Removes the ncbj application stages where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj application stages that was removed
	 */
	@Override
	public NcbjApplicationStages removeBygetNcbj_AI(long ncbjApplicationId)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = findBygetNcbj_AI(
			ncbjApplicationId);

		return remove(ncbjApplicationStages);
	}

	/**
	 * Returns the number of ncbj application stageses where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countBygetNcbj_AI(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcbj_AI;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJ_AI_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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

	private static final String _FINDER_COLUMN_GETNCBJ_AI_NCBJAPPLICATIONID_2 =
		"ncbjApplicationStages.ncbjApplicationId = ?";

	private FinderPath _finderPathFetchBygetNcbj_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetNcbj_By_CaseIdStageName;

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetNcbj_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetNcbj_By_CaseIdStageName(caseId, stageName);

		if (ncbjApplicationStages == null) {
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

			throw new NoSuchNcbjApplicationStagesException(sb.toString());
		}

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetNcbj_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageName(
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
				_finderPathFetchBygetNcbj_By_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof NcbjApplicationStages) {
			NcbjApplicationStages ncbjApplicationStages =
				(NcbjApplicationStages)result;

			if (!Objects.equals(caseId, ncbjApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, ncbjApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<NcbjApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbj_By_CaseIdStageName,
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
								"NcbjApplicationStagesPersistenceImpl.fetchBygetNcbj_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplicationStages ncbjApplicationStages = list.get(0);

					result = ncbjApplicationStages;

					cacheResult(ncbjApplicationStages);
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
			return (NcbjApplicationStages)result;
		}
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ncbj application stages that was removed
	 */
	@Override
	public NcbjApplicationStages removeBygetNcbj_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			findBygetNcbj_By_CaseIdStageName(caseId, stageName);

		return remove(ncbjApplicationStages);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countBygetNcbj_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_CASEID_2 =
			"ncbjApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_CASEID_3 =
			"(ncbjApplicationStages.caseId IS NULL OR ncbjApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"ncbjApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(ncbjApplicationStages.stageName IS NULL OR ncbjApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetNcbj_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetNcbj_By_CaseIdStageStatus;

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetNcbj_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetNcbj_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		if (ncbjApplicationStages == null) {
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

			throw new NoSuchNcbjApplicationStagesException(sb.toString());
		}

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetNcbj_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdStageStatus(
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
				_finderPathFetchBygetNcbj_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof NcbjApplicationStages) {
			NcbjApplicationStages ncbjApplicationStages =
				(NcbjApplicationStages)result;

			if (!Objects.equals(caseId, ncbjApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, ncbjApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, ncbjApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<NcbjApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbj_By_CaseIdStageStatus,
							finderArgs, list);
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
								"NcbjApplicationStagesPersistenceImpl.fetchBygetNcbj_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplicationStages ncbjApplicationStages = list.get(0);

					result = ncbjApplicationStages;

					cacheResult(ncbjApplicationStages);
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
			return (NcbjApplicationStages)result;
		}
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the ncbj application stages that was removed
	 */
	@Override
	public NcbjApplicationStages removeBygetNcbj_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			findBygetNcbj_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		return remove(ncbjApplicationStages);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countBygetNcbj_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"ncbjApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(ncbjApplicationStages.caseId IS NULL OR ncbjApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"ncbjApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(ncbjApplicationStages.stageStatus IS NULL OR ncbjApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"ncbjApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(ncbjApplicationStages.stageName IS NULL OR ncbjApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetNcbj_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetNcbj_By_CaseIdAndStatus;

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetNcbj_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetNcbj_By_CaseIdAndStatus(caseId, stageStatus);

		if (ncbjApplicationStages == null) {
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

			throw new NoSuchNcbjApplicationStagesException(sb.toString());
		}

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetNcbj_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseIdAndStatus(
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
				_finderPathFetchBygetNcbj_By_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof NcbjApplicationStages) {
			NcbjApplicationStages ncbjApplicationStages =
				(NcbjApplicationStages)result;

			if (!Objects.equals(caseId, ncbjApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, ncbjApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<NcbjApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbj_By_CaseIdAndStatus,
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
								"NcbjApplicationStagesPersistenceImpl.fetchBygetNcbj_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplicationStages ncbjApplicationStages = list.get(0);

					result = ncbjApplicationStages;

					cacheResult(ncbjApplicationStages);
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
			return (NcbjApplicationStages)result;
		}
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ncbj application stages that was removed
	 */
	@Override
	public NcbjApplicationStages removeBygetNcbj_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			findBygetNcbj_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(ncbjApplicationStages);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countBygetNcbj_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_CASEID_2 =
			"ncbjApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_CASEID_3 =
			"(ncbjApplicationStages.caseId IS NULL OR ncbjApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"ncbjApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(ncbjApplicationStages.stageStatus IS NULL OR ncbjApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetNcbj_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetNcbj_By_CaseId;
	private FinderPath _finderPathCountBygetNcbj_By_CaseId;

	/**
	 * Returns all the ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetNcbj_By_CaseId(String caseId) {
		return findBygetNcbj_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end) {

		return findBygetNcbj_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return findBygetNcbj_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetNcbj_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetNcbj_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNcbj_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<NcbjApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplicationStages ncbjApplicationStages : list) {
					if (!caseId.equals(ncbjApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetNcbj_By_CaseId_First(
			String caseId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetNcbj_By_CaseId_First(caseId, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseId_First(
		String caseId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		List<NcbjApplicationStages> list = findBygetNcbj_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetNcbj_By_CaseId_Last(
			String caseId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetNcbj_By_CaseId_Last(caseId, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_By_CaseId_Last(
		String caseId,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		int count = countBygetNcbj_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<NcbjApplicationStages> list = findBygetNcbj_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where caseId = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages[] findBygetNcbj_By_CaseId_PrevAndNext(
			long ncbjStagesApplicationId, String caseId,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		NcbjApplicationStages ncbjApplicationStages = findByPrimaryKey(
			ncbjStagesApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplicationStages[] array = new NcbjApplicationStagesImpl[3];

			array[0] = getBygetNcbj_By_CaseId_PrevAndNext(
				session, ncbjApplicationStages, caseId, orderByComparator,
				true);

			array[1] = ncbjApplicationStages;

			array[2] = getBygetNcbj_By_CaseId_PrevAndNext(
				session, ncbjApplicationStages, caseId, orderByComparator,
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

	protected NcbjApplicationStages getBygetNcbj_By_CaseId_PrevAndNext(
		Session session, NcbjApplicationStages ncbjApplicationStages,
		String caseId,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_2);
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
			sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncbjApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetNcbj_By_CaseId(String caseId) {
		for (NcbjApplicationStages ncbjApplicationStages :
				findBygetNcbj_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjApplicationStages);
		}
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countBygetNcbj_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_2 =
		"ncbjApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJ_BY_CASEID_CASEID_3 =
		"(ncbjApplicationStages.caseId IS NULL OR ncbjApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetNcbj_App_By_CaseId;
	private FinderPath _finderPathCountBygetNcbj_App_By_CaseId;

	/**
	 * Returns the ncbj application stages where caseId = &#63; or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetNcbj_App_By_CaseId(String caseId)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetNcbj_App_By_CaseId(caseId);

		if (ncbjApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjApplicationStagesException(sb.toString());
		}

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_App_By_CaseId(String caseId) {
		return fetchBygetNcbj_App_By_CaseId(caseId, true);
	}

	/**
	 * Returns the ncbj application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetNcbj_App_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbj_App_By_CaseId, finderArgs, this);
		}

		if (result instanceof NcbjApplicationStages) {
			NcbjApplicationStages ncbjApplicationStages =
				(NcbjApplicationStages)result;

			if (!Objects.equals(caseId, ncbjApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_APP_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_APP_BY_CASEID_CASEID_2);
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

				List<NcbjApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbj_App_By_CaseId, finderArgs,
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
								"NcbjApplicationStagesPersistenceImpl.fetchBygetNcbj_App_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplicationStages ncbjApplicationStages = list.get(0);

					result = ncbjApplicationStages;

					cacheResult(ncbjApplicationStages);
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
			return (NcbjApplicationStages)result;
		}
	}

	/**
	 * Removes the ncbj application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application stages that was removed
	 */
	@Override
	public NcbjApplicationStages removeBygetNcbj_App_By_CaseId(String caseId)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			findBygetNcbj_App_By_CaseId(caseId);

		return remove(ncbjApplicationStages);
	}

	/**
	 * Returns the number of ncbj application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countBygetNcbj_App_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_App_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJ_APP_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJ_APP_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJ_APP_BY_CASEID_CASEID_2 =
		"ncbjApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJ_APP_BY_CASEID_CASEID_3 =
		"(ncbjApplicationStages.caseId IS NULL OR ncbjApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarry_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarry_By_StageName;
	private FinderPath _finderPathCountBygetQuarry_By_StageName;

	/**
	 * Returns all the ncbj application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName) {

		return findBygetQuarry_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end) {

		return findBygetQuarry_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return findBygetQuarry_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findBygetQuarry_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarry_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarry_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<NcbjApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplicationStages ncbjApplicationStages : list) {
					if (!stageName.equals(
							ncbjApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetQuarry_By_StageName_First(
			String stageName,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetQuarry_By_StageName_First(stageName, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetQuarry_By_StageName_First(
		String stageName,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		List<NcbjApplicationStages> list = findBygetQuarry_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages findBygetQuarry_By_StageName_Last(
			String stageName,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages =
			fetchBygetQuarry_By_StageName_Last(stageName, orderByComparator);

		if (ncbjApplicationStages != null) {
			return ncbjApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchNcbjApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application stages, or <code>null</code> if a matching ncbj application stages could not be found
	 */
	@Override
	public NcbjApplicationStages fetchBygetQuarry_By_StageName_Last(
		String stageName,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		int count = countBygetQuarry_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<NcbjApplicationStages> list = findBygetQuarry_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj application stageses before and after the current ncbj application stages in the ordered set where stageName = &#63;.
	 *
	 * @param ncbjStagesApplicationId the primary key of the current ncbj application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages[] findBygetQuarry_By_StageName_PrevAndNext(
			long ncbjStagesApplicationId, String stageName,
			OrderByComparator<NcbjApplicationStages> orderByComparator)
		throws NoSuchNcbjApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		NcbjApplicationStages ncbjApplicationStages = findByPrimaryKey(
			ncbjStagesApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplicationStages[] array = new NcbjApplicationStagesImpl[3];

			array[0] = getBygetQuarry_By_StageName_PrevAndNext(
				session, ncbjApplicationStages, stageName, orderByComparator,
				true);

			array[1] = ncbjApplicationStages;

			array[2] = getBygetQuarry_By_StageName_PrevAndNext(
				session, ncbjApplicationStages, stageName, orderByComparator,
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

	protected NcbjApplicationStages getBygetQuarry_By_StageName_PrevAndNext(
		Session session, NcbjApplicationStages ncbjApplicationStages,
		String stageName,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2);
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
			sb.append(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncbjApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetQuarry_By_StageName(String stageName) {
		for (NcbjApplicationStages ncbjApplicationStages :
				findBygetQuarry_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjApplicationStages);
		}
	}

	/**
	 * Returns the number of ncbj application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ncbj application stageses
	 */
	@Override
	public int countBygetQuarry_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetQuarry_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2);
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

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_2 =
			"ncbjApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRY_BY_STAGENAME_STAGENAME_3 =
			"(ncbjApplicationStages.stageName IS NULL OR ncbjApplicationStages.stageName = '')";

	public NcbjApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NcbjApplicationStages.class);

		setModelImplClass(NcbjApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the ncbj application stages in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationStages the ncbj application stages
	 */
	@Override
	public void cacheResult(NcbjApplicationStages ncbjApplicationStages) {
		entityCache.putResult(
			NcbjApplicationStagesImpl.class,
			ncbjApplicationStages.getPrimaryKey(), ncbjApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				ncbjApplicationStages.getUuid(),
				ncbjApplicationStages.getGroupId()
			},
			ncbjApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetNcbj_AI,
			new Object[] {ncbjApplicationStages.getNcbjApplicationId()},
			ncbjApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_CaseIdStageName,
			new Object[] {
				ncbjApplicationStages.getCaseId(),
				ncbjApplicationStages.getStageName()
			},
			ncbjApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_CaseIdStageStatus,
			new Object[] {
				ncbjApplicationStages.getCaseId(),
				ncbjApplicationStages.getStageStatus(),
				ncbjApplicationStages.getStageName()
			},
			ncbjApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_CaseIdAndStatus,
			new Object[] {
				ncbjApplicationStages.getCaseId(),
				ncbjApplicationStages.getStageStatus()
			},
			ncbjApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetNcbj_App_By_CaseId,
			new Object[] {ncbjApplicationStages.getCaseId()},
			ncbjApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj application stageses in the entity cache if it is enabled.
	 *
	 * @param ncbjApplicationStageses the ncbj application stageses
	 */
	@Override
	public void cacheResult(
		List<NcbjApplicationStages> ncbjApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjApplicationStages ncbjApplicationStages :
				ncbjApplicationStageses) {

			if (entityCache.getResult(
					NcbjApplicationStagesImpl.class,
					ncbjApplicationStages.getPrimaryKey()) == null) {

				cacheResult(ncbjApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjApplicationStagesImpl.class);

		finderCache.clearCache(NcbjApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the ncbj application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjApplicationStages ncbjApplicationStages) {
		entityCache.removeResult(
			NcbjApplicationStagesImpl.class, ncbjApplicationStages);
	}

	@Override
	public void clearCache(
		List<NcbjApplicationStages> ncbjApplicationStageses) {

		for (NcbjApplicationStages ncbjApplicationStages :
				ncbjApplicationStageses) {

			entityCache.removeResult(
				NcbjApplicationStagesImpl.class, ncbjApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcbjApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjApplicationStagesModelImpl ncbjApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			ncbjApplicationStagesModelImpl.getUuid(),
			ncbjApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, ncbjApplicationStagesModelImpl);

		args = new Object[] {
			ncbjApplicationStagesModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbj_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbj_AI, args, ncbjApplicationStagesModelImpl);

		args = new Object[] {
			ncbjApplicationStagesModelImpl.getCaseId(),
			ncbjApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbj_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_CaseIdStageName, args,
			ncbjApplicationStagesModelImpl);

		args = new Object[] {
			ncbjApplicationStagesModelImpl.getCaseId(),
			ncbjApplicationStagesModelImpl.getStageStatus(),
			ncbjApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbj_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_CaseIdStageStatus, args,
			ncbjApplicationStagesModelImpl);

		args = new Object[] {
			ncbjApplicationStagesModelImpl.getCaseId(),
			ncbjApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbj_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_CaseIdAndStatus, args,
			ncbjApplicationStagesModelImpl);

		args = new Object[] {ncbjApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetNcbj_App_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbj_App_By_CaseId, args,
			ncbjApplicationStagesModelImpl);
	}

	/**
	 * Creates a new ncbj application stages with the primary key. Does not add the ncbj application stages to the database.
	 *
	 * @param ncbjStagesApplicationId the primary key for the new ncbj application stages
	 * @return the new ncbj application stages
	 */
	@Override
	public NcbjApplicationStages create(long ncbjStagesApplicationId) {
		NcbjApplicationStages ncbjApplicationStages =
			new NcbjApplicationStagesImpl();

		ncbjApplicationStages.setNew(true);
		ncbjApplicationStages.setPrimaryKey(ncbjStagesApplicationId);

		String uuid = PortalUUIDUtil.generate();

		ncbjApplicationStages.setUuid(uuid);

		ncbjApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjApplicationStages;
	}

	/**
	 * Removes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages remove(long ncbjStagesApplicationId)
		throws NoSuchNcbjApplicationStagesException {

		return remove((Serializable)ncbjStagesApplicationId);
	}

	/**
	 * Removes the ncbj application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj application stages
	 * @return the ncbj application stages that was removed
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages remove(Serializable primaryKey)
		throws NoSuchNcbjApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			NcbjApplicationStages ncbjApplicationStages =
				(NcbjApplicationStages)session.get(
					NcbjApplicationStagesImpl.class, primaryKey);

			if (ncbjApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjApplicationStages);
		}
		catch (NoSuchNcbjApplicationStagesException noSuchEntityException) {
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
	protected NcbjApplicationStages removeImpl(
		NcbjApplicationStages ncbjApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjApplicationStages)) {
				ncbjApplicationStages = (NcbjApplicationStages)session.get(
					NcbjApplicationStagesImpl.class,
					ncbjApplicationStages.getPrimaryKeyObj());
			}

			if (ncbjApplicationStages != null) {
				session.delete(ncbjApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjApplicationStages != null) {
			clearCache(ncbjApplicationStages);
		}

		return ncbjApplicationStages;
	}

	@Override
	public NcbjApplicationStages updateImpl(
		NcbjApplicationStages ncbjApplicationStages) {

		boolean isNew = ncbjApplicationStages.isNew();

		if (!(ncbjApplicationStages instanceof
				NcbjApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjApplicationStages implementation " +
					ncbjApplicationStages.getClass());
		}

		NcbjApplicationStagesModelImpl ncbjApplicationStagesModelImpl =
			(NcbjApplicationStagesModelImpl)ncbjApplicationStages;

		if (Validator.isNull(ncbjApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ncbjApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjApplicationStages.setCreateDate(date);
			}
			else {
				ncbjApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjApplicationStages.setModifiedDate(date);
			}
			else {
				ncbjApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjApplicationStages);
			}
			else {
				ncbjApplicationStages = (NcbjApplicationStages)session.merge(
					ncbjApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjApplicationStagesImpl.class, ncbjApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(ncbjApplicationStagesModelImpl);

		if (isNew) {
			ncbjApplicationStages.setNew(false);
		}

		ncbjApplicationStages.resetOriginalValues();

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjApplicationStagesException {

		NcbjApplicationStages ncbjApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (ncbjApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjApplicationStages;
	}

	/**
	 * Returns the ncbj application stages with the primary key or throws a <code>NoSuchNcbjApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages
	 * @throws NoSuchNcbjApplicationStagesException if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages findByPrimaryKey(long ncbjStagesApplicationId)
		throws NoSuchNcbjApplicationStagesException {

		return findByPrimaryKey((Serializable)ncbjStagesApplicationId);
	}

	/**
	 * Returns the ncbj application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjStagesApplicationId the primary key of the ncbj application stages
	 * @return the ncbj application stages, or <code>null</code> if a ncbj application stages with the primary key could not be found
	 */
	@Override
	public NcbjApplicationStages fetchByPrimaryKey(
		long ncbjStagesApplicationId) {

		return fetchByPrimaryKey((Serializable)ncbjStagesApplicationId);
	}

	/**
	 * Returns all the ncbj application stageses.
	 *
	 * @return the ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @return the range of ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj application stageses
	 * @param end the upper bound of the range of ncbj application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj application stageses
	 */
	@Override
	public List<NcbjApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcbjApplicationStages> orderByComparator,
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

		List<NcbjApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJAPPLICATIONSTAGES;

				sql = sql.concat(NcbjApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjApplicationStages>)QueryUtil.list(
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
	 * Removes all the ncbj application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjApplicationStages ncbjApplicationStages : findAll()) {
			remove(ncbjApplicationStages);
		}
	}

	/**
	 * Returns the number of ncbj application stageses.
	 *
	 * @return the number of ncbj application stageses
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
					_SQL_COUNT_NCBJAPPLICATIONSTAGES);

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
		return "ncbjStagesApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj application stages persistence.
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

		_finderPathFetchBygetNcbj_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbj_AI",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNcbj_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNcbj_AI",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		_finderPathFetchBygetNcbj_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbj_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetNcbj_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetNcbj_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbj_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetNcbj_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetNcbj_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbj_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetNcbj_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetNcbj_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNcbj_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetNcbj_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetNcbj_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetNcbj_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetNcbj_App_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbj_App_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNcbj_App_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_App_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetQuarry_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetQuarry_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetQuarry_By_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarry_By_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetQuarry_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarry_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		NcbjApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(NcbjApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCBJ_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJAPPLICATIONSTAGES =
		"SELECT ncbjApplicationStages FROM NcbjApplicationStages ncbjApplicationStages";

	private static final String _SQL_SELECT_NCBJAPPLICATIONSTAGES_WHERE =
		"SELECT ncbjApplicationStages FROM NcbjApplicationStages ncbjApplicationStages WHERE ";

	private static final String _SQL_COUNT_NCBJAPPLICATIONSTAGES =
		"SELECT COUNT(ncbjApplicationStages) FROM NcbjApplicationStages ncbjApplicationStages";

	private static final String _SQL_COUNT_NCBJAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(ncbjApplicationStages) FROM NcbjApplicationStages ncbjApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncbjApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
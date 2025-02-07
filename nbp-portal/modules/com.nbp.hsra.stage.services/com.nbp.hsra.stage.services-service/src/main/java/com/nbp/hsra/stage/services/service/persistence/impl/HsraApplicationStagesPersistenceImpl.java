/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.stage.services.service.persistence.impl;

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

import com.nbp.hsra.stage.services.exception.NoSuchHsraApplicationStagesException;
import com.nbp.hsra.stage.services.model.HsraApplicationStages;
import com.nbp.hsra.stage.services.model.HsraApplicationStagesTable;
import com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesImpl;
import com.nbp.hsra.stage.services.model.impl.HsraApplicationStagesModelImpl;
import com.nbp.hsra.stage.services.service.persistence.HsraApplicationStagesPersistence;
import com.nbp.hsra.stage.services.service.persistence.HsraApplicationStagesUtil;
import com.nbp.hsra.stage.services.service.persistence.impl.constants.HSRA_STAGEPersistenceConstants;

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
 * The persistence implementation for the hsra application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HsraApplicationStagesPersistence.class)
public class HsraApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<HsraApplicationStages>
	implements HsraApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HsraApplicationStagesUtil</code> to access the hsra application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HsraApplicationStagesImpl.class.getName();

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
	 * Returns all the hsra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
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

		List<HsraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplicationStages hsraApplicationStages : list) {
					if (!uuid.equals(hsraApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

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
				sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraApplicationStages>)QueryUtil.list(
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
	 * Returns the first hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		List<HsraApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<HsraApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages[] findByUuid_PrevAndNext(
			long hsraApplicationStagesId, String uuid,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		HsraApplicationStages hsraApplicationStages = findByPrimaryKey(
			hsraApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HsraApplicationStages[] array = new HsraApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, hsraApplicationStages, uuid, orderByComparator, true);

			array[1] = hsraApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, hsraApplicationStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HsraApplicationStages getByUuid_PrevAndNext(
		Session session, HsraApplicationStages hsraApplicationStages,
		String uuid, OrderByComparator<HsraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

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
			sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						hsraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (HsraApplicationStages hsraApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplicationStages);
		}
	}

	/**
	 * Returns the number of hsra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

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
		"hsraApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(hsraApplicationStages.uuid IS NULL OR hsraApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (hsraApplicationStages == null) {
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

			throw new NoSuchHsraApplicationStagesException(sb.toString());
		}

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the hsra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchByUUID_G(
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

		if (result instanceof HsraApplicationStages) {
			HsraApplicationStages hsraApplicationStages =
				(HsraApplicationStages)result;

			if (!Objects.equals(uuid, hsraApplicationStages.getUuid()) ||
				(groupId != hsraApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

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

				List<HsraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					HsraApplicationStages hsraApplicationStages = list.get(0);

					result = hsraApplicationStages;

					cacheResult(hsraApplicationStages);
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
			return (HsraApplicationStages)result;
		}
	}

	/**
	 * Removes the hsra application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the hsra application stages that was removed
	 */
	@Override
	public HsraApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(hsraApplicationStages);
	}

	/**
	 * Returns the number of hsra application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

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
		"hsraApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(hsraApplicationStages.uuid IS NULL OR hsraApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"hsraApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
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

		List<HsraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplicationStages hsraApplicationStages : list) {
					if (!uuid.equals(hsraApplicationStages.getUuid()) ||
						(companyId != hsraApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

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
				sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraApplicationStages>)QueryUtil.list(
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
	 * Returns the first hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		List<HsraApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<HsraApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages[] findByUuid_C_PrevAndNext(
			long hsraApplicationStagesId, String uuid, long companyId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		HsraApplicationStages hsraApplicationStages = findByPrimaryKey(
			hsraApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HsraApplicationStages[] array = new HsraApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, hsraApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = hsraApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, hsraApplicationStages, uuid, companyId,
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

	protected HsraApplicationStages getByUuid_C_PrevAndNext(
		Session session, HsraApplicationStages hsraApplicationStages,
		String uuid, long companyId,
		OrderByComparator<HsraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

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
			sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						hsraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (HsraApplicationStages hsraApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(hsraApplicationStages);
		}
	}

	/**
	 * Returns the number of hsra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

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
		"hsraApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(hsraApplicationStages.uuid IS NULL OR hsraApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"hsraApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetHsra_By_AI;
	private FinderPath _finderPathCountBygetHsra_By_AI;

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_AI(long hsraApplicationId)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = fetchBygetHsra_By_AI(
			hsraApplicationId);

		if (hsraApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationStagesException(sb.toString());
		}

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_AI(long hsraApplicationId) {
		return fetchBygetHsra_By_AI(hsraApplicationId, true);
	}

	/**
	 * Returns the hsra application stages where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_AI(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsra_By_AI, finderArgs, this);
		}

		if (result instanceof HsraApplicationStages) {
			HsraApplicationStages hsraApplicationStages =
				(HsraApplicationStages)result;

			if (hsraApplicationId !=
					hsraApplicationStages.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRA_BY_AI_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<HsraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsra_By_AI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"HsraApplicationStagesPersistenceImpl.fetchBygetHsra_By_AI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplicationStages hsraApplicationStages = list.get(0);

					result = hsraApplicationStages;

					cacheResult(hsraApplicationStages);
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
			return (HsraApplicationStages)result;
		}
	}

	/**
	 * Removes the hsra application stages where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the hsra application stages that was removed
	 */
	@Override
	public HsraApplicationStages removeBygetHsra_By_AI(long hsraApplicationId)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = findBygetHsra_By_AI(
			hsraApplicationId);

		return remove(hsraApplicationStages);
	}

	/**
	 * Returns the number of hsra application stageses where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countBygetHsra_By_AI(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsra_By_AI;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRA_BY_AI_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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
		_FINDER_COLUMN_GETHSRA_BY_AI_HSRAAPPLICATIONID_2 =
			"hsraApplicationStages.hsraApplicationId = ?";

	private FinderPath _finderPathFetchBygetHsra_By_CaseIdStageName;
	private FinderPath _finderPathCountBygetHsra_By_CaseIdStageName;

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsra_By_CaseIdStageName(caseId, stageName);

		if (hsraApplicationStages == null) {
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

			throw new NoSuchHsraApplicationStagesException(sb.toString());
		}

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetHsra_By_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageName(
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
				_finderPathFetchBygetHsra_By_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof HsraApplicationStages) {
			HsraApplicationStages hsraApplicationStages =
				(HsraApplicationStages)result;

			if (!Objects.equals(caseId, hsraApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, hsraApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_STAGENAME_2);
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

				List<HsraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsra_By_CaseIdStageName,
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
								"HsraApplicationStagesPersistenceImpl.fetchBygetHsra_By_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplicationStages hsraApplicationStages = list.get(0);

					result = hsraApplicationStages;

					cacheResult(hsraApplicationStages);
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
			return (HsraApplicationStages)result;
		}
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the hsra application stages that was removed
	 */
	@Override
	public HsraApplicationStages removeBygetHsra_By_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			findBygetHsra_By_CaseIdStageName(caseId, stageName);

		return remove(hsraApplicationStages);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countBygetHsra_By_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetHsra_By_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_CASEID_2 =
			"hsraApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_CASEID_3 =
			"(hsraApplicationStages.caseId IS NULL OR hsraApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_STAGENAME_2 =
			"hsraApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGENAME_STAGENAME_3 =
			"(hsraApplicationStages.stageName IS NULL OR hsraApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetHsra_By_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetHsra_By_CaseIdStageStatus;

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsra_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		if (hsraApplicationStages == null) {
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

			throw new NoSuchHsraApplicationStagesException(sb.toString());
		}

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		return fetchBygetHsra_By_CaseIdStageStatus(
			caseId, stageStatus, stageName, true);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseIdStageStatus(
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
				_finderPathFetchBygetHsra_By_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof HsraApplicationStages) {
			HsraApplicationStages hsraApplicationStages =
				(HsraApplicationStages)result;

			if (!Objects.equals(caseId, hsraApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, hsraApplicationStages.getStageStatus()) ||
				!Objects.equals(
					stageName, hsraApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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

				List<HsraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsra_By_CaseIdStageStatus,
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
								"HsraApplicationStagesPersistenceImpl.fetchBygetHsra_By_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplicationStages hsraApplicationStages = list.get(0);

					result = hsraApplicationStages;

					cacheResult(hsraApplicationStages);
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
			return (HsraApplicationStages)result;
		}
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageStatus = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the hsra application stages that was removed
	 */
	@Override
	public HsraApplicationStages removeBygetHsra_By_CaseIdStageStatus(
			String caseId, String stageStatus, String stageName)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			findBygetHsra_By_CaseIdStageStatus(caseId, stageStatus, stageName);

		return remove(hsraApplicationStages);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageStatus = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countBygetHsra_By_CaseIdStageStatus(
		String caseId, String stageStatus, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetHsra_By_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGENAME_2);
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
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_CASEID_2 =
			"hsraApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_CASEID_3 =
			"(hsraApplicationStages.caseId IS NULL OR hsraApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"hsraApplicationStages.stageStatus = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(hsraApplicationStages.stageStatus IS NULL OR hsraApplicationStages.stageStatus = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGENAME_2 =
			"hsraApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(hsraApplicationStages.stageName IS NULL OR hsraApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetHsra_By_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetHsra_By_CaseIdAndStatus;

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsra_By_CaseIdAndStatus(caseId, stageStatus);

		if (hsraApplicationStages == null) {
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

			throw new NoSuchHsraApplicationStagesException(sb.toString());
		}

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetHsra_By_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseIdAndStatus(
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
				_finderPathFetchBygetHsra_By_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof HsraApplicationStages) {
			HsraApplicationStages hsraApplicationStages =
				(HsraApplicationStages)result;

			if (!Objects.equals(caseId, hsraApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, hsraApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<HsraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsra_By_CaseIdAndStatus,
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
								"HsraApplicationStagesPersistenceImpl.fetchBygetHsra_By_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplicationStages hsraApplicationStages = list.get(0);

					result = hsraApplicationStages;

					cacheResult(hsraApplicationStages);
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
			return (HsraApplicationStages)result;
		}
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the hsra application stages that was removed
	 */
	@Override
	public HsraApplicationStages removeBygetHsra_By_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			findBygetHsra_By_CaseIdAndStatus(caseId, stageStatus);

		return remove(hsraApplicationStages);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countBygetHsra_By_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetHsra_By_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_CASEID_2 =
			"hsraApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_CASEID_3 =
			"(hsraApplicationStages.caseId IS NULL OR hsraApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_STAGESTATUS_2 =
			"hsraApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(hsraApplicationStages.stageStatus IS NULL OR hsraApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsra_By_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetHsra_By_CaseId;
	private FinderPath _finderPathCountBygetHsra_By_CaseId;

	/**
	 * Returns all the hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_CaseId(String caseId) {
		return findBygetHsra_By_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end) {

		return findBygetHsra_By_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return findBygetHsra_By_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_CaseId(
		String caseId, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHsra_By_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsra_By_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<HsraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplicationStages hsraApplicationStages : list) {
					if (!caseId.equals(hsraApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraApplicationStages>)QueryUtil.list(
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
	 * Returns the first hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_CaseId_First(
			String caseId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsra_By_CaseId_First(caseId, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseId_First(
		String caseId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		List<HsraApplicationStages> list = findBygetHsra_By_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_CaseId_Last(
			String caseId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsra_By_CaseId_Last(caseId, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_CaseId_Last(
		String caseId,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		int count = countBygetHsra_By_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<HsraApplicationStages> list = findBygetHsra_By_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages[] findBygetHsra_By_CaseId_PrevAndNext(
			long hsraApplicationStagesId, String caseId,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		HsraApplicationStages hsraApplicationStages = findByPrimaryKey(
			hsraApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HsraApplicationStages[] array = new HsraApplicationStagesImpl[3];

			array[0] = getBygetHsra_By_CaseId_PrevAndNext(
				session, hsraApplicationStages, caseId, orderByComparator,
				true);

			array[1] = hsraApplicationStages;

			array[2] = getBygetHsra_By_CaseId_PrevAndNext(
				session, hsraApplicationStages, caseId, orderByComparator,
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

	protected HsraApplicationStages getBygetHsra_By_CaseId_PrevAndNext(
		Session session, HsraApplicationStages hsraApplicationStages,
		String caseId,
		OrderByComparator<HsraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_2);
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
			sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						hsraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetHsra_By_CaseId(String caseId) {
		for (HsraApplicationStages hsraApplicationStages :
				findBygetHsra_By_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplicationStages);
		}
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countBygetHsra_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHsra_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_2 =
		"hsraApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRA_BY_CASEID_CASEID_3 =
		"(hsraApplicationStages.caseId IS NULL OR hsraApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchBygetHsraApp_By_CaseId;
	private FinderPath _finderPathCountBygetHsraApp_By_CaseId;

	/**
	 * Returns the hsra application stages where caseId = &#63; or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsraApp_By_CaseId(String caseId)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsraApp_By_CaseId(caseId);

		if (hsraApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationStagesException(sb.toString());
		}

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsraApp_By_CaseId(String caseId) {
		return fetchBygetHsraApp_By_CaseId(caseId, true);
	}

	/**
	 * Returns the hsra application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsraApp_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraApp_By_CaseId, finderArgs, this);
		}

		if (result instanceof HsraApplicationStages) {
			HsraApplicationStages hsraApplicationStages =
				(HsraApplicationStages)result;

			if (!Objects.equals(caseId, hsraApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRAAPP_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRAAPP_BY_CASEID_CASEID_2);
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

				List<HsraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraApp_By_CaseId, finderArgs,
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
								"HsraApplicationStagesPersistenceImpl.fetchBygetHsraApp_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplicationStages hsraApplicationStages = list.get(0);

					result = hsraApplicationStages;

					cacheResult(hsraApplicationStages);
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
			return (HsraApplicationStages)result;
		}
	}

	/**
	 * Removes the hsra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application stages that was removed
	 */
	@Override
	public HsraApplicationStages removeBygetHsraApp_By_CaseId(String caseId)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			findBygetHsraApp_By_CaseId(caseId);

		return remove(hsraApplicationStages);
	}

	/**
	 * Returns the number of hsra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countBygetHsraApp_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHsraApp_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRAAPP_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRAAPP_BY_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHSRAAPP_BY_CASEID_CASEID_2 =
		"hsraApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRAAPP_BY_CASEID_CASEID_3 =
		"(hsraApplicationStages.caseId IS NULL OR hsraApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsra_By_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetHsra_By_StageName;
	private FinderPath _finderPathCountBygetHsra_By_StageName;

	/**
	 * Returns all the hsra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName) {

		return findBygetHsra_By_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end) {

		return findBygetHsra_By_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return findBygetHsra_By_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findBygetHsra_By_StageName(
		String stageName, int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHsra_By_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsra_By_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<HsraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplicationStages hsraApplicationStages : list) {
					if (!stageName.equals(
							hsraApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraApplicationStages>)QueryUtil.list(
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
	 * Returns the first hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_StageName_First(
			String stageName,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsra_By_StageName_First(stageName, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_StageName_First(
		String stageName,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		List<HsraApplicationStages> list = findBygetHsra_By_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages findBygetHsra_By_StageName_Last(
			String stageName,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages =
			fetchBygetHsra_By_StageName_Last(stageName, orderByComparator);

		if (hsraApplicationStages != null) {
			return hsraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchHsraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application stages, or <code>null</code> if a matching hsra application stages could not be found
	 */
	@Override
	public HsraApplicationStages fetchBygetHsra_By_StageName_Last(
		String stageName,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		int count = countBygetHsra_By_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<HsraApplicationStages> list = findBygetHsra_By_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra application stageses before and after the current hsra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param hsraApplicationStagesId the primary key of the current hsra application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages[] findBygetHsra_By_StageName_PrevAndNext(
			long hsraApplicationStagesId, String stageName,
			OrderByComparator<HsraApplicationStages> orderByComparator)
		throws NoSuchHsraApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		HsraApplicationStages hsraApplicationStages = findByPrimaryKey(
			hsraApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			HsraApplicationStages[] array = new HsraApplicationStagesImpl[3];

			array[0] = getBygetHsra_By_StageName_PrevAndNext(
				session, hsraApplicationStages, stageName, orderByComparator,
				true);

			array[1] = hsraApplicationStages;

			array[2] = getBygetHsra_By_StageName_PrevAndNext(
				session, hsraApplicationStages, stageName, orderByComparator,
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

	protected HsraApplicationStages getBygetHsra_By_StageName_PrevAndNext(
		Session session, HsraApplicationStages hsraApplicationStages,
		String stageName,
		OrderByComparator<HsraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_2);
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
			sb.append(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						hsraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetHsra_By_StageName(String stageName) {
		for (HsraApplicationStages hsraApplicationStages :
				findBygetHsra_By_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplicationStages);
		}
	}

	/**
	 * Returns the number of hsra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching hsra application stageses
	 */
	@Override
	public int countBygetHsra_By_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetHsra_By_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_2 =
			"hsraApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETHSRA_BY_STAGENAME_STAGENAME_3 =
			"(hsraApplicationStages.stageName IS NULL OR hsraApplicationStages.stageName = '')";

	public HsraApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(HsraApplicationStages.class);

		setModelImplClass(HsraApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(HsraApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the hsra application stages in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationStages the hsra application stages
	 */
	@Override
	public void cacheResult(HsraApplicationStages hsraApplicationStages) {
		entityCache.putResult(
			HsraApplicationStagesImpl.class,
			hsraApplicationStages.getPrimaryKey(), hsraApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				hsraApplicationStages.getUuid(),
				hsraApplicationStages.getGroupId()
			},
			hsraApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHsra_By_AI,
			new Object[] {hsraApplicationStages.getHsraApplicationId()},
			hsraApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHsra_By_CaseIdStageName,
			new Object[] {
				hsraApplicationStages.getCaseId(),
				hsraApplicationStages.getStageName()
			},
			hsraApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHsra_By_CaseIdStageStatus,
			new Object[] {
				hsraApplicationStages.getCaseId(),
				hsraApplicationStages.getStageStatus(),
				hsraApplicationStages.getStageName()
			},
			hsraApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHsra_By_CaseIdAndStatus,
			new Object[] {
				hsraApplicationStages.getCaseId(),
				hsraApplicationStages.getStageStatus()
			},
			hsraApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetHsraApp_By_CaseId,
			new Object[] {hsraApplicationStages.getCaseId()},
			hsraApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra application stageses in the entity cache if it is enabled.
	 *
	 * @param hsraApplicationStageses the hsra application stageses
	 */
	@Override
	public void cacheResult(
		List<HsraApplicationStages> hsraApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HsraApplicationStages hsraApplicationStages :
				hsraApplicationStageses) {

			if (entityCache.getResult(
					HsraApplicationStagesImpl.class,
					hsraApplicationStages.getPrimaryKey()) == null) {

				cacheResult(hsraApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all hsra application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HsraApplicationStagesImpl.class);

		finderCache.clearCache(HsraApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the hsra application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HsraApplicationStages hsraApplicationStages) {
		entityCache.removeResult(
			HsraApplicationStagesImpl.class, hsraApplicationStages);
	}

	@Override
	public void clearCache(
		List<HsraApplicationStages> hsraApplicationStageses) {

		for (HsraApplicationStages hsraApplicationStages :
				hsraApplicationStageses) {

			entityCache.removeResult(
				HsraApplicationStagesImpl.class, hsraApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HsraApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				HsraApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HsraApplicationStagesModelImpl hsraApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			hsraApplicationStagesModelImpl.getUuid(),
			hsraApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, hsraApplicationStagesModelImpl);

		args = new Object[] {
			hsraApplicationStagesModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsra_By_AI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsra_By_AI, args,
			hsraApplicationStagesModelImpl);

		args = new Object[] {
			hsraApplicationStagesModelImpl.getCaseId(),
			hsraApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetHsra_By_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsra_By_CaseIdStageName, args,
			hsraApplicationStagesModelImpl);

		args = new Object[] {
			hsraApplicationStagesModelImpl.getCaseId(),
			hsraApplicationStagesModelImpl.getStageStatus(),
			hsraApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetHsra_By_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsra_By_CaseIdStageStatus, args,
			hsraApplicationStagesModelImpl);

		args = new Object[] {
			hsraApplicationStagesModelImpl.getCaseId(),
			hsraApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetHsra_By_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsra_By_CaseIdAndStatus, args,
			hsraApplicationStagesModelImpl);

		args = new Object[] {hsraApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetHsraApp_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraApp_By_CaseId, args,
			hsraApplicationStagesModelImpl);
	}

	/**
	 * Creates a new hsra application stages with the primary key. Does not add the hsra application stages to the database.
	 *
	 * @param hsraApplicationStagesId the primary key for the new hsra application stages
	 * @return the new hsra application stages
	 */
	@Override
	public HsraApplicationStages create(long hsraApplicationStagesId) {
		HsraApplicationStages hsraApplicationStages =
			new HsraApplicationStagesImpl();

		hsraApplicationStages.setNew(true);
		hsraApplicationStages.setPrimaryKey(hsraApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		hsraApplicationStages.setUuid(uuid);

		hsraApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return hsraApplicationStages;
	}

	/**
	 * Removes the hsra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages that was removed
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages remove(long hsraApplicationStagesId)
		throws NoSuchHsraApplicationStagesException {

		return remove((Serializable)hsraApplicationStagesId);
	}

	/**
	 * Removes the hsra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra application stages
	 * @return the hsra application stages that was removed
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages remove(Serializable primaryKey)
		throws NoSuchHsraApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			HsraApplicationStages hsraApplicationStages =
				(HsraApplicationStages)session.get(
					HsraApplicationStagesImpl.class, primaryKey);

			if (hsraApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHsraApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraApplicationStages);
		}
		catch (NoSuchHsraApplicationStagesException noSuchEntityException) {
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
	protected HsraApplicationStages removeImpl(
		HsraApplicationStages hsraApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraApplicationStages)) {
				hsraApplicationStages = (HsraApplicationStages)session.get(
					HsraApplicationStagesImpl.class,
					hsraApplicationStages.getPrimaryKeyObj());
			}

			if (hsraApplicationStages != null) {
				session.delete(hsraApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraApplicationStages != null) {
			clearCache(hsraApplicationStages);
		}

		return hsraApplicationStages;
	}

	@Override
	public HsraApplicationStages updateImpl(
		HsraApplicationStages hsraApplicationStages) {

		boolean isNew = hsraApplicationStages.isNew();

		if (!(hsraApplicationStages instanceof
				HsraApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(hsraApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HsraApplicationStages implementation " +
					hsraApplicationStages.getClass());
		}

		HsraApplicationStagesModelImpl hsraApplicationStagesModelImpl =
			(HsraApplicationStagesModelImpl)hsraApplicationStages;

		if (Validator.isNull(hsraApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			hsraApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraApplicationStages.setCreateDate(date);
			}
			else {
				hsraApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraApplicationStages.setModifiedDate(date);
			}
			else {
				hsraApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraApplicationStages);
			}
			else {
				hsraApplicationStages = (HsraApplicationStages)session.merge(
					hsraApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HsraApplicationStagesImpl.class, hsraApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(hsraApplicationStagesModelImpl);

		if (isNew) {
			hsraApplicationStages.setNew(false);
		}

		hsraApplicationStages.resetOriginalValues();

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra application stages
	 * @return the hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHsraApplicationStagesException {

		HsraApplicationStages hsraApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (hsraApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHsraApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraApplicationStages;
	}

	/**
	 * Returns the hsra application stages with the primary key or throws a <code>NoSuchHsraApplicationStagesException</code> if it could not be found.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages
	 * @throws NoSuchHsraApplicationStagesException if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages findByPrimaryKey(long hsraApplicationStagesId)
		throws NoSuchHsraApplicationStagesException {

		return findByPrimaryKey((Serializable)hsraApplicationStagesId);
	}

	/**
	 * Returns the hsra application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationStagesId the primary key of the hsra application stages
	 * @return the hsra application stages, or <code>null</code> if a hsra application stages with the primary key could not be found
	 */
	@Override
	public HsraApplicationStages fetchByPrimaryKey(
		long hsraApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)hsraApplicationStagesId);
	}

	/**
	 * Returns all the hsra application stageses.
	 *
	 * @return the hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @return the range of hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra application stageses
	 * @param end the upper bound of the range of hsra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra application stageses
	 */
	@Override
	public List<HsraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<HsraApplicationStages> orderByComparator,
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

		List<HsraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<HsraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAAPPLICATIONSTAGES;

				sql = sql.concat(HsraApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HsraApplicationStages>)QueryUtil.list(
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
	 * Removes all the hsra application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HsraApplicationStages hsraApplicationStages : findAll()) {
			remove(hsraApplicationStages);
		}
	}

	/**
	 * Returns the number of hsra application stageses.
	 *
	 * @return the number of hsra application stageses
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
					_SQL_COUNT_HSRAAPPLICATIONSTAGES);

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
		return "hsraApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HsraApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra application stages persistence.
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

		_finderPathFetchBygetHsra_By_AI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsra_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsra_By_AI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsra_By_AI",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		_finderPathFetchBygetHsra_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsra_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetHsra_By_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_By_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetHsra_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsra_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, true);

		_finderPathCountBygetHsra_By_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_By_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageStatus", "stageName"}, false);

		_finderPathFetchBygetHsra_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsra_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetHsra_By_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_By_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetHsra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsra_By_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetHsra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHsra_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, true);

		_finderPathCountBygetHsra_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_By_CaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathFetchBygetHsraApp_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraApp_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHsraApp_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsraApp_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetHsra_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetHsra_By_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetHsra_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHsra_By_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, true);

		_finderPathCountBygetHsra_By_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsra_By_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		HsraApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HsraApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(HsraApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HSRAAPPLICATIONSTAGES =
		"SELECT hsraApplicationStages FROM HsraApplicationStages hsraApplicationStages";

	private static final String _SQL_SELECT_HSRAAPPLICATIONSTAGES_WHERE =
		"SELECT hsraApplicationStages FROM HsraApplicationStages hsraApplicationStages WHERE ";

	private static final String _SQL_COUNT_HSRAAPPLICATIONSTAGES =
		"SELECT COUNT(hsraApplicationStages) FROM HsraApplicationStages hsraApplicationStages";

	private static final String _SQL_COUNT_HSRAAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(hsraApplicationStages) FROM HsraApplicationStages hsraApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"hsraApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HsraApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HsraApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HsraApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
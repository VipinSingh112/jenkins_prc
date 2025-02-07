/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.tourism.application.stages.services.service.persistence.impl;

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

import com.nbp.tourism.application.stages.services.exception.NoSuchTourismApplicationStagesException;
import com.nbp.tourism.application.stages.services.model.TourismApplicationStages;
import com.nbp.tourism.application.stages.services.model.TourismApplicationStagesTable;
import com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesImpl;
import com.nbp.tourism.application.stages.services.model.impl.TourismApplicationStagesModelImpl;
import com.nbp.tourism.application.stages.services.service.persistence.TourismApplicationStagesPersistence;
import com.nbp.tourism.application.stages.services.service.persistence.TourismApplicationStagesUtil;
import com.nbp.tourism.application.stages.services.service.persistence.impl.constants.TOURISM_STAGESPersistenceConstants;

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
 * The persistence implementation for the tourism application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = TourismApplicationStagesPersistence.class)
public class TourismApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<TourismApplicationStages>
	implements TourismApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>TourismApplicationStagesUtil</code> to access the tourism application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		TourismApplicationStagesImpl.class.getName();

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
	 * Returns all the tourism application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		List<TourismApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismApplicationStages tourismApplicationStages : list) {
					if (!uuid.equals(tourismApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

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
				sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<TourismApplicationStages>)QueryUtil.list(
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
	 * Returns the first tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		List<TourismApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<TourismApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where uuid = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages[] findByUuid_PrevAndNext(
			long tourismApplicationStagesId, String uuid,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		TourismApplicationStages tourismApplicationStages = findByPrimaryKey(
			tourismApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			TourismApplicationStages[] array =
				new TourismApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, tourismApplicationStages, uuid, orderByComparator,
				true);

			array[1] = tourismApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, tourismApplicationStages, uuid, orderByComparator,
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

	protected TourismApplicationStages getByUuid_PrevAndNext(
		Session session, TourismApplicationStages tourismApplicationStages,
		String uuid,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

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
			sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						tourismApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (TourismApplicationStages tourismApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tourismApplicationStages);
		}
	}

	/**
	 * Returns the number of tourism application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

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
		"tourismApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(tourismApplicationStages.uuid IS NULL OR tourismApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (tourismApplicationStages == null) {
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

			throw new NoSuchTourismApplicationStagesException(sb.toString());
		}

		return tourismApplicationStages;
	}

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the tourism application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchByUUID_G(
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

		if (result instanceof TourismApplicationStages) {
			TourismApplicationStages tourismApplicationStages =
				(TourismApplicationStages)result;

			if (!Objects.equals(uuid, tourismApplicationStages.getUuid()) ||
				(groupId != tourismApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

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

				List<TourismApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					TourismApplicationStages tourismApplicationStages =
						list.get(0);

					result = tourismApplicationStages;

					cacheResult(tourismApplicationStages);
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
			return (TourismApplicationStages)result;
		}
	}

	/**
	 * Removes the tourism application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the tourism application stages that was removed
	 */
	@Override
	public TourismApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(tourismApplicationStages);
	}

	/**
	 * Returns the number of tourism application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

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
		"tourismApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(tourismApplicationStages.uuid IS NULL OR tourismApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"tourismApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		List<TourismApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismApplicationStages tourismApplicationStages : list) {
					if (!uuid.equals(tourismApplicationStages.getUuid()) ||
						(companyId !=
							tourismApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

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
				sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<TourismApplicationStages>)QueryUtil.list(
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
	 * Returns the first tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		List<TourismApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<TourismApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages[] findByUuid_C_PrevAndNext(
			long tourismApplicationStagesId, String uuid, long companyId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		TourismApplicationStages tourismApplicationStages = findByPrimaryKey(
			tourismApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			TourismApplicationStages[] array =
				new TourismApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, tourismApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = tourismApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, tourismApplicationStages, uuid, companyId,
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

	protected TourismApplicationStages getByUuid_C_PrevAndNext(
		Session session, TourismApplicationStages tourismApplicationStages,
		String uuid, long companyId,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

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
			sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						tourismApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (TourismApplicationStages tourismApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(tourismApplicationStages);
		}
	}

	/**
	 * Returns the number of tourism application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

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
		"tourismApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(tourismApplicationStages.uuid IS NULL OR tourismApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"tourismApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetTAS_TAI;
	private FinderPath _finderPathCountBygetTAS_TAI;

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_TAI(long tourismApplicationId)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = fetchBygetTAS_TAI(
			tourismApplicationId);

		if (tourismApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("tourismApplicationId=");
			sb.append(tourismApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchTourismApplicationStagesException(sb.toString());
		}

		return tourismApplicationStages;
	}

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_TAI(
		long tourismApplicationId) {

		return fetchBygetTAS_TAI(tourismApplicationId, true);
	}

	/**
	 * Returns the tourism application stages where tourismApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_TAI(
		long tourismApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {tourismApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetTAS_TAI, finderArgs, this);
		}

		if (result instanceof TourismApplicationStages) {
			TourismApplicationStages tourismApplicationStages =
				(TourismApplicationStages)result;

			if (tourismApplicationId !=
					tourismApplicationStages.getTourismApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETTAS_TAI_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

				List<TourismApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTAS_TAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									tourismApplicationId
								};
							}

							_log.warn(
								"TourismApplicationStagesPersistenceImpl.fetchBygetTAS_TAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplicationStages tourismApplicationStages =
						list.get(0);

					result = tourismApplicationStages;

					cacheResult(tourismApplicationStages);
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
			return (TourismApplicationStages)result;
		}
	}

	/**
	 * Removes the tourism application stages where tourismApplicationId = &#63; from the database.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the tourism application stages that was removed
	 */
	@Override
	public TourismApplicationStages removeBygetTAS_TAI(
			long tourismApplicationId)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = findBygetTAS_TAI(
			tourismApplicationId);

		return remove(tourismApplicationStages);
	}

	/**
	 * Returns the number of tourism application stageses where tourismApplicationId = &#63;.
	 *
	 * @param tourismApplicationId the tourism application ID
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countBygetTAS_TAI(long tourismApplicationId) {
		FinderPath finderPath = _finderPathCountBygetTAS_TAI;

		Object[] finderArgs = new Object[] {tourismApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETTAS_TAI_TOURISMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(tourismApplicationId);

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
		_FINDER_COLUMN_GETTAS_TAI_TOURISMAPPLICATIONID_2 =
			"tourismApplicationStages.tourismApplicationId = ?";

	private FinderPath _finderPathFetchBygetTAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetTAS_CaseIdStageName;

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_CaseIdStageName(caseId, stageName);

		if (tourismApplicationStages == null) {
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

			throw new NoSuchTourismApplicationStagesException(sb.toString());
		}

		return tourismApplicationStages;
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetTAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseIdStageName(
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
				_finderPathFetchBygetTAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof TourismApplicationStages) {
			TourismApplicationStages tourismApplicationStages =
				(TourismApplicationStages)result;

			if (!Objects.equals(caseId, tourismApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, tourismApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<TourismApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTAS_CaseIdStageName,
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
								"TourismApplicationStagesPersistenceImpl.fetchBygetTAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplicationStages tourismApplicationStages =
						list.get(0);

					result = tourismApplicationStages;

					cacheResult(tourismApplicationStages);
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
			return (TourismApplicationStages)result;
		}
	}

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the tourism application stages that was removed
	 */
	@Override
	public TourismApplicationStages removeBygetTAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			findBygetTAS_CaseIdStageName(caseId, stageName);

		return remove(tourismApplicationStages);
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countBygetTAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetTAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_CASEID_2 =
		"tourismApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_CASEID_3 =
		"(tourismApplicationStages.caseId IS NULL OR tourismApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_STAGENAME_2 =
			"tourismApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(tourismApplicationStages.stageName IS NULL OR tourismApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetTAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetTAS_StageName;
	private FinderPath _finderPathCountBygetTAS_StageName;

	/**
	 * Returns all the tourism application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName) {

		return findBygetTAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end) {

		return findBygetTAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return findBygetTAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetTAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<TourismApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismApplicationStages tourismApplicationStages : list) {
					if (!stageName.equals(
							tourismApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<TourismApplicationStages>)QueryUtil.list(
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
	 * Returns the first tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_StageName_First(
			String stageName,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_StageName_First(stageName, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_StageName_First(
		String stageName,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		List<TourismApplicationStages> list = findBygetTAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_StageName_Last(
			String stageName,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_StageName_Last(stageName, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_StageName_Last(
		String stageName,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		int count = countBygetTAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<TourismApplicationStages> list = findBygetTAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where stageName = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages[] findBygetTAS_StageName_PrevAndNext(
			long tourismApplicationStagesId, String stageName,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		TourismApplicationStages tourismApplicationStages = findByPrimaryKey(
			tourismApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			TourismApplicationStages[] array =
				new TourismApplicationStagesImpl[3];

			array[0] = getBygetTAS_StageName_PrevAndNext(
				session, tourismApplicationStages, stageName, orderByComparator,
				true);

			array[1] = tourismApplicationStages;

			array[2] = getBygetTAS_StageName_PrevAndNext(
				session, tourismApplicationStages, stageName, orderByComparator,
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

	protected TourismApplicationStages getBygetTAS_StageName_PrevAndNext(
		Session session, TourismApplicationStages tourismApplicationStages,
		String stageName,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_2);
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
			sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						tourismApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetTAS_StageName(String stageName) {
		for (TourismApplicationStages tourismApplicationStages :
				findBygetTAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tourismApplicationStages);
		}
	}

	/**
	 * Returns the number of tourism application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countBygetTAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetTAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_2 =
		"tourismApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETTAS_STAGENAME_STAGENAME_3 =
		"(tourismApplicationStages.stageName IS NULL OR tourismApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetTAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetTAS_CaseIdStageStatus;

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (tourismApplicationStages == null) {
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

			throw new NoSuchTourismApplicationStagesException(sb.toString());
		}

		return tourismApplicationStages;
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetTAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseIdStageStatus(
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
				_finderPathFetchBygetTAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof TourismApplicationStages) {
			TourismApplicationStages tourismApplicationStages =
				(TourismApplicationStages)result;

			if (!Objects.equals(caseId, tourismApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, tourismApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, tourismApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<TourismApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTAS_CaseIdStageStatus,
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
								"TourismApplicationStagesPersistenceImpl.fetchBygetTAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplicationStages tourismApplicationStages =
						list.get(0);

					result = tourismApplicationStages;

					cacheResult(tourismApplicationStages);
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
			return (TourismApplicationStages)result;
		}
	}

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the tourism application stages that was removed
	 */
	@Override
	public TourismApplicationStages removeBygetTAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			findBygetTAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(tourismApplicationStages);
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countBygetTAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetTAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_CASEID_2 =
			"tourismApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(tourismApplicationStages.caseId IS NULL OR tourismApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"tourismApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(tourismApplicationStages.stageName IS NULL OR tourismApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"tourismApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(tourismApplicationStages.stageStatus IS NULL OR tourismApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetTAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetTAS_CaseIdAndStatus;

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_CaseIdAndStatus(caseId, stageStatus);

		if (tourismApplicationStages == null) {
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

			throw new NoSuchTourismApplicationStagesException(sb.toString());
		}

		return tourismApplicationStages;
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetTAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the tourism application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseIdAndStatus(
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
				_finderPathFetchBygetTAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof TourismApplicationStages) {
			TourismApplicationStages tourismApplicationStages =
				(TourismApplicationStages)result;

			if (!Objects.equals(caseId, tourismApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, tourismApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<TourismApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetTAS_CaseIdAndStatus,
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
								"TourismApplicationStagesPersistenceImpl.fetchBygetTAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					TourismApplicationStages tourismApplicationStages =
						list.get(0);

					result = tourismApplicationStages;

					cacheResult(tourismApplicationStages);
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
			return (TourismApplicationStages)result;
		}
	}

	/**
	 * Removes the tourism application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the tourism application stages that was removed
	 */
	@Override
	public TourismApplicationStages removeBygetTAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			findBygetTAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(tourismApplicationStages);
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countBygetTAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetTAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_CASEID_2 =
		"tourismApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_CASEID_3 =
		"(tourismApplicationStages.caseId IS NULL OR tourismApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"tourismApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETTAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(tourismApplicationStages.stageStatus IS NULL OR tourismApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetTAS_SNAndSS;
	private FinderPath _finderPathWithoutPaginationFindBygetTAS_SNAndSS;
	private FinderPath _finderPathCountBygetTAS_SNAndSS;

	/**
	 * Returns all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus) {

		return findBygetTAS_SNAndSS(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end) {

		return findBygetTAS_SNAndSS(stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return findBygetTAS_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetTAS_SNAndSS;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTAS_SNAndSS;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<TourismApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismApplicationStages tourismApplicationStages : list) {
					if (!stageName.equals(
							tourismApplicationStages.getStageName()) ||
						!stageStatus.equals(
							tourismApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<TourismApplicationStages>)QueryUtil.list(
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
	 * Returns the first tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_SNAndSS_First(
			String stageName, String stageStatus,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_SNAndSS_First(
				stageName, stageStatus, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_SNAndSS_First(
		String stageName, String stageStatus,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		List<TourismApplicationStages> list = findBygetTAS_SNAndSS(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_SNAndSS_Last(
			String stageName, String stageStatus,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_SNAndSS_Last(
				stageName, stageStatus, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_SNAndSS_Last(
		String stageName, String stageStatus,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		int count = countBygetTAS_SNAndSS(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<TourismApplicationStages> list = findBygetTAS_SNAndSS(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages[] findBygetTAS_SNAndSS_PrevAndNext(
			long tourismApplicationStagesId, String stageName,
			String stageStatus,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		TourismApplicationStages tourismApplicationStages = findByPrimaryKey(
			tourismApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			TourismApplicationStages[] array =
				new TourismApplicationStagesImpl[3];

			array[0] = getBygetTAS_SNAndSS_PrevAndNext(
				session, tourismApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = tourismApplicationStages;

			array[2] = getBygetTAS_SNAndSS_PrevAndNext(
				session, tourismApplicationStages, stageName, stageStatus,
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

	protected TourismApplicationStages getBygetTAS_SNAndSS_PrevAndNext(
		Session session, TourismApplicationStages tourismApplicationStages,
		String stageName, String stageStatus,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_2);
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
			sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						tourismApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetTAS_SNAndSS(String stageName, String stageStatus) {
		for (TourismApplicationStages tourismApplicationStages :
				findBygetTAS_SNAndSS(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(tourismApplicationStages);
		}
	}

	/**
	 * Returns the number of tourism application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countBygetTAS_SNAndSS(String stageName, String stageStatus) {
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetTAS_SNAndSS;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_2 =
		"tourismApplicationStages.stageName = ? AND ";

	private static final String _FINDER_COLUMN_GETTAS_SNANDSS_STAGENAME_3 =
		"(tourismApplicationStages.stageName IS NULL OR tourismApplicationStages.stageName = '') AND ";

	private static final String _FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_2 =
		"tourismApplicationStages.stageStatus = ?";

	private static final String _FINDER_COLUMN_GETTAS_SNANDSS_STAGESTATUS_3 =
		"(tourismApplicationStages.stageStatus IS NULL OR tourismApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetTAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetTAS_CaseId;
	private FinderPath _finderPathCountBygetTAS_CaseId;

	/**
	 * Returns all the tourism application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_CaseId(String caseId) {
		return findBygetTAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end) {

		return findBygetTAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return findBygetTAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findBygetTAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetTAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetTAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<TourismApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (TourismApplicationStages tourismApplicationStages : list) {
					if (!caseId.equals(tourismApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<TourismApplicationStages>)QueryUtil.list(
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
	 * Returns the first tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_CaseId_First(
			String caseId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_CaseId_First(caseId, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseId_First(
		String caseId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		List<TourismApplicationStages> list = findBygetTAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages findBygetTAS_CaseId_Last(
			String caseId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages =
			fetchBygetTAS_CaseId_Last(caseId, orderByComparator);

		if (tourismApplicationStages != null) {
			return tourismApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchTourismApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching tourism application stages, or <code>null</code> if a matching tourism application stages could not be found
	 */
	@Override
	public TourismApplicationStages fetchBygetTAS_CaseId_Last(
		String caseId,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		int count = countBygetTAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<TourismApplicationStages> list = findBygetTAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the tourism application stageses before and after the current tourism application stages in the ordered set where caseId = &#63;.
	 *
	 * @param tourismApplicationStagesId the primary key of the current tourism application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages[] findBygetTAS_CaseId_PrevAndNext(
			long tourismApplicationStagesId, String caseId,
			OrderByComparator<TourismApplicationStages> orderByComparator)
		throws NoSuchTourismApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		TourismApplicationStages tourismApplicationStages = findByPrimaryKey(
			tourismApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			TourismApplicationStages[] array =
				new TourismApplicationStagesImpl[3];

			array[0] = getBygetTAS_CaseId_PrevAndNext(
				session, tourismApplicationStages, caseId, orderByComparator,
				true);

			array[1] = tourismApplicationStages;

			array[2] = getBygetTAS_CaseId_PrevAndNext(
				session, tourismApplicationStages, caseId, orderByComparator,
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

	protected TourismApplicationStages getBygetTAS_CaseId_PrevAndNext(
		Session session, TourismApplicationStages tourismApplicationStages,
		String caseId,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETTAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETTAS_CASEID_CASEID_2);
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
			sb.append(TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						tourismApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<TourismApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the tourism application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetTAS_CaseId(String caseId) {
		for (TourismApplicationStages tourismApplicationStages :
				findBygetTAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(tourismApplicationStages);
		}
	}

	/**
	 * Returns the number of tourism application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching tourism application stageses
	 */
	@Override
	public int countBygetTAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetTAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETTAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETTAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETTAS_CASEID_CASEID_2 =
		"tourismApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETTAS_CASEID_CASEID_3 =
		"(tourismApplicationStages.caseId IS NULL OR tourismApplicationStages.caseId = '')";

	public TourismApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(TourismApplicationStages.class);

		setModelImplClass(TourismApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(TourismApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the tourism application stages in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationStages the tourism application stages
	 */
	@Override
	public void cacheResult(TourismApplicationStages tourismApplicationStages) {
		entityCache.putResult(
			TourismApplicationStagesImpl.class,
			tourismApplicationStages.getPrimaryKey(), tourismApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				tourismApplicationStages.getUuid(),
				tourismApplicationStages.getGroupId()
			},
			tourismApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetTAS_TAI,
			new Object[] {tourismApplicationStages.getTourismApplicationId()},
			tourismApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetTAS_CaseIdStageName,
			new Object[] {
				tourismApplicationStages.getCaseId(),
				tourismApplicationStages.getStageName()
			},
			tourismApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetTAS_CaseIdStageStatus,
			new Object[] {
				tourismApplicationStages.getCaseId(),
				tourismApplicationStages.getStageName(),
				tourismApplicationStages.getStageStatus()
			},
			tourismApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetTAS_CaseIdAndStatus,
			new Object[] {
				tourismApplicationStages.getCaseId(),
				tourismApplicationStages.getStageStatus()
			},
			tourismApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the tourism application stageses in the entity cache if it is enabled.
	 *
	 * @param tourismApplicationStageses the tourism application stageses
	 */
	@Override
	public void cacheResult(
		List<TourismApplicationStages> tourismApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (tourismApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (TourismApplicationStages tourismApplicationStages :
				tourismApplicationStageses) {

			if (entityCache.getResult(
					TourismApplicationStagesImpl.class,
					tourismApplicationStages.getPrimaryKey()) == null) {

				cacheResult(tourismApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all tourism application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(TourismApplicationStagesImpl.class);

		finderCache.clearCache(TourismApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the tourism application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(TourismApplicationStages tourismApplicationStages) {
		entityCache.removeResult(
			TourismApplicationStagesImpl.class, tourismApplicationStages);
	}

	@Override
	public void clearCache(
		List<TourismApplicationStages> tourismApplicationStageses) {

		for (TourismApplicationStages tourismApplicationStages :
				tourismApplicationStageses) {

			entityCache.removeResult(
				TourismApplicationStagesImpl.class, tourismApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(TourismApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				TourismApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		TourismApplicationStagesModelImpl tourismApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			tourismApplicationStagesModelImpl.getUuid(),
			tourismApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, tourismApplicationStagesModelImpl);

		args = new Object[] {
			tourismApplicationStagesModelImpl.getTourismApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetTAS_TAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTAS_TAI, args,
			tourismApplicationStagesModelImpl);

		args = new Object[] {
			tourismApplicationStagesModelImpl.getCaseId(),
			tourismApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetTAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTAS_CaseIdStageName, args,
			tourismApplicationStagesModelImpl);

		args = new Object[] {
			tourismApplicationStagesModelImpl.getCaseId(),
			tourismApplicationStagesModelImpl.getStageName(),
			tourismApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetTAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTAS_CaseIdStageStatus, args,
			tourismApplicationStagesModelImpl);

		args = new Object[] {
			tourismApplicationStagesModelImpl.getCaseId(),
			tourismApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetTAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetTAS_CaseIdAndStatus, args,
			tourismApplicationStagesModelImpl);
	}

	/**
	 * Creates a new tourism application stages with the primary key. Does not add the tourism application stages to the database.
	 *
	 * @param tourismApplicationStagesId the primary key for the new tourism application stages
	 * @return the new tourism application stages
	 */
	@Override
	public TourismApplicationStages create(long tourismApplicationStagesId) {
		TourismApplicationStages tourismApplicationStages =
			new TourismApplicationStagesImpl();

		tourismApplicationStages.setNew(true);
		tourismApplicationStages.setPrimaryKey(tourismApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		tourismApplicationStages.setUuid(uuid);

		tourismApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return tourismApplicationStages;
	}

	/**
	 * Removes the tourism application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages that was removed
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages remove(long tourismApplicationStagesId)
		throws NoSuchTourismApplicationStagesException {

		return remove((Serializable)tourismApplicationStagesId);
	}

	/**
	 * Removes the tourism application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the tourism application stages
	 * @return the tourism application stages that was removed
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages remove(Serializable primaryKey)
		throws NoSuchTourismApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			TourismApplicationStages tourismApplicationStages =
				(TourismApplicationStages)session.get(
					TourismApplicationStagesImpl.class, primaryKey);

			if (tourismApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchTourismApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(tourismApplicationStages);
		}
		catch (NoSuchTourismApplicationStagesException noSuchEntityException) {
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
	protected TourismApplicationStages removeImpl(
		TourismApplicationStages tourismApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(tourismApplicationStages)) {
				tourismApplicationStages =
					(TourismApplicationStages)session.get(
						TourismApplicationStagesImpl.class,
						tourismApplicationStages.getPrimaryKeyObj());
			}

			if (tourismApplicationStages != null) {
				session.delete(tourismApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (tourismApplicationStages != null) {
			clearCache(tourismApplicationStages);
		}

		return tourismApplicationStages;
	}

	@Override
	public TourismApplicationStages updateImpl(
		TourismApplicationStages tourismApplicationStages) {

		boolean isNew = tourismApplicationStages.isNew();

		if (!(tourismApplicationStages instanceof
				TourismApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(tourismApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					tourismApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in tourismApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom TourismApplicationStages implementation " +
					tourismApplicationStages.getClass());
		}

		TourismApplicationStagesModelImpl tourismApplicationStagesModelImpl =
			(TourismApplicationStagesModelImpl)tourismApplicationStages;

		if (Validator.isNull(tourismApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			tourismApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (tourismApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				tourismApplicationStages.setCreateDate(date);
			}
			else {
				tourismApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!tourismApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				tourismApplicationStages.setModifiedDate(date);
			}
			else {
				tourismApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(tourismApplicationStages);
			}
			else {
				tourismApplicationStages =
					(TourismApplicationStages)session.merge(
						tourismApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			TourismApplicationStagesImpl.class,
			tourismApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(tourismApplicationStagesModelImpl);

		if (isNew) {
			tourismApplicationStages.setNew(false);
		}

		tourismApplicationStages.resetOriginalValues();

		return tourismApplicationStages;
	}

	/**
	 * Returns the tourism application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the tourism application stages
	 * @return the tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchTourismApplicationStagesException {

		TourismApplicationStages tourismApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (tourismApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchTourismApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return tourismApplicationStages;
	}

	/**
	 * Returns the tourism application stages with the primary key or throws a <code>NoSuchTourismApplicationStagesException</code> if it could not be found.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages
	 * @throws NoSuchTourismApplicationStagesException if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages findByPrimaryKey(
			long tourismApplicationStagesId)
		throws NoSuchTourismApplicationStagesException {

		return findByPrimaryKey((Serializable)tourismApplicationStagesId);
	}

	/**
	 * Returns the tourism application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param tourismApplicationStagesId the primary key of the tourism application stages
	 * @return the tourism application stages, or <code>null</code> if a tourism application stages with the primary key could not be found
	 */
	@Override
	public TourismApplicationStages fetchByPrimaryKey(
		long tourismApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)tourismApplicationStagesId);
	}

	/**
	 * Returns all the tourism application stageses.
	 *
	 * @return the tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @return the range of tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the tourism application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>TourismApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of tourism application stageses
	 * @param end the upper bound of the range of tourism application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of tourism application stageses
	 */
	@Override
	public List<TourismApplicationStages> findAll(
		int start, int end,
		OrderByComparator<TourismApplicationStages> orderByComparator,
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

		List<TourismApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<TourismApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_TOURISMAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_TOURISMAPPLICATIONSTAGES;

				sql = sql.concat(
					TourismApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<TourismApplicationStages>)QueryUtil.list(
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
	 * Removes all the tourism application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (TourismApplicationStages tourismApplicationStages : findAll()) {
			remove(tourismApplicationStages);
		}
	}

	/**
	 * Returns the number of tourism application stageses.
	 *
	 * @return the number of tourism application stageses
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
					_SQL_COUNT_TOURISMAPPLICATIONSTAGES);

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
		return "tourismApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_TOURISMAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return TourismApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the tourism application stages persistence.
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

		_finderPathFetchBygetTAS_TAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTAS_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, true);

		_finderPathCountBygetTAS_TAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTAS_TAI",
			new String[] {Long.class.getName()},
			new String[] {"tourismApplicationId"}, false);

		_finderPathFetchBygetTAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetTAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetTAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetTAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetTAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetTAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetTAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetTAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetTAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetTAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetTAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetTAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetTAS_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTAS_SNAndSS",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetTAS_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetTAS_SNAndSS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetTAS_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTAS_SNAndSS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetTAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetTAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetTAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetTAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetTAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetTAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		TourismApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		TourismApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(TourismApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = TOURISM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_TOURISMAPPLICATIONSTAGES =
		"SELECT tourismApplicationStages FROM TourismApplicationStages tourismApplicationStages";

	private static final String _SQL_SELECT_TOURISMAPPLICATIONSTAGES_WHERE =
		"SELECT tourismApplicationStages FROM TourismApplicationStages tourismApplicationStages WHERE ";

	private static final String _SQL_COUNT_TOURISMAPPLICATIONSTAGES =
		"SELECT COUNT(tourismApplicationStages) FROM TourismApplicationStages tourismApplicationStages";

	private static final String _SQL_COUNT_TOURISMAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(tourismApplicationStages) FROM TourismApplicationStages tourismApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"tourismApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No TourismApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No TourismApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		TourismApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
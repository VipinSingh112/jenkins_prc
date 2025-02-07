/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.stages.services.service.persistence.impl;

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

import com.nbp.ncra.stages.services.exception.NoSuchNcraApplicationStagesException;
import com.nbp.ncra.stages.services.model.NcraApplicationStages;
import com.nbp.ncra.stages.services.model.NcraApplicationStagesTable;
import com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesImpl;
import com.nbp.ncra.stages.services.model.impl.NcraApplicationStagesModelImpl;
import com.nbp.ncra.stages.services.service.persistence.NcraApplicationStagesPersistence;
import com.nbp.ncra.stages.services.service.persistence.NcraApplicationStagesUtil;
import com.nbp.ncra.stages.services.service.persistence.impl.constants.NCRA_APPLICATION_STAGEPersistenceConstants;

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
 * The persistence implementation for the ncra application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraApplicationStagesPersistence.class)
public class NcraApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<NcraApplicationStages>
	implements NcraApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraApplicationStagesUtil</code> to access the ncra application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraApplicationStagesImpl.class.getName();

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
	 * Returns all the ncra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
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

		List<NcraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplicationStages ncraApplicationStages : list) {
					if (!uuid.equals(ncraApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

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
				sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		List<NcraApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NcraApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where uuid = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages[] findByUuid_PrevAndNext(
			long ncraApplciationStage, String uuid,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		NcraApplicationStages ncraApplicationStages = findByPrimaryKey(
			ncraApplciationStage);

		Session session = null;

		try {
			session = openSession();

			NcraApplicationStages[] array = new NcraApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, ncraApplicationStages, uuid, orderByComparator, true);

			array[1] = ncraApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, ncraApplicationStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcraApplicationStages getByUuid_PrevAndNext(
		Session session, NcraApplicationStages ncraApplicationStages,
		String uuid, OrderByComparator<NcraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

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
			sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (NcraApplicationStages ncraApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncraApplicationStages);
		}
	}

	/**
	 * Returns the number of ncra application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

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
		"ncraApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(ncraApplicationStages.uuid IS NULL OR ncraApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (ncraApplicationStages == null) {
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

			throw new NoSuchNcraApplicationStagesException(sb.toString());
		}

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the ncra application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByUUID_G(
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

		if (result instanceof NcraApplicationStages) {
			NcraApplicationStages ncraApplicationStages =
				(NcraApplicationStages)result;

			if (!Objects.equals(uuid, ncraApplicationStages.getUuid()) ||
				(groupId != ncraApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

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

				List<NcraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					NcraApplicationStages ncraApplicationStages = list.get(0);

					result = ncraApplicationStages;

					cacheResult(ncraApplicationStages);
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
			return (NcraApplicationStages)result;
		}
	}

	/**
	 * Removes the ncra application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncra application stages that was removed
	 */
	@Override
	public NcraApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(ncraApplicationStages);
	}

	/**
	 * Returns the number of ncra application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

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
		"ncraApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(ncraApplicationStages.uuid IS NULL OR ncraApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"ncraApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
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

		List<NcraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplicationStages ncraApplicationStages : list) {
					if (!uuid.equals(ncraApplicationStages.getUuid()) ||
						(companyId != ncraApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

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
				sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		List<NcraApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NcraApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages[] findByUuid_C_PrevAndNext(
			long ncraApplciationStage, String uuid, long companyId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		NcraApplicationStages ncraApplicationStages = findByPrimaryKey(
			ncraApplciationStage);

		Session session = null;

		try {
			session = openSession();

			NcraApplicationStages[] array = new NcraApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, ncraApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = ncraApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, ncraApplicationStages, uuid, companyId,
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

	protected NcraApplicationStages getByUuid_C_PrevAndNext(
		Session session, NcraApplicationStages ncraApplicationStages,
		String uuid, long companyId,
		OrderByComparator<NcraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

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
			sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (NcraApplicationStages ncraApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncraApplicationStages);
		}
	}

	/**
	 * Returns the number of ncra application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

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
		"ncraApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(ncraApplicationStages.uuid IS NULL OR ncraApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"ncraApplicationStages.companyId = ?";

	private FinderPath _finderPathWithPaginationFindByget_NCRA_AppStage_By_CI;
	private FinderPath
		_finderPathWithoutPaginationFindByget_NCRA_AppStage_By_CI;
	private FinderPath _finderPathCountByget_NCRA_AppStage_By_CI;

	/**
	 * Returns all the ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId) {

		return findByget_NCRA_AppStage_By_CI(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end) {

		return findByget_NCRA_AppStage_By_CI(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return findByget_NCRA_AppStage_By_CI(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_AppStage_By_CI(
		String caseId, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindByget_NCRA_AppStage_By_CI;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByget_NCRA_AppStage_By_CI;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<NcraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplicationStages ncraApplicationStages : list) {
					if (!caseId.equals(ncraApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_AppStage_By_CI_First(
			String caseId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			fetchByget_NCRA_AppStage_By_CI_First(caseId, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_AppStage_By_CI_First(
		String caseId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		List<NcraApplicationStages> list = findByget_NCRA_AppStage_By_CI(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_AppStage_By_CI_Last(
			String caseId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			fetchByget_NCRA_AppStage_By_CI_Last(caseId, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_AppStage_By_CI_Last(
		String caseId,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		int count = countByget_NCRA_AppStage_By_CI(caseId);

		if (count == 0) {
			return null;
		}

		List<NcraApplicationStages> list = findByget_NCRA_AppStage_By_CI(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where caseId = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages[] findByget_NCRA_AppStage_By_CI_PrevAndNext(
			long ncraApplciationStage, String caseId,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		NcraApplicationStages ncraApplicationStages = findByPrimaryKey(
			ncraApplciationStage);

		Session session = null;

		try {
			session = openSession();

			NcraApplicationStages[] array = new NcraApplicationStagesImpl[3];

			array[0] = getByget_NCRA_AppStage_By_CI_PrevAndNext(
				session, ncraApplicationStages, caseId, orderByComparator,
				true);

			array[1] = ncraApplicationStages;

			array[2] = getByget_NCRA_AppStage_By_CI_PrevAndNext(
				session, ncraApplicationStages, caseId, orderByComparator,
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

	protected NcraApplicationStages getByget_NCRA_AppStage_By_CI_PrevAndNext(
		Session session, NcraApplicationStages ncraApplicationStages,
		String caseId,
		OrderByComparator<NcraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_2);
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
			sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeByget_NCRA_AppStage_By_CI(String caseId) {
		for (NcraApplicationStages ncraApplicationStages :
				findByget_NCRA_AppStage_By_CI(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncraApplicationStages);
		}
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByget_NCRA_AppStage_By_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByget_NCRA_AppStage_By_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_2 =
			"ncraApplicationStages.caseId = ?";

	private static final String
		_FINDER_COLUMN_GET_NCRA_APPSTAGE_BY_CI_CASEID_3 =
			"(ncraApplicationStages.caseId IS NULL OR ncraApplicationStages.caseId = '')";

	private FinderPath _finderPathFetchByget_NCRA_AppStage_CI;
	private FinderPath _finderPathCountByget_NCRA_AppStage_CI;

	/**
	 * Returns the ncra application stages where caseId = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_AppStage_CI(String caseId)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			fetchByget_NCRA_AppStage_CI(caseId);

		if (ncraApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraApplicationStagesException(sb.toString());
		}

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_AppStage_CI(String caseId) {
		return fetchByget_NCRA_AppStage_CI(caseId, true);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_AppStage_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_NCRA_AppStage_CI, finderArgs, this);
		}

		if (result instanceof NcraApplicationStages) {
			NcraApplicationStages ncraApplicationStages =
				(NcraApplicationStages)result;

			if (!Objects.equals(caseId, ncraApplicationStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_CI_CASEID_2);
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

				List<NcraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_NCRA_AppStage_CI, finderArgs,
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
								"NcraApplicationStagesPersistenceImpl.fetchByget_NCRA_AppStage_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplicationStages ncraApplicationStages = list.get(0);

					result = ncraApplicationStages;

					cacheResult(ncraApplicationStages);
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
			return (NcraApplicationStages)result;
		}
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncra application stages that was removed
	 */
	@Override
	public NcraApplicationStages removeByget_NCRA_AppStage_CI(String caseId)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			findByget_NCRA_AppStage_CI(caseId);

		return remove(ncraApplicationStages);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByget_NCRA_AppStage_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountByget_NCRA_AppStage_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_APPSTAGE_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GET_NCRA_APPSTAGE_CI_CASEID_2 =
		"ncraApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GET_NCRA_APPSTAGE_CI_CASEID_3 =
		"(ncraApplicationStages.caseId IS NULL OR ncraApplicationStages.caseId = '')";

	private FinderPath _finderPathWithPaginationFindByget_NCRA_By_SN;
	private FinderPath _finderPathWithoutPaginationFindByget_NCRA_By_SN;
	private FinderPath _finderPathCountByget_NCRA_By_SN;

	/**
	 * Returns all the ncra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_By_SN(String stageName) {
		return findByget_NCRA_By_SN(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end) {

		return findByget_NCRA_By_SN(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return findByget_NCRA_By_SN(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findByget_NCRA_By_SN(
		String stageName, int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindByget_NCRA_By_SN;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindByget_NCRA_By_SN;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<NcraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcraApplicationStages ncraApplicationStages : list) {
					if (!stageName.equals(
							ncraApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcraApplicationStages>)QueryUtil.list(
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
	 * Returns the first ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_By_SN_First(
			String stageName,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			fetchByget_NCRA_By_SN_First(stageName, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_SN_First(
		String stageName,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		List<NcraApplicationStages> list = findByget_NCRA_By_SN(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_By_SN_Last(
			String stageName,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			fetchByget_NCRA_By_SN_Last(stageName, orderByComparator);

		if (ncraApplicationStages != null) {
			return ncraApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchNcraApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_SN_Last(
		String stageName,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		int count = countByget_NCRA_By_SN(stageName);

		if (count == 0) {
			return null;
		}

		List<NcraApplicationStages> list = findByget_NCRA_By_SN(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncra application stageses before and after the current ncra application stages in the ordered set where stageName = &#63;.
	 *
	 * @param ncraApplciationStage the primary key of the current ncra application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages[] findByget_NCRA_By_SN_PrevAndNext(
			long ncraApplciationStage, String stageName,
			OrderByComparator<NcraApplicationStages> orderByComparator)
		throws NoSuchNcraApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		NcraApplicationStages ncraApplicationStages = findByPrimaryKey(
			ncraApplciationStage);

		Session session = null;

		try {
			session = openSession();

			NcraApplicationStages[] array = new NcraApplicationStagesImpl[3];

			array[0] = getByget_NCRA_By_SN_PrevAndNext(
				session, ncraApplicationStages, stageName, orderByComparator,
				true);

			array[1] = ncraApplicationStages;

			array[2] = getByget_NCRA_By_SN_PrevAndNext(
				session, ncraApplicationStages, stageName, orderByComparator,
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

	protected NcraApplicationStages getByget_NCRA_By_SN_PrevAndNext(
		Session session, NcraApplicationStages ncraApplicationStages,
		String stageName,
		OrderByComparator<NcraApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_2);
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
			sb.append(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						ncraApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcraApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncra application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeByget_NCRA_By_SN(String stageName) {
		for (NcraApplicationStages ncraApplicationStages :
				findByget_NCRA_By_SN(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncraApplicationStages);
		}
	}

	/**
	 * Returns the number of ncra application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByget_NCRA_By_SN(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountByget_NCRA_By_SN;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_2 =
		"ncraApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_SN_STAGENAME_3 =
		"(ncraApplicationStages.stageName IS NULL OR ncraApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchByget_NCRA_By_Status;
	private FinderPath _finderPathCountByget_NCRA_By_Status;

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_By_Status(String stageStatus)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByget_NCRA_By_Status(
			stageStatus);

		if (ncraApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraApplicationStagesException(sb.toString());
		}

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_Status(String stageStatus) {
		return fetchByget_NCRA_By_Status(stageStatus, true);
	}

	/**
	 * Returns the ncra application stages where stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_Status(
		String stageStatus, boolean useFinderCache) {

		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchByget_NCRA_By_Status, finderArgs, this);
		}

		if (result instanceof NcraApplicationStages) {
			NcraApplicationStages ncraApplicationStages =
				(NcraApplicationStages)result;

			if (!Objects.equals(
					stageStatus, ncraApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_STATUS_STAGESTATUS_2);
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

				List<NcraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_NCRA_By_Status, finderArgs,
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
								"NcraApplicationStagesPersistenceImpl.fetchByget_NCRA_By_Status(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplicationStages ncraApplicationStages = list.get(0);

					result = ncraApplicationStages;

					cacheResult(ncraApplicationStages);
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
			return (NcraApplicationStages)result;
		}
	}

	/**
	 * Removes the ncra application stages where stageStatus = &#63; from the database.
	 *
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	@Override
	public NcraApplicationStages removeByget_NCRA_By_Status(String stageStatus)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = findByget_NCRA_By_Status(
			stageStatus);

		return remove(ncraApplicationStages);
	}

	/**
	 * Returns the number of ncra application stageses where stageStatus = &#63;.
	 *
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByget_NCRA_By_Status(String stageStatus) {
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByget_NCRA_By_Status;

		Object[] finderArgs = new Object[] {stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_STATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_STATUS_STAGESTATUS_2);
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

	private static final String
		_FINDER_COLUMN_GET_NCRA_BY_STATUS_STAGESTATUS_2 =
			"ncraApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GET_NCRA_BY_STATUS_STAGESTATUS_3 =
			"(ncraApplicationStages.stageStatus IS NULL OR ncraApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchByget_NCRA_By_CI_SN_SS;
	private FinderPath _finderPathCountByget_NCRA_By_CI_SN_SS;

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			fetchByget_NCRA_By_CI_SN_SS(caseId, stageName, stageStatus);

		if (ncraApplicationStages == null) {
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

			throw new NoSuchNcraApplicationStagesException(sb.toString());
		}

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		return fetchByget_NCRA_By_CI_SN_SS(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN_SS(
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
				_finderPathFetchByget_NCRA_By_CI_SN_SS, finderArgs, this);
		}

		if (result instanceof NcraApplicationStages) {
			NcraApplicationStages ncraApplicationStages =
				(NcraApplicationStages)result;

			if (!Objects.equals(caseId, ncraApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, ncraApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, ncraApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGESTATUS_2);
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

				List<NcraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_NCRA_By_CI_SN_SS, finderArgs,
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
								"NcraApplicationStagesPersistenceImpl.fetchByget_NCRA_By_CI_SN_SS(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplicationStages ncraApplicationStages = list.get(0);

					result = ncraApplicationStages;

					cacheResult(ncraApplicationStages);
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
			return (NcraApplicationStages)result;
		}
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	@Override
	public NcraApplicationStages removeByget_NCRA_By_CI_SN_SS(
			String caseId, String stageName, String stageStatus)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages =
			findByget_NCRA_By_CI_SN_SS(caseId, stageName, stageStatus);

		return remove(ncraApplicationStages);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByget_NCRA_By_CI_SN_SS(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByget_NCRA_By_CI_SN_SS;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_CASEID_2 =
		"ncraApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_CASEID_3 =
		"(ncraApplicationStages.caseId IS NULL OR ncraApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGENAME_2 =
			"ncraApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGENAME_3 =
			"(ncraApplicationStages.stageName IS NULL OR ncraApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGESTATUS_2 =
			"ncraApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GET_NCRA_BY_CI_SN_SS_STAGESTATUS_3 =
			"(ncraApplicationStages.stageStatus IS NULL OR ncraApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchByget_NCRA_By_CI_SN;
	private FinderPath _finderPathCountByget_NCRA_By_CI_SN;

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByget_NCRA_By_CI_SN(
			caseId, stageName);

		if (ncraApplicationStages == null) {
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

			throw new NoSuchNcraApplicationStagesException(sb.toString());
		}

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN(
		String caseId, String stageName) {

		return fetchByget_NCRA_By_CI_SN(caseId, stageName, true);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_CI_SN(
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
				_finderPathFetchByget_NCRA_By_CI_SN, finderArgs, this);
		}

		if (result instanceof NcraApplicationStages) {
			NcraApplicationStages ncraApplicationStages =
				(NcraApplicationStages)result;

			if (!Objects.equals(caseId, ncraApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, ncraApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_STAGENAME_2);
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

				List<NcraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_NCRA_By_CI_SN, finderArgs,
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
								"NcraApplicationStagesPersistenceImpl.fetchByget_NCRA_By_CI_SN(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplicationStages ncraApplicationStages = list.get(0);

					result = ncraApplicationStages;

					cacheResult(ncraApplicationStages);
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
			return (NcraApplicationStages)result;
		}
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the ncra application stages that was removed
	 */
	@Override
	public NcraApplicationStages removeByget_NCRA_By_CI_SN(
			String caseId, String stageName)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = findByget_NCRA_By_CI_SN(
			caseId, stageName);

		return remove(ncraApplicationStages);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByget_NCRA_By_CI_SN(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountByget_NCRA_By_CI_SN;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SN_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SN_CASEID_2 =
		"ncraApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SN_CASEID_3 =
		"(ncraApplicationStages.caseId IS NULL OR ncraApplicationStages.caseId = '') AND ";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SN_STAGENAME_2 =
		"ncraApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SN_STAGENAME_3 =
		"(ncraApplicationStages.stageName IS NULL OR ncraApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchByget_NCRA_By_CI_SS;
	private FinderPath _finderPathCountByget_NCRA_By_CI_SS;

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages findByget_NCRA_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByget_NCRA_By_CI_SS(
			caseId, stageStatus);

		if (ncraApplicationStages == null) {
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

			throw new NoSuchNcraApplicationStagesException(sb.toString());
		}

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_CI_SS(
		String caseId, String stageStatus) {

		return fetchByget_NCRA_By_CI_SS(caseId, stageStatus, true);
	}

	/**
	 * Returns the ncra application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra application stages, or <code>null</code> if a matching ncra application stages could not be found
	 */
	@Override
	public NcraApplicationStages fetchByget_NCRA_By_CI_SS(
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
				_finderPathFetchByget_NCRA_By_CI_SS, finderArgs, this);
		}

		if (result instanceof NcraApplicationStages) {
			NcraApplicationStages ncraApplicationStages =
				(NcraApplicationStages)result;

			if (!Objects.equals(caseId, ncraApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, ncraApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_STAGESTATUS_2);
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

				List<NcraApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByget_NCRA_By_CI_SS, finderArgs,
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
								"NcraApplicationStagesPersistenceImpl.fetchByget_NCRA_By_CI_SS(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraApplicationStages ncraApplicationStages = list.get(0);

					result = ncraApplicationStages;

					cacheResult(ncraApplicationStages);
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
			return (NcraApplicationStages)result;
		}
	}

	/**
	 * Removes the ncra application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the ncra application stages that was removed
	 */
	@Override
	public NcraApplicationStages removeByget_NCRA_By_CI_SS(
			String caseId, String stageStatus)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = findByget_NCRA_By_CI_SS(
			caseId, stageStatus);

		return remove(ncraApplicationStages);
	}

	/**
	 * Returns the number of ncra application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching ncra application stageses
	 */
	@Override
	public int countByget_NCRA_By_CI_SS(String caseId, String stageStatus) {
		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountByget_NCRA_By_CI_SS;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GET_NCRA_BY_CI_SS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SS_CASEID_2 =
		"ncraApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SS_CASEID_3 =
		"(ncraApplicationStages.caseId IS NULL OR ncraApplicationStages.caseId = '') AND ";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SS_STAGESTATUS_2 =
		"ncraApplicationStages.stageStatus = ?";

	private static final String _FINDER_COLUMN_GET_NCRA_BY_CI_SS_STAGESTATUS_3 =
		"(ncraApplicationStages.stageStatus IS NULL OR ncraApplicationStages.stageStatus = '')";

	public NcraApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NcraApplicationStages.class);

		setModelImplClass(NcraApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(NcraApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the ncra application stages in the entity cache if it is enabled.
	 *
	 * @param ncraApplicationStages the ncra application stages
	 */
	@Override
	public void cacheResult(NcraApplicationStages ncraApplicationStages) {
		entityCache.putResult(
			NcraApplicationStagesImpl.class,
			ncraApplicationStages.getPrimaryKey(), ncraApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				ncraApplicationStages.getUuid(),
				ncraApplicationStages.getGroupId()
			},
			ncraApplicationStages);

		finderCache.putResult(
			_finderPathFetchByget_NCRA_AppStage_CI,
			new Object[] {ncraApplicationStages.getCaseId()},
			ncraApplicationStages);

		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_Status,
			new Object[] {ncraApplicationStages.getStageStatus()},
			ncraApplicationStages);

		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_CI_SN_SS,
			new Object[] {
				ncraApplicationStages.getCaseId(),
				ncraApplicationStages.getStageName(),
				ncraApplicationStages.getStageStatus()
			},
			ncraApplicationStages);

		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_CI_SN,
			new Object[] {
				ncraApplicationStages.getCaseId(),
				ncraApplicationStages.getStageName()
			},
			ncraApplicationStages);

		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_CI_SS,
			new Object[] {
				ncraApplicationStages.getCaseId(),
				ncraApplicationStages.getStageStatus()
			},
			ncraApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra application stageses in the entity cache if it is enabled.
	 *
	 * @param ncraApplicationStageses the ncra application stageses
	 */
	@Override
	public void cacheResult(
		List<NcraApplicationStages> ncraApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraApplicationStages ncraApplicationStages :
				ncraApplicationStageses) {

			if (entityCache.getResult(
					NcraApplicationStagesImpl.class,
					ncraApplicationStages.getPrimaryKey()) == null) {

				cacheResult(ncraApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all ncra application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraApplicationStagesImpl.class);

		finderCache.clearCache(NcraApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the ncra application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcraApplicationStages ncraApplicationStages) {
		entityCache.removeResult(
			NcraApplicationStagesImpl.class, ncraApplicationStages);
	}

	@Override
	public void clearCache(
		List<NcraApplicationStages> ncraApplicationStageses) {

		for (NcraApplicationStages ncraApplicationStages :
				ncraApplicationStageses) {

			entityCache.removeResult(
				NcraApplicationStagesImpl.class, ncraApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcraApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraApplicationStagesModelImpl ncraApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			ncraApplicationStagesModelImpl.getUuid(),
			ncraApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, ncraApplicationStagesModelImpl);

		args = new Object[] {ncraApplicationStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountByget_NCRA_AppStage_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_NCRA_AppStage_CI, args,
			ncraApplicationStagesModelImpl);

		args = new Object[] {ncraApplicationStagesModelImpl.getStageStatus()};

		finderCache.putResult(
			_finderPathCountByget_NCRA_By_Status, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_Status, args,
			ncraApplicationStagesModelImpl);

		args = new Object[] {
			ncraApplicationStagesModelImpl.getCaseId(),
			ncraApplicationStagesModelImpl.getStageName(),
			ncraApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountByget_NCRA_By_CI_SN_SS, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_CI_SN_SS, args,
			ncraApplicationStagesModelImpl);

		args = new Object[] {
			ncraApplicationStagesModelImpl.getCaseId(),
			ncraApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountByget_NCRA_By_CI_SN, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_CI_SN, args,
			ncraApplicationStagesModelImpl);

		args = new Object[] {
			ncraApplicationStagesModelImpl.getCaseId(),
			ncraApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountByget_NCRA_By_CI_SS, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByget_NCRA_By_CI_SS, args,
			ncraApplicationStagesModelImpl);
	}

	/**
	 * Creates a new ncra application stages with the primary key. Does not add the ncra application stages to the database.
	 *
	 * @param ncraApplciationStage the primary key for the new ncra application stages
	 * @return the new ncra application stages
	 */
	@Override
	public NcraApplicationStages create(long ncraApplciationStage) {
		NcraApplicationStages ncraApplicationStages =
			new NcraApplicationStagesImpl();

		ncraApplicationStages.setNew(true);
		ncraApplicationStages.setPrimaryKey(ncraApplciationStage);

		String uuid = PortalUUIDUtil.generate();

		ncraApplicationStages.setUuid(uuid);

		ncraApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncraApplicationStages;
	}

	/**
	 * Removes the ncra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages that was removed
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages remove(long ncraApplciationStage)
		throws NoSuchNcraApplicationStagesException {

		return remove((Serializable)ncraApplciationStage);
	}

	/**
	 * Removes the ncra application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra application stages
	 * @return the ncra application stages that was removed
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages remove(Serializable primaryKey)
		throws NoSuchNcraApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			NcraApplicationStages ncraApplicationStages =
				(NcraApplicationStages)session.get(
					NcraApplicationStagesImpl.class, primaryKey);

			if (ncraApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraApplicationStages);
		}
		catch (NoSuchNcraApplicationStagesException noSuchEntityException) {
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
	protected NcraApplicationStages removeImpl(
		NcraApplicationStages ncraApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraApplicationStages)) {
				ncraApplicationStages = (NcraApplicationStages)session.get(
					NcraApplicationStagesImpl.class,
					ncraApplicationStages.getPrimaryKeyObj());
			}

			if (ncraApplicationStages != null) {
				session.delete(ncraApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraApplicationStages != null) {
			clearCache(ncraApplicationStages);
		}

		return ncraApplicationStages;
	}

	@Override
	public NcraApplicationStages updateImpl(
		NcraApplicationStages ncraApplicationStages) {

		boolean isNew = ncraApplicationStages.isNew();

		if (!(ncraApplicationStages instanceof
				NcraApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncraApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraApplicationStages implementation " +
					ncraApplicationStages.getClass());
		}

		NcraApplicationStagesModelImpl ncraApplicationStagesModelImpl =
			(NcraApplicationStagesModelImpl)ncraApplicationStages;

		if (Validator.isNull(ncraApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ncraApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraApplicationStages.setCreateDate(date);
			}
			else {
				ncraApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraApplicationStages.setModifiedDate(date);
			}
			else {
				ncraApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraApplicationStages);
			}
			else {
				ncraApplicationStages = (NcraApplicationStages)session.merge(
					ncraApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraApplicationStagesImpl.class, ncraApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(ncraApplicationStagesModelImpl);

		if (isNew) {
			ncraApplicationStages.setNew(false);
		}

		ncraApplicationStages.resetOriginalValues();

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra application stages
	 * @return the ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcraApplicationStagesException {

		NcraApplicationStages ncraApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (ncraApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraApplicationStages;
	}

	/**
	 * Returns the ncra application stages with the primary key or throws a <code>NoSuchNcraApplicationStagesException</code> if it could not be found.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages
	 * @throws NoSuchNcraApplicationStagesException if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages findByPrimaryKey(long ncraApplciationStage)
		throws NoSuchNcraApplicationStagesException {

		return findByPrimaryKey((Serializable)ncraApplciationStage);
	}

	/**
	 * Returns the ncra application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraApplciationStage the primary key of the ncra application stages
	 * @return the ncra application stages, or <code>null</code> if a ncra application stages with the primary key could not be found
	 */
	@Override
	public NcraApplicationStages fetchByPrimaryKey(long ncraApplciationStage) {
		return fetchByPrimaryKey((Serializable)ncraApplciationStage);
	}

	/**
	 * Returns all the ncra application stageses.
	 *
	 * @return the ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @return the range of ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra application stageses
	 * @param end the upper bound of the range of ncra application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra application stageses
	 */
	@Override
	public List<NcraApplicationStages> findAll(
		int start, int end,
		OrderByComparator<NcraApplicationStages> orderByComparator,
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

		List<NcraApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<NcraApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRAAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRAAPPLICATIONSTAGES;

				sql = sql.concat(NcraApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraApplicationStages>)QueryUtil.list(
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
	 * Removes all the ncra application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraApplicationStages ncraApplicationStages : findAll()) {
			remove(ncraApplicationStages);
		}
	}

	/**
	 * Returns the number of ncra application stageses.
	 *
	 * @return the number of ncra application stageses
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
					_SQL_COUNT_NCRAAPPLICATIONSTAGES);

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
		return "ncraApplciationStage";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRAAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra application stages persistence.
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

		_finderPathWithPaginationFindByget_NCRA_AppStage_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByget_NCRA_AppStage_By_CI",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindByget_NCRA_AppStage_By_CI =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findByget_NCRA_AppStage_By_CI",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountByget_NCRA_AppStage_By_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_NCRA_AppStage_By_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchByget_NCRA_AppStage_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_NCRA_AppStage_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountByget_NCRA_AppStage_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_NCRA_AppStage_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindByget_NCRA_By_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByget_NCRA_By_SN",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindByget_NCRA_By_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByget_NCRA_By_SN",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountByget_NCRA_By_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByget_NCRA_By_SN",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		_finderPathFetchByget_NCRA_By_Status = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_NCRA_By_Status",
			new String[] {String.class.getName()}, new String[] {"stageStatus"},
			true);

		_finderPathCountByget_NCRA_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_NCRA_By_Status", new String[] {String.class.getName()},
			new String[] {"stageStatus"}, false);

		_finderPathFetchByget_NCRA_By_CI_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_NCRA_By_CI_SN_SS",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountByget_NCRA_By_CI_SN_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_NCRA_By_CI_SN_SS",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchByget_NCRA_By_CI_SN = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_NCRA_By_CI_SN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountByget_NCRA_By_CI_SN = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_NCRA_By_CI_SN",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchByget_NCRA_By_CI_SS = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchByget_NCRA_By_CI_SS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountByget_NCRA_By_CI_SS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByget_NCRA_By_CI_SS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		NcraApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(NcraApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_STAGEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRAAPPLICATIONSTAGES =
		"SELECT ncraApplicationStages FROM NcraApplicationStages ncraApplicationStages";

	private static final String _SQL_SELECT_NCRAAPPLICATIONSTAGES_WHERE =
		"SELECT ncraApplicationStages FROM NcraApplicationStages ncraApplicationStages WHERE ";

	private static final String _SQL_COUNT_NCRAAPPLICATIONSTAGES =
		"SELECT COUNT(ncraApplicationStages) FROM NcraApplicationStages ncraApplicationStages";

	private static final String _SQL_COUNT_NCRAAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(ncraApplicationStages) FROM NcraApplicationStages ncraApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncraApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
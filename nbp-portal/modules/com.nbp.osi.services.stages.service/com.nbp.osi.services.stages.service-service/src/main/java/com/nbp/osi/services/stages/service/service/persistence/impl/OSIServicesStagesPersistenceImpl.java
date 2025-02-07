/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.stages.service.service.persistence.impl;

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

import com.nbp.osi.services.stages.service.exception.NoSuchOSIServicesStagesException;
import com.nbp.osi.services.stages.service.model.OSIServicesStages;
import com.nbp.osi.services.stages.service.model.OSIServicesStagesTable;
import com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesImpl;
import com.nbp.osi.services.stages.service.model.impl.OSIServicesStagesModelImpl;
import com.nbp.osi.services.stages.service.service.persistence.OSIServicesStagesPersistence;
import com.nbp.osi.services.stages.service.service.persistence.OSIServicesStagesUtil;
import com.nbp.osi.services.stages.service.service.persistence.impl.constants.OSI_SERVICE_STAGESPersistenceConstants;

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
 * The persistence implementation for the osi services stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OSIServicesStagesPersistence.class)
public class OSIServicesStagesPersistenceImpl
	extends BasePersistenceImpl<OSIServicesStages>
	implements OSIServicesStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OSIServicesStagesUtil</code> to access the osi services stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OSIServicesStagesImpl.class.getName();

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
	 * Returns all the osi services stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
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

		List<OSIServicesStages> list = null;

		if (useFinderCache) {
			list = (List<OSIServicesStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OSIServicesStages osiServicesStages : list) {
					if (!uuid.equals(osiServicesStages.getUuid())) {
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

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

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
				sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OSIServicesStages>)QueryUtil.list(
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
	 * Returns the first osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findByUuid_First(
			String uuid, OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchByUuid_First(
		String uuid, OrderByComparator<OSIServicesStages> orderByComparator) {

		List<OSIServicesStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findByUuid_Last(
			String uuid, OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchByUuid_Last(
		String uuid, OrderByComparator<OSIServicesStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OSIServicesStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages[] findByUuid_PrevAndNext(
			long osiServicesStagesId, String uuid,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		uuid = Objects.toString(uuid, "");

		OSIServicesStages osiServicesStages = findByPrimaryKey(
			osiServicesStagesId);

		Session session = null;

		try {
			session = openSession();

			OSIServicesStages[] array = new OSIServicesStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesStages, uuid, orderByComparator, true);

			array[1] = osiServicesStages;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesStages, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OSIServicesStages getByUuid_PrevAndNext(
		Session session, OSIServicesStages osiServicesStages, String uuid,
		OrderByComparator<OSIServicesStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

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
			sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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
						osiServicesStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OSIServicesStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OSIServicesStages osiServicesStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesStages);
		}
	}

	/**
	 * Returns the number of osi services stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

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
		"osiServicesStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesStages.uuid IS NULL OR osiServicesStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findByUUID_G(String uuid, long groupId)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchByUUID_G(uuid, groupId);

		if (osiServicesStages == null) {
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

			throw new NoSuchOSIServicesStagesException(sb.toString());
		}

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchByUUID_G(
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

		if (result instanceof OSIServicesStages) {
			OSIServicesStages osiServicesStages = (OSIServicesStages)result;

			if (!Objects.equals(uuid, osiServicesStages.getUuid()) ||
				(groupId != osiServicesStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

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

				List<OSIServicesStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OSIServicesStages osiServicesStages = list.get(0);

					result = osiServicesStages;

					cacheResult(osiServicesStages);
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
			return (OSIServicesStages)result;
		}
	}

	/**
	 * Removes the osi services stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services stages that was removed
	 */
	@Override
	public OSIServicesStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = findByUUID_G(uuid, groupId);

		return remove(osiServicesStages);
	}

	/**
	 * Returns the number of osi services stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

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
		"osiServicesStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesStages.uuid IS NULL OR osiServicesStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
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

		List<OSIServicesStages> list = null;

		if (useFinderCache) {
			list = (List<OSIServicesStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OSIServicesStages osiServicesStages : list) {
					if (!uuid.equals(osiServicesStages.getUuid()) ||
						(companyId != osiServicesStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

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
				sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OSIServicesStages>)QueryUtil.list(
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
	 * Returns the first osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the first osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		List<OSIServicesStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the last osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OSIServicesStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages[] findByUuid_C_PrevAndNext(
			long osiServicesStagesId, String uuid, long companyId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		uuid = Objects.toString(uuid, "");

		OSIServicesStages osiServicesStages = findByPrimaryKey(
			osiServicesStagesId);

		Session session = null;

		try {
			session = openSession();

			OSIServicesStages[] array = new OSIServicesStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesStages, uuid, companyId, orderByComparator,
				true);

			array[1] = osiServicesStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesStages, uuid, companyId, orderByComparator,
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

	protected OSIServicesStages getByUuid_C_PrevAndNext(
		Session session, OSIServicesStages osiServicesStages, String uuid,
		long companyId, OrderByComparator<OSIServicesStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

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
			sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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
						osiServicesStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OSIServicesStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OSIServicesStages osiServicesStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiServicesStages);
		}
	}

	/**
	 * Returns the number of osi services stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

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
		"osiServicesStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesStages.uuid IS NULL OR osiServicesStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesStages.companyId = ?";

	private FinderPath _finderPathFetchBygetOSI_Service_OSIID;
	private FinderPath _finderPathCountBygetOSI_Service_OSIID;

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_OSIID(
			long osiServciesApplicationId)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchBygetOSI_Service_OSIID(
			osiServciesApplicationId);

		if (osiServicesStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServciesApplicationId=");
			sb.append(osiServciesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOSIServicesStagesException(sb.toString());
		}

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_OSIID(
		long osiServciesApplicationId) {

		return fetchBygetOSI_Service_OSIID(osiServciesApplicationId, true);
	}

	/**
	 * Returns the osi services stages where osiServciesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_OSIID(
		long osiServciesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServciesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSI_Service_OSIID, finderArgs, this);
		}

		if (result instanceof OSIServicesStages) {
			OSIServicesStages osiServicesStages = (OSIServicesStages)result;

			if (osiServciesApplicationId !=
					osiServicesStages.getOsiServciesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSI_SERVICE_OSIID_OSISERVCIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServciesApplicationId);

				List<OSIServicesStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSI_Service_OSIID, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServciesApplicationId
								};
							}

							_log.warn(
								"OSIServicesStagesPersistenceImpl.fetchBygetOSI_Service_OSIID(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServicesStages osiServicesStages = list.get(0);

					result = osiServicesStages;

					cacheResult(osiServicesStages);
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
			return (OSIServicesStages)result;
		}
	}

	/**
	 * Removes the osi services stages where osiServciesApplicationId = &#63; from the database.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the osi services stages that was removed
	 */
	@Override
	public OSIServicesStages removeBygetOSI_Service_OSIID(
			long osiServciesApplicationId)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = findBygetOSI_Service_OSIID(
			osiServciesApplicationId);

		return remove(osiServicesStages);
	}

	/**
	 * Returns the number of osi services stageses where osiServciesApplicationId = &#63;.
	 *
	 * @param osiServciesApplicationId the osi servcies application ID
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countBygetOSI_Service_OSIID(long osiServciesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOSI_Service_OSIID;

		Object[] finderArgs = new Object[] {osiServciesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSI_SERVICE_OSIID_OSISERVCIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServciesApplicationId);

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
		_FINDER_COLUMN_GETOSI_SERVICE_OSIID_OSISERVCIESAPPLICATIONID_2 =
			"osiServicesStages.osiServciesApplicationId = ?";

	private FinderPath _finderPathFetchBygetOSI_Service_CaseIdStageName;
	private FinderPath _finderPathCountBygetOSI_Service_CaseIdStageName;

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			fetchBygetOSI_Service_CaseIdStageName(caseId, stageName);

		if (osiServicesStages == null) {
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

			throw new NoSuchOSIServicesStagesException(sb.toString());
		}

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetOSI_Service_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageName(
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
				_finderPathFetchBygetOSI_Service_CaseIdStageName, finderArgs,
				this);
		}

		if (result instanceof OSIServicesStages) {
			OSIServicesStages osiServicesStages = (OSIServicesStages)result;

			if (!Objects.equals(caseId, osiServicesStages.getCaseId()) ||
				!Objects.equals(stageName, osiServicesStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_STAGENAME_2);
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

				List<OSIServicesStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSI_Service_CaseIdStageName,
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
								"OSIServicesStagesPersistenceImpl.fetchBygetOSI_Service_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServicesStages osiServicesStages = list.get(0);

					result = osiServicesStages;

					cacheResult(osiServicesStages);
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
			return (OSIServicesStages)result;
		}
	}

	/**
	 * Removes the osi services stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the osi services stages that was removed
	 */
	@Override
	public OSIServicesStages removeBygetOSI_Service_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			findBygetOSI_Service_CaseIdStageName(caseId, stageName);

		return remove(osiServicesStages);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countBygetOSI_Service_CaseIdStageName(
		String caseId, String stageName) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath =
			_finderPathCountBygetOSI_Service_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_CASEID_2 =
			"osiServicesStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_CASEID_3 =
			"(osiServicesStages.caseId IS NULL OR osiServicesStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_STAGENAME_2 =
			"osiServicesStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGENAME_STAGENAME_3 =
			"(osiServicesStages.stageName IS NULL OR osiServicesStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetOSI_Service_StageName;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOSI_Service_StageName;
	private FinderPath _finderPathCountBygetOSI_Service_StageName;

	/**
	 * Returns all the osi services stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName) {

		return findBygetOSI_Service_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end) {

		return findBygetOSI_Service_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return findBygetOSI_Service_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_StageName(
		String stageName, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSI_Service_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOSI_Service_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<OSIServicesStages> list = null;

		if (useFinderCache) {
			list = (List<OSIServicesStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OSIServicesStages osiServicesStages : list) {
					if (!stageName.equals(osiServicesStages.getStageName())) {
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

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OSIServicesStages>)QueryUtil.list(
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
	 * Returns the first osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_StageName_First(
			String stageName,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			fetchBygetOSI_Service_StageName_First(stageName, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the first osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_StageName_First(
		String stageName,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		List<OSIServicesStages> list = findBygetOSI_Service_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_StageName_Last(
			String stageName,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			fetchBygetOSI_Service_StageName_Last(stageName, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the last osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_StageName_Last(
		String stageName,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		int count = countBygetOSI_Service_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<OSIServicesStages> list = findBygetOSI_Service_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where stageName = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages[] findBygetOSI_Service_StageName_PrevAndNext(
			long osiServicesStagesId, String stageName,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		stageName = Objects.toString(stageName, "");

		OSIServicesStages osiServicesStages = findByPrimaryKey(
			osiServicesStagesId);

		Session session = null;

		try {
			session = openSession();

			OSIServicesStages[] array = new OSIServicesStagesImpl[3];

			array[0] = getBygetOSI_Service_StageName_PrevAndNext(
				session, osiServicesStages, stageName, orderByComparator, true);

			array[1] = osiServicesStages;

			array[2] = getBygetOSI_Service_StageName_PrevAndNext(
				session, osiServicesStages, stageName, orderByComparator,
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

	protected OSIServicesStages getBygetOSI_Service_StageName_PrevAndNext(
		Session session, OSIServicesStages osiServicesStages, String stageName,
		OrderByComparator<OSIServicesStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_2);
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
			sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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
						osiServicesStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OSIServicesStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetOSI_Service_StageName(String stageName) {
		for (OSIServicesStages osiServicesStages :
				findBygetOSI_Service_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesStages);
		}
	}

	/**
	 * Returns the number of osi services stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countBygetOSI_Service_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetOSI_Service_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_2);
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
		_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_2 =
			"osiServicesStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_STAGENAME_STAGENAME_3 =
			"(osiServicesStages.stageName IS NULL OR osiServicesStages.stageName = '')";

	private FinderPath _finderPathFetchBygetOSI_Service_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetOSI_Service_CaseIdStageStatus;

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			fetchBygetOSI_Service_CaseIdStageStatus(
				caseId, stageName, stageStatus);

		if (osiServicesStages == null) {
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

			throw new NoSuchOSIServicesStagesException(sb.toString());
		}

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetOSI_Service_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseIdStageStatus(
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
				_finderPathFetchBygetOSI_Service_CaseIdStageStatus, finderArgs,
				this);
		}

		if (result instanceof OSIServicesStages) {
			OSIServicesStages osiServicesStages = (OSIServicesStages)result;

			if (!Objects.equals(caseId, osiServicesStages.getCaseId()) ||
				!Objects.equals(stageName, osiServicesStages.getStageName()) ||
				!Objects.equals(
					stageStatus, osiServicesStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<OSIServicesStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSI_Service_CaseIdStageStatus,
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
								"OSIServicesStagesPersistenceImpl.fetchBygetOSI_Service_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServicesStages osiServicesStages = list.get(0);

					result = osiServicesStages;

					cacheResult(osiServicesStages);
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
			return (OSIServicesStages)result;
		}
	}

	/**
	 * Removes the osi services stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the osi services stages that was removed
	 */
	@Override
	public OSIServicesStages removeBygetOSI_Service_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			findBygetOSI_Service_CaseIdStageStatus(
				caseId, stageName, stageStatus);

		return remove(osiServicesStages);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countBygetOSI_Service_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath =
			_finderPathCountBygetOSI_Service_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_CASEID_2 =
			"osiServicesStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_CASEID_3 =
			"(osiServicesStages.caseId IS NULL OR osiServicesStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGENAME_2 =
			"osiServicesStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(osiServicesStages.stageName IS NULL OR osiServicesStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"osiServicesStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(osiServicesStages.stageStatus IS NULL OR osiServicesStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetOSI_Service_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetOSI_Service_CaseIdAndStatus;

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			fetchBygetOSI_Service_CaseIdAndStatus(caseId, stageStatus);

		if (osiServicesStages == null) {
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

			throw new NoSuchOSIServicesStagesException(sb.toString());
		}

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetOSI_Service_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseIdAndStatus(
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
				_finderPathFetchBygetOSI_Service_CaseIdAndStatus, finderArgs,
				this);
		}

		if (result instanceof OSIServicesStages) {
			OSIServicesStages osiServicesStages = (OSIServicesStages)result;

			if (!Objects.equals(caseId, osiServicesStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, osiServicesStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<OSIServicesStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSI_Service_CaseIdAndStatus,
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
								"OSIServicesStagesPersistenceImpl.fetchBygetOSI_Service_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServicesStages osiServicesStages = list.get(0);

					result = osiServicesStages;

					cacheResult(osiServicesStages);
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
			return (OSIServicesStages)result;
		}
	}

	/**
	 * Removes the osi services stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the osi services stages that was removed
	 */
	@Override
	public OSIServicesStages removeBygetOSI_Service_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			findBygetOSI_Service_CaseIdAndStatus(caseId, stageStatus);

		return remove(osiServicesStages);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countBygetOSI_Service_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath =
			_finderPathCountBygetOSI_Service_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_CASEID_2 =
			"osiServicesStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_CASEID_3 =
			"(osiServicesStages.caseId IS NULL OR osiServicesStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_STAGESTATUS_2 =
			"osiServicesStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(osiServicesStages.stageStatus IS NULL OR osiServicesStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetOSI_Service_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetOSI_Service_CaseId;
	private FinderPath _finderPathCountBygetOSI_Service_CaseId;

	/**
	 * Returns all the osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_CaseId(String caseId) {
		return findBygetOSI_Service_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end) {

		return findBygetOSI_Service_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return findBygetOSI_Service_CaseId(
			caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findBygetOSI_Service_CaseId(
		String caseId, int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSI_Service_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOSI_Service_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<OSIServicesStages> list = null;

		if (useFinderCache) {
			list = (List<OSIServicesStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OSIServicesStages osiServicesStages : list) {
					if (!caseId.equals(osiServicesStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<OSIServicesStages>)QueryUtil.list(
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
	 * Returns the first osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_CaseId_First(
			String caseId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages =
			fetchBygetOSI_Service_CaseId_First(caseId, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the first osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseId_First(
		String caseId, OrderByComparator<OSIServicesStages> orderByComparator) {

		List<OSIServicesStages> list = findBygetOSI_Service_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_CaseId_Last(
			String caseId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchBygetOSI_Service_CaseId_Last(
			caseId, orderByComparator);

		if (osiServicesStages != null) {
			return osiServicesStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchOSIServicesStagesException(sb.toString());
	}

	/**
	 * Returns the last osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_CaseId_Last(
		String caseId, OrderByComparator<OSIServicesStages> orderByComparator) {

		int count = countBygetOSI_Service_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<OSIServicesStages> list = findBygetOSI_Service_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services stageses before and after the current osi services stages in the ordered set where caseId = &#63;.
	 *
	 * @param osiServicesStagesId the primary key of the current osi services stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages[] findBygetOSI_Service_CaseId_PrevAndNext(
			long osiServicesStagesId, String caseId,
			OrderByComparator<OSIServicesStages> orderByComparator)
		throws NoSuchOSIServicesStagesException {

		caseId = Objects.toString(caseId, "");

		OSIServicesStages osiServicesStages = findByPrimaryKey(
			osiServicesStagesId);

		Session session = null;

		try {
			session = openSession();

			OSIServicesStages[] array = new OSIServicesStagesImpl[3];

			array[0] = getBygetOSI_Service_CaseId_PrevAndNext(
				session, osiServicesStages, caseId, orderByComparator, true);

			array[1] = osiServicesStages;

			array[2] = getBygetOSI_Service_CaseId_PrevAndNext(
				session, osiServicesStages, caseId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected OSIServicesStages getBygetOSI_Service_CaseId_PrevAndNext(
		Session session, OSIServicesStages osiServicesStages, String caseId,
		OrderByComparator<OSIServicesStages> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_2);
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
			sb.append(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
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
						osiServicesStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OSIServicesStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetOSI_Service_CaseId(String caseId) {
		for (OSIServicesStages osiServicesStages :
				findBygetOSI_Service_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesStages);
		}
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countBygetOSI_Service_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSI_Service_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_2 =
		"osiServicesStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSI_SERVICE_CASEID_CASEID_3 =
		"(osiServicesStages.caseId IS NULL OR osiServicesStages.caseId = '')";

	private FinderPath _finderPathFetchBygetOSI_Service_By_CaseId;
	private FinderPath _finderPathCountBygetOSI_Service_By_CaseId;

	/**
	 * Returns the osi services stages where caseId = &#63; or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stages
	 * @throws NoSuchOSIServicesStagesException if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages findBygetOSI_Service_By_CaseId(String caseId)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchBygetOSI_Service_By_CaseId(
			caseId);

		if (osiServicesStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOSIServicesStagesException(sb.toString());
		}

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_By_CaseId(String caseId) {
		return fetchBygetOSI_Service_By_CaseId(caseId, true);
	}

	/**
	 * Returns the osi services stages where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services stages, or <code>null</code> if a matching osi services stages could not be found
	 */
	@Override
	public OSIServicesStages fetchBygetOSI_Service_By_CaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSI_Service_By_CaseId, finderArgs, this);
		}

		if (result instanceof OSIServicesStages) {
			OSIServicesStages osiServicesStages = (OSIServicesStages)result;

			if (!Objects.equals(caseId, osiServicesStages.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_BY_CASEID_CASEID_2);
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

				List<OSIServicesStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSI_Service_By_CaseId,
							finderArgs, list);
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
								"OSIServicesStagesPersistenceImpl.fetchBygetOSI_Service_By_CaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OSIServicesStages osiServicesStages = list.get(0);

					result = osiServicesStages;

					cacheResult(osiServicesStages);
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
			return (OSIServicesStages)result;
		}
	}

	/**
	 * Removes the osi services stages where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services stages that was removed
	 */
	@Override
	public OSIServicesStages removeBygetOSI_Service_By_CaseId(String caseId)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = findBygetOSI_Service_By_CaseId(
			caseId);

		return remove(osiServicesStages);
	}

	/**
	 * Returns the number of osi services stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services stageses
	 */
	@Override
	public int countBygetOSI_Service_By_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSI_Service_By_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_BY_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSI_SERVICE_BY_CASEID_CASEID_2);
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
		_FINDER_COLUMN_GETOSI_SERVICE_BY_CASEID_CASEID_2 =
			"osiServicesStages.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETOSI_SERVICE_BY_CASEID_CASEID_3 =
			"(osiServicesStages.caseId IS NULL OR osiServicesStages.caseId = '')";

	public OSIServicesStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OSIServicesStages.class);

		setModelImplClass(OSIServicesStagesImpl.class);
		setModelPKClass(long.class);

		setTable(OSIServicesStagesTable.INSTANCE);
	}

	/**
	 * Caches the osi services stages in the entity cache if it is enabled.
	 *
	 * @param osiServicesStages the osi services stages
	 */
	@Override
	public void cacheResult(OSIServicesStages osiServicesStages) {
		entityCache.putResult(
			OSIServicesStagesImpl.class, osiServicesStages.getPrimaryKey(),
			osiServicesStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesStages.getUuid(), osiServicesStages.getGroupId()
			},
			osiServicesStages);

		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_OSIID,
			new Object[] {osiServicesStages.getOsiServciesApplicationId()},
			osiServicesStages);

		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_CaseIdStageName,
			new Object[] {
				osiServicesStages.getCaseId(), osiServicesStages.getStageName()
			},
			osiServicesStages);

		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_CaseIdStageStatus,
			new Object[] {
				osiServicesStages.getCaseId(), osiServicesStages.getStageName(),
				osiServicesStages.getStageStatus()
			},
			osiServicesStages);

		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_CaseIdAndStatus,
			new Object[] {
				osiServicesStages.getCaseId(),
				osiServicesStages.getStageStatus()
			},
			osiServicesStages);

		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_By_CaseId,
			new Object[] {osiServicesStages.getCaseId()}, osiServicesStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services stageses in the entity cache if it is enabled.
	 *
	 * @param osiServicesStageses the osi services stageses
	 */
	@Override
	public void cacheResult(List<OSIServicesStages> osiServicesStageses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OSIServicesStages osiServicesStages : osiServicesStageses) {
			if (entityCache.getResult(
					OSIServicesStagesImpl.class,
					osiServicesStages.getPrimaryKey()) == null) {

				cacheResult(osiServicesStages);
			}
		}
	}

	/**
	 * Clears the cache for all osi services stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OSIServicesStagesImpl.class);

		finderCache.clearCache(OSIServicesStagesImpl.class);
	}

	/**
	 * Clears the cache for the osi services stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OSIServicesStages osiServicesStages) {
		entityCache.removeResult(
			OSIServicesStagesImpl.class, osiServicesStages);
	}

	@Override
	public void clearCache(List<OSIServicesStages> osiServicesStageses) {
		for (OSIServicesStages osiServicesStages : osiServicesStageses) {
			entityCache.removeResult(
				OSIServicesStagesImpl.class, osiServicesStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OSIServicesStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(OSIServicesStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OSIServicesStagesModelImpl osiServicesStagesModelImpl) {

		Object[] args = new Object[] {
			osiServicesStagesModelImpl.getUuid(),
			osiServicesStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, osiServicesStagesModelImpl);

		args = new Object[] {
			osiServicesStagesModelImpl.getOsiServciesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSI_Service_OSIID, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_OSIID, args,
			osiServicesStagesModelImpl);

		args = new Object[] {
			osiServicesStagesModelImpl.getCaseId(),
			osiServicesStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetOSI_Service_CaseIdStageName, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_CaseIdStageName, args,
			osiServicesStagesModelImpl);

		args = new Object[] {
			osiServicesStagesModelImpl.getCaseId(),
			osiServicesStagesModelImpl.getStageName(),
			osiServicesStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetOSI_Service_CaseIdStageStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_CaseIdStageStatus, args,
			osiServicesStagesModelImpl);

		args = new Object[] {
			osiServicesStagesModelImpl.getCaseId(),
			osiServicesStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetOSI_Service_CaseIdAndStatus, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_CaseIdAndStatus, args,
			osiServicesStagesModelImpl);

		args = new Object[] {osiServicesStagesModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetOSI_Service_By_CaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSI_Service_By_CaseId, args,
			osiServicesStagesModelImpl);
	}

	/**
	 * Creates a new osi services stages with the primary key. Does not add the osi services stages to the database.
	 *
	 * @param osiServicesStagesId the primary key for the new osi services stages
	 * @return the new osi services stages
	 */
	@Override
	public OSIServicesStages create(long osiServicesStagesId) {
		OSIServicesStages osiServicesStages = new OSIServicesStagesImpl();

		osiServicesStages.setNew(true);
		osiServicesStages.setPrimaryKey(osiServicesStagesId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesStages.setUuid(uuid);

		osiServicesStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiServicesStages;
	}

	/**
	 * Removes the osi services stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages that was removed
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages remove(long osiServicesStagesId)
		throws NoSuchOSIServicesStagesException {

		return remove((Serializable)osiServicesStagesId);
	}

	/**
	 * Removes the osi services stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services stages
	 * @return the osi services stages that was removed
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages remove(Serializable primaryKey)
		throws NoSuchOSIServicesStagesException {

		Session session = null;

		try {
			session = openSession();

			OSIServicesStages osiServicesStages =
				(OSIServicesStages)session.get(
					OSIServicesStagesImpl.class, primaryKey);

			if (osiServicesStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOSIServicesStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesStages);
		}
		catch (NoSuchOSIServicesStagesException noSuchEntityException) {
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
	protected OSIServicesStages removeImpl(
		OSIServicesStages osiServicesStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesStages)) {
				osiServicesStages = (OSIServicesStages)session.get(
					OSIServicesStagesImpl.class,
					osiServicesStages.getPrimaryKeyObj());
			}

			if (osiServicesStages != null) {
				session.delete(osiServicesStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesStages != null) {
			clearCache(osiServicesStages);
		}

		return osiServicesStages;
	}

	@Override
	public OSIServicesStages updateImpl(OSIServicesStages osiServicesStages) {
		boolean isNew = osiServicesStages.isNew();

		if (!(osiServicesStages instanceof OSIServicesStagesModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServicesStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OSIServicesStages implementation " +
					osiServicesStages.getClass());
		}

		OSIServicesStagesModelImpl osiServicesStagesModelImpl =
			(OSIServicesStagesModelImpl)osiServicesStages;

		if (Validator.isNull(osiServicesStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			osiServicesStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServicesStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServicesStages.setCreateDate(date);
			}
			else {
				osiServicesStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServicesStages.setModifiedDate(date);
			}
			else {
				osiServicesStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesStages);
			}
			else {
				osiServicesStages = (OSIServicesStages)session.merge(
					osiServicesStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OSIServicesStagesImpl.class, osiServicesStagesModelImpl, false,
			true);

		cacheUniqueFindersCache(osiServicesStagesModelImpl);

		if (isNew) {
			osiServicesStages.setNew(false);
		}

		osiServicesStages.resetOriginalValues();

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services stages
	 * @return the osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOSIServicesStagesException {

		OSIServicesStages osiServicesStages = fetchByPrimaryKey(primaryKey);

		if (osiServicesStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOSIServicesStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesStages;
	}

	/**
	 * Returns the osi services stages with the primary key or throws a <code>NoSuchOSIServicesStagesException</code> if it could not be found.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages
	 * @throws NoSuchOSIServicesStagesException if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages findByPrimaryKey(long osiServicesStagesId)
		throws NoSuchOSIServicesStagesException {

		return findByPrimaryKey((Serializable)osiServicesStagesId);
	}

	/**
	 * Returns the osi services stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesStagesId the primary key of the osi services stages
	 * @return the osi services stages, or <code>null</code> if a osi services stages with the primary key could not be found
	 */
	@Override
	public OSIServicesStages fetchByPrimaryKey(long osiServicesStagesId) {
		return fetchByPrimaryKey((Serializable)osiServicesStagesId);
	}

	/**
	 * Returns all the osi services stageses.
	 *
	 * @return the osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @return the range of osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findAll(
		int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OSIServicesStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services stageses
	 * @param end the upper bound of the range of osi services stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services stageses
	 */
	@Override
	public List<OSIServicesStages> findAll(
		int start, int end,
		OrderByComparator<OSIServicesStages> orderByComparator,
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

		List<OSIServicesStages> list = null;

		if (useFinderCache) {
			list = (List<OSIServicesStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESSTAGES;

				sql = sql.concat(OSIServicesStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OSIServicesStages>)QueryUtil.list(
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
	 * Removes all the osi services stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OSIServicesStages osiServicesStages : findAll()) {
			remove(osiServicesStages);
		}
	}

	/**
	 * Returns the number of osi services stageses.
	 *
	 * @return the number of osi services stageses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_OSISERVICESSTAGES);

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
		return "osiServicesStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OSIServicesStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services stages persistence.
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

		_finderPathFetchBygetOSI_Service_OSIID = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSI_Service_OSIID",
			new String[] {Long.class.getName()},
			new String[] {"osiServciesApplicationId"}, true);

		_finderPathCountBygetOSI_Service_OSIID = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_Service_OSIID", new String[] {Long.class.getName()},
			new String[] {"osiServciesApplicationId"}, false);

		_finderPathFetchBygetOSI_Service_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSI_Service_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetOSI_Service_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_Service_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetOSI_Service_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOSI_Service_StageName",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetOSI_Service_StageName =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOSI_Service_StageName",
				new String[] {String.class.getName()},
				new String[] {"stageName"}, true);

		_finderPathCountBygetOSI_Service_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_Service_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			false);

		_finderPathFetchBygetOSI_Service_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSI_Service_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetOSI_Service_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_Service_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetOSI_Service_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSI_Service_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetOSI_Service_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_Service_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetOSI_Service_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetOSI_Service_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetOSI_Service_CaseId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOSI_Service_CaseId",
				new String[] {String.class.getName()}, new String[] {"caseId"},
				true);

		_finderPathCountBygetOSI_Service_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_Service_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathFetchBygetOSI_Service_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSI_Service_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOSI_Service_By_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSI_Service_By_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		OSIServicesStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OSIServicesStagesUtil.setPersistence(null);

		entityCache.removeCache(OSIServicesStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICE_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSISERVICESSTAGES =
		"SELECT osiServicesStages FROM OSIServicesStages osiServicesStages";

	private static final String _SQL_SELECT_OSISERVICESSTAGES_WHERE =
		"SELECT osiServicesStages FROM OSIServicesStages osiServicesStages WHERE ";

	private static final String _SQL_COUNT_OSISERVICESSTAGES =
		"SELECT COUNT(osiServicesStages) FROM OSIServicesStages osiServicesStages";

	private static final String _SQL_COUNT_OSISERVICESSTAGES_WHERE =
		"SELECT COUNT(osiServicesStages) FROM OSIServicesStages osiServicesStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "osiServicesStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OSIServicesStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OSIServicesStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OSIServicesStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
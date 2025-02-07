/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.stages.services.service.persistence.impl;

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

import com.nbp.creative.stages.services.exception.NoSuchCreativeApplicationStagesException;
import com.nbp.creative.stages.services.model.CreativeApplicationStages;
import com.nbp.creative.stages.services.model.CreativeApplicationStagesTable;
import com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesImpl;
import com.nbp.creative.stages.services.model.impl.CreativeApplicationStagesModelImpl;
import com.nbp.creative.stages.services.service.persistence.CreativeApplicationStagesPersistence;
import com.nbp.creative.stages.services.service.persistence.CreativeApplicationStagesUtil;
import com.nbp.creative.stages.services.service.persistence.impl.constants.CREATIVE_STAGESPersistenceConstants;

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
 * The persistence implementation for the creative application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeApplicationStagesPersistence.class)
public class CreativeApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<CreativeApplicationStages>
	implements CreativeApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeApplicationStagesUtil</code> to access the creative application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeApplicationStagesImpl.class.getName();

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
	 * Returns all the creative application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		List<CreativeApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplicationStages creativeApplicationStages :
						list) {

					if (!uuid.equals(creativeApplicationStages.getUuid())) {
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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
				sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeApplicationStages>)QueryUtil.list(
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
	 * Returns the first creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findByUuid_First(
			String uuid,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages = fetchByUuid_First(
			uuid, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchByUuid_First(
		String uuid,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		List<CreativeApplicationStages> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findByUuid_Last(
			String uuid,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages = fetchByUuid_Last(
			uuid, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchByUuid_Last(
		String uuid,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CreativeApplicationStages> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where uuid = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages[] findByUuid_PrevAndNext(
			long creativeApplicationStagesId, String uuid,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		CreativeApplicationStages creativeApplicationStages = findByPrimaryKey(
			creativeApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplicationStages[] array =
				new CreativeApplicationStagesImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, creativeApplicationStages, uuid, orderByComparator,
				true);

			array[1] = creativeApplicationStages;

			array[2] = getByUuid_PrevAndNext(
				session, creativeApplicationStages, uuid, orderByComparator,
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

	protected CreativeApplicationStages getByUuid_PrevAndNext(
		Session session, CreativeApplicationStages creativeApplicationStages,
		String uuid,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
			sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						creativeApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative application stageses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CreativeApplicationStages creativeApplicationStages :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creativeApplicationStages);
		}
	}

	/**
	 * Returns the number of creative application stageses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
		"creativeApplicationStages.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(creativeApplicationStages.uuid IS NULL OR creativeApplicationStages.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages = fetchByUUID_G(
			uuid, groupId);

		if (creativeApplicationStages == null) {
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

			throw new NoSuchCreativeApplicationStagesException(sb.toString());
		}

		return creativeApplicationStages;
	}

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the creative application stages where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchByUUID_G(
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

		if (result instanceof CreativeApplicationStages) {
			CreativeApplicationStages creativeApplicationStages =
				(CreativeApplicationStages)result;

			if (!Objects.equals(uuid, creativeApplicationStages.getUuid()) ||
				(groupId != creativeApplicationStages.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

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

				List<CreativeApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CreativeApplicationStages creativeApplicationStages =
						list.get(0);

					result = creativeApplicationStages;

					cacheResult(creativeApplicationStages);
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
			return (CreativeApplicationStages)result;
		}
	}

	/**
	 * Removes the creative application stages where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the creative application stages that was removed
	 */
	@Override
	public CreativeApplicationStages removeByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages = findByUUID_G(
			uuid, groupId);

		return remove(creativeApplicationStages);
	}

	/**
	 * Returns the number of creative application stageses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
		"creativeApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(creativeApplicationStages.uuid IS NULL OR creativeApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"creativeApplicationStages.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		List<CreativeApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplicationStages creativeApplicationStages :
						list) {

					if (!uuid.equals(creativeApplicationStages.getUuid()) ||
						(companyId !=
							creativeApplicationStages.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
				sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeApplicationStages>)QueryUtil.list(
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
	 * Returns the first creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchByUuid_C_First(uuid, companyId, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		List<CreativeApplicationStages> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchByUuid_C_Last(uuid, companyId, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CreativeApplicationStages> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages[] findByUuid_C_PrevAndNext(
			long creativeApplicationStagesId, String uuid, long companyId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		uuid = Objects.toString(uuid, "");

		CreativeApplicationStages creativeApplicationStages = findByPrimaryKey(
			creativeApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplicationStages[] array =
				new CreativeApplicationStagesImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, creativeApplicationStages, uuid, companyId,
				orderByComparator, true);

			array[1] = creativeApplicationStages;

			array[2] = getByUuid_C_PrevAndNext(
				session, creativeApplicationStages, uuid, companyId,
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

	protected CreativeApplicationStages getByUuid_C_PrevAndNext(
		Session session, CreativeApplicationStages creativeApplicationStages,
		String uuid, long companyId,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
			sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						creativeApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative application stageses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CreativeApplicationStages creativeApplicationStages :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeApplicationStages);
		}
	}

	/**
	 * Returns the number of creative application stageses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
		"creativeApplicationStages.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(creativeApplicationStages.uuid IS NULL OR creativeApplicationStages.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"creativeApplicationStages.companyId = ?";

	private FinderPath _finderPathFetchBygetCAS_CAI;
	private FinderPath _finderPathCountBygetCAS_CAI;

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_CAI(
			long creativeApplicationId)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages = fetchBygetCAS_CAI(
			creativeApplicationId);

		if (creativeApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("creativeApplicationId=");
			sb.append(creativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeApplicationStagesException(sb.toString());
		}

		return creativeApplicationStages;
	}

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CAI(
		long creativeApplicationId) {

		return fetchBygetCAS_CAI(creativeApplicationId, true);
	}

	/**
	 * Returns the creative application stages where creativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CAI(
		long creativeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {creativeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCAS_CAI, finderArgs, this);
		}

		if (result instanceof CreativeApplicationStages) {
			CreativeApplicationStages creativeApplicationStages =
				(CreativeApplicationStages)result;

			if (creativeApplicationId !=
					creativeApplicationStages.getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETCAS_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(creativeApplicationId);

				List<CreativeApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CAI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									creativeApplicationId
								};
							}

							_log.warn(
								"CreativeApplicationStagesPersistenceImpl.fetchBygetCAS_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplicationStages creativeApplicationStages =
						list.get(0);

					result = creativeApplicationStages;

					cacheResult(creativeApplicationStages);
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
			return (CreativeApplicationStages)result;
		}
	}

	/**
	 * Removes the creative application stages where creativeApplicationId = &#63; from the database.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the creative application stages that was removed
	 */
	@Override
	public CreativeApplicationStages removeBygetCAS_CAI(
			long creativeApplicationId)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages = findBygetCAS_CAI(
			creativeApplicationId);

		return remove(creativeApplicationStages);
	}

	/**
	 * Returns the number of creative application stageses where creativeApplicationId = &#63;.
	 *
	 * @param creativeApplicationId the creative application ID
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countBygetCAS_CAI(long creativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCAS_CAI;

		Object[] finderArgs = new Object[] {creativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETCAS_CAI_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(creativeApplicationId);

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
		_FINDER_COLUMN_GETCAS_CAI_CREATIVEAPPLICATIONID_2 =
			"creativeApplicationStages.creativeApplicationId = ?";

	private FinderPath _finderPathFetchBygetCAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetCAS_CaseIdStageName;

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_CaseIdStageName(caseId, stageName);

		if (creativeApplicationStages == null) {
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

			throw new NoSuchCreativeApplicationStagesException(sb.toString());
		}

		return creativeApplicationStages;
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetCAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageName(
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
				_finderPathFetchBygetCAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof CreativeApplicationStages) {
			CreativeApplicationStages creativeApplicationStages =
				(CreativeApplicationStages)result;

			if (!Objects.equals(
					caseId, creativeApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, creativeApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2);
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

				List<CreativeApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CaseIdStageName,
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
								"CreativeApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplicationStages creativeApplicationStages =
						list.get(0);

					result = creativeApplicationStages;

					cacheResult(creativeApplicationStages);
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
			return (CreativeApplicationStages)result;
		}
	}

	/**
	 * Removes the creative application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the creative application stages that was removed
	 */
	@Override
	public CreativeApplicationStages removeBygetCAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			findBygetCAS_CaseIdStageName(caseId, stageName);

		return remove(creativeApplicationStages);
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countBygetCAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_2 =
		"creativeApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_CASEID_3 =
		"(creativeApplicationStages.caseId IS NULL OR creativeApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_2 =
			"creativeApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(creativeApplicationStages.stageName IS NULL OR creativeApplicationStages.stageName = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_StageName;
	private FinderPath _finderPathCountBygetCAS_StageName;

	/**
	 * Returns all the creative application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName) {

		return findBygetCAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end) {

		return findBygetCAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return findBygetCAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<CreativeApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplicationStages creativeApplicationStages :
						list) {

					if (!stageName.equals(
							creativeApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeApplicationStages>)QueryUtil.list(
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
	 * Returns the first creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_StageName_First(
			String stageName,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_StageName_First(stageName, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_StageName_First(
		String stageName,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		List<CreativeApplicationStages> list = findBygetCAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_StageName_Last(
			String stageName,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_StageName_Last(stageName, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_StageName_Last(
		String stageName,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		int count = countBygetCAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<CreativeApplicationStages> list = findBygetCAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where stageName = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages[] findBygetCAS_StageName_PrevAndNext(
			long creativeApplicationStagesId, String stageName,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		CreativeApplicationStages creativeApplicationStages = findByPrimaryKey(
			creativeApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplicationStages[] array =
				new CreativeApplicationStagesImpl[3];

			array[0] = getBygetCAS_StageName_PrevAndNext(
				session, creativeApplicationStages, stageName,
				orderByComparator, true);

			array[1] = creativeApplicationStages;

			array[2] = getBygetCAS_StageName_PrevAndNext(
				session, creativeApplicationStages, stageName,
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

	protected CreativeApplicationStages getBygetCAS_StageName_PrevAndNext(
		Session session, CreativeApplicationStages creativeApplicationStages,
		String stageName,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2);
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
			sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						creativeApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetCAS_StageName(String stageName) {
		for (CreativeApplicationStages creativeApplicationStages :
				findBygetCAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creativeApplicationStages);
		}
	}

	/**
	 * Returns the number of creative application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countBygetCAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetCAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2);
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

	private static final String _FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_2 =
		"creativeApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETCAS_STAGENAME_STAGENAME_3 =
		"(creativeApplicationStages.stageName IS NULL OR creativeApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetCAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetCAS_CaseIdStageStatus;

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (creativeApplicationStages == null) {
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

			throw new NoSuchCreativeApplicationStagesException(sb.toString());
		}

		return creativeApplicationStages;
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetCAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseIdStageStatus(
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
				_finderPathFetchBygetCAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof CreativeApplicationStages) {
			CreativeApplicationStages creativeApplicationStages =
				(CreativeApplicationStages)result;

			if (!Objects.equals(
					caseId, creativeApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, creativeApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, creativeApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				List<CreativeApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CaseIdStageStatus,
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
								"CreativeApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplicationStages creativeApplicationStages =
						list.get(0);

					result = creativeApplicationStages;

					cacheResult(creativeApplicationStages);
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
			return (CreativeApplicationStages)result;
		}
	}

	/**
	 * Removes the creative application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the creative application stages that was removed
	 */
	@Override
	public CreativeApplicationStages removeBygetCAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			findBygetCAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(creativeApplicationStages);
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countBygetCAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_2 =
			"creativeApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(creativeApplicationStages.caseId IS NULL OR creativeApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"creativeApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(creativeApplicationStages.stageName IS NULL OR creativeApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"creativeApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(creativeApplicationStages.stageStatus IS NULL OR creativeApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetCAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetCAS_CaseIdAndStatus;

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_CaseIdAndStatus(caseId, stageStatus);

		if (creativeApplicationStages == null) {
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

			throw new NoSuchCreativeApplicationStagesException(sb.toString());
		}

		return creativeApplicationStages;
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetCAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the creative application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseIdAndStatus(
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
				_finderPathFetchBygetCAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof CreativeApplicationStages) {
			CreativeApplicationStages creativeApplicationStages =
				(CreativeApplicationStages)result;

			if (!Objects.equals(
					caseId, creativeApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, creativeApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				List<CreativeApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCAS_CaseIdAndStatus,
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
								"CreativeApplicationStagesPersistenceImpl.fetchBygetCAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplicationStages creativeApplicationStages =
						list.get(0);

					result = creativeApplicationStages;

					cacheResult(creativeApplicationStages);
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
			return (CreativeApplicationStages)result;
		}
	}

	/**
	 * Removes the creative application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the creative application stages that was removed
	 */
	@Override
	public CreativeApplicationStages removeBygetCAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			findBygetCAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(creativeApplicationStages);
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countBygetCAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_2 =
		"creativeApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_CASEID_3 =
		"(creativeApplicationStages.caseId IS NULL OR creativeApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"creativeApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETCAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(creativeApplicationStages.stageStatus IS NULL OR creativeApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_SNAndSS;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_SNAndSS;
	private FinderPath _finderPathCountBygetCAS_SNAndSS;

	/**
	 * Returns all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus) {

		return findBygetCAS_SNAndSS(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end) {

		return findBygetCAS_SNAndSS(stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return findBygetCAS_SNAndSS(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_SNAndSS(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCAS_SNAndSS;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCAS_SNAndSS;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<CreativeApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplicationStages creativeApplicationStages :
						list) {

					if (!stageName.equals(
							creativeApplicationStages.getStageName()) ||
						!stageStatus.equals(
							creativeApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeApplicationStages>)QueryUtil.list(
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
	 * Returns the first creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_SNAndSS_First(
			String stageName, String stageStatus,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_SNAndSS_First(
				stageName, stageStatus, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_SNAndSS_First(
		String stageName, String stageStatus,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		List<CreativeApplicationStages> list = findBygetCAS_SNAndSS(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_SNAndSS_Last(
			String stageName, String stageStatus,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_SNAndSS_Last(
				stageName, stageStatus, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_SNAndSS_Last(
		String stageName, String stageStatus,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		int count = countBygetCAS_SNAndSS(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<CreativeApplicationStages> list = findBygetCAS_SNAndSS(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages[] findBygetCAS_SNAndSS_PrevAndNext(
			long creativeApplicationStagesId, String stageName,
			String stageStatus,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		CreativeApplicationStages creativeApplicationStages = findByPrimaryKey(
			creativeApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplicationStages[] array =
				new CreativeApplicationStagesImpl[3];

			array[0] = getBygetCAS_SNAndSS_PrevAndNext(
				session, creativeApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = creativeApplicationStages;

			array[2] = getBygetCAS_SNAndSS_PrevAndNext(
				session, creativeApplicationStages, stageName, stageStatus,
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

	protected CreativeApplicationStages getBygetCAS_SNAndSS_PrevAndNext(
		Session session, CreativeApplicationStages creativeApplicationStages,
		String stageName, String stageStatus,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_2);
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
			sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						creativeApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetCAS_SNAndSS(String stageName, String stageStatus) {
		for (CreativeApplicationStages creativeApplicationStages :
				findBygetCAS_SNAndSS(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(creativeApplicationStages);
		}
	}

	/**
	 * Returns the number of creative application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countBygetCAS_SNAndSS(String stageName, String stageStatus) {
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetCAS_SNAndSS;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_2);
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

	private static final String _FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_2 =
		"creativeApplicationStages.stageName = ? AND ";

	private static final String _FINDER_COLUMN_GETCAS_SNANDSS_STAGENAME_3 =
		"(creativeApplicationStages.stageName IS NULL OR creativeApplicationStages.stageName = '') AND ";

	private static final String _FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_2 =
		"creativeApplicationStages.stageStatus = ?";

	private static final String _FINDER_COLUMN_GETCAS_SNANDSS_STAGESTATUS_3 =
		"(creativeApplicationStages.stageStatus IS NULL OR creativeApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathCountBygetCAS_CaseId;

	/**
	 * Returns all the creative application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_CaseId(String caseId) {
		return findBygetCAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return findBygetCAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return findBygetCAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		List<CreativeApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplicationStages creativeApplicationStages :
						list) {

					if (!caseId.equals(creativeApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
				sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeApplicationStages>)QueryUtil.list(
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
	 * Returns the first creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_CaseId_First(caseId, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		List<CreativeApplicationStages> list = findBygetCAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages =
			fetchBygetCAS_CaseId_Last(caseId, orderByComparator);

		if (creativeApplicationStages != null) {
			return creativeApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchCreativeApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application stages, or <code>null</code> if a matching creative application stages could not be found
	 */
	@Override
	public CreativeApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		int count = countBygetCAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<CreativeApplicationStages> list = findBygetCAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative application stageses before and after the current creative application stages in the ordered set where caseId = &#63;.
	 *
	 * @param creativeApplicationStagesId the primary key of the current creative application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long creativeApplicationStagesId, String caseId,
			OrderByComparator<CreativeApplicationStages> orderByComparator)
		throws NoSuchCreativeApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		CreativeApplicationStages creativeApplicationStages = findByPrimaryKey(
			creativeApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplicationStages[] array =
				new CreativeApplicationStagesImpl[3];

			array[0] = getBygetCAS_CaseId_PrevAndNext(
				session, creativeApplicationStages, caseId, orderByComparator,
				true);

			array[1] = creativeApplicationStages;

			array[2] = getBygetCAS_CaseId_PrevAndNext(
				session, creativeApplicationStages, caseId, orderByComparator,
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

	protected CreativeApplicationStages getBygetCAS_CaseId_PrevAndNext(
		Session session, CreativeApplicationStages creativeApplicationStages,
		String caseId,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
			sb.append(CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
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
						creativeApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCAS_CaseId(String caseId) {
		for (CreativeApplicationStages creativeApplicationStages :
				findBygetCAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creativeApplicationStages);
		}
	}

	/**
	 * Returns the number of creative application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative application stageses
	 */
	@Override
	public int countBygetCAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE);

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
		"creativeApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETCAS_CASEID_CASEID_3 =
		"(creativeApplicationStages.caseId IS NULL OR creativeApplicationStages.caseId = '')";

	public CreativeApplicationStagesPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CreativeApplicationStages.class);

		setModelImplClass(CreativeApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the creative application stages in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationStages the creative application stages
	 */
	@Override
	public void cacheResult(
		CreativeApplicationStages creativeApplicationStages) {

		entityCache.putResult(
			CreativeApplicationStagesImpl.class,
			creativeApplicationStages.getPrimaryKey(),
			creativeApplicationStages);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				creativeApplicationStages.getUuid(),
				creativeApplicationStages.getGroupId()
			},
			creativeApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CAI,
			new Object[] {creativeApplicationStages.getCreativeApplicationId()},
			creativeApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName,
			new Object[] {
				creativeApplicationStages.getCaseId(),
				creativeApplicationStages.getStageName()
			},
			creativeApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageStatus,
			new Object[] {
				creativeApplicationStages.getCaseId(),
				creativeApplicationStages.getStageName(),
				creativeApplicationStages.getStageStatus()
			},
			creativeApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdAndStatus,
			new Object[] {
				creativeApplicationStages.getCaseId(),
				creativeApplicationStages.getStageStatus()
			},
			creativeApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative application stageses in the entity cache if it is enabled.
	 *
	 * @param creativeApplicationStageses the creative application stageses
	 */
	@Override
	public void cacheResult(
		List<CreativeApplicationStages> creativeApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeApplicationStages creativeApplicationStages :
				creativeApplicationStageses) {

			if (entityCache.getResult(
					CreativeApplicationStagesImpl.class,
					creativeApplicationStages.getPrimaryKey()) == null) {

				cacheResult(creativeApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all creative application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeApplicationStagesImpl.class);

		finderCache.clearCache(CreativeApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the creative application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		CreativeApplicationStages creativeApplicationStages) {

		entityCache.removeResult(
			CreativeApplicationStagesImpl.class, creativeApplicationStages);
	}

	@Override
	public void clearCache(
		List<CreativeApplicationStages> creativeApplicationStageses) {

		for (CreativeApplicationStages creativeApplicationStages :
				creativeApplicationStageses) {

			entityCache.removeResult(
				CreativeApplicationStagesImpl.class, creativeApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CreativeApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeApplicationStagesModelImpl creativeApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			creativeApplicationStagesModelImpl.getUuid(),
			creativeApplicationStagesModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, creativeApplicationStagesModelImpl);

		args = new Object[] {
			creativeApplicationStagesModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CAI, args,
			creativeApplicationStagesModelImpl);

		args = new Object[] {
			creativeApplicationStagesModelImpl.getCaseId(),
			creativeApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageName, args,
			creativeApplicationStagesModelImpl);

		args = new Object[] {
			creativeApplicationStagesModelImpl.getCaseId(),
			creativeApplicationStagesModelImpl.getStageName(),
			creativeApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdStageStatus, args,
			creativeApplicationStagesModelImpl);

		args = new Object[] {
			creativeApplicationStagesModelImpl.getCaseId(),
			creativeApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetCAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCAS_CaseIdAndStatus, args,
			creativeApplicationStagesModelImpl);
	}

	/**
	 * Creates a new creative application stages with the primary key. Does not add the creative application stages to the database.
	 *
	 * @param creativeApplicationStagesId the primary key for the new creative application stages
	 * @return the new creative application stages
	 */
	@Override
	public CreativeApplicationStages create(long creativeApplicationStagesId) {
		CreativeApplicationStages creativeApplicationStages =
			new CreativeApplicationStagesImpl();

		creativeApplicationStages.setNew(true);
		creativeApplicationStages.setPrimaryKey(creativeApplicationStagesId);

		String uuid = PortalUUIDUtil.generate();

		creativeApplicationStages.setUuid(uuid);

		creativeApplicationStages.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return creativeApplicationStages;
	}

	/**
	 * Removes the creative application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages that was removed
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages remove(long creativeApplicationStagesId)
		throws NoSuchCreativeApplicationStagesException {

		return remove((Serializable)creativeApplicationStagesId);
	}

	/**
	 * Removes the creative application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative application stages
	 * @return the creative application stages that was removed
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages remove(Serializable primaryKey)
		throws NoSuchCreativeApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			CreativeApplicationStages creativeApplicationStages =
				(CreativeApplicationStages)session.get(
					CreativeApplicationStagesImpl.class, primaryKey);

			if (creativeApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeApplicationStages);
		}
		catch (NoSuchCreativeApplicationStagesException noSuchEntityException) {
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
	protected CreativeApplicationStages removeImpl(
		CreativeApplicationStages creativeApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeApplicationStages)) {
				creativeApplicationStages =
					(CreativeApplicationStages)session.get(
						CreativeApplicationStagesImpl.class,
						creativeApplicationStages.getPrimaryKeyObj());
			}

			if (creativeApplicationStages != null) {
				session.delete(creativeApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeApplicationStages != null) {
			clearCache(creativeApplicationStages);
		}

		return creativeApplicationStages;
	}

	@Override
	public CreativeApplicationStages updateImpl(
		CreativeApplicationStages creativeApplicationStages) {

		boolean isNew = creativeApplicationStages.isNew();

		if (!(creativeApplicationStages instanceof
				CreativeApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativeApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeApplicationStages implementation " +
					creativeApplicationStages.getClass());
		}

		CreativeApplicationStagesModelImpl creativeApplicationStagesModelImpl =
			(CreativeApplicationStagesModelImpl)creativeApplicationStages;

		if (Validator.isNull(creativeApplicationStages.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			creativeApplicationStages.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeApplicationStages.setCreateDate(date);
			}
			else {
				creativeApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeApplicationStages.setModifiedDate(date);
			}
			else {
				creativeApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeApplicationStages);
			}
			else {
				creativeApplicationStages =
					(CreativeApplicationStages)session.merge(
						creativeApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeApplicationStagesImpl.class,
			creativeApplicationStagesModelImpl, false, true);

		cacheUniqueFindersCache(creativeApplicationStagesModelImpl);

		if (isNew) {
			creativeApplicationStages.setNew(false);
		}

		creativeApplicationStages.resetOriginalValues();

		return creativeApplicationStages;
	}

	/**
	 * Returns the creative application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative application stages
	 * @return the creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativeApplicationStagesException {

		CreativeApplicationStages creativeApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (creativeApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeApplicationStages;
	}

	/**
	 * Returns the creative application stages with the primary key or throws a <code>NoSuchCreativeApplicationStagesException</code> if it could not be found.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages
	 * @throws NoSuchCreativeApplicationStagesException if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages findByPrimaryKey(
			long creativeApplicationStagesId)
		throws NoSuchCreativeApplicationStagesException {

		return findByPrimaryKey((Serializable)creativeApplicationStagesId);
	}

	/**
	 * Returns the creative application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param creativeApplicationStagesId the primary key of the creative application stages
	 * @return the creative application stages, or <code>null</code> if a creative application stages with the primary key could not be found
	 */
	@Override
	public CreativeApplicationStages fetchByPrimaryKey(
		long creativeApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)creativeApplicationStagesId);
	}

	/**
	 * Returns all the creative application stageses.
	 *
	 * @return the creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @return the range of creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative application stageses
	 * @param end the upper bound of the range of creative application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative application stageses
	 */
	@Override
	public List<CreativeApplicationStages> findAll(
		int start, int end,
		OrderByComparator<CreativeApplicationStages> orderByComparator,
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

		List<CreativeApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEAPPLICATIONSTAGES;

				sql = sql.concat(
					CreativeApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeApplicationStages>)QueryUtil.list(
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
	 * Removes all the creative application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeApplicationStages creativeApplicationStages : findAll()) {
			remove(creativeApplicationStages);
		}
	}

	/**
	 * Returns the number of creative application stageses.
	 *
	 * @return the number of creative application stageses
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
					_SQL_COUNT_CREATIVEAPPLICATIONSTAGES);

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
		return "creativeApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative application stages persistence.
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

		_finderPathFetchBygetCAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"creativeApplicationId"}, true);

		_finderPathCountBygetCAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"creativeApplicationId"}, false);

		_finderPathFetchBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetCAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathWithPaginationFindBygetCAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetCAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetCAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathFetchBygetCAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetCAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetCAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetCAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetCAS_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCAS_SNAndSS",
			new String[] {
				String.class.getName(), String.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetCAS_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCAS_SNAndSS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetCAS_SNAndSS = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCAS_SNAndSS",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

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

		CreativeApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(CreativeApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVE_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEAPPLICATIONSTAGES =
		"SELECT creativeApplicationStages FROM CreativeApplicationStages creativeApplicationStages";

	private static final String _SQL_SELECT_CREATIVEAPPLICATIONSTAGES_WHERE =
		"SELECT creativeApplicationStages FROM CreativeApplicationStages creativeApplicationStages WHERE ";

	private static final String _SQL_COUNT_CREATIVEAPPLICATIONSTAGES =
		"SELECT COUNT(creativeApplicationStages) FROM CreativeApplicationStages creativeApplicationStages";

	private static final String _SQL_COUNT_CREATIVEAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(creativeApplicationStages) FROM CreativeApplicationStages creativeApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"creativeApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeApplicationStagesPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
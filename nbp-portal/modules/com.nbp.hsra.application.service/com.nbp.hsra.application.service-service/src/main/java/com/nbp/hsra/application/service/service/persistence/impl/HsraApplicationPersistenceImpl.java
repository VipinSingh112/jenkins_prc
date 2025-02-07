/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchHsraApplicationException;
import com.nbp.hsra.application.service.model.HsraApplication;
import com.nbp.hsra.application.service.model.HsraApplicationTable;
import com.nbp.hsra.application.service.model.impl.HsraApplicationImpl;
import com.nbp.hsra.application.service.model.impl.HsraApplicationModelImpl;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationPersistence;
import com.nbp.hsra.application.service.service.persistence.HsraApplicationUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the hsra application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = HsraApplicationPersistence.class)
public class HsraApplicationPersistenceImpl
	extends BasePersistenceImpl<HsraApplication>
	implements HsraApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>HsraApplicationUtil</code> to access the hsra application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		HsraApplicationImpl.class.getName();

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
	 * Returns all the hsra applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
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

		List<HsraApplication> list = null;

		if (useFinderCache) {
			list = (List<HsraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplication hsraApplication : list) {
					if (!uuid.equals(hsraApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

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
				sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraApplication>)QueryUtil.list(
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
	 * Returns the first hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findByUuid_First(
			String uuid, OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchByUuid_First(
		String uuid, OrderByComparator<HsraApplication> orderByComparator) {

		List<HsraApplication> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findByUuid_Last(
			String uuid, OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchByUuid_Last(
		String uuid, OrderByComparator<HsraApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<HsraApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where uuid = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication[] findByUuid_PrevAndNext(
			long hsraApplicationId, String uuid,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		uuid = Objects.toString(uuid, "");

		HsraApplication hsraApplication = findByPrimaryKey(hsraApplicationId);

		Session session = null;

		try {
			session = openSession();

			HsraApplication[] array = new HsraApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, hsraApplication, uuid, orderByComparator, true);

			array[1] = hsraApplication;

			array[2] = getByUuid_PrevAndNext(
				session, hsraApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HsraApplication getByUuid_PrevAndNext(
		Session session, HsraApplication hsraApplication, String uuid,
		OrderByComparator<HsraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

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
			sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
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
						hsraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (HsraApplication hsraApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplication);
		}
	}

	/**
	 * Returns the number of hsra applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

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
		"hsraApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(hsraApplication.uuid IS NULL OR hsraApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchByUUID_G(uuid, groupId);

		if (hsraApplication == null) {
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

			throw new NoSuchHsraApplicationException(sb.toString());
		}

		return hsraApplication;
	}

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the hsra application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchByUUID_G(
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

		if (result instanceof HsraApplication) {
			HsraApplication hsraApplication = (HsraApplication)result;

			if (!Objects.equals(uuid, hsraApplication.getUuid()) ||
				(groupId != hsraApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

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

				List<HsraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					HsraApplication hsraApplication = list.get(0);

					result = hsraApplication;

					cacheResult(hsraApplication);
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
			return (HsraApplication)result;
		}
	}

	/**
	 * Removes the hsra application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the hsra application that was removed
	 */
	@Override
	public HsraApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = findByUUID_G(uuid, groupId);

		return remove(hsraApplication);
	}

	/**
	 * Returns the number of hsra applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

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
		"hsraApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(hsraApplication.uuid IS NULL OR hsraApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"hsraApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
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

		List<HsraApplication> list = null;

		if (useFinderCache) {
			list = (List<HsraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplication hsraApplication : list) {
					if (!uuid.equals(hsraApplication.getUuid()) ||
						(companyId != hsraApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

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
				sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<HsraApplication>)QueryUtil.list(
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
	 * Returns the first hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the first hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<HsraApplication> orderByComparator) {

		List<HsraApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the last hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<HsraApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<HsraApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication[] findByUuid_C_PrevAndNext(
			long hsraApplicationId, String uuid, long companyId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		uuid = Objects.toString(uuid, "");

		HsraApplication hsraApplication = findByPrimaryKey(hsraApplicationId);

		Session session = null;

		try {
			session = openSession();

			HsraApplication[] array = new HsraApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, hsraApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = hsraApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, hsraApplication, uuid, companyId, orderByComparator,
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

	protected HsraApplication getByUuid_C_PrevAndNext(
		Session session, HsraApplication hsraApplication, String uuid,
		long companyId, OrderByComparator<HsraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

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
			sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
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
						hsraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (HsraApplication hsraApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(hsraApplication);
		}
	}

	/**
	 * Returns the number of hsra applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

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
		"hsraApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(hsraApplication.uuid IS NULL OR hsraApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"hsraApplication.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetHsraByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraByS_U;
	private FinderPath _finderPathCountBygetHsraByS_U;

	/**
	 * Returns all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByS_U(long userId, int status) {
		return findBygetHsraByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end) {

		return findBygetHsraByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return findBygetHsraByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<HsraApplication> list = null;

		if (useFinderCache) {
			list = (List<HsraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplication hsraApplication : list) {
					if ((userId != hsraApplication.getUserId()) ||
						(status != hsraApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETHSRABYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<HsraApplication>)QueryUtil.list(
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
	 * Returns the first hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByS_U_First(
			long userId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByS_U_First(
			userId, status, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the first hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByS_U_First(
		long userId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		List<HsraApplication> list = findBygetHsraByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByS_U_Last(
			long userId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByS_U_Last(
			userId, status, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the last hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByS_U_Last(
		long userId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		int count = countBygetHsraByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<HsraApplication> list = findBygetHsraByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication[] findBygetHsraByS_U_PrevAndNext(
			long hsraApplicationId, long userId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = findByPrimaryKey(hsraApplicationId);

		Session session = null;

		try {
			session = openSession();

			HsraApplication[] array = new HsraApplicationImpl[3];

			array[0] = getBygetHsraByS_U_PrevAndNext(
				session, hsraApplication, userId, status, orderByComparator,
				true);

			array[1] = hsraApplication;

			array[2] = getBygetHsraByS_U_PrevAndNext(
				session, hsraApplication, userId, status, orderByComparator,
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

	protected HsraApplication getBygetHsraByS_U_PrevAndNext(
		Session session, HsraApplication hsraApplication, long userId,
		int status, OrderByComparator<HsraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETHSRABYS_U_STATUS_2);

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
			sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetHsraByS_U(long userId, int status) {
		for (HsraApplication hsraApplication :
				findBygetHsraByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(hsraApplication);
		}
	}

	/**
	 * Returns the number of hsra applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetHsraByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETHSRABYS_U_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

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

	private static final String _FINDER_COLUMN_GETHSRABYS_U_USERID_2 =
		"hsraApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETHSRABYS_U_STATUS_2 =
		"hsraApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetHsraByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraByStatus;
	private FinderPath _finderPathCountBygetHsraByStatus;

	/**
	 * Returns all the hsra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByStatus(int status) {
		return findBygetHsraByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end) {

		return findBygetHsraByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return findBygetHsraByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByStatus(
		int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetHsraByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<HsraApplication> list = null;

		if (useFinderCache) {
			list = (List<HsraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplication hsraApplication : list) {
					if (status != hsraApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<HsraApplication>)QueryUtil.list(
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
	 * Returns the first hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByStatus_First(
			int status, OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByStatus_First(
			status, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the first hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByStatus_First(
		int status, OrderByComparator<HsraApplication> orderByComparator) {

		List<HsraApplication> list = findBygetHsraByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByStatus_Last(
			int status, OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByStatus_Last(
			status, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the last hsra application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByStatus_Last(
		int status, OrderByComparator<HsraApplication> orderByComparator) {

		int count = countBygetHsraByStatus(status);

		if (count == 0) {
			return null;
		}

		List<HsraApplication> list = findBygetHsraByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication[] findBygetHsraByStatus_PrevAndNext(
			long hsraApplicationId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = findByPrimaryKey(hsraApplicationId);

		Session session = null;

		try {
			session = openSession();

			HsraApplication[] array = new HsraApplicationImpl[3];

			array[0] = getBygetHsraByStatus_PrevAndNext(
				session, hsraApplication, status, orderByComparator, true);

			array[1] = hsraApplication;

			array[2] = getBygetHsraByStatus_PrevAndNext(
				session, hsraApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HsraApplication getBygetHsraByStatus_PrevAndNext(
		Session session, HsraApplication hsraApplication, int status,
		OrderByComparator<HsraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETHSRABYSTATUS_STATUS_2);

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
			sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetHsraByStatus(int status) {
		for (HsraApplication hsraApplication :
				findBygetHsraByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplication);
		}
	}

	/**
	 * Returns the number of hsra applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetHsraByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYSTATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

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

	private static final String _FINDER_COLUMN_GETHSRABYSTATUS_STATUS_2 =
		"hsraApplication.status = ?";

	private FinderPath _finderPathFetchBygetHsraByAppNum;
	private FinderPath _finderPathCountBygetHsraByAppNum;

	/**
	 * Returns the hsra application where applicationNumber = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByAppNum(String applicationNumber)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByAppNum(
			applicationNumber);

		if (hsraApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationException(sb.toString());
		}

		return hsraApplication;
	}

	/**
	 * Returns the hsra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByAppNum(String applicationNumber) {
		return fetchBygetHsraByAppNum(applicationNumber, true);
	}

	/**
	 * Returns the hsra application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByAppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraByAppNum, finderArgs, this);
		}

		if (result instanceof HsraApplication) {
			HsraApplication hsraApplication = (HsraApplication)result;

			if (!Objects.equals(
					applicationNumber,
					hsraApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETHSRABYAPPNUM_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<HsraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraByAppNum, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {applicationNumber};
							}

							_log.warn(
								"HsraApplicationPersistenceImpl.fetchBygetHsraByAppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplication hsraApplication = list.get(0);

					result = hsraApplication;

					cacheResult(hsraApplication);
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
			return (HsraApplication)result;
		}
	}

	/**
	 * Removes the hsra application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the hsra application that was removed
	 */
	@Override
	public HsraApplication removeBygetHsraByAppNum(String applicationNumber)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = findBygetHsraByAppNum(
			applicationNumber);

		return remove(hsraApplication);
	}

	/**
	 * Returns the number of hsra applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetHsraByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETHSRABYAPPNUM_APPLICATIONNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
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
		_FINDER_COLUMN_GETHSRABYAPPNUM_APPLICATIONNUMBER_2 =
			"hsraApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETHSRABYAPPNUM_APPLICATIONNUMBER_3 =
			"(hsraApplication.applicationNumber IS NULL OR hsraApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetHsraByCaseId;
	private FinderPath _finderPathCountBygetHsraByCaseId;

	/**
	 * Returns the hsra application where caseId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByCaseId(String caseId)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByCaseId(caseId);

		if (hsraApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationException(sb.toString());
		}

		return hsraApplication;
	}

	/**
	 * Returns the hsra application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByCaseId(String caseId) {
		return fetchBygetHsraByCaseId(caseId, true);
	}

	/**
	 * Returns the hsra application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraByCaseId, finderArgs, this);
		}

		if (result instanceof HsraApplication) {
			HsraApplication hsraApplication = (HsraApplication)result;

			if (!Objects.equals(caseId, hsraApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYCASEID_CASEID_2);
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

				List<HsraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraByCaseId, finderArgs,
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
								"HsraApplicationPersistenceImpl.fetchBygetHsraByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplication hsraApplication = list.get(0);

					result = hsraApplication;

					cacheResult(hsraApplication);
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
			return (HsraApplication)result;
		}
	}

	/**
	 * Removes the hsra application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the hsra application that was removed
	 */
	@Override
	public HsraApplication removeBygetHsraByCaseId(String caseId)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = findBygetHsraByCaseId(caseId);

		return remove(hsraApplication);
	}

	/**
	 * Returns the number of hsra applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHsraByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETHSRABYCASEID_CASEID_2 =
		"hsraApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRABYCASEID_CASEID_3 =
		"(hsraApplication.caseId IS NULL OR hsraApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsraByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetHsraByEntityId;
	private FinderPath _finderPathCountBygetHsraByEntityId;

	/**
	 * Returns all the hsra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId(String entityId) {
		return findBygetHsraByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end) {

		return findBygetHsraByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return findBygetHsraByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId(
		String entityId, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHsraByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetHsraByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<HsraApplication> list = null;

		if (useFinderCache) {
			list = (List<HsraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplication hsraApplication : list) {
					if (!entityId.equals(hsraApplication.getEntityId())) {
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

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				list = (List<HsraApplication>)QueryUtil.list(
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
	 * Returns the first hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByEntityId_First(
			String entityId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByEntityId_First(
			entityId, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByEntityId_First(
		String entityId, OrderByComparator<HsraApplication> orderByComparator) {

		List<HsraApplication> list = findBygetHsraByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByEntityId_Last(
			String entityId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByEntityId_Last(
			entityId, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByEntityId_Last(
		String entityId, OrderByComparator<HsraApplication> orderByComparator) {

		int count = countBygetHsraByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<HsraApplication> list = findBygetHsraByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where entityId = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication[] findBygetHsraByEntityId_PrevAndNext(
			long hsraApplicationId, String entityId,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		entityId = Objects.toString(entityId, "");

		HsraApplication hsraApplication = findByPrimaryKey(hsraApplicationId);

		Session session = null;

		try {
			session = openSession();

			HsraApplication[] array = new HsraApplicationImpl[3];

			array[0] = getBygetHsraByEntityId_PrevAndNext(
				session, hsraApplication, entityId, orderByComparator, true);

			array[1] = hsraApplication;

			array[2] = getBygetHsraByEntityId_PrevAndNext(
				session, hsraApplication, entityId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected HsraApplication getBygetHsraByEntityId_PrevAndNext(
		Session session, HsraApplication hsraApplication, String entityId,
		OrderByComparator<HsraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_2);
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
			sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(entityId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetHsraByEntityId(String entityId) {
		for (HsraApplication hsraApplication :
				findBygetHsraByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(hsraApplication);
		}
	}

	/**
	 * Returns the number of hsra applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetHsraByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
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

	private static final String _FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_2 =
		"hsraApplication.entityId = ?";

	private static final String _FINDER_COLUMN_GETHSRABYENTITYID_ENTITYID_3 =
		"(hsraApplication.entityId IS NULL OR hsraApplication.entityId = '')";

	private FinderPath _finderPathWithPaginationFindBygetHsraByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetHsraByEntityId_Status;
	private FinderPath _finderPathCountBygetHsraByEntityId_Status;

	/**
	 * Returns all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status) {

		return findBygetHsraByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetHsraByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return findBygetHsraByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching hsra applications
	 */
	@Override
	public List<HsraApplication> findBygetHsraByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetHsraByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetHsraByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<HsraApplication> list = null;

		if (useFinderCache) {
			list = (List<HsraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (HsraApplication hsraApplication : list) {
					if (!entityId.equals(hsraApplication.getEntityId()) ||
						(status != hsraApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				queryPos.add(status);

				list = (List<HsraApplication>)QueryUtil.list(
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
	 * Returns the first hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByEntityId_Status_First(
			entityId, status, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the first hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		List<HsraApplication> list = findBygetHsraByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByEntityId_Status_Last(
			entityId, status, orderByComparator);

		if (hsraApplication != null) {
			return hsraApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchHsraApplicationException(sb.toString());
	}

	/**
	 * Returns the last hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<HsraApplication> orderByComparator) {

		int count = countBygetHsraByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<HsraApplication> list = findBygetHsraByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the hsra applications before and after the current hsra application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param hsraApplicationId the primary key of the current hsra application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication[] findBygetHsraByEntityId_Status_PrevAndNext(
			long hsraApplicationId, String entityId, int status,
			OrderByComparator<HsraApplication> orderByComparator)
		throws NoSuchHsraApplicationException {

		entityId = Objects.toString(entityId, "");

		HsraApplication hsraApplication = findByPrimaryKey(hsraApplicationId);

		Session session = null;

		try {
			session = openSession();

			HsraApplication[] array = new HsraApplicationImpl[3];

			array[0] = getBygetHsraByEntityId_Status_PrevAndNext(
				session, hsraApplication, entityId, status, orderByComparator,
				true);

			array[1] = hsraApplication;

			array[2] = getBygetHsraByEntityId_Status_PrevAndNext(
				session, hsraApplication, entityId, status, orderByComparator,
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

	protected HsraApplication getBygetHsraByEntityId_Status_PrevAndNext(
		Session session, HsraApplication hsraApplication, String entityId,
		int status, OrderByComparator<HsraApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_STATUS_2);

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
			sb.append(HsraApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindEntityId) {
			queryPos.add(entityId);
		}

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						hsraApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<HsraApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the hsra applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetHsraByEntityId_Status(String entityId, int status) {
		for (HsraApplication hsraApplication :
				findBygetHsraByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(hsraApplication);
		}
	}

	/**
	 * Returns the number of hsra applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByEntityId_Status(String entityId, int status) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetHsraByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				queryPos.add(status);

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
		_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_2 =
			"hsraApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_ENTITYID_3 =
			"(hsraApplication.entityId IS NULL OR hsraApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRABYENTITYID_STATUS_STATUS_2 =
			"hsraApplication.status = ?";

	private FinderPath _finderPathFetchBygetHsraByEI_CI;
	private FinderPath _finderPathCountBygetHsraByEI_CI;

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByEI_CI(String entityId, String caseId)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByEI_CI(
			entityId, caseId);

		if (hsraApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("entityId=");
			sb.append(entityId);

			sb.append(", caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationException(sb.toString());
		}

		return hsraApplication;
	}

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByEI_CI(
		String entityId, String caseId) {

		return fetchBygetHsraByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the hsra application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByEI_CI(
		String entityId, String caseId, boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {entityId, caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraByEI_CI, finderArgs, this);
		}

		if (result instanceof HsraApplication) {
			HsraApplication hsraApplication = (HsraApplication)result;

			if (!Objects.equals(entityId, hsraApplication.getEntityId()) ||
				!Objects.equals(caseId, hsraApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<HsraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraByEI_CI, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {entityId, caseId};
							}

							_log.warn(
								"HsraApplicationPersistenceImpl.fetchBygetHsraByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplication hsraApplication = list.get(0);

					result = hsraApplication;

					cacheResult(hsraApplication);
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
			return (HsraApplication)result;
		}
	}

	/**
	 * Removes the hsra application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the hsra application that was removed
	 */
	@Override
	public HsraApplication removeBygetHsraByEI_CI(
			String entityId, String caseId)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = findBygetHsraByEI_CI(
			entityId, caseId);

		return remove(hsraApplication);
	}

	/**
	 * Returns the number of hsra applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetHsraByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETHSRABYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindEntityId) {
					queryPos.add(entityId);
				}

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

	private static final String _FINDER_COLUMN_GETHSRABYEI_CI_ENTITYID_2 =
		"hsraApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETHSRABYEI_CI_ENTITYID_3 =
		"(hsraApplication.entityId IS NULL OR hsraApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETHSRABYEI_CI_CASEID_2 =
		"hsraApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETHSRABYEI_CI_CASEID_3 =
		"(hsraApplication.caseId IS NULL OR hsraApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetHsraByRT_AppNo;
	private FinderPath _finderPathCountBygetHsraByRT_AppNo;

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching hsra application
	 * @throws NoSuchHsraApplicationException if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication findBygetHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);

		if (hsraApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfApplicant=");
			sb.append(typeOfApplicant);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchHsraApplicationException(sb.toString());
		}

		return hsraApplication;
	}

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		return fetchBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching hsra application, or <code>null</code> if a matching hsra application could not be found
	 */
	@Override
	public HsraApplication fetchBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfApplicant = Objects.toString(typeOfApplicant, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				typeOfApplicant, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraByRT_AppNo, finderArgs, this);
		}

		if (result instanceof HsraApplication) {
			HsraApplication hsraApplication = (HsraApplication)result;

			if (!Objects.equals(
					typeOfApplicant, hsraApplication.getTypeOfApplicant()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					hsraApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_HSRAAPPLICATION_WHERE);

			boolean bindTypeOfApplicant = false;

			if (typeOfApplicant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYRT_APPNO_TYPEOFAPPLICANT_3);
			}
			else {
				bindTypeOfApplicant = true;

				sb.append(_FINDER_COLUMN_GETHSRABYRT_APPNO_TYPEOFAPPLICANT_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETHSRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfApplicant) {
					queryPos.add(typeOfApplicant);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<HsraApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraByRT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfApplicant, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"HsraApplicationPersistenceImpl.fetchBygetHsraByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					HsraApplication hsraApplication = list.get(0);

					result = hsraApplication;

					cacheResult(hsraApplication);
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
			return (HsraApplication)result;
		}
	}

	/**
	 * Removes the hsra application where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the hsra application that was removed
	 */
	@Override
	public HsraApplication removeBygetHsraByRT_AppNo(
			String typeOfApplicant, String expiredLicenseAppNumber)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = findBygetHsraByRT_AppNo(
			typeOfApplicant, expiredLicenseAppNumber);

		return remove(hsraApplication);
	}

	/**
	 * Returns the number of hsra applications where typeOfApplicant = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfApplicant the type of applicant
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching hsra applications
	 */
	@Override
	public int countBygetHsraByRT_AppNo(
		String typeOfApplicant, String expiredLicenseAppNumber) {

		typeOfApplicant = Objects.toString(typeOfApplicant, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetHsraByRT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfApplicant, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_HSRAAPPLICATION_WHERE);

			boolean bindTypeOfApplicant = false;

			if (typeOfApplicant.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETHSRABYRT_APPNO_TYPEOFAPPLICANT_3);
			}
			else {
				bindTypeOfApplicant = true;

				sb.append(_FINDER_COLUMN_GETHSRABYRT_APPNO_TYPEOFAPPLICANT_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETHSRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETHSRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfApplicant) {
					queryPos.add(typeOfApplicant);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
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
		_FINDER_COLUMN_GETHSRABYRT_APPNO_TYPEOFAPPLICANT_2 =
			"hsraApplication.typeOfApplicant = ? AND ";

	private static final String
		_FINDER_COLUMN_GETHSRABYRT_APPNO_TYPEOFAPPLICANT_3 =
			"(hsraApplication.typeOfApplicant IS NULL OR hsraApplication.typeOfApplicant = '') AND ";

	private static final String
		_FINDER_COLUMN_GETHSRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"hsraApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETHSRABYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(hsraApplication.expiredLicenseAppNumber IS NULL OR hsraApplication.expiredLicenseAppNumber = '')";

	public HsraApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(HsraApplication.class);

		setModelImplClass(HsraApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(HsraApplicationTable.INSTANCE);
	}

	/**
	 * Caches the hsra application in the entity cache if it is enabled.
	 *
	 * @param hsraApplication the hsra application
	 */
	@Override
	public void cacheResult(HsraApplication hsraApplication) {
		entityCache.putResult(
			HsraApplicationImpl.class, hsraApplication.getPrimaryKey(),
			hsraApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				hsraApplication.getUuid(), hsraApplication.getGroupId()
			},
			hsraApplication);

		finderCache.putResult(
			_finderPathFetchBygetHsraByAppNum,
			new Object[] {hsraApplication.getApplicationNumber()},
			hsraApplication);

		finderCache.putResult(
			_finderPathFetchBygetHsraByCaseId,
			new Object[] {hsraApplication.getCaseId()}, hsraApplication);

		finderCache.putResult(
			_finderPathFetchBygetHsraByEI_CI,
			new Object[] {
				hsraApplication.getEntityId(), hsraApplication.getCaseId()
			},
			hsraApplication);

		finderCache.putResult(
			_finderPathFetchBygetHsraByRT_AppNo,
			new Object[] {
				hsraApplication.getTypeOfApplicant(),
				hsraApplication.getExpiredLicenseAppNumber()
			},
			hsraApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the hsra applications in the entity cache if it is enabled.
	 *
	 * @param hsraApplications the hsra applications
	 */
	@Override
	public void cacheResult(List<HsraApplication> hsraApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (hsraApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (HsraApplication hsraApplication : hsraApplications) {
			if (entityCache.getResult(
					HsraApplicationImpl.class,
					hsraApplication.getPrimaryKey()) == null) {

				cacheResult(hsraApplication);
			}
		}
	}

	/**
	 * Clears the cache for all hsra applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(HsraApplicationImpl.class);

		finderCache.clearCache(HsraApplicationImpl.class);
	}

	/**
	 * Clears the cache for the hsra application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(HsraApplication hsraApplication) {
		entityCache.removeResult(HsraApplicationImpl.class, hsraApplication);
	}

	@Override
	public void clearCache(List<HsraApplication> hsraApplications) {
		for (HsraApplication hsraApplication : hsraApplications) {
			entityCache.removeResult(
				HsraApplicationImpl.class, hsraApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(HsraApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(HsraApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		HsraApplicationModelImpl hsraApplicationModelImpl) {

		Object[] args = new Object[] {
			hsraApplicationModelImpl.getUuid(),
			hsraApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, hsraApplicationModelImpl);

		args = new Object[] {hsraApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetHsraByAppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraByAppNum, args, hsraApplicationModelImpl);

		args = new Object[] {hsraApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetHsraByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraByCaseId, args, hsraApplicationModelImpl);

		args = new Object[] {
			hsraApplicationModelImpl.getEntityId(),
			hsraApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraByEI_CI, args, hsraApplicationModelImpl);

		args = new Object[] {
			hsraApplicationModelImpl.getTypeOfApplicant(),
			hsraApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraByRT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraByRT_AppNo, args,
			hsraApplicationModelImpl);
	}

	/**
	 * Creates a new hsra application with the primary key. Does not add the hsra application to the database.
	 *
	 * @param hsraApplicationId the primary key for the new hsra application
	 * @return the new hsra application
	 */
	@Override
	public HsraApplication create(long hsraApplicationId) {
		HsraApplication hsraApplication = new HsraApplicationImpl();

		hsraApplication.setNew(true);
		hsraApplication.setPrimaryKey(hsraApplicationId);

		String uuid = PortalUUIDUtil.generate();

		hsraApplication.setUuid(uuid);

		hsraApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return hsraApplication;
	}

	/**
	 * Removes the hsra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application that was removed
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication remove(long hsraApplicationId)
		throws NoSuchHsraApplicationException {

		return remove((Serializable)hsraApplicationId);
	}

	/**
	 * Removes the hsra application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the hsra application
	 * @return the hsra application that was removed
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication remove(Serializable primaryKey)
		throws NoSuchHsraApplicationException {

		Session session = null;

		try {
			session = openSession();

			HsraApplication hsraApplication = (HsraApplication)session.get(
				HsraApplicationImpl.class, primaryKey);

			if (hsraApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchHsraApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(hsraApplication);
		}
		catch (NoSuchHsraApplicationException noSuchEntityException) {
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
	protected HsraApplication removeImpl(HsraApplication hsraApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(hsraApplication)) {
				hsraApplication = (HsraApplication)session.get(
					HsraApplicationImpl.class,
					hsraApplication.getPrimaryKeyObj());
			}

			if (hsraApplication != null) {
				session.delete(hsraApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (hsraApplication != null) {
			clearCache(hsraApplication);
		}

		return hsraApplication;
	}

	@Override
	public HsraApplication updateImpl(HsraApplication hsraApplication) {
		boolean isNew = hsraApplication.isNew();

		if (!(hsraApplication instanceof HsraApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(hsraApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					hsraApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in hsraApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom HsraApplication implementation " +
					hsraApplication.getClass());
		}

		HsraApplicationModelImpl hsraApplicationModelImpl =
			(HsraApplicationModelImpl)hsraApplication;

		if (Validator.isNull(hsraApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			hsraApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (hsraApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				hsraApplication.setCreateDate(date);
			}
			else {
				hsraApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!hsraApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				hsraApplication.setModifiedDate(date);
			}
			else {
				hsraApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(hsraApplication);
			}
			else {
				hsraApplication = (HsraApplication)session.merge(
					hsraApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			HsraApplicationImpl.class, hsraApplicationModelImpl, false, true);

		cacheUniqueFindersCache(hsraApplicationModelImpl);

		if (isNew) {
			hsraApplication.setNew(false);
		}

		hsraApplication.resetOriginalValues();

		return hsraApplication;
	}

	/**
	 * Returns the hsra application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the hsra application
	 * @return the hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchHsraApplicationException {

		HsraApplication hsraApplication = fetchByPrimaryKey(primaryKey);

		if (hsraApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchHsraApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return hsraApplication;
	}

	/**
	 * Returns the hsra application with the primary key or throws a <code>NoSuchHsraApplicationException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application
	 * @throws NoSuchHsraApplicationException if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication findByPrimaryKey(long hsraApplicationId)
		throws NoSuchHsraApplicationException {

		return findByPrimaryKey((Serializable)hsraApplicationId);
	}

	/**
	 * Returns the hsra application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param hsraApplicationId the primary key of the hsra application
	 * @return the hsra application, or <code>null</code> if a hsra application with the primary key could not be found
	 */
	@Override
	public HsraApplication fetchByPrimaryKey(long hsraApplicationId) {
		return fetchByPrimaryKey((Serializable)hsraApplicationId);
	}

	/**
	 * Returns all the hsra applications.
	 *
	 * @return the hsra applications
	 */
	@Override
	public List<HsraApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @return the range of hsra applications
	 */
	@Override
	public List<HsraApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of hsra applications
	 */
	@Override
	public List<HsraApplication> findAll(
		int start, int end,
		OrderByComparator<HsraApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the hsra applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HsraApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of hsra applications
	 * @param end the upper bound of the range of hsra applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of hsra applications
	 */
	@Override
	public List<HsraApplication> findAll(
		int start, int end,
		OrderByComparator<HsraApplication> orderByComparator,
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

		List<HsraApplication> list = null;

		if (useFinderCache) {
			list = (List<HsraApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_HSRAAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_HSRAAPPLICATION;

				sql = sql.concat(HsraApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<HsraApplication>)QueryUtil.list(
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
	 * Removes all the hsra applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (HsraApplication hsraApplication : findAll()) {
			remove(hsraApplication);
		}
	}

	/**
	 * Returns the number of hsra applications.
	 *
	 * @return the number of hsra applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_HSRAAPPLICATION);

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
		return "hsraApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_HSRAAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return HsraApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the hsra application persistence.
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

		_finderPathWithPaginationFindBygetHsraByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetHsraByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetHsraByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetHsraByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetHsraByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetHsraByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetHsraByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetHsraByAppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetHsraByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetHsraByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetHsraByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetHsraByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetHsraByEntityId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetHsraByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetHsraByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, true);

		_finderPathCountBygetHsraByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsraByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetHsraByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetHsraByEntityId_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetHsraByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetHsraByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetHsraByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsraByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetHsraByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetHsraByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetHsraByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfApplicant", "expiredLicenseAppNumber"}, true);

		_finderPathCountBygetHsraByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetHsraByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfApplicant", "expiredLicenseAppNumber"}, false);

		HsraApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		HsraApplicationUtil.setPersistence(null);

		entityCache.removeCache(HsraApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_HSRAAPPLICATION =
		"SELECT hsraApplication FROM HsraApplication hsraApplication";

	private static final String _SQL_SELECT_HSRAAPPLICATION_WHERE =
		"SELECT hsraApplication FROM HsraApplication hsraApplication WHERE ";

	private static final String _SQL_COUNT_HSRAAPPLICATION =
		"SELECT COUNT(hsraApplication) FROM HsraApplication hsraApplication";

	private static final String _SQL_COUNT_HSRAAPPLICATION_WHERE =
		"SELECT COUNT(hsraApplication) FROM HsraApplication hsraApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "hsraApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No HsraApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No HsraApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		HsraApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
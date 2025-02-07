/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.quary.application.form.service.service.persistence.impl;

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

import com.nbp.quary.application.form.service.exception.NoSuchQuarryApplicationException;
import com.nbp.quary.application.form.service.model.QuarryApplication;
import com.nbp.quary.application.form.service.model.QuarryApplicationTable;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationImpl;
import com.nbp.quary.application.form.service.model.impl.QuarryApplicationModelImpl;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationPersistence;
import com.nbp.quary.application.form.service.service.persistence.QuarryApplicationUtil;
import com.nbp.quary.application.form.service.service.persistence.impl.constants.QUARRY_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the quarry application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = QuarryApplicationPersistence.class)
public class QuarryApplicationPersistenceImpl
	extends BasePersistenceImpl<QuarryApplication>
	implements QuarryApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>QuarryApplicationUtil</code> to access the quarry application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		QuarryApplicationImpl.class.getName();

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
	 * Returns all the quarry applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
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

		List<QuarryApplication> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplication quarryApplication : list) {
					if (!uuid.equals(quarryApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

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
				sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryApplication>)QueryUtil.list(
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
	 * Returns the first quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findByUuid_First(
			String uuid, OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchByUuid_First(
		String uuid, OrderByComparator<QuarryApplication> orderByComparator) {

		List<QuarryApplication> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findByUuid_Last(
			String uuid, OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchByUuid_Last(
		String uuid, OrderByComparator<QuarryApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<QuarryApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where uuid = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication[] findByUuid_PrevAndNext(
			long quarryApplicationId, String uuid,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		uuid = Objects.toString(uuid, "");

		QuarryApplication quarryApplication = findByPrimaryKey(
			quarryApplicationId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplication[] array = new QuarryApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, quarryApplication, uuid, orderByComparator, true);

			array[1] = quarryApplication;

			array[2] = getByUuid_PrevAndNext(
				session, quarryApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryApplication getByUuid_PrevAndNext(
		Session session, QuarryApplication quarryApplication, String uuid,
		OrderByComparator<QuarryApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

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
			sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
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
						quarryApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (QuarryApplication quarryApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryApplication);
		}
	}

	/**
	 * Returns the number of quarry applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

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
		"quarryApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(quarryApplication.uuid IS NULL OR quarryApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchByUUID_G(uuid, groupId);

		if (quarryApplication == null) {
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

			throw new NoSuchQuarryApplicationException(sb.toString());
		}

		return quarryApplication;
	}

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the quarry application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchByUUID_G(
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

		if (result instanceof QuarryApplication) {
			QuarryApplication quarryApplication = (QuarryApplication)result;

			if (!Objects.equals(uuid, quarryApplication.getUuid()) ||
				(groupId != quarryApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

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

				List<QuarryApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					QuarryApplication quarryApplication = list.get(0);

					result = quarryApplication;

					cacheResult(quarryApplication);
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
			return (QuarryApplication)result;
		}
	}

	/**
	 * Removes the quarry application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the quarry application that was removed
	 */
	@Override
	public QuarryApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findByUUID_G(uuid, groupId);

		return remove(quarryApplication);
	}

	/**
	 * Returns the number of quarry applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

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
		"quarryApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(quarryApplication.uuid IS NULL OR quarryApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"quarryApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
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

		List<QuarryApplication> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplication quarryApplication : list) {
					if (!uuid.equals(quarryApplication.getUuid()) ||
						(companyId != quarryApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

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
				sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<QuarryApplication>)QueryUtil.list(
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
	 * Returns the first quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the first quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		List<QuarryApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the last quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<QuarryApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication[] findByUuid_C_PrevAndNext(
			long quarryApplicationId, String uuid, long companyId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		uuid = Objects.toString(uuid, "");

		QuarryApplication quarryApplication = findByPrimaryKey(
			quarryApplicationId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplication[] array = new QuarryApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, quarryApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = quarryApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, quarryApplication, uuid, companyId, orderByComparator,
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

	protected QuarryApplication getByUuid_C_PrevAndNext(
		Session session, QuarryApplication quarryApplication, String uuid,
		long companyId, OrderByComparator<QuarryApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

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
			sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
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
						quarryApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (QuarryApplication quarryApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryApplication);
		}
	}

	/**
	 * Returns the number of quarry applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

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
		"quarryApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(quarryApplication.uuid IS NULL OR quarryApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"quarryApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetQuarryById;
	private FinderPath _finderPathCountBygetQuarryById;

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryById(long quarryApplicationId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryById(
			quarryApplicationId);

		if (quarryApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("quarryApplicationId=");
			sb.append(quarryApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationException(sb.toString());
		}

		return quarryApplication;
	}

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryById(long quarryApplicationId) {
		return fetchBygetQuarryById(quarryApplicationId, true);
	}

	/**
	 * Returns the quarry application where quarryApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryById(
		long quarryApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {quarryApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarryById, finderArgs, this);
		}

		if (result instanceof QuarryApplication) {
			QuarryApplication quarryApplication = (QuarryApplication)result;

			if (quarryApplicationId !=
					quarryApplication.getQuarryApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

				List<QuarryApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarryById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {quarryApplicationId};
							}

							_log.warn(
								"QuarryApplicationPersistenceImpl.fetchBygetQuarryById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplication quarryApplication = list.get(0);

					result = quarryApplication;

					cacheResult(quarryApplication);
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
			return (QuarryApplication)result;
		}
	}

	/**
	 * Removes the quarry application where quarryApplicationId = &#63; from the database.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the quarry application that was removed
	 */
	@Override
	public QuarryApplication removeBygetQuarryById(long quarryApplicationId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findBygetQuarryById(
			quarryApplicationId);

		return remove(quarryApplication);
	}

	/**
	 * Returns the number of quarry applications where quarryApplicationId = &#63;.
	 *
	 * @param quarryApplicationId the quarry application ID
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryById(long quarryApplicationId) {
		FinderPath finderPath = _finderPathCountBygetQuarryById;

		Object[] finderArgs = new Object[] {quarryApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(quarryApplicationId);

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
		_FINDER_COLUMN_GETQUARRYBYID_QUARRYAPPLICATIONID_2 =
			"quarryApplication.quarryApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetQuarryByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarryByS_U;
	private FinderPath _finderPathCountBygetQuarryByS_U;

	/**
	 * Returns all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId) {

		return findBygetQuarryByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end) {

		return findBygetQuarryByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return findBygetQuarryByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetQuarryByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarryByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<QuarryApplication> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplication quarryApplication : list) {
					if ((status != quarryApplication.getStatus()) ||
						(userId != quarryApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETQUARRYBYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<QuarryApplication>)QueryUtil.list(
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
	 * Returns the first quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByS_U_First(
			int status, long userId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByS_U_First(
			status, userId, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the first quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByS_U_First(
		int status, long userId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		List<QuarryApplication> list = findBygetQuarryByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByS_U_Last(
			int status, long userId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByS_U_Last(
			status, userId, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByS_U_Last(
		int status, long userId,
		OrderByComparator<QuarryApplication> orderByComparator) {

		int count = countBygetQuarryByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<QuarryApplication> list = findBygetQuarryByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication[] findBygetQuarryByS_U_PrevAndNext(
			long quarryApplicationId, int status, long userId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findByPrimaryKey(
			quarryApplicationId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplication[] array = new QuarryApplicationImpl[3];

			array[0] = getBygetQuarryByS_U_PrevAndNext(
				session, quarryApplication, status, userId, orderByComparator,
				true);

			array[1] = quarryApplication;

			array[2] = getBygetQuarryByS_U_PrevAndNext(
				session, quarryApplication, status, userId, orderByComparator,
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

	protected QuarryApplication getBygetQuarryByS_U_PrevAndNext(
		Session session, QuarryApplication quarryApplication, int status,
		long userId, OrderByComparator<QuarryApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETQUARRYBYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETQUARRYBYS_U_USERID_2);

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
			sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetQuarryByS_U(int status, long userId) {
		for (QuarryApplication quarryApplication :
				findBygetQuarryByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryApplication);
		}
	}

	/**
	 * Returns the number of quarry applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetQuarryByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETQUARRYBYS_U_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

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

	private static final String _FINDER_COLUMN_GETQUARRYBYS_U_STATUS_2 =
		"quarryApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETQUARRYBYS_U_USERID_2 =
		"quarryApplication.userId = ?";

	private FinderPath _finderPathFetchBygetQuarryByCaseId;
	private FinderPath _finderPathCountBygetQuarryByCaseId;

	/**
	 * Returns the quarry application where caseId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByCaseId(String caseId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByCaseId(caseId);

		if (quarryApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationException(sb.toString());
		}

		return quarryApplication;
	}

	/**
	 * Returns the quarry application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByCaseId(String caseId) {
		return fetchBygetQuarryByCaseId(caseId, true);
	}

	/**
	 * Returns the quarry application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarryByCaseId, finderArgs, this);
		}

		if (result instanceof QuarryApplication) {
			QuarryApplication quarryApplication = (QuarryApplication)result;

			if (!Objects.equals(caseId, quarryApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYCASEID_CASEID_2);
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

				List<QuarryApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarryByCaseId, finderArgs,
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
								"QuarryApplicationPersistenceImpl.fetchBygetQuarryByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplication quarryApplication = list.get(0);

					result = quarryApplication;

					cacheResult(quarryApplication);
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
			return (QuarryApplication)result;
		}
	}

	/**
	 * Removes the quarry application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the quarry application that was removed
	 */
	@Override
	public QuarryApplication removeBygetQuarryByCaseId(String caseId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findBygetQuarryByCaseId(caseId);

		return remove(quarryApplication);
	}

	/**
	 * Returns the number of quarry applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarryByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETQUARRYBYCASEID_CASEID_2 =
		"quarryApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRYBYCASEID_CASEID_3 =
		"(quarryApplication.caseId IS NULL OR quarryApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetQuarryByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarryByStatus;
	private FinderPath _finderPathCountBygetQuarryByStatus;

	/**
	 * Returns all the quarry applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByStatus(int status) {
		return findBygetQuarryByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end) {

		return findBygetQuarryByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return findBygetQuarryByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByStatus(
		int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarryByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarryByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<QuarryApplication> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplication quarryApplication : list) {
					if (status != quarryApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<QuarryApplication>)QueryUtil.list(
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
	 * Returns the first quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByStatus_First(
			int status, OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByStatus_First(
			status, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the first quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByStatus_First(
		int status, OrderByComparator<QuarryApplication> orderByComparator) {

		List<QuarryApplication> list = findBygetQuarryByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByStatus_Last(
			int status, OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByStatus_Last(
			status, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the last quarry application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByStatus_Last(
		int status, OrderByComparator<QuarryApplication> orderByComparator) {

		int count = countBygetQuarryByStatus(status);

		if (count == 0) {
			return null;
		}

		List<QuarryApplication> list = findBygetQuarryByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where status = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication[] findBygetQuarryByStatus_PrevAndNext(
			long quarryApplicationId, int status,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findByPrimaryKey(
			quarryApplicationId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplication[] array = new QuarryApplicationImpl[3];

			array[0] = getBygetQuarryByStatus_PrevAndNext(
				session, quarryApplication, status, orderByComparator, true);

			array[1] = quarryApplication;

			array[2] = getBygetQuarryByStatus_PrevAndNext(
				session, quarryApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryApplication getBygetQuarryByStatus_PrevAndNext(
		Session session, QuarryApplication quarryApplication, int status,
		OrderByComparator<QuarryApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETQUARRYBYSTATUS_STATUS_2);

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
			sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
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
						quarryApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetQuarryByStatus(int status) {
		for (QuarryApplication quarryApplication :
				findBygetQuarryByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryApplication);
		}
	}

	/**
	 * Returns the number of quarry applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetQuarryByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETQUARRYBYSTATUS_STATUS_2 =
		"quarryApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetQuarryByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetQuarryByEntityId;
	private FinderPath _finderPathCountBygetQuarryByEntityId;

	/**
	 * Returns all the quarry applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId(long entityId) {
		return findBygetQuarryByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end) {

		return findBygetQuarryByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return findBygetQuarryByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId(
		long entityId, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarryByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetQuarryByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<QuarryApplication> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplication quarryApplication : list) {
					if (entityId != quarryApplication.getEntityId()) {
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

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_ENTITYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

				list = (List<QuarryApplication>)QueryUtil.list(
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
	 * Returns the first quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByEntityId_First(
			long entityId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByEntityId_First(
			entityId, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByEntityId_First(
		long entityId, OrderByComparator<QuarryApplication> orderByComparator) {

		List<QuarryApplication> list = findBygetQuarryByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByEntityId_Last(
			long entityId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByEntityId_Last(
			entityId, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByEntityId_Last(
		long entityId, OrderByComparator<QuarryApplication> orderByComparator) {

		int count = countBygetQuarryByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<QuarryApplication> list = findBygetQuarryByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where entityId = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication[] findBygetQuarryByEntityId_PrevAndNext(
			long quarryApplicationId, long entityId,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findByPrimaryKey(
			quarryApplicationId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplication[] array = new QuarryApplicationImpl[3];

			array[0] = getBygetQuarryByEntityId_PrevAndNext(
				session, quarryApplication, entityId, orderByComparator, true);

			array[1] = quarryApplication;

			array[2] = getBygetQuarryByEntityId_PrevAndNext(
				session, quarryApplication, entityId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected QuarryApplication getBygetQuarryByEntityId_PrevAndNext(
		Session session, QuarryApplication quarryApplication, long entityId,
		OrderByComparator<QuarryApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_ENTITYID_2);

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
			sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(entityId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetQuarryByEntityId(long entityId) {
		for (QuarryApplication quarryApplication :
				findBygetQuarryByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(quarryApplication);
		}
	}

	/**
	 * Returns the number of quarry applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByEntityId(long entityId) {
		FinderPath finderPath = _finderPathCountBygetQuarryByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_ENTITYID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

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

	private static final String _FINDER_COLUMN_GETQUARRYBYENTITYID_ENTITYID_2 =
		"quarryApplication.entityId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetQuarryByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetQuarryByEntityId_Status;
	private FinderPath _finderPathCountBygetQuarryByEntityId_Status;

	/**
	 * Returns all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status) {

		return findBygetQuarryByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end) {

		return findBygetQuarryByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return findBygetQuarryByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching quarry applications
	 */
	@Override
	public List<QuarryApplication> findBygetQuarryByEntityId_Status(
		long entityId, int status, int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetQuarryByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetQuarryByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<QuarryApplication> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (QuarryApplication quarryApplication : list) {
					if ((entityId != quarryApplication.getEntityId()) ||
						(status != quarryApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_ENTITYID_2);

			sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

				queryPos.add(status);

				list = (List<QuarryApplication>)QueryUtil.list(
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
	 * Returns the first quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByEntityId_Status_First(
			long entityId, int status,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication =
			fetchBygetQuarryByEntityId_Status_First(
				entityId, status, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the first quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByEntityId_Status_First(
		long entityId, int status,
		OrderByComparator<QuarryApplication> orderByComparator) {

		List<QuarryApplication> list = findBygetQuarryByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByEntityId_Status_Last(
			long entityId, int status,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication =
			fetchBygetQuarryByEntityId_Status_Last(
				entityId, status, orderByComparator);

		if (quarryApplication != null) {
			return quarryApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchQuarryApplicationException(sb.toString());
	}

	/**
	 * Returns the last quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByEntityId_Status_Last(
		long entityId, int status,
		OrderByComparator<QuarryApplication> orderByComparator) {

		int count = countBygetQuarryByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<QuarryApplication> list = findBygetQuarryByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the quarry applications before and after the current quarry application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param quarryApplicationId the primary key of the current quarry application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication[] findBygetQuarryByEntityId_Status_PrevAndNext(
			long quarryApplicationId, long entityId, int status,
			OrderByComparator<QuarryApplication> orderByComparator)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findByPrimaryKey(
			quarryApplicationId);

		Session session = null;

		try {
			session = openSession();

			QuarryApplication[] array = new QuarryApplicationImpl[3];

			array[0] = getBygetQuarryByEntityId_Status_PrevAndNext(
				session, quarryApplication, entityId, status, orderByComparator,
				true);

			array[1] = quarryApplication;

			array[2] = getBygetQuarryByEntityId_Status_PrevAndNext(
				session, quarryApplication, entityId, status, orderByComparator,
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

	protected QuarryApplication getBygetQuarryByEntityId_Status_PrevAndNext(
		Session session, QuarryApplication quarryApplication, long entityId,
		int status, OrderByComparator<QuarryApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_ENTITYID_2);

		sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_STATUS_2);

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
			sb.append(QuarryApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(entityId);

		queryPos.add(status);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						quarryApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<QuarryApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the quarry applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetQuarryByEntityId_Status(long entityId, int status) {
		for (QuarryApplication quarryApplication :
				findBygetQuarryByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(quarryApplication);
		}
	}

	/**
	 * Returns the number of quarry applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByEntityId_Status(long entityId, int status) {
		FinderPath finderPath = _finderPathCountBygetQuarryByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_ENTITYID_2);

			sb.append(_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_STATUS_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

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
		_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_ENTITYID_2 =
			"quarryApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRYBYENTITYID_STATUS_STATUS_2 =
			"quarryApplication.status = ?";

	private FinderPath _finderPathFetchBygetQuarryByEI_CI;
	private FinderPath _finderPathCountBygetQuarryByEI_CI;

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByEI_CI(
			long entityId, String caseId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByEI_CI(
			entityId, caseId);

		if (quarryApplication == null) {
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

			throw new NoSuchQuarryApplicationException(sb.toString());
		}

		return quarryApplication;
	}

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByEI_CI(
		long entityId, String caseId) {

		return fetchBygetQuarryByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the quarry application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByEI_CI(
		long entityId, String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {entityId, caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarryByEI_CI, finderArgs, this);
		}

		if (result instanceof QuarryApplication) {
			QuarryApplication quarryApplication = (QuarryApplication)result;

			if ((entityId != quarryApplication.getEntityId()) ||
				!Objects.equals(caseId, quarryApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYEI_CI_ENTITYID_2);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

				if (bindCaseId) {
					queryPos.add(caseId);
				}

				List<QuarryApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarryByEI_CI, finderArgs,
							list);
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
								"QuarryApplicationPersistenceImpl.fetchBygetQuarryByEI_CI(long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplication quarryApplication = list.get(0);

					result = quarryApplication;

					cacheResult(quarryApplication);
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
			return (QuarryApplication)result;
		}
	}

	/**
	 * Removes the quarry application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the quarry application that was removed
	 */
	@Override
	public QuarryApplication removeBygetQuarryByEI_CI(
			long entityId, String caseId)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findBygetQuarryByEI_CI(
			entityId, caseId);

		return remove(quarryApplication);
	}

	/**
	 * Returns the number of quarry applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByEI_CI(long entityId, String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetQuarryByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETQUARRYBYEI_CI_ENTITYID_2);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYEI_CI_CASEID_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

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

	private static final String _FINDER_COLUMN_GETQUARRYBYEI_CI_ENTITYID_2 =
		"quarryApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETQUARRYBYEI_CI_CASEID_2 =
		"quarryApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETQUARRYBYEI_CI_CASEID_3 =
		"(quarryApplication.caseId IS NULL OR quarryApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetQuarryByAppNo;
	private FinderPath _finderPathCountBygetQuarryByAppNo;

	/**
	 * Returns the quarry application where applicationNumber = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByAppNo(String applicationNumber)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByAppNo(
			applicationNumber);

		if (quarryApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationException(sb.toString());
		}

		return quarryApplication;
	}

	/**
	 * Returns the quarry application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByAppNo(String applicationNumber) {
		return fetchBygetQuarryByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the quarry application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarryByAppNo, finderArgs, this);
		}

		if (result instanceof QuarryApplication) {
			QuarryApplication quarryApplication = (QuarryApplication)result;

			if (!Objects.equals(
					applicationNumber,
					quarryApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYAPPNO_APPLICATIONNUMBER_2);
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

				List<QuarryApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarryByAppNo, finderArgs,
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
								"QuarryApplicationPersistenceImpl.fetchBygetQuarryByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplication quarryApplication = list.get(0);

					result = quarryApplication;

					cacheResult(quarryApplication);
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
			return (QuarryApplication)result;
		}
	}

	/**
	 * Removes the quarry application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the quarry application that was removed
	 */
	@Override
	public QuarryApplication removeBygetQuarryByAppNo(String applicationNumber)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findBygetQuarryByAppNo(
			applicationNumber);

		return remove(quarryApplication);
	}

	/**
	 * Returns the number of quarry applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetQuarryByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETQUARRYBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETQUARRYBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETQUARRYBYAPPNO_APPLICATIONNUMBER_2 =
			"quarryApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRYBYAPPNO_APPLICATIONNUMBER_3 =
			"(quarryApplication.applicationNumber IS NULL OR quarryApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetQuarryByAppType_AppNo;
	private FinderPath _finderPathCountBygetQuarryByAppType_AppNo;

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching quarry application
	 * @throws NoSuchQuarryApplicationException if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication findBygetQuarryByAppType_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		if (quarryApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfTransaction=");
			sb.append(typeOfTransaction);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchQuarryApplicationException(sb.toString());
		}

		return quarryApplication;
	}

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching quarry application, or <code>null</code> if a matching quarry application could not be found
	 */
	@Override
	public QuarryApplication fetchBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				typeOfTransaction, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetQuarryByAppType_AppNo, finderArgs, this);
		}

		if (result instanceof QuarryApplication) {
			QuarryApplication quarryApplication = (QuarryApplication)result;

			if (!Objects.equals(
					typeOfTransaction,
					quarryApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					quarryApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_QUARRYAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<QuarryApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetQuarryByAppType_AppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfTransaction, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"QuarryApplicationPersistenceImpl.fetchBygetQuarryByAppType_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					QuarryApplication quarryApplication = list.get(0);

					result = quarryApplication;

					cacheResult(quarryApplication);
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
			return (QuarryApplication)result;
		}
	}

	/**
	 * Removes the quarry application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the quarry application that was removed
	 */
	@Override
	public QuarryApplication removeBygetQuarryByAppType_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = findBygetQuarryByAppType_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		return remove(quarryApplication);
	}

	/**
	 * Returns the number of quarry applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching quarry applications
	 */
	@Override
	public int countBygetQuarryByAppType_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetQuarryByAppType_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_QUARRYAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfTransaction) {
					queryPos.add(typeOfTransaction);
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
		_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_TYPEOFTRANSACTION_2 =
			"quarryApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_TYPEOFTRANSACTION_3 =
			"(quarryApplication.typeOfTransaction IS NULL OR quarryApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"quarryApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETQUARRYBYAPPTYPE_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(quarryApplication.expiredLicenseAppNumber IS NULL OR quarryApplication.expiredLicenseAppNumber = '')";

	public QuarryApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(QuarryApplication.class);

		setModelImplClass(QuarryApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(QuarryApplicationTable.INSTANCE);
	}

	/**
	 * Caches the quarry application in the entity cache if it is enabled.
	 *
	 * @param quarryApplication the quarry application
	 */
	@Override
	public void cacheResult(QuarryApplication quarryApplication) {
		entityCache.putResult(
			QuarryApplicationImpl.class, quarryApplication.getPrimaryKey(),
			quarryApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				quarryApplication.getUuid(), quarryApplication.getGroupId()
			},
			quarryApplication);

		finderCache.putResult(
			_finderPathFetchBygetQuarryById,
			new Object[] {quarryApplication.getQuarryApplicationId()},
			quarryApplication);

		finderCache.putResult(
			_finderPathFetchBygetQuarryByCaseId,
			new Object[] {quarryApplication.getCaseId()}, quarryApplication);

		finderCache.putResult(
			_finderPathFetchBygetQuarryByEI_CI,
			new Object[] {
				quarryApplication.getEntityId(), quarryApplication.getCaseId()
			},
			quarryApplication);

		finderCache.putResult(
			_finderPathFetchBygetQuarryByAppNo,
			new Object[] {quarryApplication.getApplicationNumber()},
			quarryApplication);

		finderCache.putResult(
			_finderPathFetchBygetQuarryByAppType_AppNo,
			new Object[] {
				quarryApplication.getTypeOfTransaction(),
				quarryApplication.getExpiredLicenseAppNumber()
			},
			quarryApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the quarry applications in the entity cache if it is enabled.
	 *
	 * @param quarryApplications the quarry applications
	 */
	@Override
	public void cacheResult(List<QuarryApplication> quarryApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (quarryApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (QuarryApplication quarryApplication : quarryApplications) {
			if (entityCache.getResult(
					QuarryApplicationImpl.class,
					quarryApplication.getPrimaryKey()) == null) {

				cacheResult(quarryApplication);
			}
		}
	}

	/**
	 * Clears the cache for all quarry applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(QuarryApplicationImpl.class);

		finderCache.clearCache(QuarryApplicationImpl.class);
	}

	/**
	 * Clears the cache for the quarry application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(QuarryApplication quarryApplication) {
		entityCache.removeResult(
			QuarryApplicationImpl.class, quarryApplication);
	}

	@Override
	public void clearCache(List<QuarryApplication> quarryApplications) {
		for (QuarryApplication quarryApplication : quarryApplications) {
			entityCache.removeResult(
				QuarryApplicationImpl.class, quarryApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(QuarryApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(QuarryApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		QuarryApplicationModelImpl quarryApplicationModelImpl) {

		Object[] args = new Object[] {
			quarryApplicationModelImpl.getUuid(),
			quarryApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, quarryApplicationModelImpl);

		args = new Object[] {
			quarryApplicationModelImpl.getQuarryApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarryById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarryById, args, quarryApplicationModelImpl);

		args = new Object[] {quarryApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetQuarryByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarryByCaseId, args,
			quarryApplicationModelImpl);

		args = new Object[] {
			quarryApplicationModelImpl.getEntityId(),
			quarryApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarryByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarryByEI_CI, args,
			quarryApplicationModelImpl);

		args = new Object[] {quarryApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetQuarryByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarryByAppNo, args,
			quarryApplicationModelImpl);

		args = new Object[] {
			quarryApplicationModelImpl.getTypeOfTransaction(),
			quarryApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetQuarryByAppType_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetQuarryByAppType_AppNo, args,
			quarryApplicationModelImpl);
	}

	/**
	 * Creates a new quarry application with the primary key. Does not add the quarry application to the database.
	 *
	 * @param quarryApplicationId the primary key for the new quarry application
	 * @return the new quarry application
	 */
	@Override
	public QuarryApplication create(long quarryApplicationId) {
		QuarryApplication quarryApplication = new QuarryApplicationImpl();

		quarryApplication.setNew(true);
		quarryApplication.setPrimaryKey(quarryApplicationId);

		String uuid = PortalUUIDUtil.generate();

		quarryApplication.setUuid(uuid);

		quarryApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return quarryApplication;
	}

	/**
	 * Removes the quarry application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application that was removed
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication remove(long quarryApplicationId)
		throws NoSuchQuarryApplicationException {

		return remove((Serializable)quarryApplicationId);
	}

	/**
	 * Removes the quarry application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the quarry application
	 * @return the quarry application that was removed
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication remove(Serializable primaryKey)
		throws NoSuchQuarryApplicationException {

		Session session = null;

		try {
			session = openSession();

			QuarryApplication quarryApplication =
				(QuarryApplication)session.get(
					QuarryApplicationImpl.class, primaryKey);

			if (quarryApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchQuarryApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(quarryApplication);
		}
		catch (NoSuchQuarryApplicationException noSuchEntityException) {
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
	protected QuarryApplication removeImpl(
		QuarryApplication quarryApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(quarryApplication)) {
				quarryApplication = (QuarryApplication)session.get(
					QuarryApplicationImpl.class,
					quarryApplication.getPrimaryKeyObj());
			}

			if (quarryApplication != null) {
				session.delete(quarryApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (quarryApplication != null) {
			clearCache(quarryApplication);
		}

		return quarryApplication;
	}

	@Override
	public QuarryApplication updateImpl(QuarryApplication quarryApplication) {
		boolean isNew = quarryApplication.isNew();

		if (!(quarryApplication instanceof QuarryApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(quarryApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					quarryApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in quarryApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom QuarryApplication implementation " +
					quarryApplication.getClass());
		}

		QuarryApplicationModelImpl quarryApplicationModelImpl =
			(QuarryApplicationModelImpl)quarryApplication;

		if (Validator.isNull(quarryApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			quarryApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (quarryApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				quarryApplication.setCreateDate(date);
			}
			else {
				quarryApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!quarryApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				quarryApplication.setModifiedDate(date);
			}
			else {
				quarryApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(quarryApplication);
			}
			else {
				quarryApplication = (QuarryApplication)session.merge(
					quarryApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			QuarryApplicationImpl.class, quarryApplicationModelImpl, false,
			true);

		cacheUniqueFindersCache(quarryApplicationModelImpl);

		if (isNew) {
			quarryApplication.setNew(false);
		}

		quarryApplication.resetOriginalValues();

		return quarryApplication;
	}

	/**
	 * Returns the quarry application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the quarry application
	 * @return the quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchQuarryApplicationException {

		QuarryApplication quarryApplication = fetchByPrimaryKey(primaryKey);

		if (quarryApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchQuarryApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return quarryApplication;
	}

	/**
	 * Returns the quarry application with the primary key or throws a <code>NoSuchQuarryApplicationException</code> if it could not be found.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application
	 * @throws NoSuchQuarryApplicationException if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication findByPrimaryKey(long quarryApplicationId)
		throws NoSuchQuarryApplicationException {

		return findByPrimaryKey((Serializable)quarryApplicationId);
	}

	/**
	 * Returns the quarry application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param quarryApplicationId the primary key of the quarry application
	 * @return the quarry application, or <code>null</code> if a quarry application with the primary key could not be found
	 */
	@Override
	public QuarryApplication fetchByPrimaryKey(long quarryApplicationId) {
		return fetchByPrimaryKey((Serializable)quarryApplicationId);
	}

	/**
	 * Returns all the quarry applications.
	 *
	 * @return the quarry applications
	 */
	@Override
	public List<QuarryApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @return the range of quarry applications
	 */
	@Override
	public List<QuarryApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of quarry applications
	 */
	@Override
	public List<QuarryApplication> findAll(
		int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the quarry applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>QuarryApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of quarry applications
	 * @param end the upper bound of the range of quarry applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of quarry applications
	 */
	@Override
	public List<QuarryApplication> findAll(
		int start, int end,
		OrderByComparator<QuarryApplication> orderByComparator,
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

		List<QuarryApplication> list = null;

		if (useFinderCache) {
			list = (List<QuarryApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_QUARRYAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_QUARRYAPPLICATION;

				sql = sql.concat(QuarryApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<QuarryApplication>)QueryUtil.list(
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
	 * Removes all the quarry applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (QuarryApplication quarryApplication : findAll()) {
			remove(quarryApplication);
		}
	}

	/**
	 * Returns the number of quarry applications.
	 *
	 * @return the number of quarry applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_QUARRYAPPLICATION);

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
		return "quarryApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_QUARRYAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return QuarryApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the quarry application persistence.
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

		_finderPathFetchBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarryById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, true);

		_finderPathCountBygetQuarryById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarryById",
			new String[] {Long.class.getName()},
			new String[] {"quarryApplicationId"}, false);

		_finderPathWithPaginationFindBygetQuarryByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarryByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetQuarryByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetQuarryByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetQuarryByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetQuarryByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetQuarryByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarryByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetQuarryByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetQuarryByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarryByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetQuarryByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetQuarryByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, true);

		_finderPathCountBygetQuarryByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathWithPaginationFindBygetQuarryByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetQuarryByEntityId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetQuarryByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetQuarryByEntityId", new String[] {Long.class.getName()},
			new String[] {"entityId"}, true);

		_finderPathCountBygetQuarryByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryByEntityId", new String[] {Long.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetQuarryByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetQuarryByEntityId_Status",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetQuarryByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetQuarryByEntityId_Status",
				new String[] {Long.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetQuarryByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryByEntityId_Status",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetQuarryByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarryByEI_CI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetQuarryByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryByEI_CI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetQuarryByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarryByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetQuarryByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryByAppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetQuarryByAppType_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetQuarryByAppType_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetQuarryByAppType_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetQuarryByAppType_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		QuarryApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		QuarryApplicationUtil.setPersistence(null);

		entityCache.removeCache(QuarryApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = QUARRY_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_QUARRYAPPLICATION =
		"SELECT quarryApplication FROM QuarryApplication quarryApplication";

	private static final String _SQL_SELECT_QUARRYAPPLICATION_WHERE =
		"SELECT quarryApplication FROM QuarryApplication quarryApplication WHERE ";

	private static final String _SQL_COUNT_QUARRYAPPLICATION =
		"SELECT COUNT(quarryApplication) FROM QuarryApplication quarryApplication";

	private static final String _SQL_COUNT_QUARRYAPPLICATION_WHERE =
		"SELECT COUNT(quarryApplication) FROM QuarryApplication quarryApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "quarryApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No QuarryApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No QuarryApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		QuarryApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
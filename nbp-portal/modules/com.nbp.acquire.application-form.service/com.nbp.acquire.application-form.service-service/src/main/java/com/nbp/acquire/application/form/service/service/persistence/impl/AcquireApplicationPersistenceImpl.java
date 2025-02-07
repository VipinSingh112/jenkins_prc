/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence.impl;

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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireApplicationException;
import com.nbp.acquire.application.form.service.model.AcquireApplication;
import com.nbp.acquire.application.form.service.model.AcquireApplicationTable;
import com.nbp.acquire.application.form.service.model.impl.AcquireApplicationImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquireApplicationModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquireApplicationPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireApplicationUtil;
import com.nbp.acquire.application.form.service.service.persistence.impl.constants.ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireApplicationPersistence.class)
public class AcquireApplicationPersistenceImpl
	extends BasePersistenceImpl<AcquireApplication>
	implements AcquireApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireApplicationUtil</code> to access the acquire application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireApplicationImpl.class.getName();

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
	 * Returns all the acquire applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
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

		List<AcquireApplication> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireApplication acquireApplication : list) {
					if (!uuid.equals(acquireApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

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
				sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcquireApplication>)QueryUtil.list(
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
	 * Returns the first acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findByUuid_First(
			String uuid,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchByUuid_First(
		String uuid, OrderByComparator<AcquireApplication> orderByComparator) {

		List<AcquireApplication> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findByUuid_Last(
			String uuid,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchByUuid_Last(
		String uuid, OrderByComparator<AcquireApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<AcquireApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where uuid = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication[] findByUuid_PrevAndNext(
			long acquireApplicationId, String uuid,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		uuid = Objects.toString(uuid, "");

		AcquireApplication acquireApplication = findByPrimaryKey(
			acquireApplicationId);

		Session session = null;

		try {
			session = openSession();

			AcquireApplication[] array = new AcquireApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, acquireApplication, uuid, orderByComparator, true);

			array[1] = acquireApplication;

			array[2] = getByUuid_PrevAndNext(
				session, acquireApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AcquireApplication getByUuid_PrevAndNext(
		Session session, AcquireApplication acquireApplication, String uuid,
		OrderByComparator<AcquireApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

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
			sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
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
						acquireApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (AcquireApplication acquireApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquireApplication);
		}
	}

	/**
	 * Returns the number of acquire applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

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
		"acquireApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(acquireApplication.uuid IS NULL OR acquireApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchByUUID_G(uuid, groupId);

		if (acquireApplication == null) {
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

			throw new NoSuchAcquireApplicationException(sb.toString());
		}

		return acquireApplication;
	}

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the acquire application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchByUUID_G(
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

		if (result instanceof AcquireApplication) {
			AcquireApplication acquireApplication = (AcquireApplication)result;

			if (!Objects.equals(uuid, acquireApplication.getUuid()) ||
				(groupId != acquireApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

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

				List<AcquireApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					AcquireApplication acquireApplication = list.get(0);

					result = acquireApplication;

					cacheResult(acquireApplication);
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
			return (AcquireApplication)result;
		}
	}

	/**
	 * Removes the acquire application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the acquire application that was removed
	 */
	@Override
	public AcquireApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = findByUUID_G(uuid, groupId);

		return remove(acquireApplication);
	}

	/**
	 * Returns the number of acquire applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

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
		"acquireApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(acquireApplication.uuid IS NULL OR acquireApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"acquireApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
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

		List<AcquireApplication> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireApplication acquireApplication : list) {
					if (!uuid.equals(acquireApplication.getUuid()) ||
						(companyId != acquireApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

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
				sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<AcquireApplication>)QueryUtil.list(
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
	 * Returns the first acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the first acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<AcquireApplication> orderByComparator) {

		List<AcquireApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the last acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<AcquireApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<AcquireApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication[] findByUuid_C_PrevAndNext(
			long acquireApplicationId, String uuid, long companyId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		uuid = Objects.toString(uuid, "");

		AcquireApplication acquireApplication = findByPrimaryKey(
			acquireApplicationId);

		Session session = null;

		try {
			session = openSession();

			AcquireApplication[] array = new AcquireApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, acquireApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = acquireApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, acquireApplication, uuid, companyId, orderByComparator,
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

	protected AcquireApplication getByUuid_C_PrevAndNext(
		Session session, AcquireApplication acquireApplication, String uuid,
		long companyId, OrderByComparator<AcquireApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

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
			sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
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
						acquireApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (AcquireApplication acquireApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(acquireApplication);
		}
	}

	/**
	 * Returns the number of acquire applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

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
		"acquireApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(acquireApplication.uuid IS NULL OR acquireApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"acquireApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetAcquireById;
	private FinderPath _finderPathCountBygetAcquireById;

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchBygetAcquireById(
			acquireApplicationId);

		if (acquireApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationException(sb.toString());
		}

		return acquireApplication;
	}

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireById(long acquireApplicationId) {
		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire application where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireById, finderArgs, this);
		}

		if (result instanceof AcquireApplication) {
			AcquireApplication acquireApplication = (AcquireApplication)result;

			if (acquireApplicationId !=
					acquireApplication.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquireApplicationPersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplication acquireApplication = list.get(0);

					result = acquireApplication;

					cacheResult(acquireApplication);
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
			return (AcquireApplication)result;
		}
	}

	/**
	 * Removes the acquire application where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application that was removed
	 */
	@Override
	public AcquireApplication removeBygetAcquireById(long acquireApplicationId)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = findBygetAcquireById(
			acquireApplicationId);

		return remove(acquireApplication);
	}

	/**
	 * Returns the number of acquire applications where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2 =
			"acquireApplication.acquireApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetAcquireApplicationByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetAcquireApplicationByStatusUser;
	private FinderPath _finderPathCountBygetAcquireApplicationByStatusUser;

	/**
	 * Returns all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireApplicationByStatusUser(
		int status, long userId) {

		return findBygetAcquireApplicationByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireApplicationByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetAcquireApplicationByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return findBygetAcquireApplicationByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquireApplicationByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetAcquireApplicationByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<AcquireApplication> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireApplication acquireApplication : list) {
					if ((status != acquireApplication.getStatus()) ||
						(userId != acquireApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<AcquireApplication>)QueryUtil.list(
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
	 * Returns the first acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findBygetAcquireApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication =
			fetchBygetAcquireApplicationByStatusUser_First(
				status, userId, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the first acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireApplicationByStatusUser_First(
		int status, long userId,
		OrderByComparator<AcquireApplication> orderByComparator) {

		List<AcquireApplication> list = findBygetAcquireApplicationByStatusUser(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findBygetAcquireApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication =
			fetchBygetAcquireApplicationByStatusUser_Last(
				status, userId, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireApplicationByStatusUser_Last(
		int status, long userId,
		OrderByComparator<AcquireApplication> orderByComparator) {

		int count = countBygetAcquireApplicationByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<AcquireApplication> list = findBygetAcquireApplicationByStatusUser(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication[]
			findBygetAcquireApplicationByStatusUser_PrevAndNext(
				long acquireApplicationId, int status, long userId,
				OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = findByPrimaryKey(
			acquireApplicationId);

		Session session = null;

		try {
			session = openSession();

			AcquireApplication[] array = new AcquireApplicationImpl[3];

			array[0] = getBygetAcquireApplicationByStatusUser_PrevAndNext(
				session, acquireApplication, status, userId, orderByComparator,
				true);

			array[1] = acquireApplication;

			array[2] = getBygetAcquireApplicationByStatusUser_PrevAndNext(
				session, acquireApplication, status, userId, orderByComparator,
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

	protected AcquireApplication
		getBygetAcquireApplicationByStatusUser_PrevAndNext(
			Session session, AcquireApplication acquireApplication, int status,
			long userId,
			OrderByComparator<AcquireApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_USERID_2);

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
			sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
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
						acquireApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetAcquireApplicationByStatusUser(
		int status, long userId) {

		for (AcquireApplication acquireApplication :
				findBygetAcquireApplicationByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(acquireApplication);
		}
	}

	/**
	 * Returns the number of acquire applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countBygetAcquireApplicationByStatusUser(
		int status, long userId) {

		FinderPath finderPath =
			_finderPathCountBygetAcquireApplicationByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_USERID_2);

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

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_STATUS_2 =
			"acquireApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETACQUIREAPPLICATIONBYSTATUSUSER_USERID_2 =
			"acquireApplication.userId = ?";

	private FinderPath _finderPathWithPaginationFindBygetAcquireByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetAcquireByStatus;
	private FinderPath _finderPathCountBygetAcquireByStatus;

	/**
	 * Returns all the acquire applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireByStatus(int status) {
		return findBygetAcquireByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end) {

		return findBygetAcquireByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return findBygetAcquireByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching acquire applications
	 */
	@Override
	public List<AcquireApplication> findBygetAcquireByStatus(
		int status, int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetAcquireByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetAcquireByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<AcquireApplication> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (AcquireApplication acquireApplication : list) {
					if (status != acquireApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<AcquireApplication>)QueryUtil.list(
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
	 * Returns the first acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findBygetAcquireByStatus_First(
			int status, OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchBygetAcquireByStatus_First(
			status, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the first acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireByStatus_First(
		int status, OrderByComparator<AcquireApplication> orderByComparator) {

		List<AcquireApplication> list = findBygetAcquireByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findBygetAcquireByStatus_Last(
			int status, OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchBygetAcquireByStatus_Last(
			status, orderByComparator);

		if (acquireApplication != null) {
			return acquireApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchAcquireApplicationException(sb.toString());
	}

	/**
	 * Returns the last acquire application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireByStatus_Last(
		int status, OrderByComparator<AcquireApplication> orderByComparator) {

		int count = countBygetAcquireByStatus(status);

		if (count == 0) {
			return null;
		}

		List<AcquireApplication> list = findBygetAcquireByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the acquire applications before and after the current acquire application in the ordered set where status = &#63;.
	 *
	 * @param acquireApplicationId the primary key of the current acquire application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication[] findBygetAcquireByStatus_PrevAndNext(
			long acquireApplicationId, int status,
			OrderByComparator<AcquireApplication> orderByComparator)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = findByPrimaryKey(
			acquireApplicationId);

		Session session = null;

		try {
			session = openSession();

			AcquireApplication[] array = new AcquireApplicationImpl[3];

			array[0] = getBygetAcquireByStatus_PrevAndNext(
				session, acquireApplication, status, orderByComparator, true);

			array[1] = acquireApplication;

			array[2] = getBygetAcquireByStatus_PrevAndNext(
				session, acquireApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected AcquireApplication getBygetAcquireByStatus_PrevAndNext(
		Session session, AcquireApplication acquireApplication, int status,
		OrderByComparator<AcquireApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETACQUIREBYSTATUS_STATUS_2);

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
			sb.append(AcquireApplicationModelImpl.ORDER_BY_JPQL);
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
						acquireApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<AcquireApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the acquire applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetAcquireByStatus(int status) {
		for (AcquireApplication acquireApplication :
				findBygetAcquireByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(acquireApplication);
		}
	}

	/**
	 * Returns the number of acquire applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countBygetAcquireByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetAcquireByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETACQUIREBYSTATUS_STATUS_2 =
		"acquireApplication.status = ?";

	private FinderPath _finderPathFetchBygetAcquireByAppNo;
	private FinderPath _finderPathCountBygetAcquireByAppNo;

	/**
	 * Returns the acquire application where applicationNumber = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findBygetAcquireByAppNo(String applicationNumber)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchBygetAcquireByAppNo(
			applicationNumber);

		if (acquireApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationException(sb.toString());
		}

		return acquireApplication;
	}

	/**
	 * Returns the acquire application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireByAppNo(
		String applicationNumber) {

		return fetchBygetAcquireByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the acquire application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireByAppNo, finderArgs, this);
		}

		if (result instanceof AcquireApplication) {
			AcquireApplication acquireApplication = (AcquireApplication)result;

			if (!Objects.equals(
					applicationNumber,
					acquireApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETACQUIREBYAPPNO_APPLICATIONNUMBER_2);
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

				List<AcquireApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireByAppNo, finderArgs,
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
								"AcquireApplicationPersistenceImpl.fetchBygetAcquireByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplication acquireApplication = list.get(0);

					result = acquireApplication;

					cacheResult(acquireApplication);
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
			return (AcquireApplication)result;
		}
	}

	/**
	 * Removes the acquire application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the acquire application that was removed
	 */
	@Override
	public AcquireApplication removeBygetAcquireByAppNo(
			String applicationNumber)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = findBygetAcquireByAppNo(
			applicationNumber);

		return remove(acquireApplication);
	}

	/**
	 * Returns the number of acquire applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countBygetAcquireByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetAcquireByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETACQUIREBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETACQUIREBYAPPNO_APPLICATIONNUMBER_2 =
			"acquireApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETACQUIREBYAPPNO_APPLICATIONNUMBER_3 =
			"(acquireApplication.applicationNumber IS NULL OR acquireApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetAcquireByCaseId;
	private FinderPath _finderPathCountBygetAcquireByCaseId;

	/**
	 * Returns the acquire application where caseId = &#63; or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application
	 * @throws NoSuchAcquireApplicationException if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication findBygetAcquireByCaseId(String caseId)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchBygetAcquireByCaseId(
			caseId);

		if (acquireApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationException(sb.toString());
		}

		return acquireApplication;
	}

	/**
	 * Returns the acquire application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireByCaseId(String caseId) {
		return fetchBygetAcquireByCaseId(caseId, true);
	}

	/**
	 * Returns the acquire application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application, or <code>null</code> if a matching acquire application could not be found
	 */
	@Override
	public AcquireApplication fetchBygetAcquireByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireByCaseId, finderArgs, this);
		}

		if (result instanceof AcquireApplication) {
			AcquireApplication acquireApplication = (AcquireApplication)result;

			if (!Objects.equals(caseId, acquireApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREBYCASEID_CASEID_2);
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

				List<AcquireApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireByCaseId, finderArgs,
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
								"AcquireApplicationPersistenceImpl.fetchBygetAcquireByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplication acquireApplication = list.get(0);

					result = acquireApplication;

					cacheResult(acquireApplication);
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
			return (AcquireApplication)result;
		}
	}

	/**
	 * Removes the acquire application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the acquire application that was removed
	 */
	@Override
	public AcquireApplication removeBygetAcquireByCaseId(String caseId)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = findBygetAcquireByCaseId(
			caseId);

		return remove(acquireApplication);
	}

	/**
	 * Returns the number of acquire applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching acquire applications
	 */
	@Override
	public int countBygetAcquireByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetAcquireByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETACQUIREBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETACQUIREBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETACQUIREBYCASEID_CASEID_2 =
		"acquireApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETACQUIREBYCASEID_CASEID_3 =
		"(acquireApplication.caseId IS NULL OR acquireApplication.caseId = '')";

	public AcquireApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(AcquireApplication.class);

		setModelImplClass(AcquireApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireApplicationTable.INSTANCE);
	}

	/**
	 * Caches the acquire application in the entity cache if it is enabled.
	 *
	 * @param acquireApplication the acquire application
	 */
	@Override
	public void cacheResult(AcquireApplication acquireApplication) {
		entityCache.putResult(
			AcquireApplicationImpl.class, acquireApplication.getPrimaryKey(),
			acquireApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				acquireApplication.getUuid(), acquireApplication.getGroupId()
			},
			acquireApplication);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {acquireApplication.getAcquireApplicationId()},
			acquireApplication);

		finderCache.putResult(
			_finderPathFetchBygetAcquireByAppNo,
			new Object[] {acquireApplication.getApplicationNumber()},
			acquireApplication);

		finderCache.putResult(
			_finderPathFetchBygetAcquireByCaseId,
			new Object[] {acquireApplication.getCaseId()}, acquireApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire applications in the entity cache if it is enabled.
	 *
	 * @param acquireApplications the acquire applications
	 */
	@Override
	public void cacheResult(List<AcquireApplication> acquireApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireApplication acquireApplication : acquireApplications) {
			if (entityCache.getResult(
					AcquireApplicationImpl.class,
					acquireApplication.getPrimaryKey()) == null) {

				cacheResult(acquireApplication);
			}
		}
	}

	/**
	 * Clears the cache for all acquire applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireApplicationImpl.class);

		finderCache.clearCache(AcquireApplicationImpl.class);
	}

	/**
	 * Clears the cache for the acquire application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquireApplication acquireApplication) {
		entityCache.removeResult(
			AcquireApplicationImpl.class, acquireApplication);
	}

	@Override
	public void clearCache(List<AcquireApplication> acquireApplications) {
		for (AcquireApplication acquireApplication : acquireApplications) {
			entityCache.removeResult(
				AcquireApplicationImpl.class, acquireApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(AcquireApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireApplicationModelImpl acquireApplicationModelImpl) {

		Object[] args = new Object[] {
			acquireApplicationModelImpl.getUuid(),
			acquireApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, acquireApplicationModelImpl);

		args = new Object[] {
			acquireApplicationModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquireApplicationModelImpl);

		args = new Object[] {
			acquireApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireByAppNo, args,
			acquireApplicationModelImpl);

		args = new Object[] {acquireApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetAcquireByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireByCaseId, args,
			acquireApplicationModelImpl);
	}

	/**
	 * Creates a new acquire application with the primary key. Does not add the acquire application to the database.
	 *
	 * @param acquireApplicationId the primary key for the new acquire application
	 * @return the new acquire application
	 */
	@Override
	public AcquireApplication create(long acquireApplicationId) {
		AcquireApplication acquireApplication = new AcquireApplicationImpl();

		acquireApplication.setNew(true);
		acquireApplication.setPrimaryKey(acquireApplicationId);

		String uuid = PortalUUIDUtil.generate();

		acquireApplication.setUuid(uuid);

		acquireApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquireApplication;
	}

	/**
	 * Removes the acquire application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application that was removed
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication remove(long acquireApplicationId)
		throws NoSuchAcquireApplicationException {

		return remove((Serializable)acquireApplicationId);
	}

	/**
	 * Removes the acquire application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire application
	 * @return the acquire application that was removed
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication remove(Serializable primaryKey)
		throws NoSuchAcquireApplicationException {

		Session session = null;

		try {
			session = openSession();

			AcquireApplication acquireApplication =
				(AcquireApplication)session.get(
					AcquireApplicationImpl.class, primaryKey);

			if (acquireApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireApplication);
		}
		catch (NoSuchAcquireApplicationException noSuchEntityException) {
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
	protected AcquireApplication removeImpl(
		AcquireApplication acquireApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireApplication)) {
				acquireApplication = (AcquireApplication)session.get(
					AcquireApplicationImpl.class,
					acquireApplication.getPrimaryKeyObj());
			}

			if (acquireApplication != null) {
				session.delete(acquireApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireApplication != null) {
			clearCache(acquireApplication);
		}

		return acquireApplication;
	}

	@Override
	public AcquireApplication updateImpl(
		AcquireApplication acquireApplication) {

		boolean isNew = acquireApplication.isNew();

		if (!(acquireApplication instanceof AcquireApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireApplication implementation " +
					acquireApplication.getClass());
		}

		AcquireApplicationModelImpl acquireApplicationModelImpl =
			(AcquireApplicationModelImpl)acquireApplication;

		if (Validator.isNull(acquireApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			acquireApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireApplication.setCreateDate(date);
			}
			else {
				acquireApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireApplication.setModifiedDate(date);
			}
			else {
				acquireApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireApplication);
			}
			else {
				acquireApplication = (AcquireApplication)session.merge(
					acquireApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireApplicationImpl.class, acquireApplicationModelImpl, false,
			true);

		cacheUniqueFindersCache(acquireApplicationModelImpl);

		if (isNew) {
			acquireApplication.setNew(false);
		}

		acquireApplication.resetOriginalValues();

		return acquireApplication;
	}

	/**
	 * Returns the acquire application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire application
	 * @return the acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireApplicationException {

		AcquireApplication acquireApplication = fetchByPrimaryKey(primaryKey);

		if (acquireApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireApplication;
	}

	/**
	 * Returns the acquire application with the primary key or throws a <code>NoSuchAcquireApplicationException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application
	 * @throws NoSuchAcquireApplicationException if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication findByPrimaryKey(long acquireApplicationId)
		throws NoSuchAcquireApplicationException {

		return findByPrimaryKey((Serializable)acquireApplicationId);
	}

	/**
	 * Returns the acquire application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationId the primary key of the acquire application
	 * @return the acquire application, or <code>null</code> if a acquire application with the primary key could not be found
	 */
	@Override
	public AcquireApplication fetchByPrimaryKey(long acquireApplicationId) {
		return fetchByPrimaryKey((Serializable)acquireApplicationId);
	}

	/**
	 * Returns all the acquire applications.
	 *
	 * @return the acquire applications
	 */
	@Override
	public List<AcquireApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @return the range of acquire applications
	 */
	@Override
	public List<AcquireApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire applications
	 */
	@Override
	public List<AcquireApplication> findAll(
		int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire applications
	 * @param end the upper bound of the range of acquire applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire applications
	 */
	@Override
	public List<AcquireApplication> findAll(
		int start, int end,
		OrderByComparator<AcquireApplication> orderByComparator,
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

		List<AcquireApplication> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREAPPLICATION;

				sql = sql.concat(AcquireApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireApplication>)QueryUtil.list(
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
	 * Removes all the acquire applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireApplication acquireApplication : findAll()) {
			remove(acquireApplication);
		}
	}

	/**
	 * Returns the number of acquire applications.
	 *
	 * @return the number of acquire applications
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
					_SQL_COUNT_ACQUIREAPPLICATION);

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
		return "acquireApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire application persistence.
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

		_finderPathFetchBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		_finderPathWithPaginationFindBygetAcquireApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetAcquireApplicationByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetAcquireApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetAcquireApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetAcquireApplicationByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireApplicationByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetAcquireByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetAcquireByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetAcquireByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetAcquireByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, true);

		_finderPathCountBygetAcquireByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathFetchBygetAcquireByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetAcquireByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireByAppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetAcquireByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetAcquireByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetAcquireByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		AcquireApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireApplicationUtil.setPersistence(null);

		entityCache.removeCache(AcquireApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREAPPLICATION =
		"SELECT acquireApplication FROM AcquireApplication acquireApplication";

	private static final String _SQL_SELECT_ACQUIREAPPLICATION_WHERE =
		"SELECT acquireApplication FROM AcquireApplication acquireApplication WHERE ";

	private static final String _SQL_COUNT_ACQUIREAPPLICATION =
		"SELECT COUNT(acquireApplication) FROM AcquireApplication acquireApplication";

	private static final String _SQL_COUNT_ACQUIREAPPLICATION_WHERE =
		"SELECT COUNT(acquireApplication) FROM AcquireApplication acquireApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "acquireApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
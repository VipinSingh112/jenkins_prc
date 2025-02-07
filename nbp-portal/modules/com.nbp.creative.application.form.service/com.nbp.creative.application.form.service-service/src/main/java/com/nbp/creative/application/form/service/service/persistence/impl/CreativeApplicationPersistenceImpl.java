/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.creative.application.form.service.service.persistence.impl;

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

import com.nbp.creative.application.form.service.exception.NoSuchCreativeApplicationException;
import com.nbp.creative.application.form.service.model.CreativeApplication;
import com.nbp.creative.application.form.service.model.CreativeApplicationTable;
import com.nbp.creative.application.form.service.model.impl.CreativeApplicationImpl;
import com.nbp.creative.application.form.service.model.impl.CreativeApplicationModelImpl;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationPersistence;
import com.nbp.creative.application.form.service.service.persistence.CreativeApplicationUtil;
import com.nbp.creative.application.form.service.service.persistence.impl.constants.CREATIVEPersistenceConstants;

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
 * The persistence implementation for the creative application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CreativeApplicationPersistence.class)
public class CreativeApplicationPersistenceImpl
	extends BasePersistenceImpl<CreativeApplication>
	implements CreativeApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CreativeApplicationUtil</code> to access the creative application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CreativeApplicationImpl.class.getName();

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
	 * Returns all the creative applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
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

		List<CreativeApplication> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplication creativeApplication : list) {
					if (!uuid.equals(creativeApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

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
				sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeApplication>)QueryUtil.list(
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
	 * Returns the first creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findByUuid_First(
			String uuid,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchByUuid_First(
		String uuid, OrderByComparator<CreativeApplication> orderByComparator) {

		List<CreativeApplication> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findByUuid_Last(
			String uuid,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchByUuid_Last(
		String uuid, OrderByComparator<CreativeApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CreativeApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where uuid = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication[] findByUuid_PrevAndNext(
			long CreativeApplicationId, String uuid,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		uuid = Objects.toString(uuid, "");

		CreativeApplication creativeApplication = findByPrimaryKey(
			CreativeApplicationId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplication[] array = new CreativeApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, creativeApplication, uuid, orderByComparator, true);

			array[1] = creativeApplication;

			array[2] = getByUuid_PrevAndNext(
				session, creativeApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CreativeApplication getByUuid_PrevAndNext(
		Session session, CreativeApplication creativeApplication, String uuid,
		OrderByComparator<CreativeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

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
			sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
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
						creativeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CreativeApplication creativeApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creativeApplication);
		}
	}

	/**
	 * Returns the number of creative applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching creative applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

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
		"creativeApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(creativeApplication.uuid IS NULL OR creativeApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchByUUID_G(uuid, groupId);

		if (creativeApplication == null) {
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

			throw new NoSuchCreativeApplicationException(sb.toString());
		}

		return creativeApplication;
	}

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the creative application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchByUUID_G(
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

		if (result instanceof CreativeApplication) {
			CreativeApplication creativeApplication =
				(CreativeApplication)result;

			if (!Objects.equals(uuid, creativeApplication.getUuid()) ||
				(groupId != creativeApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

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

				List<CreativeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CreativeApplication creativeApplication = list.get(0);

					result = creativeApplication;

					cacheResult(creativeApplication);
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
			return (CreativeApplication)result;
		}
	}

	/**
	 * Removes the creative application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the creative application that was removed
	 */
	@Override
	public CreativeApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = findByUUID_G(uuid, groupId);

		return remove(creativeApplication);
	}

	/**
	 * Returns the number of creative applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching creative applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

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
		"creativeApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(creativeApplication.uuid IS NULL OR creativeApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"creativeApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
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

		List<CreativeApplication> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplication creativeApplication : list) {
					if (!uuid.equals(creativeApplication.getUuid()) ||
						(companyId != creativeApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

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
				sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<CreativeApplication>)QueryUtil.list(
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
	 * Returns the first creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the first creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CreativeApplication> orderByComparator) {

		List<CreativeApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the last creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CreativeApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CreativeApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication[] findByUuid_C_PrevAndNext(
			long CreativeApplicationId, String uuid, long companyId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		uuid = Objects.toString(uuid, "");

		CreativeApplication creativeApplication = findByPrimaryKey(
			CreativeApplicationId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplication[] array = new CreativeApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, creativeApplication, uuid, companyId,
				orderByComparator, true);

			array[1] = creativeApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, creativeApplication, uuid, companyId,
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

	protected CreativeApplication getByUuid_C_PrevAndNext(
		Session session, CreativeApplication creativeApplication, String uuid,
		long companyId,
		OrderByComparator<CreativeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

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
			sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
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
						creativeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CreativeApplication creativeApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeApplication);
		}
	}

	/**
	 * Returns the number of creative applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching creative applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

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
		"creativeApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(creativeApplication.uuid IS NULL OR creativeApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"creativeApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetCreativeById;
	private FinderPath _finderPathCountBygetCreativeById;

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findBygetCreativeById(long CreativeApplicationId)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchBygetCreativeById(
			CreativeApplicationId);

		if (creativeApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("CreativeApplicationId=");
			sb.append(CreativeApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeApplicationException(sb.toString());
		}

		return creativeApplication;
	}

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeById(
		long CreativeApplicationId) {

		return fetchBygetCreativeById(CreativeApplicationId, true);
	}

	/**
	 * Returns the creative application where CreativeApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeById(
		long CreativeApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {CreativeApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativeById, finderArgs, this);
		}

		if (result instanceof CreativeApplication) {
			CreativeApplication creativeApplication =
				(CreativeApplication)result;

			if (CreativeApplicationId !=
					creativeApplication.getCreativeApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

				List<CreativeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativeById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									CreativeApplicationId
								};
							}

							_log.warn(
								"CreativeApplicationPersistenceImpl.fetchBygetCreativeById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplication creativeApplication = list.get(0);

					result = creativeApplication;

					cacheResult(creativeApplication);
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
			return (CreativeApplication)result;
		}
	}

	/**
	 * Removes the creative application where CreativeApplicationId = &#63; from the database.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the creative application that was removed
	 */
	@Override
	public CreativeApplication removeBygetCreativeById(
			long CreativeApplicationId)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = findBygetCreativeById(
			CreativeApplicationId);

		return remove(creativeApplication);
	}

	/**
	 * Returns the number of creative applications where CreativeApplicationId = &#63;.
	 *
	 * @param CreativeApplicationId the creative application ID
	 * @return the number of matching creative applications
	 */
	@Override
	public int countBygetCreativeById(long CreativeApplicationId) {
		FinderPath finderPath = _finderPathCountBygetCreativeById;

		Object[] finderArgs = new Object[] {CreativeApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(CreativeApplicationId);

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
		_FINDER_COLUMN_GETCREATIVEBYID_CREATIVEAPPLICATIONID_2 =
			"creativeApplication.CreativeApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetCreativeApplicationByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCreativeApplicationByStatusUser;
	private FinderPath _finderPathCountBygetCreativeApplicationByStatusUser;

	/**
	 * Returns all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeApplicationByStatusUser(
		int status, long userId) {

		return findBygetCreativeApplicationByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeApplicationByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetCreativeApplicationByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return findBygetCreativeApplicationByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCreativeApplicationByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCreativeApplicationByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<CreativeApplication> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplication creativeApplication : list) {
					if ((status != creativeApplication.getStatus()) ||
						(userId != creativeApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<CreativeApplication>)QueryUtil.list(
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
	 * Returns the first creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findBygetCreativeApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication =
			fetchBygetCreativeApplicationByStatusUser_First(
				status, userId, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the first creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeApplicationByStatusUser_First(
		int status, long userId,
		OrderByComparator<CreativeApplication> orderByComparator) {

		List<CreativeApplication> list =
			findBygetCreativeApplicationByStatusUser(
				status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findBygetCreativeApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication =
			fetchBygetCreativeApplicationByStatusUser_Last(
				status, userId, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeApplicationByStatusUser_Last(
		int status, long userId,
		OrderByComparator<CreativeApplication> orderByComparator) {

		int count = countBygetCreativeApplicationByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<CreativeApplication> list =
			findBygetCreativeApplicationByStatusUser(
				status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication[]
			findBygetCreativeApplicationByStatusUser_PrevAndNext(
				long CreativeApplicationId, int status, long userId,
				OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = findByPrimaryKey(
			CreativeApplicationId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplication[] array = new CreativeApplicationImpl[3];

			array[0] = getBygetCreativeApplicationByStatusUser_PrevAndNext(
				session, creativeApplication, status, userId, orderByComparator,
				true);

			array[1] = creativeApplication;

			array[2] = getBygetCreativeApplicationByStatusUser_PrevAndNext(
				session, creativeApplication, status, userId, orderByComparator,
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

	protected CreativeApplication
		getBygetCreativeApplicationByStatusUser_PrevAndNext(
			Session session, CreativeApplication creativeApplication,
			int status, long userId,
			OrderByComparator<CreativeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_USERID_2);

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
			sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
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
						creativeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetCreativeApplicationByStatusUser(
		int status, long userId) {

		for (CreativeApplication creativeApplication :
				findBygetCreativeApplicationByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(creativeApplication);
		}
	}

	/**
	 * Returns the number of creative applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching creative applications
	 */
	@Override
	public int countBygetCreativeApplicationByStatusUser(
		int status, long userId) {

		FinderPath finderPath =
			_finderPathCountBygetCreativeApplicationByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_USERID_2);

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
		_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_STATUS_2 =
			"creativeApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCREATIVEAPPLICATIONBYSTATUSUSER_USERID_2 =
			"creativeApplication.userId = ?";

	private FinderPath _finderPathWithPaginationFindBygetCreativeByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetCreativeByStatus;
	private FinderPath _finderPathCountBygetCreativeByStatus;

	/**
	 * Returns all the creative applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeByStatus(int status) {
		return findBygetCreativeByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end) {

		return findBygetCreativeByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return findBygetCreativeByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching creative applications
	 */
	@Override
	public List<CreativeApplication> findBygetCreativeByStatus(
		int status, int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCreativeByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCreativeByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<CreativeApplication> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CreativeApplication creativeApplication : list) {
					if (status != creativeApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<CreativeApplication>)QueryUtil.list(
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
	 * Returns the first creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findBygetCreativeByStatus_First(
			int status,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication =
			fetchBygetCreativeByStatus_First(status, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the first creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeByStatus_First(
		int status, OrderByComparator<CreativeApplication> orderByComparator) {

		List<CreativeApplication> list = findBygetCreativeByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findBygetCreativeByStatus_Last(
			int status,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication =
			fetchBygetCreativeByStatus_Last(status, orderByComparator);

		if (creativeApplication != null) {
			return creativeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCreativeApplicationException(sb.toString());
	}

	/**
	 * Returns the last creative application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeByStatus_Last(
		int status, OrderByComparator<CreativeApplication> orderByComparator) {

		int count = countBygetCreativeByStatus(status);

		if (count == 0) {
			return null;
		}

		List<CreativeApplication> list = findBygetCreativeByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the creative applications before and after the current creative application in the ordered set where status = &#63;.
	 *
	 * @param CreativeApplicationId the primary key of the current creative application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication[] findBygetCreativeByStatus_PrevAndNext(
			long CreativeApplicationId, int status,
			OrderByComparator<CreativeApplication> orderByComparator)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = findByPrimaryKey(
			CreativeApplicationId);

		Session session = null;

		try {
			session = openSession();

			CreativeApplication[] array = new CreativeApplicationImpl[3];

			array[0] = getBygetCreativeByStatus_PrevAndNext(
				session, creativeApplication, status, orderByComparator, true);

			array[1] = creativeApplication;

			array[2] = getBygetCreativeByStatus_PrevAndNext(
				session, creativeApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CreativeApplication getBygetCreativeByStatus_PrevAndNext(
		Session session, CreativeApplication creativeApplication, int status,
		OrderByComparator<CreativeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETCREATIVEBYSTATUS_STATUS_2);

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
			sb.append(CreativeApplicationModelImpl.ORDER_BY_JPQL);
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
						creativeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CreativeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the creative applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetCreativeByStatus(int status) {
		for (CreativeApplication creativeApplication :
				findBygetCreativeByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(creativeApplication);
		}
	}

	/**
	 * Returns the number of creative applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching creative applications
	 */
	@Override
	public int countBygetCreativeByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetCreativeByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETCREATIVEBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETCREATIVEBYSTATUS_STATUS_2 =
		"creativeApplication.status = ?";

	private FinderPath _finderPathFetchBygetCreativeByAppNo;
	private FinderPath _finderPathCountBygetCreativeByAppNo;

	/**
	 * Returns the creative application where applicationNumber = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findBygetCreativeByAppNo(
			String applicationNumber)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchBygetCreativeByAppNo(
			applicationNumber);

		if (creativeApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeApplicationException(sb.toString());
		}

		return creativeApplication;
	}

	/**
	 * Returns the creative application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeByAppNo(
		String applicationNumber) {

		return fetchBygetCreativeByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the creative application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativeByAppNo, finderArgs, this);
		}

		if (result instanceof CreativeApplication) {
			CreativeApplication creativeApplication =
				(CreativeApplication)result;

			if (!Objects.equals(
					applicationNumber,
					creativeApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCREATIVEBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETCREATIVEBYAPPNO_APPLICATIONNUMBER_2);
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

				List<CreativeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativeByAppNo, finderArgs,
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
								"CreativeApplicationPersistenceImpl.fetchBygetCreativeByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplication creativeApplication = list.get(0);

					result = creativeApplication;

					cacheResult(creativeApplication);
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
			return (CreativeApplication)result;
		}
	}

	/**
	 * Removes the creative application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the creative application that was removed
	 */
	@Override
	public CreativeApplication removeBygetCreativeByAppNo(
			String applicationNumber)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = findBygetCreativeByAppNo(
			applicationNumber);

		return remove(creativeApplication);
	}

	/**
	 * Returns the number of creative applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching creative applications
	 */
	@Override
	public int countBygetCreativeByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetCreativeByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCREATIVEBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETCREATIVEBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETCREATIVEBYAPPNO_APPLICATIONNUMBER_2 =
			"creativeApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETCREATIVEBYAPPNO_APPLICATIONNUMBER_3 =
			"(creativeApplication.applicationNumber IS NULL OR creativeApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetCreativeBy_CI;
	private FinderPath _finderPathCountBygetCreativeBy_CI;

	/**
	 * Returns the creative application where caseId = &#63; or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application
	 * @throws NoSuchCreativeApplicationException if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication findBygetCreativeBy_CI(String caseId)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchBygetCreativeBy_CI(
			caseId);

		if (creativeApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCreativeApplicationException(sb.toString());
		}

		return creativeApplication;
	}

	/**
	 * Returns the creative application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeBy_CI(String caseId) {
		return fetchBygetCreativeBy_CI(caseId, true);
	}

	/**
	 * Returns the creative application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching creative application, or <code>null</code> if a matching creative application could not be found
	 */
	@Override
	public CreativeApplication fetchBygetCreativeBy_CI(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCreativeBy_CI, finderArgs, this);
		}

		if (result instanceof CreativeApplication) {
			CreativeApplication creativeApplication =
				(CreativeApplication)result;

			if (!Objects.equals(caseId, creativeApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CREATIVEAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCREATIVEBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCREATIVEBY_CI_CASEID_2);
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

				List<CreativeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCreativeBy_CI, finderArgs,
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
								"CreativeApplicationPersistenceImpl.fetchBygetCreativeBy_CI(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CreativeApplication creativeApplication = list.get(0);

					result = creativeApplication;

					cacheResult(creativeApplication);
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
			return (CreativeApplication)result;
		}
	}

	/**
	 * Removes the creative application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the creative application that was removed
	 */
	@Override
	public CreativeApplication removeBygetCreativeBy_CI(String caseId)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = findBygetCreativeBy_CI(
			caseId);

		return remove(creativeApplication);
	}

	/**
	 * Returns the number of creative applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching creative applications
	 */
	@Override
	public int countBygetCreativeBy_CI(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCreativeBy_CI;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CREATIVEAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCREATIVEBY_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCREATIVEBY_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCREATIVEBY_CI_CASEID_2 =
		"creativeApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETCREATIVEBY_CI_CASEID_3 =
		"(creativeApplication.caseId IS NULL OR creativeApplication.caseId = '')";

	public CreativeApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CreativeApplication.class);

		setModelImplClass(CreativeApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(CreativeApplicationTable.INSTANCE);
	}

	/**
	 * Caches the creative application in the entity cache if it is enabled.
	 *
	 * @param creativeApplication the creative application
	 */
	@Override
	public void cacheResult(CreativeApplication creativeApplication) {
		entityCache.putResult(
			CreativeApplicationImpl.class, creativeApplication.getPrimaryKey(),
			creativeApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				creativeApplication.getUuid(), creativeApplication.getGroupId()
			},
			creativeApplication);

		finderCache.putResult(
			_finderPathFetchBygetCreativeById,
			new Object[] {creativeApplication.getCreativeApplicationId()},
			creativeApplication);

		finderCache.putResult(
			_finderPathFetchBygetCreativeByAppNo,
			new Object[] {creativeApplication.getApplicationNumber()},
			creativeApplication);

		finderCache.putResult(
			_finderPathFetchBygetCreativeBy_CI,
			new Object[] {creativeApplication.getCaseId()},
			creativeApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the creative applications in the entity cache if it is enabled.
	 *
	 * @param creativeApplications the creative applications
	 */
	@Override
	public void cacheResult(List<CreativeApplication> creativeApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (creativeApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CreativeApplication creativeApplication : creativeApplications) {
			if (entityCache.getResult(
					CreativeApplicationImpl.class,
					creativeApplication.getPrimaryKey()) == null) {

				cacheResult(creativeApplication);
			}
		}
	}

	/**
	 * Clears the cache for all creative applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CreativeApplicationImpl.class);

		finderCache.clearCache(CreativeApplicationImpl.class);
	}

	/**
	 * Clears the cache for the creative application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CreativeApplication creativeApplication) {
		entityCache.removeResult(
			CreativeApplicationImpl.class, creativeApplication);
	}

	@Override
	public void clearCache(List<CreativeApplication> creativeApplications) {
		for (CreativeApplication creativeApplication : creativeApplications) {
			entityCache.removeResult(
				CreativeApplicationImpl.class, creativeApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CreativeApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(CreativeApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CreativeApplicationModelImpl creativeApplicationModelImpl) {

		Object[] args = new Object[] {
			creativeApplicationModelImpl.getUuid(),
			creativeApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, creativeApplicationModelImpl);

		args = new Object[] {
			creativeApplicationModelImpl.getCreativeApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeById, args,
			creativeApplicationModelImpl);

		args = new Object[] {
			creativeApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetCreativeByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeByAppNo, args,
			creativeApplicationModelImpl);

		args = new Object[] {creativeApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetCreativeBy_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCreativeBy_CI, args,
			creativeApplicationModelImpl);
	}

	/**
	 * Creates a new creative application with the primary key. Does not add the creative application to the database.
	 *
	 * @param CreativeApplicationId the primary key for the new creative application
	 * @return the new creative application
	 */
	@Override
	public CreativeApplication create(long CreativeApplicationId) {
		CreativeApplication creativeApplication = new CreativeApplicationImpl();

		creativeApplication.setNew(true);
		creativeApplication.setPrimaryKey(CreativeApplicationId);

		String uuid = PortalUUIDUtil.generate();

		creativeApplication.setUuid(uuid);

		creativeApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return creativeApplication;
	}

	/**
	 * Removes the creative application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application that was removed
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication remove(long CreativeApplicationId)
		throws NoSuchCreativeApplicationException {

		return remove((Serializable)CreativeApplicationId);
	}

	/**
	 * Removes the creative application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the creative application
	 * @return the creative application that was removed
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication remove(Serializable primaryKey)
		throws NoSuchCreativeApplicationException {

		Session session = null;

		try {
			session = openSession();

			CreativeApplication creativeApplication =
				(CreativeApplication)session.get(
					CreativeApplicationImpl.class, primaryKey);

			if (creativeApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCreativeApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(creativeApplication);
		}
		catch (NoSuchCreativeApplicationException noSuchEntityException) {
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
	protected CreativeApplication removeImpl(
		CreativeApplication creativeApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(creativeApplication)) {
				creativeApplication = (CreativeApplication)session.get(
					CreativeApplicationImpl.class,
					creativeApplication.getPrimaryKeyObj());
			}

			if (creativeApplication != null) {
				session.delete(creativeApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (creativeApplication != null) {
			clearCache(creativeApplication);
		}

		return creativeApplication;
	}

	@Override
	public CreativeApplication updateImpl(
		CreativeApplication creativeApplication) {

		boolean isNew = creativeApplication.isNew();

		if (!(creativeApplication instanceof CreativeApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(creativeApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					creativeApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in creativeApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CreativeApplication implementation " +
					creativeApplication.getClass());
		}

		CreativeApplicationModelImpl creativeApplicationModelImpl =
			(CreativeApplicationModelImpl)creativeApplication;

		if (Validator.isNull(creativeApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			creativeApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (creativeApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				creativeApplication.setCreateDate(date);
			}
			else {
				creativeApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!creativeApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				creativeApplication.setModifiedDate(date);
			}
			else {
				creativeApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(creativeApplication);
			}
			else {
				creativeApplication = (CreativeApplication)session.merge(
					creativeApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CreativeApplicationImpl.class, creativeApplicationModelImpl, false,
			true);

		cacheUniqueFindersCache(creativeApplicationModelImpl);

		if (isNew) {
			creativeApplication.setNew(false);
		}

		creativeApplication.resetOriginalValues();

		return creativeApplication;
	}

	/**
	 * Returns the creative application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the creative application
	 * @return the creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCreativeApplicationException {

		CreativeApplication creativeApplication = fetchByPrimaryKey(primaryKey);

		if (creativeApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCreativeApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return creativeApplication;
	}

	/**
	 * Returns the creative application with the primary key or throws a <code>NoSuchCreativeApplicationException</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application
	 * @throws NoSuchCreativeApplicationException if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication findByPrimaryKey(long CreativeApplicationId)
		throws NoSuchCreativeApplicationException {

		return findByPrimaryKey((Serializable)CreativeApplicationId);
	}

	/**
	 * Returns the creative application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param CreativeApplicationId the primary key of the creative application
	 * @return the creative application, or <code>null</code> if a creative application with the primary key could not be found
	 */
	@Override
	public CreativeApplication fetchByPrimaryKey(long CreativeApplicationId) {
		return fetchByPrimaryKey((Serializable)CreativeApplicationId);
	}

	/**
	 * Returns all the creative applications.
	 *
	 * @return the creative applications
	 */
	@Override
	public List<CreativeApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @return the range of creative applications
	 */
	@Override
	public List<CreativeApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of creative applications
	 */
	@Override
	public List<CreativeApplication> findAll(
		int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the creative applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CreativeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of creative applications
	 * @param end the upper bound of the range of creative applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of creative applications
	 */
	@Override
	public List<CreativeApplication> findAll(
		int start, int end,
		OrderByComparator<CreativeApplication> orderByComparator,
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

		List<CreativeApplication> list = null;

		if (useFinderCache) {
			list = (List<CreativeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CREATIVEAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CREATIVEAPPLICATION;

				sql = sql.concat(CreativeApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CreativeApplication>)QueryUtil.list(
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
	 * Removes all the creative applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CreativeApplication creativeApplication : findAll()) {
			remove(creativeApplication);
		}
	}

	/**
	 * Returns the number of creative applications.
	 *
	 * @return the number of creative applications
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
					_SQL_COUNT_CREATIVEAPPLICATION);

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
		return "CreativeApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CREATIVEAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CreativeApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the creative application persistence.
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

		_finderPathFetchBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, true);

		_finderPathCountBygetCreativeById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCreativeById",
			new String[] {Long.class.getName()},
			new String[] {"CreativeApplicationId"}, false);

		_finderPathWithPaginationFindBygetCreativeApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCreativeApplicationByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetCreativeApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCreativeApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetCreativeApplicationByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCreativeApplicationByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetCreativeByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCreativeByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetCreativeByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetCreativeByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, true);

		_finderPathCountBygetCreativeByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCreativeByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetCreativeByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativeByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetCreativeByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCreativeByAppNo", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetCreativeBy_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCreativeBy_CI",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCreativeBy_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCreativeBy_CI", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		CreativeApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CreativeApplicationUtil.setPersistence(null);

		entityCache.removeCache(CreativeApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CREATIVEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CREATIVEAPPLICATION =
		"SELECT creativeApplication FROM CreativeApplication creativeApplication";

	private static final String _SQL_SELECT_CREATIVEAPPLICATION_WHERE =
		"SELECT creativeApplication FROM CreativeApplication creativeApplication WHERE ";

	private static final String _SQL_COUNT_CREATIVEAPPLICATION =
		"SELECT COUNT(creativeApplication) FROM CreativeApplication creativeApplication";

	private static final String _SQL_COUNT_CREATIVEAPPLICATION_WHERE =
		"SELECT COUNT(creativeApplication) FROM CreativeApplication creativeApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "creativeApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CreativeApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CreativeApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CreativeApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
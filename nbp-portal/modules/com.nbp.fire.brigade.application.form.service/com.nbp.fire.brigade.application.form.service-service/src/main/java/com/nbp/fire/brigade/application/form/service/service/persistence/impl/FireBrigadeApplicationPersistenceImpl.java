/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.fire.brigade.application.form.service.service.persistence.impl;

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

import com.nbp.fire.brigade.application.form.service.exception.NoSuchFireBrigadeApplicationException;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplication;
import com.nbp.fire.brigade.application.form.service.model.FireBrigadeApplicationTable;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationImpl;
import com.nbp.fire.brigade.application.form.service.model.impl.FireBrigadeApplicationModelImpl;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeApplicationPersistence;
import com.nbp.fire.brigade.application.form.service.service.persistence.FireBrigadeApplicationUtil;
import com.nbp.fire.brigade.application.form.service.service.persistence.impl.constants.FIRE_BRIGADEPersistenceConstants;

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
 * The persistence implementation for the fire brigade application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FireBrigadeApplicationPersistence.class)
public class FireBrigadeApplicationPersistenceImpl
	extends BasePersistenceImpl<FireBrigadeApplication>
	implements FireBrigadeApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FireBrigadeApplicationUtil</code> to access the fire brigade application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FireBrigadeApplicationImpl.class.getName();

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
	 * Returns all the fire brigade applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		List<FireBrigadeApplication> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplication fireBrigadeApplication : list) {
					if (!uuid.equals(fireBrigadeApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

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
				sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplication>)QueryUtil.list(
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
	 * Returns the first fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findByUuid_First(
			String uuid,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchByUuid_First(
		String uuid,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		List<FireBrigadeApplication> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findByUuid_Last(
			String uuid,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchByUuid_Last(
		String uuid,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where uuid = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication[] findByUuid_PrevAndNext(
			long fireBrigadeApplicationId, String uuid,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		uuid = Objects.toString(uuid, "");

		FireBrigadeApplication fireBrigadeApplication = findByPrimaryKey(
			fireBrigadeApplicationId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplication[] array = new FireBrigadeApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, fireBrigadeApplication, uuid, orderByComparator, true);

			array[1] = fireBrigadeApplication;

			array[2] = getByUuid_PrevAndNext(
				session, fireBrigadeApplication, uuid, orderByComparator,
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

	protected FireBrigadeApplication getByUuid_PrevAndNext(
		Session session, FireBrigadeApplication fireBrigadeApplication,
		String uuid,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

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
			sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FireBrigadeApplication fireBrigadeApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeApplication);
		}
	}

	/**
	 * Returns the number of fire brigade applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

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
		"fireBrigadeApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(fireBrigadeApplication.uuid IS NULL OR fireBrigadeApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = fetchByUUID_G(
			uuid, groupId);

		if (fireBrigadeApplication == null) {
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

			throw new NoSuchFireBrigadeApplicationException(sb.toString());
		}

		return fireBrigadeApplication;
	}

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the fire brigade application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchByUUID_G(
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

		if (result instanceof FireBrigadeApplication) {
			FireBrigadeApplication fireBrigadeApplication =
				(FireBrigadeApplication)result;

			if (!Objects.equals(uuid, fireBrigadeApplication.getUuid()) ||
				(groupId != fireBrigadeApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

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

				List<FireBrigadeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					FireBrigadeApplication fireBrigadeApplication = list.get(0);

					result = fireBrigadeApplication;

					cacheResult(fireBrigadeApplication);
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
			return (FireBrigadeApplication)result;
		}
	}

	/**
	 * Removes the fire brigade application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the fire brigade application that was removed
	 */
	@Override
	public FireBrigadeApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = findByUUID_G(
			uuid, groupId);

		return remove(fireBrigadeApplication);
	}

	/**
	 * Returns the number of fire brigade applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

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
		"fireBrigadeApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(fireBrigadeApplication.uuid IS NULL OR fireBrigadeApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"fireBrigadeApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		List<FireBrigadeApplication> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplication fireBrigadeApplication : list) {
					if (!uuid.equals(fireBrigadeApplication.getUuid()) ||
						(companyId != fireBrigadeApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

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
				sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplication>)QueryUtil.list(
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
	 * Returns the first fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		List<FireBrigadeApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication[] findByUuid_C_PrevAndNext(
			long fireBrigadeApplicationId, String uuid, long companyId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		uuid = Objects.toString(uuid, "");

		FireBrigadeApplication fireBrigadeApplication = findByPrimaryKey(
			fireBrigadeApplicationId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplication[] array = new FireBrigadeApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, fireBrigadeApplication, uuid, companyId,
				orderByComparator, true);

			array[1] = fireBrigadeApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, fireBrigadeApplication, uuid, companyId,
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

	protected FireBrigadeApplication getByUuid_C_PrevAndNext(
		Session session, FireBrigadeApplication fireBrigadeApplication,
		String uuid, long companyId,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

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
			sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (FireBrigadeApplication fireBrigadeApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(fireBrigadeApplication);
		}
	}

	/**
	 * Returns the number of fire brigade applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

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
		"fireBrigadeApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(fireBrigadeApplication.uuid IS NULL OR fireBrigadeApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"fireBrigadeApplication.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFireBrigadeByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetFireBrigadeByS_U;
	private FinderPath _finderPathCountBygetFireBrigadeByS_U;

	/**
	 * Returns all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId) {

		return findBygetFireBrigadeByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end) {

		return findBygetFireBrigadeByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return findBygetFireBrigadeByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFireBrigadeByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFireBrigadeByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<FireBrigadeApplication> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplication fireBrigadeApplication : list) {
					if ((status != fireBrigadeApplication.getStatus()) ||
						(userId != fireBrigadeApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<FireBrigadeApplication>)QueryUtil.list(
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
	 * Returns the first fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByS_U_First(
			int status, long userId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByS_U_First(status, userId, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByS_U_First(
		int status, long userId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		List<FireBrigadeApplication> list = findBygetFireBrigadeByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByS_U_Last(
			int status, long userId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByS_U_Last(status, userId, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByS_U_Last(
		int status, long userId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		int count = countBygetFireBrigadeByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplication> list = findBygetFireBrigadeByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication[] findBygetFireBrigadeByS_U_PrevAndNext(
			long fireBrigadeApplicationId, int status, long userId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = findByPrimaryKey(
			fireBrigadeApplicationId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplication[] array = new FireBrigadeApplicationImpl[3];

			array[0] = getBygetFireBrigadeByS_U_PrevAndNext(
				session, fireBrigadeApplication, status, userId,
				orderByComparator, true);

			array[1] = fireBrigadeApplication;

			array[2] = getBygetFireBrigadeByS_U_PrevAndNext(
				session, fireBrigadeApplication, status, userId,
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

	protected FireBrigadeApplication getBygetFireBrigadeByS_U_PrevAndNext(
		Session session, FireBrigadeApplication fireBrigadeApplication,
		int status, long userId,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYS_U_USERID_2);

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
			sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetFireBrigadeByS_U(int status, long userId) {
		for (FireBrigadeApplication fireBrigadeApplication :
				findBygetFireBrigadeByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(fireBrigadeApplication);
		}
	}

	/**
	 * Returns the number of fire brigade applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFireBrigadeByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYS_U_USERID_2);

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

	private static final String _FINDER_COLUMN_GETFIREBRIGADEBYS_U_STATUS_2 =
		"fireBrigadeApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETFIREBRIGADEBYS_U_USERID_2 =
		"fireBrigadeApplication.userId = ?";

	private FinderPath _finderPathFetchBygetFireBrigadeStatusByCaseId;
	private FinderPath _finderPathCountBygetFireBrigadeStatusByCaseId;

	/**
	 * Returns the fire brigade application where caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeStatusByCaseId(
			String caseId)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeStatusByCaseId(caseId);

		if (fireBrigadeApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeApplicationException(sb.toString());
		}

		return fireBrigadeApplication;
	}

	/**
	 * Returns the fire brigade application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeStatusByCaseId(
		String caseId) {

		return fetchBygetFireBrigadeStatusByCaseId(caseId, true);
	}

	/**
	 * Returns the fire brigade application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeStatusByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigadeStatusByCaseId, finderArgs,
				this);
		}

		if (result instanceof FireBrigadeApplication) {
			FireBrigadeApplication fireBrigadeApplication =
				(FireBrigadeApplication)result;

			if (!Objects.equals(caseId, fireBrigadeApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADESTATUSBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADESTATUSBYCASEID_CASEID_2);
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

				List<FireBrigadeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadeStatusByCaseId,
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
								"FireBrigadeApplicationPersistenceImpl.fetchBygetFireBrigadeStatusByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplication fireBrigadeApplication = list.get(0);

					result = fireBrigadeApplication;

					cacheResult(fireBrigadeApplication);
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
			return (FireBrigadeApplication)result;
		}
	}

	/**
	 * Removes the fire brigade application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the fire brigade application that was removed
	 */
	@Override
	public FireBrigadeApplication removeBygetFireBrigadeStatusByCaseId(
			String caseId)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			findBygetFireBrigadeStatusByCaseId(caseId);

		return remove(fireBrigadeApplication);
	}

	/**
	 * Returns the number of fire brigade applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFireBrigadeStatusByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFireBrigadeStatusByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADESTATUSBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADESTATUSBYCASEID_CASEID_2);
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
		_FINDER_COLUMN_GETFIREBRIGADESTATUSBYCASEID_CASEID_2 =
			"fireBrigadeApplication.caseId = ?";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADESTATUSBYCASEID_CASEID_3 =
			"(fireBrigadeApplication.caseId IS NULL OR fireBrigadeApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFireBrigadeByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetFireBrigadeByStatus;
	private FinderPath _finderPathCountBygetFireBrigadeByStatus;

	/**
	 * Returns all the fire brigade applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status) {

		return findBygetFireBrigadeByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end) {

		return findBygetFireBrigadeByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return findBygetFireBrigadeByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByStatus(
		int status, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFireBrigadeByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFireBrigadeByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<FireBrigadeApplication> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplication fireBrigadeApplication : list) {
					if (status != fireBrigadeApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<FireBrigadeApplication>)QueryUtil.list(
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
	 * Returns the first fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByStatus_First(
			int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByStatus_First(status, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByStatus_First(
		int status,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		List<FireBrigadeApplication> list = findBygetFireBrigadeByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByStatus_Last(
			int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByStatus_Last(status, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByStatus_Last(
		int status,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		int count = countBygetFireBrigadeByStatus(status);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplication> list = findBygetFireBrigadeByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where status = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication[] findBygetFireBrigadeByStatus_PrevAndNext(
			long fireBrigadeApplicationId, int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = findByPrimaryKey(
			fireBrigadeApplicationId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplication[] array = new FireBrigadeApplicationImpl[3];

			array[0] = getBygetFireBrigadeByStatus_PrevAndNext(
				session, fireBrigadeApplication, status, orderByComparator,
				true);

			array[1] = fireBrigadeApplication;

			array[2] = getBygetFireBrigadeByStatus_PrevAndNext(
				session, fireBrigadeApplication, status, orderByComparator,
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

	protected FireBrigadeApplication getBygetFireBrigadeByStatus_PrevAndNext(
		Session session, FireBrigadeApplication fireBrigadeApplication,
		int status, OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYSTATUS_STATUS_2);

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
			sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetFireBrigadeByStatus(int status) {
		for (FireBrigadeApplication fireBrigadeApplication :
				findBygetFireBrigadeByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeApplication);
		}
	}

	/**
	 * Returns the number of fire brigade applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFireBrigadeByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetFireBrigadeByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETFIREBRIGADEBYSTATUS_STATUS_2 =
		"fireBrigadeApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetFireBrigadeByEntityId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFireBrigadeByEntityId;
	private FinderPath _finderPathCountBygetFireBrigadeByEntityId;

	/**
	 * Returns all the fire brigade applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId) {

		return findBygetFireBrigadeByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId, int start, int end) {

		return findBygetFireBrigadeByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return findBygetFireBrigadeByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId(
		String entityId, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFireBrigadeByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFireBrigadeByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<FireBrigadeApplication> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplication fireBrigadeApplication : list) {
					if (!entityId.equals(
							fireBrigadeApplication.getEntityId())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplication>)QueryUtil.list(
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
	 * Returns the first fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_First(
			String entityId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByEntityId_First(entityId, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_First(
		String entityId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		List<FireBrigadeApplication> list = findBygetFireBrigadeByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_Last(
			String entityId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByEntityId_Last(entityId, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_Last(
		String entityId,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		int count = countBygetFireBrigadeByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplication> list = findBygetFireBrigadeByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where entityId = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication[] findBygetFireBrigadeByEntityId_PrevAndNext(
			long fireBrigadeApplicationId, String entityId,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		entityId = Objects.toString(entityId, "");

		FireBrigadeApplication fireBrigadeApplication = findByPrimaryKey(
			fireBrigadeApplicationId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplication[] array = new FireBrigadeApplicationImpl[3];

			array[0] = getBygetFireBrigadeByEntityId_PrevAndNext(
				session, fireBrigadeApplication, entityId, orderByComparator,
				true);

			array[1] = fireBrigadeApplication;

			array[2] = getBygetFireBrigadeByEntityId_PrevAndNext(
				session, fireBrigadeApplication, entityId, orderByComparator,
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

	protected FireBrigadeApplication getBygetFireBrigadeByEntityId_PrevAndNext(
		Session session, FireBrigadeApplication fireBrigadeApplication,
		String entityId,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_2);
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
			sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetFireBrigadeByEntityId(String entityId) {
		for (FireBrigadeApplication fireBrigadeApplication :
				findBygetFireBrigadeByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(fireBrigadeApplication);
		}
	}

	/**
	 * Returns the number of fire brigade applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFireBrigadeByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetFireBrigadeByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_2);
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

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_2 =
			"fireBrigadeApplication.entityId = ?";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_ENTITYID_3 =
			"(fireBrigadeApplication.entityId IS NULL OR fireBrigadeApplication.entityId = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetFireBrigadeByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFireBrigadeByEntityId_Status;
	private FinderPath _finderPathCountBygetFireBrigadeByEntityId_Status;

	/**
	 * Returns all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId_Status(
		String entityId, int status) {

		return findBygetFireBrigadeByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetFireBrigadeByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return findBygetFireBrigadeByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findBygetFireBrigadeByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFireBrigadeByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFireBrigadeByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<FireBrigadeApplication> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FireBrigadeApplication fireBrigadeApplication : list) {
					if (!entityId.equals(
							fireBrigadeApplication.getEntityId()) ||
						(status != fireBrigadeApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FireBrigadeApplication>)QueryUtil.list(
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
	 * Returns the first fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByEntityId_Status_First(
				entityId, status, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the first fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		List<FireBrigadeApplication> list =
			findBygetFireBrigadeByEntityId_Status(
				entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByEntityId_Status_Last(
				entityId, status, orderByComparator);

		if (fireBrigadeApplication != null) {
			return fireBrigadeApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFireBrigadeApplicationException(sb.toString());
	}

	/**
	 * Returns the last fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		int count = countBygetFireBrigadeByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<FireBrigadeApplication> list =
			findBygetFireBrigadeByEntityId_Status(
				entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the fire brigade applications before and after the current fire brigade application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param fireBrigadeApplicationId the primary key of the current fire brigade application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication[]
			findBygetFireBrigadeByEntityId_Status_PrevAndNext(
				long fireBrigadeApplicationId, String entityId, int status,
				OrderByComparator<FireBrigadeApplication> orderByComparator)
		throws NoSuchFireBrigadeApplicationException {

		entityId = Objects.toString(entityId, "");

		FireBrigadeApplication fireBrigadeApplication = findByPrimaryKey(
			fireBrigadeApplicationId);

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplication[] array = new FireBrigadeApplicationImpl[3];

			array[0] = getBygetFireBrigadeByEntityId_Status_PrevAndNext(
				session, fireBrigadeApplication, entityId, status,
				orderByComparator, true);

			array[1] = fireBrigadeApplication;

			array[2] = getBygetFireBrigadeByEntityId_Status_PrevAndNext(
				session, fireBrigadeApplication, entityId, status,
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

	protected FireBrigadeApplication
		getBygetFireBrigadeByEntityId_Status_PrevAndNext(
			Session session, FireBrigadeApplication fireBrigadeApplication,
			String entityId, int status,
			OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(
				_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_STATUS_2);

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
			sb.append(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
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
						fireBrigadeApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FireBrigadeApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the fire brigade applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetFireBrigadeByEntityId_Status(
		String entityId, int status) {

		for (FireBrigadeApplication fireBrigadeApplication :
				findBygetFireBrigadeByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(fireBrigadeApplication);
		}
	}

	/**
	 * Returns the number of fire brigade applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFireBrigadeByEntityId_Status(
		String entityId, int status) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath =
			_finderPathCountBygetFireBrigadeByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_STATUS_2);

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
		_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_2 =
			"fireBrigadeApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_ENTITYID_3 =
			"(fireBrigadeApplication.entityId IS NULL OR fireBrigadeApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYENTITYID_STATUS_STATUS_2 =
			"fireBrigadeApplication.status = ?";

	private FinderPath _finderPathFetchBygetFireBrigadeByEI_CI;
	private FinderPath _finderPathCountBygetFireBrigadeByEI_CI;

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByEI_CI(entityId, caseId);

		if (fireBrigadeApplication == null) {
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

			throw new NoSuchFireBrigadeApplicationException(sb.toString());
		}

		return fireBrigadeApplication;
	}

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByEI_CI(
		String entityId, String caseId) {

		return fetchBygetFireBrigadeByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the fire brigade application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByEI_CI(
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
				_finderPathFetchBygetFireBrigadeByEI_CI, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplication) {
			FireBrigadeApplication fireBrigadeApplication =
				(FireBrigadeApplication)result;

			if (!Objects.equals(
					entityId, fireBrigadeApplication.getEntityId()) ||
				!Objects.equals(caseId, fireBrigadeApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_CASEID_2);
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

				List<FireBrigadeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadeByEI_CI, finderArgs,
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
								"FireBrigadeApplicationPersistenceImpl.fetchBygetFireBrigadeByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplication fireBrigadeApplication = list.get(0);

					result = fireBrigadeApplication;

					cacheResult(fireBrigadeApplication);
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
			return (FireBrigadeApplication)result;
		}
	}

	/**
	 * Removes the fire brigade application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the fire brigade application that was removed
	 */
	@Override
	public FireBrigadeApplication removeBygetFireBrigadeByEI_CI(
			String entityId, String caseId)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			findBygetFireBrigadeByEI_CI(entityId, caseId);

		return remove(fireBrigadeApplication);
	}

	/**
	 * Returns the number of fire brigade applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFireBrigadeByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFireBrigadeByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_ENTITYID_2 =
			"fireBrigadeApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_ENTITYID_3 =
			"(fireBrigadeApplication.entityId IS NULL OR fireBrigadeApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_CASEID_2 =
		"fireBrigadeApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETFIREBRIGADEBYEI_CI_CASEID_3 =
		"(fireBrigadeApplication.caseId IS NULL OR fireBrigadeApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetFireBrigadeByAppNo;
	private FinderPath _finderPathCountBygetFireBrigadeByAppNo;

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFireBrigadeByAppNo(
			String applicationNumber)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFireBrigadeByAppNo(applicationNumber);

		if (fireBrigadeApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeApplicationException(sb.toString());
		}

		return fireBrigadeApplication;
	}

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByAppNo(
		String applicationNumber) {

		return fetchBygetFireBrigadeByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the fire brigade application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFireBrigadeByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFireBrigadeByAppNo, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplication) {
			FireBrigadeApplication fireBrigadeApplication =
				(FireBrigadeApplication)result;

			if (!Objects.equals(
					applicationNumber,
					fireBrigadeApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYAPPNO_APPLICATIONNUMBER_2);
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

				List<FireBrigadeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFireBrigadeByAppNo, finderArgs,
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
								"FireBrigadeApplicationPersistenceImpl.fetchBygetFireBrigadeByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplication fireBrigadeApplication = list.get(0);

					result = fireBrigadeApplication;

					cacheResult(fireBrigadeApplication);
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
			return (FireBrigadeApplication)result;
		}
	}

	/**
	 * Removes the fire brigade application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the fire brigade application that was removed
	 */
	@Override
	public FireBrigadeApplication removeBygetFireBrigadeByAppNo(
			String applicationNumber)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			findBygetFireBrigadeByAppNo(applicationNumber);

		return remove(fireBrigadeApplication);
	}

	/**
	 * Returns the number of fire brigade applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFireBrigadeByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetFireBrigadeByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFIREBRIGADEBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETFIREBRIGADEBYAPPNO_APPLICATIONNUMBER_2 =
			"fireBrigadeApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFIREBRIGADEBYAPPNO_APPLICATIONNUMBER_3 =
			"(fireBrigadeApplication.applicationNumber IS NULL OR fireBrigadeApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetFB_AppType_AppNo;
	private FinderPath _finderPathCountBygetFB_AppType_AppNo;

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication findBygetFB_AppType_AppNo(
			String typeOfTransaction, String applicationNumber)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			fetchBygetFB_AppType_AppNo(typeOfTransaction, applicationNumber);

		if (fireBrigadeApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfTransaction=");
			sb.append(typeOfTransaction);

			sb.append(", applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFireBrigadeApplicationException(sb.toString());
		}

		return fireBrigadeApplication;
	}

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber) {

		return fetchBygetFB_AppType_AppNo(
			typeOfTransaction, applicationNumber, true);
	}

	/**
	 * Returns the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching fire brigade application, or <code>null</code> if a matching fire brigade application could not be found
	 */
	@Override
	public FireBrigadeApplication fetchBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber,
		boolean useFinderCache) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {typeOfTransaction, applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFB_AppType_AppNo, finderArgs, this);
		}

		if (result instanceof FireBrigadeApplication) {
			FireBrigadeApplication fireBrigadeApplication =
				(FireBrigadeApplication)result;

			if (!Objects.equals(
					typeOfTransaction,
					fireBrigadeApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					applicationNumber,
					fireBrigadeApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_APPLICATIONNUMBER_2);
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

				if (bindApplicationNumber) {
					queryPos.add(applicationNumber);
				}

				List<FireBrigadeApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFB_AppType_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfTransaction, applicationNumber
								};
							}

							_log.warn(
								"FireBrigadeApplicationPersistenceImpl.fetchBygetFB_AppType_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FireBrigadeApplication fireBrigadeApplication = list.get(0);

					result = fireBrigadeApplication;

					cacheResult(fireBrigadeApplication);
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
			return (FireBrigadeApplication)result;
		}
	}

	/**
	 * Removes the fire brigade application where typeOfTransaction = &#63; and applicationNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the fire brigade application that was removed
	 */
	@Override
	public FireBrigadeApplication removeBygetFB_AppType_AppNo(
			String typeOfTransaction, String applicationNumber)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication =
			findBygetFB_AppType_AppNo(typeOfTransaction, applicationNumber);

		return remove(fireBrigadeApplication);
	}

	/**
	 * Returns the number of fire brigade applications where typeOfTransaction = &#63; and applicationNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param applicationNumber the application number
	 * @return the number of matching fire brigade applications
	 */
	@Override
	public int countBygetFB_AppType_AppNo(
		String typeOfTransaction, String applicationNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetFB_AppType_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, applicationNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETFB_APPTYPE_APPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETFB_APPTYPE_APPNO_TYPEOFTRANSACTION_2 =
			"fireBrigadeApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFB_APPTYPE_APPNO_TYPEOFTRANSACTION_3 =
			"(fireBrigadeApplication.typeOfTransaction IS NULL OR fireBrigadeApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFB_APPTYPE_APPNO_APPLICATIONNUMBER_2 =
			"fireBrigadeApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFB_APPTYPE_APPNO_APPLICATIONNUMBER_3 =
			"(fireBrigadeApplication.applicationNumber IS NULL OR fireBrigadeApplication.applicationNumber = '')";

	public FireBrigadeApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FireBrigadeApplication.class);

		setModelImplClass(FireBrigadeApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(FireBrigadeApplicationTable.INSTANCE);
	}

	/**
	 * Caches the fire brigade application in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplication the fire brigade application
	 */
	@Override
	public void cacheResult(FireBrigadeApplication fireBrigadeApplication) {
		entityCache.putResult(
			FireBrigadeApplicationImpl.class,
			fireBrigadeApplication.getPrimaryKey(), fireBrigadeApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				fireBrigadeApplication.getUuid(),
				fireBrigadeApplication.getGroupId()
			},
			fireBrigadeApplication);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeStatusByCaseId,
			new Object[] {fireBrigadeApplication.getCaseId()},
			fireBrigadeApplication);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByEI_CI,
			new Object[] {
				fireBrigadeApplication.getEntityId(),
				fireBrigadeApplication.getCaseId()
			},
			fireBrigadeApplication);

		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppNo,
			new Object[] {fireBrigadeApplication.getApplicationNumber()},
			fireBrigadeApplication);

		finderCache.putResult(
			_finderPathFetchBygetFB_AppType_AppNo,
			new Object[] {
				fireBrigadeApplication.getTypeOfTransaction(),
				fireBrigadeApplication.getApplicationNumber()
			},
			fireBrigadeApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the fire brigade applications in the entity cache if it is enabled.
	 *
	 * @param fireBrigadeApplications the fire brigade applications
	 */
	@Override
	public void cacheResult(
		List<FireBrigadeApplication> fireBrigadeApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (fireBrigadeApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FireBrigadeApplication fireBrigadeApplication :
				fireBrigadeApplications) {

			if (entityCache.getResult(
					FireBrigadeApplicationImpl.class,
					fireBrigadeApplication.getPrimaryKey()) == null) {

				cacheResult(fireBrigadeApplication);
			}
		}
	}

	/**
	 * Clears the cache for all fire brigade applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FireBrigadeApplicationImpl.class);

		finderCache.clearCache(FireBrigadeApplicationImpl.class);
	}

	/**
	 * Clears the cache for the fire brigade application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FireBrigadeApplication fireBrigadeApplication) {
		entityCache.removeResult(
			FireBrigadeApplicationImpl.class, fireBrigadeApplication);
	}

	@Override
	public void clearCache(
		List<FireBrigadeApplication> fireBrigadeApplications) {

		for (FireBrigadeApplication fireBrigadeApplication :
				fireBrigadeApplications) {

			entityCache.removeResult(
				FireBrigadeApplicationImpl.class, fireBrigadeApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FireBrigadeApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FireBrigadeApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FireBrigadeApplicationModelImpl fireBrigadeApplicationModelImpl) {

		Object[] args = new Object[] {
			fireBrigadeApplicationModelImpl.getUuid(),
			fireBrigadeApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, fireBrigadeApplicationModelImpl);

		args = new Object[] {fireBrigadeApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeStatusByCaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeStatusByCaseId, args,
			fireBrigadeApplicationModelImpl);

		args = new Object[] {
			fireBrigadeApplicationModelImpl.getEntityId(),
			fireBrigadeApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByEI_CI, args,
			fireBrigadeApplicationModelImpl);

		args = new Object[] {
			fireBrigadeApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetFireBrigadeByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFireBrigadeByAppNo, args,
			fireBrigadeApplicationModelImpl);

		args = new Object[] {
			fireBrigadeApplicationModelImpl.getTypeOfTransaction(),
			fireBrigadeApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetFB_AppType_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFB_AppType_AppNo, args,
			fireBrigadeApplicationModelImpl);
	}

	/**
	 * Creates a new fire brigade application with the primary key. Does not add the fire brigade application to the database.
	 *
	 * @param fireBrigadeApplicationId the primary key for the new fire brigade application
	 * @return the new fire brigade application
	 */
	@Override
	public FireBrigadeApplication create(long fireBrigadeApplicationId) {
		FireBrigadeApplication fireBrigadeApplication =
			new FireBrigadeApplicationImpl();

		fireBrigadeApplication.setNew(true);
		fireBrigadeApplication.setPrimaryKey(fireBrigadeApplicationId);

		String uuid = PortalUUIDUtil.generate();

		fireBrigadeApplication.setUuid(uuid);

		fireBrigadeApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return fireBrigadeApplication;
	}

	/**
	 * Removes the fire brigade application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application that was removed
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication remove(long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeApplicationException {

		return remove((Serializable)fireBrigadeApplicationId);
	}

	/**
	 * Removes the fire brigade application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the fire brigade application
	 * @return the fire brigade application that was removed
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication remove(Serializable primaryKey)
		throws NoSuchFireBrigadeApplicationException {

		Session session = null;

		try {
			session = openSession();

			FireBrigadeApplication fireBrigadeApplication =
				(FireBrigadeApplication)session.get(
					FireBrigadeApplicationImpl.class, primaryKey);

			if (fireBrigadeApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFireBrigadeApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(fireBrigadeApplication);
		}
		catch (NoSuchFireBrigadeApplicationException noSuchEntityException) {
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
	protected FireBrigadeApplication removeImpl(
		FireBrigadeApplication fireBrigadeApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(fireBrigadeApplication)) {
				fireBrigadeApplication = (FireBrigadeApplication)session.get(
					FireBrigadeApplicationImpl.class,
					fireBrigadeApplication.getPrimaryKeyObj());
			}

			if (fireBrigadeApplication != null) {
				session.delete(fireBrigadeApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (fireBrigadeApplication != null) {
			clearCache(fireBrigadeApplication);
		}

		return fireBrigadeApplication;
	}

	@Override
	public FireBrigadeApplication updateImpl(
		FireBrigadeApplication fireBrigadeApplication) {

		boolean isNew = fireBrigadeApplication.isNew();

		if (!(fireBrigadeApplication instanceof
				FireBrigadeApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(fireBrigadeApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					fireBrigadeApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in fireBrigadeApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FireBrigadeApplication implementation " +
					fireBrigadeApplication.getClass());
		}

		FireBrigadeApplicationModelImpl fireBrigadeApplicationModelImpl =
			(FireBrigadeApplicationModelImpl)fireBrigadeApplication;

		if (Validator.isNull(fireBrigadeApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			fireBrigadeApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (fireBrigadeApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				fireBrigadeApplication.setCreateDate(date);
			}
			else {
				fireBrigadeApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!fireBrigadeApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				fireBrigadeApplication.setModifiedDate(date);
			}
			else {
				fireBrigadeApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(fireBrigadeApplication);
			}
			else {
				fireBrigadeApplication = (FireBrigadeApplication)session.merge(
					fireBrigadeApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FireBrigadeApplicationImpl.class, fireBrigadeApplicationModelImpl,
			false, true);

		cacheUniqueFindersCache(fireBrigadeApplicationModelImpl);

		if (isNew) {
			fireBrigadeApplication.setNew(false);
		}

		fireBrigadeApplication.resetOriginalValues();

		return fireBrigadeApplication;
	}

	/**
	 * Returns the fire brigade application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the fire brigade application
	 * @return the fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFireBrigadeApplicationException {

		FireBrigadeApplication fireBrigadeApplication = fetchByPrimaryKey(
			primaryKey);

		if (fireBrigadeApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFireBrigadeApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return fireBrigadeApplication;
	}

	/**
	 * Returns the fire brigade application with the primary key or throws a <code>NoSuchFireBrigadeApplicationException</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application
	 * @throws NoSuchFireBrigadeApplicationException if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication findByPrimaryKey(
			long fireBrigadeApplicationId)
		throws NoSuchFireBrigadeApplicationException {

		return findByPrimaryKey((Serializable)fireBrigadeApplicationId);
	}

	/**
	 * Returns the fire brigade application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fireBrigadeApplicationId the primary key of the fire brigade application
	 * @return the fire brigade application, or <code>null</code> if a fire brigade application with the primary key could not be found
	 */
	@Override
	public FireBrigadeApplication fetchByPrimaryKey(
		long fireBrigadeApplicationId) {

		return fetchByPrimaryKey((Serializable)fireBrigadeApplicationId);
	}

	/**
	 * Returns all the fire brigade applications.
	 *
	 * @return the fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @return the range of fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the fire brigade applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FireBrigadeApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of fire brigade applications
	 * @param end the upper bound of the range of fire brigade applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of fire brigade applications
	 */
	@Override
	public List<FireBrigadeApplication> findAll(
		int start, int end,
		OrderByComparator<FireBrigadeApplication> orderByComparator,
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

		List<FireBrigadeApplication> list = null;

		if (useFinderCache) {
			list = (List<FireBrigadeApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FIREBRIGADEAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FIREBRIGADEAPPLICATION;

				sql = sql.concat(FireBrigadeApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FireBrigadeApplication>)QueryUtil.list(
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
	 * Removes all the fire brigade applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FireBrigadeApplication fireBrigadeApplication : findAll()) {
			remove(fireBrigadeApplication);
		}
	}

	/**
	 * Returns the number of fire brigade applications.
	 *
	 * @return the number of fire brigade applications
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
					_SQL_COUNT_FIREBRIGADEAPPLICATION);

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
		return "fireBrigadeApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FIREBRIGADEAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FireBrigadeApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the fire brigade application persistence.
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

		_finderPathWithPaginationFindBygetFireBrigadeByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFireBrigadeByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetFireBrigadeByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetFireBrigadeByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetFireBrigadeByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetFireBrigadeStatusByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigadeStatusByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFireBrigadeStatusByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeStatusByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFireBrigadeByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetFireBrigadeByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetFireBrigadeByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFireBrigadeByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetFireBrigadeByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetFireBrigadeByEntityId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFireBrigadeByEntityId",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetFireBrigadeByEntityId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFireBrigadeByEntityId",
				new String[] {String.class.getName()},
				new String[] {"entityId"}, true);

		_finderPathCountBygetFireBrigadeByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByEntityId",
			new String[] {String.class.getName()}, new String[] {"entityId"},
			false);

		_finderPathWithPaginationFindBygetFireBrigadeByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFireBrigadeByEntityId_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetFireBrigadeByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFireBrigadeByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetFireBrigadeByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetFireBrigadeByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigadeByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetFireBrigadeByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetFireBrigadeByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFireBrigadeByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetFireBrigadeByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFireBrigadeByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetFB_AppType_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFB_AppType_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "applicationNumber"}, true);

		_finderPathCountBygetFB_AppType_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFB_AppType_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "applicationNumber"}, false);

		FireBrigadeApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FireBrigadeApplicationUtil.setPersistence(null);

		entityCache.removeCache(FireBrigadeApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FIRE_BRIGADEPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FIREBRIGADEAPPLICATION =
		"SELECT fireBrigadeApplication FROM FireBrigadeApplication fireBrigadeApplication";

	private static final String _SQL_SELECT_FIREBRIGADEAPPLICATION_WHERE =
		"SELECT fireBrigadeApplication FROM FireBrigadeApplication fireBrigadeApplication WHERE ";

	private static final String _SQL_COUNT_FIREBRIGADEAPPLICATION =
		"SELECT COUNT(fireBrigadeApplication) FROM FireBrigadeApplication fireBrigadeApplication";

	private static final String _SQL_COUNT_FIREBRIGADEAPPLICATION_WHERE =
		"SELECT COUNT(fireBrigadeApplication) FROM FireBrigadeApplication fireBrigadeApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"fireBrigadeApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FireBrigadeApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FireBrigadeApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FireBrigadeApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
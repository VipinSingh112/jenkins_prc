/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjApplicationException;
import com.nbp.ncbj.application.form.service.model.NcbjApplication;
import com.nbp.ncbj.application.form.service.model.NcbjApplicationTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjApplicationModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicationPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjApplicationUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjApplicationPersistence.class)
public class NcbjApplicationPersistenceImpl
	extends BasePersistenceImpl<NcbjApplication>
	implements NcbjApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjApplicationUtil</code> to access the ncbj application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjApplicationImpl.class.getName();

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
	 * Returns all the ncbj applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
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

		List<NcbjApplication> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplication ncbjApplication : list) {
					if (!uuid.equals(ncbjApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

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
				sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjApplication>)QueryUtil.list(
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
	 * Returns the first ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findByUuid_First(
			String uuid, OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchByUuid_First(
		String uuid, OrderByComparator<NcbjApplication> orderByComparator) {

		List<NcbjApplication> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findByUuid_Last(
			String uuid, OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchByUuid_Last(
		String uuid, OrderByComparator<NcbjApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<NcbjApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where uuid = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication[] findByUuid_PrevAndNext(
			long ncbjApplicationId, String uuid,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		uuid = Objects.toString(uuid, "");

		NcbjApplication ncbjApplication = findByPrimaryKey(ncbjApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplication[] array = new NcbjApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, ncbjApplication, uuid, orderByComparator, true);

			array[1] = ncbjApplication;

			array[2] = getByUuid_PrevAndNext(
				session, ncbjApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcbjApplication getByUuid_PrevAndNext(
		Session session, NcbjApplication ncbjApplication, String uuid,
		OrderByComparator<NcbjApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

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
			sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
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
						ncbjApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (NcbjApplication ncbjApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjApplication);
		}
	}

	/**
	 * Returns the number of ncbj applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

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
		"ncbjApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(ncbjApplication.uuid IS NULL OR ncbjApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchByUUID_G(uuid, groupId);

		if (ncbjApplication == null) {
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

			throw new NoSuchNcbjApplicationException(sb.toString());
		}

		return ncbjApplication;
	}

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the ncbj application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchByUUID_G(
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

		if (result instanceof NcbjApplication) {
			NcbjApplication ncbjApplication = (NcbjApplication)result;

			if (!Objects.equals(uuid, ncbjApplication.getUuid()) ||
				(groupId != ncbjApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

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

				List<NcbjApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					NcbjApplication ncbjApplication = list.get(0);

					result = ncbjApplication;

					cacheResult(ncbjApplication);
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
			return (NcbjApplication)result;
		}
	}

	/**
	 * Removes the ncbj application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the ncbj application that was removed
	 */
	@Override
	public NcbjApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = findByUUID_G(uuid, groupId);

		return remove(ncbjApplication);
	}

	/**
	 * Returns the number of ncbj applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

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
		"ncbjApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(ncbjApplication.uuid IS NULL OR ncbjApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"ncbjApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
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

		List<NcbjApplication> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplication ncbjApplication : list) {
					if (!uuid.equals(ncbjApplication.getUuid()) ||
						(companyId != ncbjApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

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
				sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjApplication>)QueryUtil.list(
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
	 * Returns the first ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<NcbjApplication> orderByComparator) {

		List<NcbjApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<NcbjApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<NcbjApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication[] findByUuid_C_PrevAndNext(
			long ncbjApplicationId, String uuid, long companyId,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		uuid = Objects.toString(uuid, "");

		NcbjApplication ncbjApplication = findByPrimaryKey(ncbjApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplication[] array = new NcbjApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, ncbjApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = ncbjApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, ncbjApplication, uuid, companyId, orderByComparator,
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

	protected NcbjApplication getByUuid_C_PrevAndNext(
		Session session, NcbjApplication ncbjApplication, String uuid,
		long companyId, OrderByComparator<NcbjApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

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
			sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
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
						ncbjApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (NcbjApplication ncbjApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjApplication);
		}
	}

	/**
	 * Returns the number of ncbj applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

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
		"ncbjApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(ncbjApplication.uuid IS NULL OR ncbjApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"ncbjApplication.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetNCBJByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetNCBJByS_U;
	private FinderPath _finderPathCountBygetNCBJByS_U;

	/**
	 * Returns all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByS_U(long userId, int status) {
		return findBygetNCBJByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end) {

		return findBygetNCBJByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return findBygetNCBJByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNCBJByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNCBJByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<NcbjApplication> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplication ncbjApplication : list) {
					if ((userId != ncbjApplication.getUserId()) ||
						(status != ncbjApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETNCBJBYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<NcbjApplication>)QueryUtil.list(
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
	 * Returns the first ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNCBJByS_U_First(
			long userId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNCBJByS_U_First(
			userId, status, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByS_U_First(
		long userId, int status,
		OrderByComparator<NcbjApplication> orderByComparator) {

		List<NcbjApplication> list = findBygetNCBJByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNCBJByS_U_Last(
			long userId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNCBJByS_U_Last(
			userId, status, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByS_U_Last(
		long userId, int status,
		OrderByComparator<NcbjApplication> orderByComparator) {

		int count = countBygetNCBJByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<NcbjApplication> list = findBygetNCBJByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication[] findBygetNCBJByS_U_PrevAndNext(
			long ncbjApplicationId, long userId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = findByPrimaryKey(ncbjApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplication[] array = new NcbjApplicationImpl[3];

			array[0] = getBygetNCBJByS_U_PrevAndNext(
				session, ncbjApplication, userId, status, orderByComparator,
				true);

			array[1] = ncbjApplication;

			array[2] = getBygetNCBJByS_U_PrevAndNext(
				session, ncbjApplication, userId, status, orderByComparator,
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

	protected NcbjApplication getBygetNCBJByS_U_PrevAndNext(
		Session session, NcbjApplication ncbjApplication, long userId,
		int status, OrderByComparator<NcbjApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETNCBJBYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETNCBJBYS_U_STATUS_2);

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
			sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
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
						ncbjApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetNCBJByS_U(long userId, int status) {
		for (NcbjApplication ncbjApplication :
				findBygetNCBJByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjApplication);
		}
	}

	/**
	 * Returns the number of ncbj applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countBygetNCBJByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetNCBJByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETNCBJBYS_U_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETNCBJBYS_U_USERID_2 =
		"ncbjApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETNCBJBYS_U_STATUS_2 =
		"ncbjApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetNCBJByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetNCBJByStatus;
	private FinderPath _finderPathCountBygetNCBJByStatus;

	/**
	 * Returns all the ncbj applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByStatus(int status) {
		return findBygetNCBJByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end) {

		return findBygetNCBJByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return findBygetNCBJByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByStatus(
		int status, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNCBJByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNCBJByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<NcbjApplication> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplication ncbjApplication : list) {
					if (status != ncbjApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<NcbjApplication>)QueryUtil.list(
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
	 * Returns the first ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNCBJByStatus_First(
			int status, OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNCBJByStatus_First(
			status, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByStatus_First(
		int status, OrderByComparator<NcbjApplication> orderByComparator) {

		List<NcbjApplication> list = findBygetNCBJByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNCBJByStatus_Last(
			int status, OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNCBJByStatus_Last(
			status, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncbj application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByStatus_Last(
		int status, OrderByComparator<NcbjApplication> orderByComparator) {

		int count = countBygetNCBJByStatus(status);

		if (count == 0) {
			return null;
		}

		List<NcbjApplication> list = findBygetNCBJByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where status = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication[] findBygetNCBJByStatus_PrevAndNext(
			long ncbjApplicationId, int status,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = findByPrimaryKey(ncbjApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplication[] array = new NcbjApplicationImpl[3];

			array[0] = getBygetNCBJByStatus_PrevAndNext(
				session, ncbjApplication, status, orderByComparator, true);

			array[1] = ncbjApplication;

			array[2] = getBygetNCBJByStatus_PrevAndNext(
				session, ncbjApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected NcbjApplication getBygetNCBJByStatus_PrevAndNext(
		Session session, NcbjApplication ncbjApplication, int status,
		OrderByComparator<NcbjApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETNCBJBYSTATUS_STATUS_2);

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
			sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
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
						ncbjApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetNCBJByStatus(int status) {
		for (NcbjApplication ncbjApplication :
				findBygetNCBJByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(ncbjApplication);
		}
	}

	/**
	 * Returns the number of ncbj applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countBygetNCBJByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetNCBJByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETNCBJBYSTATUS_STATUS_2 =
		"ncbjApplication.status = ?";

	private FinderPath _finderPathFetchBygetNCBJByCaseId;
	private FinderPath _finderPathCountBygetNCBJByCaseId;

	/**
	 * Returns the ncbj application where caseId = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNCBJByCaseId(String caseId)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNCBJByCaseId(caseId);

		if (ncbjApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjApplicationException(sb.toString());
		}

		return ncbjApplication;
	}

	/**
	 * Returns the ncbj application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByCaseId(String caseId) {
		return fetchBygetNCBJByCaseId(caseId, true);
	}

	/**
	 * Returns the ncbj application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJByCaseId, finderArgs, this);
		}

		if (result instanceof NcbjApplication) {
			NcbjApplication ncbjApplication = (NcbjApplication)result;

			if (!Objects.equals(caseId, ncbjApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJBYCASEID_CASEID_2);
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

				List<NcbjApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJByCaseId, finderArgs,
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
								"NcbjApplicationPersistenceImpl.fetchBygetNCBJByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplication ncbjApplication = list.get(0);

					result = ncbjApplication;

					cacheResult(ncbjApplication);
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
			return (NcbjApplication)result;
		}
	}

	/**
	 * Removes the ncbj application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the ncbj application that was removed
	 */
	@Override
	public NcbjApplication removeBygetNCBJByCaseId(String caseId)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = findBygetNCBJByCaseId(caseId);

		return remove(ncbjApplication);
	}

	/**
	 * Returns the number of ncbj applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countBygetNCBJByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetNCBJByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETNCBJBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETNCBJBYCASEID_CASEID_2 =
		"ncbjApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETNCBJBYCASEID_CASEID_3 =
		"(ncbjApplication.caseId IS NULL OR ncbjApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetNCBJByAppNum;
	private FinderPath _finderPathWithoutPaginationFindBygetNCBJByAppNum;
	private FinderPath _finderPathCountBygetNCBJByAppNum;

	/**
	 * Returns all the ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber) {

		return findBygetNCBJByAppNum(
			applicationNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end) {

		return findBygetNCBJByAppNum(applicationNumber, start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return findBygetNCBJByAppNum(
			applicationNumber, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj applications where applicationNumber = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param applicationNumber the application number
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching ncbj applications
	 */
	@Override
	public List<NcbjApplication> findBygetNCBJByAppNum(
		String applicationNumber, int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
		boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetNCBJByAppNum;
				finderArgs = new Object[] {applicationNumber};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetNCBJByAppNum;
			finderArgs = new Object[] {
				applicationNumber, start, end, orderByComparator
			};
		}

		List<NcbjApplication> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (NcbjApplication ncbjApplication : list) {
					if (!applicationNumber.equals(
							ncbjApplication.getApplicationNumber())) {

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

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<NcbjApplication>)QueryUtil.list(
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
	 * Returns the first ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNCBJByAppNum_First(
			String applicationNumber,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNCBJByAppNum_First(
			applicationNumber, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("applicationNumber=");
		sb.append(applicationNumber);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the first ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByAppNum_First(
		String applicationNumber,
		OrderByComparator<NcbjApplication> orderByComparator) {

		List<NcbjApplication> list = findBygetNCBJByAppNum(
			applicationNumber, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNCBJByAppNum_Last(
			String applicationNumber,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNCBJByAppNum_Last(
			applicationNumber, orderByComparator);

		if (ncbjApplication != null) {
			return ncbjApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("applicationNumber=");
		sb.append(applicationNumber);

		sb.append("}");

		throw new NoSuchNcbjApplicationException(sb.toString());
	}

	/**
	 * Returns the last ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNCBJByAppNum_Last(
		String applicationNumber,
		OrderByComparator<NcbjApplication> orderByComparator) {

		int count = countBygetNCBJByAppNum(applicationNumber);

		if (count == 0) {
			return null;
		}

		List<NcbjApplication> list = findBygetNCBJByAppNum(
			applicationNumber, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the ncbj applications before and after the current ncbj application in the ordered set where applicationNumber = &#63;.
	 *
	 * @param ncbjApplicationId the primary key of the current ncbj application
	 * @param applicationNumber the application number
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication[] findBygetNCBJByAppNum_PrevAndNext(
			long ncbjApplicationId, String applicationNumber,
			OrderByComparator<NcbjApplication> orderByComparator)
		throws NoSuchNcbjApplicationException {

		applicationNumber = Objects.toString(applicationNumber, "");

		NcbjApplication ncbjApplication = findByPrimaryKey(ncbjApplicationId);

		Session session = null;

		try {
			session = openSession();

			NcbjApplication[] array = new NcbjApplicationImpl[3];

			array[0] = getBygetNCBJByAppNum_PrevAndNext(
				session, ncbjApplication, applicationNumber, orderByComparator,
				true);

			array[1] = ncbjApplication;

			array[2] = getBygetNCBJByAppNum_PrevAndNext(
				session, ncbjApplication, applicationNumber, orderByComparator,
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

	protected NcbjApplication getBygetNCBJByAppNum_PrevAndNext(
		Session session, NcbjApplication ncbjApplication,
		String applicationNumber,
		OrderByComparator<NcbjApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

		boolean bindApplicationNumber = false;

		if (applicationNumber.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_3);
		}
		else {
			bindApplicationNumber = true;

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_2);
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
			sb.append(NcbjApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindApplicationNumber) {
			queryPos.add(applicationNumber);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						ncbjApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<NcbjApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the ncbj applications where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 */
	@Override
	public void removeBygetNCBJByAppNum(String applicationNumber) {
		for (NcbjApplication ncbjApplication :
				findBygetNCBJByAppNum(
					applicationNumber, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(ncbjApplication);
		}
	}

	/**
	 * Returns the number of ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countBygetNCBJByAppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetNCBJByAppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_2 =
			"ncbjApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJBYAPPNUM_APPLICATIONNUMBER_3 =
			"(ncbjApplication.applicationNumber IS NULL OR ncbjApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetNcbj_By_App_Num;
	private FinderPath _finderPathCountBygetNcbj_By_App_Num;

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNcbj_By_App_Num(String applicationNumber)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNcbj_By_App_Num(
			applicationNumber);

		if (ncbjApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjApplicationException(sb.toString());
		}

		return ncbjApplication;
	}

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNcbj_By_App_Num(String applicationNumber) {
		return fetchBygetNcbj_By_App_Num(applicationNumber, true);
	}

	/**
	 * Returns the ncbj application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNcbj_By_App_Num(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbj_By_App_Num, finderArgs, this);
		}

		if (result instanceof NcbjApplication) {
			NcbjApplication ncbjApplication = (NcbjApplication)result;

			if (!Objects.equals(
					applicationNumber,
					ncbjApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_APP_NUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_APP_NUM_APPLICATIONNUMBER_2);
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

				List<NcbjApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbj_By_App_Num, finderArgs,
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
								"NcbjApplicationPersistenceImpl.fetchBygetNcbj_By_App_Num(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplication ncbjApplication = list.get(0);

					result = ncbjApplication;

					cacheResult(ncbjApplication);
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
			return (NcbjApplication)result;
		}
	}

	/**
	 * Removes the ncbj application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the ncbj application that was removed
	 */
	@Override
	public NcbjApplication removeBygetNcbj_By_App_Num(String applicationNumber)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = findBygetNcbj_By_App_Num(
			applicationNumber);

		return remove(ncbjApplication);
	}

	/**
	 * Returns the number of ncbj applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countBygetNcbj_By_App_Num(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetNcbj_By_App_Num;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_APP_NUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJ_BY_APP_NUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETNCBJ_BY_APP_NUM_APPLICATIONNUMBER_2 =
			"ncbjApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJ_BY_APP_NUM_APPLICATIONNUMBER_3 =
			"(ncbjApplication.applicationNumber IS NULL OR ncbjApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetNcbjByRT_AppNo;
	private FinderPath _finderPathCountBygetNcbjByRT_AppNo;

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncbj application
	 * @throws NoSuchNcbjApplicationException if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication findBygetNcbjByRT_AppNo(
			String typeOfServices, String expiredLicenseAppNumber)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);

		if (ncbjApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("typeOfServices=");
			sb.append(typeOfServices);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjApplicationException(sb.toString());
		}

		return ncbjApplication;
	}

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber) {

		return fetchBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj application, or <code>null</code> if a matching ncbj application could not be found
	 */
	@Override
	public NcbjApplication fetchBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		typeOfServices = Objects.toString(typeOfServices, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {typeOfServices, expiredLicenseAppNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcbjByRT_AppNo, finderArgs, this);
		}

		if (result instanceof NcbjApplication) {
			NcbjApplication ncbjApplication = (NcbjApplication)result;

			if (!Objects.equals(
					typeOfServices, ncbjApplication.getTypeOfServices()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					ncbjApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_NCBJAPPLICATION_WHERE);

			boolean bindTypeOfServices = false;

			if (typeOfServices.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJBYRT_APPNO_TYPEOFSERVICES_3);
			}
			else {
				bindTypeOfServices = true;

				sb.append(_FINDER_COLUMN_GETNCBJBYRT_APPNO_TYPEOFSERVICES_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfServices) {
					queryPos.add(typeOfServices);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<NcbjApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcbjByRT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									typeOfServices, expiredLicenseAppNumber
								};
							}

							_log.warn(
								"NcbjApplicationPersistenceImpl.fetchBygetNcbjByRT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjApplication ncbjApplication = list.get(0);

					result = ncbjApplication;

					cacheResult(ncbjApplication);
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
			return (NcbjApplication)result;
		}
	}

	/**
	 * Removes the ncbj application where typeOfServices = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the ncbj application that was removed
	 */
	@Override
	public NcbjApplication removeBygetNcbjByRT_AppNo(
			String typeOfServices, String expiredLicenseAppNumber)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = findBygetNcbjByRT_AppNo(
			typeOfServices, expiredLicenseAppNumber);

		return remove(ncbjApplication);
	}

	/**
	 * Returns the number of ncbj applications where typeOfServices = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfServices the type of services
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching ncbj applications
	 */
	@Override
	public int countBygetNcbjByRT_AppNo(
		String typeOfServices, String expiredLicenseAppNumber) {

		typeOfServices = Objects.toString(typeOfServices, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetNcbjByRT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfServices, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_NCBJAPPLICATION_WHERE);

			boolean bindTypeOfServices = false;

			if (typeOfServices.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETNCBJBYRT_APPNO_TYPEOFSERVICES_3);
			}
			else {
				bindTypeOfServices = true;

				sb.append(_FINDER_COLUMN_GETNCBJBYRT_APPNO_TYPEOFSERVICES_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETNCBJBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETNCBJBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindTypeOfServices) {
					queryPos.add(typeOfServices);
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
		_FINDER_COLUMN_GETNCBJBYRT_APPNO_TYPEOFSERVICES_2 =
			"ncbjApplication.typeOfServices = ? AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJBYRT_APPNO_TYPEOFSERVICES_3 =
			"(ncbjApplication.typeOfServices IS NULL OR ncbjApplication.typeOfServices = '') AND ";

	private static final String
		_FINDER_COLUMN_GETNCBJBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"ncbjApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETNCBJBYRT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(ncbjApplication.expiredLicenseAppNumber IS NULL OR ncbjApplication.expiredLicenseAppNumber = '')";

	public NcbjApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(NcbjApplication.class);

		setModelImplClass(NcbjApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjApplicationTable.INSTANCE);
	}

	/**
	 * Caches the ncbj application in the entity cache if it is enabled.
	 *
	 * @param ncbjApplication the ncbj application
	 */
	@Override
	public void cacheResult(NcbjApplication ncbjApplication) {
		entityCache.putResult(
			NcbjApplicationImpl.class, ncbjApplication.getPrimaryKey(),
			ncbjApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				ncbjApplication.getUuid(), ncbjApplication.getGroupId()
			},
			ncbjApplication);

		finderCache.putResult(
			_finderPathFetchBygetNCBJByCaseId,
			new Object[] {ncbjApplication.getCaseId()}, ncbjApplication);

		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_App_Num,
			new Object[] {ncbjApplication.getApplicationNumber()},
			ncbjApplication);

		finderCache.putResult(
			_finderPathFetchBygetNcbjByRT_AppNo,
			new Object[] {
				ncbjApplication.getTypeOfServices(),
				ncbjApplication.getExpiredLicenseAppNumber()
			},
			ncbjApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj applications in the entity cache if it is enabled.
	 *
	 * @param ncbjApplications the ncbj applications
	 */
	@Override
	public void cacheResult(List<NcbjApplication> ncbjApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjApplication ncbjApplication : ncbjApplications) {
			if (entityCache.getResult(
					NcbjApplicationImpl.class,
					ncbjApplication.getPrimaryKey()) == null) {

				cacheResult(ncbjApplication);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjApplicationImpl.class);

		finderCache.clearCache(NcbjApplicationImpl.class);
	}

	/**
	 * Clears the cache for the ncbj application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjApplication ncbjApplication) {
		entityCache.removeResult(NcbjApplicationImpl.class, ncbjApplication);
	}

	@Override
	public void clearCache(List<NcbjApplication> ncbjApplications) {
		for (NcbjApplication ncbjApplication : ncbjApplications) {
			entityCache.removeResult(
				NcbjApplicationImpl.class, ncbjApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjApplicationModelImpl ncbjApplicationModelImpl) {

		Object[] args = new Object[] {
			ncbjApplicationModelImpl.getUuid(),
			ncbjApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, ncbjApplicationModelImpl);

		args = new Object[] {ncbjApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetNCBJByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJByCaseId, args, ncbjApplicationModelImpl);

		args = new Object[] {ncbjApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetNcbj_By_App_Num, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbj_By_App_Num, args,
			ncbjApplicationModelImpl);

		args = new Object[] {
			ncbjApplicationModelImpl.getTypeOfServices(),
			ncbjApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetNcbjByRT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcbjByRT_AppNo, args,
			ncbjApplicationModelImpl);
	}

	/**
	 * Creates a new ncbj application with the primary key. Does not add the ncbj application to the database.
	 *
	 * @param ncbjApplicationId the primary key for the new ncbj application
	 * @return the new ncbj application
	 */
	@Override
	public NcbjApplication create(long ncbjApplicationId) {
		NcbjApplication ncbjApplication = new NcbjApplicationImpl();

		ncbjApplication.setNew(true);
		ncbjApplication.setPrimaryKey(ncbjApplicationId);

		String uuid = PortalUUIDUtil.generate();

		ncbjApplication.setUuid(uuid);

		ncbjApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjApplication;
	}

	/**
	 * Removes the ncbj application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application that was removed
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication remove(long ncbjApplicationId)
		throws NoSuchNcbjApplicationException {

		return remove((Serializable)ncbjApplicationId);
	}

	/**
	 * Removes the ncbj application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj application
	 * @return the ncbj application that was removed
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication remove(Serializable primaryKey)
		throws NoSuchNcbjApplicationException {

		Session session = null;

		try {
			session = openSession();

			NcbjApplication ncbjApplication = (NcbjApplication)session.get(
				NcbjApplicationImpl.class, primaryKey);

			if (ncbjApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjApplication);
		}
		catch (NoSuchNcbjApplicationException noSuchEntityException) {
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
	protected NcbjApplication removeImpl(NcbjApplication ncbjApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjApplication)) {
				ncbjApplication = (NcbjApplication)session.get(
					NcbjApplicationImpl.class,
					ncbjApplication.getPrimaryKeyObj());
			}

			if (ncbjApplication != null) {
				session.delete(ncbjApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjApplication != null) {
			clearCache(ncbjApplication);
		}

		return ncbjApplication;
	}

	@Override
	public NcbjApplication updateImpl(NcbjApplication ncbjApplication) {
		boolean isNew = ncbjApplication.isNew();

		if (!(ncbjApplication instanceof NcbjApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjApplication implementation " +
					ncbjApplication.getClass());
		}

		NcbjApplicationModelImpl ncbjApplicationModelImpl =
			(NcbjApplicationModelImpl)ncbjApplication;

		if (Validator.isNull(ncbjApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			ncbjApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjApplication.setCreateDate(date);
			}
			else {
				ncbjApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjApplication.setModifiedDate(date);
			}
			else {
				ncbjApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjApplication);
			}
			else {
				ncbjApplication = (NcbjApplication)session.merge(
					ncbjApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjApplicationImpl.class, ncbjApplicationModelImpl, false, true);

		cacheUniqueFindersCache(ncbjApplicationModelImpl);

		if (isNew) {
			ncbjApplication.setNew(false);
		}

		ncbjApplication.resetOriginalValues();

		return ncbjApplication;
	}

	/**
	 * Returns the ncbj application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj application
	 * @return the ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjApplicationException {

		NcbjApplication ncbjApplication = fetchByPrimaryKey(primaryKey);

		if (ncbjApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjApplication;
	}

	/**
	 * Returns the ncbj application with the primary key or throws a <code>NoSuchNcbjApplicationException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application
	 * @throws NoSuchNcbjApplicationException if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication findByPrimaryKey(long ncbjApplicationId)
		throws NoSuchNcbjApplicationException {

		return findByPrimaryKey((Serializable)ncbjApplicationId);
	}

	/**
	 * Returns the ncbj application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the primary key of the ncbj application
	 * @return the ncbj application, or <code>null</code> if a ncbj application with the primary key could not be found
	 */
	@Override
	public NcbjApplication fetchByPrimaryKey(long ncbjApplicationId) {
		return fetchByPrimaryKey((Serializable)ncbjApplicationId);
	}

	/**
	 * Returns all the ncbj applications.
	 *
	 * @return the ncbj applications
	 */
	@Override
	public List<NcbjApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @return the range of ncbj applications
	 */
	@Override
	public List<NcbjApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj applications
	 */
	@Override
	public List<NcbjApplication> findAll(
		int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj applications
	 * @param end the upper bound of the range of ncbj applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj applications
	 */
	@Override
	public List<NcbjApplication> findAll(
		int start, int end,
		OrderByComparator<NcbjApplication> orderByComparator,
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

		List<NcbjApplication> list = null;

		if (useFinderCache) {
			list = (List<NcbjApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJAPPLICATION;

				sql = sql.concat(NcbjApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjApplication>)QueryUtil.list(
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
	 * Removes all the ncbj applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjApplication ncbjApplication : findAll()) {
			remove(ncbjApplication);
		}
	}

	/**
	 * Returns the number of ncbj applications.
	 *
	 * @return the number of ncbj applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJAPPLICATION);

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
		return "ncbjApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj application persistence.
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

		_finderPathWithPaginationFindBygetNCBJByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNCBJByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetNCBJByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNCBJByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetNCBJByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetNCBJByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNCBJByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetNCBJByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNCBJByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetNCBJByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetNCBJByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetNCBJByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetNCBJByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetNCBJByAppNum",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"applicationNumber"}, true);

		_finderPathWithoutPaginationFindBygetNCBJByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetNCBJByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetNCBJByAppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJByAppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetNcbj_By_App_Num = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbj_By_App_Num",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetNcbj_By_App_Num = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbj_By_App_Num", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetNcbjByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcbjByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfServices", "expiredLicenseAppNumber"}, true);

		_finderPathCountBygetNcbjByRT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcbjByRT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfServices", "expiredLicenseAppNumber"}, false);

		NcbjApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjApplicationUtil.setPersistence(null);

		entityCache.removeCache(NcbjApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJAPPLICATION =
		"SELECT ncbjApplication FROM NcbjApplication ncbjApplication";

	private static final String _SQL_SELECT_NCBJAPPLICATION_WHERE =
		"SELECT ncbjApplication FROM NcbjApplication ncbjApplication WHERE ";

	private static final String _SQL_COUNT_NCBJAPPLICATION =
		"SELECT COUNT(ncbjApplication) FROM NcbjApplication ncbjApplication";

	private static final String _SQL_COUNT_NCBJAPPLICATION_WHERE =
		"SELECT COUNT(ncbjApplication) FROM NcbjApplication ncbjApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
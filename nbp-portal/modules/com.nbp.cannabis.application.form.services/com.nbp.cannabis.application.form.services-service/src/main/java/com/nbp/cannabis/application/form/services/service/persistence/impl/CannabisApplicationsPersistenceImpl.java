/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.cannabis.application.form.services.service.persistence.impl;

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

import com.nbp.cannabis.application.form.services.exception.NoSuchCannabisApplicationsException;
import com.nbp.cannabis.application.form.services.model.CannabisApplications;
import com.nbp.cannabis.application.form.services.model.CannabisApplicationsTable;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsImpl;
import com.nbp.cannabis.application.form.services.model.impl.CannabisApplicationsModelImpl;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationsPersistence;
import com.nbp.cannabis.application.form.services.service.persistence.CannabisApplicationsUtil;
import com.nbp.cannabis.application.form.services.service.persistence.impl.constants.CANNABISPersistenceConstants;

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
 * The persistence implementation for the cannabis applications service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = CannabisApplicationsPersistence.class)
public class CannabisApplicationsPersistenceImpl
	extends BasePersistenceImpl<CannabisApplications>
	implements CannabisApplicationsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>CannabisApplicationsUtil</code> to access the cannabis applications persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		CannabisApplicationsImpl.class.getName();

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
	 * Returns all the cannabis applicationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
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

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if (!uuid.equals(cannabisApplications.getUuid())) {
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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

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
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findByUuid_First(
			String uuid,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = fetchByUuid_First(
			uuid, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchByUuid_First(
		String uuid,
		OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findByUuid_Last(
			String uuid,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = fetchByUuid_Last(
			uuid, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchByUuid_Last(
		String uuid,
		OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where uuid = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[] findByUuid_PrevAndNext(
			long cannabisApplicationId, String uuid,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		uuid = Objects.toString(uuid, "");

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, cannabisApplications, uuid, orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] = getByUuid_PrevAndNext(
				session, cannabisApplications, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected CannabisApplications getByUuid_PrevAndNext(
		Session session, CannabisApplications cannabisApplications, String uuid,
		OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
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
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (CannabisApplications cannabisApplications :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

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
		"cannabisApplications.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(cannabisApplications.uuid IS NULL OR cannabisApplications.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = fetchByUUID_G(
			uuid, groupId);

		if (cannabisApplications == null) {
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

			throw new NoSuchCannabisApplicationsException(sb.toString());
		}

		return cannabisApplications;
	}

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the cannabis applications where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchByUUID_G(
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

		if (result instanceof CannabisApplications) {
			CannabisApplications cannabisApplications =
				(CannabisApplications)result;

			if (!Objects.equals(uuid, cannabisApplications.getUuid()) ||
				(groupId != cannabisApplications.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

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

				List<CannabisApplications> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					CannabisApplications cannabisApplications = list.get(0);

					result = cannabisApplications;

					cacheResult(cannabisApplications);
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
			return (CannabisApplications)result;
		}
	}

	/**
	 * Removes the cannabis applications where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the cannabis applications that was removed
	 */
	@Override
	public CannabisApplications removeByUUID_G(String uuid, long groupId)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = findByUUID_G(uuid, groupId);

		return remove(cannabisApplications);
	}

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

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
		"cannabisApplications.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(cannabisApplications.uuid IS NULL OR cannabisApplications.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"cannabisApplications.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
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

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if (!uuid.equals(cannabisApplications.getUuid()) ||
						(companyId != cannabisApplications.getCompanyId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

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
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
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

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[] findByUuid_C_PrevAndNext(
			long cannabisApplicationId, String uuid, long companyId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		uuid = Objects.toString(uuid, "");

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, cannabisApplications, uuid, companyId,
				orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] = getByUuid_C_PrevAndNext(
				session, cannabisApplications, uuid, companyId,
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

	protected CannabisApplications getByUuid_C_PrevAndNext(
		Session session, CannabisApplications cannabisApplications, String uuid,
		long companyId,
		OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
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
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (CannabisApplications cannabisApplications :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

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
		"cannabisApplications.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(cannabisApplications.uuid IS NULL OR cannabisApplications.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"cannabisApplications.companyId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetCannabisApplicationsByLicenseCategory;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCannabisApplicationsByLicenseCategory;
	private FinderPath
		_finderPathCountBygetCannabisApplicationsByLicenseCategory;

	/**
	 * Returns all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory) {

		return findBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end) {

		return findBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return findBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseCategory(
			int status, String licenseCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		licenseCategory = Objects.toString(licenseCategory, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisApplicationsByLicenseCategory;
				finderArgs = new Object[] {status, licenseCategory};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCannabisApplicationsByLicenseCategory;
			finderArgs = new Object[] {
				status, licenseCategory, start, end, orderByComparator
			};
		}

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if ((status != cannabisApplications.getStatus()) ||
						!licenseCategory.equals(
							cannabisApplications.getLicenseCategory())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_STATUS_2);

			boolean bindLicenseCategory = false;

			if (licenseCategory.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_3);
			}
			else {
				bindLicenseCategory = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindLicenseCategory) {
					queryPos.add(licenseCategory);
				}

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseCategory_First(
				int status, String licenseCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByLicenseCategory_First(
				status, licenseCategory, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", licenseCategory=");
		sb.append(licenseCategory);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseCategory_First(
			int status, String licenseCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByLicenseCategory(
				status, licenseCategory, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseCategory_Last(
				int status, String licenseCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByLicenseCategory_Last(
				status, licenseCategory, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", licenseCategory=");
		sb.append(licenseCategory);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseCategory_Last(
			int status, String licenseCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countBygetCannabisApplicationsByLicenseCategory(
			status, licenseCategory);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByLicenseCategory(
				status, licenseCategory, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param licenseCategory the license category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[]
			findBygetCannabisApplicationsByLicenseCategory_PrevAndNext(
				long cannabisApplicationId, int status, String licenseCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		licenseCategory = Objects.toString(licenseCategory, "");

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] =
				getBygetCannabisApplicationsByLicenseCategory_PrevAndNext(
					session, cannabisApplications, status, licenseCategory,
					orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] =
				getBygetCannabisApplicationsByLicenseCategory_PrevAndNext(
					session, cannabisApplications, status, licenseCategory,
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

	protected CannabisApplications
		getBygetCannabisApplicationsByLicenseCategory_PrevAndNext(
			Session session, CannabisApplications cannabisApplications,
			int status, String licenseCategory,
			OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

		sb.append(
			_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_STATUS_2);

		boolean bindLicenseCategory = false;

		if (licenseCategory.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_3);
		}
		else {
			bindLicenseCategory = true;

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_2);
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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (bindLicenseCategory) {
			queryPos.add(licenseCategory);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and licenseCategory = &#63; from the database.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 */
	@Override
	public void removeBygetCannabisApplicationsByLicenseCategory(
		int status, String licenseCategory) {

		for (CannabisApplications cannabisApplications :
				findBygetCannabisApplicationsByLicenseCategory(
					status, licenseCategory, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and licenseCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseCategory the license category
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsByLicenseCategory(
		int status, String licenseCategory) {

		licenseCategory = Objects.toString(licenseCategory, "");

		FinderPath finderPath =
			_finderPathCountBygetCannabisApplicationsByLicenseCategory;

		Object[] finderArgs = new Object[] {status, licenseCategory};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_STATUS_2);

			boolean bindLicenseCategory = false;

			if (licenseCategory.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_3);
			}
			else {
				bindLicenseCategory = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindLicenseCategory) {
					queryPos.add(licenseCategory);
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
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_STATUS_2 =
			"cannabisApplications.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_2 =
			"cannabisApplications.licenseCategory = ?";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSECATEGORY_LICENSECATEGORY_3 =
			"(cannabisApplications.licenseCategory IS NULL OR cannabisApplications.licenseCategory = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetCannabisApplicationsByLicenseSubCategory;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCannabisApplicationsByLicenseSubCategory;
	private FinderPath
		_finderPathCountBygetCannabisApplicationsByLicenseSubCategory;

	/**
	 * Returns all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory) {

		return findBygetCannabisApplicationsByLicenseSubCategory(
			status, licenseSubCategory, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end) {

		return findBygetCannabisApplicationsByLicenseSubCategory(
			status, licenseSubCategory, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return findBygetCannabisApplicationsByLicenseSubCategory(
			status, licenseSubCategory, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByLicenseSubCategory(
			int status, String licenseSubCategory, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		licenseSubCategory = Objects.toString(licenseSubCategory, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisApplicationsByLicenseSubCategory;
				finderArgs = new Object[] {status, licenseSubCategory};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCannabisApplicationsByLicenseSubCategory;
			finderArgs = new Object[] {
				status, licenseSubCategory, start, end, orderByComparator
			};
		}

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if ((status != cannabisApplications.getStatus()) ||
						!licenseSubCategory.equals(
							cannabisApplications.getLicenseSubCategory())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_STATUS_2);

			boolean bindLicenseSubCategory = false;

			if (licenseSubCategory.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_3);
			}
			else {
				bindLicenseSubCategory = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindLicenseSubCategory) {
					queryPos.add(licenseSubCategory);
				}

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseSubCategory_First(
				int status, String licenseSubCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByLicenseSubCategory_First(
				status, licenseSubCategory, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", licenseSubCategory=");
		sb.append(licenseSubCategory);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseSubCategory_First(
			int status, String licenseSubCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
			findBygetCannabisApplicationsByLicenseSubCategory_Last(
				int status, String licenseSubCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByLicenseSubCategory_Last(
				status, licenseSubCategory, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", licenseSubCategory=");
		sb.append(licenseSubCategory);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
		fetchBygetCannabisApplicationsByLicenseSubCategory_Last(
			int status, String licenseSubCategory,
			OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countBygetCannabisApplicationsByLicenseSubCategory(
			status, licenseSubCategory);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByLicenseSubCategory(
				status, licenseSubCategory, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[]
			findBygetCannabisApplicationsByLicenseSubCategory_PrevAndNext(
				long cannabisApplicationId, int status,
				String licenseSubCategory,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		licenseSubCategory = Objects.toString(licenseSubCategory, "");

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] =
				getBygetCannabisApplicationsByLicenseSubCategory_PrevAndNext(
					session, cannabisApplications, status, licenseSubCategory,
					orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] =
				getBygetCannabisApplicationsByLicenseSubCategory_PrevAndNext(
					session, cannabisApplications, status, licenseSubCategory,
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

	protected CannabisApplications
		getBygetCannabisApplicationsByLicenseSubCategory_PrevAndNext(
			Session session, CannabisApplications cannabisApplications,
			int status, String licenseSubCategory,
			OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

		sb.append(
			_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_STATUS_2);

		boolean bindLicenseSubCategory = false;

		if (licenseSubCategory.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_3);
		}
		else {
			bindLicenseSubCategory = true;

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_2);
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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (bindLicenseSubCategory) {
			queryPos.add(licenseSubCategory);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and licenseSubCategory = &#63; from the database.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 */
	@Override
	public void removeBygetCannabisApplicationsByLicenseSubCategory(
		int status, String licenseSubCategory) {

		for (CannabisApplications cannabisApplications :
				findBygetCannabisApplicationsByLicenseSubCategory(
					status, licenseSubCategory, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and licenseSubCategory = &#63;.
	 *
	 * @param status the status
	 * @param licenseSubCategory the license sub category
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsByLicenseSubCategory(
		int status, String licenseSubCategory) {

		licenseSubCategory = Objects.toString(licenseSubCategory, "");

		FinderPath finderPath =
			_finderPathCountBygetCannabisApplicationsByLicenseSubCategory;

		Object[] finderArgs = new Object[] {status, licenseSubCategory};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_STATUS_2);

			boolean bindLicenseSubCategory = false;

			if (licenseSubCategory.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_3);
			}
			else {
				bindLicenseSubCategory = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindLicenseSubCategory) {
					queryPos.add(licenseSubCategory);
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
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_STATUS_2 =
			"cannabisApplications.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_2 =
			"cannabisApplications.licenseSubCategory = ?";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYLICENSESUBCATEGORY_LICENSESUBCATEGORY_3 =
			"(cannabisApplications.licenseSubCategory IS NULL OR cannabisApplications.licenseSubCategory = '')";

	private FinderPath
		_finderPathFetchBygetCannabisApplicationsByRT_ExpiredAppNo;
	private FinderPath
		_finderPathCountBygetCannabisApplicationsByRT_ExpiredAppNo;

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByRT_ExpiredAppNo(
			String requestType, String expiredLicenseAppNo)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
				requestType, expiredLicenseAppNo);

		if (cannabisApplications == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("requestType=");
			sb.append(requestType);

			sb.append(", expiredLicenseAppNo=");
			sb.append(expiredLicenseAppNo);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationsException(sb.toString());
		}

		return cannabisApplications;
	}

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
		String requestType, String expiredLicenseAppNo) {

		return fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
			requestType, expiredLicenseAppNo, true);
	}

	/**
	 * Returns the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsByRT_ExpiredAppNo(
		String requestType, String expiredLicenseAppNo,
		boolean useFinderCache) {

		requestType = Objects.toString(requestType, "");
		expiredLicenseAppNo = Objects.toString(expiredLicenseAppNo, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {requestType, expiredLicenseAppNo};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCannabisApplicationsByRT_ExpiredAppNo,
				finderArgs, this);
		}

		if (result instanceof CannabisApplications) {
			CannabisApplications cannabisApplications =
				(CannabisApplications)result;

			if (!Objects.equals(
					requestType, cannabisApplications.getRequestType()) ||
				!Objects.equals(
					expiredLicenseAppNo,
					cannabisApplications.getExpiredLicenseAppNo())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_REQUESTTYPE_2);
			}

			boolean bindExpiredLicenseAppNo = false;

			if (expiredLicenseAppNo.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_EXPIREDLICENSEAPPNO_3);
			}
			else {
				bindExpiredLicenseAppNo = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_EXPIREDLICENSEAPPNO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequestType) {
					queryPos.add(requestType);
				}

				if (bindExpiredLicenseAppNo) {
					queryPos.add(expiredLicenseAppNo);
				}

				List<CannabisApplications> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCannabisApplicationsByRT_ExpiredAppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									requestType, expiredLicenseAppNo
								};
							}

							_log.warn(
								"CannabisApplicationsPersistenceImpl.fetchBygetCannabisApplicationsByRT_ExpiredAppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplications cannabisApplications = list.get(0);

					result = cannabisApplications;

					cacheResult(cannabisApplications);
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
			return (CannabisApplications)result;
		}
	}

	/**
	 * Removes the cannabis applications where requestType = &#63; and expiredLicenseAppNo = &#63; from the database.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the cannabis applications that was removed
	 */
	@Override
	public CannabisApplications
			removeBygetCannabisApplicationsByRT_ExpiredAppNo(
				String requestType, String expiredLicenseAppNo)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			findBygetCannabisApplicationsByRT_ExpiredAppNo(
				requestType, expiredLicenseAppNo);

		return remove(cannabisApplications);
	}

	/**
	 * Returns the number of cannabis applicationses where requestType = &#63; and expiredLicenseAppNo = &#63;.
	 *
	 * @param requestType the request type
	 * @param expiredLicenseAppNo the expired license app no
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsByRT_ExpiredAppNo(
		String requestType, String expiredLicenseAppNo) {

		requestType = Objects.toString(requestType, "");
		expiredLicenseAppNo = Objects.toString(expiredLicenseAppNo, "");

		FinderPath finderPath =
			_finderPathCountBygetCannabisApplicationsByRT_ExpiredAppNo;

		Object[] finderArgs = new Object[] {requestType, expiredLicenseAppNo};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_REQUESTTYPE_2);
			}

			boolean bindExpiredLicenseAppNo = false;

			if (expiredLicenseAppNo.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_EXPIREDLICENSEAPPNO_3);
			}
			else {
				bindExpiredLicenseAppNo = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_EXPIREDLICENSEAPPNO_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindRequestType) {
					queryPos.add(requestType);
				}

				if (bindExpiredLicenseAppNo) {
					queryPos.add(expiredLicenseAppNo);
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
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_REQUESTTYPE_2 =
			"cannabisApplications.requestType = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_REQUESTTYPE_3 =
			"(cannabisApplications.requestType IS NULL OR cannabisApplications.requestType = '') AND ";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_EXPIREDLICENSEAPPNO_2 =
			"cannabisApplications.expiredLicenseAppNo = ?";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYRT_EXPIREDAPPNO_EXPIREDLICENSEAPPNO_3 =
			"(cannabisApplications.expiredLicenseAppNo IS NULL OR cannabisApplications.expiredLicenseAppNo = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetCannabisApplicationsByRequestType;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCannabisApplicationsByRequestType;
	private FinderPath _finderPathCountBygetCannabisApplicationsByRequestType;

	/**
	 * Returns all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType) {

		return findBygetCannabisApplicationsByRequestType(
			status, requestType, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end) {

		return findBygetCannabisApplicationsByRequestType(
			status, requestType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator) {

		return findBygetCannabisApplicationsByRequestType(
			status, requestType, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications>
		findBygetCannabisApplicationsByRequestType(
			int status, String requestType, int start, int end,
			OrderByComparator<CannabisApplications> orderByComparator,
			boolean useFinderCache) {

		requestType = Objects.toString(requestType, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisApplicationsByRequestType;
				finderArgs = new Object[] {status, requestType};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCannabisApplicationsByRequestType;
			finderArgs = new Object[] {
				status, requestType, start, end, orderByComparator
			};
		}

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if ((status != cannabisApplications.getStatus()) ||
						!requestType.equals(
							cannabisApplications.getRequestType())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_STATUS_2);

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindRequestType) {
					queryPos.add(requestType);
				}

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
			findBygetCannabisApplicationsByRequestType_First(
				int status, String requestType,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByRequestType_First(
				status, requestType, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", requestType=");
		sb.append(requestType);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
		fetchBygetCannabisApplicationsByRequestType_First(
			int status, String requestType,
			OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByRequestType(
				status, requestType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByRequestType_Last(
			int status, String requestType,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByRequestType_Last(
				status, requestType, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", requestType=");
		sb.append(requestType);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
		fetchBygetCannabisApplicationsByRequestType_Last(
			int status, String requestType,
			OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countBygetCannabisApplicationsByRequestType(
			status, requestType);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByRequestType(
				status, requestType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and requestType = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param requestType the request type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[]
			findBygetCannabisApplicationsByRequestType_PrevAndNext(
				long cannabisApplicationId, int status, String requestType,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		requestType = Objects.toString(requestType, "");

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] = getBygetCannabisApplicationsByRequestType_PrevAndNext(
				session, cannabisApplications, status, requestType,
				orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] = getBygetCannabisApplicationsByRequestType_PrevAndNext(
				session, cannabisApplications, status, requestType,
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

	protected CannabisApplications
		getBygetCannabisApplicationsByRequestType_PrevAndNext(
			Session session, CannabisApplications cannabisApplications,
			int status, String requestType,
			OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

		sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_STATUS_2);

		boolean bindRequestType = false;

		if (requestType.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_3);
		}
		else {
			bindRequestType = true;

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_2);
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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (bindRequestType) {
			queryPos.add(requestType);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and requestType = &#63; from the database.
	 *
	 * @param status the status
	 * @param requestType the request type
	 */
	@Override
	public void removeBygetCannabisApplicationsByRequestType(
		int status, String requestType) {

		for (CannabisApplications cannabisApplications :
				findBygetCannabisApplicationsByRequestType(
					status, requestType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and requestType = &#63;.
	 *
	 * @param status the status
	 * @param requestType the request type
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsByRequestType(
		int status, String requestType) {

		requestType = Objects.toString(requestType, "");

		FinderPath finderPath =
			_finderPathCountBygetCannabisApplicationsByRequestType;

		Object[] finderArgs = new Object[] {status, requestType};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_STATUS_2);

			boolean bindRequestType = false;

			if (requestType.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_3);
			}
			else {
				bindRequestType = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindRequestType) {
					queryPos.add(requestType);
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
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_STATUS_2 =
			"cannabisApplications.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_2 =
			"cannabisApplications.requestType = ?";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYREQUESTTYPE_REQUESTTYPE_3 =
			"(cannabisApplications.requestType IS NULL OR cannabisApplications.requestType = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetCannabisApplicationsByStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCannabisApplicationsByStatus;
	private FinderPath _finderPathCountBygetCannabisApplicationsByStatus;

	/**
	 * Returns all the cannabis applicationses where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatus(
		int status) {

		return findBygetCannabisApplicationsByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatus(
		int status, int start, int end) {

		return findBygetCannabisApplicationsByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatus(
		int status, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return findBygetCannabisApplicationsByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatus(
		int status, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisApplicationsByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCannabisApplicationsByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if (status != cannabisApplications.getStatus()) {
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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByStatus_First(
			int status,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByStatus_First(
				status, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsByStatus_First(
		int status, OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list = findBygetCannabisApplicationsByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByStatus_Last(
			int status,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByStatus_Last(
				status, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsByStatus_Last(
		int status, OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countBygetCannabisApplicationsByStatus(status);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list = findBygetCannabisApplicationsByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[]
			findBygetCannabisApplicationsByStatus_PrevAndNext(
				long cannabisApplicationId, int status,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] = getBygetCannabisApplicationsByStatus_PrevAndNext(
				session, cannabisApplications, status, orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] = getBygetCannabisApplicationsByStatus_PrevAndNext(
				session, cannabisApplications, status, orderByComparator,
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

	protected CannabisApplications
		getBygetCannabisApplicationsByStatus_PrevAndNext(
			Session session, CannabisApplications cannabisApplications,
			int status,
			OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

		sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUS_STATUS_2);

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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
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
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetCannabisApplicationsByStatus(int status) {
		for (CannabisApplications cannabisApplications :
				findBygetCannabisApplicationsByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsByStatus(int status) {
		FinderPath finderPath =
			_finderPathCountBygetCannabisApplicationsByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUS_STATUS_2);

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

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUS_STATUS_2 =
			"cannabisApplications.status = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetCannabisApplicationsByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCannabisApplicationsByStatusUser;
	private FinderPath _finderPathCountBygetCannabisApplicationsByStatusUser;

	/**
	 * Returns all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatusUser(
		int status, long userId) {

		return findBygetCannabisApplicationsByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetCannabisApplicationsByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return findBygetCannabisApplicationsByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisApplicationsByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCannabisApplicationsByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if ((status != cannabisApplications.getStatus()) ||
						(userId != cannabisApplications.getUserId())) {

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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByStatusUser_First(
			int status, long userId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByStatusUser_First(
				status, userId, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications
		fetchBygetCannabisApplicationsByStatusUser_First(
			int status, long userId,
			OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByStatusUser(
				status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByStatusUser_Last(
			int status, long userId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByStatusUser_Last(
				status, userId, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsByStatusUser_Last(
		int status, long userId,
		OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countBygetCannabisApplicationsByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list =
			findBygetCannabisApplicationsByStatusUser(
				status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[]
			findBygetCannabisApplicationsByStatusUser_PrevAndNext(
				long cannabisApplicationId, int status, long userId,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] = getBygetCannabisApplicationsByStatusUser_PrevAndNext(
				session, cannabisApplications, status, userId,
				orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] = getBygetCannabisApplicationsByStatusUser_PrevAndNext(
				session, cannabisApplications, status, userId,
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

	protected CannabisApplications
		getBygetCannabisApplicationsByStatusUser_PrevAndNext(
			Session session, CannabisApplications cannabisApplications,
			int status, long userId,
			OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

		sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_USERID_2);

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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
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
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetCannabisApplicationsByStatusUser(
		int status, long userId) {

		for (CannabisApplications cannabisApplications :
				findBygetCannabisApplicationsByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsByStatusUser(
		int status, long userId) {

		FinderPath finderPath =
			_finderPathCountBygetCannabisApplicationsByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_STATUS_2);

			sb.append(
				_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_USERID_2);

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
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_STATUS_2 =
			"cannabisApplications.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYSTATUSUSER_USERID_2 =
			"cannabisApplications.userId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetCannabisApplicationsByUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetCannabisApplicationsByUser;
	private FinderPath _finderPathCountBygetCannabisApplicationsByUser;

	/**
	 * Returns all the cannabis applicationses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByUser(
		long userId) {

		return findBygetCannabisApplicationsByUser(
			userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByUser(
		long userId, int start, int end) {

		return findBygetCannabisApplicationsByUser(userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByUser(
		long userId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return findBygetCannabisApplicationsByUser(
			userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findBygetCannabisApplicationsByUser(
		long userId, int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetCannabisApplicationsByUser;
				finderArgs = new Object[] {userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetCannabisApplicationsByUser;
			finderArgs = new Object[] {userId, start, end, orderByComparator};
		}

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (CannabisApplications cannabisApplications : list) {
					if (userId != cannabisApplications.getUserId()) {
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

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Returns the first cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByUser_First(
			long userId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByUser_First(
				userId, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the first cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsByUser_First(
		long userId,
		OrderByComparator<CannabisApplications> orderByComparator) {

		List<CannabisApplications> list = findBygetCannabisApplicationsByUser(
			userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsByUser_Last(
			long userId,
			OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsByUser_Last(
				userId, orderByComparator);

		if (cannabisApplications != null) {
			return cannabisApplications;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchCannabisApplicationsException(sb.toString());
	}

	/**
	 * Returns the last cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsByUser_Last(
		long userId,
		OrderByComparator<CannabisApplications> orderByComparator) {

		int count = countBygetCannabisApplicationsByUser(userId);

		if (count == 0) {
			return null;
		}

		List<CannabisApplications> list = findBygetCannabisApplicationsByUser(
			userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the cannabis applicationses before and after the current cannabis applications in the ordered set where userId = &#63;.
	 *
	 * @param cannabisApplicationId the primary key of the current cannabis applications
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications[]
			findBygetCannabisApplicationsByUser_PrevAndNext(
				long cannabisApplicationId, long userId,
				OrderByComparator<CannabisApplications> orderByComparator)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = findByPrimaryKey(
			cannabisApplicationId);

		Session session = null;

		try {
			session = openSession();

			CannabisApplications[] array = new CannabisApplicationsImpl[3];

			array[0] = getBygetCannabisApplicationsByUser_PrevAndNext(
				session, cannabisApplications, userId, orderByComparator, true);

			array[1] = cannabisApplications;

			array[2] = getBygetCannabisApplicationsByUser_PrevAndNext(
				session, cannabisApplications, userId, orderByComparator,
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

	protected CannabisApplications
		getBygetCannabisApplicationsByUser_PrevAndNext(
			Session session, CannabisApplications cannabisApplications,
			long userId,
			OrderByComparator<CannabisApplications> orderByComparator,
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

		sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

		sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYUSER_USERID_2);

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
			sb.append(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(userId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						cannabisApplications)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<CannabisApplications> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the cannabis applicationses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetCannabisApplicationsByUser(long userId) {
		for (CannabisApplications cannabisApplications :
				findBygetCannabisApplicationsByUser(
					userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsByUser(long userId) {
		FinderPath finderPath = _finderPathCountBygetCannabisApplicationsByUser;

		Object[] finderArgs = new Object[] {userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			sb.append(_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYUSER_USERID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

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
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSBYUSER_USERID_2 =
			"cannabisApplications.userId = ?";

	private FinderPath _finderPathFetchBygetCannabisApplicationsAppNo;
	private FinderPath _finderPathCountBygetCannabisApplicationsAppNo;

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBygetCannabisApplicationsAppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBygetCannabisApplicationsAppNo(applicationNumber);

		if (cannabisApplications == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationsException(sb.toString());
		}

		return cannabisApplications;
	}

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsAppNo(
		String applicationNumber) {

		return fetchBygetCannabisApplicationsAppNo(applicationNumber, true);
	}

	/**
	 * Returns the cannabis applications where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBygetCannabisApplicationsAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetCannabisApplicationsAppNo, finderArgs,
				this);
		}

		if (result instanceof CannabisApplications) {
			CannabisApplications cannabisApplications =
				(CannabisApplications)result;

			if (!Objects.equals(
					applicationNumber,
					cannabisApplications.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSAPPNO_APPLICATIONNUMBER_2);
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

				List<CannabisApplications> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetCannabisApplicationsAppNo,
							finderArgs, list);
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
								"CannabisApplicationsPersistenceImpl.fetchBygetCannabisApplicationsAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplications cannabisApplications = list.get(0);

					result = cannabisApplications;

					cacheResult(cannabisApplications);
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
			return (CannabisApplications)result;
		}
	}

	/**
	 * Removes the cannabis applications where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the cannabis applications that was removed
	 */
	@Override
	public CannabisApplications removeBygetCannabisApplicationsAppNo(
			String applicationNumber)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			findBygetCannabisApplicationsAppNo(applicationNumber);

		return remove(cannabisApplications);
	}

	/**
	 * Returns the number of cannabis applicationses where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBygetCannabisApplicationsAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetCannabisApplicationsAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETCANNABISAPPLICATIONSAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSAPPNO_APPLICATIONNUMBER_2 =
			"cannabisApplications.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETCANNABISAPPLICATIONSAPPNO_APPLICATIONNUMBER_3 =
			"(cannabisApplications.applicationNumber IS NULL OR cannabisApplications.applicationNumber = '')";

	private FinderPath _finderPathFetchBycannabisApplicationByCaseId;
	private FinderPath _finderPathCountBycannabisApplicationByCaseId;

	/**
	 * Returns the cannabis applications where caseId = &#63; or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications findBycannabisApplicationByCaseId(String caseId)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			fetchBycannabisApplicationByCaseId(caseId);

		if (cannabisApplications == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchCannabisApplicationsException(sb.toString());
		}

		return cannabisApplications;
	}

	/**
	 * Returns the cannabis applications where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBycannabisApplicationByCaseId(
		String caseId) {

		return fetchBycannabisApplicationByCaseId(caseId, true);
	}

	/**
	 * Returns the cannabis applications where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching cannabis applications, or <code>null</code> if a matching cannabis applications could not be found
	 */
	@Override
	public CannabisApplications fetchBycannabisApplicationByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBycannabisApplicationByCaseId, finderArgs,
				this);
		}

		if (result instanceof CannabisApplications) {
			CannabisApplications cannabisApplications =
				(CannabisApplications)result;

			if (!Objects.equals(caseId, cannabisApplications.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_CANNABISAPPLICATIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISAPPLICATIONBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISAPPLICATIONBYCASEID_CASEID_2);
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

				List<CannabisApplications> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBycannabisApplicationByCaseId,
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
								"CannabisApplicationsPersistenceImpl.fetchBycannabisApplicationByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					CannabisApplications cannabisApplications = list.get(0);

					result = cannabisApplications;

					cacheResult(cannabisApplications);
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
			return (CannabisApplications)result;
		}
	}

	/**
	 * Removes the cannabis applications where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the cannabis applications that was removed
	 */
	@Override
	public CannabisApplications removeBycannabisApplicationByCaseId(
			String caseId)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications =
			findBycannabisApplicationByCaseId(caseId);

		return remove(cannabisApplications);
	}

	/**
	 * Returns the number of cannabis applicationses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching cannabis applicationses
	 */
	@Override
	public int countBycannabisApplicationByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBycannabisApplicationByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_CANNABISAPPLICATIONS_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_CANNABISAPPLICATIONBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_CANNABISAPPLICATIONBYCASEID_CASEID_2);
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
		_FINDER_COLUMN_CANNABISAPPLICATIONBYCASEID_CASEID_2 =
			"cannabisApplications.caseId = ?";

	private static final String
		_FINDER_COLUMN_CANNABISAPPLICATIONBYCASEID_CASEID_3 =
			"(cannabisApplications.caseId IS NULL OR cannabisApplications.caseId = '')";

	public CannabisApplicationsPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(CannabisApplications.class);

		setModelImplClass(CannabisApplicationsImpl.class);
		setModelPKClass(long.class);

		setTable(CannabisApplicationsTable.INSTANCE);
	}

	/**
	 * Caches the cannabis applications in the entity cache if it is enabled.
	 *
	 * @param cannabisApplications the cannabis applications
	 */
	@Override
	public void cacheResult(CannabisApplications cannabisApplications) {
		entityCache.putResult(
			CannabisApplicationsImpl.class,
			cannabisApplications.getPrimaryKey(), cannabisApplications);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				cannabisApplications.getUuid(),
				cannabisApplications.getGroupId()
			},
			cannabisApplications);

		finderCache.putResult(
			_finderPathFetchBygetCannabisApplicationsByRT_ExpiredAppNo,
			new Object[] {
				cannabisApplications.getRequestType(),
				cannabisApplications.getExpiredLicenseAppNo()
			},
			cannabisApplications);

		finderCache.putResult(
			_finderPathFetchBygetCannabisApplicationsAppNo,
			new Object[] {cannabisApplications.getApplicationNumber()},
			cannabisApplications);

		finderCache.putResult(
			_finderPathFetchBycannabisApplicationByCaseId,
			new Object[] {cannabisApplications.getCaseId()},
			cannabisApplications);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the cannabis applicationses in the entity cache if it is enabled.
	 *
	 * @param cannabisApplicationses the cannabis applicationses
	 */
	@Override
	public void cacheResult(List<CannabisApplications> cannabisApplicationses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (cannabisApplicationses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (CannabisApplications cannabisApplications :
				cannabisApplicationses) {

			if (entityCache.getResult(
					CannabisApplicationsImpl.class,
					cannabisApplications.getPrimaryKey()) == null) {

				cacheResult(cannabisApplications);
			}
		}
	}

	/**
	 * Clears the cache for all cannabis applicationses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(CannabisApplicationsImpl.class);

		finderCache.clearCache(CannabisApplicationsImpl.class);
	}

	/**
	 * Clears the cache for the cannabis applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(CannabisApplications cannabisApplications) {
		entityCache.removeResult(
			CannabisApplicationsImpl.class, cannabisApplications);
	}

	@Override
	public void clearCache(List<CannabisApplications> cannabisApplicationses) {
		for (CannabisApplications cannabisApplications :
				cannabisApplicationses) {

			entityCache.removeResult(
				CannabisApplicationsImpl.class, cannabisApplications);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(CannabisApplicationsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				CannabisApplicationsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		CannabisApplicationsModelImpl cannabisApplicationsModelImpl) {

		Object[] args = new Object[] {
			cannabisApplicationsModelImpl.getUuid(),
			cannabisApplicationsModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, cannabisApplicationsModelImpl);

		args = new Object[] {
			cannabisApplicationsModelImpl.getRequestType(),
			cannabisApplicationsModelImpl.getExpiredLicenseAppNo()
		};

		finderCache.putResult(
			_finderPathCountBygetCannabisApplicationsByRT_ExpiredAppNo, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCannabisApplicationsByRT_ExpiredAppNo, args,
			cannabisApplicationsModelImpl);

		args = new Object[] {
			cannabisApplicationsModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetCannabisApplicationsAppNo, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetCannabisApplicationsAppNo, args,
			cannabisApplicationsModelImpl);

		args = new Object[] {cannabisApplicationsModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBycannabisApplicationByCaseId, args,
			Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBycannabisApplicationByCaseId, args,
			cannabisApplicationsModelImpl);
	}

	/**
	 * Creates a new cannabis applications with the primary key. Does not add the cannabis applications to the database.
	 *
	 * @param cannabisApplicationId the primary key for the new cannabis applications
	 * @return the new cannabis applications
	 */
	@Override
	public CannabisApplications create(long cannabisApplicationId) {
		CannabisApplications cannabisApplications =
			new CannabisApplicationsImpl();

		cannabisApplications.setNew(true);
		cannabisApplications.setPrimaryKey(cannabisApplicationId);

		String uuid = PortalUUIDUtil.generate();

		cannabisApplications.setUuid(uuid);

		cannabisApplications.setCompanyId(CompanyThreadLocal.getCompanyId());

		return cannabisApplications;
	}

	/**
	 * Removes the cannabis applications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications that was removed
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications remove(long cannabisApplicationId)
		throws NoSuchCannabisApplicationsException {

		return remove((Serializable)cannabisApplicationId);
	}

	/**
	 * Removes the cannabis applications with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the cannabis applications
	 * @return the cannabis applications that was removed
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications remove(Serializable primaryKey)
		throws NoSuchCannabisApplicationsException {

		Session session = null;

		try {
			session = openSession();

			CannabisApplications cannabisApplications =
				(CannabisApplications)session.get(
					CannabisApplicationsImpl.class, primaryKey);

			if (cannabisApplications == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchCannabisApplicationsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(cannabisApplications);
		}
		catch (NoSuchCannabisApplicationsException noSuchEntityException) {
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
	protected CannabisApplications removeImpl(
		CannabisApplications cannabisApplications) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(cannabisApplications)) {
				cannabisApplications = (CannabisApplications)session.get(
					CannabisApplicationsImpl.class,
					cannabisApplications.getPrimaryKeyObj());
			}

			if (cannabisApplications != null) {
				session.delete(cannabisApplications);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (cannabisApplications != null) {
			clearCache(cannabisApplications);
		}

		return cannabisApplications;
	}

	@Override
	public CannabisApplications updateImpl(
		CannabisApplications cannabisApplications) {

		boolean isNew = cannabisApplications.isNew();

		if (!(cannabisApplications instanceof CannabisApplicationsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(cannabisApplications.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					cannabisApplications);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in cannabisApplications proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom CannabisApplications implementation " +
					cannabisApplications.getClass());
		}

		CannabisApplicationsModelImpl cannabisApplicationsModelImpl =
			(CannabisApplicationsModelImpl)cannabisApplications;

		if (Validator.isNull(cannabisApplications.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			cannabisApplications.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (cannabisApplications.getCreateDate() == null)) {
			if (serviceContext == null) {
				cannabisApplications.setCreateDate(date);
			}
			else {
				cannabisApplications.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!cannabisApplicationsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				cannabisApplications.setModifiedDate(date);
			}
			else {
				cannabisApplications.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(cannabisApplications);
			}
			else {
				cannabisApplications = (CannabisApplications)session.merge(
					cannabisApplications);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			CannabisApplicationsImpl.class, cannabisApplicationsModelImpl,
			false, true);

		cacheUniqueFindersCache(cannabisApplicationsModelImpl);

		if (isNew) {
			cannabisApplications.setNew(false);
		}

		cannabisApplications.resetOriginalValues();

		return cannabisApplications;
	}

	/**
	 * Returns the cannabis applications with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the cannabis applications
	 * @return the cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications findByPrimaryKey(Serializable primaryKey)
		throws NoSuchCannabisApplicationsException {

		CannabisApplications cannabisApplications = fetchByPrimaryKey(
			primaryKey);

		if (cannabisApplications == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchCannabisApplicationsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return cannabisApplications;
	}

	/**
	 * Returns the cannabis applications with the primary key or throws a <code>NoSuchCannabisApplicationsException</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications
	 * @throws NoSuchCannabisApplicationsException if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications findByPrimaryKey(long cannabisApplicationId)
		throws NoSuchCannabisApplicationsException {

		return findByPrimaryKey((Serializable)cannabisApplicationId);
	}

	/**
	 * Returns the cannabis applications with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param cannabisApplicationId the primary key of the cannabis applications
	 * @return the cannabis applications, or <code>null</code> if a cannabis applications with the primary key could not be found
	 */
	@Override
	public CannabisApplications fetchByPrimaryKey(long cannabisApplicationId) {
		return fetchByPrimaryKey((Serializable)cannabisApplicationId);
	}

	/**
	 * Returns all the cannabis applicationses.
	 *
	 * @return the cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @return the range of cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findAll(
		int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the cannabis applicationses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>CannabisApplicationsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of cannabis applicationses
	 * @param end the upper bound of the range of cannabis applicationses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of cannabis applicationses
	 */
	@Override
	public List<CannabisApplications> findAll(
		int start, int end,
		OrderByComparator<CannabisApplications> orderByComparator,
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

		List<CannabisApplications> list = null;

		if (useFinderCache) {
			list = (List<CannabisApplications>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_CANNABISAPPLICATIONS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_CANNABISAPPLICATIONS;

				sql = sql.concat(CannabisApplicationsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<CannabisApplications>)QueryUtil.list(
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
	 * Removes all the cannabis applicationses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (CannabisApplications cannabisApplications : findAll()) {
			remove(cannabisApplications);
		}
	}

	/**
	 * Returns the number of cannabis applicationses.
	 *
	 * @return the number of cannabis applicationses
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
					_SQL_COUNT_CANNABISAPPLICATIONS);

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
		return "cannabisApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_CANNABISAPPLICATIONS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return CannabisApplicationsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the cannabis applications persistence.
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

		_finderPathWithPaginationFindBygetCannabisApplicationsByLicenseCategory =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCannabisApplicationsByLicenseCategory",
				new String[] {
					Integer.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "licenseCategory"}, true);

		_finderPathWithoutPaginationFindBygetCannabisApplicationsByLicenseCategory =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCannabisApplicationsByLicenseCategory",
				new String[] {Integer.class.getName(), String.class.getName()},
				new String[] {"status", "licenseCategory"}, true);

		_finderPathCountBygetCannabisApplicationsByLicenseCategory =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetCannabisApplicationsByLicenseCategory",
				new String[] {Integer.class.getName(), String.class.getName()},
				new String[] {"status", "licenseCategory"}, false);

		_finderPathWithPaginationFindBygetCannabisApplicationsByLicenseSubCategory =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCannabisApplicationsByLicenseSubCategory",
				new String[] {
					Integer.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "licenseSubCategory"}, true);

		_finderPathWithoutPaginationFindBygetCannabisApplicationsByLicenseSubCategory =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCannabisApplicationsByLicenseSubCategory",
				new String[] {Integer.class.getName(), String.class.getName()},
				new String[] {"status", "licenseSubCategory"}, true);

		_finderPathCountBygetCannabisApplicationsByLicenseSubCategory =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetCannabisApplicationsByLicenseSubCategory",
				new String[] {Integer.class.getName(), String.class.getName()},
				new String[] {"status", "licenseSubCategory"}, false);

		_finderPathFetchBygetCannabisApplicationsByRT_ExpiredAppNo =
			new FinderPath(
				FINDER_CLASS_NAME_ENTITY,
				"fetchBygetCannabisApplicationsByRT_ExpiredAppNo",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"requestType", "expiredLicenseAppNo"}, true);

		_finderPathCountBygetCannabisApplicationsByRT_ExpiredAppNo =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"countBygetCannabisApplicationsByRT_ExpiredAppNo",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"requestType", "expiredLicenseAppNo"}, false);

		_finderPathWithPaginationFindBygetCannabisApplicationsByRequestType =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCannabisApplicationsByRequestType",
				new String[] {
					Integer.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "requestType"}, true);

		_finderPathWithoutPaginationFindBygetCannabisApplicationsByRequestType =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCannabisApplicationsByRequestType",
				new String[] {Integer.class.getName(), String.class.getName()},
				new String[] {"status", "requestType"}, true);

		_finderPathCountBygetCannabisApplicationsByRequestType = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisApplicationsByRequestType",
			new String[] {Integer.class.getName(), String.class.getName()},
			new String[] {"status", "requestType"}, false);

		_finderPathWithPaginationFindBygetCannabisApplicationsByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCannabisApplicationsByStatus",
				new String[] {
					Integer.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetCannabisApplicationsByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCannabisApplicationsByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetCannabisApplicationsByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisApplicationsByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetCannabisApplicationsByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCannabisApplicationsByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetCannabisApplicationsByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCannabisApplicationsByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetCannabisApplicationsByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisApplicationsByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathWithPaginationFindBygetCannabisApplicationsByUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetCannabisApplicationsByUser",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"userId"}, true);

		_finderPathWithoutPaginationFindBygetCannabisApplicationsByUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetCannabisApplicationsByUser",
				new String[] {Long.class.getName()}, new String[] {"userId"},
				true);

		_finderPathCountBygetCannabisApplicationsByUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisApplicationsByUser",
			new String[] {Long.class.getName()}, new String[] {"userId"},
			false);

		_finderPathFetchBygetCannabisApplicationsAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetCannabisApplicationsAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetCannabisApplicationsAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetCannabisApplicationsAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBycannabisApplicationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBycannabisApplicationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBycannabisApplicationByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBycannabisApplicationByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		CannabisApplicationsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		CannabisApplicationsUtil.setPersistence(null);

		entityCache.removeCache(CannabisApplicationsImpl.class.getName());
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = CANNABISPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_CANNABISAPPLICATIONS =
		"SELECT cannabisApplications FROM CannabisApplications cannabisApplications";

	private static final String _SQL_SELECT_CANNABISAPPLICATIONS_WHERE =
		"SELECT cannabisApplications FROM CannabisApplications cannabisApplications WHERE ";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONS =
		"SELECT COUNT(cannabisApplications) FROM CannabisApplications cannabisApplications";

	private static final String _SQL_COUNT_CANNABISAPPLICATIONS_WHERE =
		"SELECT COUNT(cannabisApplications) FROM CannabisApplications cannabisApplications WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"cannabisApplications.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No CannabisApplications exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No CannabisApplications exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		CannabisApplicationsPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
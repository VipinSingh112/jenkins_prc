/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jadsc.application.form.service.service.persistence.impl;

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

import com.nbp.jadsc.application.form.service.exception.NoSuchJADSCApplicationException;
import com.nbp.jadsc.application.form.service.model.JADSCApplication;
import com.nbp.jadsc.application.form.service.model.JADSCApplicationTable;
import com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationImpl;
import com.nbp.jadsc.application.form.service.model.impl.JADSCApplicationModelImpl;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCApplicationPersistence;
import com.nbp.jadsc.application.form.service.service.persistence.JADSCApplicationUtil;
import com.nbp.jadsc.application.form.service.service.persistence.impl.constants.JADSC_FORMPersistenceConstants;

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
 * The persistence implementation for the jadsc application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JADSCApplicationPersistence.class)
public class JADSCApplicationPersistenceImpl
	extends BasePersistenceImpl<JADSCApplication>
	implements JADSCApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JADSCApplicationUtil</code> to access the jadsc application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JADSCApplicationImpl.class.getName();

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
	 * Returns all the jadsc applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
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

		List<JADSCApplication> list = null;

		if (useFinderCache) {
			list = (List<JADSCApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCApplication jadscApplication : list) {
					if (!uuid.equals(jadscApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

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
				sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCApplication>)QueryUtil.list(
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
	 * Returns the first jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findByUuid_First(
			String uuid, OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchByUuid_First(
		String uuid, OrderByComparator<JADSCApplication> orderByComparator) {

		List<JADSCApplication> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findByUuid_Last(
			String uuid, OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchByUuid_Last(
		String uuid, OrderByComparator<JADSCApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JADSCApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where uuid = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication[] findByUuid_PrevAndNext(
			long jadscApplicationId, String uuid,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		uuid = Objects.toString(uuid, "");

		JADSCApplication jadscApplication = findByPrimaryKey(
			jadscApplicationId);

		Session session = null;

		try {
			session = openSession();

			JADSCApplication[] array = new JADSCApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jadscApplication, uuid, orderByComparator, true);

			array[1] = jadscApplication;

			array[2] = getByUuid_PrevAndNext(
				session, jadscApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JADSCApplication getByUuid_PrevAndNext(
		Session session, JADSCApplication jadscApplication, String uuid,
		OrderByComparator<JADSCApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

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
			sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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
						jadscApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JADSCApplication jadscApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplication);
		}
	}

	/**
	 * Returns the number of jadsc applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

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
		"jadscApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jadscApplication.uuid IS NULL OR jadscApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchByUUID_G(uuid, groupId);

		if (jadscApplication == null) {
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

			throw new NoSuchJADSCApplicationException(sb.toString());
		}

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jadsc application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchByUUID_G(
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

		if (result instanceof JADSCApplication) {
			JADSCApplication jadscApplication = (JADSCApplication)result;

			if (!Objects.equals(uuid, jadscApplication.getUuid()) ||
				(groupId != jadscApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

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

				List<JADSCApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JADSCApplication jadscApplication = list.get(0);

					result = jadscApplication;

					cacheResult(jadscApplication);
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
			return (JADSCApplication)result;
		}
	}

	/**
	 * Removes the jadsc application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jadsc application that was removed
	 */
	@Override
	public JADSCApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findByUUID_G(uuid, groupId);

		return remove(jadscApplication);
	}

	/**
	 * Returns the number of jadsc applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

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
		"jadscApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jadscApplication.uuid IS NULL OR jadscApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jadscApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
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

		List<JADSCApplication> list = null;

		if (useFinderCache) {
			list = (List<JADSCApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCApplication jadscApplication : list) {
					if (!uuid.equals(jadscApplication.getUuid()) ||
						(companyId != jadscApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

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
				sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCApplication>)QueryUtil.list(
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
	 * Returns the first jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the first jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		List<JADSCApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the last jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JADSCApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication[] findByUuid_C_PrevAndNext(
			long jadscApplicationId, String uuid, long companyId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		uuid = Objects.toString(uuid, "");

		JADSCApplication jadscApplication = findByPrimaryKey(
			jadscApplicationId);

		Session session = null;

		try {
			session = openSession();

			JADSCApplication[] array = new JADSCApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jadscApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = jadscApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, jadscApplication, uuid, companyId, orderByComparator,
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

	protected JADSCApplication getByUuid_C_PrevAndNext(
		Session session, JADSCApplication jadscApplication, String uuid,
		long companyId, OrderByComparator<JADSCApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

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
			sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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
						jadscApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JADSCApplication jadscApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscApplication);
		}
	}

	/**
	 * Returns the number of jadsc applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

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
		"jadscApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jadscApplication.uuid IS NULL OR jadscApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jadscApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetJADSCById;
	private FinderPath _finderPathCountBygetJADSCById;

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCById(
			jadscApplicationId);

		if (jadscApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jadscApplicationId=");
			sb.append(jadscApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCApplicationException(sb.toString());
		}

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCById(long jadscApplicationId) {
		return fetchBygetJADSCById(jadscApplicationId, true);
	}

	/**
	 * Returns the jadsc application where jadscApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCById(
		long jadscApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {jadscApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJADSCById, finderArgs, this);
		}

		if (result instanceof JADSCApplication) {
			JADSCApplication jadscApplication = (JADSCApplication)result;

			if (jadscApplicationId !=
					jadscApplication.getJadscApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

				List<JADSCApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJADSCById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {jadscApplicationId};
							}

							_log.warn(
								"JADSCApplicationPersistenceImpl.fetchBygetJADSCById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCApplication jadscApplication = list.get(0);

					result = jadscApplication;

					cacheResult(jadscApplication);
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
			return (JADSCApplication)result;
		}
	}

	/**
	 * Removes the jadsc application where jadscApplicationId = &#63; from the database.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the jadsc application that was removed
	 */
	@Override
	public JADSCApplication removeBygetJADSCById(long jadscApplicationId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findBygetJADSCById(
			jadscApplicationId);

		return remove(jadscApplication);
	}

	/**
	 * Returns the number of jadsc applications where jadscApplicationId = &#63;.
	 *
	 * @param jadscApplicationId the jadsc application ID
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCById(long jadscApplicationId) {
		FinderPath finderPath = _finderPathCountBygetJADSCById;

		Object[] finderArgs = new Object[] {jadscApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(jadscApplicationId);

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
		_FINDER_COLUMN_GETJADSCBYID_JADSCAPPLICATIONID_2 =
			"jadscApplication.jadscApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetJADSCByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetJADSCByS_U;
	private FinderPath _finderPathCountBygetJADSCByS_U;

	/**
	 * Returns all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByS_U(int status, long userId) {
		return findBygetJADSCByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end) {

		return findBygetJADSCByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return findBygetJADSCByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJADSCByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJADSCByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<JADSCApplication> list = null;

		if (useFinderCache) {
			list = (List<JADSCApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCApplication jadscApplication : list) {
					if ((status != jadscApplication.getStatus()) ||
						(userId != jadscApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETJADSCBYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<JADSCApplication>)QueryUtil.list(
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
	 * Returns the first jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByS_U_First(
			int status, long userId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByS_U_First(
			status, userId, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByS_U_First(
		int status, long userId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		List<JADSCApplication> list = findBygetJADSCByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByS_U_Last(
			int status, long userId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByS_U_Last(
			status, userId, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByS_U_Last(
		int status, long userId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		int count = countBygetJADSCByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<JADSCApplication> list = findBygetJADSCByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication[] findBygetJADSCByS_U_PrevAndNext(
			long jadscApplicationId, int status, long userId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findByPrimaryKey(
			jadscApplicationId);

		Session session = null;

		try {
			session = openSession();

			JADSCApplication[] array = new JADSCApplicationImpl[3];

			array[0] = getBygetJADSCByS_U_PrevAndNext(
				session, jadscApplication, status, userId, orderByComparator,
				true);

			array[1] = jadscApplication;

			array[2] = getBygetJADSCByS_U_PrevAndNext(
				session, jadscApplication, status, userId, orderByComparator,
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

	protected JADSCApplication getBygetJADSCByS_U_PrevAndNext(
		Session session, JADSCApplication jadscApplication, int status,
		long userId, OrderByComparator<JADSCApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETJADSCBYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETJADSCBYS_U_USERID_2);

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
			sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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
						jadscApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetJADSCByS_U(int status, long userId) {
		for (JADSCApplication jadscApplication :
				findBygetJADSCByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscApplication);
		}
	}

	/**
	 * Returns the number of jadsc applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetJADSCByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETJADSCBYS_U_USERID_2);

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

	private static final String _FINDER_COLUMN_GETJADSCBYS_U_STATUS_2 =
		"jadscApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETJADSCBYS_U_USERID_2 =
		"jadscApplication.userId = ?";

	private FinderPath _finderPathFetchBygetJADSCByCaseId;
	private FinderPath _finderPathCountBygetJADSCByCaseId;

	/**
	 * Returns the jadsc application where caseId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByCaseId(String caseId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByCaseId(caseId);

		if (jadscApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCApplicationException(sb.toString());
		}

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByCaseId(String caseId) {
		return fetchBygetJADSCByCaseId(caseId, true);
	}

	/**
	 * Returns the jadsc application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJADSCByCaseId, finderArgs, this);
		}

		if (result instanceof JADSCApplication) {
			JADSCApplication jadscApplication = (JADSCApplication)result;

			if (!Objects.equals(caseId, jadscApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYCASEID_CASEID_2);
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

				List<JADSCApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJADSCByCaseId, finderArgs,
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
								"JADSCApplicationPersistenceImpl.fetchBygetJADSCByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCApplication jadscApplication = list.get(0);

					result = jadscApplication;

					cacheResult(jadscApplication);
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
			return (JADSCApplication)result;
		}
	}

	/**
	 * Removes the jadsc application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jadsc application that was removed
	 */
	@Override
	public JADSCApplication removeBygetJADSCByCaseId(String caseId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findBygetJADSCByCaseId(caseId);

		return remove(jadscApplication);
	}

	/**
	 * Returns the number of jadsc applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJADSCByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSCBYCASEID_CASEID_2 =
		"jadscApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSCBYCASEID_CASEID_3 =
		"(jadscApplication.caseId IS NULL OR jadscApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJADSCByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetJADSCByStatus;
	private FinderPath _finderPathCountBygetJADSCByStatus;

	/**
	 * Returns all the jadsc applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByStatus(int status) {
		return findBygetJADSCByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end) {

		return findBygetJADSCByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return findBygetJADSCByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByStatus(
		int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJADSCByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJADSCByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<JADSCApplication> list = null;

		if (useFinderCache) {
			list = (List<JADSCApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCApplication jadscApplication : list) {
					if (status != jadscApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<JADSCApplication>)QueryUtil.list(
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
	 * Returns the first jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByStatus_First(
			int status, OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByStatus_First(
			status, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the first jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByStatus_First(
		int status, OrderByComparator<JADSCApplication> orderByComparator) {

		List<JADSCApplication> list = findBygetJADSCByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByStatus_Last(
			int status, OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByStatus_Last(
			status, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the last jadsc application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByStatus_Last(
		int status, OrderByComparator<JADSCApplication> orderByComparator) {

		int count = countBygetJADSCByStatus(status);

		if (count == 0) {
			return null;
		}

		List<JADSCApplication> list = findBygetJADSCByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where status = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication[] findBygetJADSCByStatus_PrevAndNext(
			long jadscApplicationId, int status,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findByPrimaryKey(
			jadscApplicationId);

		Session session = null;

		try {
			session = openSession();

			JADSCApplication[] array = new JADSCApplicationImpl[3];

			array[0] = getBygetJADSCByStatus_PrevAndNext(
				session, jadscApplication, status, orderByComparator, true);

			array[1] = jadscApplication;

			array[2] = getBygetJADSCByStatus_PrevAndNext(
				session, jadscApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JADSCApplication getBygetJADSCByStatus_PrevAndNext(
		Session session, JADSCApplication jadscApplication, int status,
		OrderByComparator<JADSCApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETJADSCBYSTATUS_STATUS_2);

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
			sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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
						jadscApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetJADSCByStatus(int status) {
		for (JADSCApplication jadscApplication :
				findBygetJADSCByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplication);
		}
	}

	/**
	 * Returns the number of jadsc applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetJADSCByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJADSCBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETJADSCBYSTATUS_STATUS_2 =
		"jadscApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetJADSCByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetJADSCByEntityId;
	private FinderPath _finderPathCountBygetJADSCByEntityId;

	/**
	 * Returns all the jadsc applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId(String entityId) {
		return findBygetJADSCByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end) {

		return findBygetJADSCByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return findBygetJADSCByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId(
		String entityId, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJADSCByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJADSCByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<JADSCApplication> list = null;

		if (useFinderCache) {
			list = (List<JADSCApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCApplication jadscApplication : list) {
					if (!entityId.equals(jadscApplication.getEntityId())) {
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

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCApplication>)QueryUtil.list(
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
	 * Returns the first jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByEntityId_First(
			String entityId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByEntityId_First(
			entityId, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByEntityId_First(
		String entityId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		List<JADSCApplication> list = findBygetJADSCByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByEntityId_Last(
			String entityId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByEntityId_Last(
			entityId, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByEntityId_Last(
		String entityId,
		OrderByComparator<JADSCApplication> orderByComparator) {

		int count = countBygetJADSCByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<JADSCApplication> list = findBygetJADSCByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where entityId = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication[] findBygetJADSCByEntityId_PrevAndNext(
			long jadscApplicationId, String entityId,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		entityId = Objects.toString(entityId, "");

		JADSCApplication jadscApplication = findByPrimaryKey(
			jadscApplicationId);

		Session session = null;

		try {
			session = openSession();

			JADSCApplication[] array = new JADSCApplicationImpl[3];

			array[0] = getBygetJADSCByEntityId_PrevAndNext(
				session, jadscApplication, entityId, orderByComparator, true);

			array[1] = jadscApplication;

			array[2] = getBygetJADSCByEntityId_PrevAndNext(
				session, jadscApplication, entityId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JADSCApplication getBygetJADSCByEntityId_PrevAndNext(
		Session session, JADSCApplication jadscApplication, String entityId,
		OrderByComparator<JADSCApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_2);
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
			sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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
						jadscApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetJADSCByEntityId(String entityId) {
		for (JADSCApplication jadscApplication :
				findBygetJADSCByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jadscApplication);
		}
	}

	/**
	 * Returns the number of jadsc applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetJADSCByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_2);
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

	private static final String _FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_2 =
		"jadscApplication.entityId = ?";

	private static final String _FINDER_COLUMN_GETJADSCBYENTITYID_ENTITYID_3 =
		"(jadscApplication.entityId IS NULL OR jadscApplication.entityId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJADSCByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetJADSCByEntityId_Status;
	private FinderPath _finderPathCountBygetJADSCByEntityId_Status;

	/**
	 * Returns all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status) {

		return findBygetJADSCByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetJADSCByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return findBygetJADSCByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jadsc applications
	 */
	@Override
	public List<JADSCApplication> findBygetJADSCByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJADSCByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetJADSCByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<JADSCApplication> list = null;

		if (useFinderCache) {
			list = (List<JADSCApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JADSCApplication jadscApplication : list) {
					if (!entityId.equals(jadscApplication.getEntityId()) ||
						(status != jadscApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JADSCApplication>)QueryUtil.list(
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
	 * Returns the first jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication =
			fetchBygetJADSCByEntityId_Status_First(
				entityId, status, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the first jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<JADSCApplication> orderByComparator) {

		List<JADSCApplication> list = findBygetJADSCByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication =
			fetchBygetJADSCByEntityId_Status_Last(
				entityId, status, orderByComparator);

		if (jadscApplication != null) {
			return jadscApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJADSCApplicationException(sb.toString());
	}

	/**
	 * Returns the last jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<JADSCApplication> orderByComparator) {

		int count = countBygetJADSCByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<JADSCApplication> list = findBygetJADSCByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jadsc applications before and after the current jadsc application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param jadscApplicationId the primary key of the current jadsc application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication[] findBygetJADSCByEntityId_Status_PrevAndNext(
			long jadscApplicationId, String entityId, int status,
			OrderByComparator<JADSCApplication> orderByComparator)
		throws NoSuchJADSCApplicationException {

		entityId = Objects.toString(entityId, "");

		JADSCApplication jadscApplication = findByPrimaryKey(
			jadscApplicationId);

		Session session = null;

		try {
			session = openSession();

			JADSCApplication[] array = new JADSCApplicationImpl[3];

			array[0] = getBygetJADSCByEntityId_Status_PrevAndNext(
				session, jadscApplication, entityId, status, orderByComparator,
				true);

			array[1] = jadscApplication;

			array[2] = getBygetJADSCByEntityId_Status_PrevAndNext(
				session, jadscApplication, entityId, status, orderByComparator,
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

	protected JADSCApplication getBygetJADSCByEntityId_Status_PrevAndNext(
		Session session, JADSCApplication jadscApplication, String entityId,
		int status, OrderByComparator<JADSCApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_STATUS_2);

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
			sb.append(JADSCApplicationModelImpl.ORDER_BY_JPQL);
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
						jadscApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JADSCApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jadsc applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetJADSCByEntityId_Status(String entityId, int status) {
		for (JADSCApplication jadscApplication :
				findBygetJADSCByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jadscApplication);
		}
	}

	/**
	 * Returns the number of jadsc applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCByEntityId_Status(String entityId, int status) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetJADSCByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_STATUS_2);

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
		_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_2 =
			"jadscApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_ENTITYID_3 =
			"(jadscApplication.entityId IS NULL OR jadscApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJADSCBYENTITYID_STATUS_STATUS_2 =
			"jadscApplication.status = ?";

	private FinderPath _finderPathFetchBygetJADSCByEI_CI;
	private FinderPath _finderPathCountBygetJADSCByEI_CI;

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByEI_CI(
			String entityId, String caseId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByEI_CI(
			entityId, caseId);

		if (jadscApplication == null) {
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

			throw new NoSuchJADSCApplicationException(sb.toString());
		}

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByEI_CI(
		String entityId, String caseId) {

		return fetchBygetJADSCByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the jadsc application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByEI_CI(
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
				_finderPathFetchBygetJADSCByEI_CI, finderArgs, this);
		}

		if (result instanceof JADSCApplication) {
			JADSCApplication jadscApplication = (JADSCApplication)result;

			if (!Objects.equals(entityId, jadscApplication.getEntityId()) ||
				!Objects.equals(caseId, jadscApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_CASEID_2);
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

				List<JADSCApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJADSCByEI_CI, finderArgs,
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
								"JADSCApplicationPersistenceImpl.fetchBygetJADSCByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCApplication jadscApplication = list.get(0);

					result = jadscApplication;

					cacheResult(jadscApplication);
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
			return (JADSCApplication)result;
		}
	}

	/**
	 * Removes the jadsc application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the jadsc application that was removed
	 */
	@Override
	public JADSCApplication removeBygetJADSCByEI_CI(
			String entityId, String caseId)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findBygetJADSCByEI_CI(
			entityId, caseId);

		return remove(jadscApplication);
	}

	/**
	 * Returns the number of jadsc applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJADSCByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYEI_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJADSCBYEI_CI_ENTITYID_2 =
		"jadscApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETJADSCBYEI_CI_ENTITYID_3 =
		"(jadscApplication.entityId IS NULL OR jadscApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETJADSCBYEI_CI_CASEID_2 =
		"jadscApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETJADSCBYEI_CI_CASEID_3 =
		"(jadscApplication.caseId IS NULL OR jadscApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetJADSCByAppNo;
	private FinderPath _finderPathCountBygetJADSCByAppNo;

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCByAppNo(String applicationNumber)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCByAppNo(
			applicationNumber);

		if (jadscApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCApplicationException(sb.toString());
		}

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByAppNo(String applicationNumber) {
		return fetchBygetJADSCByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the jadsc application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJADSCByAppNo, finderArgs, this);
		}

		if (result instanceof JADSCApplication) {
			JADSCApplication jadscApplication = (JADSCApplication)result;

			if (!Objects.equals(
					applicationNumber,
					jadscApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYAPPNO_APPLICATIONNUMBER_2);
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

				List<JADSCApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJADSCByAppNo, finderArgs,
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
								"JADSCApplicationPersistenceImpl.fetchBygetJADSCByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCApplication jadscApplication = list.get(0);

					result = jadscApplication;

					cacheResult(jadscApplication);
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
			return (JADSCApplication)result;
		}
	}

	/**
	 * Removes the jadsc application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the jadsc application that was removed
	 */
	@Override
	public JADSCApplication removeBygetJADSCByAppNo(String applicationNumber)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findBygetJADSCByAppNo(
			applicationNumber);

		return remove(jadscApplication);
	}

	/**
	 * Returns the number of jadsc applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetJADSCByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJADSCBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETJADSCBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETJADSCBYAPPNO_APPLICATIONNUMBER_2 =
			"jadscApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETJADSCBYAPPNO_APPLICATIONNUMBER_3 =
			"(jadscApplication.applicationNumber IS NULL OR jadscApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetJADSCRegstByAT_AppNo;
	private FinderPath _finderPathCountBygetJADSCRegstByAT_AppNo;

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jadsc application
	 * @throws NoSuchJADSCApplicationException if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication findBygetJADSCRegstByAT_AppNo(
			String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);

		if (jadscApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("breachOfConfidentiality=");
			sb.append(breachOfConfidentiality);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJADSCApplicationException(sb.toString());
		}

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber) {

		return fetchBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jadsc application, or <code>null</code> if a matching jadsc application could not be found
	 */
	@Override
	public JADSCApplication fetchBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		breachOfConfidentiality = Objects.toString(breachOfConfidentiality, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				breachOfConfidentiality, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJADSCRegstByAT_AppNo, finderArgs, this);
		}

		if (result instanceof JADSCApplication) {
			JADSCApplication jadscApplication = (JADSCApplication)result;

			if (!Objects.equals(
					breachOfConfidentiality,
					jadscApplication.getBreachOfConfidentiality()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					jadscApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JADSCAPPLICATION_WHERE);

			boolean bindBreachOfConfidentiality = false;

			if (breachOfConfidentiality.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_BREACHOFCONFIDENTIALITY_3);
			}
			else {
				bindBreachOfConfidentiality = true;

				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_BREACHOFCONFIDENTIALITY_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindBreachOfConfidentiality) {
					queryPos.add(breachOfConfidentiality);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<JADSCApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJADSCRegstByAT_AppNo,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									breachOfConfidentiality,
									expiredLicenseAppNumber
								};
							}

							_log.warn(
								"JADSCApplicationPersistenceImpl.fetchBygetJADSCRegstByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JADSCApplication jadscApplication = list.get(0);

					result = jadscApplication;

					cacheResult(jadscApplication);
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
			return (JADSCApplication)result;
		}
	}

	/**
	 * Removes the jadsc application where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the jadsc application that was removed
	 */
	@Override
	public JADSCApplication removeBygetJADSCRegstByAT_AppNo(
			String breachOfConfidentiality, String expiredLicenseAppNumber)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = findBygetJADSCRegstByAT_AppNo(
			breachOfConfidentiality, expiredLicenseAppNumber);

		return remove(jadscApplication);
	}

	/**
	 * Returns the number of jadsc applications where breachOfConfidentiality = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param breachOfConfidentiality the breach of confidentiality
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching jadsc applications
	 */
	@Override
	public int countBygetJADSCRegstByAT_AppNo(
		String breachOfConfidentiality, String expiredLicenseAppNumber) {

		breachOfConfidentiality = Objects.toString(breachOfConfidentiality, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetJADSCRegstByAT_AppNo;

		Object[] finderArgs = new Object[] {
			breachOfConfidentiality, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JADSCAPPLICATION_WHERE);

			boolean bindBreachOfConfidentiality = false;

			if (breachOfConfidentiality.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_BREACHOFCONFIDENTIALITY_3);
			}
			else {
				bindBreachOfConfidentiality = true;

				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_BREACHOFCONFIDENTIALITY_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindBreachOfConfidentiality) {
					queryPos.add(breachOfConfidentiality);
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
		_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_BREACHOFCONFIDENTIALITY_2 =
			"jadscApplication.breachOfConfidentiality = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_BREACHOFCONFIDENTIALITY_3 =
			"(jadscApplication.breachOfConfidentiality IS NULL OR jadscApplication.breachOfConfidentiality = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"jadscApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETJADSCREGSTBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(jadscApplication.expiredLicenseAppNumber IS NULL OR jadscApplication.expiredLicenseAppNumber = '')";

	public JADSCApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JADSCApplication.class);

		setModelImplClass(JADSCApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(JADSCApplicationTable.INSTANCE);
	}

	/**
	 * Caches the jadsc application in the entity cache if it is enabled.
	 *
	 * @param jadscApplication the jadsc application
	 */
	@Override
	public void cacheResult(JADSCApplication jadscApplication) {
		entityCache.putResult(
			JADSCApplicationImpl.class, jadscApplication.getPrimaryKey(),
			jadscApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jadscApplication.getUuid(), jadscApplication.getGroupId()
			},
			jadscApplication);

		finderCache.putResult(
			_finderPathFetchBygetJADSCById,
			new Object[] {jadscApplication.getJadscApplicationId()},
			jadscApplication);

		finderCache.putResult(
			_finderPathFetchBygetJADSCByCaseId,
			new Object[] {jadscApplication.getCaseId()}, jadscApplication);

		finderCache.putResult(
			_finderPathFetchBygetJADSCByEI_CI,
			new Object[] {
				jadscApplication.getEntityId(), jadscApplication.getCaseId()
			},
			jadscApplication);

		finderCache.putResult(
			_finderPathFetchBygetJADSCByAppNo,
			new Object[] {jadscApplication.getApplicationNumber()},
			jadscApplication);

		finderCache.putResult(
			_finderPathFetchBygetJADSCRegstByAT_AppNo,
			new Object[] {
				jadscApplication.getBreachOfConfidentiality(),
				jadscApplication.getExpiredLicenseAppNumber()
			},
			jadscApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jadsc applications in the entity cache if it is enabled.
	 *
	 * @param jadscApplications the jadsc applications
	 */
	@Override
	public void cacheResult(List<JADSCApplication> jadscApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jadscApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JADSCApplication jadscApplication : jadscApplications) {
			if (entityCache.getResult(
					JADSCApplicationImpl.class,
					jadscApplication.getPrimaryKey()) == null) {

				cacheResult(jadscApplication);
			}
		}
	}

	/**
	 * Clears the cache for all jadsc applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JADSCApplicationImpl.class);

		finderCache.clearCache(JADSCApplicationImpl.class);
	}

	/**
	 * Clears the cache for the jadsc application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JADSCApplication jadscApplication) {
		entityCache.removeResult(JADSCApplicationImpl.class, jadscApplication);
	}

	@Override
	public void clearCache(List<JADSCApplication> jadscApplications) {
		for (JADSCApplication jadscApplication : jadscApplications) {
			entityCache.removeResult(
				JADSCApplicationImpl.class, jadscApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JADSCApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JADSCApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JADSCApplicationModelImpl jadscApplicationModelImpl) {

		Object[] args = new Object[] {
			jadscApplicationModelImpl.getUuid(),
			jadscApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jadscApplicationModelImpl);

		args = new Object[] {jadscApplicationModelImpl.getJadscApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetJADSCById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCById, args, jadscApplicationModelImpl);

		args = new Object[] {jadscApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJADSCByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCByCaseId, args,
			jadscApplicationModelImpl);

		args = new Object[] {
			jadscApplicationModelImpl.getEntityId(),
			jadscApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetJADSCByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCByEI_CI, args, jadscApplicationModelImpl);

		args = new Object[] {jadscApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetJADSCByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCByAppNo, args, jadscApplicationModelImpl);

		args = new Object[] {
			jadscApplicationModelImpl.getBreachOfConfidentiality(),
			jadscApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetJADSCRegstByAT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJADSCRegstByAT_AppNo, args,
			jadscApplicationModelImpl);
	}

	/**
	 * Creates a new jadsc application with the primary key. Does not add the jadsc application to the database.
	 *
	 * @param jadscApplicationId the primary key for the new jadsc application
	 * @return the new jadsc application
	 */
	@Override
	public JADSCApplication create(long jadscApplicationId) {
		JADSCApplication jadscApplication = new JADSCApplicationImpl();

		jadscApplication.setNew(true);
		jadscApplication.setPrimaryKey(jadscApplicationId);

		String uuid = PortalUUIDUtil.generate();

		jadscApplication.setUuid(uuid);

		jadscApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jadscApplication;
	}

	/**
	 * Removes the jadsc application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application that was removed
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication remove(long jadscApplicationId)
		throws NoSuchJADSCApplicationException {

		return remove((Serializable)jadscApplicationId);
	}

	/**
	 * Removes the jadsc application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jadsc application
	 * @return the jadsc application that was removed
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication remove(Serializable primaryKey)
		throws NoSuchJADSCApplicationException {

		Session session = null;

		try {
			session = openSession();

			JADSCApplication jadscApplication = (JADSCApplication)session.get(
				JADSCApplicationImpl.class, primaryKey);

			if (jadscApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJADSCApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jadscApplication);
		}
		catch (NoSuchJADSCApplicationException noSuchEntityException) {
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
	protected JADSCApplication removeImpl(JADSCApplication jadscApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jadscApplication)) {
				jadscApplication = (JADSCApplication)session.get(
					JADSCApplicationImpl.class,
					jadscApplication.getPrimaryKeyObj());
			}

			if (jadscApplication != null) {
				session.delete(jadscApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jadscApplication != null) {
			clearCache(jadscApplication);
		}

		return jadscApplication;
	}

	@Override
	public JADSCApplication updateImpl(JADSCApplication jadscApplication) {
		boolean isNew = jadscApplication.isNew();

		if (!(jadscApplication instanceof JADSCApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jadscApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jadscApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jadscApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JADSCApplication implementation " +
					jadscApplication.getClass());
		}

		JADSCApplicationModelImpl jadscApplicationModelImpl =
			(JADSCApplicationModelImpl)jadscApplication;

		if (Validator.isNull(jadscApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jadscApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jadscApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				jadscApplication.setCreateDate(date);
			}
			else {
				jadscApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jadscApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jadscApplication.setModifiedDate(date);
			}
			else {
				jadscApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jadscApplication);
			}
			else {
				jadscApplication = (JADSCApplication)session.merge(
					jadscApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JADSCApplicationImpl.class, jadscApplicationModelImpl, false, true);

		cacheUniqueFindersCache(jadscApplicationModelImpl);

		if (isNew) {
			jadscApplication.setNew(false);
		}

		jadscApplication.resetOriginalValues();

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jadsc application
	 * @return the jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJADSCApplicationException {

		JADSCApplication jadscApplication = fetchByPrimaryKey(primaryKey);

		if (jadscApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJADSCApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jadscApplication;
	}

	/**
	 * Returns the jadsc application with the primary key or throws a <code>NoSuchJADSCApplicationException</code> if it could not be found.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application
	 * @throws NoSuchJADSCApplicationException if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication findByPrimaryKey(long jadscApplicationId)
		throws NoSuchJADSCApplicationException {

		return findByPrimaryKey((Serializable)jadscApplicationId);
	}

	/**
	 * Returns the jadsc application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jadscApplicationId the primary key of the jadsc application
	 * @return the jadsc application, or <code>null</code> if a jadsc application with the primary key could not be found
	 */
	@Override
	public JADSCApplication fetchByPrimaryKey(long jadscApplicationId) {
		return fetchByPrimaryKey((Serializable)jadscApplicationId);
	}

	/**
	 * Returns all the jadsc applications.
	 *
	 * @return the jadsc applications
	 */
	@Override
	public List<JADSCApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @return the range of jadsc applications
	 */
	@Override
	public List<JADSCApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jadsc applications
	 */
	@Override
	public List<JADSCApplication> findAll(
		int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jadsc applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JADSCApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jadsc applications
	 * @param end the upper bound of the range of jadsc applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jadsc applications
	 */
	@Override
	public List<JADSCApplication> findAll(
		int start, int end,
		OrderByComparator<JADSCApplication> orderByComparator,
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

		List<JADSCApplication> list = null;

		if (useFinderCache) {
			list = (List<JADSCApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JADSCAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JADSCAPPLICATION;

				sql = sql.concat(JADSCApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JADSCApplication>)QueryUtil.list(
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
	 * Removes all the jadsc applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JADSCApplication jadscApplication : findAll()) {
			remove(jadscApplication);
		}
	}

	/**
	 * Returns the number of jadsc applications.
	 *
	 * @return the number of jadsc applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JADSCAPPLICATION);

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
		return "jadscApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JADSCAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JADSCApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jadsc application persistence.
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

		_finderPathFetchBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, true);

		_finderPathCountBygetJADSCById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCById",
			new String[] {Long.class.getName()},
			new String[] {"jadscApplicationId"}, false);

		_finderPathWithPaginationFindBygetJADSCByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJADSCByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetJADSCByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJADSCByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetJADSCByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetJADSCByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJADSCByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJADSCByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJADSCByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		_finderPathWithPaginationFindBygetJADSCByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJADSCByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetJADSCByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJADSCByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetJADSCByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJADSCByStatus", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathWithPaginationFindBygetJADSCByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJADSCByEntityId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetJADSCByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJADSCByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, true);

		_finderPathCountBygetJADSCByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJADSCByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetJADSCByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetJADSCByEntityId_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetJADSCByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetJADSCByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetJADSCByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJADSCByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetJADSCByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJADSCByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetJADSCByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetJADSCByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJADSCByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetJADSCByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJADSCByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetJADSCRegstByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJADSCRegstByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"breachOfConfidentiality", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetJADSCRegstByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJADSCRegstByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"breachOfConfidentiality", "expiredLicenseAppNumber"},
			false);

		JADSCApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JADSCApplicationUtil.setPersistence(null);

		entityCache.removeCache(JADSCApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JADSC_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JADSCAPPLICATION =
		"SELECT jadscApplication FROM JADSCApplication jadscApplication";

	private static final String _SQL_SELECT_JADSCAPPLICATION_WHERE =
		"SELECT jadscApplication FROM JADSCApplication jadscApplication WHERE ";

	private static final String _SQL_COUNT_JADSCAPPLICATION =
		"SELECT COUNT(jadscApplication) FROM JADSCApplication jadscApplication";

	private static final String _SQL_COUNT_JADSCAPPLICATION_WHERE =
		"SELECT COUNT(jadscApplication) FROM JADSCApplication jadscApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jadscApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JADSCApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JADSCApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JADSCApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
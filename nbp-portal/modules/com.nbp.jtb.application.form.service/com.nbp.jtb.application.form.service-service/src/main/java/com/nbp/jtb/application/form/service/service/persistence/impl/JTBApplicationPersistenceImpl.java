/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.jtb.application.form.service.service.persistence.impl;

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

import com.nbp.jtb.application.form.service.exception.NoSuchJTBApplicationException;
import com.nbp.jtb.application.form.service.model.JTBApplication;
import com.nbp.jtb.application.form.service.model.JTBApplicationTable;
import com.nbp.jtb.application.form.service.model.impl.JTBApplicationImpl;
import com.nbp.jtb.application.form.service.model.impl.JTBApplicationModelImpl;
import com.nbp.jtb.application.form.service.service.persistence.JTBApplicationPersistence;
import com.nbp.jtb.application.form.service.service.persistence.JTBApplicationUtil;
import com.nbp.jtb.application.form.service.service.persistence.impl.constants.JTB_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the jtb application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JTBApplicationPersistence.class)
public class JTBApplicationPersistenceImpl
	extends BasePersistenceImpl<JTBApplication>
	implements JTBApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JTBApplicationUtil</code> to access the jtb application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JTBApplicationImpl.class.getName();

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
	 * Returns all the jtb applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
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

		List<JTBApplication> list = null;

		if (useFinderCache) {
			list = (List<JTBApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JTBApplication jtbApplication : list) {
					if (!uuid.equals(jtbApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

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
				sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JTBApplication>)QueryUtil.list(
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
	 * Returns the first jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findByUuid_First(
			String uuid, OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchByUuid_First(
		String uuid, OrderByComparator<JTBApplication> orderByComparator) {

		List<JTBApplication> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findByUuid_Last(
			String uuid, OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchByUuid_Last(
		String uuid, OrderByComparator<JTBApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JTBApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where uuid = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication[] findByUuid_PrevAndNext(
			long jtbApplicationId, String uuid,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		uuid = Objects.toString(uuid, "");

		JTBApplication jtbApplication = findByPrimaryKey(jtbApplicationId);

		Session session = null;

		try {
			session = openSession();

			JTBApplication[] array = new JTBApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, jtbApplication, uuid, orderByComparator, true);

			array[1] = jtbApplication;

			array[2] = getByUuid_PrevAndNext(
				session, jtbApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JTBApplication getByUuid_PrevAndNext(
		Session session, JTBApplication jtbApplication, String uuid,
		OrderByComparator<JTBApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

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
			sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
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
						jtbApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JTBApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JTBApplication jtbApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbApplication);
		}
	}

	/**
	 * Returns the number of jtb applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

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
		"jtbApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(jtbApplication.uuid IS NULL OR jtbApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchByUUID_G(uuid, groupId);

		if (jtbApplication == null) {
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

			throw new NoSuchJTBApplicationException(sb.toString());
		}

		return jtbApplication;
	}

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the jtb application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchByUUID_G(
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

		if (result instanceof JTBApplication) {
			JTBApplication jtbApplication = (JTBApplication)result;

			if (!Objects.equals(uuid, jtbApplication.getUuid()) ||
				(groupId != jtbApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

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

				List<JTBApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JTBApplication jtbApplication = list.get(0);

					result = jtbApplication;

					cacheResult(jtbApplication);
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
			return (JTBApplication)result;
		}
	}

	/**
	 * Removes the jtb application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the jtb application that was removed
	 */
	@Override
	public JTBApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = findByUUID_G(uuid, groupId);

		return remove(jtbApplication);
	}

	/**
	 * Returns the number of jtb applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

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
		"jtbApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(jtbApplication.uuid IS NULL OR jtbApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"jtbApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
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

		List<JTBApplication> list = null;

		if (useFinderCache) {
			list = (List<JTBApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JTBApplication jtbApplication : list) {
					if (!uuid.equals(jtbApplication.getUuid()) ||
						(companyId != jtbApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

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
				sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JTBApplication>)QueryUtil.list(
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
	 * Returns the first jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the first jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JTBApplication> orderByComparator) {

		List<JTBApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the last jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JTBApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JTBApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication[] findByUuid_C_PrevAndNext(
			long jtbApplicationId, String uuid, long companyId,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		uuid = Objects.toString(uuid, "");

		JTBApplication jtbApplication = findByPrimaryKey(jtbApplicationId);

		Session session = null;

		try {
			session = openSession();

			JTBApplication[] array = new JTBApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, jtbApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = jtbApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, jtbApplication, uuid, companyId, orderByComparator,
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

	protected JTBApplication getByUuid_C_PrevAndNext(
		Session session, JTBApplication jtbApplication, String uuid,
		long companyId, OrderByComparator<JTBApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

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
			sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
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
						jtbApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JTBApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JTBApplication jtbApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbApplication);
		}
	}

	/**
	 * Returns the number of jtb applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

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
		"jtbApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(jtbApplication.uuid IS NULL OR jtbApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"jtbApplication.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetJTB_ByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetJTB_ByS_U;
	private FinderPath _finderPathCountBygetJTB_ByS_U;

	/**
	 * Returns all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_ByS_U(long userId, int status) {
		return findBygetJTB_ByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end) {

		return findBygetJTB_ByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return findBygetJTB_ByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJTB_ByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJTB_ByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<JTBApplication> list = null;

		if (useFinderCache) {
			list = (List<JTBApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JTBApplication jtbApplication : list) {
					if ((userId != jtbApplication.getUserId()) ||
						(status != jtbApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETJTB_BYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<JTBApplication>)QueryUtil.list(
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
	 * Returns the first jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_ByS_U_First(
			long userId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_ByS_U_First(
			userId, status, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the first jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_ByS_U_First(
		long userId, int status,
		OrderByComparator<JTBApplication> orderByComparator) {

		List<JTBApplication> list = findBygetJTB_ByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_ByS_U_Last(
			long userId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_ByS_U_Last(
			userId, status, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the last jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_ByS_U_Last(
		long userId, int status,
		OrderByComparator<JTBApplication> orderByComparator) {

		int count = countBygetJTB_ByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<JTBApplication> list = findBygetJTB_ByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication[] findBygetJTB_ByS_U_PrevAndNext(
			long jtbApplicationId, long userId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = findByPrimaryKey(jtbApplicationId);

		Session session = null;

		try {
			session = openSession();

			JTBApplication[] array = new JTBApplicationImpl[3];

			array[0] = getBygetJTB_ByS_U_PrevAndNext(
				session, jtbApplication, userId, status, orderByComparator,
				true);

			array[1] = jtbApplication;

			array[2] = getBygetJTB_ByS_U_PrevAndNext(
				session, jtbApplication, userId, status, orderByComparator,
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

	protected JTBApplication getBygetJTB_ByS_U_PrevAndNext(
		Session session, JTBApplication jtbApplication, long userId, int status,
		OrderByComparator<JTBApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETJTB_BYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETJTB_BYS_U_STATUS_2);

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
			sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
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
						jtbApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JTBApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetJTB_ByS_U(long userId, int status) {
		for (JTBApplication jtbApplication :
				findBygetJTB_ByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(jtbApplication);
		}
	}

	/**
	 * Returns the number of jtb applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countBygetJTB_ByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetJTB_ByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETJTB_BYS_U_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETJTB_BYS_U_USERID_2 =
		"jtbApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETJTB_BYS_U_STATUS_2 =
		"jtbApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetJTB_By_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetJTB_By_Status;
	private FinderPath _finderPathCountBygetJTB_By_Status;

	/**
	 * Returns all the jtb applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_Status(int status) {
		return findBygetJTB_By_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end) {

		return findBygetJTB_By_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return findBygetJTB_By_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_Status(
		int status, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJTB_By_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJTB_By_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<JTBApplication> list = null;

		if (useFinderCache) {
			list = (List<JTBApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JTBApplication jtbApplication : list) {
					if (status != jtbApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BY_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<JTBApplication>)QueryUtil.list(
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
	 * Returns the first jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_By_Status_First(
			int status, OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_By_Status_First(
			status, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the first jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_Status_First(
		int status, OrderByComparator<JTBApplication> orderByComparator) {

		List<JTBApplication> list = findBygetJTB_By_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_By_Status_Last(
			int status, OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_By_Status_Last(
			status, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_Status_Last(
		int status, OrderByComparator<JTBApplication> orderByComparator) {

		int count = countBygetJTB_By_Status(status);

		if (count == 0) {
			return null;
		}

		List<JTBApplication> list = findBygetJTB_By_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where status = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication[] findBygetJTB_By_Status_PrevAndNext(
			long jtbApplicationId, int status,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = findByPrimaryKey(jtbApplicationId);

		Session session = null;

		try {
			session = openSession();

			JTBApplication[] array = new JTBApplicationImpl[3];

			array[0] = getBygetJTB_By_Status_PrevAndNext(
				session, jtbApplication, status, orderByComparator, true);

			array[1] = jtbApplication;

			array[2] = getBygetJTB_By_Status_PrevAndNext(
				session, jtbApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JTBApplication getBygetJTB_By_Status_PrevAndNext(
		Session session, JTBApplication jtbApplication, int status,
		OrderByComparator<JTBApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				4 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(3);
		}

		sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETJTB_BY_STATUS_STATUS_2);

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
			sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
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
						jtbApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JTBApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetJTB_By_Status(int status) {
		for (JTBApplication jtbApplication :
				findBygetJTB_By_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(jtbApplication);
		}
	}

	/**
	 * Returns the number of jtb applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countBygetJTB_By_Status(int status) {
		FinderPath finderPath = _finderPathCountBygetJTB_By_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BY_STATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETJTB_BY_STATUS_STATUS_2 =
		"jtbApplication.status = ?";

	private FinderPath _finderPathFetchBygetJTB_By_AppNum;
	private FinderPath _finderPathCountBygetJTB_By_AppNum;

	/**
	 * Returns the jtb application where applicationNumber = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_By_AppNum(String applicationNumber)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_By_AppNum(
			applicationNumber);

		if (jtbApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJTBApplicationException(sb.toString());
		}

		return jtbApplication;
	}

	/**
	 * Returns the jtb application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_AppNum(String applicationNumber) {
		return fetchBygetJTB_By_AppNum(applicationNumber, true);
	}

	/**
	 * Returns the jtb application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_AppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_By_AppNum, finderArgs, this);
		}

		if (result instanceof JTBApplication) {
			JTBApplication jtbApplication = (JTBApplication)result;

			if (!Objects.equals(
					applicationNumber, jtbApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_APPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_APPNUM_APPLICATIONNUMBER_2);
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

				List<JTBApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_By_AppNum, finderArgs,
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
								"JTBApplicationPersistenceImpl.fetchBygetJTB_By_AppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JTBApplication jtbApplication = list.get(0);

					result = jtbApplication;

					cacheResult(jtbApplication);
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
			return (JTBApplication)result;
		}
	}

	/**
	 * Removes the jtb application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the jtb application that was removed
	 */
	@Override
	public JTBApplication removeBygetJTB_By_AppNum(String applicationNumber)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = findBygetJTB_By_AppNum(
			applicationNumber);

		return remove(jtbApplication);
	}

	/**
	 * Returns the number of jtb applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countBygetJTB_By_AppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetJTB_By_AppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BY_APPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETJTB_BY_APPNUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETJTB_BY_APPNUM_APPLICATIONNUMBER_2 =
			"jtbApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_APPNUM_APPLICATIONNUMBER_3 =
			"(jtbApplication.applicationNumber IS NULL OR jtbApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetJTB_By_RT_AppNo;
	private FinderPath _finderPathCountBygetJTB_By_RT_AppNo;

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_By_RT_AppNo(
			String jtbTransactionTypeVal, String expiredLicenseAppNumber)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber);

		if (jtbApplication == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("jtbTransactionTypeVal=");
			sb.append(jtbTransactionTypeVal);

			sb.append(", expiredLicenseAppNumber=");
			sb.append(expiredLicenseAppNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJTBApplicationException(sb.toString());
		}

		return jtbApplication;
	}

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber) {

		return fetchBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber,
		boolean useFinderCache) {

		jtbTransactionTypeVal = Objects.toString(jtbTransactionTypeVal, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {
				jtbTransactionTypeVal, expiredLicenseAppNumber
			};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_By_RT_AppNo, finderArgs, this);
		}

		if (result instanceof JTBApplication) {
			JTBApplication jtbApplication = (JTBApplication)result;

			if (!Objects.equals(
					jtbTransactionTypeVal,
					jtbApplication.getJtbTransactionTypeVal()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					jtbApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

			boolean bindJtbTransactionTypeVal = false;

			if (jtbTransactionTypeVal.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_JTBTRANSACTIONTYPEVAL_3);
			}
			else {
				bindJtbTransactionTypeVal = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_JTBTRANSACTIONTYPEVAL_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindJtbTransactionTypeVal) {
					queryPos.add(jtbTransactionTypeVal);
				}

				if (bindExpiredLicenseAppNumber) {
					queryPos.add(expiredLicenseAppNumber);
				}

				List<JTBApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_By_RT_AppNo, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									jtbTransactionTypeVal,
									expiredLicenseAppNumber
								};
							}

							_log.warn(
								"JTBApplicationPersistenceImpl.fetchBygetJTB_By_RT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JTBApplication jtbApplication = list.get(0);

					result = jtbApplication;

					cacheResult(jtbApplication);
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
			return (JTBApplication)result;
		}
	}

	/**
	 * Removes the jtb application where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the jtb application that was removed
	 */
	@Override
	public JTBApplication removeBygetJTB_By_RT_AppNo(
			String jtbTransactionTypeVal, String expiredLicenseAppNumber)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = findBygetJTB_By_RT_AppNo(
			jtbTransactionTypeVal, expiredLicenseAppNumber);

		return remove(jtbApplication);
	}

	/**
	 * Returns the number of jtb applications where jtbTransactionTypeVal = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param jtbTransactionTypeVal the jtb transaction type val
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countBygetJTB_By_RT_AppNo(
		String jtbTransactionTypeVal, String expiredLicenseAppNumber) {

		jtbTransactionTypeVal = Objects.toString(jtbTransactionTypeVal, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetJTB_By_RT_AppNo;

		Object[] finderArgs = new Object[] {
			jtbTransactionTypeVal, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

			boolean bindJtbTransactionTypeVal = false;

			if (jtbTransactionTypeVal.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_JTBTRANSACTIONTYPEVAL_3);
			}
			else {
				bindJtbTransactionTypeVal = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_JTBTRANSACTIONTYPEVAL_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_RT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindJtbTransactionTypeVal) {
					queryPos.add(jtbTransactionTypeVal);
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
		_FINDER_COLUMN_GETJTB_BY_RT_APPNO_JTBTRANSACTIONTYPEVAL_2 =
			"jtbApplication.jtbTransactionTypeVal = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_RT_APPNO_JTBTRANSACTIONTYPEVAL_3 =
			"(jtbApplication.jtbTransactionTypeVal IS NULL OR jtbApplication.jtbTransactionTypeVal = '') AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_RT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"jtbApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_RT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(jtbApplication.expiredLicenseAppNumber IS NULL OR jtbApplication.expiredLicenseAppNumber = '')";

	private FinderPath _finderPathFetchBygetJTB_ByCaseId;
	private FinderPath _finderPathCountBygetJTB_ByCaseId;

	/**
	 * Returns the jtb application where caseId = &#63; or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_ByCaseId(String caseId)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_ByCaseId(caseId);

		if (jtbApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJTBApplicationException(sb.toString());
		}

		return jtbApplication;
	}

	/**
	 * Returns the jtb application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_ByCaseId(String caseId) {
		return fetchBygetJTB_ByCaseId(caseId, true);
	}

	/**
	 * Returns the jtb application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_ByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJTB_ByCaseId, finderArgs, this);
		}

		if (result instanceof JTBApplication) {
			JTBApplication jtbApplication = (JTBApplication)result;

			if (!Objects.equals(caseId, jtbApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BYCASEID_CASEID_2);
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

				List<JTBApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJTB_ByCaseId, finderArgs,
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
								"JTBApplicationPersistenceImpl.fetchBygetJTB_ByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JTBApplication jtbApplication = list.get(0);

					result = jtbApplication;

					cacheResult(jtbApplication);
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
			return (JTBApplication)result;
		}
	}

	/**
	 * Removes the jtb application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the jtb application that was removed
	 */
	@Override
	public JTBApplication removeBygetJTB_ByCaseId(String caseId)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = findBygetJTB_ByCaseId(caseId);

		return remove(jtbApplication);
	}

	/**
	 * Returns the number of jtb applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countBygetJTB_ByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJTB_ByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJTB_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJTB_BYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJTB_BYCASEID_CASEID_2 =
		"jtbApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETJTB_BYCASEID_CASEID_3 =
		"(jtbApplication.caseId IS NULL OR jtbApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetJTB_By_AppType_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetJTB_By_AppType_Status;
	private FinderPath _finderPathCountBygetJTB_By_AppType_Status;

	/**
	 * Returns all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @return the matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication) {

		return findBygetJTB_By_AppType_Status(
			status, typeOfApplication, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end) {

		return findBygetJTB_By_AppType_Status(
			status, typeOfApplication, start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return findBygetJTB_By_AppType_Status(
			status, typeOfApplication, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching jtb applications
	 */
	@Override
	public List<JTBApplication> findBygetJTB_By_AppType_Status(
		int status, String typeOfApplication, int start, int end,
		OrderByComparator<JTBApplication> orderByComparator,
		boolean useFinderCache) {

		typeOfApplication = Objects.toString(typeOfApplication, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJTB_By_AppType_Status;
				finderArgs = new Object[] {status, typeOfApplication};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetJTB_By_AppType_Status;
			finderArgs = new Object[] {
				status, typeOfApplication, start, end, orderByComparator
			};
		}

		List<JTBApplication> list = null;

		if (useFinderCache) {
			list = (List<JTBApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JTBApplication jtbApplication : list) {
					if ((status != jtbApplication.getStatus()) ||
						!typeOfApplication.equals(
							jtbApplication.getTypeOfApplication())) {

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

			sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_STATUS_2);

			boolean bindTypeOfApplication = false;

			if (typeOfApplication.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_3);
			}
			else {
				bindTypeOfApplication = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindTypeOfApplication) {
					queryPos.add(typeOfApplication);
				}

				list = (List<JTBApplication>)QueryUtil.list(
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
	 * Returns the first jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_By_AppType_Status_First(
			int status, String typeOfApplication,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_By_AppType_Status_First(
			status, typeOfApplication, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", typeOfApplication=");
		sb.append(typeOfApplication);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the first jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_AppType_Status_First(
		int status, String typeOfApplication,
		OrderByComparator<JTBApplication> orderByComparator) {

		List<JTBApplication> list = findBygetJTB_By_AppType_Status(
			status, typeOfApplication, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application
	 * @throws NoSuchJTBApplicationException if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication findBygetJTB_By_AppType_Status_Last(
			int status, String typeOfApplication,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchBygetJTB_By_AppType_Status_Last(
			status, typeOfApplication, orderByComparator);

		if (jtbApplication != null) {
			return jtbApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", typeOfApplication=");
		sb.append(typeOfApplication);

		sb.append("}");

		throw new NoSuchJTBApplicationException(sb.toString());
	}

	/**
	 * Returns the last jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching jtb application, or <code>null</code> if a matching jtb application could not be found
	 */
	@Override
	public JTBApplication fetchBygetJTB_By_AppType_Status_Last(
		int status, String typeOfApplication,
		OrderByComparator<JTBApplication> orderByComparator) {

		int count = countBygetJTB_By_AppType_Status(status, typeOfApplication);

		if (count == 0) {
			return null;
		}

		List<JTBApplication> list = findBygetJTB_By_AppType_Status(
			status, typeOfApplication, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the jtb applications before and after the current jtb application in the ordered set where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param jtbApplicationId the primary key of the current jtb application
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication[] findBygetJTB_By_AppType_Status_PrevAndNext(
			long jtbApplicationId, int status, String typeOfApplication,
			OrderByComparator<JTBApplication> orderByComparator)
		throws NoSuchJTBApplicationException {

		typeOfApplication = Objects.toString(typeOfApplication, "");

		JTBApplication jtbApplication = findByPrimaryKey(jtbApplicationId);

		Session session = null;

		try {
			session = openSession();

			JTBApplication[] array = new JTBApplicationImpl[3];

			array[0] = getBygetJTB_By_AppType_Status_PrevAndNext(
				session, jtbApplication, status, typeOfApplication,
				orderByComparator, true);

			array[1] = jtbApplication;

			array[2] = getBygetJTB_By_AppType_Status_PrevAndNext(
				session, jtbApplication, status, typeOfApplication,
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

	protected JTBApplication getBygetJTB_By_AppType_Status_PrevAndNext(
		Session session, JTBApplication jtbApplication, int status,
		String typeOfApplication,
		OrderByComparator<JTBApplication> orderByComparator, boolean previous) {

		StringBundler sb = null;

		if (orderByComparator != null) {
			sb = new StringBundler(
				5 + (orderByComparator.getOrderByConditionFields().length * 3) +
					(orderByComparator.getOrderByFields().length * 3));
		}
		else {
			sb = new StringBundler(4);
		}

		sb.append(_SQL_SELECT_JTBAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_STATUS_2);

		boolean bindTypeOfApplication = false;

		if (typeOfApplication.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_3);
		}
		else {
			bindTypeOfApplication = true;

			sb.append(
				_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_2);
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
			sb.append(JTBApplicationModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(status);

		if (bindTypeOfApplication) {
			queryPos.add(typeOfApplication);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						jtbApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JTBApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the jtb applications where status = &#63; and typeOfApplication = &#63; from the database.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 */
	@Override
	public void removeBygetJTB_By_AppType_Status(
		int status, String typeOfApplication) {

		for (JTBApplication jtbApplication :
				findBygetJTB_By_AppType_Status(
					status, typeOfApplication, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(jtbApplication);
		}
	}

	/**
	 * Returns the number of jtb applications where status = &#63; and typeOfApplication = &#63;.
	 *
	 * @param status the status
	 * @param typeOfApplication the type of application
	 * @return the number of matching jtb applications
	 */
	@Override
	public int countBygetJTB_By_AppType_Status(
		int status, String typeOfApplication) {

		typeOfApplication = Objects.toString(typeOfApplication, "");

		FinderPath finderPath = _finderPathCountBygetJTB_By_AppType_Status;

		Object[] finderArgs = new Object[] {status, typeOfApplication};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JTBAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_STATUS_2);

			boolean bindTypeOfApplication = false;

			if (typeOfApplication.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_3);
			}
			else {
				bindTypeOfApplication = true;

				sb.append(
					_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				if (bindTypeOfApplication) {
					queryPos.add(typeOfApplication);
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
		_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_STATUS_2 =
			"jtbApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_2 =
			"jtbApplication.typeOfApplication = ?";

	private static final String
		_FINDER_COLUMN_GETJTB_BY_APPTYPE_STATUS_TYPEOFAPPLICATION_3 =
			"(jtbApplication.typeOfApplication IS NULL OR jtbApplication.typeOfApplication = '')";

	public JTBApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JTBApplication.class);

		setModelImplClass(JTBApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(JTBApplicationTable.INSTANCE);
	}

	/**
	 * Caches the jtb application in the entity cache if it is enabled.
	 *
	 * @param jtbApplication the jtb application
	 */
	@Override
	public void cacheResult(JTBApplication jtbApplication) {
		entityCache.putResult(
			JTBApplicationImpl.class, jtbApplication.getPrimaryKey(),
			jtbApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				jtbApplication.getUuid(), jtbApplication.getGroupId()
			},
			jtbApplication);

		finderCache.putResult(
			_finderPathFetchBygetJTB_By_AppNum,
			new Object[] {jtbApplication.getApplicationNumber()},
			jtbApplication);

		finderCache.putResult(
			_finderPathFetchBygetJTB_By_RT_AppNo,
			new Object[] {
				jtbApplication.getJtbTransactionTypeVal(),
				jtbApplication.getExpiredLicenseAppNumber()
			},
			jtbApplication);

		finderCache.putResult(
			_finderPathFetchBygetJTB_ByCaseId,
			new Object[] {jtbApplication.getCaseId()}, jtbApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the jtb applications in the entity cache if it is enabled.
	 *
	 * @param jtbApplications the jtb applications
	 */
	@Override
	public void cacheResult(List<JTBApplication> jtbApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (jtbApplications.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JTBApplication jtbApplication : jtbApplications) {
			if (entityCache.getResult(
					JTBApplicationImpl.class, jtbApplication.getPrimaryKey()) ==
						null) {

				cacheResult(jtbApplication);
			}
		}
	}

	/**
	 * Clears the cache for all jtb applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JTBApplicationImpl.class);

		finderCache.clearCache(JTBApplicationImpl.class);
	}

	/**
	 * Clears the cache for the jtb application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JTBApplication jtbApplication) {
		entityCache.removeResult(JTBApplicationImpl.class, jtbApplication);
	}

	@Override
	public void clearCache(List<JTBApplication> jtbApplications) {
		for (JTBApplication jtbApplication : jtbApplications) {
			entityCache.removeResult(JTBApplicationImpl.class, jtbApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JTBApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JTBApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JTBApplicationModelImpl jtbApplicationModelImpl) {

		Object[] args = new Object[] {
			jtbApplicationModelImpl.getUuid(),
			jtbApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, jtbApplicationModelImpl);

		args = new Object[] {jtbApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetJTB_By_AppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_By_AppNum, args, jtbApplicationModelImpl);

		args = new Object[] {
			jtbApplicationModelImpl.getJtbTransactionTypeVal(),
			jtbApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetJTB_By_RT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_By_RT_AppNo, args,
			jtbApplicationModelImpl);

		args = new Object[] {jtbApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJTB_ByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJTB_ByCaseId, args, jtbApplicationModelImpl);
	}

	/**
	 * Creates a new jtb application with the primary key. Does not add the jtb application to the database.
	 *
	 * @param jtbApplicationId the primary key for the new jtb application
	 * @return the new jtb application
	 */
	@Override
	public JTBApplication create(long jtbApplicationId) {
		JTBApplication jtbApplication = new JTBApplicationImpl();

		jtbApplication.setNew(true);
		jtbApplication.setPrimaryKey(jtbApplicationId);

		String uuid = PortalUUIDUtil.generate();

		jtbApplication.setUuid(uuid);

		jtbApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return jtbApplication;
	}

	/**
	 * Removes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication remove(long jtbApplicationId)
		throws NoSuchJTBApplicationException {

		return remove((Serializable)jtbApplicationId);
	}

	/**
	 * Removes the jtb application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the jtb application
	 * @return the jtb application that was removed
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication remove(Serializable primaryKey)
		throws NoSuchJTBApplicationException {

		Session session = null;

		try {
			session = openSession();

			JTBApplication jtbApplication = (JTBApplication)session.get(
				JTBApplicationImpl.class, primaryKey);

			if (jtbApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJTBApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(jtbApplication);
		}
		catch (NoSuchJTBApplicationException noSuchEntityException) {
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
	protected JTBApplication removeImpl(JTBApplication jtbApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(jtbApplication)) {
				jtbApplication = (JTBApplication)session.get(
					JTBApplicationImpl.class,
					jtbApplication.getPrimaryKeyObj());
			}

			if (jtbApplication != null) {
				session.delete(jtbApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (jtbApplication != null) {
			clearCache(jtbApplication);
		}

		return jtbApplication;
	}

	@Override
	public JTBApplication updateImpl(JTBApplication jtbApplication) {
		boolean isNew = jtbApplication.isNew();

		if (!(jtbApplication instanceof JTBApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(jtbApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					jtbApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in jtbApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JTBApplication implementation " +
					jtbApplication.getClass());
		}

		JTBApplicationModelImpl jtbApplicationModelImpl =
			(JTBApplicationModelImpl)jtbApplication;

		if (Validator.isNull(jtbApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			jtbApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (jtbApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				jtbApplication.setCreateDate(date);
			}
			else {
				jtbApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!jtbApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				jtbApplication.setModifiedDate(date);
			}
			else {
				jtbApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(jtbApplication);
			}
			else {
				jtbApplication = (JTBApplication)session.merge(jtbApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JTBApplicationImpl.class, jtbApplicationModelImpl, false, true);

		cacheUniqueFindersCache(jtbApplicationModelImpl);

		if (isNew) {
			jtbApplication.setNew(false);
		}

		jtbApplication.resetOriginalValues();

		return jtbApplication;
	}

	/**
	 * Returns the jtb application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the jtb application
	 * @return the jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJTBApplicationException {

		JTBApplication jtbApplication = fetchByPrimaryKey(primaryKey);

		if (jtbApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJTBApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return jtbApplication;
	}

	/**
	 * Returns the jtb application with the primary key or throws a <code>NoSuchJTBApplicationException</code> if it could not be found.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application
	 * @throws NoSuchJTBApplicationException if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication findByPrimaryKey(long jtbApplicationId)
		throws NoSuchJTBApplicationException {

		return findByPrimaryKey((Serializable)jtbApplicationId);
	}

	/**
	 * Returns the jtb application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param jtbApplicationId the primary key of the jtb application
	 * @return the jtb application, or <code>null</code> if a jtb application with the primary key could not be found
	 */
	@Override
	public JTBApplication fetchByPrimaryKey(long jtbApplicationId) {
		return fetchByPrimaryKey((Serializable)jtbApplicationId);
	}

	/**
	 * Returns all the jtb applications.
	 *
	 * @return the jtb applications
	 */
	@Override
	public List<JTBApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @return the range of jtb applications
	 */
	@Override
	public List<JTBApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of jtb applications
	 */
	@Override
	public List<JTBApplication> findAll(
		int start, int end,
		OrderByComparator<JTBApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the jtb applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JTBApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of jtb applications
	 * @param end the upper bound of the range of jtb applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of jtb applications
	 */
	@Override
	public List<JTBApplication> findAll(
		int start, int end, OrderByComparator<JTBApplication> orderByComparator,
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

		List<JTBApplication> list = null;

		if (useFinderCache) {
			list = (List<JTBApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JTBAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JTBAPPLICATION;

				sql = sql.concat(JTBApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JTBApplication>)QueryUtil.list(
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
	 * Removes all the jtb applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JTBApplication jtbApplication : findAll()) {
			remove(jtbApplication);
		}
	}

	/**
	 * Returns the number of jtb applications.
	 *
	 * @return the number of jtb applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JTBAPPLICATION);

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
		return "jtbApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JTBAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JTBApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the jtb application persistence.
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

		_finderPathWithPaginationFindBygetJTB_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJTB_ByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetJTB_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJTB_ByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetJTB_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJTB_ByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetJTB_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJTB_By_Status",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetJTB_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJTB_By_Status",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetJTB_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_By_Status", new String[] {Integer.class.getName()},
			new String[] {"status"}, false);

		_finderPathFetchBygetJTB_By_AppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_By_AppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetJTB_By_AppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_By_AppNum", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetJTB_By_RT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_By_RT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"jtbTransactionTypeVal", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetJTB_By_RT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_By_RT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"jtbTransactionTypeVal", "expiredLicenseAppNumber"},
			false);

		_finderPathFetchBygetJTB_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJTB_ByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJTB_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJTB_ByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetJTB_By_AppType_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetJTB_By_AppType_Status",
				new String[] {
					Integer.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "typeOfApplication"}, true);

		_finderPathWithoutPaginationFindBygetJTB_By_AppType_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetJTB_By_AppType_Status",
				new String[] {Integer.class.getName(), String.class.getName()},
				new String[] {"status", "typeOfApplication"}, true);

		_finderPathCountBygetJTB_By_AppType_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJTB_By_AppType_Status",
			new String[] {Integer.class.getName(), String.class.getName()},
			new String[] {"status", "typeOfApplication"}, false);

		JTBApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JTBApplicationUtil.setPersistence(null);

		entityCache.removeCache(JTBApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JTB_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JTBAPPLICATION =
		"SELECT jtbApplication FROM JTBApplication jtbApplication";

	private static final String _SQL_SELECT_JTBAPPLICATION_WHERE =
		"SELECT jtbApplication FROM JTBApplication jtbApplication WHERE ";

	private static final String _SQL_COUNT_JTBAPPLICATION =
		"SELECT COUNT(jtbApplication) FROM JTBApplication jtbApplication";

	private static final String _SQL_COUNT_JTBAPPLICATION_WHERE =
		"SELECT COUNT(jtbApplication) FROM JTBApplication jtbApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "jtbApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JTBApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JTBApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JTBApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.janaac.application.form.service.service.persistence.impl;

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

import com.nbp.janaac.application.form.service.exception.NoSuchJanaacApplicationException;
import com.nbp.janaac.application.form.service.model.JanaacApplication;
import com.nbp.janaac.application.form.service.model.JanaacApplicationTable;
import com.nbp.janaac.application.form.service.model.impl.JanaacApplicationImpl;
import com.nbp.janaac.application.form.service.model.impl.JanaacApplicationModelImpl;
import com.nbp.janaac.application.form.service.service.persistence.JanaacApplicationPersistence;
import com.nbp.janaac.application.form.service.service.persistence.JanaacApplicationUtil;
import com.nbp.janaac.application.form.service.service.persistence.impl.constants.JANAAC_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the janaac application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = JanaacApplicationPersistence.class)
public class JanaacApplicationPersistenceImpl
	extends BasePersistenceImpl<JanaacApplication>
	implements JanaacApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>JanaacApplicationUtil</code> to access the janaac application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		JanaacApplicationImpl.class.getName();

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
	 * Returns all the janaac applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
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

		List<JanaacApplication> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplication janaacApplication : list) {
					if (!uuid.equals(janaacApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

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
				sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacApplication>)QueryUtil.list(
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
	 * Returns the first janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findByUuid_First(
			String uuid, OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchByUuid_First(
		String uuid, OrderByComparator<JanaacApplication> orderByComparator) {

		List<JanaacApplication> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findByUuid_Last(
			String uuid, OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchByUuid_Last(
		String uuid, OrderByComparator<JanaacApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<JanaacApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where uuid = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication[] findByUuid_PrevAndNext(
			long janaacApplicationId, String uuid,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		uuid = Objects.toString(uuid, "");

		JanaacApplication janaacApplication = findByPrimaryKey(
			janaacApplicationId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplication[] array = new JanaacApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, janaacApplication, uuid, orderByComparator, true);

			array[1] = janaacApplication;

			array[2] = getByUuid_PrevAndNext(
				session, janaacApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JanaacApplication getByUuid_PrevAndNext(
		Session session, JanaacApplication janaacApplication, String uuid,
		OrderByComparator<JanaacApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

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
			sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
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
						janaacApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (JanaacApplication janaacApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacApplication);
		}
	}

	/**
	 * Returns the number of janaac applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching janaac applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATION_WHERE);

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
		"janaacApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(janaacApplication.uuid IS NULL OR janaacApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchByUUID_G(uuid, groupId);

		if (janaacApplication == null) {
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

			throw new NoSuchJanaacApplicationException(sb.toString());
		}

		return janaacApplication;
	}

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the janaac application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchByUUID_G(
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

		if (result instanceof JanaacApplication) {
			JanaacApplication janaacApplication = (JanaacApplication)result;

			if (!Objects.equals(uuid, janaacApplication.getUuid()) ||
				(groupId != janaacApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

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

				List<JanaacApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					JanaacApplication janaacApplication = list.get(0);

					result = janaacApplication;

					cacheResult(janaacApplication);
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
			return (JanaacApplication)result;
		}
	}

	/**
	 * Removes the janaac application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the janaac application that was removed
	 */
	@Override
	public JanaacApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = findByUUID_G(uuid, groupId);

		return remove(janaacApplication);
	}

	/**
	 * Returns the number of janaac applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching janaac applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACAPPLICATION_WHERE);

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
		"janaacApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(janaacApplication.uuid IS NULL OR janaacApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"janaacApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
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

		List<JanaacApplication> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplication janaacApplication : list) {
					if (!uuid.equals(janaacApplication.getUuid()) ||
						(companyId != janaacApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

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
				sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<JanaacApplication>)QueryUtil.list(
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
	 * Returns the first janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the first janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<JanaacApplication> orderByComparator) {

		List<JanaacApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the last janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<JanaacApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<JanaacApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication[] findByUuid_C_PrevAndNext(
			long janaacApplicationId, String uuid, long companyId,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		uuid = Objects.toString(uuid, "");

		JanaacApplication janaacApplication = findByPrimaryKey(
			janaacApplicationId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplication[] array = new JanaacApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, janaacApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = janaacApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, janaacApplication, uuid, companyId, orderByComparator,
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

	protected JanaacApplication getByUuid_C_PrevAndNext(
		Session session, JanaacApplication janaacApplication, String uuid,
		long companyId, OrderByComparator<JanaacApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

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
			sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
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
						janaacApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (JanaacApplication janaacApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(janaacApplication);
		}
	}

	/**
	 * Returns the number of janaac applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching janaac applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACAPPLICATION_WHERE);

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
		"janaacApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(janaacApplication.uuid IS NULL OR janaacApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"janaacApplication.companyId = ?";

	private FinderPath _finderPathWithPaginationFindBygetJANAAC_ByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetJANAAC_ByS_U;
	private FinderPath _finderPathCountBygetJANAAC_ByS_U;

	/**
	 * Returns all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status) {

		return findBygetJANAAC_ByS_U(
			userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end) {

		return findBygetJANAAC_ByS_U(userId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return findBygetJANAAC_ByS_U(
			userId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac applications where userId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_ByS_U(
		long userId, int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetJANAAC_ByS_U;
				finderArgs = new Object[] {userId, status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJANAAC_ByS_U;
			finderArgs = new Object[] {
				userId, status, start, end, orderByComparator
			};
		}

		List<JanaacApplication> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplication janaacApplication : list) {
					if ((userId != janaacApplication.getUserId()) ||
						(status != janaacApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_BYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETJANAAC_BYS_U_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(userId);

				queryPos.add(status);

				list = (List<JanaacApplication>)QueryUtil.list(
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
	 * Returns the first janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findBygetJANAAC_ByS_U_First(
			long userId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchBygetJANAAC_ByS_U_First(
			userId, status, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the first janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_ByS_U_First(
		long userId, int status,
		OrderByComparator<JanaacApplication> orderByComparator) {

		List<JanaacApplication> list = findBygetJANAAC_ByS_U(
			userId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findBygetJANAAC_ByS_U_Last(
			long userId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchBygetJANAAC_ByS_U_Last(
			userId, status, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("userId=");
		sb.append(userId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the last janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_ByS_U_Last(
		long userId, int status,
		OrderByComparator<JanaacApplication> orderByComparator) {

		int count = countBygetJANAAC_ByS_U(userId, status);

		if (count == 0) {
			return null;
		}

		List<JanaacApplication> list = findBygetJANAAC_ByS_U(
			userId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where userId = &#63; and status = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param userId the user ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication[] findBygetJANAAC_ByS_U_PrevAndNext(
			long janaacApplicationId, long userId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = findByPrimaryKey(
			janaacApplicationId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplication[] array = new JanaacApplicationImpl[3];

			array[0] = getBygetJANAAC_ByS_U_PrevAndNext(
				session, janaacApplication, userId, status, orderByComparator,
				true);

			array[1] = janaacApplication;

			array[2] = getBygetJANAAC_ByS_U_PrevAndNext(
				session, janaacApplication, userId, status, orderByComparator,
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

	protected JanaacApplication getBygetJANAAC_ByS_U_PrevAndNext(
		Session session, JanaacApplication janaacApplication, long userId,
		int status, OrderByComparator<JanaacApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAAC_BYS_U_USERID_2);

		sb.append(_FINDER_COLUMN_GETJANAAC_BYS_U_STATUS_2);

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
			sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
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
						janaacApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac applications where userId = &#63; and status = &#63; from the database.
	 *
	 * @param userId the user ID
	 * @param status the status
	 */
	@Override
	public void removeBygetJANAAC_ByS_U(long userId, int status) {
		for (JanaacApplication janaacApplication :
				findBygetJANAAC_ByS_U(
					userId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(janaacApplication);
		}
	}

	/**
	 * Returns the number of janaac applications where userId = &#63; and status = &#63;.
	 *
	 * @param userId the user ID
	 * @param status the status
	 * @return the number of matching janaac applications
	 */
	@Override
	public int countBygetJANAAC_ByS_U(long userId, int status) {
		FinderPath finderPath = _finderPathCountBygetJANAAC_ByS_U;

		Object[] finderArgs = new Object[] {userId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_JANAACAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_BYS_U_USERID_2);

			sb.append(_FINDER_COLUMN_GETJANAAC_BYS_U_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETJANAAC_BYS_U_USERID_2 =
		"janaacApplication.userId = ? AND ";

	private static final String _FINDER_COLUMN_GETJANAAC_BYS_U_STATUS_2 =
		"janaacApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetJANAAC_By_Status;
	private FinderPath _finderPathWithoutPaginationFindBygetJANAAC_By_Status;
	private FinderPath _finderPathCountBygetJANAAC_By_Status;

	/**
	 * Returns all the janaac applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_By_Status(int status) {
		return findBygetJANAAC_By_Status(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end) {

		return findBygetJANAAC_By_Status(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return findBygetJANAAC_By_Status(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching janaac applications
	 */
	@Override
	public List<JanaacApplication> findBygetJANAAC_By_Status(
		int status, int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetJANAAC_By_Status;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetJANAAC_By_Status;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<JanaacApplication> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (JanaacApplication janaacApplication : list) {
					if (status != janaacApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_BY_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<JanaacApplication>)QueryUtil.list(
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
	 * Returns the first janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findBygetJANAAC_By_Status_First(
			int status, OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchBygetJANAAC_By_Status_First(
			status, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the first janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_By_Status_First(
		int status, OrderByComparator<JanaacApplication> orderByComparator) {

		List<JanaacApplication> list = findBygetJANAAC_By_Status(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findBygetJANAAC_By_Status_Last(
			int status, OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchBygetJANAAC_By_Status_Last(
			status, orderByComparator);

		if (janaacApplication != null) {
			return janaacApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchJanaacApplicationException(sb.toString());
	}

	/**
	 * Returns the last janaac application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_By_Status_Last(
		int status, OrderByComparator<JanaacApplication> orderByComparator) {

		int count = countBygetJANAAC_By_Status(status);

		if (count == 0) {
			return null;
		}

		List<JanaacApplication> list = findBygetJANAAC_By_Status(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the janaac applications before and after the current janaac application in the ordered set where status = &#63;.
	 *
	 * @param janaacApplicationId the primary key of the current janaac application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication[] findBygetJANAAC_By_Status_PrevAndNext(
			long janaacApplicationId, int status,
			OrderByComparator<JanaacApplication> orderByComparator)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = findByPrimaryKey(
			janaacApplicationId);

		Session session = null;

		try {
			session = openSession();

			JanaacApplication[] array = new JanaacApplicationImpl[3];

			array[0] = getBygetJANAAC_By_Status_PrevAndNext(
				session, janaacApplication, status, orderByComparator, true);

			array[1] = janaacApplication;

			array[2] = getBygetJANAAC_By_Status_PrevAndNext(
				session, janaacApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected JanaacApplication getBygetJANAAC_By_Status_PrevAndNext(
		Session session, JanaacApplication janaacApplication, int status,
		OrderByComparator<JanaacApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETJANAAC_BY_STATUS_STATUS_2);

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
			sb.append(JanaacApplicationModelImpl.ORDER_BY_JPQL);
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
						janaacApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<JanaacApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the janaac applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetJANAAC_By_Status(int status) {
		for (JanaacApplication janaacApplication :
				findBygetJANAAC_By_Status(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(janaacApplication);
		}
	}

	/**
	 * Returns the number of janaac applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching janaac applications
	 */
	@Override
	public int countBygetJANAAC_By_Status(int status) {
		FinderPath finderPath = _finderPathCountBygetJANAAC_By_Status;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETJANAAC_BY_STATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETJANAAC_BY_STATUS_STATUS_2 =
		"janaacApplication.status = ?";

	private FinderPath _finderPathFetchBygetJANAAC_By_AppNum;
	private FinderPath _finderPathCountBygetJANAAC_By_AppNum;

	/**
	 * Returns the janaac application where applicationNumber = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findBygetJANAAC_By_AppNum(String applicationNumber)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchBygetJANAAC_By_AppNum(
			applicationNumber);

		if (janaacApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacApplicationException(sb.toString());
		}

		return janaacApplication;
	}

	/**
	 * Returns the janaac application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_By_AppNum(
		String applicationNumber) {

		return fetchBygetJANAAC_By_AppNum(applicationNumber, true);
	}

	/**
	 * Returns the janaac application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_By_AppNum(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJANAAC_By_AppNum, finderArgs, this);
		}

		if (result instanceof JanaacApplication) {
			JanaacApplication janaacApplication = (JanaacApplication)result;

			if (!Objects.equals(
					applicationNumber,
					janaacApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_APPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_APPNUM_APPLICATIONNUMBER_2);
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

				List<JanaacApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJANAAC_By_AppNum, finderArgs,
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
								"JanaacApplicationPersistenceImpl.fetchBygetJANAAC_By_AppNum(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplication janaacApplication = list.get(0);

					result = janaacApplication;

					cacheResult(janaacApplication);
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
			return (JanaacApplication)result;
		}
	}

	/**
	 * Removes the janaac application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the janaac application that was removed
	 */
	@Override
	public JanaacApplication removeBygetJANAAC_By_AppNum(
			String applicationNumber)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = findBygetJANAAC_By_AppNum(
			applicationNumber);

		return remove(janaacApplication);
	}

	/**
	 * Returns the number of janaac applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching janaac applications
	 */
	@Override
	public int countBygetJANAAC_By_AppNum(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetJANAAC_By_AppNum;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_APPNUM_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETJANAAC_BY_APPNUM_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETJANAAC_BY_APPNUM_APPLICATIONNUMBER_2 =
			"janaacApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETJANAAC_BY_APPNUM_APPLICATIONNUMBER_3 =
			"(janaacApplication.applicationNumber IS NULL OR janaacApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetJANAAC_ByCaseId;
	private FinderPath _finderPathCountBygetJANAAC_ByCaseId;

	/**
	 * Returns the janaac application where caseId = &#63; or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application
	 * @throws NoSuchJanaacApplicationException if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication findBygetJANAAC_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchBygetJANAAC_ByCaseId(caseId);

		if (janaacApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchJanaacApplicationException(sb.toString());
		}

		return janaacApplication;
	}

	/**
	 * Returns the janaac application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_ByCaseId(String caseId) {
		return fetchBygetJANAAC_ByCaseId(caseId, true);
	}

	/**
	 * Returns the janaac application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching janaac application, or <code>null</code> if a matching janaac application could not be found
	 */
	@Override
	public JanaacApplication fetchBygetJANAAC_ByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetJANAAC_ByCaseId, finderArgs, this);
		}

		if (result instanceof JanaacApplication) {
			JanaacApplication janaacApplication = (JanaacApplication)result;

			if (!Objects.equals(caseId, janaacApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_JANAACAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_2);
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

				List<JanaacApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetJANAAC_ByCaseId, finderArgs,
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
								"JanaacApplicationPersistenceImpl.fetchBygetJANAAC_ByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					JanaacApplication janaacApplication = list.get(0);

					result = janaacApplication;

					cacheResult(janaacApplication);
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
			return (JanaacApplication)result;
		}
	}

	/**
	 * Removes the janaac application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the janaac application that was removed
	 */
	@Override
	public JanaacApplication removeBygetJANAAC_ByCaseId(String caseId)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = findBygetJANAAC_ByCaseId(caseId);

		return remove(janaacApplication);
	}

	/**
	 * Returns the number of janaac applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching janaac applications
	 */
	@Override
	public int countBygetJANAAC_ByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetJANAAC_ByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_JANAACAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_2 =
		"janaacApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETJANAAC_BYCASEID_CASEID_3 =
		"(janaacApplication.caseId IS NULL OR janaacApplication.caseId = '')";

	public JanaacApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(JanaacApplication.class);

		setModelImplClass(JanaacApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(JanaacApplicationTable.INSTANCE);
	}

	/**
	 * Caches the janaac application in the entity cache if it is enabled.
	 *
	 * @param janaacApplication the janaac application
	 */
	@Override
	public void cacheResult(JanaacApplication janaacApplication) {
		entityCache.putResult(
			JanaacApplicationImpl.class, janaacApplication.getPrimaryKey(),
			janaacApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				janaacApplication.getUuid(), janaacApplication.getGroupId()
			},
			janaacApplication);

		finderCache.putResult(
			_finderPathFetchBygetJANAAC_By_AppNum,
			new Object[] {janaacApplication.getApplicationNumber()},
			janaacApplication);

		finderCache.putResult(
			_finderPathFetchBygetJANAAC_ByCaseId,
			new Object[] {janaacApplication.getCaseId()}, janaacApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the janaac applications in the entity cache if it is enabled.
	 *
	 * @param janaacApplications the janaac applications
	 */
	@Override
	public void cacheResult(List<JanaacApplication> janaacApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (janaacApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (JanaacApplication janaacApplication : janaacApplications) {
			if (entityCache.getResult(
					JanaacApplicationImpl.class,
					janaacApplication.getPrimaryKey()) == null) {

				cacheResult(janaacApplication);
			}
		}
	}

	/**
	 * Clears the cache for all janaac applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(JanaacApplicationImpl.class);

		finderCache.clearCache(JanaacApplicationImpl.class);
	}

	/**
	 * Clears the cache for the janaac application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(JanaacApplication janaacApplication) {
		entityCache.removeResult(
			JanaacApplicationImpl.class, janaacApplication);
	}

	@Override
	public void clearCache(List<JanaacApplication> janaacApplications) {
		for (JanaacApplication janaacApplication : janaacApplications) {
			entityCache.removeResult(
				JanaacApplicationImpl.class, janaacApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(JanaacApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(JanaacApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		JanaacApplicationModelImpl janaacApplicationModelImpl) {

		Object[] args = new Object[] {
			janaacApplicationModelImpl.getUuid(),
			janaacApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, janaacApplicationModelImpl);

		args = new Object[] {janaacApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetJANAAC_By_AppNum, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJANAAC_By_AppNum, args,
			janaacApplicationModelImpl);

		args = new Object[] {janaacApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetJANAAC_ByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetJANAAC_ByCaseId, args,
			janaacApplicationModelImpl);
	}

	/**
	 * Creates a new janaac application with the primary key. Does not add the janaac application to the database.
	 *
	 * @param janaacApplicationId the primary key for the new janaac application
	 * @return the new janaac application
	 */
	@Override
	public JanaacApplication create(long janaacApplicationId) {
		JanaacApplication janaacApplication = new JanaacApplicationImpl();

		janaacApplication.setNew(true);
		janaacApplication.setPrimaryKey(janaacApplicationId);

		String uuid = PortalUUIDUtil.generate();

		janaacApplication.setUuid(uuid);

		janaacApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return janaacApplication;
	}

	/**
	 * Removes the janaac application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application that was removed
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication remove(long janaacApplicationId)
		throws NoSuchJanaacApplicationException {

		return remove((Serializable)janaacApplicationId);
	}

	/**
	 * Removes the janaac application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the janaac application
	 * @return the janaac application that was removed
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication remove(Serializable primaryKey)
		throws NoSuchJanaacApplicationException {

		Session session = null;

		try {
			session = openSession();

			JanaacApplication janaacApplication =
				(JanaacApplication)session.get(
					JanaacApplicationImpl.class, primaryKey);

			if (janaacApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchJanaacApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(janaacApplication);
		}
		catch (NoSuchJanaacApplicationException noSuchEntityException) {
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
	protected JanaacApplication removeImpl(
		JanaacApplication janaacApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(janaacApplication)) {
				janaacApplication = (JanaacApplication)session.get(
					JanaacApplicationImpl.class,
					janaacApplication.getPrimaryKeyObj());
			}

			if (janaacApplication != null) {
				session.delete(janaacApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (janaacApplication != null) {
			clearCache(janaacApplication);
		}

		return janaacApplication;
	}

	@Override
	public JanaacApplication updateImpl(JanaacApplication janaacApplication) {
		boolean isNew = janaacApplication.isNew();

		if (!(janaacApplication instanceof JanaacApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(janaacApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					janaacApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in janaacApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom JanaacApplication implementation " +
					janaacApplication.getClass());
		}

		JanaacApplicationModelImpl janaacApplicationModelImpl =
			(JanaacApplicationModelImpl)janaacApplication;

		if (Validator.isNull(janaacApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			janaacApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (janaacApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				janaacApplication.setCreateDate(date);
			}
			else {
				janaacApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!janaacApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				janaacApplication.setModifiedDate(date);
			}
			else {
				janaacApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(janaacApplication);
			}
			else {
				janaacApplication = (JanaacApplication)session.merge(
					janaacApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			JanaacApplicationImpl.class, janaacApplicationModelImpl, false,
			true);

		cacheUniqueFindersCache(janaacApplicationModelImpl);

		if (isNew) {
			janaacApplication.setNew(false);
		}

		janaacApplication.resetOriginalValues();

		return janaacApplication;
	}

	/**
	 * Returns the janaac application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the janaac application
	 * @return the janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchJanaacApplicationException {

		JanaacApplication janaacApplication = fetchByPrimaryKey(primaryKey);

		if (janaacApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchJanaacApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return janaacApplication;
	}

	/**
	 * Returns the janaac application with the primary key or throws a <code>NoSuchJanaacApplicationException</code> if it could not be found.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application
	 * @throws NoSuchJanaacApplicationException if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication findByPrimaryKey(long janaacApplicationId)
		throws NoSuchJanaacApplicationException {

		return findByPrimaryKey((Serializable)janaacApplicationId);
	}

	/**
	 * Returns the janaac application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param janaacApplicationId the primary key of the janaac application
	 * @return the janaac application, or <code>null</code> if a janaac application with the primary key could not be found
	 */
	@Override
	public JanaacApplication fetchByPrimaryKey(long janaacApplicationId) {
		return fetchByPrimaryKey((Serializable)janaacApplicationId);
	}

	/**
	 * Returns all the janaac applications.
	 *
	 * @return the janaac applications
	 */
	@Override
	public List<JanaacApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @return the range of janaac applications
	 */
	@Override
	public List<JanaacApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of janaac applications
	 */
	@Override
	public List<JanaacApplication> findAll(
		int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the janaac applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>JanaacApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of janaac applications
	 * @param end the upper bound of the range of janaac applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of janaac applications
	 */
	@Override
	public List<JanaacApplication> findAll(
		int start, int end,
		OrderByComparator<JanaacApplication> orderByComparator,
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

		List<JanaacApplication> list = null;

		if (useFinderCache) {
			list = (List<JanaacApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_JANAACAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_JANAACAPPLICATION;

				sql = sql.concat(JanaacApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<JanaacApplication>)QueryUtil.list(
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
	 * Removes all the janaac applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (JanaacApplication janaacApplication : findAll()) {
			remove(janaacApplication);
		}
	}

	/**
	 * Returns the number of janaac applications.
	 *
	 * @return the number of janaac applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_JANAACAPPLICATION);

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
		return "janaacApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_JANAACAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return JanaacApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the janaac application persistence.
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

		_finderPathWithPaginationFindBygetJANAAC_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJANAAC_ByS_U",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"userId", "status"}, true);

		_finderPathWithoutPaginationFindBygetJANAAC_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetJANAAC_ByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, true);

		_finderPathCountBygetJANAAC_ByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetJANAAC_ByS_U",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"userId", "status"}, false);

		_finderPathWithPaginationFindBygetJANAAC_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetJANAAC_By_Status",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetJANAAC_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetJANAAC_By_Status", new String[] {Integer.class.getName()},
			new String[] {"status"}, true);

		_finderPathCountBygetJANAAC_By_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJANAAC_By_Status",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetJANAAC_By_AppNum = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJANAAC_By_AppNum",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetJANAAC_By_AppNum = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJANAAC_By_AppNum", new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetJANAAC_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetJANAAC_ByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetJANAAC_ByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetJANAAC_ByCaseId", new String[] {String.class.getName()},
			new String[] {"caseId"}, false);

		JanaacApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		JanaacApplicationUtil.setPersistence(null);

		entityCache.removeCache(JanaacApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = JANAAC_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_JANAACAPPLICATION =
		"SELECT janaacApplication FROM JanaacApplication janaacApplication";

	private static final String _SQL_SELECT_JANAACAPPLICATION_WHERE =
		"SELECT janaacApplication FROM JanaacApplication janaacApplication WHERE ";

	private static final String _SQL_COUNT_JANAACAPPLICATION =
		"SELECT COUNT(janaacApplication) FROM JanaacApplication janaacApplication";

	private static final String _SQL_COUNT_JANAACAPPLICATION_WHERE =
		"SELECT COUNT(janaacApplication) FROM JanaacApplication janaacApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "janaacApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No JanaacApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No JanaacApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		JanaacApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
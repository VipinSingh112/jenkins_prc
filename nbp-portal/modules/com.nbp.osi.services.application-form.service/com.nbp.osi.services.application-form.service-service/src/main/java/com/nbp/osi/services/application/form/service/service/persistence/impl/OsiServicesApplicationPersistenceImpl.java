/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.osi.services.application.form.service.service.persistence.impl;

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

import com.nbp.osi.services.application.form.service.exception.NoSuchOsiServicesApplicationException;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplication;
import com.nbp.osi.services.application.form.service.model.OsiServicesApplicationTable;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationImpl;
import com.nbp.osi.services.application.form.service.model.impl.OsiServicesApplicationModelImpl;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesApplicationPersistence;
import com.nbp.osi.services.application.form.service.service.persistence.OsiServicesApplicationUtil;
import com.nbp.osi.services.application.form.service.service.persistence.impl.constants.OSI_SERVICESPersistenceConstants;

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
 * The persistence implementation for the osi services application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = OsiServicesApplicationPersistence.class)
public class OsiServicesApplicationPersistenceImpl
	extends BasePersistenceImpl<OsiServicesApplication>
	implements OsiServicesApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>OsiServicesApplicationUtil</code> to access the osi services application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		OsiServicesApplicationImpl.class.getName();

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
	 * Returns all the osi services applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end) {

		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
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

		List<OsiServicesApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplication osiServicesApplication : list) {
					if (!uuid.equals(osiServicesApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

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
				sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesApplication>)QueryUtil.list(
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
	 * Returns the first osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findByUuid_First(
			String uuid,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchByUuid_First(
		String uuid,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		List<OsiServicesApplication> list = findByUuid(
			uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findByUuid_Last(
			String uuid,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchByUuid_Last(
		String uuid,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where uuid = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication[] findByUuid_PrevAndNext(
			long osiServicesApplicationId, String uuid,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		uuid = Objects.toString(uuid, "");

		OsiServicesApplication osiServicesApplication = findByPrimaryKey(
			osiServicesApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplication[] array = new OsiServicesApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, osiServicesApplication, uuid, orderByComparator, true);

			array[1] = osiServicesApplication;

			array[2] = getByUuid_PrevAndNext(
				session, osiServicesApplication, uuid, orderByComparator,
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

	protected OsiServicesApplication getByUuid_PrevAndNext(
		Session session, OsiServicesApplication osiServicesApplication,
		String uuid,
		OrderByComparator<OsiServicesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

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
			sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (OsiServicesApplication osiServicesApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesApplication);
		}
	}

	/**
	 * Returns the number of osi services applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

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
		"osiServicesApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(osiServicesApplication.uuid IS NULL OR osiServicesApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = fetchByUUID_G(
			uuid, groupId);

		if (osiServicesApplication == null) {
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

			throw new NoSuchOsiServicesApplicationException(sb.toString());
		}

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the osi services application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchByUUID_G(
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

		if (result instanceof OsiServicesApplication) {
			OsiServicesApplication osiServicesApplication =
				(OsiServicesApplication)result;

			if (!Objects.equals(uuid, osiServicesApplication.getUuid()) ||
				(groupId != osiServicesApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

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

				List<OsiServicesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					OsiServicesApplication osiServicesApplication = list.get(0);

					result = osiServicesApplication;

					cacheResult(osiServicesApplication);
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
			return (OsiServicesApplication)result;
		}
	}

	/**
	 * Removes the osi services application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the osi services application that was removed
	 */
	@Override
	public OsiServicesApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = findByUUID_G(
			uuid, groupId);

		return remove(osiServicesApplication);
	}

	/**
	 * Returns the number of osi services applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

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
		"osiServicesApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(osiServicesApplication.uuid IS NULL OR osiServicesApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"osiServicesApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId) {

		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
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

		List<OsiServicesApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplication osiServicesApplication : list) {
					if (!uuid.equals(osiServicesApplication.getUuid()) ||
						(companyId != osiServicesApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

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
				sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<OsiServicesApplication>)QueryUtil.list(
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
	 * Returns the first osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		List<OsiServicesApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication[] findByUuid_C_PrevAndNext(
			long osiServicesApplicationId, String uuid, long companyId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		uuid = Objects.toString(uuid, "");

		OsiServicesApplication osiServicesApplication = findByPrimaryKey(
			osiServicesApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplication[] array = new OsiServicesApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, osiServicesApplication, uuid, companyId,
				orderByComparator, true);

			array[1] = osiServicesApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, osiServicesApplication, uuid, companyId,
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

	protected OsiServicesApplication getByUuid_C_PrevAndNext(
		Session session, OsiServicesApplication osiServicesApplication,
		String uuid, long companyId,
		OrderByComparator<OsiServicesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

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
			sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (OsiServicesApplication osiServicesApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiServicesApplication);
		}
	}

	/**
	 * Returns the number of osi services applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

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
		"osiServicesApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(osiServicesApplication.uuid IS NULL OR osiServicesApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"osiServicesApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetOsiServicesById;
	private FinderPath _finderPathCountBygetOsiServicesById;

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOsiServicesById(osiServicesApplicationId);

		if (osiServicesApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("osiServicesApplicationId=");
			sb.append(osiServicesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesApplicationException(sb.toString());
		}

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOsiServicesById(
		long osiServicesApplicationId) {

		return fetchBygetOsiServicesById(osiServicesApplicationId, true);
	}

	/**
	 * Returns the osi services application where osiServicesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOsiServicesById(
		long osiServicesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {osiServicesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOsiServicesById, finderArgs, this);
		}

		if (result instanceof OsiServicesApplication) {
			OsiServicesApplication osiServicesApplication =
				(OsiServicesApplication)result;

			if (osiServicesApplicationId !=
					osiServicesApplication.getOsiServicesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

				List<OsiServicesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiServicesById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									osiServicesApplicationId
								};
							}

							_log.warn(
								"OsiServicesApplicationPersistenceImpl.fetchBygetOsiServicesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesApplication osiServicesApplication = list.get(0);

					result = osiServicesApplication;

					cacheResult(osiServicesApplication);
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
			return (OsiServicesApplication)result;
		}
	}

	/**
	 * Removes the osi services application where osiServicesApplicationId = &#63; from the database.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the osi services application that was removed
	 */
	@Override
	public OsiServicesApplication removeBygetOsiServicesById(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			findBygetOsiServicesById(osiServicesApplicationId);

		return remove(osiServicesApplication);
	}

	/**
	 * Returns the number of osi services applications where osiServicesApplicationId = &#63;.
	 *
	 * @param osiServicesApplicationId the osi services application ID
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOsiServicesById(long osiServicesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetOsiServicesById;

		Object[] finderArgs = new Object[] {osiServicesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(osiServicesApplicationId);

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
		_FINDER_COLUMN_GETOSISERVICESBYID_OSISERVICESAPPLICATIONID_2 =
			"osiServicesApplication.osiServicesApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetOSIServicesByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetOSIServicesByS_U;
	private FinderPath _finderPathCountBygetOSIServicesByS_U;

	/**
	 * Returns all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId) {

		return findBygetOSIServicesByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end) {

		return findBygetOSIServicesByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return findBygetOSIServicesByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSIServicesByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOSIServicesByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<OsiServicesApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplication osiServicesApplication : list) {
					if ((status != osiServicesApplication.getStatus()) ||
						(userId != osiServicesApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<OsiServicesApplication>)QueryUtil.list(
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
	 * Returns the first osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByS_U_First(
			int status, long userId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByS_U_First(status, userId, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByS_U_First(
		int status, long userId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		List<OsiServicesApplication> list = findBygetOSIServicesByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByS_U_Last(
			int status, long userId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByS_U_Last(status, userId, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByS_U_Last(
		int status, long userId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		int count = countBygetOSIServicesByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplication> list = findBygetOSIServicesByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication[] findBygetOSIServicesByS_U_PrevAndNext(
			long osiServicesApplicationId, int status, long userId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = findByPrimaryKey(
			osiServicesApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplication[] array = new OsiServicesApplicationImpl[3];

			array[0] = getBygetOSIServicesByS_U_PrevAndNext(
				session, osiServicesApplication, status, userId,
				orderByComparator, true);

			array[1] = osiServicesApplication;

			array[2] = getBygetOSIServicesByS_U_PrevAndNext(
				session, osiServicesApplication, status, userId,
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

	protected OsiServicesApplication getBygetOSIServicesByS_U_PrevAndNext(
		Session session, OsiServicesApplication osiServicesApplication,
		int status, long userId,
		OrderByComparator<OsiServicesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSISERVICESBYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETOSISERVICESBYS_U_USERID_2);

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
			sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetOSIServicesByS_U(int status, long userId) {
		for (OsiServicesApplication osiServicesApplication :
				findBygetOSIServicesByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiServicesApplication);
		}
	}

	/**
	 * Returns the number of osi services applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOSIServicesByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetOSIServicesByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYS_U_USERID_2);

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

	private static final String _FINDER_COLUMN_GETOSISERVICESBYS_U_STATUS_2 =
		"osiServicesApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETOSISERVICESBYS_U_USERID_2 =
		"osiServicesApplication.userId = ?";

	private FinderPath _finderPathFetchBygetOSIServicesByCaseId;
	private FinderPath _finderPathCountBygetOSIServicesByCaseId;

	/**
	 * Returns the osi services application where caseId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByCaseId(String caseId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByCaseId(caseId);

		if (osiServicesApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesApplicationException(sb.toString());
		}

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByCaseId(String caseId) {
		return fetchBygetOSIServicesByCaseId(caseId, true);
	}

	/**
	 * Returns the osi services application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIServicesByCaseId, finderArgs, this);
		}

		if (result instanceof OsiServicesApplication) {
			OsiServicesApplication osiServicesApplication =
				(OsiServicesApplication)result;

			if (!Objects.equals(caseId, osiServicesApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSISERVICESBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSISERVICESBYCASEID_CASEID_2);
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

				List<OsiServicesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIServicesByCaseId,
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
								"OsiServicesApplicationPersistenceImpl.fetchBygetOSIServicesByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesApplication osiServicesApplication = list.get(0);

					result = osiServicesApplication;

					cacheResult(osiServicesApplication);
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
			return (OsiServicesApplication)result;
		}
	}

	/**
	 * Removes the osi services application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the osi services application that was removed
	 */
	@Override
	public OsiServicesApplication removeBygetOSIServicesByCaseId(String caseId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			findBygetOSIServicesByCaseId(caseId);

		return remove(osiServicesApplication);
	}

	/**
	 * Returns the number of osi services applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOSIServicesByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSIServicesByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSISERVICESBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSISERVICESBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETOSISERVICESBYCASEID_CASEID_2 =
		"osiServicesApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSISERVICESBYCASEID_CASEID_3 =
		"(osiServicesApplication.caseId IS NULL OR osiServicesApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetOSIServicesByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetOSIServicesByStatus;
	private FinderPath _finderPathCountBygetOSIServicesByStatus;

	/**
	 * Returns all the osi services applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status) {

		return findBygetOSIServicesByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end) {

		return findBygetOSIServicesByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return findBygetOSIServicesByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByStatus(
		int status, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSIServicesByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetOSIServicesByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<OsiServicesApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplication osiServicesApplication : list) {
					if (status != osiServicesApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<OsiServicesApplication>)QueryUtil.list(
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
	 * Returns the first osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByStatus_First(
			int status,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByStatus_First(status, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByStatus_First(
		int status,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		List<OsiServicesApplication> list = findBygetOSIServicesByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByStatus_Last(
			int status,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByStatus_Last(status, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi services application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByStatus_Last(
		int status,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		int count = countBygetOSIServicesByStatus(status);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplication> list = findBygetOSIServicesByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where status = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication[] findBygetOSIServicesByStatus_PrevAndNext(
			long osiServicesApplicationId, int status,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = findByPrimaryKey(
			osiServicesApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplication[] array = new OsiServicesApplicationImpl[3];

			array[0] = getBygetOSIServicesByStatus_PrevAndNext(
				session, osiServicesApplication, status, orderByComparator,
				true);

			array[1] = osiServicesApplication;

			array[2] = getBygetOSIServicesByStatus_PrevAndNext(
				session, osiServicesApplication, status, orderByComparator,
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

	protected OsiServicesApplication getBygetOSIServicesByStatus_PrevAndNext(
		Session session, OsiServicesApplication osiServicesApplication,
		int status, OrderByComparator<OsiServicesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSISERVICESBYSTATUS_STATUS_2);

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
			sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetOSIServicesByStatus(int status) {
		for (OsiServicesApplication osiServicesApplication :
				findBygetOSIServicesByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesApplication);
		}
	}

	/**
	 * Returns the number of osi services applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOSIServicesByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetOSIServicesByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETOSISERVICESBYSTATUS_STATUS_2 =
		"osiServicesApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetOSIServicesByEntityId;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOSIServicesByEntityId;
	private FinderPath _finderPathCountBygetOSIServicesByEntityId;

	/**
	 * Returns all the osi services applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId) {

		return findBygetOSIServicesByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId, int start, int end) {

		return findBygetOSIServicesByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return findBygetOSIServicesByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId(
		long entityId, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSIServicesByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOSIServicesByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<OsiServicesApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplication osiServicesApplication : list) {
					if (entityId != osiServicesApplication.getEntityId()) {
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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYENTITYID_ENTITYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

				list = (List<OsiServicesApplication>)QueryUtil.list(
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
	 * Returns the first osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByEntityId_First(
			long entityId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByEntityId_First(entityId, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_First(
		long entityId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		List<OsiServicesApplication> list = findBygetOSIServicesByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByEntityId_Last(
			long entityId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByEntityId_Last(entityId, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_Last(
		long entityId,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		int count = countBygetOSIServicesByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplication> list = findBygetOSIServicesByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where entityId = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication[] findBygetOSIServicesByEntityId_PrevAndNext(
			long osiServicesApplicationId, long entityId,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = findByPrimaryKey(
			osiServicesApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplication[] array = new OsiServicesApplicationImpl[3];

			array[0] = getBygetOSIServicesByEntityId_PrevAndNext(
				session, osiServicesApplication, entityId, orderByComparator,
				true);

			array[1] = osiServicesApplication;

			array[2] = getBygetOSIServicesByEntityId_PrevAndNext(
				session, osiServicesApplication, entityId, orderByComparator,
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

	protected OsiServicesApplication getBygetOSIServicesByEntityId_PrevAndNext(
		Session session, OsiServicesApplication osiServicesApplication,
		long entityId,
		OrderByComparator<OsiServicesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSISERVICESBYENTITYID_ENTITYID_2);

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
			sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetOSIServicesByEntityId(long entityId) {
		for (OsiServicesApplication osiServicesApplication :
				findBygetOSIServicesByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(osiServicesApplication);
		}
	}

	/**
	 * Returns the number of osi services applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOSIServicesByEntityId(long entityId) {
		FinderPath finderPath = _finderPathCountBygetOSIServicesByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYENTITYID_ENTITYID_2);

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

	private static final String
		_FINDER_COLUMN_GETOSISERVICESBYENTITYID_ENTITYID_2 =
			"osiServicesApplication.entityId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetOSIServicesByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetOSIServicesByEntityId_Status;
	private FinderPath _finderPathCountBygetOSIServicesByEntityId_Status;

	/**
	 * Returns all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId_Status(
		long entityId, int status) {

		return findBygetOSIServicesByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId_Status(
		long entityId, int status, int start, int end) {

		return findBygetOSIServicesByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId_Status(
		long entityId, int status, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return findBygetOSIServicesByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findBygetOSIServicesByEntityId_Status(
		long entityId, int status, int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetOSIServicesByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetOSIServicesByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<OsiServicesApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (OsiServicesApplication osiServicesApplication : list) {
					if ((entityId != osiServicesApplication.getEntityId()) ||
						(status != osiServicesApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_ENTITYID_2);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(entityId);

				queryPos.add(status);

				list = (List<OsiServicesApplication>)QueryUtil.list(
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
	 * Returns the first osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByEntityId_Status_First(
			long entityId, int status,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByEntityId_Status_First(
				entityId, status, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the first osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_Status_First(
		long entityId, int status,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		List<OsiServicesApplication> list =
			findBygetOSIServicesByEntityId_Status(
				entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByEntityId_Status_Last(
			long entityId, int status,
			OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByEntityId_Status_Last(
				entityId, status, orderByComparator);

		if (osiServicesApplication != null) {
			return osiServicesApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchOsiServicesApplicationException(sb.toString());
	}

	/**
	 * Returns the last osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByEntityId_Status_Last(
		long entityId, int status,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		int count = countBygetOSIServicesByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<OsiServicesApplication> list =
			findBygetOSIServicesByEntityId_Status(
				entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the osi services applications before and after the current osi services application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param osiServicesApplicationId the primary key of the current osi services application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication[]
			findBygetOSIServicesByEntityId_Status_PrevAndNext(
				long osiServicesApplicationId, long entityId, int status,
				OrderByComparator<OsiServicesApplication> orderByComparator)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = findByPrimaryKey(
			osiServicesApplicationId);

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplication[] array = new OsiServicesApplicationImpl[3];

			array[0] = getBygetOSIServicesByEntityId_Status_PrevAndNext(
				session, osiServicesApplication, entityId, status,
				orderByComparator, true);

			array[1] = osiServicesApplication;

			array[2] = getBygetOSIServicesByEntityId_Status_PrevAndNext(
				session, osiServicesApplication, entityId, status,
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

	protected OsiServicesApplication
		getBygetOSIServicesByEntityId_Status_PrevAndNext(
			Session session, OsiServicesApplication osiServicesApplication,
			long entityId, int status,
			OrderByComparator<OsiServicesApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_ENTITYID_2);

		sb.append(_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_STATUS_2);

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
			sb.append(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
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
						osiServicesApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<OsiServicesApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the osi services applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetOSIServicesByEntityId_Status(
		long entityId, int status) {

		for (OsiServicesApplication osiServicesApplication :
				findBygetOSIServicesByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(osiServicesApplication);
		}
	}

	/**
	 * Returns the number of osi services applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOSIServicesByEntityId_Status(
		long entityId, int status) {

		FinderPath finderPath =
			_finderPathCountBygetOSIServicesByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			sb.append(
				_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_ENTITYID_2);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_STATUS_2);

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
		_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_ENTITYID_2 =
			"osiServicesApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSISERVICESBYENTITYID_STATUS_STATUS_2 =
			"osiServicesApplication.status = ?";

	private FinderPath _finderPathFetchBygetOSIServicesByEI_CI;
	private FinderPath _finderPathCountBygetOSIServicesByEI_CI;

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByEI_CI(
			long entityId, String caseId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByEI_CI(entityId, caseId);

		if (osiServicesApplication == null) {
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

			throw new NoSuchOsiServicesApplicationException(sb.toString());
		}

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByEI_CI(
		long entityId, String caseId) {

		return fetchBygetOSIServicesByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the osi services application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByEI_CI(
		long entityId, String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {entityId, caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIServicesByEI_CI, finderArgs, this);
		}

		if (result instanceof OsiServicesApplication) {
			OsiServicesApplication osiServicesApplication =
				(OsiServicesApplication)result;

			if ((entityId != osiServicesApplication.getEntityId()) ||
				!Objects.equals(caseId, osiServicesApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYEI_CI_ENTITYID_2);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSISERVICESBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSISERVICESBYEI_CI_CASEID_2);
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

				List<OsiServicesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIServicesByEI_CI, finderArgs,
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
								"OsiServicesApplicationPersistenceImpl.fetchBygetOSIServicesByEI_CI(long, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesApplication osiServicesApplication = list.get(0);

					result = osiServicesApplication;

					cacheResult(osiServicesApplication);
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
			return (OsiServicesApplication)result;
		}
	}

	/**
	 * Removes the osi services application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the osi services application that was removed
	 */
	@Override
	public OsiServicesApplication removeBygetOSIServicesByEI_CI(
			long entityId, String caseId)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			findBygetOSIServicesByEI_CI(entityId, caseId);

		return remove(osiServicesApplication);
	}

	/**
	 * Returns the number of osi services applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOSIServicesByEI_CI(long entityId, String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetOSIServicesByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETOSISERVICESBYEI_CI_ENTITYID_2);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETOSISERVICESBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETOSISERVICESBYEI_CI_CASEID_2);
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

	private static final String
		_FINDER_COLUMN_GETOSISERVICESBYEI_CI_ENTITYID_2 =
			"osiServicesApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETOSISERVICESBYEI_CI_CASEID_2 =
		"osiServicesApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETOSISERVICESBYEI_CI_CASEID_3 =
		"(osiServicesApplication.caseId IS NULL OR osiServicesApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetOSIServicesByAppNo;
	private FinderPath _finderPathCountBygetOSIServicesByAppNo;

	/**
	 * Returns the osi services application where applicationNumber = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOSIServicesByAppNo(
			String applicationNumber)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOSIServicesByAppNo(applicationNumber);

		if (osiServicesApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchOsiServicesApplicationException(sb.toString());
		}

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByAppNo(
		String applicationNumber) {

		return fetchBygetOSIServicesByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the osi services application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOSIServicesByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetOSIServicesByAppNo, finderArgs, this);
		}

		if (result instanceof OsiServicesApplication) {
			OsiServicesApplication osiServicesApplication =
				(OsiServicesApplication)result;

			if (!Objects.equals(
					applicationNumber,
					osiServicesApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAPPNO_APPLICATIONNUMBER_2);
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

				List<OsiServicesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOSIServicesByAppNo, finderArgs,
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
								"OsiServicesApplicationPersistenceImpl.fetchBygetOSIServicesByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesApplication osiServicesApplication = list.get(0);

					result = osiServicesApplication;

					cacheResult(osiServicesApplication);
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
			return (OsiServicesApplication)result;
		}
	}

	/**
	 * Removes the osi services application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the osi services application that was removed
	 */
	@Override
	public OsiServicesApplication removeBygetOSIServicesByAppNo(
			String applicationNumber)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			findBygetOSIServicesByAppNo(applicationNumber);

		return remove(osiServicesApplication);
	}

	/**
	 * Returns the number of osi services applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOSIServicesByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetOSIServicesByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETOSISERVICESBYAPPNO_APPLICATIONNUMBER_2 =
			"osiServicesApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETOSISERVICESBYAPPNO_APPLICATIONNUMBER_3 =
			"(osiServicesApplication.applicationNumber IS NULL OR osiServicesApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetOsiServicesByAT_AppNo;
	private FinderPath _finderPathCountBygetOsiServicesByAT_AppNo;

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi services application
	 * @throws NoSuchOsiServicesApplicationException if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication findBygetOsiServicesByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			fetchBygetOsiServicesByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		if (osiServicesApplication == null) {
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

			throw new NoSuchOsiServicesApplicationException(sb.toString());
		}

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetOsiServicesByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching osi services application, or <code>null</code> if a matching osi services application could not be found
	 */
	@Override
	public OsiServicesApplication fetchBygetOsiServicesByAT_AppNo(
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
				_finderPathFetchBygetOsiServicesByAT_AppNo, finderArgs, this);
		}

		if (result instanceof OsiServicesApplication) {
			OsiServicesApplication osiServicesApplication =
				(OsiServicesApplication)result;

			if (!Objects.equals(
					typeOfTransaction,
					osiServicesApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					osiServicesApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_OSISERVICESAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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

				List<OsiServicesApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetOsiServicesByAT_AppNo,
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
								"OsiServicesApplicationPersistenceImpl.fetchBygetOsiServicesByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					OsiServicesApplication osiServicesApplication = list.get(0);

					result = osiServicesApplication;

					cacheResult(osiServicesApplication);
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
			return (OsiServicesApplication)result;
		}
	}

	/**
	 * Removes the osi services application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the osi services application that was removed
	 */
	@Override
	public OsiServicesApplication removeBygetOsiServicesByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication =
			findBygetOsiServicesByAT_AppNo(
				typeOfTransaction, expiredLicenseAppNumber);

		return remove(osiServicesApplication);
	}

	/**
	 * Returns the number of osi services applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching osi services applications
	 */
	@Override
	public int countBygetOsiServicesByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetOsiServicesByAT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_OSISERVICESAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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
		_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_TYPEOFTRANSACTION_2 =
			"osiServicesApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_TYPEOFTRANSACTION_3 =
			"(osiServicesApplication.typeOfTransaction IS NULL OR osiServicesApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"osiServicesApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETOSISERVICESBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(osiServicesApplication.expiredLicenseAppNumber IS NULL OR osiServicesApplication.expiredLicenseAppNumber = '')";

	public OsiServicesApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(OsiServicesApplication.class);

		setModelImplClass(OsiServicesApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(OsiServicesApplicationTable.INSTANCE);
	}

	/**
	 * Caches the osi services application in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplication the osi services application
	 */
	@Override
	public void cacheResult(OsiServicesApplication osiServicesApplication) {
		entityCache.putResult(
			OsiServicesApplicationImpl.class,
			osiServicesApplication.getPrimaryKey(), osiServicesApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				osiServicesApplication.getUuid(),
				osiServicesApplication.getGroupId()
			},
			osiServicesApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById,
			new Object[] {osiServicesApplication.getOsiServicesApplicationId()},
			osiServicesApplication);

		finderCache.putResult(
			_finderPathFetchBygetOSIServicesByCaseId,
			new Object[] {osiServicesApplication.getCaseId()},
			osiServicesApplication);

		finderCache.putResult(
			_finderPathFetchBygetOSIServicesByEI_CI,
			new Object[] {
				osiServicesApplication.getEntityId(),
				osiServicesApplication.getCaseId()
			},
			osiServicesApplication);

		finderCache.putResult(
			_finderPathFetchBygetOSIServicesByAppNo,
			new Object[] {osiServicesApplication.getApplicationNumber()},
			osiServicesApplication);

		finderCache.putResult(
			_finderPathFetchBygetOsiServicesByAT_AppNo,
			new Object[] {
				osiServicesApplication.getTypeOfTransaction(),
				osiServicesApplication.getExpiredLicenseAppNumber()
			},
			osiServicesApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the osi services applications in the entity cache if it is enabled.
	 *
	 * @param osiServicesApplications the osi services applications
	 */
	@Override
	public void cacheResult(
		List<OsiServicesApplication> osiServicesApplications) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (osiServicesApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (OsiServicesApplication osiServicesApplication :
				osiServicesApplications) {

			if (entityCache.getResult(
					OsiServicesApplicationImpl.class,
					osiServicesApplication.getPrimaryKey()) == null) {

				cacheResult(osiServicesApplication);
			}
		}
	}

	/**
	 * Clears the cache for all osi services applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(OsiServicesApplicationImpl.class);

		finderCache.clearCache(OsiServicesApplicationImpl.class);
	}

	/**
	 * Clears the cache for the osi services application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(OsiServicesApplication osiServicesApplication) {
		entityCache.removeResult(
			OsiServicesApplicationImpl.class, osiServicesApplication);
	}

	@Override
	public void clearCache(
		List<OsiServicesApplication> osiServicesApplications) {

		for (OsiServicesApplication osiServicesApplication :
				osiServicesApplications) {

			entityCache.removeResult(
				OsiServicesApplicationImpl.class, osiServicesApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(OsiServicesApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				OsiServicesApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		OsiServicesApplicationModelImpl osiServicesApplicationModelImpl) {

		Object[] args = new Object[] {
			osiServicesApplicationModelImpl.getUuid(),
			osiServicesApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, osiServicesApplicationModelImpl);

		args = new Object[] {
			osiServicesApplicationModelImpl.getOsiServicesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesById, args,
			osiServicesApplicationModelImpl);

		args = new Object[] {osiServicesApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetOSIServicesByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIServicesByCaseId, args,
			osiServicesApplicationModelImpl);

		args = new Object[] {
			osiServicesApplicationModelImpl.getEntityId(),
			osiServicesApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIServicesByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIServicesByEI_CI, args,
			osiServicesApplicationModelImpl);

		args = new Object[] {
			osiServicesApplicationModelImpl.getApplicationNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetOSIServicesByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOSIServicesByAppNo, args,
			osiServicesApplicationModelImpl);

		args = new Object[] {
			osiServicesApplicationModelImpl.getTypeOfTransaction(),
			osiServicesApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetOsiServicesByAT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetOsiServicesByAT_AppNo, args,
			osiServicesApplicationModelImpl);
	}

	/**
	 * Creates a new osi services application with the primary key. Does not add the osi services application to the database.
	 *
	 * @param osiServicesApplicationId the primary key for the new osi services application
	 * @return the new osi services application
	 */
	@Override
	public OsiServicesApplication create(long osiServicesApplicationId) {
		OsiServicesApplication osiServicesApplication =
			new OsiServicesApplicationImpl();

		osiServicesApplication.setNew(true);
		osiServicesApplication.setPrimaryKey(osiServicesApplicationId);

		String uuid = PortalUUIDUtil.generate();

		osiServicesApplication.setUuid(uuid);

		osiServicesApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return osiServicesApplication;
	}

	/**
	 * Removes the osi services application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application that was removed
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication remove(long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException {

		return remove((Serializable)osiServicesApplicationId);
	}

	/**
	 * Removes the osi services application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the osi services application
	 * @return the osi services application that was removed
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication remove(Serializable primaryKey)
		throws NoSuchOsiServicesApplicationException {

		Session session = null;

		try {
			session = openSession();

			OsiServicesApplication osiServicesApplication =
				(OsiServicesApplication)session.get(
					OsiServicesApplicationImpl.class, primaryKey);

			if (osiServicesApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchOsiServicesApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(osiServicesApplication);
		}
		catch (NoSuchOsiServicesApplicationException noSuchEntityException) {
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
	protected OsiServicesApplication removeImpl(
		OsiServicesApplication osiServicesApplication) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(osiServicesApplication)) {
				osiServicesApplication = (OsiServicesApplication)session.get(
					OsiServicesApplicationImpl.class,
					osiServicesApplication.getPrimaryKeyObj());
			}

			if (osiServicesApplication != null) {
				session.delete(osiServicesApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (osiServicesApplication != null) {
			clearCache(osiServicesApplication);
		}

		return osiServicesApplication;
	}

	@Override
	public OsiServicesApplication updateImpl(
		OsiServicesApplication osiServicesApplication) {

		boolean isNew = osiServicesApplication.isNew();

		if (!(osiServicesApplication instanceof
				OsiServicesApplicationModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(osiServicesApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					osiServicesApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in osiServicesApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom OsiServicesApplication implementation " +
					osiServicesApplication.getClass());
		}

		OsiServicesApplicationModelImpl osiServicesApplicationModelImpl =
			(OsiServicesApplicationModelImpl)osiServicesApplication;

		if (Validator.isNull(osiServicesApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			osiServicesApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (osiServicesApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				osiServicesApplication.setCreateDate(date);
			}
			else {
				osiServicesApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!osiServicesApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				osiServicesApplication.setModifiedDate(date);
			}
			else {
				osiServicesApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(osiServicesApplication);
			}
			else {
				osiServicesApplication = (OsiServicesApplication)session.merge(
					osiServicesApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			OsiServicesApplicationImpl.class, osiServicesApplicationModelImpl,
			false, true);

		cacheUniqueFindersCache(osiServicesApplicationModelImpl);

		if (isNew) {
			osiServicesApplication.setNew(false);
		}

		osiServicesApplication.resetOriginalValues();

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the osi services application
	 * @return the osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchOsiServicesApplicationException {

		OsiServicesApplication osiServicesApplication = fetchByPrimaryKey(
			primaryKey);

		if (osiServicesApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchOsiServicesApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return osiServicesApplication;
	}

	/**
	 * Returns the osi services application with the primary key or throws a <code>NoSuchOsiServicesApplicationException</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application
	 * @throws NoSuchOsiServicesApplicationException if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication findByPrimaryKey(
			long osiServicesApplicationId)
		throws NoSuchOsiServicesApplicationException {

		return findByPrimaryKey((Serializable)osiServicesApplicationId);
	}

	/**
	 * Returns the osi services application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param osiServicesApplicationId the primary key of the osi services application
	 * @return the osi services application, or <code>null</code> if a osi services application with the primary key could not be found
	 */
	@Override
	public OsiServicesApplication fetchByPrimaryKey(
		long osiServicesApplicationId) {

		return fetchByPrimaryKey((Serializable)osiServicesApplicationId);
	}

	/**
	 * Returns all the osi services applications.
	 *
	 * @return the osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @return the range of osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findAll(
		int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the osi services applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>OsiServicesApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of osi services applications
	 * @param end the upper bound of the range of osi services applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of osi services applications
	 */
	@Override
	public List<OsiServicesApplication> findAll(
		int start, int end,
		OrderByComparator<OsiServicesApplication> orderByComparator,
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

		List<OsiServicesApplication> list = null;

		if (useFinderCache) {
			list = (List<OsiServicesApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_OSISERVICESAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_OSISERVICESAPPLICATION;

				sql = sql.concat(OsiServicesApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<OsiServicesApplication>)QueryUtil.list(
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
	 * Removes all the osi services applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (OsiServicesApplication osiServicesApplication : findAll()) {
			remove(osiServicesApplication);
		}
	}

	/**
	 * Returns the number of osi services applications.
	 *
	 * @return the number of osi services applications
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
					_SQL_COUNT_OSISERVICESAPPLICATION);

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
		return "osiServicesApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_OSISERVICESAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return OsiServicesApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the osi services application persistence.
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

		_finderPathFetchBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiServicesById",
			new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, true);

		_finderPathCountBygetOsiServicesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiServicesById", new String[] {Long.class.getName()},
			new String[] {"osiServicesApplicationId"}, false);

		_finderPathWithPaginationFindBygetOSIServicesByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetOSIServicesByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetOSIServicesByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetOSIServicesByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetOSIServicesByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIServicesByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetOSIServicesByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIServicesByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetOSIServicesByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIServicesByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetOSIServicesByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetOSIServicesByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetOSIServicesByStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOSIServicesByStatus",
				new String[] {Integer.class.getName()}, new String[] {"status"},
				true);

		_finderPathCountBygetOSIServicesByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIServicesByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetOSIServicesByEntityId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOSIServicesByEntityId",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), OrderByComparator.class.getName()
				},
				new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetOSIServicesByEntityId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOSIServicesByEntityId",
				new String[] {Long.class.getName()}, new String[] {"entityId"},
				true);

		_finderPathCountBygetOSIServicesByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIServicesByEntityId",
			new String[] {Long.class.getName()}, new String[] {"entityId"},
			false);

		_finderPathWithPaginationFindBygetOSIServicesByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetOSIServicesByEntityId_Status",
				new String[] {
					Long.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetOSIServicesByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetOSIServicesByEntityId_Status",
				new String[] {Long.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetOSIServicesByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIServicesByEntityId_Status",
			new String[] {Long.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetOSIServicesByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIServicesByEI_CI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetOSIServicesByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIServicesByEI_CI",
			new String[] {Long.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetOSIServicesByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOSIServicesByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetOSIServicesByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOSIServicesByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetOsiServicesByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetOsiServicesByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetOsiServicesByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetOsiServicesByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		OsiServicesApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		OsiServicesApplicationUtil.setPersistence(null);

		entityCache.removeCache(OsiServicesApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = OSI_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_OSISERVICESAPPLICATION =
		"SELECT osiServicesApplication FROM OsiServicesApplication osiServicesApplication";

	private static final String _SQL_SELECT_OSISERVICESAPPLICATION_WHERE =
		"SELECT osiServicesApplication FROM OsiServicesApplication osiServicesApplication WHERE ";

	private static final String _SQL_COUNT_OSISERVICESAPPLICATION =
		"SELECT COUNT(osiServicesApplication) FROM OsiServicesApplication osiServicesApplication";

	private static final String _SQL_COUNT_OSISERVICESAPPLICATION_WHERE =
		"SELECT COUNT(osiServicesApplication) FROM OsiServicesApplication osiServicesApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"osiServicesApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No OsiServicesApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No OsiServicesApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		OsiServicesApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
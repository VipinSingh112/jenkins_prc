/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.miic.application.form.services.service.persistence.impl;

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

import com.nbp.miic.application.form.services.exception.NoSuchMiicApplicationException;
import com.nbp.miic.application.form.services.model.MiicApplication;
import com.nbp.miic.application.form.services.model.MiicApplicationTable;
import com.nbp.miic.application.form.services.model.impl.MiicApplicationImpl;
import com.nbp.miic.application.form.services.model.impl.MiicApplicationModelImpl;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationPersistence;
import com.nbp.miic.application.form.services.service.persistence.MiicApplicationUtil;
import com.nbp.miic.application.form.services.service.persistence.impl.constants.MIIC_SERVICESPersistenceConstants;

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
 * The persistence implementation for the miic application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = MiicApplicationPersistence.class)
public class MiicApplicationPersistenceImpl
	extends BasePersistenceImpl<MiicApplication>
	implements MiicApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>MiicApplicationUtil</code> to access the miic application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		MiicApplicationImpl.class.getName();

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
	 * Returns all the miic applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
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

		List<MiicApplication> list = null;

		if (useFinderCache) {
			list = (List<MiicApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplication miicApplication : list) {
					if (!uuid.equals(miicApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

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
				sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplication>)QueryUtil.list(
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
	 * Returns the first miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findByUuid_First(
			String uuid, OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchByUuid_First(
		String uuid, OrderByComparator<MiicApplication> orderByComparator) {

		List<MiicApplication> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findByUuid_Last(
			String uuid, OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchByUuid_Last(
		String uuid, OrderByComparator<MiicApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<MiicApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where uuid = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication[] findByUuid_PrevAndNext(
			long miicApplicationId, String uuid,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		uuid = Objects.toString(uuid, "");

		MiicApplication miicApplication = findByPrimaryKey(miicApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiicApplication[] array = new MiicApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, miicApplication, uuid, orderByComparator, true);

			array[1] = miicApplication;

			array[2] = getByUuid_PrevAndNext(
				session, miicApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MiicApplication getByUuid_PrevAndNext(
		Session session, MiicApplication miicApplication, String uuid,
		OrderByComparator<MiicApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

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
			sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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
						miicApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (MiicApplication miicApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miicApplication);
		}
	}

	/**
	 * Returns the number of miic applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching miic applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

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
		"miicApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(miicApplication.uuid IS NULL OR miicApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchByUUID_G(uuid, groupId);

		if (miicApplication == null) {
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

			throw new NoSuchMiicApplicationException(sb.toString());
		}

		return miicApplication;
	}

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the miic application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchByUUID_G(
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

		if (result instanceof MiicApplication) {
			MiicApplication miicApplication = (MiicApplication)result;

			if (!Objects.equals(uuid, miicApplication.getUuid()) ||
				(groupId != miicApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

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

				List<MiicApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					MiicApplication miicApplication = list.get(0);

					result = miicApplication;

					cacheResult(miicApplication);
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
			return (MiicApplication)result;
		}
	}

	/**
	 * Removes the miic application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the miic application that was removed
	 */
	@Override
	public MiicApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findByUUID_G(uuid, groupId);

		return remove(miicApplication);
	}

	/**
	 * Returns the number of miic applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching miic applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

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
		"miicApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(miicApplication.uuid IS NULL OR miicApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"miicApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
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

		List<MiicApplication> list = null;

		if (useFinderCache) {
			list = (List<MiicApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplication miicApplication : list) {
					if (!uuid.equals(miicApplication.getUuid()) ||
						(companyId != miicApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

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
				sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplication>)QueryUtil.list(
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
	 * Returns the first miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the first miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<MiicApplication> orderByComparator) {

		List<MiicApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the last miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<MiicApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<MiicApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication[] findByUuid_C_PrevAndNext(
			long miicApplicationId, String uuid, long companyId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		uuid = Objects.toString(uuid, "");

		MiicApplication miicApplication = findByPrimaryKey(miicApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiicApplication[] array = new MiicApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, miicApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = miicApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, miicApplication, uuid, companyId, orderByComparator,
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

	protected MiicApplication getByUuid_C_PrevAndNext(
		Session session, MiicApplication miicApplication, String uuid,
		long companyId, OrderByComparator<MiicApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

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
			sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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
						miicApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (MiicApplication miicApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miicApplication);
		}
	}

	/**
	 * Returns the number of miic applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching miic applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

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
		"miicApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(miicApplication.uuid IS NULL OR miicApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"miicApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetMIICById;
	private FinderPath _finderPathCountBygetMIICById;

	/**
	 * Returns the miic application where miicApplicationId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICById(long miicApplicationId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICById(miicApplicationId);

		if (miicApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("miicApplicationId=");
			sb.append(miicApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicApplicationException(sb.toString());
		}

		return miicApplication;
	}

	/**
	 * Returns the miic application where miicApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICById(long miicApplicationId) {
		return fetchBygetMIICById(miicApplicationId, true);
	}

	/**
	 * Returns the miic application where miicApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param miicApplicationId the miic application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICById(
		long miicApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {miicApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMIICById, finderArgs, this);
		}

		if (result instanceof MiicApplication) {
			MiicApplication miicApplication = (MiicApplication)result;

			if (miicApplicationId != miicApplication.getMiicApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

				List<MiicApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIICById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {miicApplicationId};
							}

							_log.warn(
								"MiicApplicationPersistenceImpl.fetchBygetMIICById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplication miicApplication = list.get(0);

					result = miicApplication;

					cacheResult(miicApplication);
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
			return (MiicApplication)result;
		}
	}

	/**
	 * Removes the miic application where miicApplicationId = &#63; from the database.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the miic application that was removed
	 */
	@Override
	public MiicApplication removeBygetMIICById(long miicApplicationId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findBygetMIICById(miicApplicationId);

		return remove(miicApplication);
	}

	/**
	 * Returns the number of miic applications where miicApplicationId = &#63;.
	 *
	 * @param miicApplicationId the miic application ID
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICById(long miicApplicationId) {
		FinderPath finderPath = _finderPathCountBygetMIICById;

		Object[] finderArgs = new Object[] {miicApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(miicApplicationId);

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

	private static final String _FINDER_COLUMN_GETMIICBYID_MIICAPPLICATIONID_2 =
		"miicApplication.miicApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetMIICByS_U;
	private FinderPath _finderPathWithoutPaginationFindBygetMIICByS_U;
	private FinderPath _finderPathCountBygetMIICByS_U;

	/**
	 * Returns all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByS_U(int status, long userId) {
		return findBygetMIICByS_U(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end) {

		return findBygetMIICByS_U(status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return findBygetMIICByS_U(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByS_U(
		int status, long userId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMIICByS_U;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMIICByS_U;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<MiicApplication> list = null;

		if (useFinderCache) {
			list = (List<MiicApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplication miicApplication : list) {
					if ((status != miicApplication.getStatus()) ||
						(userId != miicApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETMIICBYS_U_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<MiicApplication>)QueryUtil.list(
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
	 * Returns the first miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByS_U_First(
			int status, long userId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByS_U_First(
			status, userId, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the first miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByS_U_First(
		int status, long userId,
		OrderByComparator<MiicApplication> orderByComparator) {

		List<MiicApplication> list = findBygetMIICByS_U(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByS_U_Last(
			int status, long userId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByS_U_Last(
			status, userId, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByS_U_Last(
		int status, long userId,
		OrderByComparator<MiicApplication> orderByComparator) {

		int count = countBygetMIICByS_U(status, userId);

		if (count == 0) {
			return null;
		}

		List<MiicApplication> list = findBygetMIICByS_U(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication[] findBygetMIICByS_U_PrevAndNext(
			long miicApplicationId, int status, long userId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findByPrimaryKey(miicApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiicApplication[] array = new MiicApplicationImpl[3];

			array[0] = getBygetMIICByS_U_PrevAndNext(
				session, miicApplication, status, userId, orderByComparator,
				true);

			array[1] = miicApplication;

			array[2] = getBygetMIICByS_U_PrevAndNext(
				session, miicApplication, status, userId, orderByComparator,
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

	protected MiicApplication getBygetMIICByS_U_PrevAndNext(
		Session session, MiicApplication miicApplication, int status,
		long userId, OrderByComparator<MiicApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETMIICBYS_U_STATUS_2);

		sb.append(_FINDER_COLUMN_GETMIICBYS_U_USERID_2);

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
			sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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
						miicApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetMIICByS_U(int status, long userId) {
		for (MiicApplication miicApplication :
				findBygetMIICByS_U(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miicApplication);
		}
	}

	/**
	 * Returns the number of miic applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByS_U(int status, long userId) {
		FinderPath finderPath = _finderPathCountBygetMIICByS_U;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYS_U_STATUS_2);

			sb.append(_FINDER_COLUMN_GETMIICBYS_U_USERID_2);

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

	private static final String _FINDER_COLUMN_GETMIICBYS_U_STATUS_2 =
		"miicApplication.status = ? AND ";

	private static final String _FINDER_COLUMN_GETMIICBYS_U_USERID_2 =
		"miicApplication.userId = ?";

	private FinderPath _finderPathFetchBygetMIICByCaseId;
	private FinderPath _finderPathCountBygetMIICByCaseId;

	/**
	 * Returns the miic application where caseId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByCaseId(String caseId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByCaseId(caseId);

		if (miicApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicApplicationException(sb.toString());
		}

		return miicApplication;
	}

	/**
	 * Returns the miic application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByCaseId(String caseId) {
		return fetchBygetMIICByCaseId(caseId, true);
	}

	/**
	 * Returns the miic application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMIICByCaseId, finderArgs, this);
		}

		if (result instanceof MiicApplication) {
			MiicApplication miicApplication = (MiicApplication)result;

			if (!Objects.equals(caseId, miicApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYCASEID_CASEID_2);
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

				List<MiicApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIICByCaseId, finderArgs,
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
								"MiicApplicationPersistenceImpl.fetchBygetMIICByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplication miicApplication = list.get(0);

					result = miicApplication;

					cacheResult(miicApplication);
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
			return (MiicApplication)result;
		}
	}

	/**
	 * Removes the miic application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the miic application that was removed
	 */
	@Override
	public MiicApplication removeBygetMIICByCaseId(String caseId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findBygetMIICByCaseId(caseId);

		return remove(miicApplication);
	}

	/**
	 * Returns the number of miic applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMIICByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMIICBYCASEID_CASEID_2 =
		"miicApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETMIICBYCASEID_CASEID_3 =
		"(miicApplication.caseId IS NULL OR miicApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMIICByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetMIICByStatus;
	private FinderPath _finderPathCountBygetMIICByStatus;

	/**
	 * Returns all the miic applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByStatus(int status) {
		return findBygetMIICByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end) {

		return findBygetMIICByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return findBygetMIICByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByStatus(
		int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetMIICByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMIICByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<MiicApplication> list = null;

		if (useFinderCache) {
			list = (List<MiicApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplication miicApplication : list) {
					if (status != miicApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<MiicApplication>)QueryUtil.list(
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
	 * Returns the first miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByStatus_First(
			int status, OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByStatus_First(
			status, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the first miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByStatus_First(
		int status, OrderByComparator<MiicApplication> orderByComparator) {

		List<MiicApplication> list = findBygetMIICByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByStatus_Last(
			int status, OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByStatus_Last(
			status, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the last miic application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByStatus_Last(
		int status, OrderByComparator<MiicApplication> orderByComparator) {

		int count = countBygetMIICByStatus(status);

		if (count == 0) {
			return null;
		}

		List<MiicApplication> list = findBygetMIICByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where status = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication[] findBygetMIICByStatus_PrevAndNext(
			long miicApplicationId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findByPrimaryKey(miicApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiicApplication[] array = new MiicApplicationImpl[3];

			array[0] = getBygetMIICByStatus_PrevAndNext(
				session, miicApplication, status, orderByComparator, true);

			array[1] = miicApplication;

			array[2] = getBygetMIICByStatus_PrevAndNext(
				session, miicApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MiicApplication getBygetMIICByStatus_PrevAndNext(
		Session session, MiicApplication miicApplication, int status,
		OrderByComparator<MiicApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETMIICBYSTATUS_STATUS_2);

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
			sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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
						miicApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetMIICByStatus(int status) {
		for (MiicApplication miicApplication :
				findBygetMIICByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miicApplication);
		}
	}

	/**
	 * Returns the number of miic applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetMIICByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETMIICBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETMIICBYSTATUS_STATUS_2 =
		"miicApplication.status = ?";

	private FinderPath _finderPathWithPaginationFindBygetMIICByEntityId;
	private FinderPath _finderPathWithoutPaginationFindBygetMIICByEntityId;
	private FinderPath _finderPathCountBygetMIICByEntityId;

	/**
	 * Returns all the miic applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId(String entityId) {
		return findBygetMIICByEntityId(
			entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end) {

		return findBygetMIICByEntityId(entityId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return findBygetMIICByEntityId(
			entityId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId(
		String entityId, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMIICByEntityId;
				finderArgs = new Object[] {entityId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetMIICByEntityId;
			finderArgs = new Object[] {entityId, start, end, orderByComparator};
		}

		List<MiicApplication> list = null;

		if (useFinderCache) {
			list = (List<MiicApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplication miicApplication : list) {
					if (!entityId.equals(miicApplication.getEntityId())) {
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

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplication>)QueryUtil.list(
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
	 * Returns the first miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByEntityId_First(
			String entityId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByEntityId_First(
			entityId, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByEntityId_First(
		String entityId, OrderByComparator<MiicApplication> orderByComparator) {

		List<MiicApplication> list = findBygetMIICByEntityId(
			entityId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByEntityId_Last(
			String entityId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByEntityId_Last(
			entityId, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByEntityId_Last(
		String entityId, OrderByComparator<MiicApplication> orderByComparator) {

		int count = countBygetMIICByEntityId(entityId);

		if (count == 0) {
			return null;
		}

		List<MiicApplication> list = findBygetMIICByEntityId(
			entityId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where entityId = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param entityId the entity ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication[] findBygetMIICByEntityId_PrevAndNext(
			long miicApplicationId, String entityId,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		entityId = Objects.toString(entityId, "");

		MiicApplication miicApplication = findByPrimaryKey(miicApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiicApplication[] array = new MiicApplicationImpl[3];

			array[0] = getBygetMIICByEntityId_PrevAndNext(
				session, miicApplication, entityId, orderByComparator, true);

			array[1] = miicApplication;

			array[2] = getBygetMIICByEntityId_PrevAndNext(
				session, miicApplication, entityId, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected MiicApplication getBygetMIICByEntityId_PrevAndNext(
		Session session, MiicApplication miicApplication, String entityId,
		OrderByComparator<MiicApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_2);
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
			sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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
						miicApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic applications where entityId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 */
	@Override
	public void removeBygetMIICByEntityId(String entityId) {
		for (MiicApplication miicApplication :
				findBygetMIICByEntityId(
					entityId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(miicApplication);
		}
	}

	/**
	 * Returns the number of miic applications where entityId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByEntityId(String entityId) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetMIICByEntityId;

		Object[] finderArgs = new Object[] {entityId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_2);
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

	private static final String _FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_2 =
		"miicApplication.entityId = ?";

	private static final String _FINDER_COLUMN_GETMIICBYENTITYID_ENTITYID_3 =
		"(miicApplication.entityId IS NULL OR miicApplication.entityId = '')";

	private FinderPath _finderPathWithPaginationFindBygetMIICByEntityId_Status;
	private FinderPath
		_finderPathWithoutPaginationFindBygetMIICByEntityId_Status;
	private FinderPath _finderPathCountBygetMIICByEntityId_Status;

	/**
	 * Returns all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status) {

		return findBygetMIICByEntityId_Status(
			entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end) {

		return findBygetMIICByEntityId_Status(
			entityId, status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return findBygetMIICByEntityId_Status(
			entityId, status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applications where entityId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching miic applications
	 */
	@Override
	public List<MiicApplication> findBygetMIICByEntityId_Status(
		String entityId, int status, int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
		boolean useFinderCache) {

		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetMIICByEntityId_Status;
				finderArgs = new Object[] {entityId, status};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetMIICByEntityId_Status;
			finderArgs = new Object[] {
				entityId, status, start, end, orderByComparator
			};
		}

		List<MiicApplication> list = null;

		if (useFinderCache) {
			list = (List<MiicApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (MiicApplication miicApplication : list) {
					if (!entityId.equals(miicApplication.getEntityId()) ||
						(status != miicApplication.getStatus())) {

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

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<MiicApplication>)QueryUtil.list(
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
	 * Returns the first miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByEntityId_Status_First(
			String entityId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByEntityId_Status_First(
			entityId, status, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the first miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByEntityId_Status_First(
		String entityId, int status,
		OrderByComparator<MiicApplication> orderByComparator) {

		List<MiicApplication> list = findBygetMIICByEntityId_Status(
			entityId, status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByEntityId_Status_Last(
			String entityId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByEntityId_Status_Last(
			entityId, status, orderByComparator);

		if (miicApplication != null) {
			return miicApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("entityId=");
		sb.append(entityId);

		sb.append(", status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchMiicApplicationException(sb.toString());
	}

	/**
	 * Returns the last miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByEntityId_Status_Last(
		String entityId, int status,
		OrderByComparator<MiicApplication> orderByComparator) {

		int count = countBygetMIICByEntityId_Status(entityId, status);

		if (count == 0) {
			return null;
		}

		List<MiicApplication> list = findBygetMIICByEntityId_Status(
			entityId, status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the miic applications before and after the current miic application in the ordered set where entityId = &#63; and status = &#63;.
	 *
	 * @param miicApplicationId the primary key of the current miic application
	 * @param entityId the entity ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication[] findBygetMIICByEntityId_Status_PrevAndNext(
			long miicApplicationId, String entityId, int status,
			OrderByComparator<MiicApplication> orderByComparator)
		throws NoSuchMiicApplicationException {

		entityId = Objects.toString(entityId, "");

		MiicApplication miicApplication = findByPrimaryKey(miicApplicationId);

		Session session = null;

		try {
			session = openSession();

			MiicApplication[] array = new MiicApplicationImpl[3];

			array[0] = getBygetMIICByEntityId_Status_PrevAndNext(
				session, miicApplication, entityId, status, orderByComparator,
				true);

			array[1] = miicApplication;

			array[2] = getBygetMIICByEntityId_Status_PrevAndNext(
				session, miicApplication, entityId, status, orderByComparator,
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

	protected MiicApplication getBygetMIICByEntityId_Status_PrevAndNext(
		Session session, MiicApplication miicApplication, String entityId,
		int status, OrderByComparator<MiicApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

		boolean bindEntityId = false;

		if (entityId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_3);
		}
		else {
			bindEntityId = true;

			sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_2);
		}

		sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_STATUS_2);

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
			sb.append(MiicApplicationModelImpl.ORDER_BY_JPQL);
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
						miicApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<MiicApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the miic applications where entityId = &#63; and status = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 */
	@Override
	public void removeBygetMIICByEntityId_Status(String entityId, int status) {
		for (MiicApplication miicApplication :
				findBygetMIICByEntityId_Status(
					entityId, status, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(miicApplication);
		}
	}

	/**
	 * Returns the number of miic applications where entityId = &#63; and status = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param status the status
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByEntityId_Status(String entityId, int status) {
		entityId = Objects.toString(entityId, "");

		FinderPath finderPath = _finderPathCountBygetMIICByEntityId_Status;

		Object[] finderArgs = new Object[] {entityId, status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_2);
			}

			sb.append(_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_STATUS_2);

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
		_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_2 =
			"miicApplication.entityId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_ENTITYID_3 =
			"(miicApplication.entityId IS NULL OR miicApplication.entityId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMIICBYENTITYID_STATUS_STATUS_2 =
			"miicApplication.status = ?";

	private FinderPath _finderPathFetchBygetMIICByEI_CI;
	private FinderPath _finderPathCountBygetMIICByEI_CI;

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByEI_CI(String entityId, String caseId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByEI_CI(
			entityId, caseId);

		if (miicApplication == null) {
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

			throw new NoSuchMiicApplicationException(sb.toString());
		}

		return miicApplication;
	}

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByEI_CI(
		String entityId, String caseId) {

		return fetchBygetMIICByEI_CI(entityId, caseId, true);
	}

	/**
	 * Returns the miic application where entityId = &#63; and caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByEI_CI(
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
				_finderPathFetchBygetMIICByEI_CI, finderArgs, this);
		}

		if (result instanceof MiicApplication) {
			MiicApplication miicApplication = (MiicApplication)result;

			if (!Objects.equals(entityId, miicApplication.getEntityId()) ||
				!Objects.equals(caseId, miicApplication.getCaseId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_CASEID_2);
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

				List<MiicApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIICByEI_CI, finderArgs, list);
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
								"MiicApplicationPersistenceImpl.fetchBygetMIICByEI_CI(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplication miicApplication = list.get(0);

					result = miicApplication;

					cacheResult(miicApplication);
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
			return (MiicApplication)result;
		}
	}

	/**
	 * Removes the miic application where entityId = &#63; and caseId = &#63; from the database.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the miic application that was removed
	 */
	@Override
	public MiicApplication removeBygetMIICByEI_CI(
			String entityId, String caseId)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findBygetMIICByEI_CI(
			entityId, caseId);

		return remove(miicApplication);
	}

	/**
	 * Returns the number of miic applications where entityId = &#63; and caseId = &#63;.
	 *
	 * @param entityId the entity ID
	 * @param caseId the case ID
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByEI_CI(String entityId, String caseId) {
		entityId = Objects.toString(entityId, "");
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetMIICByEI_CI;

		Object[] finderArgs = new Object[] {entityId, caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			boolean bindEntityId = false;

			if (entityId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_ENTITYID_3);
			}
			else {
				bindEntityId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_ENTITYID_2);
			}

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETMIICBYEI_CI_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETMIICBYEI_CI_ENTITYID_2 =
		"miicApplication.entityId = ? AND ";

	private static final String _FINDER_COLUMN_GETMIICBYEI_CI_ENTITYID_3 =
		"(miicApplication.entityId IS NULL OR miicApplication.entityId = '') AND ";

	private static final String _FINDER_COLUMN_GETMIICBYEI_CI_CASEID_2 =
		"miicApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETMIICBYEI_CI_CASEID_3 =
		"(miicApplication.caseId IS NULL OR miicApplication.caseId = '')";

	private FinderPath _finderPathFetchBygetMIICByAppNo;
	private FinderPath _finderPathCountBygetMIICByAppNo;

	/**
	 * Returns the miic application where applicationNumber = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByAppNo(String applicationNumber)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByAppNo(
			applicationNumber);

		if (miicApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchMiicApplicationException(sb.toString());
		}

		return miicApplication;
	}

	/**
	 * Returns the miic application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByAppNo(String applicationNumber) {
		return fetchBygetMIICByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the miic application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetMIICByAppNo, finderArgs, this);
		}

		if (result instanceof MiicApplication) {
			MiicApplication miicApplication = (MiicApplication)result;

			if (!Objects.equals(
					applicationNumber,
					miicApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETMIICBYAPPNO_APPLICATIONNUMBER_2);
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

				List<MiicApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIICByAppNo, finderArgs, list);
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
								"MiicApplicationPersistenceImpl.fetchBygetMIICByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplication miicApplication = list.get(0);

					result = miicApplication;

					cacheResult(miicApplication);
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
			return (MiicApplication)result;
		}
	}

	/**
	 * Removes the miic application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the miic application that was removed
	 */
	@Override
	public MiicApplication removeBygetMIICByAppNo(String applicationNumber)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findBygetMIICByAppNo(
			applicationNumber);

		return remove(miicApplication);
	}

	/**
	 * Returns the number of miic applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetMIICByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETMIICBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETMIICBYAPPNO_APPLICATIONNUMBER_2 =
			"miicApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMIICBYAPPNO_APPLICATIONNUMBER_3 =
			"(miicApplication.applicationNumber IS NULL OR miicApplication.applicationNumber = '')";

	private FinderPath _finderPathFetchBygetMIICByAT_AppNo;
	private FinderPath _finderPathCountBygetMIICByAT_AppNo;

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching miic application
	 * @throws NoSuchMiicApplicationException if a matching miic application could not be found
	 */
	@Override
	public MiicApplication findBygetMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		if (miicApplication == null) {
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

			throw new NoSuchMiicApplicationException(sb.toString());
		}

		return miicApplication;
	}

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		return fetchBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber, true);
	}

	/**
	 * Returns the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching miic application, or <code>null</code> if a matching miic application could not be found
	 */
	@Override
	public MiicApplication fetchBygetMIICByAT_AppNo(
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
				_finderPathFetchBygetMIICByAT_AppNo, finderArgs, this);
		}

		if (result instanceof MiicApplication) {
			MiicApplication miicApplication = (MiicApplication)result;

			if (!Objects.equals(
					typeOfTransaction,
					miicApplication.getTypeOfTransaction()) ||
				!Objects.equals(
					expiredLicenseAppNumber,
					miicApplication.getExpiredLicenseAppNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_MIICAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(_FINDER_COLUMN_GETMIICBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMIICBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMIICBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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

				List<MiicApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetMIICByAT_AppNo, finderArgs,
							list);
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
								"MiicApplicationPersistenceImpl.fetchBygetMIICByAT_AppNo(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					MiicApplication miicApplication = list.get(0);

					result = miicApplication;

					cacheResult(miicApplication);
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
			return (MiicApplication)result;
		}
	}

	/**
	 * Removes the miic application where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63; from the database.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the miic application that was removed
	 */
	@Override
	public MiicApplication removeBygetMIICByAT_AppNo(
			String typeOfTransaction, String expiredLicenseAppNumber)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = findBygetMIICByAT_AppNo(
			typeOfTransaction, expiredLicenseAppNumber);

		return remove(miicApplication);
	}

	/**
	 * Returns the number of miic applications where typeOfTransaction = &#63; and expiredLicenseAppNumber = &#63;.
	 *
	 * @param typeOfTransaction the type of transaction
	 * @param expiredLicenseAppNumber the expired license app number
	 * @return the number of matching miic applications
	 */
	@Override
	public int countBygetMIICByAT_AppNo(
		String typeOfTransaction, String expiredLicenseAppNumber) {

		typeOfTransaction = Objects.toString(typeOfTransaction, "");
		expiredLicenseAppNumber = Objects.toString(expiredLicenseAppNumber, "");

		FinderPath finderPath = _finderPathCountBygetMIICByAT_AppNo;

		Object[] finderArgs = new Object[] {
			typeOfTransaction, expiredLicenseAppNumber
		};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_MIICAPPLICATION_WHERE);

			boolean bindTypeOfTransaction = false;

			if (typeOfTransaction.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETMIICBYAT_APPNO_TYPEOFTRANSACTION_3);
			}
			else {
				bindTypeOfTransaction = true;

				sb.append(_FINDER_COLUMN_GETMIICBYAT_APPNO_TYPEOFTRANSACTION_2);
			}

			boolean bindExpiredLicenseAppNumber = false;

			if (expiredLicenseAppNumber.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETMIICBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3);
			}
			else {
				bindExpiredLicenseAppNumber = true;

				sb.append(
					_FINDER_COLUMN_GETMIICBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2);
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
		_FINDER_COLUMN_GETMIICBYAT_APPNO_TYPEOFTRANSACTION_2 =
			"miicApplication.typeOfTransaction = ? AND ";

	private static final String
		_FINDER_COLUMN_GETMIICBYAT_APPNO_TYPEOFTRANSACTION_3 =
			"(miicApplication.typeOfTransaction IS NULL OR miicApplication.typeOfTransaction = '') AND ";

	private static final String
		_FINDER_COLUMN_GETMIICBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_2 =
			"miicApplication.expiredLicenseAppNumber = ?";

	private static final String
		_FINDER_COLUMN_GETMIICBYAT_APPNO_EXPIREDLICENSEAPPNUMBER_3 =
			"(miicApplication.expiredLicenseAppNumber IS NULL OR miicApplication.expiredLicenseAppNumber = '')";

	public MiicApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(MiicApplication.class);

		setModelImplClass(MiicApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(MiicApplicationTable.INSTANCE);
	}

	/**
	 * Caches the miic application in the entity cache if it is enabled.
	 *
	 * @param miicApplication the miic application
	 */
	@Override
	public void cacheResult(MiicApplication miicApplication) {
		entityCache.putResult(
			MiicApplicationImpl.class, miicApplication.getPrimaryKey(),
			miicApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				miicApplication.getUuid(), miicApplication.getGroupId()
			},
			miicApplication);

		finderCache.putResult(
			_finderPathFetchBygetMIICById,
			new Object[] {miicApplication.getMiicApplicationId()},
			miicApplication);

		finderCache.putResult(
			_finderPathFetchBygetMIICByCaseId,
			new Object[] {miicApplication.getCaseId()}, miicApplication);

		finderCache.putResult(
			_finderPathFetchBygetMIICByEI_CI,
			new Object[] {
				miicApplication.getEntityId(), miicApplication.getCaseId()
			},
			miicApplication);

		finderCache.putResult(
			_finderPathFetchBygetMIICByAppNo,
			new Object[] {miicApplication.getApplicationNumber()},
			miicApplication);

		finderCache.putResult(
			_finderPathFetchBygetMIICByAT_AppNo,
			new Object[] {
				miicApplication.getTypeOfTransaction(),
				miicApplication.getExpiredLicenseAppNumber()
			},
			miicApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the miic applications in the entity cache if it is enabled.
	 *
	 * @param miicApplications the miic applications
	 */
	@Override
	public void cacheResult(List<MiicApplication> miicApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (miicApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (MiicApplication miicApplication : miicApplications) {
			if (entityCache.getResult(
					MiicApplicationImpl.class,
					miicApplication.getPrimaryKey()) == null) {

				cacheResult(miicApplication);
			}
		}
	}

	/**
	 * Clears the cache for all miic applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(MiicApplicationImpl.class);

		finderCache.clearCache(MiicApplicationImpl.class);
	}

	/**
	 * Clears the cache for the miic application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(MiicApplication miicApplication) {
		entityCache.removeResult(MiicApplicationImpl.class, miicApplication);
	}

	@Override
	public void clearCache(List<MiicApplication> miicApplications) {
		for (MiicApplication miicApplication : miicApplications) {
			entityCache.removeResult(
				MiicApplicationImpl.class, miicApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(MiicApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(MiicApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		MiicApplicationModelImpl miicApplicationModelImpl) {

		Object[] args = new Object[] {
			miicApplicationModelImpl.getUuid(),
			miicApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, miicApplicationModelImpl);

		args = new Object[] {miicApplicationModelImpl.getMiicApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetMIICById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIICById, args, miicApplicationModelImpl);

		args = new Object[] {miicApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetMIICByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIICByCaseId, args, miicApplicationModelImpl);

		args = new Object[] {
			miicApplicationModelImpl.getEntityId(),
			miicApplicationModelImpl.getCaseId()
		};

		finderCache.putResult(
			_finderPathCountBygetMIICByEI_CI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIICByEI_CI, args, miicApplicationModelImpl);

		args = new Object[] {miicApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetMIICByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIICByAppNo, args, miicApplicationModelImpl);

		args = new Object[] {
			miicApplicationModelImpl.getTypeOfTransaction(),
			miicApplicationModelImpl.getExpiredLicenseAppNumber()
		};

		finderCache.putResult(
			_finderPathCountBygetMIICByAT_AppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetMIICByAT_AppNo, args,
			miicApplicationModelImpl);
	}

	/**
	 * Creates a new miic application with the primary key. Does not add the miic application to the database.
	 *
	 * @param miicApplicationId the primary key for the new miic application
	 * @return the new miic application
	 */
	@Override
	public MiicApplication create(long miicApplicationId) {
		MiicApplication miicApplication = new MiicApplicationImpl();

		miicApplication.setNew(true);
		miicApplication.setPrimaryKey(miicApplicationId);

		String uuid = PortalUUIDUtil.generate();

		miicApplication.setUuid(uuid);

		miicApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return miicApplication;
	}

	/**
	 * Removes the miic application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application that was removed
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication remove(long miicApplicationId)
		throws NoSuchMiicApplicationException {

		return remove((Serializable)miicApplicationId);
	}

	/**
	 * Removes the miic application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the miic application
	 * @return the miic application that was removed
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication remove(Serializable primaryKey)
		throws NoSuchMiicApplicationException {

		Session session = null;

		try {
			session = openSession();

			MiicApplication miicApplication = (MiicApplication)session.get(
				MiicApplicationImpl.class, primaryKey);

			if (miicApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchMiicApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(miicApplication);
		}
		catch (NoSuchMiicApplicationException noSuchEntityException) {
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
	protected MiicApplication removeImpl(MiicApplication miicApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(miicApplication)) {
				miicApplication = (MiicApplication)session.get(
					MiicApplicationImpl.class,
					miicApplication.getPrimaryKeyObj());
			}

			if (miicApplication != null) {
				session.delete(miicApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (miicApplication != null) {
			clearCache(miicApplication);
		}

		return miicApplication;
	}

	@Override
	public MiicApplication updateImpl(MiicApplication miicApplication) {
		boolean isNew = miicApplication.isNew();

		if (!(miicApplication instanceof MiicApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(miicApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					miicApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in miicApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom MiicApplication implementation " +
					miicApplication.getClass());
		}

		MiicApplicationModelImpl miicApplicationModelImpl =
			(MiicApplicationModelImpl)miicApplication;

		if (Validator.isNull(miicApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			miicApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (miicApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				miicApplication.setCreateDate(date);
			}
			else {
				miicApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!miicApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				miicApplication.setModifiedDate(date);
			}
			else {
				miicApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(miicApplication);
			}
			else {
				miicApplication = (MiicApplication)session.merge(
					miicApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			MiicApplicationImpl.class, miicApplicationModelImpl, false, true);

		cacheUniqueFindersCache(miicApplicationModelImpl);

		if (isNew) {
			miicApplication.setNew(false);
		}

		miicApplication.resetOriginalValues();

		return miicApplication;
	}

	/**
	 * Returns the miic application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the miic application
	 * @return the miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchMiicApplicationException {

		MiicApplication miicApplication = fetchByPrimaryKey(primaryKey);

		if (miicApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchMiicApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return miicApplication;
	}

	/**
	 * Returns the miic application with the primary key or throws a <code>NoSuchMiicApplicationException</code> if it could not be found.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application
	 * @throws NoSuchMiicApplicationException if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication findByPrimaryKey(long miicApplicationId)
		throws NoSuchMiicApplicationException {

		return findByPrimaryKey((Serializable)miicApplicationId);
	}

	/**
	 * Returns the miic application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param miicApplicationId the primary key of the miic application
	 * @return the miic application, or <code>null</code> if a miic application with the primary key could not be found
	 */
	@Override
	public MiicApplication fetchByPrimaryKey(long miicApplicationId) {
		return fetchByPrimaryKey((Serializable)miicApplicationId);
	}

	/**
	 * Returns all the miic applications.
	 *
	 * @return the miic applications
	 */
	@Override
	public List<MiicApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @return the range of miic applications
	 */
	@Override
	public List<MiicApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of miic applications
	 */
	@Override
	public List<MiicApplication> findAll(
		int start, int end,
		OrderByComparator<MiicApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the miic applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>MiicApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of miic applications
	 * @param end the upper bound of the range of miic applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of miic applications
	 */
	@Override
	public List<MiicApplication> findAll(
		int start, int end,
		OrderByComparator<MiicApplication> orderByComparator,
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

		List<MiicApplication> list = null;

		if (useFinderCache) {
			list = (List<MiicApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_MIICAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_MIICAPPLICATION;

				sql = sql.concat(MiicApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<MiicApplication>)QueryUtil.list(
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
	 * Removes all the miic applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (MiicApplication miicApplication : findAll()) {
			remove(miicApplication);
		}
	}

	/**
	 * Returns the number of miic applications.
	 *
	 * @return the number of miic applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_MIICAPPLICATION);

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
		return "miicApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_MIICAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return MiicApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the miic application persistence.
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

		_finderPathFetchBygetMIICById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIICById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, true);

		_finderPathCountBygetMIICById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIICById",
			new String[] {Long.class.getName()},
			new String[] {"miicApplicationId"}, false);

		_finderPathWithPaginationFindBygetMIICByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMIICByS_U",
			new String[] {
				Integer.class.getName(), Long.class.getName(),
				Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			},
			new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetMIICByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMIICByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, true);

		_finderPathCountBygetMIICByS_U = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIICByS_U",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetMIICByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIICByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetMIICByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIICByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetMIICByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMIICByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetMIICByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetMIICByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetMIICByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIICByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathWithPaginationFindBygetMIICByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetMIICByEntityId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"entityId"}, true);

		_finderPathWithoutPaginationFindBygetMIICByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findBygetMIICByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, true);

		_finderPathCountBygetMIICByEntityId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIICByEntityId", new String[] {String.class.getName()},
			new String[] {"entityId"}, false);

		_finderPathWithPaginationFindBygetMIICByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetMIICByEntityId_Status",
				new String[] {
					String.class.getName(), Integer.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"entityId", "status"}, true);

		_finderPathWithoutPaginationFindBygetMIICByEntityId_Status =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetMIICByEntityId_Status",
				new String[] {String.class.getName(), Integer.class.getName()},
				new String[] {"entityId", "status"}, true);

		_finderPathCountBygetMIICByEntityId_Status = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIICByEntityId_Status",
			new String[] {String.class.getName(), Integer.class.getName()},
			new String[] {"entityId", "status"}, false);

		_finderPathFetchBygetMIICByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIICByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, true);

		_finderPathCountBygetMIICByEI_CI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIICByEI_CI",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"entityId", "caseId"}, false);

		_finderPathFetchBygetMIICByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIICByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetMIICByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetMIICByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		_finderPathFetchBygetMIICByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetMIICByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			true);

		_finderPathCountBygetMIICByAT_AppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetMIICByAT_AppNo",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"typeOfTransaction", "expiredLicenseAppNumber"},
			false);

		MiicApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		MiicApplicationUtil.setPersistence(null);

		entityCache.removeCache(MiicApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = MIIC_SERVICESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_MIICAPPLICATION =
		"SELECT miicApplication FROM MiicApplication miicApplication";

	private static final String _SQL_SELECT_MIICAPPLICATION_WHERE =
		"SELECT miicApplication FROM MiicApplication miicApplication WHERE ";

	private static final String _SQL_COUNT_MIICAPPLICATION =
		"SELECT COUNT(miicApplication) FROM MiicApplication miicApplication";

	private static final String _SQL_COUNT_MIICAPPLICATION_WHERE =
		"SELECT COUNT(miicApplication) FROM MiicApplication miicApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "miicApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No MiicApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No MiicApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		MiicApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.application.form.service.service.persistence.impl;

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

import com.nbp.film.application.form.service.exception.NoSuchFilmApplicationException;
import com.nbp.film.application.form.service.model.FilmApplication;
import com.nbp.film.application.form.service.model.FilmApplicationTable;
import com.nbp.film.application.form.service.model.impl.FilmApplicationImpl;
import com.nbp.film.application.form.service.model.impl.FilmApplicationModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationUtil;
import com.nbp.film.application.form.service.service.persistence.impl.constants.FILMPersistenceConstants;

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
 * The persistence implementation for the film application service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmApplicationPersistence.class)
public class FilmApplicationPersistenceImpl
	extends BasePersistenceImpl<FilmApplication>
	implements FilmApplicationPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmApplicationUtil</code> to access the film application persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmApplicationImpl.class.getName();

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
	 * Returns all the film applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid(String uuid) {
		return findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid(String uuid, int start, int end) {
		return findByUuid(uuid, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return findByUuid(uuid, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
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

		List<FilmApplication> list = null;

		if (useFinderCache) {
			list = (List<FilmApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmApplication filmApplication : list) {
					if (!uuid.equals(filmApplication.getUuid())) {
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

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

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
				sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FilmApplication>)QueryUtil.list(
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
	 * Returns the first film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findByUuid_First(
			String uuid, OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchByUuid_First(
			uuid, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the first film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchByUuid_First(
		String uuid, OrderByComparator<FilmApplication> orderByComparator) {

		List<FilmApplication> list = findByUuid(uuid, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findByUuid_Last(
			String uuid, OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchByUuid_Last(
			uuid, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchByUuid_Last(
		String uuid, OrderByComparator<FilmApplication> orderByComparator) {

		int count = countByUuid(uuid);

		if (count == 0) {
			return null;
		}

		List<FilmApplication> list = findByUuid(
			uuid, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where uuid = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication[] findByUuid_PrevAndNext(
			long filmApplicationId, String uuid,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		uuid = Objects.toString(uuid, "");

		FilmApplication filmApplication = findByPrimaryKey(filmApplicationId);

		Session session = null;

		try {
			session = openSession();

			FilmApplication[] array = new FilmApplicationImpl[3];

			array[0] = getByUuid_PrevAndNext(
				session, filmApplication, uuid, orderByComparator, true);

			array[1] = filmApplication;

			array[2] = getByUuid_PrevAndNext(
				session, filmApplication, uuid, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FilmApplication getByUuid_PrevAndNext(
		Session session, FilmApplication filmApplication, String uuid,
		OrderByComparator<FilmApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

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
			sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
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
						filmApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film applications where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	@Override
	public void removeByUuid(String uuid) {
		for (FilmApplication filmApplication :
				findByUuid(uuid, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(filmApplication);
		}
	}

	/**
	 * Returns the number of film applications where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching film applications
	 */
	@Override
	public int countByUuid(String uuid) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid;

		Object[] finderArgs = new Object[] {uuid};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

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
		"filmApplication.uuid = ?";

	private static final String _FINDER_COLUMN_UUID_UUID_3 =
		"(filmApplication.uuid IS NULL OR filmApplication.uuid = '')";

	private FinderPath _finderPathFetchByUUID_G;
	private FinderPath _finderPathCountByUUID_G;

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findByUUID_G(String uuid, long groupId)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchByUUID_G(uuid, groupId);

		if (filmApplication == null) {
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

			throw new NoSuchFilmApplicationException(sb.toString());
		}

		return filmApplication;
	}

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchByUUID_G(String uuid, long groupId) {
		return fetchByUUID_G(uuid, groupId, true);
	}

	/**
	 * Returns the film application where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchByUUID_G(
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

		if (result instanceof FilmApplication) {
			FilmApplication filmApplication = (FilmApplication)result;

			if (!Objects.equals(uuid, filmApplication.getUuid()) ||
				(groupId != filmApplication.getGroupId())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

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

				List<FilmApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchByUUID_G, finderArgs, list);
					}
				}
				else {
					FilmApplication filmApplication = list.get(0);

					result = filmApplication;

					cacheResult(filmApplication);
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
			return (FilmApplication)result;
		}
	}

	/**
	 * Removes the film application where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the film application that was removed
	 */
	@Override
	public FilmApplication removeByUUID_G(String uuid, long groupId)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = findByUUID_G(uuid, groupId);

		return remove(filmApplication);
	}

	/**
	 * Returns the number of film applications where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching film applications
	 */
	@Override
	public int countByUUID_G(String uuid, long groupId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUUID_G;

		Object[] finderArgs = new Object[] {uuid, groupId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

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
		"filmApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_G_UUID_3 =
		"(filmApplication.uuid IS NULL OR filmApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_G_GROUPID_2 =
		"filmApplication.groupId = ?";

	private FinderPath _finderPathWithPaginationFindByUuid_C;
	private FinderPath _finderPathWithoutPaginationFindByUuid_C;
	private FinderPath _finderPathCountByUuid_C;

	/**
	 * Returns all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid_C(String uuid, long companyId) {
		return findByUuid_C(
			uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return findByUuid_C(uuid, companyId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return findByUuid_C(
			uuid, companyId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
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

		List<FilmApplication> list = null;

		if (useFinderCache) {
			list = (List<FilmApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmApplication filmApplication : list) {
					if (!uuid.equals(filmApplication.getUuid()) ||
						(companyId != filmApplication.getCompanyId())) {

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

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

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
				sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
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

				list = (List<FilmApplication>)QueryUtil.list(
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
	 * Returns the first film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchByUuid_C_First(
			uuid, companyId, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the first film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<FilmApplication> orderByComparator) {

		List<FilmApplication> list = findByUuid_C(
			uuid, companyId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("uuid=");
		sb.append(uuid);

		sb.append(", companyId=");
		sb.append(companyId);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the last film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<FilmApplication> orderByComparator) {

		int count = countByUuid_C(uuid, companyId);

		if (count == 0) {
			return null;
		}

		List<FilmApplication> list = findByUuid_C(
			uuid, companyId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication[] findByUuid_C_PrevAndNext(
			long filmApplicationId, String uuid, long companyId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		uuid = Objects.toString(uuid, "");

		FilmApplication filmApplication = findByPrimaryKey(filmApplicationId);

		Session session = null;

		try {
			session = openSession();

			FilmApplication[] array = new FilmApplicationImpl[3];

			array[0] = getByUuid_C_PrevAndNext(
				session, filmApplication, uuid, companyId, orderByComparator,
				true);

			array[1] = filmApplication;

			array[2] = getByUuid_C_PrevAndNext(
				session, filmApplication, uuid, companyId, orderByComparator,
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

	protected FilmApplication getByUuid_C_PrevAndNext(
		Session session, FilmApplication filmApplication, String uuid,
		long companyId, OrderByComparator<FilmApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

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
			sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
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
						filmApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film applications where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	@Override
	public void removeByUuid_C(String uuid, long companyId) {
		for (FilmApplication filmApplication :
				findByUuid_C(
					uuid, companyId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(filmApplication);
		}
	}

	/**
	 * Returns the number of film applications where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching film applications
	 */
	@Override
	public int countByUuid_C(String uuid, long companyId) {
		uuid = Objects.toString(uuid, "");

		FinderPath finderPath = _finderPathCountByUuid_C;

		Object[] finderArgs = new Object[] {uuid, companyId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

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
		"filmApplication.uuid = ? AND ";

	private static final String _FINDER_COLUMN_UUID_C_UUID_3 =
		"(filmApplication.uuid IS NULL OR filmApplication.uuid = '') AND ";

	private static final String _FINDER_COLUMN_UUID_C_COMPANYID_2 =
		"filmApplication.companyId = ?";

	private FinderPath _finderPathFetchBygetFilmById;
	private FinderPath _finderPathCountBygetFilmById;

	/**
	 * Returns the film application where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchBygetFilmById(filmApplicationId);

		if (filmApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationException(sb.toString());
		}

		return filmApplication;
	}

	/**
	 * Returns the film application where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmById(long filmApplicationId) {
		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film application where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmById(
		long filmApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {filmApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmById, finderArgs, this);
		}

		if (result instanceof FilmApplication) {
			FilmApplication filmApplication = (FilmApplication)result;

			if (filmApplicationId != filmApplication.getFilmApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {filmApplicationId};
							}

							_log.warn(
								"FilmApplicationPersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplication filmApplication = list.get(0);

					result = filmApplication;

					cacheResult(filmApplication);
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
			return (FilmApplication)result;
		}
	}

	/**
	 * Removes the film application where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application that was removed
	 */
	@Override
	public FilmApplication removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = findBygetFilmById(filmApplicationId);

		return remove(filmApplication);
	}

	/**
	 * Returns the number of film applications where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film applications
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

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

	private static final String _FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2 =
		"filmApplication.filmApplicationId = ?";

	private FinderPath
		_finderPathWithPaginationFindBygetFilmApplicationByStatusUser;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFilmApplicationByStatusUser;
	private FinderPath _finderPathCountBygetFilmApplicationByStatusUser;

	/**
	 * Returns all the film applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId) {

		return findBygetFilmApplicationByStatusUser(
			status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end) {

		return findBygetFilmApplicationByStatusUser(
			status, userId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return findBygetFilmApplicationByStatusUser(
			status, userId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63; and userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmApplicationByStatusUser(
		int status, long userId, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFilmApplicationByStatusUser;
				finderArgs = new Object[] {status, userId};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFilmApplicationByStatusUser;
			finderArgs = new Object[] {
				status, userId, start, end, orderByComparator
			};
		}

		List<FilmApplication> list = null;

		if (useFinderCache) {
			list = (List<FilmApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmApplication filmApplication : list) {
					if ((status != filmApplication.getStatus()) ||
						(userId != filmApplication.getUserId())) {

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

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_USERID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				queryPos.add(userId);

				list = (List<FilmApplication>)QueryUtil.list(
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
	 * Returns the first film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findBygetFilmApplicationByStatusUser_First(
			int status, long userId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication =
			fetchBygetFilmApplicationByStatusUser_First(
				status, userId, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the first film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmApplicationByStatusUser_First(
		int status, long userId,
		OrderByComparator<FilmApplication> orderByComparator) {

		List<FilmApplication> list = findBygetFilmApplicationByStatusUser(
			status, userId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findBygetFilmApplicationByStatusUser_Last(
			int status, long userId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication =
			fetchBygetFilmApplicationByStatusUser_Last(
				status, userId, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append(", userId=");
		sb.append(userId);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmApplicationByStatusUser_Last(
		int status, long userId,
		OrderByComparator<FilmApplication> orderByComparator) {

		int count = countBygetFilmApplicationByStatusUser(status, userId);

		if (count == 0) {
			return null;
		}

		List<FilmApplication> list = findBygetFilmApplicationByStatusUser(
			status, userId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where status = &#63; and userId = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param status the status
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication[] findBygetFilmApplicationByStatusUser_PrevAndNext(
			long filmApplicationId, int status, long userId,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = findByPrimaryKey(filmApplicationId);

		Session session = null;

		try {
			session = openSession();

			FilmApplication[] array = new FilmApplicationImpl[3];

			array[0] = getBygetFilmApplicationByStatusUser_PrevAndNext(
				session, filmApplication, status, userId, orderByComparator,
				true);

			array[1] = filmApplication;

			array[2] = getBygetFilmApplicationByStatusUser_PrevAndNext(
				session, filmApplication, status, userId, orderByComparator,
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

	protected FilmApplication getBygetFilmApplicationByStatusUser_PrevAndNext(
		Session session, FilmApplication filmApplication, int status,
		long userId, OrderByComparator<FilmApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_STATUS_2);

		sb.append(_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_USERID_2);

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
			sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
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
						filmApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film applications where status = &#63; and userId = &#63; from the database.
	 *
	 * @param status the status
	 * @param userId the user ID
	 */
	@Override
	public void removeBygetFilmApplicationByStatusUser(
		int status, long userId) {

		for (FilmApplication filmApplication :
				findBygetFilmApplicationByStatusUser(
					status, userId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(filmApplication);
		}
	}

	/**
	 * Returns the number of film applications where status = &#63; and userId = &#63;.
	 *
	 * @param status the status
	 * @param userId the user ID
	 * @return the number of matching film applications
	 */
	@Override
	public int countBygetFilmApplicationByStatusUser(int status, long userId) {
		FinderPath finderPath =
			_finderPathCountBygetFilmApplicationByStatusUser;

		Object[] finderArgs = new Object[] {status, userId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_STATUS_2);

			sb.append(_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_USERID_2);

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
		_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_STATUS_2 =
			"filmApplication.status = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFILMAPPLICATIONBYSTATUSUSER_USERID_2 =
			"filmApplication.userId = ?";

	private FinderPath _finderPathFetchBygetFilmByCaseId;
	private FinderPath _finderPathCountBygetFilmByCaseId;

	/**
	 * Returns the film application where caseId = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findBygetFilmByCaseId(String caseId)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchBygetFilmByCaseId(caseId);

		if (filmApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationException(sb.toString());
		}

		return filmApplication;
	}

	/**
	 * Returns the film application where caseId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmByCaseId(String caseId) {
		return fetchBygetFilmByCaseId(caseId, true);
	}

	/**
	 * Returns the film application where caseId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmByCaseId(
		String caseId, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmByCaseId, finderArgs, this);
		}

		if (result instanceof FilmApplication) {
			FilmApplication filmApplication = (FilmApplication)result;

			if (!Objects.equals(caseId, filmApplication.getCaseId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFILMBYCASEID_CASEID_2);
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

				List<FilmApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmByCaseId, finderArgs,
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
								"FilmApplicationPersistenceImpl.fetchBygetFilmByCaseId(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplication filmApplication = list.get(0);

					result = filmApplication;

					cacheResult(filmApplication);
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
			return (FilmApplication)result;
		}
	}

	/**
	 * Removes the film application where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @return the film application that was removed
	 */
	@Override
	public FilmApplication removeBygetFilmByCaseId(String caseId)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = findBygetFilmByCaseId(caseId);

		return remove(filmApplication);
	}

	/**
	 * Returns the number of film applications where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film applications
	 */
	@Override
	public int countBygetFilmByCaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetFilmByCaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMBYCASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFILMBYCASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETFILMBYCASEID_CASEID_2 =
		"filmApplication.caseId = ?";

	private static final String _FINDER_COLUMN_GETFILMBYCASEID_CASEID_3 =
		"(filmApplication.caseId IS NULL OR filmApplication.caseId = '')";

	private FinderPath _finderPathWithPaginationFindBygetFilmByStatus;
	private FinderPath _finderPathWithoutPaginationFindBygetFilmByStatus;
	private FinderPath _finderPathCountBygetFilmByStatus;

	/**
	 * Returns all the film applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmByStatus(int status) {
		return findBygetFilmByStatus(
			status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end) {

		return findBygetFilmByStatus(status, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return findBygetFilmByStatus(
			status, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film applications where status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param status the status
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film applications
	 */
	@Override
	public List<FilmApplication> findBygetFilmByStatus(
		int status, int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFilmByStatus;
				finderArgs = new Object[] {status};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFilmByStatus;
			finderArgs = new Object[] {status, start, end, orderByComparator};
		}

		List<FilmApplication> list = null;

		if (useFinderCache) {
			list = (List<FilmApplication>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmApplication filmApplication : list) {
					if (status != filmApplication.getStatus()) {
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

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYSTATUS_STATUS_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(status);

				list = (List<FilmApplication>)QueryUtil.list(
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
	 * Returns the first film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findBygetFilmByStatus_First(
			int status, OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchBygetFilmByStatus_First(
			status, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the first film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmByStatus_First(
		int status, OrderByComparator<FilmApplication> orderByComparator) {

		List<FilmApplication> list = findBygetFilmByStatus(
			status, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findBygetFilmByStatus_Last(
			int status, OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchBygetFilmByStatus_Last(
			status, orderByComparator);

		if (filmApplication != null) {
			return filmApplication;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("status=");
		sb.append(status);

		sb.append("}");

		throw new NoSuchFilmApplicationException(sb.toString());
	}

	/**
	 * Returns the last film application in the ordered set where status = &#63;.
	 *
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmByStatus_Last(
		int status, OrderByComparator<FilmApplication> orderByComparator) {

		int count = countBygetFilmByStatus(status);

		if (count == 0) {
			return null;
		}

		List<FilmApplication> list = findBygetFilmByStatus(
			status, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film applications before and after the current film application in the ordered set where status = &#63;.
	 *
	 * @param filmApplicationId the primary key of the current film application
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication[] findBygetFilmByStatus_PrevAndNext(
			long filmApplicationId, int status,
			OrderByComparator<FilmApplication> orderByComparator)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = findByPrimaryKey(filmApplicationId);

		Session session = null;

		try {
			session = openSession();

			FilmApplication[] array = new FilmApplicationImpl[3];

			array[0] = getBygetFilmByStatus_PrevAndNext(
				session, filmApplication, status, orderByComparator, true);

			array[1] = filmApplication;

			array[2] = getBygetFilmByStatus_PrevAndNext(
				session, filmApplication, status, orderByComparator, false);

			return array;
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}
	}

	protected FilmApplication getBygetFilmByStatus_PrevAndNext(
		Session session, FilmApplication filmApplication, int status,
		OrderByComparator<FilmApplication> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

		sb.append(_FINDER_COLUMN_GETFILMBYSTATUS_STATUS_2);

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
			sb.append(FilmApplicationModelImpl.ORDER_BY_JPQL);
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
						filmApplication)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmApplication> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film applications where status = &#63; from the database.
	 *
	 * @param status the status
	 */
	@Override
	public void removeBygetFilmByStatus(int status) {
		for (FilmApplication filmApplication :
				findBygetFilmByStatus(
					status, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(filmApplication);
		}
	}

	/**
	 * Returns the number of film applications where status = &#63;.
	 *
	 * @param status the status
	 * @return the number of matching film applications
	 */
	@Override
	public int countBygetFilmByStatus(int status) {
		FinderPath finderPath = _finderPathCountBygetFilmByStatus;

		Object[] finderArgs = new Object[] {status};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYSTATUS_STATUS_2);

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

	private static final String _FINDER_COLUMN_GETFILMBYSTATUS_STATUS_2 =
		"filmApplication.status = ?";

	private FinderPath _finderPathFetchBygetFilmByAppNo;
	private FinderPath _finderPathCountBygetFilmByAppNo;

	/**
	 * Returns the film application where applicationNumber = &#63; or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param applicationNumber the application number
	 * @return the matching film application
	 * @throws NoSuchFilmApplicationException if a matching film application could not be found
	 */
	@Override
	public FilmApplication findBygetFilmByAppNo(String applicationNumber)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchBygetFilmByAppNo(
			applicationNumber);

		if (filmApplication == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("applicationNumber=");
			sb.append(applicationNumber);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationException(sb.toString());
		}

		return filmApplication;
	}

	/**
	 * Returns the film application where applicationNumber = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmByAppNo(String applicationNumber) {
		return fetchBygetFilmByAppNo(applicationNumber, true);
	}

	/**
	 * Returns the film application where applicationNumber = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param applicationNumber the application number
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application, or <code>null</code> if a matching film application could not be found
	 */
	@Override
	public FilmApplication fetchBygetFilmByAppNo(
		String applicationNumber, boolean useFinderCache) {

		applicationNumber = Objects.toString(applicationNumber, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {applicationNumber};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilmByAppNo, finderArgs, this);
		}

		if (result instanceof FilmApplication) {
			FilmApplication filmApplication = (FilmApplication)result;

			if (!Objects.equals(
					applicationNumber,
					filmApplication.getApplicationNumber())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETFILMBYAPPNO_APPLICATIONNUMBER_2);
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

				List<FilmApplication> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilmByAppNo, finderArgs, list);
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
								"FilmApplicationPersistenceImpl.fetchBygetFilmByAppNo(String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplication filmApplication = list.get(0);

					result = filmApplication;

					cacheResult(filmApplication);
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
			return (FilmApplication)result;
		}
	}

	/**
	 * Removes the film application where applicationNumber = &#63; from the database.
	 *
	 * @param applicationNumber the application number
	 * @return the film application that was removed
	 */
	@Override
	public FilmApplication removeBygetFilmByAppNo(String applicationNumber)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = findBygetFilmByAppNo(
			applicationNumber);

		return remove(filmApplication);
	}

	/**
	 * Returns the number of film applications where applicationNumber = &#63;.
	 *
	 * @param applicationNumber the application number
	 * @return the number of matching film applications
	 */
	@Override
	public int countBygetFilmByAppNo(String applicationNumber) {
		applicationNumber = Objects.toString(applicationNumber, "");

		FinderPath finderPath = _finderPathCountBygetFilmByAppNo;

		Object[] finderArgs = new Object[] {applicationNumber};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATION_WHERE);

			boolean bindApplicationNumber = false;

			if (applicationNumber.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFILMBYAPPNO_APPLICATIONNUMBER_3);
			}
			else {
				bindApplicationNumber = true;

				sb.append(_FINDER_COLUMN_GETFILMBYAPPNO_APPLICATIONNUMBER_2);
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
		_FINDER_COLUMN_GETFILMBYAPPNO_APPLICATIONNUMBER_2 =
			"filmApplication.applicationNumber = ?";

	private static final String
		_FINDER_COLUMN_GETFILMBYAPPNO_APPLICATIONNUMBER_3 =
			"(filmApplication.applicationNumber IS NULL OR filmApplication.applicationNumber = '')";

	public FilmApplicationPersistenceImpl() {
		Map<String, String> dbColumnNames = new HashMap<String, String>();

		dbColumnNames.put("uuid", "uuid_");

		setDBColumnNames(dbColumnNames);

		setModelClass(FilmApplication.class);

		setModelImplClass(FilmApplicationImpl.class);
		setModelPKClass(long.class);

		setTable(FilmApplicationTable.INSTANCE);
	}

	/**
	 * Caches the film application in the entity cache if it is enabled.
	 *
	 * @param filmApplication the film application
	 */
	@Override
	public void cacheResult(FilmApplication filmApplication) {
		entityCache.putResult(
			FilmApplicationImpl.class, filmApplication.getPrimaryKey(),
			filmApplication);

		finderCache.putResult(
			_finderPathFetchByUUID_G,
			new Object[] {
				filmApplication.getUuid(), filmApplication.getGroupId()
			},
			filmApplication);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmApplication.getFilmApplicationId()},
			filmApplication);

		finderCache.putResult(
			_finderPathFetchBygetFilmByCaseId,
			new Object[] {filmApplication.getCaseId()}, filmApplication);

		finderCache.putResult(
			_finderPathFetchBygetFilmByAppNo,
			new Object[] {filmApplication.getApplicationNumber()},
			filmApplication);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film applications in the entity cache if it is enabled.
	 *
	 * @param filmApplications the film applications
	 */
	@Override
	public void cacheResult(List<FilmApplication> filmApplications) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmApplications.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmApplication filmApplication : filmApplications) {
			if (entityCache.getResult(
					FilmApplicationImpl.class,
					filmApplication.getPrimaryKey()) == null) {

				cacheResult(filmApplication);
			}
		}
	}

	/**
	 * Clears the cache for all film applications.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmApplicationImpl.class);

		finderCache.clearCache(FilmApplicationImpl.class);
	}

	/**
	 * Clears the cache for the film application.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmApplication filmApplication) {
		entityCache.removeResult(FilmApplicationImpl.class, filmApplication);
	}

	@Override
	public void clearCache(List<FilmApplication> filmApplications) {
		for (FilmApplication filmApplication : filmApplications) {
			entityCache.removeResult(
				FilmApplicationImpl.class, filmApplication);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmApplicationImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FilmApplicationImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmApplicationModelImpl filmApplicationModelImpl) {

		Object[] args = new Object[] {
			filmApplicationModelImpl.getUuid(),
			filmApplicationModelImpl.getGroupId()
		};

		finderCache.putResult(_finderPathCountByUUID_G, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchByUUID_G, args, filmApplicationModelImpl);

		args = new Object[] {filmApplicationModelImpl.getFilmApplicationId()};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args, filmApplicationModelImpl);

		args = new Object[] {filmApplicationModelImpl.getCaseId()};

		finderCache.putResult(
			_finderPathCountBygetFilmByCaseId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmByCaseId, args, filmApplicationModelImpl);

		args = new Object[] {filmApplicationModelImpl.getApplicationNumber()};

		finderCache.putResult(
			_finderPathCountBygetFilmByAppNo, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmByAppNo, args, filmApplicationModelImpl);
	}

	/**
	 * Creates a new film application with the primary key. Does not add the film application to the database.
	 *
	 * @param filmApplicationId the primary key for the new film application
	 * @return the new film application
	 */
	@Override
	public FilmApplication create(long filmApplicationId) {
		FilmApplication filmApplication = new FilmApplicationImpl();

		filmApplication.setNew(true);
		filmApplication.setPrimaryKey(filmApplicationId);

		String uuid = PortalUUIDUtil.generate();

		filmApplication.setUuid(uuid);

		filmApplication.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmApplication;
	}

	/**
	 * Removes the film application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application that was removed
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication remove(long filmApplicationId)
		throws NoSuchFilmApplicationException {

		return remove((Serializable)filmApplicationId);
	}

	/**
	 * Removes the film application with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film application
	 * @return the film application that was removed
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication remove(Serializable primaryKey)
		throws NoSuchFilmApplicationException {

		Session session = null;

		try {
			session = openSession();

			FilmApplication filmApplication = (FilmApplication)session.get(
				FilmApplicationImpl.class, primaryKey);

			if (filmApplication == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmApplicationException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmApplication);
		}
		catch (NoSuchFilmApplicationException noSuchEntityException) {
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
	protected FilmApplication removeImpl(FilmApplication filmApplication) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmApplication)) {
				filmApplication = (FilmApplication)session.get(
					FilmApplicationImpl.class,
					filmApplication.getPrimaryKeyObj());
			}

			if (filmApplication != null) {
				session.delete(filmApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmApplication != null) {
			clearCache(filmApplication);
		}

		return filmApplication;
	}

	@Override
	public FilmApplication updateImpl(FilmApplication filmApplication) {
		boolean isNew = filmApplication.isNew();

		if (!(filmApplication instanceof FilmApplicationModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmApplication.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmApplication);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmApplication proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmApplication implementation " +
					filmApplication.getClass());
		}

		FilmApplicationModelImpl filmApplicationModelImpl =
			(FilmApplicationModelImpl)filmApplication;

		if (Validator.isNull(filmApplication.getUuid())) {
			String uuid = PortalUUIDUtil.generate();

			filmApplication.setUuid(uuid);
		}

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmApplication.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmApplication.setCreateDate(date);
			}
			else {
				filmApplication.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmApplicationModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmApplication.setModifiedDate(date);
			}
			else {
				filmApplication.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmApplication);
			}
			else {
				filmApplication = (FilmApplication)session.merge(
					filmApplication);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmApplicationImpl.class, filmApplicationModelImpl, false, true);

		cacheUniqueFindersCache(filmApplicationModelImpl);

		if (isNew) {
			filmApplication.setNew(false);
		}

		filmApplication.resetOriginalValues();

		return filmApplication;
	}

	/**
	 * Returns the film application with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film application
	 * @return the film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmApplicationException {

		FilmApplication filmApplication = fetchByPrimaryKey(primaryKey);

		if (filmApplication == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmApplicationException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmApplication;
	}

	/**
	 * Returns the film application with the primary key or throws a <code>NoSuchFilmApplicationException</code> if it could not be found.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application
	 * @throws NoSuchFilmApplicationException if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication findByPrimaryKey(long filmApplicationId)
		throws NoSuchFilmApplicationException {

		return findByPrimaryKey((Serializable)filmApplicationId);
	}

	/**
	 * Returns the film application with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationId the primary key of the film application
	 * @return the film application, or <code>null</code> if a film application with the primary key could not be found
	 */
	@Override
	public FilmApplication fetchByPrimaryKey(long filmApplicationId) {
		return fetchByPrimaryKey((Serializable)filmApplicationId);
	}

	/**
	 * Returns all the film applications.
	 *
	 * @return the film applications
	 */
	@Override
	public List<FilmApplication> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @return the range of film applications
	 */
	@Override
	public List<FilmApplication> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film applications
	 */
	@Override
	public List<FilmApplication> findAll(
		int start, int end,
		OrderByComparator<FilmApplication> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film applications.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film applications
	 * @param end the upper bound of the range of film applications (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film applications
	 */
	@Override
	public List<FilmApplication> findAll(
		int start, int end,
		OrderByComparator<FilmApplication> orderByComparator,
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

		List<FilmApplication> list = null;

		if (useFinderCache) {
			list = (List<FilmApplication>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMAPPLICATION);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMAPPLICATION;

				sql = sql.concat(FilmApplicationModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmApplication>)QueryUtil.list(
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
	 * Removes all the film applications from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmApplication filmApplication : findAll()) {
			remove(filmApplication);
		}
	}

	/**
	 * Returns the number of film applications.
	 *
	 * @return the number of film applications
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FILMAPPLICATION);

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
		return "filmApplicationId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMAPPLICATION;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmApplicationModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film application persistence.
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

		_finderPathFetchBygetFilmById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmById",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetFilmById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmById",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		_finderPathWithPaginationFindBygetFilmApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFilmApplicationByStatusUser",
				new String[] {
					Integer.class.getName(), Long.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"status", "userId"}, true);

		_finderPathWithoutPaginationFindBygetFilmApplicationByStatusUser =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFilmApplicationByStatusUser",
				new String[] {Integer.class.getName(), Long.class.getName()},
				new String[] {"status", "userId"}, true);

		_finderPathCountBygetFilmApplicationByStatusUser = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFilmApplicationByStatusUser",
			new String[] {Integer.class.getName(), Long.class.getName()},
			new String[] {"status", "userId"}, false);

		_finderPathFetchBygetFilmByCaseId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetFilmByCaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmByCaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		_finderPathWithPaginationFindBygetFilmByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFilmByStatus",
			new String[] {
				Integer.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"status"}, true);

		_finderPathWithoutPaginationFindBygetFilmByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFilmByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			true);

		_finderPathCountBygetFilmByStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmByStatus",
			new String[] {Integer.class.getName()}, new String[] {"status"},
			false);

		_finderPathFetchBygetFilmByAppNo = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, true);

		_finderPathCountBygetFilmByAppNo = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmByAppNo",
			new String[] {String.class.getName()},
			new String[] {"applicationNumber"}, false);

		FilmApplicationUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmApplicationUtil.setPersistence(null);

		entityCache.removeCache(FilmApplicationImpl.class.getName());
	}

	@Override
	@Reference(
		target = FILMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FILMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FILMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FILMAPPLICATION =
		"SELECT filmApplication FROM FilmApplication filmApplication";

	private static final String _SQL_SELECT_FILMAPPLICATION_WHERE =
		"SELECT filmApplication FROM FilmApplication filmApplication WHERE ";

	private static final String _SQL_COUNT_FILMAPPLICATION =
		"SELECT COUNT(filmApplication) FROM FilmApplication filmApplication";

	private static final String _SQL_COUNT_FILMAPPLICATION_WHERE =
		"SELECT COUNT(filmApplication) FROM FilmApplication filmApplication WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "filmApplication.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmApplication exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmApplication exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmApplicationPersistenceImpl.class);

	private static final Set<String> _badColumnNames = SetUtil.fromArray(
		new String[] {"uuid"});

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
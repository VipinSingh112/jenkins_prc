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
import com.liferay.portal.kernel.util.StringUtil;

import com.nbp.film.application.form.service.exception.NoSuchFilmEquipmentListException;
import com.nbp.film.application.form.service.model.FilmEquipmentList;
import com.nbp.film.application.form.service.model.FilmEquipmentListTable;
import com.nbp.film.application.form.service.model.impl.FilmEquipmentListImpl;
import com.nbp.film.application.form.service.model.impl.FilmEquipmentListModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmEquipmentListPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmEquipmentListUtil;
import com.nbp.film.application.form.service.service.persistence.impl.constants.FILMPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.sql.DataSource;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

/**
 * The persistence implementation for the film equipment list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmEquipmentListPersistence.class)
public class FilmEquipmentListPersistenceImpl
	extends BasePersistenceImpl<FilmEquipmentList>
	implements FilmEquipmentListPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmEquipmentListUtil</code> to access the film equipment list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmEquipmentListImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFilmById;
	private FinderPath _finderPathCountBygetFilmById;

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or throws a <code>NoSuchFilmEquipmentListException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	@Override
	public FilmEquipmentList findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmEquipmentListException {

		FilmEquipmentList filmEquipmentList = fetchBygetFilmById(
			filmApplicationId);

		if (filmEquipmentList == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmEquipmentListException(sb.toString());
		}

		return filmEquipmentList;
	}

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	@Override
	public FilmEquipmentList fetchBygetFilmById(long filmApplicationId) {
		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	@Override
	public FilmEquipmentList fetchBygetFilmById(
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

		if (result instanceof FilmEquipmentList) {
			FilmEquipmentList filmEquipmentList = (FilmEquipmentList)result;

			if (filmApplicationId != filmEquipmentList.getFilmApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMEQUIPMENTLIST_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmEquipmentList> list = query.list();

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
								"FilmEquipmentListPersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmEquipmentList filmEquipmentList = list.get(0);

					result = filmEquipmentList;

					cacheResult(filmEquipmentList);
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
			return (FilmEquipmentList)result;
		}
	}

	/**
	 * Removes the film equipment list where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film equipment list that was removed
	 */
	@Override
	public FilmEquipmentList removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmEquipmentListException {

		FilmEquipmentList filmEquipmentList = findBygetFilmById(
			filmApplicationId);

		return remove(filmEquipmentList);
	}

	/**
	 * Returns the number of film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film equipment lists
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMEQUIPMENTLIST_WHERE);

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
		"filmEquipmentList.filmApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFilmByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetFilmByAppId;
	private FinderPath _finderPathCountBygetFilmByAppId;

	/**
	 * Returns all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId) {

		return findBygetFilmByAppId(
			filmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @return the range of matching film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end) {

		return findBygetFilmByAppId(filmApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		return findBygetFilmByAppId(
			filmApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findBygetFilmByAppId(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFilmByAppId;
				finderArgs = new Object[] {filmApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFilmByAppId;
			finderArgs = new Object[] {
				filmApplicationId, start, end, orderByComparator
			};
		}

		List<FilmEquipmentList> list = null;

		if (useFinderCache) {
			list = (List<FilmEquipmentList>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmEquipmentList filmEquipmentList : list) {
					if (filmApplicationId !=
							filmEquipmentList.getFilmApplicationId()) {

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

			sb.append(_SQL_SELECT_FILMEQUIPMENTLIST_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYAPPID_FILMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmEquipmentListModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				list = (List<FilmEquipmentList>)QueryUtil.list(
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
	 * Returns the first film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	@Override
	public FilmEquipmentList findBygetFilmByAppId_First(
			long filmApplicationId,
			OrderByComparator<FilmEquipmentList> orderByComparator)
		throws NoSuchFilmEquipmentListException {

		FilmEquipmentList filmEquipmentList = fetchBygetFilmByAppId_First(
			filmApplicationId, orderByComparator);

		if (filmEquipmentList != null) {
			return filmEquipmentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmEquipmentListException(sb.toString());
	}

	/**
	 * Returns the first film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	@Override
	public FilmEquipmentList fetchBygetFilmByAppId_First(
		long filmApplicationId,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		List<FilmEquipmentList> list = findBygetFilmByAppId(
			filmApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film equipment list
	 * @throws NoSuchFilmEquipmentListException if a matching film equipment list could not be found
	 */
	@Override
	public FilmEquipmentList findBygetFilmByAppId_Last(
			long filmApplicationId,
			OrderByComparator<FilmEquipmentList> orderByComparator)
		throws NoSuchFilmEquipmentListException {

		FilmEquipmentList filmEquipmentList = fetchBygetFilmByAppId_Last(
			filmApplicationId, orderByComparator);

		if (filmEquipmentList != null) {
			return filmEquipmentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmEquipmentListException(sb.toString());
	}

	/**
	 * Returns the last film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film equipment list, or <code>null</code> if a matching film equipment list could not be found
	 */
	@Override
	public FilmEquipmentList fetchBygetFilmByAppId_Last(
		long filmApplicationId,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		int count = countBygetFilmByAppId(filmApplicationId);

		if (count == 0) {
			return null;
		}

		List<FilmEquipmentList> list = findBygetFilmByAppId(
			filmApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film equipment lists before and after the current film equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmEquipmentListId the primary key of the current film equipment list
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film equipment list
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	@Override
	public FilmEquipmentList[] findBygetFilmByAppId_PrevAndNext(
			long filmEquipmentListId, long filmApplicationId,
			OrderByComparator<FilmEquipmentList> orderByComparator)
		throws NoSuchFilmEquipmentListException {

		FilmEquipmentList filmEquipmentList = findByPrimaryKey(
			filmEquipmentListId);

		Session session = null;

		try {
			session = openSession();

			FilmEquipmentList[] array = new FilmEquipmentListImpl[3];

			array[0] = getBygetFilmByAppId_PrevAndNext(
				session, filmEquipmentList, filmApplicationId,
				orderByComparator, true);

			array[1] = filmEquipmentList;

			array[2] = getBygetFilmByAppId_PrevAndNext(
				session, filmEquipmentList, filmApplicationId,
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

	protected FilmEquipmentList getBygetFilmByAppId_PrevAndNext(
		Session session, FilmEquipmentList filmEquipmentList,
		long filmApplicationId,
		OrderByComparator<FilmEquipmentList> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMEQUIPMENTLIST_WHERE);

		sb.append(_FINDER_COLUMN_GETFILMBYAPPID_FILMAPPLICATIONID_2);

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
			sb.append(FilmEquipmentListModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		queryPos.add(filmApplicationId);

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						filmEquipmentList)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmEquipmentList> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film equipment lists where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	@Override
	public void removeBygetFilmByAppId(long filmApplicationId) {
		for (FilmEquipmentList filmEquipmentList :
				findBygetFilmByAppId(
					filmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(filmEquipmentList);
		}
	}

	/**
	 * Returns the number of film equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film equipment lists
	 */
	@Override
	public int countBygetFilmByAppId(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmByAppId;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMEQUIPMENTLIST_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYAPPID_FILMAPPLICATIONID_2);

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

	private static final String
		_FINDER_COLUMN_GETFILMBYAPPID_FILMAPPLICATIONID_2 =
			"filmEquipmentList.filmApplicationId = ?";

	public FilmEquipmentListPersistenceImpl() {
		setModelClass(FilmEquipmentList.class);

		setModelImplClass(FilmEquipmentListImpl.class);
		setModelPKClass(long.class);

		setTable(FilmEquipmentListTable.INSTANCE);
	}

	/**
	 * Caches the film equipment list in the entity cache if it is enabled.
	 *
	 * @param filmEquipmentList the film equipment list
	 */
	@Override
	public void cacheResult(FilmEquipmentList filmEquipmentList) {
		entityCache.putResult(
			FilmEquipmentListImpl.class, filmEquipmentList.getPrimaryKey(),
			filmEquipmentList);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmEquipmentList.getFilmApplicationId()},
			filmEquipmentList);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film equipment lists in the entity cache if it is enabled.
	 *
	 * @param filmEquipmentLists the film equipment lists
	 */
	@Override
	public void cacheResult(List<FilmEquipmentList> filmEquipmentLists) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmEquipmentLists.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmEquipmentList filmEquipmentList : filmEquipmentLists) {
			if (entityCache.getResult(
					FilmEquipmentListImpl.class,
					filmEquipmentList.getPrimaryKey()) == null) {

				cacheResult(filmEquipmentList);
			}
		}
	}

	/**
	 * Clears the cache for all film equipment lists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmEquipmentListImpl.class);

		finderCache.clearCache(FilmEquipmentListImpl.class);
	}

	/**
	 * Clears the cache for the film equipment list.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmEquipmentList filmEquipmentList) {
		entityCache.removeResult(
			FilmEquipmentListImpl.class, filmEquipmentList);
	}

	@Override
	public void clearCache(List<FilmEquipmentList> filmEquipmentLists) {
		for (FilmEquipmentList filmEquipmentList : filmEquipmentLists) {
			entityCache.removeResult(
				FilmEquipmentListImpl.class, filmEquipmentList);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmEquipmentListImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FilmEquipmentListImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmEquipmentListModelImpl filmEquipmentListModelImpl) {

		Object[] args = new Object[] {
			filmEquipmentListModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args, filmEquipmentListModelImpl);
	}

	/**
	 * Creates a new film equipment list with the primary key. Does not add the film equipment list to the database.
	 *
	 * @param filmEquipmentListId the primary key for the new film equipment list
	 * @return the new film equipment list
	 */
	@Override
	public FilmEquipmentList create(long filmEquipmentListId) {
		FilmEquipmentList filmEquipmentList = new FilmEquipmentListImpl();

		filmEquipmentList.setNew(true);
		filmEquipmentList.setPrimaryKey(filmEquipmentListId);

		filmEquipmentList.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmEquipmentList;
	}

	/**
	 * Removes the film equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list that was removed
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	@Override
	public FilmEquipmentList remove(long filmEquipmentListId)
		throws NoSuchFilmEquipmentListException {

		return remove((Serializable)filmEquipmentListId);
	}

	/**
	 * Removes the film equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film equipment list
	 * @return the film equipment list that was removed
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	@Override
	public FilmEquipmentList remove(Serializable primaryKey)
		throws NoSuchFilmEquipmentListException {

		Session session = null;

		try {
			session = openSession();

			FilmEquipmentList filmEquipmentList =
				(FilmEquipmentList)session.get(
					FilmEquipmentListImpl.class, primaryKey);

			if (filmEquipmentList == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmEquipmentListException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmEquipmentList);
		}
		catch (NoSuchFilmEquipmentListException noSuchEntityException) {
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
	protected FilmEquipmentList removeImpl(
		FilmEquipmentList filmEquipmentList) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmEquipmentList)) {
				filmEquipmentList = (FilmEquipmentList)session.get(
					FilmEquipmentListImpl.class,
					filmEquipmentList.getPrimaryKeyObj());
			}

			if (filmEquipmentList != null) {
				session.delete(filmEquipmentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmEquipmentList != null) {
			clearCache(filmEquipmentList);
		}

		return filmEquipmentList;
	}

	@Override
	public FilmEquipmentList updateImpl(FilmEquipmentList filmEquipmentList) {
		boolean isNew = filmEquipmentList.isNew();

		if (!(filmEquipmentList instanceof FilmEquipmentListModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmEquipmentList.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmEquipmentList);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmEquipmentList proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmEquipmentList implementation " +
					filmEquipmentList.getClass());
		}

		FilmEquipmentListModelImpl filmEquipmentListModelImpl =
			(FilmEquipmentListModelImpl)filmEquipmentList;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmEquipmentList.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmEquipmentList.setCreateDate(date);
			}
			else {
				filmEquipmentList.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmEquipmentListModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmEquipmentList.setModifiedDate(date);
			}
			else {
				filmEquipmentList.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmEquipmentList);
			}
			else {
				filmEquipmentList = (FilmEquipmentList)session.merge(
					filmEquipmentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmEquipmentListImpl.class, filmEquipmentListModelImpl, false,
			true);

		cacheUniqueFindersCache(filmEquipmentListModelImpl);

		if (isNew) {
			filmEquipmentList.setNew(false);
		}

		filmEquipmentList.resetOriginalValues();

		return filmEquipmentList;
	}

	/**
	 * Returns the film equipment list with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film equipment list
	 * @return the film equipment list
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	@Override
	public FilmEquipmentList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmEquipmentListException {

		FilmEquipmentList filmEquipmentList = fetchByPrimaryKey(primaryKey);

		if (filmEquipmentList == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmEquipmentListException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmEquipmentList;
	}

	/**
	 * Returns the film equipment list with the primary key or throws a <code>NoSuchFilmEquipmentListException</code> if it could not be found.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list
	 * @throws NoSuchFilmEquipmentListException if a film equipment list with the primary key could not be found
	 */
	@Override
	public FilmEquipmentList findByPrimaryKey(long filmEquipmentListId)
		throws NoSuchFilmEquipmentListException {

		return findByPrimaryKey((Serializable)filmEquipmentListId);
	}

	/**
	 * Returns the film equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmEquipmentListId the primary key of the film equipment list
	 * @return the film equipment list, or <code>null</code> if a film equipment list with the primary key could not be found
	 */
	@Override
	public FilmEquipmentList fetchByPrimaryKey(long filmEquipmentListId) {
		return fetchByPrimaryKey((Serializable)filmEquipmentListId);
	}

	/**
	 * Returns all the film equipment lists.
	 *
	 * @return the film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @return the range of film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film equipment lists
	 * @param end the upper bound of the range of film equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film equipment lists
	 */
	@Override
	public List<FilmEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmEquipmentList> orderByComparator,
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

		List<FilmEquipmentList> list = null;

		if (useFinderCache) {
			list = (List<FilmEquipmentList>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMEQUIPMENTLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMEQUIPMENTLIST;

				sql = sql.concat(FilmEquipmentListModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmEquipmentList>)QueryUtil.list(
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
	 * Removes all the film equipment lists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmEquipmentList filmEquipmentList : findAll()) {
			remove(filmEquipmentList);
		}
	}

	/**
	 * Returns the number of film equipment lists.
	 *
	 * @return the number of film equipment lists
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FILMEQUIPMENTLIST);

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
	protected EntityCache getEntityCache() {
		return entityCache;
	}

	@Override
	protected String getPKDBName() {
		return "filmEquipmentListId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMEQUIPMENTLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmEquipmentListModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film equipment list persistence.
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

		_finderPathFetchBygetFilmById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilmById",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetFilmById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmById",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		_finderPathWithPaginationFindBygetFilmByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFilmByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"filmApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFilmByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFilmByAppId",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetFilmByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFilmByAppId",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		FilmEquipmentListUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmEquipmentListUtil.setPersistence(null);

		entityCache.removeCache(FilmEquipmentListImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMEQUIPMENTLIST =
		"SELECT filmEquipmentList FROM FilmEquipmentList filmEquipmentList";

	private static final String _SQL_SELECT_FILMEQUIPMENTLIST_WHERE =
		"SELECT filmEquipmentList FROM FilmEquipmentList filmEquipmentList WHERE ";

	private static final String _SQL_COUNT_FILMEQUIPMENTLIST =
		"SELECT COUNT(filmEquipmentList) FROM FilmEquipmentList filmEquipmentList";

	private static final String _SQL_COUNT_FILMEQUIPMENTLIST_WHERE =
		"SELECT COUNT(filmEquipmentList) FROM FilmEquipmentList filmEquipmentList WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "filmEquipmentList.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmEquipmentList exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmEquipmentList exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmEquipmentListPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
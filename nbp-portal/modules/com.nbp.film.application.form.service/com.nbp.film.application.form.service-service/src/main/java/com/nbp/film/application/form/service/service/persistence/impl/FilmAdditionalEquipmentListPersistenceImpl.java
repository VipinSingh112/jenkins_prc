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

import com.nbp.film.application.form.service.exception.NoSuchFilmAdditionalEquipmentListException;
import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentList;
import com.nbp.film.application.form.service.model.FilmAdditionalEquipmentListTable;
import com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListImpl;
import com.nbp.film.application.form.service.model.impl.FilmAdditionalEquipmentListModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmAdditionalEquipmentListPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmAdditionalEquipmentListUtil;
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
 * The persistence implementation for the film additional equipment list service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmAdditionalEquipmentListPersistence.class)
public class FilmAdditionalEquipmentListPersistenceImpl
	extends BasePersistenceImpl<FilmAdditionalEquipmentList>
	implements FilmAdditionalEquipmentListPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmAdditionalEquipmentListUtil</code> to access the film additional equipment list persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmAdditionalEquipmentListImpl.class.getName();

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
	 * Returns the film additional equipment list where filmApplicationId = &#63; or throws a <code>NoSuchFilmAdditionalEquipmentListException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmAdditionalEquipmentListException {

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			fetchBygetFilmById(filmApplicationId);

		if (filmAdditionalEquipmentList == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmAdditionalEquipmentListException(sb.toString());
		}

		return filmAdditionalEquipmentList;
	}

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList fetchBygetFilmById(
		long filmApplicationId) {

		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film additional equipment list where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList fetchBygetFilmById(
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

		if (result instanceof FilmAdditionalEquipmentList) {
			FilmAdditionalEquipmentList filmAdditionalEquipmentList =
				(FilmAdditionalEquipmentList)result;

			if (filmApplicationId !=
					filmAdditionalEquipmentList.getFilmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMADDITIONALEQUIPMENTLIST_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmAdditionalEquipmentList> list = query.list();

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
								"FilmAdditionalEquipmentListPersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmAdditionalEquipmentList filmAdditionalEquipmentList =
						list.get(0);

					result = filmAdditionalEquipmentList;

					cacheResult(filmAdditionalEquipmentList);
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
			return (FilmAdditionalEquipmentList)result;
		}
	}

	/**
	 * Removes the film additional equipment list where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film additional equipment list that was removed
	 */
	@Override
	public FilmAdditionalEquipmentList removeBygetFilmById(
			long filmApplicationId)
		throws NoSuchFilmAdditionalEquipmentListException {

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			findBygetFilmById(filmApplicationId);

		return remove(filmAdditionalEquipmentList);
	}

	/**
	 * Returns the number of film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film additional equipment lists
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMADDITIONALEQUIPMENTLIST_WHERE);

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
		"filmAdditionalEquipmentList.filmApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFilmAddEquipByAppId;
	private FinderPath _finderPathWithoutPaginationFindBygetFilmAddEquipByAppId;
	private FinderPath _finderPathCountBygetFilmAddEquipByAppId;

	/**
	 * Returns all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findBygetFilmAddEquipByAppId(
		long filmApplicationId) {

		return findBygetFilmAddEquipByAppId(
			filmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @return the range of matching film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findBygetFilmAddEquipByAppId(
		long filmApplicationId, int start, int end) {

		return findBygetFilmAddEquipByAppId(
			filmApplicationId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findBygetFilmAddEquipByAppId(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		return findBygetFilmAddEquipByAppId(
			filmApplicationId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param filmApplicationId the film application ID
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findBygetFilmAddEquipByAppId(
		long filmApplicationId, int start, int end,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator,
		boolean useFinderCache) {

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFilmAddEquipByAppId;
				finderArgs = new Object[] {filmApplicationId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFilmAddEquipByAppId;
			finderArgs = new Object[] {
				filmApplicationId, start, end, orderByComparator
			};
		}

		List<FilmAdditionalEquipmentList> list = null;

		if (useFinderCache) {
			list = (List<FilmAdditionalEquipmentList>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmAdditionalEquipmentList filmAdditionalEquipmentList :
						list) {

					if (filmApplicationId !=
							filmAdditionalEquipmentList.
								getFilmApplicationId()) {

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

			sb.append(_SQL_SELECT_FILMADDITIONALEQUIPMENTLIST_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFILMADDEQUIPBYAPPID_FILMAPPLICATIONID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmAdditionalEquipmentListModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				list = (List<FilmAdditionalEquipmentList>)QueryUtil.list(
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
	 * Returns the first film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList findBygetFilmAddEquipByAppId_First(
			long filmApplicationId,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator)
		throws NoSuchFilmAdditionalEquipmentListException {

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			fetchBygetFilmAddEquipByAppId_First(
				filmApplicationId, orderByComparator);

		if (filmAdditionalEquipmentList != null) {
			return filmAdditionalEquipmentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmAdditionalEquipmentListException(sb.toString());
	}

	/**
	 * Returns the first film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList fetchBygetFilmAddEquipByAppId_First(
		long filmApplicationId,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		List<FilmAdditionalEquipmentList> list = findBygetFilmAddEquipByAppId(
			filmApplicationId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a matching film additional equipment list could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList findBygetFilmAddEquipByAppId_Last(
			long filmApplicationId,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator)
		throws NoSuchFilmAdditionalEquipmentListException {

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			fetchBygetFilmAddEquipByAppId_Last(
				filmApplicationId, orderByComparator);

		if (filmAdditionalEquipmentList != null) {
			return filmAdditionalEquipmentList;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("filmApplicationId=");
		sb.append(filmApplicationId);

		sb.append("}");

		throw new NoSuchFilmAdditionalEquipmentListException(sb.toString());
	}

	/**
	 * Returns the last film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film additional equipment list, or <code>null</code> if a matching film additional equipment list could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList fetchBygetFilmAddEquipByAppId_Last(
		long filmApplicationId,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		int count = countBygetFilmAddEquipByAppId(filmApplicationId);

		if (count == 0) {
			return null;
		}

		List<FilmAdditionalEquipmentList> list = findBygetFilmAddEquipByAppId(
			filmApplicationId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film additional equipment lists before and after the current film additional equipment list in the ordered set where filmApplicationId = &#63;.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the current film additional equipment list
	 * @param filmApplicationId the film application ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList[]
			findBygetFilmAddEquipByAppId_PrevAndNext(
				long FilmAdditionalEquipmentListId, long filmApplicationId,
				OrderByComparator<FilmAdditionalEquipmentList>
					orderByComparator)
		throws NoSuchFilmAdditionalEquipmentListException {

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			findByPrimaryKey(FilmAdditionalEquipmentListId);

		Session session = null;

		try {
			session = openSession();

			FilmAdditionalEquipmentList[] array =
				new FilmAdditionalEquipmentListImpl[3];

			array[0] = getBygetFilmAddEquipByAppId_PrevAndNext(
				session, filmAdditionalEquipmentList, filmApplicationId,
				orderByComparator, true);

			array[1] = filmAdditionalEquipmentList;

			array[2] = getBygetFilmAddEquipByAppId_PrevAndNext(
				session, filmAdditionalEquipmentList, filmApplicationId,
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

	protected FilmAdditionalEquipmentList
		getBygetFilmAddEquipByAppId_PrevAndNext(
			Session session,
			FilmAdditionalEquipmentList filmAdditionalEquipmentList,
			long filmApplicationId,
			OrderByComparator<FilmAdditionalEquipmentList> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMADDITIONALEQUIPMENTLIST_WHERE);

		sb.append(_FINDER_COLUMN_GETFILMADDEQUIPBYAPPID_FILMAPPLICATIONID_2);

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
			sb.append(FilmAdditionalEquipmentListModelImpl.ORDER_BY_JPQL);
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
						filmAdditionalEquipmentList)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmAdditionalEquipmentList> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film additional equipment lists where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 */
	@Override
	public void removeBygetFilmAddEquipByAppId(long filmApplicationId) {
		for (FilmAdditionalEquipmentList filmAdditionalEquipmentList :
				findBygetFilmAddEquipByAppId(
					filmApplicationId, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
					null)) {

			remove(filmAdditionalEquipmentList);
		}
	}

	/**
	 * Returns the number of film additional equipment lists where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film additional equipment lists
	 */
	@Override
	public int countBygetFilmAddEquipByAppId(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmAddEquipByAppId;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMADDITIONALEQUIPMENTLIST_WHERE);

			sb.append(
				_FINDER_COLUMN_GETFILMADDEQUIPBYAPPID_FILMAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFILMADDEQUIPBYAPPID_FILMAPPLICATIONID_2 =
			"filmAdditionalEquipmentList.filmApplicationId = ?";

	public FilmAdditionalEquipmentListPersistenceImpl() {
		setModelClass(FilmAdditionalEquipmentList.class);

		setModelImplClass(FilmAdditionalEquipmentListImpl.class);
		setModelPKClass(long.class);

		setTable(FilmAdditionalEquipmentListTable.INSTANCE);
	}

	/**
	 * Caches the film additional equipment list in the entity cache if it is enabled.
	 *
	 * @param filmAdditionalEquipmentList the film additional equipment list
	 */
	@Override
	public void cacheResult(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		entityCache.putResult(
			FilmAdditionalEquipmentListImpl.class,
			filmAdditionalEquipmentList.getPrimaryKey(),
			filmAdditionalEquipmentList);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmAdditionalEquipmentList.getFilmApplicationId()},
			filmAdditionalEquipmentList);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film additional equipment lists in the entity cache if it is enabled.
	 *
	 * @param filmAdditionalEquipmentLists the film additional equipment lists
	 */
	@Override
	public void cacheResult(
		List<FilmAdditionalEquipmentList> filmAdditionalEquipmentLists) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmAdditionalEquipmentLists.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmAdditionalEquipmentList filmAdditionalEquipmentList :
				filmAdditionalEquipmentLists) {

			if (entityCache.getResult(
					FilmAdditionalEquipmentListImpl.class,
					filmAdditionalEquipmentList.getPrimaryKey()) == null) {

				cacheResult(filmAdditionalEquipmentList);
			}
		}
	}

	/**
	 * Clears the cache for all film additional equipment lists.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmAdditionalEquipmentListImpl.class);

		finderCache.clearCache(FilmAdditionalEquipmentListImpl.class);
	}

	/**
	 * Clears the cache for the film additional equipment list.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		entityCache.removeResult(
			FilmAdditionalEquipmentListImpl.class, filmAdditionalEquipmentList);
	}

	@Override
	public void clearCache(
		List<FilmAdditionalEquipmentList> filmAdditionalEquipmentLists) {

		for (FilmAdditionalEquipmentList filmAdditionalEquipmentList :
				filmAdditionalEquipmentLists) {

			entityCache.removeResult(
				FilmAdditionalEquipmentListImpl.class,
				filmAdditionalEquipmentList);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmAdditionalEquipmentListImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmAdditionalEquipmentListImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmAdditionalEquipmentListModelImpl
			filmAdditionalEquipmentListModelImpl) {

		Object[] args = new Object[] {
			filmAdditionalEquipmentListModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args,
			filmAdditionalEquipmentListModelImpl);
	}

	/**
	 * Creates a new film additional equipment list with the primary key. Does not add the film additional equipment list to the database.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key for the new film additional equipment list
	 * @return the new film additional equipment list
	 */
	@Override
	public FilmAdditionalEquipmentList create(
		long FilmAdditionalEquipmentListId) {

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			new FilmAdditionalEquipmentListImpl();

		filmAdditionalEquipmentList.setNew(true);
		filmAdditionalEquipmentList.setPrimaryKey(
			FilmAdditionalEquipmentListId);

		filmAdditionalEquipmentList.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return filmAdditionalEquipmentList;
	}

	/**
	 * Removes the film additional equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list that was removed
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList remove(
			long FilmAdditionalEquipmentListId)
		throws NoSuchFilmAdditionalEquipmentListException {

		return remove((Serializable)FilmAdditionalEquipmentListId);
	}

	/**
	 * Removes the film additional equipment list with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film additional equipment list
	 * @return the film additional equipment list that was removed
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList remove(Serializable primaryKey)
		throws NoSuchFilmAdditionalEquipmentListException {

		Session session = null;

		try {
			session = openSession();

			FilmAdditionalEquipmentList filmAdditionalEquipmentList =
				(FilmAdditionalEquipmentList)session.get(
					FilmAdditionalEquipmentListImpl.class, primaryKey);

			if (filmAdditionalEquipmentList == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmAdditionalEquipmentListException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmAdditionalEquipmentList);
		}
		catch (NoSuchFilmAdditionalEquipmentListException
					noSuchEntityException) {

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
	protected FilmAdditionalEquipmentList removeImpl(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmAdditionalEquipmentList)) {
				filmAdditionalEquipmentList =
					(FilmAdditionalEquipmentList)session.get(
						FilmAdditionalEquipmentListImpl.class,
						filmAdditionalEquipmentList.getPrimaryKeyObj());
			}

			if (filmAdditionalEquipmentList != null) {
				session.delete(filmAdditionalEquipmentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmAdditionalEquipmentList != null) {
			clearCache(filmAdditionalEquipmentList);
		}

		return filmAdditionalEquipmentList;
	}

	@Override
	public FilmAdditionalEquipmentList updateImpl(
		FilmAdditionalEquipmentList filmAdditionalEquipmentList) {

		boolean isNew = filmAdditionalEquipmentList.isNew();

		if (!(filmAdditionalEquipmentList instanceof
				FilmAdditionalEquipmentListModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					filmAdditionalEquipmentList.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					filmAdditionalEquipmentList);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmAdditionalEquipmentList proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmAdditionalEquipmentList implementation " +
					filmAdditionalEquipmentList.getClass());
		}

		FilmAdditionalEquipmentListModelImpl
			filmAdditionalEquipmentListModelImpl =
				(FilmAdditionalEquipmentListModelImpl)
					filmAdditionalEquipmentList;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmAdditionalEquipmentList.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmAdditionalEquipmentList.setCreateDate(date);
			}
			else {
				filmAdditionalEquipmentList.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmAdditionalEquipmentListModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmAdditionalEquipmentList.setModifiedDate(date);
			}
			else {
				filmAdditionalEquipmentList.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmAdditionalEquipmentList);
			}
			else {
				filmAdditionalEquipmentList =
					(FilmAdditionalEquipmentList)session.merge(
						filmAdditionalEquipmentList);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmAdditionalEquipmentListImpl.class,
			filmAdditionalEquipmentListModelImpl, false, true);

		cacheUniqueFindersCache(filmAdditionalEquipmentListModelImpl);

		if (isNew) {
			filmAdditionalEquipmentList.setNew(false);
		}

		filmAdditionalEquipmentList.resetOriginalValues();

		return filmAdditionalEquipmentList;
	}

	/**
	 * Returns the film additional equipment list with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film additional equipment list
	 * @return the film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmAdditionalEquipmentListException {

		FilmAdditionalEquipmentList filmAdditionalEquipmentList =
			fetchByPrimaryKey(primaryKey);

		if (filmAdditionalEquipmentList == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmAdditionalEquipmentListException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmAdditionalEquipmentList;
	}

	/**
	 * Returns the film additional equipment list with the primary key or throws a <code>NoSuchFilmAdditionalEquipmentListException</code> if it could not be found.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list
	 * @throws NoSuchFilmAdditionalEquipmentListException if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList findByPrimaryKey(
			long FilmAdditionalEquipmentListId)
		throws NoSuchFilmAdditionalEquipmentListException {

		return findByPrimaryKey((Serializable)FilmAdditionalEquipmentListId);
	}

	/**
	 * Returns the film additional equipment list with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param FilmAdditionalEquipmentListId the primary key of the film additional equipment list
	 * @return the film additional equipment list, or <code>null</code> if a film additional equipment list with the primary key could not be found
	 */
	@Override
	public FilmAdditionalEquipmentList fetchByPrimaryKey(
		long FilmAdditionalEquipmentListId) {

		return fetchByPrimaryKey((Serializable)FilmAdditionalEquipmentListId);
	}

	/**
	 * Returns all the film additional equipment lists.
	 *
	 * @return the film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @return the range of film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film additional equipment lists.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmAdditionalEquipmentListModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film additional equipment lists
	 * @param end the upper bound of the range of film additional equipment lists (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film additional equipment lists
	 */
	@Override
	public List<FilmAdditionalEquipmentList> findAll(
		int start, int end,
		OrderByComparator<FilmAdditionalEquipmentList> orderByComparator,
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

		List<FilmAdditionalEquipmentList> list = null;

		if (useFinderCache) {
			list = (List<FilmAdditionalEquipmentList>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMADDITIONALEQUIPMENTLIST);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMADDITIONALEQUIPMENTLIST;

				sql = sql.concat(
					FilmAdditionalEquipmentListModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmAdditionalEquipmentList>)QueryUtil.list(
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
	 * Removes all the film additional equipment lists from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmAdditionalEquipmentList filmAdditionalEquipmentList :
				findAll()) {

			remove(filmAdditionalEquipmentList);
		}
	}

	/**
	 * Returns the number of film additional equipment lists.
	 *
	 * @return the number of film additional equipment lists
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
					_SQL_COUNT_FILMADDITIONALEQUIPMENTLIST);

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
		return "FilmAdditionalEquipmentListId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMADDITIONALEQUIPMENTLIST;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmAdditionalEquipmentListModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film additional equipment list persistence.
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

		_finderPathWithPaginationFindBygetFilmAddEquipByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findBygetFilmAddEquipByAppId",
			new String[] {
				Long.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"filmApplicationId"}, true);

		_finderPathWithoutPaginationFindBygetFilmAddEquipByAppId =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFilmAddEquipByAppId",
				new String[] {Long.class.getName()},
				new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetFilmAddEquipByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFilmAddEquipByAppId",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		FilmAdditionalEquipmentListUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmAdditionalEquipmentListUtil.setPersistence(null);

		entityCache.removeCache(
			FilmAdditionalEquipmentListImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMADDITIONALEQUIPMENTLIST =
		"SELECT filmAdditionalEquipmentList FROM FilmAdditionalEquipmentList filmAdditionalEquipmentList";

	private static final String _SQL_SELECT_FILMADDITIONALEQUIPMENTLIST_WHERE =
		"SELECT filmAdditionalEquipmentList FROM FilmAdditionalEquipmentList filmAdditionalEquipmentList WHERE ";

	private static final String _SQL_COUNT_FILMADDITIONALEQUIPMENTLIST =
		"SELECT COUNT(filmAdditionalEquipmentList) FROM FilmAdditionalEquipmentList filmAdditionalEquipmentList";

	private static final String _SQL_COUNT_FILMADDITIONALEQUIPMENTLIST_WHERE =
		"SELECT COUNT(filmAdditionalEquipmentList) FROM FilmAdditionalEquipmentList filmAdditionalEquipmentList WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmAdditionalEquipmentList.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmAdditionalEquipmentList exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmAdditionalEquipmentList exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmAdditionalEquipmentListPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
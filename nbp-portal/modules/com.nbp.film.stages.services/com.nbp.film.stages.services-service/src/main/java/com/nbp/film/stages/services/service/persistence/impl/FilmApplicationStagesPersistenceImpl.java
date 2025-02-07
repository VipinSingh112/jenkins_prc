/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.film.stages.services.service.persistence.impl;

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

import com.nbp.film.stages.services.exception.NoSuchFilmApplicationStagesException;
import com.nbp.film.stages.services.model.FilmApplicationStages;
import com.nbp.film.stages.services.model.FilmApplicationStagesTable;
import com.nbp.film.stages.services.model.impl.FilmApplicationStagesImpl;
import com.nbp.film.stages.services.model.impl.FilmApplicationStagesModelImpl;
import com.nbp.film.stages.services.service.persistence.FilmApplicationStagesPersistence;
import com.nbp.film.stages.services.service.persistence.FilmApplicationStagesUtil;
import com.nbp.film.stages.services.service.persistence.impl.constants.FILM_STAGESPersistenceConstants;

import java.io.Serializable;

import java.lang.reflect.InvocationHandler;

import java.util.Collections;
import java.util.Date;
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
 * The persistence implementation for the film application stages service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmApplicationStagesPersistence.class)
public class FilmApplicationStagesPersistenceImpl
	extends BasePersistenceImpl<FilmApplicationStages>
	implements FilmApplicationStagesPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmApplicationStagesUtil</code> to access the film application stages persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmApplicationStagesImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFAS_CAI;
	private FinderPath _finderPathCountBygetFAS_CAI;

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_CAI(long filmApplicationId)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages = fetchBygetFAS_CAI(
			filmApplicationId);

		if (filmApplicationStages == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationStagesException(sb.toString());
		}

		return filmApplicationStages;
	}

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CAI(long filmApplicationId) {
		return fetchBygetFAS_CAI(filmApplicationId, true);
	}

	/**
	 * Returns the film application stages where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CAI(
		long filmApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {filmApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CAI, finderArgs, this);
		}

		if (result instanceof FilmApplicationStages) {
			FilmApplicationStages filmApplicationStages =
				(FilmApplicationStages)result;

			if (filmApplicationId !=
					filmApplicationStages.getFilmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETFAS_CAI_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CAI, finderArgs, list);
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
								"FilmApplicationStagesPersistenceImpl.fetchBygetFAS_CAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplicationStages filmApplicationStages = list.get(0);

					result = filmApplicationStages;

					cacheResult(filmApplicationStages);
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
			return (FilmApplicationStages)result;
		}
	}

	/**
	 * Removes the film application stages where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application stages that was removed
	 */
	@Override
	public FilmApplicationStages removeBygetFAS_CAI(long filmApplicationId)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages = findBygetFAS_CAI(
			filmApplicationId);

		return remove(filmApplicationStages);
	}

	/**
	 * Returns the number of film application stageses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application stageses
	 */
	@Override
	public int countBygetFAS_CAI(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFAS_CAI;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE);

			sb.append(_FINDER_COLUMN_GETFAS_CAI_FILMAPPLICATIONID_2);

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

	private static final String _FINDER_COLUMN_GETFAS_CAI_FILMAPPLICATIONID_2 =
		"filmApplicationStages.filmApplicationId = ?";

	private FinderPath _finderPathWithPaginationFindBygetFAS_StageName;
	private FinderPath _finderPathWithoutPaginationFindBygetFAS_StageName;
	private FinderPath _finderPathCountBygetFAS_StageName;

	/**
	 * Returns all the film application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName) {

		return findBygetFAS_StageName(
			stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end) {

		return findBygetFAS_StageName(stageName, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return findBygetFAS_StageName(
			stageName, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName(
		String stageName, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetFAS_StageName;
				finderArgs = new Object[] {stageName};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetFAS_StageName;
			finderArgs = new Object[] {
				stageName, start, end, orderByComparator
			};
		}

		List<FilmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FilmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmApplicationStages filmApplicationStages : list) {
					if (!stageName.equals(
							filmApplicationStages.getStageName())) {

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

			sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				list = (List<FilmApplicationStages>)QueryUtil.list(
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
	 * Returns the first film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_StageName_First(
			String stageName,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetFAS_StageName_First(stageName, orderByComparator);

		if (filmApplicationStages != null) {
			return filmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFilmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_StageName_First(
		String stageName,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		List<FilmApplicationStages> list = findBygetFAS_StageName(
			stageName, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_StageName_Last(
			String stageName,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetFAS_StageName_Last(stageName, orderByComparator);

		if (filmApplicationStages != null) {
			return filmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append("}");

		throw new NoSuchFilmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_StageName_Last(
		String stageName,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		int count = countBygetFAS_StageName(stageName);

		if (count == 0) {
			return null;
		}

		List<FilmApplicationStages> list = findBygetFAS_StageName(
			stageName, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where stageName = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param stageName the stage name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages[] findBygetFAS_StageName_PrevAndNext(
			long filmApplicationStagesId, String stageName,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		stageName = Objects.toString(stageName, "");

		FilmApplicationStages filmApplicationStages = findByPrimaryKey(
			filmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FilmApplicationStages[] array = new FilmApplicationStagesImpl[3];

			array[0] = getBygetFAS_StageName_PrevAndNext(
				session, filmApplicationStages, stageName, orderByComparator,
				true);

			array[1] = filmApplicationStages;

			array[2] = getBygetFAS_StageName_PrevAndNext(
				session, filmApplicationStages, stageName, orderByComparator,
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

	protected FilmApplicationStages getBygetFAS_StageName_PrevAndNext(
		Session session, FilmApplicationStages filmApplicationStages,
		String stageName,
		OrderByComparator<FilmApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2);
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
			sb.append(FilmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						filmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film application stageses where stageName = &#63; from the database.
	 *
	 * @param stageName the stage name
	 */
	@Override
	public void removeBygetFAS_StageName(String stageName) {
		for (FilmApplicationStages filmApplicationStages :
				findBygetFAS_StageName(
					stageName, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(filmApplicationStages);
		}
	}

	/**
	 * Returns the number of film application stageses where stageName = &#63;.
	 *
	 * @param stageName the stage name
	 * @return the number of matching film application stageses
	 */
	@Override
	public int countBygetFAS_StageName(String stageName) {
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetFAS_StageName;

		Object[] finderArgs = new Object[] {stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
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

	private static final String _FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_2 =
		"filmApplicationStages.stageName = ?";

	private static final String _FINDER_COLUMN_GETFAS_STAGENAME_STAGENAME_3 =
		"(filmApplicationStages.stageName IS NULL OR filmApplicationStages.stageName = '')";

	private FinderPath
		_finderPathWithPaginationFindBygetFAS_StageName_StageStatus;
	private FinderPath
		_finderPathWithoutPaginationFindBygetFAS_StageName_StageStatus;
	private FinderPath _finderPathCountBygetFAS_StageName_StageStatus;

	/**
	 * Returns all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		return findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus, int start, int end) {

		return findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath =
					_finderPathWithoutPaginationFindBygetFAS_StageName_StageStatus;
				finderArgs = new Object[] {stageName, stageStatus};
			}
		}
		else if (useFinderCache) {
			finderPath =
				_finderPathWithPaginationFindBygetFAS_StageName_StageStatus;
			finderArgs = new Object[] {
				stageName, stageStatus, start, end, orderByComparator
			};
		}

		List<FilmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FilmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmApplicationStages filmApplicationStages : list) {
					if (!stageName.equals(
							filmApplicationStages.getStageName()) ||
						!stageStatus.equals(
							filmApplicationStages.getStageStatus())) {

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

			sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				list = (List<FilmApplicationStages>)QueryUtil.list(
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
	 * Returns the first film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_StageName_StageStatus_First(
			String stageName, String stageStatus,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetFAS_StageName_StageStatus_First(
				stageName, stageStatus, orderByComparator);

		if (filmApplicationStages != null) {
			return filmApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchFilmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_StageName_StageStatus_First(
		String stageName, String stageStatus,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		List<FilmApplicationStages> list = findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_StageName_StageStatus_Last(
			String stageName, String stageStatus,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetFAS_StageName_StageStatus_Last(
				stageName, stageStatus, orderByComparator);

		if (filmApplicationStages != null) {
			return filmApplicationStages;
		}

		StringBundler sb = new StringBundler(6);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("stageName=");
		sb.append(stageName);

		sb.append(", stageStatus=");
		sb.append(stageStatus);

		sb.append("}");

		throw new NoSuchFilmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_StageName_StageStatus_Last(
		String stageName, String stageStatus,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		int count = countBygetFAS_StageName_StageStatus(stageName, stageStatus);

		if (count == 0) {
			return null;
		}

		List<FilmApplicationStages> list = findBygetFAS_StageName_StageStatus(
			stageName, stageStatus, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages[]
			findBygetFAS_StageName_StageStatus_PrevAndNext(
				long filmApplicationStagesId, String stageName,
				String stageStatus,
				OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FilmApplicationStages filmApplicationStages = findByPrimaryKey(
			filmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FilmApplicationStages[] array = new FilmApplicationStagesImpl[3];

			array[0] = getBygetFAS_StageName_StageStatus_PrevAndNext(
				session, filmApplicationStages, stageName, stageStatus,
				orderByComparator, true);

			array[1] = filmApplicationStages;

			array[2] = getBygetFAS_StageName_StageStatus_PrevAndNext(
				session, filmApplicationStages, stageName, stageStatus,
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

	protected FilmApplicationStages
		getBygetFAS_StageName_StageStatus_PrevAndNext(
			Session session, FilmApplicationStages filmApplicationStages,
			String stageName, String stageStatus,
			OrderByComparator<FilmApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

		boolean bindStageName = false;

		if (stageName.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_3);
		}
		else {
			bindStageName = true;

			sb.append(_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_2);
		}

		boolean bindStageStatus = false;

		if (stageStatus.isEmpty()) {
			sb.append(
				_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
		}
		else {
			bindStageStatus = true;

			sb.append(
				_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
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
			sb.append(FilmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindStageName) {
			queryPos.add(stageName);
		}

		if (bindStageStatus) {
			queryPos.add(stageStatus);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						filmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film application stageses where stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 */
	@Override
	public void removeBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		for (FilmApplicationStages filmApplicationStages :
				findBygetFAS_StageName_StageStatus(
					stageName, stageStatus, QueryUtil.ALL_POS,
					QueryUtil.ALL_POS, null)) {

			remove(filmApplicationStages);
		}
	}

	/**
	 * Returns the number of film application stageses where stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	@Override
	public int countBygetFAS_StageName_StageStatus(
		String stageName, String stageStatus) {

		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetFAS_StageName_StageStatus;

		Object[] finderArgs = new Object[] {stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_2);
			}

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_2 =
			"filmApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGENAME_3 =
			"(filmApplicationStages.stageName IS NULL OR filmApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_2 =
			"filmApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_STAGENAME_STAGESTATUS_STAGESTATUS_3 =
			"(filmApplicationStages.stageStatus IS NULL OR filmApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetFAS_CaseIdStageName;
	private FinderPath _finderPathCountBygetFAS_CaseIdStageName;

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetFAS_CaseIdStageName(caseId, stageName);

		if (filmApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationStagesException(sb.toString());
		}

		return filmApplicationStages;
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName) {

		return fetchBygetFAS_CaseIdStageName(caseId, stageName, true);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CaseIdStageName(
		String caseId, String stageName, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CaseIdStageName, finderArgs, this);
		}

		if (result instanceof FilmApplicationStages) {
			FilmApplicationStages filmApplicationStages =
				(FilmApplicationStages)result;

			if (!Objects.equals(caseId, filmApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, filmApplicationStages.getStageName())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				List<FilmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CaseIdStageName,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageName};
							}

							_log.warn(
								"FilmApplicationStagesPersistenceImpl.fetchBygetFAS_CaseIdStageName(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplicationStages filmApplicationStages = list.get(0);

					result = filmApplicationStages;

					cacheResult(filmApplicationStages);
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
			return (FilmApplicationStages)result;
		}
	}

	/**
	 * Removes the film application stages where caseId = &#63; and stageName = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the film application stages that was removed
	 */
	@Override
	public FilmApplicationStages removeBygetFAS_CaseIdStageName(
			String caseId, String stageName)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			findBygetFAS_CaseIdStageName(caseId, stageName);

		return remove(filmApplicationStages);
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageName = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @return the number of matching film application stageses
	 */
	@Override
	public int countBygetFAS_CaseIdStageName(String caseId, String stageName) {
		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");

		FinderPath finderPath = _finderPathCountBygetFAS_CaseIdStageName;

		Object[] finderArgs = new Object[] {caseId, stageName};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
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

	private static final String _FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_2 =
		"filmApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_CASEID_3 =
		"(filmApplicationStages.caseId IS NULL OR filmApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_2 =
			"filmApplicationStages.stageName = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGENAME_STAGENAME_3 =
			"(filmApplicationStages.stageName IS NULL OR filmApplicationStages.stageName = '')";

	private FinderPath _finderPathFetchBygetFAS_CaseIdStageStatus;
	private FinderPath _finderPathCountBygetFAS_CaseIdStageStatus;

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetFAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		if (filmApplicationStages == null) {
			StringBundler sb = new StringBundler(8);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageName=");
			sb.append(stageName);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationStagesException(sb.toString());
		}

		return filmApplicationStages;
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		return fetchBygetFAS_CaseIdStageStatus(
			caseId, stageName, stageStatus, true);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageName, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CaseIdStageStatus, finderArgs, this);
		}

		if (result instanceof FilmApplicationStages) {
			FilmApplicationStages filmApplicationStages =
				(FilmApplicationStages)result;

			if (!Objects.equals(caseId, filmApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageName, filmApplicationStages.getStageName()) ||
				!Objects.equals(
					stageStatus, filmApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(5);

			sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<FilmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CaseIdStageStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									caseId, stageName, stageStatus
								};
							}

							_log.warn(
								"FilmApplicationStagesPersistenceImpl.fetchBygetFAS_CaseIdStageStatus(String, String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplicationStages filmApplicationStages = list.get(0);

					result = filmApplicationStages;

					cacheResult(filmApplicationStages);
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
			return (FilmApplicationStages)result;
		}
	}

	/**
	 * Removes the film application stages where caseId = &#63; and stageName = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the film application stages that was removed
	 */
	@Override
	public FilmApplicationStages removeBygetFAS_CaseIdStageStatus(
			String caseId, String stageName, String stageStatus)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			findBygetFAS_CaseIdStageStatus(caseId, stageName, stageStatus);

		return remove(filmApplicationStages);
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageName = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageName the stage name
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	@Override
	public int countBygetFAS_CaseIdStageStatus(
		String caseId, String stageName, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageName = Objects.toString(stageName, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetFAS_CaseIdStageStatus;

		Object[] finderArgs = new Object[] {caseId, stageName, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_2);
			}

			boolean bindStageName = false;

			if (stageName.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_3);
			}
			else {
				bindStageName = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(
					_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_2);
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

				if (bindStageName) {
					queryPos.add(stageName);
				}

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_2 =
			"filmApplicationStages.caseId = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_CASEID_3 =
			"(filmApplicationStages.caseId IS NULL OR filmApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_2 =
			"filmApplicationStages.stageName = ? AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGENAME_3 =
			"(filmApplicationStages.stageName IS NULL OR filmApplicationStages.stageName = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_2 =
			"filmApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDSTAGESTATUS_STAGESTATUS_3 =
			"(filmApplicationStages.stageStatus IS NULL OR filmApplicationStages.stageStatus = '')";

	private FinderPath _finderPathFetchBygetFAS_CaseIdAndStatus;
	private FinderPath _finderPathCountBygetFAS_CaseIdAndStatus;

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetFAS_CaseIdAndStatus(caseId, stageStatus);

		if (filmApplicationStages == null) {
			StringBundler sb = new StringBundler(6);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("caseId=");
			sb.append(caseId);

			sb.append(", stageStatus=");
			sb.append(stageStatus);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationStagesException(sb.toString());
		}

		return filmApplicationStages;
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		return fetchBygetFAS_CaseIdAndStatus(caseId, stageStatus, true);
	}

	/**
	 * Returns the film application stages where caseId = &#63; and stageStatus = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus, boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {caseId, stageStatus};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFAS_CaseIdAndStatus, finderArgs, this);
		}

		if (result instanceof FilmApplicationStages) {
			FilmApplicationStages filmApplicationStages =
				(FilmApplicationStages)result;

			if (!Objects.equals(caseId, filmApplicationStages.getCaseId()) ||
				!Objects.equals(
					stageStatus, filmApplicationStages.getStageStatus())) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
				}

				List<FilmApplicationStages> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFAS_CaseIdAndStatus,
							finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {caseId, stageStatus};
							}

							_log.warn(
								"FilmApplicationStagesPersistenceImpl.fetchBygetFAS_CaseIdAndStatus(String, String, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplicationStages filmApplicationStages = list.get(0);

					result = filmApplicationStages;

					cacheResult(filmApplicationStages);
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
			return (FilmApplicationStages)result;
		}
	}

	/**
	 * Removes the film application stages where caseId = &#63; and stageStatus = &#63; from the database.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the film application stages that was removed
	 */
	@Override
	public FilmApplicationStages removeBygetFAS_CaseIdAndStatus(
			String caseId, String stageStatus)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			findBygetFAS_CaseIdAndStatus(caseId, stageStatus);

		return remove(filmApplicationStages);
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63; and stageStatus = &#63;.
	 *
	 * @param caseId the case ID
	 * @param stageStatus the stage status
	 * @return the number of matching film application stageses
	 */
	@Override
	public int countBygetFAS_CaseIdAndStatus(
		String caseId, String stageStatus) {

		caseId = Objects.toString(caseId, "");
		stageStatus = Objects.toString(stageStatus, "");

		FinderPath finderPath = _finderPathCountBygetFAS_CaseIdAndStatus;

		Object[] finderArgs = new Object[] {caseId, stageStatus};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_2);
			}

			boolean bindStageStatus = false;

			if (stageStatus.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_3);
			}
			else {
				bindStageStatus = true;

				sb.append(_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_2);
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

				if (bindStageStatus) {
					queryPos.add(stageStatus);
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

	private static final String _FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_2 =
		"filmApplicationStages.caseId = ? AND ";

	private static final String _FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_CASEID_3 =
		"(filmApplicationStages.caseId IS NULL OR filmApplicationStages.caseId = '') AND ";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_2 =
			"filmApplicationStages.stageStatus = ?";

	private static final String
		_FINDER_COLUMN_GETFAS_CASEIDANDSTATUS_STAGESTATUS_3 =
			"(filmApplicationStages.stageStatus IS NULL OR filmApplicationStages.stageStatus = '')";

	private FinderPath _finderPathWithPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathWithoutPaginationFindBygetCAS_CaseId;
	private FinderPath _finderPathCountBygetCAS_CaseId;

	/**
	 * Returns all the film application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetCAS_CaseId(String caseId) {
		return findBygetCAS_CaseId(
			caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end) {

		return findBygetCAS_CaseId(caseId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the film application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return findBygetCAS_CaseId(caseId, start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film application stageses where caseId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param caseId the case ID
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findBygetCAS_CaseId(
		String caseId, int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator,
		boolean useFinderCache) {

		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
			(orderByComparator == null)) {

			if (useFinderCache) {
				finderPath = _finderPathWithoutPaginationFindBygetCAS_CaseId;
				finderArgs = new Object[] {caseId};
			}
		}
		else if (useFinderCache) {
			finderPath = _finderPathWithPaginationFindBygetCAS_CaseId;
			finderArgs = new Object[] {caseId, start, end, orderByComparator};
		}

		List<FilmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FilmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);

			if ((list != null) && !list.isEmpty()) {
				for (FilmApplicationStages filmApplicationStages : list) {
					if (!caseId.equals(filmApplicationStages.getCaseId())) {
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

			sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);
			}
			else {
				sb.append(FilmApplicationStagesModelImpl.ORDER_BY_JPQL);
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

				list = (List<FilmApplicationStages>)QueryUtil.list(
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
	 * Returns the first film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetCAS_CaseId_First(
			String caseId,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages =
			fetchBygetCAS_CaseId_First(caseId, orderByComparator);

		if (filmApplicationStages != null) {
			return filmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFilmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the first film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetCAS_CaseId_First(
		String caseId,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		List<FilmApplicationStages> list = findBygetCAS_CaseId(
			caseId, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages
	 * @throws NoSuchFilmApplicationStagesException if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages findBygetCAS_CaseId_Last(
			String caseId,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages = fetchBygetCAS_CaseId_Last(
			caseId, orderByComparator);

		if (filmApplicationStages != null) {
			return filmApplicationStages;
		}

		StringBundler sb = new StringBundler(4);

		sb.append(_NO_SUCH_ENTITY_WITH_KEY);

		sb.append("caseId=");
		sb.append(caseId);

		sb.append("}");

		throw new NoSuchFilmApplicationStagesException(sb.toString());
	}

	/**
	 * Returns the last film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching film application stages, or <code>null</code> if a matching film application stages could not be found
	 */
	@Override
	public FilmApplicationStages fetchBygetCAS_CaseId_Last(
		String caseId,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		int count = countBygetCAS_CaseId(caseId);

		if (count == 0) {
			return null;
		}

		List<FilmApplicationStages> list = findBygetCAS_CaseId(
			caseId, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the film application stageses before and after the current film application stages in the ordered set where caseId = &#63;.
	 *
	 * @param filmApplicationStagesId the primary key of the current film application stages
	 * @param caseId the case ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages[] findBygetCAS_CaseId_PrevAndNext(
			long filmApplicationStagesId, String caseId,
			OrderByComparator<FilmApplicationStages> orderByComparator)
		throws NoSuchFilmApplicationStagesException {

		caseId = Objects.toString(caseId, "");

		FilmApplicationStages filmApplicationStages = findByPrimaryKey(
			filmApplicationStagesId);

		Session session = null;

		try {
			session = openSession();

			FilmApplicationStages[] array = new FilmApplicationStagesImpl[3];

			array[0] = getBygetCAS_CaseId_PrevAndNext(
				session, filmApplicationStages, caseId, orderByComparator,
				true);

			array[1] = filmApplicationStages;

			array[2] = getBygetCAS_CaseId_PrevAndNext(
				session, filmApplicationStages, caseId, orderByComparator,
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

	protected FilmApplicationStages getBygetCAS_CaseId_PrevAndNext(
		Session session, FilmApplicationStages filmApplicationStages,
		String caseId,
		OrderByComparator<FilmApplicationStages> orderByComparator,
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

		sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE);

		boolean bindCaseId = false;

		if (caseId.isEmpty()) {
			sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
		}
		else {
			bindCaseId = true;

			sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
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
			sb.append(FilmApplicationStagesModelImpl.ORDER_BY_JPQL);
		}

		String sql = sb.toString();

		Query query = session.createQuery(sql);

		query.setFirstResult(0);
		query.setMaxResults(2);

		QueryPos queryPos = QueryPos.getInstance(query);

		if (bindCaseId) {
			queryPos.add(caseId);
		}

		if (orderByComparator != null) {
			for (Object orderByConditionValue :
					orderByComparator.getOrderByConditionValues(
						filmApplicationStages)) {

				queryPos.add(orderByConditionValue);
			}
		}

		List<FilmApplicationStages> list = query.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the film application stageses where caseId = &#63; from the database.
	 *
	 * @param caseId the case ID
	 */
	@Override
	public void removeBygetCAS_CaseId(String caseId) {
		for (FilmApplicationStages filmApplicationStages :
				findBygetCAS_CaseId(
					caseId, QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {

			remove(filmApplicationStages);
		}
	}

	/**
	 * Returns the number of film application stageses where caseId = &#63;.
	 *
	 * @param caseId the case ID
	 * @return the number of matching film application stageses
	 */
	@Override
	public int countBygetCAS_CaseId(String caseId) {
		caseId = Objects.toString(caseId, "");

		FinderPath finderPath = _finderPathCountBygetCAS_CaseId;

		Object[] finderArgs = new Object[] {caseId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE);

			boolean bindCaseId = false;

			if (caseId.isEmpty()) {
				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_3);
			}
			else {
				bindCaseId = true;

				sb.append(_FINDER_COLUMN_GETCAS_CASEID_CASEID_2);
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

	private static final String _FINDER_COLUMN_GETCAS_CASEID_CASEID_2 =
		"filmApplicationStages.caseId = ?";

	private static final String _FINDER_COLUMN_GETCAS_CASEID_CASEID_3 =
		"(filmApplicationStages.caseId IS NULL OR filmApplicationStages.caseId = '')";

	public FilmApplicationStagesPersistenceImpl() {
		setModelClass(FilmApplicationStages.class);

		setModelImplClass(FilmApplicationStagesImpl.class);
		setModelPKClass(long.class);

		setTable(FilmApplicationStagesTable.INSTANCE);
	}

	/**
	 * Caches the film application stages in the entity cache if it is enabled.
	 *
	 * @param filmApplicationStages the film application stages
	 */
	@Override
	public void cacheResult(FilmApplicationStages filmApplicationStages) {
		entityCache.putResult(
			FilmApplicationStagesImpl.class,
			filmApplicationStages.getPrimaryKey(), filmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CAI,
			new Object[] {filmApplicationStages.getFilmApplicationId()},
			filmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageName,
			new Object[] {
				filmApplicationStages.getCaseId(),
				filmApplicationStages.getStageName()
			},
			filmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageStatus,
			new Object[] {
				filmApplicationStages.getCaseId(),
				filmApplicationStages.getStageName(),
				filmApplicationStages.getStageStatus()
			},
			filmApplicationStages);

		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdAndStatus,
			new Object[] {
				filmApplicationStages.getCaseId(),
				filmApplicationStages.getStageStatus()
			},
			filmApplicationStages);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film application stageses in the entity cache if it is enabled.
	 *
	 * @param filmApplicationStageses the film application stageses
	 */
	@Override
	public void cacheResult(
		List<FilmApplicationStages> filmApplicationStageses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmApplicationStageses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmApplicationStages filmApplicationStages :
				filmApplicationStageses) {

			if (entityCache.getResult(
					FilmApplicationStagesImpl.class,
					filmApplicationStages.getPrimaryKey()) == null) {

				cacheResult(filmApplicationStages);
			}
		}
	}

	/**
	 * Clears the cache for all film application stageses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmApplicationStagesImpl.class);

		finderCache.clearCache(FilmApplicationStagesImpl.class);
	}

	/**
	 * Clears the cache for the film application stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmApplicationStages filmApplicationStages) {
		entityCache.removeResult(
			FilmApplicationStagesImpl.class, filmApplicationStages);
	}

	@Override
	public void clearCache(
		List<FilmApplicationStages> filmApplicationStageses) {

		for (FilmApplicationStages filmApplicationStages :
				filmApplicationStageses) {

			entityCache.removeResult(
				FilmApplicationStagesImpl.class, filmApplicationStages);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmApplicationStagesImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmApplicationStagesImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmApplicationStagesModelImpl filmApplicationStagesModelImpl) {

		Object[] args = new Object[] {
			filmApplicationStagesModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CAI, args, filmApplicationStagesModelImpl);

		args = new Object[] {
			filmApplicationStagesModelImpl.getCaseId(),
			filmApplicationStagesModelImpl.getStageName()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CaseIdStageName, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageName, args,
			filmApplicationStagesModelImpl);

		args = new Object[] {
			filmApplicationStagesModelImpl.getCaseId(),
			filmApplicationStagesModelImpl.getStageName(),
			filmApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CaseIdStageStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdStageStatus, args,
			filmApplicationStagesModelImpl);

		args = new Object[] {
			filmApplicationStagesModelImpl.getCaseId(),
			filmApplicationStagesModelImpl.getStageStatus()
		};

		finderCache.putResult(
			_finderPathCountBygetFAS_CaseIdAndStatus, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFAS_CaseIdAndStatus, args,
			filmApplicationStagesModelImpl);
	}

	/**
	 * Creates a new film application stages with the primary key. Does not add the film application stages to the database.
	 *
	 * @param filmApplicationStagesId the primary key for the new film application stages
	 * @return the new film application stages
	 */
	@Override
	public FilmApplicationStages create(long filmApplicationStagesId) {
		FilmApplicationStages filmApplicationStages =
			new FilmApplicationStagesImpl();

		filmApplicationStages.setNew(true);
		filmApplicationStages.setPrimaryKey(filmApplicationStagesId);

		filmApplicationStages.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmApplicationStages;
	}

	/**
	 * Removes the film application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages that was removed
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages remove(long filmApplicationStagesId)
		throws NoSuchFilmApplicationStagesException {

		return remove((Serializable)filmApplicationStagesId);
	}

	/**
	 * Removes the film application stages with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film application stages
	 * @return the film application stages that was removed
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages remove(Serializable primaryKey)
		throws NoSuchFilmApplicationStagesException {

		Session session = null;

		try {
			session = openSession();

			FilmApplicationStages filmApplicationStages =
				(FilmApplicationStages)session.get(
					FilmApplicationStagesImpl.class, primaryKey);

			if (filmApplicationStages == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmApplicationStagesException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmApplicationStages);
		}
		catch (NoSuchFilmApplicationStagesException noSuchEntityException) {
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
	protected FilmApplicationStages removeImpl(
		FilmApplicationStages filmApplicationStages) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmApplicationStages)) {
				filmApplicationStages = (FilmApplicationStages)session.get(
					FilmApplicationStagesImpl.class,
					filmApplicationStages.getPrimaryKeyObj());
			}

			if (filmApplicationStages != null) {
				session.delete(filmApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmApplicationStages != null) {
			clearCache(filmApplicationStages);
		}

		return filmApplicationStages;
	}

	@Override
	public FilmApplicationStages updateImpl(
		FilmApplicationStages filmApplicationStages) {

		boolean isNew = filmApplicationStages.isNew();

		if (!(filmApplicationStages instanceof
				FilmApplicationStagesModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmApplicationStages.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmApplicationStages);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmApplicationStages proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmApplicationStages implementation " +
					filmApplicationStages.getClass());
		}

		FilmApplicationStagesModelImpl filmApplicationStagesModelImpl =
			(FilmApplicationStagesModelImpl)filmApplicationStages;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmApplicationStages.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmApplicationStages.setCreateDate(date);
			}
			else {
				filmApplicationStages.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmApplicationStagesModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmApplicationStages.setModifiedDate(date);
			}
			else {
				filmApplicationStages.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmApplicationStages);
			}
			else {
				filmApplicationStages = (FilmApplicationStages)session.merge(
					filmApplicationStages);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmApplicationStagesImpl.class, filmApplicationStagesModelImpl,
			false, true);

		cacheUniqueFindersCache(filmApplicationStagesModelImpl);

		if (isNew) {
			filmApplicationStages.setNew(false);
		}

		filmApplicationStages.resetOriginalValues();

		return filmApplicationStages;
	}

	/**
	 * Returns the film application stages with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film application stages
	 * @return the film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmApplicationStagesException {

		FilmApplicationStages filmApplicationStages = fetchByPrimaryKey(
			primaryKey);

		if (filmApplicationStages == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmApplicationStagesException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmApplicationStages;
	}

	/**
	 * Returns the film application stages with the primary key or throws a <code>NoSuchFilmApplicationStagesException</code> if it could not be found.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages
	 * @throws NoSuchFilmApplicationStagesException if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages findByPrimaryKey(long filmApplicationStagesId)
		throws NoSuchFilmApplicationStagesException {

		return findByPrimaryKey((Serializable)filmApplicationStagesId);
	}

	/**
	 * Returns the film application stages with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationStagesId the primary key of the film application stages
	 * @return the film application stages, or <code>null</code> if a film application stages with the primary key could not be found
	 */
	@Override
	public FilmApplicationStages fetchByPrimaryKey(
		long filmApplicationStagesId) {

		return fetchByPrimaryKey((Serializable)filmApplicationStagesId);
	}

	/**
	 * Returns all the film application stageses.
	 *
	 * @return the film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @return the range of film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film application stageses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationStagesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application stageses
	 * @param end the upper bound of the range of film application stageses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application stageses
	 */
	@Override
	public List<FilmApplicationStages> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationStages> orderByComparator,
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

		List<FilmApplicationStages> list = null;

		if (useFinderCache) {
			list = (List<FilmApplicationStages>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMAPPLICATIONSTAGES);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMAPPLICATIONSTAGES;

				sql = sql.concat(FilmApplicationStagesModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmApplicationStages>)QueryUtil.list(
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
	 * Removes all the film application stageses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmApplicationStages filmApplicationStages : findAll()) {
			remove(filmApplicationStages);
		}
	}

	/**
	 * Returns the number of film application stageses.
	 *
	 * @return the number of film application stageses
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
					_SQL_COUNT_FILMAPPLICATIONSTAGES);

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
		return "filmApplicationStagesId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMAPPLICATIONSTAGES;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmApplicationStagesModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film application stages persistence.
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

		_finderPathFetchBygetFAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetFAS_CAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetFAS_CAI",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		_finderPathWithPaginationFindBygetFAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetFAS_StageName",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"stageName"}, true);

		_finderPathWithoutPaginationFindBygetFAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetFAS_StageName",
			new String[] {String.class.getName()}, new String[] {"stageName"},
			true);

		_finderPathCountBygetFAS_StageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_StageName", new String[] {String.class.getName()},
			new String[] {"stageName"}, false);

		_finderPathWithPaginationFindBygetFAS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
				"findBygetFAS_StageName_StageStatus",
				new String[] {
					String.class.getName(), String.class.getName(),
					Integer.class.getName(), Integer.class.getName(),
					OrderByComparator.class.getName()
				},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathWithoutPaginationFindBygetFAS_StageName_StageStatus =
			new FinderPath(
				FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
				"findBygetFAS_StageName_StageStatus",
				new String[] {String.class.getName(), String.class.getName()},
				new String[] {"stageName", "stageStatus"}, true);

		_finderPathCountBygetFAS_StageName_StageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_StageName_StageStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"stageName", "stageStatus"}, false);

		_finderPathFetchBygetFAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, true);

		_finderPathCountBygetFAS_CaseIdStageName = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_CaseIdStageName",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageName"}, false);

		_finderPathFetchBygetFAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, true);

		_finderPathCountBygetFAS_CaseIdStageStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_CaseIdStageStatus",
			new String[] {
				String.class.getName(), String.class.getName(),
				String.class.getName()
			},
			new String[] {"caseId", "stageName", "stageStatus"}, false);

		_finderPathFetchBygetFAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, true);

		_finderPathCountBygetFAS_CaseIdAndStatus = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFAS_CaseIdAndStatus",
			new String[] {String.class.getName(), String.class.getName()},
			new String[] {"caseId", "stageStatus"}, false);

		_finderPathWithPaginationFindBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findBygetCAS_CaseId",
			new String[] {
				String.class.getName(), Integer.class.getName(),
				Integer.class.getName(), OrderByComparator.class.getName()
			},
			new String[] {"caseId"}, true);

		_finderPathWithoutPaginationFindBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findBygetCAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			true);

		_finderPathCountBygetCAS_CaseId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetCAS_CaseId",
			new String[] {String.class.getName()}, new String[] {"caseId"},
			false);

		FilmApplicationStagesUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmApplicationStagesUtil.setPersistence(null);

		entityCache.removeCache(FilmApplicationStagesImpl.class.getName());
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FILM_STAGESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FILMAPPLICATIONSTAGES =
		"SELECT filmApplicationStages FROM FilmApplicationStages filmApplicationStages";

	private static final String _SQL_SELECT_FILMAPPLICATIONSTAGES_WHERE =
		"SELECT filmApplicationStages FROM FilmApplicationStages filmApplicationStages WHERE ";

	private static final String _SQL_COUNT_FILMAPPLICATIONSTAGES =
		"SELECT COUNT(filmApplicationStages) FROM FilmApplicationStages filmApplicationStages";

	private static final String _SQL_COUNT_FILMAPPLICATIONSTAGES_WHERE =
		"SELECT COUNT(filmApplicationStages) FROM FilmApplicationStages filmApplicationStages WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmApplicationStages.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmApplicationStages exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmApplicationStages exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmApplicationStagesPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
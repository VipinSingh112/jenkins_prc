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

import com.nbp.film.application.form.service.exception.NoSuchFilmOtherDetailsException;
import com.nbp.film.application.form.service.model.FilmOtherDetails;
import com.nbp.film.application.form.service.model.FilmOtherDetailsTable;
import com.nbp.film.application.form.service.model.impl.FilmOtherDetailsImpl;
import com.nbp.film.application.form.service.model.impl.FilmOtherDetailsModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmOtherDetailsPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmOtherDetailsUtil;
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
 * The persistence implementation for the film other details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmOtherDetailsPersistence.class)
public class FilmOtherDetailsPersistenceImpl
	extends BasePersistenceImpl<FilmOtherDetails>
	implements FilmOtherDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmOtherDetailsUtil</code> to access the film other details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmOtherDetailsImpl.class.getName();

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
	 * Returns the film other details where filmApplicationId = &#63; or throws a <code>NoSuchFilmOtherDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film other details
	 * @throws NoSuchFilmOtherDetailsException if a matching film other details could not be found
	 */
	@Override
	public FilmOtherDetails findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmOtherDetailsException {

		FilmOtherDetails filmOtherDetails = fetchBygetFilmById(
			filmApplicationId);

		if (filmOtherDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmOtherDetailsException(sb.toString());
		}

		return filmOtherDetails;
	}

	/**
	 * Returns the film other details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film other details, or <code>null</code> if a matching film other details could not be found
	 */
	@Override
	public FilmOtherDetails fetchBygetFilmById(long filmApplicationId) {
		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film other details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film other details, or <code>null</code> if a matching film other details could not be found
	 */
	@Override
	public FilmOtherDetails fetchBygetFilmById(
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

		if (result instanceof FilmOtherDetails) {
			FilmOtherDetails filmOtherDetails = (FilmOtherDetails)result;

			if (filmApplicationId != filmOtherDetails.getFilmApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMOTHERDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmOtherDetails> list = query.list();

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
								"FilmOtherDetailsPersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmOtherDetails filmOtherDetails = list.get(0);

					result = filmOtherDetails;

					cacheResult(filmOtherDetails);
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
			return (FilmOtherDetails)result;
		}
	}

	/**
	 * Removes the film other details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film other details that was removed
	 */
	@Override
	public FilmOtherDetails removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmOtherDetailsException {

		FilmOtherDetails filmOtherDetails = findBygetFilmById(
			filmApplicationId);

		return remove(filmOtherDetails);
	}

	/**
	 * Returns the number of film other detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film other detailses
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMOTHERDETAILS_WHERE);

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
		"filmOtherDetails.filmApplicationId = ?";

	public FilmOtherDetailsPersistenceImpl() {
		setModelClass(FilmOtherDetails.class);

		setModelImplClass(FilmOtherDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(FilmOtherDetailsTable.INSTANCE);
	}

	/**
	 * Caches the film other details in the entity cache if it is enabled.
	 *
	 * @param filmOtherDetails the film other details
	 */
	@Override
	public void cacheResult(FilmOtherDetails filmOtherDetails) {
		entityCache.putResult(
			FilmOtherDetailsImpl.class, filmOtherDetails.getPrimaryKey(),
			filmOtherDetails);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmOtherDetails.getFilmApplicationId()},
			filmOtherDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film other detailses in the entity cache if it is enabled.
	 *
	 * @param filmOtherDetailses the film other detailses
	 */
	@Override
	public void cacheResult(List<FilmOtherDetails> filmOtherDetailses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmOtherDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmOtherDetails filmOtherDetails : filmOtherDetailses) {
			if (entityCache.getResult(
					FilmOtherDetailsImpl.class,
					filmOtherDetails.getPrimaryKey()) == null) {

				cacheResult(filmOtherDetails);
			}
		}
	}

	/**
	 * Clears the cache for all film other detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmOtherDetailsImpl.class);

		finderCache.clearCache(FilmOtherDetailsImpl.class);
	}

	/**
	 * Clears the cache for the film other details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmOtherDetails filmOtherDetails) {
		entityCache.removeResult(FilmOtherDetailsImpl.class, filmOtherDetails);
	}

	@Override
	public void clearCache(List<FilmOtherDetails> filmOtherDetailses) {
		for (FilmOtherDetails filmOtherDetails : filmOtherDetailses) {
			entityCache.removeResult(
				FilmOtherDetailsImpl.class, filmOtherDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmOtherDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FilmOtherDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmOtherDetailsModelImpl filmOtherDetailsModelImpl) {

		Object[] args = new Object[] {
			filmOtherDetailsModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args, filmOtherDetailsModelImpl);
	}

	/**
	 * Creates a new film other details with the primary key. Does not add the film other details to the database.
	 *
	 * @param filmOtherDetailsId the primary key for the new film other details
	 * @return the new film other details
	 */
	@Override
	public FilmOtherDetails create(long filmOtherDetailsId) {
		FilmOtherDetails filmOtherDetails = new FilmOtherDetailsImpl();

		filmOtherDetails.setNew(true);
		filmOtherDetails.setPrimaryKey(filmOtherDetailsId);

		filmOtherDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmOtherDetails;
	}

	/**
	 * Removes the film other details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details that was removed
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	@Override
	public FilmOtherDetails remove(long filmOtherDetailsId)
		throws NoSuchFilmOtherDetailsException {

		return remove((Serializable)filmOtherDetailsId);
	}

	/**
	 * Removes the film other details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film other details
	 * @return the film other details that was removed
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	@Override
	public FilmOtherDetails remove(Serializable primaryKey)
		throws NoSuchFilmOtherDetailsException {

		Session session = null;

		try {
			session = openSession();

			FilmOtherDetails filmOtherDetails = (FilmOtherDetails)session.get(
				FilmOtherDetailsImpl.class, primaryKey);

			if (filmOtherDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmOtherDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmOtherDetails);
		}
		catch (NoSuchFilmOtherDetailsException noSuchEntityException) {
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
	protected FilmOtherDetails removeImpl(FilmOtherDetails filmOtherDetails) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmOtherDetails)) {
				filmOtherDetails = (FilmOtherDetails)session.get(
					FilmOtherDetailsImpl.class,
					filmOtherDetails.getPrimaryKeyObj());
			}

			if (filmOtherDetails != null) {
				session.delete(filmOtherDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmOtherDetails != null) {
			clearCache(filmOtherDetails);
		}

		return filmOtherDetails;
	}

	@Override
	public FilmOtherDetails updateImpl(FilmOtherDetails filmOtherDetails) {
		boolean isNew = filmOtherDetails.isNew();

		if (!(filmOtherDetails instanceof FilmOtherDetailsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmOtherDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmOtherDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmOtherDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmOtherDetails implementation " +
					filmOtherDetails.getClass());
		}

		FilmOtherDetailsModelImpl filmOtherDetailsModelImpl =
			(FilmOtherDetailsModelImpl)filmOtherDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmOtherDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmOtherDetails.setCreateDate(date);
			}
			else {
				filmOtherDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmOtherDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmOtherDetails.setModifiedDate(date);
			}
			else {
				filmOtherDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmOtherDetails);
			}
			else {
				filmOtherDetails = (FilmOtherDetails)session.merge(
					filmOtherDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmOtherDetailsImpl.class, filmOtherDetailsModelImpl, false, true);

		cacheUniqueFindersCache(filmOtherDetailsModelImpl);

		if (isNew) {
			filmOtherDetails.setNew(false);
		}

		filmOtherDetails.resetOriginalValues();

		return filmOtherDetails;
	}

	/**
	 * Returns the film other details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film other details
	 * @return the film other details
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	@Override
	public FilmOtherDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmOtherDetailsException {

		FilmOtherDetails filmOtherDetails = fetchByPrimaryKey(primaryKey);

		if (filmOtherDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmOtherDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmOtherDetails;
	}

	/**
	 * Returns the film other details with the primary key or throws a <code>NoSuchFilmOtherDetailsException</code> if it could not be found.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details
	 * @throws NoSuchFilmOtherDetailsException if a film other details with the primary key could not be found
	 */
	@Override
	public FilmOtherDetails findByPrimaryKey(long filmOtherDetailsId)
		throws NoSuchFilmOtherDetailsException {

		return findByPrimaryKey((Serializable)filmOtherDetailsId);
	}

	/**
	 * Returns the film other details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmOtherDetailsId the primary key of the film other details
	 * @return the film other details, or <code>null</code> if a film other details with the primary key could not be found
	 */
	@Override
	public FilmOtherDetails fetchByPrimaryKey(long filmOtherDetailsId) {
		return fetchByPrimaryKey((Serializable)filmOtherDetailsId);
	}

	/**
	 * Returns all the film other detailses.
	 *
	 * @return the film other detailses
	 */
	@Override
	public List<FilmOtherDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film other detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmOtherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film other detailses
	 * @param end the upper bound of the range of film other detailses (not inclusive)
	 * @return the range of film other detailses
	 */
	@Override
	public List<FilmOtherDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film other detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmOtherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film other detailses
	 * @param end the upper bound of the range of film other detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film other detailses
	 */
	@Override
	public List<FilmOtherDetails> findAll(
		int start, int end,
		OrderByComparator<FilmOtherDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film other detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmOtherDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film other detailses
	 * @param end the upper bound of the range of film other detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film other detailses
	 */
	@Override
	public List<FilmOtherDetails> findAll(
		int start, int end,
		OrderByComparator<FilmOtherDetails> orderByComparator,
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

		List<FilmOtherDetails> list = null;

		if (useFinderCache) {
			list = (List<FilmOtherDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMOTHERDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMOTHERDETAILS;

				sql = sql.concat(FilmOtherDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmOtherDetails>)QueryUtil.list(
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
	 * Removes all the film other detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmOtherDetails filmOtherDetails : findAll()) {
			remove(filmOtherDetails);
		}
	}

	/**
	 * Returns the number of film other detailses.
	 *
	 * @return the number of film other detailses
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_FILMOTHERDETAILS);

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
		return "filmOtherDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMOTHERDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmOtherDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film other details persistence.
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

		FilmOtherDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmOtherDetailsUtil.setPersistence(null);

		entityCache.removeCache(FilmOtherDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMOTHERDETAILS =
		"SELECT filmOtherDetails FROM FilmOtherDetails filmOtherDetails";

	private static final String _SQL_SELECT_FILMOTHERDETAILS_WHERE =
		"SELECT filmOtherDetails FROM FilmOtherDetails filmOtherDetails WHERE ";

	private static final String _SQL_COUNT_FILMOTHERDETAILS =
		"SELECT COUNT(filmOtherDetails) FROM FilmOtherDetails filmOtherDetails";

	private static final String _SQL_COUNT_FILMOTHERDETAILS_WHERE =
		"SELECT COUNT(filmOtherDetails) FROM FilmOtherDetails filmOtherDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "filmOtherDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmOtherDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmOtherDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmOtherDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
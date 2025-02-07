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

import com.nbp.film.application.form.service.exception.NoSuchFilmProductionDetailsException;
import com.nbp.film.application.form.service.model.FilmProductionDetails;
import com.nbp.film.application.form.service.model.FilmProductionDetailsTable;
import com.nbp.film.application.form.service.model.impl.FilmProductionDetailsImpl;
import com.nbp.film.application.form.service.model.impl.FilmProductionDetailsModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmProductionDetailsPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmProductionDetailsUtil;
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
 * The persistence implementation for the film production details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmProductionDetailsPersistence.class)
public class FilmProductionDetailsPersistenceImpl
	extends BasePersistenceImpl<FilmProductionDetails>
	implements FilmProductionDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmProductionDetailsUtil</code> to access the film production details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmProductionDetailsImpl.class.getName();

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
	 * Returns the film production details where filmApplicationId = &#63; or throws a <code>NoSuchFilmProductionDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film production details
	 * @throws NoSuchFilmProductionDetailsException if a matching film production details could not be found
	 */
	@Override
	public FilmProductionDetails findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmProductionDetailsException {

		FilmProductionDetails filmProductionDetails = fetchBygetFilmById(
			filmApplicationId);

		if (filmProductionDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmProductionDetailsException(sb.toString());
		}

		return filmProductionDetails;
	}

	/**
	 * Returns the film production details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film production details, or <code>null</code> if a matching film production details could not be found
	 */
	@Override
	public FilmProductionDetails fetchBygetFilmById(long filmApplicationId) {
		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film production details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film production details, or <code>null</code> if a matching film production details could not be found
	 */
	@Override
	public FilmProductionDetails fetchBygetFilmById(
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

		if (result instanceof FilmProductionDetails) {
			FilmProductionDetails filmProductionDetails =
				(FilmProductionDetails)result;

			if (filmApplicationId !=
					filmProductionDetails.getFilmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMPRODUCTIONDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmProductionDetails> list = query.list();

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
								"FilmProductionDetailsPersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmProductionDetails filmProductionDetails = list.get(0);

					result = filmProductionDetails;

					cacheResult(filmProductionDetails);
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
			return (FilmProductionDetails)result;
		}
	}

	/**
	 * Removes the film production details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film production details that was removed
	 */
	@Override
	public FilmProductionDetails removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmProductionDetailsException {

		FilmProductionDetails filmProductionDetails = findBygetFilmById(
			filmApplicationId);

		return remove(filmProductionDetails);
	}

	/**
	 * Returns the number of film production detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film production detailses
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMPRODUCTIONDETAILS_WHERE);

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
		"filmProductionDetails.filmApplicationId = ?";

	public FilmProductionDetailsPersistenceImpl() {
		setModelClass(FilmProductionDetails.class);

		setModelImplClass(FilmProductionDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(FilmProductionDetailsTable.INSTANCE);
	}

	/**
	 * Caches the film production details in the entity cache if it is enabled.
	 *
	 * @param filmProductionDetails the film production details
	 */
	@Override
	public void cacheResult(FilmProductionDetails filmProductionDetails) {
		entityCache.putResult(
			FilmProductionDetailsImpl.class,
			filmProductionDetails.getPrimaryKey(), filmProductionDetails);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmProductionDetails.getFilmApplicationId()},
			filmProductionDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film production detailses in the entity cache if it is enabled.
	 *
	 * @param filmProductionDetailses the film production detailses
	 */
	@Override
	public void cacheResult(
		List<FilmProductionDetails> filmProductionDetailses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmProductionDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmProductionDetails filmProductionDetails :
				filmProductionDetailses) {

			if (entityCache.getResult(
					FilmProductionDetailsImpl.class,
					filmProductionDetails.getPrimaryKey()) == null) {

				cacheResult(filmProductionDetails);
			}
		}
	}

	/**
	 * Clears the cache for all film production detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmProductionDetailsImpl.class);

		finderCache.clearCache(FilmProductionDetailsImpl.class);
	}

	/**
	 * Clears the cache for the film production details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmProductionDetails filmProductionDetails) {
		entityCache.removeResult(
			FilmProductionDetailsImpl.class, filmProductionDetails);
	}

	@Override
	public void clearCache(
		List<FilmProductionDetails> filmProductionDetailses) {

		for (FilmProductionDetails filmProductionDetails :
				filmProductionDetailses) {

			entityCache.removeResult(
				FilmProductionDetailsImpl.class, filmProductionDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmProductionDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmProductionDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmProductionDetailsModelImpl filmProductionDetailsModelImpl) {

		Object[] args = new Object[] {
			filmProductionDetailsModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args,
			filmProductionDetailsModelImpl);
	}

	/**
	 * Creates a new film production details with the primary key. Does not add the film production details to the database.
	 *
	 * @param filmProductionDetailsId the primary key for the new film production details
	 * @return the new film production details
	 */
	@Override
	public FilmProductionDetails create(long filmProductionDetailsId) {
		FilmProductionDetails filmProductionDetails =
			new FilmProductionDetailsImpl();

		filmProductionDetails.setNew(true);
		filmProductionDetails.setPrimaryKey(filmProductionDetailsId);

		filmProductionDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmProductionDetails;
	}

	/**
	 * Removes the film production details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details that was removed
	 * @throws NoSuchFilmProductionDetailsException if a film production details with the primary key could not be found
	 */
	@Override
	public FilmProductionDetails remove(long filmProductionDetailsId)
		throws NoSuchFilmProductionDetailsException {

		return remove((Serializable)filmProductionDetailsId);
	}

	/**
	 * Removes the film production details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film production details
	 * @return the film production details that was removed
	 * @throws NoSuchFilmProductionDetailsException if a film production details with the primary key could not be found
	 */
	@Override
	public FilmProductionDetails remove(Serializable primaryKey)
		throws NoSuchFilmProductionDetailsException {

		Session session = null;

		try {
			session = openSession();

			FilmProductionDetails filmProductionDetails =
				(FilmProductionDetails)session.get(
					FilmProductionDetailsImpl.class, primaryKey);

			if (filmProductionDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmProductionDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmProductionDetails);
		}
		catch (NoSuchFilmProductionDetailsException noSuchEntityException) {
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
	protected FilmProductionDetails removeImpl(
		FilmProductionDetails filmProductionDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmProductionDetails)) {
				filmProductionDetails = (FilmProductionDetails)session.get(
					FilmProductionDetailsImpl.class,
					filmProductionDetails.getPrimaryKeyObj());
			}

			if (filmProductionDetails != null) {
				session.delete(filmProductionDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmProductionDetails != null) {
			clearCache(filmProductionDetails);
		}

		return filmProductionDetails;
	}

	@Override
	public FilmProductionDetails updateImpl(
		FilmProductionDetails filmProductionDetails) {

		boolean isNew = filmProductionDetails.isNew();

		if (!(filmProductionDetails instanceof
				FilmProductionDetailsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmProductionDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmProductionDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmProductionDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmProductionDetails implementation " +
					filmProductionDetails.getClass());
		}

		FilmProductionDetailsModelImpl filmProductionDetailsModelImpl =
			(FilmProductionDetailsModelImpl)filmProductionDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmProductionDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmProductionDetails.setCreateDate(date);
			}
			else {
				filmProductionDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmProductionDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmProductionDetails.setModifiedDate(date);
			}
			else {
				filmProductionDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmProductionDetails);
			}
			else {
				filmProductionDetails = (FilmProductionDetails)session.merge(
					filmProductionDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmProductionDetailsImpl.class, filmProductionDetailsModelImpl,
			false, true);

		cacheUniqueFindersCache(filmProductionDetailsModelImpl);

		if (isNew) {
			filmProductionDetails.setNew(false);
		}

		filmProductionDetails.resetOriginalValues();

		return filmProductionDetails;
	}

	/**
	 * Returns the film production details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film production details
	 * @return the film production details
	 * @throws NoSuchFilmProductionDetailsException if a film production details with the primary key could not be found
	 */
	@Override
	public FilmProductionDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmProductionDetailsException {

		FilmProductionDetails filmProductionDetails = fetchByPrimaryKey(
			primaryKey);

		if (filmProductionDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmProductionDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmProductionDetails;
	}

	/**
	 * Returns the film production details with the primary key or throws a <code>NoSuchFilmProductionDetailsException</code> if it could not be found.
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details
	 * @throws NoSuchFilmProductionDetailsException if a film production details with the primary key could not be found
	 */
	@Override
	public FilmProductionDetails findByPrimaryKey(long filmProductionDetailsId)
		throws NoSuchFilmProductionDetailsException {

		return findByPrimaryKey((Serializable)filmProductionDetailsId);
	}

	/**
	 * Returns the film production details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmProductionDetailsId the primary key of the film production details
	 * @return the film production details, or <code>null</code> if a film production details with the primary key could not be found
	 */
	@Override
	public FilmProductionDetails fetchByPrimaryKey(
		long filmProductionDetailsId) {

		return fetchByPrimaryKey((Serializable)filmProductionDetailsId);
	}

	/**
	 * Returns all the film production detailses.
	 *
	 * @return the film production detailses
	 */
	@Override
	public List<FilmProductionDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film production detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmProductionDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film production detailses
	 * @param end the upper bound of the range of film production detailses (not inclusive)
	 * @return the range of film production detailses
	 */
	@Override
	public List<FilmProductionDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film production detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmProductionDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film production detailses
	 * @param end the upper bound of the range of film production detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film production detailses
	 */
	@Override
	public List<FilmProductionDetails> findAll(
		int start, int end,
		OrderByComparator<FilmProductionDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film production detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmProductionDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film production detailses
	 * @param end the upper bound of the range of film production detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film production detailses
	 */
	@Override
	public List<FilmProductionDetails> findAll(
		int start, int end,
		OrderByComparator<FilmProductionDetails> orderByComparator,
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

		List<FilmProductionDetails> list = null;

		if (useFinderCache) {
			list = (List<FilmProductionDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMPRODUCTIONDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMPRODUCTIONDETAILS;

				sql = sql.concat(FilmProductionDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmProductionDetails>)QueryUtil.list(
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
	 * Removes all the film production detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmProductionDetails filmProductionDetails : findAll()) {
			remove(filmProductionDetails);
		}
	}

	/**
	 * Returns the number of film production detailses.
	 *
	 * @return the number of film production detailses
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
					_SQL_COUNT_FILMPRODUCTIONDETAILS);

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
		return "filmProductionDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMPRODUCTIONDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmProductionDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film production details persistence.
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

		FilmProductionDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmProductionDetailsUtil.setPersistence(null);

		entityCache.removeCache(FilmProductionDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMPRODUCTIONDETAILS =
		"SELECT filmProductionDetails FROM FilmProductionDetails filmProductionDetails";

	private static final String _SQL_SELECT_FILMPRODUCTIONDETAILS_WHERE =
		"SELECT filmProductionDetails FROM FilmProductionDetails filmProductionDetails WHERE ";

	private static final String _SQL_COUNT_FILMPRODUCTIONDETAILS =
		"SELECT COUNT(filmProductionDetails) FROM FilmProductionDetails filmProductionDetails";

	private static final String _SQL_COUNT_FILMPRODUCTIONDETAILS_WHERE =
		"SELECT COUNT(filmProductionDetails) FROM FilmProductionDetails filmProductionDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmProductionDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmProductionDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmProductionDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmProductionDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
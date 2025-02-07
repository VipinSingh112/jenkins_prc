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

import com.nbp.film.application.form.service.exception.NoSuchFilmApplicationCurrentStageException;
import com.nbp.film.application.form.service.model.FilmApplicationCurrentStage;
import com.nbp.film.application.form.service.model.FilmApplicationCurrentStageTable;
import com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageImpl;
import com.nbp.film.application.form.service.model.impl.FilmApplicationCurrentStageModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationCurrentStagePersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationCurrentStageUtil;
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
 * The persistence implementation for the film application current stage service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmApplicationCurrentStagePersistence.class)
public class FilmApplicationCurrentStagePersistenceImpl
	extends BasePersistenceImpl<FilmApplicationCurrentStage>
	implements FilmApplicationCurrentStagePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmApplicationCurrentStageUtil</code> to access the film application current stage persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmApplicationCurrentStageImpl.class.getName();

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
	 * Returns the film application current stage where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application current stage
	 * @throws NoSuchFilmApplicationCurrentStageException if a matching film application current stage could not be found
	 */
	@Override
	public FilmApplicationCurrentStage findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmApplicationCurrentStageException {

		FilmApplicationCurrentStage filmApplicationCurrentStage =
			fetchBygetFilmById(filmApplicationId);

		if (filmApplicationCurrentStage == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationCurrentStageException(sb.toString());
		}

		return filmApplicationCurrentStage;
	}

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application current stage, or <code>null</code> if a matching film application current stage could not be found
	 */
	@Override
	public FilmApplicationCurrentStage fetchBygetFilmById(
		long filmApplicationId) {

		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film application current stage where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application current stage, or <code>null</code> if a matching film application current stage could not be found
	 */
	@Override
	public FilmApplicationCurrentStage fetchBygetFilmById(
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

		if (result instanceof FilmApplicationCurrentStage) {
			FilmApplicationCurrentStage filmApplicationCurrentStage =
				(FilmApplicationCurrentStage)result;

			if (filmApplicationId !=
					filmApplicationCurrentStage.getFilmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMAPPLICATIONCURRENTSTAGE_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmApplicationCurrentStage> list = query.list();

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
								"FilmApplicationCurrentStagePersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplicationCurrentStage filmApplicationCurrentStage =
						list.get(0);

					result = filmApplicationCurrentStage;

					cacheResult(filmApplicationCurrentStage);
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
			return (FilmApplicationCurrentStage)result;
		}
	}

	/**
	 * Removes the film application current stage where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application current stage that was removed
	 */
	@Override
	public FilmApplicationCurrentStage removeBygetFilmById(
			long filmApplicationId)
		throws NoSuchFilmApplicationCurrentStageException {

		FilmApplicationCurrentStage filmApplicationCurrentStage =
			findBygetFilmById(filmApplicationId);

		return remove(filmApplicationCurrentStage);
	}

	/**
	 * Returns the number of film application current stages where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application current stages
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATIONCURRENTSTAGE_WHERE);

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
		"filmApplicationCurrentStage.filmApplicationId = ?";

	public FilmApplicationCurrentStagePersistenceImpl() {
		setModelClass(FilmApplicationCurrentStage.class);

		setModelImplClass(FilmApplicationCurrentStageImpl.class);
		setModelPKClass(long.class);

		setTable(FilmApplicationCurrentStageTable.INSTANCE);
	}

	/**
	 * Caches the film application current stage in the entity cache if it is enabled.
	 *
	 * @param filmApplicationCurrentStage the film application current stage
	 */
	@Override
	public void cacheResult(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		entityCache.putResult(
			FilmApplicationCurrentStageImpl.class,
			filmApplicationCurrentStage.getPrimaryKey(),
			filmApplicationCurrentStage);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmApplicationCurrentStage.getFilmApplicationId()},
			filmApplicationCurrentStage);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film application current stages in the entity cache if it is enabled.
	 *
	 * @param filmApplicationCurrentStages the film application current stages
	 */
	@Override
	public void cacheResult(
		List<FilmApplicationCurrentStage> filmApplicationCurrentStages) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmApplicationCurrentStages.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmApplicationCurrentStage filmApplicationCurrentStage :
				filmApplicationCurrentStages) {

			if (entityCache.getResult(
					FilmApplicationCurrentStageImpl.class,
					filmApplicationCurrentStage.getPrimaryKey()) == null) {

				cacheResult(filmApplicationCurrentStage);
			}
		}
	}

	/**
	 * Clears the cache for all film application current stages.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmApplicationCurrentStageImpl.class);

		finderCache.clearCache(FilmApplicationCurrentStageImpl.class);
	}

	/**
	 * Clears the cache for the film application current stage.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		entityCache.removeResult(
			FilmApplicationCurrentStageImpl.class, filmApplicationCurrentStage);
	}

	@Override
	public void clearCache(
		List<FilmApplicationCurrentStage> filmApplicationCurrentStages) {

		for (FilmApplicationCurrentStage filmApplicationCurrentStage :
				filmApplicationCurrentStages) {

			entityCache.removeResult(
				FilmApplicationCurrentStageImpl.class,
				filmApplicationCurrentStage);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmApplicationCurrentStageImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmApplicationCurrentStageImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmApplicationCurrentStageModelImpl
			filmApplicationCurrentStageModelImpl) {

		Object[] args = new Object[] {
			filmApplicationCurrentStageModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args,
			filmApplicationCurrentStageModelImpl);
	}

	/**
	 * Creates a new film application current stage with the primary key. Does not add the film application current stage to the database.
	 *
	 * @param filmApplicationCurrentStageId the primary key for the new film application current stage
	 * @return the new film application current stage
	 */
	@Override
	public FilmApplicationCurrentStage create(
		long filmApplicationCurrentStageId) {

		FilmApplicationCurrentStage filmApplicationCurrentStage =
			new FilmApplicationCurrentStageImpl();

		filmApplicationCurrentStage.setNew(true);
		filmApplicationCurrentStage.setPrimaryKey(
			filmApplicationCurrentStageId);

		filmApplicationCurrentStage.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return filmApplicationCurrentStage;
	}

	/**
	 * Removes the film application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage that was removed
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	@Override
	public FilmApplicationCurrentStage remove(
			long filmApplicationCurrentStageId)
		throws NoSuchFilmApplicationCurrentStageException {

		return remove((Serializable)filmApplicationCurrentStageId);
	}

	/**
	 * Removes the film application current stage with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film application current stage
	 * @return the film application current stage that was removed
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	@Override
	public FilmApplicationCurrentStage remove(Serializable primaryKey)
		throws NoSuchFilmApplicationCurrentStageException {

		Session session = null;

		try {
			session = openSession();

			FilmApplicationCurrentStage filmApplicationCurrentStage =
				(FilmApplicationCurrentStage)session.get(
					FilmApplicationCurrentStageImpl.class, primaryKey);

			if (filmApplicationCurrentStage == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmApplicationCurrentStageException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmApplicationCurrentStage);
		}
		catch (NoSuchFilmApplicationCurrentStageException
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
	protected FilmApplicationCurrentStage removeImpl(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmApplicationCurrentStage)) {
				filmApplicationCurrentStage =
					(FilmApplicationCurrentStage)session.get(
						FilmApplicationCurrentStageImpl.class,
						filmApplicationCurrentStage.getPrimaryKeyObj());
			}

			if (filmApplicationCurrentStage != null) {
				session.delete(filmApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmApplicationCurrentStage != null) {
			clearCache(filmApplicationCurrentStage);
		}

		return filmApplicationCurrentStage;
	}

	@Override
	public FilmApplicationCurrentStage updateImpl(
		FilmApplicationCurrentStage filmApplicationCurrentStage) {

		boolean isNew = filmApplicationCurrentStage.isNew();

		if (!(filmApplicationCurrentStage instanceof
				FilmApplicationCurrentStageModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					filmApplicationCurrentStage.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					filmApplicationCurrentStage);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmApplicationCurrentStage proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmApplicationCurrentStage implementation " +
					filmApplicationCurrentStage.getClass());
		}

		FilmApplicationCurrentStageModelImpl
			filmApplicationCurrentStageModelImpl =
				(FilmApplicationCurrentStageModelImpl)
					filmApplicationCurrentStage;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmApplicationCurrentStage.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmApplicationCurrentStage.setCreateDate(date);
			}
			else {
				filmApplicationCurrentStage.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmApplicationCurrentStageModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmApplicationCurrentStage.setModifiedDate(date);
			}
			else {
				filmApplicationCurrentStage.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmApplicationCurrentStage);
			}
			else {
				filmApplicationCurrentStage =
					(FilmApplicationCurrentStage)session.merge(
						filmApplicationCurrentStage);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmApplicationCurrentStageImpl.class,
			filmApplicationCurrentStageModelImpl, false, true);

		cacheUniqueFindersCache(filmApplicationCurrentStageModelImpl);

		if (isNew) {
			filmApplicationCurrentStage.setNew(false);
		}

		filmApplicationCurrentStage.resetOriginalValues();

		return filmApplicationCurrentStage;
	}

	/**
	 * Returns the film application current stage with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film application current stage
	 * @return the film application current stage
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	@Override
	public FilmApplicationCurrentStage findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmApplicationCurrentStageException {

		FilmApplicationCurrentStage filmApplicationCurrentStage =
			fetchByPrimaryKey(primaryKey);

		if (filmApplicationCurrentStage == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmApplicationCurrentStageException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmApplicationCurrentStage;
	}

	/**
	 * Returns the film application current stage with the primary key or throws a <code>NoSuchFilmApplicationCurrentStageException</code> if it could not be found.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage
	 * @throws NoSuchFilmApplicationCurrentStageException if a film application current stage with the primary key could not be found
	 */
	@Override
	public FilmApplicationCurrentStage findByPrimaryKey(
			long filmApplicationCurrentStageId)
		throws NoSuchFilmApplicationCurrentStageException {

		return findByPrimaryKey((Serializable)filmApplicationCurrentStageId);
	}

	/**
	 * Returns the film application current stage with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationCurrentStageId the primary key of the film application current stage
	 * @return the film application current stage, or <code>null</code> if a film application current stage with the primary key could not be found
	 */
	@Override
	public FilmApplicationCurrentStage fetchByPrimaryKey(
		long filmApplicationCurrentStageId) {

		return fetchByPrimaryKey((Serializable)filmApplicationCurrentStageId);
	}

	/**
	 * Returns all the film application current stages.
	 *
	 * @return the film application current stages
	 */
	@Override
	public List<FilmApplicationCurrentStage> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @return the range of film application current stages
	 */
	@Override
	public List<FilmApplicationCurrentStage> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application current stages
	 */
	@Override
	public List<FilmApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationCurrentStage> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film application current stages.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationCurrentStageModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application current stages
	 * @param end the upper bound of the range of film application current stages (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application current stages
	 */
	@Override
	public List<FilmApplicationCurrentStage> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationCurrentStage> orderByComparator,
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

		List<FilmApplicationCurrentStage> list = null;

		if (useFinderCache) {
			list = (List<FilmApplicationCurrentStage>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMAPPLICATIONCURRENTSTAGE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMAPPLICATIONCURRENTSTAGE;

				sql = sql.concat(
					FilmApplicationCurrentStageModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmApplicationCurrentStage>)QueryUtil.list(
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
	 * Removes all the film application current stages from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmApplicationCurrentStage filmApplicationCurrentStage :
				findAll()) {

			remove(filmApplicationCurrentStage);
		}
	}

	/**
	 * Returns the number of film application current stages.
	 *
	 * @return the number of film application current stages
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
					_SQL_COUNT_FILMAPPLICATIONCURRENTSTAGE);

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
		return "filmApplicationCurrentStageId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMAPPLICATIONCURRENTSTAGE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmApplicationCurrentStageModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film application current stage persistence.
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

		FilmApplicationCurrentStageUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmApplicationCurrentStageUtil.setPersistence(null);

		entityCache.removeCache(
			FilmApplicationCurrentStageImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMAPPLICATIONCURRENTSTAGE =
		"SELECT filmApplicationCurrentStage FROM FilmApplicationCurrentStage filmApplicationCurrentStage";

	private static final String _SQL_SELECT_FILMAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT filmApplicationCurrentStage FROM FilmApplicationCurrentStage filmApplicationCurrentStage WHERE ";

	private static final String _SQL_COUNT_FILMAPPLICATIONCURRENTSTAGE =
		"SELECT COUNT(filmApplicationCurrentStage) FROM FilmApplicationCurrentStage filmApplicationCurrentStage";

	private static final String _SQL_COUNT_FILMAPPLICATIONCURRENTSTAGE_WHERE =
		"SELECT COUNT(filmApplicationCurrentStage) FROM FilmApplicationCurrentStage filmApplicationCurrentStage WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmApplicationCurrentStage.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmApplicationCurrentStage exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmApplicationCurrentStage exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmApplicationCurrentStagePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
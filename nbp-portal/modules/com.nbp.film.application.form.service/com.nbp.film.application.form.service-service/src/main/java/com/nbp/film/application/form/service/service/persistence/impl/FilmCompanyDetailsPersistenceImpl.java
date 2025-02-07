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

import com.nbp.film.application.form.service.exception.NoSuchFilmCompanyDetailsException;
import com.nbp.film.application.form.service.model.FilmCompanyDetails;
import com.nbp.film.application.form.service.model.FilmCompanyDetailsTable;
import com.nbp.film.application.form.service.model.impl.FilmCompanyDetailsImpl;
import com.nbp.film.application.form.service.model.impl.FilmCompanyDetailsModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmCompanyDetailsPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmCompanyDetailsUtil;
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
 * The persistence implementation for the film company details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmCompanyDetailsPersistence.class)
public class FilmCompanyDetailsPersistenceImpl
	extends BasePersistenceImpl<FilmCompanyDetails>
	implements FilmCompanyDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmCompanyDetailsUtil</code> to access the film company details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmCompanyDetailsImpl.class.getName();

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
	 * Returns the film company details where filmApplicationId = &#63; or throws a <code>NoSuchFilmCompanyDetailsException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film company details
	 * @throws NoSuchFilmCompanyDetailsException if a matching film company details could not be found
	 */
	@Override
	public FilmCompanyDetails findBygetFilmById(long filmApplicationId)
		throws NoSuchFilmCompanyDetailsException {

		FilmCompanyDetails filmCompanyDetails = fetchBygetFilmById(
			filmApplicationId);

		if (filmCompanyDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmCompanyDetailsException(sb.toString());
		}

		return filmCompanyDetails;
	}

	/**
	 * Returns the film company details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film company details, or <code>null</code> if a matching film company details could not be found
	 */
	@Override
	public FilmCompanyDetails fetchBygetFilmById(long filmApplicationId) {
		return fetchBygetFilmById(filmApplicationId, true);
	}

	/**
	 * Returns the film company details where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film company details, or <code>null</code> if a matching film company details could not be found
	 */
	@Override
	public FilmCompanyDetails fetchBygetFilmById(
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

		if (result instanceof FilmCompanyDetails) {
			FilmCompanyDetails filmCompanyDetails = (FilmCompanyDetails)result;

			if (filmApplicationId !=
					filmCompanyDetails.getFilmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMCOMPANYDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETFILMBYID_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmCompanyDetails> list = query.list();

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
								"FilmCompanyDetailsPersistenceImpl.fetchBygetFilmById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmCompanyDetails filmCompanyDetails = list.get(0);

					result = filmCompanyDetails;

					cacheResult(filmCompanyDetails);
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
			return (FilmCompanyDetails)result;
		}
	}

	/**
	 * Removes the film company details where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film company details that was removed
	 */
	@Override
	public FilmCompanyDetails removeBygetFilmById(long filmApplicationId)
		throws NoSuchFilmCompanyDetailsException {

		FilmCompanyDetails filmCompanyDetails = findBygetFilmById(
			filmApplicationId);

		return remove(filmCompanyDetails);
	}

	/**
	 * Returns the number of film company detailses where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film company detailses
	 */
	@Override
	public int countBygetFilmById(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilmById;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMCOMPANYDETAILS_WHERE);

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
		"filmCompanyDetails.filmApplicationId = ?";

	public FilmCompanyDetailsPersistenceImpl() {
		setModelClass(FilmCompanyDetails.class);

		setModelImplClass(FilmCompanyDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(FilmCompanyDetailsTable.INSTANCE);
	}

	/**
	 * Caches the film company details in the entity cache if it is enabled.
	 *
	 * @param filmCompanyDetails the film company details
	 */
	@Override
	public void cacheResult(FilmCompanyDetails filmCompanyDetails) {
		entityCache.putResult(
			FilmCompanyDetailsImpl.class, filmCompanyDetails.getPrimaryKey(),
			filmCompanyDetails);

		finderCache.putResult(
			_finderPathFetchBygetFilmById,
			new Object[] {filmCompanyDetails.getFilmApplicationId()},
			filmCompanyDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film company detailses in the entity cache if it is enabled.
	 *
	 * @param filmCompanyDetailses the film company detailses
	 */
	@Override
	public void cacheResult(List<FilmCompanyDetails> filmCompanyDetailses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmCompanyDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmCompanyDetails filmCompanyDetails : filmCompanyDetailses) {
			if (entityCache.getResult(
					FilmCompanyDetailsImpl.class,
					filmCompanyDetails.getPrimaryKey()) == null) {

				cacheResult(filmCompanyDetails);
			}
		}
	}

	/**
	 * Clears the cache for all film company detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmCompanyDetailsImpl.class);

		finderCache.clearCache(FilmCompanyDetailsImpl.class);
	}

	/**
	 * Clears the cache for the film company details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmCompanyDetails filmCompanyDetails) {
		entityCache.removeResult(
			FilmCompanyDetailsImpl.class, filmCompanyDetails);
	}

	@Override
	public void clearCache(List<FilmCompanyDetails> filmCompanyDetailses) {
		for (FilmCompanyDetails filmCompanyDetails : filmCompanyDetailses) {
			entityCache.removeResult(
				FilmCompanyDetailsImpl.class, filmCompanyDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmCompanyDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(FilmCompanyDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmCompanyDetailsModelImpl filmCompanyDetailsModelImpl) {

		Object[] args = new Object[] {
			filmCompanyDetailsModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilmById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilmById, args, filmCompanyDetailsModelImpl);
	}

	/**
	 * Creates a new film company details with the primary key. Does not add the film company details to the database.
	 *
	 * @param filmCompanyDetailsId the primary key for the new film company details
	 * @return the new film company details
	 */
	@Override
	public FilmCompanyDetails create(long filmCompanyDetailsId) {
		FilmCompanyDetails filmCompanyDetails = new FilmCompanyDetailsImpl();

		filmCompanyDetails.setNew(true);
		filmCompanyDetails.setPrimaryKey(filmCompanyDetailsId);

		filmCompanyDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmCompanyDetails;
	}

	/**
	 * Removes the film company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details that was removed
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	@Override
	public FilmCompanyDetails remove(long filmCompanyDetailsId)
		throws NoSuchFilmCompanyDetailsException {

		return remove((Serializable)filmCompanyDetailsId);
	}

	/**
	 * Removes the film company details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film company details
	 * @return the film company details that was removed
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	@Override
	public FilmCompanyDetails remove(Serializable primaryKey)
		throws NoSuchFilmCompanyDetailsException {

		Session session = null;

		try {
			session = openSession();

			FilmCompanyDetails filmCompanyDetails =
				(FilmCompanyDetails)session.get(
					FilmCompanyDetailsImpl.class, primaryKey);

			if (filmCompanyDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmCompanyDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmCompanyDetails);
		}
		catch (NoSuchFilmCompanyDetailsException noSuchEntityException) {
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
	protected FilmCompanyDetails removeImpl(
		FilmCompanyDetails filmCompanyDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmCompanyDetails)) {
				filmCompanyDetails = (FilmCompanyDetails)session.get(
					FilmCompanyDetailsImpl.class,
					filmCompanyDetails.getPrimaryKeyObj());
			}

			if (filmCompanyDetails != null) {
				session.delete(filmCompanyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmCompanyDetails != null) {
			clearCache(filmCompanyDetails);
		}

		return filmCompanyDetails;
	}

	@Override
	public FilmCompanyDetails updateImpl(
		FilmCompanyDetails filmCompanyDetails) {

		boolean isNew = filmCompanyDetails.isNew();

		if (!(filmCompanyDetails instanceof FilmCompanyDetailsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmCompanyDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmCompanyDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmCompanyDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmCompanyDetails implementation " +
					filmCompanyDetails.getClass());
		}

		FilmCompanyDetailsModelImpl filmCompanyDetailsModelImpl =
			(FilmCompanyDetailsModelImpl)filmCompanyDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmCompanyDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmCompanyDetails.setCreateDate(date);
			}
			else {
				filmCompanyDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmCompanyDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmCompanyDetails.setModifiedDate(date);
			}
			else {
				filmCompanyDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmCompanyDetails);
			}
			else {
				filmCompanyDetails = (FilmCompanyDetails)session.merge(
					filmCompanyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmCompanyDetailsImpl.class, filmCompanyDetailsModelImpl, false,
			true);

		cacheUniqueFindersCache(filmCompanyDetailsModelImpl);

		if (isNew) {
			filmCompanyDetails.setNew(false);
		}

		filmCompanyDetails.resetOriginalValues();

		return filmCompanyDetails;
	}

	/**
	 * Returns the film company details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film company details
	 * @return the film company details
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	@Override
	public FilmCompanyDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmCompanyDetailsException {

		FilmCompanyDetails filmCompanyDetails = fetchByPrimaryKey(primaryKey);

		if (filmCompanyDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmCompanyDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmCompanyDetails;
	}

	/**
	 * Returns the film company details with the primary key or throws a <code>NoSuchFilmCompanyDetailsException</code> if it could not be found.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details
	 * @throws NoSuchFilmCompanyDetailsException if a film company details with the primary key could not be found
	 */
	@Override
	public FilmCompanyDetails findByPrimaryKey(long filmCompanyDetailsId)
		throws NoSuchFilmCompanyDetailsException {

		return findByPrimaryKey((Serializable)filmCompanyDetailsId);
	}

	/**
	 * Returns the film company details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmCompanyDetailsId the primary key of the film company details
	 * @return the film company details, or <code>null</code> if a film company details with the primary key could not be found
	 */
	@Override
	public FilmCompanyDetails fetchByPrimaryKey(long filmCompanyDetailsId) {
		return fetchByPrimaryKey((Serializable)filmCompanyDetailsId);
	}

	/**
	 * Returns all the film company detailses.
	 *
	 * @return the film company detailses
	 */
	@Override
	public List<FilmCompanyDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film company detailses
	 * @param end the upper bound of the range of film company detailses (not inclusive)
	 * @return the range of film company detailses
	 */
	@Override
	public List<FilmCompanyDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film company detailses
	 * @param end the upper bound of the range of film company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film company detailses
	 */
	@Override
	public List<FilmCompanyDetails> findAll(
		int start, int end,
		OrderByComparator<FilmCompanyDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film company detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmCompanyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film company detailses
	 * @param end the upper bound of the range of film company detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film company detailses
	 */
	@Override
	public List<FilmCompanyDetails> findAll(
		int start, int end,
		OrderByComparator<FilmCompanyDetails> orderByComparator,
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

		List<FilmCompanyDetails> list = null;

		if (useFinderCache) {
			list = (List<FilmCompanyDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMCOMPANYDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMCOMPANYDETAILS;

				sql = sql.concat(FilmCompanyDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmCompanyDetails>)QueryUtil.list(
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
	 * Removes all the film company detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmCompanyDetails filmCompanyDetails : findAll()) {
			remove(filmCompanyDetails);
		}
	}

	/**
	 * Returns the number of film company detailses.
	 *
	 * @return the number of film company detailses
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
					_SQL_COUNT_FILMCOMPANYDETAILS);

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
		return "filmCompanyDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMCOMPANYDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmCompanyDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film company details persistence.
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

		FilmCompanyDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmCompanyDetailsUtil.setPersistence(null);

		entityCache.removeCache(FilmCompanyDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMCOMPANYDETAILS =
		"SELECT filmCompanyDetails FROM FilmCompanyDetails filmCompanyDetails";

	private static final String _SQL_SELECT_FILMCOMPANYDETAILS_WHERE =
		"SELECT filmCompanyDetails FROM FilmCompanyDetails filmCompanyDetails WHERE ";

	private static final String _SQL_COUNT_FILMCOMPANYDETAILS =
		"SELECT COUNT(filmCompanyDetails) FROM FilmCompanyDetails filmCompanyDetails";

	private static final String _SQL_COUNT_FILMCOMPANYDETAILS_WHERE =
		"SELECT COUNT(filmCompanyDetails) FROM FilmCompanyDetails filmCompanyDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "filmCompanyDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmCompanyDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmCompanyDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmCompanyDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
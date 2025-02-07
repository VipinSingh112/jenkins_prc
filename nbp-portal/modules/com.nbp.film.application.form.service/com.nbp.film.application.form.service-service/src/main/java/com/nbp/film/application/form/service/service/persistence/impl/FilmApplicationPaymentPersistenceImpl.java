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

import com.nbp.film.application.form.service.exception.NoSuchFilmApplicationPaymentException;
import com.nbp.film.application.form.service.model.FilmApplicationPayment;
import com.nbp.film.application.form.service.model.FilmApplicationPaymentTable;
import com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentImpl;
import com.nbp.film.application.form.service.model.impl.FilmApplicationPaymentModelImpl;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationPaymentPersistence;
import com.nbp.film.application.form.service.service.persistence.FilmApplicationPaymentUtil;
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
 * The persistence implementation for the film application payment service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FilmApplicationPaymentPersistence.class)
public class FilmApplicationPaymentPersistenceImpl
	extends BasePersistenceImpl<FilmApplicationPayment>
	implements FilmApplicationPaymentPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FilmApplicationPaymentUtil</code> to access the film application payment persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FilmApplicationPaymentImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFilm_Fee_Pay_FAI;
	private FinderPath _finderPathCountBygetFilm_Fee_Pay_FAI;

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or throws a <code>NoSuchFilmApplicationPaymentException</code> if it could not be found.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application payment
	 * @throws NoSuchFilmApplicationPaymentException if a matching film application payment could not be found
	 */
	@Override
	public FilmApplicationPayment findBygetFilm_Fee_Pay_FAI(
			long filmApplicationId)
		throws NoSuchFilmApplicationPaymentException {

		FilmApplicationPayment filmApplicationPayment =
			fetchBygetFilm_Fee_Pay_FAI(filmApplicationId);

		if (filmApplicationPayment == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("filmApplicationId=");
			sb.append(filmApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFilmApplicationPaymentException(sb.toString());
		}

		return filmApplicationPayment;
	}

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the matching film application payment, or <code>null</code> if a matching film application payment could not be found
	 */
	@Override
	public FilmApplicationPayment fetchBygetFilm_Fee_Pay_FAI(
		long filmApplicationId) {

		return fetchBygetFilm_Fee_Pay_FAI(filmApplicationId, true);
	}

	/**
	 * Returns the film application payment where filmApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param filmApplicationId the film application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching film application payment, or <code>null</code> if a matching film application payment could not be found
	 */
	@Override
	public FilmApplicationPayment fetchBygetFilm_Fee_Pay_FAI(
		long filmApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {filmApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFilm_Fee_Pay_FAI, finderArgs, this);
		}

		if (result instanceof FilmApplicationPayment) {
			FilmApplicationPayment filmApplicationPayment =
				(FilmApplicationPayment)result;

			if (filmApplicationId !=
					filmApplicationPayment.getFilmApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FILMAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETFILM_FEE_PAY_FAI_FILMAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(filmApplicationId);

				List<FilmApplicationPayment> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFilm_Fee_Pay_FAI, finderArgs,
							list);
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
								"FilmApplicationPaymentPersistenceImpl.fetchBygetFilm_Fee_Pay_FAI(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FilmApplicationPayment filmApplicationPayment = list.get(0);

					result = filmApplicationPayment;

					cacheResult(filmApplicationPayment);
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
			return (FilmApplicationPayment)result;
		}
	}

	/**
	 * Removes the film application payment where filmApplicationId = &#63; from the database.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the film application payment that was removed
	 */
	@Override
	public FilmApplicationPayment removeBygetFilm_Fee_Pay_FAI(
			long filmApplicationId)
		throws NoSuchFilmApplicationPaymentException {

		FilmApplicationPayment filmApplicationPayment =
			findBygetFilm_Fee_Pay_FAI(filmApplicationId);

		return remove(filmApplicationPayment);
	}

	/**
	 * Returns the number of film application payments where filmApplicationId = &#63;.
	 *
	 * @param filmApplicationId the film application ID
	 * @return the number of matching film application payments
	 */
	@Override
	public int countBygetFilm_Fee_Pay_FAI(long filmApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFilm_Fee_Pay_FAI;

		Object[] finderArgs = new Object[] {filmApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FILMAPPLICATIONPAYMENT_WHERE);

			sb.append(_FINDER_COLUMN_GETFILM_FEE_PAY_FAI_FILMAPPLICATIONID_2);

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
		_FINDER_COLUMN_GETFILM_FEE_PAY_FAI_FILMAPPLICATIONID_2 =
			"filmApplicationPayment.filmApplicationId = ?";

	public FilmApplicationPaymentPersistenceImpl() {
		setModelClass(FilmApplicationPayment.class);

		setModelImplClass(FilmApplicationPaymentImpl.class);
		setModelPKClass(long.class);

		setTable(FilmApplicationPaymentTable.INSTANCE);
	}

	/**
	 * Caches the film application payment in the entity cache if it is enabled.
	 *
	 * @param filmApplicationPayment the film application payment
	 */
	@Override
	public void cacheResult(FilmApplicationPayment filmApplicationPayment) {
		entityCache.putResult(
			FilmApplicationPaymentImpl.class,
			filmApplicationPayment.getPrimaryKey(), filmApplicationPayment);

		finderCache.putResult(
			_finderPathFetchBygetFilm_Fee_Pay_FAI,
			new Object[] {filmApplicationPayment.getFilmApplicationId()},
			filmApplicationPayment);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the film application payments in the entity cache if it is enabled.
	 *
	 * @param filmApplicationPayments the film application payments
	 */
	@Override
	public void cacheResult(
		List<FilmApplicationPayment> filmApplicationPayments) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (filmApplicationPayments.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FilmApplicationPayment filmApplicationPayment :
				filmApplicationPayments) {

			if (entityCache.getResult(
					FilmApplicationPaymentImpl.class,
					filmApplicationPayment.getPrimaryKey()) == null) {

				cacheResult(filmApplicationPayment);
			}
		}
	}

	/**
	 * Clears the cache for all film application payments.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FilmApplicationPaymentImpl.class);

		finderCache.clearCache(FilmApplicationPaymentImpl.class);
	}

	/**
	 * Clears the cache for the film application payment.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FilmApplicationPayment filmApplicationPayment) {
		entityCache.removeResult(
			FilmApplicationPaymentImpl.class, filmApplicationPayment);
	}

	@Override
	public void clearCache(
		List<FilmApplicationPayment> filmApplicationPayments) {

		for (FilmApplicationPayment filmApplicationPayment :
				filmApplicationPayments) {

			entityCache.removeResult(
				FilmApplicationPaymentImpl.class, filmApplicationPayment);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FilmApplicationPaymentImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FilmApplicationPaymentImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FilmApplicationPaymentModelImpl filmApplicationPaymentModelImpl) {

		Object[] args = new Object[] {
			filmApplicationPaymentModelImpl.getFilmApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFilm_Fee_Pay_FAI, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFilm_Fee_Pay_FAI, args,
			filmApplicationPaymentModelImpl);
	}

	/**
	 * Creates a new film application payment with the primary key. Does not add the film application payment to the database.
	 *
	 * @param filmApplicationPaymentId the primary key for the new film application payment
	 * @return the new film application payment
	 */
	@Override
	public FilmApplicationPayment create(long filmApplicationPaymentId) {
		FilmApplicationPayment filmApplicationPayment =
			new FilmApplicationPaymentImpl();

		filmApplicationPayment.setNew(true);
		filmApplicationPayment.setPrimaryKey(filmApplicationPaymentId);

		filmApplicationPayment.setCompanyId(CompanyThreadLocal.getCompanyId());

		return filmApplicationPayment;
	}

	/**
	 * Removes the film application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment that was removed
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	@Override
	public FilmApplicationPayment remove(long filmApplicationPaymentId)
		throws NoSuchFilmApplicationPaymentException {

		return remove((Serializable)filmApplicationPaymentId);
	}

	/**
	 * Removes the film application payment with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the film application payment
	 * @return the film application payment that was removed
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	@Override
	public FilmApplicationPayment remove(Serializable primaryKey)
		throws NoSuchFilmApplicationPaymentException {

		Session session = null;

		try {
			session = openSession();

			FilmApplicationPayment filmApplicationPayment =
				(FilmApplicationPayment)session.get(
					FilmApplicationPaymentImpl.class, primaryKey);

			if (filmApplicationPayment == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFilmApplicationPaymentException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(filmApplicationPayment);
		}
		catch (NoSuchFilmApplicationPaymentException noSuchEntityException) {
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
	protected FilmApplicationPayment removeImpl(
		FilmApplicationPayment filmApplicationPayment) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(filmApplicationPayment)) {
				filmApplicationPayment = (FilmApplicationPayment)session.get(
					FilmApplicationPaymentImpl.class,
					filmApplicationPayment.getPrimaryKeyObj());
			}

			if (filmApplicationPayment != null) {
				session.delete(filmApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (filmApplicationPayment != null) {
			clearCache(filmApplicationPayment);
		}

		return filmApplicationPayment;
	}

	@Override
	public FilmApplicationPayment updateImpl(
		FilmApplicationPayment filmApplicationPayment) {

		boolean isNew = filmApplicationPayment.isNew();

		if (!(filmApplicationPayment instanceof
				FilmApplicationPaymentModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(filmApplicationPayment.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					filmApplicationPayment);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in filmApplicationPayment proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FilmApplicationPayment implementation " +
					filmApplicationPayment.getClass());
		}

		FilmApplicationPaymentModelImpl filmApplicationPaymentModelImpl =
			(FilmApplicationPaymentModelImpl)filmApplicationPayment;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (filmApplicationPayment.getCreateDate() == null)) {
			if (serviceContext == null) {
				filmApplicationPayment.setCreateDate(date);
			}
			else {
				filmApplicationPayment.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!filmApplicationPaymentModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				filmApplicationPayment.setModifiedDate(date);
			}
			else {
				filmApplicationPayment.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(filmApplicationPayment);
			}
			else {
				filmApplicationPayment = (FilmApplicationPayment)session.merge(
					filmApplicationPayment);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FilmApplicationPaymentImpl.class, filmApplicationPaymentModelImpl,
			false, true);

		cacheUniqueFindersCache(filmApplicationPaymentModelImpl);

		if (isNew) {
			filmApplicationPayment.setNew(false);
		}

		filmApplicationPayment.resetOriginalValues();

		return filmApplicationPayment;
	}

	/**
	 * Returns the film application payment with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the film application payment
	 * @return the film application payment
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	@Override
	public FilmApplicationPayment findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFilmApplicationPaymentException {

		FilmApplicationPayment filmApplicationPayment = fetchByPrimaryKey(
			primaryKey);

		if (filmApplicationPayment == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFilmApplicationPaymentException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return filmApplicationPayment;
	}

	/**
	 * Returns the film application payment with the primary key or throws a <code>NoSuchFilmApplicationPaymentException</code> if it could not be found.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment
	 * @throws NoSuchFilmApplicationPaymentException if a film application payment with the primary key could not be found
	 */
	@Override
	public FilmApplicationPayment findByPrimaryKey(
			long filmApplicationPaymentId)
		throws NoSuchFilmApplicationPaymentException {

		return findByPrimaryKey((Serializable)filmApplicationPaymentId);
	}

	/**
	 * Returns the film application payment with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param filmApplicationPaymentId the primary key of the film application payment
	 * @return the film application payment, or <code>null</code> if a film application payment with the primary key could not be found
	 */
	@Override
	public FilmApplicationPayment fetchByPrimaryKey(
		long filmApplicationPaymentId) {

		return fetchByPrimaryKey((Serializable)filmApplicationPaymentId);
	}

	/**
	 * Returns all the film application payments.
	 *
	 * @return the film application payments
	 */
	@Override
	public List<FilmApplicationPayment> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the film application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application payments
	 * @param end the upper bound of the range of film application payments (not inclusive)
	 * @return the range of film application payments
	 */
	@Override
	public List<FilmApplicationPayment> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the film application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application payments
	 * @param end the upper bound of the range of film application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of film application payments
	 */
	@Override
	public List<FilmApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationPayment> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the film application payments.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FilmApplicationPaymentModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of film application payments
	 * @param end the upper bound of the range of film application payments (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of film application payments
	 */
	@Override
	public List<FilmApplicationPayment> findAll(
		int start, int end,
		OrderByComparator<FilmApplicationPayment> orderByComparator,
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

		List<FilmApplicationPayment> list = null;

		if (useFinderCache) {
			list = (List<FilmApplicationPayment>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FILMAPPLICATIONPAYMENT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FILMAPPLICATIONPAYMENT;

				sql = sql.concat(FilmApplicationPaymentModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FilmApplicationPayment>)QueryUtil.list(
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
	 * Removes all the film application payments from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FilmApplicationPayment filmApplicationPayment : findAll()) {
			remove(filmApplicationPayment);
		}
	}

	/**
	 * Returns the number of film application payments.
	 *
	 * @return the number of film application payments
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
					_SQL_COUNT_FILMAPPLICATIONPAYMENT);

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
		return "filmApplicationPaymentId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FILMAPPLICATIONPAYMENT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FilmApplicationPaymentModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the film application payment persistence.
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

		_finderPathFetchBygetFilm_Fee_Pay_FAI = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFilm_Fee_Pay_FAI",
			new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, true);

		_finderPathCountBygetFilm_Fee_Pay_FAI = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFilm_Fee_Pay_FAI", new String[] {Long.class.getName()},
			new String[] {"filmApplicationId"}, false);

		FilmApplicationPaymentUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FilmApplicationPaymentUtil.setPersistence(null);

		entityCache.removeCache(FilmApplicationPaymentImpl.class.getName());
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

	private static final String _SQL_SELECT_FILMAPPLICATIONPAYMENT =
		"SELECT filmApplicationPayment FROM FilmApplicationPayment filmApplicationPayment";

	private static final String _SQL_SELECT_FILMAPPLICATIONPAYMENT_WHERE =
		"SELECT filmApplicationPayment FROM FilmApplicationPayment filmApplicationPayment WHERE ";

	private static final String _SQL_COUNT_FILMAPPLICATIONPAYMENT =
		"SELECT COUNT(filmApplicationPayment) FROM FilmApplicationPayment filmApplicationPayment";

	private static final String _SQL_COUNT_FILMAPPLICATIONPAYMENT_WHERE =
		"SELECT COUNT(filmApplicationPayment) FROM FilmApplicationPayment filmApplicationPayment WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"filmApplicationPayment.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FilmApplicationPayment exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FilmApplicationPayment exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FilmApplicationPaymentPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
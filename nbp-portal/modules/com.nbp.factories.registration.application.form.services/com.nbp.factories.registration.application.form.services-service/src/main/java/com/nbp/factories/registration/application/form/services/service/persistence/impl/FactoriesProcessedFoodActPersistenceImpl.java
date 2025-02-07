/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.factories.registration.application.form.services.service.persistence.impl;

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

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesProcessedFoodActException;
import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodAct;
import com.nbp.factories.registration.application.form.services.model.FactoriesProcessedFoodActTable;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActImpl;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesProcessedFoodActModelImpl;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProcessedFoodActPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesProcessedFoodActUtil;
import com.nbp.factories.registration.application.form.services.service.persistence.impl.constants.FACTORIESPersistenceConstants;

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
 * The persistence implementation for the factories processed food act service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesProcessedFoodActPersistence.class)
public class FactoriesProcessedFoodActPersistenceImpl
	extends BasePersistenceImpl<FactoriesProcessedFoodAct>
	implements FactoriesProcessedFoodActPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesProcessedFoodActUtil</code> to access the factories processed food act persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesProcessedFoodActImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetFactoriesById;
	private FinderPath _finderPathCountBygetFactoriesById;

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesProcessedFoodActException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories processed food act
	 * @throws NoSuchFactoriesProcessedFoodActException if a matching factories processed food act could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct findBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesProcessedFoodActException {

		FactoriesProcessedFoodAct factoriesProcessedFoodAct =
			fetchBygetFactoriesById(factoriesApplicationId);

		if (factoriesProcessedFoodAct == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("factoriesApplicationId=");
			sb.append(factoriesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesProcessedFoodActException(sb.toString());
		}

		return factoriesProcessedFoodAct;
	}

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories processed food act, or <code>null</code> if a matching factories processed food act could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct fetchBygetFactoriesById(
		long factoriesApplicationId) {

		return fetchBygetFactoriesById(factoriesApplicationId, true);
	}

	/**
	 * Returns the factories processed food act where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories processed food act, or <code>null</code> if a matching factories processed food act could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct fetchBygetFactoriesById(
		long factoriesApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {factoriesApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetFactoriesById, finderArgs, this);
		}

		if (result instanceof FactoriesProcessedFoodAct) {
			FactoriesProcessedFoodAct factoriesProcessedFoodAct =
				(FactoriesProcessedFoodAct)result;

			if (factoriesApplicationId !=
					factoriesProcessedFoodAct.getFactoriesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESPROCESSEDFOODACT_WHERE);

			sb.append(_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

				List<FactoriesProcessedFoodAct> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetFactoriesById, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									factoriesApplicationId
								};
							}

							_log.warn(
								"FactoriesProcessedFoodActPersistenceImpl.fetchBygetFactoriesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesProcessedFoodAct factoriesProcessedFoodAct =
						list.get(0);

					result = factoriesProcessedFoodAct;

					cacheResult(factoriesProcessedFoodAct);
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
			return (FactoriesProcessedFoodAct)result;
		}
	}

	/**
	 * Removes the factories processed food act where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories processed food act that was removed
	 */
	@Override
	public FactoriesProcessedFoodAct removeBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesProcessedFoodActException {

		FactoriesProcessedFoodAct factoriesProcessedFoodAct =
			findBygetFactoriesById(factoriesApplicationId);

		return remove(factoriesProcessedFoodAct);
	}

	/**
	 * Returns the number of factories processed food acts where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories processed food acts
	 */
	@Override
	public int countBygetFactoriesById(long factoriesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFactoriesById;

		Object[] finderArgs = new Object[] {factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESPROCESSEDFOODACT_WHERE);

			sb.append(_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

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
		_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2 =
			"factoriesProcessedFoodAct.factoriesApplicationId = ?";

	public FactoriesProcessedFoodActPersistenceImpl() {
		setModelClass(FactoriesProcessedFoodAct.class);

		setModelImplClass(FactoriesProcessedFoodActImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesProcessedFoodActTable.INSTANCE);
	}

	/**
	 * Caches the factories processed food act in the entity cache if it is enabled.
	 *
	 * @param factoriesProcessedFoodAct the factories processed food act
	 */
	@Override
	public void cacheResult(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		entityCache.putResult(
			FactoriesProcessedFoodActImpl.class,
			factoriesProcessedFoodAct.getPrimaryKey(),
			factoriesProcessedFoodAct);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesById,
			new Object[] {
				factoriesProcessedFoodAct.getFactoriesApplicationId()
			},
			factoriesProcessedFoodAct);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories processed food acts in the entity cache if it is enabled.
	 *
	 * @param factoriesProcessedFoodActs the factories processed food acts
	 */
	@Override
	public void cacheResult(
		List<FactoriesProcessedFoodAct> factoriesProcessedFoodActs) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesProcessedFoodActs.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesProcessedFoodAct factoriesProcessedFoodAct :
				factoriesProcessedFoodActs) {

			if (entityCache.getResult(
					FactoriesProcessedFoodActImpl.class,
					factoriesProcessedFoodAct.getPrimaryKey()) == null) {

				cacheResult(factoriesProcessedFoodAct);
			}
		}
	}

	/**
	 * Clears the cache for all factories processed food acts.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesProcessedFoodActImpl.class);

		finderCache.clearCache(FactoriesProcessedFoodActImpl.class);
	}

	/**
	 * Clears the cache for the factories processed food act.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		entityCache.removeResult(
			FactoriesProcessedFoodActImpl.class, factoriesProcessedFoodAct);
	}

	@Override
	public void clearCache(
		List<FactoriesProcessedFoodAct> factoriesProcessedFoodActs) {

		for (FactoriesProcessedFoodAct factoriesProcessedFoodAct :
				factoriesProcessedFoodActs) {

			entityCache.removeResult(
				FactoriesProcessedFoodActImpl.class, factoriesProcessedFoodAct);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesProcessedFoodActImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesProcessedFoodActImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesProcessedFoodActModelImpl factoriesProcessedFoodActModelImpl) {

		Object[] args = new Object[] {
			factoriesProcessedFoodActModelImpl.getFactoriesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesById, args,
			factoriesProcessedFoodActModelImpl);
	}

	/**
	 * Creates a new factories processed food act with the primary key. Does not add the factories processed food act to the database.
	 *
	 * @param factoriesProcessedFoodActId the primary key for the new factories processed food act
	 * @return the new factories processed food act
	 */
	@Override
	public FactoriesProcessedFoodAct create(long factoriesProcessedFoodActId) {
		FactoriesProcessedFoodAct factoriesProcessedFoodAct =
			new FactoriesProcessedFoodActImpl();

		factoriesProcessedFoodAct.setNew(true);
		factoriesProcessedFoodAct.setPrimaryKey(factoriesProcessedFoodActId);

		factoriesProcessedFoodAct.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesProcessedFoodAct;
	}

	/**
	 * Removes the factories processed food act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act that was removed
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct remove(long factoriesProcessedFoodActId)
		throws NoSuchFactoriesProcessedFoodActException {

		return remove((Serializable)factoriesProcessedFoodActId);
	}

	/**
	 * Removes the factories processed food act with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories processed food act
	 * @return the factories processed food act that was removed
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct remove(Serializable primaryKey)
		throws NoSuchFactoriesProcessedFoodActException {

		Session session = null;

		try {
			session = openSession();

			FactoriesProcessedFoodAct factoriesProcessedFoodAct =
				(FactoriesProcessedFoodAct)session.get(
					FactoriesProcessedFoodActImpl.class, primaryKey);

			if (factoriesProcessedFoodAct == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesProcessedFoodActException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesProcessedFoodAct);
		}
		catch (NoSuchFactoriesProcessedFoodActException noSuchEntityException) {
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
	protected FactoriesProcessedFoodAct removeImpl(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesProcessedFoodAct)) {
				factoriesProcessedFoodAct =
					(FactoriesProcessedFoodAct)session.get(
						FactoriesProcessedFoodActImpl.class,
						factoriesProcessedFoodAct.getPrimaryKeyObj());
			}

			if (factoriesProcessedFoodAct != null) {
				session.delete(factoriesProcessedFoodAct);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesProcessedFoodAct != null) {
			clearCache(factoriesProcessedFoodAct);
		}

		return factoriesProcessedFoodAct;
	}

	@Override
	public FactoriesProcessedFoodAct updateImpl(
		FactoriesProcessedFoodAct factoriesProcessedFoodAct) {

		boolean isNew = factoriesProcessedFoodAct.isNew();

		if (!(factoriesProcessedFoodAct instanceof
				FactoriesProcessedFoodActModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoriesProcessedFoodAct.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesProcessedFoodAct);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesProcessedFoodAct proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesProcessedFoodAct implementation " +
					factoriesProcessedFoodAct.getClass());
		}

		FactoriesProcessedFoodActModelImpl factoriesProcessedFoodActModelImpl =
			(FactoriesProcessedFoodActModelImpl)factoriesProcessedFoodAct;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesProcessedFoodAct.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesProcessedFoodAct.setCreateDate(date);
			}
			else {
				factoriesProcessedFoodAct.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesProcessedFoodActModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesProcessedFoodAct.setModifiedDate(date);
			}
			else {
				factoriesProcessedFoodAct.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesProcessedFoodAct);
			}
			else {
				factoriesProcessedFoodAct =
					(FactoriesProcessedFoodAct)session.merge(
						factoriesProcessedFoodAct);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesProcessedFoodActImpl.class,
			factoriesProcessedFoodActModelImpl, false, true);

		cacheUniqueFindersCache(factoriesProcessedFoodActModelImpl);

		if (isNew) {
			factoriesProcessedFoodAct.setNew(false);
		}

		factoriesProcessedFoodAct.resetOriginalValues();

		return factoriesProcessedFoodAct;
	}

	/**
	 * Returns the factories processed food act with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories processed food act
	 * @return the factories processed food act
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoriesProcessedFoodActException {

		FactoriesProcessedFoodAct factoriesProcessedFoodAct = fetchByPrimaryKey(
			primaryKey);

		if (factoriesProcessedFoodAct == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesProcessedFoodActException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesProcessedFoodAct;
	}

	/**
	 * Returns the factories processed food act with the primary key or throws a <code>NoSuchFactoriesProcessedFoodActException</code> if it could not be found.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act
	 * @throws NoSuchFactoriesProcessedFoodActException if a factories processed food act with the primary key could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct findByPrimaryKey(
			long factoriesProcessedFoodActId)
		throws NoSuchFactoriesProcessedFoodActException {

		return findByPrimaryKey((Serializable)factoriesProcessedFoodActId);
	}

	/**
	 * Returns the factories processed food act with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesProcessedFoodActId the primary key of the factories processed food act
	 * @return the factories processed food act, or <code>null</code> if a factories processed food act with the primary key could not be found
	 */
	@Override
	public FactoriesProcessedFoodAct fetchByPrimaryKey(
		long factoriesProcessedFoodActId) {

		return fetchByPrimaryKey((Serializable)factoriesProcessedFoodActId);
	}

	/**
	 * Returns all the factories processed food acts.
	 *
	 * @return the factories processed food acts
	 */
	@Override
	public List<FactoriesProcessedFoodAct> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @return the range of factories processed food acts
	 */
	@Override
	public List<FactoriesProcessedFoodAct> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories processed food acts
	 */
	@Override
	public List<FactoriesProcessedFoodAct> findAll(
		int start, int end,
		OrderByComparator<FactoriesProcessedFoodAct> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories processed food acts.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesProcessedFoodActModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories processed food acts
	 * @param end the upper bound of the range of factories processed food acts (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories processed food acts
	 */
	@Override
	public List<FactoriesProcessedFoodAct> findAll(
		int start, int end,
		OrderByComparator<FactoriesProcessedFoodAct> orderByComparator,
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

		List<FactoriesProcessedFoodAct> list = null;

		if (useFinderCache) {
			list = (List<FactoriesProcessedFoodAct>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESPROCESSEDFOODACT);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESPROCESSEDFOODACT;

				sql = sql.concat(
					FactoriesProcessedFoodActModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesProcessedFoodAct>)QueryUtil.list(
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
	 * Removes all the factories processed food acts from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesProcessedFoodAct factoriesProcessedFoodAct : findAll()) {
			remove(factoriesProcessedFoodAct);
		}
	}

	/**
	 * Returns the number of factories processed food acts.
	 *
	 * @return the number of factories processed food acts
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
					_SQL_COUNT_FACTORIESPROCESSEDFOODACT);

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
		return "factoriesProcessedFoodActId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESPROCESSEDFOODACT;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesProcessedFoodActModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories processed food act persistence.
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

		_finderPathFetchBygetFactoriesById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetFactoriesById",
			new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, true);

		_finderPathCountBygetFactoriesById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetFactoriesById", new String[] {Long.class.getName()},
			new String[] {"factoriesApplicationId"}, false);

		FactoriesProcessedFoodActUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesProcessedFoodActUtil.setPersistence(null);

		entityCache.removeCache(FactoriesProcessedFoodActImpl.class.getName());
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FACTORIESPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_FACTORIESPROCESSEDFOODACT =
		"SELECT factoriesProcessedFoodAct FROM FactoriesProcessedFoodAct factoriesProcessedFoodAct";

	private static final String _SQL_SELECT_FACTORIESPROCESSEDFOODACT_WHERE =
		"SELECT factoriesProcessedFoodAct FROM FactoriesProcessedFoodAct factoriesProcessedFoodAct WHERE ";

	private static final String _SQL_COUNT_FACTORIESPROCESSEDFOODACT =
		"SELECT COUNT(factoriesProcessedFoodAct) FROM FactoriesProcessedFoodAct factoriesProcessedFoodAct";

	private static final String _SQL_COUNT_FACTORIESPROCESSEDFOODACT_WHERE =
		"SELECT COUNT(factoriesProcessedFoodAct) FROM FactoriesProcessedFoodAct factoriesProcessedFoodAct WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesProcessedFoodAct.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesProcessedFoodAct exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesProcessedFoodAct exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesProcessedFoodActPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
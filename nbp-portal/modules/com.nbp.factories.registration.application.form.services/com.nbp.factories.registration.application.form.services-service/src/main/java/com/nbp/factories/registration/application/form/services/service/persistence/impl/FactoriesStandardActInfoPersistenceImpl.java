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

import com.nbp.factories.registration.application.form.services.exception.NoSuchFactoriesStandardActInfoException;
import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfo;
import com.nbp.factories.registration.application.form.services.model.FactoriesStandardActInfoTable;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoImpl;
import com.nbp.factories.registration.application.form.services.model.impl.FactoriesStandardActInfoModelImpl;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesStandardActInfoPersistence;
import com.nbp.factories.registration.application.form.services.service.persistence.FactoriesStandardActInfoUtil;
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
 * The persistence implementation for the factories standard act info service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = FactoriesStandardActInfoPersistence.class)
public class FactoriesStandardActInfoPersistenceImpl
	extends BasePersistenceImpl<FactoriesStandardActInfo>
	implements FactoriesStandardActInfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>FactoriesStandardActInfoUtil</code> to access the factories standard act info persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		FactoriesStandardActInfoImpl.class.getName();

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
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or throws a <code>NoSuchFactoriesStandardActInfoException</code> if it could not be found.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories standard act info
	 * @throws NoSuchFactoriesStandardActInfoException if a matching factories standard act info could not be found
	 */
	@Override
	public FactoriesStandardActInfo findBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesStandardActInfoException {

		FactoriesStandardActInfo factoriesStandardActInfo =
			fetchBygetFactoriesById(factoriesApplicationId);

		if (factoriesStandardActInfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("factoriesApplicationId=");
			sb.append(factoriesApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchFactoriesStandardActInfoException(sb.toString());
		}

		return factoriesStandardActInfo;
	}

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the matching factories standard act info, or <code>null</code> if a matching factories standard act info could not be found
	 */
	@Override
	public FactoriesStandardActInfo fetchBygetFactoriesById(
		long factoriesApplicationId) {

		return fetchBygetFactoriesById(factoriesApplicationId, true);
	}

	/**
	 * Returns the factories standard act info where factoriesApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching factories standard act info, or <code>null</code> if a matching factories standard act info could not be found
	 */
	@Override
	public FactoriesStandardActInfo fetchBygetFactoriesById(
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

		if (result instanceof FactoriesStandardActInfo) {
			FactoriesStandardActInfo factoriesStandardActInfo =
				(FactoriesStandardActInfo)result;

			if (factoriesApplicationId !=
					factoriesStandardActInfo.getFactoriesApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_FACTORIESSTANDARDACTINFO_WHERE);

			sb.append(_FINDER_COLUMN_GETFACTORIESBYID_FACTORIESAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(factoriesApplicationId);

				List<FactoriesStandardActInfo> list = query.list();

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
								"FactoriesStandardActInfoPersistenceImpl.fetchBygetFactoriesById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					FactoriesStandardActInfo factoriesStandardActInfo =
						list.get(0);

					result = factoriesStandardActInfo;

					cacheResult(factoriesStandardActInfo);
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
			return (FactoriesStandardActInfo)result;
		}
	}

	/**
	 * Removes the factories standard act info where factoriesApplicationId = &#63; from the database.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the factories standard act info that was removed
	 */
	@Override
	public FactoriesStandardActInfo removeBygetFactoriesById(
			long factoriesApplicationId)
		throws NoSuchFactoriesStandardActInfoException {

		FactoriesStandardActInfo factoriesStandardActInfo =
			findBygetFactoriesById(factoriesApplicationId);

		return remove(factoriesStandardActInfo);
	}

	/**
	 * Returns the number of factories standard act infos where factoriesApplicationId = &#63;.
	 *
	 * @param factoriesApplicationId the factories application ID
	 * @return the number of matching factories standard act infos
	 */
	@Override
	public int countBygetFactoriesById(long factoriesApplicationId) {
		FinderPath finderPath = _finderPathCountBygetFactoriesById;

		Object[] finderArgs = new Object[] {factoriesApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_FACTORIESSTANDARDACTINFO_WHERE);

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
			"factoriesStandardActInfo.factoriesApplicationId = ?";

	public FactoriesStandardActInfoPersistenceImpl() {
		setModelClass(FactoriesStandardActInfo.class);

		setModelImplClass(FactoriesStandardActInfoImpl.class);
		setModelPKClass(long.class);

		setTable(FactoriesStandardActInfoTable.INSTANCE);
	}

	/**
	 * Caches the factories standard act info in the entity cache if it is enabled.
	 *
	 * @param factoriesStandardActInfo the factories standard act info
	 */
	@Override
	public void cacheResult(FactoriesStandardActInfo factoriesStandardActInfo) {
		entityCache.putResult(
			FactoriesStandardActInfoImpl.class,
			factoriesStandardActInfo.getPrimaryKey(), factoriesStandardActInfo);

		finderCache.putResult(
			_finderPathFetchBygetFactoriesById,
			new Object[] {factoriesStandardActInfo.getFactoriesApplicationId()},
			factoriesStandardActInfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the factories standard act infos in the entity cache if it is enabled.
	 *
	 * @param factoriesStandardActInfos the factories standard act infos
	 */
	@Override
	public void cacheResult(
		List<FactoriesStandardActInfo> factoriesStandardActInfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (factoriesStandardActInfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (FactoriesStandardActInfo factoriesStandardActInfo :
				factoriesStandardActInfos) {

			if (entityCache.getResult(
					FactoriesStandardActInfoImpl.class,
					factoriesStandardActInfo.getPrimaryKey()) == null) {

				cacheResult(factoriesStandardActInfo);
			}
		}
	}

	/**
	 * Clears the cache for all factories standard act infos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(FactoriesStandardActInfoImpl.class);

		finderCache.clearCache(FactoriesStandardActInfoImpl.class);
	}

	/**
	 * Clears the cache for the factories standard act info.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(FactoriesStandardActInfo factoriesStandardActInfo) {
		entityCache.removeResult(
			FactoriesStandardActInfoImpl.class, factoriesStandardActInfo);
	}

	@Override
	public void clearCache(
		List<FactoriesStandardActInfo> factoriesStandardActInfos) {

		for (FactoriesStandardActInfo factoriesStandardActInfo :
				factoriesStandardActInfos) {

			entityCache.removeResult(
				FactoriesStandardActInfoImpl.class, factoriesStandardActInfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(FactoriesStandardActInfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				FactoriesStandardActInfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		FactoriesStandardActInfoModelImpl factoriesStandardActInfoModelImpl) {

		Object[] args = new Object[] {
			factoriesStandardActInfoModelImpl.getFactoriesApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetFactoriesById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetFactoriesById, args,
			factoriesStandardActInfoModelImpl);
	}

	/**
	 * Creates a new factories standard act info with the primary key. Does not add the factories standard act info to the database.
	 *
	 * @param factoriesStandardActId the primary key for the new factories standard act info
	 * @return the new factories standard act info
	 */
	@Override
	public FactoriesStandardActInfo create(long factoriesStandardActId) {
		FactoriesStandardActInfo factoriesStandardActInfo =
			new FactoriesStandardActInfoImpl();

		factoriesStandardActInfo.setNew(true);
		factoriesStandardActInfo.setPrimaryKey(factoriesStandardActId);

		factoriesStandardActInfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return factoriesStandardActInfo;
	}

	/**
	 * Removes the factories standard act info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info that was removed
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	@Override
	public FactoriesStandardActInfo remove(long factoriesStandardActId)
		throws NoSuchFactoriesStandardActInfoException {

		return remove((Serializable)factoriesStandardActId);
	}

	/**
	 * Removes the factories standard act info with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the factories standard act info
	 * @return the factories standard act info that was removed
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	@Override
	public FactoriesStandardActInfo remove(Serializable primaryKey)
		throws NoSuchFactoriesStandardActInfoException {

		Session session = null;

		try {
			session = openSession();

			FactoriesStandardActInfo factoriesStandardActInfo =
				(FactoriesStandardActInfo)session.get(
					FactoriesStandardActInfoImpl.class, primaryKey);

			if (factoriesStandardActInfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchFactoriesStandardActInfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(factoriesStandardActInfo);
		}
		catch (NoSuchFactoriesStandardActInfoException noSuchEntityException) {
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
	protected FactoriesStandardActInfo removeImpl(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(factoriesStandardActInfo)) {
				factoriesStandardActInfo =
					(FactoriesStandardActInfo)session.get(
						FactoriesStandardActInfoImpl.class,
						factoriesStandardActInfo.getPrimaryKeyObj());
			}

			if (factoriesStandardActInfo != null) {
				session.delete(factoriesStandardActInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (factoriesStandardActInfo != null) {
			clearCache(factoriesStandardActInfo);
		}

		return factoriesStandardActInfo;
	}

	@Override
	public FactoriesStandardActInfo updateImpl(
		FactoriesStandardActInfo factoriesStandardActInfo) {

		boolean isNew = factoriesStandardActInfo.isNew();

		if (!(factoriesStandardActInfo instanceof
				FactoriesStandardActInfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(factoriesStandardActInfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					factoriesStandardActInfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in factoriesStandardActInfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom FactoriesStandardActInfo implementation " +
					factoriesStandardActInfo.getClass());
		}

		FactoriesStandardActInfoModelImpl factoriesStandardActInfoModelImpl =
			(FactoriesStandardActInfoModelImpl)factoriesStandardActInfo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (factoriesStandardActInfo.getCreateDate() == null)) {
			if (serviceContext == null) {
				factoriesStandardActInfo.setCreateDate(date);
			}
			else {
				factoriesStandardActInfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!factoriesStandardActInfoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				factoriesStandardActInfo.setModifiedDate(date);
			}
			else {
				factoriesStandardActInfo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(factoriesStandardActInfo);
			}
			else {
				factoriesStandardActInfo =
					(FactoriesStandardActInfo)session.merge(
						factoriesStandardActInfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			FactoriesStandardActInfoImpl.class,
			factoriesStandardActInfoModelImpl, false, true);

		cacheUniqueFindersCache(factoriesStandardActInfoModelImpl);

		if (isNew) {
			factoriesStandardActInfo.setNew(false);
		}

		factoriesStandardActInfo.resetOriginalValues();

		return factoriesStandardActInfo;
	}

	/**
	 * Returns the factories standard act info with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the factories standard act info
	 * @return the factories standard act info
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	@Override
	public FactoriesStandardActInfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchFactoriesStandardActInfoException {

		FactoriesStandardActInfo factoriesStandardActInfo = fetchByPrimaryKey(
			primaryKey);

		if (factoriesStandardActInfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchFactoriesStandardActInfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return factoriesStandardActInfo;
	}

	/**
	 * Returns the factories standard act info with the primary key or throws a <code>NoSuchFactoriesStandardActInfoException</code> if it could not be found.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info
	 * @throws NoSuchFactoriesStandardActInfoException if a factories standard act info with the primary key could not be found
	 */
	@Override
	public FactoriesStandardActInfo findByPrimaryKey(
			long factoriesStandardActId)
		throws NoSuchFactoriesStandardActInfoException {

		return findByPrimaryKey((Serializable)factoriesStandardActId);
	}

	/**
	 * Returns the factories standard act info with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param factoriesStandardActId the primary key of the factories standard act info
	 * @return the factories standard act info, or <code>null</code> if a factories standard act info with the primary key could not be found
	 */
	@Override
	public FactoriesStandardActInfo fetchByPrimaryKey(
		long factoriesStandardActId) {

		return fetchByPrimaryKey((Serializable)factoriesStandardActId);
	}

	/**
	 * Returns all the factories standard act infos.
	 *
	 * @return the factories standard act infos
	 */
	@Override
	public List<FactoriesStandardActInfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @return the range of factories standard act infos
	 */
	@Override
	public List<FactoriesStandardActInfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of factories standard act infos
	 */
	@Override
	public List<FactoriesStandardActInfo> findAll(
		int start, int end,
		OrderByComparator<FactoriesStandardActInfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the factories standard act infos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>FactoriesStandardActInfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of factories standard act infos
	 * @param end the upper bound of the range of factories standard act infos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of factories standard act infos
	 */
	@Override
	public List<FactoriesStandardActInfo> findAll(
		int start, int end,
		OrderByComparator<FactoriesStandardActInfo> orderByComparator,
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

		List<FactoriesStandardActInfo> list = null;

		if (useFinderCache) {
			list = (List<FactoriesStandardActInfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_FACTORIESSTANDARDACTINFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_FACTORIESSTANDARDACTINFO;

				sql = sql.concat(
					FactoriesStandardActInfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<FactoriesStandardActInfo>)QueryUtil.list(
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
	 * Removes all the factories standard act infos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (FactoriesStandardActInfo factoriesStandardActInfo : findAll()) {
			remove(factoriesStandardActInfo);
		}
	}

	/**
	 * Returns the number of factories standard act infos.
	 *
	 * @return the number of factories standard act infos
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
					_SQL_COUNT_FACTORIESSTANDARDACTINFO);

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
		return "factoriesStandardActId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_FACTORIESSTANDARDACTINFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return FactoriesStandardActInfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the factories standard act info persistence.
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

		FactoriesStandardActInfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		FactoriesStandardActInfoUtil.setPersistence(null);

		entityCache.removeCache(FactoriesStandardActInfoImpl.class.getName());
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

	private static final String _SQL_SELECT_FACTORIESSTANDARDACTINFO =
		"SELECT factoriesStandardActInfo FROM FactoriesStandardActInfo factoriesStandardActInfo";

	private static final String _SQL_SELECT_FACTORIESSTANDARDACTINFO_WHERE =
		"SELECT factoriesStandardActInfo FROM FactoriesStandardActInfo factoriesStandardActInfo WHERE ";

	private static final String _SQL_COUNT_FACTORIESSTANDARDACTINFO =
		"SELECT COUNT(factoriesStandardActInfo) FROM FactoriesStandardActInfo factoriesStandardActInfo";

	private static final String _SQL_COUNT_FACTORIESSTANDARDACTINFO_WHERE =
		"SELECT COUNT(factoriesStandardActInfo) FROM FactoriesStandardActInfo factoriesStandardActInfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"factoriesStandardActInfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No FactoriesStandardActInfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No FactoriesStandardActInfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		FactoriesStandardActInfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.hsra.application.service.service.persistence.impl;

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

import com.nbp.hsra.application.service.exception.NoSuchDetailOfBusinessSecThreeException;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThree;
import com.nbp.hsra.application.service.model.DetailOfBusinessSecThreeTable;
import com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeImpl;
import com.nbp.hsra.application.service.model.impl.DetailOfBusinessSecThreeModelImpl;
import com.nbp.hsra.application.service.service.persistence.DetailOfBusinessSecThreePersistence;
import com.nbp.hsra.application.service.service.persistence.DetailOfBusinessSecThreeUtil;
import com.nbp.hsra.application.service.service.persistence.impl.constants.HSRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the detail of business sec three service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = DetailOfBusinessSecThreePersistence.class)
public class DetailOfBusinessSecThreePersistenceImpl
	extends BasePersistenceImpl<DetailOfBusinessSecThree>
	implements DetailOfBusinessSecThreePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>DetailOfBusinessSecThreeUtil</code> to access the detail of business sec three persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		DetailOfBusinessSecThreeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetHsraById;
	private FinderPath _finderPathCountBygetHsraById;

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or throws a <code>NoSuchDetailOfBusinessSecThreeException</code> if it could not be found.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of business sec three
	 * @throws NoSuchDetailOfBusinessSecThreeException if a matching detail of business sec three could not be found
	 */
	@Override
	public DetailOfBusinessSecThree findBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfBusinessSecThreeException {

		DetailOfBusinessSecThree detailOfBusinessSecThree = fetchBygetHsraById(
			hsraApplicationId);

		if (detailOfBusinessSecThree == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("hsraApplicationId=");
			sb.append(hsraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchDetailOfBusinessSecThreeException(sb.toString());
		}

		return detailOfBusinessSecThree;
	}

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the matching detail of business sec three, or <code>null</code> if a matching detail of business sec three could not be found
	 */
	@Override
	public DetailOfBusinessSecThree fetchBygetHsraById(long hsraApplicationId) {
		return fetchBygetHsraById(hsraApplicationId, true);
	}

	/**
	 * Returns the detail of business sec three where hsraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching detail of business sec three, or <code>null</code> if a matching detail of business sec three could not be found
	 */
	@Override
	public DetailOfBusinessSecThree fetchBygetHsraById(
		long hsraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {hsraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetHsraById, finderArgs, this);
		}

		if (result instanceof DetailOfBusinessSecThree) {
			DetailOfBusinessSecThree detailOfBusinessSecThree =
				(DetailOfBusinessSecThree)result;

			if (hsraApplicationId !=
					detailOfBusinessSecThree.getHsraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_DETAILOFBUSINESSSECTHREE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

				List<DetailOfBusinessSecThree> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetHsraById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {hsraApplicationId};
							}

							_log.warn(
								"DetailOfBusinessSecThreePersistenceImpl.fetchBygetHsraById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					DetailOfBusinessSecThree detailOfBusinessSecThree =
						list.get(0);

					result = detailOfBusinessSecThree;

					cacheResult(detailOfBusinessSecThree);
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
			return (DetailOfBusinessSecThree)result;
		}
	}

	/**
	 * Removes the detail of business sec three where hsraApplicationId = &#63; from the database.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the detail of business sec three that was removed
	 */
	@Override
	public DetailOfBusinessSecThree removeBygetHsraById(long hsraApplicationId)
		throws NoSuchDetailOfBusinessSecThreeException {

		DetailOfBusinessSecThree detailOfBusinessSecThree = findBygetHsraById(
			hsraApplicationId);

		return remove(detailOfBusinessSecThree);
	}

	/**
	 * Returns the number of detail of business sec threes where hsraApplicationId = &#63;.
	 *
	 * @param hsraApplicationId the hsra application ID
	 * @return the number of matching detail of business sec threes
	 */
	@Override
	public int countBygetHsraById(long hsraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetHsraById;

		Object[] finderArgs = new Object[] {hsraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_DETAILOFBUSINESSSECTHREE_WHERE);

			sb.append(_FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(hsraApplicationId);

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

	private static final String _FINDER_COLUMN_GETHSRABYID_HSRAAPPLICATIONID_2 =
		"detailOfBusinessSecThree.hsraApplicationId = ?";

	public DetailOfBusinessSecThreePersistenceImpl() {
		setModelClass(DetailOfBusinessSecThree.class);

		setModelImplClass(DetailOfBusinessSecThreeImpl.class);
		setModelPKClass(long.class);

		setTable(DetailOfBusinessSecThreeTable.INSTANCE);
	}

	/**
	 * Caches the detail of business sec three in the entity cache if it is enabled.
	 *
	 * @param detailOfBusinessSecThree the detail of business sec three
	 */
	@Override
	public void cacheResult(DetailOfBusinessSecThree detailOfBusinessSecThree) {
		entityCache.putResult(
			DetailOfBusinessSecThreeImpl.class,
			detailOfBusinessSecThree.getPrimaryKey(), detailOfBusinessSecThree);

		finderCache.putResult(
			_finderPathFetchBygetHsraById,
			new Object[] {detailOfBusinessSecThree.getHsraApplicationId()},
			detailOfBusinessSecThree);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the detail of business sec threes in the entity cache if it is enabled.
	 *
	 * @param detailOfBusinessSecThrees the detail of business sec threes
	 */
	@Override
	public void cacheResult(
		List<DetailOfBusinessSecThree> detailOfBusinessSecThrees) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (detailOfBusinessSecThrees.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (DetailOfBusinessSecThree detailOfBusinessSecThree :
				detailOfBusinessSecThrees) {

			if (entityCache.getResult(
					DetailOfBusinessSecThreeImpl.class,
					detailOfBusinessSecThree.getPrimaryKey()) == null) {

				cacheResult(detailOfBusinessSecThree);
			}
		}
	}

	/**
	 * Clears the cache for all detail of business sec threes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(DetailOfBusinessSecThreeImpl.class);

		finderCache.clearCache(DetailOfBusinessSecThreeImpl.class);
	}

	/**
	 * Clears the cache for the detail of business sec three.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(DetailOfBusinessSecThree detailOfBusinessSecThree) {
		entityCache.removeResult(
			DetailOfBusinessSecThreeImpl.class, detailOfBusinessSecThree);
	}

	@Override
	public void clearCache(
		List<DetailOfBusinessSecThree> detailOfBusinessSecThrees) {

		for (DetailOfBusinessSecThree detailOfBusinessSecThree :
				detailOfBusinessSecThrees) {

			entityCache.removeResult(
				DetailOfBusinessSecThreeImpl.class, detailOfBusinessSecThree);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(DetailOfBusinessSecThreeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				DetailOfBusinessSecThreeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		DetailOfBusinessSecThreeModelImpl detailOfBusinessSecThreeModelImpl) {

		Object[] args = new Object[] {
			detailOfBusinessSecThreeModelImpl.getHsraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetHsraById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetHsraById, args,
			detailOfBusinessSecThreeModelImpl);
	}

	/**
	 * Creates a new detail of business sec three with the primary key. Does not add the detail of business sec three to the database.
	 *
	 * @param detailOfBusinessSecThreeId the primary key for the new detail of business sec three
	 * @return the new detail of business sec three
	 */
	@Override
	public DetailOfBusinessSecThree create(long detailOfBusinessSecThreeId) {
		DetailOfBusinessSecThree detailOfBusinessSecThree =
			new DetailOfBusinessSecThreeImpl();

		detailOfBusinessSecThree.setNew(true);
		detailOfBusinessSecThree.setPrimaryKey(detailOfBusinessSecThreeId);

		detailOfBusinessSecThree.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return detailOfBusinessSecThree;
	}

	/**
	 * Removes the detail of business sec three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three that was removed
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	@Override
	public DetailOfBusinessSecThree remove(long detailOfBusinessSecThreeId)
		throws NoSuchDetailOfBusinessSecThreeException {

		return remove((Serializable)detailOfBusinessSecThreeId);
	}

	/**
	 * Removes the detail of business sec three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the detail of business sec three
	 * @return the detail of business sec three that was removed
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	@Override
	public DetailOfBusinessSecThree remove(Serializable primaryKey)
		throws NoSuchDetailOfBusinessSecThreeException {

		Session session = null;

		try {
			session = openSession();

			DetailOfBusinessSecThree detailOfBusinessSecThree =
				(DetailOfBusinessSecThree)session.get(
					DetailOfBusinessSecThreeImpl.class, primaryKey);

			if (detailOfBusinessSecThree == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDetailOfBusinessSecThreeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(detailOfBusinessSecThree);
		}
		catch (NoSuchDetailOfBusinessSecThreeException noSuchEntityException) {
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
	protected DetailOfBusinessSecThree removeImpl(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(detailOfBusinessSecThree)) {
				detailOfBusinessSecThree =
					(DetailOfBusinessSecThree)session.get(
						DetailOfBusinessSecThreeImpl.class,
						detailOfBusinessSecThree.getPrimaryKeyObj());
			}

			if (detailOfBusinessSecThree != null) {
				session.delete(detailOfBusinessSecThree);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (detailOfBusinessSecThree != null) {
			clearCache(detailOfBusinessSecThree);
		}

		return detailOfBusinessSecThree;
	}

	@Override
	public DetailOfBusinessSecThree updateImpl(
		DetailOfBusinessSecThree detailOfBusinessSecThree) {

		boolean isNew = detailOfBusinessSecThree.isNew();

		if (!(detailOfBusinessSecThree instanceof
				DetailOfBusinessSecThreeModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(detailOfBusinessSecThree.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					detailOfBusinessSecThree);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in detailOfBusinessSecThree proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom DetailOfBusinessSecThree implementation " +
					detailOfBusinessSecThree.getClass());
		}

		DetailOfBusinessSecThreeModelImpl detailOfBusinessSecThreeModelImpl =
			(DetailOfBusinessSecThreeModelImpl)detailOfBusinessSecThree;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (detailOfBusinessSecThree.getCreateDate() == null)) {
			if (serviceContext == null) {
				detailOfBusinessSecThree.setCreateDate(date);
			}
			else {
				detailOfBusinessSecThree.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!detailOfBusinessSecThreeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				detailOfBusinessSecThree.setModifiedDate(date);
			}
			else {
				detailOfBusinessSecThree.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(detailOfBusinessSecThree);
			}
			else {
				detailOfBusinessSecThree =
					(DetailOfBusinessSecThree)session.merge(
						detailOfBusinessSecThree);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			DetailOfBusinessSecThreeImpl.class,
			detailOfBusinessSecThreeModelImpl, false, true);

		cacheUniqueFindersCache(detailOfBusinessSecThreeModelImpl);

		if (isNew) {
			detailOfBusinessSecThree.setNew(false);
		}

		detailOfBusinessSecThree.resetOriginalValues();

		return detailOfBusinessSecThree;
	}

	/**
	 * Returns the detail of business sec three with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the detail of business sec three
	 * @return the detail of business sec three
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	@Override
	public DetailOfBusinessSecThree findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDetailOfBusinessSecThreeException {

		DetailOfBusinessSecThree detailOfBusinessSecThree = fetchByPrimaryKey(
			primaryKey);

		if (detailOfBusinessSecThree == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDetailOfBusinessSecThreeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return detailOfBusinessSecThree;
	}

	/**
	 * Returns the detail of business sec three with the primary key or throws a <code>NoSuchDetailOfBusinessSecThreeException</code> if it could not be found.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three
	 * @throws NoSuchDetailOfBusinessSecThreeException if a detail of business sec three with the primary key could not be found
	 */
	@Override
	public DetailOfBusinessSecThree findByPrimaryKey(
			long detailOfBusinessSecThreeId)
		throws NoSuchDetailOfBusinessSecThreeException {

		return findByPrimaryKey((Serializable)detailOfBusinessSecThreeId);
	}

	/**
	 * Returns the detail of business sec three with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param detailOfBusinessSecThreeId the primary key of the detail of business sec three
	 * @return the detail of business sec three, or <code>null</code> if a detail of business sec three with the primary key could not be found
	 */
	@Override
	public DetailOfBusinessSecThree fetchByPrimaryKey(
		long detailOfBusinessSecThreeId) {

		return fetchByPrimaryKey((Serializable)detailOfBusinessSecThreeId);
	}

	/**
	 * Returns all the detail of business sec threes.
	 *
	 * @return the detail of business sec threes
	 */
	@Override
	public List<DetailOfBusinessSecThree> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @return the range of detail of business sec threes
	 */
	@Override
	public List<DetailOfBusinessSecThree> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of detail of business sec threes
	 */
	@Override
	public List<DetailOfBusinessSecThree> findAll(
		int start, int end,
		OrderByComparator<DetailOfBusinessSecThree> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the detail of business sec threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>DetailOfBusinessSecThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of detail of business sec threes
	 * @param end the upper bound of the range of detail of business sec threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of detail of business sec threes
	 */
	@Override
	public List<DetailOfBusinessSecThree> findAll(
		int start, int end,
		OrderByComparator<DetailOfBusinessSecThree> orderByComparator,
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

		List<DetailOfBusinessSecThree> list = null;

		if (useFinderCache) {
			list = (List<DetailOfBusinessSecThree>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_DETAILOFBUSINESSSECTHREE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_DETAILOFBUSINESSSECTHREE;

				sql = sql.concat(
					DetailOfBusinessSecThreeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<DetailOfBusinessSecThree>)QueryUtil.list(
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
	 * Removes all the detail of business sec threes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (DetailOfBusinessSecThree detailOfBusinessSecThree : findAll()) {
			remove(detailOfBusinessSecThree);
		}
	}

	/**
	 * Returns the number of detail of business sec threes.
	 *
	 * @return the number of detail of business sec threes
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
					_SQL_COUNT_DETAILOFBUSINESSSECTHREE);

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
		return "detailOfBusinessSecThreeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_DETAILOFBUSINESSSECTHREE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return DetailOfBusinessSecThreeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the detail of business sec three persistence.
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

		_finderPathFetchBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, true);

		_finderPathCountBygetHsraById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetHsraById",
			new String[] {Long.class.getName()},
			new String[] {"hsraApplicationId"}, false);

		DetailOfBusinessSecThreeUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		DetailOfBusinessSecThreeUtil.setPersistence(null);

		entityCache.removeCache(DetailOfBusinessSecThreeImpl.class.getName());
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = HSRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_DETAILOFBUSINESSSECTHREE =
		"SELECT detailOfBusinessSecThree FROM DetailOfBusinessSecThree detailOfBusinessSecThree";

	private static final String _SQL_SELECT_DETAILOFBUSINESSSECTHREE_WHERE =
		"SELECT detailOfBusinessSecThree FROM DetailOfBusinessSecThree detailOfBusinessSecThree WHERE ";

	private static final String _SQL_COUNT_DETAILOFBUSINESSSECTHREE =
		"SELECT COUNT(detailOfBusinessSecThree) FROM DetailOfBusinessSecThree detailOfBusinessSecThree";

	private static final String _SQL_COUNT_DETAILOFBUSINESSSECTHREE_WHERE =
		"SELECT COUNT(detailOfBusinessSecThree) FROM DetailOfBusinessSecThree detailOfBusinessSecThree WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"detailOfBusinessSecThree.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No DetailOfBusinessSecThree exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No DetailOfBusinessSecThree exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		DetailOfBusinessSecThreePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
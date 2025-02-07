/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncbj.application.form.service.service.persistence.impl;

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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionThreeException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionThree;
import com.nbp.ncbj.application.form.service.model.NcbjSectionThreeTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionThreeModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionThreePersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionThreeUtil;
import com.nbp.ncbj.application.form.service.service.persistence.impl.constants.FOOPersistenceConstants;

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
 * The persistence implementation for the ncbj section three service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjSectionThreePersistence.class)
public class NcbjSectionThreePersistenceImpl
	extends BasePersistenceImpl<NcbjSectionThree>
	implements NcbjSectionThreePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjSectionThreeUtil</code> to access the ncbj section three persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjSectionThreeImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNCBJByAppId;
	private FinderPath _finderPathCountBygetNCBJByAppId;

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionThreeException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section three
	 * @throws NoSuchNcbjSectionThreeException if a matching ncbj section three could not be found
	 */
	@Override
	public NcbjSectionThree findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionThreeException {

		NcbjSectionThree ncbjSectionThree = fetchBygetNCBJByAppId(
			ncbjApplicationId);

		if (ncbjSectionThree == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjSectionThreeException(sb.toString());
		}

		return ncbjSectionThree;
	}

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section three, or <code>null</code> if a matching ncbj section three could not be found
	 */
	@Override
	public NcbjSectionThree fetchBygetNCBJByAppId(long ncbjApplicationId) {
		return fetchBygetNCBJByAppId(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj section three where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section three, or <code>null</code> if a matching ncbj section three could not be found
	 */
	@Override
	public NcbjSectionThree fetchBygetNCBJByAppId(
		long ncbjApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncbjApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNCBJByAppId, finderArgs, this);
		}

		if (result instanceof NcbjSectionThree) {
			NcbjSectionThree ncbjSectionThree = (NcbjSectionThree)result;

			if (ncbjApplicationId != ncbjSectionThree.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJSECTIONTHREE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjSectionThree> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNCBJByAppId, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncbjApplicationId};
							}

							_log.warn(
								"NcbjSectionThreePersistenceImpl.fetchBygetNCBJByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjSectionThree ncbjSectionThree = list.get(0);

					result = ncbjSectionThree;

					cacheResult(ncbjSectionThree);
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
			return (NcbjSectionThree)result;
		}
	}

	/**
	 * Removes the ncbj section three where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section three that was removed
	 */
	@Override
	public NcbjSectionThree removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionThreeException {

		NcbjSectionThree ncbjSectionThree = findBygetNCBJByAppId(
			ncbjApplicationId);

		return remove(ncbjSectionThree);
	}

	/**
	 * Returns the number of ncbj section threes where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section threes
	 */
	@Override
	public int countBygetNCBJByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSECTIONTHREE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

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
		_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2 =
			"ncbjSectionThree.ncbjApplicationId = ?";

	public NcbjSectionThreePersistenceImpl() {
		setModelClass(NcbjSectionThree.class);

		setModelImplClass(NcbjSectionThreeImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjSectionThreeTable.INSTANCE);
	}

	/**
	 * Caches the ncbj section three in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionThree the ncbj section three
	 */
	@Override
	public void cacheResult(NcbjSectionThree ncbjSectionThree) {
		entityCache.putResult(
			NcbjSectionThreeImpl.class, ncbjSectionThree.getPrimaryKey(),
			ncbjSectionThree);

		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId,
			new Object[] {ncbjSectionThree.getNcbjApplicationId()},
			ncbjSectionThree);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj section threes in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionThrees the ncbj section threes
	 */
	@Override
	public void cacheResult(List<NcbjSectionThree> ncbjSectionThrees) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjSectionThrees.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjSectionThree ncbjSectionThree : ncbjSectionThrees) {
			if (entityCache.getResult(
					NcbjSectionThreeImpl.class,
					ncbjSectionThree.getPrimaryKey()) == null) {

				cacheResult(ncbjSectionThree);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj section threes.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjSectionThreeImpl.class);

		finderCache.clearCache(NcbjSectionThreeImpl.class);
	}

	/**
	 * Clears the cache for the ncbj section three.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjSectionThree ncbjSectionThree) {
		entityCache.removeResult(NcbjSectionThreeImpl.class, ncbjSectionThree);
	}

	@Override
	public void clearCache(List<NcbjSectionThree> ncbjSectionThrees) {
		for (NcbjSectionThree ncbjSectionThree : ncbjSectionThrees) {
			entityCache.removeResult(
				NcbjSectionThreeImpl.class, ncbjSectionThree);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjSectionThreeImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjSectionThreeImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjSectionThreeModelImpl ncbjSectionThreeModelImpl) {

		Object[] args = new Object[] {
			ncbjSectionThreeModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId, args, ncbjSectionThreeModelImpl);
	}

	/**
	 * Creates a new ncbj section three with the primary key. Does not add the ncbj section three to the database.
	 *
	 * @param ncbjSectionThreeId the primary key for the new ncbj section three
	 * @return the new ncbj section three
	 */
	@Override
	public NcbjSectionThree create(long ncbjSectionThreeId) {
		NcbjSectionThree ncbjSectionThree = new NcbjSectionThreeImpl();

		ncbjSectionThree.setNew(true);
		ncbjSectionThree.setPrimaryKey(ncbjSectionThreeId);

		ncbjSectionThree.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjSectionThree;
	}

	/**
	 * Removes the ncbj section three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three that was removed
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	@Override
	public NcbjSectionThree remove(long ncbjSectionThreeId)
		throws NoSuchNcbjSectionThreeException {

		return remove((Serializable)ncbjSectionThreeId);
	}

	/**
	 * Removes the ncbj section three with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj section three
	 * @return the ncbj section three that was removed
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	@Override
	public NcbjSectionThree remove(Serializable primaryKey)
		throws NoSuchNcbjSectionThreeException {

		Session session = null;

		try {
			session = openSession();

			NcbjSectionThree ncbjSectionThree = (NcbjSectionThree)session.get(
				NcbjSectionThreeImpl.class, primaryKey);

			if (ncbjSectionThree == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjSectionThreeException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjSectionThree);
		}
		catch (NoSuchNcbjSectionThreeException noSuchEntityException) {
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
	protected NcbjSectionThree removeImpl(NcbjSectionThree ncbjSectionThree) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjSectionThree)) {
				ncbjSectionThree = (NcbjSectionThree)session.get(
					NcbjSectionThreeImpl.class,
					ncbjSectionThree.getPrimaryKeyObj());
			}

			if (ncbjSectionThree != null) {
				session.delete(ncbjSectionThree);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjSectionThree != null) {
			clearCache(ncbjSectionThree);
		}

		return ncbjSectionThree;
	}

	@Override
	public NcbjSectionThree updateImpl(NcbjSectionThree ncbjSectionThree) {
		boolean isNew = ncbjSectionThree.isNew();

		if (!(ncbjSectionThree instanceof NcbjSectionThreeModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjSectionThree.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjSectionThree);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjSectionThree proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjSectionThree implementation " +
					ncbjSectionThree.getClass());
		}

		NcbjSectionThreeModelImpl ncbjSectionThreeModelImpl =
			(NcbjSectionThreeModelImpl)ncbjSectionThree;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjSectionThree.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjSectionThree.setCreateDate(date);
			}
			else {
				ncbjSectionThree.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjSectionThreeModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjSectionThree.setModifiedDate(date);
			}
			else {
				ncbjSectionThree.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjSectionThree);
			}
			else {
				ncbjSectionThree = (NcbjSectionThree)session.merge(
					ncbjSectionThree);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjSectionThreeImpl.class, ncbjSectionThreeModelImpl, false, true);

		cacheUniqueFindersCache(ncbjSectionThreeModelImpl);

		if (isNew) {
			ncbjSectionThree.setNew(false);
		}

		ncbjSectionThree.resetOriginalValues();

		return ncbjSectionThree;
	}

	/**
	 * Returns the ncbj section three with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj section three
	 * @return the ncbj section three
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	@Override
	public NcbjSectionThree findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjSectionThreeException {

		NcbjSectionThree ncbjSectionThree = fetchByPrimaryKey(primaryKey);

		if (ncbjSectionThree == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjSectionThreeException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjSectionThree;
	}

	/**
	 * Returns the ncbj section three with the primary key or throws a <code>NoSuchNcbjSectionThreeException</code> if it could not be found.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three
	 * @throws NoSuchNcbjSectionThreeException if a ncbj section three with the primary key could not be found
	 */
	@Override
	public NcbjSectionThree findByPrimaryKey(long ncbjSectionThreeId)
		throws NoSuchNcbjSectionThreeException {

		return findByPrimaryKey((Serializable)ncbjSectionThreeId);
	}

	/**
	 * Returns the ncbj section three with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionThreeId the primary key of the ncbj section three
	 * @return the ncbj section three, or <code>null</code> if a ncbj section three with the primary key could not be found
	 */
	@Override
	public NcbjSectionThree fetchByPrimaryKey(long ncbjSectionThreeId) {
		return fetchByPrimaryKey((Serializable)ncbjSectionThreeId);
	}

	/**
	 * Returns all the ncbj section threes.
	 *
	 * @return the ncbj section threes
	 */
	@Override
	public List<NcbjSectionThree> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @return the range of ncbj section threes
	 */
	@Override
	public List<NcbjSectionThree> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section threes
	 */
	@Override
	public List<NcbjSectionThree> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionThree> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj section threes.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionThreeModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section threes
	 * @param end the upper bound of the range of ncbj section threes (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section threes
	 */
	@Override
	public List<NcbjSectionThree> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionThree> orderByComparator,
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

		List<NcbjSectionThree> list = null;

		if (useFinderCache) {
			list = (List<NcbjSectionThree>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJSECTIONTHREE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJSECTIONTHREE;

				sql = sql.concat(NcbjSectionThreeModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjSectionThree>)QueryUtil.list(
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
	 * Removes all the ncbj section threes from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjSectionThree ncbjSectionThree : findAll()) {
			remove(ncbjSectionThree);
		}
	}

	/**
	 * Returns the number of ncbj section threes.
	 *
	 * @return the number of ncbj section threes
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJSECTIONTHREE);

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
		return "ncbjSectionThreeId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJSECTIONTHREE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjSectionThreeModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj section three persistence.
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

		_finderPathFetchBygetNCBJByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNCBJByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, true);

		_finderPathCountBygetNCBJByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetNCBJByAppId",
			new String[] {Long.class.getName()},
			new String[] {"ncbjApplicationId"}, false);

		NcbjSectionThreeUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjSectionThreeUtil.setPersistence(null);

		entityCache.removeCache(NcbjSectionThreeImpl.class.getName());
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = FOOPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCBJSECTIONTHREE =
		"SELECT ncbjSectionThree FROM NcbjSectionThree ncbjSectionThree";

	private static final String _SQL_SELECT_NCBJSECTIONTHREE_WHERE =
		"SELECT ncbjSectionThree FROM NcbjSectionThree ncbjSectionThree WHERE ";

	private static final String _SQL_COUNT_NCBJSECTIONTHREE =
		"SELECT COUNT(ncbjSectionThree) FROM NcbjSectionThree ncbjSectionThree";

	private static final String _SQL_COUNT_NCBJSECTIONTHREE_WHERE =
		"SELECT COUNT(ncbjSectionThree) FROM NcbjSectionThree ncbjSectionThree WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjSectionThree.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjSectionThree exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjSectionThree exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjSectionThreePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
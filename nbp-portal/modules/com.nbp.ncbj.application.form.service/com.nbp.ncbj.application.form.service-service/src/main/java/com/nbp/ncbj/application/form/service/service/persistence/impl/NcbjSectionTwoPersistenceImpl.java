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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionTwoException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionTwo;
import com.nbp.ncbj.application.form.service.model.NcbjSectionTwoTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionTwoImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionTwoModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionTwoPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionTwoUtil;
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
 * The persistence implementation for the ncbj section two service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjSectionTwoPersistence.class)
public class NcbjSectionTwoPersistenceImpl
	extends BasePersistenceImpl<NcbjSectionTwo>
	implements NcbjSectionTwoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjSectionTwoUtil</code> to access the ncbj section two persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjSectionTwoImpl.class.getName();

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
	 * Returns the ncbj section two where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionTwoException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section two
	 * @throws NoSuchNcbjSectionTwoException if a matching ncbj section two could not be found
	 */
	@Override
	public NcbjSectionTwo findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionTwoException {

		NcbjSectionTwo ncbjSectionTwo = fetchBygetNCBJByAppId(
			ncbjApplicationId);

		if (ncbjSectionTwo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjSectionTwoException(sb.toString());
		}

		return ncbjSectionTwo;
	}

	/**
	 * Returns the ncbj section two where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section two, or <code>null</code> if a matching ncbj section two could not be found
	 */
	@Override
	public NcbjSectionTwo fetchBygetNCBJByAppId(long ncbjApplicationId) {
		return fetchBygetNCBJByAppId(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj section two where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section two, or <code>null</code> if a matching ncbj section two could not be found
	 */
	@Override
	public NcbjSectionTwo fetchBygetNCBJByAppId(
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

		if (result instanceof NcbjSectionTwo) {
			NcbjSectionTwo ncbjSectionTwo = (NcbjSectionTwo)result;

			if (ncbjApplicationId != ncbjSectionTwo.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJSECTIONTWO_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjSectionTwo> list = query.list();

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
								"NcbjSectionTwoPersistenceImpl.fetchBygetNCBJByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjSectionTwo ncbjSectionTwo = list.get(0);

					result = ncbjSectionTwo;

					cacheResult(ncbjSectionTwo);
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
			return (NcbjSectionTwo)result;
		}
	}

	/**
	 * Removes the ncbj section two where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section two that was removed
	 */
	@Override
	public NcbjSectionTwo removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionTwoException {

		NcbjSectionTwo ncbjSectionTwo = findBygetNCBJByAppId(ncbjApplicationId);

		return remove(ncbjSectionTwo);
	}

	/**
	 * Returns the number of ncbj section twos where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section twos
	 */
	@Override
	public int countBygetNCBJByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSECTIONTWO_WHERE);

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
			"ncbjSectionTwo.ncbjApplicationId = ?";

	public NcbjSectionTwoPersistenceImpl() {
		setModelClass(NcbjSectionTwo.class);

		setModelImplClass(NcbjSectionTwoImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjSectionTwoTable.INSTANCE);
	}

	/**
	 * Caches the ncbj section two in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionTwo the ncbj section two
	 */
	@Override
	public void cacheResult(NcbjSectionTwo ncbjSectionTwo) {
		entityCache.putResult(
			NcbjSectionTwoImpl.class, ncbjSectionTwo.getPrimaryKey(),
			ncbjSectionTwo);

		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId,
			new Object[] {ncbjSectionTwo.getNcbjApplicationId()},
			ncbjSectionTwo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj section twos in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionTwos the ncbj section twos
	 */
	@Override
	public void cacheResult(List<NcbjSectionTwo> ncbjSectionTwos) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjSectionTwos.size() > _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjSectionTwo ncbjSectionTwo : ncbjSectionTwos) {
			if (entityCache.getResult(
					NcbjSectionTwoImpl.class, ncbjSectionTwo.getPrimaryKey()) ==
						null) {

				cacheResult(ncbjSectionTwo);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj section twos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjSectionTwoImpl.class);

		finderCache.clearCache(NcbjSectionTwoImpl.class);
	}

	/**
	 * Clears the cache for the ncbj section two.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjSectionTwo ncbjSectionTwo) {
		entityCache.removeResult(NcbjSectionTwoImpl.class, ncbjSectionTwo);
	}

	@Override
	public void clearCache(List<NcbjSectionTwo> ncbjSectionTwos) {
		for (NcbjSectionTwo ncbjSectionTwo : ncbjSectionTwos) {
			entityCache.removeResult(NcbjSectionTwoImpl.class, ncbjSectionTwo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjSectionTwoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjSectionTwoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjSectionTwoModelImpl ncbjSectionTwoModelImpl) {

		Object[] args = new Object[] {
			ncbjSectionTwoModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId, args, ncbjSectionTwoModelImpl);
	}

	/**
	 * Creates a new ncbj section two with the primary key. Does not add the ncbj section two to the database.
	 *
	 * @param ncbjSectionTwoId the primary key for the new ncbj section two
	 * @return the new ncbj section two
	 */
	@Override
	public NcbjSectionTwo create(long ncbjSectionTwoId) {
		NcbjSectionTwo ncbjSectionTwo = new NcbjSectionTwoImpl();

		ncbjSectionTwo.setNew(true);
		ncbjSectionTwo.setPrimaryKey(ncbjSectionTwoId);

		ncbjSectionTwo.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjSectionTwo;
	}

	/**
	 * Removes the ncbj section two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two that was removed
	 * @throws NoSuchNcbjSectionTwoException if a ncbj section two with the primary key could not be found
	 */
	@Override
	public NcbjSectionTwo remove(long ncbjSectionTwoId)
		throws NoSuchNcbjSectionTwoException {

		return remove((Serializable)ncbjSectionTwoId);
	}

	/**
	 * Removes the ncbj section two with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj section two
	 * @return the ncbj section two that was removed
	 * @throws NoSuchNcbjSectionTwoException if a ncbj section two with the primary key could not be found
	 */
	@Override
	public NcbjSectionTwo remove(Serializable primaryKey)
		throws NoSuchNcbjSectionTwoException {

		Session session = null;

		try {
			session = openSession();

			NcbjSectionTwo ncbjSectionTwo = (NcbjSectionTwo)session.get(
				NcbjSectionTwoImpl.class, primaryKey);

			if (ncbjSectionTwo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjSectionTwoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjSectionTwo);
		}
		catch (NoSuchNcbjSectionTwoException noSuchEntityException) {
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
	protected NcbjSectionTwo removeImpl(NcbjSectionTwo ncbjSectionTwo) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjSectionTwo)) {
				ncbjSectionTwo = (NcbjSectionTwo)session.get(
					NcbjSectionTwoImpl.class,
					ncbjSectionTwo.getPrimaryKeyObj());
			}

			if (ncbjSectionTwo != null) {
				session.delete(ncbjSectionTwo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjSectionTwo != null) {
			clearCache(ncbjSectionTwo);
		}

		return ncbjSectionTwo;
	}

	@Override
	public NcbjSectionTwo updateImpl(NcbjSectionTwo ncbjSectionTwo) {
		boolean isNew = ncbjSectionTwo.isNew();

		if (!(ncbjSectionTwo instanceof NcbjSectionTwoModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjSectionTwo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjSectionTwo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjSectionTwo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjSectionTwo implementation " +
					ncbjSectionTwo.getClass());
		}

		NcbjSectionTwoModelImpl ncbjSectionTwoModelImpl =
			(NcbjSectionTwoModelImpl)ncbjSectionTwo;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjSectionTwo.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjSectionTwo.setCreateDate(date);
			}
			else {
				ncbjSectionTwo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjSectionTwoModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjSectionTwo.setModifiedDate(date);
			}
			else {
				ncbjSectionTwo.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjSectionTwo);
			}
			else {
				ncbjSectionTwo = (NcbjSectionTwo)session.merge(ncbjSectionTwo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjSectionTwoImpl.class, ncbjSectionTwoModelImpl, false, true);

		cacheUniqueFindersCache(ncbjSectionTwoModelImpl);

		if (isNew) {
			ncbjSectionTwo.setNew(false);
		}

		ncbjSectionTwo.resetOriginalValues();

		return ncbjSectionTwo;
	}

	/**
	 * Returns the ncbj section two with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj section two
	 * @return the ncbj section two
	 * @throws NoSuchNcbjSectionTwoException if a ncbj section two with the primary key could not be found
	 */
	@Override
	public NcbjSectionTwo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjSectionTwoException {

		NcbjSectionTwo ncbjSectionTwo = fetchByPrimaryKey(primaryKey);

		if (ncbjSectionTwo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjSectionTwoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjSectionTwo;
	}

	/**
	 * Returns the ncbj section two with the primary key or throws a <code>NoSuchNcbjSectionTwoException</code> if it could not be found.
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two
	 * @throws NoSuchNcbjSectionTwoException if a ncbj section two with the primary key could not be found
	 */
	@Override
	public NcbjSectionTwo findByPrimaryKey(long ncbjSectionTwoId)
		throws NoSuchNcbjSectionTwoException {

		return findByPrimaryKey((Serializable)ncbjSectionTwoId);
	}

	/**
	 * Returns the ncbj section two with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionTwoId the primary key of the ncbj section two
	 * @return the ncbj section two, or <code>null</code> if a ncbj section two with the primary key could not be found
	 */
	@Override
	public NcbjSectionTwo fetchByPrimaryKey(long ncbjSectionTwoId) {
		return fetchByPrimaryKey((Serializable)ncbjSectionTwoId);
	}

	/**
	 * Returns all the ncbj section twos.
	 *
	 * @return the ncbj section twos
	 */
	@Override
	public List<NcbjSectionTwo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj section twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section twos
	 * @param end the upper bound of the range of ncbj section twos (not inclusive)
	 * @return the range of ncbj section twos
	 */
	@Override
	public List<NcbjSectionTwo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj section twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section twos
	 * @param end the upper bound of the range of ncbj section twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section twos
	 */
	@Override
	public List<NcbjSectionTwo> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionTwo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj section twos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionTwoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section twos
	 * @param end the upper bound of the range of ncbj section twos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section twos
	 */
	@Override
	public List<NcbjSectionTwo> findAll(
		int start, int end, OrderByComparator<NcbjSectionTwo> orderByComparator,
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

		List<NcbjSectionTwo> list = null;

		if (useFinderCache) {
			list = (List<NcbjSectionTwo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJSECTIONTWO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJSECTIONTWO;

				sql = sql.concat(NcbjSectionTwoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjSectionTwo>)QueryUtil.list(
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
	 * Removes all the ncbj section twos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjSectionTwo ncbjSectionTwo : findAll()) {
			remove(ncbjSectionTwo);
		}
	}

	/**
	 * Returns the number of ncbj section twos.
	 *
	 * @return the number of ncbj section twos
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJSECTIONTWO);

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
		return "ncbjSectionTwoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJSECTIONTWO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjSectionTwoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj section two persistence.
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

		NcbjSectionTwoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjSectionTwoUtil.setPersistence(null);

		entityCache.removeCache(NcbjSectionTwoImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJSECTIONTWO =
		"SELECT ncbjSectionTwo FROM NcbjSectionTwo ncbjSectionTwo";

	private static final String _SQL_SELECT_NCBJSECTIONTWO_WHERE =
		"SELECT ncbjSectionTwo FROM NcbjSectionTwo ncbjSectionTwo WHERE ";

	private static final String _SQL_COUNT_NCBJSECTIONTWO =
		"SELECT COUNT(ncbjSectionTwo) FROM NcbjSectionTwo ncbjSectionTwo";

	private static final String _SQL_COUNT_NCBJSECTIONTWO_WHERE =
		"SELECT COUNT(ncbjSectionTwo) FROM NcbjSectionTwo ncbjSectionTwo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjSectionTwo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjSectionTwo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjSectionTwo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjSectionTwoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
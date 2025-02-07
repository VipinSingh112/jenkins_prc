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

import com.nbp.ncbj.application.form.service.exception.NoSuchNcbjSectionFourException;
import com.nbp.ncbj.application.form.service.model.NcbjSectionFour;
import com.nbp.ncbj.application.form.service.model.NcbjSectionFourTable;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionFourImpl;
import com.nbp.ncbj.application.form.service.model.impl.NcbjSectionFourModelImpl;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionFourPersistence;
import com.nbp.ncbj.application.form.service.service.persistence.NcbjSectionFourUtil;
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
 * The persistence implementation for the ncbj section four service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcbjSectionFourPersistence.class)
public class NcbjSectionFourPersistenceImpl
	extends BasePersistenceImpl<NcbjSectionFour>
	implements NcbjSectionFourPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcbjSectionFourUtil</code> to access the ncbj section four persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcbjSectionFourImpl.class.getName();

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
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or throws a <code>NoSuchNcbjSectionFourException</code> if it could not be found.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section four
	 * @throws NoSuchNcbjSectionFourException if a matching ncbj section four could not be found
	 */
	@Override
	public NcbjSectionFour findBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionFourException {

		NcbjSectionFour ncbjSectionFour = fetchBygetNCBJByAppId(
			ncbjApplicationId);

		if (ncbjSectionFour == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncbjApplicationId=");
			sb.append(ncbjApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcbjSectionFourException(sb.toString());
		}

		return ncbjSectionFour;
	}

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the matching ncbj section four, or <code>null</code> if a matching ncbj section four could not be found
	 */
	@Override
	public NcbjSectionFour fetchBygetNCBJByAppId(long ncbjApplicationId) {
		return fetchBygetNCBJByAppId(ncbjApplicationId, true);
	}

	/**
	 * Returns the ncbj section four where ncbjApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncbj section four, or <code>null</code> if a matching ncbj section four could not be found
	 */
	@Override
	public NcbjSectionFour fetchBygetNCBJByAppId(
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

		if (result instanceof NcbjSectionFour) {
			NcbjSectionFour ncbjSectionFour = (NcbjSectionFour)result;

			if (ncbjApplicationId != ncbjSectionFour.getNcbjApplicationId()) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCBJSECTIONFOUR_WHERE);

			sb.append(_FINDER_COLUMN_GETNCBJBYAPPID_NCBJAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncbjApplicationId);

				List<NcbjSectionFour> list = query.list();

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
								"NcbjSectionFourPersistenceImpl.fetchBygetNCBJByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcbjSectionFour ncbjSectionFour = list.get(0);

					result = ncbjSectionFour;

					cacheResult(ncbjSectionFour);
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
			return (NcbjSectionFour)result;
		}
	}

	/**
	 * Removes the ncbj section four where ncbjApplicationId = &#63; from the database.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the ncbj section four that was removed
	 */
	@Override
	public NcbjSectionFour removeBygetNCBJByAppId(long ncbjApplicationId)
		throws NoSuchNcbjSectionFourException {

		NcbjSectionFour ncbjSectionFour = findBygetNCBJByAppId(
			ncbjApplicationId);

		return remove(ncbjSectionFour);
	}

	/**
	 * Returns the number of ncbj section fours where ncbjApplicationId = &#63;.
	 *
	 * @param ncbjApplicationId the ncbj application ID
	 * @return the number of matching ncbj section fours
	 */
	@Override
	public int countBygetNCBJByAppId(long ncbjApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNCBJByAppId;

		Object[] finderArgs = new Object[] {ncbjApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCBJSECTIONFOUR_WHERE);

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
			"ncbjSectionFour.ncbjApplicationId = ?";

	public NcbjSectionFourPersistenceImpl() {
		setModelClass(NcbjSectionFour.class);

		setModelImplClass(NcbjSectionFourImpl.class);
		setModelPKClass(long.class);

		setTable(NcbjSectionFourTable.INSTANCE);
	}

	/**
	 * Caches the ncbj section four in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionFour the ncbj section four
	 */
	@Override
	public void cacheResult(NcbjSectionFour ncbjSectionFour) {
		entityCache.putResult(
			NcbjSectionFourImpl.class, ncbjSectionFour.getPrimaryKey(),
			ncbjSectionFour);

		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId,
			new Object[] {ncbjSectionFour.getNcbjApplicationId()},
			ncbjSectionFour);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncbj section fours in the entity cache if it is enabled.
	 *
	 * @param ncbjSectionFours the ncbj section fours
	 */
	@Override
	public void cacheResult(List<NcbjSectionFour> ncbjSectionFours) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncbjSectionFours.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcbjSectionFour ncbjSectionFour : ncbjSectionFours) {
			if (entityCache.getResult(
					NcbjSectionFourImpl.class,
					ncbjSectionFour.getPrimaryKey()) == null) {

				cacheResult(ncbjSectionFour);
			}
		}
	}

	/**
	 * Clears the cache for all ncbj section fours.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcbjSectionFourImpl.class);

		finderCache.clearCache(NcbjSectionFourImpl.class);
	}

	/**
	 * Clears the cache for the ncbj section four.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcbjSectionFour ncbjSectionFour) {
		entityCache.removeResult(NcbjSectionFourImpl.class, ncbjSectionFour);
	}

	@Override
	public void clearCache(List<NcbjSectionFour> ncbjSectionFours) {
		for (NcbjSectionFour ncbjSectionFour : ncbjSectionFours) {
			entityCache.removeResult(
				NcbjSectionFourImpl.class, ncbjSectionFour);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcbjSectionFourImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(NcbjSectionFourImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcbjSectionFourModelImpl ncbjSectionFourModelImpl) {

		Object[] args = new Object[] {
			ncbjSectionFourModelImpl.getNcbjApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNCBJByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNCBJByAppId, args, ncbjSectionFourModelImpl);
	}

	/**
	 * Creates a new ncbj section four with the primary key. Does not add the ncbj section four to the database.
	 *
	 * @param ncbjSectionFourId the primary key for the new ncbj section four
	 * @return the new ncbj section four
	 */
	@Override
	public NcbjSectionFour create(long ncbjSectionFourId) {
		NcbjSectionFour ncbjSectionFour = new NcbjSectionFourImpl();

		ncbjSectionFour.setNew(true);
		ncbjSectionFour.setPrimaryKey(ncbjSectionFourId);

		ncbjSectionFour.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncbjSectionFour;
	}

	/**
	 * Removes the ncbj section four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four that was removed
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	@Override
	public NcbjSectionFour remove(long ncbjSectionFourId)
		throws NoSuchNcbjSectionFourException {

		return remove((Serializable)ncbjSectionFourId);
	}

	/**
	 * Removes the ncbj section four with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncbj section four
	 * @return the ncbj section four that was removed
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	@Override
	public NcbjSectionFour remove(Serializable primaryKey)
		throws NoSuchNcbjSectionFourException {

		Session session = null;

		try {
			session = openSession();

			NcbjSectionFour ncbjSectionFour = (NcbjSectionFour)session.get(
				NcbjSectionFourImpl.class, primaryKey);

			if (ncbjSectionFour == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcbjSectionFourException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncbjSectionFour);
		}
		catch (NoSuchNcbjSectionFourException noSuchEntityException) {
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
	protected NcbjSectionFour removeImpl(NcbjSectionFour ncbjSectionFour) {
		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncbjSectionFour)) {
				ncbjSectionFour = (NcbjSectionFour)session.get(
					NcbjSectionFourImpl.class,
					ncbjSectionFour.getPrimaryKeyObj());
			}

			if (ncbjSectionFour != null) {
				session.delete(ncbjSectionFour);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncbjSectionFour != null) {
			clearCache(ncbjSectionFour);
		}

		return ncbjSectionFour;
	}

	@Override
	public NcbjSectionFour updateImpl(NcbjSectionFour ncbjSectionFour) {
		boolean isNew = ncbjSectionFour.isNew();

		if (!(ncbjSectionFour instanceof NcbjSectionFourModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncbjSectionFour.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncbjSectionFour);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncbjSectionFour proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcbjSectionFour implementation " +
					ncbjSectionFour.getClass());
		}

		NcbjSectionFourModelImpl ncbjSectionFourModelImpl =
			(NcbjSectionFourModelImpl)ncbjSectionFour;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncbjSectionFour.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncbjSectionFour.setCreateDate(date);
			}
			else {
				ncbjSectionFour.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncbjSectionFourModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncbjSectionFour.setModifiedDate(date);
			}
			else {
				ncbjSectionFour.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncbjSectionFour);
			}
			else {
				ncbjSectionFour = (NcbjSectionFour)session.merge(
					ncbjSectionFour);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcbjSectionFourImpl.class, ncbjSectionFourModelImpl, false, true);

		cacheUniqueFindersCache(ncbjSectionFourModelImpl);

		if (isNew) {
			ncbjSectionFour.setNew(false);
		}

		ncbjSectionFour.resetOriginalValues();

		return ncbjSectionFour;
	}

	/**
	 * Returns the ncbj section four with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncbj section four
	 * @return the ncbj section four
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	@Override
	public NcbjSectionFour findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcbjSectionFourException {

		NcbjSectionFour ncbjSectionFour = fetchByPrimaryKey(primaryKey);

		if (ncbjSectionFour == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcbjSectionFourException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncbjSectionFour;
	}

	/**
	 * Returns the ncbj section four with the primary key or throws a <code>NoSuchNcbjSectionFourException</code> if it could not be found.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four
	 * @throws NoSuchNcbjSectionFourException if a ncbj section four with the primary key could not be found
	 */
	@Override
	public NcbjSectionFour findByPrimaryKey(long ncbjSectionFourId)
		throws NoSuchNcbjSectionFourException {

		return findByPrimaryKey((Serializable)ncbjSectionFourId);
	}

	/**
	 * Returns the ncbj section four with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncbjSectionFourId the primary key of the ncbj section four
	 * @return the ncbj section four, or <code>null</code> if a ncbj section four with the primary key could not be found
	 */
	@Override
	public NcbjSectionFour fetchByPrimaryKey(long ncbjSectionFourId) {
		return fetchByPrimaryKey((Serializable)ncbjSectionFourId);
	}

	/**
	 * Returns all the ncbj section fours.
	 *
	 * @return the ncbj section fours
	 */
	@Override
	public List<NcbjSectionFour> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @return the range of ncbj section fours
	 */
	@Override
	public List<NcbjSectionFour> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncbj section fours
	 */
	@Override
	public List<NcbjSectionFour> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionFour> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncbj section fours.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcbjSectionFourModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncbj section fours
	 * @param end the upper bound of the range of ncbj section fours (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncbj section fours
	 */
	@Override
	public List<NcbjSectionFour> findAll(
		int start, int end,
		OrderByComparator<NcbjSectionFour> orderByComparator,
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

		List<NcbjSectionFour> list = null;

		if (useFinderCache) {
			list = (List<NcbjSectionFour>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCBJSECTIONFOUR);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCBJSECTIONFOUR;

				sql = sql.concat(NcbjSectionFourModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcbjSectionFour>)QueryUtil.list(
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
	 * Removes all the ncbj section fours from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcbjSectionFour ncbjSectionFour : findAll()) {
			remove(ncbjSectionFour);
		}
	}

	/**
	 * Returns the number of ncbj section fours.
	 *
	 * @return the number of ncbj section fours
	 */
	@Override
	public int countAll() {
		Long count = (Long)finderCache.getResult(
			_finderPathCountAll, FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(_SQL_COUNT_NCBJSECTIONFOUR);

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
		return "ncbjSectionFourId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCBJSECTIONFOUR;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcbjSectionFourModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncbj section four persistence.
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

		NcbjSectionFourUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcbjSectionFourUtil.setPersistence(null);

		entityCache.removeCache(NcbjSectionFourImpl.class.getName());
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

	private static final String _SQL_SELECT_NCBJSECTIONFOUR =
		"SELECT ncbjSectionFour FROM NcbjSectionFour ncbjSectionFour";

	private static final String _SQL_SELECT_NCBJSECTIONFOUR_WHERE =
		"SELECT ncbjSectionFour FROM NcbjSectionFour ncbjSectionFour WHERE ";

	private static final String _SQL_COUNT_NCBJSECTIONFOUR =
		"SELECT COUNT(ncbjSectionFour) FROM NcbjSectionFour ncbjSectionFour";

	private static final String _SQL_COUNT_NCBJSECTIONFOUR_WHERE =
		"SELECT COUNT(ncbjSectionFour) FROM NcbjSectionFour ncbjSectionFour WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "ncbjSectionFour.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcbjSectionFour exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcbjSectionFour exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcbjSectionFourPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
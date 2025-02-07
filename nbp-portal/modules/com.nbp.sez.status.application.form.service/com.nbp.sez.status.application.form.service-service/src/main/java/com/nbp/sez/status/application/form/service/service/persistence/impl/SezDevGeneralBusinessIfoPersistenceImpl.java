/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.sez.status.application.form.service.service.persistence.impl;

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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevGeneralBusinessIfoException;
import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfo;
import com.nbp.sez.status.application.form.service.model.SezDevGeneralBusinessIfoTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevGeneralBusinessIfoModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevGeneralBusinessIfoPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevGeneralBusinessIfoUtil;
import com.nbp.sez.status.application.form.service.service.persistence.impl.constants.SEZ_STATUSPersistenceConstants;

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
 * The persistence implementation for the sez dev general business ifo service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevGeneralBusinessIfoPersistence.class)
public class SezDevGeneralBusinessIfoPersistenceImpl
	extends BasePersistenceImpl<SezDevGeneralBusinessIfo>
	implements SezDevGeneralBusinessIfoPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevGeneralBusinessIfoUtil</code> to access the sez dev general business ifo persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevGeneralBusinessIfoImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetSezStatusByAppId;
	private FinderPath _finderPathCountBygetSezStatusByAppId;

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevGeneralBusinessIfoException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev general business ifo
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a matching sez dev general business ifo could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevGeneralBusinessIfoException {

		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezDevGeneralBusinessIfo == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDevGeneralBusinessIfoException(sb.toString());
		}

		return sezDevGeneralBusinessIfo;
	}

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev general business ifo, or <code>null</code> if a matching sez dev general business ifo could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez dev general business ifo where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev general business ifo, or <code>null</code> if a matching sez dev general business ifo could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo fetchBygetSezStatusByAppId(
		long sezStatusApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {sezStatusApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetSezStatusByAppId, finderArgs, this);
		}

		if (result instanceof SezDevGeneralBusinessIfo) {
			SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo =
				(SezDevGeneralBusinessIfo)result;

			if (sezStatusApplicationId !=
					sezDevGeneralBusinessIfo.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVGENERALBUSINESSIFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDevGeneralBusinessIfo> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetSezStatusByAppId, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									sezStatusApplicationId
								};
							}

							_log.warn(
								"SezDevGeneralBusinessIfoPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo =
						list.get(0);

					result = sezDevGeneralBusinessIfo;

					cacheResult(sezDevGeneralBusinessIfo);
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
			return (SezDevGeneralBusinessIfo)result;
		}
	}

	/**
	 * Removes the sez dev general business ifo where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev general business ifo that was removed
	 */
	@Override
	public SezDevGeneralBusinessIfo removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevGeneralBusinessIfoException {

		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezDevGeneralBusinessIfo);
	}

	/**
	 * Returns the number of sez dev general business ifos where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev general business ifos
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVGENERALBUSINESSIFO_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

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
		_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2 =
			"sezDevGeneralBusinessIfo.sezStatusApplicationId = ?";

	public SezDevGeneralBusinessIfoPersistenceImpl() {
		setModelClass(SezDevGeneralBusinessIfo.class);

		setModelImplClass(SezDevGeneralBusinessIfoImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevGeneralBusinessIfoTable.INSTANCE);
	}

	/**
	 * Caches the sez dev general business ifo in the entity cache if it is enabled.
	 *
	 * @param sezDevGeneralBusinessIfo the sez dev general business ifo
	 */
	@Override
	public void cacheResult(SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {
		entityCache.putResult(
			SezDevGeneralBusinessIfoImpl.class,
			sezDevGeneralBusinessIfo.getPrimaryKey(), sezDevGeneralBusinessIfo);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezDevGeneralBusinessIfo.getSezStatusApplicationId()},
			sezDevGeneralBusinessIfo);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev general business ifos in the entity cache if it is enabled.
	 *
	 * @param sezDevGeneralBusinessIfos the sez dev general business ifos
	 */
	@Override
	public void cacheResult(
		List<SezDevGeneralBusinessIfo> sezDevGeneralBusinessIfos) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevGeneralBusinessIfos.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo :
				sezDevGeneralBusinessIfos) {

			if (entityCache.getResult(
					SezDevGeneralBusinessIfoImpl.class,
					sezDevGeneralBusinessIfo.getPrimaryKey()) == null) {

				cacheResult(sezDevGeneralBusinessIfo);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev general business ifos.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevGeneralBusinessIfoImpl.class);

		finderCache.clearCache(SezDevGeneralBusinessIfoImpl.class);
	}

	/**
	 * Clears the cache for the sez dev general business ifo.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {
		entityCache.removeResult(
			SezDevGeneralBusinessIfoImpl.class, sezDevGeneralBusinessIfo);
	}

	@Override
	public void clearCache(
		List<SezDevGeneralBusinessIfo> sezDevGeneralBusinessIfos) {

		for (SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo :
				sezDevGeneralBusinessIfos) {

			entityCache.removeResult(
				SezDevGeneralBusinessIfoImpl.class, sezDevGeneralBusinessIfo);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevGeneralBusinessIfoImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevGeneralBusinessIfoImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDevGeneralBusinessIfoModelImpl sezDevGeneralBusinessIfoModelImpl) {

		Object[] args = new Object[] {
			sezDevGeneralBusinessIfoModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDevGeneralBusinessIfoModelImpl);
	}

	/**
	 * Creates a new sez dev general business ifo with the primary key. Does not add the sez dev general business ifo to the database.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key for the new sez dev general business ifo
	 * @return the new sez dev general business ifo
	 */
	@Override
	public SezDevGeneralBusinessIfo create(long sezDevGeneralBusinessIfoId) {
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo =
			new SezDevGeneralBusinessIfoImpl();

		sezDevGeneralBusinessIfo.setNew(true);
		sezDevGeneralBusinessIfo.setPrimaryKey(sezDevGeneralBusinessIfoId);

		sezDevGeneralBusinessIfo.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevGeneralBusinessIfo;
	}

	/**
	 * Removes the sez dev general business ifo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo that was removed
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo remove(long sezDevGeneralBusinessIfoId)
		throws NoSuchSezDevGeneralBusinessIfoException {

		return remove((Serializable)sezDevGeneralBusinessIfoId);
	}

	/**
	 * Removes the sez dev general business ifo with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo that was removed
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo remove(Serializable primaryKey)
		throws NoSuchSezDevGeneralBusinessIfoException {

		Session session = null;

		try {
			session = openSession();

			SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo =
				(SezDevGeneralBusinessIfo)session.get(
					SezDevGeneralBusinessIfoImpl.class, primaryKey);

			if (sezDevGeneralBusinessIfo == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevGeneralBusinessIfoException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevGeneralBusinessIfo);
		}
		catch (NoSuchSezDevGeneralBusinessIfoException noSuchEntityException) {
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
	protected SezDevGeneralBusinessIfo removeImpl(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevGeneralBusinessIfo)) {
				sezDevGeneralBusinessIfo =
					(SezDevGeneralBusinessIfo)session.get(
						SezDevGeneralBusinessIfoImpl.class,
						sezDevGeneralBusinessIfo.getPrimaryKeyObj());
			}

			if (sezDevGeneralBusinessIfo != null) {
				session.delete(sezDevGeneralBusinessIfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevGeneralBusinessIfo != null) {
			clearCache(sezDevGeneralBusinessIfo);
		}

		return sezDevGeneralBusinessIfo;
	}

	@Override
	public SezDevGeneralBusinessIfo updateImpl(
		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo) {

		boolean isNew = sezDevGeneralBusinessIfo.isNew();

		if (!(sezDevGeneralBusinessIfo instanceof
				SezDevGeneralBusinessIfoModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDevGeneralBusinessIfo.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevGeneralBusinessIfo);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevGeneralBusinessIfo proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevGeneralBusinessIfo implementation " +
					sezDevGeneralBusinessIfo.getClass());
		}

		SezDevGeneralBusinessIfoModelImpl sezDevGeneralBusinessIfoModelImpl =
			(SezDevGeneralBusinessIfoModelImpl)sezDevGeneralBusinessIfo;

		if (isNew && (sezDevGeneralBusinessIfo.getCreateDate() == null)) {
			ServiceContext serviceContext =
				ServiceContextThreadLocal.getServiceContext();

			Date date = new Date();

			if (serviceContext == null) {
				sezDevGeneralBusinessIfo.setCreateDate(date);
			}
			else {
				sezDevGeneralBusinessIfo.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevGeneralBusinessIfo);
			}
			else {
				sezDevGeneralBusinessIfo =
					(SezDevGeneralBusinessIfo)session.merge(
						sezDevGeneralBusinessIfo);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevGeneralBusinessIfoImpl.class,
			sezDevGeneralBusinessIfoModelImpl, false, true);

		cacheUniqueFindersCache(sezDevGeneralBusinessIfoModelImpl);

		if (isNew) {
			sezDevGeneralBusinessIfo.setNew(false);
		}

		sezDevGeneralBusinessIfo.resetOriginalValues();

		return sezDevGeneralBusinessIfo;
	}

	/**
	 * Returns the sez dev general business ifo with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDevGeneralBusinessIfoException {

		SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo = fetchByPrimaryKey(
			primaryKey);

		if (sezDevGeneralBusinessIfo == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevGeneralBusinessIfoException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevGeneralBusinessIfo;
	}

	/**
	 * Returns the sez dev general business ifo with the primary key or throws a <code>NoSuchSezDevGeneralBusinessIfoException</code> if it could not be found.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo
	 * @throws NoSuchSezDevGeneralBusinessIfoException if a sez dev general business ifo with the primary key could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo findByPrimaryKey(
			long sezDevGeneralBusinessIfoId)
		throws NoSuchSezDevGeneralBusinessIfoException {

		return findByPrimaryKey((Serializable)sezDevGeneralBusinessIfoId);
	}

	/**
	 * Returns the sez dev general business ifo with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevGeneralBusinessIfoId the primary key of the sez dev general business ifo
	 * @return the sez dev general business ifo, or <code>null</code> if a sez dev general business ifo with the primary key could not be found
	 */
	@Override
	public SezDevGeneralBusinessIfo fetchByPrimaryKey(
		long sezDevGeneralBusinessIfoId) {

		return fetchByPrimaryKey((Serializable)sezDevGeneralBusinessIfoId);
	}

	/**
	 * Returns all the sez dev general business ifos.
	 *
	 * @return the sez dev general business ifos
	 */
	@Override
	public List<SezDevGeneralBusinessIfo> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @return the range of sez dev general business ifos
	 */
	@Override
	public List<SezDevGeneralBusinessIfo> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev general business ifos
	 */
	@Override
	public List<SezDevGeneralBusinessIfo> findAll(
		int start, int end,
		OrderByComparator<SezDevGeneralBusinessIfo> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev general business ifos.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevGeneralBusinessIfoModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev general business ifos
	 * @param end the upper bound of the range of sez dev general business ifos (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev general business ifos
	 */
	@Override
	public List<SezDevGeneralBusinessIfo> findAll(
		int start, int end,
		OrderByComparator<SezDevGeneralBusinessIfo> orderByComparator,
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

		List<SezDevGeneralBusinessIfo> list = null;

		if (useFinderCache) {
			list = (List<SezDevGeneralBusinessIfo>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVGENERALBUSINESSIFO);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVGENERALBUSINESSIFO;

				sql = sql.concat(
					SezDevGeneralBusinessIfoModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevGeneralBusinessIfo>)QueryUtil.list(
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
	 * Removes all the sez dev general business ifos from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo : findAll()) {
			remove(sezDevGeneralBusinessIfo);
		}
	}

	/**
	 * Returns the number of sez dev general business ifos.
	 *
	 * @return the number of sez dev general business ifos
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
					_SQL_COUNT_SEZDEVGENERALBUSINESSIFO);

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
		return "sezDevGeneralBusinessIfoId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVGENERALBUSINESSIFO;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevGeneralBusinessIfoModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev general business ifo persistence.
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

		_finderPathFetchBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetSezStatusByAppId",
			new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, true);

		_finderPathCountBygetSezStatusByAppId = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetSezStatusByAppId", new String[] {Long.class.getName()},
			new String[] {"sezStatusApplicationId"}, false);

		SezDevGeneralBusinessIfoUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevGeneralBusinessIfoUtil.setPersistence(null);

		entityCache.removeCache(SezDevGeneralBusinessIfoImpl.class.getName());
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = SEZ_STATUSPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_SEZDEVGENERALBUSINESSIFO =
		"SELECT sezDevGeneralBusinessIfo FROM SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo";

	private static final String _SQL_SELECT_SEZDEVGENERALBUSINESSIFO_WHERE =
		"SELECT sezDevGeneralBusinessIfo FROM SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo WHERE ";

	private static final String _SQL_COUNT_SEZDEVGENERALBUSINESSIFO =
		"SELECT COUNT(sezDevGeneralBusinessIfo) FROM SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo";

	private static final String _SQL_COUNT_SEZDEVGENERALBUSINESSIFO_WHERE =
		"SELECT COUNT(sezDevGeneralBusinessIfo) FROM SezDevGeneralBusinessIfo sezDevGeneralBusinessIfo WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevGeneralBusinessIfo.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevGeneralBusinessIfo exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevGeneralBusinessIfo exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevGeneralBusinessIfoPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
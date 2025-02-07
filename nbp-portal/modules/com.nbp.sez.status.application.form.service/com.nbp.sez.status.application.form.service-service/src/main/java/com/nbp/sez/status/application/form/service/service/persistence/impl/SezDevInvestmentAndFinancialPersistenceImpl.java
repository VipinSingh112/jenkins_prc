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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDevInvestmentAndFinancialException;
import com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancial;
import com.nbp.sez.status.application.form.service.model.SezDevInvestmentAndFinancialTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDevInvestmentAndFinancialImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDevInvestmentAndFinancialModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevInvestmentAndFinancialPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDevInvestmentAndFinancialUtil;
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
 * The persistence implementation for the sez dev investment and financial service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDevInvestmentAndFinancialPersistence.class)
public class SezDevInvestmentAndFinancialPersistenceImpl
	extends BasePersistenceImpl<SezDevInvestmentAndFinancial>
	implements SezDevInvestmentAndFinancialPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDevInvestmentAndFinancialUtil</code> to access the sez dev investment and financial persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDevInvestmentAndFinancialImpl.class.getName();

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
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDevInvestmentAndFinancialException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev investment and financial
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a matching sez dev investment and financial could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevInvestmentAndFinancialException {

		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial =
			fetchBygetSezStatusByAppId(sezStatusApplicationId);

		if (sezDevInvestmentAndFinancial == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDevInvestmentAndFinancialException(
				sb.toString());
		}

		return sezDevInvestmentAndFinancial;
	}

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez dev investment and financial, or <code>null</code> if a matching sez dev investment and financial could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez dev investment and financial where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez dev investment and financial, or <code>null</code> if a matching sez dev investment and financial could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial fetchBygetSezStatusByAppId(
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

		if (result instanceof SezDevInvestmentAndFinancial) {
			SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial =
				(SezDevInvestmentAndFinancial)result;

			if (sezStatusApplicationId !=
					sezDevInvestmentAndFinancial.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVINVESTMENTANDFINANCIAL_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDevInvestmentAndFinancial> list = query.list();

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
								"SezDevInvestmentAndFinancialPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial =
						list.get(0);

					result = sezDevInvestmentAndFinancial;

					cacheResult(sezDevInvestmentAndFinancial);
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
			return (SezDevInvestmentAndFinancial)result;
		}
	}

	/**
	 * Removes the sez dev investment and financial where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez dev investment and financial that was removed
	 */
	@Override
	public SezDevInvestmentAndFinancial removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDevInvestmentAndFinancialException {

		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial =
			findBygetSezStatusByAppId(sezStatusApplicationId);

		return remove(sezDevInvestmentAndFinancial);
	}

	/**
	 * Returns the number of sez dev investment and financials where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez dev investment and financials
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVINVESTMENTANDFINANCIAL_WHERE);

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
			"sezDevInvestmentAndFinancial.sezStatusApplicationId = ?";

	public SezDevInvestmentAndFinancialPersistenceImpl() {
		setModelClass(SezDevInvestmentAndFinancial.class);

		setModelImplClass(SezDevInvestmentAndFinancialImpl.class);
		setModelPKClass(long.class);

		setTable(SezDevInvestmentAndFinancialTable.INSTANCE);
	}

	/**
	 * Caches the sez dev investment and financial in the entity cache if it is enabled.
	 *
	 * @param sezDevInvestmentAndFinancial the sez dev investment and financial
	 */
	@Override
	public void cacheResult(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		entityCache.putResult(
			SezDevInvestmentAndFinancialImpl.class,
			sezDevInvestmentAndFinancial.getPrimaryKey(),
			sezDevInvestmentAndFinancial);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {
				sezDevInvestmentAndFinancial.getSezStatusApplicationId()
			},
			sezDevInvestmentAndFinancial);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez dev investment and financials in the entity cache if it is enabled.
	 *
	 * @param sezDevInvestmentAndFinancials the sez dev investment and financials
	 */
	@Override
	public void cacheResult(
		List<SezDevInvestmentAndFinancial> sezDevInvestmentAndFinancials) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDevInvestmentAndFinancials.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial :
				sezDevInvestmentAndFinancials) {

			if (entityCache.getResult(
					SezDevInvestmentAndFinancialImpl.class,
					sezDevInvestmentAndFinancial.getPrimaryKey()) == null) {

				cacheResult(sezDevInvestmentAndFinancial);
			}
		}
	}

	/**
	 * Clears the cache for all sez dev investment and financials.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDevInvestmentAndFinancialImpl.class);

		finderCache.clearCache(SezDevInvestmentAndFinancialImpl.class);
	}

	/**
	 * Clears the cache for the sez dev investment and financial.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		entityCache.removeResult(
			SezDevInvestmentAndFinancialImpl.class,
			sezDevInvestmentAndFinancial);
	}

	@Override
	public void clearCache(
		List<SezDevInvestmentAndFinancial> sezDevInvestmentAndFinancials) {

		for (SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial :
				sezDevInvestmentAndFinancials) {

			entityCache.removeResult(
				SezDevInvestmentAndFinancialImpl.class,
				sezDevInvestmentAndFinancial);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDevInvestmentAndFinancialImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				SezDevInvestmentAndFinancialImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDevInvestmentAndFinancialModelImpl
			sezDevInvestmentAndFinancialModelImpl) {

		Object[] args = new Object[] {
			sezDevInvestmentAndFinancialModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDevInvestmentAndFinancialModelImpl);
	}

	/**
	 * Creates a new sez dev investment and financial with the primary key. Does not add the sez dev investment and financial to the database.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key for the new sez dev investment and financial
	 * @return the new sez dev investment and financial
	 */
	@Override
	public SezDevInvestmentAndFinancial create(
		long sezDevInvestmentAndFinancialId) {

		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial =
			new SezDevInvestmentAndFinancialImpl();

		sezDevInvestmentAndFinancial.setNew(true);
		sezDevInvestmentAndFinancial.setPrimaryKey(
			sezDevInvestmentAndFinancialId);

		sezDevInvestmentAndFinancial.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return sezDevInvestmentAndFinancial;
	}

	/**
	 * Removes the sez dev investment and financial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial that was removed
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial remove(
			long sezDevInvestmentAndFinancialId)
		throws NoSuchSezDevInvestmentAndFinancialException {

		return remove((Serializable)sezDevInvestmentAndFinancialId);
	}

	/**
	 * Removes the sez dev investment and financial with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial that was removed
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial remove(Serializable primaryKey)
		throws NoSuchSezDevInvestmentAndFinancialException {

		Session session = null;

		try {
			session = openSession();

			SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial =
				(SezDevInvestmentAndFinancial)session.get(
					SezDevInvestmentAndFinancialImpl.class, primaryKey);

			if (sezDevInvestmentAndFinancial == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDevInvestmentAndFinancialException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDevInvestmentAndFinancial);
		}
		catch (NoSuchSezDevInvestmentAndFinancialException
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
	protected SezDevInvestmentAndFinancial removeImpl(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDevInvestmentAndFinancial)) {
				sezDevInvestmentAndFinancial =
					(SezDevInvestmentAndFinancial)session.get(
						SezDevInvestmentAndFinancialImpl.class,
						sezDevInvestmentAndFinancial.getPrimaryKeyObj());
			}

			if (sezDevInvestmentAndFinancial != null) {
				session.delete(sezDevInvestmentAndFinancial);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDevInvestmentAndFinancial != null) {
			clearCache(sezDevInvestmentAndFinancial);
		}

		return sezDevInvestmentAndFinancial;
	}

	@Override
	public SezDevInvestmentAndFinancial updateImpl(
		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial) {

		boolean isNew = sezDevInvestmentAndFinancial.isNew();

		if (!(sezDevInvestmentAndFinancial instanceof
				SezDevInvestmentAndFinancialModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(
					sezDevInvestmentAndFinancial.getClass())) {

				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDevInvestmentAndFinancial);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDevInvestmentAndFinancial proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDevInvestmentAndFinancial implementation " +
					sezDevInvestmentAndFinancial.getClass());
		}

		SezDevInvestmentAndFinancialModelImpl
			sezDevInvestmentAndFinancialModelImpl =
				(SezDevInvestmentAndFinancialModelImpl)
					sezDevInvestmentAndFinancial;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDevInvestmentAndFinancial.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDevInvestmentAndFinancial.setCreateDate(date);
			}
			else {
				sezDevInvestmentAndFinancial.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDevInvestmentAndFinancialModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDevInvestmentAndFinancial.setModifiedDate(date);
			}
			else {
				sezDevInvestmentAndFinancial.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDevInvestmentAndFinancial);
			}
			else {
				sezDevInvestmentAndFinancial =
					(SezDevInvestmentAndFinancial)session.merge(
						sezDevInvestmentAndFinancial);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDevInvestmentAndFinancialImpl.class,
			sezDevInvestmentAndFinancialModelImpl, false, true);

		cacheUniqueFindersCache(sezDevInvestmentAndFinancialModelImpl);

		if (isNew) {
			sezDevInvestmentAndFinancial.setNew(false);
		}

		sezDevInvestmentAndFinancial.resetOriginalValues();

		return sezDevInvestmentAndFinancial;
	}

	/**
	 * Returns the sez dev investment and financial with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial findByPrimaryKey(
			Serializable primaryKey)
		throws NoSuchSezDevInvestmentAndFinancialException {

		SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial =
			fetchByPrimaryKey(primaryKey);

		if (sezDevInvestmentAndFinancial == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDevInvestmentAndFinancialException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDevInvestmentAndFinancial;
	}

	/**
	 * Returns the sez dev investment and financial with the primary key or throws a <code>NoSuchSezDevInvestmentAndFinancialException</code> if it could not be found.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial
	 * @throws NoSuchSezDevInvestmentAndFinancialException if a sez dev investment and financial with the primary key could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial findByPrimaryKey(
			long sezDevInvestmentAndFinancialId)
		throws NoSuchSezDevInvestmentAndFinancialException {

		return findByPrimaryKey((Serializable)sezDevInvestmentAndFinancialId);
	}

	/**
	 * Returns the sez dev investment and financial with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDevInvestmentAndFinancialId the primary key of the sez dev investment and financial
	 * @return the sez dev investment and financial, or <code>null</code> if a sez dev investment and financial with the primary key could not be found
	 */
	@Override
	public SezDevInvestmentAndFinancial fetchByPrimaryKey(
		long sezDevInvestmentAndFinancialId) {

		return fetchByPrimaryKey((Serializable)sezDevInvestmentAndFinancialId);
	}

	/**
	 * Returns all the sez dev investment and financials.
	 *
	 * @return the sez dev investment and financials
	 */
	@Override
	public List<SezDevInvestmentAndFinancial> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @return the range of sez dev investment and financials
	 */
	@Override
	public List<SezDevInvestmentAndFinancial> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez dev investment and financials
	 */
	@Override
	public List<SezDevInvestmentAndFinancial> findAll(
		int start, int end,
		OrderByComparator<SezDevInvestmentAndFinancial> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez dev investment and financials.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDevInvestmentAndFinancialModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez dev investment and financials
	 * @param end the upper bound of the range of sez dev investment and financials (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez dev investment and financials
	 */
	@Override
	public List<SezDevInvestmentAndFinancial> findAll(
		int start, int end,
		OrderByComparator<SezDevInvestmentAndFinancial> orderByComparator,
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

		List<SezDevInvestmentAndFinancial> list = null;

		if (useFinderCache) {
			list = (List<SezDevInvestmentAndFinancial>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVINVESTMENTANDFINANCIAL);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVINVESTMENTANDFINANCIAL;

				sql = sql.concat(
					SezDevInvestmentAndFinancialModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDevInvestmentAndFinancial>)QueryUtil.list(
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
	 * Removes all the sez dev investment and financials from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial :
				findAll()) {

			remove(sezDevInvestmentAndFinancial);
		}
	}

	/**
	 * Returns the number of sez dev investment and financials.
	 *
	 * @return the number of sez dev investment and financials
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
					_SQL_COUNT_SEZDEVINVESTMENTANDFINANCIAL);

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
		return "sezDevInvestmentAndFinancialId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVINVESTMENTANDFINANCIAL;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDevInvestmentAndFinancialModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez dev investment and financial persistence.
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

		SezDevInvestmentAndFinancialUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDevInvestmentAndFinancialUtil.setPersistence(null);

		entityCache.removeCache(
			SezDevInvestmentAndFinancialImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVINVESTMENTANDFINANCIAL =
		"SELECT sezDevInvestmentAndFinancial FROM SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial";

	private static final String _SQL_SELECT_SEZDEVINVESTMENTANDFINANCIAL_WHERE =
		"SELECT sezDevInvestmentAndFinancial FROM SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial WHERE ";

	private static final String _SQL_COUNT_SEZDEVINVESTMENTANDFINANCIAL =
		"SELECT COUNT(sezDevInvestmentAndFinancial) FROM SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial";

	private static final String _SQL_COUNT_SEZDEVINVESTMENTANDFINANCIAL_WHERE =
		"SELECT COUNT(sezDevInvestmentAndFinancial) FROM SezDevInvestmentAndFinancial sezDevInvestmentAndFinancial WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"sezDevInvestmentAndFinancial.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDevInvestmentAndFinancial exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDevInvestmentAndFinancial exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDevInvestmentAndFinancialPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
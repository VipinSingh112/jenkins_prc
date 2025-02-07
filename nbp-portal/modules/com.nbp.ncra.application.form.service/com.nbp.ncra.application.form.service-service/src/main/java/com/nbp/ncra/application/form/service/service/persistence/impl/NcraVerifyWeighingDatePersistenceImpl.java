/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.ncra.application.form.service.service.persistence.impl;

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

import com.nbp.ncra.application.form.service.exception.NoSuchNcraVerifyWeighingDateException;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDate;
import com.nbp.ncra.application.form.service.model.NcraVerifyWeighingDateTable;
import com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateImpl;
import com.nbp.ncra.application.form.service.model.impl.NcraVerifyWeighingDateModelImpl;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDatePersistence;
import com.nbp.ncra.application.form.service.service.persistence.NcraVerifyWeighingDateUtil;
import com.nbp.ncra.application.form.service.service.persistence.impl.constants.NCRA_APPLICATION_FORMPersistenceConstants;

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
 * The persistence implementation for the ncra verify weighing date service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = NcraVerifyWeighingDatePersistence.class)
public class NcraVerifyWeighingDatePersistenceImpl
	extends BasePersistenceImpl<NcraVerifyWeighingDate>
	implements NcraVerifyWeighingDatePersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>NcraVerifyWeighingDateUtil</code> to access the ncra verify weighing date persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		NcraVerifyWeighingDateImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetNcraVerify_By_Date;
	private FinderPath _finderPathCountBygetNcraVerify_By_Date;

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or throws a <code>NoSuchNcraVerifyWeighingDateException</code> if it could not be found.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing date
	 * @throws NoSuchNcraVerifyWeighingDateException if a matching ncra verify weighing date could not be found
	 */
	@Override
	public NcraVerifyWeighingDate findBygetNcraVerify_By_Date(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDateException {

		NcraVerifyWeighingDate ncraVerifyWeighingDate =
			fetchBygetNcraVerify_By_Date(ncraApplicationId);

		if (ncraVerifyWeighingDate == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("ncraApplicationId=");
			sb.append(ncraApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchNcraVerifyWeighingDateException(sb.toString());
		}

		return ncraVerifyWeighingDate;
	}

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the matching ncra verify weighing date, or <code>null</code> if a matching ncra verify weighing date could not be found
	 */
	@Override
	public NcraVerifyWeighingDate fetchBygetNcraVerify_By_Date(
		long ncraApplicationId) {

		return fetchBygetNcraVerify_By_Date(ncraApplicationId, true);
	}

	/**
	 * Returns the ncra verify weighing date where ncraApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching ncra verify weighing date, or <code>null</code> if a matching ncra verify weighing date could not be found
	 */
	@Override
	public NcraVerifyWeighingDate fetchBygetNcraVerify_By_Date(
		long ncraApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {ncraApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetNcraVerify_By_Date, finderArgs, this);
		}

		if (result instanceof NcraVerifyWeighingDate) {
			NcraVerifyWeighingDate ncraVerifyWeighingDate =
				(NcraVerifyWeighingDate)result;

			if (ncraApplicationId !=
					ncraVerifyWeighingDate.getNcraApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_NCRAVERIFYWEIGHINGDATE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRAVERIFY_BY_DATE_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

				List<NcraVerifyWeighingDate> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetNcraVerify_By_Date, finderArgs,
							list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {ncraApplicationId};
							}

							_log.warn(
								"NcraVerifyWeighingDatePersistenceImpl.fetchBygetNcraVerify_By_Date(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					NcraVerifyWeighingDate ncraVerifyWeighingDate = list.get(0);

					result = ncraVerifyWeighingDate;

					cacheResult(ncraVerifyWeighingDate);
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
			return (NcraVerifyWeighingDate)result;
		}
	}

	/**
	 * Removes the ncra verify weighing date where ncraApplicationId = &#63; from the database.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the ncra verify weighing date that was removed
	 */
	@Override
	public NcraVerifyWeighingDate removeBygetNcraVerify_By_Date(
			long ncraApplicationId)
		throws NoSuchNcraVerifyWeighingDateException {

		NcraVerifyWeighingDate ncraVerifyWeighingDate =
			findBygetNcraVerify_By_Date(ncraApplicationId);

		return remove(ncraVerifyWeighingDate);
	}

	/**
	 * Returns the number of ncra verify weighing dates where ncraApplicationId = &#63;.
	 *
	 * @param ncraApplicationId the ncra application ID
	 * @return the number of matching ncra verify weighing dates
	 */
	@Override
	public int countBygetNcraVerify_By_Date(long ncraApplicationId) {
		FinderPath finderPath = _finderPathCountBygetNcraVerify_By_Date;

		Object[] finderArgs = new Object[] {ncraApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_NCRAVERIFYWEIGHINGDATE_WHERE);

			sb.append(_FINDER_COLUMN_GETNCRAVERIFY_BY_DATE_NCRAAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(ncraApplicationId);

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
		_FINDER_COLUMN_GETNCRAVERIFY_BY_DATE_NCRAAPPLICATIONID_2 =
			"ncraVerifyWeighingDate.ncraApplicationId = ?";

	public NcraVerifyWeighingDatePersistenceImpl() {
		setModelClass(NcraVerifyWeighingDate.class);

		setModelImplClass(NcraVerifyWeighingDateImpl.class);
		setModelPKClass(long.class);

		setTable(NcraVerifyWeighingDateTable.INSTANCE);
	}

	/**
	 * Caches the ncra verify weighing date in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDate the ncra verify weighing date
	 */
	@Override
	public void cacheResult(NcraVerifyWeighingDate ncraVerifyWeighingDate) {
		entityCache.putResult(
			NcraVerifyWeighingDateImpl.class,
			ncraVerifyWeighingDate.getPrimaryKey(), ncraVerifyWeighingDate);

		finderCache.putResult(
			_finderPathFetchBygetNcraVerify_By_Date,
			new Object[] {ncraVerifyWeighingDate.getNcraApplicationId()},
			ncraVerifyWeighingDate);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the ncra verify weighing dates in the entity cache if it is enabled.
	 *
	 * @param ncraVerifyWeighingDates the ncra verify weighing dates
	 */
	@Override
	public void cacheResult(
		List<NcraVerifyWeighingDate> ncraVerifyWeighingDates) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (ncraVerifyWeighingDates.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (NcraVerifyWeighingDate ncraVerifyWeighingDate :
				ncraVerifyWeighingDates) {

			if (entityCache.getResult(
					NcraVerifyWeighingDateImpl.class,
					ncraVerifyWeighingDate.getPrimaryKey()) == null) {

				cacheResult(ncraVerifyWeighingDate);
			}
		}
	}

	/**
	 * Clears the cache for all ncra verify weighing dates.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(NcraVerifyWeighingDateImpl.class);

		finderCache.clearCache(NcraVerifyWeighingDateImpl.class);
	}

	/**
	 * Clears the cache for the ncra verify weighing date.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(NcraVerifyWeighingDate ncraVerifyWeighingDate) {
		entityCache.removeResult(
			NcraVerifyWeighingDateImpl.class, ncraVerifyWeighingDate);
	}

	@Override
	public void clearCache(
		List<NcraVerifyWeighingDate> ncraVerifyWeighingDates) {

		for (NcraVerifyWeighingDate ncraVerifyWeighingDate :
				ncraVerifyWeighingDates) {

			entityCache.removeResult(
				NcraVerifyWeighingDateImpl.class, ncraVerifyWeighingDate);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(NcraVerifyWeighingDateImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				NcraVerifyWeighingDateImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		NcraVerifyWeighingDateModelImpl ncraVerifyWeighingDateModelImpl) {

		Object[] args = new Object[] {
			ncraVerifyWeighingDateModelImpl.getNcraApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetNcraVerify_By_Date, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetNcraVerify_By_Date, args,
			ncraVerifyWeighingDateModelImpl);
	}

	/**
	 * Creates a new ncra verify weighing date with the primary key. Does not add the ncra verify weighing date to the database.
	 *
	 * @param ncraVerifyWeighingDateId the primary key for the new ncra verify weighing date
	 * @return the new ncra verify weighing date
	 */
	@Override
	public NcraVerifyWeighingDate create(long ncraVerifyWeighingDateId) {
		NcraVerifyWeighingDate ncraVerifyWeighingDate =
			new NcraVerifyWeighingDateImpl();

		ncraVerifyWeighingDate.setNew(true);
		ncraVerifyWeighingDate.setPrimaryKey(ncraVerifyWeighingDateId);

		ncraVerifyWeighingDate.setCompanyId(CompanyThreadLocal.getCompanyId());

		return ncraVerifyWeighingDate;
	}

	/**
	 * Removes the ncra verify weighing date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDate remove(long ncraVerifyWeighingDateId)
		throws NoSuchNcraVerifyWeighingDateException {

		return remove((Serializable)ncraVerifyWeighingDateId);
	}

	/**
	 * Removes the ncra verify weighing date with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date that was removed
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDate remove(Serializable primaryKey)
		throws NoSuchNcraVerifyWeighingDateException {

		Session session = null;

		try {
			session = openSession();

			NcraVerifyWeighingDate ncraVerifyWeighingDate =
				(NcraVerifyWeighingDate)session.get(
					NcraVerifyWeighingDateImpl.class, primaryKey);

			if (ncraVerifyWeighingDate == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchNcraVerifyWeighingDateException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(ncraVerifyWeighingDate);
		}
		catch (NoSuchNcraVerifyWeighingDateException noSuchEntityException) {
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
	protected NcraVerifyWeighingDate removeImpl(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(ncraVerifyWeighingDate)) {
				ncraVerifyWeighingDate = (NcraVerifyWeighingDate)session.get(
					NcraVerifyWeighingDateImpl.class,
					ncraVerifyWeighingDate.getPrimaryKeyObj());
			}

			if (ncraVerifyWeighingDate != null) {
				session.delete(ncraVerifyWeighingDate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (ncraVerifyWeighingDate != null) {
			clearCache(ncraVerifyWeighingDate);
		}

		return ncraVerifyWeighingDate;
	}

	@Override
	public NcraVerifyWeighingDate updateImpl(
		NcraVerifyWeighingDate ncraVerifyWeighingDate) {

		boolean isNew = ncraVerifyWeighingDate.isNew();

		if (!(ncraVerifyWeighingDate instanceof
				NcraVerifyWeighingDateModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(ncraVerifyWeighingDate.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					ncraVerifyWeighingDate);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in ncraVerifyWeighingDate proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom NcraVerifyWeighingDate implementation " +
					ncraVerifyWeighingDate.getClass());
		}

		NcraVerifyWeighingDateModelImpl ncraVerifyWeighingDateModelImpl =
			(NcraVerifyWeighingDateModelImpl)ncraVerifyWeighingDate;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (ncraVerifyWeighingDate.getCreateDate() == null)) {
			if (serviceContext == null) {
				ncraVerifyWeighingDate.setCreateDate(date);
			}
			else {
				ncraVerifyWeighingDate.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!ncraVerifyWeighingDateModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				ncraVerifyWeighingDate.setModifiedDate(date);
			}
			else {
				ncraVerifyWeighingDate.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(ncraVerifyWeighingDate);
			}
			else {
				ncraVerifyWeighingDate = (NcraVerifyWeighingDate)session.merge(
					ncraVerifyWeighingDate);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			NcraVerifyWeighingDateImpl.class, ncraVerifyWeighingDateModelImpl,
			false, true);

		cacheUniqueFindersCache(ncraVerifyWeighingDateModelImpl);

		if (isNew) {
			ncraVerifyWeighingDate.setNew(false);
		}

		ncraVerifyWeighingDate.resetOriginalValues();

		return ncraVerifyWeighingDate;
	}

	/**
	 * Returns the ncra verify weighing date with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDate findByPrimaryKey(Serializable primaryKey)
		throws NoSuchNcraVerifyWeighingDateException {

		NcraVerifyWeighingDate ncraVerifyWeighingDate = fetchByPrimaryKey(
			primaryKey);

		if (ncraVerifyWeighingDate == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchNcraVerifyWeighingDateException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return ncraVerifyWeighingDate;
	}

	/**
	 * Returns the ncra verify weighing date with the primary key or throws a <code>NoSuchNcraVerifyWeighingDateException</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date
	 * @throws NoSuchNcraVerifyWeighingDateException if a ncra verify weighing date with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDate findByPrimaryKey(
			long ncraVerifyWeighingDateId)
		throws NoSuchNcraVerifyWeighingDateException {

		return findByPrimaryKey((Serializable)ncraVerifyWeighingDateId);
	}

	/**
	 * Returns the ncra verify weighing date with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param ncraVerifyWeighingDateId the primary key of the ncra verify weighing date
	 * @return the ncra verify weighing date, or <code>null</code> if a ncra verify weighing date with the primary key could not be found
	 */
	@Override
	public NcraVerifyWeighingDate fetchByPrimaryKey(
		long ncraVerifyWeighingDateId) {

		return fetchByPrimaryKey((Serializable)ncraVerifyWeighingDateId);
	}

	/**
	 * Returns all the ncra verify weighing dates.
	 *
	 * @return the ncra verify weighing dates
	 */
	@Override
	public List<NcraVerifyWeighingDate> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @return the range of ncra verify weighing dates
	 */
	@Override
	public List<NcraVerifyWeighingDate> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of ncra verify weighing dates
	 */
	@Override
	public List<NcraVerifyWeighingDate> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDate> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the ncra verify weighing dates.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>NcraVerifyWeighingDateModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of ncra verify weighing dates
	 * @param end the upper bound of the range of ncra verify weighing dates (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of ncra verify weighing dates
	 */
	@Override
	public List<NcraVerifyWeighingDate> findAll(
		int start, int end,
		OrderByComparator<NcraVerifyWeighingDate> orderByComparator,
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

		List<NcraVerifyWeighingDate> list = null;

		if (useFinderCache) {
			list = (List<NcraVerifyWeighingDate>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_NCRAVERIFYWEIGHINGDATE);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_NCRAVERIFYWEIGHINGDATE;

				sql = sql.concat(NcraVerifyWeighingDateModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<NcraVerifyWeighingDate>)QueryUtil.list(
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
	 * Removes all the ncra verify weighing dates from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (NcraVerifyWeighingDate ncraVerifyWeighingDate : findAll()) {
			remove(ncraVerifyWeighingDate);
		}
	}

	/**
	 * Returns the number of ncra verify weighing dates.
	 *
	 * @return the number of ncra verify weighing dates
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
					_SQL_COUNT_NCRAVERIFYWEIGHINGDATE);

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
		return "ncraVerifyWeighingDateId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_NCRAVERIFYWEIGHINGDATE;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return NcraVerifyWeighingDateModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the ncra verify weighing date persistence.
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

		_finderPathFetchBygetNcraVerify_By_Date = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetNcraVerify_By_Date",
			new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, true);

		_finderPathCountBygetNcraVerify_By_Date = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countBygetNcraVerify_By_Date", new String[] {Long.class.getName()},
			new String[] {"ncraApplicationId"}, false);

		NcraVerifyWeighingDateUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		NcraVerifyWeighingDateUtil.setPersistence(null);

		entityCache.removeCache(NcraVerifyWeighingDateImpl.class.getName());
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = NCRA_APPLICATION_FORMPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_NCRAVERIFYWEIGHINGDATE =
		"SELECT ncraVerifyWeighingDate FROM NcraVerifyWeighingDate ncraVerifyWeighingDate";

	private static final String _SQL_SELECT_NCRAVERIFYWEIGHINGDATE_WHERE =
		"SELECT ncraVerifyWeighingDate FROM NcraVerifyWeighingDate ncraVerifyWeighingDate WHERE ";

	private static final String _SQL_COUNT_NCRAVERIFYWEIGHINGDATE =
		"SELECT COUNT(ncraVerifyWeighingDate) FROM NcraVerifyWeighingDate ncraVerifyWeighingDate";

	private static final String _SQL_COUNT_NCRAVERIFYWEIGHINGDATE_WHERE =
		"SELECT COUNT(ncraVerifyWeighingDate) FROM NcraVerifyWeighingDate ncraVerifyWeighingDate WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"ncraVerifyWeighingDate.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No NcraVerifyWeighingDate exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No NcraVerifyWeighingDate exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		NcraVerifyWeighingDatePersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
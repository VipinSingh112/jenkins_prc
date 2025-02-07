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

import com.nbp.sez.status.application.form.service.exception.NoSuchSezDeveloperDetailsException;
import com.nbp.sez.status.application.form.service.model.SezDeveloperDetails;
import com.nbp.sez.status.application.form.service.model.SezDeveloperDetailsTable;
import com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsImpl;
import com.nbp.sez.status.application.form.service.model.impl.SezDeveloperDetailsModelImpl;
import com.nbp.sez.status.application.form.service.service.persistence.SezDeveloperDetailsPersistence;
import com.nbp.sez.status.application.form.service.service.persistence.SezDeveloperDetailsUtil;
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
 * The persistence implementation for the sez developer details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = SezDeveloperDetailsPersistence.class)
public class SezDeveloperDetailsPersistenceImpl
	extends BasePersistenceImpl<SezDeveloperDetails>
	implements SezDeveloperDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>SezDeveloperDetailsUtil</code> to access the sez developer details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		SezDeveloperDetailsImpl.class.getName();

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
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or throws a <code>NoSuchSezDeveloperDetailsException</code> if it could not be found.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer details
	 * @throws NoSuchSezDeveloperDetailsException if a matching sez developer details could not be found
	 */
	@Override
	public SezDeveloperDetails findBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDeveloperDetailsException {

		SezDeveloperDetails sezDeveloperDetails = fetchBygetSezStatusByAppId(
			sezStatusApplicationId);

		if (sezDeveloperDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("sezStatusApplicationId=");
			sb.append(sezStatusApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchSezDeveloperDetailsException(sb.toString());
		}

		return sezDeveloperDetails;
	}

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the matching sez developer details, or <code>null</code> if a matching sez developer details could not be found
	 */
	@Override
	public SezDeveloperDetails fetchBygetSezStatusByAppId(
		long sezStatusApplicationId) {

		return fetchBygetSezStatusByAppId(sezStatusApplicationId, true);
	}

	/**
	 * Returns the sez developer details where sezStatusApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching sez developer details, or <code>null</code> if a matching sez developer details could not be found
	 */
	@Override
	public SezDeveloperDetails fetchBygetSezStatusByAppId(
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

		if (result instanceof SezDeveloperDetails) {
			SezDeveloperDetails sezDeveloperDetails =
				(SezDeveloperDetails)result;

			if (sezStatusApplicationId !=
					sezDeveloperDetails.getSezStatusApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_SEZDEVELOPERDETAILS_WHERE);

			sb.append(
				_FINDER_COLUMN_GETSEZSTATUSBYAPPID_SEZSTATUSAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(sezStatusApplicationId);

				List<SezDeveloperDetails> list = query.list();

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
								"SezDeveloperDetailsPersistenceImpl.fetchBygetSezStatusByAppId(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					SezDeveloperDetails sezDeveloperDetails = list.get(0);

					result = sezDeveloperDetails;

					cacheResult(sezDeveloperDetails);
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
			return (SezDeveloperDetails)result;
		}
	}

	/**
	 * Removes the sez developer details where sezStatusApplicationId = &#63; from the database.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the sez developer details that was removed
	 */
	@Override
	public SezDeveloperDetails removeBygetSezStatusByAppId(
			long sezStatusApplicationId)
		throws NoSuchSezDeveloperDetailsException {

		SezDeveloperDetails sezDeveloperDetails = findBygetSezStatusByAppId(
			sezStatusApplicationId);

		return remove(sezDeveloperDetails);
	}

	/**
	 * Returns the number of sez developer detailses where sezStatusApplicationId = &#63;.
	 *
	 * @param sezStatusApplicationId the sez status application ID
	 * @return the number of matching sez developer detailses
	 */
	@Override
	public int countBygetSezStatusByAppId(long sezStatusApplicationId) {
		FinderPath finderPath = _finderPathCountBygetSezStatusByAppId;

		Object[] finderArgs = new Object[] {sezStatusApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_SEZDEVELOPERDETAILS_WHERE);

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
			"sezDeveloperDetails.sezStatusApplicationId = ?";

	public SezDeveloperDetailsPersistenceImpl() {
		setModelClass(SezDeveloperDetails.class);

		setModelImplClass(SezDeveloperDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(SezDeveloperDetailsTable.INSTANCE);
	}

	/**
	 * Caches the sez developer details in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperDetails the sez developer details
	 */
	@Override
	public void cacheResult(SezDeveloperDetails sezDeveloperDetails) {
		entityCache.putResult(
			SezDeveloperDetailsImpl.class, sezDeveloperDetails.getPrimaryKey(),
			sezDeveloperDetails);

		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId,
			new Object[] {sezDeveloperDetails.getSezStatusApplicationId()},
			sezDeveloperDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the sez developer detailses in the entity cache if it is enabled.
	 *
	 * @param sezDeveloperDetailses the sez developer detailses
	 */
	@Override
	public void cacheResult(List<SezDeveloperDetails> sezDeveloperDetailses) {
		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (sezDeveloperDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (SezDeveloperDetails sezDeveloperDetails : sezDeveloperDetailses) {
			if (entityCache.getResult(
					SezDeveloperDetailsImpl.class,
					sezDeveloperDetails.getPrimaryKey()) == null) {

				cacheResult(sezDeveloperDetails);
			}
		}
	}

	/**
	 * Clears the cache for all sez developer detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(SezDeveloperDetailsImpl.class);

		finderCache.clearCache(SezDeveloperDetailsImpl.class);
	}

	/**
	 * Clears the cache for the sez developer details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(SezDeveloperDetails sezDeveloperDetails) {
		entityCache.removeResult(
			SezDeveloperDetailsImpl.class, sezDeveloperDetails);
	}

	@Override
	public void clearCache(List<SezDeveloperDetails> sezDeveloperDetailses) {
		for (SezDeveloperDetails sezDeveloperDetails : sezDeveloperDetailses) {
			entityCache.removeResult(
				SezDeveloperDetailsImpl.class, sezDeveloperDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(SezDeveloperDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(SezDeveloperDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		SezDeveloperDetailsModelImpl sezDeveloperDetailsModelImpl) {

		Object[] args = new Object[] {
			sezDeveloperDetailsModelImpl.getSezStatusApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetSezStatusByAppId, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetSezStatusByAppId, args,
			sezDeveloperDetailsModelImpl);
	}

	/**
	 * Creates a new sez developer details with the primary key. Does not add the sez developer details to the database.
	 *
	 * @param sezDeveloperDetailsId the primary key for the new sez developer details
	 * @return the new sez developer details
	 */
	@Override
	public SezDeveloperDetails create(long sezDeveloperDetailsId) {
		SezDeveloperDetails sezDeveloperDetails = new SezDeveloperDetailsImpl();

		sezDeveloperDetails.setNew(true);
		sezDeveloperDetails.setPrimaryKey(sezDeveloperDetailsId);

		sezDeveloperDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return sezDeveloperDetails;
	}

	/**
	 * Removes the sez developer details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details that was removed
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	@Override
	public SezDeveloperDetails remove(long sezDeveloperDetailsId)
		throws NoSuchSezDeveloperDetailsException {

		return remove((Serializable)sezDeveloperDetailsId);
	}

	/**
	 * Removes the sez developer details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the sez developer details
	 * @return the sez developer details that was removed
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	@Override
	public SezDeveloperDetails remove(Serializable primaryKey)
		throws NoSuchSezDeveloperDetailsException {

		Session session = null;

		try {
			session = openSession();

			SezDeveloperDetails sezDeveloperDetails =
				(SezDeveloperDetails)session.get(
					SezDeveloperDetailsImpl.class, primaryKey);

			if (sezDeveloperDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchSezDeveloperDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(sezDeveloperDetails);
		}
		catch (NoSuchSezDeveloperDetailsException noSuchEntityException) {
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
	protected SezDeveloperDetails removeImpl(
		SezDeveloperDetails sezDeveloperDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(sezDeveloperDetails)) {
				sezDeveloperDetails = (SezDeveloperDetails)session.get(
					SezDeveloperDetailsImpl.class,
					sezDeveloperDetails.getPrimaryKeyObj());
			}

			if (sezDeveloperDetails != null) {
				session.delete(sezDeveloperDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (sezDeveloperDetails != null) {
			clearCache(sezDeveloperDetails);
		}

		return sezDeveloperDetails;
	}

	@Override
	public SezDeveloperDetails updateImpl(
		SezDeveloperDetails sezDeveloperDetails) {

		boolean isNew = sezDeveloperDetails.isNew();

		if (!(sezDeveloperDetails instanceof SezDeveloperDetailsModelImpl)) {
			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(sezDeveloperDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					sezDeveloperDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in sezDeveloperDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom SezDeveloperDetails implementation " +
					sezDeveloperDetails.getClass());
		}

		SezDeveloperDetailsModelImpl sezDeveloperDetailsModelImpl =
			(SezDeveloperDetailsModelImpl)sezDeveloperDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (sezDeveloperDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				sezDeveloperDetails.setCreateDate(date);
			}
			else {
				sezDeveloperDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!sezDeveloperDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				sezDeveloperDetails.setModifiedDate(date);
			}
			else {
				sezDeveloperDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(sezDeveloperDetails);
			}
			else {
				sezDeveloperDetails = (SezDeveloperDetails)session.merge(
					sezDeveloperDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			SezDeveloperDetailsImpl.class, sezDeveloperDetailsModelImpl, false,
			true);

		cacheUniqueFindersCache(sezDeveloperDetailsModelImpl);

		if (isNew) {
			sezDeveloperDetails.setNew(false);
		}

		sezDeveloperDetails.resetOriginalValues();

		return sezDeveloperDetails;
	}

	/**
	 * Returns the sez developer details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the sez developer details
	 * @return the sez developer details
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	@Override
	public SezDeveloperDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchSezDeveloperDetailsException {

		SezDeveloperDetails sezDeveloperDetails = fetchByPrimaryKey(primaryKey);

		if (sezDeveloperDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchSezDeveloperDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return sezDeveloperDetails;
	}

	/**
	 * Returns the sez developer details with the primary key or throws a <code>NoSuchSezDeveloperDetailsException</code> if it could not be found.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details
	 * @throws NoSuchSezDeveloperDetailsException if a sez developer details with the primary key could not be found
	 */
	@Override
	public SezDeveloperDetails findByPrimaryKey(long sezDeveloperDetailsId)
		throws NoSuchSezDeveloperDetailsException {

		return findByPrimaryKey((Serializable)sezDeveloperDetailsId);
	}

	/**
	 * Returns the sez developer details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param sezDeveloperDetailsId the primary key of the sez developer details
	 * @return the sez developer details, or <code>null</code> if a sez developer details with the primary key could not be found
	 */
	@Override
	public SezDeveloperDetails fetchByPrimaryKey(long sezDeveloperDetailsId) {
		return fetchByPrimaryKey((Serializable)sezDeveloperDetailsId);
	}

	/**
	 * Returns all the sez developer detailses.
	 *
	 * @return the sez developer detailses
	 */
	@Override
	public List<SezDeveloperDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @return the range of sez developer detailses
	 */
	@Override
	public List<SezDeveloperDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of sez developer detailses
	 */
	@Override
	public List<SezDeveloperDetails> findAll(
		int start, int end,
		OrderByComparator<SezDeveloperDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the sez developer detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>SezDeveloperDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of sez developer detailses
	 * @param end the upper bound of the range of sez developer detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of sez developer detailses
	 */
	@Override
	public List<SezDeveloperDetails> findAll(
		int start, int end,
		OrderByComparator<SezDeveloperDetails> orderByComparator,
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

		List<SezDeveloperDetails> list = null;

		if (useFinderCache) {
			list = (List<SezDeveloperDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_SEZDEVELOPERDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_SEZDEVELOPERDETAILS;

				sql = sql.concat(SezDeveloperDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<SezDeveloperDetails>)QueryUtil.list(
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
	 * Removes all the sez developer detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (SezDeveloperDetails sezDeveloperDetails : findAll()) {
			remove(sezDeveloperDetails);
		}
	}

	/**
	 * Returns the number of sez developer detailses.
	 *
	 * @return the number of sez developer detailses
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
					_SQL_COUNT_SEZDEVELOPERDETAILS);

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
		return "sezDeveloperDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_SEZDEVELOPERDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return SezDeveloperDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the sez developer details persistence.
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

		SezDeveloperDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		SezDeveloperDetailsUtil.setPersistence(null);

		entityCache.removeCache(SezDeveloperDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_SEZDEVELOPERDETAILS =
		"SELECT sezDeveloperDetails FROM SezDeveloperDetails sezDeveloperDetails";

	private static final String _SQL_SELECT_SEZDEVELOPERDETAILS_WHERE =
		"SELECT sezDeveloperDetails FROM SezDeveloperDetails sezDeveloperDetails WHERE ";

	private static final String _SQL_COUNT_SEZDEVELOPERDETAILS =
		"SELECT COUNT(sezDeveloperDetails) FROM SezDeveloperDetails sezDeveloperDetails";

	private static final String _SQL_COUNT_SEZDEVELOPERDETAILS_WHERE =
		"SELECT COUNT(sezDeveloperDetails) FROM SezDeveloperDetails sezDeveloperDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS = "sezDeveloperDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No SezDeveloperDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No SezDeveloperDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		SezDeveloperDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
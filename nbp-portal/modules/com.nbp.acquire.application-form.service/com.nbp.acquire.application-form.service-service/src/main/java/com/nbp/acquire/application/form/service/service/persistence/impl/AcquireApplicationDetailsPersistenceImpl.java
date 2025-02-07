/**
 * SPDX-FileCopyrightText: (c) 2025 Liferay, Inc. https://liferay.com
 * SPDX-License-Identifier: LGPL-2.1-or-later OR LicenseRef-Liferay-DXP-EULA-2.0.0-2023-06
 */

package com.nbp.acquire.application.form.service.service.persistence.impl;

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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireApplicationDetailsException;
import com.nbp.acquire.application.form.service.model.AcquireApplicationDetails;
import com.nbp.acquire.application.form.service.model.AcquireApplicationDetailsTable;
import com.nbp.acquire.application.form.service.model.impl.AcquireApplicationDetailsImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquireApplicationDetailsModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquireApplicationDetailsPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireApplicationDetailsUtil;
import com.nbp.acquire.application.form.service.service.persistence.impl.constants.ACQUIREPersistenceConstants;

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
 * The persistence implementation for the acquire application details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireApplicationDetailsPersistence.class)
public class AcquireApplicationDetailsPersistenceImpl
	extends BasePersistenceImpl<AcquireApplicationDetails>
	implements AcquireApplicationDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireApplicationDetailsUtil</code> to access the acquire application details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireApplicationDetailsImpl.class.getName();

	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List1";

	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION =
		FINDER_CLASS_NAME_ENTITY + ".List2";

	private FinderPath _finderPathWithPaginationFindAll;
	private FinderPath _finderPathWithoutPaginationFindAll;
	private FinderPath _finderPathCountAll;
	private FinderPath _finderPathFetchBygetAcquireById;
	private FinderPath _finderPathCountBygetAcquireById;

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireApplicationDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application details
	 * @throws NoSuchAcquireApplicationDetailsException if a matching acquire application details could not be found
	 */
	@Override
	public AcquireApplicationDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationDetailsException {

		AcquireApplicationDetails acquireApplicationDetails =
			fetchBygetAcquireById(acquireApplicationId);

		if (acquireApplicationDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireApplicationDetailsException(sb.toString());
		}

		return acquireApplicationDetails;
	}

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire application details, or <code>null</code> if a matching acquire application details could not be found
	 */
	@Override
	public AcquireApplicationDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire application details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire application details, or <code>null</code> if a matching acquire application details could not be found
	 */
	@Override
	public AcquireApplicationDetails fetchBygetAcquireById(
		long acquireApplicationId, boolean useFinderCache) {

		Object[] finderArgs = null;

		if (useFinderCache) {
			finderArgs = new Object[] {acquireApplicationId};
		}

		Object result = null;

		if (useFinderCache) {
			result = finderCache.getResult(
				_finderPathFetchBygetAcquireById, finderArgs, this);
		}

		if (result instanceof AcquireApplicationDetails) {
			AcquireApplicationDetails acquireApplicationDetails =
				(AcquireApplicationDetails)result;

			if (acquireApplicationId !=
					acquireApplicationDetails.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREAPPLICATIONDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireApplicationDetails> list = query.list();

				if (list.isEmpty()) {
					if (useFinderCache) {
						finderCache.putResult(
							_finderPathFetchBygetAcquireById, finderArgs, list);
					}
				}
				else {
					if (list.size() > 1) {
						Collections.sort(list, Collections.reverseOrder());

						if (_log.isWarnEnabled()) {
							if (!useFinderCache) {
								finderArgs = new Object[] {
									acquireApplicationId
								};
							}

							_log.warn(
								"AcquireApplicationDetailsPersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireApplicationDetails acquireApplicationDetails =
						list.get(0);

					result = acquireApplicationDetails;

					cacheResult(acquireApplicationDetails);
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
			return (AcquireApplicationDetails)result;
		}
	}

	/**
	 * Removes the acquire application details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire application details that was removed
	 */
	@Override
	public AcquireApplicationDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireApplicationDetailsException {

		AcquireApplicationDetails acquireApplicationDetails =
			findBygetAcquireById(acquireApplicationId);

		return remove(acquireApplicationDetails);
	}

	/**
	 * Returns the number of acquire application detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire application detailses
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREAPPLICATIONDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

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
		_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2 =
			"acquireApplicationDetails.acquireApplicationId = ?";

	public AcquireApplicationDetailsPersistenceImpl() {
		setModelClass(AcquireApplicationDetails.class);

		setModelImplClass(AcquireApplicationDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireApplicationDetailsTable.INSTANCE);
	}

	/**
	 * Caches the acquire application details in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationDetails the acquire application details
	 */
	@Override
	public void cacheResult(
		AcquireApplicationDetails acquireApplicationDetails) {

		entityCache.putResult(
			AcquireApplicationDetailsImpl.class,
			acquireApplicationDetails.getPrimaryKey(),
			acquireApplicationDetails);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {acquireApplicationDetails.getAcquireApplicationId()},
			acquireApplicationDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire application detailses in the entity cache if it is enabled.
	 *
	 * @param acquireApplicationDetailses the acquire application detailses
	 */
	@Override
	public void cacheResult(
		List<AcquireApplicationDetails> acquireApplicationDetailses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireApplicationDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireApplicationDetails acquireApplicationDetails :
				acquireApplicationDetailses) {

			if (entityCache.getResult(
					AcquireApplicationDetailsImpl.class,
					acquireApplicationDetails.getPrimaryKey()) == null) {

				cacheResult(acquireApplicationDetails);
			}
		}
	}

	/**
	 * Clears the cache for all acquire application detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireApplicationDetailsImpl.class);

		finderCache.clearCache(AcquireApplicationDetailsImpl.class);
	}

	/**
	 * Clears the cache for the acquire application details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AcquireApplicationDetails acquireApplicationDetails) {

		entityCache.removeResult(
			AcquireApplicationDetailsImpl.class, acquireApplicationDetails);
	}

	@Override
	public void clearCache(
		List<AcquireApplicationDetails> acquireApplicationDetailses) {

		for (AcquireApplicationDetails acquireApplicationDetails :
				acquireApplicationDetailses) {

			entityCache.removeResult(
				AcquireApplicationDetailsImpl.class, acquireApplicationDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireApplicationDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireApplicationDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireApplicationDetailsModelImpl acquireApplicationDetailsModelImpl) {

		Object[] args = new Object[] {
			acquireApplicationDetailsModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquireApplicationDetailsModelImpl);
	}

	/**
	 * Creates a new acquire application details with the primary key. Does not add the acquire application details to the database.
	 *
	 * @param acquireApplicationDetailsId the primary key for the new acquire application details
	 * @return the new acquire application details
	 */
	@Override
	public AcquireApplicationDetails create(long acquireApplicationDetailsId) {
		AcquireApplicationDetails acquireApplicationDetails =
			new AcquireApplicationDetailsImpl();

		acquireApplicationDetails.setNew(true);
		acquireApplicationDetails.setPrimaryKey(acquireApplicationDetailsId);

		acquireApplicationDetails.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return acquireApplicationDetails;
	}

	/**
	 * Removes the acquire application details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details that was removed
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	@Override
	public AcquireApplicationDetails remove(long acquireApplicationDetailsId)
		throws NoSuchAcquireApplicationDetailsException {

		return remove((Serializable)acquireApplicationDetailsId);
	}

	/**
	 * Removes the acquire application details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire application details
	 * @return the acquire application details that was removed
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	@Override
	public AcquireApplicationDetails remove(Serializable primaryKey)
		throws NoSuchAcquireApplicationDetailsException {

		Session session = null;

		try {
			session = openSession();

			AcquireApplicationDetails acquireApplicationDetails =
				(AcquireApplicationDetails)session.get(
					AcquireApplicationDetailsImpl.class, primaryKey);

			if (acquireApplicationDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireApplicationDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireApplicationDetails);
		}
		catch (NoSuchAcquireApplicationDetailsException noSuchEntityException) {
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
	protected AcquireApplicationDetails removeImpl(
		AcquireApplicationDetails acquireApplicationDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireApplicationDetails)) {
				acquireApplicationDetails =
					(AcquireApplicationDetails)session.get(
						AcquireApplicationDetailsImpl.class,
						acquireApplicationDetails.getPrimaryKeyObj());
			}

			if (acquireApplicationDetails != null) {
				session.delete(acquireApplicationDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireApplicationDetails != null) {
			clearCache(acquireApplicationDetails);
		}

		return acquireApplicationDetails;
	}

	@Override
	public AcquireApplicationDetails updateImpl(
		AcquireApplicationDetails acquireApplicationDetails) {

		boolean isNew = acquireApplicationDetails.isNew();

		if (!(acquireApplicationDetails instanceof
				AcquireApplicationDetailsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireApplicationDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireApplicationDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireApplicationDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireApplicationDetails implementation " +
					acquireApplicationDetails.getClass());
		}

		AcquireApplicationDetailsModelImpl acquireApplicationDetailsModelImpl =
			(AcquireApplicationDetailsModelImpl)acquireApplicationDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireApplicationDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireApplicationDetails.setCreateDate(date);
			}
			else {
				acquireApplicationDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireApplicationDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireApplicationDetails.setModifiedDate(date);
			}
			else {
				acquireApplicationDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireApplicationDetails);
			}
			else {
				acquireApplicationDetails =
					(AcquireApplicationDetails)session.merge(
						acquireApplicationDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireApplicationDetailsImpl.class,
			acquireApplicationDetailsModelImpl, false, true);

		cacheUniqueFindersCache(acquireApplicationDetailsModelImpl);

		if (isNew) {
			acquireApplicationDetails.setNew(false);
		}

		acquireApplicationDetails.resetOriginalValues();

		return acquireApplicationDetails;
	}

	/**
	 * Returns the acquire application details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire application details
	 * @return the acquire application details
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	@Override
	public AcquireApplicationDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireApplicationDetailsException {

		AcquireApplicationDetails acquireApplicationDetails = fetchByPrimaryKey(
			primaryKey);

		if (acquireApplicationDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireApplicationDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireApplicationDetails;
	}

	/**
	 * Returns the acquire application details with the primary key or throws a <code>NoSuchAcquireApplicationDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details
	 * @throws NoSuchAcquireApplicationDetailsException if a acquire application details with the primary key could not be found
	 */
	@Override
	public AcquireApplicationDetails findByPrimaryKey(
			long acquireApplicationDetailsId)
		throws NoSuchAcquireApplicationDetailsException {

		return findByPrimaryKey((Serializable)acquireApplicationDetailsId);
	}

	/**
	 * Returns the acquire application details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireApplicationDetailsId the primary key of the acquire application details
	 * @return the acquire application details, or <code>null</code> if a acquire application details with the primary key could not be found
	 */
	@Override
	public AcquireApplicationDetails fetchByPrimaryKey(
		long acquireApplicationDetailsId) {

		return fetchByPrimaryKey((Serializable)acquireApplicationDetailsId);
	}

	/**
	 * Returns all the acquire application detailses.
	 *
	 * @return the acquire application detailses
	 */
	@Override
	public List<AcquireApplicationDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @return the range of acquire application detailses
	 */
	@Override
	public List<AcquireApplicationDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire application detailses
	 */
	@Override
	public List<AcquireApplicationDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire application detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireApplicationDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire application detailses
	 * @param end the upper bound of the range of acquire application detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire application detailses
	 */
	@Override
	public List<AcquireApplicationDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireApplicationDetails> orderByComparator,
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

		List<AcquireApplicationDetails> list = null;

		if (useFinderCache) {
			list = (List<AcquireApplicationDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREAPPLICATIONDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREAPPLICATIONDETAILS;

				sql = sql.concat(
					AcquireApplicationDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireApplicationDetails>)QueryUtil.list(
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
	 * Removes all the acquire application detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireApplicationDetails acquireApplicationDetails : findAll()) {
			remove(acquireApplicationDetails);
		}
	}

	/**
	 * Returns the number of acquire application detailses.
	 *
	 * @return the number of acquire application detailses
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
					_SQL_COUNT_ACQUIREAPPLICATIONDETAILS);

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
		return "acquireApplicationDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREAPPLICATIONDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireApplicationDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire application details persistence.
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

		_finderPathFetchBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_ENTITY, "fetchBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, true);

		_finderPathCountBygetAcquireById = new FinderPath(
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countBygetAcquireById",
			new String[] {Long.class.getName()},
			new String[] {"acquireApplicationId"}, false);

		AcquireApplicationDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireApplicationDetailsUtil.setPersistence(null);

		entityCache.removeCache(AcquireApplicationDetailsImpl.class.getName());
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.SERVICE_CONFIGURATION_FILTER,
		unbind = "-"
	)
	public void setConfiguration(Configuration configuration) {
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setDataSource(DataSource dataSource) {
		super.setDataSource(dataSource);
	}

	@Override
	@Reference(
		target = ACQUIREPersistenceConstants.ORIGIN_BUNDLE_SYMBOLIC_NAME_FILTER,
		unbind = "-"
	)
	public void setSessionFactory(SessionFactory sessionFactory) {
		super.setSessionFactory(sessionFactory);
	}

	@Reference
	protected EntityCache entityCache;

	@Reference
	protected FinderCache finderCache;

	private static final String _SQL_SELECT_ACQUIREAPPLICATIONDETAILS =
		"SELECT acquireApplicationDetails FROM AcquireApplicationDetails acquireApplicationDetails";

	private static final String _SQL_SELECT_ACQUIREAPPLICATIONDETAILS_WHERE =
		"SELECT acquireApplicationDetails FROM AcquireApplicationDetails acquireApplicationDetails WHERE ";

	private static final String _SQL_COUNT_ACQUIREAPPLICATIONDETAILS =
		"SELECT COUNT(acquireApplicationDetails) FROM AcquireApplicationDetails acquireApplicationDetails";

	private static final String _SQL_COUNT_ACQUIREAPPLICATIONDETAILS_WHERE =
		"SELECT COUNT(acquireApplicationDetails) FROM AcquireApplicationDetails acquireApplicationDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireApplicationDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireApplicationDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireApplicationDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireApplicationDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquirePropertyDetailsException;
import com.nbp.acquire.application.form.service.model.AcquirePropertyDetails;
import com.nbp.acquire.application.form.service.model.AcquirePropertyDetailsTable;
import com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquirePropertyDetailsModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquirePropertyDetailsPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquirePropertyDetailsUtil;
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
 * The persistence implementation for the acquire property details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquirePropertyDetailsPersistence.class)
public class AcquirePropertyDetailsPersistenceImpl
	extends BasePersistenceImpl<AcquirePropertyDetails>
	implements AcquirePropertyDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquirePropertyDetailsUtil</code> to access the acquire property details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquirePropertyDetailsImpl.class.getName();

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
	 * Returns the acquire property details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquirePropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire property details
	 * @throws NoSuchAcquirePropertyDetailsException if a matching acquire property details could not be found
	 */
	@Override
	public AcquirePropertyDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquirePropertyDetailsException {

		AcquirePropertyDetails acquirePropertyDetails = fetchBygetAcquireById(
			acquireApplicationId);

		if (acquirePropertyDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquirePropertyDetailsException(sb.toString());
		}

		return acquirePropertyDetails;
	}

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire property details, or <code>null</code> if a matching acquire property details could not be found
	 */
	@Override
	public AcquirePropertyDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire property details, or <code>null</code> if a matching acquire property details could not be found
	 */
	@Override
	public AcquirePropertyDetails fetchBygetAcquireById(
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

		if (result instanceof AcquirePropertyDetails) {
			AcquirePropertyDetails acquirePropertyDetails =
				(AcquirePropertyDetails)result;

			if (acquireApplicationId !=
					acquirePropertyDetails.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIREPROPERTYDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquirePropertyDetails> list = query.list();

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
								"AcquirePropertyDetailsPersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquirePropertyDetails acquirePropertyDetails = list.get(0);

					result = acquirePropertyDetails;

					cacheResult(acquirePropertyDetails);
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
			return (AcquirePropertyDetails)result;
		}
	}

	/**
	 * Removes the acquire property details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire property details that was removed
	 */
	@Override
	public AcquirePropertyDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquirePropertyDetailsException {

		AcquirePropertyDetails acquirePropertyDetails = findBygetAcquireById(
			acquireApplicationId);

		return remove(acquirePropertyDetails);
	}

	/**
	 * Returns the number of acquire property detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire property detailses
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIREPROPERTYDETAILS_WHERE);

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
			"acquirePropertyDetails.acquireApplicationId = ?";

	public AcquirePropertyDetailsPersistenceImpl() {
		setModelClass(AcquirePropertyDetails.class);

		setModelImplClass(AcquirePropertyDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(AcquirePropertyDetailsTable.INSTANCE);
	}

	/**
	 * Caches the acquire property details in the entity cache if it is enabled.
	 *
	 * @param acquirePropertyDetails the acquire property details
	 */
	@Override
	public void cacheResult(AcquirePropertyDetails acquirePropertyDetails) {
		entityCache.putResult(
			AcquirePropertyDetailsImpl.class,
			acquirePropertyDetails.getPrimaryKey(), acquirePropertyDetails);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {acquirePropertyDetails.getAcquireApplicationId()},
			acquirePropertyDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire property detailses in the entity cache if it is enabled.
	 *
	 * @param acquirePropertyDetailses the acquire property detailses
	 */
	@Override
	public void cacheResult(
		List<AcquirePropertyDetails> acquirePropertyDetailses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquirePropertyDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquirePropertyDetails acquirePropertyDetails :
				acquirePropertyDetailses) {

			if (entityCache.getResult(
					AcquirePropertyDetailsImpl.class,
					acquirePropertyDetails.getPrimaryKey()) == null) {

				cacheResult(acquirePropertyDetails);
			}
		}
	}

	/**
	 * Clears the cache for all acquire property detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquirePropertyDetailsImpl.class);

		finderCache.clearCache(AcquirePropertyDetailsImpl.class);
	}

	/**
	 * Clears the cache for the acquire property details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(AcquirePropertyDetails acquirePropertyDetails) {
		entityCache.removeResult(
			AcquirePropertyDetailsImpl.class, acquirePropertyDetails);
	}

	@Override
	public void clearCache(
		List<AcquirePropertyDetails> acquirePropertyDetailses) {

		for (AcquirePropertyDetails acquirePropertyDetails :
				acquirePropertyDetailses) {

			entityCache.removeResult(
				AcquirePropertyDetailsImpl.class, acquirePropertyDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquirePropertyDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquirePropertyDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquirePropertyDetailsModelImpl acquirePropertyDetailsModelImpl) {

		Object[] args = new Object[] {
			acquirePropertyDetailsModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquirePropertyDetailsModelImpl);
	}

	/**
	 * Creates a new acquire property details with the primary key. Does not add the acquire property details to the database.
	 *
	 * @param acquirePropertyDetailsId the primary key for the new acquire property details
	 * @return the new acquire property details
	 */
	@Override
	public AcquirePropertyDetails create(long acquirePropertyDetailsId) {
		AcquirePropertyDetails acquirePropertyDetails =
			new AcquirePropertyDetailsImpl();

		acquirePropertyDetails.setNew(true);
		acquirePropertyDetails.setPrimaryKey(acquirePropertyDetailsId);

		acquirePropertyDetails.setCompanyId(CompanyThreadLocal.getCompanyId());

		return acquirePropertyDetails;
	}

	/**
	 * Removes the acquire property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details that was removed
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	@Override
	public AcquirePropertyDetails remove(long acquirePropertyDetailsId)
		throws NoSuchAcquirePropertyDetailsException {

		return remove((Serializable)acquirePropertyDetailsId);
	}

	/**
	 * Removes the acquire property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire property details
	 * @return the acquire property details that was removed
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	@Override
	public AcquirePropertyDetails remove(Serializable primaryKey)
		throws NoSuchAcquirePropertyDetailsException {

		Session session = null;

		try {
			session = openSession();

			AcquirePropertyDetails acquirePropertyDetails =
				(AcquirePropertyDetails)session.get(
					AcquirePropertyDetailsImpl.class, primaryKey);

			if (acquirePropertyDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquirePropertyDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquirePropertyDetails);
		}
		catch (NoSuchAcquirePropertyDetailsException noSuchEntityException) {
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
	protected AcquirePropertyDetails removeImpl(
		AcquirePropertyDetails acquirePropertyDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquirePropertyDetails)) {
				acquirePropertyDetails = (AcquirePropertyDetails)session.get(
					AcquirePropertyDetailsImpl.class,
					acquirePropertyDetails.getPrimaryKeyObj());
			}

			if (acquirePropertyDetails != null) {
				session.delete(acquirePropertyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquirePropertyDetails != null) {
			clearCache(acquirePropertyDetails);
		}

		return acquirePropertyDetails;
	}

	@Override
	public AcquirePropertyDetails updateImpl(
		AcquirePropertyDetails acquirePropertyDetails) {

		boolean isNew = acquirePropertyDetails.isNew();

		if (!(acquirePropertyDetails instanceof
				AcquirePropertyDetailsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquirePropertyDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquirePropertyDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquirePropertyDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquirePropertyDetails implementation " +
					acquirePropertyDetails.getClass());
		}

		AcquirePropertyDetailsModelImpl acquirePropertyDetailsModelImpl =
			(AcquirePropertyDetailsModelImpl)acquirePropertyDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquirePropertyDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquirePropertyDetails.setCreateDate(date);
			}
			else {
				acquirePropertyDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquirePropertyDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquirePropertyDetails.setModifiedDate(date);
			}
			else {
				acquirePropertyDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquirePropertyDetails);
			}
			else {
				acquirePropertyDetails = (AcquirePropertyDetails)session.merge(
					acquirePropertyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquirePropertyDetailsImpl.class, acquirePropertyDetailsModelImpl,
			false, true);

		cacheUniqueFindersCache(acquirePropertyDetailsModelImpl);

		if (isNew) {
			acquirePropertyDetails.setNew(false);
		}

		acquirePropertyDetails.resetOriginalValues();

		return acquirePropertyDetails;
	}

	/**
	 * Returns the acquire property details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire property details
	 * @return the acquire property details
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	@Override
	public AcquirePropertyDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquirePropertyDetailsException {

		AcquirePropertyDetails acquirePropertyDetails = fetchByPrimaryKey(
			primaryKey);

		if (acquirePropertyDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquirePropertyDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquirePropertyDetails;
	}

	/**
	 * Returns the acquire property details with the primary key or throws a <code>NoSuchAcquirePropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details
	 * @throws NoSuchAcquirePropertyDetailsException if a acquire property details with the primary key could not be found
	 */
	@Override
	public AcquirePropertyDetails findByPrimaryKey(
			long acquirePropertyDetailsId)
		throws NoSuchAcquirePropertyDetailsException {

		return findByPrimaryKey((Serializable)acquirePropertyDetailsId);
	}

	/**
	 * Returns the acquire property details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquirePropertyDetailsId the primary key of the acquire property details
	 * @return the acquire property details, or <code>null</code> if a acquire property details with the primary key could not be found
	 */
	@Override
	public AcquirePropertyDetails fetchByPrimaryKey(
		long acquirePropertyDetailsId) {

		return fetchByPrimaryKey((Serializable)acquirePropertyDetailsId);
	}

	/**
	 * Returns all the acquire property detailses.
	 *
	 * @return the acquire property detailses
	 */
	@Override
	public List<AcquirePropertyDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @return the range of acquire property detailses
	 */
	@Override
	public List<AcquirePropertyDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire property detailses
	 */
	@Override
	public List<AcquirePropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquirePropertyDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquirePropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire property detailses
	 * @param end the upper bound of the range of acquire property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire property detailses
	 */
	@Override
	public List<AcquirePropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquirePropertyDetails> orderByComparator,
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

		List<AcquirePropertyDetails> list = null;

		if (useFinderCache) {
			list = (List<AcquirePropertyDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIREPROPERTYDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIREPROPERTYDETAILS;

				sql = sql.concat(AcquirePropertyDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquirePropertyDetails>)QueryUtil.list(
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
	 * Removes all the acquire property detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquirePropertyDetails acquirePropertyDetails : findAll()) {
			remove(acquirePropertyDetails);
		}
	}

	/**
	 * Returns the number of acquire property detailses.
	 *
	 * @return the number of acquire property detailses
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
					_SQL_COUNT_ACQUIREPROPERTYDETAILS);

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
		return "acquirePropertyDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIREPROPERTYDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquirePropertyDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire property details persistence.
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

		AcquirePropertyDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquirePropertyDetailsUtil.setPersistence(null);

		entityCache.removeCache(AcquirePropertyDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_ACQUIREPROPERTYDETAILS =
		"SELECT acquirePropertyDetails FROM AcquirePropertyDetails acquirePropertyDetails";

	private static final String _SQL_SELECT_ACQUIREPROPERTYDETAILS_WHERE =
		"SELECT acquirePropertyDetails FROM AcquirePropertyDetails acquirePropertyDetails WHERE ";

	private static final String _SQL_COUNT_ACQUIREPROPERTYDETAILS =
		"SELECT COUNT(acquirePropertyDetails) FROM AcquirePropertyDetails acquirePropertyDetails";

	private static final String _SQL_COUNT_ACQUIREPROPERTYDETAILS_WHERE =
		"SELECT COUNT(acquirePropertyDetails) FROM AcquirePropertyDetails acquirePropertyDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquirePropertyDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquirePropertyDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquirePropertyDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquirePropertyDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}
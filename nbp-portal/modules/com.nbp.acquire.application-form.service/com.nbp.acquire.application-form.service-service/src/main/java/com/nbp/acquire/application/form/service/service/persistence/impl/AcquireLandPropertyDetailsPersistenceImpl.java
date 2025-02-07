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

import com.nbp.acquire.application.form.service.exception.NoSuchAcquireLandPropertyDetailsException;
import com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetails;
import com.nbp.acquire.application.form.service.model.AcquireLandPropertyDetailsTable;
import com.nbp.acquire.application.form.service.model.impl.AcquireLandPropertyDetailsImpl;
import com.nbp.acquire.application.form.service.model.impl.AcquireLandPropertyDetailsModelImpl;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandPropertyDetailsPersistence;
import com.nbp.acquire.application.form.service.service.persistence.AcquireLandPropertyDetailsUtil;
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
 * The persistence implementation for the acquire land property details service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
@Component(service = AcquireLandPropertyDetailsPersistence.class)
public class AcquireLandPropertyDetailsPersistenceImpl
	extends BasePersistenceImpl<AcquireLandPropertyDetails>
	implements AcquireLandPropertyDetailsPersistence {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use <code>AcquireLandPropertyDetailsUtil</code> to access the acquire land property details persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY =
		AcquireLandPropertyDetailsImpl.class.getName();

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
	 * Returns the acquire land property details where acquireApplicationId = &#63; or throws a <code>NoSuchAcquireLandPropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land property details
	 * @throws NoSuchAcquireLandPropertyDetailsException if a matching acquire land property details could not be found
	 */
	@Override
	public AcquireLandPropertyDetails findBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandPropertyDetailsException {

		AcquireLandPropertyDetails acquireLandPropertyDetails =
			fetchBygetAcquireById(acquireApplicationId);

		if (acquireLandPropertyDetails == null) {
			StringBundler sb = new StringBundler(4);

			sb.append(_NO_SUCH_ENTITY_WITH_KEY);

			sb.append("acquireApplicationId=");
			sb.append(acquireApplicationId);

			sb.append("}");

			if (_log.isDebugEnabled()) {
				_log.debug(sb.toString());
			}

			throw new NoSuchAcquireLandPropertyDetailsException(sb.toString());
		}

		return acquireLandPropertyDetails;
	}

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the matching acquire land property details, or <code>null</code> if a matching acquire land property details could not be found
	 */
	@Override
	public AcquireLandPropertyDetails fetchBygetAcquireById(
		long acquireApplicationId) {

		return fetchBygetAcquireById(acquireApplicationId, true);
	}

	/**
	 * Returns the acquire land property details where acquireApplicationId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching acquire land property details, or <code>null</code> if a matching acquire land property details could not be found
	 */
	@Override
	public AcquireLandPropertyDetails fetchBygetAcquireById(
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

		if (result instanceof AcquireLandPropertyDetails) {
			AcquireLandPropertyDetails acquireLandPropertyDetails =
				(AcquireLandPropertyDetails)result;

			if (acquireApplicationId !=
					acquireLandPropertyDetails.getAcquireApplicationId()) {

				result = null;
			}
		}

		if (result == null) {
			StringBundler sb = new StringBundler(3);

			sb.append(_SQL_SELECT_ACQUIRELANDPROPERTYDETAILS_WHERE);

			sb.append(_FINDER_COLUMN_GETACQUIREBYID_ACQUIREAPPLICATIONID_2);

			String sql = sb.toString();

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				QueryPos queryPos = QueryPos.getInstance(query);

				queryPos.add(acquireApplicationId);

				List<AcquireLandPropertyDetails> list = query.list();

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
								"AcquireLandPropertyDetailsPersistenceImpl.fetchBygetAcquireById(long, boolean) with parameters (" +
									StringUtil.merge(finderArgs) +
										") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
						}
					}

					AcquireLandPropertyDetails acquireLandPropertyDetails =
						list.get(0);

					result = acquireLandPropertyDetails;

					cacheResult(acquireLandPropertyDetails);
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
			return (AcquireLandPropertyDetails)result;
		}
	}

	/**
	 * Removes the acquire land property details where acquireApplicationId = &#63; from the database.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the acquire land property details that was removed
	 */
	@Override
	public AcquireLandPropertyDetails removeBygetAcquireById(
			long acquireApplicationId)
		throws NoSuchAcquireLandPropertyDetailsException {

		AcquireLandPropertyDetails acquireLandPropertyDetails =
			findBygetAcquireById(acquireApplicationId);

		return remove(acquireLandPropertyDetails);
	}

	/**
	 * Returns the number of acquire land property detailses where acquireApplicationId = &#63;.
	 *
	 * @param acquireApplicationId the acquire application ID
	 * @return the number of matching acquire land property detailses
	 */
	@Override
	public int countBygetAcquireById(long acquireApplicationId) {
		FinderPath finderPath = _finderPathCountBygetAcquireById;

		Object[] finderArgs = new Object[] {acquireApplicationId};

		Long count = (Long)finderCache.getResult(finderPath, finderArgs, this);

		if (count == null) {
			StringBundler sb = new StringBundler(2);

			sb.append(_SQL_COUNT_ACQUIRELANDPROPERTYDETAILS_WHERE);

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
			"acquireLandPropertyDetails.acquireApplicationId = ?";

	public AcquireLandPropertyDetailsPersistenceImpl() {
		setModelClass(AcquireLandPropertyDetails.class);

		setModelImplClass(AcquireLandPropertyDetailsImpl.class);
		setModelPKClass(long.class);

		setTable(AcquireLandPropertyDetailsTable.INSTANCE);
	}

	/**
	 * Caches the acquire land property details in the entity cache if it is enabled.
	 *
	 * @param acquireLandPropertyDetails the acquire land property details
	 */
	@Override
	public void cacheResult(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		entityCache.putResult(
			AcquireLandPropertyDetailsImpl.class,
			acquireLandPropertyDetails.getPrimaryKey(),
			acquireLandPropertyDetails);

		finderCache.putResult(
			_finderPathFetchBygetAcquireById,
			new Object[] {acquireLandPropertyDetails.getAcquireApplicationId()},
			acquireLandPropertyDetails);
	}

	private int _valueObjectFinderCacheListThreshold;

	/**
	 * Caches the acquire land property detailses in the entity cache if it is enabled.
	 *
	 * @param acquireLandPropertyDetailses the acquire land property detailses
	 */
	@Override
	public void cacheResult(
		List<AcquireLandPropertyDetails> acquireLandPropertyDetailses) {

		if ((_valueObjectFinderCacheListThreshold == 0) ||
			((_valueObjectFinderCacheListThreshold > 0) &&
			 (acquireLandPropertyDetailses.size() >
				 _valueObjectFinderCacheListThreshold))) {

			return;
		}

		for (AcquireLandPropertyDetails acquireLandPropertyDetails :
				acquireLandPropertyDetailses) {

			if (entityCache.getResult(
					AcquireLandPropertyDetailsImpl.class,
					acquireLandPropertyDetails.getPrimaryKey()) == null) {

				cacheResult(acquireLandPropertyDetails);
			}
		}
	}

	/**
	 * Clears the cache for all acquire land property detailses.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		entityCache.clearCache(AcquireLandPropertyDetailsImpl.class);

		finderCache.clearCache(AcquireLandPropertyDetailsImpl.class);
	}

	/**
	 * Clears the cache for the acquire land property details.
	 *
	 * <p>
	 * The <code>EntityCache</code> and <code>FinderCache</code> are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		entityCache.removeResult(
			AcquireLandPropertyDetailsImpl.class, acquireLandPropertyDetails);
	}

	@Override
	public void clearCache(
		List<AcquireLandPropertyDetails> acquireLandPropertyDetailses) {

		for (AcquireLandPropertyDetails acquireLandPropertyDetails :
				acquireLandPropertyDetailses) {

			entityCache.removeResult(
				AcquireLandPropertyDetailsImpl.class,
				acquireLandPropertyDetails);
		}
	}

	@Override
	public void clearCache(Set<Serializable> primaryKeys) {
		finderCache.clearCache(AcquireLandPropertyDetailsImpl.class);

		for (Serializable primaryKey : primaryKeys) {
			entityCache.removeResult(
				AcquireLandPropertyDetailsImpl.class, primaryKey);
		}
	}

	protected void cacheUniqueFindersCache(
		AcquireLandPropertyDetailsModelImpl
			acquireLandPropertyDetailsModelImpl) {

		Object[] args = new Object[] {
			acquireLandPropertyDetailsModelImpl.getAcquireApplicationId()
		};

		finderCache.putResult(
			_finderPathCountBygetAcquireById, args, Long.valueOf(1));
		finderCache.putResult(
			_finderPathFetchBygetAcquireById, args,
			acquireLandPropertyDetailsModelImpl);
	}

	/**
	 * Creates a new acquire land property details with the primary key. Does not add the acquire land property details to the database.
	 *
	 * @param acquireLandPropertyDetailsId the primary key for the new acquire land property details
	 * @return the new acquire land property details
	 */
	@Override
	public AcquireLandPropertyDetails create(
		long acquireLandPropertyDetailsId) {

		AcquireLandPropertyDetails acquireLandPropertyDetails =
			new AcquireLandPropertyDetailsImpl();

		acquireLandPropertyDetails.setNew(true);
		acquireLandPropertyDetails.setPrimaryKey(acquireLandPropertyDetailsId);

		acquireLandPropertyDetails.setCompanyId(
			CompanyThreadLocal.getCompanyId());

		return acquireLandPropertyDetails;
	}

	/**
	 * Removes the acquire land property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details that was removed
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	@Override
	public AcquireLandPropertyDetails remove(long acquireLandPropertyDetailsId)
		throws NoSuchAcquireLandPropertyDetailsException {

		return remove((Serializable)acquireLandPropertyDetailsId);
	}

	/**
	 * Removes the acquire land property details with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the acquire land property details
	 * @return the acquire land property details that was removed
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	@Override
	public AcquireLandPropertyDetails remove(Serializable primaryKey)
		throws NoSuchAcquireLandPropertyDetailsException {

		Session session = null;

		try {
			session = openSession();

			AcquireLandPropertyDetails acquireLandPropertyDetails =
				(AcquireLandPropertyDetails)session.get(
					AcquireLandPropertyDetailsImpl.class, primaryKey);

			if (acquireLandPropertyDetails == null) {
				if (_log.isDebugEnabled()) {
					_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchAcquireLandPropertyDetailsException(
					_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			return remove(acquireLandPropertyDetails);
		}
		catch (NoSuchAcquireLandPropertyDetailsException
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
	protected AcquireLandPropertyDetails removeImpl(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(acquireLandPropertyDetails)) {
				acquireLandPropertyDetails =
					(AcquireLandPropertyDetails)session.get(
						AcquireLandPropertyDetailsImpl.class,
						acquireLandPropertyDetails.getPrimaryKeyObj());
			}

			if (acquireLandPropertyDetails != null) {
				session.delete(acquireLandPropertyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		if (acquireLandPropertyDetails != null) {
			clearCache(acquireLandPropertyDetails);
		}

		return acquireLandPropertyDetails;
	}

	@Override
	public AcquireLandPropertyDetails updateImpl(
		AcquireLandPropertyDetails acquireLandPropertyDetails) {

		boolean isNew = acquireLandPropertyDetails.isNew();

		if (!(acquireLandPropertyDetails instanceof
				AcquireLandPropertyDetailsModelImpl)) {

			InvocationHandler invocationHandler = null;

			if (ProxyUtil.isProxyClass(acquireLandPropertyDetails.getClass())) {
				invocationHandler = ProxyUtil.getInvocationHandler(
					acquireLandPropertyDetails);

				throw new IllegalArgumentException(
					"Implement ModelWrapper in acquireLandPropertyDetails proxy " +
						invocationHandler.getClass());
			}

			throw new IllegalArgumentException(
				"Implement ModelWrapper in custom AcquireLandPropertyDetails implementation " +
					acquireLandPropertyDetails.getClass());
		}

		AcquireLandPropertyDetailsModelImpl
			acquireLandPropertyDetailsModelImpl =
				(AcquireLandPropertyDetailsModelImpl)acquireLandPropertyDetails;

		ServiceContext serviceContext =
			ServiceContextThreadLocal.getServiceContext();

		Date date = new Date();

		if (isNew && (acquireLandPropertyDetails.getCreateDate() == null)) {
			if (serviceContext == null) {
				acquireLandPropertyDetails.setCreateDate(date);
			}
			else {
				acquireLandPropertyDetails.setCreateDate(
					serviceContext.getCreateDate(date));
			}
		}

		if (!acquireLandPropertyDetailsModelImpl.hasSetModifiedDate()) {
			if (serviceContext == null) {
				acquireLandPropertyDetails.setModifiedDate(date);
			}
			else {
				acquireLandPropertyDetails.setModifiedDate(
					serviceContext.getModifiedDate(date));
			}
		}

		Session session = null;

		try {
			session = openSession();

			if (isNew) {
				session.save(acquireLandPropertyDetails);
			}
			else {
				acquireLandPropertyDetails =
					(AcquireLandPropertyDetails)session.merge(
						acquireLandPropertyDetails);
			}
		}
		catch (Exception exception) {
			throw processException(exception);
		}
		finally {
			closeSession(session);
		}

		entityCache.putResult(
			AcquireLandPropertyDetailsImpl.class,
			acquireLandPropertyDetailsModelImpl, false, true);

		cacheUniqueFindersCache(acquireLandPropertyDetailsModelImpl);

		if (isNew) {
			acquireLandPropertyDetails.setNew(false);
		}

		acquireLandPropertyDetails.resetOriginalValues();

		return acquireLandPropertyDetails;
	}

	/**
	 * Returns the acquire land property details with the primary key or throws a <code>com.liferay.portal.kernel.exception.NoSuchModelException</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the acquire land property details
	 * @return the acquire land property details
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	@Override
	public AcquireLandPropertyDetails findByPrimaryKey(Serializable primaryKey)
		throws NoSuchAcquireLandPropertyDetailsException {

		AcquireLandPropertyDetails acquireLandPropertyDetails =
			fetchByPrimaryKey(primaryKey);

		if (acquireLandPropertyDetails == null) {
			if (_log.isDebugEnabled()) {
				_log.debug(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchAcquireLandPropertyDetailsException(
				_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
		}

		return acquireLandPropertyDetails;
	}

	/**
	 * Returns the acquire land property details with the primary key or throws a <code>NoSuchAcquireLandPropertyDetailsException</code> if it could not be found.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details
	 * @throws NoSuchAcquireLandPropertyDetailsException if a acquire land property details with the primary key could not be found
	 */
	@Override
	public AcquireLandPropertyDetails findByPrimaryKey(
			long acquireLandPropertyDetailsId)
		throws NoSuchAcquireLandPropertyDetailsException {

		return findByPrimaryKey((Serializable)acquireLandPropertyDetailsId);
	}

	/**
	 * Returns the acquire land property details with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param acquireLandPropertyDetailsId the primary key of the acquire land property details
	 * @return the acquire land property details, or <code>null</code> if a acquire land property details with the primary key could not be found
	 */
	@Override
	public AcquireLandPropertyDetails fetchByPrimaryKey(
		long acquireLandPropertyDetailsId) {

		return fetchByPrimaryKey((Serializable)acquireLandPropertyDetailsId);
	}

	/**
	 * Returns all the acquire land property detailses.
	 *
	 * @return the acquire land property detailses
	 */
	@Override
	public List<AcquireLandPropertyDetails> findAll() {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @return the range of acquire land property detailses
	 */
	@Override
	public List<AcquireLandPropertyDetails> findAll(int start, int end) {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of acquire land property detailses
	 */
	@Override
	public List<AcquireLandPropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandPropertyDetails> orderByComparator) {

		return findAll(start, end, orderByComparator, true);
	}

	/**
	 * Returns an ordered range of all the acquire land property detailses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>AcquireLandPropertyDetailsModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of acquire land property detailses
	 * @param end the upper bound of the range of acquire land property detailses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of acquire land property detailses
	 */
	@Override
	public List<AcquireLandPropertyDetails> findAll(
		int start, int end,
		OrderByComparator<AcquireLandPropertyDetails> orderByComparator,
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

		List<AcquireLandPropertyDetails> list = null;

		if (useFinderCache) {
			list = (List<AcquireLandPropertyDetails>)finderCache.getResult(
				finderPath, finderArgs, this);
		}

		if (list == null) {
			StringBundler sb = null;
			String sql = null;

			if (orderByComparator != null) {
				sb = new StringBundler(
					2 + (orderByComparator.getOrderByFields().length * 2));

				sb.append(_SQL_SELECT_ACQUIRELANDPROPERTYDETAILS);

				appendOrderByComparator(
					sb, _ORDER_BY_ENTITY_ALIAS, orderByComparator);

				sql = sb.toString();
			}
			else {
				sql = _SQL_SELECT_ACQUIRELANDPROPERTYDETAILS;

				sql = sql.concat(
					AcquireLandPropertyDetailsModelImpl.ORDER_BY_JPQL);
			}

			Session session = null;

			try {
				session = openSession();

				Query query = session.createQuery(sql);

				list = (List<AcquireLandPropertyDetails>)QueryUtil.list(
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
	 * Removes all the acquire land property detailses from the database.
	 *
	 */
	@Override
	public void removeAll() {
		for (AcquireLandPropertyDetails acquireLandPropertyDetails :
				findAll()) {

			remove(acquireLandPropertyDetails);
		}
	}

	/**
	 * Returns the number of acquire land property detailses.
	 *
	 * @return the number of acquire land property detailses
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
					_SQL_COUNT_ACQUIRELANDPROPERTYDETAILS);

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
		return "acquireLandPropertyDetailsId";
	}

	@Override
	protected String getSelectSQL() {
		return _SQL_SELECT_ACQUIRELANDPROPERTYDETAILS;
	}

	@Override
	protected Map<String, Integer> getTableColumnsMap() {
		return AcquireLandPropertyDetailsModelImpl.TABLE_COLUMNS_MAP;
	}

	/**
	 * Initializes the acquire land property details persistence.
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

		AcquireLandPropertyDetailsUtil.setPersistence(this);
	}

	@Deactivate
	public void deactivate() {
		AcquireLandPropertyDetailsUtil.setPersistence(null);

		entityCache.removeCache(AcquireLandPropertyDetailsImpl.class.getName());
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

	private static final String _SQL_SELECT_ACQUIRELANDPROPERTYDETAILS =
		"SELECT acquireLandPropertyDetails FROM AcquireLandPropertyDetails acquireLandPropertyDetails";

	private static final String _SQL_SELECT_ACQUIRELANDPROPERTYDETAILS_WHERE =
		"SELECT acquireLandPropertyDetails FROM AcquireLandPropertyDetails acquireLandPropertyDetails WHERE ";

	private static final String _SQL_COUNT_ACQUIRELANDPROPERTYDETAILS =
		"SELECT COUNT(acquireLandPropertyDetails) FROM AcquireLandPropertyDetails acquireLandPropertyDetails";

	private static final String _SQL_COUNT_ACQUIRELANDPROPERTYDETAILS_WHERE =
		"SELECT COUNT(acquireLandPropertyDetails) FROM AcquireLandPropertyDetails acquireLandPropertyDetails WHERE ";

	private static final String _ORDER_BY_ENTITY_ALIAS =
		"acquireLandPropertyDetails.";

	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY =
		"No AcquireLandPropertyDetails exists with the primary key ";

	private static final String _NO_SUCH_ENTITY_WITH_KEY =
		"No AcquireLandPropertyDetails exists with the key {";

	private static final Log _log = LogFactoryUtil.getLog(
		AcquireLandPropertyDetailsPersistenceImpl.class);

	@Override
	protected FinderCache getFinderCache() {
		return finderCache;
	}

}